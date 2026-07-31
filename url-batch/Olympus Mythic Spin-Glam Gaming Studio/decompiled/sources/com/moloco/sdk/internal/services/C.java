package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.services.A;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class C implements B {
    public static final int c = 8;

    @NotNull
    public final Context a;

    @NotNull
    public final y b;

    public C(@NotNull Context context, @NotNull y deviceInfoService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        this.a = context;
        this.b = deviceInfoService;
    }

    @Override // com.moloco.sdk.internal.services.B
    public boolean a() {
        Object systemService = this.a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return a((ConnectivityManager) systemService);
    }

    @Override // com.moloco.sdk.internal.services.B
    @Nullable
    public Integer b() {
        Object systemService = this.a.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String substring = networkOperator.substring(3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return Integer.valueOf(Integer.parseInt(substring));
    }

    @Override // com.moloco.sdk.internal.services.B
    @NotNull
    public A c() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetwork() != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            return networkCapabilities.hasTransport(1) ? A.c.b : networkCapabilities.hasTransport(0) ? new A.a(this.b.invoke().u()) : A.b.b;
        }
        return A.b.b;
    }

    @Override // com.moloco.sdk.internal.services.B
    @Nullable
    public Integer d() {
        Object systemService = this.a.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String substring = networkOperator.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return Integer.valueOf(Integer.parseInt(substring));
    }

    @Override // com.moloco.sdk.internal.services.B
    @Deprecated
    @NotNull
    public A invoke() {
        return c();
    }

    @RequiresApi
    public final boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus() == 3;
    }
}
