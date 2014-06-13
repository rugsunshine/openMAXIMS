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

package ims.core.vo;

/**
 * Linked to Assessment.Configuration.AssessmentQuestion business object (ID: 1003100045).
 */
public class AssessmentQuestionVo extends ims.core.vo.AssessmentQuestionShortVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AssessmentQuestionVo()
	{
	}
	public AssessmentQuestionVo(Integer id, int version)
	{
		super(id, version);
	}
	public AssessmentQuestionVo(ims.core.vo.beans.AssessmentQuestionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.ismandatory = bean.getIsMandatory();
		this.activestatus = bean.getActiveStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getActiveStatus());
		this.sequence = bean.getSequence();
		this.allowsmultipleanswers = bean.getAllowsMultipleAnswers();
		this.isnonstandard = bean.getIsNonStandard();
		this.url = bean.getURL();
		this.protocol = bean.getProtocol();
		this.legendtext = bean.getLegendText();
		this.question = bean.getQuestion() == null ? null : bean.getQuestion().buildVo();
		this.scoringanswertype = bean.getScoringAnswerType() == null ? null : bean.getScoringAnswerType().buildVo();
		this.assessmentanswerrole = ims.assessment.vo.AssessmentQuestionRoleVoCollection.buildFromBeanCollection(bean.getAssessmentAnswerRole());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.AssessmentQuestionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.ismandatory = bean.getIsMandatory();
		this.activestatus = bean.getActiveStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getActiveStatus());
		this.sequence = bean.getSequence();
		this.allowsmultipleanswers = bean.getAllowsMultipleAnswers();
		this.isnonstandard = bean.getIsNonStandard();
		this.url = bean.getURL();
		this.protocol = bean.getProtocol();
		this.legendtext = bean.getLegendText();
		this.question = bean.getQuestion() == null ? null : bean.getQuestion().buildVo(map);
		this.scoringanswertype = bean.getScoringAnswerType() == null ? null : bean.getScoringAnswerType().buildVo(map);
		this.assessmentanswerrole = ims.assessment.vo.AssessmentQuestionRoleVoCollection.buildFromBeanCollection(bean.getAssessmentAnswerRole());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.AssessmentQuestionVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.AssessmentQuestionVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.AssessmentQuestionVoBean();
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
		if(fieldName.equals("QUESTION"))
			return getQuestion();
		if(fieldName.equals("SCORINGANSWERTYPE"))
			return getScoringAnswerType();
		if(fieldName.equals("ASSESSMENTANSWERROLE"))
			return getAssessmentAnswerRole();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getQuestionIsNotNull()
	{
		return this.question != null;
	}
	public ims.core.vo.QuestionInformationVo getQuestion()
	{
		return this.question;
	}
	public void setQuestion(ims.core.vo.QuestionInformationVo value)
	{
		this.isValidated = false;
		this.question = value;
	}
	public boolean getScoringAnswerTypeIsNotNull()
	{
		return this.scoringanswertype != null;
	}
	public ims.core.vo.QuestionAnswerTypeVo getScoringAnswerType()
	{
		return this.scoringanswertype;
	}
	public void setScoringAnswerType(ims.core.vo.QuestionAnswerTypeVo value)
	{
		this.isValidated = false;
		this.scoringanswertype = value;
	}
	public boolean getAssessmentAnswerRoleIsNotNull()
	{
		return this.assessmentanswerrole != null;
	}
	public ims.assessment.vo.AssessmentQuestionRoleVoCollection getAssessmentAnswerRole()
	{
		return this.assessmentanswerrole;
	}
	public void setAssessmentAnswerRole(ims.assessment.vo.AssessmentQuestionRoleVoCollection value)
	{
		this.isValidated = false;
		this.assessmentanswerrole = value;
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
		if(this.question != null)
		{
			if(!this.question.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.scoringanswertype != null)
		{
			if(!this.scoringanswertype.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.assessmentanswerrole != null)
		{
			if(!this.assessmentanswerrole.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.ismandatory == null)
			listOfErrors.add("isMandatory is mandatory");
		if(this.activestatus == null)
			listOfErrors.add("ActiveStatus is mandatory");
		if(this.sequence == null)
			listOfErrors.add("Sequence is mandatory");
		if(this.url != null)
			if(this.url.length() > 255)
				listOfErrors.add("The length of the field [url] in the value object [ims.core.vo.AssessmentQuestionVo] is too big. It should be less or equal to 255");
		if(this.protocol != null)
			if(this.protocol.length() > 255)
				listOfErrors.add("The length of the field [protocol] in the value object [ims.core.vo.AssessmentQuestionVo] is too big. It should be less or equal to 255");
		if(this.question == null)
			listOfErrors.add("Question is mandatory");
		if(this.question != null)
		{
			String[] listOfOtherErrors = this.question.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.scoringanswertype != null)
		{
			String[] listOfOtherErrors = this.scoringanswertype.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.assessmentanswerrole != null)
		{
			String[] listOfOtherErrors = this.assessmentanswerrole.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
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
	
		AssessmentQuestionVo clone = new AssessmentQuestionVo(this.id, this.version);
		
		clone.ismandatory = this.ismandatory;
		if(this.activestatus == null)
			clone.activestatus = null;
		else
			clone.activestatus = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.activestatus.clone();
		clone.sequence = this.sequence;
		clone.allowsmultipleanswers = this.allowsmultipleanswers;
		clone.isnonstandard = this.isnonstandard;
		clone.url = this.url;
		clone.protocol = this.protocol;
		clone.legendtext = this.legendtext;
		if(this.question == null)
			clone.question = null;
		else
			clone.question = (ims.core.vo.QuestionInformationVo)this.question.clone();
		if(this.scoringanswertype == null)
			clone.scoringanswertype = null;
		else
			clone.scoringanswertype = (ims.core.vo.QuestionAnswerTypeVo)this.scoringanswertype.clone();
		if(this.assessmentanswerrole == null)
			clone.assessmentanswerrole = null;
		else
			clone.assessmentanswerrole = (ims.assessment.vo.AssessmentQuestionRoleVoCollection)this.assessmentanswerrole.clone();
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
		if (!(AssessmentQuestionVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AssessmentQuestionVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		AssessmentQuestionVo compareObj = (AssessmentQuestionVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSequence() == null && compareObj.getSequence() != null)
				return -1;
			if(this.getSequence() != null && compareObj.getSequence() == null)
				return 1;
			if(this.getSequence() != null && compareObj.getSequence() != null)
				retVal = this.getSequence().compareTo(compareObj.getSequence());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.question != null)
			count++;
		if(this.scoringanswertype != null)
			count++;
		if(this.assessmentanswerrole != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 3;
	}
	protected ims.core.vo.QuestionInformationVo question;
	protected ims.core.vo.QuestionAnswerTypeVo scoringanswertype;
	protected ims.assessment.vo.AssessmentQuestionRoleVoCollection assessmentanswerrole;
	private boolean isValidated = false;
	private boolean isBusy = false;
}