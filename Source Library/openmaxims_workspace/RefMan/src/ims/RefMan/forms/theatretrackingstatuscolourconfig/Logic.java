// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4050.19540)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.theatretrackingstatuscolourconfig;

import ims.RefMan.vo.TheatreTrackingStatusColourConfigVo;
import ims.clinical.vo.lookups.TheatreTrackingStatus;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.vo.LookupInstVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}
	
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	
	private void open() 
	{
		form.setMode(FormMode.VIEW);
		
		if(form.ccTrackingLookup().getValue() != null)
			form.getLocalContext().setCurrentRecord(domain.getColorConfig(form.ccTrackingLookup().getValue()));
		
		if(form.getLocalContext().getCurrentRecordIsNotNull())
		{
			populateScreenFromColorConfig(form.getLocalContext().getCurrentRecord());
		}
		else
		{
			populateScreenFromLookupInstVo(form.ccTrackingLookup().getValue());
		}
	}
	
	private void populateScreenFromLookupInstVo(LookupInstVo value) 
	{
		if(value == null)
			return;
		
		form.intId().setValue(value.getID());
		form.txtName().setValue(value.getText());
		
		form.cmbColor().setValue(value.getColor());
	}
	
	private void populateScreenFromColorConfig(TheatreTrackingStatusColourConfigVo colorConfig) 
	{
		if(colorConfig == null || colorConfig.getTrackingStatus() == null)
			return;
		
		form.intId().setValue(colorConfig.getTrackingStatus().getID());
		form.txtName().setValue(colorConfig.getTrackingStatus().getText());
		
		form.cmbColor().setValue(colorConfig.getColour());
	}
	
	private void initialize() 
	{
		form.ccTrackingLookup().initialize(TheatreTrackingStatus.TYPE_ID, true, true);
		
		populateColorCombo();
	}
	
	private void populateColorCombo()
	{
		Color[] colors = Color.getAllColors();
		
		form.cmbColor().clear();
		for (int i = 0; i < colors.length; i++)
		{
			form.cmbColor().newRow(colors[i], colors[i].getName(), colors[i].getImage());
		}
	}
	
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		updateInstance();
	}
	
	private void updateInstance() 
	{
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			open();
	}
	
	private boolean save() 
	{
		TheatreTrackingStatusColourConfigVo colorConfig = populateDataFromScreen(form.getLocalContext().getCurrentRecord());
		
		String[] errors = colorConfig.validate();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try 
		{
			form.getLocalContext().setCurrentRecord(domain.saveColorConfig(colorConfig));
		} 
		catch (DomainInterfaceException e) 
		{
			e.printStackTrace();
			engine.showMessage(e.getMessage());
			return false;
		} 
		catch (StaleObjectException e) 
		{
			e.printStackTrace();
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		} 
		catch (UniqueKeyViolationException e) 
		{
			e.printStackTrace();
			engine.showMessage(e.getMessage());
			return false;
		}
		
		return true;
	}

	private TheatreTrackingStatusColourConfigVo populateDataFromScreen(TheatreTrackingStatusColourConfigVo currentRecord) 
	{
		if(currentRecord == null)
			currentRecord = new TheatreTrackingStatusColourConfigVo();
		
		currentRecord.setTrackingStatus((TheatreTrackingStatus) form.ccTrackingLookup().getValue());
		currentRecord.setColour(form.cmbColor().getValue());
		
		return currentRecord;
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	
	private void updateControlsState() 
	{
		if(FormMode.VIEW.equals(form.getMode()))
		{
			form.btnEdit().setVisible(form.ccTrackingLookup().getValue() instanceof LookupInstVo);
		}
	}

	@Override
	protected void onCcTrackingLookupValueChanged()	throws PresentationLogicException 
	{
		if(form.ccTrackingLookup().getValue() == null)
			return;
		
		TheatreTrackingStatusColourConfigVo colorConfig = domain.getColorConfig(form.ccTrackingLookup().getValue());
		
		form.getLocalContext().setCurrentRecord(colorConfig);
		
		if(colorConfig == null)
			populateScreenFromLookupInstVo(form.ccTrackingLookup().getValue());
		else
			populateScreenFromColorConfig(colorConfig);
		
		updateControlsState();
	}
}
