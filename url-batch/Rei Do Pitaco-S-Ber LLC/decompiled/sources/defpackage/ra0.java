package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class ra0 {
    public final db0 a;
    public io[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public ra0(db0 db0Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = db0Var;
        c(db0Var);
    }

    public final void a() {
        io[] ioVarArr = this.b;
        if (ioVarArr != null) {
            io ioVar = ioVarArr[0];
            io ioVar2 = ioVarArr[1];
            db0 db0Var = this.a;
            if (ioVar2 == null) {
                ioVar2 = db0Var.a.h(2);
            }
            if (ioVar == null) {
                ioVar = db0Var.a.h(1);
            }
            h(io.a(ioVar, ioVar2));
            io ioVar3 = this.b[y80.d(16)];
            if (ioVar3 != null) {
                g(ioVar3);
            }
            io ioVar4 = this.b[y80.d(32)];
            if (ioVar4 != null) {
                e(ioVar4);
            }
            io ioVar5 = this.b[y80.d(64)];
            if (ioVar5 != null) {
                i(ioVar5);
            }
        }
    }

    public abstract db0 b();

    public void c(db0 db0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = db0Var.a.e(i);
            int d = y80.d(i);
            this.c[d] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = db0Var.a.f(i);
                this.d[d] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, io ioVar) {
        if (this.b == null) {
            this.b = new io[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[y80.d(i2)] = ioVar;
            }
        }
    }

    public abstract void f(io ioVar);

    public abstract void h(io ioVar);

    public ra0() {
        this(new db0());
    }

    public void e(io ioVar) {
    }

    public void g(io ioVar) {
    }

    public void i(io ioVar) {
    }
}
