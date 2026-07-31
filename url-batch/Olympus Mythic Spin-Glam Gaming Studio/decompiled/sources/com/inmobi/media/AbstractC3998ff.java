package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3998ff {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r5 < (r9 != null ? r9.getRefreshDebounceTime() : 1000)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r5 > r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC4069i6 a(ConnectivityManager connectivityManager) {
        long nonValidatedExpiry;
        Network network = connectivityManager.getActiveNetwork();
        if (network == null) {
            return EnumC4069i6.j;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return EnumC4069i6.j;
        }
        Intrinsics.checkNotNullExpressionValue("ff", "TAG");
        networkCapabilities.toString();
        if (!networkCapabilities.hasCapability(12)) {
            return EnumC4069i6.j;
        }
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        if (((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getSkipNetworkValidationFeatureEnabled() || networkCapabilities.hasCapability(16)) {
            return null;
        }
        Network network2 = C4068i5.a;
        Intrinsics.checkNotNullParameter(network, "network");
        AdConfig.CustomNetworkValidation a = C4068i5.a();
        if (!(a != null ? a.getEnabled() : false)) {
            return EnumC4069i6.j;
        }
        long j = C4068i5.d;
        if (j != 0) {
            CoroutineScope coroutineScope = Hl.a;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            AdConfig.CustomNetworkValidation a2 = C4068i5.a();
        }
        C4068i5.d = SystemClock.elapsedRealtime();
        if (Intrinsics.areEqual(C4068i5.a, network)) {
            long j2 = C4068i5.c;
            CoroutineScope coroutineScope2 = Hl.a;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
            if (C4068i5.b) {
                AdConfig.CustomNetworkValidation a3 = C4068i5.a();
                nonValidatedExpiry = a3 != null ? a3.getValidatedExpiry() : UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            } else {
                AdConfig.CustomNetworkValidation a4 = C4068i5.a();
                nonValidatedExpiry = a4 != null ? a4.getNonValidatedExpiry() : 30000L;
            }
        }
        if (C4068i5.e.compareAndSet(false, true)) {
            BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new C4042h5(network, null), 3, null);
        }
        if (C4068i5.b) {
            return null;
        }
        return EnumC4069i6.o;
    }

    public static boolean b() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("ff", "TAG");
            e.getMessage();
        }
        return false;
    }

    public static EnumC4069i6 a() {
        EnumC4069i6 enumC4069i6;
        Context context = AbstractC4002fj.a;
        if (context != null) {
            try {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                enumC4069i6 = a((ConnectivityManager) systemService);
            } catch (Exception e) {
                Intrinsics.checkNotNullExpressionValue("ff", "TAG");
                e.getMessage();
                enumC4069i6 = EnumC4069i6.l;
            }
            if (enumC4069i6 != null) {
                return enumC4069i6;
            }
            if (b()) {
                return EnumC4069i6.i;
            }
            return null;
        }
        return EnumC4069i6.h;
    }
}
