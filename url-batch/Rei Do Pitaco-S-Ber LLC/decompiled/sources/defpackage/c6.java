package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c6 extends m60 {
    public static volatile c6 v;
    public final Object u;

    public c6(int i) {
        switch (i) {
            case 1:
                this.u = new Object();
                Executors.newFixedThreadPool(4, new se());
                break;
            default:
                this.u = new c6(1);
                break;
        }
    }

    public static c6 e0() {
        if (v != null) {
            return v;
        }
        synchronized (c6.class) {
            try {
                if (v == null) {
                    v = new c6(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v;
    }
}
