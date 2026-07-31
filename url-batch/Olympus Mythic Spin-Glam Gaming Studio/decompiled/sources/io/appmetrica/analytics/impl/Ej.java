package io.appmetrica.analytics.impl;

/* loaded from: classes10.dex */
public final class Ej implements InterfaceC5486lb {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;

    public Ej(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportError(this.a, this.b);
    }
}
