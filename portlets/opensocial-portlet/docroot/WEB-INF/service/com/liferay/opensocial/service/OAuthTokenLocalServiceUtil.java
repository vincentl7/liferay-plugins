/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.opensocial.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the o auth token local service. This utility wraps {@link com.liferay.opensocial.service.impl.OAuthTokenLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthTokenLocalService
 * @see com.liferay.opensocial.service.base.OAuthTokenLocalServiceBaseImpl
 * @see com.liferay.opensocial.service.impl.OAuthTokenLocalServiceImpl
 * @generated
 */
public class OAuthTokenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.opensocial.service.impl.OAuthTokenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the o auth token to the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token
	* @return the o auth token that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken addOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addOAuthToken(oAuthToken);
	}

	/**
	* Creates a new o auth token with the primary key. Does not add the o auth token to the database.
	*
	* @param oAuthTokenId the primary key for the new o auth token
	* @return the new o auth token
	*/
	public static com.liferay.opensocial.model.OAuthToken createOAuthToken(
		long oAuthTokenId) {
		return getService().createOAuthToken(oAuthTokenId);
	}

	/**
	* Deletes the o auth token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthTokenId the primary key of the o auth token
	* @throws PortalException if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOAuthToken(long oAuthTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteOAuthToken(oAuthTokenId);
	}

	/**
	* Deletes the o auth token from the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteOAuthToken(oAuthToken);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the o auth token with the primary key.
	*
	* @param oAuthTokenId the primary key of the o auth token
	* @return the o auth token
	* @throws PortalException if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken getOAuthToken(
		long oAuthTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOAuthToken(oAuthTokenId);
	}

	/**
	* Returns a range of all the o auth tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of o auth tokens
	* @param end the upper bound of the range of o auth tokens (not inclusive)
	* @return the range of o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.opensocial.model.OAuthToken> getOAuthTokens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOAuthTokens(start, end);
	}

	/**
	* Returns the number of o auth tokens.
	*
	* @return the number of o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int getOAuthTokensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOAuthTokensCount();
	}

	/**
	* Updates the o auth token in the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token
	* @return the o auth token that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken updateOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOAuthToken(oAuthToken);
	}

	/**
	* Updates the o auth token in the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthToken the o auth token
	* @param merge whether to merge the o auth token with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the o auth token that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken updateOAuthToken(
		com.liferay.opensocial.model.OAuthToken oAuthToken, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOAuthToken(oAuthToken, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static com.liferay.opensocial.model.OAuthToken addOAuthToken(
		long userId, java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String accessToken,
		java.lang.String tokenName, java.lang.String tokenSecret,
		java.lang.String sessionHandle, long expiration)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addOAuthToken(userId, gadgetKey, serviceName, moduleId,
			accessToken, tokenName, tokenSecret, sessionHandle, expiration);
	}

	public static void deleteOAuthToken(long userId,
		java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteOAuthToken(userId, gadgetKey, serviceName, moduleId,
			tokenName);
	}

	public static void deleteOAuthTokens(java.lang.String gadgetKey,
		java.lang.String serviceName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteOAuthTokens(gadgetKey, serviceName);
	}

	public static com.liferay.opensocial.model.OAuthToken fetchOAuthToken(
		long userId, java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchOAuthToken(userId, gadgetKey, serviceName, moduleId,
			tokenName);
	}

	public static com.liferay.opensocial.model.OAuthToken getOAuthToken(
		long userId, java.lang.String gadgetKey, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOAuthToken(userId, gadgetKey, serviceName, moduleId,
			tokenName);
	}

	public static java.util.List<com.liferay.opensocial.model.OAuthToken> getOAuthTokens(
		java.lang.String gadgetKey, java.lang.String serviceName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOAuthTokens(gadgetKey, serviceName);
	}

	public static void clearService() {
		_service = null;
	}

	public static OAuthTokenLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OAuthTokenLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					OAuthTokenLocalService.class.getName(), portletClassLoader);

			_service = new OAuthTokenLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(OAuthTokenLocalServiceUtil.class,
				"_service");
			MethodCache.remove(OAuthTokenLocalService.class);
		}

		return _service;
	}

	public void setService(OAuthTokenLocalService service) {
		MethodCache.remove(OAuthTokenLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(OAuthTokenLocalServiceUtil.class,
			"_service");
		MethodCache.remove(OAuthTokenLocalService.class);
	}

	private static OAuthTokenLocalService _service;
}