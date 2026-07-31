package com.google.zxing.oned;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes14.dex */
public abstract class Code93Reader extends OneDReader {
    private static final char[] ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;

    static {
        int[] iArr = {276, 328, 324, Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, l.g, 292, 290, 336, 274, 266, 424, 420, TTAdConstant.TARGET_URL_NOT_CONTAINS_TTCLID_CODE, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, 302, 468, 466, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 366, 374, 430, 294, 474, 470, 306, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }
}
