package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4109jk extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = AbstractC4135kk.a;
        Intrinsics.checkNotNullExpressionValue("kk", "access$getTAG$p(...)");
        super.onAvailable(network);
        ((Kc) AbstractC4002fj.e.getValue()).b(new N2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = AbstractC4135kk.a;
        Intrinsics.checkNotNullExpressionValue("kk", "access$getTAG$p(...)");
        super.onLost(network);
        ((Kc) AbstractC4002fj.e.getValue()).b(new N2(10, 4, "lost"));
    }
}
