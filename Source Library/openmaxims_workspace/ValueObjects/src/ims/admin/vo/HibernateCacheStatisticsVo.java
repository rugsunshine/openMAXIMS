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

package ims.admin.vo;


public class HibernateCacheStatisticsVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public HibernateCacheStatisticsVo()
	{
	}
	public HibernateCacheStatisticsVo(ims.admin.vo.beans.HibernateCacheStatisticsVoBean bean)
	{
		this.secondlevelcachehitcount = bean.getSecondLevelCacheHitCount();
		this.secondlevelcachemisscount = bean.getSecondLevelCacheMissCount();
		this.secondlevelcacheputcount = bean.getSecondLevelCachePutCount();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.beans.HibernateCacheStatisticsVoBean bean)
	{
		this.secondlevelcachehitcount = bean.getSecondLevelCacheHitCount();
		this.secondlevelcachemisscount = bean.getSecondLevelCacheMissCount();
		this.secondlevelcacheputcount = bean.getSecondLevelCachePutCount();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.beans.HibernateCacheStatisticsVoBean bean = null;
		if(map != null)
			bean = (ims.admin.vo.beans.HibernateCacheStatisticsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.admin.vo.beans.HibernateCacheStatisticsVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getSecondLevelCacheHitCountIsNotNull()
	{
		return this.secondlevelcachehitcount != null;
	}
	public String getSecondLevelCacheHitCount()
	{
		return this.secondlevelcachehitcount;
	}
	public static int getSecondLevelCacheHitCountMaxLength()
	{
		return 255;
	}
	public void setSecondLevelCacheHitCount(String value)
	{
		this.isValidated = false;
		this.secondlevelcachehitcount = value;
	}
	public boolean getSecondLevelCacheMissCountIsNotNull()
	{
		return this.secondlevelcachemisscount != null;
	}
	public String getSecondLevelCacheMissCount()
	{
		return this.secondlevelcachemisscount;
	}
	public static int getSecondLevelCacheMissCountMaxLength()
	{
		return 255;
	}
	public void setSecondLevelCacheMissCount(String value)
	{
		this.isValidated = false;
		this.secondlevelcachemisscount = value;
	}
	public boolean getSecondLevelCachePutCountIsNotNull()
	{
		return this.secondlevelcacheputcount != null;
	}
	public String getSecondLevelCachePutCount()
	{
		return this.secondlevelcacheputcount;
	}
	public static int getSecondLevelCachePutCountMaxLength()
	{
		return 255;
	}
	public void setSecondLevelCachePutCount(String value)
	{
		this.isValidated = false;
		this.secondlevelcacheputcount = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Cache Hits:");
		if(this.secondlevelcachehitcount != null)
			sb.append(this.secondlevelcachehitcount);
		sb.append("; Cache Misses:");
		if(this.secondlevelcachemisscount != null)
			sb.append(this.secondlevelcachemisscount);
		sb.append("Cache Puts:");
		if(this.secondlevelcacheputcount != null)
			sb.append(this.secondlevelcacheputcount);
		return sb.toString();
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof HibernateCacheStatisticsVo))
			return false;
		HibernateCacheStatisticsVo compareObj = (HibernateCacheStatisticsVo)obj;
		if(this.getSecondLevelCacheHitCount() == null && compareObj.getSecondLevelCacheHitCount() != null)
			return false;
		if(this.getSecondLevelCacheHitCount() != null && compareObj.getSecondLevelCacheHitCount() == null)
			return false;
		if(this.getSecondLevelCacheHitCount() != null && compareObj.getSecondLevelCacheHitCount() != null)
			if(!this.getSecondLevelCacheHitCount().equals(compareObj.getSecondLevelCacheHitCount()))
				return false;
		if(this.getSecondLevelCacheMissCount() == null && compareObj.getSecondLevelCacheMissCount() != null)
			return false;
		if(this.getSecondLevelCacheMissCount() != null && compareObj.getSecondLevelCacheMissCount() == null)
			return false;
		if(this.getSecondLevelCacheMissCount() != null && compareObj.getSecondLevelCacheMissCount() != null)
			if(!this.getSecondLevelCacheMissCount().equals(compareObj.getSecondLevelCacheMissCount()))
				return false;
		if(this.getSecondLevelCachePutCount() == null && compareObj.getSecondLevelCachePutCount() != null)
			return false;
		if(this.getSecondLevelCachePutCount() != null && compareObj.getSecondLevelCachePutCount() == null)
			return false;
		if(this.getSecondLevelCachePutCount() != null && compareObj.getSecondLevelCachePutCount() != null)
			return this.getSecondLevelCachePutCount().equals(compareObj.getSecondLevelCachePutCount());
		return super.equals(obj);
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		HibernateCacheStatisticsVo clone = new HibernateCacheStatisticsVo();
		
		clone.secondlevelcachehitcount = this.secondlevelcachehitcount;
		clone.secondlevelcachemisscount = this.secondlevelcachemisscount;
		clone.secondlevelcacheputcount = this.secondlevelcacheputcount;
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
		if (!(HibernateCacheStatisticsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A HibernateCacheStatisticsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		HibernateCacheStatisticsVo compareObj = (HibernateCacheStatisticsVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSecondLevelCacheHitCount() == null && compareObj.getSecondLevelCacheHitCount() != null)
				return -1;
			if(this.getSecondLevelCacheHitCount() != null && compareObj.getSecondLevelCacheHitCount() == null)
				return 1;
			if(this.getSecondLevelCacheHitCount() != null && compareObj.getSecondLevelCacheHitCount() != null)
			{
				if(caseInsensitive)
					retVal = this.getSecondLevelCacheHitCount().toLowerCase().compareTo(compareObj.getSecondLevelCacheHitCount().toLowerCase());
				else
					retVal = this.getSecondLevelCacheHitCount().compareTo(compareObj.getSecondLevelCacheHitCount());
			}
		}
		if (retVal == 0)
		{
			if(this.getSecondLevelCacheMissCount() == null && compareObj.getSecondLevelCacheMissCount() != null)
				return -1;
			if(this.getSecondLevelCacheMissCount() != null && compareObj.getSecondLevelCacheMissCount() == null)
				return 1;
			if(this.getSecondLevelCacheMissCount() != null && compareObj.getSecondLevelCacheMissCount() != null)
			{
				if(caseInsensitive)
					retVal = this.getSecondLevelCacheMissCount().toLowerCase().compareTo(compareObj.getSecondLevelCacheMissCount().toLowerCase());
				else
					retVal = this.getSecondLevelCacheMissCount().compareTo(compareObj.getSecondLevelCacheMissCount());
			}
		}
		if (retVal == 0)
		{
			if(this.getSecondLevelCachePutCount() == null && compareObj.getSecondLevelCachePutCount() != null)
				return -1;
			if(this.getSecondLevelCachePutCount() != null && compareObj.getSecondLevelCachePutCount() == null)
				return 1;
			if(this.getSecondLevelCachePutCount() != null && compareObj.getSecondLevelCachePutCount() != null)
			{
				if(caseInsensitive)
					retVal = this.getSecondLevelCachePutCount().toLowerCase().compareTo(compareObj.getSecondLevelCachePutCount().toLowerCase());
				else
					retVal = this.getSecondLevelCachePutCount().compareTo(compareObj.getSecondLevelCachePutCount());
			}
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.secondlevelcachehitcount != null)
			count++;
		if(this.secondlevelcachemisscount != null)
			count++;
		if(this.secondlevelcacheputcount != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected String secondlevelcachehitcount;
	protected String secondlevelcachemisscount;
	protected String secondlevelcacheputcount;
	private boolean isValidated = false;
	private boolean isBusy = false;
}