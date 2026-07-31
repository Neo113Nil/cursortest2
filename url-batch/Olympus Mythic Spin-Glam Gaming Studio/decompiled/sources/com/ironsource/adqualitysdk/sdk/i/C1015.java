package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵙ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1015 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2519 = StringFog.decrypt("cP7KtEj8pWJUxN6/WOC2YEr+3bRJ\n", "JJen0TuIxA8=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final int f2520;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public long f2521;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public long f2522;

    /* renamed from: ｋ, reason: contains not printable characters */
    public long f2523;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public long f2524;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Boolean f2525 = null;

    public C1015(int i) {
        this.f2520 = i;
        AbstractC0590 m4087 = AbstractC0590.m4087();
        C1017 c1017 = new C1017(this);
        C0600 c0600 = (C0600) m4087;
        Handler handler = c0600.f1018;
        if (handler != null) {
            handler.post(new C0630(c0600, c1017));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[Catch: JSONException -> 0x0096, TryCatch #0 {JSONException -> 0x0096, blocks: (B:2:0x0000, B:4:0x0012, B:7:0x003c, B:8:0x0078, B:10:0x0085, B:11:0x0090, B:15:0x005a), top: B:1:0x0000 }] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4294(JSONObject jSONObject) {
        boolean z;
        long j;
        try {
            if (jSONObject.optInt(StringFog.decrypt("8uSb\n", "gY3/viy6KT8=\n"), 1) != this.f2520 && Math.abs((this.f2523 - this.f2524) - (jSONObject.optLong(StringFog.decrypt("/rNE\n", "msc3RkV5inc=\n")) - jSONObject.optLong(StringFog.decrypt("b8g=\n", "GrwrDrhIcdQ=\n")))) > 10) {
                j = jSONObject.optLong(StringFog.decrypt("Y8oT\n", "B75gQR9b5a8=\n")) + this.f2521;
                jSONObject.put(StringFog.decrypt("lFrL\n", "4CmkogLPooE=\n"), this.f2521);
                z = false;
                jSONObject.put(AbstractC1183.f3064, j);
                if (!this.f2525.booleanValue()) {
                    jSONObject.put(StringFog.decrypt("oTYA\n", "1UVzUmY5D70=\n"), false);
                }
                m4295(jSONObject, z);
                m4296(jSONObject, z);
            }
            long optLong = jSONObject.optLong(StringFog.decrypt("ThI=\n", "O2b0S3DNAdQ=\n")) + this.f2522;
            jSONObject.put(StringFog.decrypt("h8bU\n", "8rK7dZmIwMc=\n"), this.f2522);
            z = true;
            j = optLong;
            jSONObject.put(AbstractC1183.f3064, j);
            if (!this.f2525.booleanValue()) {
            }
            m4295(jSONObject, z);
            m4296(jSONObject, z);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4297(JSONObject jSONObject) {
        if (!jSONObject.has(StringFog.decrypt("cBcR\n", "BWN+ZKzSm4w=\n")) && !jSONObject.has(StringFog.decrypt("p6z3\n", "09+YPTKEEp0=\n")) && this.f2525 != null) {
            try {
                m4294(jSONObject);
                return true;
            } catch (Exception e) {
                AbstractC0577.m4068(f2519, StringFog.decrypt("1ESYVr4D1UL/VYJLo03PQfhYjRmpVcNV5Q==\n", "kTbqOcwjpjs=\n"), (Throwable) e, false);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[Catch: JSONException -> 0x0052, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0052, blocks: (B:2:0x0000, B:6:0x0012, B:8:0x0022, B:10:0x0045, B:16:0x002a, B:18:0x003a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4296(JSONObject jSONObject, boolean z) {
        Long valueOf;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("uCnD2iawKc28\n", "1EiwrnLfXK4=\n"));
            if (optJSONObject == null) {
                return;
            }
            if (z) {
                long optLong = optJSONObject.optLong(StringFog.decrypt("TQ==\n", "OCPJmb2OA+o=\n"));
                if (optLong > 0) {
                    valueOf = Long.valueOf(optLong + this.f2522);
                    if (valueOf == null) {
                        optJSONObject.put(StringFog.decrypt("vA==\n", "yGXVVY93F9A=\n"), valueOf);
                        return;
                    }
                    return;
                }
                valueOf = null;
                if (valueOf == null) {
                }
            } else {
                long optLong2 = optJSONObject.optLong(StringFog.decrypt("TA==\n", "OJifQhzcQuo=\n"));
                if (optLong2 > 0) {
                    valueOf = Long.valueOf(optLong2 + this.f2521);
                    if (valueOf == null) {
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4295(JSONObject jSONObject, boolean z) {
        long optLong;
        long j;
        if (jSONObject.has(StringFog.decrypt("UWRG\n", "IhA1xq3oQ1g=\n"))) {
            if (z) {
                optLong = jSONObject.optLong(StringFog.decrypt("MMii\n", "Q73WcRw0fwU=\n"));
                j = this.f2522;
            } else {
                optLong = jSONObject.optLong(StringFog.decrypt("0SOH\n", "olf0B0SwJyw=\n"));
                j = this.f2521;
            }
            try {
                jSONObject.put(StringFog.decrypt("7eTB\n", "npCyM9UkWd8=\n"), optLong + j);
            } catch (JSONException unused) {
            }
        }
    }
}
