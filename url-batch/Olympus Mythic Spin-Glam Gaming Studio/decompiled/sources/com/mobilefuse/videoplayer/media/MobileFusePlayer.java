package com.mobilefuse.videoplayer.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.telemetry.TelemetryLogger;
import com.mobilefuse.videoplayer.VideoCache;
import com.mobilefuse.videoplayer.model.VideoSource;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MobileFuseVideoBridge;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseMediaPlayer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00108\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u001eH\u0002J\u0006\u0010;\u001a\u00020\u0018J\b\u0010<\u001a\u00020\u0006H\u0002J\u0006\u0010=\u001a\u00020\u0018J\u0006\u0010>\u001a\u00020\u0018J\b\u0010?\u001a\u00020\u0018H\u0002J\u0006\u0010@\u001a\u00020\u0018J\u0006\u0010A\u001a\u00020\u0018J&\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010+\u001a\u00020*2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0002022\u0006\u0010)\u001a\u000202@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006F"}, d2 = {"Lcom/mobilefuse/videoplayer/media/MobileFusePlayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "canApplyFullscreen", "", "getCanApplyFullscreen", "()Z", "canPause", "getCanPause", "canPlay", "getCanPlay", "currentPosition", "", "getCurrentPosition", "()I", IronSourceConstants.EVENTS_DURATION, "getDuration", "isDestroyed", "mediaPlayer", "Landroid/media/MediaPlayer;", "playbackCompletionListener", "Lkotlin/Function0;", "", "getPlaybackCompletionListener", "()Lkotlin/jvm/functions/Function0;", "setPlaybackCompletionListener", "(Lkotlin/jvm/functions/Function0;)V", "playerState", "Lcom/mobilefuse/videoplayer/media/MediaPlayerState;", "playerStateChangeListener", "Lkotlin/Function1;", "getPlayerStateChangeListener", "()Lkotlin/jvm/functions/Function1;", "setPlayerStateChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "videoView", "Lcom/mobilefuse/videoplayer/media/VideoViewInterface;", "videoViewParams", "Landroid/widget/FrameLayout$LayoutParams;", "value", "Lcom/mobilefuse/videoplayer/media/ViewType;", "viewType", "getViewType$annotations", "()V", "getViewType", "()Lcom/mobilefuse/videoplayer/media/ViewType;", "setViewType", "(Lcom/mobilefuse/videoplayer/media/ViewType;)V", "", "volume", "getVolume", "()F", "setVolume", "(F)V", "applyViewType", "changePlayerState", "newState", "destroy", "isPlayerPreparing", "onBecameInvisible", "onBecameVisible", "onMediaPlayerPrepared", "pause", "play", "prepare", "videoSource", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "prepareCompletedAction", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class MobileFusePlayer extends FrameLayout {
    private final MediaPlayer mediaPlayer;

    @Nullable
    private Function0 playbackCompletionListener;
    private MediaPlayerState playerState;

    @Nullable
    private Function1 playerStateChangeListener;
    private VideoViewInterface videoView;
    private final FrameLayout.LayoutParams videoViewParams;

    @NotNull
    private ViewType viewType;
    private float volume;

    public static /* synthetic */ void getViewType$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFusePlayer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.playerState = MediaPlayerState.IDLE;
        this.mediaPlayer = new MediaPlayer();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        Unit unit = Unit.INSTANCE;
        this.videoViewParams = layoutParams;
        this.viewType = ViewType.SURFACE_VIEW;
        this.volume = 1.0f;
    }

    @Nullable
    public final Function0 getPlaybackCompletionListener() {
        return this.playbackCompletionListener;
    }

    public final void setPlaybackCompletionListener(@Nullable Function0 function0) {
        this.playbackCompletionListener = function0;
    }

    @Nullable
    public final Function1 getPlayerStateChangeListener() {
        return this.playerStateChangeListener;
    }

    public final void setPlayerStateChangeListener(@Nullable Function1 function1) {
        this.playerStateChangeListener = function1;
    }

    public static /* synthetic */ void prepare$default(MobileFusePlayer mobileFusePlayer, VideoSource videoSource, ViewType viewType, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            viewType = ViewType.SURFACE_VIEW;
        }
        mobileFusePlayer.prepare(videoSource, viewType, function0);
    }

    public final void prepare(@NotNull final VideoSource videoSource, @NotNull ViewType viewType, @NotNull final Function0 prepareCompletedAction) {
        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(prepareCompletedAction, "prepareCompletedAction");
        if (changePlayerState(MediaPlayerState.PREPARING)) {
            setViewType(viewType);
            try {
                this.mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).setUsage(1).build());
                this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer$prepare$1
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        boolean changePlayerState;
                        DebuggingKt.logDebug$default(MobileFusePlayer.this, "MediaPlayer onError", null, 2, null);
                        changePlayerState = MobileFusePlayer.this.changePlayerState(MediaPlayerState.ERROR);
                        return changePlayerState;
                    }
                });
                this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer$prepare$2
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/videoplayer/media/MobileFusePlayer$prepare$2;->onCompletion(Landroid/media/MediaPlayer;)V");
                        CreativeInfoManager.onVideoCompleted(h.E, mediaPlayer, "media-player");
                        safedk_MobileFusePlayer$prepare$2_onCompletion_99acbea9647856537d27fcd05286599d(mediaPlayer);
                    }

                    public void safedk_MobileFusePlayer$prepare$2_onCompletion_99acbea9647856537d27fcd05286599d(MediaPlayer p0) {
                        MobileFusePlayer.this.changePlayerState(MediaPlayerState.COMPLETED);
                        Function0 playbackCompletionListener = MobileFusePlayer.this.getPlaybackCompletionListener();
                        if (playbackCompletionListener != null) {
                        }
                    }
                });
                this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer$prepare$3
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        if (MobileFusePlayer.this.isDestroyed()) {
                            return;
                        }
                        MobileFusePlayer.this.onMediaPlayerPrepared();
                        prepareCompletedAction.mo4828invoke();
                    }
                });
                this.mediaPlayer.setScreenOnWhilePlaying(true);
                SchedulersKt.safelyRunOnBgThread$default(null, new Function0() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer$prepare$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
                    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke() {
                        MediaPlayerState mediaPlayerState;
                        MediaPlayer mediaPlayer;
                        boolean isPlayerPreparing;
                        MediaPlayer mediaPlayer2;
                        boolean isPlayerPreparing2;
                        MediaPlayer mediaPlayer3;
                        mediaPlayerState = MobileFusePlayer.this.playerState;
                        if (mediaPlayerState != MediaPlayerState.PREPARING) {
                            DebuggingKt.logDebug$default(MobileFusePlayer.this, "Can't set Media Player data source because the Video Player has been already destroyed.", null, 2, null);
                            return;
                        }
                        String mobileFuseVideoSourceGetLocalFileCacheKey = SpecialsBridge.mobileFuseVideoSourceGetLocalFileCacheKey(videoSource);
                        VideoCache videoCache = VideoCache.INSTANCE;
                        Context context = MobileFusePlayer.this.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        String cachedFilePath = videoCache.getCachedFilePath(context, mobileFuseVideoSourceGetLocalFileCacheKey);
                        if (videoSource.getCacheEnabled() && cachedFilePath != null) {
                            Context context2 = MobileFusePlayer.this.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "context");
                            if (videoCache.cachedFileExists(context2, mobileFuseVideoSourceGetLocalFileCacheKey)) {
                                TelemetryLogger.Companion.reportVideoStreamingEvent("localCache file used");
                                mediaPlayer = MobileFusePlayer.this.mediaPlayer;
                                isPlayerPreparing = MobileFusePlayer.this.isPlayerPreparing();
                                if (!isPlayerPreparing) {
                                    mediaPlayer = null;
                                }
                                if (mediaPlayer != null) {
                                    MobileFuseVideoBridge.MediaPlayerSetDataSource(mediaPlayer, cachedFilePath);
                                }
                                mediaPlayer2 = MobileFusePlayer.this.mediaPlayer;
                                isPlayerPreparing2 = MobileFusePlayer.this.isPlayerPreparing();
                                mediaPlayer3 = isPlayerPreparing2 ? mediaPlayer2 : null;
                                if (mediaPlayer3 == null) {
                                    mediaPlayer3.prepareAsync();
                                    return;
                                }
                                return;
                            }
                        }
                        TelemetryLogger.Companion.reportVideoStreamingEvent("remote url used");
                        cachedFilePath = videoSource.getRemoteUrl();
                        mediaPlayer = MobileFusePlayer.this.mediaPlayer;
                        isPlayerPreparing = MobileFusePlayer.this.isPlayerPreparing();
                        if (!isPlayerPreparing) {
                        }
                        if (mediaPlayer != null) {
                        }
                        mediaPlayer2 = MobileFusePlayer.this.mediaPlayer;
                        isPlayerPreparing2 = MobileFusePlayer.this.isPlayerPreparing();
                        if (isPlayerPreparing2) {
                        }
                        if (mediaPlayer3 == null) {
                        }
                    }
                }, 1, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaPlayerPrepared() {
        if (changePlayerState(MediaPlayerState.PREPARED)) {
            applyViewType();
        }
    }

    @NotNull
    public final ViewType getViewType() {
        return this.viewType;
    }

    public final void setViewType(@NotNull ViewType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.viewType == value) {
            return;
        }
        this.viewType = value;
        applyViewType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyViewType() {
        VideoViewInterface mobileFuseVideoTextureView;
        if (getCanPlay() || getCanPause()) {
            VideoViewInterface videoViewInterface = this.videoView;
            if (videoViewInterface != 0) {
                this.mediaPlayer.setDisplay(null);
                MobileFuseVideoBridge.MediaPlayerSetSurface(this.mediaPlayer, null);
                videoViewInterface.destroy();
                removeView((View) videoViewInterface);
                this.videoView = null;
            }
            if (this.viewType == ViewType.SURFACE_VIEW) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                mobileFuseVideoTextureView = new MobileFuseVideoSurfaceView(context, this.mediaPlayer);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                mobileFuseVideoTextureView = new MobileFuseVideoTextureView(context2, this.mediaPlayer);
            }
            this.videoView = mobileFuseVideoTextureView;
        }
    }

    public final void onBecameInvisible() {
        Object obj = this.videoView;
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = (ViewGroup) (parent instanceof ViewGroup ? parent : null);
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public final void onBecameVisible() {
        Object obj = this.videoView;
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view != null && view.getParent() == null) {
            Object obj2 = this.videoView;
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            addView((View) obj2, this.videoViewParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean changePlayerState(MediaPlayerState newState) {
        if (newState == this.playerState) {
            return false;
        }
        DebuggingKt.logDebug$default(this, "Changed Player state from " + this.playerState + " to " + newState, null, 2, null);
        this.playerState = newState;
        Function1 function1 = this.playerStateChangeListener;
        if (function1 == null) {
            return true;
        }
        return true;
    }

    public final boolean getCanPlay() {
        MediaPlayerState mediaPlayerState = this.playerState;
        return mediaPlayerState == MediaPlayerState.PREPARED || mediaPlayerState == MediaPlayerState.PAUSED;
    }

    public final boolean getCanPause() {
        MediaPlayerState mediaPlayerState = this.playerState;
        return mediaPlayerState == MediaPlayerState.PREPARED || mediaPlayerState == MediaPlayerState.PLAYING;
    }

    public final boolean getCanApplyFullscreen() {
        return getCanPlay() || getCanPause();
    }

    public final boolean isDestroyed() {
        return this.playerState == MediaPlayerState.DESTROYED;
    }

    public final void play() {
        if (getCanPlay()) {
            MobileFuseVideoBridge.MediaPlayerStart(this.mediaPlayer);
            changePlayerState(MediaPlayerState.PLAYING);
        }
    }

    public final void pause() {
        if (getCanPause()) {
            MobileFuseVideoBridge.MediaPlayerPause(this.mediaPlayer);
            changePlayerState(MediaPlayerState.PAUSED);
        }
    }

    public final int getCurrentPosition() {
        try {
            return this.mediaPlayer.getCurrentPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final int getDuration() {
        try {
            return this.mediaPlayer.getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final float getVolume() {
        return this.volume;
    }

    public final void setVolume(float f) {
        try {
            this.volume = f;
            this.mediaPlayer.setVolume(f, f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void destroy() {
        try {
            if (changePlayerState(MediaPlayerState.DESTROYED)) {
                this.mediaPlayer.reset();
                MobileFuseVideoBridge.MediaPlayerRelease(this.mediaPlayer);
                VideoViewInterface videoViewInterface = this.videoView;
                if (videoViewInterface != 0) {
                    videoViewInterface.destroy();
                    removeView((View) videoViewInterface);
                    this.videoView = null;
                }
            }
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPlayerPreparing() {
        return this.playerState == MediaPlayerState.PREPARING;
    }
}
