package io.appmetrica.analytics.impl;

/* loaded from: classes10.dex */
public final class Fj implements InterfaceC5486lb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    public Fj(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportError(this.a, this.b, this.c);
    }
}
