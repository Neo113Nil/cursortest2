package com.apollographql.apollo.network;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkMonitor.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"NetworkMonitor", "Lcom/apollographql/apollo/network/NetworkMonitor;", "context", "Landroid/content/Context;", "apollo-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/network/NetworkMonitorKt")
/* loaded from: classes3.dex */
final /* synthetic */ class NetworkMonitorKt__NetworkMonitor_androidKt {
    public static final NetworkMonitor NetworkMonitor(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DefaultNetworkMonitor(new Function0() { // from class: com.apollographql.apollo.network.NetworkMonitorKt__NetworkMonitor_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NetworkObserver networkObserver;
                networkObserver = NetworkObserver_androidKt.networkObserver(context);
                return networkObserver;
            }
        });
    }
}
