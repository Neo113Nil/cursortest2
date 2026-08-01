package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rm extends tm implements dk, kj {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(rm.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final uj g;
    public final lj h;
    public Object i;
    public final Object j;

    public rm(uj ujVar, lj ljVar) {
        super(-1);
        this.g = ujVar;
        this.h = ljVar;
        this.i = d31.b;
        this.j = mz.V(ljVar.getContext());
    }

    @Override // defpackage.dk
    public final dk getCallerFrame() {
        return this.h;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return this.h.getContext();
    }

    @Override // defpackage.tm
    public final Object h() {
        Object obj = this.i;
        this.i = d31.b;
        return obj;
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        Throwable a = vk0.a(obj);
        Object jfVar = a == null ? obj : new jf(a, false);
        lj ljVar = this.h;
        rj context = ljVar.getContext();
        uj ujVar = this.g;
        if (ujVar.f(context)) {
            this.i = jfVar;
            this.f = 0;
            ujVar.d(ljVar.getContext(), this);
            return;
        }
        pq a2 = hw0.a();
        if (a2.f >= 4294967296L) {
            this.i = jfVar;
            this.f = 0;
            a2.p(this);
            return;
        }
        a2.r(true);
        try {
            rj context2 = ljVar.getContext();
            Object Y = mz.Y(context2, this.j);
            try {
                ljVar.resumeWith(obj);
                while (a2.w()) {
                }
            } finally {
                mz.S(context2, Y);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.g + ", " + nk.M(this.h) + ']';
    }

    @Override // defpackage.tm
    public final kj c() {
        return this;
    }
}
