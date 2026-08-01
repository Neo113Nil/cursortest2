package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class us0 implements kj, dk {
    public final kj d;
    public final rj e;

    public us0(kj kjVar, rj rjVar) {
        this.d = kjVar;
        this.e = rjVar;
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
        return this.e;
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        this.d.resumeWith(obj);
    }
}
