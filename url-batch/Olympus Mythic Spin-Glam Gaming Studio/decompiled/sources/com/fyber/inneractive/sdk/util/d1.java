package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class d1 extends Handler {
    public final WeakReference a;

    public d1(Looper looper, com.fyber.inneractive.sdk.network.f fVar) {
        super(looper);
        this.a = new WeakReference(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20, types: [org.json.JSONObject] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        String a;
        super.handleMessage(message);
        e1 e1Var = (e1) v.a(this.a);
        if (e1Var != null) {
            com.fyber.inneractive.sdk.network.f fVar = (com.fyber.inneractive.sdk.network.f) e1Var;
            int i = message.what;
            if (i == 12312329 || i == 20150330) {
                if (fVar.f && fVar.a.size() > 0) {
                    while (true) {
                        str = null;
                        if (fVar.a.size() <= 0) {
                            break;
                        }
                        try {
                            str = (JSONObject) fVar.a.poll();
                        } catch (Throwable unused) {
                        }
                        if (str != null) {
                            fVar.b.put(str);
                        }
                    }
                    if (fVar.b.length() > 0) {
                        JSONArray jSONArray = fVar.b;
                        int i2 = com.fyber.inneractive.sdk.config.k.a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (TextUtils.isEmpty(property)) {
                            a = com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u + IAConfigManager.N.i.f;
                        } else {
                            a = com.fyber.inneractive.sdk.config.a.a(property, "Event");
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            str = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (str != null) {
                            IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.x0(new com.fyber.inneractive.sdk.network.e(a, jSONArray, currentTimeMillis), a, str));
                        }
                        fVar.b = new JSONArray();
                    }
                }
                d1 d1Var = fVar.d;
                if (d1Var != null) {
                    d1Var.removeMessages(12312329);
                    long j = fVar.e * 1000;
                    d1 d1Var2 = fVar.d;
                    if (d1Var2 != null) {
                        d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j));
                    }
                }
            }
        }
    }
}
