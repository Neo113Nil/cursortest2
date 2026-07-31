package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.c;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {
    public static final /* synthetic */ int g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            c.n().c(jsonObjectInit.optInt("webgl"));
            c.n().a(jsonObjectInit);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
