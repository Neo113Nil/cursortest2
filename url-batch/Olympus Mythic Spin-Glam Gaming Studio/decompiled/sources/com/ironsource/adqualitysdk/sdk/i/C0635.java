package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ر, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0635 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C1064 f1277;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f1286;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public List f1287;

    /* renamed from: ｋ, reason: contains not printable characters */
    public Class f1288;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public Class f1289;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Class f1290;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public int f1285 = -1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public int f1284 = -1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public int f1283 = -1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public int f1282 = -1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public int f1281 = Integer.MAX_VALUE;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public int f1280 = Integer.MAX_VALUE;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public int f1279 = Integer.MAX_VALUE;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public boolean f1278 = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0635.class != obj.getClass()) {
            return false;
        }
        C0635 c0635 = (C0635) obj;
        if (this.f1286 != c0635.f1286 || this.f1285 != c0635.f1285 || this.f1284 != c0635.f1284 || this.f1283 != c0635.f1283 || this.f1282 != c0635.f1282 || this.f1281 != c0635.f1281 || this.f1280 != c0635.f1280 || this.f1279 != c0635.f1279 || this.f1278 != c0635.f1278) {
            return false;
        }
        Class cls = this.f1290;
        if (cls == null ? c0635.f1290 != null : !cls.equals(c0635.f1290)) {
            return false;
        }
        Class cls2 = this.f1289;
        if (cls2 == null ? c0635.f1289 != null : !cls2.equals(c0635.f1289)) {
            return false;
        }
        Class cls3 = this.f1288;
        if (cls3 == null ? c0635.f1288 != null : !cls3.equals(c0635.f1288)) {
            return false;
        }
        List list = this.f1287;
        if (list == null ? c0635.f1287 != null : !list.equals(c0635.f1287)) {
            return false;
        }
        C1064 c1064 = this.f1277;
        C1064 c10642 = c0635.f1277;
        return c1064 != null ? c1064.equals(c10642) : c10642 == null;
    }

    public final int hashCode() {
        Class cls = this.f1290;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        Class cls2 = this.f1289;
        int hashCode2 = (hashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
        Class cls3 = this.f1288;
        int hashCode3 = (hashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
        List list = this.f1287;
        int hashCode4 = (((((((((((((((((((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f1286) * 31) + this.f1285) * 31) + this.f1284) * 31) + this.f1283) * 31) + this.f1282) * 31) + this.f1281) * 31) + this.f1280) * 31) + this.f1279) * 31) + (this.f1278 ? 1 : 0)) * 31;
        C1064 c1064 = this.f1277;
        return hashCode4 + (c1064 != null ? c1064.hashCode() : 0);
    }
}
