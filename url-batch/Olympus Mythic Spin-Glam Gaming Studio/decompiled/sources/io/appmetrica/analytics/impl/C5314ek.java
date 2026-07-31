package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5314ek implements InterfaceC5486lb {
    public final /* synthetic */ String a;
    public final /* synthetic */ Map b;

    public C5314ek(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportEvent(this.a, this.b);
    }
}
