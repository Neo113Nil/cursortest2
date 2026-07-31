package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5289dk implements InterfaceC5486lb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public C5289dk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportEvent(this.a, this.b);
    }
}
