package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.AuxEffectInfo;
import io.bidmachine.media3.common.Effect;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.PlayerMessage;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsCollector;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsListener;
import io.bidmachine.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import io.bidmachine.media3.exoplayer.source.DefaultMediaSourceFactory;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.ShuffleOrder;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.trackselection.DefaultTrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectionArray;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelector;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import io.bidmachine.media3.exoplayer.upstream.DefaultBandwidthMeter;
import io.bidmachine.media3.exoplayer.video.VideoFrameMetadataListener;
import io.bidmachine.media3.exoplayer.video.spherical.CameraMotionListener;
import io.bidmachine.media3.extractor.DefaultExtractorsFactory;
import java.util.List;

/* loaded from: classes4.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @UnstableApi
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @UnstableApi
    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z) {
        }

        default void onSleepingForOffloadChanged(boolean z) {
        }
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @UnstableApi
    void addMediaSource(int i, MediaSource mediaSource);

    @UnstableApi
    void addMediaSource(MediaSource mediaSource);

    @UnstableApi
    void addMediaSources(int i, List<MediaSource> list);

    @UnstableApi
    void addMediaSources(List<MediaSource> list);

    @UnstableApi
    void clearAuxEffectInfo();

    @UnstableApi
    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    PlayerMessage createMessage(PlayerMessage.Target target);

    @UnstableApi
    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @UnstableApi
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    @UnstableApi
    Format getAudioFormat();

    @UnstableApi
    int getAudioSessionId();

    @UnstableApi
    Clock getClock();

    @UnstableApi
    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @UnstableApi
    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @UnstableApi
    boolean getPauseAtEndOfMediaItems();

    @UnstableApi
    Looper getPlaybackLooper();

    @Override // io.bidmachine.media3.common.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @UnstableApi
    PreloadConfiguration getPreloadConfiguration();

    @UnstableApi
    Renderer getRenderer(int i);

    @UnstableApi
    int getRendererCount();

    @UnstableApi
    int getRendererType(int i);

    @Nullable
    @UnstableApi
    default Renderer getSecondaryRenderer(int i) {
        return null;
    }

    @UnstableApi
    SeekParameters getSeekParameters();

    @UnstableApi
    boolean getSkipSilenceEnabled();

    @Nullable
    @UnstableApi
    TrackSelector getTrackSelector();

    @UnstableApi
    int getVideoChangeFrameRateStrategy();

    @Nullable
    @UnstableApi
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    @UnstableApi
    Format getVideoFormat();

    @UnstableApi
    int getVideoScalingMode();

    @UnstableApi
    boolean isReleased();

    @UnstableApi
    boolean isSleepingForOffload();

    @UnstableApi
    boolean isTunnelingEnabled();

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource);

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    @Override // io.bidmachine.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // io.bidmachine.media3.common.Player
    void replaceMediaItem(int i, MediaItem mediaItem);

    @Override // io.bidmachine.media3.common.Player
    void replaceMediaItems(int i, int i2, List<MediaItem> list);

    @UnstableApi
    void setAudioSessionId(int i);

    @UnstableApi
    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    @UnstableApi
    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, long j);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, boolean z);

    @UnstableApi
    void setMediaSources(List<MediaSource> list);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, int i, long j);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, boolean z);

    @UnstableApi
    void setPauseAtEndOfMediaItems(boolean z);

    @RequiresApi
    @UnstableApi
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    @UnstableApi
    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    @UnstableApi
    void setPriority(int i);

    @UnstableApi
    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @UnstableApi
    void setSeekParameters(@Nullable SeekParameters seekParameters);

    @UnstableApi
    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @UnstableApi
    void setSkipSilenceEnabled(boolean z);

    @UnstableApi
    void setVideoChangeFrameRateStrategy(int i);

    @UnstableApi
    void setVideoEffects(List<Effect> list);

    @UnstableApi
    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    void setVideoScalingMode(int i);

    void setWakeMode(int i);

    @UnstableApi
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(-9223372036854775807L);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j) {
            this.targetPreloadDurationUs = j;
        }
    }

    public static final class Builder {
        Function analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        Supplier bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        Supplier loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        Supplier mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        Supplier renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        Supplier trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        public Builder(final Context context) {
            this(context, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda20
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$0;
                    lambda$new$0 = ExoPlayer.Builder.lambda$new$0(context);
                    return lambda$new$0;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda21
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$1;
                    lambda$new$1 = ExoPlayer.Builder.lambda$new$1(context);
                    return lambda$new$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        @UnstableApi
        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda22
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$2;
                    lambda$new$2 = ExoPlayer.Builder.lambda$new$2(RenderersFactory.this);
                    return lambda$new$2;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda23
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$3;
                    lambda$new$3 = ExoPlayer.Builder.lambda$new$3(context);
                    return lambda$new$3;
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        @UnstableApi
        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda7
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$4;
                    lambda$new$4 = ExoPlayer.Builder.lambda$new$4(context);
                    return lambda$new$4;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda8
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$5;
                    lambda$new$5 = ExoPlayer.Builder.lambda$new$5(MediaSource.Factory.this);
                    return lambda$new$5;
                }
            });
            Assertions.checkNotNull(factory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda17
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$6;
                    lambda$new$6 = ExoPlayer.Builder.lambda$new$6(RenderersFactory.this);
                    return lambda$new$6;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda18
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$7;
                    lambda$new$7 = ExoPlayer.Builder.lambda$new$7(MediaSource.Factory.this);
                    return lambda$new$7;
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda9
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$8;
                    lambda$new$8 = ExoPlayer.Builder.lambda$new$8(RenderersFactory.this);
                    return lambda$new$8;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda10
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$9;
                    lambda$new$9 = ExoPlayer.Builder.lambda$new$9(MediaSource.Factory.this);
                    return lambda$new$9;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda11
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    TrackSelector lambda$new$10;
                    lambda$new$10 = ExoPlayer.Builder.lambda$new$10(TrackSelector.this);
                    return lambda$new$10;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda12
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    LoadControl lambda$new$11;
                    lambda$new$11 = ExoPlayer.Builder.lambda$new$11(LoadControl.this);
                    return lambda$new$11;
                }
            }, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda13
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter lambda$new$12;
                    lambda$new$12 = ExoPlayer.Builder.lambda$new$12(BandwidthMeter.this);
                    return lambda$new$12;
                }
            }, new Function() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda14
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    AnalyticsCollector lambda$new$13;
                    lambda$new$13 = ExoPlayer.Builder.lambda$new$13(AnalyticsCollector.this, (Clock) obj);
                    return lambda$new$13;
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, Supplier supplier, Supplier supplier2) {
            this(context, supplier, supplier2, new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda3
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    TrackSelector lambda$new$14;
                    lambda$new$14 = ExoPlayer.Builder.lambda$new$14(context);
                    return lambda$new$14;
                }
            }, new ExoPlayer$Builder$$ExternalSyntheticLambda4(), new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda5
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter singletonInstance;
                    singletonInstance = DefaultBandwidthMeter.getSingletonInstance(context);
                    return singletonInstance;
                }
            }, new Function() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda6
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        private Builder(Context context, Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4, Supplier supplier5, Function function) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = supplier;
            this.mediaSourceFactorySupplier = supplier2;
            this.trackSelectorSupplier = supplier3;
            this.loadControlSupplier = supplier4;
            this.bandwidthMeterSupplier = supplier5;
            this.analyticsCollectorFunction = function;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = 3000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new DefaultSuitableOutputChecker();
        }

        @UnstableApi
        public Builder experimentalSetForegroundModeTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        @UnstableApi
        public Builder experimentalSetDynamicSchedulingEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z;
            return this;
        }

        @UnstableApi
        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z;
            return this;
        }

        @UnstableApi
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$setRenderersFactory$16;
                    lambda$setRenderersFactory$16 = ExoPlayer.Builder.lambda$setRenderersFactory$16(RenderersFactory.this);
                    return lambda$setRenderersFactory$16;
                }
            };
            return this;
        }

        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$setMediaSourceFactory$17;
                    lambda$setMediaSourceFactory$17 = ExoPlayer.Builder.lambda$setMediaSourceFactory$17(MediaSource.Factory.this);
                    return lambda$setMediaSourceFactory$17;
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda16
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    TrackSelector lambda$setTrackSelector$18;
                    lambda$setTrackSelector$18 = ExoPlayer.Builder.lambda$setTrackSelector$18(TrackSelector.this);
                    return lambda$setTrackSelector$18;
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda15
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    LoadControl lambda$setLoadControl$19;
                    lambda$setLoadControl$19 = ExoPlayer.Builder.lambda$setLoadControl$19(LoadControl.this);
                    return lambda$setLoadControl$19;
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda19
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter lambda$setBandwidthMeter$20;
                    lambda$setBandwidthMeter$20 = ExoPlayer.Builder.lambda$setBandwidthMeter$20(BandwidthMeter.this);
                    return lambda$setBandwidthMeter$20;
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @UnstableApi
        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new Function() { // from class: io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    AnalyticsCollector lambda$setAnalyticsCollector$21;
                    lambda$setAnalyticsCollector$21 = ExoPlayer.Builder.lambda$setAnalyticsCollector$21(AnalyticsCollector.this, (Clock) obj);
                    return lambda$setAnalyticsCollector$21;
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setPriority(int i) {
            Assertions.checkState(!this.buildCalled);
            this.priority = i;
            return this;
        }

        @UnstableApi
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z;
            return this;
        }

        public Builder setWakeMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        @UnstableApi
        public Builder setSkipSilenceEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        @UnstableApi
        public Builder setDeviceVolumeControlEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z;
            return this;
        }

        @UnstableApi
        public Builder setVideoScalingMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        @UnstableApi
        public Builder setVideoChangeFrameRateStrategy(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        @UnstableApi
        public Builder setUseLazyPreparation(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        @UnstableApi
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @UnstableApi
        public Builder setSeekBackIncrementMs(@IntRange long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        @UnstableApi
        public Builder setSeekForwardIncrementMs(@IntRange long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        @UnstableApi
        public Builder setMaxSeekToPreviousPositionMs(@IntRange long j) {
            Assertions.checkArgument(j >= 0);
            Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j;
            return this;
        }

        @UnstableApi
        public Builder setReleaseTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        @UnstableApi
        public Builder setDetachSurfaceTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        @UnstableApi
        public Builder setPauseAtEndOfMediaItems(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        @UnstableApi
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @UnstableApi
        public Builder setUsePlatformDiagnostics(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        @VisibleForTesting
        @UnstableApi
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @RestrictTo
        @VisibleForTesting
        @UnstableApi
        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            Assertions.checkState(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        @UnstableApi
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @RestrictTo
        @UnstableApi
        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        @UnstableApi
        public Builder setName(String str) {
            Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }
    }
}
