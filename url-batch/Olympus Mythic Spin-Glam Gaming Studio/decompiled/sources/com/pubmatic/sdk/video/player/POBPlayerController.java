package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.player.POBVideoPlayerView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public abstract class POBPlayerController extends FrameLayout implements POBVideoPlayerView.POBVideoPlayerListener {
    public POBPlayerController(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onBufferUpdate(int i) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onClick() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onCompletion() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onFailure(int i, @NonNull String str) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onReadyToPlay(@NonNull POBVideoPlayerView pOBVideoPlayerView) {
    }

    abstract void setVideoPlayerEvents(@NonNull POBVideoPlayer pOBVideoPlayer);
}
