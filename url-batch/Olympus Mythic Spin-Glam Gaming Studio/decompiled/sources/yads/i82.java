package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public final class i82 implements ww0, e82 {
    public final d82 a;
    public final oc2 b;
    public final yj2 c;
    public final s2 d;
    public g52 e;
    public zq2 f;

    public i82(d82 d82Var, g52 g52Var, x63 x63Var) {
        oc2 a = lc2.a(false);
        yj2 yj2Var = x63Var.a;
        s2 s2Var = x63Var.b;
        this.a = d82Var;
        this.b = a;
        this.c = yj2Var;
        this.d = s2Var;
        this.e = g52Var;
    }

    @Override // yads.e82
    public final void a(boolean z) {
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i82;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i82_invalidate_509d86c0d882ef38c21466f990a4293f();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i82;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i82_pause_97c7e9cc737b41fe46c74b4eab24f4d1();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i82;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i82_resume_2d9c29e4dd19f213e840bdae3b3a6951();
    }

    public void safedk_i82_invalidate_509d86c0d882ef38c21466f990a4293f() {
        zq2 zq2Var = this.f;
        if (zq2Var != null) {
            zq2Var.c.a();
        }
        this.f = null;
        this.a.a.remove(this);
        this.e = null;
    }

    public void safedk_i82_pause_97c7e9cc737b41fe46c74b4eab24f4d1() {
        zq2 zq2Var = this.f;
        if (zq2Var != null) {
            zq2Var.c.b();
        }
    }

    public void safedk_i82_resume_2d9c29e4dd19f213e840bdae3b3a6951() {
        zq2 zq2Var = this.f;
        if (zq2Var != null) {
            zq2Var.c.d();
        }
    }

    public void safedk_i82_start_efccfafa2a1e8e8ba374505f9e47cb8e() {
        this.a.a.add(this);
        g52 g52Var = this.e;
        if (g52Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yj2 yj2Var = this.c;
        s2 s2Var = this.d;
        zq2 zq2Var = new zq2(g52Var, new wq2(s2Var), this.b, new xq2(yj2Var), new h82(this));
        zq2Var.a();
        this.f = zq2Var;
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i82;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i82_start_efccfafa2a1e8e8ba374505f9e47cb8e();
    }

    @Override // yads.e82
    public final void a() {
        g52 g52Var = this.e;
        if (g52Var != null) {
            g52Var.a();
        }
        invalidate();
    }
}
