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

package ims.icps.instantiation.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to ICPs.Instantiation.PatientICPActionStatus business object (ID: 1100100006).
 */
public class PatientICPActionStatusRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<PatientICPActionStatusRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PatientICPActionStatusRefVo> col = new ArrayList<PatientICPActionStatusRefVo>();
	public final String getBoClassName()
	{
		return "ims.icps.instantiation.domain.objects.PatientICPActionStatus";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(PatientICPActionStatusRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PatientICPActionStatusRefVo value)
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
	public int indexOf(PatientICPActionStatusRefVo instance)
	{
		return col.indexOf(instance);
	}
	public PatientICPActionStatusRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PatientICPActionStatusRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PatientICPActionStatusRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PatientICPActionStatusRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PatientICPActionStatusRefVoCollection clone = new PatientICPActionStatusRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PatientICPActionStatusRefVo)this.col.get(x).clone());
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
	public PatientICPActionStatusRefVo[] toArray()
	{
		PatientICPActionStatusRefVo[] arr = new PatientICPActionStatusRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public PatientICPActionStatusRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PatientICPActionStatusRefVoCollection sort(SortOrder order)
	{
		return sort(new PatientICPActionStatusRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public PatientICPActionStatusRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<PatientICPActionStatusRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PatientICPActionStatusRefVoComparator implements Comparator
	{
		private int direction = 1;
		public PatientICPActionStatusRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PatientICPActionStatusRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			PatientICPActionStatusRefVo voObj1 = (PatientICPActionStatusRefVo)obj1;
			PatientICPActionStatusRefVo voObj2 = (PatientICPActionStatusRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}