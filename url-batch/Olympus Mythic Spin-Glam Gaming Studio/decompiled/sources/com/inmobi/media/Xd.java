package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes13.dex */
public final class Xd implements FlowCollector {
    public final /* synthetic */ C4025ge a;

    public Xd(CoroutineScope coroutineScope, C4025ge c4025ge) {
        this.a = c4025ge;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C3943de(this.a, null), continuation);
        if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            withContext = Unit.INSTANCE;
        }
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
