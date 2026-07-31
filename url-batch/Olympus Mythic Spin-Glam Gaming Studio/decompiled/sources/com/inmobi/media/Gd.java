package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes10.dex */
public final class Gd implements FlowCollector {
    public final /* synthetic */ Qd a;

    public Gd(CoroutineScope coroutineScope, Qd qd) {
        this.a = qd;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC4233oc abstractC4233oc = (AbstractC4233oc) obj;
        AbstractC3984f1 abstractC3984f1 = this.a.d;
        Intrinsics.checkNotNull(abstractC4233oc, "null cannot be cast to non-null type com.inmobi.media.ads.common.models.VideoEvent");
        abstractC3984f1.a((AbstractC4295qm) abstractC4233oc);
        return Unit.INSTANCE;
    }
}
