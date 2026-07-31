package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴷ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0981 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int f2348;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f2349;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f2350;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f2351;

    public C0981(String str, String str2, String str3, int i) {
        this.f2351 = str;
        this.f2350 = str2;
        this.f2349 = str3;
        this.f2348 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2351);
        sb.append(StringFog.decrypt("IQ==\n", "D+bXMbgKbi8=\n"));
        sb.append(this.f2350);
        sb.append(StringFog.decrypt("zg==\n", "5jUMXch4yNE=\n"));
        sb.append(this.f2349);
        sb.append(StringFog.decrypt("/A==\n", "xgHT11r9EW0=\n"));
        sb.append(this.f2348);
        return AbstractC1293.m4543("Dw==\n", "JiUBw/hTEhg=\n", sb);
    }
}
