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

package ims.nursing.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class AssessmentComponentType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public AssessmentComponentType()
	{
		super();
	}
	public AssessmentComponentType(int id)
	{
		super(id, "", true);
	}
	public AssessmentComponentType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public AssessmentComponentType(int id, String text, boolean active, AssessmentComponentType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public AssessmentComponentType(int id, String text, boolean active, AssessmentComponentType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public AssessmentComponentType(int id, String text, boolean active, AssessmentComponentType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static AssessmentComponentType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new AssessmentComponentType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (AssessmentComponentType)super.getParentInstance();
	}
	public AssessmentComponentType getParent()
	{
		return (AssessmentComponentType)super.getParentInstance();
	}
	public void setParent(AssessmentComponentType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		AssessmentComponentType[] typedChildren = new AssessmentComponentType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (AssessmentComponentType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof AssessmentComponentType)
		{
			super.addChild((AssessmentComponentType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof AssessmentComponentType)
		{
			super.removeChild((AssessmentComponentType)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		AssessmentComponentTypeCollection result = new AssessmentComponentTypeCollection();
		result.add(ACCOMMODATION);
		result.add(ACTIVITY_LEVEL);
		result.add(BREATHING);
		result.add(COMMUNICATION);
		result.add(MOBILITY);
		result.add(PERSONAL_HYGIENE);
		result.add(DRESSING);
		result.add(SKIN);
		result.add(EATING);
		result.add(BLADDER);
		result.add(BOWELS);
		result.add(PAIN);
		result.add(LEISURE);
		result.add(EMOTIONAL_STATE);
		result.add(SPIRITUALITY);
		result.add(SLEEPING);
		result.add(SPINAL_ACCOMODATION);
		result.add(SPINAL_SAFE_ENVIRONMENT);
		result.add(SPINAL_COMMUNICATION);
		result.add(SPINAL_BREATHING);
		result.add(SPINAL_EATING);
		result.add(SPINAL_BOWELS);
		result.add(SPINAL_BLADDER);
		result.add(SPINAL_CLEANSING);
		result.add(SPINAL_MOBILITY);
		result.add(SPINAL_SKIN);
		result.add(SPINAL_PERSONAL_DETAILS);
		result.add(INFECTION_CONTROL);
		return result;
	}
	public static AssessmentComponentType[] getNegativeInstances()
	{
		AssessmentComponentType[] instances = new AssessmentComponentType[28];
		instances[0] = ACCOMMODATION;
		instances[1] = ACTIVITY_LEVEL;
		instances[2] = BREATHING;
		instances[3] = COMMUNICATION;
		instances[4] = MOBILITY;
		instances[5] = PERSONAL_HYGIENE;
		instances[6] = DRESSING;
		instances[7] = SKIN;
		instances[8] = EATING;
		instances[9] = BLADDER;
		instances[10] = BOWELS;
		instances[11] = PAIN;
		instances[12] = LEISURE;
		instances[13] = EMOTIONAL_STATE;
		instances[14] = SPIRITUALITY;
		instances[15] = SLEEPING;
		instances[16] = SPINAL_ACCOMODATION;
		instances[17] = SPINAL_SAFE_ENVIRONMENT;
		instances[18] = SPINAL_COMMUNICATION;
		instances[19] = SPINAL_BREATHING;
		instances[20] = SPINAL_EATING;
		instances[21] = SPINAL_BOWELS;
		instances[22] = SPINAL_BLADDER;
		instances[23] = SPINAL_CLEANSING;
		instances[24] = SPINAL_MOBILITY;
		instances[25] = SPINAL_SKIN;
		instances[26] = SPINAL_PERSONAL_DETAILS;
		instances[27] = INFECTION_CONTROL;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[28];
		negativeInstances[0] = "ACCOMMODATION";
		negativeInstances[1] = "ACTIVITY_LEVEL";
		negativeInstances[2] = "BREATHING";
		negativeInstances[3] = "COMMUNICATION";
		negativeInstances[4] = "MOBILITY";
		negativeInstances[5] = "PERSONAL_HYGIENE";
		negativeInstances[6] = "DRESSING";
		negativeInstances[7] = "SKIN";
		negativeInstances[8] = "EATING";
		negativeInstances[9] = "BLADDER";
		negativeInstances[10] = "BOWELS";
		negativeInstances[11] = "PAIN";
		negativeInstances[12] = "LEISURE";
		negativeInstances[13] = "EMOTIONAL_STATE";
		negativeInstances[14] = "SPIRITUALITY";
		negativeInstances[15] = "SLEEPING";
		negativeInstances[16] = "SPINAL_ACCOMODATION";
		negativeInstances[17] = "SPINAL_SAFE_ENVIRONMENT";
		negativeInstances[18] = "SPINAL_COMMUNICATION";
		negativeInstances[19] = "SPINAL_BREATHING";
		negativeInstances[20] = "SPINAL_EATING";
		negativeInstances[21] = "SPINAL_BOWELS";
		negativeInstances[22] = "SPINAL_BLADDER";
		negativeInstances[23] = "SPINAL_CLEANSING";
		negativeInstances[24] = "SPINAL_MOBILITY";
		negativeInstances[25] = "SPINAL_SKIN";
		negativeInstances[26] = "SPINAL_PERSONAL_DETAILS";
		negativeInstances[27] = "INFECTION_CONTROL";
		return negativeInstances;
	}
	public static AssessmentComponentType getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static AssessmentComponentType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		AssessmentComponentType[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1211028;
	public static final AssessmentComponentType ACCOMMODATION = new AssessmentComponentType(-4, "Accommodation", true, null, null, Color.Black);
	public static final AssessmentComponentType ACTIVITY_LEVEL = new AssessmentComponentType(-5, "Activity Level", true, null, null, Color.Black);
	public static final AssessmentComponentType BREATHING = new AssessmentComponentType(-6, "Breathing", true, null, null, Color.Black);
	public static final AssessmentComponentType COMMUNICATION = new AssessmentComponentType(-14, "Communication", true, null, null, Color.Black);
	public static final AssessmentComponentType MOBILITY = new AssessmentComponentType(-16, "Mobility", true, null, null, Color.Black);
	public static final AssessmentComponentType PERSONAL_HYGIENE = new AssessmentComponentType(-17, "Personal Hygiene", true, null, null, Color.Black);
	public static final AssessmentComponentType DRESSING = new AssessmentComponentType(-18, "Dressing/Grooming", true, null, null, Color.Black);
	public static final AssessmentComponentType SKIN = new AssessmentComponentType(-19, "Skin", true, null, null, Color.Black);
	public static final AssessmentComponentType EATING = new AssessmentComponentType(-20, "Eating/Drinking", true, null, null, Color.Black);
	public static final AssessmentComponentType BLADDER = new AssessmentComponentType(-21, "Bladder", true, null, null, Color.Black);
	public static final AssessmentComponentType BOWELS = new AssessmentComponentType(-22, "Bowels", true, null, null, Color.Black);
	public static final AssessmentComponentType PAIN = new AssessmentComponentType(-23, "Pain", true, null, null, Color.Black);
	public static final AssessmentComponentType LEISURE = new AssessmentComponentType(-24, "Leisure", true, null, null, Color.Black);
	public static final AssessmentComponentType EMOTIONAL_STATE = new AssessmentComponentType(-25, "Emotional State", true, null, null, Color.Black);
	public static final AssessmentComponentType SPIRITUALITY = new AssessmentComponentType(-26, "Spirituality", true, null, null, Color.Black);
	public static final AssessmentComponentType SLEEPING = new AssessmentComponentType(-28, "Sleeping", true, null, null, Color.Black);
	public static final AssessmentComponentType SPINAL_ACCOMODATION = new AssessmentComponentType(-172, "Accommodation and Property Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_SAFE_ENVIRONMENT = new AssessmentComponentType(-176, "Safe Environment Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_COMMUNICATION = new AssessmentComponentType(-174, "Communication Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_BREATHING = new AssessmentComponentType(-173, "Breathing Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_EATING = new AssessmentComponentType(-184, "Eating Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_BOWELS = new AssessmentComponentType(-180, "Bowels Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_BLADDER = new AssessmentComponentType(-182, "Bladder Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_CLEANSING = new AssessmentComponentType(-183, "Cleansing and Dressing Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_MOBILITY = new AssessmentComponentType(-175, "Mobility Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_SKIN = new AssessmentComponentType(-181, "Skin Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType SPINAL_PERSONAL_DETAILS = new AssessmentComponentType(-177, "Personal Details Spinal", true, null, null, Color.Default);
	public static final AssessmentComponentType INFECTION_CONTROL = new AssessmentComponentType(-1339, "Infection Control", true, null, null, Color.Black);
}