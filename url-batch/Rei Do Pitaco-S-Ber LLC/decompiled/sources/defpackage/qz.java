package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class qz implements Runnable {
    public mj f;
    public nj g;
    public Handler h;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.h.post(new g1(this.g, obj, 6));
    }
}
