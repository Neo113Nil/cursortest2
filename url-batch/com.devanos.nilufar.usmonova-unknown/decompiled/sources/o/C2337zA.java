package o;

/* renamed from: o.zA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2337zA {
    public final Y1 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ BD d;

    public C2337zA(BD bd, Y1 y1) {
        this.d = bd;
        this.a = y1;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        BD bd = this.d;
        int i2 = bd.c;
        bd.c = i + i2;
        if (!bd.d) {
            bd.d = true;
            while (true) {
                try {
                    int i3 = bd.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    bd.d = false;
                }
            }
        }
        if (this.b) {
            bd.c(this);
        }
    }
}
