package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GetNetworkState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/GetNetworkState;", "", "networkConnectivityMonitor", "Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;", "<init>", "(Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetNetworkState {
    public static final int $stable = 8;
    private final NetworkConnectivityMonitor networkConnectivityMonitor;

    public GetNetworkState(NetworkConnectivityMonitor networkConnectivityMonitor) {
        Intrinsics.checkNotNullParameter(networkConnectivityMonitor, "networkConnectivityMonitor");
        this.networkConnectivityMonitor = networkConnectivityMonitor;
    }

    public final Flow<NetworkState> invoke() {
        return FlowKt.callbackFlow(new GetNetworkState$invoke$1(this, null));
    }
}
