package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ว, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0742 implements InterfaceC1212 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0545 f1669;

    public C0742(C0545 c0545) {
        this.f1669 = c0545;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1212
    /* renamed from: ﾒ */
    public final void mo3995() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f1669.f611);
            this.f1669.f611.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
