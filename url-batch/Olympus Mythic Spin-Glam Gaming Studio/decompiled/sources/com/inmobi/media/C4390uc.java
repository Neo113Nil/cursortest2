package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import com.safedk.android.utils.Logger;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4390uc extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {
    public final InterfaceC4466x9 a;
    public C4337sc b;
    public ViewGroup c;
    public InterfaceC4364tc d;
    public boolean e;
    public final WeakReference f;
    public int g;
    public String h;
    public String i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4390uc(Activity activity, InterfaceC4466x9 interfaceC4466x9) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = interfaceC4466x9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.g = 100;
        this.j = -1;
        this.k = 0;
        this.f = new WeakReference(activity);
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(this, "lifecycleCallbacks");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static final void a(C4390uc c4390uc, MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC4466x9 interfaceC4466x9 = c4390uc.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c4390uc.b == null) {
            C4337sc c4337sc = new C4337sc(c4390uc.getContext());
            c4390uc.b = c4337sc;
            c4337sc.setAnchorView(c4390uc);
            c4390uc.setMediaController(c4390uc.b);
            c4390uc.requestLayout();
            c4390uc.requestFocus();
        }
    }

    private void safedk_videoview_uc_VideoViewPause_fc0909a6772bf7ec7ed57dfd931d0d87() {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/inmobi/media/uc;->safedk_videoview_uc_VideoViewPause_fc0909a6772bf7ec7ed57dfd931d0d87()V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", this, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                CreativeInfoManager.a(com.safedk.android.utils.h.i, BrandSafetyUtils.a(this), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e.getMessage());
            }
        }
        suspend();
    }

    private void safedk_videoview_uc_VideoViewPlay_1cd25093e0b187dede2869d94281a264() {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/inmobi/media/uc;->safedk_videoview_uc_VideoViewPlay_1cd25093e0b187dede2869d94281a264()V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", this, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                CreativeInfoManager.a(com.safedk.android.utils.h.i, (Object) this);
                CreativeInfoManager.a(com.safedk.android.utils.h.i, BrandSafetyUtils.a(this), false, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e.getMessage());
            }
        }
        super.start();
    }

    public final void b() {
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", "Release the media render view");
        }
        InMobiVideoBridge.VideoViewStop(this);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.c = null;
        }
        setMediaController(null);
        this.b = null;
        InterfaceC4364tc interfaceC4364tc = this.d;
        if (interfaceC4364tc != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            InterfaceC4466x9 interfaceC4466x92 = ((Ic) interfaceC4364tc).a.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final int getCurrentAudioVolume() {
        return this.g;
    }

    @Override // android.view.View
    @Nullable
    public final String getId() {
        return this.h;
    }

    @Nullable
    public final InterfaceC4364tc getListener() {
        return this.d;
    }

    public final int getMCurrentPosition() {
        return this.k;
    }

    @Nullable
    public final String getPlaybackUrl() {
        return this.i;
    }

    public final int getPreviousPosition() {
        return this.j;
    }

    @Nullable
    public final ViewGroup getViewContainer() {
        return this.c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f.get() == null || !Intrinsics.areEqual(this.f.get(), activity)) {
            return;
        }
        this.e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity activity2 = (Activity) this.f.get();
        if (activity2 == null || !Intrinsics.areEqual(activity2, activity)) {
            return;
        }
        this.e = true;
        if (getCurrentPosition() != 0) {
            this.k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/uc;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.i, mediaPlayer, "media-player");
        safedk_uc_onCompletion_99fa4110dc3ea60327712ec340fd0fb6(mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i, int i2) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("MediaRenderView", ">>> onError (" + i + ", " + i2 + ")");
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHolder().setSizeFromLayout();
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", ">>> onPrepared");
        }
        mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.uc$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                C4390uc.a(C4390uc.this, mediaPlayer, i, i2);
            }
        });
        int i = this.k;
        if (i < getDuration()) {
            this.k = i;
            seekTo(i);
        }
        InterfaceC4364tc interfaceC4364tc = this.d;
        if (interfaceC4364tc != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            InterfaceC4466x9 interfaceC4466x92 = ((Ic) interfaceC4364tc).a.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        Context context;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onVisibilityChanged(view, i);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", ">>> onVisibilityChanged (" + i + ")");
        }
        if (i != 0 || (context = AbstractC4002fj.a) == null) {
            return;
        }
        setBackground(new BitmapDrawable(context.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i + ")");
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", "Pause media playback");
        }
        safedk_videoview_uc_VideoViewPause_fc0909a6772bf7ec7ed57dfd931d0d87();
    }

    public void safedk_uc_onCompletion_99fa4110dc3ea60327712ec340fd0fb6(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    public final void setAudioMuted(boolean z) {
    }

    public final void setCurrentAudioVolume(int i) {
        this.g = i;
    }

    public final void setId(@Nullable String str) {
        this.h = str;
    }

    public final void setListener(@Nullable InterfaceC4364tc interfaceC4364tc) {
        this.d = interfaceC4364tc;
    }

    public final void setMCurrentPosition(int i) {
        this.k = i;
    }

    public final void setPlaybackUrl(@Nullable String str) {
        this.i = str;
    }

    public final void setPlayerPrepared(boolean z) {
    }

    public final void setPreviousPosition(int i) {
        this.j = i;
    }

    public final void setViewContainer(@Nullable ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.e) {
            return;
        }
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("MediaRenderView", "Start media playback");
        }
        safedk_videoview_uc_VideoViewPlay_1cd25093e0b187dede2869d94281a264();
    }

    public final void setPlaybackData(@NotNull String url) {
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if (((byte) (b & Byte.MIN_VALUE)) > 0) {
                sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb.append(new String(new char[]{cArr[(b >> 4) & 15], cArr[(byte) (b & 15)]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            byte[] bytes2 = sb2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            str = new String(bytes2, Charsets.ISO_8859_1);
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.i = str;
        this.h = "anonymous";
    }

    public final void a() {
        InMobiVideoBridge.VideoViewSetVideoPath(this, this.i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.b == null) {
            C4337sc c4337sc = new C4337sc(getContext());
            this.b = c4337sc;
            c4337sc.setAnchorView(this);
            setMediaController(this.b);
        }
    }
}
