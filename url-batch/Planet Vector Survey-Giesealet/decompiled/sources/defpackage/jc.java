package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jc implements pj, qj {
    public static final y7 e = new y7(5);
    public static final jc f = new jc(1);
    public final /* synthetic */ int d;

    public /* synthetic */ jc(int i) {
        this.d = i;
    }

    @Override // defpackage.pj
    public final qj getKey() {
        switch (this.d) {
            case 0:
                return e;
            default:
                return this;
        }
    }

    @Override // defpackage.rj
    public final rj i(rj rjVar) {
        switch (this.d) {
        }
        return nz.Q(this, rjVar);
    }

    @Override // defpackage.rj
    public final pj k(qj qjVar) {
        switch (this.d) {
        }
        return nz.A(this, qjVar);
    }

    @Override // defpackage.rj
    public final Object o(qu quVar, Object obj) {
        switch (this.d) {
        }
        return quVar.invoke(obj, this);
    }

    @Override // defpackage.rj
    public final rj s(qj qjVar) {
        switch (this.d) {
        }
        return nz.L(this, qjVar);
    }
}
