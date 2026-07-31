package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public final class i72 implements ww0, s62 {
    public final j62 a;
    public final g52 b;
    public final yj2 c;
    public final s2 d;
    public final kc2 e;
    public long f;
    public long g;
    public zq2 h;

    public i72(j62 j62Var, g52 g52Var, x63 x63Var) {
        yj2 yj2Var = x63Var.a;
        s2 s2Var = x63Var.b;
        kc2 kc2Var = new kc2();
        this.a = j62Var;
        this.b = g52Var;
        this.c = yj2Var;
        this.d = s2Var;
        this.e = kc2Var;
        this.g = Long.MAX_VALUE;
    }

    @Override // yads.s62
    public final void a() {
        kc2 kc2Var = this.e;
        g72 g72Var = new g72(this);
        jc2 jc2Var = jc2.c;
        if (kc2Var.a) {
            kc2Var.b = jc2Var;
        } else {
            g72Var.mo4828invoke();
        }
    }

    @Override // yads.s62
    public final void b() {
        kc2 kc2Var = this.e;
        f72 f72Var = new f72(this);
        jc2 jc2Var = jc2.c;
        if (kc2Var.a) {
            kc2Var.b = jc2Var;
        } else {
            f72Var.mo4828invoke();
        }
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i72;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i72_invalidate_cbe37990fb348b5a6b8a110e8f15ef26();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i72;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i72_pause_ba270cb598ada73c7fb9675990d01cbf();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i72;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i72_resume_4ba54ec8dcdf3e6204986b2e40801189();
    }

    public void safedk_i72_invalidate_cbe37990fb348b5a6b8a110e8f15ef26() {
        this.a.a.remove(this);
        zq2 zq2Var = this.h;
        if (zq2Var != null) {
            zq2Var.c.a();
        }
        this.h = null;
    }

    public void safedk_i72_pause_ba270cb598ada73c7fb9675990d01cbf() {
        zq2 zq2Var = this.h;
        if (zq2Var != null) {
            zq2Var.c.b();
        } else {
            this.e.a = true;
        }
    }

    public void safedk_i72_resume_4ba54ec8dcdf3e6204986b2e40801189() {
        zq2 zq2Var = this.h;
        if (zq2Var != null) {
            zq2Var.c.d();
            return;
        }
        kc2 kc2Var = this.e;
        h72 h72Var = new h72(this);
        kc2Var.a = false;
        int ordinal = kc2Var.b.ordinal();
        if (ordinal == 1) {
            kc2Var.b = jc2.b;
            h72Var.mo4828invoke();
        } else {
            if (ordinal != 2) {
                return;
            }
            kc2Var.b = jc2.b;
            h72Var.mo4828invoke();
        }
    }

    public void safedk_i72_start_df28a0da9f3b54fb08bf804bcab678af() {
        this.a.a.add(this);
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i72;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i72_start_df28a0da9f3b54fb08bf804bcab678af();
    }

    @Override // yads.s62
    public final void a(long j, long j2) {
        if (this.e.a || this.h != null) {
            return;
        }
        long j3 = j2 + this.c.a;
        long a = this.d.a(j);
        this.f = j3;
        this.g = a;
        if (j3 >= a) {
            this.b.a();
            invalidate();
        } else {
            this.b.a(a, j3);
        }
    }

    public static final void a(i72 i72Var) {
        i72Var.a.a.remove(i72Var);
        if (i72Var.g - i72Var.f <= 1000) {
            i72Var.b.a();
            i72Var.invalidate();
            return;
        }
        zq2 zq2Var = new zq2(i72Var.b, new c72(i72Var), lc2.a(false), new d72(i72Var), new e72(i72Var));
        zq2Var.a();
        i72Var.h = zq2Var;
    }
}
