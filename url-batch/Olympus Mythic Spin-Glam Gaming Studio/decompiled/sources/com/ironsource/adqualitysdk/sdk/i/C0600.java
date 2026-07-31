package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.օ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0600 extends AbstractC0590 {

    /* renamed from: Ḹ, reason: contains not printable characters */
    public static final String f998;

    /* renamed from: Ῡ, reason: contains not printable characters */
    public C0783 f1003;

    /* renamed from: Ὺ, reason: contains not printable characters */
    public boolean f1004;

    /* renamed from: Ύ, reason: contains not printable characters */
    public ArrayList f1005;

    /* renamed from: K, reason: contains not printable characters */
    public C0495 f1006;

    /* renamed from: Ⅽ, reason: contains not printable characters */
    public boolean f1007;

    /* renamed from: Ↄ, reason: contains not printable characters */
    public int f1008;

    /* renamed from: く, reason: contains not printable characters */
    public boolean f1009;

    /* renamed from: っ, reason: contains not printable characters */
    public C0433 f1010;

    /* renamed from: へ, reason: contains not printable characters */
    public ArrayList f1011;

    /* renamed from: ゥ, reason: contains not printable characters */
    public ArrayList f1012;

    /* renamed from: ト, reason: contains not printable characters */
    public C0412 f1013;

    /* renamed from: リ, reason: contains not printable characters */
    public C0586 f1014;

    /* renamed from: ヮ, reason: contains not printable characters */
    public C0762 f1015;

    /* renamed from: ヶ, reason: contains not printable characters */
    public C0972 f1016;

    /* renamed from: 丫, reason: contains not printable characters */
    public C4555f f1017;

    /* renamed from: 乁, reason: contains not printable characters */
    public Handler f1018;

    /* renamed from: 爫, reason: contains not printable characters */
    public C1007 f1019;

    /* renamed from: ﬤ, reason: contains not printable characters */
    public C0916 f1020;

    /* renamed from: טּ, reason: contains not printable characters */
    public final int f1021;

    /* renamed from: סּ, reason: contains not printable characters */
    public final int f1022;

    /* renamed from: ףּ, reason: contains not printable characters */
    public final int f1023;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final int f1024;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final String f1025;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f1026;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f1027;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final String f1028;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final String f1029;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String f1030;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String f1031;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f1032;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f1033;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f1034;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f1035 = StringFog.decrypt("bl3I\n", "CzO+2jCx3CU=\n");

    /* renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1002 = StringFog.decrypt("5nIAcQRpnFjacQR5\n", "tBdtHnAM3zc=\n");

    /* renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1001 = StringFog.decrypt("KWivWFRx10g4aqNeVw==\n", "WwvANjIYsGY=\n");

    /* renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1000 = StringFog.decrypt("Me895C1PxacuszfxZknG6jf4Meg8SMerK/s14A==\n", "RZ1ch0gtpMQ=\n");

    /* renamed from: Ḽ, reason: contains not printable characters */
    public static final String f999 = StringFog.decrypt("v0Jn93DQPECpTnr/aJwlQa9CZvw=\n", "zC0ImhyxETM=\n");

    static {
        StringFog.decrypt("pFbH\n", "1zKrWM685nM=\n");
        f998 = StringFog.decrypt("T+Q1BSFhVX4N5zoRe0NeYU3uOBZgcmR/R+ovB1tpXGpQ/zoPfw==\n", "I4tbYg8AMQ8=\n");
    }

    public C0600() {
        StringFog.decrypt("QhGP\n", "J3zrXgEhMEk=\n");
        this.f1034 = StringFog.decrypt("WBdFBg==\n", "O3ApcrReNro=\n");
        this.f1033 = StringFog.decrypt("1aKC7A==\n", "ttHumNRazw0=\n");
        this.f1032 = StringFog.decrypt("mp0qLw==\n", "9PRPXwcoqZ4=\n");
        this.f1031 = StringFog.decrypt("yMY+Yw==\n", "qbJKAZVRj3A=\n");
        this.f1030 = StringFog.decrypt("8yowkQ==\n", "kFlc9XKggaw=\n");
        this.f1029 = StringFog.decrypt("lAQF\n", "52hh5be0k0s=\n");
        this.f1028 = StringFog.decrypt("TGMJHA==\n", "PwJ4bwgh/ug=\n");
        this.f1027 = StringFog.decrypt("5VsG\n", "hixlhpI+Ncc=\n");
        this.f1026 = StringFog.decrypt("l5R4\n", "4ucM0ltdVZo=\n");
        this.f1025 = StringFog.decrypt("LSUFIQ==\n", "QFFhVcRs/ZU=\n");
        TimeUnit timeUnit = TimeUnit.HOURS;
        timeUnit.toMillis(24L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        this.f1024 = (int) timeUnit2.toMillis(5L);
        this.f1023 = (int) timeUnit.toMillis(12L);
        this.f1022 = (int) timeUnit2.toMillis(3L);
        this.f1021 = (int) timeUnit2.toMillis(10L);
        this.f1008 = 0;
        this.f1005 = null;
        this.f1004 = false;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    public final synchronized void m4105() {
        this.f1009 = false;
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    public final synchronized void m4106() {
        Handler handler = this.f1018;
        if (handler != null) {
            handler.post(new C0639(this));
        }
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final synchronized C1007 m4107() {
        return this.f1019;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final int m4108() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optInt(StringFog.decrypt("g7MR\n", "4MFld5YgAV0=\n"), this.f1024);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﭸ */
    public final boolean mo4088() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optBoolean(this.f1030);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﮉ */
    public final synchronized void mo4089() {
        this.f1018.removeCallbacksAndMessages(null);
        this.f1018 = null;
        AbstractC1026.m4312(new C0668(this));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﮌ */
    public final boolean mo4090() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optBoolean(this.f1028);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﮐ */
    public final boolean mo4091() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optBoolean(StringFog.decrypt("dQbsbg==\n", "B2CPD9WDE04=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﱟ */
    public final boolean mo4092() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optBoolean(StringFog.decrypt("51xd\n", "lTg4Xi09Lug=\n"), true);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﱡ */
    public final boolean mo4093() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optBoolean(StringFog.decrypt("/YGV\n", "mOfmFZpXCP8=\n"), false);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﺙ */
    public final synchronized boolean mo4094() {
        return this.f1009;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﻏ */
    public final String mo4095() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        if (jSONObject == null) {
            return null;
        }
        String optString = m4447().optString(StringFog.decrypt("dVKsVw==\n", "ESbII7GhQbY=\n"));
        return TextUtils.isEmpty(optString) ? this.f2997.f2054.optString(C0839.f2052, C0839.f2050) : optString;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﻛ */
    public final HashMap mo4096() {
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        try {
            synchronized (this) {
                jSONObject = this.f2998;
            }
            String optString = jSONObject.optString(StringFog.decrypt("bE84\n", "CCxLlpaVSvg=\n"));
            if (TextUtils.isEmpty(optString)) {
                return hashMap;
            }
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(optString);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys = jsonObjectInit.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap2.put(next, new C1079(jsonObjectInit.optJSONObject(next)));
            }
            return hashMap2;
        } catch (JSONException e) {
            AbstractC0577.m4068(f1002, StringFog.decrypt("hO7wbonarYLh++d1uJWqgqT/9m6JiZCDhfXxYJmWoQ==\n", "wZyCAfv6xOw=\n"), (Throwable) e, false);
            return hashMap;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ｋ */
    public final int mo4097() {
        int optInt;
        synchronized (this) {
            optInt = m4447().optInt(this.f1029, 100);
        }
        return optInt;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﾇ */
    public final int mo4098() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2998;
        }
        return jSONObject.optInt(this.f1033, this.f1021);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﾒ */
    public final void mo4100(Context context, C1007 c1007, C0495 c0495, C0433 c0433, boolean z) {
        JSONObject jsonObjectInit;
        this.f1020 = new C0916(context, f1000, f999);
        this.f1019 = c1007;
        this.f1009 = false;
        this.f1007 = z;
        this.f1006 = c0495;
        this.f1018 = new Handler(Looper.getMainLooper());
        C0839 c0839 = new C0839();
        this.f1017 = new C4555f(c0839);
        this.f1016 = new C0972(c0839);
        this.f1015 = new C0762(c0839);
        this.f1014 = new C0586();
        String m4242 = this.f1020.m4242(f1001);
        if (m4242 != null) {
            try {
                jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(m4242);
            } catch (JSONException unused) {
            }
            mo4109(jsonObjectInit);
            this.f2997 = c0839;
            this.f1010 = c0433;
            this.f1012 = new ArrayList();
            this.f1011 = new ArrayList();
        }
        jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        mo4109(jsonObjectInit);
        this.f2997 = c0839;
        this.f1010 = c0433;
        this.f1012 = new ArrayList();
        this.f1011 = new ArrayList();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0590
    /* renamed from: ﾒ */
    public final void mo4099(Context context, C0783 c0783, boolean z) {
        JSONObject jSONObject;
        this.f1003 = c0783;
        if (z) {
            C0651 c0651 = new C0651(this);
            C0600 c0600 = (C0600) AbstractC0590.m4087();
            synchronized (c0600) {
                jSONObject = c0600.f2998;
            }
            AbstractC1026.m4315(c0651, jSONObject.optInt(c0600.f1034, c0600.f1022));
        }
        m4105();
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            String m4242 = this.f1020.m4242(f998);
            jsonObjectInit = new C0572(context, c0783, !TextUtils.isEmpty(m4242) ? Long.parseLong(m4242) : 0L).mo4064(IronSourceNetworkBridge.jsonObjectInit(), m4107().f2439.m4248(), true, false);
        } catch (JSONException e) {
            String str = f1002;
            AbstractC0580.m4080(str, str, StringFog.decrypt("ktodKOqygDiyyRsu9vXDKLbbCmf95IYkow==\n", "16hvR5iS40o=\n"), e, null, false);
        }
        C1007 m4107 = m4107();
        C0495 c0495 = this.f1006;
        String decrypt = StringFog.decrypt("wRqaWg==\n", "qHTzLj4H7dY=\n");
        String str2 = c0495.f440;
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(StringFog.decrypt("wQ==\n", "7nrFTMm1qjA=\n"));
        if (decrypt == null) {
            decrypt = "";
        }
        sb.append(decrypt);
        String sb2 = sb.toString();
        C0641 c0641 = new C0641(this, context, c0783);
        m4107.getClass();
        if (!TextUtils.isEmpty(sb2)) {
            C1098 c1098 = new C1098(sb2, jsonObjectInit);
            if (m4107.f2438) {
                AbstractC0580.m4072(C1007.f2437, StringFog.decrypt("lX2KOLSi8sGyYI44v+zjjuZ7iSu0p/Kzo2OSOKi4t5aud4l9lanjlqlgjBC6ovaGo2DHKrq/t5Ku\nZ5M5tLv5\n", "xhLnXdvMl+E=\n"));
                return;
            }
            C1029 c1029 = new C1029(m4107, c0641, c1098);
            String str3 = AbstractC0530.f589;
            try {
                Executors.newSingleThreadExecutor().execute(c1029);
                return;
            } catch (Throwable th) {
                AbstractC0577.m4068(AbstractC0530.f589, StringFog.decrypt("CIuQwnq/D1oompfZYfENAiyKm8Nrvx5DPpI=\n", "TfnirQifaiI=\n"), th, false);
                return;
            }
        }
        String str4 = C1007.f2437;
        String decrypt2 = StringFog.decrypt("ZVplfwkCsPxfFHRyFhOw60VHcHIIR+LtQUFhbhFH9eFEXGFvRTLCxBBbdj0XAuP4X1p3eC0G/uxc\nUXY9EgLi7RBaa2lFF+LnRl1geAE=\n", "MDQEHWVnkIg=\n");
        if (AbstractC0580.m4075()) {
            Log.v(AbstractC0580.m4077(str4), decrypt2);
        } else if (AbstractC0580.m4076().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            Log.v(AbstractC0580.m4077(str4), decrypt2);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1173
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void mo4109(JSONObject jSONObject) {
        try {
            if (jSONObject.has(StringFog.decrypt("0nQ2bbzr\n", "pgZXBMiY+3c=\n"))) {
                AbstractC1006.m4293(jSONObject, jSONObject.optJSONObject(StringFog.decrypt("ilgL/t62\n", "/ipql6rFFBM=\n")), false);
            }
            super.mo4109(jSONObject);
            this.f1017.mo4109(jSONObject);
            this.f1016.mo4109(jSONObject);
            this.f1015.mo4109(jSONObject);
            this.f1014.mo4109(jSONObject);
        } catch (Throwable th) {
            throw th;
        }
    }
}
