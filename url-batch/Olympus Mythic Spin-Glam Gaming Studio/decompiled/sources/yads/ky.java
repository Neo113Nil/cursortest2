package yads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ky implements tm1, zk0 {
    public final Object a;
    public sm1 b;
    public yk0 c;
    public final /* synthetic */ my d;

    public ky(my myVar, Object obj) {
        this.d = myVar;
        this.b = new sm1(myVar.c.c, 0, null, 0L);
        this.c = new yk0(myVar.d.c, 0, null);
        this.a = obj;
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.b(wf1Var, a(yl1Var));
        }
    }

    @Override // yads.tm1
    public final void b(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.c(wf1Var, a(yl1Var));
        }
    }

    @Override // yads.tm1
    public final void c(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.a(wf1Var, a(yl1Var));
        }
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var, IOException iOException, boolean z) {
        if (a(i, pm1Var)) {
            this.b.a(wf1Var, a(yl1Var), iOException, z);
        }
    }

    @Override // yads.tm1
    public final void b(int i, pm1 pm1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.a(a(yl1Var));
        }
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.b(a(yl1Var));
        }
    }

    public final boolean a(int i, pm1 pm1Var) {
        pm1 pm1Var2;
        if (pm1Var != null) {
            pm1Var2 = this.d.a(this.a, pm1Var);
            if (pm1Var2 == null) {
                return false;
            }
        } else {
            pm1Var2 = null;
        }
        sm1 sm1Var = this.b;
        if (sm1Var.a != i || !sb3.a(sm1Var.b, pm1Var2)) {
            this.b = new sm1(this.d.c.c, i, pm1Var2, 0L);
        }
        yk0 yk0Var = this.c;
        if (yk0Var.a == i && sb3.a(yk0Var.b, pm1Var2)) {
            return true;
        }
        this.c = new yk0(this.d.d.c, i, pm1Var2);
        return true;
    }

    public final yl1 a(yl1 yl1Var) {
        long j = yl1Var.f;
        long j2 = yl1Var.g;
        return (j == j && j2 == j2) ? yl1Var : new yl1(yl1Var.a, yl1Var.b, yl1Var.c, yl1Var.d, yl1Var.e, j, j2);
    }
}
