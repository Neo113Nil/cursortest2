package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class lj extends h9 {
    private final rj _context;
    private transient kj intercepted;

    public lj(kj kjVar) {
        this(kjVar, kjVar != null ? kjVar.getContext() : null);
    }

    @Override // defpackage.kj
    public rj getContext() {
        rj rjVar = this._context;
        rjVar.getClass();
        return rjVar;
    }

    public final kj intercepted() {
        kj kjVar = this.intercepted;
        if (kjVar != null) {
            return kjVar;
        }
        uj ujVar = (uj) getContext().k(b2.t);
        kj rmVar = ujVar != null ? new rm(ujVar, this) : this;
        this.intercepted = rmVar;
        return rmVar;
    }

    @Override // defpackage.h9
    public void releaseIntercepted() {
        kj kjVar = this.intercepted;
        if (kjVar != null && kjVar != this) {
            pj k = getContext().k(b2.t);
            k.getClass();
            rm rmVar = (rm) kjVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rm.k;
            while (atomicReferenceFieldUpdater.get(rmVar) == d31.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(rmVar);
            hc hcVar = obj instanceof hc ? (hc) obj : null;
            if (hcVar != null) {
                hcVar.m();
            }
        }
        this.intercepted = hf.e;
    }

    public lj(kj kjVar, rj rjVar) {
        super(kjVar);
        this._context = rjVar;
    }
}
