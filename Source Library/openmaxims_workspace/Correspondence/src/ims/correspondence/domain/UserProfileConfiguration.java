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

package ims.correspondence.domain;

// Generated from form domain impl
public interface UserProfileConfiguration extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Domain funtion to search users based on criterias that are assambled into a filter VO.
	*/
	public ims.admin.vo.AppUserShortWithNameVoCollection searchUsers(ims.admin.vo.AppUserShortVo filterVo) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.correspondence.vo.UserAccessVo getUserAccess(ims.core.configuration.vo.AppUserRefVo userID);

	// Generated from form domain interface definition
	public ims.correspondence.vo.UserAccessVo saveUserAccess(ims.correspondence.vo.UserAccessVo userAccess) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.ClinicLiteVoCollection listClinics(ims.core.vo.ClinicLiteVo filterVo) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.MedicLiteVoCollection listConsultants(ims.core.vo.MedicLiteVo filterVo) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public java.util.ArrayList<ims.core.vo.lookups.Specialty> listSpecialty(ims.core.vo.lookups.Specialty filterLookup) throws ims.domain.exceptions.DomainInterfaceException;
}