package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class r11 {
    public final d21 a;
    public oy[] b;

    public r11() {
        this(new d21());
    }

    public final void a() {
        oy[] oyVarArr = this.b;
        if (oyVarArr != null) {
            oy oyVar = oyVarArr[0];
            oy oyVar2 = oyVarArr[1];
            d21 d21Var = this.a;
            if (oyVar2 == null) {
                oyVar2 = d21Var.a.f(2);
            }
            if (oyVar == null) {
                oyVar = d21Var.a.f(1);
            }
            g(oy.a(oyVar, oyVar2));
            oy oyVar3 = this.b[ld0.k(16)];
            if (oyVar3 != null) {
                f(oyVar3);
            }
            oy oyVar4 = this.b[ld0.k(32)];
            if (oyVar4 != null) {
                d(oyVar4);
            }
            oy oyVar5 = this.b[ld0.k(64)];
            if (oyVar5 != null) {
                h(oyVar5);
            }
        }
    }

    public abstract d21 b();

    public void c(int i, oy oyVar) {
        if (this.b == null) {
            this.b = new oy[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[ld0.k(i2)] = oyVar;
            }
        }
    }

    public abstract void e(oy oyVar);

    public abstract void g(oy oyVar);

    public r11(d21 d21Var) {
        this.a = d21Var;
    }

    public void d(oy oyVar) {
    }

    public void f(oy oyVar) {
    }

    public void h(oy oyVar) {
    }
}
