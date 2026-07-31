package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.ironsource.B5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.b;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.MintegralNetworkBridge;

/* loaded from: classes5.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        MintegralNetworkBridge.webviewLoadDataWithBaseURL(new WindVaneWebView(context), null, "<html><script>" + b.c().d() + "</script></html>", POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
    }
}
