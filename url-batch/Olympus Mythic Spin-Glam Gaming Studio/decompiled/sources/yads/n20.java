package yads;

import android.view.View;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class n20 implements vj3 {
    public final d20 a;
    public final tj3 b;
    public final wh3 c;
    public final ph3 d;
    public boolean e;

    public n20(d20 d20Var, tj3 tj3Var, wh3 wh3Var) {
        ph3 ph3Var = new ph3(new e20());
        this.a = d20Var;
        this.b = tj3Var;
        this.c = wh3Var;
        this.d = ph3Var;
    }

    @Override // yads.vj3
    public final /* bridge */ void a(float f) {
    }

    @Override // yads.vj3
    public final /* bridge */ void a(View view, List list) {
    }

    @Override // yads.vj3
    public final /* bridge */ void a(wf3 wf3Var) {
    }

    @Override // yads.vj3
    public final void b() {
        this.b.a(this.a, "complete");
    }

    @Override // yads.vj3
    public final void c() {
        this.b.a(this.a, "resume");
    }

    @Override // yads.vj3
    public final void d() {
        this.b.a(this.a, "pause");
    }

    @Override // yads.vj3
    public final /* bridge */ void f() {
    }

    @Override // yads.vj3
    public final /* bridge */ void g() {
    }

    @Override // yads.vj3
    public final void h() {
        this.b.a(this.a, "creativeView");
    }

    @Override // yads.vj3
    public final void i() {
        this.b.a(new i20(this.a), "creativeRenderingStart");
    }

    @Override // yads.vj3
    public final /* bridge */ void j() {
    }

    @Override // yads.vj3
    public final void k() {
        this.e = false;
    }

    @Override // yads.vj3
    public final void l() {
        this.b.a(this.a, "mute");
    }

    @Override // yads.vj3
    public final void m() {
        if (!this.e) {
            this.e = true;
            this.b.a(this.a, "start");
        }
        this.b.a(this.a, "clickTracking");
    }

    @Override // yads.vj3
    public final /* bridge */ void n() {
    }

    @Override // yads.vj3
    public final void a(uj3 uj3Var) {
        String str;
        int ordinal = uj3Var.ordinal();
        if (ordinal == 0) {
            str = "firstQuartile";
        } else if (ordinal == 1) {
            str = "midpoint";
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "thirdQuartile";
        }
        this.b.a(this.a, str);
    }

    @Override // yads.vj3
    public final void a() {
        this.b.a(this.a, "unmute");
    }

    @Override // yads.vj3
    public final void a(long j, float f) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.a(this.a, "start");
    }
}
