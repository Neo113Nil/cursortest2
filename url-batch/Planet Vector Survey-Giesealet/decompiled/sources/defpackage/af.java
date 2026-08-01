package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class af implements rj, Serializable {
    public final rj d;
    public final pj e;

    public af(pj pjVar, rj rjVar) {
        rjVar.getClass();
        pjVar.getClass();
        this.d = rjVar;
        this.e = pjVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof af) {
            af afVar = (af) obj;
            int i = 2;
            af afVar2 = afVar;
            int i2 = 2;
            while (true) {
                rj rjVar = afVar2.d;
                afVar2 = rjVar instanceof af ? (af) rjVar : null;
                if (afVar2 == null) {
                    break;
                }
                i2++;
            }
            af afVar3 = this;
            while (true) {
                rj rjVar2 = afVar3.d;
                afVar3 = rjVar2 instanceof af ? (af) rjVar2 : null;
                if (afVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    pj pjVar = this.e;
                    if (!nz.l(afVar.k(pjVar.getKey()), pjVar)) {
                        z = false;
                        break;
                    }
                    rj rjVar3 = this.d;
                    if (!(rjVar3 instanceof af)) {
                        rjVar3.getClass();
                        pj pjVar2 = (pj) rjVar3;
                        z = nz.l(afVar.k(pjVar2.getKey()), pjVar2);
                        break;
                    }
                    this = (af) rjVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + this.d.hashCode();
    }

    @Override // defpackage.rj
    public final rj i(rj rjVar) {
        rjVar.getClass();
        return rjVar == up.d ? this : (rj) rjVar.o(new ze(6), this);
    }

    @Override // defpackage.rj
    public final pj k(qj qjVar) {
        qjVar.getClass();
        while (true) {
            pj k = this.e.k(qjVar);
            if (k != null) {
                return k;
            }
            rj rjVar = this.d;
            if (!(rjVar instanceof af)) {
                return rjVar.k(qjVar);
            }
            this = (af) rjVar;
        }
    }

    @Override // defpackage.rj
    public final Object o(qu quVar, Object obj) {
        return quVar.invoke(this.d.o(quVar, obj), this.e);
    }

    @Override // defpackage.rj
    public final rj s(qj qjVar) {
        qjVar.getClass();
        pj pjVar = this.e;
        pj k = pjVar.k(qjVar);
        rj rjVar = this.d;
        if (k != null) {
            return rjVar;
        }
        rj s = rjVar.s(qjVar);
        return s == rjVar ? this : s == up.d ? pjVar : new af(pjVar, s);
    }

    public final String toString() {
        return "[" + ((String) o(new ze(0), "")) + ']';
    }
}
