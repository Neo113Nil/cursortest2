package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import com.my.target.ea;
import com.my.target.ef;
import com.my.target.s9;
import com.my.target.wh;
import com.my.target.xa;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public class s9 {
    private final eb a;
    private final a b;
    private final d0 c;
    private final ha d;
    private final tj e;
    private final oe f;
    private final xa.a g;
    private final ea.b h;
    private float i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n = true;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public class a implements ef.a {
        public a() {
        }

        public void a() {
            s9 s9Var = s9.this;
            if (s9Var.j) {
                s9Var.j();
                s9.this.f.b(true);
                s9.this.j = false;
            } else {
                s9Var.d();
                s9.this.f.b(false);
                s9.this.j = true;
            }
        }

        @Override // com.my.target.c0.a
        public void b(float f, float f2) {
            c0 videoPlayer = s9.this.d.getPromoMediaView().getVideoPlayer();
            if (videoPlayer != null) {
                s9.this.c.a(videoPlayer.getVolume());
            }
        }

        @Override // com.my.target.c0.a
        public void c() {
            s9 s9Var = s9.this;
            if (s9Var.m) {
                return;
            }
            s9Var.m = true;
            mi.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing complete");
            s9.this.f.f();
            s9.this.i();
            s9.this.c.c();
            s9.this.a();
            s9.this.d.d();
            s9.this.f.e();
        }

        @Override // com.my.target.c0.a
        public void f() {
        }

        @Override // com.my.target.c0.a
        public void g() {
        }

        @Override // com.my.target.c0.a
        public void h() {
        }

        @Override // com.my.target.c0.a
        public void j() {
            s9.this.f.k();
            s9.this.b();
            mi.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing timeout");
            s9.this.h.b();
        }

        @Override // com.my.target.c0.a
        public void k() {
            s9 s9Var = s9.this;
            if (s9Var.k && s9Var.a.Y() == 0.0f) {
                s9.this.a();
            }
            s9.this.d.a();
        }

        @Override // com.my.target.ef.a
        public void l() {
            s9 s9Var = s9.this;
            s9Var.a(s9Var.d.getView().getContext());
            s9.this.f.i();
            s9.this.d.pause();
        }

        @Override // com.my.target.ef.a
        public void n() {
            s9.this.f.l();
            s9.this.d.resume();
            s9 s9Var = s9.this;
            if (s9Var.j) {
                s9Var.d();
            } else {
                s9Var.j();
            }
        }

        @Override // com.my.target.ef.a
        public void o() {
            s9.this.g();
        }

        @Override // com.my.target.c0.a
        public void p() {
        }

        @Override // com.my.target.ef.a
        public void q() {
            s9 s9Var = s9.this;
            if (!s9Var.j) {
                s9Var.b(s9Var.d.getView().getContext());
            }
            s9.this.g();
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            if (Looper.getMainLooper().isCurrentThread()) {
                s9.this.a(i);
            } else {
                o0.e(new Runnable() { // from class: com.my.target.s9$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        s9.a.this.a(i);
                    }
                });
            }
        }

        @Override // com.my.target.c0.a
        public void a(float f) {
            s9.this.d.b(f <= 0.0f);
        }

        @Override // com.my.target.c0.a
        public void a(float f, float f2) {
            s9.this.d.setTimeChanged(f);
            s9 s9Var = s9.this;
            s9Var.m = false;
            if (!s9Var.l) {
                s9Var.l = true;
            }
            if (s9Var.k && s9Var.a.v0()) {
                double Y = (s9.this.a.Y() - f) + 1.0f;
                if (Y >= 0.0d) {
                    s9.this.g.a(Y);
                }
                if (s9.this.a.Y() <= f) {
                    s9.this.a();
                }
            }
            s9 s9Var2 = s9.this;
            float f3 = s9Var2.i;
            if (f <= f3) {
                s9Var2.a(f, f2);
                if (f == s9.this.i) {
                    c();
                    return;
                }
                return;
            }
            a(f3, f3);
        }

        @Override // com.my.target.c0.a
        public void a(String str) {
            mi.a("InterstitialMediaPresenter$MyMediaViewListener: Video playing error: " + str);
            s9.this.f.j();
            s9 s9Var = s9.this;
            if (s9Var.n) {
                mi.a("InterstitialMediaPresenter$MyMediaViewListener: Try to play video stream from URL");
                s9 s9Var2 = s9.this;
                s9Var2.n = false;
                s9Var2.g();
                return;
            }
            s9Var.b();
            s9.this.h.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            s9.this.a(i);
        }
    }

    private s9(cf cfVar, eb ebVar, ha haVar, xa.a aVar, d0 d0Var, ea.b bVar, wh.c cVar) {
        this.a = ebVar;
        this.g = aVar;
        this.c = d0Var;
        this.h = bVar;
        a aVar2 = new a();
        this.b = aVar2;
        this.d = haVar;
        haVar.setMediaListener(aVar2);
        tj a2 = tj.a(ebVar.H(), cVar);
        this.e = a2;
        a2.a(haVar.getPromoMediaView());
        this.f = cfVar.a(ebVar, cVar);
    }

    public static s9 a(cf cfVar, eb ebVar, ha haVar, xa.a aVar, d0 d0Var, ea.b bVar, wh.c cVar) {
        return new s9(cfVar, ebVar, haVar, aVar, d0Var, bVar, cVar);
    }

    private void c() {
        this.d.a(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a(this.d.getView().getContext());
        this.d.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.d.c(this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        a();
        a(this.d.getView().getContext());
        this.d.a(this.a.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.d.isPlaying()) {
            b(this.d.getView().getContext());
        }
        this.d.a(2);
    }

    public void b() {
        a(this.d.getView().getContext());
        this.d.destroy();
    }

    public void e() {
        this.d.a(true);
        a(this.d.getView().getContext());
        if (this.l) {
            this.f.h();
        }
    }

    public void f() {
        this.d.pause();
        a(this.d.getView().getContext());
        if (!this.d.isPlaying() || this.d.b()) {
            return;
        }
        this.f.i();
    }

    public void h() {
        a(this.d.getView().getContext());
    }

    public void a(eb ebVar, Context context) {
        dj djVar = (dj) ebVar.A0();
        if (djVar != null && djVar.a() == null) {
            this.n = false;
        }
        boolean o0 = ebVar.o0();
        this.k = o0;
        if (o0 && ebVar.Y() == 0.0f && ebVar.v0()) {
            mi.a("InterstitialMediaPresenter: Banner is allowed to close");
            a();
        }
        if (!this.k || (ebVar.Y() > 0.0f && ebVar.v0())) {
            this.g.a(false);
        }
        this.i = ebVar.t();
        boolean u0 = ebVar.u0();
        this.j = u0;
        if (u0) {
            this.d.a(0);
            return;
        }
        if (ebVar.v0()) {
            b(context);
        }
        this.d.a(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this.b, 3, 2);
        }
    }

    public void a(d9 d9Var) {
        a();
        this.d.a(d9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.d.c();
        this.g.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f, float f2) {
        this.e.a(f, f2);
        this.f.a(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == -3) {
            mi.a("InterstitialMediaPresenter: Audiofocus loss can duck, set volume to 0.3");
            if (this.j) {
                return;
            }
            c();
            return;
        }
        if (i == -2 || i == -1) {
            f();
            mi.a("InterstitialMediaPresenter: Audiofocus loss, pausing");
        } else if (i == 1 || i == 2 || i == 4) {
            mi.a("InterstitialMediaPresenter: Audiofocus gain, unmuting");
            if (this.j) {
                return;
            }
            j();
        }
    }
}
