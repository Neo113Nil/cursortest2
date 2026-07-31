package io.bidmachine.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.DefaultRendererCapabilitiesList;
import io.bidmachine.media3.exoplayer.DefaultRenderersFactory;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda4;
import io.bidmachine.media3.exoplayer.LoadControl;
import io.bidmachine.media3.exoplayer.PlaybackLooperProvider;
import io.bidmachine.media3.exoplayer.RendererCapabilitiesList;
import io.bidmachine.media3.exoplayer.RenderersFactory;
import io.bidmachine.media3.exoplayer.source.DefaultMediaSourceFactory;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.preload.BasePreloadManager;
import io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager;
import io.bidmachine.media3.exoplayer.source.preload.PreloadMediaSource;
import io.bidmachine.media3.exoplayer.source.preload.TargetPreloadStatusControl;
import io.bidmachine.media3.exoplayer.trackselection.DefaultTrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelector;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import io.bidmachine.media3.exoplayer.upstream.DefaultBandwidthMeter;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

@UnstableApi
/* loaded from: classes14.dex */
public final class DefaultPreloadManager extends BasePreloadManager<Integer> {
    private final boolean deprecatedConstructorCalled;
    private final Handler preloadHandler;
    private final PlaybackLooperProvider preloadLooperProvider;
    private final PreloadMediaSource.Factory preloadMediaSourceFactory;
    private final RendererCapabilitiesList rendererCapabilitiesList;
    private final TrackSelector trackSelector;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }

    public static final class Builder extends BasePreloadManager.BuilderBase<Integer> {
        private Supplier bandwidthMeterSupplier;
        private boolean buildCalled;
        private boolean buildExoPlayerCalled;
        private final Context context;
        private Supplier loadControlSupplier;
        private PlaybackLooperProvider preloadLooperProvider;
        private Supplier renderersFactorySupplier;
        private TrackSelector.Factory trackSelectorFactory;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$6(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$5(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$3(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$4(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public Builder(final Context context, TargetPreloadStatusControl<Integer> targetPreloadStatusControl) {
            super(new RankingDataComparator(), targetPreloadStatusControl, Suppliers.memoize(new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$new$0;
                    lambda$new$0 = DefaultPreloadManager.Builder.lambda$new$0(context);
                    return lambda$new$0;
                }
            }));
            this.context = context;
            this.preloadLooperProvider = new PlaybackLooperProvider();
            this.trackSelectorFactory = new TrackSelector.Factory() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda1
                @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelector.Factory
                public final TrackSelector createTrackSelector(Context context2) {
                    return new DefaultTrackSelector(context2);
                }
            };
            this.bandwidthMeterSupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter singletonInstance;
                    singletonInstance = DefaultBandwidthMeter.getSingletonInstance(context);
                    return singletonInstance;
                }
            };
            this.renderersFactorySupplier = Suppliers.memoize(new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda3
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$new$2;
                    lambda$new$2 = DefaultPreloadManager.Builder.lambda$new$2(context);
                    return lambda$new$2;
                }
            });
            this.loadControlSupplier = Suppliers.memoize(new ExoPlayer$Builder$$ExternalSyntheticLambda4());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$0(Context context) {
            return new DefaultMediaSourceFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda7
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    MediaSource.Factory lambda$setMediaSourceFactory$3;
                    lambda$setMediaSourceFactory$3 = DefaultPreloadManager.Builder.lambda$setMediaSourceFactory$3(MediaSource.Factory.this);
                    return lambda$setMediaSourceFactory$3;
                }
            };
            return this;
        }

        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.renderersFactorySupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda4
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    RenderersFactory lambda$setRenderersFactory$4;
                    lambda$setRenderersFactory$4 = DefaultPreloadManager.Builder.lambda$setRenderersFactory$4(RenderersFactory.this);
                    return lambda$setRenderersFactory$4;
                }
            };
            return this;
        }

        public Builder setTrackSelectorFactory(TrackSelector.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.trackSelectorFactory = factory;
            return this;
        }

        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.loadControlSupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda6
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    LoadControl lambda$setLoadControl$5;
                    lambda$setLoadControl$5 = DefaultPreloadManager.Builder.lambda$setLoadControl$5(LoadControl.this);
                    return lambda$setLoadControl$5;
                }
            };
            return this;
        }

        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.bandwidthMeterSupplier = new Supplier() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$Builder$$ExternalSyntheticLambda5
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    BandwidthMeter lambda$setBandwidthMeter$6;
                    lambda$setBandwidthMeter$6 = DefaultPreloadManager.Builder.lambda$setBandwidthMeter$6(BandwidthMeter.this);
                    return lambda$setBandwidthMeter$6;
                }
            };
            return this;
        }

        public Builder setPreloadLooper(Looper looper) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.preloadLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        public ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new ExoPlayer.Builder(this.context));
        }

        public ExoPlayer buildExoPlayer(ExoPlayer.Builder builder) {
            this.buildExoPlayerCalled = true;
            return builder.setMediaSourceFactory((MediaSource.Factory) this.mediaSourceFactorySupplier.get()).setBandwidthMeter((BandwidthMeter) this.bandwidthMeterSupplier.get()).setRenderersFactory((RenderersFactory) this.renderersFactorySupplier.get()).setLoadControl((LoadControl) this.loadControlSupplier.get()).setPlaybackLooperProvider(this.preloadLooperProvider).setTrackSelector(this.trackSelectorFactory.createTrackSelector(this.context)).build();
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase
        public BasePreloadManager<Integer> build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new DefaultPreloadManager(this);
        }
    }

    public static class Status implements TargetPreloadStatusControl.PreloadStatus {
        public static final int STAGE_LOADED_FOR_DURATION_MS = 2;
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_TRACKS_SELECTED = 1;
        private final int stage;
        private final long value;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        public Status(int i, long j) {
            this.stage = i;
            this.value = j;
        }

        public Status(int i) {
            this(i, -9223372036854775807L);
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public int getStage() {
            return this.stage;
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public long getValue() {
            return this.value;
        }
    }

    private DefaultPreloadManager(Builder builder) {
        super(new RankingDataComparator(), builder.targetPreloadStatusControl, (MediaSource.Factory) builder.mediaSourceFactorySupplier.get());
        DefaultRendererCapabilitiesList createRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory((RenderersFactory) builder.renderersFactorySupplier.get()).createRendererCapabilitiesList();
        this.rendererCapabilitiesList = createRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = builder.preloadLooperProvider;
        this.preloadLooperProvider = playbackLooperProvider;
        TrackSelector createTrackSelector = builder.trackSelectorFactory.createTrackSelector(builder.context);
        this.trackSelector = createTrackSelector;
        BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
        createTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$$ExternalSyntheticLambda1
            @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DefaultPreloadManager.lambda$new$0();
            }
        }, bandwidthMeter);
        Looper obtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory((MediaSource.Factory) builder.mediaSourceFactorySupplier.get(), new SourcePreloadControl(), createTrackSelector, bandwidthMeter, createRendererCapabilitiesList.getRendererCapabilities(), ((LoadControl) builder.loadControlSupplier.get()).getAllocator(), obtainLooper);
        this.preloadHandler = Util.createHandler(obtainLooper, null);
        this.deprecatedConstructorCalled = false;
    }

    @Deprecated
    public DefaultPreloadManager(TargetPreloadStatusControl<Integer> targetPreloadStatusControl, MediaSource.Factory factory, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilitiesList.Factory factory2, Allocator allocator, Looper looper) {
        super(new RankingDataComparator(), targetPreloadStatusControl, factory);
        RendererCapabilitiesList createRendererCapabilitiesList = factory2.createRendererCapabilitiesList();
        this.rendererCapabilitiesList = createRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = new PlaybackLooperProvider(looper);
        this.preloadLooperProvider = playbackLooperProvider;
        this.trackSelector = trackSelector;
        Looper obtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory(factory, new SourcePreloadControl(), trackSelector, bandwidthMeter, createRendererCapabilitiesList.getRendererCapabilities(), allocator, obtainLooper);
        this.preloadHandler = Util.createHandler(obtainLooper, null);
        this.deprecatedConstructorCalled = true;
    }

    public void setCurrentPlayingIndex(int i) {
        ((RankingDataComparator) this.rankingDataComparator).currentPlayingIndex = i;
    }

    @Override // io.bidmachine.media3.exoplayer.source.preload.BasePreloadManager
    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return this.preloadMediaSourceFactory.createMediaSource(mediaSource);
    }

    @Override // io.bidmachine.media3.exoplayer.source.preload.BasePreloadManager
    protected void preloadSourceInternal(MediaSource mediaSource, long j) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).preload(j);
    }

    @Override // io.bidmachine.media3.exoplayer.source.preload.BasePreloadManager
    protected void clearSourceInternal(MediaSource mediaSource) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).clear();
    }

    @Override // io.bidmachine.media3.exoplayer.source.preload.BasePreloadManager
    protected void releaseSourceInternal(MediaSource mediaSource) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).releasePreloadMediaSource();
    }

    @Override // io.bidmachine.media3.exoplayer.source.preload.BasePreloadManager
    protected void releaseInternal() {
        this.preloadHandler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DefaultPreloadManager.this.lambda$releaseInternal$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseInternal$1() {
        this.rendererCapabilitiesList.release();
        if (!this.deprecatedConstructorCalled) {
            this.trackSelector.release();
        }
        this.preloadLooperProvider.releaseLooper();
    }

    private static final class RankingDataComparator implements Comparator<Integer> {
        public int currentPlayingIndex = -1;

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.currentPlayingIndex), Math.abs(num2.intValue() - this.currentPlayingIndex));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SourcePreloadControl implements PreloadMediaSource.PreloadControl {
        private SourcePreloadControl() {
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new Predicate() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean lambda$onSourcePrepared$0;
                    lambda$onSourcePrepared$0 = DefaultPreloadManager.SourcePreloadControl.lambda$onSourcePrepared$0((DefaultPreloadManager.Status) obj);
                    return lambda$onSourcePrepared$0;
                }
            }, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onSourcePrepared$0(Status status) {
            return status.getStage() > 0;
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new Predicate() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean lambda$onTracksSelected$1;
                    lambda$onTracksSelected$1 = DefaultPreloadManager.SourcePreloadControl.lambda$onTracksSelected$1((DefaultPreloadManager.Status) obj);
                    return lambda$onTracksSelected$1;
                }
            }, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onTracksSelected$1(Status status) {
            return status.getStage() > 1;
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, final long j) {
            return continueOrCompletePreloading(preloadMediaSource, new Predicate() { // from class: io.bidmachine.media3.exoplayer.source.preload.DefaultPreloadManager$SourcePreloadControl$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean lambda$onContinueLoadingRequested$2;
                    lambda$onContinueLoadingRequested$2 = DefaultPreloadManager.SourcePreloadControl.lambda$onContinueLoadingRequested$2(j, (DefaultPreloadManager.Status) obj);
                    return lambda$onContinueLoadingRequested$2;
                }
            }, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onContinueLoadingRequested$2(long j, Status status) {
            return status.getStage() == 2 && status.getValue() > Util.usToMs(j);
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
        }

        @Override // io.bidmachine.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadError(preloadException, preloadMediaSource);
        }

        private boolean continueOrCompletePreloading(PreloadMediaSource preloadMediaSource, Predicate predicate, boolean z) {
            TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = DefaultPreloadManager.this.getTargetPreloadStatus(preloadMediaSource);
            if (targetPreloadStatus != null) {
                if (predicate.apply((Status) Assertions.checkNotNull((Status) targetPreloadStatus))) {
                    return true;
                }
                if (z) {
                    DefaultPreloadManager.this.clearSourceInternal(preloadMediaSource);
                }
                DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
                return false;
            }
            DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
            return false;
        }
    }
}
