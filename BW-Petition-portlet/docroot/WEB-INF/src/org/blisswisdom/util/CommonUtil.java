package org.blisswisdom.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.blisswisdom.model.PlusSigner;
import org.blisswisdom.service.PlusSignerLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class CommonUtil {

	public static String getStringBySign(String userName, Date updateTime) {

		DateFormat dateTimeFormat = new SimpleDateFormat("(yyyy-MM-dd HH:mm)");
		return "sign by " + userName + dateTimeFormat.format(updateTime);

	}

	public static String getPlusSignerNames(long petitionId, String signerType)
			throws SystemException {

		String psUserNames = "";
		List<PlusSigner> psUsers = PlusSignerLocalServiceUtil.findByP_S(
				petitionId, signerType);
		
		for (PlusSigner plusSigner : psUsers) {
			if (!Validator.isBlank(psUserNames)) {
				psUserNames += StringPool.COMMA;
			}
			psUserNames += plusSigner.getSignerName();
		}
		return psUserNames;
	}

}
