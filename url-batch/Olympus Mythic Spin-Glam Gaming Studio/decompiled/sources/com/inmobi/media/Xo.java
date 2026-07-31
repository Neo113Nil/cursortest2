package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes13.dex */
public final class Xo {
    public final Job a;
    public final MutableStateFlow b;

    public Xo(long j, CoroutineScope scope, ViewGroup observableView, InterfaceC4466x9 interfaceC4466x9) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(scope, "coroutineScope");
        Intrinsics.checkNotNullParameter(observableView, "observableView");
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.b = MutableStateFlow;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + observableView + ", isAttachedToWindow: " + observableView.isAttachedToWindow());
        }
        StateFlow stateIn = FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new Zo(observableView, null)), Dispatchers.getMain()), scope, SharingStarted.Companion.getEagerly(), Boolean.valueOf(observableView.isAttachedToWindow()));
        Q1 collector = new Q1(j, observableView, interfaceC4466x9, scope, MutableStateFlow);
        Intrinsics.checkNotNullParameter(stateIn, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(collector, "collector");
        launch$default = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new V4(stateIn, collector, null), 3, null);
        this.a = launch$default;
    }
}
