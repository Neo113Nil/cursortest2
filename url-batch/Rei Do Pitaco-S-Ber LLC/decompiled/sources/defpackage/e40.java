package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e40 implements Serializable {
    public dl f;
    public volatile Object g = tg.l;
    public final Object h = this;

    public e40(dl dlVar) {
        this.f = dlVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.g;
        tg tgVar = tg.l;
        if (obj2 != tgVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.g;
            if (obj == tgVar) {
                dl dlVar = this.f;
                dlVar.getClass();
                obj = dlVar.a();
                this.g = obj;
                this.f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.g != tg.l ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
