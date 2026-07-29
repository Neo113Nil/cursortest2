package o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.xP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2220xP implements InterfaceC0235Iy, Serializable {
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C2220xP.class, Object.class, "i");
    public volatile AbstractC1596ny h;
    public volatile Object i;

    /* JADX WARN: Type inference failed for: r0v1, types: [o.lp, o.ny] */
    @Override // o.InterfaceC0235Iy
    public final Object getValue() {
        Object obj = this.i;
        C1097gL c1097gL = C1097gL.f168o;
        if (obj != c1097gL) {
            return obj;
        }
        ?? r0 = this.h;
        if (r0 != 0) {
            Object invoke = r0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1097gL, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c1097gL) {
                }
            }
            this.h = null;
            return invoke;
        }
        return this.i;
    }

    public final String toString() {
        return this.i != C1097gL.f168o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
