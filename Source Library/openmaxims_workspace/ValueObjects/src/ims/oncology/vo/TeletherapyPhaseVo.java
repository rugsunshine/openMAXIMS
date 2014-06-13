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

package ims.oncology.vo;

/**
 * Linked to Oncology.TeletherapyPhase business object (ID: 1074100028).
 */
public class TeletherapyPhaseVo extends ims.oncology.vo.TeletherapyPhaseRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TeletherapyPhaseVo()
	{
	}
	public TeletherapyPhaseVo(Integer id, int version)
	{
		super(id, version);
	}
	public TeletherapyPhaseVo(ims.oncology.vo.beans.TeletherapyPhaseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.phase = bean.getPhase();
		this.dose = bean.getDose();
		this.fractions = bean.getFractions();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.oncology.vo.beans.TeletherapyPhaseVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.phase = bean.getPhase();
		this.dose = bean.getDose();
		this.fractions = bean.getFractions();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.oncology.vo.beans.TeletherapyPhaseVoBean bean = null;
		if(map != null)
			bean = (ims.oncology.vo.beans.TeletherapyPhaseVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.oncology.vo.beans.TeletherapyPhaseVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("PHASE"))
			return getPhase();
		if(fieldName.equals("DOSE"))
			return getDose();
		if(fieldName.equals("FRACTIONS"))
			return getFractions();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPhaseIsNotNull()
	{
		return this.phase != null;
	}
	public Integer getPhase()
	{
		return this.phase;
	}
	public void setPhase(Integer value)
	{
		this.isValidated = false;
		this.phase = value;
	}
	public boolean getDoseIsNotNull()
	{
		return this.dose != null;
	}
	public Float getDose()
	{
		return this.dose;
	}
	public void setDose(Float value)
	{
		this.isValidated = false;
		this.dose = value;
	}
	public boolean getFractionsIsNotNull()
	{
		return this.fractions != null;
	}
	public Integer getFractions()
	{
		return this.fractions;
	}
	public void setFractions(Integer value)
	{
		this.isValidated = false;
		this.fractions = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		TeletherapyPhaseVo clone = new TeletherapyPhaseVo(this.id, this.version);
		
		clone.phase = this.phase;
		clone.dose = this.dose;
		clone.fractions = this.fractions;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(TeletherapyPhaseVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TeletherapyPhaseVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TeletherapyPhaseVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TeletherapyPhaseVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.phase != null)
			count++;
		if(this.dose != null)
			count++;
		if(this.fractions != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected Integer phase;
	protected Float dose;
	protected Integer fractions;
	private boolean isValidated = false;
	private boolean isBusy = false;
}