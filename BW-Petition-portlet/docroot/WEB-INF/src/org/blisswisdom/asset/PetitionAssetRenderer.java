package org.blisswisdom.asset;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.blisswisdom.model.Petition;
import org.blisswisdom.util.WebKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.asset.model.BaseAssetRenderer;

public class PetitionAssetRenderer extends BaseAssetRenderer {

	private Petition _petition;

	public PetitionAssetRenderer(Petition petition) {
		_petition = petition;
	}

	public long getClassPK() {
		return _petition.getPrimaryKey();
	}

	public long getGroupId() {
		return _petition.getGroupId();
	}

	public String getSummary(Locale locale) {
		String summary = _petition.getSubject();
		
		return summary;
	}

	public String getTitle(Locale arg0) {
		String title = _petition.getSubject();

		return title;
	}

	public long getUserId() {
		return _petition.getUserId();
	}

	public String getUuid() {
		return _petition.getUuid();
	}

	public String render(RenderRequest request, RenderResponse response,
			String template) throws Exception {
		
		if (template.equals(TEMPLATE_FULL_CONTENT)
				|| template.equals(TEMPLATE_ABSTRACT)) {

			request.setAttribute(WebKeys.PETITION, _petition);

			return "/html/petition/asset/" + template + ".jsp";
		} else {
			return null;
		}
	}

	@Override
	public String getUserName() {
		return _petition.getUserName();
	}

	@Override
	public String getClassName() {
		return Petition.class.getName();
	}
	
	

//	@Override
//	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,
//			LiferayPortletResponse liferayPortletResponse) throws Exception {
//
//		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
//				getControlPanelPlid(liferayPortletRequest),
//				PortletKeys.LATESTNEWS_PORTLET, PortletRequest.RENDER_PHASE);
//
//		portletURL.setParameter("mvcPath", "/html/news/latestnews_edit.jsp");
//		portletURL.setParameter("newsId", String.valueOf(_petition.getNewsId()));
//		portletURL.setParameter(NewsConstants.CMD, NewsConstants.UPDATE);
//
//		return portletURL;
//	}

//	@Override
//	public PortletURL getURLView(LiferayPortletResponse liferayPortletResponse,
//			WindowState windowState) throws Exception {
//		AssetRendererFactory assetRendererFactory = getAssetRendererFactory();
//
//		PortletURL portletURL = assetRendererFactory.getURLView(
//				liferayPortletResponse, windowState);
//
//		portletURL.setParameter("mvcPath", "/html/news/latestnews_view.jsp");
//		portletURL.setParameter("newsId", String.valueOf(_news.getNewsId()));
//		portletURL.setWindowState(windowState);
//
//		return portletURL;
//	}

	
//	@Override
//	public String getURLViewInContext(
//			LiferayPortletRequest liferayPortletRequest,
//			LiferayPortletResponse liferayPortletResponse,
//			String noSuchEntryRedirect) throws PortalException, SystemException, WindowStateException{
//			
//			ThemeDisplay themeDisplay = (ThemeDisplay) liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);
//			String viewURL = PortalUtil.getLayoutFullURL(_petition.getGroupId(),
//							PortletKeys.LATESTNEWS_PORTLET, liferayPortletRequest.isSecure())
//							.concat(Portal.FRIENDLY_URL_SEPARATOR + "narlabs_news/view/")
//							.concat(String.valueOf(_petition.getNewsId()));
//			_log.info("viewURL:" + viewURL);
//			boolean hasViewPermission = NewsPermission.hasViewPermission(themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), _petition);
//			
//			if(!hasViewPermission){
//				_log.info("themeDisplay.getScopeGroupId()" + themeDisplay.getScopeGroupId());
//				_log.info("themeDisplay.getUserId()" + themeDisplay.getUserId());
//				return null;
//			}
//			return viewURL ;
//			===============================================================
//			PortletURL portletURL = liferayPortletResponse.createRenderURL(
//					PortletKeys.LATESTNEWS_PORTLET);
//
//			portletURL.setParameter("mvcPath", "/html/news/latestnews_view.jsp");
//			portletURL.setParameter( "newsId", String.valueOf(_news.getNewsId()));
//			portletURL.setWindowState(WindowState.MAXIMIZED);
//
//			_log.info("portletURL.toString():" + portletURL.toString());
//			return portletURL.toString();
//	}
	
	
	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker) throws PortalException, SystemException {
		return false;
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker) throws PortalException, SystemException {
		return false;
	}
	
	

	private Log _log = LogFactoryUtil.getLog(PetitionAssetRenderer.class);
}
