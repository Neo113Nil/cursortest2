package io.appmetrica.analytics.impl;

/* loaded from: classes10.dex */
public final class Gj implements InterfaceC5486lb {
    public final /* synthetic */ Throwable a;

    public Gj(Throwable th) {
        this.a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportUnhandledException(this.a);
    }
}
