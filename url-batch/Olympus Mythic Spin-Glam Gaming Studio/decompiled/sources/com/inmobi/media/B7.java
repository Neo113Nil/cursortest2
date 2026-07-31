package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes10.dex */
public final class B7 implements FlowCollector {
    public final /* synthetic */ V7 a;

    public B7(CoroutineScope coroutineScope, V7 v7) {
        this.a = v7;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        V7 v7 = this.a;
        v7.x.a();
        v7.l.set(Jg.f);
        return Unit.INSTANCE;
    }
}
