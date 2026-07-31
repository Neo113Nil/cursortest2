package com.unity3d.services;

import android.content.Context;
import com.ironsource.C4901tg;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnityServices.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J8\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0010H\u0007R\u001c\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/unity3d/services/UnityServices;", "", "<init>", "()V", "initialize", "", "context", "Landroid/content/Context;", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "testMode", "", "initializationConfiguration", "Lcom/unity3d/ads/InitializationConfiguration;", "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "Lcom/unity3d/ads/InitializationListener;", "isSupported", "isSupported$annotations", "()Z", "isInitialized", "isInitialized$annotations", "version", "getVersion$annotations", C4901tg.b, "()Ljava/lang/String;", "debugMode", "getDebugMode$annotations", "getDebugMode", "setDebugMode", "(Z)V", "UnityServicesError", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UnityServices {

    @NotNull
    public static final UnityServices INSTANCE = new UnityServices();
    private static final boolean isSupported = true;

    @Deprecated
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void isSupported$annotations() {
    }

    private UnityServices() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode, @Nullable InitializationConfiguration initializationConfiguration, @Nullable IUnityAdsInitializationListener initializationListener) {
        synchronized (UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(initializationListener);
            SdkProperties.setTestMode(testMode);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), gameId, null, initializationConfiguration, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void initialize(@Nullable Context context, @Nullable String gameId, boolean testMode, @Nullable InitializationConfiguration initializationConfiguration, @Nullable InitializationListener initializationListener) {
        synchronized (UnityServices.class) {
            DeviceLog.entered();
            SdkProperties.addInitializationListener(initializationListener);
            SdkProperties.setTestMode(testMode);
            SdkProperties.setDebugMode(SdkProperties.getDebugMode());
            CachedLifecycle.register();
            UnityAdsSDK.initialize$default(new UnityAdsSDK(null, 1, 0 == true ? 1 : 0), gameId, null, initializationConfiguration, 2, null);
        }
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final boolean isInitialized() {
        return SdkProperties.isInitialized();
    }

    @NotNull
    public static final String getVersion() {
        String versionName = SdkProperties.getVersionName();
        Intrinsics.checkNotNullExpressionValue(versionName, "getVersionName(...)");
        return versionName;
    }

    public static final boolean getDebugMode() {
        return SdkProperties.getDebugMode();
    }

    public static final void setDebugMode(boolean z) {
        SdkProperties.setDebugMode(z);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityServices.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/UnityServices$UnityServicesError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_ARGUMENT", "INIT_SANITY_CHECK_FAIL", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityServicesError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnityServicesError[] $VALUES;
        public static final UnityServicesError INVALID_ARGUMENT = new UnityServicesError("INVALID_ARGUMENT", 0);
        public static final UnityServicesError INIT_SANITY_CHECK_FAIL = new UnityServicesError("INIT_SANITY_CHECK_FAIL", 1);

        private static final /* synthetic */ UnityServicesError[] $values() {
            return new UnityServicesError[]{INVALID_ARGUMENT, INIT_SANITY_CHECK_FAIL};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        private UnityServicesError(String str, int i) {
        }

        static {
            UnityServicesError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static UnityServicesError valueOf(String str) {
            return (UnityServicesError) Enum.valueOf(UnityServicesError.class, str);
        }

        public static UnityServicesError[] values() {
            return (UnityServicesError[]) $VALUES.clone();
        }
    }
}
