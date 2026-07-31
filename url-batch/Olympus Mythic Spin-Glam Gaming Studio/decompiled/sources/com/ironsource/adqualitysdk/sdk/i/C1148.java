package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ヶ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1148 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f2902;

    public C1148(C1147 c1147) {
        this.f2902 = c1147;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        ArrayList arrayList = new ArrayList(this.f2902.f2899.values());
        this.f2902.f2899.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C1244) it.next()).m4497();
        }
    }
}
