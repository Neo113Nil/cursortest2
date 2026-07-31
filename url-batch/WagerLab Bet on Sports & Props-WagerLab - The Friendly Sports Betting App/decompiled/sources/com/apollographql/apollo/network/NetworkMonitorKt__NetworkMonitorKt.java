package com.apollographql.apollo.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: NetworkMonitor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"waitForNetwork", "", "Lcom/apollographql/apollo/network/NetworkMonitor;", "(Lcom/apollographql/apollo/network/NetworkMonitor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/network/NetworkMonitorKt")
/* loaded from: classes3.dex */
final /* synthetic */ class NetworkMonitorKt__NetworkMonitorKt {
    public static final Object waitForNetwork(NetworkMonitor networkMonitor, Continuation<? super Unit> continuation) {
        Object collect = FlowKt.collect(FlowKt.takeWhile(networkMonitor.isOnline(), new NetworkMonitorKt__NetworkMonitorKt$waitForNetwork$2(null)), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
