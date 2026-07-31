package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.my.target.common.models.ImageData;
import com.my.target.ef;
import com.my.target.g;
import com.my.target.v9;
import com.my.target.wh;
import com.my.target.y9;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public final class a9 implements z9, y9.a, v9.a {
    private final y9 a;
    private final b9 b;
    private final u8 c;
    private final ij d;
    private c e;
    private oe f;
    private mj g;
    private int h = -1;
    private f i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a extends pc {
        private final a9 a;

        a(a9 a9Var) {
            this.a = a9Var;
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.r, view, url);
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.r, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("MyTarget|SafeDK: Execution> Lcom/my/target/a9$a;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.r, webView, webResourceRequest, webResourceError);
            safedk_a9$a_onReceivedError_17edc4fa47dffdac059a394877af5f7a(webView, webResourceRequest, webResourceError);
        }

        public void safedk_a9$a_onReceivedError_17edc4fa47dffdac059a394877af5f7a(WebView p0, WebResourceRequest p1, WebResourceError p2) {
            super.onReceivedError(p0, p1, p2);
            this.a.a();
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.r, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.my.target.pc, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.r, view, url, shouldOverrideUrlLoading);
            return shouldOverrideUrlLoading;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class b implements ef.a {
        private final oe a;
        private final jf b;
        private final b9 c;

        b(jf jfVar, oe oeVar, b9 b9Var) {
            this.b = jfVar;
            this.a = oeVar;
            this.c = b9Var;
        }

        @Override // com.my.target.c0.a
        public void a(float f) {
            this.a.b(f > 0.0f);
        }

        @Override // com.my.target.c0.a
        public void b(float f, float f2) {
        }

        @Override // com.my.target.c0.a
        public void c() {
            this.a.f();
            this.c.c();
        }

        @Override // com.my.target.c0.a
        public void f() {
            this.a.i();
        }

        @Override // com.my.target.c0.a
        public void g() {
        }

        @Override // com.my.target.c0.a
        public void h() {
            this.a.l();
        }

        @Override // com.my.target.c0.a
        public void j() {
            this.a.k();
        }

        @Override // com.my.target.c0.a
        public void k() {
        }

        @Override // com.my.target.ef.a
        public void l() {
        }

        @Override // com.my.target.ef.a
        public void n() {
        }

        @Override // com.my.target.ef.a
        public void o() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }

        @Override // com.my.target.c0.a
        public void p() {
            this.a.m();
        }

        @Override // com.my.target.ef.a
        public void q() {
        }

        @Override // com.my.target.c0.a
        public void a(float f, float f2) {
            this.b.setTimeChanged(f);
            this.a.a(f, f2);
        }

        @Override // com.my.target.c0.a
        public void a(String str) {
            this.a.j();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class c extends CountDownTimer {
        private final a9 a;
        private final int b;

        c(int i, int i2, a9 a9Var) {
            super(i * 1000, i2 * 1000);
            this.b = i;
            this.a = a9Var;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.a.h();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = (int) (j / 1000);
            this.a.a(this.b - i, i);
        }
    }

    private a9(u8 u8Var, boolean z, b9 b9Var, wh.c cVar, Context context) {
        int i;
        int i2;
        this.c = u8Var;
        c9 g0 = u8Var.g0();
        if (g0 == null || g0.g() == null) {
            i = 0;
            i2 = 0;
        } else {
            i = g0.g().getWidth();
            i2 = g0.g().getHeight();
        }
        y9 y9Var = new y9(z, this, this, new a(this), i, i2, context);
        this.a = y9Var;
        this.d = y9Var.getProgressView();
        this.b = b9Var;
        if (g0 != null) {
            eb b2 = eb.b(w0.d, null);
            b2.a(g0.g());
            b2.H().b(g0.a(), g0.e());
            this.f = oe.a(b2, null, cVar, context);
        }
    }

    public static a9 a(u8 u8Var, boolean z, b9 b9Var, wh.c cVar, Context context) {
        return new a9(u8Var, z, b9Var, cVar, context);
    }

    private void e() {
        final e a2 = this.c.a();
        if (a2 == null) {
            return;
        }
        this.a.getAdChoicesButton().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a9$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a9.this.a(a2, view);
            }
        });
        if (a2.b() == null) {
            return;
        }
        f a3 = f.a(a2, new r3());
        this.i = a3;
        a3.a(new g.a() { // from class: com.my.target.a9$$ExternalSyntheticLambda2
            @Override // com.my.target.g.a
            public final void b() {
                a9.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.b.b(this.c);
    }

    private void k() {
        int i = this.h;
        if (i == 0 || i == -1) {
            this.a.getVideoView().getVideoPlayer().destroy();
            this.f = null;
            x8 d0 = this.c.d0();
            String c2 = d0.c();
            if (c2 == null) {
                return;
            }
            this.a.c();
            this.h = 1;
            this.a.getInteractiveView().getWebView().loadUrl(c2);
            int b2 = d0.b();
            this.a.f();
            b(b2);
            mj a2 = mj.a(d0.a(), null);
            this.g = a2;
            a2.a(this.a.getInteractiveView());
            this.g.b();
        }
    }

    private void l() {
        if (this.h != 1) {
            return;
        }
        this.h = 2;
        mj mjVar = this.g;
        if (mjVar != null) {
            mjVar.c();
        }
        z8 e0 = this.c.e0();
        w9 postView = this.a.getPostView();
        ImageView iconView = postView.getIconView();
        TextView titleView = postView.getTitleView();
        Button ctaButton = postView.getCtaButton();
        ImageData d = e0.d();
        if (d != null) {
            iconView.setImageBitmap(d.getBitmap());
        }
        lf f0 = this.c.f0();
        titleView.setText(e0.e());
        titleView.setMaxLines(5);
        titleView.setTextColor(f0.k());
        titleView.setGravity(17);
        ctaButton.setBackgroundColor(f0.d());
        ctaButton.setTextColor(f0.e());
        String c2 = e0.c();
        if (TextUtils.isEmpty(c2)) {
            c2 = this.c.l();
        }
        ctaButton.setText(c2);
        ctaButton.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a9.this.a(view);
            }
        });
        this.a.e();
        b(e0.b());
        this.a.f();
        mj a2 = mj.a(e0.a(), null);
        this.g = a2;
        a2.a(postView);
        this.g.b();
    }

    private void m() {
        c9 g0;
        if (this.h == -1 && (g0 = this.c.g0()) != null) {
            this.a.g();
            this.h = 0;
            dj g = g0.g();
            if (g == null || this.f == null) {
                return;
            }
            x9 videoView = this.a.getVideoView();
            final c0 videoPlayer = videoView.getVideoPlayer();
            e0 adVideoView = videoView.getAdVideoView();
            ImageView adIcon = videoView.getAdIcon();
            Button ctaButton = videoView.getCtaButton();
            final v5 volumeButton = videoView.getVolumeButton();
            adIcon.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a9$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a9.this.b(view);
                }
            });
            jf progressView = videoView.getProgressView();
            progressView.setMaxTime(g0.e());
            videoView.setPlayableVideoListener(new b(progressView, this.f, this.b));
            if (g0.d()) {
                videoPlayer.f();
            }
            videoPlayer.a(adVideoView);
            adVideoView.a(g.getWidth(), g.getHeight());
            videoPlayer.a(Uri.parse(g.getUrl()), adVideoView.getContext());
            ImageData b2 = g0.b();
            if (b2 != null) {
                adIcon.setImageBitmap(b2.getBitmap());
            }
            lf f0 = this.c.f0();
            ctaButton.setBackgroundColor(f0.d());
            ctaButton.setTextColor(f0.e());
            ctaButton.setText(this.c.l());
            ctaButton.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a9$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a9.this.c(view);
                }
            });
            volumeButton.a(g0.d() ? f9.h(volumeButton.getContext()) : f9.i(volumeButton.getContext()), false);
            volumeButton.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a9$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a9.a(c0.this, volumeButton, view);
                }
            });
            b(g0.c());
            this.b.a(this.c, videoView);
        }
    }

    @Override // com.my.target.y9.a
    public void b() {
        int i = this.h;
        if (i == 0) {
            k();
        } else {
            if (i != 1) {
                return;
            }
            l();
        }
    }

    @Override // com.my.target.v9.a
    public void c() {
        n2 a2 = this.c.f().b() ? t2.a(64, h2.a()) : q2.a();
        b9 b9Var = this.b;
        u8 u8Var = this.c;
        b9Var.a(u8Var, u8Var.k(), 2, s2.a(a2), this.a.getContext());
    }

    @Override // com.my.target.y9.a
    public void d() {
        mj mjVar = this.g;
        if (mjVar != null) {
            mjVar.c();
        }
        this.b.a(this.c);
    }

    @Override // com.my.target.z9
    public void destroy() {
        c cVar = this.e;
        if (cVar != null) {
            cVar.cancel();
            this.e = null;
        }
    }

    public boolean f() {
        return this.h == 2 && this.a.a();
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return null;
    }

    public void h() {
        int i = this.h;
        if (i == 0) {
            this.a.d();
            return;
        }
        if (i == 1) {
            this.a.d();
            this.b.f();
        } else {
            if (i != 2) {
                return;
            }
            this.a.b();
        }
    }

    @Override // com.my.target.z9
    public View i() {
        return this.a;
    }

    public void j() {
        if (this.h != -1) {
            return;
        }
        if (this.c.g0() != null) {
            m();
        } else {
            k();
        }
        e();
        this.a.setBackgroundColor(this.c.f0().a());
    }

    @Override // com.my.target.z9
    public void pause() {
        c0 videoPlayer = this.a.getVideoView().getVideoPlayer();
        if (videoPlayer.isPlaying()) {
            videoPlayer.pause();
            oe oeVar = this.f;
            if (oeVar != null) {
                oeVar.i();
            }
        }
    }

    @Override // com.my.target.z9
    public void resume() {
        c0 videoPlayer = this.a.getVideoView().getVideoPlayer();
        if (videoPlayer.b()) {
            videoPlayer.resume();
            oe oeVar = this.f;
            if (oeVar != null) {
                oeVar.l();
            }
        }
    }

    @Override // com.my.target.z9
    public void stop() {
    }

    @Override // com.my.target.v9.a
    public void a() {
        this.a.d();
        this.b.f();
    }

    public void a(int i, int i2) {
        this.d.setProgress(i);
        this.d.setDigit(i2);
        this.b.a(i2);
    }

    private void a(e eVar) {
        f fVar = this.i;
        if (fVar == null || !fVar.b()) {
            f fVar2 = this.i;
            if (fVar2 == null) {
                a7.a(eVar.c(), this.a.getContext());
            } else {
                fVar2.a(this.a.getContext());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        c();
    }

    private void b(int i) {
        this.d.setMax(i);
        this.d.a();
        c cVar = new c(i, 1, this);
        this.e = cVar;
        cVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, View view) {
        a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(c0 c0Var, v5 v5Var, View view) {
        if (c0Var.c()) {
            c0Var.d();
            v5Var.a(f9.i(v5Var.getContext()), false);
        } else {
            c0Var.f();
            v5Var.a(f9.h(v5Var.getContext()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c();
    }
}
