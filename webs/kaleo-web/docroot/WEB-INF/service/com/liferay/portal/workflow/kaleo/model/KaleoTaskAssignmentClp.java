/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * <a href="KaleoTaskAssignmentClp.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class KaleoTaskAssignmentClp extends BaseModelImpl<KaleoTaskAssignment>
	implements KaleoTaskAssignment {
	public KaleoTaskAssignmentClp() {
	}

	public long getPrimaryKey() {
		return _kaleoTaskAssignmentId;
	}

	public void setPrimaryKey(long pk) {
		setKaleoTaskAssignmentId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_kaleoTaskAssignmentId);
	}

	public long getKaleoTaskAssignmentId() {
		return _kaleoTaskAssignmentId;
	}

	public void setKaleoTaskAssignmentId(long kaleoTaskAssignmentId) {
		_kaleoTaskAssignmentId = kaleoTaskAssignmentId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getKaleoNodeId() {
		return _kaleoNodeId;
	}

	public void setKaleoNodeId(long kaleoNodeId) {
		_kaleoNodeId = kaleoNodeId;
	}

	public long getKaleoTaskId() {
		return _kaleoTaskId;
	}

	public void setKaleoTaskId(long kaleoTaskId) {
		_kaleoTaskId = kaleoTaskId;
	}

	public String getAssigneeClassName() {
		return _assigneeClassName;
	}

	public void setAssigneeClassName(String assigneeClassName) {
		_assigneeClassName = assigneeClassName;
	}

	public long getAssigneeClassPK() {
		return _assigneeClassPK;
	}

	public void setAssigneeClassPK(long assigneeClassPK) {
		_assigneeClassPK = assigneeClassPK;
	}

	public boolean getDefaultAssignment() {
		return _defaultAssignment;
	}

	public boolean isDefaultAssignment() {
		return _defaultAssignment;
	}

	public void setDefaultAssignment(boolean defaultAssignment) {
		_defaultAssignment = defaultAssignment;
	}

	public KaleoTaskAssignment toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			KaleoTaskAssignment model = new KaleoTaskAssignmentClp();

			model.setEscapedModel(true);

			model.setKaleoTaskAssignmentId(getKaleoTaskAssignmentId());
			model.setCompanyId(getCompanyId());
			model.setUserId(getUserId());
			model.setUserName(HtmlUtil.escape(getUserName()));
			model.setCreateDate(getCreateDate());
			model.setModifiedDate(getModifiedDate());
			model.setKaleoDefinitionId(getKaleoDefinitionId());
			model.setKaleoNodeId(getKaleoNodeId());
			model.setKaleoTaskId(getKaleoTaskId());
			model.setAssigneeClassName(HtmlUtil.escape(getAssigneeClassName()));
			model.setAssigneeClassPK(getAssigneeClassPK());
			model.setDefaultAssignment(getDefaultAssignment());

			model = (KaleoTaskAssignment)Proxy.newProxyInstance(KaleoTaskAssignment.class.getClassLoader(),
					new Class[] { KaleoTaskAssignment.class },
					new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public Object clone() {
		KaleoTaskAssignmentClp clone = new KaleoTaskAssignmentClp();

		clone.setKaleoTaskAssignmentId(getKaleoTaskAssignmentId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setKaleoDefinitionId(getKaleoDefinitionId());
		clone.setKaleoNodeId(getKaleoNodeId());
		clone.setKaleoTaskId(getKaleoTaskId());
		clone.setAssigneeClassName(getAssigneeClassName());
		clone.setAssigneeClassPK(getAssigneeClassPK());
		clone.setDefaultAssignment(getDefaultAssignment());

		return clone;
	}

	public int compareTo(KaleoTaskAssignment kaleoTaskAssignment) {
		int value = 0;

		if (getKaleoTaskAssignmentId() < kaleoTaskAssignment.getKaleoTaskAssignmentId()) {
			value = -1;
		}
		else if (getKaleoTaskAssignmentId() > kaleoTaskAssignment.getKaleoTaskAssignmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		KaleoTaskAssignmentClp kaleoTaskAssignment = null;

		try {
			kaleoTaskAssignment = (KaleoTaskAssignmentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = kaleoTaskAssignment.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{kaleoTaskAssignmentId=");
		sb.append(getKaleoTaskAssignmentId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoNodeId=");
		sb.append(getKaleoNodeId());
		sb.append(", kaleoTaskId=");
		sb.append(getKaleoTaskId());
		sb.append(", assigneeClassName=");
		sb.append(getAssigneeClassName());
		sb.append(", assigneeClassPK=");
		sb.append(getAssigneeClassPK());
		sb.append(", defaultAssignment=");
		sb.append(getDefaultAssignment());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoTaskAssignmentId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTaskAssignmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getKaleoNodeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoTaskId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeClassName</column-name><column-value><![CDATA[");
		sb.append(getAssigneeClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigneeClassPK</column-name><column-value><![CDATA[");
		sb.append(getAssigneeClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defaultAssignment</column-name><column-value><![CDATA[");
		sb.append(getDefaultAssignment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _kaleoTaskAssignmentId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _kaleoDefinitionId;
	private long _kaleoNodeId;
	private long _kaleoTaskId;
	private String _assigneeClassName;
	private long _assigneeClassPK;
	private boolean _defaultAssignment;
}