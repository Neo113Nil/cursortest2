package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴊ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0954 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public boolean f2273;

    /* renamed from: ｋ, reason: contains not printable characters */
    public boolean f2274;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f2275;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f2276;

    public C0954(Object obj) {
        this.f2276 = obj;
    }

    public final String toString() {
        if (this.f2276 instanceof String) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("SA==\n", "auW9VZcw8bc=\n"));
            sb.append(this.f2276);
            return AbstractC1293.m4543("3g==\n", "/I0JS5AGeYg=\n", sb);
        }
        return this.f2276 + "";
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Number m4249() {
        Object obj = this.f2276;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4250() {
        Object obj = this.f2276;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d;
        }
        if (obj instanceof String) {
            return !TextUtils.isEmpty((String) obj);
        }
        return true;
    }
}
