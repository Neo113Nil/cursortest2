package com.fyber.inneractive.sdk.renderers;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public enum m {
    BANNER_WIDTH(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE),
    BANNER_HEIGHT(50),
    BANNER_TABLET_HEIGHT(90),
    BANNER_TABLET_WIDTH(728),
    RECTANGLE_HEIGHT(POBCommonConstants.DEFAULT_MIN_BITRATE),
    RECTANGLE_WIDTH(300);

    final int value;

    m(int i) {
        this.value = i;
    }
}
