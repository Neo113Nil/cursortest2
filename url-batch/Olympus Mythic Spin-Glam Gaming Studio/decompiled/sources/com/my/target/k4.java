package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.my.target.ads.InterstitialAd;
import com.my.target.c0;
import com.my.target.c4;
import com.my.target.e0;
import com.my.target.g;
import com.my.target.m4;
import com.my.target.va;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class k4 implements z9, va.a, AudioManager.OnAudioFocusChangeListener, c0.a, e0.a, m4.a {
    private final we A;
    private final i4 a;
    private oe b;
    private boolean c;
    private l8 d;
    private eb e;
    private final List f;
    private final c4.b g;
    private final m4 i;
    private final Handler j;
    private e4 k;
    private boolean l;
    private va m;
    private long n;
    private final Runnable o;
    private long s;
    private float t;
    private float u;
    private bj v;
    private c0 w;
    private e0 x;
    private float y;
    private tj z;
    private boolean p = true;
    private int q = 0;
    private int r = 0;
    private final j9 B = new a();
    private final Runnable h = new Runnable() { // from class: com.my.target.k4$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            k4.this.w();
        }
    };

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public class a implements j9 {
        private g4 a;

        public a() {
        }

        @Override // com.my.target.j9
        public void a(g4 g4Var) {
            this.a = g4Var;
        }

        @Override // com.my.target.j9
        public void b() {
            g4 g4Var = this.a;
            if (g4Var != null) {
                g4Var.b();
            }
        }

        @Override // com.my.target.j9
        public void a(com.my.target.b bVar, int i, n2 n2Var, View view) {
            k4 k4Var = k4.this;
            e4 e4Var = k4Var.k;
            if (e4Var == null) {
                return;
            }
            c4.b bVar2 = k4Var.g;
            if (bVar == null) {
                bVar = e4Var.a();
            }
            bVar2.a(bVar, null, i, s2.a(n2Var), view.getContext());
            k4 k4Var2 = k4.this;
            if (k4Var2.l) {
                k4Var2.e();
            }
            g4 g4Var = this.a;
            if (g4Var != null) {
                g4Var.pause();
            }
        }

        @Override // com.my.target.j9
        public void a(d9 d9Var) {
            Iterator it = k4.this.f.iterator();
            while (it.hasNext()) {
                ((e4) it.next()).b(true);
            }
            k4.this.g.a(d9Var);
        }

        @Override // com.my.target.j9
        public void a(InterstitialAd.BannerInfo bannerInfo) {
            k4.this.g.a(bannerInfo);
        }

        @Override // com.my.target.j9
        public void a(e4 e4Var) {
            k4.this.g.b(e4Var);
        }

        @Override // com.my.target.j9
        public void a(e4 e4Var, View view) {
            k4.this.g.a(e4Var, view);
        }

        @Override // com.my.target.j9
        public void a() {
            g4 g4Var = this.a;
            if (g4Var != null) {
                g4Var.resume();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class b implements r9 {
        private b() {
        }

        @Override // com.my.target.r9
        public void a() {
            e4 e4Var;
            k4 k4Var = k4.this;
            if (k4Var.x == null || (e4Var = k4Var.k) == null) {
                return;
            }
            k4Var.g.b(e4Var);
            k4.this.k.c(true);
        }

        @Override // com.my.target.r9
        public void b() {
            k4 k4Var = k4.this;
            if (k4Var.m != null) {
                int size = k4Var.f.size();
                k4 k4Var2 = k4.this;
                if (size <= k4Var2.r || k4Var2.x()) {
                    k4.this.m.b();
                    k4 k4Var3 = k4.this;
                    k4Var3.j.removeCallbacks(k4Var3.o);
                    k4 k4Var4 = k4.this;
                    k4Var4.q = 0;
                    k4Var4.g.a(true);
                } else {
                    k4.this.m();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DoubleInterstitialPromoPresenter.InterstitialMediaPresenterImpl: Failed playing video ");
            k4 k4Var5 = k4.this;
            sb.append(((e4) k4Var5.f.get(k4Var5.r)).a().x());
            mi.a(sb.toString());
        }

        @Override // com.my.target.r9
        public void c() {
            k4.this.G();
            k4.this.E();
        }

        @Override // com.my.target.r9
        public void d() {
            k4.this.F();
        }
    }

    private k4(i4 i4Var, final List list, c4.b bVar) {
        this.l = true;
        this.a = i4Var;
        this.f = list;
        this.g = bVar;
        this.j = i4Var.a();
        m4 a2 = i4Var.a(this, new b(), this);
        this.i = a2;
        we progressBar = a2.getProgressBar();
        this.A = progressBar;
        e4 e4Var = (e4) list.get(this.r);
        this.k = e4Var;
        d9 a3 = e4Var.a();
        this.l = a3.k0();
        this.t = a3.Y() * 1000.0f;
        this.u = a3.X() * 1000.0f;
        progressBar.setCountBars(list.size());
        if (a3.j0() != null) {
            this.e = a3.j0();
            a2.a(a3, this.k.g(), this.r, x());
            va interstitialView = a2.getInterstitialView();
            this.m = interstitialView;
            if (interstitialView instanceof ta) {
                ta taVar = (ta) interstitialView;
                e0 videoView = taVar.getVideoView();
                this.x = videoView;
                videoView.setAdVideoViewListener(this);
                this.z = tj.a(this.e.H(), new k4$$ExternalSyntheticLambda1(this));
                this.b = i4Var.a(this.e, this.k.b(), new k4$$ExternalSyntheticLambda1(this));
                this.z.a(this.x);
                this.y = this.e.t();
                c0 videoPlayer = taVar.getVideoPlayer();
                this.w = videoPlayer;
                videoPlayer.a(this);
                this.v = taVar.getVideoContent();
                progressBar.a(this.r, this.u / 1000.0f);
                this.v.setDuration(this.e.t());
                if (this.e.u0()) {
                    this.w.setVolume(0.0f);
                } else {
                    this.w.setVolume(1.0f);
                }
            }
            C();
        } else {
            a2.a(a3, this.k.g(), this.r, x());
            progressBar.a(this.r, this.u / 1000.0f);
        }
        this.m = a2.getInterstitialView();
        this.o = new Runnable() { // from class: com.my.target.k4$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                k4.this.a(list);
            }
        };
        a(a3);
        b(a3);
        bVar.a(this.k, a2.getRootLayout());
    }

    private void A() {
        eb ebVar = this.e;
        if (ebVar == null || this.b == null || this.w == null || this.x == null) {
            return;
        }
        dj djVar = (dj) ebVar.A0();
        this.b.e();
        if (djVar != null) {
            if (!this.w.c()) {
                b(this.x.getContext());
            }
            this.w.a(this);
            this.w.a(this.x);
            a(djVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        e4 e4Var = this.k;
        if (e4Var == null) {
            return;
        }
        d9 a2 = e4Var.a();
        this.g.a(InterstitialAd.BannerInfo.a(a2.x(), a2.A()));
    }

    private void D() {
        if (this.m != null) {
            this.j.removeCallbacks(this.o);
            this.j.postDelayed(this.o, 200L);
            if (this.n / 1000 < 1 || this.f.size() != this.r) {
                long j = this.s / 1000;
                if (j >= 1) {
                    this.m.setRemainingAllowCloseDelay((int) j);
                }
            } else {
                this.m.setRemainingAllowCloseDelay((int) (this.n / 1000));
            }
            if (this.f.size() > this.r) {
                long j2 = this.s;
                if (j2 / 1000 >= 1) {
                    this.g.a(j2 / 1000.0d);
                }
            } else {
                long j3 = this.n;
                if (j3 / 1000 >= 1) {
                    this.g.a(j3 / 1000.0d);
                }
            }
            if (x()) {
                return;
            }
            int size = this.f.size();
            int i = this.r;
            if (size > i) {
                this.A.a((this.u - this.n) / 1000.0f, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        this.c = false;
        this.j.removeCallbacks(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        c0 c0Var = this.w;
        if (c0Var == null) {
            return;
        }
        c0Var.a();
        oe oeVar = this.b;
        if (oeVar != null) {
            oeVar.b(!this.w.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        c0 c0Var = this.w;
        if (c0Var == null) {
            return;
        }
        if (c0Var.isPlaying()) {
            z();
            oe oeVar = this.b;
            if (oeVar != null) {
                oeVar.i();
                return;
            }
            return;
        }
        if (this.w.getPosition() <= 0) {
            A();
            return;
        }
        resume();
        oe oeVar2 = this.b;
        if (oeVar2 != null) {
            oeVar2.l();
        }
    }

    public static k4 a(i4 i4Var, List list, c4.b bVar) {
        return new k4(i4Var, list, bVar);
    }

    private void s() {
        if (this.m != null) {
            if (this.f.size() > this.r && !x()) {
                m();
                return;
            }
            this.m.b();
            this.g.a(0.0d);
            this.j.removeCallbacks(this.o);
            this.q = 0;
            this.g.a(true);
        }
    }

    private void t() {
        if (this.m != null) {
            if (x()) {
                this.m.b();
            } else {
                this.g.a(this.s);
                this.m.d();
            }
        }
    }

    private boolean u() {
        int i = this.q;
        if (i == 0) {
            return true;
        }
        if (i == 1 && (x() || this.f.size() >= this.r)) {
            this.n -= 200;
        }
        return this.n <= 0;
    }

    private boolean v() {
        int i = this.q;
        if (i == 0) {
            return true;
        }
        if (i == 1 && !x() && this.f.size() > this.r) {
            this.s -= 200;
        }
        return this.s <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.c) {
            E();
            bj bjVar = this.v;
            if (bjVar != null) {
                bjVar.a();
            }
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        Iterator it = this.f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((e4) it.next()).f()) {
                i++;
            }
        }
        return i == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        e4 e4Var = this.k;
        if (e4Var != null) {
            e4Var.b(true);
            this.g.a(this.k.a());
            m();
        }
    }

    private void z() {
        e0 e0Var;
        if (this.w == null || (e0Var = this.x) == null) {
            return;
        }
        a(e0Var.getContext());
        this.w.pause();
    }

    public void C() {
        eb ebVar = this.e;
        if (ebVar == null || this.v == null) {
            return;
        }
        if (!ebVar.v0()) {
            this.v.f();
        } else {
            this.v.e();
            A();
        }
    }

    @Override // com.my.target.va.a
    public void b() {
        e4 e4Var = this.k;
        if (e4Var == null || this.m == null) {
            return;
        }
        this.m.setBanner(e4Var.a());
    }

    @Override // com.my.target.c0.a
    public void b(float f, float f2) {
    }

    @Override // com.my.target.c0.a
    public void c() {
        oe oeVar = this.b;
        if (oeVar != null) {
            oeVar.f();
        }
        bj bjVar = this.v;
        if (bjVar == null || this.w == null) {
            return;
        }
        bjVar.b();
        this.w.stop();
        e4 e4Var = this.k;
        if (e4Var != null) {
            e4Var.c(true);
            if (x() || !this.k.a().c0()) {
                return;
            }
            m();
        }
    }

    @Override // com.my.target.va.a
    public void d() {
        e4 e4Var = this.k;
        if (e4Var == null || this.m == null) {
            return;
        }
        d9 a2 = e4Var.a();
        E();
        String e0 = a2.e0();
        if (e0 == null) {
            return;
        }
        a7.a(e0, this.m.a().getContext());
    }

    @Override // com.my.target.z9
    public void destroy() {
        z();
        tj tjVar = this.z;
        if (tjVar != null) {
            tjVar.a();
        }
        E();
        c0 c0Var = this.w;
        if (c0Var == null) {
            return;
        }
        c0Var.destroy();
    }

    @Override // com.my.target.va.a
    public void e() {
        oe oeVar = this.b;
        if (oeVar != null) {
            oeVar.h();
        }
        destroy();
        E();
        e4 e4Var = this.k;
        if (e4Var != null) {
            this.g.a(e4Var);
        }
        this.B.b();
    }

    @Override // com.my.target.c0.a
    public void f() {
        bj bjVar = this.v;
        if (bjVar == null) {
            return;
        }
        bjVar.d();
    }

    @Override // com.my.target.c0.a
    public void g() {
        bj bjVar = this.v;
        if (bjVar == null) {
            return;
        }
        bjVar.e();
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        va vaVar = this.m;
        if (vaVar == null) {
            return null;
        }
        return vaVar.getCloseButton();
    }

    @Override // com.my.target.c0.a
    public void h() {
        bj bjVar = this.v;
        if (bjVar == null) {
            return;
        }
        bjVar.g();
    }

    @Override // com.my.target.z9
    public View i() {
        return this.i.getRootLayout();
    }

    @Override // com.my.target.c0.a
    public void j() {
        mi.a("DoubleInterstitialPromoPresenter: Video playing timeout");
        oe oeVar = this.b;
        if (oeVar != null) {
            oeVar.k();
        }
        bj bjVar = this.v;
        if (bjVar == null || this.w == null) {
            return;
        }
        bjVar.c();
        this.w.stop();
        this.w.destroy();
    }

    @Override // com.my.target.c0.a
    public void k() {
        bj bjVar = this.v;
        if (bjVar == null) {
            return;
        }
        bjVar.h();
    }

    @Override // com.my.target.m4.a
    public void m() {
        this.r++;
        destroy();
        int size = this.f.size();
        int i = this.r;
        if (size <= i) {
            if (x()) {
                e();
                return;
            }
            if (!(this.m instanceof b4)) {
                this.i.a(this.f, this.B);
                this.m = this.i.getInterstitialView();
                b(((e4) this.f.get(this.r - 1)).a());
            }
            this.r = this.f.size();
            return;
        }
        this.A.b(i, this.u / 1000.0f);
        e4 e4Var = (e4) this.f.get(this.r);
        this.k = e4Var;
        d9 a2 = e4Var.a();
        this.l = a2.k0();
        this.t = a2.Y() * 1000.0f;
        this.u = a2.X() * 1000.0f;
        if (a2.j0() != null) {
            this.e = a2.j0();
            this.i.a(a2, this.k.g(), this.r, x());
            va interstitialView = this.i.getInterstitialView();
            this.m = interstitialView;
            if (interstitialView instanceof ta) {
                ta taVar = (ta) interstitialView;
                e0 videoView = taVar.getVideoView();
                this.x = videoView;
                videoView.setAdVideoViewListener(this);
                this.z = tj.a(this.e.H(), new k4$$ExternalSyntheticLambda1(this));
                this.b = this.a.a(this.e, this.k.b(), new k4$$ExternalSyntheticLambda1(this));
                this.z.a(this.x);
                this.y = this.e.t();
                c0 videoPlayer = taVar.getVideoPlayer();
                this.w = videoPlayer;
                videoPlayer.a(this);
                this.v = taVar.getVideoContent();
                this.A.a(this.r, this.u / 1000.0f);
                this.v.setDuration(this.e.t());
                if (this.e.u0()) {
                    this.w.setVolume(0.0f);
                } else {
                    this.w.setVolume(1.0f);
                }
            }
            C();
        } else {
            this.i.a(a2, this.k.g(), this.r, x());
            this.A.a(this.r, this.u / 1000.0f);
        }
        this.j.removeCallbacks(this.o);
        this.m = this.i.getInterstitialView();
        a(a2);
        b(a2);
        this.g.a(this.k, this.i.getRootLayout());
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
    }

    @Override // com.my.target.c0.a
    public void p() {
    }

    @Override // com.my.target.z9
    public void pause() {
        z();
        this.j.removeCallbacks(this.o);
        E();
    }

    @Override // com.my.target.e0.a
    public void r() {
        if (!ib.a(this.w)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        e0 e0Var = this.x;
        if (e0Var != null) {
            e0Var.setViewMode(1);
            this.w.a(this.x);
        }
        eb ebVar = this.e;
        if (ebVar != null) {
            dj djVar = (dj) ebVar.A0();
            if (!this.w.isPlaying() || djVar == null) {
                return;
            }
            if (djVar.a() != null) {
                this.p = true;
            }
            a(djVar);
        }
    }

    @Override // com.my.target.z9
    public void resume() {
        if (this.q != 0 && this.n > 0) {
            D();
        }
        E();
        c0 c0Var = this.w;
        if (c0Var == null || this.x == null) {
            return;
        }
        c0Var.resume();
        if (this.w.c()) {
            a(this.x.getContext());
        } else if (this.w.isPlaying()) {
            b(this.x.getContext());
        }
        this.B.a();
    }

    @Override // com.my.target.z9
    public void stop() {
        z();
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (v() && list.size() > this.r) {
            t();
        }
        if (u()) {
            s();
        } else {
            D();
        }
    }

    private void b(d9 d9Var) {
        boolean z;
        if (this.m == null) {
            return;
        }
        eb j0 = d9Var.j0();
        if (d9Var.c0() && this.f.size() > this.r) {
            this.s = (long) this.t;
        }
        if (j0 != null && j0.v0() && this.f.size() != this.r) {
            z = false;
            if (j0.o0()) {
                this.u = (long) (j0.t() * 1000.0f);
                this.A.a(this.r, j0.t());
                long j = (long) this.u;
                this.n = j;
                if (j > 0) {
                    this.q = 2;
                    D();
                } else {
                    s();
                }
            } else {
                this.m.c();
            }
            this.g.a(z);
        }
        c(d9Var);
        z = true;
        this.g.a(z);
    }

    @Override // com.my.target.va.a
    public void a(int i, n2 n2Var) {
        e4 e4Var = this.k;
        if (e4Var == null) {
            return;
        }
        this.g.a(e4Var.a(), null, i, s2.a(n2Var), i().getContext());
        if (this.l) {
            e();
        }
    }

    private void c(d9 d9Var) {
        if (this.m == null) {
            return;
        }
        boolean z = false;
        if (d9Var.b0()) {
            long j = (long) this.u;
            this.n = j;
            if (j > 0) {
                mi.a("DoubleInterstitialPromoPresenter: Banner will be allowed to close in " + this.n + " millis");
                this.q = 1;
                D();
            } else {
                mi.a("DoubleInterstitialPromoPresenter: Banner is allowed to close");
                s();
                z = true;
            }
        } else {
            this.q = 0;
            this.m.c();
        }
        this.g.a(z);
    }

    @Override // com.my.target.va.a
    public void a() {
        e a2;
        e4 e4Var = this.k;
        if (e4Var == null || this.m == null || (a2 = e4Var.a().a()) == null) {
            return;
        }
        Context context = this.m.a().getContext();
        l8 l8Var = this.d;
        if (l8Var == null) {
            a7.a(a2.c(), context);
        } else {
            l8Var.c();
            pause();
        }
    }

    @Override // com.my.target.c0.a
    public void a(float f) {
        bj bjVar = this.v;
        if (bjVar == null) {
            return;
        }
        bjVar.a(f);
    }

    @Override // com.my.target.c0.a
    public void a(float f, float f2) {
        bj bjVar = this.v;
        if (bjVar == null || this.w == null || this.m == null) {
            return;
        }
        float f3 = this.y;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != 0.0f) {
            if (this.q == 2) {
                this.n = (long) (this.u - (1000.0f * f));
            }
            bjVar.getVideoControlView().getProgressView().setTimeChanged(f);
            long j = this.s;
            if (j > 0) {
                this.s = j - 200;
            }
            oe oeVar = this.b;
            if (oeVar != null) {
                oeVar.a(f, f2);
            }
            e4 e4Var = this.k;
            if (e4Var != null) {
                if (this.z != null && !e4Var.h()) {
                    this.z.a(f, f2);
                }
                this.g.a(this.k, this.w.getVolume());
            }
        }
        if (f == f2) {
            if (this.w.isPlaying()) {
                c();
            }
            this.w.stop();
        }
    }

    private void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
    }

    @Override // com.my.target.c0.a
    public void a(String str) {
        dj djVar;
        if (this.v == null || this.w == null || this.x == null) {
            return;
        }
        mi.a("InterstitialDoublePromoPresenter: Video playing error - " + str);
        oe oeVar = this.b;
        if (oeVar != null) {
            oeVar.j();
        }
        if (this.p) {
            mi.a("InterstitialDoublePromoPresenter: Try to play video stream from URL");
            this.p = false;
            eb ebVar = this.e;
            if (ebVar != null && (djVar = (dj) ebVar.A0()) != null) {
                this.w.a(Uri.parse(djVar.getUrl()), this.x.getContext());
                return;
            }
        }
        this.v.c();
        this.w.stop();
        this.w.destroy();
    }

    private void a(d9 d9Var) {
        e a2;
        String str;
        if (this.m == null || (a2 = d9Var.a()) == null || a2.b() == null) {
            return;
        }
        e4 e4Var = this.k;
        if (e4Var == null) {
            str = "";
        } else {
            str = e4Var.a().b();
        }
        m8 m8Var = new m8(a2, str, this.m.a().getContext());
        this.d = m8Var;
        m8Var.a(new g.a() { // from class: com.my.target.k4$$ExternalSyntheticLambda3
            @Override // com.my.target.g.a
            public final void b() {
                k4.this.y();
            }
        });
        this.d.a(new g.b() { // from class: com.my.target.k4$$ExternalSyntheticLambda4
            @Override // com.my.target.g.b
            public final void a() {
                k4.this.resume();
            }
        });
    }

    private void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    private void a(dj djVar) {
        if (this.w == null || this.x == null) {
            return;
        }
        String str = (String) djVar.a();
        if (str != null) {
            this.p = true;
            this.w.a(Uri.parse(str), this.x.getContext());
        } else {
            this.p = false;
            this.w.a(Uri.parse(djVar.getUrl()), this.x.getContext());
        }
    }
}
