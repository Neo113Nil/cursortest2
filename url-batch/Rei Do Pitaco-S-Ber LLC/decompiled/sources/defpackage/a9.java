package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a9 {
    public boolean a;
    public z8 b;
    public boolean c;

    public final void a(z8 z8Var) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b == z8Var) {
                return;
            }
            this.b = z8Var;
            if (this.a) {
                z8Var.onCancel();
            }
        }
    }
}
