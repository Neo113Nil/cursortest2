package io.bidmachine.nativead.view;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.BidMachineVideoBridge;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.view.CircleCountdownView;
import io.bidmachine.internal.C6012g;
import io.bidmachine.nativead.NativeAdObject;
import io.bidmachine.nativead.NativeData;
import io.bidmachine.nativead.NativeInteractor;
import io.bidmachine.nativead.NativeMediaPrivateData;
import io.bidmachine.nativead.tasks.DownloadVastVideoTask;
import io.bidmachine.nativead.tasks.DownloadVideoTask;
import io.bidmachine.nativead.utils.ImageHelper;
import io.bidmachine.nativead.utils.NativeNetworkExecutor;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.Repository;
import io.bidmachine.util.ColorUtils;
import io.bidmachine.util.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u0093\u0001B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ(\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010#\u001a\u00020$2\u0006\u0010/\u001a\u0002002\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010O\u001a\u00020LH\u0002J\b\u0010P\u001a\u00020LH\u0002J\b\u0010Q\u001a\u00020LH\u0002J\b\u0010R\u001a\u00020\u001eH\u0002J\b\u0010S\u001a\u00020LH\u0002J\u0010\u0010T\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010U\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020XH\u0002J\u0018\u0010Y\u001a\u00020L2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[H\u0002J\b\u0010]\u001a\u00020\u0011H\u0002J\b\u0010^\u001a\u00020\u0011H\u0002J\b\u0010_\u001a\u00020LH\u0002J\b\u0010`\u001a\u00020LH\u0002J\u0012\u0010a\u001a\u00020L2\b\u0010b\u001a\u0004\u0018\u00010\u001eH\u0016J\"\u0010c\u001a\u00020\u00112\b\u0010b\u001a\u0004\u0018\u00010\u001e2\u0006\u0010d\u001a\u00020\r2\u0006\u0010e\u001a\u00020\rH\u0016J0\u0010f\u001a\u00020L2\u0006\u0010g\u001a\u00020\u00112\u0006\u0010h\u001a\u00020\r2\u0006\u0010i\u001a\u00020\r2\u0006\u0010j\u001a\u00020\r2\u0006\u0010k\u001a\u00020\rH\u0014J\u0018\u0010l\u001a\u00020L2\u0006\u0010m\u001a\u00020\r2\u0006\u0010n\u001a\u00020\rH\u0014J\u0012\u0010o\u001a\u00020L2\b\u0010b\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010p\u001a\u00020L2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\r2\u0006\u0010t\u001a\u00020\rH\u0016J\u0010\u0010u\u001a\u00020\u00112\u0006\u0010v\u001a\u00020rH\u0016J \u0010w\u001a\u00020L2\u0006\u0010v\u001a\u00020r2\u0006\u0010s\u001a\u00020\r2\u0006\u0010t\u001a\u00020\rH\u0016J\u0010\u0010x\u001a\u00020L2\u0006\u0010v\u001a\u00020rH\u0016J\"\u0010y\u001a\u00020L2\b\u0010b\u001a\u0004\u0018\u00010\u001e2\u0006\u0010s\u001a\u00020\r2\u0006\u0010t\u001a\u00020\rH\u0016J\u0006\u0010z\u001a\u00020LJ\u0010\u0010{\u001a\u00020L2\u0006\u0010|\u001a\u00020\rH\u0014J\b\u0010}\u001a\u00020LH\u0002J\b\u0010~\u001a\u00020LH\u0002J\b\u0010\u007f\u001a\u00020LH\u0002J\u0013\u0010\u0080\u0001\u001a\u00020L2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002J\t\u0010\u0083\u0001\u001a\u00020LH\u0002J\u0007\u0010\u0084\u0001\u001a\u00020LJ\u0011\u0010\u0085\u0001\u001a\u00020L2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\u0007\u0010\u0088\u0001\u001a\u00020LJ\u0007\u0010\u0089\u0001\u001a\u00020LJ\t\u0010\u008a\u0001\u001a\u00020LH\u0002J\t\u0010\u008b\u0001\u001a\u00020LH\u0002J\t\u0010\u008c\u0001\u001a\u00020LH\u0002J\u0011\u0010\u008d\u0001\u001a\u00020L2\u0006\u0010@\u001a\u00020AH\u0002J\t\u0010\u008e\u0001\u001a\u00020LH\u0002J\t\u0010\u008f\u0001\u001a\u00020LH\u0002J\u001b\u0010\u0090\u0001\u001a\u00020L2\u0007\u0010\u0091\u0001\u001a\u00020\r2\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u000e\u0010?\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, d2 = {"Lio/bidmachine/nativead/view/MediaView;", "Landroid/widget/RelativeLayout;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnVideoSizeChangedListener;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lio/bidmachine/nativead/view/VideoPlayerActivity$VideoPlayerActivityListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "error", "", "finishedOrExpanded", "hasVideo", "imageView", "Landroid/widget/ImageView;", "isInitialized", "()Z", "setInitialized", "(Z)V", "isMuted", "isVideoFinishNotified", "isVideoStartNotified", "mediaPlayer", "Landroid/media/MediaPlayer;", "mediaPlayerPrepared", "mediaPlayerPreparing", "muteButton", "Lio/bidmachine/iab/vast/view/CircleCountdownView;", "nativeData", "Lio/bidmachine/nativead/NativeData;", "getNativeData", "()Lio/bidmachine/nativead/NativeData;", "setNativeData", "(Lio/bidmachine/nativead/NativeData;)V", "nativeInteractor", "Lio/bidmachine/nativead/NativeInteractor;", "getNativeInteractor", "()Lio/bidmachine/nativead/NativeInteractor;", "setNativeInteractor", "(Lio/bidmachine/nativead/NativeInteractor;)V", "nativeMediaData", "Lio/bidmachine/nativead/NativeMediaPrivateData;", "getNativeMediaData", "()Lio/bidmachine/nativead/NativeMediaPrivateData;", "setNativeMediaData", "(Lio/bidmachine/nativead/NativeMediaPrivateData;)V", "playButton", "progressBarView", "Landroid/widget/ProgressBar;", "quartile", "repository", "Lio/bidmachine/rendering/Repository;", "getRepository", "()Lio/bidmachine/rendering/Repository;", "repository$delegate", "Lkotlin/Lazy;", "startPlayVideoWhenReady", "state", "Lio/bidmachine/nativead/view/NativeState;", "textureView", "Landroid/view/TextureView;", "videoDuration", "videoHeight", "videoSizeWasChanged", "videoVisibilityCheckerTimer", "Ljava/util/Timer;", "videoWidth", "viewOnScreen", "applyNative", "", "assetsHolder", "", "cleanUpMediaPlayer", "clearPlayerOnError", "createImageView", "createMediaPlayer", "createMuteButton", "createVideoView", "createView", "executeTask", "task", "Ljava/lang/Runnable;", "fireUrls", "urls", "", "", "isAdOnScreen", "isMediaPlayerAvailable", "notifyVideoFinished", "notifyVideoStarted", "onCompletion", CampaignEx.JSON_KEY_AD_MP, "onError", "what", "extra", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onPrepared", "onSurfaceTextureAvailable", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "surface", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "onVideoSizeChanged", "onViewAppearOnScreen", "onWindowVisibilityChanged", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "pausePlayer", "prepareMediaPlayer", "processErrorEvent", "processEvent", X3.i.j0, "Lio/bidmachine/iab/vast/TrackingEvent;", "processImpressions", "release", "setNativeAdObject", "nativeAdObject", "Lio/bidmachine/nativead/NativeAdObject;", "startVideoVisibilityCheckerTimer", "stopVideoVisibilityCheckerTimer", "tryPlayVideo", "updateMuteButton", "updateTextureLayoutParams", "updateViewState", "updateVolume", "videoFinished", "videoPlayerActivityClosed", X3.i.L, "finished", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MediaView extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, VideoPlayerActivity.VideoPlayerActivityListener {
    private static final float ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH = 1.7777778f;
    private static final float ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT = 0.5625f;
    private volatile boolean error;
    private boolean finishedOrExpanded;
    private boolean hasVideo;

    @Nullable
    private ImageView imageView;
    private boolean isInitialized;
    private boolean isMuted;
    private boolean isVideoFinishNotified;
    private boolean isVideoStartNotified;

    @Nullable
    private MediaPlayer mediaPlayer;
    private boolean mediaPlayerPrepared;
    private boolean mediaPlayerPreparing;

    @Nullable
    private CircleCountdownView muteButton;

    @Nullable
    private NativeData nativeData;

    @Nullable
    private NativeInteractor nativeInteractor;

    @Nullable
    private NativeMediaPrivateData nativeMediaData;

    @Nullable
    private ImageView playButton;

    @Nullable
    private ProgressBar progressBarView;
    private int quartile;

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repository;
    private boolean startPlayVideoWhenReady;

    @NotNull
    private NativeState state;

    @Nullable
    private TextureView textureView;
    private int videoDuration;
    private int videoHeight;
    private boolean videoSizeWasChanged;

    @Nullable
    private Timer videoVisibilityCheckerTimer;
    private int videoWidth;
    private boolean viewOnScreen;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeState.values().length];
            try {
                iArr[NativeState.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeState.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NativeState.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NativeState.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Repository mo4828invoke() {
            Rendering rendering = Rendering.INSTANCE;
            Context context = MediaView.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return rendering.createRepository(C6012g.a(context));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyNative(Object assetsHolder, NativeData nativeData, NativeMediaPrivateData nativeMediaData, NativeInteractor nativeInteractor) {
        String videoUrl;
        String videoAdm;
        this.nativeData = nativeData;
        this.nativeMediaData = nativeMediaData;
        this.nativeInteractor = nativeInteractor;
        if (nativeMediaData.getVideoUri() != null || (((videoUrl = nativeData.getVideoUrl()) != null && !StringsKt.isBlank(videoUrl)) || ((videoAdm = nativeData.getVideoAdm()) != null && !StringsKt.isBlank(videoAdm)))) {
            this.hasVideo = true;
        }
        createView(assetsHolder);
    }

    private final void cleanUpMediaPlayer() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        this.mediaPlayer = null;
        try {
            if (!this.error) {
                if (mediaPlayer.isPlaying()) {
                    BidMachineVideoBridge.MediaPlayerStop(mediaPlayer);
                }
                mediaPlayer.reset();
            }
            mediaPlayer.setOnCompletionListener(null);
            mediaPlayer.setOnErrorListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setOnVideoSizeChangedListener(null);
            BidMachineVideoBridge.MediaPlayerRelease(mediaPlayer);
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPlayerOnError() {
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.nativead.view.MediaView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MediaView.clearPlayerOnError$lambda$17(MediaView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearPlayerOnError$lambda$17(MediaView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.startPlayVideoWhenReady = false;
            this$0.cleanUpMediaPlayer();
            this$0.updateViewState(NativeState.Image);
            this$0.stopVideoVisibilityCheckerTimer();
            this$0.error = true;
            this$0.hasVideo = false;
            this$0.processErrorEvent();
        } catch (Exception e) {
            Logger.w(e);
        }
    }

    private final void createImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        this.imageView = imageView;
        addView(imageView);
    }

    private final MediaPlayer createMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnVideoSizeChangedListener(this);
        mediaPlayer.setAudioStreamType(3);
        this.mediaPlayer = mediaPlayer;
        updateVolume();
        return mediaPlayer;
    }

    private final void createMuteButton() {
        Context context = getContext();
        float screenDensity = Utils.getScreenDensity(context);
        int roundToInt = MathKt.roundToInt(40 * screenDensity);
        int roundToInt2 = MathKt.roundToInt(8 * screenDensity);
        CircleCountdownView circleCountdownView = new CircleCountdownView(context);
        circleCountdownView.setColors(Assets.MAIN_ASSETS_COLOR, Assets.BACKGROUND_COLOR);
        circleCountdownView.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        circleCountdownView.setLayoutParams(layoutParams);
        circleCountdownView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.nativead.view.MediaView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaView.createMuteButton$lambda$19$lambda$18(MediaView.this, view);
            }
        });
        this.muteButton = circleCountdownView;
        updateMuteButton();
        addView(circleCountdownView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMuteButton$lambda$19$lambda$18(MediaView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isMediaPlayerAvailable()) {
            if (this$0.isMuted) {
                MediaPlayer mediaPlayer = this$0.mediaPlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(1.0f, 1.0f);
                }
                this$0.isMuted = false;
            } else {
                MediaPlayer mediaPlayer2 = this$0.mediaPlayer;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                }
                this$0.isMuted = true;
            }
            this$0.updateMuteButton();
        }
    }

    private final void createVideoView(Object assetsHolder) {
        Uri videoUri;
        int roundToInt = MathKt.roundToInt(50 * Utils.getScreenDensity(getContext()));
        String str = null;
        ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleLarge);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams);
        Integer parseColorARGBSafely = ColorUtils.parseColorARGBSafely("#6b000000");
        if (parseColorARGBSafely != null) {
            progressBar.setBackgroundColor(parseColorARGBSafely.intValue());
        }
        progressBar.setVisibility(4);
        this.progressBarView = progressBar;
        addView(progressBar);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_media_play);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams2.addRule(13, -1);
        imageView.setLayoutParams(layoutParams2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.nativead.view.MediaView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaView.createVideoView$lambda$6$lambda$5(MediaView.this, view);
            }
        });
        imageView.setVisibility(4);
        this.playButton = imageView;
        addView(imageView);
        final TextureView textureView = new TextureView(getContext());
        textureView.setSurfaceTextureListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        textureView.setLayoutParams(layoutParams3);
        textureView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.nativead.view.MediaView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaView.createVideoView$lambda$9$lambda$8(MediaView.this, textureView, view);
            }
        });
        this.textureView = textureView;
        addView(textureView);
        createMuteButton();
        createMediaPlayer();
        NativeData nativeData = this.nativeData;
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData != null && (videoUri = nativeMediaPrivateData.getVideoUri()) != null) {
            str = videoUri.getPath();
        }
        if (str != null && new File(str).exists()) {
            this.startPlayVideoWhenReady = true;
            return;
        }
        if (nativeData != null) {
            updateViewState(NativeState.Loading);
            String videoUrl = nativeData.getVideoUrl();
            String videoAdm = nativeData.getVideoAdm();
            if (videoUrl != null && !StringsKt.isBlank(videoUrl)) {
                executeTask(new DownloadVideoTask(assetsHolder, getRepository(), new DownloadVideoTask.OnLoadedListener() { // from class: io.bidmachine.nativead.view.MediaView$createVideoView$listener$1
                    @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
                    public void onVideoLoaded(@NotNull DownloadVideoTask task, @NotNull Uri videoFileUri) {
                        Intrinsics.checkNotNullParameter(task, "task");
                        Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
                        Logger.d("MediaView video is loaded");
                        NativeMediaPrivateData nativeMediaData = MediaView.this.getNativeMediaData();
                        if (nativeMediaData != null) {
                            nativeMediaData.setVideoUri(videoFileUri);
                        }
                        MediaView.this.prepareMediaPlayer();
                    }

                    @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
                    public void onVideoLoadingError(@NotNull DownloadVideoTask task) {
                        Intrinsics.checkNotNullParameter(task, "task");
                        Logger.d("MediaView video is not loaded");
                        MediaView.this.updateViewState(NativeState.Image);
                        MediaView.this.hasVideo = false;
                    }
                }, videoUrl, null, 16, null));
                return;
            }
            if (videoAdm == null || StringsKt.isBlank(videoAdm)) {
                return;
            }
            DownloadVastVideoTask.OnLoadedListener onLoadedListener = new DownloadVastVideoTask.OnLoadedListener() { // from class: io.bidmachine.nativead.view.MediaView$createVideoView$listener$2
                @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
                public void onVideoLoaded(@NotNull DownloadVastVideoTask task, @NotNull Uri videoFileUri, @NotNull VastRequest vastRequest) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
                    Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
                    Logger.d("MediaView video is loaded");
                    NativeMediaPrivateData nativeMediaData = MediaView.this.getNativeMediaData();
                    if (nativeMediaData != null) {
                        nativeMediaData.setVideoUri(videoFileUri);
                    }
                    NativeMediaPrivateData nativeMediaData2 = MediaView.this.getNativeMediaData();
                    if (nativeMediaData2 != null) {
                        nativeMediaData2.setVastRequest(vastRequest);
                    }
                    MediaView.this.prepareMediaPlayer();
                }

                @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
                public void onVideoLoadingError(@NotNull DownloadVastVideoTask task) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Logger.d("MediaView video is not loaded");
                    MediaView.this.updateViewState(NativeState.Image);
                    MediaView.this.hasVideo = false;
                }
            };
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            executeTask(new DownloadVastVideoTask(context, assetsHolder, getRepository(), onLoadedListener, videoAdm, null, 32, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createVideoView$lambda$6$lambda$5(MediaView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startPlayVideoWhenReady = true;
        this$0.tryPlayVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createVideoView$lambda$9$lambda$8(MediaView this$0, TextureView this_apply, View view) {
        Uri videoUri;
        String path;
        MediaPlayer mediaPlayer;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        NativeMediaPrivateData nativeMediaPrivateData = this$0.nativeMediaData;
        if (nativeMediaPrivateData == null || (videoUri = nativeMediaPrivateData.getVideoUri()) == null || (path = videoUri.getPath()) == null || (mediaPlayer = this$0.mediaPlayer) == null) {
            return;
        }
        Logger.d("Video has been clicked");
        this$0.finishedOrExpanded = true;
        int currentPosition = (this$0.isMediaPlayerAvailable() && mediaPlayer.isPlaying()) ? mediaPlayer.getCurrentPosition() : 0;
        this$0.pausePlayer();
        Context context = this_apply.getContext();
        VideoPlayerActivity.Companion companion = VideoPlayerActivity.INSTANCE;
        Context context2 = this_apply.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        NativeData nativeData = this$0.nativeData;
        safedk_Utils_startActivity_37db7eccde16e1b8fab21081e3ffdcc7(context, companion.createIntent(context2, path, currentPosition, this$0, nativeData != null ? nativeData.getDisclaimerData() : null));
    }

    private final void createView(Object assetsHolder) {
        if (!this.isInitialized) {
            this.isInitialized = true;
            createImageView();
            if (this.hasVideo) {
                createVideoView(assetsHolder);
            } else {
                updateViewState(NativeState.Image);
            }
        }
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        ImageView imageView = this.imageView;
        if (nativeMediaPrivateData == null || imageView == null) {
            return;
        }
        ImageHelper.fillImageView(getContext(), imageView, nativeMediaPrivateData.getImageUri(), nativeMediaPrivateData.getImageDrawable());
    }

    private final void executeTask(Runnable task) {
        NativeNetworkExecutor.getInstance().execute(task);
    }

    private final void fireUrls(List<String> urls) {
        if (urls == null) {
            return;
        }
        Iterator<String> it = urls.iterator();
        while (it.hasNext()) {
            Utils.simpleTrackUrl(it.next(), NativeNetworkExecutor.getInstance());
        }
    }

    private final Repository getRepository() {
        return (Repository) this.repository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAdOnScreen() {
        return getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMediaPlayerAvailable() {
        return (this.error || this.mediaPlayer == null) ? false : true;
    }

    private final void notifyVideoFinished() {
        if (this.isVideoFinishNotified) {
            return;
        }
        processEvent(TrackingEvent.complete);
        this.isVideoFinishNotified = true;
        Logger.d("MediaView: video finished");
    }

    private final void notifyVideoStarted() {
        if (this.isVideoStartNotified) {
            return;
        }
        processImpressions();
        this.isVideoStartNotified = true;
        Logger.d("MediaView: video started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pausePlayer() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null) {
                return;
            }
            if (isMediaPlayerAvailable() && mediaPlayer.isPlaying()) {
                BidMachineVideoBridge.MediaPlayerPause(mediaPlayer);
            }
            if (this.state != NativeState.Loading) {
                updateViewState(NativeState.Paused);
            }
        } catch (Exception e) {
            Logger.w(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareMediaPlayer() {
        Uri videoUri;
        try {
            NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
            if (nativeMediaPrivateData == null || (videoUri = nativeMediaPrivateData.getVideoUri()) == null || this.mediaPlayerPrepared || this.mediaPlayerPreparing || this.error) {
                return;
            }
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                BidMachineVideoBridge.MediaPlayerSetDataSource(mediaPlayer, getContext(), videoUri);
                mediaPlayer.prepareAsync();
            }
            this.mediaPlayerPreparing = true;
        } catch (Exception e) {
            Logger.w(e);
        }
    }

    private final void processErrorEvent() {
        VastRequest vastRequest;
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData == null || (vastRequest = nativeMediaPrivateData.getVastRequest()) == null) {
            return;
        }
        vastRequest.sendVastSpecError(VastSpecError.SHOWING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processEvent(TrackingEvent eventName) {
        NativeInteractor nativeInteractor;
        VastRequest vastRequest;
        VastAd vastAd;
        Map<TrackingEvent, List<String>> trackingEventListMap;
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData != null && (vastRequest = nativeMediaPrivateData.getVastRequest()) != null && (vastAd = vastRequest.getVastAd()) != null && (trackingEventListMap = vastAd.getTrackingEventListMap()) != null) {
            fireUrls(trackingEventListMap.get(eventName));
        }
        if (eventName != TrackingEvent.complete || (nativeInteractor = this.nativeInteractor) == null) {
            return;
        }
        nativeInteractor.dispatchVideoPlayFinished();
    }

    private final void processImpressions() {
        VastRequest vastRequest;
        VastAd vastAd;
        List<String> impressionUrlList;
        NativeMediaPrivateData nativeMediaPrivateData = this.nativeMediaData;
        if (nativeMediaPrivateData == null || (vastRequest = nativeMediaPrivateData.getVastRequest()) == null || (vastAd = vastRequest.getVastAd()) == null || (impressionUrlList = vastAd.getImpressionUrlList()) == null) {
            return;
        }
        fireUrls(impressionUrlList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$10(MediaView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cleanUpMediaPlayer();
    }

    public static void safedk_Utils_startActivity_37db7eccde16e1b8fab21081e3ffdcc7(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Lio/bidmachine/core/Utils;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        Utils.startActivity(p0, p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryPlayVideo() {
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null) {
                mediaPlayer = createMediaPlayer();
            }
            if (!this.mediaPlayerPrepared) {
                prepareMediaPlayer();
            }
            if (isMediaPlayerAvailable() && this.mediaPlayerPrepared && this.viewOnScreen && isAdOnScreen()) {
                if (!mediaPlayer.isPlaying()) {
                    BidMachineVideoBridge.MediaPlayerStart(mediaPlayer);
                    notifyVideoStarted();
                    if (this.videoVisibilityCheckerTimer == null) {
                        startVideoVisibilityCheckerTimer();
                    }
                }
                if (mediaPlayer.getCurrentPosition() > 0) {
                    NativeState nativeState = this.state;
                    NativeState nativeState2 = NativeState.Playing;
                    if (nativeState != nativeState2) {
                        updateViewState(nativeState2);
                    }
                }
            }
        } catch (Exception e) {
            Logger.w(e);
            clearPlayerOnError();
        }
    }

    private final void updateMuteButton() {
        if (this.isMuted) {
            CircleCountdownView circleCountdownView = this.muteButton;
            if (circleCountdownView != null) {
                circleCountdownView.setImage(Assets.getBitmapFromBase64(Assets.UNMUTE));
                return;
            }
            return;
        }
        CircleCountdownView circleCountdownView2 = this.muteButton;
        if (circleCountdownView2 != null) {
            circleCountdownView2.setImage(Assets.getBitmapFromBase64(Assets.MUTE));
        }
    }

    private final void updateTextureLayoutParams() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0 || !this.videoSizeWasChanged || this.videoWidth == 0 || this.videoHeight == 0) {
            return;
        }
        this.videoSizeWasChanged = false;
        TextureView textureView = this.textureView;
        if (textureView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
        int i = this.videoWidth;
        int i2 = this.videoHeight;
        if (i > i2) {
            layoutParams.width = width;
            layoutParams.height = (width * i2) / i;
        } else {
            layoutParams.width = (i * height) / i2;
            layoutParams.height = height;
        }
        textureView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewState(NativeState state) {
        this.state = state;
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            ImageView imageView = this.imageView;
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.bringToFront();
            }
            if (this.hasVideo) {
                TextureView textureView = this.textureView;
                if (textureView != null) {
                    textureView.setVisibility(4);
                }
                ProgressBar progressBar = this.progressBarView;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                ImageView imageView2 = this.playButton;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
                CircleCountdownView circleCountdownView = this.muteButton;
                if (circleCountdownView == null) {
                    return;
                }
                circleCountdownView.setVisibility(4);
                return;
            }
            return;
        }
        if (i == 2) {
            ImageView imageView3 = this.imageView;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                imageView3.bringToFront();
            }
            if (this.hasVideo) {
                ProgressBar progressBar2 = this.progressBarView;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
                ProgressBar progressBar3 = this.progressBarView;
                if (progressBar3 != null) {
                    progressBar3.bringToFront();
                }
                TextureView textureView2 = this.textureView;
                if (textureView2 != null) {
                    textureView2.setVisibility(4);
                }
                ImageView imageView4 = this.playButton;
                if (imageView4 != null) {
                    imageView4.setVisibility(4);
                }
                CircleCountdownView circleCountdownView2 = this.muteButton;
                if (circleCountdownView2 == null) {
                    return;
                }
                circleCountdownView2.setVisibility(4);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            ImageView imageView5 = this.imageView;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                imageView5.bringToFront();
            }
            if (this.hasVideo) {
                ImageView imageView6 = this.playButton;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                }
                ImageView imageView7 = this.playButton;
                if (imageView7 != null) {
                    imageView7.bringToFront();
                }
                TextureView textureView3 = this.textureView;
                if (textureView3 != null) {
                    textureView3.setVisibility(4);
                }
                ProgressBar progressBar4 = this.progressBarView;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(4);
                }
                CircleCountdownView circleCountdownView3 = this.muteButton;
                if (circleCountdownView3 == null) {
                    return;
                }
                circleCountdownView3.setVisibility(4);
                return;
            }
            return;
        }
        ImageView imageView8 = this.imageView;
        if (imageView8 != null) {
            imageView8.setVisibility(4);
        }
        if (this.hasVideo) {
            TextureView textureView4 = this.textureView;
            if (textureView4 != null) {
                textureView4.setVisibility(0);
            }
            TextureView textureView5 = this.textureView;
            if (textureView5 != null) {
                textureView5.bringToFront();
            }
            CircleCountdownView circleCountdownView4 = this.muteButton;
            if (circleCountdownView4 != null) {
                circleCountdownView4.setVisibility(0);
            }
            CircleCountdownView circleCountdownView5 = this.muteButton;
            if (circleCountdownView5 != null) {
                circleCountdownView5.bringToFront();
            }
            updateMuteButton();
            ProgressBar progressBar5 = this.progressBarView;
            if (progressBar5 != null) {
                progressBar5.setVisibility(4);
            }
            ImageView imageView9 = this.playButton;
            if (imageView9 == null) {
                return;
            }
            imageView9.setVisibility(4);
        }
    }

    private final void updateVolume() {
        if (isMediaPlayerAvailable()) {
            if (this.isMuted) {
                MediaPlayer mediaPlayer = this.mediaPlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                    return;
                }
                return;
            }
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setVolume(1.0f, 1.0f);
            }
        }
    }

    private final void videoFinished() {
        MediaPlayer mediaPlayer;
        notifyVideoFinished();
        stopVideoVisibilityCheckerTimer();
        pausePlayer();
        if (isMediaPlayerAvailable() && (mediaPlayer = this.mediaPlayer) != null) {
            mediaPlayer.seekTo(0);
        }
        this.finishedOrExpanded = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String videoPlayerActivityClosed$lambda$22(int i, boolean z) {
        return "MediaView videoPlayerActivityClosed, position: " + i + ", finished: " + z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final NativeData getNativeData() {
        return this.nativeData;
    }

    @Nullable
    public final NativeInteractor getNativeInteractor() {
        return this.nativeInteractor;
    }

    @Nullable
    public final NativeMediaPrivateData getNativeMediaData() {
        return this.nativeMediaData;
    }

    /* renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(@Nullable MediaPlayer mp) {
        com.safedk.android.utils.Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/nativead/view/MediaView;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted("io.bidmachine", mp, "media-player");
        safedk_MediaView_onCompletion_9a6fc569c4345f0055f4c344a0c3d77e(mp);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(@Nullable MediaPlayer mp, int what, int extra) {
        Logger.d("MediaView: onError");
        clearPlayerOnError();
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        updateTextureLayoutParams();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, measuredWidth);
        } else if (mode != 1073741824) {
            size = measuredWidth;
        }
        int i = (int) (size * ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT);
        if (mode2 != 1073741824 || size2 >= i) {
            size2 = i;
        } else {
            size = (int) (size2 * ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(@Nullable MediaPlayer mp) {
        Logger.d("MediaView: onPrepared");
        this.mediaPlayerPrepared = true;
        if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        } else {
            updateViewState(NativeState.Paused);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        try {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer == null) {
                mediaPlayer = createMediaPlayer();
            }
            BidMachineVideoBridge.MediaPlayerSetSurface(mediaPlayer, new Surface(surfaceTexture));
            prepareMediaPlayer();
        } catch (Exception e) {
            Logger.w(e);
            updateViewState(NativeState.Image);
            this.hasVideo = false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(@Nullable MediaPlayer mp, int width, int height) {
        this.videoWidth = width;
        this.videoHeight = height;
        this.videoSizeWasChanged = true;
        updateTextureLayoutParams();
    }

    public final void onViewAppearOnScreen() {
        Logger.d("MediaView: onViewAppearOnScreen");
        this.viewOnScreen = true;
        if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        } else if (this.state != NativeState.Loading) {
            updateViewState(NativeState.Paused);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        if (visibility != 0) {
            pausePlayer();
        } else if (this.startPlayVideoWhenReady) {
            tryPlayVideo();
        }
        super.onWindowVisibilityChanged(visibility);
    }

    public final void release() {
        new Thread(new Runnable() { // from class: io.bidmachine.nativead.view.MediaView$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                MediaView.release$lambda$10(MediaView.this);
            }
        }).start();
    }

    public void safedk_MediaView_onCompletion_9a6fc569c4345f0055f4c344a0c3d77e(MediaPlayer p0) {
        videoFinished();
    }

    public final void setInitialized(boolean z) {
        this.isInitialized = z;
    }

    public final void setNativeAdObject(@NotNull NativeAdObject nativeAdObject) {
        Intrinsics.checkNotNullParameter(nativeAdObject, "nativeAdObject");
        Tag tag = nativeAdObject.getTag();
        Intrinsics.checkNotNullExpressionValue(tag, "nativeAdObject.tag");
        applyNative(tag, nativeAdObject, nativeAdObject, nativeAdObject);
    }

    public final void setNativeData(@Nullable NativeData nativeData) {
        this.nativeData = nativeData;
    }

    public final void setNativeInteractor(@Nullable NativeInteractor nativeInteractor) {
        this.nativeInteractor = nativeInteractor;
    }

    public final void setNativeMediaData(@Nullable NativeMediaPrivateData nativeMediaPrivateData) {
        this.nativeMediaData = nativeMediaPrivateData;
    }

    public final void startVideoVisibilityCheckerTimer() {
        if (this.hasVideo) {
            Timer timer = new Timer();
            this.videoVisibilityCheckerTimer = timer;
            timer.schedule(new MediaView$startVideoVisibilityCheckerTimer$1(this), 0L, 500);
        }
    }

    public final void stopVideoVisibilityCheckerTimer() {
        Timer timer = this.videoVisibilityCheckerTimer;
        if (timer != null) {
            timer.cancel();
        }
        this.videoVisibilityCheckerTimer = null;
    }

    @Override // io.bidmachine.nativead.view.VideoPlayerActivity.VideoPlayerActivityListener
    public void videoPlayerActivityClosed(final int position, final boolean finished) {
        MediaPlayer mediaPlayer;
        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.MediaView$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String videoPlayerActivityClosed$lambda$22;
                videoPlayerActivityClosed$lambda$22 = MediaView.videoPlayerActivityClosed$lambda$22(position, finished);
                return videoPlayerActivityClosed$lambda$22;
            }
        });
        try {
            if (finished) {
                videoFinished();
            } else if (isMediaPlayerAvailable() && (mediaPlayer = this.mediaPlayer) != null) {
                mediaPlayer.seekTo(position);
            }
        } catch (Exception e) {
            Logger.w(e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isMuted = true;
        this.videoSizeWasChanged = true;
        this.state = NativeState.Image;
        this.repository = LazyKt.lazy(new a());
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
