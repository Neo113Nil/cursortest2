package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class If {
    public static C4473xf a(String creativeType, GestureDetectorOnGestureListenerC4476xi webView, boolean z, String str, byte b, String str2) {
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Sf sf = Rf.a;
        sf.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        AdSessionContext createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(sf.b, webView, str, str2);
        Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        ImpressionType impressionType = b == 1 ? ImpressionType.DEFINED_BY_JAVASCRIPT : b == 2 ? ImpressionType.UNSPECIFIED : b == 3 ? ImpressionType.LOADED : b == 4 ? ImpressionType.BEGIN_TO_RENDER : b == 5 ? ImpressionType.ONE_PIXEL : b == 6 ? ImpressionType.VIEWABLE : b == 7 ? ImpressionType.AUDIBLE : b == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        int hashCode = creativeType.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 93166550) {
                if (hashCode != 112202875) {
                    if (hashCode == 1425678798 && creativeType.equals("nonvideo")) {
                        return new C4473xf("html_display_ad", impressionType, createHtmlAdSessionContext, false);
                    }
                } else if (creativeType.equals("video")) {
                    return new C4473xf("html_video_ad", impressionType, createHtmlAdSessionContext, z);
                }
            } else if (creativeType.equals("audio")) {
                return new C4473xf("html_audio_ad", impressionType, createHtmlAdSessionContext, z);
            }
        } else if (creativeType.equals("unknown")) {
            Intrinsics.checkNotNullExpressionValue("Jf", "access$getTAG$cp(...)");
            return null;
        }
        Intrinsics.checkNotNullExpressionValue("Jf", "access$getTAG$cp(...)");
        return null;
    }
}
