package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class uj extends m implements pj {
    public static final tj e = new tj(b2.t, new sj(0));

    public uj() {
        super(b2.t);
    }

    public abstract void d(rj rjVar, Runnable runnable);

    public boolean f(rj rjVar) {
        return !(this instanceof hy0);
    }

    public uj j(int i) {
        nz.q(i);
        return new t20(this, i);
    }

    @Override // defpackage.m, defpackage.rj
    public final pj k(qj qjVar) {
        pj pjVar;
        qjVar.getClass();
        if (!(qjVar instanceof tj)) {
            if (b2.t == qjVar) {
                return this;
            }
            return null;
        }
        tj tjVar = (tj) qjVar;
        qj qjVar2 = this.d;
        if ((qjVar2 == tjVar || tjVar.e == qjVar2) && (pjVar = (pj) tjVar.d.c(this)) != null) {
            return pjVar;
        }
        return null;
    }

    @Override // defpackage.m, defpackage.rj
    public final rj s(qj qjVar) {
        qjVar.getClass();
        if (qjVar instanceof tj) {
            tj tjVar = (tj) qjVar;
            qj qjVar2 = this.d;
            if (qjVar2 != tjVar && tjVar.e != qjVar2) {
                return this;
            }
            if (((pj) tjVar.d.c(this)) == null) {
                return this;
            }
        } else if (b2.t != qjVar) {
            return this;
        }
        return up.d;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + nk.u(this);
    }
}
