package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes10.dex */
public final class Dm implements FlowCollector {
    public final /* synthetic */ Nm a;

    public Dm(CoroutineScope coroutineScope, Nm nm) {
        this.a = nm;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC4233oc abstractC4233oc = (AbstractC4233oc) obj;
        C4493y9 c4493y9 = this.a.e;
        if (c4493y9 != null) {
            c4493y9.a("VideoExperienceManager", "observeCompanionAdEvents - received companion event: " + abstractC4233oc);
        }
        Object emit = this.a.d.emit(abstractC4233oc, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
