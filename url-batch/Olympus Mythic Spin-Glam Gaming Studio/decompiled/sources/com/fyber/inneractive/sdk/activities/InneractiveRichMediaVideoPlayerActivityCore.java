package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.DTExchangeVideoBridge;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";
    public VideoView a;
    public int b = 0;
    public final n c = new n(this);

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.p);
        p0.startActivity(p1);
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            IAlog.a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.p, me);
        return super.dispatchTouchEvent(me);
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(R.layout.ia_layout_rich_media_video);
        this.a = (VideoView) findViewById(R.id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra("video_url")) ? null : intent.getStringExtra("video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.a.setVideoPath(stringExtra);
            this.a.setOnCompletionListener(new p(this));
            this.a.setOnErrorListener(new q(this));
            this.a.setOnPreparedListener(this.c);
        }
        findViewById(R.id.ia_iv_close_button).setOnClickListener(new o(this));
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.b = this.a.getCurrentPosition();
        DTExchangeVideoBridge.VideoViewPause(this.a);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.a;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }
}
