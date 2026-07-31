package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5263ck implements InterfaceC5486lb {
    public final /* synthetic */ String a;

    public C5263ck(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportEvent(this.a);
    }
}
