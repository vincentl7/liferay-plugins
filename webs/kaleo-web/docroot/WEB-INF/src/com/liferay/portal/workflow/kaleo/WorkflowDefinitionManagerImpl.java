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

package com.liferay.portal.workflow.kaleo;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.WorkflowDefinition;
import com.liferay.portal.kernel.workflow.WorkflowDefinitionManager;
import com.liferay.portal.kernel.workflow.WorkflowException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.workflow.kaleo.model.KaleoDefinition;
import com.liferay.portal.workflow.kaleo.runtime.WorkflowEngine;
import com.liferay.portal.workflow.kaleo.service.KaleoDefinitionLocalServiceUtil;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="WorkflowDefinitionManagerImpl.java.html"><b><i>View Source</i></b>
 * </a>
 *
 * @author Michael C. Han
 */
public class WorkflowDefinitionManagerImpl
	implements WorkflowDefinitionManager {

	public WorkflowDefinition deployWorkflowDefinition(
			long companyId, long userId, String name, InputStream inputStream)
		throws WorkflowException {

		ServiceContext serviceContext = new ServiceContext();

		serviceContext.setCompanyId(companyId);
		serviceContext.setUserId(userId);

		return _workflowEngine.deployWorkflowDefinition(
			name, inputStream, serviceContext);
	}

	public WorkflowDefinition getWorkflowDefinition(
			long companyId, String name, int version)
		throws WorkflowException {

		try {
			ServiceContext serviceContext = new ServiceContext();

			serviceContext.setCompanyId(companyId);

			KaleoDefinition kaleoDefinition =
				KaleoDefinitionLocalServiceUtil.getKaleoDefinition(
					name, version, serviceContext);

			return new WorkflowDefinitionAdapter(kaleoDefinition);
		}
		catch (Exception e) {
			throw new WorkflowException(e);
		}
	}

	public int getWorkflowDefinitionCount(long companyId)
		throws WorkflowException {

		try {
			ServiceContext serviceContext = new ServiceContext();

			serviceContext.setCompanyId(companyId);

			return KaleoDefinitionLocalServiceUtil.getKaleoDefinitionsCount(
				serviceContext);
		}
		catch (Exception e) {
			throw new WorkflowException(e);
		}
	}

	public int getWorkflowDefinitionCount(long companyId, String name)
		throws WorkflowException {

		try {
			ServiceContext serviceContext = new ServiceContext();

			serviceContext.setCompanyId(companyId);

			return KaleoDefinitionLocalServiceUtil.getKaleoDefinitionsCount(
				name, serviceContext);
		}
		catch (Exception e) {
			throw new WorkflowException(e);
		}
	}

	public List<WorkflowDefinition> getWorkflowDefinitions(
			long companyId, int start, int end,
			OrderByComparator orderByComparator)
		throws WorkflowException {

		try {
			ServiceContext serviceContext = new ServiceContext();

			serviceContext.setCompanyId(companyId);

			List<KaleoDefinition> kaleoDefinitions =
				KaleoDefinitionLocalServiceUtil.getKaleoDefinitions(
					start, end, orderByComparator, serviceContext);

			return toWorkflowDefinitions(kaleoDefinitions);
		}
		catch (Exception e) {
			throw new WorkflowException(e);
		}
	}

	public List<WorkflowDefinition> getWorkflowDefinitions(
			long companyId, String name, int start, int end,
			OrderByComparator orderByComparator)
		throws WorkflowException {

		try {
			ServiceContext serviceContext = new ServiceContext();

			serviceContext.setCompanyId(companyId);

			List<KaleoDefinition> kaleoDefinitions =
				KaleoDefinitionLocalServiceUtil.getKaleoDefinitions(
					name, start, end, orderByComparator, serviceContext);

			return toWorkflowDefinitions(kaleoDefinitions);
		}
		catch (Exception e) {
			throw new WorkflowException(e);
		}
	}

	public void setWorkflowEngine(WorkflowEngine workflowEngine) {
		_workflowEngine = workflowEngine;
	}

	public void undeployWorkflowDefinition(
			long companyId, long userId, String name, int version)
		throws WorkflowException {

		try {
			ServiceContext serviceContext = new ServiceContext();

			serviceContext.setCompanyId(companyId);
			serviceContext.setUserId(userId);

			KaleoDefinitionLocalServiceUtil.deactivateKaleoDefinition(
				name, version, serviceContext);
		}
		catch (Exception e) {
			throw new WorkflowException(e);
		}
	}

	protected List<WorkflowDefinition> toWorkflowDefinitions(
		List<KaleoDefinition> kaleoDefinitions) {

		List<WorkflowDefinition> workflowDefinitions =
			new ArrayList<WorkflowDefinition>(kaleoDefinitions.size());

		for (KaleoDefinition kaleoDefinition : kaleoDefinitions) {
			workflowDefinitions.add(
				new WorkflowDefinitionAdapter(kaleoDefinition));
		}

		return workflowDefinitions;
	}

	private WorkflowEngine _workflowEngine;

}