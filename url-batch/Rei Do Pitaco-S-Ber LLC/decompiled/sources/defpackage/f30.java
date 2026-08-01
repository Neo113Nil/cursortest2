package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class f30 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(f30.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int a;

    public f30(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        iw iwVar = m60.k;
        Object obj = b.get(this);
        if (obj == iwVar) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i;
        if (obj == null) {
            obj = m60.k;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (oo.b(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.a;
            if ((i2 & 1) != 0) {
                this.a = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.a = i3;
            while (true) {
                synchronized (this) {
                    i = this.a;
                    if (i == i3) {
                        this.a = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }
}
