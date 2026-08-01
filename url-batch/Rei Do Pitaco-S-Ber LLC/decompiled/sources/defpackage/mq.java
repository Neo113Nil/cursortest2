package defpackage;

import androidx.lifecycle.b;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class mq {
    public final j0 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ b d;

    public mq(b bVar, j0 j0Var) {
        this.d = bVar;
        this.a = j0Var;
    }

    public final void c(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        b bVar = this.d;
        int i2 = bVar.c;
        bVar.c = i + i2;
        if (!bVar.d) {
            bVar.d = true;
            while (true) {
                try {
                    int i3 = bVar.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    bVar.d = false;
                }
            }
        }
        if (this.b) {
            bVar.c(this);
        }
    }

    public abstract boolean e();

    public void d() {
    }
}
