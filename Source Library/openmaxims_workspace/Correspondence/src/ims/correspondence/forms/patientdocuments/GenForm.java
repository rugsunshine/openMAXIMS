//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.correspondence.forms.patientdocuments;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}
	public static class grdDocumentsRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdDocumentsRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setDateReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean isDateReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showDateOpened()
		{
			super.row.showOpened(0);
		}
		public ims.framework.utils.Date getDate()
		{
			return (ims.framework.utils.Date)super.row.get(0);
		}
		public void setDate(ims.framework.utils.Date value)
		{
			super.row.set(0, value);
		}
		public void setCellDateTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setDescriptionReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean isDescriptionReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showDescriptionOpened()
		{
			super.row.showOpened(1);
		}
		public String getDescription()
		{
			return (String)super.row.get(1);
		}
		public void setDescription(String value)
		{
			super.row.set(1, value);
		}
		public void setCellDescriptionTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public void setDiscDateReadOnly(boolean value)
		{
			super.row.setReadOnly(2, value);
		}
		public boolean isDiscDateReadOnly()
		{
			return super.row.isReadOnly(2);
		}
		public void showDiscDateOpened()
		{
			super.row.showOpened(2);
		}
		public ims.framework.utils.Date getDiscDate()
		{
			return (ims.framework.utils.Date)super.row.get(2);
		}
		public void setDiscDate(ims.framework.utils.Date value)
		{
			super.row.set(2, value);
		}
		public void setCellDiscDateTooltip(String value)
		{
			super.row.setTooltip(2, value);
		}
		public void setContactNoReadOnly(boolean value)
		{
			super.row.setReadOnly(3, value);
		}
		public boolean isContactNoReadOnly()
		{
			return super.row.isReadOnly(3);
		}
		public void showContactNoOpened()
		{
			super.row.showOpened(3);
		}
		public String getContactNo()
		{
			return (String)super.row.get(3);
		}
		public void setContactNo(String value)
		{
			super.row.set(3, value);
		}
		public void setCellContactNoTooltip(String value)
		{
			super.row.setTooltip(3, value);
		}
		public void setConsultantReadOnly(boolean value)
		{
			super.row.setReadOnly(4, value);
		}
		public boolean isConsultantReadOnly()
		{
			return super.row.isReadOnly(4);
		}
		public void showConsultantOpened()
		{
			super.row.showOpened(4);
		}
		public String getConsultant()
		{
			return (String)super.row.get(4);
		}
		public void setConsultant(String value)
		{
			super.row.set(4, value);
		}
		public void setCellConsultantTooltip(String value)
		{
			super.row.setTooltip(4, value);
		}
		public void setRecordingUserReadOnly(boolean value)
		{
			super.row.setReadOnly(5, value);
		}
		public boolean isRecordingUserReadOnly()
		{
			return super.row.isReadOnly(5);
		}
		public void showRecordingUserOpened()
		{
			super.row.showOpened(5);
		}
		public String getRecordingUser()
		{
			return (String)super.row.get(5);
		}
		public void setRecordingUser(String value)
		{
			super.row.set(5, value);
		}
		public void setCellRecordingUserTooltip(String value)
		{
			super.row.setTooltip(5, value);
		}
		public void setStatusReadOnly(boolean value)
		{
			super.row.setReadOnly(6, value);
		}
		public boolean isStatusReadOnly()
		{
			return super.row.isReadOnly(6);
		}
		public void showStatusOpened()
		{
			super.row.showOpened(6);
		}
		public String getStatus()
		{
			return (String)super.row.get(6);
		}
		public void setStatus(String value)
		{
			super.row.set(6, value);
		}
		public void setCellStatusTooltip(String value)
		{
			super.row.setTooltip(6, value);
		}
		public ims.core.vo.DocumentVo getValue()
		{
			return (ims.core.vo.DocumentVo)super.row.getValue();
		}
		public void setValue(ims.core.vo.DocumentVo value)
		{
			super.row.setValue(value);
		}
	}
	public static class grdDocumentsRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdDocumentsRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdDocumentsRow get(int index)
		{
			return new grdDocumentsRow(super.collection.get(index));
		}
		public grdDocumentsRow newRow()
		{
			return new grdDocumentsRow(super.collection.newRow());
		}
		public grdDocumentsRow newRow(boolean autoSelect)
		{
			return new grdDocumentsRow(super.collection.newRow(autoSelect));
		}
		public grdDocumentsRow newRowAt(int index)
		{
			return new grdDocumentsRow(super.collection.newRowAt(index));
		}
		public grdDocumentsRow newRowAt(int index, boolean autoSelect)
		{
			return new grdDocumentsRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdDocumentsGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		private void addDateColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean canBeEmpty, String validationString, boolean bold, int sortOrder, boolean canGrow)
		{
			super.grid.addDateColumn(caption, captionAlignment, alignment, width, readOnly, canBeEmpty, validationString, bold, sortOrder, canGrow);
		}
		private void addStringColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, int maxLength, boolean canGrow, ims.framework.enumerations.CharacterCasing casing)
		{
			super.grid.addStringColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, maxLength, canGrow, casing);
		}
		public ims.core.vo.DocumentVoCollection getValues()
		{
			ims.core.vo.DocumentVoCollection listOfValues = new ims.core.vo.DocumentVoCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.core.vo.DocumentVo getValue()
		{
			return (ims.core.vo.DocumentVo)super.grid.getValue();
		}
		public void setValue(ims.core.vo.DocumentVo value)
		{
			super.grid.setValue(value);
		}
		public grdDocumentsRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdDocumentsRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdDocumentsRowCollection getRows()
		{
			return new grdDocumentsRowCollection(super.grid.getRows());
		}
		public grdDocumentsRow getRowByValue(ims.core.vo.DocumentVo value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdDocumentsRow(row);
		}
		public void setDateHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getDateHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setDescriptionHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getDescriptionHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
		}
		public void setDiscDateHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(2, value);
		}
		public String getDiscDateHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(2);
		}
		public void setContactNoHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(3, value);
		}
		public String getContactNoHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(3);
		}
		public void setConsultantHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(4, value);
		}
		public String getConsultantHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(4);
		}
		public void setRecordingUserHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(5, value);
		}
		public String getRecordingUserHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(5);
		}
		public void setStatusHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(6, value);
		}
		public String getStatusHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(6);
		}
	}

	public static class Group1RadioButton extends RadioButtonBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected void setContext(Integer startTabIndex, ims.framework.utils.SizeInfo designSize, ims.framework.utils.SizeInfo runtimeSize)
		{
			if(startTabIndex == null)
				throw new RuntimeException("Invalid startTabIndex ");
			RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 736, 48, 104, 16, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
			control.addButton(0, anchoringHelper1.getX(), anchoringHelper1.getY(), anchoringHelper1.getWidth(), "My Specialty Only", -1);
			RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 632, 48, 88, 16, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
			control.addButton(1, anchoringHelper2.getX(), anchoringHelper2.getY(), anchoringHelper2.getWidth(), "All Documents", -1);
		}
		public void setText(Group1Enumeration option, String value)
		{
			if(option != null && option.id >= 0 && value != null)
				control.setText(option.id, value);
		}
		public Group1Enumeration getValue()
		{
			switch (super.control.getValue())
			{
				case -1: return Group1Enumeration.None;
				case 0: return Group1Enumeration.rdoMySpecOnly;
				case 1: return Group1Enumeration.rdoAllDocs;
			}
			return null;
		}
		public void setValue(Group1Enumeration value)
		{
			if(value != null)
				super.control.setValue(value.id);
			else
				super.control.setValue(Group1Enumeration.None.id);
		}
		public boolean isEnabled(Group1Enumeration option)
		{
			return super.control.isEnabled(option.id);
		}
		public void setEnabled(Group1Enumeration option, boolean value)
		{
			super.control.setEnabled(option.id, value);
		}
		public boolean isVisible(Group1Enumeration option)
		{
			return super.control.isVisible(option.id);
		}
		public void setVisible(Group1Enumeration option, boolean value)
		{
			super.control.setVisible(option.id, value);
		}
		public void setVisible(boolean value)
		{
			super.control.setVisible(value);
		}
		public void setEnabled(boolean value)
		{
			super.control.setEnabled(value);
		}
	}
	public static class Group1Enumeration implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		public static Group1Enumeration None = new Group1Enumeration(-1);
		public static Group1Enumeration rdoMySpecOnly = new Group1Enumeration(0);
		public static Group1Enumeration rdoAllDocs = new Group1Enumeration(1);
		private Group1Enumeration(int id)
		{
			this.id = id;
		}
		public boolean equals(Object o)
		{
			return this.id == ((Group1Enumeration)o).id;
		}
		private int id;
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
		if(!context.isValidContextType(ims.core.vo.PatientShort.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.PatientShort' of the global context variable 'Core.PatientShort' is not supported.");
	}
	private void validateMandatoryContext(Context context)
	{
		if(new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Core.PatientShort' is not available.");
	}
	public boolean supportsRecordedInError()
	{
		return false;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return null;
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
			validateMandatoryContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(848, 632);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setFormReferences(FormReferencesFlyweightFactory.getInstance().create(Forms.class));
		super.setImageReferences(ImageReferencesFlyweightFactory.getInstance().create(Images.class));
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));

		// Context Menus
		contextMenus = new ContextMenus();
		contextMenus.Correspondence.contextMenuPatientDocuments = factory.createMenu(startControlID.intValue() + 1);
		contextMenus.Correspondence.contextMenuPatientDocumentsViewItem = factory.createMenuItem(startControlID.intValue() + 1, "View", true, false, new Integer(102202), false, false);
		contextMenus.Correspondence.contextMenuPatientDocuments.add(contextMenus.Correspondence.contextMenuPatientDocumentsViewItem);
		contextMenus.Correspondence.contextMenuPatientDocumentsPrintItem = factory.createMenuItem(startControlID.intValue() + 2, "Print", true, false, new Integer(102221), false, false);
		contextMenus.Correspondence.contextMenuPatientDocuments.add(contextMenus.Correspondence.contextMenuPatientDocumentsPrintItem);
		contextMenus.Correspondence.contextMenuPatientDocumentsChangeStatusItem = factory.createMenuItem(startControlID.intValue() + 3, "Change Status", true, false, new Integer(102214), false, true);
		contextMenus.Correspondence.contextMenuPatientDocuments.add(contextMenus.Correspondence.contextMenuPatientDocumentsChangeStatusItem);
		form.registerMenu(contextMenus.Correspondence.contextMenuPatientDocuments);


		// Panel Controls
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 832, 32, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		super.addControl(factory.getControl(Panel.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT,"Patient's Documents", new Integer(1), ""}));

		// Grid Controls
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 8, 72, 832, 528, ims.framework.enumerations.ControlAnchoring.ALL);
		Grid m_grdDocumentsTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), new Integer(-1), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.TRUE, Boolean.FALSE, new Integer(24), Boolean.TRUE, contextMenus.Correspondence.contextMenuPatientDocuments, Boolean.FALSE, Boolean.FALSE, new Integer(0), null, Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdDocumentsTemp);
		grdDocumentsGrid grdDocuments = (grdDocumentsGrid)GridFlyweightFactory.getInstance().createGridBridge(grdDocumentsGrid.class, m_grdDocumentsTemp);
		grdDocuments.addDateColumn("Date", 0, 0, 80, true, true, null, false, 0, true);
		grdDocuments.addStringColumn("Description", 0, 0, 200, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDocuments.addDateColumn("Disc Date", 0, 0, 70, true, true, null, false, 0, true);
		grdDocuments.addStringColumn("Contact No", 0, 0, 70, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDocuments.addStringColumn("Consultant", 0, 0, 140, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDocuments.addStringColumn("Recording User", 0, 0, 140, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdDocuments.addStringColumn("Status", 0, 0, -1, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		super.addGrid(grdDocuments);

		// RadioButton Controls
		RadioButton tmpGroup1 = (RadioButton)factory.getControl(RadioButton.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(0), ControlState.HIDDEN, ControlState.HIDDEN, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT,Boolean.FALSE});
		super.addControl(tmpGroup1);
		Group1RadioButton Group1 = (Group1RadioButton)RadioButtonBridgeFlyweightFactory.getInstance().createRadioButtonBridge(Group1RadioButton.class, tmpGroup1);
		Group1.setContext(startTabIndex, designSize, runtimeSize);
		super.addRadioButton(Group1);
	}



	public Forms getForms()
	{
		return (Forms)super.getFormReferences();
	}

	public Images getImages()
	{
		return (Images)super.getImageReferences();
	}
	public grdDocumentsGrid grdDocuments()
	{
		return (grdDocumentsGrid)super.getGrid(0);
	}
	public Group1RadioButton Group1()
	{
		return (Group1RadioButton)super.getRadioButton(0);
	}

	public static class Forms implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			private LocalFormName(int name)
			{
				super(name);
			}
		}

		private Forms()
		{
			Correspondence = new CorrespondenceForms();
		}
		public final class CorrespondenceForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CorrespondenceForms()
			{
				ProcessReport = new LocalFormName(111119);
				PrintDishargeLetter = new LocalFormName(111120);
			}
			public final FormName ProcessReport;
			public final FormName PrintDishargeLetter;
		}

		public CorrespondenceForms Correspondence;
	}


	public static class Images implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		private final class ImageHelper extends ims.framework.utils.ImagePath
		{
			private static final long serialVersionUID = 1L;
			
			private ImageHelper(int id, String path, Integer width, Integer height)
			{
				super(id, path, width, height);
			}
		}
		private Images()
		{
			Core = new CoreImages();
		}
		public final class CoreImages implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CoreImages()
			{
				BookOpenEnabled = new ImageHelper(102186, "Images/Core/Book-Open.gif", new Integer(16), new Integer(16));
			}
			public final ims.framework.utils.Image BookOpenEnabled;
		}
		public final CoreImages Core;
	}
	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_docVo = new ims.framework.ContextVariable("docVo", prefix + "_lv_Correspondence.PatientDocuments.__internal_x_context__docVo_" + componentIdentifier + "");
		}
		
		public boolean getdocVoIsNotNull()
		{
			return !cxl_docVo.getValueIsNull(context);
		}
		public ims.core.vo.DocumentVo getdocVo()
		{
			return (ims.core.vo.DocumentVo)cxl_docVo.getValue(context);
		}
		public void setdocVo(ims.core.vo.DocumentVo value)
		{
			cxl_docVo.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_docVo = null;
	}

	public final class ContextMenus implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		public CorrespondenceNamespace Correspondence = new CorrespondenceNamespace();
		public final class CorrespondenceNamespace implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			public final class PatientDocuments implements java.io.Serializable
			{
				private static final long serialVersionUID = 1L;
				public static final int View = 1;
				public static final int Print = 2;
				public static final int ChangeStatus = 3;
			}
			public void disableAllPatientDocumentsMenuItems()
			{
				this.contextMenuPatientDocumentsViewItem.setEnabled(false);
				this.contextMenuPatientDocumentsPrintItem.setEnabled(false);
				this.contextMenuPatientDocumentsChangeStatusItem.setEnabled(false);
			}
			public void hideAllPatientDocumentsMenuItems()
			{
				this.contextMenuPatientDocumentsViewItem.setVisible(false);
				this.contextMenuPatientDocumentsPrintItem.setVisible(false);
				this.contextMenuPatientDocumentsChangeStatusItem.setVisible(false);
			}
			private Menu contextMenuPatientDocuments;
			public MenuItem getPatientDocumentsViewItem()
			{
				return this.contextMenuPatientDocumentsViewItem;
			}
			private MenuItem contextMenuPatientDocumentsViewItem;
			public MenuItem getPatientDocumentsPrintItem()
			{
				return this.contextMenuPatientDocumentsPrintItem;
			}
			private MenuItem contextMenuPatientDocumentsPrintItem;
			public MenuItem getPatientDocumentsChangeStatusItem()
			{
				return this.contextMenuPatientDocumentsChangeStatusItem;
			}
			private MenuItem contextMenuPatientDocumentsChangeStatusItem;
		}
	}

	private ContextMenus contextMenus;
	public ContextMenus getContextMenus()
	{
		return this.contextMenus;
	}

	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[74];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_CareUk.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			fields[71] = new ims.framework.ReportField(this.context, prefix + "_lv_Correspondence.PatientDocuments.__internal_x_context__docVo_" + componentIdentifier, "BO-1001100009-ID", "ID_Document");
			fields[72] = new ims.framework.ReportField(this.context, prefix + "_lv_Correspondence.PatientDocuments.__internal_x_context__docVo_" + componentIdentifier, "BO-1001100009-CONTENT", "Content");
			fields[73] = new ims.framework.ReportField(this.context, prefix + "_lv_Correspondence.PatientDocuments.__internal_x_context__docVo_" + componentIdentifier, "BO-1001100009-STATUS", "Status");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return null;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}