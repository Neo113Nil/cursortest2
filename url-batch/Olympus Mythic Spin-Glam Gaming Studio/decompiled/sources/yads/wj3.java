package yads;

import android.view.View;
import java.util.List;

/* loaded from: classes9.dex */
public final class wj3 implements vj3 {
    public final py a;
    public boolean b;
    public boolean c;

    public wj3(py pyVar) {
        this.a = pyVar;
    }

    @Override // yads.vj3
    public final void a(uj3 uj3Var) {
        this.a.a(uj3Var);
    }

    @Override // yads.vj3
    public final void b() {
        this.a.b();
        k();
    }

    @Override // yads.vj3
    public final void c() {
        this.a.c();
    }

    @Override // yads.vj3
    public final void d() {
        this.a.d();
    }

    @Override // yads.vj3
    public final void f() {
        this.a.f();
    }

    @Override // yads.vj3
    public final void g() {
        this.a.g();
        k();
    }

    @Override // yads.vj3
    public final void h() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.h();
    }

    @Override // yads.vj3
    public final void i() {
        this.a.i();
    }

    @Override // yads.vj3
    public final void j() {
        this.a.j();
    }

    @Override // yads.vj3
    public final void k() {
        this.a.k();
        this.b = false;
        this.c = false;
    }

    @Override // yads.vj3
    public final void l() {
        this.a.l();
    }

    @Override // yads.vj3
    public final void m() {
        this.a.m();
        h();
        n();
    }

    @Override // yads.vj3
    public final void n() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.n();
    }

    @Override // yads.vj3
    public final void a(long j, float f) {
        this.a.a(j, f);
    }

    @Override // yads.vj3
    public final void a() {
        this.a.a();
    }

    @Override // yads.vj3
    public final void a(float f) {
        this.a.a(f);
    }

    @Override // yads.vj3
    public final void a(View view, List list) {
        this.a.a(view, list);
        this.b = false;
        this.c = false;
    }

    @Override // yads.vj3
    public final void a(wf3 wf3Var) {
        this.a.a(wf3Var);
        k();
    }
}
