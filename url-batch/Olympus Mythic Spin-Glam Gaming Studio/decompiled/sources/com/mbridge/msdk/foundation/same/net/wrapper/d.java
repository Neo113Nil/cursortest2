package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONObject;

/* compiled from: CommonMBListener.java */
/* loaded from: classes3.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {
    private static final String a = "d";

    public d(String str, String str2) {
        setKey(str);
        setRKE(str2);
    }

    private void a(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar.b.d == 204) {
            a(new JSONObject());
        } else {
            b(eVar);
        }
    }

    private void b(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        JSONObject jSONObject = eVar.c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int optInt = jSONObject.optInt("status", POBCommonConstants.DEFAULT_INVALID_SKIP_AFTER_VALUE);
        if (optInt == -9999) {
            a(eVar.c);
            return;
        }
        if (optInt != 1 && optInt != 200) {
            String optString = eVar.c.optString("msg");
            if (TextUtils.isEmpty(optString)) {
                optString = "error message is null";
            }
            a(optString);
            return;
        }
        JSONObject optJSONObject = eVar.c.optJSONObject("data");
        if (optJSONObject != null) {
            try {
                String optString2 = optJSONObject.optString("r");
                if (!TextUtils.isEmpty(optString2)) {
                    String a2 = v0.a(optString2, "ebmclXzZOhtU2sRlZxGL8A");
                    if (!TextUtils.isEmpty(a2)) {
                        try {
                            optJSONObject = MintegralNetworkBridge.jsonObjectInit(a2);
                        } catch (Exception e) {
                            q0.b(a, e.getMessage(), e);
                        }
                    }
                }
            } catch (Exception e2) {
                q0.b(a, "put rk error", e2);
            }
        }
        if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.optString("e_str"))) {
            optJSONObject.put("rk", getKey());
        }
        a(optJSONObject);
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(a, "errorCode = " + aVar.a);
        a(com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(eVar);
        if (eVar.b == null) {
            b(eVar);
        } else {
            a(eVar);
        }
    }

    public d() {
    }
}
