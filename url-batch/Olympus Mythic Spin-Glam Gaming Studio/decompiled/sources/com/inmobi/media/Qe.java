package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes13.dex */
public final class Qe implements FlowCollector {
    public final /* synthetic */ Function1 a;

    public Qe(CoroutineScope coroutineScope, Function1 function1) {
        this.a = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.a.invoke(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        return Unit.INSTANCE;
    }
}
