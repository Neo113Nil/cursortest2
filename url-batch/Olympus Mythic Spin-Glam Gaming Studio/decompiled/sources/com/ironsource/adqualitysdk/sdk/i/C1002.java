package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵌ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1002 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f2430;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final EnumC1009 f2431;

    public C1002(EnumC1009 enumC1009, String str) {
        this.f2431 = enumC1009;
        this.f2430 = str;
    }

    public final String toString() {
        return this.f2431 + StringFog.decrypt("DA==\n", "Nk+Hpg1y810=\n") + this.f2430;
    }
}
