package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class om0 implements kj, dk {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(om0.class, Object.class, "result");
    public final kj d;
    private volatile Object result;

    public om0(kj kjVar) {
        ck ckVar = ck.d;
        this.d = kjVar;
        this.result = ckVar;
    }

    @Override // defpackage.dk
    public final dk getCallerFrame() {
        kj kjVar = this.d;
        if (kjVar instanceof dk) {
            return (dk) kjVar;
        }
        return null;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return this.d.getContext();
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            ck ckVar = ck.e;
            if (obj2 == ckVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, ckVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != ckVar) {
                        break;
                    }
                }
                return;
            }
            ck ckVar2 = ck.d;
            if (obj2 != ckVar2) {
                g8.s("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            ck ckVar3 = ck.f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, ckVar2, ckVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != ckVar2) {
                    break;
                }
            }
            this.d.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.d;
    }
}
