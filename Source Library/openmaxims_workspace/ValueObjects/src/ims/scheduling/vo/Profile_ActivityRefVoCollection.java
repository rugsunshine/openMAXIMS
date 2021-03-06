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

package ims.scheduling.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to Scheduling.Profile_Activity business object (ID: 1090100013).
 */
public class Profile_ActivityRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<Profile_ActivityRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<Profile_ActivityRefVo> col = new ArrayList<Profile_ActivityRefVo>();
	public final String getBoClassName()
	{
		return "ims.scheduling.domain.objects.Profile_Activity";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(Profile_ActivityRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, Profile_ActivityRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(Profile_ActivityRefVo instance)
	{
		return col.indexOf(instance);
	}
	public Profile_ActivityRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, Profile_ActivityRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(Profile_ActivityRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(Profile_ActivityRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		Profile_ActivityRefVoCollection clone = new Profile_ActivityRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((Profile_ActivityRefVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		return clone;
	}
	public boolean isValidated()
	{
		return true;
	}
	public String[] validate()
	{
		return null;
	}
	public Profile_ActivityRefVo[] toArray()
	{
		Profile_ActivityRefVo[] arr = new Profile_ActivityRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Profile_ActivityRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public Profile_ActivityRefVoCollection sort(SortOrder order)
	{
		return sort(new Profile_ActivityRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public Profile_ActivityRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<Profile_ActivityRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class Profile_ActivityRefVoComparator implements Comparator
	{
		private int direction = 1;
		public Profile_ActivityRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public Profile_ActivityRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			Profile_ActivityRefVo voObj1 = (Profile_ActivityRefVo)obj1;
			Profile_ActivityRefVo voObj2 = (Profile_ActivityRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}
