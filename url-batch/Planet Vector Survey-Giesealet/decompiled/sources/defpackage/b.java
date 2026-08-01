package defpackage;

import android.content.Context;
import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj) {
        super(0);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0204, code lost:
    
        continue;
     */
    @Override // defpackage.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        int i = this.e;
        boolean z = false;
        ky0 ky0Var = ky0.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((qd) obj).x.a();
                return Boolean.TRUE;
            case 1:
                ((i5) obj).m.setValue(Boolean.valueOf(!((Boolean) r12.getValue()).booleanValue()));
                return ky0Var;
            case 2:
                mz.H((j5) obj);
                return ky0Var;
            case 3:
                ((ts) obj).k0();
                return ky0Var;
            case 4:
                xs xsVar = (xs) obj;
                o1 o1Var = o1.A;
                t50 t50Var = xsVar.d;
                l70 l70Var = null;
                while (true) {
                    if (t50Var == null) {
                        if (!xsVar.d.q) {
                            cy.b("visitChildren called on an unattached node");
                        }
                        l70 l70Var2 = new l70(new t50[16]);
                        t50 t50Var2 = xsVar.d;
                        t50 t50Var3 = t50Var2.i;
                        if (t50Var3 == null) {
                            nz.h(l70Var2, t50Var2);
                        } else {
                            l70Var2.b(t50Var3);
                        }
                        while (true) {
                            int i2 = l70Var2.f;
                            if (i2 != 0) {
                                t50 t50Var4 = (t50) l70Var2.j(i2 - 1);
                                if ((t50Var4.g & 1024) == 0) {
                                    nz.h(l70Var2, t50Var4);
                                } else {
                                    while (true) {
                                        if (t50Var4 == null) {
                                            break;
                                        }
                                        if ((t50Var4.f & 1024) != 0) {
                                            l70 l70Var3 = null;
                                            while (t50Var4 != null) {
                                                if (t50Var4 instanceof ts) {
                                                    ts tsVar = (ts) t50Var4;
                                                    z = tsVar.k0().a ? tsVar.n0() : od0.j(tsVar, 7, o1Var);
                                                } else {
                                                    if ((t50Var4.f & 1024) != 0 && (t50Var4 instanceof ol)) {
                                                        int i3 = 0;
                                                        for (t50 t50Var5 = ((ol) t50Var4).s; t50Var5 != null; t50Var5 = t50Var5.i) {
                                                            if ((t50Var5.f & 1024) != 0) {
                                                                i3++;
                                                                if (i3 == 1) {
                                                                    t50Var4 = t50Var5;
                                                                } else {
                                                                    if (l70Var3 == null) {
                                                                        l70Var3 = new l70(new t50[16]);
                                                                    }
                                                                    if (t50Var4 != null) {
                                                                        l70Var3.b(t50Var4);
                                                                        t50Var4 = null;
                                                                    }
                                                                    l70Var3.b(t50Var5);
                                                                }
                                                            }
                                                        }
                                                        if (i3 == 1) {
                                                        }
                                                    }
                                                    t50Var4 = nz.j(l70Var3);
                                                }
                                            }
                                        } else {
                                            t50Var4 = t50Var4.i;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (t50Var instanceof ts) {
                        ts tsVar2 = (ts) t50Var;
                        z = tsVar2.k0().a ? tsVar2.n0() : od0.j(tsVar2, 7, o1Var);
                    } else {
                        if ((t50Var.f & 1024) != 0 && (t50Var instanceof ol)) {
                            int i4 = 0;
                            for (t50 t50Var6 = ((ol) t50Var).s; t50Var6 != null; t50Var6 = t50Var6.i) {
                                if ((t50Var6.f & 1024) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        t50Var = t50Var6;
                                    } else {
                                        if (l70Var == null) {
                                            l70Var = new l70(new t50[16]);
                                        }
                                        if (t50Var != null) {
                                            l70Var.b(t50Var);
                                            t50Var = null;
                                        }
                                        l70Var.b(t50Var6);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        t50Var = nz.j(l70Var);
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                return Float.valueOf(ze0.k(((bk) obj).f()));
            case 6:
                Object systemService = ((ky) obj).a.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 7:
                s10 s10Var = ((p10) obj).G;
                s10Var.o.B = true;
                m40 m40Var = s10Var.p;
                if (m40Var != null) {
                    m40Var.v = true;
                }
                return ky0Var;
            case 8:
                v50 v50Var = (v50) obj;
                l70 l70Var4 = v50Var.c;
                l70 l70Var5 = v50Var.b;
                l70 l70Var6 = v50Var.e;
                v50Var.f = false;
                HashSet hashSet = new HashSet();
                l70 l70Var7 = v50Var.d;
                Object[] objArr = l70Var7.d;
                int i5 = l70Var7.f;
                for (int i6 = 0; i6 < i5; i6++) {
                    p10 p10Var = (p10) objArr[i6];
                    ji0 ji0Var = (ji0) l70Var6.d[i6];
                    t50 t50Var7 = (t50) p10Var.F.j;
                    if (t50Var7.q) {
                        v50.b(t50Var7, ji0Var, hashSet);
                    }
                }
                l70Var7.g();
                l70Var6.g();
                Object[] objArr2 = l70Var5.d;
                int i7 = l70Var5.f;
                for (int i8 = 0; i8 < i7; i8++) {
                    g9 g9Var = (g9) objArr2[i8];
                    ji0 ji0Var2 = (ji0) l70Var4.d[i8];
                    if (g9Var.q) {
                        v50.b(g9Var, ji0Var2, hashSet);
                    }
                }
                l70Var5.g();
                l70Var4.g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((g9) it.next()).l0();
                }
                return ky0Var;
            case 9:
                s80 s80Var = (s80) obj;
                Context context = s80Var.a;
                q90 q90Var = s80Var.v;
                context.getClass();
                q90Var.getClass();
                return new a90();
            case 10:
                return new i80((String) obj);
            case 11:
                return d31.h((Context) obj);
            case 12:
                List list = (List) ((bt0) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (nz.l(((y70) obj2).e.d, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 13:
                return (bk) ((k2) obj).g;
            case 14:
                return ((y90) obj).j0();
            case 15:
                wk0 wk0Var = ea0.M;
                ((mu) obj).c(wk0Var);
                wk0Var.s = wk0Var.m.a(wk0Var.o, wk0Var.q, wk0Var.p);
                return ky0Var;
            case 16:
                bj0 bj0Var = (bj0) obj;
                bj0Var.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bj0Var.b();
                    return ky0Var;
                } finally {
                    Trace.endSection();
                }
            case 17:
                return (el0) ((f70) obj).getValue();
            case 18:
                jp0 jp0Var = (jp0) obj;
                cx0 cx0Var = jp0Var.e;
                jp0Var.f = cx0Var != null ? ((Number) cx0Var.l.getValue()).longValue() : 0L;
                return ky0Var;
            case 19:
                return new BaseInputConnection(((ky) obj).a, false);
            case 20:
                cw0 cw0Var = (cw0) obj;
                cw0Var.B = null;
                ch0.h(cw0Var);
                a50.z(cw0Var);
                mz.H(cw0Var);
                return Boolean.TRUE;
            default:
                hz0 hz0Var = (hz0) obj;
                int i9 = hz0Var.k;
                zd0 zd0Var = hz0Var.h;
                if (i9 == zd0Var.g()) {
                    zd0Var.h(zd0Var.g() + 1);
                }
                return ky0Var;
        }
    }
}
