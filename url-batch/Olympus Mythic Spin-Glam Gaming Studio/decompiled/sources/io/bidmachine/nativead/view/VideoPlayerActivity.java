package io.bidmachine.nativead.view;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.BidMachineVideoBridge;
import io.bidmachine.core.Logger;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.vast.view.CircleCountdownView;
import io.bidmachine.internal.C6016k;
import io.bidmachine.internal.C6017l;
import io.bidmachine.internal.U;
import io.bidmachine.rendering.internal.AdActivity;
import io.bidmachine.util.DeviceUtilsKt;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.utils.lazy.LazyValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002&'B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u0006R\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lio/bidmachine/nativead/view/VideoPlayerActivity;", "Lio/bidmachine/rendering/internal/AdActivity;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "<init>", "()V", "", "finishActivity", "closeClicked", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/media/MediaPlayer;", CampaignEx.JSON_KEY_AD_MP, "onCompletion", "(Landroid/media/MediaPlayer;)V", "", "what", "extra", "", "onError", "(Landroid/media/MediaPlayer;II)Z", "onPrepared", "onBackPressedExecuted", "seekTo", "I", "Landroid/widget/VideoView;", "videoView", "Landroid/widget/VideoView;", "Lio/bidmachine/internal/l;", "disclaimerTextView", "Lio/bidmachine/internal/l;", "Lio/bidmachine/nativead/view/VideoPlayerActivity$VideoPlayerActivityListener;", "listener$1", "Lio/bidmachine/nativead/view/VideoPlayerActivity$VideoPlayerActivityListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Companion", "VideoPlayerActivityListener", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class VideoPlayerActivity extends AdActivity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FILE_URI = "io.bidmachine.fileUri";

    @NotNull
    private static final String SEEK_TO = "io.bidmachine.seekTo";

    @Nullable
    private static C6016k disclaimerData;

    @Nullable
    private static VideoPlayerActivityListener listener;

    @Nullable
    private C6017l disclaimerTextView;

    /* renamed from: listener$1, reason: from kotlin metadata */
    @Nullable
    private VideoPlayerActivityListener listener;
    private int seekTo;

    @Nullable
    private VideoView videoView;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/bidmachine/nativead/view/VideoPlayerActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileUri", "", "seekTo", "Lio/bidmachine/nativead/view/VideoPlayerActivity$VideoPlayerActivityListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/bidmachine/internal/k;", "disclaimerData", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;ILio/bidmachine/nativead/view/VideoPlayerActivity$VideoPlayerActivityListener;Lio/bidmachine/internal/k;)Landroid/content/Intent;", "FILE_URI", "Ljava/lang/String;", "SEEK_TO", "Lio/bidmachine/internal/k;", "Lio/bidmachine/nativead/view/VideoPlayerActivity$VideoPlayerActivityListener;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, @NotNull String fileUri, int seekTo, @NotNull VideoPlayerActivityListener listener, @Nullable C6016k disclaimerData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            Intrinsics.checkNotNullParameter(listener, "listener");
            VideoPlayerActivity.listener = listener;
            VideoPlayerActivity.disclaimerData = disclaimerData;
            Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
            intent.putExtra(VideoPlayerActivity.FILE_URI, fileUri);
            intent.putExtra(VideoPlayerActivity.SEEK_TO, seekTo);
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/nativead/view/VideoPlayerActivity$VideoPlayerActivityListener;", "", "videoPlayerActivityClosed", "", X3.i.L, "", "finished", "", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VideoPlayerActivityListener {
        void videoPlayerActivityClosed(int position, boolean finished);
    }

    private final void closeClicked() {
        VideoPlayerActivityListener videoPlayerActivityListener = this.listener;
        if (videoPlayerActivityListener != null) {
            VideoView videoView = this.videoView;
            videoPlayerActivityListener.videoPlayerActivityClosed((videoView == null || !videoView.isPlaying()) ? 0 : videoView.getCurrentPosition(), false);
        }
        finishActivity();
    }

    private final void finishActivity() {
        listener = null;
        runOnUiThread(new Runnable() { // from class: io.bidmachine.nativead.view.VideoPlayerActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerActivity.finishActivity$lambda$13(VideoPlayerActivity.this);
            }
        });
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishActivity$lambda$13(VideoPlayerActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.getWindow().clearFlags(128);
        } catch (Exception e) {
            Logger.w(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$0(VideoPlayerActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return "VideoPlayerActivity started, position: " + this$0.seekTo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7$lambda$6(VideoPlayerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeClicked();
    }

    @Override // io.bidmachine.rendering.internal.AdActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "io.bidmachine", me);
        return super.dispatchTouchEvent(me);
    }

    protected void onBackPressedExecuted() {
        closeClicked();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(@Nullable MediaPlayer mp) {
        com.safedk.android.utils.Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/nativead/view/VideoPlayerActivity;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted("io.bidmachine", mp, "media-player");
        safedk_VideoPlayerActivity_onCompletion_b224a727624a602e022b4b2f6600be7c(mp);
    }

    @Override // io.bidmachine.rendering.internal.AdActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent()");
        String stringExtra = intent.getStringExtra(FILE_URI);
        this.seekTo = intent.getIntExtra(SEEK_TO, 0);
        Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.nativead.view.VideoPlayerActivity$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String onCreate$lambda$0;
                onCreate$lambda$0 = VideoPlayerActivity.onCreate$lambda$0(VideoPlayerActivity.this);
                return onCreate$lambda$0;
            }
        });
        if (stringExtra == null) {
            return;
        }
        this.listener = listener;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(ViewUtils.createMatchParentParams());
        VideoView videoView = new VideoView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        videoView.setLayoutParams(layoutParams);
        videoView.setOnCompletionListener(this);
        videoView.setOnPreparedListener(this);
        videoView.setVideoPath(stringExtra);
        this.videoView = videoView;
        relativeLayout.addView(videoView);
        float screenDensity = DeviceUtilsKt.getScreenDensity(this);
        int roundToInt = MathKt.roundToInt(24 * screenDensity);
        int roundToInt2 = MathKt.roundToInt(8 * screenDensity);
        CircleCountdownView circleCountdownView = new CircleCountdownView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(10, -1);
        layoutParams2.setMargins(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        circleCountdownView.setLayoutParams(layoutParams2);
        circleCountdownView.setColors(Assets.MAIN_ASSETS_COLOR, Assets.BACKGROUND_COLOR);
        circleCountdownView.setImage(Assets.getBitmapFromBase64(Assets.CLOSE));
        circleCountdownView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.nativead.view.VideoPlayerActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerActivity.onCreate$lambda$7$lambda$6(VideoPlayerActivity.this, view);
            }
        });
        relativeLayout.addView(circleCountdownView);
        C6016k c6016k = disclaimerData;
        if (c6016k != null) {
            C6017l a = U.a(this, c6016k, relativeLayout);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(12);
            a.setLayoutParams(layoutParams3);
            this.disclaimerTextView = a;
            relativeLayout.addView(a);
        }
        setContentView(relativeLayout);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(@Nullable MediaPlayer mp, int what, int extra) {
        finishActivity();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(@Nullable MediaPlayer mp) {
        VideoView videoView = this.videoView;
        if (videoView == null || !videoView.canSeekForward()) {
            return;
        }
        videoView.seekTo(this.seekTo);
        BidMachineVideoBridge.VideoViewPlay(videoView);
    }

    public void safedk_VideoPlayerActivity_onCompletion_b224a727624a602e022b4b2f6600be7c(MediaPlayer p0) {
        VideoPlayerActivityListener videoPlayerActivityListener = this.listener;
        if (videoPlayerActivityListener != null) {
            videoPlayerActivityListener.videoPlayerActivityClosed(0, true);
        }
        finishActivity();
    }
}
