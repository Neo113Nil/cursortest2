package com.mobilefuse.sdk;

import android.content.Context;
import com.mobilefuse.sdk.AdController;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdControllerFactory.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/sdk/AdControllerFactory;", "", "()V", "createAdController", "Lcom/mobilefuse/sdk/AdController;", "context", "Landroid/content/Context;", "placementId", "", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "adWidth", "", "adHeight", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "adListener", "Lcom/mobilefuse/sdk/AdController$AdListener;", "adMuteStateManager", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "adType", "Lcom/mobilefuse/sdk/AdController$AdType;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes14.dex */
public final class AdControllerFactory {

    @NotNull
    public static final AdControllerFactory INSTANCE = new AdControllerFactory();

    private AdControllerFactory() {
    }

    @NotNull
    public final AdController createAdController(@NotNull Context context, @NotNull String placementId, @NotNull AdInstanceInfo adInstanceInfo, int adWidth, int adHeight, @NotNull ObservableConfig observableConfig, @NotNull AdController.AdListener adListener, @NotNull AdMuteStateManager adMuteStateManager, @NotNull AdController.AdType adType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        Intrinsics.checkNotNullParameter(observableConfig, "observableConfig");
        Intrinsics.checkNotNullParameter(adListener, "adListener");
        Intrinsics.checkNotNullParameter(adMuteStateManager, "adMuteStateManager");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new AdController(context, placementId, adType, adInstanceInfo, adWidth, adHeight, observableConfig, adListener, adMuteStateManager);
    }
}
