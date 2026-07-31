package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɤ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0429 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0420 f297;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View f298;

    public C0429(C0420 c0420, View view) {
        this.f297 = c0420;
        this.f298 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0379 c0379 = this.f297.f247.f242;
        View view = this.f298;
        C0379 c03792 = C0379.f196;
        synchronized (c0379) {
            Iterator it = c0379.f198.iterator();
            while (it.hasNext()) {
                ((q) it.next()).mo3962(view);
            }
        }
    }
}
