package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٮ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0641 implements InterfaceC1075 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0600 f1296;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0783 f1297;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Context f1298;

    public C0641(C0600 c0600, Context context, C0783 c0783) {
        this.f1296 = c0600;
        this.f1298 = context;
        this.f1297 = c0783;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1075
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo4124(C1335 c1335, String str) {
        JSONObject jSONObject;
        int i = c1335 != null ? c1335.f3681.f3705 : -1;
        AbstractC0580.m4074(StringFog.decrypt("2qOWiNjCL+/moJKA\n", "iMb756ynbIA=\n"), StringFog.decrypt("JFX8yLRP0uQVU+fJoU/W7g9B58DmCcfuDAf9wrQZ0PNbBw==\n", "YSeOp8ZvtYE=\n") + i);
        if (i != 403) {
            C0600 c0600 = this.f1296;
            int i2 = c0600.f1008;
            c0600.f1008 = i2 + 1;
            synchronized (c0600) {
                jSONObject = c0600.f2998;
            }
            if (i2 < jSONObject.optInt(StringFog.decrypt("AGpYkA==\n", "bQk04g4Rdog=\n"), 3)) {
                m4122(this.f1296.m4108());
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1075
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo4123(C1335 c1335) {
        JSONObject jSONObject;
        int i;
        String str;
        JSONObject jsonObjectInit;
        try {
            C1348 c1348 = c1335.f3681;
            i = c1348.f3705;
            str = c1348.f3704;
        } catch (Exception e) {
            try {
                AbstractC0577.m4069(StringFog.decrypt("Saa7/UrLmR51pb/1\n", "G8PWkj6u2nE=\n"), StringFog.decrypt("MFP6J63tusgHUuEmuO24zBhO/C3/rqXHE0jvaLW+pcc=\n", "dSGISN/Nyqk=\n"), e, false, true, false);
            } catch (Throwable unused) {
            }
        }
        if (i >= 200 && i <= 299) {
            if (!TextUtils.isEmpty(c1335.f3682)) {
                jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(c1335.f3682);
            } else {
                jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            }
            if (jsonObjectInit.optBoolean(StringFog.decrypt("adv6\n", "Gr+WWWw+PgI=\n"))) {
                C1213.m4452().m4460();
            }
            String decrypt = StringFog.decrypt("8lEM8gmWTw3OUgj6\n", "oDRhnX3zDGI=\n");
            AbstractC0580.m4079(decrypt, decrypt, StringFog.decrypt("90Hib2QROXrRWO11IRAvf8Fd92llQilzylLoazs=\n", "pDSBDAFiShw=\n"), jsonObjectInit, true);
            JSONObject m4291 = AbstractC1006.m4291(jsonObjectInit, false);
            C0600 c0600 = this.f1296;
            long optLong = m4291.optLong(StringFog.decrypt("Xx3O9A==\n", "M366h09SRxQ=\n"), 0L);
            if (!c0600.f1004) {
                C0916 c0916 = c0600.f1020;
                c0916.getClass();
                C0916.m4240().post(new C0947(c0916, C0600.f998, "" + optLong));
                c0600.f1004 = true;
            }
            m4291.remove(StringFog.decrypt("FKMt\n", "Z9deyFXqAbQ=\n"));
            C0916 c09162 = this.f1296.f1020;
            String decrypt2 = StringFog.decrypt("VGYjUg6z2lVFZC9UDQ==\n", "JgVMPGjavXs=\n");
            String jSONObject2 = m4291.toString();
            c09162.getClass();
            C0916.m4240().post(new C0939(c09162, decrypt2, jSONObject2));
            String decrypt3 = StringFog.decrypt("G64=\n", "b90Cny7ZYro=\n");
            String str2 = AbstractC0530.f589;
            jsonObjectInit.put(decrypt3, Calendar.getInstance().getTimeInMillis());
            jsonObjectInit.put(StringFog.decrypt("0hc=\n", "p2P4X9EEejg=\n"), SystemClock.elapsedRealtime());
            C0600 c06002 = this.f1296;
            long j = c1335.f3680;
            c06002.getClass();
            if (jsonObjectInit.has(StringFog.decrypt("g0J5\n", "8DYKXeoXR7k=\n"))) {
                try {
                    jsonObjectInit.put(StringFog.decrypt("VuIm\n", "JZZVgNH0m4s=\n"), jsonObjectInit.optLong(StringFog.decrypt("EsLf\n", "YbasdMcXnjw=\n")) + (j / 2));
                } catch (JSONException unused2) {
                }
            }
            this.f1296.mo4109(jsonObjectInit);
            this.f1296.m4106();
            C0600 c06003 = this.f1296;
            synchronized (c06003) {
                jSONObject = c06003.f2998;
            }
            m4122(jSONObject.optInt(StringFog.decrypt("3R6g\n", "vn/U0lgL53o=\n"), c06003.f1023));
            return;
        }
        mo4124(c1335, str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4122(int i) {
        synchronized (this.f1296) {
            try {
                if (this.f1296.f1018 != null) {
                    AbstractC1026.m4317(new C0642(this), i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
