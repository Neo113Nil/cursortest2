package com.mbridge.msdk.mbsignalcommon.windvane;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.util.MimeTypes;

/* compiled from: MimeTypeEnum.java */
/* loaded from: classes4.dex */
public enum d {
    JS(POBConstants.KEY_JS, "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", MimeTypes.IMAGE_GIF),
    HTM("htm", POBCommonConstants.CONTENT_TYPE_HTML),
    HTML("html", POBCommonConstants.CONTENT_TYPE_HTML);

    private String a;
    private String b;

    d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.a;
    }
}
