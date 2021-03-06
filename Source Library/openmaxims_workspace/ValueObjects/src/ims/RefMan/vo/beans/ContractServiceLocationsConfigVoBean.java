// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class ContractServiceLocationsConfigVoBean extends ims.vo.ValueObjectBean
{
	public ContractServiceLocationsConfigVoBean()
	{
	}
	public ContractServiceLocationsConfigVoBean(ims.RefMan.vo.ContractServiceLocationsConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.service = vo.getService() == null ? null : (ims.admin.vo.beans.ServiceVoLiteVoBean)vo.getService().getBean();
		this.location = vo.getLocation() == null ? null : (ims.admin.vo.beans.ConfigLocationLiteVoBean)vo.getLocation().getBean();
		this.contractid = vo.getContractId();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.ContractServiceLocationsConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.service = vo.getService() == null ? null : (ims.admin.vo.beans.ServiceVoLiteVoBean)vo.getService().getBean(map);
		this.location = vo.getLocation() == null ? null : (ims.admin.vo.beans.ConfigLocationLiteVoBean)vo.getLocation().getBean(map);
		this.contractid = vo.getContractId();
	}

	public ims.RefMan.vo.ContractServiceLocationsConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.ContractServiceLocationsConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.ContractServiceLocationsConfigVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.ContractServiceLocationsConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.ContractServiceLocationsConfigVo();
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
	public ims.admin.vo.beans.ServiceVoLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.admin.vo.beans.ServiceVoLiteVoBean value)
	{
		this.service = value;
	}
	public ims.admin.vo.beans.ConfigLocationLiteVoBean getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.admin.vo.beans.ConfigLocationLiteVoBean value)
	{
		this.location = value;
	}
	public String getContractId()
	{
		return this.contractid;
	}
	public void setContractId(String value)
	{
		this.contractid = value;
	}

	private Integer id;
	private int version;
	private ims.admin.vo.beans.ServiceVoLiteVoBean service;
	private ims.admin.vo.beans.ConfigLocationLiteVoBean location;
	private String contractid;
}
