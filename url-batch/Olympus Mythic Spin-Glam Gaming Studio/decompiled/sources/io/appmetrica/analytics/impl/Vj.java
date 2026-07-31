package io.appmetrica.analytics.impl;

/* loaded from: classes13.dex */
public final class Vj implements InterfaceC5486lb {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;

    public Vj(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.setSessionExtra(this.a, this.b);
    }
}
