package o;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class V7 extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V7(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        int i = this.h;
        C0782bY c0782bY = C0782bY.a;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                C0140Fh c0140Fh = ((W7) obj2).f122o;
                C0079Cy c0079Cy = (C0079Cy) obj;
                C1112ga c1112ga = c0079Cy.b;
                ((C1360kM) obj3).h = c0140Fh.x(c1112ga.m(), c1112ga.b.b, c0079Cy);
                return c0782bY;
            case 1:
                List<Certificate> list = (List) obj2;
                AbstractC1305jX abstractC1305jX = ((C2099va) obj3).b;
                if (abstractC1305jX != null) {
                    list = abstractC1305jX.k((String) obj, list);
                }
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
                for (Certificate certificate : list) {
                    AbstractC0048Bt.l(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 2:
                return ((C2120vv) ((AH) obj3)).b((ByteArrayInputStream) obj2, ((AbstractC1054fi) obj).b.a.p);
            case 3:
                C0621Xv c0621Xv = (C0621Xv) obj2;
                C0740aw c0740aw = (C0740aw) obj;
                InterfaceC2364zb c = ((AbstractC1004ey) obj3).B0().c();
                if (!(c instanceof InterfaceC1245ib)) {
                    throw new C0526Ue("Supertype not a class: " + c);
                }
                Class j = JY.j((InterfaceC1245ib) c);
                if (j == null) {
                    throw new C0526Ue("Unsupported superclass of " + c0621Xv + ": " + c);
                }
                Class cls = c0740aw.i;
                if (AbstractC0048Bt.h(cls.getSuperclass(), j)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    AbstractC0048Bt.m(genericSuperclass, "{\n                      …ass\n                    }");
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                AbstractC0048Bt.m(interfaces, "jClass.interfaces");
                int m0 = P6.m0(interfaces, j);
                if (m0 >= 0) {
                    Type type = cls.getGenericInterfaces()[m0];
                    AbstractC0048Bt.m(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new C0526Ue("No superclass of " + c0621Xv + " in Java reflection for " + c);
            case 4:
                C0209Hy c0209Hy = (C0209Hy) obj;
                C0131Ey c0131Ey = (C0131Ey) obj3;
                C0209Hy c0209Hy2 = c0131Ey.v;
                c0209Hy2.i = 0;
                YD o2 = c0209Hy2.a.o();
                int i2 = o2.j;
                if (i2 > 0) {
                    Object[] objArr = o2.h;
                    int i3 = 0;
                    do {
                        C0131Ey c0131Ey2 = ((C0027Ay) objArr[i3]).v.r;
                        AbstractC0048Bt.k(c0131Ey2);
                        c0131Ey2.h = c0131Ey2.i;
                        c0131Ey2.i = Integer.MAX_VALUE;
                        if (c0131Ey2.j == 2) {
                            c0131Ey2.j = 3;
                        }
                        i3++;
                    } while (i3 < i2);
                }
                C0027Ay c0027Ay = c0209Hy2.a;
                C0027Ay c0027Ay2 = c0209Hy2.a;
                YD o3 = c0027Ay.o();
                int i4 = o3.j;
                if (i4 > 0) {
                    Object[] objArr2 = o3.h;
                    int i5 = 0;
                    do {
                        C0131Ey c0131Ey3 = ((C0027Ay) objArr2[i5]).v.r;
                        AbstractC0048Bt.k(c0131Ey3);
                        c0131Ey3.q.getClass();
                        i5++;
                    } while (i5 < i4);
                }
                C0358Ns c0358Ns = c0131Ey.n().I;
                if (c0358Ns != null) {
                    boolean z = c0358Ns.h;
                    VD vd = (VD) c0209Hy.a.h();
                    int i6 = vd.h.j;
                    for (int i7 = 0; i7 < i6; i7++) {
                        AbstractC1547nB f0 = ((ME) ((C0027Ay) vd.get(i7)).u.d).f0();
                        if (f0 != null) {
                            f0.h = z;
                        }
                    }
                }
                ((AbstractC1547nB) obj2).P().r();
                if (c0131Ey.n().I != null) {
                    VD vd2 = (VD) c0209Hy.a.h();
                    int i8 = vd2.h.j;
                    for (int i9 = 0; i9 < i8; i9++) {
                        AbstractC1547nB f02 = ((ME) ((C0027Ay) vd2.get(i9)).u.d).f0();
                        if (f02 != null) {
                            f02.h = false;
                        }
                    }
                }
                YD o4 = c0027Ay2.o();
                int i10 = o4.j;
                if (i10 > 0) {
                    Object[] objArr3 = o4.h;
                    int i11 = 0;
                    do {
                        C0131Ey c0131Ey4 = ((C0027Ay) objArr3[i11]).v.r;
                        AbstractC0048Bt.k(c0131Ey4);
                        int i12 = c0131Ey4.h;
                        int i13 = c0131Ey4.i;
                        if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                            c0131Ey4.I();
                        }
                        i11++;
                    } while (i11 < i10);
                }
                YD o5 = c0027Ay2.o();
                int i14 = o5.j;
                if (i14 > 0) {
                    Object[] objArr4 = o5.h;
                    int i15 = 0;
                    do {
                        C0131Ey c0131Ey5 = ((C0027Ay) objArr4[i15]).v.r;
                        AbstractC0048Bt.k(c0131Ey5);
                        C0053By c0053By = c0131Ey5.q;
                        c0053By.getClass();
                        c0053By.c = false;
                        i15++;
                    } while (i15 < i14);
                }
                return c0782bY;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                AbstractC1005ez abstractC1005ez = (AbstractC1005ez) obj3;
                OT ot = ((C1198hu) abstractC1005ez.b.i).a;
                C0874cz c0874cz = new C0874cz(abstractC1005ez, (DM) obj2, (C1132gu) obj);
                VA va = (VA) ot;
                va.getClass();
                return new RA(va, c0874cz);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                C1823rO c1823rO = ME.D;
                ((ME) obj3).b0((InterfaceC0980ea) obj2, (C0512Tq) obj);
                return c0782bY;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1305jX abstractC1305jX2 = ((C2099va) obj3).b;
                AbstractC0048Bt.k(abstractC1305jX2);
                return abstractC1305jX2.k(((C0683a2) obj).h.d, ((C1457lr) obj2).a());
            default:
                AbstractC1927t abstractC1927t = (AbstractC1927t) obj3;
                abstractC1927t.removeOnAttachStateChangeListener((W2) obj2);
                C1574nc c1574nc = (C1574nc) obj;
                AbstractC0048Bt.n(c1574nc, "listener");
                AbstractC0946e20.w(abstractC1927t).a.remove(c1574nc);
                return c0782bY;
        }
    }
}
