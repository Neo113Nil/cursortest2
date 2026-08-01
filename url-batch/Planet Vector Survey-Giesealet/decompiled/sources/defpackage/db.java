package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class db implements u01 {
    public Object d = gb.p;
    public hc e;
    public final /* synthetic */ eb f;

    public db(eb ebVar) {
        this.f = ebVar;
    }

    @Override // defpackage.u01
    public final void a(kp0 kp0Var, int i) {
        hc hcVar = this.e;
        if (hcVar != null) {
            hcVar.a(kp0Var, i);
        }
    }

    public final Object b(lj ljVar) {
        ed edVar;
        Object obj = this.d;
        boolean z = true;
        if (obj == gb.p || obj == gb.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = eb.j;
            eb ebVar = this.f;
            ed edVar2 = (ed) atomicReferenceFieldUpdater.get(ebVar);
            while (true) {
                ebVar.getClass();
                if (ebVar.u(eb.e.get(ebVar), true)) {
                    this.d = gb.l;
                    Throwable n = ebVar.n();
                    if (n != null) {
                        int i = vs0.a;
                        throw n;
                    }
                    z = false;
                } else {
                    long andIncrement = eb.f.getAndIncrement(ebVar);
                    long j = gb.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (edVar2.c != j2) {
                        edVar = ebVar.m(j2, edVar2);
                        if (edVar == null) {
                            continue;
                        }
                    } else {
                        edVar = edVar2;
                    }
                    Object C = ebVar.C(edVar, i2, andIncrement, null);
                    op opVar = gb.m;
                    if (C == opVar) {
                        g8.s("unreachable");
                        return null;
                    }
                    op opVar2 = gb.o;
                    if (C == opVar2) {
                        if (andIncrement < ebVar.s()) {
                            edVar.a();
                        }
                        edVar2 = edVar;
                    } else {
                        if (C == gb.n) {
                            eb ebVar2 = this.f;
                            hc E = mz.E(d31.B(ljVar));
                            try {
                                this.e = E;
                                Object C2 = ebVar2.C(edVar, i2, andIncrement, this);
                                if (C2 == opVar) {
                                    a(edVar, i2);
                                } else {
                                    if (C2 == opVar2) {
                                        if (andIncrement < ebVar2.s()) {
                                            edVar.a();
                                        }
                                        ed edVar3 = (ed) eb.j.get(ebVar2);
                                        while (true) {
                                            if (ebVar2.u(eb.e.get(ebVar2), true)) {
                                                hc hcVar = this.e;
                                                hcVar.getClass();
                                                this.e = null;
                                                this.d = gb.l;
                                                Throwable n2 = ebVar.n();
                                                if (n2 == null) {
                                                    hcVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    hcVar.resumeWith(new uk0(n2));
                                                }
                                            } else {
                                                long andIncrement2 = eb.f.getAndIncrement(ebVar2);
                                                long j3 = gb.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (edVar3.c != j4) {
                                                    ed m = ebVar2.m(j4, edVar3);
                                                    if (m != null) {
                                                        edVar3 = m;
                                                    }
                                                }
                                                Object C3 = ebVar2.C(edVar3, i3, andIncrement2, this);
                                                if (C3 == gb.m) {
                                                    a(edVar3, i3);
                                                    break;
                                                }
                                                if (C3 == gb.o) {
                                                    if (andIncrement2 < ebVar2.s()) {
                                                        edVar3.a();
                                                    }
                                                } else {
                                                    if (C3 == gb.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    edVar3.a();
                                                    this.d = C3;
                                                    this.e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        edVar.a();
                                        this.d = C2;
                                        this.e = null;
                                    }
                                    E.z(Boolean.TRUE, null);
                                }
                                return E.p();
                            } catch (Throwable th) {
                                E.y();
                                throw th;
                            }
                        }
                        edVar.a();
                        this.d = C;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.d;
        op opVar = gb.p;
        if (obj == opVar) {
            g8.s("`hasNext()` has not been invoked");
            return null;
        }
        this.d = opVar;
        if (obj != gb.l) {
            return obj;
        }
        Throwable o = this.f.o();
        int i = vs0.a;
        throw o;
    }
}
