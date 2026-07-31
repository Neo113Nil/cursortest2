package io.appmetrica.analytics.impl;

/* loaded from: classes13.dex */
public final class Zj implements InterfaceC5486lb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public Zj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.putAppEnvironmentValue(this.a, this.b);
    }
}
