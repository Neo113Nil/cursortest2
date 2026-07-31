package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Tj implements InterfaceC5486lb {
    public final /* synthetic */ InterfaceC5417ik a;

    public Tj(InterfaceC5417ik interfaceC5417ik) {
        this.a = interfaceC5417ik;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        C5392hk a = ((C5826yd) this.a).a();
        if (a != null) {
            interfaceC5512mb.reportEvent(a.a, a.b);
        }
    }
}
