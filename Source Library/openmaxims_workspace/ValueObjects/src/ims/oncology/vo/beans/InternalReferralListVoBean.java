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

package ims.oncology.vo.beans;

public class InternalReferralListVoBean extends ims.vo.ValueObjectBean
{
	public InternalReferralListVoBean()
	{
	}
	public InternalReferralListVoBean(ims.oncology.vo.InternalReferralListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.referraldate = vo.getReferralDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDate().getBean();
		this.referraltype = vo.getReferralType() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralType().getBean();
		this.referralsource = vo.getReferralSource() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralSource().getBean();
		this.referredby = vo.getReferredBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getReferredBy().getBean();
		this.planneddischargedate = vo.getPlannedDischargeDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPlannedDischargeDate().getBean();
		this.treatmentstartdate = vo.getTreatmentStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTreatmentStartDate().getBean();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientListVoBean)vo.getPatient().getBean();
		this.internalreferraloutcome = vo.getInternalReferralOutcome() == null ? null : (ims.oncology.vo.beans.InternalReferralOutcomeVoBean)vo.getInternalReferralOutcome().getBean();
		this.referralseen = vo.getReferralSeen();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.oncology.vo.InternalReferralListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.referraldate = vo.getReferralDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDate().getBean();
		this.referraltype = vo.getReferralType() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralType().getBean();
		this.referralsource = vo.getReferralSource() == null ? null : (ims.vo.LookupInstanceBean)vo.getReferralSource().getBean();
		this.referredby = vo.getReferredBy() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getReferredBy().getBean(map);
		this.planneddischargedate = vo.getPlannedDischargeDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPlannedDischargeDate().getBean();
		this.treatmentstartdate = vo.getTreatmentStartDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getTreatmentStartDate().getBean();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientListVoBean)vo.getPatient().getBean(map);
		this.internalreferraloutcome = vo.getInternalReferralOutcome() == null ? null : (ims.oncology.vo.beans.InternalReferralOutcomeVoBean)vo.getInternalReferralOutcome().getBean(map);
		this.referralseen = vo.getReferralSeen();
	}

	public ims.oncology.vo.InternalReferralListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.oncology.vo.InternalReferralListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.oncology.vo.InternalReferralListVo vo = null;
		if(map != null)
			vo = (ims.oncology.vo.InternalReferralListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.oncology.vo.InternalReferralListVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.framework.utils.beans.DateBean getReferralDate()
	{
		return this.referraldate;
	}
	public void setReferralDate(ims.framework.utils.beans.DateBean value)
	{
		this.referraldate = value;
	}
	public ims.vo.LookupInstanceBean getReferralType()
	{
		return this.referraltype;
	}
	public void setReferralType(ims.vo.LookupInstanceBean value)
	{
		this.referraltype = value;
	}
	public ims.vo.LookupInstanceBean getReferralSource()
	{
		return this.referralsource;
	}
	public void setReferralSource(ims.vo.LookupInstanceBean value)
	{
		this.referralsource = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getReferredBy()
	{
		return this.referredby;
	}
	public void setReferredBy(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.referredby = value;
	}
	public ims.framework.utils.beans.DateBean getPlannedDischargeDate()
	{
		return this.planneddischargedate;
	}
	public void setPlannedDischargeDate(ims.framework.utils.beans.DateBean value)
	{
		this.planneddischargedate = value;
	}
	public ims.framework.utils.beans.DateBean getTreatmentStartDate()
	{
		return this.treatmentstartdate;
	}
	public void setTreatmentStartDate(ims.framework.utils.beans.DateBean value)
	{
		this.treatmentstartdate = value;
	}
	public ims.core.vo.beans.PatientListVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientListVoBean value)
	{
		this.patient = value;
	}
	public ims.oncology.vo.beans.InternalReferralOutcomeVoBean getInternalReferralOutcome()
	{
		return this.internalreferraloutcome;
	}
	public void setInternalReferralOutcome(ims.oncology.vo.beans.InternalReferralOutcomeVoBean value)
	{
		this.internalreferraloutcome = value;
	}
	public Boolean getReferralSeen()
	{
		return this.referralseen;
	}
	public void setReferralSeen(Boolean value)
	{
		this.referralseen = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateBean referraldate;
	private ims.vo.LookupInstanceBean referraltype;
	private ims.vo.LookupInstanceBean referralsource;
	private ims.core.vo.beans.HcpLiteVoBean referredby;
	private ims.framework.utils.beans.DateBean planneddischargedate;
	private ims.framework.utils.beans.DateBean treatmentstartdate;
	private ims.core.vo.beans.PatientListVoBean patient;
	private ims.oncology.vo.beans.InternalReferralOutcomeVoBean internalreferraloutcome;
	private Boolean referralseen;
}