package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SDKPropertiesManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "", "setInitialized", "", "initialized", "", "setInitializeState", "initializeState", "Lcom/unity3d/services/core/properties/SdkProperties$InitializationState;", "getCurrentInitializationState", "setInitializationTime", "setInitializationTimeSinceEpoch", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SDKPropertiesManager {
    @NotNull
    SdkProperties.InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(@NotNull SdkProperties.InitializationState initializeState);

    void setInitialized(boolean initialized);
}
