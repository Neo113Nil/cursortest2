package yads;

import java.io.IOException;

/* loaded from: classes13.dex */
public final class vm1 implements tm1, zk0 {
    public final xm1 a;
    public sm1 b;
    public yk0 c;
    public final /* synthetic */ ym1 d;

    public vm1(ym1 ym1Var, xm1 xm1Var) {
        this.d = ym1Var;
        this.b = ym1Var.f;
        this.c = ym1Var.g;
        this.a = xm1Var;
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.b(wf1Var, yl1Var);
        }
    }

    @Override // yads.tm1
    public final void b(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.c(wf1Var, yl1Var);
        }
    }

    @Override // yads.tm1
    public final void c(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.a(wf1Var, yl1Var);
        }
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, wf1 wf1Var, yl1 yl1Var, IOException iOException, boolean z) {
        if (a(i, pm1Var)) {
            this.b.a(wf1Var, yl1Var, iOException, z);
        }
    }

    @Override // yads.tm1
    public final void b(int i, pm1 pm1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.a(yl1Var);
        }
    }

    @Override // yads.tm1
    public final void a(int i, pm1 pm1Var, yl1 yl1Var) {
        if (a(i, pm1Var)) {
            this.b.b(yl1Var);
        }
    }

    public final boolean a(int i, pm1 pm1Var) {
        pm1 pm1Var2 = null;
        if (pm1Var != null) {
            xm1 xm1Var = this.a;
            int i2 = 0;
            while (true) {
                if (i2 >= xm1Var.c.size()) {
                    break;
                }
                if (((pm1) xm1Var.c.get(i2)).d == pm1Var.d) {
                    pm1Var2 = pm1Var.a(e.a(xm1Var.b, pm1Var.a));
                    break;
                }
                i2++;
            }
            if (pm1Var2 == null) {
                return false;
            }
        }
        int i3 = i + this.a.d;
        sm1 sm1Var = this.b;
        if (sm1Var.a != i3 || !sb3.a(sm1Var.b, pm1Var2)) {
            this.b = new sm1(this.d.f.c, i3, pm1Var2, 0L);
        }
        yk0 yk0Var = this.c;
        if (yk0Var.a == i3 && sb3.a(yk0Var.b, pm1Var2)) {
            return true;
        }
        this.c = new yk0(this.d.g.c, i3, pm1Var2);
        return true;
    }
}
