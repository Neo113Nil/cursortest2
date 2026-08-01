package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hd extends c00 {
    public final /* synthetic */ int h;
    public final hc i;

    public /* synthetic */ hd(hc hcVar, int i) {
        this.h = i;
        this.i = hcVar;
    }

    @Override // defpackage.c00
    public final boolean k() {
        switch (this.h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.c00
    public final void l(Throwable th) {
        int i = this.h;
        hc hcVar = this.i;
        switch (i) {
            case 0:
                Throwable o = hcVar.o(j());
                if (hcVar.u()) {
                    rm rmVar = (rm) hcVar.g;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rm.k;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(rmVar);
                        op opVar = d31.c;
                        if (nz.l(obj, opVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(rmVar, opVar, o)) {
                                if (atomicReferenceFieldUpdater.get(rmVar) != opVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(rmVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(rmVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                hcVar.j(o);
                if (!hcVar.u()) {
                    hcVar.m();
                    break;
                }
                break;
            default:
                hcVar.resumeWith(ky0.a);
                break;
        }
    }
}
