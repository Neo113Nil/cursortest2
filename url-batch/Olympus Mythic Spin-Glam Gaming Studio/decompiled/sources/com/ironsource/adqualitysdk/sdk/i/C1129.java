package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.々, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1129 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1123 f2878;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2879;

    public C1129(C1123 c1123, Activity activity) {
        this.f2878 = c1123;
        this.f2879 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0377 c0377 = this.f2878.f2870.f2755;
        String decrypt = StringFog.decrypt("HfmQJLuCnjQI4pwjrbk=\n", "e5bzUcjd7FE=\n");
        c0377.getClass();
        AbstractC1026.m4313(new C0381(c0377, decrypt));
        this.f2878.f2870.m4388(StringFog.decrypt("ED8yIrXMkEgFJD4lo/c=\n", "dlBRV8aT4i0=\n"), C1123.m4409(this.f2878, this.f2879));
    }
}
