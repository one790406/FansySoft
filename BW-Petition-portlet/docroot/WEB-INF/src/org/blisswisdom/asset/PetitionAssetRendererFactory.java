package org.blisswisdom.asset;


import org.blisswisdom.model.Petition;
import org.blisswisdom.service.PetitionLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

public class PetitionAssetRendererFactory extends BaseAssetRendererFactory {
	 
	private static final boolean _LINKABLE = true;
	private static final String _TYPE = "petition";
	
	
    @Override
    public AssetRenderer getAssetRenderer(long classPK, int type)
            throws PortalException, SystemException {
    	Petition petition = PetitionLocalServiceUtil.getPetition(classPK);
    	
        return new PetitionAssetRenderer(petition);
    }
 
    @Override
    public String getClassName() {
        return Petition.class.getName();
    }
 
    @Override
    public String getType() {
        return _TYPE;
    }
    
    @Override
    public boolean isLinkable() {
		return _LINKABLE;
	}
    
    
    private final static Log _log = LogFactoryUtil.getLog(PetitionAssetRendererFactory.class);
    
}














