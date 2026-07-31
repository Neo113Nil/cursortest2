package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.PlaybackParameters;
import io.bidmachine.media3.common.Timeline;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.HandlerWrapper;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.TraceUtil;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DataSourceException;
import io.bidmachine.media3.exoplayer.AudioFocusManager;
import io.bidmachine.media3.exoplayer.DefaultMediaClock;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.LoadControl;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.MediaPeriodHolder;
import io.bidmachine.media3.exoplayer.MediaSourceList;
import io.bidmachine.media3.exoplayer.PlayerMessage;
import io.bidmachine.media3.exoplayer.Renderer;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.analytics.AnalyticsCollector;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import io.bidmachine.media3.exoplayer.source.BehindLiveWindowException;
import io.bidmachine.media3.exoplayer.source.MediaPeriod;
import io.bidmachine.media3.exoplayer.source.MediaSource;
import io.bidmachine.media3.exoplayer.source.ShuffleOrder;
import io.bidmachine.media3.exoplayer.source.TrackGroupArray;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelector;
import io.bidmachine.media3.exoplayer.trackselection.TrackSelectorResult;
import io.bidmachine.media3.exoplayer.upstream.BandwidthMeter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender, AudioFocusManager.PlayerControl {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = Util.usToMs(10000);
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_AUDIO_FOCUS_PLAYER_COMMAND = 33;
    private static final int MSG_AUDIO_FOCUS_VOLUME_MULTIPLIER = 34;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_AUDIO_ATTRIBUTES = 31;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SET_VIDEO_OUTPUT = 30;
    private static final int MSG_SET_VOLUME = 32;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper applicationLooperHandler;
    private final AudioFocusManager audioFocusManager;
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final boolean dynamicSchedulingEnabled;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final boolean hasSecondaryRenderers;
    private boolean isPrewarmingDisabledUntilNextTransition;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;

    @Nullable
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;

    @Nullable
    private ExoPlaybackException pendingRecoverableRendererError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final PlaybackLooperProvider playbackLooperProvider;
    private final PlayerId playerId;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final boolean[] rendererReportedReady;
    private final RendererHolder[] renderers;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private long prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
    private float volume = 1.0f;
    private long playbackMaybeBecameStuckAtMs = -9223372036854775807L;
    private long lastRebufferRealtimeMs = -9223372036854775807L;
    private Timeline lastPreloadPoolInvalidationTimeline = Timeline.EMPTY;

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    private static int updatePlayWhenReadyChangeReason(int i, int i2) {
        if (i == -1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        return i2;
    }

    private static int updatePlaybackSuppressionReason(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        return i2;
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public int operationAcks;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i) {
            this.hasPendingChange |= i > 0;
            this.operationAcks += i;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                Assertions.checkArgument(i == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i;
        }
    }

    public ExoPlayerImplInternal(Context context, Renderer[] rendererArr, Renderer[] rendererArr2, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i, boolean z, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z2, boolean z3, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId, @Nullable PlaybackLooperProvider playbackLooperProvider, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i;
        this.shuffleModeEnabled = z;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j;
        this.setForegroundModeTimeoutMs = j;
        this.pauseAtEndOfWindow = z2;
        this.dynamicSchedulingEnabled = z3;
        this.clock = clock;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.analyticsCollector = analyticsCollector;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs(playerId);
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe(playerId);
        PlaybackInfo createDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        this.rendererReportedReady = new boolean[rendererArr.length];
        RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        this.renderers = new RendererHolder[rendererArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].init(i2, playerId, clock);
            this.rendererCapabilities[i2] = rendererArr[i2].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i2].setListener(rendererCapabilitiesListener);
            }
            Renderer renderer = rendererArr2[i2];
            if (renderer != null) {
                renderer.init(rendererArr.length + i2, playerId, clock);
                z4 = true;
            }
            this.renderers[i2] = new RendererHolder(rendererArr[i2], rendererArr2[i2], i2);
        }
        this.hasSecondaryRenderers = z4;
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        HandlerWrapper createHandler = clock.createHandler(looper, null);
        this.applicationLooperHandler = createHandler;
        this.queue = new MediaPeriodQueue(analyticsCollector, createHandler, new MediaPeriodHolder.Factory() { // from class: io.bidmachine.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda3
            @Override // io.bidmachine.media3.exoplayer.MediaPeriodHolder.Factory
            public final MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j2) {
                MediaPeriodHolder createMediaPeriodHolder;
                createMediaPeriodHolder = ExoPlayerImplInternal.this.createMediaPeriodHolder(mediaPeriodInfo, j2);
                return createMediaPeriodHolder;
            }
        }, preloadConfiguration);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, createHandler, playerId);
        PlaybackLooperProvider playbackLooperProvider2 = playbackLooperProvider == null ? new PlaybackLooperProvider() : playbackLooperProvider;
        this.playbackLooperProvider = playbackLooperProvider2;
        Looper obtainLooper = playbackLooperProvider2.obtainLooper();
        this.playbackLooper = obtainLooper;
        this.handler = clock.createHandler(obtainLooper, this);
        this.audioFocusManager = new AudioFocusManager(context, obtainLooper, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPeriodHolder createMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, long j) {
        return new MediaPeriodHolder(this.rendererCapabilities, j, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, mediaPeriodInfo, this.emptyTrackSelectorResult, this.preloadConfiguration.targetPreloadDurationUs);
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public void prepare() {
        this.handler.obtainMessage(29).sendToTarget();
    }

    public void setPlayWhenReady(boolean z, int i, int i2) {
        this.handler.obtainMessage(1, z ? 1 : 0, i | (i2 << 4)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z) {
        this.handler.obtainMessage(23, z ? 1 : 0, 0).sendToTarget();
    }

    public void setRepeatMode(int i) {
        this.handler.obtainMessage(11, i, 0).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z) {
        this.handler.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
    }

    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.handler.obtainMessage(28, preloadConfiguration).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i, long j) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i, j)).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i, long j, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i, j)).sendToTarget();
    }

    public void addMediaSources(int i, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, -9223372036854775807L)).sendToTarget();
    }

    public void removeMediaSources(int i, int i2, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i, i2, shuffleOrder).sendToTarget();
    }

    public void moveMediaSources(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new MoveMediaItemsMessage(i, i2, i3, shuffleOrder)).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public void updateMediaSourcesWithMediaItems(int i, int i2, List<MediaItem> list) {
        this.handler.obtainMessage(27, i, i2, list).sendToTarget();
    }

    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        this.handler.obtainMessage(31, z ? 1 : 0, 0, audioAttributes).sendToTarget();
    }

    public void setVolume(float f) {
        this.handler.obtainMessage(32, Float.valueOf(f)).sendToTarget();
    }

    private void handleAudioFocusPlayerCommandInternal(int i) throws ExoPlaybackException {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, i, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private void handleAudioFocusVolumeMultiplierChange() throws ExoPlaybackException {
        setVolumeInternal(this.volume);
    }

    @Override // io.bidmachine.media3.exoplayer.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        Log.w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            if (z) {
                this.handler.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.handler.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            waitUninterruptibly(new androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda3(atomicBoolean), this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public synchronized boolean setVideoOutput(@Nullable Object obj, long j) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.handler.obtainMessage(30, new Pair(obj, atomicBoolean)).sendToTarget();
            if (j == -9223372036854775807L) {
                return true;
            }
            waitUninterruptibly(new androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda3(atomicBoolean), j);
            return atomicBoolean.get();
        }
        return true;
    }

    public synchronized boolean release() {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.sendEmptyMessage(7);
            waitUninterruptibly(new Supplier() { // from class: io.bidmachine.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    Boolean lambda$release$0;
                    lambda$release$0 = ExoPlayerImplInternal.this.lambda$release$0();
                    return lambda$release$0;
                }
            }, this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$release$0() {
        return Boolean.valueOf(this.released);
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // io.bidmachine.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessage(22);
    }

    @Override // io.bidmachine.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    @Override // io.bidmachine.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        this.handler.sendEmptyMessage(26);
    }

    @Override // io.bidmachine.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // io.bidmachine.media3.exoplayer.AudioFocusManager.PlayerControl
    public void setVolumeMultiplier(float f) {
        this.handler.sendEmptyMessage(34);
    }

    @Override // io.bidmachine.media3.exoplayer.AudioFocusManager.PlayerControl
    public void executePlayerCommand(int i) {
        this.handler.obtainMessage(33, i, 0).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        ExoPlaybackException exoPlaybackException;
        int i;
        MediaPeriodHolder readingPeriod;
        MediaSource.MediaPeriodId mediaPeriodId;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i2 = message.arg2;
                    setPlayWhenReadyInternal(z, i2 >> 4, true, i2 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    setVideoOutputInternal(pair.first, (AtomicBoolean) pair.second);
                    break;
                case 31:
                    setAudioAttributesInternal((AudioAttributes) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    setVolumeInternal(((Float) message.obj).floatValue());
                    break;
                case 33:
                    handleAudioFocusPlayerCommandInternal(message.arg1);
                    break;
                case 34:
                    handleAudioFocusVolumeMultiplierChange();
                    break;
            }
        } catch (ParserException e) {
            int i3 = e.dataType;
            if (i3 == 1) {
                r2 = e.contentIsMalformed ? 3001 : 3003;
            } else if (i3 == 4) {
                r2 = e.contentIsMalformed ? 3002 : 3004;
            }
            handleIoException(e, r2);
        } catch (DataSourceException e2) {
            handleIoException(e2, e2.reason);
        } catch (ExoPlaybackException e3) {
            ExoPlaybackException exoPlaybackException2 = e3;
            if (exoPlaybackException2.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                RendererHolder[] rendererHolderArr = this.renderers;
                int i4 = exoPlaybackException2.rendererIndex;
                if (rendererHolderArr[i4 % rendererHolderArr.length].isRendererPrewarming(i4) && readingPeriod.getNext() != null) {
                    mediaPeriodId = readingPeriod.getNext().info.id;
                } else {
                    mediaPeriodId = readingPeriod.info.id;
                }
                exoPlaybackException2 = exoPlaybackException2.copyWithMediaPeriodId(mediaPeriodId);
            }
            if (exoPlaybackException2.type == 1) {
                RendererHolder[] rendererHolderArr2 = this.renderers;
                int i5 = exoPlaybackException2.rendererIndex;
                if (rendererHolderArr2[i5 % rendererHolderArr2.length].isRendererPrewarming(i5)) {
                    this.isPrewarmingDisabledUntilNextTransition = true;
                    disableAndResetPrewarmingRenderers();
                    MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod();
                    MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                    if (this.queue.getPlayingPeriod() != prewarmingPeriod) {
                        while (playingPeriod != null && playingPeriod.getNext() != prewarmingPeriod) {
                            playingPeriod = playingPeriod.getNext();
                        }
                    }
                    this.queue.removeAfter(playingPeriod);
                    if (this.playbackInfo.playbackState != 4) {
                        maybeContinueLoading();
                        this.handler.sendEmptyMessage(2);
                    }
                }
            }
            ExoPlaybackException exoPlaybackException3 = this.pendingRecoverableRendererError;
            if (exoPlaybackException3 != null) {
                exoPlaybackException3.addSuppressed(exoPlaybackException2);
                exoPlaybackException2 = this.pendingRecoverableRendererError;
            }
            ExoPlaybackException exoPlaybackException4 = exoPlaybackException2;
            if (exoPlaybackException4.type != 1 || this.queue.getPlayingPeriod() == this.queue.getReadingPeriod()) {
                exoPlaybackException = exoPlaybackException4;
            } else {
                while (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                    this.queue.advancePlayingPeriod();
                }
                MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getPlayingPeriod());
                maybeNotifyPlaybackInfoChanged();
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
                MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodInfo.id;
                long j = mediaPeriodInfo.startPositionUs;
                exoPlaybackException = exoPlaybackException4;
                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId2, j, mediaPeriodInfo.requestedContentPositionUs, j, true, 0);
            }
            if (exoPlaybackException.isRecoverable && (this.pendingRecoverableRendererError == null || (i = exoPlaybackException.errorCode) == 5004 || i == 5003)) {
                Log.w(TAG, "Recoverable renderer error", exoPlaybackException);
                if (this.pendingRecoverableRendererError == null) {
                    this.pendingRecoverableRendererError = exoPlaybackException;
                }
                HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, exoPlaybackException));
            } else {
                Log.e(TAG, "Playback error", exoPlaybackException);
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackException);
            }
        } catch (DrmSession.DrmSessionException e4) {
            handleIoException(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            handleIoException(e5, 1002);
        } catch (IOException e6) {
            handleIoException(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.e(TAG, "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    private void handleIoException(IOException iOException, int i) {
        ExoPlaybackException createForSource = ExoPlaybackException.createForSource(iOException, i);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.id);
        }
        Log.e(TAG, "Playback error", createForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForSource);
    }

    private synchronized void waitUninterruptibly(Supplier supplier, long j) {
        long elapsedRealtime = this.clock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) supplier.get()).booleanValue() && j > 0) {
            try {
                this.clock.onThreadBlocked();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.clock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private void setState(int i) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i) {
            if (i != 2) {
                this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            }
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i);
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void prepareInternal() throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        updatePlayWhenReadyWithAudioFocus();
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i == -1) {
            i = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void removeMediaItemsInternal(int i, int i2, ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i, i2, shuffleOrder), false);
    }

    private void mediaSourceListUpdateRequestedInternal() throws ExoPlaybackException {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i, int i2, List<MediaItem> list) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i, i2, list), false);
    }

    private void setAudioAttributesInternal(AudioAttributes audioAttributes, boolean z) throws ExoPlaybackException {
        this.trackSelector.setAudioAttributes(audioAttributes);
        AudioFocusManager audioFocusManager = this.audioFocusManager;
        if (!z) {
            audioAttributes = null;
        }
        audioFocusManager.setAudioAttributes(audioAttributes);
        updatePlayWhenReadyWithAudioFocus();
    }

    private void setVolumeInternal(float f) throws ExoPlaybackException {
        this.volume = f;
        float volumeMultiplier = f * this.audioFocusManager.getVolumeMultiplier();
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVolume(volumeMultiplier);
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        updatePlayWhenReadyWithAudioFocus(z, i, i2);
    }

    private void updatePlayWhenReadyWithAudioFocus() throws ExoPlaybackException {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z, int i, int i2) throws ExoPlaybackException {
        updatePlayWhenReadyWithAudioFocus(z, this.audioFocusManager.updateAudioFocus(z, this.playbackInfo.playbackState), i, i2);
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z, int i, int i2, int i3) throws ExoPlaybackException {
        boolean z2 = z && i != -1;
        int updatePlayWhenReadyChangeReason = updatePlayWhenReadyChangeReason(i, i3);
        int updatePlaybackSuppressionReason = updatePlaybackSuppressionReason(i, i2);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z2 && playbackInfo.playbackSuppressionReason == updatePlaybackSuppressionReason && playbackInfo.playWhenReadyChangeReason == updatePlayWhenReadyChangeReason) {
            return;
        }
        this.playbackInfo = playbackInfo.copyWithPlayWhenReady(z2, updatePlayWhenReadyChangeReason, updatePlaybackSuppressionReason);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z2);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            return;
        }
        int i4 = this.playbackInfo.playbackState;
        if (i4 == 3) {
            this.mediaClock.start();
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i4 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPauseAtEndOfWindowInternal(boolean z) throws ExoPlaybackException {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setOffloadSchedulingEnabled(boolean z) {
        if (z == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z;
        if (z || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setRepeatModeInternal(int i) throws ExoPlaybackException {
        this.repeatMode = i;
        int updateRepeatMode = this.queue.updateRepeatMode(this.playbackInfo.timeline, i);
        if ((updateRepeatMode & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateRepeatMode & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleModeEnabledInternal(boolean z) throws ExoPlaybackException {
        this.shuffleModeEnabled = z;
        int updateShuffleModeEnabled = this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z);
        if ((updateShuffleModeEnabled & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateShuffleModeEnabled & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPreloadConfigurationInternal(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        this.queue.updatePreloadConfiguration(this.playbackInfo.timeline, preloadConfiguration);
    }

    private void seekToCurrentPosition(boolean z) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z, 5);
        }
    }

    private void startRenderers() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].start();
            }
        }
    }

    private void stopRenderers() throws ExoPlaybackException {
        this.mediaClock.stop();
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.stop();
        }
    }

    private void attemptRendererErrorRecovery() throws ExoPlaybackException {
        reselectTracksInternalAndSeek();
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != -9223372036854775807L) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(readDiscontinuity);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, readDiscontinuity, playbackInfo.requestedContentPositionUs, readDiscontinuity, true, 5);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                boolean z = !this.playbackInfoUpdate.positionDiscontinuity;
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, periodTime, playbackInfo2.requestedContentPositionUs, periodTime, z, 6);
            } else {
                this.playbackInfo.updatePositionUs(periodTime);
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.playWhenReady && playbackInfo3.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo3.timeline, playbackInfo3.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), this.playbackInfo.totalBufferedDurationUs);
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void setMediaClockPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void notifyTrackSelectionRebuffer() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doSomeWork() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        PlaybackInfo playbackInfo;
        int i;
        long uptimeMillis = this.clock.uptimeMillis();
        this.handler.removeMessages(2);
        updatePeriods();
        int i2 = this.playbackInfo.playbackState;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(uptimeMillis);
            return;
        }
        TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            this.rendererPositionElapsedRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            z = true;
            z2 = true;
            int i3 = 0;
            while (true) {
                RendererHolder[] rendererHolderArr = this.renderers;
                if (i3 >= rendererHolderArr.length) {
                    break;
                }
                RendererHolder rendererHolder = rendererHolderArr[i3];
                if (rendererHolder.getEnabledRendererCount() == 0) {
                    maybeTriggerOnRendererReadyChanged(i3, false);
                } else {
                    rendererHolder.render(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs);
                    z = z && rendererHolder.isEnded();
                    boolean allowsPlayback = rendererHolder.allowsPlayback(playingPeriod);
                    maybeTriggerOnRendererReadyChanged(i3, allowsPlayback);
                    z2 = z2 && allowsPlayback;
                    if (!allowsPlayback) {
                        maybeThrowRendererStreamError(i3);
                    }
                }
                i3++;
            }
        } else {
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j = playingPeriod.info.durationUs;
        boolean z4 = z && playingPeriod.prepared && (j == -9223372036854775807L || j <= this.playbackInfo.positionUs);
        if (z4 && this.pendingPauseAtEndOfPeriod) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
        }
        if (z4 && playingPeriod.info.isFinal) {
            setState(4);
            stopRenderers();
        } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z2)) {
            setState(3);
            this.pendingRecoverableRendererError = null;
            if (shouldPlayWhenReady()) {
                updateRebufferingState(false, false);
                this.mediaClock.start();
                startRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z2 : !isTimelineReady())) {
            updateRebufferingState(shouldPlayWhenReady(), false);
            setState(2);
            if (this.isRebuffering) {
                notifyTrackSelectionRebuffer();
                this.livePlaybackSpeedControl.notifyRebuffer();
            }
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            int i4 = 0;
            while (true) {
                RendererHolder[] rendererHolderArr2 = this.renderers;
                if (i4 >= rendererHolderArr2.length) {
                    break;
                }
                if (rendererHolderArr2[i4].isReadingFromPeriod(playingPeriod)) {
                    maybeThrowRendererStreamError(i4);
                }
                i4++;
            }
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            if (!playbackInfo2.isLoading && playbackInfo2.totalBufferedDurationUs < PLAYBACK_BUFFER_EMPTY_THRESHOLD_US && isLoadingPossible(this.queue.getLoadingPeriod()) && shouldPlayWhenReady()) {
                if (this.playbackMaybeBecameStuckAtMs == -9223372036854775807L) {
                    this.playbackMaybeBecameStuckAtMs = this.clock.elapsedRealtime();
                } else if (this.clock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= PLAYBACK_STUCK_AFTER_MS) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
                boolean z5 = !shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
                z3 = !this.offloadSchedulingEnabled && this.requestForRendererSleep && z5;
                playbackInfo = this.playbackInfo;
                if (playbackInfo.sleepingForOffload != z3) {
                    this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z3);
                }
                this.requestForRendererSleep = false;
                if (!z3 && (i = this.playbackInfo.playbackState) != 4 && (z5 || i == 2 || (i == 3 && this.enabledRendererCount != 0))) {
                    scheduleNextWork(uptimeMillis);
                }
                TraceUtil.endSection();
            }
        }
        this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
        if (shouldPlayWhenReady()) {
        }
        if (this.offloadSchedulingEnabled) {
        }
        playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload != z3) {
        }
        this.requestForRendererSleep = false;
        if (!z3) {
            scheduleNextWork(uptimeMillis);
        }
        TraceUtil.endSection();
    }

    private void maybeTriggerOnRendererReadyChanged(final int i, final boolean z) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.applicationLooperHandler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.this.lambda$maybeTriggerOnRendererReadyChanged$1(i, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeTriggerOnRendererReadyChanged$1(int i, boolean z) {
        this.analyticsCollector.onRendererReadyChanged(i, this.renderers[i].getTrackType(), z);
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        Timeline.Window window = this.window;
        if (window.windowStartTimeMs != -9223372036854775807L && window.isLive()) {
            Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return Util.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j + this.period.getPositionInWindowUs());
            }
        }
        return -9223372036854775807L;
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.isAd() || timeline.isEmpty()) {
            return false;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        if (!this.window.isLive()) {
            return false;
        }
        Timeline.Window window = this.window;
        return window.isDynamic && window.windowStartTimeMs != -9223372036854775807L;
    }

    private void scheduleNextWork(long j) {
        long j2 = (this.playbackInfo.playbackState != 3 || (!this.dynamicSchedulingEnabled && shouldPlayWhenReady())) ? BUFFERING_MAXIMUM_INTERVAL_MS : 1000L;
        if (this.dynamicSchedulingEnabled && shouldPlayWhenReady()) {
            for (RendererHolder rendererHolder : this.renderers) {
                j2 = Math.min(j2, Util.usToMs(rendererHolder.getMinDurationToProgressUs(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs)));
            }
            if ((this.queue.getPlayingPeriod() != null ? this.queue.getPlayingPeriod().getNext() : null) != null && this.rendererPositionUs + (Util.msToUs(j2) * this.playbackInfo.playbackParameters.speed) >= r2.getStartPositionRendererTime()) {
                j2 = Math.min(j2, BUFFERING_MAXIMUM_INTERVAL_MS);
            }
        }
        this.handler.sendEmptyMessageAtTime(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b6, B:17:0x00bc, B:18:0x00bf, B:19:0x00c5, B:21:0x00cf, B:23:0x00d7, B:27:0x00df, B:28:0x00e9, B:30:0x00f9, B:34:0x0103, B:37:0x0115, B:40:0x011e), top: B:5:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void seekToInternal(SeekPosition seekPosition) throws ExoPlaybackException {
        long longValue;
        long j;
        boolean z;
        MediaSource.MediaPeriodId mediaPeriodId;
        long adResumePositionUs;
        long j2;
        long j3;
        long j4;
        long j5;
        PlaybackInfo playbackInfo;
        int i;
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(this.playbackInfo.timeline, seekPosition, true, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        try {
            if (resolveSeekPositionUs == null) {
                Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
                mediaPeriodId = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
                longValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
                z = !this.playbackInfo.timeline.isEmpty();
                j = -9223372036854775807L;
            } else {
                Object obj = resolveSeekPositionUs.first;
                longValue = ((Long) resolveSeekPositionUs.second).longValue();
                long j6 = seekPosition.windowPositionUs == -9223372036854775807L ? -9223372036854775807L : longValue;
                MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(this.playbackInfo.timeline, obj, longValue);
                if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                    this.playbackInfo.timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
                    adResumePositionUs = this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup ? this.period.getAdResumePositionUs() : 0L;
                    j2 = j6;
                    mediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                    z = true;
                    if (!this.playbackInfo.timeline.isEmpty()) {
                        this.pendingInitialSeekPosition = seekPosition;
                    } else if (resolveSeekPositionUs == null) {
                        if (this.playbackInfo.playbackState != 1) {
                            setState(4);
                        }
                        resetInternal(false, true, false, true);
                    } else {
                        if (mediaPeriodId.equals(this.playbackInfo.periodId)) {
                            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                            j4 = (playingPeriod == null || !playingPeriod.prepared || adResumePositionUs == 0) ? adResumePositionUs : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(adResumePositionUs, this.seekParameters);
                            if (Util.usToMs(j4) == Util.usToMs(this.playbackInfo.positionUs) && ((i = (playbackInfo = this.playbackInfo).playbackState) == 2 || i == 3)) {
                                long j7 = playbackInfo.positionUs;
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j7, j2, j7, z, 2);
                                return;
                            }
                        } else {
                            j4 = adResumePositionUs;
                        }
                        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, j4, this.playbackInfo.playbackState == 4);
                        z |= adResumePositionUs != seekToPeriodPosition;
                        try {
                            PlaybackInfo playbackInfo2 = this.playbackInfo;
                            Timeline timeline = playbackInfo2.timeline;
                            updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, timeline, playbackInfo2.periodId, j2, true);
                            j5 = seekToPeriodPosition;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j2, j5, z, 2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            j3 = seekToPeriodPosition;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j3, j2, j3, z, 2);
                            throw th;
                        }
                    }
                    j5 = adResumePositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j2, j5, z, 2);
                    return;
                }
                j = j6;
                z = seekPosition.windowPositionUs == -9223372036854775807L;
                mediaPeriodId = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
            }
            if (!this.playbackInfo.timeline.isEmpty()) {
            }
            j5 = adResumePositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j2, j5, z, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j3 = adResumePositionUs;
        }
        adResumePositionUs = longValue;
        j2 = j;
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z);
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) throws ExoPlaybackException {
        stopRenderers();
        updateRebufferingState(false, true);
        if (z2 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j) < 0)) {
            disableRenderers();
            if (mediaPeriodHolder != null) {
                while (this.queue.getPlayingPeriod() != mediaPeriodHolder) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(mediaPeriodHolder);
                mediaPeriodHolder.setRendererOffset(1000000000000L);
                enableRenderers();
                mediaPeriodHolder.allRenderersInCorrectState = true;
            }
        }
        disableAndResetPrewarmingRenderers();
        if (mediaPeriodHolder != null) {
            this.queue.removeAfter(mediaPeriodHolder);
            if (!mediaPeriodHolder.prepared) {
                mediaPeriodHolder.info = mediaPeriodHolder.info.copyWithStartPositionUs(j);
            } else if (mediaPeriodHolder.hasEnabledTracks) {
                j = mediaPeriodHolder.mediaPeriod.seekToUs(j);
                mediaPeriodHolder.mediaPeriod.discardBuffer(j - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private void resetRendererPosition(long j) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + 1000000000000L : playingPeriod.toRendererTime(j);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.resetPosition(playingPeriod, this.rendererPositionUs);
        }
        notifyTrackSelectionDiscontinuity();
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        setMediaClockPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setForegroundModeInternal(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (RendererHolder rendererHolder : this.renderers) {
                    rendererHolder.reset();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setVideoOutputInternal(@Nullable Object obj, @Nullable AtomicBoolean atomicBoolean) throws ExoPlaybackException {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVideoOutput(obj);
        }
        int i = this.playbackInfo.playbackState;
        if (i == 3 || i == 2) {
            this.handler.sendEmptyMessage(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        this.audioFocusManager.updateAudioFocus(this.playbackInfo.playWhenReady, 1);
        setState(1);
    }

    private void releaseInternal() {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            this.audioFocusManager.release();
            this.trackSelector.release();
            setState(1);
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r2.equals(r33.playbackInfo.periodId) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void resetInternal(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        Timeline timeline;
        MediaSource.MediaPeriodId mediaPeriodId;
        this.handler.removeMessages(2);
        this.pendingRecoverableRendererError = null;
        boolean z5 = true;
        updateRebufferingState(false, true);
        this.mediaClock.stop();
        this.rendererPositionUs = 1000000000000L;
        try {
            disableRenderers();
        } catch (ExoPlaybackException | RuntimeException e) {
            Log.e(TAG, "Disable failed.", e);
        }
        if (z) {
            for (RendererHolder rendererHolder : this.renderers) {
                try {
                    rendererHolder.reset();
                } catch (RuntimeException e2) {
                    Log.e(TAG, "Reset failed.", e2);
                }
            }
        }
        this.enabledRendererCount = 0;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        long j2 = playbackInfo.positionUs;
        if (this.playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) {
            j = this.playbackInfo.requestedContentPositionUs;
        } else {
            j = this.playbackInfo.positionUs;
        }
        if (z2) {
            this.pendingInitialSeekPosition = null;
            Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
            mediaPeriodId2 = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            j2 = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            j = -9223372036854775807L;
        }
        z5 = false;
        long j3 = j2;
        long j4 = j;
        this.queue.clear();
        this.shouldContinueLoading = false;
        Timeline timeline2 = this.playbackInfo.timeline;
        if (z3 && (timeline2 instanceof PlaylistTimeline)) {
            timeline2 = ((PlaylistTimeline) timeline2).copyWithPlaceholderTimeline(this.mediaSourceList.getShuffleOrder());
            if (mediaPeriodId2.adGroupIndex != -1) {
                timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period);
                if (timeline2.getWindow(this.period.windowIndex, this.window).isLive()) {
                    timeline = timeline2;
                    mediaPeriodId = new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber);
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    int i = playbackInfo2.playbackState;
                    ExoPlaybackException exoPlaybackException = z4 ? null : playbackInfo2.playbackError;
                    TrackGroupArray trackGroupArray = !z5 ? TrackGroupArray.EMPTY : playbackInfo2.trackGroups;
                    TrackSelectorResult trackSelectorResult = !z5 ? this.emptyTrackSelectorResult : playbackInfo2.trackSelectorResult;
                    List of = !z5 ? ImmutableList.of() : playbackInfo2.staticMetadata;
                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                    this.playbackInfo = new PlaybackInfo(timeline, mediaPeriodId, j4, j3, i, exoPlaybackException, false, trackGroupArray, trackSelectorResult, of, mediaPeriodId, playbackInfo3.playWhenReady, playbackInfo3.playWhenReadyChangeReason, playbackInfo3.playbackSuppressionReason, playbackInfo3.playbackParameters, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    this.queue.releasePreloadPool();
                    this.mediaSourceList.release();
                    return;
                }
            }
        }
        timeline = timeline2;
        mediaPeriodId = mediaPeriodId2;
        PlaybackInfo playbackInfo22 = this.playbackInfo;
        int i2 = playbackInfo22.playbackState;
        ExoPlaybackException exoPlaybackException2 = z4 ? null : playbackInfo22.playbackError;
        TrackGroupArray trackGroupArray2 = !z5 ? TrackGroupArray.EMPTY : playbackInfo22.trackGroups;
        TrackSelectorResult trackSelectorResult2 = !z5 ? this.emptyTrackSelectorResult : playbackInfo22.trackSelectorResult;
        List of2 = !z5 ? ImmutableList.of() : playbackInfo22.staticMetadata;
        PlaybackInfo playbackInfo32 = this.playbackInfo;
        this.playbackInfo = new PlaybackInfo(timeline, mediaPeriodId, j4, j3, i2, exoPlaybackException2, false, trackGroupArray2, trackSelectorResult2, of2, mediaPeriodId, playbackInfo32.playWhenReady, playbackInfo32.playWhenReadyChangeReason, playbackInfo32.playbackSuppressionReason, playbackInfo32.playbackParameters, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), -9223372036854775807L);
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long longValue = ((Long) periodPositionUs.second).longValue();
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            longValue = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return Pair.create(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(longValue));
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == -9223372036854775807L) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
            return;
        }
        PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
        Timeline timeline = this.playbackInfo.timeline;
        if (resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            this.pendingMessages.add(pendingMessageInfo);
            Collections.sort(this.pendingMessages);
        } else {
            playerMessage.markAsProcessed(false);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getLooper() == this.playbackLooper) {
            deliverMessage(playerMessage);
            int i = this.playbackInfo.playbackState;
            if (i == 3 || i == 2) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.handler.obtainMessage(15, playerMessage).sendToTarget();
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        } else {
            this.clock.createHandler(looper, null).post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.this.lambda$sendMessageToTargetThread$2(playerMessage);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$2(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e) {
            Log.e(TAG, "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        for (int size = this.pendingMessages.size() - 1; size >= 0; size--) {
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline, timeline2, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
        }
        Collections.sort(this.pendingMessages);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j, long j2) throws ExoPlaybackException {
        PendingMessageInfo pendingMessageInfo;
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            j--;
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        int min = Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        PendingMessageInfo pendingMessageInfo2 = min > 0 ? this.pendingMessages.get(min - 1) : null;
        while (pendingMessageInfo2 != null) {
            int i = pendingMessageInfo2.resolvedPeriodIndex;
            if (i <= indexOfPeriod && (i != indexOfPeriod || pendingMessageInfo2.resolvedPeriodTimeUs <= j)) {
                break;
            }
            int i2 = min - 1;
            pendingMessageInfo2 = i2 > 0 ? this.pendingMessages.get(min - 2) : null;
            min = i2;
        }
        if (min < this.pendingMessages.size()) {
            pendingMessageInfo = this.pendingMessages.get(min);
            while (pendingMessageInfo != null && pendingMessageInfo.resolvedPeriodUid != null) {
                int i3 = pendingMessageInfo.resolvedPeriodIndex;
                if (i3 >= indexOfPeriod && (i3 != indexOfPeriod || pendingMessageInfo.resolvedPeriodTimeUs > j)) {
                    break;
                }
                min++;
                if (min < this.pendingMessages.size()) {
                    pendingMessageInfo = this.pendingMessages.get(min);
                }
            }
            while (pendingMessageInfo != null && pendingMessageInfo.resolvedPeriodUid != null && pendingMessageInfo.resolvedPeriodIndex == indexOfPeriod) {
                long j3 = pendingMessageInfo.resolvedPeriodTimeUs;
                if (j3 <= j || j3 > j2) {
                    break;
                }
                try {
                    sendMessageToTarget(pendingMessageInfo.message);
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(min);
                    } else {
                        min++;
                    }
                    pendingMessageInfo = min < this.pendingMessages.size() ? this.pendingMessages.get(min) : null;
                } catch (Throwable th) {
                    if (pendingMessageInfo.message.getDeleteAfterDelivery() || pendingMessageInfo.message.isCanceled()) {
                        this.pendingMessages.remove(min);
                    }
                    throw th;
                }
            }
            this.nextPendingMessageIndexHint = min;
            return;
        }
        pendingMessageInfo = null;
    }

    private void disableRenderers() throws ExoPlaybackException {
        for (int i = 0; i < this.renderers.length; i++) {
            disableRenderer(i);
        }
        this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
    }

    private void disableRenderer(int i) throws ExoPlaybackException {
        int enabledRendererCount = this.renderers[i].getEnabledRendererCount();
        this.renderers[i].disable(this.mediaClock);
        maybeTriggerOnRendererReadyChanged(i, false);
        this.enabledRendererCount -= enabledRendererCount;
    }

    private void disableAndResetPrewarmingRenderers() {
        if (this.hasSecondaryRenderers && areRenderersPrewarming()) {
            for (RendererHolder rendererHolder : this.renderers) {
                int enabledRendererCount = rendererHolder.getEnabledRendererCount();
                rendererHolder.disablePrewarming(this.mediaClock);
                this.enabledRendererCount -= enabledRendererCount - rendererHolder.getEnabledRendererCount();
            }
            this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
        }
    }

    private void reselectTracksInternalAndSeek() throws ExoPlaybackException {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void reselectTracksInternal() throws ExoPlaybackException {
        boolean z;
        float f = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z2 = 1;
        TrackSelectorResult trackSelectorResult = null;
        boolean z3 = true;
        while (playingPeriod != null && playingPeriod.prepared) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            TrackSelectorResult selectTracks = playingPeriod.selectTracks(f, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (playingPeriod == this.queue.getPlayingPeriod()) {
                trackSelectorResult = selectTracks;
            }
            if (selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                boolean z4 = z2;
                if (playingPeriod == readingPeriod) {
                    z3 = false;
                }
                playingPeriod = playingPeriod.getNext();
                z2 = z4;
            } else {
                if (z3) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean z5 = (this.queue.removeAfter(playingPeriod2) & z2) != 0 ? z2 : false;
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection((TrackSelectorResult) Assertions.checkNotNull(trackSelectorResult), this.playbackInfo.positionUs, z5, zArr);
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    boolean z6 = (playbackInfo2.playbackState == 4 || applyTrackSelection == playbackInfo2.positionUs) ? false : z2;
                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, applyTrackSelection, playbackInfo3.requestedContentPositionUs, playbackInfo3.discontinuityStartPositionUs, z6, 5);
                    if (z6) {
                        resetRendererPosition(applyTrackSelection);
                    }
                    disableAndResetPrewarmingRenderers();
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i = 0;
                    while (true) {
                        RendererHolder[] rendererHolderArr = this.renderers;
                        if (i >= rendererHolderArr.length) {
                            break;
                        }
                        int enabledRendererCount = rendererHolderArr[i].getEnabledRendererCount();
                        zArr2[i] = this.renderers[i].isRendererEnabled();
                        this.renderers[i].maybeDisableOrResetPosition(playingPeriod2.sampleStreams[i], this.mediaClock, this.rendererPositionUs, zArr[i]);
                        if (enabledRendererCount - this.renderers[i].getEnabledRendererCount() > 0) {
                            maybeTriggerOnRendererReadyChanged(i, false);
                        }
                        this.enabledRendererCount -= enabledRendererCount - this.renderers[i].getEnabledRendererCount();
                        i++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                    playingPeriod2.allRenderersInCorrectState = true;
                    z = true;
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        long max = Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs));
                        if (this.hasSecondaryRenderers && areRenderersPrewarming() && this.queue.getPrewarmingPeriod() == playingPeriod) {
                            disableAndResetPrewarmingRenderers();
                        }
                        playingPeriod.applyTrackSelection(selectTracks, max, false);
                    }
                    z = true;
                }
                handleLoadingMediaPeriodChanged(z);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
        }
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f);
                }
            }
        }
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z3 = loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal;
        if (loadingPeriod.info.id.isAd() && !loadingPeriod.prepared) {
            z2 = true;
        }
        if (z3 || z2) {
            return true;
        }
        return this.loadControl.shouldStartPlayback(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, playingPeriod.info.id, playingPeriod.toPeriodTime(this.rendererPositionUs), getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, targetLiveOffsetUs, this.lastRebufferRealtimeMs));
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        return playingPeriod.prepared && (j == -9223372036854775807L || this.playbackInfo.positionUs < j || !shouldPlayWhenReady());
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c5 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:76:0x00bd, B:78:0x00c5, B:79:0x00cd, B:81:0x00d1, B:23:0x00dd, B:25:0x00e9, B:27:0x00f1, B:29:0x00fb, B:31:0x0108, B:34:0x010d), top: B:21:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:76:0x00bd, B:78:0x00c5, B:79:0x00cd, B:81:0x00d1, B:23:0x00dd, B:25:0x00e9, B:27:0x00f1, B:29:0x00fb, B:31:0x0108, B:34:0x010d), top: B:21:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleMediaSourceListInfoRefreshed(Timeline timeline, boolean z) throws ExoPlaybackException {
        int i;
        long j;
        SeekPosition seekPosition;
        long j2;
        int i2;
        boolean z2;
        long j3;
        long j4;
        int updateQueuedPeriods;
        PositionUpdateForPlaylistChange resolvePositionForPlaylistChange = resolvePositionForPlaylistChange(timeline, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        MediaSource.MediaPeriodId mediaPeriodId = resolvePositionForPlaylistChange.periodId;
        long j5 = resolvePositionForPlaylistChange.requestedContentPositionUs;
        boolean z3 = resolvePositionForPlaylistChange.forceBufferingState;
        long j6 = resolvePositionForPlaylistChange.periodPositionUs;
        boolean z4 = (this.playbackInfo.periodId.equals(mediaPeriodId) && j6 == this.playbackInfo.positionUs) ? false : true;
        try {
            if (resolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
        } catch (Throwable th) {
            th = th;
            i = 4;
            j = j5;
        }
        try {
            for (RendererHolder rendererHolder : this.renderers) {
                rendererHolder.setTimeline(timeline);
            }
            try {
                if (z4) {
                    z2 = false;
                    j3 = j5;
                    i2 = 4;
                    j4 = j6;
                    if (!timeline.isEmpty()) {
                        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                            if (playingPeriod.info.id.equals(mediaPeriodId)) {
                                playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(timeline, playingPeriod.info);
                                playingPeriod.updateClipping();
                            }
                        }
                        j4 = seekToPeriodPosition(mediaPeriodId, j4, z3);
                    }
                } else {
                    try {
                        long maxRendererReadPositionUs = this.queue.getReadingPeriod() == null ? 0L : getMaxRendererReadPositionUs(this.queue.getReadingPeriod());
                        if (areRenderersPrewarming() && this.queue.getPrewarmingPeriod() != null) {
                            j2 = getMaxRendererReadPositionUs(this.queue.getPrewarmingPeriod());
                            i2 = 4;
                            z2 = false;
                            long j7 = maxRendererReadPositionUs;
                            j3 = j5;
                            j4 = j6;
                            updateQueuedPeriods = this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, j7, j2);
                            if ((updateQueuedPeriods & 1) == 0) {
                                seekToCurrentPosition(false);
                            } else if ((updateQueuedPeriods & 2) != 0) {
                                disableAndResetPrewarmingRenderers();
                            }
                        }
                        j2 = 0;
                        i2 = 4;
                        z2 = false;
                        long j72 = maxRendererReadPositionUs;
                        j3 = j5;
                        j4 = j6;
                        updateQueuedPeriods = this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, j72, j2);
                        if ((updateQueuedPeriods & 1) == 0) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = j5;
                        i = 4;
                        j5 = j6;
                        seekPosition = null;
                        PlaybackInfo playbackInfo = this.playbackInfo;
                        SeekPosition seekPosition2 = seekPosition;
                        updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, playbackInfo.timeline, playbackInfo.periodId, !resolvePositionForPlaylistChange.setTargetLiveOffset ? j5 : -9223372036854775807L, false);
                        if (!z4 || j != this.playbackInfo.requestedContentPositionUs) {
                            PlaybackInfo playbackInfo2 = this.playbackInfo;
                            Object obj = playbackInfo2.periodId.periodUid;
                            Timeline timeline2 = playbackInfo2.timeline;
                            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j, this.playbackInfo.discontinuityStartPositionUs, (z4 || !z || timeline2.isEmpty() || timeline2.getPeriodByUid(obj, this.period).isPlaceholder) ? false : true, timeline.getIndexOfPeriod(obj) == -1 ? i : 3);
                        }
                        resetPendingPauseAtEndOfPeriod();
                        resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                        this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                        if (!timeline.isEmpty()) {
                            this.pendingInitialSeekPosition = seekPosition2;
                        }
                        handleLoadingMediaPeriodChanged(false);
                        this.handler.sendEmptyMessage(2);
                        throw th;
                    }
                }
                PlaybackInfo playbackInfo3 = this.playbackInfo;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, playbackInfo3.timeline, playbackInfo3.periodId, resolvePositionForPlaylistChange.setTargetLiveOffset ? j4 : -9223372036854775807L, false);
                if (z4 || j3 != this.playbackInfo.requestedContentPositionUs) {
                    PlaybackInfo playbackInfo4 = this.playbackInfo;
                    Object obj2 = playbackInfo4.periodId.periodUid;
                    Timeline timeline3 = playbackInfo4.timeline;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j4, j3, this.playbackInfo.discontinuityStartPositionUs, (!z4 || !z || timeline3.isEmpty() || timeline3.getPeriodByUid(obj2, this.period).isPlaceholder) ? z2 : true, timeline.getIndexOfPeriod(obj2) == -1 ? i2 : 3);
                }
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
                if (!timeline.isEmpty()) {
                    this.pendingInitialSeekPosition = null;
                }
                handleLoadingMediaPeriodChanged(z2);
                this.handler.sendEmptyMessage(2);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            j = j5;
            i = 4;
            j5 = j6;
            seekPosition = null;
            PlaybackInfo playbackInfo5 = this.playbackInfo;
            SeekPosition seekPosition22 = seekPosition;
            updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, playbackInfo5.timeline, playbackInfo5.periodId, !resolvePositionForPlaylistChange.setTargetLiveOffset ? j5 : -9223372036854775807L, false);
            if (!z4) {
            }
            PlaybackInfo playbackInfo22 = this.playbackInfo;
            Object obj3 = playbackInfo22.periodId.periodUid;
            Timeline timeline22 = playbackInfo22.timeline;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j5, j, this.playbackInfo.discontinuityStartPositionUs, (z4 || !z || timeline22.isEmpty() || timeline22.getPeriodByUid(obj3, this.period).isPlaceholder) ? false : true, timeline.getIndexOfPeriod(obj3) == -1 ? i : 3);
            resetPendingPauseAtEndOfPeriod();
            resolvePendingMessagePositions(timeline, this.playbackInfo.timeline);
            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline);
            if (!timeline.isEmpty()) {
            }
            handleLoadingMediaPeriodChanged(false);
            this.handler.sendEmptyMessage(2);
            throw th;
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z) throws ExoPlaybackException {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            setMediaClockPlaybackParameters(playbackParameters);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
        if (j != -9223372036854775807L) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j));
            return;
        }
        if (!Objects.equals(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid) || z) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(-9223372036854775807L);
        }
    }

    private long getMaxRendererReadPositionUs(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long rendererOffset = mediaPeriodHolder.getRendererOffset();
        if (!mediaPeriodHolder.prepared) {
            return rendererOffset;
        }
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i >= rendererHolderArr.length) {
                return rendererOffset;
            }
            if (rendererHolderArr[i].isReadingFromPeriod(mediaPeriodHolder)) {
                long readingPositionUs = this.renderers[i].getReadingPositionUs(mediaPeriodHolder);
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i++;
        }
    }

    private void updatePeriods() throws ExoPlaybackException {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        boolean maybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        maybeUpdatePrewarmingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(maybeUpdateLoadingPeriod);
    }

    private boolean maybeUpdateLoadingPeriod() throws ExoPlaybackException {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        boolean z = false;
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(nextMediaPeriodInfo);
            if (!enqueueNextMediaPeriodHolder.prepareCalled) {
                enqueueNextMediaPeriodHolder.prepare(this, nextMediaPeriodInfo.startPositionUs);
            } else if (enqueueNextMediaPeriodHolder.prepared) {
                this.handler.obtainMessage(8, enqueueNextMediaPeriodHolder.mediaPeriod).sendToTarget();
            }
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
            z = true;
        }
        if (this.shouldContinueLoading) {
            this.shouldContinueLoading = isLoadingPossible(this.queue.getLoadingPeriod());
            updateIsLoading();
        } else {
            maybeContinueLoading();
        }
        return z;
    }

    private void maybeUpdatePrewarmingPeriod() throws ExoPlaybackException {
        MediaPeriodHolder prewarmingPeriod;
        if (this.pendingPauseAtEndOfPeriod || !this.hasSecondaryRenderers || this.isPrewarmingDisabledUntilNextTransition || areRenderersPrewarming() || (prewarmingPeriod = this.queue.getPrewarmingPeriod()) == null || prewarmingPeriod != this.queue.getReadingPeriod() || prewarmingPeriod.getNext() == null || !prewarmingPeriod.getNext().prepared) {
            return;
        }
        this.queue.advancePrewarmingPeriod();
        maybePrewarmRenderers();
    }

    private void maybePrewarmRenderers() throws ExoPlaybackException {
        MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod();
        if (prewarmingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = prewarmingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i) && this.renderers[i].hasSecondary() && !this.renderers[i].isPrewarming()) {
                this.renderers[i].startPrewarming();
                enableRenderer(prewarmingPeriod, i, false, prewarmingPeriod.getStartPositionRendererTime());
            }
        }
        if (areRenderersPrewarming()) {
            this.prewarmingMediaPeriodDiscontinuity = prewarmingPeriod.mediaPeriod.readDiscontinuity();
            if (prewarmingPeriod.isFullyBuffered()) {
                return;
            }
            this.queue.removeAfter(prewarmingPeriod);
            handleLoadingMediaPeriodChanged(false);
            maybeContinueLoading();
        }
    }

    private void maybeUpdateReadingPeriod() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i = 0;
        if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
            if (readingPeriod.info.isFinal || this.pendingPauseAtEndOfPeriod) {
                RendererHolder[] rendererHolderArr = this.renderers;
                int length = rendererHolderArr.length;
                while (i < length) {
                    RendererHolder rendererHolder = rendererHolderArr[i];
                    if (rendererHolder.isReadingFromPeriod(readingPeriod) && rendererHolder.hasReadPeriodToEnd(readingPeriod)) {
                        long j = readingPeriod.info.durationUs;
                        rendererHolder.setCurrentStreamFinal(readingPeriod, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (hasReadingPeriodFinishedReading()) {
            if (areRenderersPrewarming() && this.queue.getPrewarmingPeriod() == this.queue.getReadingPeriod()) {
                return;
            }
            if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                Timeline timeline = this.playbackInfo.timeline;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, advanceReadingPeriod.info.id, timeline, readingPeriod.info.id, -9223372036854775807L, false);
                if (advanceReadingPeriod.prepared && ((this.hasSecondaryRenderers && this.prewarmingMediaPeriodDiscontinuity != -9223372036854775807L) || advanceReadingPeriod.mediaPeriod.readDiscontinuity() != -9223372036854775807L)) {
                    this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
                    boolean z = this.hasSecondaryRenderers && !this.isPrewarmingDisabledUntilNextTransition;
                    if (z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= this.renderers.length) {
                                break;
                            }
                            if (trackSelectorResult2.isRendererEnabled(i2) && !MimeTypes.allSamplesAreSyncSamples(trackSelectorResult2.selections[i2].getSelectedFormat().sampleMimeType, trackSelectorResult2.selections[i2].getSelectedFormat().codecs) && !this.renderers[i2].isPrewarming()) {
                                z = false;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (!z) {
                        setAllNonPrewarmingRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                        if (advanceReadingPeriod.isFullyBuffered()) {
                            return;
                        }
                        this.queue.removeAfter(advanceReadingPeriod);
                        handleLoadingMediaPeriodChanged(false);
                        maybeContinueLoading();
                        return;
                    }
                }
                RendererHolder[] rendererHolderArr2 = this.renderers;
                int length2 = rendererHolderArr2.length;
                while (i < length2) {
                    rendererHolderArr2[i].maybeSetOldStreamToFinal(trackSelectorResult, trackSelectorResult2, advanceReadingPeriod.getStartPositionRendererTime());
                    i++;
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !updateRenderersForTransition()) {
            return;
        }
        this.queue.getReadingPeriod().allRenderersInCorrectState = true;
    }

    private boolean updateRenderersForTransition() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        boolean z = true;
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i >= rendererHolderArr.length) {
                break;
            }
            int enabledRendererCount = rendererHolderArr[i].getEnabledRendererCount();
            int replaceStreamsOrDisableRendererForTransition = this.renderers[i].replaceStreamsOrDisableRendererForTransition(readingPeriod, trackSelectorResult, this.mediaClock);
            if ((replaceStreamsOrDisableRendererForTransition & 2) != 0 && this.offloadSchedulingEnabled) {
                setOffloadSchedulingEnabled(false);
            }
            this.enabledRendererCount -= enabledRendererCount - this.renderers[i].getEnabledRendererCount();
            z &= (replaceStreamsOrDisableRendererForTransition & 1) != 0;
            i++;
        }
        if (z) {
            for (int i2 = 0; i2 < this.renderers.length; i2++) {
                if (trackSelectorResult.isRendererEnabled(i2) && !this.renderers[i2].isReadingFromPeriod(readingPeriod)) {
                    enableRenderer(readingPeriod, i2, false, readingPeriod.getStartPositionRendererTime());
                }
            }
        }
        return z;
    }

    private void maybeUpdatePreloadPeriods(boolean z) {
        if (this.preloadConfiguration.targetPreloadDurationUs == -9223372036854775807L) {
            return;
        }
        if (z || !this.playbackInfo.timeline.equals(this.lastPreloadPoolInvalidationTimeline)) {
            Timeline timeline = this.playbackInfo.timeline;
            this.lastPreloadPoolInvalidationTimeline = timeline;
            this.queue.invalidatePreloadPool(timeline);
        }
        maybeContinuePreloading();
    }

    private void maybeContinuePreloading() {
        this.queue.maybeUpdatePreloadMediaPeriodHolder();
        MediaPeriodHolder preloadingPeriod = this.queue.getPreloadingPeriod();
        if (preloadingPeriod != null) {
            if ((!preloadingPeriod.prepareCalled || preloadingPeriod.prepared) && !preloadingPeriod.mediaPeriod.isLoading()) {
                if (this.loadControl.shouldContinuePreloading(this.playbackInfo.timeline, preloadingPeriod.info.id, preloadingPeriod.prepared ? preloadingPeriod.mediaPeriod.getBufferedPositionUs() : 0L)) {
                    if (!preloadingPeriod.prepareCalled) {
                        preloadingPeriod.prepare(this, preloadingPeriod.info.startPositionUs);
                    } else {
                        preloadingPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
        boolean z;
        boolean z2 = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z2) {
                maybeNotifyPlaybackInfoChanged();
            }
            this.isPrewarmingDisabledUntilNextTransition = false;
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.advancePlayingPeriod());
            if (this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolder.info.id.periodUid)) {
                MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
                if (mediaPeriodId.adGroupIndex == -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolder.info.id;
                    if (mediaPeriodId2.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex != mediaPeriodId2.nextAdGroupIndex) {
                        z = true;
                        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
                        MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo.id;
                        long j = mediaPeriodInfo.startPositionUs;
                        this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId3, j, mediaPeriodInfo.requestedContentPositionUs, j, !z, 0);
                        resetPendingPauseAtEndOfPeriod();
                        updatePlaybackPositions();
                        if (areRenderersPrewarming() && mediaPeriodHolder == this.queue.getPrewarmingPeriod()) {
                            maybeHandlePrewarmingTransition();
                        }
                        if (this.playbackInfo.playbackState != 3) {
                            startRenderers();
                        }
                        allowRenderersToRenderStartOfStreams();
                        z2 = true;
                    }
                }
            }
            z = false;
            MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
            MediaSource.MediaPeriodId mediaPeriodId32 = mediaPeriodInfo2.id;
            long j2 = mediaPeriodInfo2.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId32, j2, mediaPeriodInfo2.requestedContentPositionUs, j2, !z, 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            if (areRenderersPrewarming()) {
                maybeHandlePrewarmingTransition();
            }
            if (this.playbackInfo.playbackState != 3) {
            }
            allowRenderersToRenderStartOfStreams();
            z2 = true;
        }
    }

    private void maybeHandlePrewarmingTransition() throws ExoPlaybackException {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.maybeHandlePrewarmingTransition();
        }
    }

    private void maybeUpdateOffloadScheduling() {
        MediaPeriodHolder playingPeriod;
        boolean z;
        if (this.queue.getPlayingPeriod() == this.queue.getReadingPeriod() && (playingPeriod = this.queue.getPlayingPeriod()) != null) {
            TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.renderers.length) {
                    z = true;
                    break;
                }
                if (trackSelectorResult.isRendererEnabled(i)) {
                    if (this.renderers[i].getTrackType() != 1) {
                        z = false;
                        break;
                    } else if (trackSelectorResult.rendererConfigurations[i].offloadModePreferred != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            setOffloadSchedulingEnabled(z2);
        }
    }

    private void allowRenderersToRenderStartOfStreams() {
        TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].enableMayRenderStartOfStream();
            }
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i >= rendererHolderArr.length) {
                return true;
            }
            if (!rendererHolderArr[i].hasFinishedReadingFromPeriod(readingPeriod)) {
                return false;
            }
            i++;
        }
    }

    private void setAllNonPrewarmingRendererStreamsFinal(long j) {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setAllNonPrewarmingRendererStreamsFinal(j);
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            handleLoadingPeriodPrepared((MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod()));
            return;
        }
        MediaPeriodHolder preloadHolderByMediaPeriod = this.queue.getPreloadHolderByMediaPeriod(mediaPeriod);
        if (preloadHolderByMediaPeriod != null) {
            Assertions.checkState(!preloadHolderByMediaPeriod.prepared);
            float f = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            preloadHolderByMediaPeriod.handlePrepared(f, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (this.queue.isPreloading(mediaPeriod)) {
                maybeContinuePreloading();
            }
        }
    }

    private void handleLoadingPeriodPrepared(MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        if (!mediaPeriodHolder.prepared) {
            float f = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            mediaPeriodHolder.handlePrepared(f, playbackInfo.timeline, playbackInfo.playWhenReady);
        }
        updateLoadControlTrackSelection(mediaPeriodHolder.info.id, mediaPeriodHolder.getTrackGroups(), mediaPeriodHolder.getTrackSelectorResult());
        if (mediaPeriodHolder == this.queue.getPlayingPeriod()) {
            resetRendererPosition(mediaPeriodHolder.info.startPositionUs);
            enableRenderers();
            mediaPeriodHolder.allRenderersInCorrectState = true;
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
            long j = mediaPeriodHolder.info.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j, playbackInfo2.requestedContentPositionUs, j, false, 5);
        }
        maybeContinueLoading();
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        } else if (this.queue.isPreloading(mediaPeriod)) {
            maybeContinuePreloading();
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z) throws ExoPlaybackException {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z);
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setPlaybackSpeed(f, playbackParameters.speed);
        }
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod());
            mediaPeriodHolder.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(mediaPeriodHolder.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
        }
        updateIsLoading();
    }

    private boolean shouldContinueLoading() {
        long periodTime;
        if (!isLoadingPossible(this.queue.getLoadingPeriod())) {
            return false;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        if (loadingPeriod == this.queue.getPlayingPeriod()) {
            periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs);
        } else {
            periodTime = loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs;
        }
        LoadControl.Parameters parameters = new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, loadingPeriod.info.id, periodTime, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L, this.lastRebufferRealtimeMs);
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(parameters);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (shouldContinueLoading || !playingPeriod.prepared || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US) {
            return shouldContinueLoading;
        }
        if (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe) {
            return shouldContinueLoading;
        }
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(parameters);
    }

    private boolean isLoadingPossible(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        return (mediaPeriodHolder == null || mediaPeriodHolder.hasLoadingError() || mediaPeriodHolder.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckResult
    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, int i) {
        List list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        TrackGroupArray trackGroups;
        TrackSelectorResult trackSelectorResult2;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult3 = playbackInfo.trackSelectorResult;
        List list2 = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            if (playingPeriod == null) {
                trackGroups = TrackGroupArray.EMPTY;
            } else {
                trackGroups = playingPeriod.getTrackGroups();
            }
            if (playingPeriod == null) {
                trackSelectorResult2 = this.emptyTrackSelectorResult;
            } else {
                trackSelectorResult2 = playingPeriod.getTrackSelectorResult();
            }
            List extractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult2.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j2) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j2);
                }
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult2;
            list = extractMetadataFromTrackSelectionArray;
        } else if (mediaPeriodId.equals(this.playbackInfo.periodId)) {
            list = list2;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult3;
        } else {
            trackGroupArray = TrackGroupArray.EMPTY;
            trackSelectorResult = this.emptyTrackSelectorResult;
            list = ImmutableList.of();
        }
        if (z) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j2, j3, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    builder.add((Object) new Metadata(new Metadata.Entry[0]));
                } else {
                    builder.add((Object) metadata);
                    z = true;
                }
            }
        }
        return z ? builder.build() : ImmutableList.of();
    }

    private void enableRenderers() throws ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length], this.queue.getReadingPeriod().getStartPositionRendererTime());
    }

    private void enableRenderers(boolean[] zArr, long j) throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i = 0; i < this.renderers.length; i++) {
            if (!trackSelectorResult.isRendererEnabled(i)) {
                this.renderers[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.renderers.length; i2++) {
            if (trackSelectorResult.isRendererEnabled(i2) && !this.renderers[i2].isReadingFromPeriod(readingPeriod)) {
                enableRenderer(readingPeriod, i2, zArr[i2], j);
            }
        }
    }

    private void enableRenderer(MediaPeriodHolder mediaPeriodHolder, int i, boolean z, long j) throws ExoPlaybackException {
        RendererHolder rendererHolder = this.renderers[i];
        if (rendererHolder.isRendererEnabled()) {
            return;
        }
        boolean z2 = mediaPeriodHolder == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i];
        ExoTrackSelection exoTrackSelection = trackSelectorResult.selections[i];
        boolean z3 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z4 = !z && z3;
        this.enabledRendererCount++;
        rendererHolder.enable(rendererConfiguration, exoTrackSelection, mediaPeriodHolder.sampleStreams[i], this.rendererPositionUs, z4, z2, j, mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.id, this.mediaClock);
        rendererHolder.handleMessage(11, new Renderer.WakeupListener() { // from class: io.bidmachine.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // io.bidmachine.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // io.bidmachine.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                if (ExoPlayerImplInternal.this.dynamicSchedulingEnabled || ExoPlayerImplInternal.this.offloadSchedulingEnabled) {
                    ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
                }
            }
        }, mediaPeriodHolder);
        if (z3 && z2) {
            rendererHolder.start();
        }
    }

    private void releaseRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            this.rendererCapabilities[i].clearListener();
            this.renderers[i].release();
        }
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        long bufferedPositionUs;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.id;
        boolean equals = this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (!equals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (loadingPeriod == null) {
            bufferedPositionUs = playbackInfo.positionUs;
        } else {
            bufferedPositionUs = loadingPeriod.getBufferedPositionUs();
        }
        playbackInfo.bufferedPositionUs = bufferedPositionUs;
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((!equals || z) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private long getTotalBufferedDurationUs(long j) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void updateLoadControlTrackSelection(MediaSource.MediaPeriodId mediaPeriodId, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        long periodTime;
        MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod());
        if (mediaPeriodHolder == this.queue.getPlayingPeriod()) {
            periodTime = mediaPeriodHolder.toPeriodTime(this.rendererPositionUs);
        } else {
            periodTime = mediaPeriodHolder.toPeriodTime(this.rendererPositionUs) - mediaPeriodHolder.info.startPositionUs;
        }
        this.loadControl.onTracksSelected(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, mediaPeriodId, periodTime, getTotalBufferedDurationUs(mediaPeriodHolder.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, mediaPeriodHolder.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : -9223372036854775807L, this.lastRebufferRealtimeMs), trackGroupArray, trackSelectorResult.selections);
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private void maybeThrowRendererStreamError(int i) throws IOException, ExoPlaybackException {
        RendererHolder rendererHolder = this.renderers[i];
        try {
            rendererHolder.maybeThrowStreamError((MediaPeriodHolder) Assertions.checkNotNull(this.queue.getPlayingPeriod()));
        } catch (IOException | RuntimeException e) {
            int trackType = rendererHolder.getTrackType();
            if (trackType == 3 || trackType == 5) {
                TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
                Log.e(TAG, "Disabling track due to error: " + Format.toLogString(trackSelectorResult.selections[i].getSelectedFormat()), e);
                TrackSelectorResult trackSelectorResult2 = new TrackSelectorResult((RendererConfiguration[]) trackSelectorResult.rendererConfigurations.clone(), (ExoTrackSelection[]) trackSelectorResult.selections.clone(), trackSelectorResult.tracks, trackSelectorResult.info);
                trackSelectorResult2.rendererConfigurations[i] = null;
                trackSelectorResult2.selections[i] = null;
                disableRenderer(i);
                this.queue.getPlayingPeriod().applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, false);
                return;
            }
            throw e;
        }
    }

    private boolean areRenderersPrewarming() {
        if (!this.hasSecondaryRenderers) {
            return false;
        }
        for (RendererHolder rendererHolder : this.renderers) {
            if (rendererHolder.isPrewarming()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(Timeline timeline, PlaybackInfo playbackInfo, @Nullable SeekPosition seekPosition, MediaPeriodQueue mediaPeriodQueue, int i, boolean z, Timeline.Window window, Timeline.Period period) {
        long j;
        MediaSource.MediaPeriodId mediaPeriodId;
        int i2;
        MediaSource.MediaPeriodId mediaPeriodId2;
        int i3;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        MediaPeriodQueue mediaPeriodQueue2;
        long j3;
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        boolean z6;
        MediaSource.MediaPeriodId mediaPeriodId3;
        int i5;
        int i6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (timeline.isEmpty()) {
            return new PositionUpdateForPlaylistChange(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, -9223372036854775807L, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId4 = playbackInfo.periodId;
        Object obj = mediaPeriodId4.periodUid;
        boolean isUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo, period);
        if (playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod) {
            j = playbackInfo.requestedContentPositionUs;
        } else {
            j = playbackInfo.positionUs;
        }
        long j4 = j;
        if (seekPosition != null) {
            mediaPeriodId = mediaPeriodId4;
            i2 = -1;
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, seekPosition, true, i, z, window, period);
            if (resolveSeekPositionUs == null) {
                i6 = timeline.getFirstWindowIndex(z);
                j2 = j4;
                z7 = false;
                z8 = false;
                z9 = true;
            } else {
                if (seekPosition.windowPositionUs == -9223372036854775807L) {
                    i6 = timeline.getPeriodByUid(resolveSeekPositionUs.first, period).windowIndex;
                    j2 = j4;
                    z7 = false;
                } else {
                    obj = resolveSeekPositionUs.first;
                    j2 = ((Long) resolveSeekPositionUs.second).longValue();
                    i6 = -1;
                    z7 = true;
                }
                z8 = playbackInfo.playbackState == 4;
                z9 = false;
            }
            z4 = z7;
            z2 = z8;
            z3 = z9;
            i3 = i6;
        } else {
            mediaPeriodId = mediaPeriodId4;
            i2 = -1;
            if (playbackInfo.timeline.isEmpty()) {
                i4 = timeline.getFirstWindowIndex(z);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                int resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z, obj, playbackInfo.timeline, timeline);
                if (resolveSubsequentPeriod == -1) {
                    resolveSubsequentPeriod = timeline.getFirstWindowIndex(z);
                    z5 = true;
                } else {
                    z5 = false;
                }
                i3 = resolveSubsequentPeriod;
                z3 = z5;
                j2 = j4;
                z2 = false;
                z4 = false;
            } else if (j4 == -9223372036854775807L) {
                i4 = timeline.getPeriodByUid(obj, period).windowIndex;
            } else {
                if (isUsingPlaceholderPeriod) {
                    mediaPeriodId2 = mediaPeriodId;
                    playbackInfo.timeline.getPeriodByUid(mediaPeriodId2.periodUid, period);
                    if (playbackInfo.timeline.getWindow(period.windowIndex, window).firstPeriodIndex == playbackInfo.timeline.getIndexOfPeriod(mediaPeriodId2.periodUid)) {
                        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(obj, period).windowIndex, j4 + period.getPositionInWindowUs());
                        obj = periodPositionUs.first;
                        j2 = ((Long) periodPositionUs.second).longValue();
                    } else {
                        j2 = j4;
                    }
                    i3 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                } else {
                    mediaPeriodId2 = mediaPeriodId;
                    i3 = -1;
                    j2 = j4;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                }
                if (i3 == i2) {
                    Pair<Object, Long> periodPositionUs2 = timeline.getPeriodPositionUs(window, period, i3, -9223372036854775807L);
                    obj = periodPositionUs2.first;
                    j2 = ((Long) periodPositionUs2.second).longValue();
                    mediaPeriodQueue2 = mediaPeriodQueue;
                    j3 = -9223372036854775807L;
                } else {
                    mediaPeriodQueue2 = mediaPeriodQueue;
                    j3 = j2;
                }
                resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue2.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, obj, j2);
                int i7 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
                z6 = (mediaPeriodId2.periodUid.equals(obj) || mediaPeriodId2.isAd() || resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() || !(i7 != i2 || ((i5 = mediaPeriodId2.nextAdGroupIndex) != i2 && i7 >= i5))) ? false : true;
                mediaPeriodId3 = mediaPeriodId2;
                boolean isIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(isUsingPlaceholderPeriod, mediaPeriodId2, j4, resolveMediaPeriodIdForAdsAfterPeriodPositionChange, timeline.getPeriodByUid(obj, period), j3);
                if (!z6 || isIgnorableServerSideAdInsertionPeriodChange) {
                    resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodId3;
                }
                if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                    if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(mediaPeriodId3)) {
                        j2 = playbackInfo.positionUs;
                    } else {
                        timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, period);
                        j2 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? period.getAdResumePositionUs() : 0L;
                    }
                }
                return new PositionUpdateForPlaylistChange(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, j2, j3, z2, z3, z4);
            }
            i3 = i4;
            j2 = j4;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        mediaPeriodId2 = mediaPeriodId;
        if (i3 == i2) {
        }
        resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue2.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, obj, j2);
        int i72 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
        if (mediaPeriodId2.periodUid.equals(obj)) {
        }
        mediaPeriodId3 = mediaPeriodId2;
        boolean isIgnorableServerSideAdInsertionPeriodChange2 = isIgnorableServerSideAdInsertionPeriodChange(isUsingPlaceholderPeriod, mediaPeriodId2, j4, resolveMediaPeriodIdForAdsAfterPeriodPositionChange, timeline.getPeriodByUid(obj, period), j3);
        if (!z6) {
        }
        resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodId3;
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
        }
        return new PositionUpdateForPlaylistChange(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, j2, j3, z2, z3, z4);
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z, MediaSource.MediaPeriodId mediaPeriodId, long j, MediaSource.MediaPeriodId mediaPeriodId2, Timeline.Period period, long j2) {
        if (!z && j == j2 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            return (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) ? (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true : mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex);
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private void updateRebufferingState(boolean z, boolean z2) {
        this.isRebuffering = z;
        this.lastRebufferRealtimeMs = (!z || z2) ? -9223372036854775807L : this.clock.elapsedRealtime();
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? -9223372036854775807L : Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i, z, window, period);
            if (resolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(resolveSeekPositionUs.first), ((Long) resolveSeekPositionUs.second).longValue(), resolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, pendingMessageInfo.resolvedPeriodTimeUs + period.getPositionInWindowUs());
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
        int i = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i, period, true).uid;
        long j = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    @Nullable
    private static Pair<Object, Long> resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z, int i, boolean z2, Timeline.Window window, Timeline.Period period) {
        Pair<Object, Long> periodPositionUs;
        int resolveSubsequentPeriod;
        Timeline timeline2 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        Timeline timeline3 = timeline2.isEmpty() ? timeline : timeline2;
        try {
            periodPositionUs = timeline3.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline3)) {
            return periodPositionUs;
        }
        if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (timeline3.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline3.getWindow(period.windowIndex, window).firstPeriodIndex == timeline3.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
        }
        if (z && (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i, z2, periodPositionUs.first, timeline3, timeline)) != -1) {
            return timeline.getPeriodPositionUs(window, period, resolveSubsequentPeriod, -9223372036854775807L);
        }
        return null;
    }

    static int resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        Object obj2 = timeline.getWindow(timeline.getPeriodByUid(obj, period).windowIndex, window).uid;
        for (int i2 = 0; i2 < timeline2.getWindowCount(); i2++) {
            if (timeline2.getWindow(i2, window).uid.equals(obj2)) {
                return i2;
            }
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i3 = indexOfPeriod;
        int i4 = -1;
        for (int i5 = 0; i5 < periodCount && i4 == -1; i5++) {
            i3 = timeline.getNextPeriodIndex(i3, period, window, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i3));
        }
        if (i4 == -1) {
            return -1;
        }
        return timeline2.getPeriod(i4, period).windowIndex;
    }

    private static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i, long j) {
            this.timeline = timeline;
            this.windowIndex = i;
            this.windowPositionUs = j;
        }
    }

    private static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j2;
            this.forceBufferingState = z;
            this.endPlayback = z2;
            this.setTargetLiveOffset = z3;
        }
    }

    private static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;

        @Nullable
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i, long j, Object obj) {
            this.resolvedPeriodIndex = i;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i != 0 ? i : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }
    }

    private static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i;
            this.positionUs = j;
        }
    }

    private static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i, int i2, int i3, ShuffleOrder shuffleOrder) {
            this.fromIndex = i;
            this.toIndex = i2;
            this.newFromIndex = i3;
            this.shuffleOrder = shuffleOrder;
        }
    }
}
