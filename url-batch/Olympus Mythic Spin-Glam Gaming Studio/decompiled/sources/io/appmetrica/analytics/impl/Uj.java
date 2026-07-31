package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes8.dex */
public final class Uj implements InterfaceC5486lb {
    public final /* synthetic */ ModuleEvent a;

    public Uj(ModuleEvent moduleEvent) {
        this.a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportEvent(this.a);
    }
}
