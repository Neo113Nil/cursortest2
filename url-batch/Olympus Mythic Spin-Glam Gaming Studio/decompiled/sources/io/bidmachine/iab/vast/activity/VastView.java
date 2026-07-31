package io.bidmachine.iab.vast.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import com.safedk.android.internal.partials.BidMachineVideoBridge;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.measurer.VastAdMeasurer;
import io.bidmachine.iab.mraid.MraidInterstitial;
import io.bidmachine.iab.mraid.MraidInterstitialListener;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabCloseWrapper;
import io.bidmachine.iab.utils.IabCountDownWrapper;
import io.bidmachine.iab.utils.IabCtaWrapper;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.IabElementWrapper;
import io.bidmachine.iab.utils.IabLoadingWrapper;
import io.bidmachine.iab.utils.IabMuteWrapper;
import io.bidmachine.iab.utils.IabProgressWrapper;
import io.bidmachine.iab.utils.IabRepeatWrapper;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastExtension;
import io.bidmachine.iab.vast.VastHelper;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastPlaybackListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastRequestManager;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.VastVideoLoadedListener;
import io.bidmachine.iab.vast.VastViewListener;
import io.bidmachine.iab.vast.VideoType;
import io.bidmachine.iab.vast.processor.VastAd;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.PostBannerTag;
import io.bidmachine.iab.vast.view.IabVideoTexture;
import io.bidmachine.iab.view.CloseableLayout;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.BaseWebChromeClient;
import io.bidmachine.util.ViewUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class VastView extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private final List O;
    private final List P;
    private final Runnable Q;
    private final Runnable R;
    private final B S;
    private final B T;
    private final LinkedList U;
    private int V;
    private float W;
    private final String a;
    private final B a0;
    IabVideoTexture b;
    private final TextureView.SurfaceTextureListener b0;
    FrameLayout c;
    private final MediaPlayer.OnCompletionListener c0;
    Surface d;
    private final MediaPlayer.OnErrorListener d0;
    FrameLayout e;
    private final MediaPlayer.OnPreparedListener e0;
    CloseableLayout f;
    private final MediaPlayer.OnVideoSizeChangedListener f0;
    IabCloseWrapper g;
    private VastHelper.OnScreenStateChangeListener g0;
    IabCountDownWrapper h;
    private final View.OnTouchListener h0;
    IabRepeatWrapper i;
    private final WebChromeClient i0;
    IabMuteWrapper j;
    private final WebViewClient j0;
    IabLoadingWrapper k;
    IabProgressWrapper l;
    IabCtaWrapper m;
    MediaPlayer n;
    View o;
    CompanionTag p;
    CompanionTag q;
    ImageView r;
    MraidInterstitial s;
    VastRequest t;
    C u;
    private VastViewListener v;
    private VastPlaybackListener w;
    private VastAdMeasurer x;
    private MraidAdMeasurer y;
    private z z;

    private interface B {
        void a(int i, int i2, float f);
    }

    private static class PostBannerAdMeasurer implements MraidAdMeasurer {
        private final VastView a;
        private final MraidAdMeasurer b;

        public PostBannerAdMeasurer(@NonNull VastView vastView, @NonNull MraidAdMeasurer mraidAdMeasurer) {
            this.a = vastView;
            this.b = mraidAdMeasurer;
        }

        @Override // io.bidmachine.iab.measurer.AdMeasurer
        public void onAdClicked() {
            this.b.onAdClicked();
        }

        @Override // io.bidmachine.iab.measurer.AdMeasurer
        public void onAdShown() {
            this.b.onAdShown();
        }

        @Override // io.bidmachine.iab.measurer.AdMeasurer
        public void onError(@NonNull IabError iabError) {
            this.b.onError(iabError);
        }

        @Override // io.bidmachine.iab.measurer.MraidAdMeasurer
        @NonNull
        public String prepareCreativeForMeasure(@NonNull String str) {
            return this.b.prepareCreativeForMeasure(str);
        }

        @Override // io.bidmachine.iab.measurer.AdMeasurer
        public void registerAdContainer(@NonNull ViewGroup viewGroup) {
            this.b.registerAdContainer(this.a);
        }

        @Override // io.bidmachine.iab.measurer.AdMeasurer
        public void onAdViewReady(@NonNull WebView webView) {
            this.b.onAdViewReady(webView);
        }

        @Override // io.bidmachine.iab.measurer.AdMeasurer
        public void registerAdView(@NonNull WebView webView) {
            this.b.registerAdView(webView);
        }
    }

    /* renamed from: io.bidmachine.iab.vast.activity.VastView$a, reason: case insensitive filesystem */
    class RunnableC6003a implements Runnable {
        RunnableC6003a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.d();
            }
        }
    }

    /* renamed from: io.bidmachine.iab.vast.activity.VastView$b, reason: case insensitive filesystem */
    class RunnableC6004b implements Runnable {
        RunnableC6004b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (VastView.this.isPlaybackStarted() && VastView.this.n.isPlaying()) {
                    int duration = VastView.this.n.getDuration();
                    int currentPosition = VastView.this.n.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f = (currentPosition * 100.0f) / duration;
                        VastView.this.S.a(duration, currentPosition, f);
                        VastView.this.T.a(duration, currentPosition, f);
                        VastView.this.a0.a(duration, currentPosition, f);
                        if (f > 105.0f) {
                            VastLog.e(VastView.this.a, "Playback tracking: video hang detected", new Object[0]);
                            VastView.this.g();
                        }
                    }
                }
            } catch (Exception e) {
                VastLog.e(VastView.this.a, "Playback tracking exception: %s", e.getMessage());
            }
            VastView.this.postDelayed(this, 16L);
        }
    }

    /* renamed from: io.bidmachine.iab.vast.activity.VastView$c, reason: case insensitive filesystem */
    class C6005c implements B {
        C6005c() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.B
        public void a(int i, int i2, float f) {
            IabCountDownWrapper iabCountDownWrapper;
            VastView vastView = VastView.this;
            C c = vastView.u;
            if (c.i || c.b == 0.0f || !vastView.a(vastView.t)) {
                return;
            }
            VastView vastView2 = VastView.this;
            float f2 = vastView2.u.b * 1000.0f;
            float f3 = i2;
            float f4 = f2 - f3;
            int i3 = (int) ((f3 * 100.0f) / f2);
            VastLog.d(vastView2.a, "Skip percent: %s", Integer.valueOf(i3));
            if (i3 < 100 && (iabCountDownWrapper = VastView.this.h) != null) {
                iabCountDownWrapper.changePercentage(i3, (int) Math.ceil(f4 / 1000.0d));
            }
            if (f4 <= 0.0f) {
                VastView vastView3 = VastView.this;
                C c2 = vastView3.u;
                c2.b = 0.0f;
                c2.i = true;
                vastView3.setCloseControlsVisible(true);
            }
        }
    }

    class d implements B {
        d() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.B
        public void a(int i, int i2, float f) {
            VastView vastView = VastView.this;
            C c = vastView.u;
            if (c.h && c.c == 3) {
                return;
            }
            if (vastView.t.getMaxDurationMillis() > 0 && i2 > VastView.this.t.getMaxDurationMillis() && VastView.this.t.getVideoType() == VideoType.Rewarded) {
                VastView vastView2 = VastView.this;
                vastView2.u.i = true;
                vastView2.setCloseControlsVisible(true);
            }
            VastView vastView3 = VastView.this;
            int i3 = vastView3.u.c;
            if (f > i3 * 25.0f) {
                if (i3 == 3) {
                    VastLog.d(vastView3.a, "Video at third quartile: (%s)", Float.valueOf(f));
                    VastView.this.c(TrackingEvent.thirdQuartile);
                    if (VastView.this.w != null) {
                        VastView.this.w.onVideoThirdQuartile();
                    }
                } else if (i3 == 0) {
                    VastLog.d(vastView3.a, "Video at start: (%s)", Float.valueOf(f));
                    VastView.this.c(TrackingEvent.start);
                    if (VastView.this.w != null) {
                        VastView.this.w.onVideoStarted(i, VastView.this.u.f ? 0.0f : 1.0f);
                    }
                } else if (i3 == 1) {
                    VastLog.d(vastView3.a, "Video at first quartile: (%s)", Float.valueOf(f));
                    VastView.this.c(TrackingEvent.firstQuartile);
                    if (VastView.this.w != null) {
                        VastView.this.w.onVideoFirstQuartile();
                    }
                } else if (i3 == 2) {
                    VastLog.d(vastView3.a, "Video at midpoint: (%s)", Float.valueOf(f));
                    VastView.this.c(TrackingEvent.midpoint);
                    if (VastView.this.w != null) {
                        VastView.this.w.onVideoMidpoint();
                    }
                }
                VastView.this.u.c++;
            }
        }
    }

    class e implements B {
        e() {
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.B
        public void a(int i, int i2, float f) {
            if (VastView.this.U.size() == 2 && ((Integer) VastView.this.U.getFirst()).intValue() > ((Integer) VastView.this.U.getLast()).intValue()) {
                VastLog.e(VastView.this.a, "Playing progressing error: seek", new Object[0]);
                VastView.this.U.removeFirst();
            }
            if (VastView.this.U.size() == 19) {
                Integer num = (Integer) VastView.this.U.getFirst();
                int intValue = num.intValue();
                Integer num2 = (Integer) VastView.this.U.getLast();
                int intValue2 = num2.intValue();
                VastLog.d(VastView.this.a, "Playing progressing position: last=%d, first=%d)", num2, num);
                if (intValue2 > intValue) {
                    VastView.this.U.removeFirst();
                } else {
                    VastView.l(VastView.this);
                    if (VastView.this.V >= 3) {
                        VastView.this.c(IabError.internal("Playing progressing error: video hang detected"));
                        return;
                    }
                }
            }
            try {
                VastView.this.U.addLast(Integer.valueOf(i2));
                if (i == 0 || i2 <= 0) {
                    return;
                }
                VastView vastView = VastView.this;
                if (vastView.l != null) {
                    VastLog.d(vastView.a, "Playing progressing percent: %s", Float.valueOf(f));
                    if (VastView.this.W < f) {
                        VastView.this.W = f;
                        int i3 = i / 1000;
                        VastView.this.l.changePercentage(f, Math.min(i3, (int) Math.ceil(i2 / 1000.0f)), i3);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    class f implements TextureView.SurfaceTextureListener {
        f() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VastLog.d(VastView.this.a, "onSurfaceTextureAvailable", new Object[0]);
            VastView.this.d = new Surface(surfaceTexture);
            VastView.this.G = true;
            if (VastView.this.H) {
                VastView.this.H = false;
                VastView.this.startPlayback("onSurfaceTextureAvailable");
            } else if (VastView.this.isPlaybackStarted()) {
                VastView vastView = VastView.this;
                BidMachineVideoBridge.MediaPlayerSetSurface(vastView.n, vastView.d);
                VastView.this.r();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VastLog.d(VastView.this.a, "onSurfaceTextureDestroyed", new Object[0]);
            VastView vastView = VastView.this;
            vastView.d = null;
            vastView.G = false;
            if (VastView.this.isPlaybackStarted()) {
                BidMachineVideoBridge.MediaPlayerSetSurface(VastView.this.n, null);
                VastView.this.l();
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            VastLog.d(VastView.this.a, "onSurfaceTextureSizeChanged: %d/%d", Integer.valueOf(i), Integer.valueOf(i2));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class g implements MediaPlayer.OnCompletionListener {
        g() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/vast/activity/VastView$g;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted("io.bidmachine", mediaPlayer, "media-player");
            safedk_VastView$g_onCompletion_01cc59331ce5996d04a2f05dddaadeb3(mediaPlayer);
        }

        public void safedk_VastView$g_onCompletion_01cc59331ce5996d04a2f05dddaadeb3(MediaPlayer p0) {
            VastLog.d(VastView.this.a, "MediaPlayer - onCompletion", new Object[0]);
            VastView.this.g();
        }
    }

    class h implements MediaPlayer.OnErrorListener {
        h() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            VastView.this.c(IabError.internal(String.format("MediaPlayer - onError: what - %s, extra - %s", Integer.valueOf(i), Integer.valueOf(i2))));
            return true;
        }
    }

    class i implements MediaPlayer.OnPreparedListener {
        i() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            VastLog.d(VastView.this.a, "MediaPlayer - onPrepared", new Object[0]);
            VastView vastView = VastView.this;
            if (vastView.u.j) {
                return;
            }
            vastView.c(TrackingEvent.creativeView);
            VastView.this.c(TrackingEvent.fullscreen);
            VastView.this.y();
            VastView.this.setLoadingViewVisibility(false);
            VastView.this.J = true;
            if (!VastView.this.u.g) {
                BidMachineVideoBridge.MediaPlayerStart(mediaPlayer);
                VastView.this.u();
            }
            VastView.this.x();
            int i = VastView.this.u.d;
            if (i > 0) {
                mediaPlayer.seekTo(i);
                VastView.this.c(TrackingEvent.resume);
                if (VastView.this.w != null) {
                    VastView.this.w.onVideoResumed();
                }
            }
            VastView vastView2 = VastView.this;
            if (!vastView2.u.m) {
                vastView2.l();
            }
            VastView vastView3 = VastView.this;
            if (vastView3.u.k) {
                return;
            }
            vastView3.h();
            if (VastView.this.t.shouldPreloadCompanion()) {
                VastView.this.a(false);
            }
        }
    }

    class j implements MediaPlayer.OnVideoSizeChangedListener {
        j() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            VastLog.d(VastView.this.a, "onVideoSizeChanged", new Object[0]);
            VastView.this.C = i;
            VastView.this.D = i2;
            VastView.this.d();
        }
    }

    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VastView.this.isPlaybackStarted() || VastView.this.u.j) {
                VastView.this.t();
            }
        }
    }

    class l implements VastHelper.OnScreenStateChangeListener {
        l() {
        }

        @Override // io.bidmachine.iab.vast.VastHelper.OnScreenStateChangeListener
        public void onScreenStateChange(boolean z) {
            VastView.this.z();
        }
    }

    class m implements View.OnTouchListener {
        m() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            VastView.this.O.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    class n extends BaseWebChromeClient {
        n() {
        }

        private boolean a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.d("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            VastLog.d("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }
    }

    class p implements VastVideoLoadedListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ CacheControl b;

        p(boolean z, CacheControl cacheControl) {
            this.a = z;
            this.b = cacheControl;
        }

        @Override // io.bidmachine.iab.vast.VastVideoLoadedListener
        public void onError(VastRequest vastRequest, IabError iabError) {
            VastView vastView = VastView.this;
            vastView.b(vastView.v, vastRequest, IabError.placeholder(String.format("Error loading video after showing with %s - %s", this.b, iabError)));
        }

        @Override // io.bidmachine.iab.vast.VastVideoLoadedListener
        public void onSuccess(VastRequest vastRequest, VastAd vastAd) {
            VastView.this.a(vastRequest, vastAd, this.a);
        }
    }

    class q implements CloseableLayout.OnCloseClickListener {
        q() {
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCloseClick() {
            VastView vastView = VastView.this;
            vastView.b(vastView.v, VastView.this.t, IabError.placeholder("Close button clicked"));
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCountDownFinish() {
        }
    }

    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.i();
        }
    }

    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastRequest vastRequest = VastView.this.t;
            if (vastRequest != null && vastRequest.isR1()) {
                VastView vastView = VastView.this;
                if (!vastView.u.l && vastView.i()) {
                    return;
                }
            }
            if (VastView.this.I) {
                VastView.this.e();
            } else {
                VastView.this.handleBackPress();
            }
        }
    }

    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.A();
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.q();
        }
    }

    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VastView.this.i();
        }
    }

    class w extends z {
        final /* synthetic */ WeakReference f;

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.i();
                VastView.this.e();
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                VastView.this.c.setVisibility(8);
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VastView.this.i();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f = weakReference;
        }

        @Override // io.bidmachine.iab.vast.activity.VastView.z
        void a(Bitmap bitmap) {
            ImageView imageView = (ImageView) this.f.get();
            if (imageView != null) {
                if (bitmap == null) {
                    imageView.setOnClickListener(new a());
                    return;
                }
                imageView.setImageBitmap(bitmap);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).setDuration(100L).setListener(new b()).start();
                imageView.setOnClickListener(new c());
            }
        }
    }

    private class x implements IabClickCallback {
        private final List a;

        public x(List list) {
            this.a = list;
        }

        @Override // io.bidmachine.iab.utils.IabClickCallback
        public void clickHandleCanceled() {
            if (VastView.this.isCompanionShown()) {
                VastView.this.setLoadingViewVisibility(false);
            } else {
                VastView.this.r();
            }
        }

        @Override // io.bidmachine.iab.utils.IabClickCallback
        public void clickHandled() {
            if (VastView.this.isCompanionShown()) {
                VastView.this.setLoadingViewVisibility(false);
            } else if (VastView.this.E) {
                VastView.this.r();
            } else {
                VastView.this.l();
            }
        }

        @Override // io.bidmachine.iab.utils.IabClickCallback
        public void clickVerified() {
            VastView.this.a(this.a);
            if (VastView.this.x != null) {
                VastView.this.x.onAdClicked();
            }
        }
    }

    private final class y implements MraidInterstitialListener {
        private y() {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onCalendarEvent(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onClose(MraidInterstitial mraidInterstitial) {
            VastView.this.f();
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onExpired(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onLoadFailed(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onLoaded(MraidInterstitial mraidInterstitial) {
            VastView vastView = VastView.this;
            if (vastView.u.j) {
                vastView.setLoadingViewVisibility(false);
                mraidInterstitial.showInView(VastView.this, false);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onOpenPrivacySheet(MraidInterstitial mraidInterstitial, PrivacySheetParams privacySheetParams) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onOpenUrl(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
            iabClickCallback.clickHandled();
            VastView vastView = VastView.this;
            vastView.a(vastView.q, str);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onShowFailed(MraidInterstitial mraidInterstitial, IabError iabError) {
            VastView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onShown(MraidInterstitial mraidInterstitial) {
        }

        @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
        public void onStorePicture(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
        }

        /* synthetic */ y(VastView vastView, k kVar) {
            this();
        }
    }

    private static abstract class z extends Thread {
        private final WeakReference a;
        private final Uri b;
        private final String c;
        private Bitmap d;
        private boolean e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z zVar = z.this;
                zVar.a(zVar.d);
            }
        }

        z(Context context, Uri uri, String str) {
            this.a = new WeakReference(context);
            this.b = uri;
            this.c = str;
            if (str == null && (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(uri.getPath()).exists())) {
                a((Bitmap) null);
            } else {
                start();
            }
        }

        abstract void a(Bitmap bitmap);

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Context context = (Context) this.a.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.b;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.c;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.d = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e) {
                    VastLog.e("MediaFrameRetriever", e.getMessage(), new Object[0]);
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e2) {
                VastLog.e("MediaFrameRetriever", e2.getMessage(), new Object[0]);
            }
            if (this.e) {
                return;
            }
            Utils.onUiThread(new a());
        }

        void a() {
            this.e = true;
        }
    }

    public VastView(@NonNull Context context) {
        this(context, null);
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    static /* synthetic */ int l(VastView vastView) {
        int i2 = vastView.V;
        vastView.V = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z2) {
        this.L = z2;
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z2) {
        IabLoadingWrapper iabLoadingWrapper = this.k;
        if (iabLoadingWrapper == null) {
            return;
        }
        if (!z2) {
            iabLoadingWrapper.setVisibility(8);
        } else {
            iabLoadingWrapper.setVisibility(0);
            this.k.bringToFront();
        }
    }

    private void setMute(boolean z2) {
        this.u.f = z2;
        x();
        c(this.u.f ? TrackingEvent.mute : TrackingEvent.unmute);
    }

    private void setPlaceholderViewVisible(boolean z2) {
        CloseableLayout closeableLayout = this.f;
        VastRequest vastRequest = this.t;
        closeableLayout.setCloseVisibility(z2, vastRequest != null ? vastRequest.getPlaceholderTimeoutSec() : 3.0f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        this.e.bringToFront();
    }

    public void destroy() {
        MraidInterstitial mraidInterstitial = this.s;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.s = null;
            this.q = null;
        }
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        z zVar = this.z;
        if (zVar != null) {
            zVar.a();
            this.z = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    public boolean display(@Nullable VastRequest vastRequest, @Nullable Boolean bool) {
        return a(vastRequest, bool, false);
    }

    @Nullable
    public VastViewListener getListener() {
        return this.v;
    }

    public void handleBackPress() {
        if (this.f.isVisible() && this.f.canBeClosed()) {
            b(this.v, this.t, IabError.placeholder("OnBackPress event fired"));
            return;
        }
        if (isSkipEnabled()) {
            if (!isCompanionShown()) {
                m();
                return;
            }
            VastRequest vastRequest = this.t;
            if (vastRequest == null || vastRequest.getVideoType() != VideoType.NonRewarded) {
                return;
            }
            if (this.q == null) {
                e();
                return;
            }
            MraidInterstitial mraidInterstitial = this.s;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                f();
            }
        }
    }

    public boolean isCompanionShown() {
        return this.u.j;
    }

    public boolean isFinished() {
        VastRequest vastRequest = this.t;
        return vastRequest != null && ((vastRequest.getCompanionCloseTime() == 0.0f && this.u.h) || (this.t.getCompanionCloseTime() > 0.0f && this.u.j));
    }

    public boolean isFullscreen() {
        return this.u.e;
    }

    public boolean isLoaded() {
        VastRequest vastRequest = this.t;
        return (vastRequest == null || vastRequest.getVastAd() == null) ? false : true;
    }

    public boolean isPlaybackStarted() {
        return this.n != null && this.J;
    }

    public boolean isSkipEnabled() {
        C c = this.u;
        return c.i || c.b == 0.0f;
    }

    public boolean isVideoFileLoaded() {
        VastRequest vastRequest = this.t;
        return vastRequest != null && vastRequest.checkFile();
    }

    public void mute() {
        setMute(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            startPlayback("onAttachedToWindow");
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isLoaded()) {
            i(this.t.getVastAd().getAppodealExtension());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopPlayback();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a = (A) parcelable;
        super.onRestoreInstanceState(a.getSuperState());
        C c = a.a;
        if (c != null) {
            this.u = c;
        }
        VastRequest vastRequest = VastRequestManager.get(this.u.a);
        if (vastRequest != null) {
            a(vastRequest, (Boolean) null, true);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (isPlaybackStarted()) {
            this.u.d = this.n.getCurrentPosition();
        }
        A a = new A(super.onSaveInstanceState());
        a.a = this.u;
        return a;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        removeCallbacks(this.Q);
        post(this.Q);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        VastLog.d(this.a, "onWindowFocusChanged: %s", Boolean.valueOf(z2));
        this.E = z2;
        z();
    }

    public void pause() {
        setCanAutoResume(false);
        l();
    }

    public void resume() {
        setCanAutoResume(true);
        r();
    }

    public void setAdMeasurer(@Nullable VastAdMeasurer vastAdMeasurer) {
        this.x = vastAdMeasurer;
    }

    public void setCanAutoResume(boolean z2) {
        this.M = z2;
        this.u.m = z2;
    }

    public void setCanIgnorePostBanner(boolean z2) {
        this.N = z2;
        this.u.n = z2;
    }

    public void setListener(@Nullable VastViewListener vastViewListener) {
        this.v = vastViewListener;
    }

    public void setPlaybackListener(@Nullable VastPlaybackListener vastPlaybackListener) {
        this.w = vastPlaybackListener;
    }

    public void setPostBannerAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
        this.y = mraidAdMeasurer != null ? new PostBannerAdMeasurer(this, mraidAdMeasurer) : null;
    }

    public void startPlayback(String str) {
        VastLog.d(this.a, "startPlayback: %s", str);
        if (isLoaded()) {
            setPlaceholderViewVisible(false);
            if (this.u.j) {
                s();
                return;
            }
            if (!this.E) {
                this.F = true;
                return;
            }
            if (this.G) {
                stopPlayback();
                k();
                d();
                n();
                VastHelper.addScreenStateChangeListener(this, this.g0);
            } else {
                this.H = true;
            }
            if (this.c.getVisibility() != 0) {
                this.c.setVisibility(0);
            }
        }
    }

    public void stopPlayback() {
        this.u.g = false;
        if (this.n != null) {
            VastLog.d(this.a, "stopPlayback", new Object[0]);
            try {
                if (this.n.isPlaying()) {
                    BidMachineVideoBridge.MediaPlayerStop(this.n);
                }
                BidMachineVideoBridge.MediaPlayerSetSurface(this.n, null);
                BidMachineVideoBridge.MediaPlayerRelease(this.n);
            } catch (Exception e2) {
                VastLog.e(this.a, e2);
            }
            this.n = null;
            this.J = false;
            this.K = false;
            c();
            VastHelper.removeScreenStateChangeListener(this);
        }
    }

    public void unmute() {
        setMute(false);
    }

    public VastView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        setMute(!this.u.f);
    }

    private void g(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getProgressStyle().isVisible().booleanValue()) {
            IabProgressWrapper iabProgressWrapper = this.l;
            if (iabProgressWrapper != null) {
                iabProgressWrapper.detach();
                return;
            }
            return;
        }
        if (this.l == null) {
            IabProgressWrapper iabProgressWrapper2 = new IabProgressWrapper(null);
            this.l = iabProgressWrapper2;
            this.P.add(iabProgressWrapper2);
        }
        this.l.attach(getContext(), this.e, a(vastExtension, vastExtension != null ? vastExtension.getProgressStyle() : null));
        this.l.changePercentage(0.0f, 0, 0);
    }

    private void h(VastExtension vastExtension) {
        if (vastExtension == null || !vastExtension.getRepeatStyle().isVisible().booleanValue()) {
            IabRepeatWrapper iabRepeatWrapper = this.i;
            if (iabRepeatWrapper != null) {
                iabRepeatWrapper.detach();
                return;
            }
            return;
        }
        if (this.i == null) {
            IabRepeatWrapper iabRepeatWrapper2 = new IabRepeatWrapper(new u());
            this.i = iabRepeatWrapper2;
            this.P.add(iabRepeatWrapper2);
        }
        this.i.attach(getContext(), this.e, a(vastExtension, vastExtension.getRepeatStyle()));
    }

    private void i(VastExtension vastExtension) {
        IabElementStyle iabElementStyle;
        IabElementStyle copyWith = vastExtension != null ? Assets.DEF_VIDEO_STYLE.copyWith(vastExtension.getVideoStyle()) : Assets.DEF_VIDEO_STYLE;
        if (vastExtension == null || !vastExtension.isVideoClickable()) {
            this.c.setOnClickListener(null);
            this.c.setClickable(false);
        } else {
            this.c.setOnClickListener(new v());
        }
        this.c.setBackgroundColor(copyWith.getFillColor().intValue());
        o();
        if (this.p == null || this.u.j) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.c.setLayoutParams(layoutParams);
            return;
        }
        this.o = a(getContext(), this.p);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.o.getLayoutParams());
        if (POBCommonConstants.BANNER_PLACEMENT_TYPE.equals(copyWith.getStyle())) {
            iabElementStyle = Assets.DEF_INLINE_BANNER_STYLE;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (copyWith.getHorizontalPosition().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.o.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.o.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (copyWith.getVerticalPosition().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.o.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.o.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            IabElementStyle iabElementStyle2 = Assets.DEF_BANNER_STYLE;
            layoutParams2.addRule(13);
            iabElementStyle = iabElementStyle2;
        }
        if (vastExtension != null) {
            iabElementStyle = iabElementStyle.copyWith(vastExtension.getCtaStyle());
        }
        iabElementStyle.applyPadding(getContext(), this.o);
        iabElementStyle.applyMargin(getContext(), layoutParams3);
        iabElementStyle.applyRelativeAlignment(layoutParams3);
        this.o.setBackgroundColor(iabElementStyle.getFillColor().intValue());
        copyWith.applyPadding(getContext(), this.c);
        copyWith.applyMargin(getContext(), layoutParams2);
        this.c.setLayoutParams(layoutParams2);
        addView(this.o, layoutParams3);
        a(TrackingEvent.creativeView);
    }

    private void j() {
        VastLog.d(this.a, "finishVideoPlaying", new Object[0]);
        stopPlayback();
        VastRequest vastRequest = this.t;
        if (vastRequest == null || vastRequest.isAutoClose() || !(this.t.getVastAd().getAppodealExtension() == null || this.t.getVastAd().getAppodealExtension().getPostBannerTag().isVisible())) {
            e();
            return;
        }
        if (isSkipEnabled()) {
            c(TrackingEvent.close);
        }
        setLoadingViewVisibility(false);
        o();
        s();
    }

    private void k() {
        if (this.r != null) {
            p();
        } else {
            MraidInterstitial mraidInterstitial = this.s;
            if (mraidInterstitial != null) {
                mraidInterstitial.destroy();
                this.s = null;
                this.q = null;
            }
        }
        this.I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!isPlaybackStarted() || this.u.g) {
            return;
        }
        VastLog.d(this.a, "pausePlayback", new Object[0]);
        C c = this.u;
        c.g = true;
        c.d = this.n.getCurrentPosition();
        BidMachineVideoBridge.MediaPlayerPause(this.n);
        c();
        a();
        c(TrackingEvent.pause);
        VastPlaybackListener vastPlaybackListener = this.w;
        if (vastPlaybackListener != null) {
            vastPlaybackListener.onVideoPaused();
        }
    }

    private void m() {
        VastLog.e(this.a, "performVideoCloseClick", new Object[0]);
        stopPlayback();
        if (this.K) {
            e();
            return;
        }
        if (!this.u.h) {
            c(TrackingEvent.skip);
            VastPlaybackListener vastPlaybackListener = this.w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoSkipped();
            }
        }
        VastRequest vastRequest = this.t;
        if (vastRequest != null && vastRequest.getVideoType() == VideoType.Rewarded && this.u.h) {
            VastPlaybackListener vastPlaybackListener2 = this.w;
            if (vastPlaybackListener2 != null) {
                vastPlaybackListener2.onVideoCompleted();
            }
            VastViewListener vastViewListener = this.v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.t);
            }
        }
        j();
    }

    private void n() {
        try {
            if (!isLoaded() || this.u.j) {
                return;
            }
            if (this.n == null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.n = mediaPlayer;
                mediaPlayer.setLooping(false);
                this.n.setAudioStreamType(3);
                this.n.setOnCompletionListener(this.c0);
                this.n.setOnErrorListener(this.d0);
                this.n.setOnPreparedListener(this.e0);
                this.n.setOnVideoSizeChangedListener(this.f0);
            }
            BidMachineVideoBridge.MediaPlayerSetSurface(this.n, this.d);
            Uri fileUri = isVideoFileLoaded() ? this.t.getFileUri() : null;
            if (fileUri == null) {
                setLoadingViewVisibility(true);
                BidMachineVideoBridge.MediaPlayerSetDataSource(this.n, this.t.getVastAd().getPickedMediaFileTag().getText());
            } else {
                setLoadingViewVisibility(false);
                BidMachineVideoBridge.MediaPlayerSetDataSource(this.n, getContext(), fileUri);
            }
            this.n.prepareAsync();
        } catch (Exception e2) {
            VastLog.e(this.a, e2);
            c(IabError.throwable("Exception during preparing MediaPlayer", e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        View view = this.o;
        if (view != null) {
            Utils.removeFromParent(view);
            this.o = null;
        }
    }

    private void p() {
        if (this.r != null) {
            b();
            removeView(this.r);
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (isLoaded()) {
            C c = this.u;
            c.j = false;
            c.d = 0;
            k();
            i(this.t.getVastAd().getAppodealExtension());
            startPlayback("restartPlayback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        C c = this.u;
        if (!c.m) {
            if (isPlaybackStarted()) {
                BidMachineVideoBridge.MediaPlayerStart(this.n);
                BidMachineVideoBridge.MediaPlayerPause(this.n);
                setLoadingViewVisibility(false);
                return;
            } else {
                if (this.u.j) {
                    return;
                }
                startPlayback("resumePlayback (canAutoResume: false)");
                return;
            }
        }
        if (c.g && this.E) {
            VastLog.d(this.a, "resumePlayback", new Object[0]);
            this.u.g = false;
            if (!isPlaybackStarted()) {
                if (this.u.j) {
                    return;
                }
                startPlayback("resumePlayback");
                return;
            }
            BidMachineVideoBridge.MediaPlayerStart(this.n);
            y();
            u();
            setLoadingViewVisibility(false);
            c(TrackingEvent.resume);
            VastPlaybackListener vastPlaybackListener = this.w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoResumed();
            }
        }
    }

    private void s() {
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((IabElementWrapper) it.next()).toggleShow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        v();
        c();
        this.R.run();
    }

    private void v() {
        this.U.clear();
        this.V = 0;
        this.W = 0.0f;
    }

    private void w() {
        boolean z2;
        boolean z3;
        if (this.L) {
            z2 = true;
            if (isSkipEnabled() || this.I) {
                z3 = false;
            } else {
                z3 = true;
                z2 = false;
            }
        } else {
            z3 = false;
            z2 = false;
        }
        IabCloseWrapper iabCloseWrapper = this.g;
        if (iabCloseWrapper != null) {
            iabCloseWrapper.setVisibility(z2 ? 0 : 8);
        }
        IabCountDownWrapper iabCountDownWrapper = this.h;
        if (iabCountDownWrapper != null) {
            iabCountDownWrapper.setVisibility(z3 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        IabMuteWrapper iabMuteWrapper;
        if (!isPlaybackStarted() || (iabMuteWrapper = this.j) == null) {
            return;
        }
        iabMuteWrapper.setMuted(this.u.f);
        if (this.u.f) {
            this.n.setVolume(0.0f, 0.0f);
            VastPlaybackListener vastPlaybackListener = this.w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoVolumeChanged(0.0f);
                return;
            }
            return;
        }
        this.n.setVolume(1.0f, 1.0f);
        VastPlaybackListener vastPlaybackListener2 = this.w;
        if (vastPlaybackListener2 != null) {
            vastPlaybackListener2.onVideoVolumeChanged(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (isLoaded()) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (!this.E || !VastHelper.isScreenOn(getContext())) {
            l();
            return;
        }
        if (this.F) {
            this.F = false;
            startPlayback("onWindowFocusChanged");
        } else if (this.u.j) {
            setLoadingViewVisibility(false);
        } else {
            r();
        }
    }

    static class A extends View.BaseSavedState {
        public static final Parcelable.Creator<A> CREATOR = new a();
        C a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public A createFromParcel(Parcel parcel) {
                return new A(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public A[] newArray(int i) {
                return new A[i];
            }
        }

        A(Parcel parcel) {
            super(parcel);
            this.a = (C) parcel.readParcelable(C.class.getClassLoader());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }

        A(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public VastView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = "VastView-" + Integer.toHexString(hashCode());
        this.u = new C();
        this.A = 0;
        this.B = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new RunnableC6003a();
        this.R = new RunnableC6004b();
        this.S = new C6005c();
        this.T = new d();
        this.U = new LinkedList();
        this.V = 0;
        this.W = 0.0f;
        this.a0 = new e();
        f fVar = new f();
        this.b0 = fVar;
        this.c0 = new g();
        this.d0 = new h();
        this.e0 = new i();
        this.f0 = new j();
        this.g0 = new l();
        this.h0 = new m();
        this.i0 = new n();
        this.j0 = new o();
        setBackgroundColor(-16777216);
        setOnClickListener(new k());
        IabVideoTexture iabVideoTexture = new IabVideoTexture(context);
        this.b = iabVideoTexture;
        iabVideoTexture.setSurfaceTextureListener(fVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.addView(this.b, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.c, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.e, new ViewGroup.LayoutParams(-1, -1));
        CloseableLayout closeableLayout = new CloseableLayout(getContext());
        this.f = closeableLayout;
        closeableLayout.setBackgroundColor(0);
        addView(this.f, new ViewGroup.LayoutParams(-1, -1));
    }

    private void d(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getLoadingStyle().isVisible().booleanValue()) {
            IabLoadingWrapper iabLoadingWrapper = this.k;
            if (iabLoadingWrapper != null) {
                iabLoadingWrapper.detach();
                return;
            }
            return;
        }
        if (this.k == null) {
            this.k = new IabLoadingWrapper(null);
        }
        this.k.attach(getContext(), this, a(vastExtension, vastExtension != null ? vastExtension.getLoadingStyle() : null));
    }

    private void e(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getMuteStyle().isVisible().booleanValue()) {
            IabMuteWrapper iabMuteWrapper = this.j;
            if (iabMuteWrapper != null) {
                iabMuteWrapper.detach();
                return;
            }
            return;
        }
        if (this.j == null) {
            IabMuteWrapper iabMuteWrapper2 = new IabMuteWrapper(new t());
            this.j = iabMuteWrapper2;
            this.P.add(iabMuteWrapper2);
        }
        this.j.attach(getContext(), this.e, a(vastExtension, vastExtension != null ? vastExtension.getMuteStyle() : null));
    }

    private void f(VastExtension vastExtension) {
        this.f.setCountDownStyle(a(vastExtension, vastExtension != null ? vastExtension.getCountDownStyle() : null));
        if (isFullscreen()) {
            this.f.setCloseStyle(a(vastExtension, vastExtension != null ? vastExtension.getCloseStyle() : null));
            this.f.setCloseClickListener(new q());
        }
        d(vastExtension);
    }

    class o extends WebViewClient {
        o() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("io.bidmachine", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            webView.setBackgroundColor(0);
            webView.setLayerType(1, null);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted("io.bidmachine", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError("io.bidmachine", view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            VastView.this.o();
            return true;
        }

        public boolean safedk_VastView$o_shouldOverrideUrlLoading_1b7833ddfb23e9cb16e474800874442c(WebView p0, WebResourceRequest p1) {
            if (p1.hasGesture()) {
                VastView.this.O.add(p0);
            }
            return shouldOverrideUrlLoading(p0, p1.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("io.bidmachine", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/vast/activity/VastView$o;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
            boolean safedk_VastView$o_shouldOverrideUrlLoading_1b7833ddfb23e9cb16e474800874442c = safedk_VastView$o_shouldOverrideUrlLoading_1b7833ddfb23e9cb16e474800874442c(webView, webResourceRequest);
            BrandSafetyUtils.onShouldOverrideUrlLoading("io.bidmachine", webView, webResourceRequest, safedk_VastView$o_shouldOverrideUrlLoading_1b7833ddfb23e9cb16e474800874442c);
            return safedk_VastView$o_shouldOverrideUrlLoading_1b7833ddfb23e9cb16e474800874442c;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("BidMachine|SafeDK: Execution> Lio/bidmachine/iab/vast/activity/VastView$o;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_VastView$o_shouldOverrideUrlLoading_e9face276cedcb7dd38c21abeb8dcc62 = safedk_VastView$o_shouldOverrideUrlLoading_e9face276cedcb7dd38c21abeb8dcc62(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("io.bidmachine", webView, str, safedk_VastView$o_shouldOverrideUrlLoading_e9face276cedcb7dd38c21abeb8dcc62);
            return safedk_VastView$o_shouldOverrideUrlLoading_e9face276cedcb7dd38c21abeb8dcc62;
        }

        public boolean safedk_VastView$o_shouldOverrideUrlLoading_e9face276cedcb7dd38c21abeb8dcc62(WebView p0, String p1) {
            if (!VastView.this.O.contains(p0)) {
                return true;
            }
            VastLog.d(VastView.this.a, "banner clicked", new Object[0]);
            VastView vastView = VastView.this;
            vastView.a(vastView.p, p1);
            return true;
        }
    }

    private void c(VastExtension vastExtension) {
        if (vastExtension == null || !vastExtension.isVideoClickable()) {
            return;
        }
        this.P.clear();
    }

    private void b(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getCountDownStyle().isVisible().booleanValue()) {
            IabCountDownWrapper iabCountDownWrapper = this.h;
            if (iabCountDownWrapper != null) {
                iabCountDownWrapper.detach();
                return;
            }
            return;
        }
        if (this.h == null) {
            IabCountDownWrapper iabCountDownWrapper2 = new IabCountDownWrapper(null);
            this.h = iabCountDownWrapper2;
            this.P.add(iabCountDownWrapper2);
        }
        this.h.attach(getContext(), this.e, a(vastExtension, vastExtension != null ? vastExtension.getCountDownStyle() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IabError iabError) {
        VastLog.e(this.a, "handlePlaybackError - %s", iabError);
        this.K = true;
        a(VastSpecError.SHOWING);
        a(this.v, this.t, iabError);
        j();
    }

    private boolean a(VastRequest vastRequest, Boolean bool, boolean z2) {
        stopPlayback();
        if (!z2) {
            this.u = new C();
        }
        if (bool != null) {
            this.u.e = bool.booleanValue();
        }
        this.t = vastRequest;
        if (vastRequest == null) {
            e();
            VastLog.e(this.a, "VastRequest is null. Stop playing...", new Object[0]);
            return false;
        }
        VastAd vastAd = vastRequest.getVastAd();
        if (vastAd == null) {
            e();
            VastLog.e(this.a, "VastAd is null. Stop playing...", new Object[0]);
            return false;
        }
        CacheControl cacheControl = vastRequest.getCacheControl();
        if (cacheControl == CacheControl.PartialLoad && !isVideoFileLoaded()) {
            a(vastRequest, vastAd, cacheControl, z2);
            return true;
        }
        if (cacheControl == CacheControl.Stream && !isVideoFileLoaded()) {
            a(vastRequest, vastAd, cacheControl, z2);
            vastRequest.performCache(getContext().getApplicationContext(), null);
            return true;
        }
        a(vastRequest, vastAd, z2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(TrackingEvent trackingEvent) {
        VastLog.d(this.a, "Track Event: %s", trackingEvent);
        VastRequest vastRequest = this.t;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        if (vastAd != null) {
            a(vastAd.getTrackingEventListMap(), trackingEvent);
        }
    }

    static class C implements Parcelable {
        public static final Parcelable.Creator<C> CREATOR = new a();
        String a;
        float b;
        int c;
        int d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C createFromParcel(Parcel parcel) {
                return new C(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C[] newArray(int i) {
                return new C[i];
            }
        }

        C() {
            this.a = null;
            this.b = 5.0f;
            this.c = 0;
            this.d = 0;
            this.e = true;
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = true;
            this.n = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        }

        C(Parcel parcel) {
            this.a = null;
            this.b = 5.0f;
            this.c = 0;
            this.d = 0;
            this.e = true;
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = true;
            this.n = false;
            this.a = parcel.readString();
            this.b = parcel.readFloat();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readByte() != 0;
            this.f = parcel.readByte() != 0;
            this.g = parcel.readByte() != 0;
            this.h = parcel.readByte() != 0;
            this.i = parcel.readByte() != 0;
            this.j = parcel.readByte() != 0;
            this.k = parcel.readByte() != 0;
            this.l = parcel.readByte() != 0;
            this.m = parcel.readByte() != 0;
            this.n = parcel.readByte() != 0;
        }
    }

    private void c() {
        removeCallbacks(this.R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        VastLog.d(this.a, "handleImpressions", new Object[0]);
        VastRequest vastRequest = this.t;
        if (vastRequest != null) {
            this.u.k = true;
            a(vastRequest.getVastAd().getImpressionUrlList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int i2;
        int i3 = this.C;
        if (i3 != 0 && (i2 = this.D) != 0) {
            this.b.setVideoSize(i3, i2);
        } else {
            VastLog.d(this.a, "configureVideoSurface - skip: videoWidth or videoHeight is 0", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        VastLog.d(this.a, "handleComplete", new Object[0]);
        C c = this.u;
        c.i = true;
        if (!this.K && !c.h) {
            c.h = true;
            VastPlaybackListener vastPlaybackListener = this.w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoCompleted();
            }
            VastViewListener vastViewListener = this.v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.t);
            }
            VastRequest vastRequest = this.t;
            if (vastRequest != null && vastRequest.isR2() && !this.u.l) {
                i();
            }
            c(TrackingEvent.complete);
        }
        if (this.u.h) {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(VastViewListener vastViewListener, VastRequest vastRequest, IabError iabError) {
        a(vastViewListener, vastRequest, iabError);
        if (vastViewListener == null || vastRequest == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, false);
    }

    private void b(boolean z2) {
        VastViewListener vastViewListener;
        if (!isLoaded() || this.I) {
            return;
        }
        this.I = true;
        this.u.j = true;
        int i2 = getResources().getConfiguration().orientation;
        int i3 = this.B;
        if (i2 != i3 && (vastViewListener = this.v) != null) {
            vastViewListener.onOrientationRequested(this, this.t, i3);
        }
        IabProgressWrapper iabProgressWrapper = this.l;
        if (iabProgressWrapper != null) {
            iabProgressWrapper.detach();
        }
        IabMuteWrapper iabMuteWrapper = this.j;
        if (iabMuteWrapper != null) {
            iabMuteWrapper.detach();
        }
        IabRepeatWrapper iabRepeatWrapper = this.i;
        if (iabRepeatWrapper != null) {
            iabRepeatWrapper.detach();
        }
        a();
        if (this.u.n) {
            if (this.r == null) {
                this.r = a(getContext());
            }
            this.r.setImageBitmap(this.b.getBitmap());
            addView(this.r, new FrameLayout.LayoutParams(-1, -1));
            this.e.bringToFront();
            return;
        }
        a(z2);
        if (this.q == null) {
            setCloseControlsVisible(true);
            if (this.r != null) {
                this.z = new w(getContext(), this.t.getFileUri(), this.t.getVastAd().getPickedMediaFileTag().getText(), new WeakReference(this.r));
            }
            addView(this.r, new FrameLayout.LayoutParams(-1, -1));
        } else {
            setCloseControlsVisible(false);
            this.c.setVisibility(8);
            o();
            IabCtaWrapper iabCtaWrapper = this.m;
            if (iabCtaWrapper != null) {
                iabCtaWrapper.setVisibility(8);
            }
            MraidInterstitial mraidInterstitial = this.s;
            if (mraidInterstitial != null) {
                if (mraidInterstitial.isReady()) {
                    setLoadingViewVisibility(false);
                    this.s.showInView(this, false);
                } else {
                    setLoadingViewVisibility(true);
                }
            } else {
                setLoadingViewVisibility(false);
                b(IabError.internal("CompanionInterstitial is null"));
            }
        }
        stopPlayback();
        this.e.bringToFront();
        b(TrackingEvent.creativeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        VastRequest vastRequest;
        VastLog.e(this.a, "handleCompanionClose", new Object[0]);
        b(TrackingEvent.close);
        VastViewListener vastViewListener = this.v;
        if (vastViewListener == null || (vastRequest = this.t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        VastRequest vastRequest;
        VastLog.e(this.a, "handleClose", new Object[0]);
        c(TrackingEvent.close);
        VastViewListener vastViewListener = this.v;
        if (vastViewListener == null || (vastRequest = this.t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    private void a(VastRequest vastRequest, VastAd vastAd, CacheControl cacheControl, boolean z2) {
        vastRequest.setVastVideoLoadedListener(new p(z2, cacheControl));
        f(vastAd.getAppodealExtension());
        setPlaceholderViewVisible(true);
        setLoadingViewVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VastRequest vastRequest, VastAd vastAd, boolean z2) {
        int i2;
        AppodealExtensionTag appodealExtension = vastAd.getAppodealExtension();
        this.A = vastRequest.getPreferredVideoOrientation();
        if (appodealExtension != null && appodealExtension.getCtaStyle().isVisible().booleanValue()) {
            this.p = appodealExtension.getCompanionTag();
        } else {
            this.p = null;
        }
        if (this.p == null) {
            this.p = vastAd.getBanner(getContext());
        }
        i(appodealExtension);
        a(appodealExtension, this.o != null);
        a(appodealExtension);
        b(appodealExtension);
        e(appodealExtension);
        h(appodealExtension);
        g(appodealExtension);
        d(appodealExtension);
        c(appodealExtension);
        setLoadingViewVisibility(false);
        VastAdMeasurer vastAdMeasurer = this.x;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.registerAdContainer(this);
            this.x.registerAdView(this.b);
        }
        VastViewListener vastViewListener = this.v;
        if (vastViewListener != null) {
            if (this.u.j) {
                i2 = this.B;
            } else {
                i2 = this.A;
            }
            vastViewListener.onOrientationRequested(this, vastRequest, i2);
        }
        if (!z2) {
            this.u.a = vastRequest.getId();
            C c = this.u;
            c.m = this.M;
            c.n = this.N;
            if (appodealExtension != null) {
                c.f = appodealExtension.isMuted();
            }
            this.u.b = vastRequest.getFusedVideoCloseTimeSec();
            VastAdMeasurer vastAdMeasurer2 = this.x;
            if (vastAdMeasurer2 != null) {
                vastAdMeasurer2.onAdViewReady(this.b);
                this.x.onAdShown();
            }
            VastViewListener vastViewListener2 = this.v;
            if (vastViewListener2 != null) {
                vastViewListener2.onShown(this, vastRequest);
            }
        }
        setCloseControlsVisible(a(vastRequest));
        startPlayback("load (restoring: " + z2 + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        VastLog.e(this.a, "handleInfoClicked", new Object[0]);
        VastRequest vastRequest = this.t;
        if (vastRequest != null) {
            return a(vastRequest.getVastAd().getClickTrackingUrlList(), this.t.getVastAd().getClickThroughUrl());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(VastRequest vastRequest) {
        return vastRequest.getVideoType() != VideoType.Rewarded || vastRequest.getMaxDurationMillis() <= 0;
    }

    private void a(VastExtension vastExtension, boolean z2) {
        if (!z2 && (vastExtension == null || vastExtension.getCtaStyle().isVisible().booleanValue())) {
            if (this.m == null) {
                IabCtaWrapper iabCtaWrapper = new IabCtaWrapper(new r());
                this.m = iabCtaWrapper;
                this.P.add(iabCtaWrapper);
            }
            this.m.attach(getContext(), this.e, a(vastExtension, vastExtension != null ? vastExtension.getCtaStyle() : null));
            return;
        }
        IabCtaWrapper iabCtaWrapper2 = this.m;
        if (iabCtaWrapper2 != null) {
            iabCtaWrapper2.detach();
        }
    }

    private void b() {
        z zVar = this.z;
        if (zVar != null) {
            zVar.a();
            this.z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IabError iabError) {
        VastRequest vastRequest;
        VastLog.e(this.a, "handleCompanionShowError - %s", iabError);
        a(VastSpecError.GENERAL_COMPANION);
        a(this.v, this.t, iabError);
        if (this.q != null) {
            k();
            b(true);
            return;
        }
        VastViewListener vastViewListener = this.v;
        if (vastViewListener == null || (vastRequest = this.t) == null) {
            return;
        }
        vastViewListener.onFinish(this, vastRequest, isFinished());
    }

    private void a(VastExtension vastExtension) {
        if (vastExtension != null && !vastExtension.getCloseStyle().isVisible().booleanValue()) {
            IabCloseWrapper iabCloseWrapper = this.g;
            if (iabCloseWrapper != null) {
                iabCloseWrapper.detach();
                return;
            }
            return;
        }
        if (this.g == null) {
            IabCloseWrapper iabCloseWrapper2 = new IabCloseWrapper(new s());
            this.g = iabCloseWrapper2;
            this.P.add(iabCloseWrapper2);
        }
        this.g.attach(getContext(), this.e, a(vastExtension, vastExtension != null ? vastExtension.getCloseStyle() : null));
    }

    private void b(TrackingEvent trackingEvent) {
        VastLog.d(this.a, "Track Companion Event: %s", trackingEvent);
        CompanionTag companionTag = this.q;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    private IabElementStyle a(VastExtension vastExtension, IabElementStyle iabElementStyle) {
        if (vastExtension == null) {
            return null;
        }
        if (iabElementStyle == null) {
            IabElementStyle iabElementStyle2 = new IabElementStyle();
            iabElementStyle2.setStrokeColor(vastExtension.getAssetsColor());
            iabElementStyle2.setFillColor(vastExtension.getAssetsBackgroundColor());
            return iabElementStyle2;
        }
        if (!iabElementStyle.hasStrokeColor()) {
            iabElementStyle.setStrokeColor(vastExtension.getAssetsColor());
        }
        if (!iabElementStyle.hasFillColor()) {
            iabElementStyle.setFillColor(vastExtension.getAssetsBackgroundColor());
        }
        return iabElementStyle;
    }

    private View a(Context context, CompanionTag companionTag) {
        float f2;
        float f3;
        boolean isTablet = Utils.isTablet(context);
        if (companionTag.getWidth() > 0) {
            f2 = companionTag.getWidth();
        } else {
            f2 = isTablet ? 728.0f : 320.0f;
        }
        int dpToPx = Utils.dpToPx(context, f2);
        if (companionTag.getHeight() > 0) {
            f3 = companionTag.getHeight();
        } else {
            f3 = isTablet ? 90.0f : 50.0f;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPx, Utils.dpToPx(context, f3));
        WebView webView = new WebView(context);
        webView.setId(ViewUtils.generateViewId());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.h0);
        webView.setWebViewClient(this.j0);
        webView.setWebChromeClient(this.i0);
        String html = companionTag.getHtml();
        if (html != null) {
            BidMachineNetworkBridge.webviewLoadDataWithBaseURL(webView, "", html, POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(ViewUtils.generateViewId());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        if (isLoaded()) {
            k kVar = null;
            if (!z2) {
                CompanionTag companion = this.t.getVastAd().getCompanion(getAvailableWidth(), getAvailableHeight());
                if (this.q != companion) {
                    if (companion != null && this.t.shouldUseScreenSizeForCompanionOrientation()) {
                        this.B = Utils.orientationBySize(companion.getWidth(), companion.getHeight());
                    } else {
                        this.B = this.A;
                    }
                    this.q = companion;
                    MraidInterstitial mraidInterstitial = this.s;
                    if (mraidInterstitial != null) {
                        mraidInterstitial.destroy();
                        this.s = null;
                    }
                }
            }
            if (this.q == null) {
                if (this.r == null) {
                    this.r = a(getContext());
                    return;
                }
                return;
            }
            if (this.s == null) {
                p();
                String htmlForMraid = this.q.getHtmlForMraid();
                if (htmlForMraid != null) {
                    AppodealExtensionTag appodealExtension = this.t.getVastAd().getAppodealExtension();
                    PostBannerTag postBannerTag = appodealExtension != null ? appodealExtension.getPostBannerTag() : null;
                    MraidInterstitial.Builder listener = MraidInterstitial.newBuilder().setBaseUrl(null).setCacheControl(CacheControl.FullLoad).setCloseTime(this.t.getCompanionCloseTime()).forceUseNativeCloseButton(this.t.isForceUseNativeCloseTime()).setIsTag(false).setAdMeasurer(this.y).setListener(new y(this, kVar));
                    if (postBannerTag != null) {
                        listener.setCloseStyle(postBannerTag.getCloseStyle());
                        listener.setCountDownStyle(postBannerTag.getCountDownStyle());
                        listener.setLoadingStyle(postBannerTag.getLoadingStyle());
                        listener.setProgressStyle(postBannerTag.getProgressStyle());
                        listener.setDurationSec(postBannerTag.getDurationSec());
                        listener.setProductLink(postBannerTag.getProductLink());
                        if (postBannerTag.isForceUseNativeClose()) {
                            listener.forceUseNativeCloseButton(true);
                        }
                        listener.setR1(postBannerTag.isR1());
                        listener.setR2(postBannerTag.isR2());
                    }
                    try {
                        MraidInterstitial build = listener.build(getContext());
                        this.s = build;
                        build.load(htmlForMraid);
                        return;
                    } catch (Throwable th) {
                        b(IabError.throwable("Exception during companion creation", th));
                        return;
                    }
                }
                b(IabError.badContent("Companion creative is null"));
            }
        }
    }

    private ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    private void a() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((IabElementWrapper) it.next()).cancelHide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        VastLog.e(this.a, "handleCompanionExpired - %s", iabError);
        a(VastSpecError.GENERAL_COMPANION);
        if (this.q != null) {
            k();
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(CompanionTag companionTag, String str) {
        VastRequest vastRequest = this.t;
        ArrayList arrayList = null;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        ArrayList<String> wrapperCompanionClickTrackingUrlList = vastAd != null ? vastAd.getWrapperCompanionClickTrackingUrlList() : null;
        List<String> companionClickTrackingList = companionTag != null ? companionTag.getCompanionClickTrackingList() : null;
        if (wrapperCompanionClickTrackingUrlList != null || companionClickTrackingList != null) {
            arrayList = new ArrayList();
            if (companionClickTrackingList != null) {
                arrayList.addAll(companionClickTrackingList);
            }
            if (wrapperCompanionClickTrackingUrlList != null) {
                arrayList.addAll(wrapperCompanionClickTrackingUrlList);
            }
        }
        return a(arrayList, str);
    }

    private boolean a(List list, String str) {
        VastLog.d(this.a, "processClickThroughEvent: %s", str);
        this.u.l = true;
        if (str == null) {
            return false;
        }
        if (this.v != null && this.t != null) {
            l();
            setLoadingViewVisibility(true);
            this.v.onClick(this, this.t, new x(list), str);
        }
        return true;
    }

    private void a(TrackingEvent trackingEvent) {
        VastLog.d(this.a, "Track Banner Event: %s", trackingEvent);
        CompanionTag companionTag = this.p;
        if (companionTag != null) {
            a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    private void a(Map map, TrackingEvent trackingEvent) {
        if (map != null && !map.isEmpty()) {
            a((List) map.get(trackingEvent));
        } else {
            VastLog.d(this.a, "Processing Event - fail: %s (tracking event map is null or empty)", trackingEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list) {
        if (isLoaded()) {
            if (list != null && !list.isEmpty()) {
                VastRequest vastRequest = this.t;
                if (vastRequest != null) {
                    vastRequest.fireUrls(list, null);
                    return;
                }
                return;
            }
            VastLog.d(this.a, "\turl list is null", new Object[0]);
        }
    }

    private void a(VastViewListener vastViewListener, VastRequest vastRequest, IabError iabError) {
        if (vastViewListener == null || vastRequest == null) {
            return;
        }
        vastViewListener.onShowFailed(this, vastRequest, iabError);
    }

    private void a(VastSpecError vastSpecError) {
        VastRequest vastRequest = this.t;
        if (vastRequest != null) {
            vastRequest.sendVastSpecError(vastSpecError);
        }
    }
}
