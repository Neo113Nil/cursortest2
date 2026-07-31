package com.mobilefuse.videoplayer.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.mobilefuse.sdk.StabilityHelper;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseVideoSurfaceView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J(\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/videoplayer/media/MobileFuseVideoSurfaceView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Lcom/mobilefuse/videoplayer/media/VideoViewInterface;", "context", "Landroid/content/Context;", "mediaPlayer", "Landroid/media/MediaPlayer;", "(Landroid/content/Context;Landroid/media/MediaPlayer;)V", "surface", "Landroid/view/Surface;", "surfaceHolder", "Landroid/view/SurfaceHolder;", "destroy", "", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "surfaceChanged", "holder", POBConstants.KEY_FORMAT, "width", "height", "surfaceCreated", "surfaceDestroyed", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MobileFuseVideoSurfaceView extends SurfaceView implements SurfaceHolder.Callback, VideoViewInterface {
    private final MediaPlayer mediaPlayer;
    private Surface surface;
    private final SurfaceHolder surfaceHolder;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseVideoSurfaceView(@NotNull Context context, @NotNull MediaPlayer mediaPlayer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.mediaPlayer = mediaPlayer;
        SurfaceHolder holder = getHolder();
        Intrinsics.checkNotNullExpressionValue(holder, "holder");
        this.surfaceHolder = holder;
        setZOrderMediaOverlay(true);
        holder.addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.surface = holder.getSurface();
        this.mediaPlayer.setDisplay(holder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder holder, int format, int width, int height) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.mediaPlayer.setDisplay(holder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.surface = null;
        this.mediaPlayer.setDisplay(null);
    }

    @Override // com.mobilefuse.videoplayer.media.VideoViewInterface
    public void destroy() {
        try {
            this.surfaceHolder.removeCallback(this);
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        try {
            int videoWidth = this.mediaPlayer.getVideoWidth();
            int videoHeight = this.mediaPlayer.getVideoHeight();
            if (videoWidth != 0 && videoHeight != 0) {
                int mode = View.MeasureSpec.getMode(widthMeasureSpec);
                int size = View.MeasureSpec.getSize(widthMeasureSpec);
                int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
                int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
                if (mode == 1073741824 && mode2 == 1073741824) {
                    int i2 = videoWidth * size2;
                    int i3 = size * videoHeight;
                    if (i2 < i3) {
                        size = i2 / videoHeight;
                    } else if (i2 > i3) {
                        size2 = i3 / videoWidth;
                    }
                } else if (mode == 1073741824) {
                    int i4 = (videoHeight * size) / videoWidth;
                    size2 = (mode2 != Integer.MIN_VALUE || i4 <= size2) ? i4 : size2 | 16777216;
                } else if (mode2 == 1073741824) {
                    int i5 = (videoWidth * size2) / videoHeight;
                    size = (mode != Integer.MIN_VALUE || i5 <= size) ? i5 : size | 16777216;
                } else {
                    if (mode2 != Integer.MIN_VALUE || videoHeight <= size2) {
                        i = videoWidth;
                        size2 = videoHeight;
                    } else {
                        i = (size2 * videoWidth) / videoHeight;
                    }
                    if (mode != Integer.MIN_VALUE || i <= size) {
                        size = i;
                    } else {
                        size2 = (videoHeight * size) / videoWidth;
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
            setMeasuredDimension(View.getDefaultSize(videoWidth, widthMeasureSpec), View.getDefaultSize(videoHeight, heightMeasureSpec));
        } catch (Exception e) {
            StabilityHelper.logException(this, e);
        }
    }
}
