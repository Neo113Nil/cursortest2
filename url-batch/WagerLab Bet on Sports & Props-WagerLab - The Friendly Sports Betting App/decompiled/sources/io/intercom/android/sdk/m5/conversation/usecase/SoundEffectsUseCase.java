package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SoundEffectsUseCase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "soundPlayer", "Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "<init>", "(Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;)V", "getAppConfig", "()Lio/intercom/android/sdk/identity/AppConfig;", "getSoundPlayer", "()Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "invoke", "", "action", "Lio/intercom/android/sdk/m5/conversation/usecase/Action;", "invoke$intercom_sdk_base_release", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SoundEffectsUseCase {
    public static final int $stable = 8;
    private final AppConfig appConfig;
    private final SoundPlayer soundPlayer;

    /* compiled from: SoundEffectsUseCase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.MESSAGE_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.ADMIN_MESSAGE_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.OPERATOR_MESSAGE_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.MESSAGE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SoundEffectsUseCase(AppConfig appConfig, SoundPlayer soundPlayer) {
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(soundPlayer, "soundPlayer");
        this.appConfig = appConfig;
        this.soundPlayer = soundPlayer;
    }

    public /* synthetic */ SoundEffectsUseCase(AppConfig appConfig, SoundPlayer soundPlayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig, soundPlayer);
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final SoundPlayer getSoundPlayer() {
        return this.soundPlayer;
    }

    public final void invoke$intercom_sdk_base_release(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.appConfig.isAudioEnabled()) {
            int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i == 1) {
                this.soundPlayer.playMessageSentSound();
                return;
            }
            if (i == 2) {
                this.soundPlayer.playAdminMessageReceivedSound();
            } else if (i == 3) {
                this.soundPlayer.playOperatorMessageReceivedSound();
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.soundPlayer.playMessageFailedSound();
            }
        }
    }
}
