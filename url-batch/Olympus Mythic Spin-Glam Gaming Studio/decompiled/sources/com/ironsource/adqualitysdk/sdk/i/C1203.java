package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import java.util.Collections;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭡ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1203 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1199 f3130;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3131;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f3132;

    public C1203(C1199 c1199, String str, Activity activity) {
        this.f3130 = c1199;
        this.f3132 = str;
        this.f3131 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0880.m4228(this.f3130.f3125, this.f3132, false, false, Collections.singletonList(this.f3131));
    }
}
