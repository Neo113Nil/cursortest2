package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.乁, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1158 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f2916;

    public C1158(C1147 c1147) {
        this.f2916 = c1147;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        ArrayList arrayList = new ArrayList(this.f2916.f2900.values());
        this.f2916.f2900.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            sVar.f2897 = null;
            C0379.m3991().m3992(sVar);
        }
    }
}
