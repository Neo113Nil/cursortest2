package yads;

import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class e6 implements s3 {
    public final /* synthetic */ f6 a;

    public e6(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // yads.s3
    public final void a() {
        this.a.b();
    }

    @Override // yads.s3
    public final void b() {
        f6 f6Var = this.a;
        int i = f6Var.m - 1;
        if (i == f6Var.d.c && !f6Var.n) {
            f6Var.n = true;
            f6Var.b.b();
        }
        i6 i6Var = (i6) CollectionsKt.getOrNull(this.a.k, i);
        if ((i6Var != null ? i6Var.c : null) != k6.c || i6Var.b == null) {
            this.a.b();
        }
    }
}
