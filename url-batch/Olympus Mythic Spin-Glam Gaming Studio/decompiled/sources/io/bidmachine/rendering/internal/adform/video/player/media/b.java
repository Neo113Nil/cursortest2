package io.bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.BidMachineVideoBridge;
import io.bidmachine.rendering.internal.adform.video.player.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class b extends FrameLayout {
    private final io.bidmachine.rendering.internal.view.a a;
    private c b;
    private MediaPlayer c;
    private Surface d;

    private final class a implements MediaPlayer.OnVideoSizeChangedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            b.this.setVideoAspectRatio(i / i2);
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.media.b$b, reason: collision with other inner class name */
    private final class C1786b implements e {
        public C1786b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            b bVar = b.this;
            Surface surface = new Surface(surfaceTexture);
            b.this.a(surface);
            bVar.d = surface;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            c listener = b.this.getListener();
            if (listener == null) {
                return false;
            }
            listener.a();
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        io.bidmachine.rendering.internal.view.a aVar = new io.bidmachine.rendering.internal.view.a(context);
        aVar.setSurfaceTextureListener(new C1786b());
        this.a = aVar;
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final c getListener() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setListener(@Nullable c cVar) {
        this.b = cVar;
    }

    public final void setMediaPlayer(@Nullable MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new a());
        } else {
            mediaPlayer = null;
        }
        this.c = mediaPlayer;
    }

    public final void setVideoAspectRatio(float f) {
        this.a.setVideoAspectRatio(f);
    }

    private final void b() {
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
        }
        this.d = null;
    }

    public final void a() {
        a(null);
        b();
        this.c = null;
        this.a.setSurfaceTextureListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit a(Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.c;
            if (mediaPlayer != null) {
                BidMachineVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface);
                return Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
