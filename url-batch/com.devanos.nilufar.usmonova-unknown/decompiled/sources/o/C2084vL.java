package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.vL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2084vL extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2084vL(int i, Object obj) {
        super(1);
        this.h = i;
        this.i = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cd, code lost:
    
        if (r13 != false) goto L88;
     */
    /* JADX WARN: Type inference failed for: r0v28, types: [o.ny, o.vp] */
    @Override // o.InterfaceC2114vp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean equals;
        AbstractC1701pX f;
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n((C1398ky) obj, "kotlinTypeRefiner");
                InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) this.i;
                if (interfaceC1245ib == null) {
                    interfaceC1245ib = null;
                }
                if (interfaceC1245ib != null) {
                    AbstractC0192Hh.f(interfaceC1245ib);
                }
                return null;
            case 1:
                Throwable th = (Throwable) obj;
                CancellationException a = PX.a("Recomposer effect job completed", th);
                C0901dM c0901dM = (C0901dM) this.i;
                synchronized (c0901dM.b) {
                    try {
                        InterfaceC0075Cu interfaceC0075Cu = c0901dM.c;
                        if (interfaceC0075Cu != null) {
                            ET et = c0901dM.r;
                            XL xl = XL.i;
                            et.getClass();
                            et.f(null, xl);
                            ET et2 = C0901dM.v;
                            interfaceC0075Cu.c(a);
                            c0901dM.f157o = null;
                            interfaceC0075Cu.B(new C0810c0(c0901dM, 14, th));
                        } else {
                            c0901dM.d = a;
                            ET et3 = c0901dM.r;
                            XL xl2 = XL.h;
                            et3.getClass();
                            et3.f(null, xl2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C0782bY.a;
            case 2:
                ((C2036ud) this.i).s(obj);
                return C0782bY.a;
            case 3:
                Method method = (Method) obj;
                C2217xM c2217xM = (C2217xM) this.i;
                if (!method.isSynthetic()) {
                    if (c2217xM.a.isEnum()) {
                        String name = method.getName();
                        if (AbstractC0048Bt.h(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            AbstractC0048Bt.m(parameterTypes, "method.parameterTypes");
                            if (parameterTypes.length == 0) {
                                equals = true;
                                break;
                            }
                            equals = false;
                            break;
                        } else {
                            if (AbstractC0048Bt.h(name, "valueOf")) {
                                equals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                                break;
                            }
                            equals = false;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                ((InterfaceC2312yp) this.i).invoke((InterfaceC0980ea) obj, null);
                return C0782bY.a;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ZH zh = (ZH) obj;
                ArrayList arrayList = (ArrayList) this.i;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ZH.f(zh, (AbstractC0700aI) arrayList.get(i2));
                }
                return C0782bY.a;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x9, "it");
                AbstractC1004ey c = ((RY) interfaceC2204x9.t0().get(((RY) this.i).m)).c();
                AbstractC0048Bt.m(c, "it.valueParameters[p.index].type");
                return c;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1696pS abstractC1696pS = (AbstractC1696pS) ((AbstractC1596ny) this.i).invoke((C1959tS) obj);
                synchronized (AbstractC2025uS.b) {
                    AbstractC2025uS.c = AbstractC2025uS.c.n(abstractC1696pS.d());
                }
                return abstractC1696pS;
            case 8:
                DS ds = (DS) this.i;
                synchronized (ds.f) {
                    CS cs = ds.h;
                    AbstractC0048Bt.k(cs);
                    Object obj2 = cs.b;
                    AbstractC0048Bt.k(obj2);
                    int i3 = cs.d;
                    GD gd = cs.c;
                    if (gd == null) {
                        gd = new GD();
                        cs.c = gd;
                        cs.f.i(obj2, gd);
                    }
                    cs.c(obj, i3, obj2, gd);
                }
                return C0782bY.a;
            case 9:
                C1635oX c1635oX = (C1635oX) obj;
                C0208Hx c0208Hx = (C0208Hx) this.i;
                InterfaceC1437lX interfaceC1437lX = c1635oX.a;
                C1658ou c1658ou = c1635oX.b;
                Set set = c1658ou.e;
                if (set != null && set.contains(interfaceC1437lX.a())) {
                    return c0208Hx.N0(c1658ou);
                }
                JR i4 = interfaceC1437lX.i();
                AbstractC0048Bt.m(i4, "typeParameter.defaultType");
                LinkedHashSet<InterfaceC1437lX> linkedHashSet = new LinkedHashSet();
                AbstractC0772bO.h(i4, i4, linkedHashSet, set);
                int E = EB.E(AbstractC0786bc.d0(linkedHashSet));
                if (E < 16) {
                    E = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(E);
                for (InterfaceC1437lX interfaceC1437lX2 : linkedHashSet) {
                    if (set == null || !set.contains(interfaceC1437lX2)) {
                        Set set2 = c1658ou.e;
                        f = C0218Ih.f(interfaceC1437lX2, c1658ou, c0208Hx, c0208Hx.O0(interfaceC1437lX2, C1658ou.a(c1658ou, 0, false, set2 != null ? WQ.o(set2, interfaceC1437lX) : AbstractC0773bP.i(interfaceC1437lX), null, 47)));
                    } else {
                        f = AbstractC2228xX.k(interfaceC1437lX2, c1658ou);
                    }
                    linkedHashMap.put(interfaceC1437lX2.z(), f);
                }
                C2096vX c2096vX = new C2096vX(new C1697pT(i, linkedHashMap));
                List upperBounds = interfaceC1437lX.getUpperBounds();
                AbstractC0048Bt.m(upperBounds, "typeParameter.upperBounds");
                VQ R0 = c0208Hx.R0(c2096vX, upperBounds, c1658ou);
                if (R0.h.isEmpty()) {
                    return c0208Hx.N0(c1658ou);
                }
                if (R0.h.p == 1) {
                    return (AbstractC1004ey) AbstractC0720ac.C0(R0);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 10:
                AbstractC0048Bt.n((String) obj, "it");
                return Integer.valueOf(((AtomicInteger) ((C0208Hx) this.i).j).getAndIncrement());
            default:
                AbstractC0048Bt.n((InterfaceC0761bD) obj, "it");
                return (AbstractC1004ey) this.i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2084vL(InterfaceC1245ib interfaceC1245ib, C2150wL c2150wL, JR jr, C1658ou c1658ou) {
        super(1);
        this.h = 0;
        this.i = interfaceC1245ib;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2084vL(InterfaceC2114vp interfaceC2114vp) {
        super(1);
        this.h = 7;
        this.i = (AbstractC1596ny) interfaceC2114vp;
    }
}
