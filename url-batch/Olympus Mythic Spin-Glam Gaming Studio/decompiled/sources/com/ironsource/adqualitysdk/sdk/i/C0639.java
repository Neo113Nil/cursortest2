package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ن, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0639 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0600 f1294;

    public C0639(C0600 c0600) {
        this.f1294 = c0600;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0600 c0600 = this.f1294;
        synchronized (c0600) {
            c0600.f1009 = true;
        }
        C0412 c0412 = this.f1294.f1013;
        if (c0412 != null) {
            c0412.mo3995();
        }
        Iterator it = new ArrayList(this.f1294.f1012).iterator();
        while (it.hasNext()) {
            ((InterfaceC1212) it.next()).mo3995();
        }
        this.f1294.f1012.clear();
        Iterator it2 = new ArrayList(this.f1294.f1011).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1212) it2.next()).mo3995();
        }
    }
}
