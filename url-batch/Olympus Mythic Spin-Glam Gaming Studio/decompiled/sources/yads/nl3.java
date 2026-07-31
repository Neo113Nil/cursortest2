package yads;

import android.os.SystemClock;
import kotlin.Unit;

/* loaded from: classes8.dex */
public final class nl3 implements cg3, eg3 {
    public final we3 a;
    public final tg3 b;
    public final wj3 c;
    public final of3 d;
    public final dk3 e;
    public Long f;
    public boolean g;
    public boolean h;

    public nl3(we3 we3Var, bk3 bk3Var, tg3 tg3Var, wj3 wj3Var, of3 of3Var) {
        dk3 dk3Var = new dk3(bk3Var);
        this.a = we3Var;
        this.b = tg3Var;
        this.c = wj3Var;
        this.d = of3Var;
        this.e = dk3Var;
    }

    @Override // yads.eg3
    public final void a() {
        this.f = null;
    }

    @Override // yads.eg3
    public final void b() {
        this.f = null;
    }

    @Override // yads.cg3
    public final void a(long j, long j2) {
        if (this.h) {
            return;
        }
        Unit unit = null;
        if (!this.e.a() || this.b.a() != rg3.e) {
            this.f = null;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.f;
        if (l != null) {
            if (elapsedRealtime - l.longValue() >= 2000) {
                this.h = true;
                this.d.i(this.a);
                this.c.n();
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f = Long.valueOf(elapsedRealtime);
            if (this.g) {
                return;
            }
            this.g = true;
            this.d.a(this.a);
        }
    }
}
