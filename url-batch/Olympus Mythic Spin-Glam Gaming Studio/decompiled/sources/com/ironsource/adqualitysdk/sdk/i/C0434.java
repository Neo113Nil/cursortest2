package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɬ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0434 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0420 f302;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View f303;

    public C0434(C0420 c0420, View view) {
        this.f302 = c0420;
        this.f303 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0379 c0379 = this.f302.f247.f242;
        View view = this.f303;
        C0379 c03792 = C0379.f196;
        synchronized (c0379) {
            Iterator it = c0379.f198.iterator();
            while (it.hasNext()) {
                ((q) it.next()).mo3963(view);
            }
        }
    }
}
