package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;

/* loaded from: classes5.dex */
public final class zs1 implements xo0 {
    public final xo0 a;
    public final x73 b;

    public zs1(xo0 xo0Var, x73 x73Var) {
        this.a = xo0Var;
        this.b = x73Var;
    }

    @Override // yads.xo0
    public final jw0 a(int i) {
        return this.a.a(i);
    }

    @Override // yads.xo0
    public final int b(int i) {
        return this.a.b(i);
    }

    @Override // yads.xo0
    public final x73 c() {
        return this.b;
    }

    @Override // yads.xo0
    public final jw0 d() {
        return this.a.d();
    }

    @Override // yads.xo0
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs1)) {
            return false;
        }
        zs1 zs1Var = (zs1) obj;
        return this.a.equals(zs1Var.a) && this.b.equals(zs1Var.b);
    }

    @Override // yads.xo0
    public final int f() {
        return this.a.f();
    }

    @Override // yads.xo0
    public final int g() {
        return this.a.g();
    }

    @Override // yads.xo0
    public final Object h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.xo0
    public final void i() {
        this.a.i();
    }

    @Override // yads.xo0
    public final void j() {
        this.a.j();
    }

    @Override // yads.xo0
    public final int a(jw0 jw0Var) {
        return this.a.a(jw0Var);
    }

    @Override // yads.xo0
    public final void b() {
        this.a.b();
    }

    @Override // yads.xo0
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // yads.xo0
    public final void a() {
        this.a.a();
    }

    @Override // yads.xo0
    public final boolean b(int i, long j) {
        return this.a.b(i, j);
    }

    @Override // yads.xo0
    public final void a(float f) {
        this.a.a(f);
    }

    @Override // yads.xo0
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // yads.xo0
    public final void a(long j, long j2, long j3, List list, sj1[] sj1VarArr) {
        this.a.a(j, j2, j3, list, sj1VarArr);
    }

    @Override // yads.xo0
    public final int a(long j, List list) {
        return this.a.a(j, list);
    }

    @Override // yads.xo0
    public final boolean a(long j, au auVar, List list) {
        return this.a.a(j, auVar, list);
    }

    @Override // yads.xo0
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }
}
