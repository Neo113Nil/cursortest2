package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.my.target.fe;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.oe;
import com.my.target.wh;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public final class n6 implements InstreamAdPlayer.AdPlayerListener {
    tj e;
    fe f;
    InstreamAdPlayer g;
    a h;
    eb i;
    int n;
    float o;
    pj d = null;
    int j = 0;
    int k = 10;
    float l = 1.0f;
    float m = 1.0f;
    final zf a = zf.a(200);
    final oe b = oe.c();
    final Runnable c = new Runnable() { // from class: com.my.target.n6$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            n6.this.a();
        }
    };

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(float f, float f2, eb ebVar);

        void a(eb ebVar);

        void a(String str, eb ebVar);

        void b(eb ebVar);

        void c(eb ebVar);

        void d(eb ebVar);

        void e(eb ebVar);
    }

    private n6() {
    }

    private void c() {
        tj tjVar = this.e;
        if (tjVar != null) {
            tjVar.a();
            this.e = null;
        }
        pj pjVar = this.d;
        if (pjVar != null) {
            pjVar.e();
            this.d = null;
        }
        fe feVar = this.f;
        if (feVar != null) {
            feVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        fe feVar;
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer == null || (feVar = this.f) == null) {
            return;
        }
        feVar.a(instreamAdPlayer.getView(), new fe.b[0]);
        this.f.c();
    }

    public static n6 j() {
        return new n6();
    }

    public void a(InstreamAdPlayer instreamAdPlayer) {
        InstreamAdPlayer instreamAdPlayer2 = this.g;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
        }
        this.g = instreamAdPlayer;
        if (instreamAdPlayer == null) {
            tj tjVar = this.e;
            if (tjVar != null) {
                tjVar.a(null);
            }
            pj pjVar = this.d;
            if (pjVar != null) {
                pjVar.e();
            }
            this.b.a((Context) null);
            return;
        }
        View view = instreamAdPlayer.getView();
        tj tjVar2 = this.e;
        if (tjVar2 != null) {
            tjVar2.a(view);
        }
        pj pjVar2 = this.d;
        if (pjVar2 != null) {
            pjVar2.a(view);
        }
        instreamAdPlayer.setAdPlayerListener(this);
        this.b.a(view.getContext());
        fe feVar = this.f;
        if (feVar != null) {
            feVar.a(instreamAdPlayer.getView());
        }
    }

    public void b(InstreamAdPlayer instreamAdPlayer) {
        dj djVar;
        InstreamAdPlayer instreamAdPlayer2 = this.g;
        if (instreamAdPlayer2 != null) {
            instreamAdPlayer2.setAdPlayerListener(null);
            this.g.stopAdVideo();
        }
        this.g = instreamAdPlayer;
        if (instreamAdPlayer != null) {
            tj tjVar = this.e;
            if (tjVar != null) {
                tjVar.a(instreamAdPlayer.getView());
            }
            pj pjVar = this.d;
            if (pjVar != null) {
                pjVar.a(instreamAdPlayer.getView());
            }
            instreamAdPlayer.setAdPlayerListener(this);
            this.b.a(instreamAdPlayer.getView().getContext());
            fe feVar = this.f;
            if (feVar != null) {
                feVar.a(instreamAdPlayer.getView());
            }
        } else {
            tj tjVar2 = this.e;
            if (tjVar2 != null) {
                tjVar2.a(null);
            }
            pj pjVar2 = this.d;
            if (pjVar2 != null) {
                pjVar2.e();
            }
            this.b.a((Context) null);
        }
        eb ebVar = this.i;
        if (ebVar == null || (djVar = (dj) ebVar.A0()) == null || instreamAdPlayer == null) {
            return;
        }
        Uri parse = Uri.parse(djVar.getUrl());
        instreamAdPlayer.setVolume(this.l);
        instreamAdPlayer.playAdVideo(parse, djVar.getWidth(), djVar.getHeight(), this.o);
    }

    public void d() {
        this.a.close();
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.destroy();
            this.g = null;
        }
        b();
    }

    public Context e() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer == null) {
            return null;
        }
        return instreamAdPlayer.getView().getContext();
    }

    public InstreamAdPlayer f() {
        return this.g;
    }

    public float g() {
        return this.l;
    }

    void h() {
        eb ebVar;
        mi.a("InstreamAdVideoController: Video freeze more then " + this.k + " seconds, stopping");
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        this.a.b(this.c);
        this.b.k();
        a aVar = this.h;
        if (aVar != null && (ebVar = this.i) != null) {
            aVar.a(AndroidInitializeBoldSDK.MSG_TIMEOUT, ebVar);
        }
        b();
    }

    public void k() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.pauseAdVideo();
        }
    }

    public void l() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.resumeAdVideo();
        }
    }

    public void m() {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.stopAdVideo();
        }
        onAdVideoStopped();
    }

    public void n() {
        fe feVar = this.f;
        if (feVar != null) {
            feVar.a(2);
        }
        this.b.g();
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoCompleted() {
        if (a(4)) {
            a();
            this.a.b(this.c);
            pj pjVar = this.d;
            if (pjVar != null) {
                pjVar.e();
            }
            eb ebVar = this.i;
            if (ebVar == null) {
                c();
                return;
            }
            float t = ebVar.t();
            this.b.a(t, t);
            tj tjVar = this.e;
            if (tjVar != null) {
                tjVar.a(t, t);
            }
            b();
            if (this.h != null) {
                this.b.f();
                this.h.b(ebVar);
            }
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoError(String str) {
        a aVar;
        if (a(6)) {
            InstreamAdPlayer instreamAdPlayer = this.g;
            if (instreamAdPlayer != null) {
                instreamAdPlayer.stopAdVideo();
            }
            this.b.j();
            pj pjVar = this.d;
            if (pjVar != null) {
                pjVar.e();
            }
            this.a.b(this.c);
            eb b = b();
            if (b == null || (aVar = this.h) == null) {
                return;
            }
            aVar.a(str, b);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoPaused() {
        a aVar;
        if (a(3)) {
            this.b.i();
            this.a.b(this.c);
            eb ebVar = this.i;
            if (ebVar == null || (aVar = this.h) == null) {
                return;
            }
            aVar.c(ebVar);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoResumed() {
        a aVar;
        if (a(2)) {
            this.b.l();
            this.a.a(this.c);
            eb ebVar = this.i;
            if (ebVar == null || (aVar = this.h) == null) {
                return;
            }
            aVar.a(ebVar);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStarted() {
        if (a(2)) {
            this.a.a(this.c);
            eb ebVar = this.i;
            if (ebVar == null) {
                return;
            }
            a aVar = this.h;
            if (aVar != null) {
                aVar.d(ebVar);
            }
            if (this.g == null) {
                return;
            }
            pj pjVar = this.d;
            if (pjVar != null && !pjVar.c()) {
                this.d.b(this.g.getView());
            }
            float t = ebVar.t();
            a(t, 0.0f, t);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onAdVideoStopped() {
        a aVar;
        if (a(5)) {
            this.b.m();
            pj pjVar = this.d;
            if (pjVar != null) {
                pjVar.e();
            }
            this.a.b(this.c);
            eb b = b();
            if (b == null || (aVar = this.h) == null) {
                return;
            }
            aVar.e(b);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer.AdPlayerListener
    public void onVolumeChanged(float f) {
        this.b.b(this.m, f);
        this.m = f;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public void a(eb ebVar, boolean z) {
        InstreamAdPlayer instreamAdPlayer;
        if (a(1)) {
            this.o = 0.0f;
            this.i = ebVar;
            this.b.a(ebVar);
            this.e = tj.a(ebVar.H(), (wh.c) null);
            fe feVar = this.f;
            if (feVar != null) {
                feVar.a();
            }
            pj pjVar = this.d;
            if (pjVar != null) {
                pjVar.e();
                this.d = null;
            }
            InstreamAdPlayer instreamAdPlayer2 = this.g;
            if (instreamAdPlayer2 != null) {
                View view = instreamAdPlayer2.getView();
                this.e.a(view);
                if (!z) {
                    this.f = fe.a(ebVar, 3, this.i, view.getContext());
                    this.d = pj.a(ebVar.P(), ebVar.H(), (wh.c) null);
                }
            }
            this.b.a(this.f);
            this.b.a(new oe.a() { // from class: com.my.target.n6$$ExternalSyntheticLambda1
                @Override // com.my.target.oe.a
                public final void a() {
                    n6.this.i();
                }
            });
            dj djVar = (dj) ebVar.A0();
            if (djVar == null || (instreamAdPlayer = this.g) == null) {
                return;
            }
            instreamAdPlayer.setVolume(this.l);
            this.g.playAdVideo(Uri.parse(djVar.getUrl()), djVar.getWidth(), djVar.getHeight());
        }
    }

    public void b(int i) {
        this.k = i;
    }

    public void b(float f) {
        InstreamAdPlayer instreamAdPlayer = this.g;
        if (instreamAdPlayer != null) {
            instreamAdPlayer.setVolume(f);
        }
        this.l = f;
    }

    eb b() {
        eb ebVar = this.i;
        this.i = null;
        c();
        return ebVar;
    }

    public void a(eb ebVar) {
        a(ebVar, false);
    }

    void a() {
        float f;
        float f2;
        float f3;
        InstreamAdPlayer instreamAdPlayer;
        eb ebVar = this.i;
        if (ebVar == null) {
            this.a.b(this.c);
            return;
        }
        float t = ebVar.t();
        boolean z = this.j == 2;
        if (!z || (instreamAdPlayer = this.g) == null) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f = instreamAdPlayer.getAdVideoDuration();
            f2 = this.g.getAdVideoPosition();
            f3 = t - f2;
        }
        if (z && this.o != f2 && f > 0.0f) {
            a(f3, f2, t);
        } else {
            this.n++;
        }
        if (this.n >= (this.k * 1000) / 200) {
            h();
        }
    }

    void a(float f, float f2, float f3) {
        eb ebVar;
        this.n = 0;
        this.o = f2;
        if (f2 >= f3) {
            a(f3);
            return;
        }
        this.b.a(f2, f3);
        tj tjVar = this.e;
        if (tjVar != null) {
            tjVar.a(f2, f3);
        }
        a aVar = this.h;
        if (aVar == null || (ebVar = this.i) == null) {
            return;
        }
        aVar.a(f, f3, ebVar);
    }

    void a(float f) {
        if (a(4)) {
            this.b.a(f, f);
            this.o = f;
            this.a.b(this.c);
            tj tjVar = this.e;
            if (tjVar != null) {
                tjVar.a(f, f);
            }
            eb b = b();
            if (b == null) {
                return;
            }
            a aVar = this.h;
            if (aVar != null) {
                aVar.a(0.0f, f, b);
            }
            if (this.h != null) {
                this.b.f();
                this.h.b(b);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0 != 5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r0 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r0 != 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r0 != 3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean a(int i) {
        int i2 = this.j;
        boolean z = false;
        if (i != i2) {
            switch (i) {
                case 1:
                case 6:
                    z = true;
                    break;
                case 2:
                    if (i2 != 1) {
                    }
                    z = true;
                    break;
                case 3:
                    if (i2 != 1) {
                    }
                    z = true;
                    break;
                case 4:
                    if (i2 != 1) {
                        if (i2 != 2) {
                            break;
                        }
                    }
                    z = true;
                    break;
                case 5:
                    if (i2 != 1) {
                        if (i2 != 2) {
                        }
                    }
                    z = true;
                    break;
            }
        }
        if (z) {
            mi.a("InstreamAdVideoController: state has been changed from " + this.j + " to " + i);
            this.j = i;
            return z;
        }
        mi.a("InstreamAdVideoController: wrong state transition from " + this.j + " to " + i);
        return z;
    }
}
