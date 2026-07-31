package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.my.target.c0;
import com.my.target.e0;
import com.my.target.g;
import com.my.target.ka;
import com.my.target.va;
import com.my.target.wh;
import com.my.target.x1;
import com.my.target.xa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class aa implements z9, va.a, x1.b, ka.a, AudioManager.OnAudioFocusChangeListener, c0.a, e0.a {
    private final d9 a;
    private final xa.a b;
    private final va c;
    private final Handler d;
    private final Runnable e;
    private l8 h;
    private final d0 i;
    private oe j;
    private c0 k;
    private e0 l;
    private eb m;
    private bj n;
    private tj o;
    private boolean q;
    private float r;
    private long s;
    private long t;
    private List u;
    private final boolean w;
    private int g = 0;
    private final ArrayList p = new ArrayList();
    private boolean v = true;
    private final Runnable f = new Runnable() { // from class: com.my.target.aa$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            aa.this.t();
        }
    };

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public class a implements r9 {
        public a() {
        }

        @Override // com.my.target.r9
        public void a() {
            aa aaVar = aa.this;
            if (aaVar.l == null) {
                return;
            }
            aaVar.i.c();
        }

        @Override // com.my.target.r9
        public void b() {
            aa.this.c.b();
            aa aaVar = aa.this;
            aaVar.d.removeCallbacks(aaVar.e);
            aa aaVar2 = aa.this;
            aaVar2.g = 0;
            aaVar2.b.a(true);
            mi.a("InterstitialPresenterS4.InterstitialMediaPresenterS4Impl: Error video playing");
        }

        @Override // com.my.target.r9
        public void c() {
            aa.this.B();
            aa.this.z();
        }

        @Override // com.my.target.r9
        public void d() {
            aa.this.A();
        }
    }

    private aa(n9 n9Var, d9 d9Var, xa.a aVar, d0 d0Var, wh.c cVar) {
        this.i = d0Var;
        this.a = d9Var;
        this.b = aVar;
        this.w = d9Var.k0();
        this.d = n9Var.e();
        if (!d9Var.g0().isEmpty() && d9Var.W()) {
            va a2 = n9Var.a(d9Var, this, null, this, this);
            this.c = a2;
            this.u = new ArrayList();
            ka kaVar = (ka) a2;
            int i = 0;
            while (i < d9Var.g0().size()) {
                this.u.add(new ng((k8) d9Var.g0().get(i), i == 0));
                i++;
            }
            List list = this.u;
            kaVar.a(list, (ng) list.get(0));
        } else if (!d9Var.g0().isEmpty()) {
            this.c = n9Var.a(d9Var, this, null, this, null);
        } else if (d9Var.j0() != null) {
            this.m = d9Var.j0();
            va a3 = n9Var.a(d9Var, this, new a(), null, null);
            this.c = a3;
            if (a3 instanceof ta) {
                ta taVar = (ta) a3;
                e0 videoView = taVar.getVideoView();
                this.l = videoView;
                videoView.setAdVideoViewListener(this);
                this.o = tj.a(this.m.H(), cVar);
                this.j = n9Var.a(this.m, cVar);
                this.o.a(this.l);
                this.r = this.m.t();
                c0 videoPlayer = taVar.getVideoPlayer();
                this.k = videoPlayer;
                videoPlayer.a(this);
                bj videoContent = taVar.getVideoContent();
                this.n = videoContent;
                videoContent.setDuration(this.m.t());
            }
            if (this.m.u0()) {
                this.k.setVolume(0.0f);
            } else {
                this.k.setVolume(1.0f);
            }
        } else {
            this.c = n9Var.a(d9Var, this, null, null, null);
        }
        this.c.setBanner(this.a);
        this.e = new Runnable() { // from class: com.my.target.aa$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                aa.this.u();
            }
        };
        a(this.a);
        aVar.a(this.a, this.c.a());
        b(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        c0 c0Var = this.k;
        if (c0Var != null) {
            c0Var.a();
            oe oeVar = this.j;
            if (oeVar != null) {
                oeVar.b(!this.k.c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        c0 c0Var = this.k;
        if (c0Var == null) {
            return;
        }
        if (c0Var.isPlaying()) {
            v();
            oe oeVar = this.j;
            if (oeVar != null) {
                oeVar.i();
                return;
            }
            return;
        }
        if (this.k.getPosition() <= 0) {
            w();
            return;
        }
        resume();
        oe oeVar2 = this.j;
        if (oeVar2 != null) {
            oeVar2.l();
        }
    }

    public static aa a(n9 n9Var, d9 d9Var, xa.a aVar, d0 d0Var, wh.c cVar) {
        return new aa(n9Var, d9Var, aVar, d0Var, cVar);
    }

    private void m() {
        this.c.b();
        this.d.removeCallbacks(this.e);
        this.b.a(0.0d);
        this.g = 0;
        this.b.e();
        this.b.a(true);
    }

    private boolean s() {
        int i = this.g;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            this.s -= 200;
        }
        return this.s <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.q) {
            z();
            bj bjVar = this.n;
            if (bjVar != null) {
                bjVar.a();
            }
            this.q = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (s()) {
            m();
        } else {
            y();
        }
    }

    private void v() {
        e0 e0Var;
        if (this.k == null || (e0Var = this.l) == null) {
            return;
        }
        a(e0Var.getContext());
        this.k.pause();
    }

    private void w() {
        eb ebVar = this.m;
        if (ebVar == null || this.j == null || this.k == null || this.l == null) {
            return;
        }
        dj djVar = (dj) ebVar.A0();
        this.j.e();
        if (djVar != null) {
            if (!this.k.c()) {
                b(this.l.getContext());
            }
            this.k.a(this);
            this.k.a(this.l);
            a(djVar);
        }
    }

    private void y() {
        this.d.removeCallbacks(this.e);
        this.d.postDelayed(this.e, 200L);
        this.b.a(this.s / 1000.0d);
        this.c.setRemainingAllowCloseDelay((int) ((this.s / 1000) + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        this.q = false;
        this.d.removeCallbacks(this.f);
    }

    @Override // com.my.target.c0.a
    public void b(float f, float f2) {
    }

    @Override // com.my.target.va.a
    public void d() {
        z();
        String e0 = this.a.e0();
        if (e0 == null) {
            return;
        }
        a7.a(e0, this.c.a().getContext());
    }

    @Override // com.my.target.z9
    public void destroy() {
        v();
        tj tjVar = this.o;
        if (tjVar != null) {
            tjVar.a();
        }
        z();
        c0 c0Var = this.k;
        if (c0Var == null) {
            return;
        }
        c0Var.destroy();
    }

    @Override // com.my.target.va.a
    public void e() {
        oe oeVar = this.j;
        if (oeVar != null) {
            oeVar.h();
        }
        destroy();
        z();
        this.b.a(this.a);
    }

    @Override // com.my.target.c0.a
    public void f() {
        bj bjVar = this.n;
        if (bjVar == null) {
            return;
        }
        bjVar.d();
    }

    @Override // com.my.target.c0.a
    public void g() {
        bj bjVar = this.n;
        if (bjVar == null) {
            return;
        }
        bjVar.e();
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return this.c.getCloseButton();
    }

    @Override // com.my.target.c0.a
    public void h() {
        bj bjVar = this.n;
        if (bjVar == null) {
            return;
        }
        bjVar.g();
    }

    @Override // com.my.target.z9
    public View i() {
        return this.c.a();
    }

    @Override // com.my.target.c0.a
    public void j() {
        mi.a("InterstitialPresenterS4: Video playing timeout");
        oe oeVar = this.j;
        if (oeVar != null) {
            oeVar.k();
        }
        bj bjVar = this.n;
        if (bjVar == null || this.k == null) {
            return;
        }
        bjVar.c();
        this.k.stop();
        this.k.destroy();
    }

    @Override // com.my.target.c0.a
    public void k() {
        bj bjVar = this.n;
        if (bjVar == null) {
            return;
        }
        bjVar.h();
    }

    @Override // com.my.target.c0.a
    public void p() {
    }

    @Override // com.my.target.z9
    public void pause() {
        v();
        this.d.removeCallbacks(this.e);
        z();
    }

    @Override // com.my.target.e0.a
    public void r() {
        if (!ib.a(this.k)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        e0 e0Var = this.l;
        if (e0Var != null) {
            e0Var.setViewMode(1);
            this.k.a(this.l);
        }
        eb ebVar = this.m;
        if (ebVar != null) {
            dj djVar = (dj) ebVar.A0();
            if (!this.k.isPlaying() || djVar == null) {
                return;
            }
            if (djVar.a() != null) {
                this.v = true;
            }
            a(djVar);
        }
    }

    @Override // com.my.target.z9
    public void resume() {
        if (this.g != 0 && this.s > 0) {
            y();
        }
        z();
        c0 c0Var = this.k;
        if (c0Var == null || this.l == null) {
            return;
        }
        c0Var.resume();
        if (this.k.c()) {
            a(this.l.getContext());
        } else if (this.k.isPlaying()) {
            b(this.l.getContext());
        }
    }

    @Override // com.my.target.z9
    public void stop() {
        v();
        z();
    }

    public void x() {
        eb ebVar = this.m;
        if (ebVar == null || this.n == null) {
            return;
        }
        if (!ebVar.v0()) {
            this.n.f();
        } else {
            this.n.e();
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(int i) {
        if (i == -2 || i == -1) {
            v();
            mi.a("InterstitialPresenterS4: Audiofocus loss, pausing");
        }
    }

    @Override // com.my.target.c0.a
    public void a(float f) {
        bj bjVar = this.n;
        if (bjVar == null) {
            return;
        }
        bjVar.a(f);
    }

    @Override // com.my.target.c0.a
    public void c() {
        oe oeVar = this.j;
        if (oeVar != null) {
            oeVar.f();
        }
        bj bjVar = this.n;
        if (bjVar == null || this.k == null) {
            return;
        }
        bjVar.b();
        this.k.stop();
        this.s = 0L;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i) {
        if (Looper.getMainLooper().isCurrentThread()) {
            c(i);
        } else {
            o0.e(new Runnable() { // from class: com.my.target.aa$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    aa.this.c(i);
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

    @Override // com.my.target.c0.a
    public void a(float f, float f2) {
        bj bjVar = this.n;
        if (bjVar == null || this.k == null) {
            return;
        }
        float f3 = this.r;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != 0.0f) {
            if (this.g == 2) {
                this.s = (long) (this.t - (1000.0f * f));
            }
            bjVar.getVideoControlView().getProgressView().setTimeChanged(f);
            oe oeVar = this.j;
            if (oeVar != null) {
                oeVar.a(f, f2);
            }
            tj tjVar = this.o;
            if (tjVar != null) {
                tjVar.a(f, f2);
            }
            this.i.a(this.k.getVolume());
        }
        if (f == f2) {
            if (this.k.isPlaying()) {
                c();
            }
            this.k.stop();
        }
    }

    @Override // com.my.target.va.a
    public void b() {
        this.c.setBanner(this.a);
    }

    private void b(d9 d9Var) {
        eb j0 = d9Var.j0();
        boolean z = false;
        if (j0 != null && j0.v0()) {
            if (j0.o0()) {
                long min = (long) (Math.min(j0.Y(), this.r) * 1000.0f);
                this.t = min;
                this.s = min;
                if (min > 0) {
                    this.g = 2;
                    y();
                } else {
                    m();
                    z = true;
                }
            } else {
                this.g = 0;
                this.c.c();
            }
        } else if (d9Var.b0()) {
            long X = (long) (d9Var.X() * 1000.0f);
            this.t = X;
            this.s = X;
            if (X > 0) {
                mi.a("InterstitialPresenterS4: Banner will be allowed to close in " + this.s + " millis");
                this.g = 1;
                y();
            } else {
                mi.a("InterstitialPresenterS4: Banner is allowed to close");
                m();
                z = true;
            }
        } else {
            this.g = 0;
            this.c.c();
        }
        this.b.a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(d9 d9Var) {
        this.b.b(d9Var);
    }

    @Override // com.my.target.c0.a
    public void a(String str) {
        dj djVar;
        if (this.n == null || this.k == null || this.l == null) {
            return;
        }
        mi.a("InterstitialPresenterS4: Video playing error - " + str);
        oe oeVar = this.j;
        if (oeVar != null) {
            oeVar.j();
        }
        if (this.v) {
            mi.a("InterstitialPresenterS4: Try to play video stream from URL");
            this.v = false;
            eb ebVar = this.m;
            if (ebVar != null && (djVar = (dj) ebVar.A0()) != null) {
                this.k.a(Uri.parse(djVar.getUrl()), this.l.getContext());
                return;
            }
        }
        this.n.c();
        this.k.stop();
        this.k.destroy();
    }

    @Override // com.my.target.va.a
    public void a(int i, n2 n2Var) {
        this.b.a(this.a, null, i, s2.a(n2Var), i().getContext());
        if (this.w) {
            e();
        }
    }

    @Override // com.my.target.va.a
    public void a() {
        e a2 = this.a.a();
        if (a2 == null) {
            return;
        }
        Context context = this.c.a().getContext();
        l8 l8Var = this.h;
        if (l8Var == null) {
            a7.a(a2.c(), context);
        } else {
            l8Var.c();
        }
    }

    @Override // com.my.target.x1.b
    public void a(k8 k8Var, int i, n2 n2Var, View view) {
        this.b.a(k8Var, null, i, s2.a(n2Var), view.getContext());
        if (this.w) {
            e();
        }
    }

    @Override // com.my.target.x1.b
    public void a(List list, x1 x1Var) {
        String e = qi.e(x1Var.getContext());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k8 k8Var = (k8) it.next();
            if (!this.p.contains(k8Var)) {
                this.p.add(k8Var);
                th H = k8Var.H();
                if (e != null) {
                    wh.a(H, e, 1);
                }
                wh.a(H, "show", 1);
            }
        }
    }

    private void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    private void a(dj djVar) {
        if (this.k == null || this.l == null) {
            return;
        }
        String str = (String) djVar.a();
        if (str != null) {
            this.v = true;
            this.k.a(Uri.parse(str), this.l.getContext());
        } else {
            this.v = false;
            this.k.a(Uri.parse(djVar.getUrl()), this.l.getContext());
        }
    }

    @Override // com.my.target.ka.a
    public void a(ng ngVar) {
        List<ng> list = this.u;
        if (list == null) {
            return;
        }
        for (ng ngVar2 : list) {
            if (ngVar.b().equals(ngVar2.b()) && ngVar2.c()) {
                a(ngVar.a(), 1, q2.a(), this.c.a());
                if (this.w) {
                    e();
                    return;
                }
                return;
            }
        }
        for (ng ngVar3 : this.u) {
            ngVar3.a(ngVar.b().equals(ngVar3.b()));
        }
        va vaVar = this.c;
        if (vaVar instanceof ka) {
            ((ka) vaVar).a(this.u, ngVar);
        }
    }

    private void a(final d9 d9Var) {
        e a2 = d9Var.a();
        if (a2 == null || a2.b() == null) {
            return;
        }
        m8 m8Var = new m8(a2, this.a.b(), this.c.a().getContext());
        this.h = m8Var;
        m8Var.a(new g.a() { // from class: com.my.target.aa$$ExternalSyntheticLambda0
            @Override // com.my.target.g.a
            public final void b() {
                aa.this.c(d9Var);
            }
        });
    }
}
