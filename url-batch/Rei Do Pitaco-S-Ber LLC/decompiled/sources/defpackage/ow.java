package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ow extends nw {
    public final Object c;

    public ow(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.nw
    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.nw
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }
}
