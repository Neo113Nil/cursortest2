package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ぃ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1133 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1123 f2882;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2883;

    public C1133(C1123 c1123, Activity activity) {
        this.f2882 = c1123;
        this.f2883 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0377 c0377 = this.f2882.f2870.f2755;
        String decrypt = StringFog.decrypt("mOfEZfms54WN/A==\n", "/oinEIrzi+o=\n");
        c0377.getClass();
        AbstractC1026.m4313(new C0381(c0377, decrypt));
        this.f2882.f2870.m4388(StringFog.decrypt("vboWWZA/xySooQ==\n", "29V1LONgq0s=\n"), C1123.m4409(this.f2882, this.f2883));
    }
}
