package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes5.dex */
public final class d62 implements ww0, s62 {
    public final j62 a;
    public final sr2 b;
    public final Long c;
    public final gw d;
    public final uv e;
    public final kc2 f;

    public d62(t8 t8Var, j62 j62Var, sr2 sr2Var, x63 x63Var) {
        Long l = t8Var.j;
        gw gwVar = x63Var.e;
        uv uvVar = x63Var.d;
        kc2 kc2Var = new kc2();
        this.a = j62Var;
        this.b = sr2Var;
        this.c = l;
        this.d = gwVar;
        this.e = uvVar;
        this.f = kc2Var;
    }

    @Override // yads.s62
    public final void a() {
        kc2 kc2Var = this.f;
        b62 b62Var = new b62(this);
        jc2 jc2Var = jc2.c;
        if (kc2Var.a) {
            kc2Var.b = jc2Var;
        } else {
            b62Var.mo4828invoke();
        }
    }

    @Override // yads.s62
    public final void b() {
        if (this.e.a()) {
            kc2 kc2Var = this.f;
            a62 a62Var = new a62(this);
            jc2 jc2Var = jc2.c;
            if (kc2Var.a) {
                kc2Var.b = jc2Var;
            } else {
                a62Var.mo4828invoke();
            }
        }
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/d62;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_d62_invalidate_98ae321bb5b922ef02761f18f20e3cfc();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/d62;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_d62_pause_24f126b253382310cbac93506eb69b87();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/d62;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_d62_resume_8773b471977198acb03aa36e42067ff4();
    }

    public void safedk_d62_invalidate_98ae321bb5b922ef02761f18f20e3cfc() {
        this.a.a.remove(this);
    }

    public void safedk_d62_pause_24f126b253382310cbac93506eb69b87() {
        this.f.a = true;
    }

    public void safedk_d62_resume_8773b471977198acb03aa36e42067ff4() {
        kc2 kc2Var = this.f;
        c62 c62Var = new c62(this);
        kc2Var.a = false;
        int ordinal = kc2Var.b.ordinal();
        if (ordinal == 1) {
            kc2Var.b = jc2.b;
            c62Var.mo4828invoke();
        } else {
            if (ordinal != 2) {
                return;
            }
            kc2Var.b = jc2.b;
            c62Var.mo4828invoke();
        }
    }

    public void safedk_d62_start_98afed78c5ae61265707d3ac18381920() {
        Long l;
        this.a.a.add(this);
        if (!this.e.a() || (l = this.c) == null || this.d.a < l.longValue()) {
            return;
        }
        this.b.a();
        this.a.a.remove(this);
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/d62;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_d62_start_98afed78c5ae61265707d3ac18381920();
    }

    @Override // yads.s62
    public final void a(long j, long j2) {
        if (!this.f.a && this.e.a()) {
            gw gwVar = this.d;
            gwVar.b = j2;
            long j3 = j2 + gwVar.a;
            Long l = this.c;
            if (l == null || j3 < l.longValue()) {
                return;
            }
            this.b.a();
            this.a.a.remove(this);
        }
    }
}
