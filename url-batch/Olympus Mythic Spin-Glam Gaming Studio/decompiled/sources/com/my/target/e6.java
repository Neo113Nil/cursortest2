package com.my.target;

import android.content.Context;
import android.net.Uri;
import com.my.target.instreamads.InstreamAudioAd;
import com.my.target.instreamads.InstreamAudioAdPlayer;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.Stack;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class e6 {
    private InstreamAudioAdPlayer g;
    private b h;
    private eb i;
    private int j;
    private float k;
    private boolean m;
    private float f = 1.0f;
    private int l = 10;
    private int n = 0;
    private final a a = new a();
    private final zf b = zf.a(200);
    private final c c = new c();
    private final Stack d = new Stack();
    private final oe e = oe.c();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class a implements InstreamAudioAdPlayer.AdPlayerListener {
        private float a;

        private a() {
            this.a = 1.0f;
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioCompleted() {
            e6 e6Var = e6.this;
            if (e6Var.n != 2) {
                if (e6Var.i != null && e6Var.h != null) {
                    e6Var.a();
                    e6 e6Var2 = e6.this;
                    eb ebVar = e6Var2.i;
                    e6Var2.i = null;
                    if (ebVar != null) {
                        float t = ebVar.t();
                        e6.this.e.a(t, t);
                        e6.this.e.f();
                        e6.this.h.b(ebVar);
                    }
                }
                e6.this.n = 2;
            }
            e6 e6Var3 = e6.this;
            e6Var3.b.b(e6Var3.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioError(String str) {
            b bVar;
            InstreamAudioAdPlayer instreamAudioAdPlayer = e6.this.g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            e6 e6Var = e6.this;
            eb ebVar = e6Var.i;
            if (ebVar != null && (bVar = e6Var.h) != null) {
                bVar.a(str, ebVar);
            }
            e6.this.e.j();
            e6 e6Var2 = e6.this;
            e6Var2.b.b(e6Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioPaused() {
            Context d = e6.this.d();
            e6 e6Var = e6.this;
            if (e6Var.i != null && d != null) {
                e6Var.e.i();
            }
            e6 e6Var2 = e6.this;
            e6Var2.b.b(e6Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioResumed() {
            Context d = e6.this.d();
            e6 e6Var = e6.this;
            if (e6Var.i != null && d != null) {
                e6Var.e.l();
            }
            e6 e6Var2 = e6.this;
            e6Var2.b.a(e6Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStarted() {
            InstreamAudioAdPlayer instreamAudioAdPlayer;
            e6 e6Var = e6.this;
            e6Var.n = 1;
            if (!e6Var.m && (instreamAudioAdPlayer = e6Var.g) != null) {
                e6Var.b(instreamAudioAdPlayer.getAdAudioDuration());
            }
            e6 e6Var2 = e6.this;
            e6Var2.b.a(e6Var2.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onAdAudioStopped() {
            e6 e6Var = e6.this;
            if (e6Var.n == 1) {
                if (e6Var.i != null && e6Var.h != null) {
                    e6Var.e.m();
                    e6 e6Var2 = e6.this;
                    e6Var2.h.c(e6Var2.i);
                }
                e6.this.n = 0;
            }
            e6 e6Var3 = e6.this;
            e6Var3.b.b(e6Var3.c);
        }

        @Override // com.my.target.instreamads.InstreamAudioAdPlayer.AdPlayerListener
        public void onVolumeChanged(float f) {
            float f2 = this.a;
            if (f == f2) {
                return;
            }
            if (f2 > 0.0f && f <= 0.0f) {
                if (e6.this.d() != null) {
                    e6 e6Var = e6.this;
                    if (e6Var.i != null) {
                        e6Var.e.b(false);
                        this.a = f;
                        e6.this.f = f;
                        return;
                    }
                    return;
                }
                return;
            }
            if (f2 != 0.0f || f <= 0.0f || e6.this.d() == null) {
                return;
            }
            e6 e6Var2 = e6.this;
            if (e6Var2.i != null) {
                e6Var2.e.b(true);
                this.a = f;
                e6.this.f = f;
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a(float f, float f2, eb ebVar);

        void a(eb ebVar);

        void a(String str, eb ebVar);

        void b(eb ebVar);

        void c(eb ebVar);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e6.this.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        eb ebVar;
        b bVar;
        eb ebVar2 = this.i;
        if (ebVar2 != null && (bVar = this.h) != null) {
            bVar.a(ebVar2);
        }
        b bVar2 = this.h;
        if (bVar2 != null && (ebVar = this.i) != null) {
            bVar2.a(0.0f, f, ebVar);
        }
        this.e.a(0.0f, f);
        this.m = true;
    }

    private void g() {
        eb ebVar;
        mi.a("InstreamAdAudioController: Video freeze more then " + this.l + " seconds, stopping");
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
        this.b.b(this.c);
        this.e.k();
        b bVar = this.h;
        if (bVar == null || (ebVar = this.i) == null) {
            return;
        }
        bVar.a(AndroidInitializeBoldSDK.MSG_TIMEOUT, ebVar);
    }

    public static e6 h() {
        return new e6();
    }

    public void a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        InstreamAudioAdPlayer instreamAudioAdPlayer2 = this.g;
        if (instreamAudioAdPlayer2 != null) {
            instreamAudioAdPlayer2.setAdPlayerListener(null);
        }
        this.g = instreamAudioAdPlayer;
        if (instreamAudioAdPlayer == null) {
            this.e.a((Context) null);
        } else {
            instreamAudioAdPlayer.setAdPlayerListener(this.a);
            this.e.a(instreamAudioAdPlayer.getCurrentContext());
        }
    }

    public void c() {
        this.b.close();
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.destroy();
        }
        this.g = null;
    }

    public Context d() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer == null) {
            return null;
        }
        return instreamAudioAdPlayer.getCurrentContext();
    }

    public InstreamAudioAdPlayer e() {
        return this.g;
    }

    public float f() {
        return this.f;
    }

    public void i() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.pauseAdAudio();
        }
    }

    public void j() {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.resumeAdAudio();
        }
    }

    public void k() {
        if (this.n == 1) {
            if (this.i != null && this.h != null) {
                this.e.m();
                this.h.c(this.i);
            }
            this.n = 0;
        }
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.stopAdAudio();
        }
    }

    public void c(float f) {
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
        if (instreamAudioAdPlayer != null) {
            instreamAudioAdPlayer.setVolume(f);
        }
        this.f = f;
    }

    private void b() {
        this.b.b(this.c);
        if (this.n != 2) {
            this.n = 2;
            InstreamAudioAdPlayer instreamAudioAdPlayer = this.g;
            if (instreamAudioAdPlayer != null) {
                instreamAudioAdPlayer.stopAdAudio();
            }
            if (this.i == null || this.h == null) {
                return;
            }
            this.e.f();
            eb ebVar = this.i;
            this.i = null;
            this.h.b(ebVar);
        }
    }

    public void a(b bVar) {
        this.h = bVar;
    }

    public void a(eb ebVar, InstreamAudioAd.InstreamAudioAdBanner instreamAudioAdBanner) {
        Uri parse;
        this.i = ebVar;
        this.e.a(ebVar);
        this.m = false;
        ebVar.H().b(this.d);
        q0 q0Var = (q0) ebVar.A0();
        if (q0Var == null || this.g == null) {
            return;
        }
        String str = (String) q0Var.a();
        if (str != null) {
            parse = Uri.parse(str);
        } else {
            parse = Uri.parse(q0Var.getUrl());
        }
        this.g.setVolume(this.f);
        try {
            this.g.playAdAudio(parse, instreamAudioAdBanner);
        } catch (AbstractMethodError e) {
            if (e.getStackTrace().length == new Exception().getStackTrace().length) {
                this.g.playAdAudio(parse);
            }
        }
    }

    public void a(int i) {
        this.l = i;
    }

    void a() {
        float f;
        float f2;
        float f3;
        InstreamAudioAdPlayer instreamAudioAdPlayer;
        eb ebVar = this.i;
        float t = ebVar != null ? ebVar.t() : 0.0f;
        if (this.i == null) {
            this.b.b(this.c);
            return;
        }
        if (this.n != 1 || (instreamAudioAdPlayer = this.g) == null) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f = instreamAudioAdPlayer.getAdAudioDuration();
            f2 = this.g.getAdAudioPosition();
            f3 = t - f2;
        }
        if (this.n == 1 && this.k != f2 && f > 0.0f) {
            a(f3, f2, t);
        } else {
            this.j++;
        }
        if (this.j >= (this.l * 1000) / 200) {
            g();
        }
    }

    private void a(float f, float f2, float f3) {
        eb ebVar;
        this.j = 0;
        this.k = f2;
        if (f2 < f3) {
            this.e.a(f2, f3);
            b bVar = this.h;
            if (bVar == null || (ebVar = this.i) == null) {
                return;
            }
            bVar.a(f, f3, ebVar);
            return;
        }
        a(f3);
    }

    private void a(float f) {
        eb ebVar;
        this.e.a(f, f);
        b bVar = this.h;
        if (bVar != null && (ebVar = this.i) != null) {
            bVar.a(0.0f, f, ebVar);
        }
        b();
    }
}
