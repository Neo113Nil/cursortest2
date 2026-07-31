package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ŧ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0392 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0379 f212;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ q f213;

    public C0392(C0379 c0379, q qVar) {
        this.f212 = c0379;
        this.f213 = qVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        Iterator it = this.f212.f199.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null) {
                AbstractC1026.m4312(new C0405(this, view));
            }
        }
    }
}
