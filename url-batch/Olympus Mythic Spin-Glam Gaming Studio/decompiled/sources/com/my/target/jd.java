package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.my.target.c0;
import com.my.target.common.models.ImageData;
import com.my.target.e0;
import com.my.target.ej;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.o;
import com.my.target.wh;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class jd implements c0.a, o.a, ej.d, e0.a {
    private boolean A;
    private boolean B;
    private final b C;
    private final yd a;
    private final eb b;
    private final dj c;
    private final sc e;
    private final tj f;
    private final oe g;
    private final c h;
    WeakReference i;
    WeakReference j;
    WeakReference k;
    c0 l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean u;
    int v;
    private Uri w;
    private ge x;
    private WeakReference y;
    private long z;
    boolean q = true;
    boolean r = false;
    boolean s = false;
    boolean t = true;
    private final AudioManager.OnAudioFocusChangeListener d = new a();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -3) {
                jd.this.t();
                return;
            }
            if (i == -2 || i == -1) {
                jd.this.y();
                mi.a("NativeAdVideoController$AfChangeListener: Audiofocus loss, pausing");
            } else if ((i == 1 || i == 2 || i == 4) && jd.this.o) {
                mi.a("NativeAdVideoController$AfChangeListener: Audiofocus gain, unmuting");
                jd jdVar = jd.this;
                jdVar.a(jdVar.l, false);
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private final class b implements NativeAd.NativeAdVideoPlayer {
        private b() {
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public float getCurrentPosition() {
            if (jd.this.l != null) {
                return r0.getPosition() / 1000.0f;
            }
            return 0.0f;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public float getDuration() {
            c0 c0Var = jd.this.l;
            if (c0Var != null) {
                return c0Var.getDuration();
            }
            return 0.0f;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public boolean isVolumeOn() {
            if (jd.this.l != null) {
                return !r0.c();
            }
            return false;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public void pause() {
            jd jdVar = jd.this;
            if (jdVar.v == 2) {
                return;
            }
            jdVar.n = false;
            jdVar.v = 2;
            jdVar.s = true;
            c0 c0Var = jdVar.l;
            if (c0Var != null) {
                c0Var.pause();
                jd.this.z = c0Var.getPosition();
                c0Var.a((c0.a) null);
                c0Var.a((e0) null);
            }
            jd.this.g.i();
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public void play() {
            MediaAdView u;
            jd jdVar = jd.this;
            if (jdVar.v == 1 || (u = jdVar.u()) == null) {
                return;
            }
            jd jdVar2 = jd.this;
            if (jdVar2.z > 0) {
                jdVar2.g.l();
            }
            jd jdVar3 = jd.this;
            if (jdVar3.v == 3) {
                jdVar3.h.k();
            }
            View childAt = u.getChildAt(1);
            if (childAt instanceof e0) {
                jd jdVar4 = jd.this;
                jdVar4.n = jdVar4.b.v0();
                jd jdVar5 = jd.this;
                jdVar5.s = false;
                jdVar5.a((e0) childAt, jdVar5.t);
            }
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public void replay() {
            c0 c0Var;
            MediaAdView u = jd.this.u();
            if (u == null || (c0Var = jd.this.l) == null) {
                return;
            }
            if (c0Var.isPlaying()) {
                c0Var.replay();
            } else {
                jd.this.z = 0L;
                c0Var.stop();
                View childAt = u.getChildAt(1);
                if (childAt instanceof e0) {
                    jd jdVar = jd.this;
                    jdVar.n = jdVar.b.v0();
                    jd jdVar2 = jd.this;
                    jdVar2.s = false;
                    jdVar2.a((e0) childAt, jdVar2.t);
                }
            }
            jd.this.h.k();
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public void setVolumeOff() {
            jd jdVar = jd.this;
            jdVar.t = true;
            jdVar.a(jdVar.l, true);
            jd.this.g.b(false);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdVideoPlayer
        public void setVolumeOn() {
            jd jdVar = jd.this;
            jdVar.t = false;
            jdVar.a(jdVar.l, false);
            jd.this.g.b(true);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface c extends d0 {
        void a(float f, float f2);

        void a(String str);

        void b();

        void d();

        void e();

        void f();

        void j();

        void k();
    }

    jd(sc scVar, eb ebVar, dj djVar, c cVar, yd ydVar) {
        this.b = ebVar;
        this.e = scVar;
        this.a = ydVar;
        this.c = djVar;
        this.n = ebVar.v0();
        this.u = ebVar.u0();
        this.f = tj.a(ebVar.H(), (wh.c) null);
        this.g = ydVar.a(ebVar);
        this.h = cVar;
        String str = (String) djVar.a();
        if (str != null) {
            this.w = Uri.parse(str);
        } else {
            this.w = Uri.parse(djVar.getUrl());
        }
        this.C = new b();
    }

    private void s() {
        c0 c0Var = this.l;
        if (c0Var == null) {
            return;
        }
        c0Var.a((c0.a) null);
        this.l.destroy();
        this.l = null;
        if (o0.a()) {
            return;
        }
        mi.a("NativeAdVideoController: " + Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaAdView u() {
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    private void z() {
        WeakReference weakReference;
        WeakReference weakReference2;
        c0 c0Var = this.l;
        if (c0Var != null && c0Var.b()) {
            MediaAdView u = u();
            if (u == null) {
                mi.a("NativeAdVideoController: Trying to play video in unregistered view");
                s();
                return;
            }
            e0 adVideoView = (!this.o || (weakReference2 = this.k) == null) ? u.getChildAt(1) instanceof e0 ? (e0) u.getChildAt(1) : null : ((ej) weakReference2.get()).getAdVideoView();
            if (adVideoView == null) {
                s();
                return;
            } else {
                adVideoView.a(this.c.getWidth(), this.c.getHeight());
                this.l.a(adVideoView);
                this.l.resume();
            }
        } else if (this.o && (weakReference = this.k) != null) {
            a(((ej) weakReference.get()).getAdVideoView(), this.u);
        }
        g();
    }

    public void A() {
        MediaAdView mediaAdView;
        w();
        this.f.a(null);
        this.g.a((Context) null);
        s();
        WeakReference weakReference = this.i;
        if (weakReference == null || (mediaAdView = (MediaAdView) weakReference.get()) == null || !(mediaAdView.getChildAt(1) instanceof e0)) {
            return;
        }
        mediaAdView.removeViewAt(1);
    }

    public void a(MediaAdView mediaAdView, Context context) {
        e0 e0Var;
        WeakReference weakReference;
        mi.a("NativeAdVideoController: Register video ad with view " + mediaAdView);
        if (this.o) {
            return;
        }
        WeakReference weakReference2 = this.i;
        if (weakReference2 != null && weakReference2.get() == mediaAdView && (weakReference = this.y) != null && weakReference.get() == context && (mediaAdView.getChildAt(1) instanceof e0)) {
            e0Var = (e0) mediaAdView.getChildAt(1);
        } else {
            A();
            this.g.a(context);
            this.i = new WeakReference(mediaAdView);
            this.y = new WeakReference(context);
            e0 e0Var2 = new e0(mediaAdView.getContext().getApplicationContext());
            mediaAdView.addView(e0Var2, 1);
            e0Var = e0Var2;
        }
        e0Var.setAdVideoViewListener(this);
        this.f.a(e0Var);
        if (this.n) {
            g();
        } else {
            if (this.s) {
                return;
            }
            p();
        }
    }

    @Override // com.my.target.c0.a
    public void b(float f, float f2) {
        k();
        if (this.q) {
            this.h.d();
            this.q = false;
        } else if (this.r) {
            this.h.j();
            this.r = false;
        }
        if (!this.p) {
            this.h.f();
            this.p = true;
        }
        float t = this.b.t();
        int a2 = v4.a(f, t);
        if (a2 == 1) {
            b(t, t);
            return;
        }
        this.h.a(f, t);
        if (this.l == null) {
            return;
        }
        if (v4.a(f, 0.0f) == 1) {
            this.z = this.l.getPosition();
        }
        if (a2 == -1) {
            return;
        }
        if (this.B) {
            this.l.replay();
            return;
        }
        p();
        this.v = 3;
        this.l.stop();
        this.n = false;
        this.g.f();
        this.h.b();
        this.g.e();
    }

    @Override // com.my.target.c0.a
    public void c() {
        MediaAdView u = u();
        if (u != null) {
            u.getProgressBarView().setVisibility(8);
            if (!this.A) {
                u.getPlayButtonView().setVisibility(0);
            }
        }
        this.z = 0L;
    }

    @Override // com.my.target.ej.d
    public void d() {
        ej ejVar;
        z();
        WeakReference weakReference = this.k;
        if (weakReference != null && (ejVar = (ej) weakReference.get()) != null) {
            ejVar.g();
        }
        this.h.k();
    }

    @Override // com.my.target.ej.d
    public void e() {
        WeakReference weakReference = this.j;
        o oVar = weakReference == null ? null : (o) weakReference.get();
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        oVar.dismiss();
    }

    @Override // com.my.target.c0.a
    public void f() {
        Context context;
        MediaAdView u = u();
        if (u != null) {
            context = u.getContext();
            if (!this.A) {
                u.getPlayButtonView().setVisibility(0);
            }
            u.getProgressBarView().setVisibility(8);
        } else {
            context = null;
        }
        y();
        if (u != null) {
            a(context);
        }
        this.h.e();
        this.r = true;
    }

    @Override // com.my.target.c0.a
    public void g() {
        WeakReference weakReference;
        ej ejVar;
        this.v = 4;
        MediaAdView u = u();
        if (u != null) {
            if (!this.A) {
                u.getProgressBarView().setVisibility(0);
            }
            u.getPlayButtonView().setVisibility(8);
        }
        if (!this.o || (weakReference = this.k) == null || (ejVar = (ej) weakReference.get()) == null) {
            return;
        }
        ejVar.d();
    }

    @Override // com.my.target.c0.a
    public void h() {
        this.h.j();
        this.r = false;
    }

    @Override // com.my.target.ej.d
    public void i() {
        WeakReference weakReference = this.j;
        if (weakReference != null && ((o) weakReference.get()) != null) {
            z();
            this.g.l();
        }
        this.h.f();
    }

    @Override // com.my.target.c0.a
    public void j() {
        this.g.k();
        this.h.a("Timeout error");
    }

    @Override // com.my.target.c0.a
    public void k() {
        WeakReference weakReference;
        ej ejVar;
        if (this.v == 1) {
            c0 c0Var = this.l;
            if (c0Var != null) {
                this.h.a(c0Var.getVolume());
                return;
            }
            return;
        }
        this.v = 1;
        MediaAdView u = u();
        if (u != null) {
            u.getProgressBarView().setVisibility(8);
            u.getPlayButtonView().setVisibility(8);
        }
        if (!this.o || (weakReference = this.k) == null || (ejVar = (ej) weakReference.get()) == null) {
            return;
        }
        if (this.l != null) {
            e0 adVideoView = ejVar.getAdVideoView();
            adVideoView.a(this.c.getWidth(), this.c.getHeight());
            this.l.a(adVideoView);
        }
        ejVar.f();
    }

    @Override // com.my.target.o.a
    public void m() {
        mi.a("NativeAdVideoController: Dismiss dialog");
        this.j = null;
        this.o = false;
        a(this.l, true);
        MediaAdView u = u();
        if (u == null) {
            return;
        }
        a(u.getContext());
        int i = this.v;
        if (i != 1) {
            if (i == 2) {
                this.r = true;
            } else if (i != 3) {
                if (i != 4) {
                    this.n = false;
                } else {
                    this.n = true;
                    g();
                    View childAt = u.getChildAt(1);
                    if (childAt instanceof e0) {
                        a((e0) childAt, this.t);
                    }
                }
            }
            this.n = false;
            p();
        } else {
            this.v = 4;
            k();
            if (this.b.v0()) {
                this.n = true;
            }
            View childAt2 = u.getChildAt(1);
            if (childAt2 instanceof e0) {
                a((e0) childAt2, this.t);
            }
        }
        this.g.a(false);
        this.k = null;
    }

    @Override // com.my.target.c0.a
    public void p() {
        Context context;
        WeakReference weakReference;
        ej ejVar;
        this.p = false;
        this.z = 0L;
        MediaAdView u = u();
        if (u != null) {
            ImageView imageView = u.getImageView();
            ImageData y = this.b.y();
            if (y != null) {
                imageView.setImageBitmap(y.getBitmap());
            }
            imageView.setVisibility(0);
            if (!this.A) {
                u.getPlayButtonView().setVisibility(0);
            }
            u.getProgressBarView().setVisibility(8);
            context = u.getContext();
        } else {
            context = null;
        }
        if (this.o && (weakReference = this.k) != null && (ejVar = (ej) weakReference.get()) != null) {
            ejVar.h();
            context = ejVar.getContext();
        }
        if (context != null) {
            a(context);
        }
    }

    @Override // com.my.target.e0.a
    public void r() {
        mi.a("NativeAdVideoController: Native Ad Views without hardware acceleration is not currently supported");
        this.h.a("Native Ad Views without hardware acceleration is not currently supported");
    }

    void t() {
        c0 c0Var = this.l;
        if (c0Var == null || this.u) {
            return;
        }
        c0Var.e();
    }

    public NativeAd.NativeAdVideoPlayer v() {
        return this.C;
    }

    public void w() {
        c0 c0Var;
        if (!this.m || this.o) {
            return;
        }
        this.m = false;
        if (this.v == 1 && (c0Var = this.l) != null) {
            c0Var.pause();
            this.v = 2;
        }
        c0 c0Var2 = this.l;
        if (c0Var2 != null) {
            c0Var2.a((c0.a) null);
            this.l.a((e0) null);
        }
    }

    public void x() {
        MediaAdView u = u();
        if (u == null) {
            mi.a("NativeAdVideoController: Trying to play video in unregistered view");
            s();
            return;
        }
        if (u.getWindowVisibility() != 0) {
            if (this.v != 1) {
                s();
                return;
            }
            c0 c0Var = this.l;
            if (c0Var != null) {
                this.z = c0Var.getPosition();
            }
            s();
            this.v = 4;
            this.m = false;
            g();
            return;
        }
        if (this.m) {
            return;
        }
        WeakReference weakReference = this.y;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context != null) {
            a(u, context);
        }
        this.m = true;
        e0 e0Var = u.getChildAt(1) instanceof e0 ? (e0) u.getChildAt(1) : null;
        if (e0Var == null) {
            s();
            return;
        }
        c0 c0Var2 = this.l;
        if (c0Var2 != null && !this.w.equals(c0Var2.getUri())) {
            s();
        }
        if (!this.n) {
            if (!this.A) {
                u.getPlayButtonView().setVisibility(0);
            }
            u.getProgressBarView().setVisibility(8);
        }
        if (!this.n || this.o) {
            return;
        }
        c0 c0Var3 = this.l;
        if (c0Var3 == null || !c0Var3.b()) {
            a(e0Var, this.t);
            return;
        }
        this.l.a(e0Var);
        e0Var.a(this.c.getWidth(), this.c.getHeight());
        this.l.a(this);
        this.l.resume();
        a(this.l, this.t);
    }

    void y() {
        WeakReference weakReference;
        if (!this.o || (weakReference = this.k) == null) {
            return;
        }
        this.v = 2;
        ej ejVar = (ej) weakReference.get();
        if (ejVar == null) {
            return;
        }
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0Var.pause();
        }
        ejVar.e();
    }

    void c(boolean z) {
        this.A = z;
    }

    @Override // com.my.target.c0.a
    public void a(float f) {
        ej ejVar;
        WeakReference weakReference = this.k;
        if (weakReference == null || (ejVar = (ej) weakReference.get()) == null) {
            return;
        }
        ejVar.a(f <= 0.0f);
    }

    @Override // com.my.target.c0.a
    public void a(float f, float f2) {
        ej ejVar;
        this.f.a(f, f2);
        this.g.a(f, f2);
        float t = this.b.t();
        WeakReference weakReference = this.k;
        if (weakReference == null || (ejVar = (ej) weakReference.get()) == null) {
            return;
        }
        ejVar.a(f, t);
    }

    @Override // com.my.target.c0.a
    public void a(String str) {
        this.g.j();
        dj djVar = (dj) this.b.A0();
        if (djVar != null && this.w.toString().equals(djVar.a())) {
            mi.a("NativeAdVideoController: Try to play video stream from URL");
            this.w = Uri.parse(djVar.getUrl());
            WeakReference weakReference = this.y;
            Context context = weakReference != null ? (Context) weakReference.get() : null;
            c0 c0Var = this.l;
            if (c0Var == null || context == null) {
                return;
            }
            c0Var.a(this.w, context);
            return;
        }
        this.h.a(str);
    }

    @Override // com.my.target.o.a
    public void a(o oVar, FrameLayout frameLayout) {
        a(oVar, frameLayout, new ej(frameLayout.getContext()));
    }

    @Override // com.my.target.ej.d
    public void a(View view) {
        if (this.v == 1) {
            c0 c0Var = this.l;
            if (c0Var != null) {
                c0Var.pause();
            }
            f();
        }
        ge geVar = this.x;
        if (geVar != null) {
            geVar.a(view, 2);
        }
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
        c0 c0Var = this.l;
        if (c0Var == null || z) {
            return;
        }
        this.z = c0Var.getPosition();
        s();
        f();
    }

    @Override // com.my.target.ej.d
    public void b() {
        c0 c0Var = this.l;
        if (c0Var == null) {
            this.u = !this.u;
            return;
        }
        if (c0Var.c()) {
            this.l.d();
            this.g.b(true);
            this.u = false;
        } else {
            this.l.f();
            this.g.b(false);
            this.u = true;
        }
    }

    @Override // com.my.target.ej.d
    public void a() {
        if (this.v != 1) {
            return;
        }
        y();
        this.v = 2;
        WeakReference weakReference = this.j;
        if (weakReference == null || ((o) weakReference.get()) == null) {
            return;
        }
        this.g.i();
    }

    void b(View view) {
        WeakReference weakReference = this.y;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context == null) {
            context = view.getContext();
        }
        b(context);
        if (this.A) {
            return;
        }
        if (this.v == 1) {
            this.v = 4;
        }
        try {
            o.a(this, context).show();
            this.o = true;
        } catch (Throwable th) {
            th.printStackTrace();
            mi.b("Unable to start video dialog! Check myTarget MediaAdView, maybe it was created with non-Activity context");
            m();
        }
    }

    void a(ge geVar) {
        this.x = geVar;
    }

    void a(boolean z) {
        this.B = z;
    }

    void a(o oVar, FrameLayout frameLayout, ej ejVar) {
        this.v = 4;
        this.j = new WeakReference(oVar);
        ejVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.addView(ejVar);
        this.k = new WeakReference(ejVar);
        ejVar.a(this.e, this.c);
        ejVar.setVideoDialogViewListener(this);
        ejVar.a(this.u);
        this.g.a(true);
        a(ejVar.getAdVideoView(), this.u);
    }

    void a(c0 c0Var, boolean z) {
        if (c0Var == null) {
            return;
        }
        if (z) {
            c0Var.f();
        } else {
            c0Var.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e0 e0Var, boolean z) {
        boolean z2;
        c0 c0Var = this.l;
        if (c0Var == null) {
            c0Var = this.a.a();
            z2 = true;
        } else {
            z2 = false;
        }
        c0Var.a(this);
        a(c0Var, z);
        c0Var.a(e0Var);
        e0Var.a(this.c.getWidth(), this.c.getHeight());
        if (!c0Var.isPlaying()) {
            c0Var.a(this.w, e0Var.getContext());
            long j = this.z;
            if (j > 0 && z2) {
                c0Var.seekTo(j);
            }
            this.l = c0Var;
            return;
        }
        this.l = c0Var;
        k();
    }

    private void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.d, 3, 2);
        }
    }

    private void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.d);
        }
    }
}
