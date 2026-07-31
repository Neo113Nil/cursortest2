package io.bidmachine.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzjm$$ExternalSyntheticApiModelOutline1;
import com.google.android.gms.internal.ads.zzjm$$ExternalSyntheticApiModelOutline2;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.BackgroundThreadStateHandler;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker;
import io.bidmachine.media3.exoplayer.SuitableOutputChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {

    @Nullable
    private final SuitableOutputChecker impl;

    public DefaultSuitableOutputChecker() {
        int i = Util.SDK_INT;
        if (i >= 35) {
            this.impl = new ImplApi35();
        } else if (i >= 23) {
            this.impl = new ImplApi23();
        } else {
            this.impl = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
    public void enable(SuitableOutputChecker.Callback callback, Context context, Looper looper, Looper looper2, Clock clock) {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.enable(callback, context, looper, looper2, clock);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
    public void disable() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.disable();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
    public boolean isSelectedOutputSuitableForPlayback() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        return suitableOutputChecker == null || suitableOutputChecker.isSelectedOutputSuitableForPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    static final class ImplApi35 implements SuitableOutputChecker {
        private static final RouteDiscoveryPreference EMPTY_DISCOVERY_PREFERENCE;

        @Nullable
        private MediaRouter2$ControllerCallback controllerCallback;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;
        private MediaRouter2$RouteCallback routeCallback;
        private MediaRouter2 router;

        private ImplApi35() {
        }

        static {
            RouteDiscoveryPreference build;
            zzjm$$ExternalSyntheticApiModelOutline2.m();
            build = zzjm$$ExternalSyntheticApiModelOutline1.m(ImmutableList.of(), false).build();
            EMPTY_DISCOVERY_PREFERENCE = build;
        }

        @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
        @SuppressLint({"ThreadSafe"})
        public void enable(final SuitableOutputChecker.Callback callback, final Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(Boolean.TRUE, looper2, looper, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda16
                @Override // io.bidmachine.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
                public final void onStateChanged(Object obj, Object obj2) {
                    DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0(SuitableOutputChecker.Callback.this, (Boolean) obj, (Boolean) obj2);
                }
            });
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi35.this.lambda$enable$1(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$enable$0(SuitableOutputChecker.Callback callback, Boolean bool, Boolean bool2) {
            callback.onSelectedOutputSuitabilityChanged(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enable$1(Context context) {
            MediaRouter2 mediaRouter2;
            Assertions.checkNotNull(this.isSuitableForPlaybackState);
            mediaRouter2 = MediaRouter2.getInstance(context);
            this.router = mediaRouter2;
            this.routeCallback = new MediaRouter2$RouteCallback() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.1
            };
            final BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            Objects.requireNonNull(backgroundThreadStateHandler);
            Executor executor = new Executor() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda18
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    BackgroundThreadStateHandler.this.runInBackground(runnable);
                }
            };
            this.router.registerRouteCallback(executor, this.routeCallback, EMPTY_DISCOVERY_PREFERENCE);
            MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = new MediaRouter2$ControllerCallback() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.2
                public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                    ImplApi35.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi35.isSelectedOutputSuitableForPlayback(ImplApi35.this.router)));
                }
            };
            this.controllerCallback = mediaRouter2$ControllerCallback;
            this.router.registerControllerCallback(executor, mediaRouter2$ControllerCallback);
            this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(isSelectedOutputSuitableForPlayback(this.router)));
        }

        @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkStateNotNull(this.isSuitableForPlaybackState)).runInBackground(new Runnable() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi35.this.lambda$disable$2();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disable$2() {
            DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticApiModelOutline0.m(Assertions.checkNotNull(this.router)).unregisterControllerCallback(DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticApiModelOutline7.m(Assertions.checkNotNull(this.controllerCallback)));
            this.controllerCallback = null;
            this.router.unregisterRouteCallback(DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticApiModelOutline9.m(Assertions.checkNotNull(this.routeCallback)));
        }

        @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSelectedOutputSuitableForPlayback(MediaRouter2 mediaRouter2) {
            MediaRouter2.RoutingController systemController;
            RoutingSessionInfo routingSessionInfo;
            int transferReason;
            MediaRouter2.RoutingController systemController2;
            boolean wasTransferInitiatedBySelf;
            MediaRouter2.RoutingController systemController3;
            List selectedRoutes;
            systemController = DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticApiModelOutline0.m(Assertions.checkNotNull(mediaRouter2)).getSystemController();
            routingSessionInfo = systemController.getRoutingSessionInfo();
            transferReason = routingSessionInfo.getTransferReason();
            systemController2 = mediaRouter2.getSystemController();
            wasTransferInitiatedBySelf = systemController2.wasTransferInitiatedBySelf();
            systemController3 = mediaRouter2.getSystemController();
            selectedRoutes = systemController3.getSelectedRoutes();
            Iterator it = selectedRoutes.iterator();
            while (it.hasNext()) {
                if (isRouteSuitableForMediaPlayback(DefaultSuitableOutputChecker$ImplApi35$$ExternalSyntheticApiModelOutline6.m(it.next()), transferReason, wasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isRouteSuitableForMediaPlayback(MediaRoute2Info mediaRoute2Info, int i, boolean z) {
            int suitabilityStatus;
            suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i == 1 || i == 2) && z : suitabilityStatus == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    static final class ImplApi23 implements SuitableOutputChecker {
        private AudioDeviceCallback audioDeviceCallback;

        @Nullable
        private AudioManager audioManager;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;

        private ImplApi23() {
        }

        @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
        public void enable(final SuitableOutputChecker.Callback callback, final Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(Boolean.TRUE, looper2, looper, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda1
                @Override // io.bidmachine.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
                public final void onStateChanged(Object obj, Object obj2) {
                    DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0(SuitableOutputChecker.Callback.this, (Boolean) obj, (Boolean) obj2);
                }
            });
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi23.this.lambda$enable$1(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$enable$0(SuitableOutputChecker.Callback callback, Boolean bool, Boolean bool2) {
            callback.onSelectedOutputSuitabilityChanged(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enable$1(Context context) {
            AudioManager audioManager;
            Assertions.checkNotNull(this.isSuitableForPlaybackState);
            if (Util.isWear(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                this.audioManager = audioManager;
                AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.1
                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }

                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }
                };
                this.audioDeviceCallback = audioDeviceCallback;
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler((Looper) Assertions.checkNotNull(Looper.myLooper())));
                this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(hasSupportedAudioOutput()));
            }
        }

        @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkNotNull(this.isSuitableForPlaybackState)).runInBackground(new Runnable() { // from class: io.bidmachine.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi23.this.lambda$disable$2();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disable$2() {
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) Assertions.checkNotNull(this.audioDeviceCallback));
            }
        }

        @Override // io.bidmachine.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasSupportedAudioOutput() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) Assertions.checkStateNotNull(this.audioManager)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i = Util.SDK_INT;
                if (i >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }
    }
}
