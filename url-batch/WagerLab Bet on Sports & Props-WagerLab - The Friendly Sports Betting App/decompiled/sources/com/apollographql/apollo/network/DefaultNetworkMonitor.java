package com.apollographql.apollo.network;

import com.apollographql.apollo.network.NetworkObserver;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: NetworkMonitor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001b\u0010\u000e\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/apollographql/apollo/network/DefaultNetworkMonitor;", "Lcom/apollographql/apollo/network/NetworkMonitor;", "Lcom/apollographql/apollo/network/NetworkObserver$Listener;", "networkObserverFactory", "Lkotlin/Function0;", "Lcom/apollographql/apollo/network/NetworkObserver;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "_isOnline", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isOnline", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "networkObserver", "getNetworkObserver", "()Lcom/apollographql/apollo/network/NetworkObserver;", "networkObserver$delegate", "Lkotlin/Lazy;", "close", "", "networkChanged", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultNetworkMonitor implements NetworkMonitor, NetworkObserver.Listener {
    private final MutableStateFlow<Boolean> _isOnline;

    /* renamed from: networkObserver$delegate, reason: from kotlin metadata */
    private final Lazy networkObserver;
    private final Function0<NetworkObserver> networkObserverFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultNetworkMonitor(Function0<? extends NetworkObserver> networkObserverFactory) {
        Intrinsics.checkNotNullParameter(networkObserverFactory, "networkObserverFactory");
        this.networkObserverFactory = networkObserverFactory;
        this._isOnline = StateFlowKt.MutableStateFlow(null);
        this.networkObserver = LazyKt.lazy(new Function0() { // from class: com.apollographql.apollo.network.DefaultNetworkMonitor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NetworkObserver networkObserver_delegate$lambda$1;
                networkObserver_delegate$lambda$1 = DefaultNetworkMonitor.networkObserver_delegate$lambda$1(DefaultNetworkMonitor.this);
                return networkObserver_delegate$lambda$1;
            }
        });
    }

    @Override // com.apollographql.apollo.network.NetworkMonitor
    public StateFlow<Boolean> isOnline() {
        getNetworkObserver();
        return FlowKt.asStateFlow(this._isOnline);
    }

    private final NetworkObserver getNetworkObserver() {
        return (NetworkObserver) this.networkObserver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkObserver networkObserver_delegate$lambda$1(DefaultNetworkMonitor defaultNetworkMonitor) {
        NetworkObserver invoke = defaultNetworkMonitor.networkObserverFactory.invoke();
        invoke.setListener(defaultNetworkMonitor);
        return invoke;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getNetworkObserver().close();
    }

    @Override // com.apollographql.apollo.network.NetworkObserver.Listener
    public void networkChanged(boolean isOnline) {
        this._isOnline.setValue(Boolean.valueOf(isOnline));
    }
}
