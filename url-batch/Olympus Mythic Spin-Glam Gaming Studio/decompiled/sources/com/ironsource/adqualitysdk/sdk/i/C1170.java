package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﬤ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1170 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1147 f2972;

    public C1170(C1147 c1147) {
        this.f2972 = c1147;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        ArrayList arrayList = new ArrayList(this.f2972.f2901.values());
        this.f2972.f2901.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1187 c1187 = (C1187) it.next();
            c1187.f2897 = null;
            c1187.f3082 = null;
            AbstractC0698 m4143 = AbstractC0698.m4143();
            synchronized (m4143) {
                m4143.f1553.remove(c1187);
            }
        }
    }
}
