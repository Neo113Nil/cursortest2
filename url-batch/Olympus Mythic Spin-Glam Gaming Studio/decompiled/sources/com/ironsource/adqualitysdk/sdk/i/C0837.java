package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0837 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2048;

    public C0837(C0791 c0791) {
        this.f2048 = c0791;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0791 c0791 = this.f2048;
        Iterator it = (c0791.f1874 != null ? new ArrayList(c0791.f1874) : new ArrayList()).iterator();
        while (it.hasNext()) {
            ((C0786) it.next()).m4183();
        }
        List m4191 = C0791.m4191(this.f2048);
        if (m4191 != null) {
            ((ArrayList) m4191).clear();
        }
        this.f2048.f1874 = null;
        this.f2048.f1869 = null;
    }
}
