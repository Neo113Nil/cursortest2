package com.amazon.device.iap.internal.a.g;

/* compiled from: ResponseReceivedCommandV2.java */
/* loaded from: classes3.dex */
public final class c extends a {
    public c(com.amazon.device.iap.internal.a.c cVar, boolean z) {
        super(cVar, com.amazon.a.a.o.b.ah);
        a(com.amazon.a.a.o.b.aa, Boolean.valueOf(z));
    }

    @Override // com.amazon.a.a.n.a.h
    public void l() {
        Object a2 = j().a().a(com.amazon.a.a.o.b.ao);
        if (a2 == null || !Boolean.TRUE.equals(a2)) {
            a(com.amazon.a.a.o.b.ab, (Object) false);
        } else {
            a(com.amazon.a.a.o.b.ab, (Object) true);
        }
        super.l();
    }
}
