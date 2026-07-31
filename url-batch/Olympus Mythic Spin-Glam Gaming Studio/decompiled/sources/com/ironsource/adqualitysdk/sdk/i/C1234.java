package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﱢ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C1234 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f3238;

    public C1234(C1213 c1213) {
        this.f3238 = c1213;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        Iterator it = this.f3238.f3186.iterator();
        while (it.hasNext()) {
            ISAdQualityInitListener iSAdQualityInitListener = (ISAdQualityInitListener) it.next();
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitSuccess();
            }
        }
        this.f3238.f3186.clear();
    }
}
