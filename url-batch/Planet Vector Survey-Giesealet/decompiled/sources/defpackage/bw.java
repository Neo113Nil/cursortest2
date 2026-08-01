package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bw implements Runnable {
    public final /* synthetic */ int d = 0;
    public Runnable e;
    public final /* synthetic */ uj f;

    public bw(hc hcVar, cw cwVar) {
        this.e = hcVar;
        this.f = cwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        uj ujVar = this.f;
        switch (i) {
            case 0:
                ((hc) this.e).B((cw) ujVar);
                break;
            default:
                t20 t20Var = (t20) ujVar;
                uj ujVar2 = t20Var.g;
                int i2 = 0;
                while (true) {
                    try {
                        this.e.run();
                    } catch (Throwable th) {
                        d31.A(up.d, th);
                    }
                    Runnable l = t20Var.l();
                    if (l != null) {
                        this.e = l;
                        i2++;
                        if (i2 >= 16 && ujVar2.f(t20Var)) {
                            ujVar2.d(t20Var, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
        }
    }

    public bw(t20 t20Var, Runnable runnable) {
        this.f = t20Var;
        this.e = runnable;
    }
}
