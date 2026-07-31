package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ỵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1071 implements Comparable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0515 f2723;

    public C1071(C0515 c0515) {
        this.f2723 = c0515;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        JSONObject jSONObject;
        C1071 c1071 = (C1071) obj;
        synchronized (this) {
            jSONObject = this.f2723.f479;
        }
        long optLong = jSONObject.optLong(StringFog.decrypt("h5M=\n", "8+AZGoLj/JU=\n"));
        long m4362 = c1071.m4362();
        if (optLong >= m4362) {
            if (optLong == m4362) {
                long m4360 = m4360();
                long m43602 = c1071.m4360();
                if (m4360 >= m43602) {
                    if (m4360 == m43602) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1071.class != obj.getClass()) {
            return false;
        }
        return this.f2723.f478.equals(((C1071) obj).f2723.f478);
    }

    public final int hashCode() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2723.f479;
        }
        if (jSONObject != null) {
            return m4361().hashCode();
        }
        return 0;
    }

    public final String toString() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2723.f479;
        }
        return jSONObject.toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m4359() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2723.f479;
        }
        return jSONObject.optString(StringFog.decrypt("g22C\n", "9gTmsty4lEQ=\n"), null);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long m4360() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2723.f479;
        }
        return jSONObject.optInt(StringFog.decrypt("9nY=\n", "kxhbtYkm0n4=\n"));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized JSONObject m4361() {
        return this.f2723.f479;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4363(int i) {
        JSONObject jSONObject = this.f2723.f479;
        if (jSONObject != null) {
            AbstractC1006.m4292(jSONObject, i, Arrays.asList(AbstractC1183.f3033));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final long m4362() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2723.f479;
        }
        return jSONObject.optLong(StringFog.decrypt("h5M=\n", "8+AZGoLj/JU=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4364(String str) {
        JSONObject jSONObject;
        try {
            synchronized (this) {
                jSONObject = this.f2723.f479;
            }
            jSONObject.put(StringFog.decrypt("Yo6t\n", "F+fJEb5zLnk=\n"), str);
        } catch (JSONException unused) {
        }
    }
}
