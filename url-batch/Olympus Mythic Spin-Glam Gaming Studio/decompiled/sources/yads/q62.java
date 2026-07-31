package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class q62 implements of3 {
    public final /* synthetic */ r62 a;

    public q62(r62 r62Var) {
        this.a = r62Var;
    }

    @Override // yads.of3
    public final void a(we3 we3Var, float f) {
    }

    @Override // yads.of3
    public final void b(we3 we3Var) {
        pf3 pf3Var = this.a.c;
        pf3Var.getClass();
        fo2 fo2Var = fo2.c;
        io2 a = pf3Var.a.a();
        Map map = a.a;
        pf3Var.b.a(new ho2("video_ad_start", MapsKt.toMutableMap(map), a.b));
        rf3 rf3Var = this.a.e;
        if (rf3Var != null) {
            rf3Var.c();
        }
    }

    @Override // yads.of3
    public final void c(we3 we3Var) {
        pf3 pf3Var = this.a.c;
        pf3Var.getClass();
        fo2 fo2Var = fo2.c;
        io2 a = pf3Var.a.a();
        Map map = a.a;
        pf3Var.b.a(new ho2("video_ad_complete", MapsKt.toMutableMap(map), a.b));
        rf3 rf3Var = this.a.e;
        if (rf3Var != null) {
            rf3Var.b();
        }
    }

    @Override // yads.of3
    public final void d(we3 we3Var) {
    }

    @Override // yads.of3
    public final void f(we3 we3Var) {
    }

    @Override // yads.of3
    public final void g(we3 we3Var) {
    }

    @Override // yads.of3
    public final void h(we3 we3Var) {
        rf3 rf3Var = this.a.e;
        if (rf3Var != null) {
            rf3Var.b();
        }
    }

    @Override // yads.of3
    public final void i(we3 we3Var) {
        this.a.b.h();
    }

    @Override // yads.of3
    public final void j(we3 we3Var) {
        this.a.d.a.d();
    }

    @Override // yads.of3
    public final void k(we3 we3Var) {
    }

    @Override // yads.of3
    public final void a(we3 we3Var, wf3 wf3Var) {
        this.a.a.a(wf3Var);
        rf3 rf3Var = this.a.e;
        if (rf3Var != null) {
            rf3Var.a();
        }
    }

    @Override // yads.of3
    public final void a(we3 we3Var) {
        this.a.b.d();
    }
}
