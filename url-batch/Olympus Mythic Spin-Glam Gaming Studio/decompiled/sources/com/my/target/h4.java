package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import com.my.target.ads.InterstitialAd;
import com.my.target.c0;
import com.my.target.e0;
import com.my.target.g;
import com.my.target.wh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class h4 implements g4, AudioManager.OnAudioFocusChangeListener, c0.a, e0.a {
    private bj a;
    private c0 b;
    private e0 c;
    private oe d;
    private tj e;
    private eb f;
    private float g = 0.0f;
    private boolean h = true;
    private l8 i;
    private e4 j;
    private final j9 k;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a implements r9 {
        private final g4 a;

        public a(g4 g4Var) {
            this.a = g4Var;
        }

        @Override // com.my.target.r9
        public void a() {
        }

        @Override // com.my.target.r9
        public void b() {
            mi.a("DoubleInterstitialCardPresenter.InterstitialMediaListenerImpl: Error video playing");
        }

        @Override // com.my.target.r9
        public void c() {
            this.a.d();
        }

        @Override // com.my.target.r9
        public void d() {
            this.a.a();
        }
    }

    h4(j9 j9Var) {
        this.k = j9Var;
        j9Var.a(this);
    }

    public static g4 a(j9 j9Var) {
        return new h4(j9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(e4 e4Var) {
        this.k.a(InterstitialAd.BannerInfo.a(e4Var.a().x(), e4Var.a().A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        e4 e4Var = this.j;
        if (e4Var != null) {
            this.k.a(e4Var.a());
        }
    }

    private void i() {
        e0 e0Var;
        if (this.b == null || (e0Var = this.c) == null) {
            return;
        }
        a(e0Var.getContext());
        this.b.pause();
    }

    private void m() {
        eb ebVar = this.f;
        if (ebVar == null || this.d == null || this.b == null || this.c == null) {
            return;
        }
        dj djVar = (dj) ebVar.A0();
        this.d.e();
        if (djVar != null) {
            if (!this.b.c()) {
                b(this.c.getContext());
            }
            this.b.a(this);
            this.b.a(this.c);
            a(djVar);
        }
    }

    @Override // com.my.target.c0.a
    public void b(float f, float f2) {
    }

    @Override // com.my.target.c0.a
    public void c() {
        mi.a("DoubleInterstitialCardPresenter: Video completed");
        oe oeVar = this.d;
        if (oeVar != null) {
            oeVar.f();
        }
        bj bjVar = this.a;
        if (bjVar == null || this.b == null) {
            return;
        }
        bjVar.b();
        this.b.stop();
        e4 e4Var = this.j;
        if (e4Var != null) {
            e4Var.c(true);
            this.k.a(this.j);
        }
    }

    @Override // com.my.target.g4
    public void d() {
        c0 c0Var = this.b;
        if (c0Var == null) {
            return;
        }
        if (c0Var.isPlaying()) {
            i();
            oe oeVar = this.d;
            if (oeVar != null) {
                oeVar.i();
                return;
            }
            return;
        }
        if (this.b.getPosition() <= 0) {
            m();
            return;
        }
        resume();
        oe oeVar2 = this.d;
        if (oeVar2 != null) {
            oeVar2.l();
        }
    }

    @Override // com.my.target.c0.a
    public void f() {
        bj bjVar = this.a;
        if (bjVar == null) {
            return;
        }
        bjVar.d();
    }

    @Override // com.my.target.c0.a
    public void g() {
        bj bjVar = this.a;
        if (bjVar == null) {
            return;
        }
        bjVar.e();
    }

    @Override // com.my.target.c0.a
    public void h() {
        bj bjVar = this.a;
        if (bjVar == null) {
            return;
        }
        bjVar.g();
    }

    @Override // com.my.target.c0.a
    public void j() {
        mi.a("DoubleInterstitialCardPresenter: Video playing timeout");
        oe oeVar = this.d;
        if (oeVar != null) {
            oeVar.k();
        }
        bj bjVar = this.a;
        if (bjVar == null || this.b == null) {
            return;
        }
        bjVar.c();
        this.b.stop();
        this.b.destroy();
    }

    @Override // com.my.target.c0.a
    public void k() {
        bj bjVar = this.a;
        if (bjVar == null) {
            return;
        }
        bjVar.h();
    }

    @Override // com.my.target.c0.a
    public void p() {
    }

    @Override // com.my.target.g4
    public void pause() {
        i();
    }

    @Override // com.my.target.e0.a
    public void r() {
        if (!ib.a(this.b)) {
            a("DoubleInterstitialCardPresenter: Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        e0 e0Var = this.c;
        if (e0Var != null) {
            e0Var.setViewMode(1);
            this.b.a(this.c);
        }
        eb ebVar = this.f;
        if (ebVar != null) {
            dj djVar = (dj) ebVar.A0();
            if (!this.b.isPlaying() || djVar == null) {
                return;
            }
            if (djVar.a() != null) {
                this.h = true;
            }
            a(djVar);
        }
    }

    @Override // com.my.target.g4
    public void resume() {
        c0 c0Var = this.b;
        if (c0Var == null || this.c == null) {
            return;
        }
        c0Var.resume();
        if (this.b.c()) {
            a(this.c.getContext());
        } else if (this.b.isPlaying()) {
            b(this.c.getContext());
        }
    }

    public void s() {
        bj bjVar;
        c0 c0Var = this.b;
        if (c0Var == null || c0Var.isPlaying() || this.f == null || (bjVar = this.a) == null) {
            return;
        }
        bjVar.f();
        this.a.setDuration(this.g);
    }

    @Override // com.my.target.g4
    public void a(final e4 e4Var, View view) {
        this.j = e4Var;
        eb j0 = e4Var.a().j0();
        this.f = j0;
        if (j0 != null && this.a != null && this.b != null) {
            this.g = j0.t();
            this.d = a(this.f, e4Var.b(), this.a.getContext(), new wh.c() { // from class: com.my.target.h4$$ExternalSyntheticLambda2
                @Override // com.my.target.wh.c
                public final void a() {
                    h4.this.a(e4Var);
                }
            });
            this.e = tj.a(this.f.H(), new wh.c() { // from class: com.my.target.h4$$ExternalSyntheticLambda3
                @Override // com.my.target.wh.c
                public final void a() {
                    h4.this.b(e4Var);
                }
            });
            if (this.f.u0()) {
                this.b.setVolume(0.0f);
            } else {
                this.b.setVolume(1.0f);
            }
            s();
        }
        this.k.a(e4Var, view);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i) {
        if (Looper.getMainLooper().isCurrentThread()) {
            b(i);
        } else {
            o0.e(new Runnable() { // from class: com.my.target.h4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    h4.this.b(i);
                }
            });
        }
    }

    private void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
    }

    @Override // com.my.target.g4
    public void b(d9 d9Var, Context context) {
        e a2 = d9Var.a();
        if (a2 == null || a2.b() == null) {
            return;
        }
        m8 m8Var = new m8(a2, d9Var.b(), context);
        this.i = m8Var;
        m8Var.a(new g.a() { // from class: com.my.target.h4$$ExternalSyntheticLambda1
            @Override // com.my.target.g.a
            public final void b() {
                h4.this.e();
            }
        });
    }

    @Override // com.my.target.g4
    public void b() {
        if (this.b == null) {
            return;
        }
        tj tjVar = this.e;
        if (tjVar != null) {
            tjVar.a();
        }
        oe oeVar = this.d;
        if (oeVar != null) {
            oeVar.h();
        }
        this.b.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e4 e4Var) {
        this.k.a(InterstitialAd.BannerInfo.a(e4Var.a().x(), e4Var.a().A()));
    }

    @Override // com.my.target.g4
    public void a(bj bjVar) {
        this.b = bjVar.getVideoPlayer();
        this.c = bjVar.getVideoView();
        this.a = bjVar;
        this.b.a(this);
        this.c.setAdVideoViewListener(this);
    }

    @Override // com.my.target.g4
    public void a(d9 d9Var, Context context) {
        e a2 = d9Var.a();
        if (a2 == null) {
            return;
        }
        l8 l8Var = this.i;
        if (l8Var == null) {
            a7.a(a2.c(), context);
        } else {
            l8Var.c();
        }
    }

    @Override // com.my.target.g4
    public void a(b bVar, int i, n2 n2Var, View view) {
        this.k.a(bVar, i, n2Var, view);
    }

    @Override // com.my.target.c0.a
    public void a(float f) {
        bj bjVar = this.a;
        if (bjVar == null) {
            return;
        }
        bjVar.a(f);
    }

    @Override // com.my.target.c0.a
    public void a(float f, float f2) {
        bj bjVar = this.a;
        if (bjVar == null || this.b == null) {
            return;
        }
        float f3 = this.g;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != 0.0f) {
            bjVar.getVideoControlView().getProgressView().setTimeChanged(f);
            oe oeVar = this.d;
            if (oeVar != null) {
                oeVar.a(f, f2);
            }
            e4 e4Var = this.j;
            if (e4Var != null && this.e != null && !e4Var.h()) {
                this.e.a(f, f2);
            }
        }
        if (f == f2) {
            if (this.b.isPlaying()) {
                c();
            }
            this.b.stop();
        }
    }

    @Override // com.my.target.c0.a
    public void a(String str) {
        dj djVar;
        if (this.a == null || this.b == null || this.c == null) {
            return;
        }
        mi.a("DoubleInterstitialCardPresenter: Video playing error - " + str);
        oe oeVar = this.d;
        if (oeVar != null) {
            oeVar.j();
        }
        if (this.h) {
            mi.a("DoubleInterstitialCardPresenter: Try to play video stream from URL");
            this.h = false;
            eb ebVar = this.f;
            if (ebVar != null && (djVar = (dj) ebVar.A0()) != null) {
                this.b.a(Uri.parse(djVar.getUrl()), this.c.getContext());
                return;
            }
        }
        this.a.c();
        this.b.stop();
        this.b.destroy();
    }

    private void a(dj djVar) {
        if (this.b == null || this.c == null) {
            return;
        }
        String str = (String) djVar.a();
        if (str != null) {
            this.h = true;
            this.b.a(Uri.parse(str), this.c.getContext());
        } else {
            this.h = false;
            this.b.a(Uri.parse(djVar.getUrl()), this.c.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(int i) {
        if (i == -2 || i == -1) {
            i();
            mi.a("DoubleInterstitialCardPresenter: Audiofocus loss, pausing");
        }
    }

    private void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    @Override // com.my.target.g4
    public void a() {
        c0 c0Var = this.b;
        if (c0Var == null) {
            return;
        }
        c0Var.a();
        oe oeVar = this.d;
        if (oeVar != null) {
            oeVar.b(!this.b.c());
        }
    }

    public oe a(eb ebVar, fe feVar, Context context, wh.c cVar) {
        return oe.a(ebVar, feVar, cVar, context);
    }
}
