package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class q50 extends y80 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public q50(w80 w80Var) {
        this.a = 1;
        this.d = w80Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.x80
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((r50) obj).a.setVisibility(this.c);
                    break;
                }
                break;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                w80 w80Var = (w80) obj;
                if (i2 == w80Var.a.size()) {
                    x80 x80Var = w80Var.d;
                    if (x80Var != null) {
                        x80Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    w80Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y80, defpackage.x80
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.y80, defpackage.x80
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((r50) obj).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    x80 x80Var = ((w80) obj).d;
                    if (x80Var != null) {
                        x80Var.c();
                        break;
                    }
                }
                break;
        }
    }

    public q50(r50 r50Var, int i) {
        this.a = 0;
        this.d = r50Var;
        this.c = i;
        this.b = false;
    }
}
