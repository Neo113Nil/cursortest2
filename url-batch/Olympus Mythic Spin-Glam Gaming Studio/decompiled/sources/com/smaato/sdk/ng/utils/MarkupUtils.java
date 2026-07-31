package com.smaato.sdk.ng.utils;

import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.vpaid.models.vast.Vast;
import com.smaato.sdk.ng.vpaid.xml.XmlParser;

/* loaded from: classes15.dex */
public class MarkupUtils {
    public static boolean isVastXml(String str) {
        try {
            Vast vast = (Vast) XmlParser.parse(str, Vast.class);
            if (vast == null) {
                return false;
            }
            if (vast.getAds() == null && vast.getErrors() == null && vast.getStatus() == null) {
                return vast.getVersion() != null;
            }
            return true;
        } catch (Exception e) {
            NextGen.reportException(e);
            Logger.e("MarkupUtils", e.getMessage());
            return false;
        }
    }
}
