package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class BaseAbsFeedBackForH5 extends g {
    private static int e = 0;
    private static int f = 1;
    private String d = "AbsFeedBackForH5";

    public void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            q0.a(this.d, e2.getMessage());
        }
    }

    public void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", e);
            jSONObject.put("message", "");
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            callbackExcep(obj, e2.getMessage());
            q0.a(this.d, e2.getMessage());
        }
    }

    public void callbackSuccessWithData(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", e);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e2) {
            callbackExcep(obj, e2.getMessage());
            q0.a(this.d, e2.getMessage());
        }
    }

    public void feedbackLayoutOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
                int optInt = jsonObjectInit.optInt("width", -1);
                int optInt2 = jsonObjectInit.optInt("height", -1);
                int optInt3 = jsonObjectInit.optInt("left", -1);
                int optInt4 = jsonObjectInit.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY, -1);
                double optDouble = jsonObjectInit.optDouble(VastAttributes.OPACITY, 1.0d);
                int optInt5 = jsonObjectInit.optInt("radius", 20);
                String optString = jsonObjectInit.optString("fontColor", "");
                String optString2 = jsonObjectInit.optString("bgColor", "");
                com.mbridge.msdk.foundation.feedback.b.b().a(jsonObjectInit.optString("key", ""), optInt, optInt2, optInt5, optInt3, optInt4, (float) optDouble, optString, optString2, (float) jsonObjectInit.optDouble("fontSize", -1.0d), jsonObjectInit.optJSONArray(VastAttributes.PADDING));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
                int optInt = jsonObjectInit.optInt("view_visible", 1);
                com.mbridge.msdk.foundation.feedback.b.b().a(jsonObjectInit.optString("key", ""), optInt == 1 ? 8 : 0, aVar.b);
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    public void feedbackPopupOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
                int optInt = jsonObjectInit.optInt("view_visible", 1);
                com.mbridge.msdk.foundation.feedback.b.b().a(jsonObjectInit.optString("key", ""), optInt, new a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    class a implements com.mbridge.msdk.foundation.feedback.a {
        final /* synthetic */ WindVaneWebView a;

        a(WindVaneWebView windVaneWebView) {
            this.a = windVaneWebView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(BaseAbsFeedBackForH5.this.d, th.getMessage(), th);
                str = "";
            }
            f.a().a((WebView) this.a, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(BaseAbsFeedBackForH5.this.d, th.getMessage(), th);
                str = "";
            }
            f.a().a((WebView) this.a, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String str2;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                str2 = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(BaseAbsFeedBackForH5.this.d, th.getMessage(), th);
                str2 = "";
            }
            f.a().a((WebView) this.a, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
        }
    }
}
