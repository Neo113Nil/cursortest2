package o;

import android.content.res.Configuration;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400l extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1400l(int i, Object obj) {
        super(1);
        this.h = i;
        this.i = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0469, code lost:
    
        if (r2.equals("hashCode") == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04b3, code lost:
    
        r0 = ((java.util.ArrayList) r0.g()).isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04b1, code lost:
    
        if (r2.equals("toString") != false) goto L222;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c4  */
    /* JADX WARN: Type inference failed for: r0v153, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v108, types: [o.ny, o.vp] */
    /* JADX WARN: Type inference failed for: r2v49, types: [o.ny, o.vp] */
    /* JADX WARN: Type inference failed for: r3v49, types: [o.aI, o.l2] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC2114vp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C0745b0 c0745b0;
        AbstractC1782qm p;
        AbstractC1782qm p2;
        boolean z;
        boolean z2;
        Object obj2;
        C1097gL c1097gL;
        C0321Mh a;
        LX lx;
        Object next;
        boolean z3 = false;
        boolean z4 = false;
        r3 = false;
        boolean z5 = false;
        z3 = false;
        z3 = false;
        C2382zt c2382zt = null;
        switch (this.h) {
            case 0:
                OM om = (OM) obj;
                AbstractC0048Bt.n(om, "kotlinClass");
                C1343k5 c1343k5 = (C1343k5) this.i;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                C2002u5 c2002u5 = new C2002u5(c1343k5, hashMap, hashMap2);
                Class cls = om.a;
                String str = "annotations";
                String str2 = "sb.toString()";
                String str3 = "parameterType";
                AbstractC0048Bt.n(cls, "klass");
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0048Bt.m(declaredMethods, "klass.declaredMethods");
                int length = declaredMethods.length;
                int i = 0;
                while (i < length) {
                    Method method = declaredMethods[i];
                    C0827cE e = C0827cE.e(method.getName());
                    Class cls2 = cls;
                    StringBuilder sb = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Method[] methodArr = declaredMethods;
                    AbstractC0048Bt.m(parameterTypes, "method.parameterTypes");
                    int length2 = parameterTypes.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        int i3 = i2;
                        Class<?> cls3 = parameterTypes[i3];
                        AbstractC0048Bt.m(cls3, "parameterType");
                        sb.append(AbstractC1492mM.b(cls3));
                        i2 = i3 + 1;
                    }
                    sb.append(")");
                    Class<?> returnType = method.getReturnType();
                    AbstractC0048Bt.m(returnType, "method.returnType");
                    sb.append(AbstractC1492mM.b(returnType));
                    String sb2 = sb.toString();
                    AbstractC0048Bt.m(sb2, "sb.toString()");
                    C1334k f0 = c2002u5.f0(e, sb2);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    AbstractC0048Bt.m(declaredAnnotations, "method.declaredAnnotations");
                    int length3 = declaredAnnotations.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        Annotation[] annotationArr = declaredAnnotations;
                        Annotation annotation = annotationArr[i4];
                        AbstractC0048Bt.m(annotation, "annotation");
                        AbstractC0048Bt.Q(f0, annotation);
                        i4++;
                        declaredAnnotations = annotationArr;
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    AbstractC0048Bt.m(parameterAnnotations, "method.parameterAnnotations");
                    Annotation[][] annotationArr2 = parameterAnnotations;
                    int length4 = annotationArr2.length;
                    int i5 = 0;
                    while (i5 < length4) {
                        Annotation[] annotationArr3 = annotationArr2[i5];
                        AbstractC0048Bt.m(annotationArr3, "annotations");
                        Annotation[][] annotationArr4 = annotationArr2;
                        int length5 = annotationArr3.length;
                        int i6 = length4;
                        int i7 = 0;
                        while (i7 < length5) {
                            int i8 = length5;
                            Annotation annotation2 = annotationArr3[i7];
                            int i9 = i7;
                            Class D = AbstractC1473m3.D(AbstractC1473m3.B(annotation2));
                            int i10 = length;
                            int i11 = i;
                            C1370kW I = f0.I(i5, AbstractC1492mM.a(D), new C1426lM(annotation2));
                            if (I != null) {
                                AbstractC0048Bt.R(I, annotation2, D);
                            }
                            i7 = i9 + 1;
                            length5 = i8;
                            length = i10;
                            i = i11;
                        }
                        i5++;
                        annotationArr2 = annotationArr4;
                        length4 = i6;
                    }
                    f0.h();
                    i++;
                    declaredMethods = methodArr;
                    cls = cls2;
                }
                Class cls4 = cls;
                Constructor<?>[] declaredConstructors = cls4.getDeclaredConstructors();
                AbstractC0048Bt.m(declaredConstructors, "klass.declaredConstructors");
                int length6 = declaredConstructors.length;
                int i12 = 0;
                while (i12 < length6) {
                    Constructor<?> constructor = declaredConstructors[i12];
                    C0827cE c0827cE = YS.e;
                    AbstractC0048Bt.m(constructor, "constructor");
                    StringBuilder sb3 = new StringBuilder("(");
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    Constructor<?>[] constructorArr = declaredConstructors;
                    AbstractC0048Bt.m(parameterTypes2, "constructor.parameterTypes");
                    int length7 = parameterTypes2.length;
                    int i13 = length6;
                    int i14 = 0;
                    while (i14 < length7) {
                        int i15 = length7;
                        Class<?> cls5 = parameterTypes2[i14];
                        AbstractC0048Bt.m(cls5, str3);
                        sb3.append(AbstractC1492mM.b(cls5));
                        i14++;
                        length7 = i15;
                    }
                    sb3.append(")V");
                    String sb4 = sb3.toString();
                    AbstractC0048Bt.m(sb4, str2);
                    C1334k f02 = c2002u5.f0(c0827cE, sb4);
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    AbstractC0048Bt.m(declaredAnnotations2, "constructor.declaredAnnotations");
                    for (Annotation annotation3 : declaredAnnotations2) {
                        AbstractC0048Bt.m(annotation3, "annotation");
                        AbstractC0048Bt.Q(f02, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    AbstractC0048Bt.m(parameterAnnotations2, "parameterAnnotations");
                    if (parameterAnnotations2.length != 0) {
                        int length8 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length9 = parameterAnnotations2.length;
                        int i16 = 0;
                        while (i16 < length9) {
                            Annotation[] annotationArr5 = parameterAnnotations2[i16];
                            AbstractC0048Bt.m(annotationArr5, str);
                            Annotation[][] annotationArr6 = parameterAnnotations2;
                            int length10 = annotationArr5.length;
                            String str4 = str;
                            int i17 = 0;
                            while (i17 < length10) {
                                int i18 = length10;
                                Annotation annotation4 = annotationArr5[i17];
                                int i19 = i17;
                                Class D2 = AbstractC1473m3.D(AbstractC1473m3.B(annotation4));
                                int i20 = i12;
                                String str5 = str2;
                                String str6 = str3;
                                C1370kW I2 = f02.I(i16 + length8, AbstractC1492mM.a(D2), new C1426lM(annotation4));
                                if (I2 != null) {
                                    AbstractC0048Bt.R(I2, annotation4, D2);
                                }
                                i17 = i19 + 1;
                                length10 = i18;
                                i12 = i20;
                                str2 = str5;
                                str3 = str6;
                            }
                            i16++;
                            parameterAnnotations2 = annotationArr6;
                            str = str4;
                        }
                    }
                    String str7 = str;
                    int i21 = i12;
                    String str8 = str2;
                    String str9 = str3;
                    f02.h();
                    i12 = i21 + 1;
                    declaredConstructors = constructorArr;
                    length6 = i13;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                }
                Field[] declaredFields = cls4.getDeclaredFields();
                AbstractC0048Bt.m(declaredFields, "klass.declaredFields");
                int length11 = declaredFields.length;
                int i22 = 0;
                while (i22 < length11) {
                    Field field = declaredFields[i22];
                    C0827cE e2 = C0827cE.e(field.getName());
                    Class<?> type = field.getType();
                    AbstractC0048Bt.m(type, "field.type");
                    String b = AbstractC1492mM.b(type);
                    AbstractC0048Bt.n(b, "desc");
                    String b2 = e2.b();
                    AbstractC0048Bt.m(b2, "name.asString()");
                    YB yb = new YB(b2 + '#' + b);
                    ArrayList arrayList = new ArrayList();
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    AbstractC0048Bt.m(declaredAnnotations3, "field.declaredAnnotations");
                    int length12 = declaredAnnotations3.length;
                    int i23 = 0;
                    while (i23 < length12) {
                        Annotation annotation5 = declaredAnnotations3[i23];
                        AbstractC0048Bt.m(annotation5, "annotation");
                        Class D3 = AbstractC1473m3.D(AbstractC1473m3.B(annotation5));
                        Field[] fieldArr = declaredFields;
                        int i24 = length11;
                        C1370kW y = ((C1343k5) c2002u5.i).y(AbstractC1492mM.a(D3), new C1426lM(annotation5), arrayList);
                        if (y != null) {
                            AbstractC0048Bt.R(y, annotation5, D3);
                        }
                        i23++;
                        declaredFields = fieldArr;
                        length11 = i24;
                    }
                    Field[] fieldArr2 = declaredFields;
                    int i25 = length11;
                    if (!arrayList.isEmpty()) {
                        ((HashMap) c2002u5.j).put(yb, arrayList);
                    }
                    i22++;
                    declaredFields = fieldArr2;
                    length11 = i25;
                }
                return new C1204i(hashMap, hashMap2, hashMap3);
            case 1:
                C2245xo c2245xo = (C2245xo) obj;
                AbstractC0048Bt.n(c2245xo, "fqName");
                C0739av c0739av = (C0739av) this.i;
                W8 c = c0739av.c(c2245xo);
                if (c == null) {
                    return null;
                }
                C0296Lh c0296Lh = c0739av.c;
                if (c0296Lh != null) {
                    c.I0(c0296Lh);
                    return c;
                }
                AbstractC0048Bt.i0("components");
                throw null;
            case 2:
                C0745b0 c0745b02 = (C0745b0) obj;
                AbstractC0048Bt.n(c0745b02, "it");
                C1987tu c1987tu = c0745b02.b;
                InterfaceC1266iy interfaceC1266iy = c0745b02.a;
                DR dr = (DR) this.i;
                if (dr.e) {
                    if (((interfaceC1266iy == null || (p2 = PX.p(interfaceC1266iy)) == null || !(p2 instanceof C2216xL)) ? null : (C2216xL) p2) != null) {
                        return null;
                    }
                }
                if (interfaceC1266iy == null) {
                    return null;
                }
                JR q = PX.q(interfaceC1266iy);
                if (q == null && ((p = PX.p(interfaceC1266iy)) == null || (q = PX.v0(p)) == null)) {
                    q = PX.q(interfaceC1266iy);
                    AbstractC0048Bt.k(q);
                }
                SW Q0 = PX.Q0(q);
                if (Q0 == null) {
                    return null;
                }
                List parameters = Q0.getParameters();
                AbstractC0048Bt.m(parameters, "this.parameters");
                if (!(interfaceC1266iy instanceof AbstractC1004ey)) {
                    StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb5.append(interfaceC1266iy);
                    sb5.append(", ");
                    throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb5).toString());
                }
                List w0 = ((AbstractC1004ey) interfaceC1266iy).w0();
                Iterator it = parameters.iterator();
                Iterator it2 = w0.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0786bc.d0(parameters), AbstractC0786bc.d0(w0)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next2 = it.next();
                    AbstractC1701pX abstractC1701pX = (AbstractC1701pX) it2.next();
                    InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) next2;
                    if (PX.q0(abstractC1701pX)) {
                        c0745b0 = new C0745b0(null, c1987tu, interfaceC1437lX);
                    } else {
                        AbstractC2097vY U = PX.U(abstractC1701pX);
                        c0745b0 = new C0745b0(U, ((C1198hu) dr.c.i).q.b(c1987tu, U.getAnnotations()), interfaceC1437lX);
                    }
                    arrayList2.add(c0745b0);
                }
                return arrayList2;
            case 3:
                AbstractC2097vY abstractC2097vY = (AbstractC2097vY) obj;
                AbstractC0048Bt.m(abstractC2097vY, "type");
                if (!AbstractC1473m3.P(abstractC2097vY)) {
                    C1316ji c1316ji = (C1316ji) this.i;
                    InterfaceC2364zb c2 = abstractC2097vY.B0().c();
                    if ((c2 instanceof InterfaceC1437lX) && !AbstractC0048Bt.h(((InterfaceC1437lX) c2).n(), c1316ji)) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 4:
                C1073g0 c1073g0 = (C1073g0) obj;
                AbstractC0048Bt.n(c1073g0, "supertypes");
                AbstractC1205i0 abstractC1205i0 = (AbstractC1205i0) this.i;
                C1097gL g = abstractC1205i0.g();
                Collection collection = c1073g0.a;
                g.getClass();
                AbstractC0048Bt.n(collection, "superTypes");
                boolean isEmpty = collection.isEmpty();
                Collection collection2 = collection;
                if (isEmpty) {
                    AbstractC1004ey f = abstractC1205i0.f();
                    Collection J = f != null ? AbstractC0868ct.J(f) : null;
                    if (J == null) {
                        J = C1318jk.h;
                    }
                    collection2 = J;
                }
                List list = collection2 instanceof List ? (List) collection2 : null;
                if (list == null) {
                    list = AbstractC0720ac.J0(collection2);
                }
                List j = abstractC1205i0.j(list);
                AbstractC0048Bt.n(j, "<set-?>");
                c1073g0.b = j;
                return C0782bY.a;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC1405l2 interfaceC1405l2 = (InterfaceC1405l2) obj;
                C0053By c0053By = (C0053By) this.i;
                if (interfaceC1405l2.s()) {
                    if (interfaceC1405l2.z().b) {
                        interfaceC1405l2.r();
                    }
                    for (Map.Entry entry : interfaceC1405l2.z().g.entrySet()) {
                        C0053By.a(c0053By, (AbstractC2248xr) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC1405l2.n());
                    }
                    ME me = interfaceC1405l2.n().n;
                    AbstractC0048Bt.k(me);
                    while (!me.equals(c0053By.a.n())) {
                        for (AbstractC2248xr abstractC2248xr : c0053By.b(me).keySet()) {
                            C0053By.a(c0053By, abstractC2248xr, c0053By.c(me, abstractC2248xr), me);
                        }
                        me = me.n;
                        AbstractC0048Bt.k(me);
                    }
                }
                return C0782bY.a;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                ((TD) this.i).setValue(new Configuration((Configuration) obj));
                return C0782bY.a;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1539n3((C0322Mi) this.i);
            case 8:
                InterfaceC0761bD interfaceC0761bD = (InterfaceC0761bD) obj;
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                return interfaceC0761bD.l().h(((AbstractC0545Ux) this.i).u());
            case 9:
                AbstractC0048Bt.n((InterfaceC2204x9) obj, "it");
                return Boolean.valueOf(WS.i.containsKey(PX.z((HR) this.i)));
            case 10:
                GM gm = (GM) obj;
                AbstractC0048Bt.n(gm, "m");
                if (((Boolean) ((C1179hb) this.i).b.invoke(gm)).booleanValue()) {
                    Class<?> declaringClass = ((Method) gm.b()).getDeclaringClass();
                    AbstractC0048Bt.m(declaringClass, "member.declaringClass");
                    if (declaringClass.isInterface()) {
                        String b3 = gm.c().b();
                        int hashCode = b3.hashCode();
                        if (hashCode == -1776922004) {
                            break;
                        } else {
                            if (hashCode != -1295482945) {
                                if (hashCode == 147696667) {
                                    break;
                                }
                            } else if (b3.equals("equals")) {
                                MM mm = (MM) AbstractC0720ac.F0(gm.g());
                                KM km = mm != null ? mm.a : null;
                                C2349zM c2349zM = km instanceof C2349zM ? (C2349zM) km : null;
                                if (c2349zM != null) {
                                    BM bm = c2349zM.b;
                                    if ((bm instanceof C2217xM) && ((C2217xM) bm).c().b().equals("java.lang.Object")) {
                                        z2 = true;
                                    }
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            z = true;
                            if (!z) {
                                z5 = true;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
                return Boolean.valueOf(z5);
            case 11:
                C1507mb c1507mb = (C1507mb) obj;
                AbstractC0048Bt.n(c1507mb, "key");
                C1573nb c1573nb = (C1573nb) this.i;
                C1639ob c1639ob = c1507mb.a;
                C0296Lh c0296Lh2 = c1573nb.a;
                Iterator it3 = c0296Lh2.k.iterator();
                while (it3.hasNext()) {
                    InterfaceC1245ib a2 = ((InterfaceC1375kb) it3.next()).a(c1639ob);
                    if (a2 != null) {
                        return a2;
                    }
                }
                if (C1573nb.c.contains(c1639ob)) {
                    return null;
                }
                C1047fb c1047fb = c1507mb.b;
                if (c1047fb == null && (c1047fb = c0296Lh2.d.q(c1639ob)) == null) {
                    return null;
                }
                InterfaceC0893dE interfaceC0893dE = c1047fb.a;
                C1030fK c1030fK = c1047fb.b;
                AbstractC1478m8 abstractC1478m8 = c1047fb.c;
                IS is = c1047fb.d;
                C1639ob f2 = c1639ob.f();
                if (f2 != null) {
                    InterfaceC1245ib a3 = c1573nb.a(f2, null);
                    C0581Wh c0581Wh = a3 instanceof C0581Wh ? (C0581Wh) a3 : null;
                    if (c0581Wh == null) {
                        return null;
                    }
                    C0827cE i26 = c1639ob.i();
                    AbstractC0048Bt.m(i26, "classId.shortClassName");
                    if (!c0581Wh.w0().m().contains(i26)) {
                        return null;
                    }
                    a = c0581Wh.s;
                } else {
                    InterfaceC1159hH interfaceC1159hH = c0296Lh2.f;
                    C2245xo g2 = c1639ob.g();
                    AbstractC0048Bt.m(g2, "classId.packageFqName");
                    Iterator it4 = EB.J(interfaceC1159hH, g2).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            InterfaceC0961eH interfaceC0961eH = (InterfaceC0961eH) obj2;
                            if (interfaceC0961eH instanceof W8) {
                                W8 w8 = (W8) interfaceC0961eH;
                                C0827cE i27 = c1639ob.i();
                                AbstractC0048Bt.m(i27, "classId.shortClassName");
                                w8.getClass();
                                if (((AbstractC1054fi) w8.r0()).m().contains(i27)) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    InterfaceC0961eH interfaceC0961eH2 = (InterfaceC0961eH) obj2;
                    if (interfaceC0961eH2 == null) {
                        return null;
                    }
                    SK sk = c1030fK.L;
                    AbstractC0048Bt.m(sk, "classProto.typeTable");
                    C0695aD c0695aD = new C0695aD(sk);
                    ZK zk = c1030fK.N;
                    AbstractC0048Bt.m(zk, "classProto.versionRequirementTable");
                    if (zk.i.size() == 0) {
                        c1097gL = C1097gL.p;
                    } else {
                        AbstractC0048Bt.m(zk.i, "table.requirementList");
                        c1097gL = new C1097gL(9);
                    }
                    a = c0296Lh2.a(interfaceC0961eH2, interfaceC0893dE, c0695aD, c1097gL, abstractC1478m8, null);
                }
                return new C0581Wh(a, c1030fK, interfaceC0893dE, abstractC1478m8, is);
            case 12:
                InterfaceC0761bD interfaceC0761bD2 = (InterfaceC0761bD) obj;
                AbstractC0048Bt.n(interfaceC0761bD2, "it");
                return interfaceC0761bD2.l().q((EnumC1423lJ) this.i);
            case 13:
                Throwable th = (Throwable) obj;
                C0657Zf c0657Zf = (C0657Zf) this.i;
                if (th != null) {
                    c0657Zf.n.d0(new C0796bm(th));
                }
                if (c0657Zf.p.i != C1097gL.f168o) {
                    ((LF) c0657Zf.p.getValue()).close();
                }
                return C0782bY.a;
            case 14:
                C1907sg.i.removeFrameCallback((O3) this.i);
                return C0782bY.a;
            case 15:
                if (!((C0727aj) obj).m) {
                    return EnumC2359zW.i;
                }
                C1098gM c1098gM = (C1098gM) this.i;
                c1098gM.h = c1098gM.h;
                return EnumC2359zW.h;
            case 16:
                JX jx = (JX) obj;
                C0535Un c0535Un = (C0535Un) this.i;
                JX jx2 = new JX(null, jx.b, jx.c, jx.d, jx.e);
                KX kx = c0535Un.a;
                C0810c0 c0810c0 = new C0810c0(c0535Un, 8, jx2);
                synchronized (((C0218Ih) kx.h)) {
                    lx = (LX) ((C0557Vj) kx.i).a(jx2);
                    if (lx != null) {
                        if (!lx.i) {
                        }
                    }
                    try {
                        lx = (LX) c0810c0.invoke(new C0810c0(kx, 17, jx2));
                        synchronized (((C0218Ih) kx.h)) {
                            if (((C0557Vj) kx.i).a(jx2) == null && lx.i) {
                                ((C0557Vj) kx.i).b(jx2, lx);
                            }
                        }
                    } catch (Exception e3) {
                        throw new IllegalStateException("Could not load font", e3);
                    }
                }
                return lx.h;
            case 17:
                List list2 = (List) this.i;
                int size = list2.size();
                for (int i28 = 0; i28 < size; i28++) {
                    ((InterfaceC2114vp) list2.get(i28)).invoke(obj);
                }
                return C0782bY.a;
            case 18:
                C0782bY c0782bY = C0782bY.a;
                if (AbstractC0253Jq.b.compareAndSet(false, true)) {
                    ((J8) this.i).f(c0782bY);
                }
                return c0782bY;
            case 19:
                ((C0512Tq) this.i).d.invoke((InterfaceC1121gj) obj);
                return C0782bY.a;
            case 20:
                InterfaceC1121gj interfaceC1121gj = (InterfaceC1121gj) obj;
                C0564Vq c0564Vq = (C0564Vq) this.i;
                InterfaceC0980ea Q = interfaceC1121gj.l().Q();
                InterfaceC2312yp interfaceC2312yp = c0564Vq.k;
                if (interfaceC2312yp != null) {
                    interfaceC2312yp.invoke(Q, (C0512Tq) interfaceC1121gj.l().i);
                }
                return C0782bY.a;
            case 21:
                C1398ky c1398ky = (C1398ky) obj;
                AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
                C2382zt c2382zt2 = (C2382zt) this.i;
                LinkedHashSet linkedHashSet = c2382zt2.b;
                ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(linkedHashSet));
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((AbstractC1004ey) it5.next()).D0(c1398ky));
                    z4 = true;
                }
                if (z4) {
                    AbstractC1004ey abstractC1004ey = c2382zt2.a;
                    AbstractC1004ey D0 = abstractC1004ey != null ? abstractC1004ey.D0(c1398ky) : null;
                    arrayList3.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList3);
                    linkedHashSet2.hashCode();
                    C2382zt c2382zt3 = new C2382zt(linkedHashSet2);
                    c2382zt3.a = D0;
                    c2382zt = c2382zt3;
                }
                if (c2382zt != null) {
                    c2382zt2 = c2382zt;
                }
                return c2382zt2.e();
            case 22:
                C1558nM c1558nM = (C1558nM) obj;
                AbstractC0048Bt.n(c1558nM, "annotation");
                C0827cE c0827cE2 = AbstractC0463Rt.a;
                C0338My c0338My = (C0338My) this.i;
                return AbstractC0463Rt.b(c0338My.h, c1558nM, c0338My.j);
            case 23:
                AbstractC0048Bt.n((C1398ky) obj, "it");
                C0390Oy c0390Oy = (C0390Oy) this.i;
                return new C0494Sy(c0390Oy.q, c0390Oy, c0390Oy.f79o, c0390Oy.p != null, c0390Oy.x);
            case 24:
                LM lm = (LM) obj;
                AbstractC0048Bt.n(lm, "typeParameter");
                C1333jz c1333jz = (C1333jz) this.i;
                Integer num = (Integer) ((LinkedHashMap) c1333jz.k).get(lm);
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                C1216i8 c1216i8 = (C1216i8) c1333jz.i;
                InterfaceC1249ig interfaceC1249ig = (InterfaceC1249ig) c1333jz.j;
                AbstractC0048Bt.n(c1216i8, "<this>");
                return new C1267iz(AbstractC0048Bt.y(new C1216i8((C1198hu) c1216i8.i, c1333jz, c1216i8.k), interfaceC1249ig.getAnnotations()), lm, c1333jz.h + intValue, interfaceC1249ig);
            case 25:
                C2245xo c2245xo2 = (C2245xo) obj;
                AbstractC0048Bt.n(c2245xo2, "fqName");
                C0826cD c0826cD = (C0826cD) this.i;
                InterfaceC1421lH interfaceC1421lH = c0826cD.m;
                VA va = c0826cD.j;
                ((C1355kH) interfaceC1421lH).getClass();
                AbstractC0048Bt.n(va, "storageManager");
                return new C1465lz(c0826cD, c2245xo2, va);
            case 26:
                ((YD) this.i).b((SC) obj);
                return Boolean.TRUE;
            case 27:
                C2245xo c2245xo3 = (C2245xo) obj;
                AbstractC0048Bt.m(c2245xo3, "it");
                ?? r0 = ((C0208Hx) this.i).i;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : r0.entrySet()) {
                    C2245xo c2245xo4 = (C2245xo) entry2.getKey();
                    if (!c2245xo3.equals(c2245xo4)) {
                        AbstractC0048Bt.n(c2245xo4, "packageName");
                        if (AbstractC0048Bt.h(c2245xo3.d() ? null : c2245xo3.e(), c2245xo4)) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it6 = linkedHashMap.entrySet().iterator();
                if (it6.hasNext()) {
                    next = it6.next();
                    if (it6.hasNext()) {
                        int length13 = AbstractC0048Bt.g0((C2245xo) ((Map.Entry) next).getKey(), c2245xo3).b().length();
                        do {
                            Object next3 = it6.next();
                            int length14 = AbstractC0048Bt.g0((C2245xo) ((Map.Entry) next3).getKey(), c2245xo3).b().length();
                            if (length13 > length14) {
                                next = next3;
                                length13 = length14;
                            }
                        } while (it6.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry3 = (Map.Entry) next;
                if (entry3 != null) {
                    return entry3.getValue();
                }
                return null;
            case 28:
                return obj == ((HD) this.i) ? "(this)" : String.valueOf(obj);
            default:
                C1630oS c1630oS = (C1630oS) this.i;
                AbstractC0048Bt.m(obj, "it");
                c1630oS.add(obj);
                return C0782bY.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400l(Y1 y1, C0727aj c0727aj, C1098gM c1098gM) {
        super(1);
        this.h = 15;
        this.i = c1098gM;
    }
}
