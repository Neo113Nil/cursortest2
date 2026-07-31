package com.pubmatic.sdk.webrendering.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.R;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PubMaticVideoBridge;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class POBVideoPlayerActivity extends Activity {
    public static final String ALLOW_ORIENTATION_KEY = "AllowOrientationChange";
    public static final String FORCE_ORIENTATION_KEY = "ForceOrientation";
    public static final String MSG_VIDEO_PLAYER_EMPTY_URL = "Can't launch video player due to null or empty value of URL";
    private static List g;
    private MediaController a;
    private VideoView b;
    private int c;
    private boolean d;
    private int e;
    private POBVideoPlayerActivityListener f;

    public interface POBVideoPlayerActivityListener {
        void onDismiss();

        void onStart(@NonNull POBVideoPlayerActivity pOBVideoPlayerActivity);
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBVideoPlayerActivity.this.finish();
        }
    }

    class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/mraid/POBVideoPlayerActivity$b;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.F, mediaPlayer, "media-player");
            safedk_POBVideoPlayerActivity$b_onCompletion_ccb4de6b0c7b67256c3ac7a53123a614(mediaPlayer);
        }

        public void safedk_POBVideoPlayerActivity$b_onCompletion_ccb4de6b0c7b67256c3ac7a53123a614(MediaPlayer p0) {
            POBVideoPlayerActivity.this.d = true;
        }
    }

    private POBVideoPlayerActivityListener b() {
        List<POBVideoPlayerActivityListener> list = g;
        if (list == null) {
            return null;
        }
        for (POBVideoPlayerActivityListener pOBVideoPlayerActivityListener : list) {
            if (this.e == pOBVideoPlayerActivityListener.hashCode()) {
                return pOBVideoPlayerActivityListener;
            }
        }
        return null;
    }

    private void c() {
        POBVideoPlayerActivityListener pOBVideoPlayerActivityListener = this.f;
        if (pOBVideoPlayerActivityListener != null) {
            pOBVideoPlayerActivityListener.onDismiss();
            a(this.f);
        }
    }

    private void d() {
        POBVideoPlayerActivityListener pOBVideoPlayerActivityListener = this.f;
        if (pOBVideoPlayerActivityListener != null) {
            pOBVideoPlayerActivityListener.onStart(this);
        }
    }

    private void e() {
        VideoView videoView = this.b;
        if (videoView == null) {
            POBLog.debug("POBVideoPlayerActivity", "Unable to pause video, VideoView not available.", new Object[0]);
            return;
        }
        PubMaticVideoBridge.VideoViewPause(videoView);
        this.c = this.b.getCurrentPosition();
        POBLog.debug("POBVideoPlayerActivity", "VideoView visibility is false. Seeked position =" + this.c, new Object[0]);
    }

    private void f() {
        if (this.d) {
            POBLog.debug("POBVideoPlayerActivity", "Video Ad is completed", new Object[0]);
            return;
        }
        VideoView videoView = this.b;
        if (videoView == null) {
            POBLog.debug("POBVideoPlayerActivity", "Unable to resume video, VideoView not available.", new Object[0]);
            return;
        }
        if (videoView.isPlaying()) {
            this.b.seekTo(this.c);
            return;
        }
        POBLog.debug("POBVideoPlayerActivity", "VideoView visibility is false. Seeked position =" + this.c, new Object[0]);
    }

    public static void safedk_POBUtils_startActivity_77a045103a3f673fe5e6fdc8c1e6b82c(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/pubmatic/sdk/common/utility/POBUtils;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.F);
        POBUtils.startActivity(p0, p1);
    }

    public static void startNewActivity(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle, @NonNull POBVideoPlayerActivityListener pOBVideoPlayerActivityListener) {
        if (g == null) {
            g = new ArrayList();
        }
        g.add(pOBVideoPlayerActivityListener);
        Intent intent = new Intent(context, (Class<?>) POBVideoPlayerActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("URL", str);
        intent.putExtra("listener_hash_code", pOBVideoPlayerActivityListener.hashCode());
        intent.putExtra("bundle_extra", bundle);
        try {
            safedk_POBUtils_startActivity_77a045103a3f673fe5e6fdc8c1e6b82c(context, intent);
        } catch (Exception e) {
            POBLog.warn("POBVideoPlayerActivity", "Error in starting video player activity. Error: %s", e.getMessage());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.F, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String str;
        boolean z;
        char c;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("URL");
        if (POBUtils.isNullOrEmpty(stringExtra)) {
            POBLog.error("POBVideoPlayerActivity", MSG_VIDEO_PLAYER_EMPTY_URL, new Object[0]);
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("bundle_extra");
        if (bundleExtra != null) {
            str = bundleExtra.getString("ForceOrientation");
            z = bundleExtra.getBoolean(ALLOW_ORIENTATION_KEY, true);
        } else {
            str = null;
            z = true;
        }
        if (!z) {
            if (str == null) {
                str = "none";
            }
            switch (str.hashCode()) {
                case -1700437898:
                    if (str.equals("sensor_landscape")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -31410088:
                    if (str.equals("reverse_portrait")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 729267099:
                    if (str.equals("portrait")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1430647483:
                    if (str.equals("landscape")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    setRequestedOrientation(6);
                    break;
                case 1:
                    setRequestedOrientation(7);
                    break;
                case 2:
                    setRequestedOrientation(1);
                    break;
                case 3:
                    setRequestedOrientation(0);
                    break;
            }
        }
        View a2 = a(a(stringExtra), -1, -1);
        if (Build.VERSION.SDK_INT >= 30) {
            POBUtils.setSystemFitWindowsForEdgeToEdge(a2);
        }
        setContentView(a2);
        this.e = getIntent().getIntExtra("listener_hash_code", 0);
        this.f = b();
        d();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a();
        c();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        e();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        f();
    }

    private void a(POBVideoPlayerActivityListener pOBVideoPlayerActivityListener) {
        List list = g;
        if (list != null) {
            list.remove(pOBVideoPlayerActivityListener);
            if (g.isEmpty()) {
                g = null;
            }
        }
    }

    private void a() {
        VideoView videoView = this.b;
        if (videoView != null) {
            videoView.suspend();
        }
        this.b = null;
        this.a = null;
    }

    private View a(View view, int i, int i2) {
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        if (view != null) {
            frameLayout.addView(view, layoutParams);
        }
        ImageButton createSkipButton = POBUIUtil.createSkipButton(this, R.id.pob_close_btn, com.pubmatic.sdk.webrendering.R.drawable.pob_ic_close_black_24dp);
        frameLayout.addView(createSkipButton);
        createSkipButton.setOnClickListener(new a());
        return frameLayout;
    }

    private View a(String str) {
        this.b = new VideoView(this);
        if (this.a == null) {
            MediaController mediaController = new MediaController(this);
            this.a = mediaController;
            mediaController.setMediaPlayer(this.b);
        }
        this.b.setMediaController(this.a);
        this.a.setAnchorView(this.b);
        this.b.setOnCompletionListener(new b());
        PubMaticVideoBridge.VideoViewSetVideoUri(this.b, Uri.parse(str));
        PubMaticVideoBridge.VideoViewPlay(this.b);
        return this.b;
    }
}
