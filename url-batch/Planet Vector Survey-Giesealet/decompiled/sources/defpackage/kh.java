package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements bu {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kh(h2 h2Var, mr0 mr0Var, pc0 pc0Var) {
        this.e = h2Var;
        this.f = mr0Var;
        this.g = pc0Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        List list;
        int i = this.d;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                qh qhVar = (qh) obj3;
                rc rcVar = (rc) obj2;
                ir0 ir0Var = (ir0) obj;
                jh jhVar = qhVar.L;
                rc rcVar2 = jhVar.b;
                try {
                    jhVar.b = rcVar;
                    ir0 ir0Var2 = qhVar.F;
                    int[] iArr = qhVar.n;
                    p60 p60Var = qhVar.u;
                    qhVar.n = null;
                    qhVar.u = null;
                    try {
                        qhVar.F = ir0Var;
                        boolean z = jhVar.e;
                        try {
                            jhVar.e = false;
                            throw null;
                        } finally {
                        }
                    } catch (Throwable th) {
                        qhVar.F = ir0Var2;
                        qhVar.n = iArr;
                        qhVar.u = p60Var;
                        throw th;
                    }
                } catch (Throwable th2) {
                    jhVar.b = rcVar2;
                    throw th2;
                }
            default:
                h2 h2Var = (h2) obj3;
                mr0 mr0Var = (mr0) obj2;
                pc0 pc0Var = (pc0) obj;
                if (h2Var != null) {
                    mr0Var.a(mr0Var.c(h2Var) - mr0Var.t);
                }
                List l = d31.l(mr0Var, null, mr0Var.t, null);
                ch chVar = (ch) zd.i0(l);
                Integer num = chVar != null ? chVar.a : null;
                List c = pc0Var.c(num);
                if (num != null && !c.isEmpty()) {
                    ch chVar2 = (ch) zd.c0(c);
                    int size = c.size() - 1;
                    if (size <= 0) {
                        list = wp.d;
                    } else if (size == 1) {
                        list = px0.H(zd.h0(c));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (c instanceof RandomAccess) {
                            int size2 = c.size();
                            for (int i2 = 1; i2 < size2; i2++) {
                                arrayList.add(c.get(i2));
                            }
                        } else {
                            ListIterator listIterator = c.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        list = arrayList;
                    }
                    chVar2.getClass();
                    c = zd.l0(px0.H(new ch(null, num)), list);
                }
                return zd.l0(l, c);
        }
    }

    public /* synthetic */ kh(qh qhVar, rc rcVar, ir0 ir0Var, i60 i60Var) {
        this.e = qhVar;
        this.f = rcVar;
        this.g = ir0Var;
    }
}
