package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes11.dex */
public final class P1 implements FlowCollector {
    public final /* synthetic */ Q1 a;

    public P1(Q1 q1) {
        this.a = q1;
    }

    public final Unit a(boolean z) {
        InterfaceC4466x9 interfaceC4466x9 = this.a.e;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("WindowLifecycleHandler", "startObservingVisibility - Window visibility changed: " + z);
        }
        this.a.c.setValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }
}
