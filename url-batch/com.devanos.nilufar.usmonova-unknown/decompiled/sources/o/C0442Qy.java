package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Qy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442Qy extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ C1216i8 i;
    public final /* synthetic */ C0494Sy j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0442Qy(C1216i8 c1216i8, C0494Sy c0494Sy) {
        super(0);
        this.i = c1216i8;
        this.j = c0494Sy;
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        InterfaceC1245ib interfaceC1245ib;
        Class cls;
        ArrayList arrayList;
        int i;
        C1216i8 c1216i8;
        C2217xM c2217xM;
        C1216i8 c1216i82;
        String str;
        String str2;
        List list;
        InterfaceC1245ib interfaceC1245ib2;
        C0567Vt c0567Vt;
        boolean z;
        List list2;
        C0567Vt c0567Vt2;
        C0950e6 c0950e6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0494Sy c0494Sy;
        boolean z2;
        C1619oH c1619oH;
        List d;
        switch (this.h) {
            case 0:
                C1672p4 c1672p4 = C0460Rq.t;
                C0494Sy c0494Sy2 = this.j;
                C2217xM c2217xM2 = c0494Sy2.f108o;
                C1216i8 c1216i83 = c0494Sy2.b;
                InterfaceC1245ib interfaceC1245ib3 = c0494Sy2.n;
                Constructor<?>[] declaredConstructors = c2217xM2.a.getDeclaredConstructors();
                AbstractC0048Bt.m(declaredConstructors, "klass.declaredConstructors");
                boolean z3 = false;
                List<AM> B = PQ.B(PQ.z(new C0730am(P6.X(declaredConstructors), false, C1887sM.j), C1953tM.j));
                ArrayList arrayList4 = new ArrayList(B.size());
                for (AM am : B) {
                    C0338My G = AbstractC0022At.G(c1216i83, am);
                    C1198hu c1198hu = (C1198hu) c1216i83.i;
                    C0567Vt Y0 = C0567Vt.Y0(interfaceC1245ib3, G, z3, c1198hu.j.H0(am));
                    C1216i8 c1216i84 = new C1216i8(c1198hu, new C1333jz(c1216i83, Y0, am, interfaceC1245ib3.p().size()), c1216i83.k);
                    Constructor constructor = am.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    AbstractC0048Bt.m(genericParameterTypes, "types");
                    if (genericParameterTypes.length == 0) {
                        d = C1318jk.h;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) P6.f0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) P6.f0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        d = am.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C0260Jx u = AbstractC1005ez.u(c1216i84, Y0, d);
                    List p = interfaceC1245ib3.p();
                    AbstractC0048Bt.m(p, "classDescriptor.declaredTypeParameters");
                    ArrayList typeParameters = am.getTypeParameters();
                    ArrayList arrayList5 = new ArrayList(AbstractC0786bc.d0(typeParameters));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        C0494Sy c0494Sy3 = c0494Sy2;
                        InterfaceC1437lX h = ((InterfaceC1569nX) c1216i84.j).h((LM) it.next());
                        AbstractC0048Bt.k(h);
                        arrayList5.add(h);
                        c0494Sy2 = c0494Sy3;
                    }
                    Y0.W0((List) u.j, AbstractC2219xO.t(am.e()), AbstractC0720ac.A0(p, arrayList5));
                    Y0.P0(false);
                    Y0.Q0(u.i);
                    Y0.R0(interfaceC1245ib3.i());
                    ((C1198hu) c1216i84.i).g.getClass();
                    arrayList4.add(Y0);
                    c0494Sy2 = c0494Sy2;
                    z3 = false;
                }
                C0494Sy c0494Sy4 = c0494Sy2;
                boolean f = c2217xM2.f();
                Class cls2 = c2217xM2.a;
                String str3 = "classDescriptor.visibility";
                int i2 = 2;
                C1216i8 c1216i85 = this.i;
                if (f) {
                    C0567Vt Y02 = C0567Vt.Y0(interfaceC1245ib3, c1672p4, true, ((C1198hu) c1216i83.i).j.H0(c2217xM2));
                    ArrayList e = c2217xM2.e();
                    ArrayList arrayList6 = arrayList4;
                    ArrayList arrayList7 = new ArrayList(e.size());
                    boolean z4 = false;
                    C1658ou J = AbstractC1305jX.J(2, false, null, 6);
                    Iterator it2 = e.iterator();
                    String str4 = "PROTECTED_AND_PACKAGE";
                    int i3 = 0;
                    while (it2.hasNext()) {
                        JM jm = (JM) it2.next();
                        ArrayList arrayList8 = arrayList7;
                        Class cls3 = cls2;
                        C0567Vt c0567Vt3 = Y02;
                        arrayList8.add(new RY(c0567Vt3, null, i3, c1672p4, jm.c(), ((C0950e6) c1216i83.m).S(jm.f(), J), false, false, false, null, ((C1198hu) c1216i83.i).j.H0(jm)));
                        i2 = 2;
                        Y02 = c0567Vt3;
                        str4 = str4;
                        str3 = str3;
                        cls2 = cls3;
                        c2217xM2 = c2217xM2;
                        c1216i83 = c1216i83;
                        i3++;
                        arrayList6 = arrayList6;
                        interfaceC1245ib3 = interfaceC1245ib3;
                        J = J;
                        c1216i85 = c1216i85;
                        z4 = false;
                        arrayList7 = arrayList8;
                    }
                    interfaceC1245ib = interfaceC1245ib3;
                    C1216i8 c1216i86 = c1216i85;
                    c1216i82 = c1216i83;
                    ArrayList arrayList9 = arrayList7;
                    ArrayList arrayList10 = arrayList6;
                    cls = cls2;
                    str2 = str3;
                    c2217xM = c2217xM2;
                    C0567Vt c0567Vt4 = Y02;
                    i = i2;
                    str = str4;
                    c0567Vt4.Q0(z4);
                    C0244Jh visibility = interfaceC1245ib.getVisibility();
                    AbstractC0048Bt.m(visibility, str2);
                    if (visibility.equals(AbstractC0671Zt.b)) {
                        visibility = AbstractC0671Zt.c;
                        AbstractC0048Bt.m(visibility, str);
                    }
                    c0567Vt4.V0(arrayList9, visibility);
                    c0567Vt4.P0(z4);
                    c0567Vt4.R0(interfaceC1245ib.i());
                    String y = PX.y(c0567Vt4, i);
                    if (!arrayList10.isEmpty()) {
                        Iterator it3 = arrayList10.iterator();
                        while (it3.hasNext()) {
                            if (PX.y((C0981eb) it3.next(), i).equals(y)) {
                                arrayList = arrayList10;
                                c1216i8 = c1216i86;
                            }
                        }
                    }
                    arrayList = arrayList10;
                    arrayList.add(c0567Vt4);
                    c1216i8 = c1216i86;
                    ((C1198hu) c1216i8.i).g.getClass();
                } else {
                    interfaceC1245ib = interfaceC1245ib3;
                    cls = cls2;
                    arrayList = arrayList4;
                    i = 2;
                    c1216i8 = c1216i85;
                    c2217xM = c2217xM2;
                    c1216i82 = c1216i83;
                    str = "PROTECTED_AND_PACKAGE";
                    str2 = "classDescriptor.visibility";
                }
                ((C1097gL) ((C1198hu) c1216i8.i).x).getClass();
                AbstractC0048Bt.n(c1216i8, "_context_receiver_0");
                InterfaceC1245ib interfaceC1245ib4 = interfaceC1245ib;
                AbstractC0048Bt.n(interfaceC1245ib4, "thisDescriptor");
                C0218Ih c0218Ih = ((C1198hu) c1216i8.i).r;
                if (arrayList.isEmpty()) {
                    boolean isAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (isAnnotation) {
                        C1216i8 c1216i87 = c1216i82;
                        C1198hu c1198hu2 = (C1198hu) c1216i87.i;
                        C0950e6 c0950e62 = (C0950e6) c1216i87.m;
                        C2217xM c2217xM3 = c2217xM;
                        C0567Vt Y03 = C0567Vt.Y0(interfaceC1245ib4, c1672p4, true, c1198hu2.j.H0(c2217xM3));
                        if (isAnnotation) {
                            List d2 = c2217xM3.d();
                            ArrayList arrayList11 = new ArrayList(d2.size());
                            C1658ou J2 = AbstractC1305jX.J(i, true, null, 6);
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = new ArrayList();
                            for (Object obj : d2) {
                                if (AbstractC0048Bt.h(((GM) obj).c(), AbstractC0438Qu.b)) {
                                    arrayList12.add(obj);
                                } else {
                                    arrayList13.add(obj);
                                }
                            }
                            arrayList12.size();
                            GM gm = (GM) AbstractC0720ac.p0(arrayList12);
                            if (gm != null) {
                                KM f2 = gm.f();
                                if (f2 instanceof C1821rM) {
                                    C1821rM c1821rM = (C1821rM) f2;
                                    z2 = true;
                                    c1619oH = new C1619oH(c0950e62.R(c1821rM, J2, true), c0950e62.S(c1821rM.b, J2));
                                } else {
                                    z2 = true;
                                    c1619oH = new C1619oH(c0950e62.S(f2, J2), null);
                                }
                                AbstractC1004ey abstractC1004ey = (AbstractC1004ey) c1619oH.h;
                                AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) c1619oH.i;
                                interfaceC1245ib2 = interfaceC1245ib4;
                                c0567Vt = Y03;
                                arrayList2 = arrayList13;
                                z = z2;
                                c0950e6 = c0950e62;
                                arrayList3 = arrayList11;
                                c0494Sy = c0494Sy4;
                                c0494Sy.x(arrayList3, c0567Vt, 0, gm, abstractC1004ey, abstractC1004ey2);
                            } else {
                                interfaceC1245ib2 = interfaceC1245ib4;
                                c0567Vt = Y03;
                                c0950e6 = c0950e62;
                                arrayList2 = arrayList13;
                                z = true;
                                arrayList3 = arrayList11;
                                c0494Sy = c0494Sy4;
                            }
                            int i4 = gm != null ? z : 0;
                            Iterator it4 = arrayList2.iterator();
                            int i5 = 0;
                            while (it4.hasNext()) {
                                GM gm2 = (GM) it4.next();
                                c0494Sy.x(arrayList3, c0567Vt, i5 + i4, gm2, c0950e6.S(gm2.f(), J2), null);
                                i5++;
                            }
                            list2 = arrayList3;
                        } else {
                            interfaceC1245ib2 = interfaceC1245ib4;
                            c0567Vt = Y03;
                            z = true;
                            list2 = Collections.EMPTY_LIST;
                        }
                        c0567Vt.Q0(false);
                        C0244Jh visibility2 = interfaceC1245ib2.getVisibility();
                        AbstractC0048Bt.m(visibility2, str2);
                        if (visibility2.equals(AbstractC0671Zt.b)) {
                            visibility2 = AbstractC0671Zt.c;
                            AbstractC0048Bt.m(visibility2, str);
                        }
                        c0567Vt.V0(list2, visibility2);
                        c0567Vt.P0(z);
                        c0567Vt.R0(interfaceC1245ib2.i());
                        ((C1198hu) c1216i87.i).g.getClass();
                        c0567Vt2 = c0567Vt;
                    } else {
                        c0567Vt2 = null;
                    }
                    list = AbstractC0868ct.L(c0567Vt2);
                } else {
                    list = arrayList;
                }
                return AbstractC0720ac.J0(c0218Ih.q(c1216i8, list));
            default:
                C1216i8 c1216i88 = this.i;
                EU eu = ((C1198hu) c1216i88.i).x;
                InterfaceC1245ib interfaceC1245ib5 = this.j.n;
                ((C1097gL) eu).getClass();
                AbstractC0048Bt.n(c1216i88, "_context_receiver_0");
                AbstractC0048Bt.n(interfaceC1245ib5, "thisDescriptor");
                return AbstractC0720ac.M0(new ArrayList());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0442Qy(C0494Sy c0494Sy, C1216i8 c1216i8) {
        super(0);
        this.j = c0494Sy;
        this.i = c1216i8;
    }
}
