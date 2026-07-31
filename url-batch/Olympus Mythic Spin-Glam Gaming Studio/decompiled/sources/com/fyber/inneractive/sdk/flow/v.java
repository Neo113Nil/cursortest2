package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class v {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    public final void a(com.fyber.inneractive.sdk.network.u uVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        w wVar = this.a;
        InneractiveAdRequest inneractiveAdRequest = wVar.a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.c;
        JSONArray b = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.c = uVar;
        wVar2.a = inneractiveAdRequest;
        wVar2.d = b;
        JSONObject jSONObject = new JSONObject();
        String a = mVar.a();
        try {
            jSONObject.put("ignitem", a);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "ignitem", a);
        }
        wVar2.f.put(jSONObject);
        wVar2.a((String) null);
    }

    public final void a(com.fyber.inneractive.sdk.network.t tVar, String str, String str2, com.fyber.inneractive.sdk.ignite.m mVar) {
        w wVar = this.a;
        InneractiveAdRequest inneractiveAdRequest = wVar.a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.c;
        JSONArray b = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.b = tVar;
        wVar2.a = inneractiveAdRequest;
        wVar2.d = b;
        JSONObject jSONObject = new JSONObject();
        if (mVar != null) {
            String a = mVar.a();
            try {
                jSONObject.put("ignitem", a);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "ignitem", a);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("error_code", str2);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "error_code", str2);
            }
        }
        wVar2.f.put(jSONObject);
        wVar2.a((String) null);
    }
}
