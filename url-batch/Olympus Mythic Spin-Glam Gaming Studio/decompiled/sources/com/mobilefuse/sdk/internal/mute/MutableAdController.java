package com.mobilefuse.sdk.internal.mute;

import com.mobilefuse.sdk.AdInstanceInfo;
import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.config.ObservableConfigKey;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import com.mobilefuse.sdk.state.mute.AdMuteStateObserver;
import com.mobilefuse.sdk.state.mute.AdMutedState;
import com.mobilefuse.sdk.state.mute.AdMutedStateSource;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MutableAdController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0013J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/mobilefuse/sdk/internal/mute/MutableAdController;", "Lcom/mobilefuse/sdk/internal/mute/MutableAd;", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateObserver;", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "adInstanceInfo", "Lcom/mobilefuse/sdk/AdInstanceInfo;", "adMutedStateManager", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "(Lcom/mobilefuse/sdk/config/ObservableConfig;Lcom/mobilefuse/sdk/AdInstanceInfo;Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;)V", "muteChangedListener", "Lcom/mobilefuse/sdk/MuteChangedListener;", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "getObservableConfig", "()Lcom/mobilefuse/sdk/config/ObservableConfig;", "init", "", "isMuted", "", "onMuteStateChanged", "adMutedState", "Lcom/mobilefuse/sdk/state/mute/AdMutedState;", "removeObserver", "setMuted", "muted", "startObserver", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public final class MutableAdController implements MutableAd, AdMuteStateObserver {
    private final AdInstanceInfo adInstanceInfo;
    private final AdMuteStateManager adMutedStateManager;

    @Nullable
    private MuteChangedListener muteChangedListener;

    @NotNull
    private final ObservableConfig observableConfig;

    public MutableAdController(@NotNull ObservableConfig observableConfig, @NotNull AdInstanceInfo adInstanceInfo, @NotNull AdMuteStateManager adMutedStateManager) {
        Intrinsics.checkNotNullParameter(observableConfig, "observableConfig");
        Intrinsics.checkNotNullParameter(adInstanceInfo, "adInstanceInfo");
        Intrinsics.checkNotNullParameter(adMutedStateManager, "adMutedStateManager");
        this.observableConfig = observableConfig;
        this.adInstanceInfo = adInstanceInfo;
        this.adMutedStateManager = adMutedStateManager;
    }

    @NotNull
    public final ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.muteChangedListener;
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        this.muteChangedListener = muteChangedListener;
    }

    public final void init() {
        this.observableConfig.setValue(ObservableConfigKey.MUTE_ENABLED, Boolean.TRUE);
    }

    public final void startObserver() {
        this.adMutedStateManager.addObserver(this);
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public void setMuted(final boolean muted) {
        try {
            this.observableConfig.setValue(ObservableConfigKey.PUBLISHER_MUTED, Boolean.valueOf(muted));
            this.observableConfig.setValue(ObservableConfigKey.AWAITING_MUTED, Boolean.valueOf(muted));
            this.adMutedStateManager.update(new Function1() { // from class: com.mobilefuse.sdk.internal.mute.MutableAdController$setMuted$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final AdMutedState invoke(@NotNull AdMutedState receiver) {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    return receiver.copy(muted, AdMutedStateSource.APP_USER);
                }
            });
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    @Override // com.mobilefuse.sdk.internal.mute.MutableAd
    public boolean isMuted() {
        try {
            return this.adMutedStateManager.get_state().getMuted();
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
            return false;
        }
    }

    @Override // com.mobilefuse.sdk.state.mute.AdMuteStateObserver
    public void onMuteStateChanged(@NotNull AdMutedState adMutedState) {
        Intrinsics.checkNotNullParameter(adMutedState, "adMutedState");
        if (ObservableConfig.getBooleanValue$default(this.observableConfig, ObservableConfigKey.MUTE_ENABLED, false, 2, null)) {
            MuteChangedListener muteChangedListener = getMuteChangedListener();
            if (muteChangedListener != null) {
                muteChangedListener.onMutedChanged(adMutedState.getMuted());
            }
            this.adInstanceInfo.telemetryAgent.onAction(TelemetrySdkActionFactory.createMutedAdAction(adMutedState.getMuted(), this.adInstanceInfo, adMutedState.getSource() == AdMutedStateSource.VIDEO_UI));
        }
    }

    public final void removeObserver() {
        this.adMutedStateManager.removeObserver(this);
    }
}
