package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import com.my.target.c0;
import com.my.target.e0;
import com.my.target.wh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class da implements t9, AudioManager.OnAudioFocusChangeListener, c0.a, e0.a {
    private final a a;
    private final eb b;
    private final c0 c;
    private final tj d;
    private final d0 e;
    private final oe f;
    private final float g;
    private final e0 h;
    private boolean i;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(float f, float f2);

        void b();

        void c();

        void f();

        void g();

        void h();

        void j();

        void l();

        void onVolumeChanged(float f);
    }

    private da(eb ebVar, e0 e0Var, a aVar, d0 d0Var, df dfVar, c0 c0Var, wh.c cVar) {
        this.a = aVar;
        this.h = e0Var;
        this.c = c0Var;
        this.e = d0Var;
        e0Var.setAdVideoViewListener(this);
        this.b = ebVar;
        tj a2 = tj.a(ebVar.H(), cVar);
        this.d = a2;
        this.f = dfVar.a(ebVar, cVar);
        a2.a(e0Var);
        this.g = ebVar.t();
        c0Var.a(this);
        if (ebVar.u0()) {
            c0Var.setVolume(0.0f);
        } else {
            c0Var.setVolume(1.0f);
        }
    }

    public static da a(eb ebVar, e0 e0Var, a aVar, d0 d0Var, df dfVar, c0 c0Var, wh.c cVar) {
        return new da(ebVar, e0Var, aVar, d0Var, dfVar, c0Var, cVar);
    }

    @Override // com.my.target.t9
    public void b() {
        a(this.h.getContext());
        this.c.pause();
    }

    @Override // com.my.target.c0.a
    public void b(float f, float f2) {
    }

    @Override // com.my.target.c0.a
    public void c() {
        this.f.f();
        this.a.c();
        this.c.stop();
    }

    @Override // com.my.target.t9
    public void d() {
        if (this.c.isPlaying()) {
            b();
            this.f.i();
        } else if (this.c.getPosition() <= 0) {
            m();
        } else {
            resume();
            this.f.l();
        }
    }

    @Override // com.my.target.t9
    public void destroy() {
        b();
        this.c.destroy();
        this.d.a();
    }

    @Override // com.my.target.t9
    public void e() {
        if (!this.b.v0()) {
            this.a.l();
        } else {
            this.a.g();
            m();
        }
    }

    @Override // com.my.target.c0.a
    public void f() {
        this.a.f();
    }

    @Override // com.my.target.c0.a
    public void g() {
        this.a.g();
    }

    @Override // com.my.target.c0.a
    public void h() {
        this.a.h();
    }

    @Override // com.my.target.t9
    public void i() {
        this.f.h();
        destroy();
    }

    @Override // com.my.target.c0.a
    public void j() {
        mi.a("InterstitialPromoMediaPresenterS2: Video playing timeout");
        this.f.k();
        this.a.b();
        this.c.stop();
        this.c.destroy();
    }

    @Override // com.my.target.c0.a
    public void k() {
        this.a.j();
    }

    public void m() {
        dj djVar = (dj) this.b.A0();
        this.f.e();
        if (djVar != null) {
            if (!this.c.c()) {
                b(this.h.getContext());
            }
            this.c.a(this);
            this.c.a(this.h);
            a(djVar);
        }
    }

    @Override // com.my.target.c0.a
    public void p() {
    }

    @Override // com.my.target.e0.a
    public void r() {
        if (!ib.a(this.c)) {
            a("Playback within no hardware accelerated view is available only with ExoPlayer");
            return;
        }
        this.h.setViewMode(1);
        this.c.a(this.h);
        dj djVar = (dj) this.b.A0();
        if (!this.c.isPlaying() || djVar == null) {
            return;
        }
        if (djVar.a() != null) {
            this.i = true;
        }
        a(djVar);
    }

    @Override // com.my.target.t9
    public void resume() {
        this.c.resume();
        if (this.c.c()) {
            a(this.h.getContext());
        } else if (this.c.isPlaying()) {
            b(this.h.getContext());
        }
    }

    @Override // com.my.target.t9
    public void a() {
        this.c.a();
        this.f.b(!this.c.c());
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i) {
        if (Looper.getMainLooper().isCurrentThread()) {
            b(i);
        } else {
            o0.e(new Runnable() { // from class: com.my.target.da$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    da.this.b(i);
                }
            });
        }
    }

    @Override // com.my.target.c0.a
    public void a(float f) {
        this.a.onVolumeChanged(f);
    }

    private void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(this, 3, 2);
        }
    }

    @Override // com.my.target.c0.a
    public void a(float f, float f2) {
        float f3 = this.g;
        if (f > f3) {
            a(f2, f3);
            return;
        }
        if (f != 0.0f) {
            this.a.a(f, f2);
            this.f.a(f, f2);
            this.d.a(f, f2);
            this.e.a(this.c.getVolume());
        }
        if (f == f2) {
            if (this.c.isPlaying()) {
                c();
            }
            this.c.stop();
        }
    }

    @Override // com.my.target.c0.a
    public void a(String str) {
        mi.a("InterstitialPromoMediaPresenterS2: Video playing error - " + str);
        this.f.j();
        if (this.i) {
            mi.a("InterstitialPromoMediaPresenterS2: Try to play video stream from URL");
            this.i = false;
            dj djVar = (dj) this.b.A0();
            if (djVar != null) {
                this.c.a(Uri.parse(djVar.getUrl()), this.h.getContext());
                return;
            }
        }
        this.a.b();
        this.c.stop();
        this.c.destroy();
    }

    private void a(dj djVar) {
        String str = (String) djVar.a();
        this.h.a(djVar.getWidth(), djVar.getHeight());
        if (str != null) {
            this.i = true;
            this.c.a(Uri.parse(str), this.h.getContext());
        } else {
            this.i = false;
            this.c.a(Uri.parse(djVar.getUrl()), this.h.getContext());
        }
    }

    private void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(int i) {
        if (i == -2 || i == -1) {
            b();
            mi.a("InterstitialPromoMediaPresenterS2: Audiofocus loss, pausing");
        }
    }
}
