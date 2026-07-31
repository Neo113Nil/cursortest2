package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.R;
import com.pubmatic.sdk.video.player.POBMuteButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class POBVideoPlayerController extends POBPlayerController {
    private static final String e = "POBVideoPlayerController";
    private POBVideoPlayer a;
    private SeekBar b;
    private POBMuteButton c;
    private final Resources d;

    public POBVideoPlayerController(@NonNull Context context) {
        this(context, R.layout.pob_video_mute_button_default, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private SeekBar b() {
        SeekBar seekBar = new SeekBar(getContext());
        seekBar.setPadding(0, 0, 0, POBUtils.convertDpToPixel(1));
        seekBar.setThumb(null);
        try {
            seekBar.setProgressDrawable(this.d.getDrawable(R.drawable.seekbar_progress_drawable, null));
        } catch (Resources.NotFoundException e2) {
            POBLog.error(e, "Error while setting progress drawable for seek bar: ", e2.getMessage());
        }
        seekBar.setOnTouchListener(new View.OnTouchListener() { // from class: com.pubmatic.sdk.video.player.POBVideoPlayerController$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a;
                a = POBVideoPlayerController.a(view, motionEvent);
                return a;
            }
        });
        return seekBar;
    }

    private void c() {
        POBMuteButton pOBMuteButton = this.c;
        if (pOBMuteButton != null) {
            pOBMuteButton.setOnMuteToggleListener(new POBMuteButton.MuteStateChangeListener() { // from class: com.pubmatic.sdk.video.player.POBVideoPlayerController$$ExternalSyntheticLambda0
                @Override // com.pubmatic.sdk.video.player.POBMuteButton.MuteStateChangeListener
                public final void onMuteStateChange(boolean z) {
                    POBVideoPlayerController.this.a(z);
                }
            });
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onMute(boolean z) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onPause() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onProgressUpdate(int i) {
        SeekBar seekBar = this.b;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onResume() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onStart() {
        POBVideoPlayer pOBVideoPlayer = this.a;
        if (pOBVideoPlayer != null) {
            SeekBar seekBar = this.b;
            if (seekBar != null) {
                seekBar.setMax(pOBVideoPlayer.getMediaDuration());
            }
            POBMuteButton pOBMuteButton = this.c;
            if (pOBMuteButton != null) {
                pOBMuteButton.setMuted(this.a.isMute());
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController
    public void setVideoPlayerEvents(@NonNull POBVideoPlayer pOBVideoPlayer) {
        this.a = pOBVideoPlayer;
    }

    public POBVideoPlayerController(@NonNull Context context, @LayoutRes int i, boolean z, boolean z2) {
        super(context);
        this.d = getResources();
        if (z) {
            this.b = b();
        }
        if (z2) {
            this.c = new POBMuteButton(getContext(), i);
            c();
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        POBVideoPlayer pOBVideoPlayer = this.a;
        if (pOBVideoPlayer != null) {
            if (z) {
                pOBVideoPlayer.mute();
            } else {
                pOBVideoPlayer.unMute();
            }
        }
    }

    private void a() {
        if (this.b != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.d.getDimensionPixelOffset(R.dimen.pob_seek_bar_height));
            layoutParams.gravity = 80;
            layoutParams.leftMargin = this.d.getDimensionPixelOffset(R.dimen.pob_seek_left_margin);
            layoutParams.rightMargin = this.d.getDimensionPixelOffset(R.dimen.pob_seek_right_margin);
            addView(this.b, layoutParams);
        }
        View view = this.c;
        if (view != null) {
            addView(view);
        }
    }
}
