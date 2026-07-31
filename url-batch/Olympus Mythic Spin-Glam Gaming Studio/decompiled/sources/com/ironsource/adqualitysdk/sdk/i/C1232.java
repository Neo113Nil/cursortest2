package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﱠ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C1232 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f3233;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityInitError f3234;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Set f3235;

    public C1232(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        this.f3235 = set;
        this.f3234 = iSAdQualityInitError;
        this.f3233 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        for (ISAdQualityInitListener iSAdQualityInitListener : this.f3235) {
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitFailed(this.f3234, this.f3233);
            }
        }
        this.f3235.clear();
    }
}
