package com.apollographql.apollo.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkObserver.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"isPermissionGranted", "", "Landroid/content/Context;", "permission", "", "TAG", "networkObserver", "Lcom/apollographql/apollo/network/NetworkObserver;", "context", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkObserver_androidKt {
    private static final String TAG = "Apollo";

    public static final boolean isPermissionGranted(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static final NetworkObserver networkObserver(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            Log.w(TAG, "Cannot get ConnectivityManager");
            return NetworkObserverKt.getNoOpNetworkObserver();
        }
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Log.w(TAG, "No ACCESS_NETWORK_STATE");
            return NetworkObserverKt.getNoOpNetworkObserver();
        }
        return new AndroidNetworkObserver((ConnectivityManager) systemService);
    }
}
