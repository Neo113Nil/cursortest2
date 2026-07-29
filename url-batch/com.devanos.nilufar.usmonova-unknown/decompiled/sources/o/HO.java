package o;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class HO implements Z1, Configurator, InterfaceC0920df, IR, InterfaceC1847rm, CC, InterfaceC0163Ge, InterfaceC1160hI {
    public static HO i;
    public static C0385Ot y;
    public final /* synthetic */ int h;
    public static final HO j = new HO(1);
    public static final HO k = new HO(2);
    public static final HO l = new HO(3);
    public static final HO m = new HO(4);
    public static final HO n = new HO(6);

    /* renamed from: o, reason: collision with root package name */
    public static final HO f44o = new HO(7);
    public static final HO p = new HO(8);
    public static final HO q = new HO(9);
    public static final HO r = new HO(10);
    public static final HO s = new HO(11);
    public static final HO t = new HO(12);
    public static final HO u = new HO(13);
    public static final HO v = new HO(14);
    public static final HO w = new HO(15);
    public static final HO x = new HO(16);
    public static final HO z = new HO(17);
    public static final HO A = new HO(18);
    public static final HO B = new HO(20);
    public static final HO C = new HO(22);
    public static final HO D = new HO(23);
    public static final /* synthetic */ HO E = new HO(24);
    public static final HO F = new HO(25);
    public static final HO G = new HO(26);
    public static final HO H = new HO(27);
    public static final HO I = new HO(28);
    public static final HO J = new HO(29);

    public /* synthetic */ HO(int i2) {
        this.h = i2;
    }

    public static InterfaceC1245ib j(InterfaceC1245ib interfaceC1245ib) {
        C2377zo g = AbstractC0114Eh.g(interfaceC1245ib);
        String str = C1460lu.a;
        C2245xo c2245xo = (C2245xo) C1460lu.k.get(g);
        if (c2245xo != null) {
            return AbstractC0192Hh.e(interfaceC1245ib).i(c2245xo);
        }
        throw new IllegalArgumentException("Given class " + interfaceC1245ib + " is not a read-only collection");
    }

    public static O6 k(List list, InterfaceC0761bD interfaceC0761bD, EnumC1423lJ enumC1423lJ) {
        List J0 = AbstractC0720ac.J0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = J0.iterator();
        while (it.hasNext()) {
            AbstractC0551Vd l2 = l(it.next(), null);
            if (l2 != null) {
                arrayList.add(l2);
            }
        }
        return interfaceC0761bD != null ? new AX(arrayList, interfaceC0761bD.l().q(enumC1423lJ)) : new O6(arrayList, new C1400l(12, enumC1423lJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [o.jk] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static AbstractC0551Vd l(Object obj, C0826cD c0826cD) {
        if (obj instanceof Byte) {
            return new C1413l9(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C1563nR(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C1525mt(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C1283jB(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new C0444Ra(ch);
        }
        if (obj instanceof Float) {
            return new C1742q8(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C1742q8(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new C1742q8(bool);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            AbstractC0048Bt.n(str, "value");
            return new ST(str);
        }
        boolean z2 = obj instanceof byte[];
        ?? r1 = C1318jk.h;
        int i2 = 0;
        if (z2) {
            byte[] bArr = (byte[]) obj;
            AbstractC0048Bt.n(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    r1 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i2 < length2) {
                        r1.add(Byte.valueOf(bArr[i2]));
                        i2++;
                    }
                } else {
                    r1 = AbstractC0868ct.J(Byte.valueOf(bArr[0]));
                }
            }
            return k(r1, c0826cD, EnumC1423lJ.f193o);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            AbstractC0048Bt.n(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    r1 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i2 < length4) {
                        r1.add(Short.valueOf(sArr[i2]));
                        i2++;
                    }
                } else {
                    r1 = AbstractC0868ct.J(Short.valueOf(sArr[0]));
                }
            }
            return k(r1, c0826cD, EnumC1423lJ.p);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            AbstractC0048Bt.n(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    r1 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i2 < length6) {
                        r1.add(Integer.valueOf(iArr[i2]));
                        i2++;
                    }
                } else {
                    r1 = AbstractC0868ct.J(Integer.valueOf(iArr[0]));
                }
            }
            return k(r1, c0826cD, EnumC1423lJ.q);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            AbstractC0048Bt.n(jArr, "<this>");
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    r1 = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i2 < length8) {
                        r1.add(Long.valueOf(jArr[i2]));
                        i2++;
                    }
                } else {
                    r1 = AbstractC0868ct.J(Long.valueOf(jArr[0]));
                }
            }
            return k(r1, c0826cD, EnumC1423lJ.s);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            AbstractC0048Bt.n(cArr, "<this>");
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    r1 = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i2 < length10) {
                        r1.add(Character.valueOf(cArr[i2]));
                        i2++;
                    }
                } else {
                    r1 = AbstractC0868ct.J(Character.valueOf(cArr[0]));
                }
            }
            return k(r1, c0826cD, EnumC1423lJ.n);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            AbstractC0048Bt.n(fArr, "<this>");
            int length11 = fArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    r1 = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i2 < length12) {
                        r1.add(Float.valueOf(fArr[i2]));
                        i2++;
                    }
                } else {
                    r1 = AbstractC0868ct.J(Float.valueOf(fArr[0]));
                }
            }
            return k(r1, c0826cD, EnumC1423lJ.r);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            AbstractC0048Bt.n(dArr, "<this>");
            int length13 = dArr.length;
            if (length13 != 0) {
                if (length13 != 1) {
                    r1 = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i2 < length14) {
                        r1.add(Double.valueOf(dArr[i2]));
                        i2++;
                    }
                } else {
                    r1 = AbstractC0868ct.J(Double.valueOf(dArr[0]));
                }
            }
            return k(r1, c0826cD, EnumC1423lJ.t);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C1880sF(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        AbstractC0048Bt.n(zArr, "<this>");
        int length15 = zArr.length;
        if (length15 != 0) {
            if (length15 != 1) {
                r1 = new ArrayList(zArr.length);
                int length16 = zArr.length;
                while (i2 < length16) {
                    r1.add(Boolean.valueOf(zArr[i2]));
                    i2++;
                }
            } else {
                r1 = AbstractC0868ct.J(Boolean.valueOf(zArr[0]));
            }
        }
        return k(r1, c0826cD, EnumC1423lJ.m);
    }

    public static final AbstractC2097vY m(JR jr, JR jr2) {
        AbstractC0048Bt.n(jr, "lowerBound");
        AbstractC0048Bt.n(jr2, "upperBound");
        return jr.equals(jr2) ? jr : new C1913sm(jr, jr2);
    }

    public static InterfaceC1245ib o(C2245xo c2245xo, AbstractC0545Ux abstractC0545Ux) {
        AbstractC0048Bt.n(abstractC0545Ux, "builtIns");
        String str = C1460lu.a;
        C1639ob c1639ob = (C1639ob) C1460lu.h.get(c2245xo.i());
        if (c1639ob != null) {
            return abstractC0545Ux.i(c1639ob.b());
        }
        return null;
    }

    public static final JR q(OW ow, InterfaceC1245ib interfaceC1245ib, List list) {
        AbstractC0048Bt.n(ow, "attributes");
        AbstractC0048Bt.n(interfaceC1245ib, "descriptor");
        AbstractC0048Bt.n(list, "arguments");
        SW z2 = interfaceC1245ib.z();
        AbstractC0048Bt.m(z2, "descriptor.typeConstructor");
        return r(list, ow, z2, false);
    }

    public static JR r(List list, OW ow, SW sw, boolean z2) {
        WB c;
        YC yc;
        WB h;
        WB wb;
        WB u2;
        AbstractC0048Bt.n(ow, "attributes");
        AbstractC0048Bt.n(sw, "constructor");
        AbstractC0048Bt.n(list, "arguments");
        if (ow.isEmpty() && list.isEmpty() && !z2 && sw.c() != null) {
            InterfaceC2364zb c2 = sw.c();
            AbstractC0048Bt.k(c2);
            JR i2 = c2.i();
            AbstractC0048Bt.m(i2, "constructor.declarationDescriptor!!.defaultType");
            return i2;
        }
        InterfaceC2364zb c3 = sw.c();
        if (c3 instanceof InterfaceC1437lX) {
            c = ((InterfaceC1437lX) c3).i().r0();
        } else if (c3 instanceof InterfaceC1245ib) {
            AbstractC0192Hh.i(AbstractC0192Hh.j(c3));
            boolean isEmpty = list.isEmpty();
            C1398ky c1398ky = C1398ky.a;
            if (isEmpty) {
                InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) c3;
                AbstractC0048Bt.n(interfaceC1245ib, "<this>");
                yc = interfaceC1245ib instanceof YC ? (YC) interfaceC1245ib : null;
                if (yc != null && (u2 = yc.u(c1398ky)) != null) {
                    wb = u2;
                    return t(ow, sw, list, z2, wb, new C1202hy(list, ow, sw, z2));
                }
                c = interfaceC1245ib.n0();
                AbstractC0048Bt.m(c, "this.unsubstitutedMemberScope");
            } else {
                InterfaceC1245ib interfaceC1245ib2 = (InterfaceC1245ib) c3;
                AbstractC1964tX b = UW.b.b(sw, list);
                AbstractC0048Bt.n(interfaceC1245ib2, "<this>");
                yc = interfaceC1245ib2 instanceof YC ? (YC) interfaceC1245ib2 : null;
                if (yc != null && (h = yc.h(b, c1398ky)) != null) {
                    wb = h;
                    return t(ow, sw, list, z2, wb, new C1202hy(list, ow, sw, z2));
                }
                c = interfaceC1245ib2.d0(b);
                AbstractC0048Bt.m(c, "this.getMemberScope(\n   …ubstitution\n            )");
            }
        } else if (c3 instanceof C1316ji) {
            String str = ((C1316ji) c3).getName().h;
            AbstractC0048Bt.m(str, "descriptor.name.toString()");
            c = C0273Kk.a(4, true, str);
        } else {
            if (!(sw instanceof C2382zt)) {
                throw new IllegalStateException("Unsupported classifier: " + c3 + " for constructor: " + sw);
            }
            c = AbstractC1035fP.c("member scope for intersection type", ((C2382zt) sw).b);
        }
        wb = c;
        return t(ow, sw, list, z2, wb, new C1202hy(list, ow, sw, z2));
    }

    public static final JR s(List list, WB wb, OW ow, SW sw, boolean z2) {
        AbstractC0048Bt.n(ow, "attributes");
        AbstractC0048Bt.n(sw, "constructor");
        AbstractC0048Bt.n(list, "arguments");
        AbstractC0048Bt.n(wb, "memberScope");
        KR kr = new KR(sw, list, z2, wb, new C1202hy(list, wb, ow, sw, z2));
        return ow.isEmpty() ? kr : new NR(kr, ow);
    }

    public static final JR t(OW ow, SW sw, List list, boolean z2, WB wb, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(ow, "attributes");
        AbstractC0048Bt.n(sw, "constructor");
        AbstractC0048Bt.n(list, "arguments");
        AbstractC0048Bt.n(wb, "memberScope");
        KR kr = new KR(sw, list, z2, wb, interfaceC2114vp);
        return ow.isEmpty() ? kr : new NR(kr, ow);
    }

    @Override // o.InterfaceC1160hI
    public boolean a(InterfaceC1245ib interfaceC1245ib, C1251ii c1251ii) {
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        return true;
    }

    @Override // o.InterfaceC1847rm
    public AbstractC1004ey b(MK mk, String str, JR jr, JR jr2) {
        switch (this.h) {
            case 13:
                AbstractC0048Bt.n(mk, "proto");
                AbstractC0048Bt.n(str, "flexibleId");
                AbstractC0048Bt.n(jr, "lowerBound");
                AbstractC0048Bt.n(jr2, "upperBound");
                throw new IllegalArgumentException("This method should not be used.");
            default:
                AbstractC0048Bt.n(mk, "proto");
                AbstractC0048Bt.n(str, "flexibleId");
                AbstractC0048Bt.n(jr, "lowerBound");
                AbstractC0048Bt.n(jr2, "upperBound");
                if (str.equals("kotlin.jvm.PlatformType")) {
                    return mk.l(AbstractC0180Gv.g) ? new C2216xL(jr, jr2) : m(jr, jr2);
                }
                return C0273Kk.c(EnumC0247Jk.t, str, jr.toString(), jr2.toString());
        }
    }

    @Override // o.Z1
    public Collection c(C0827cE c0827cE, InterfaceC1245ib interfaceC1245ib) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        return C1318jk.h;
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(AbstractC0965eL.class, C1411l7.a);
        encoderConfig.registerEncoder(C0160Gb.class, C1149h7.a);
        encoderConfig.registerEncoder(LV.class, C1543n7.a);
        encoderConfig.registerEncoder(C1021fB.class, C1345k7.a);
        encoderConfig.registerEncoder(C0890dB.class, C1279j7.a);
        encoderConfig.registerEncoder(C0097Dq.class, C1215i7.a);
        encoderConfig.registerEncoder(PT.class, C1477m7.a);
    }

    @Override // o.CC
    public ByteBuffer d(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b0 = AbstractC1052fg.b0(obj);
        if (b0 instanceof String) {
            RT rt = RT.i;
            String quote = JSONObject.quote((String) b0);
            rt.getClass();
            return RT.b(quote);
        }
        RT rt2 = RT.i;
        String obj2 = b0.toString();
        rt2.getClass();
        return RT.b(obj2);
    }

    @Override // o.InterfaceC0920df
    public Iterable e(Object obj) {
        switch (this.h) {
            case 9:
                int i2 = AbstractC0192Hh.a;
                Collection o2 = ((RY) obj).o();
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(o2));
                Iterator it = ((ArrayList) o2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((RY) it.next()).a());
                }
                return arrayList;
            default:
                InterfaceC0937dx[] interfaceC0937dxArr = C0672Zu.n;
                return ((InterfaceC2204x9) obj).a().o();
        }
    }

    public boolean equals(Object obj) {
        switch (this.h) {
            case 8:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }

    @Override // o.Z1
    public Collection f(InterfaceC1245ib interfaceC1245ib) {
        return C1318jk.h;
    }

    @Override // o.Z1
    public Collection g(InterfaceC1245ib interfaceC1245ib) {
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        return C1318jk.h;
    }

    @Override // o.CC
    public Object h(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            RT.i.getClass();
            JSONTokener jSONTokener = new JSONTokener(RT.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public int hashCode() {
        switch (this.h) {
            case 8:
                return -1;
            default:
                return super.hashCode();
        }
    }

    @Override // o.Z1
    public Collection i(InterfaceC1245ib interfaceC1245ib) {
        return C1318jk.h;
    }

    public void n(String str) {
        AbstractC0048Bt.n(str, "message");
        C0897dI c0897dI = C0897dI.a;
        C0897dI.j(C0897dI.a, str, 6);
    }

    public ID p(JL jl) {
        byte[] bArr;
        try {
            C0898dJ o2 = C0898dJ.o(new F8(jl, 1));
            ID id = new ID(false);
            ZI[] ziArr = (ZI[]) Arrays.copyOf(new ZI[0], 0);
            AbstractC0048Bt.n(ziArr, "pairs");
            id.b();
            if (ziArr.length > 0) {
                ZI zi = ziArr[0];
                throw null;
            }
            Map m2 = o2.m();
            AbstractC0048Bt.m(m2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m2.entrySet()) {
                String str = (String) entry.getKey();
                C1161hJ c1161hJ = (C1161hJ) entry.getValue();
                AbstractC0048Bt.m(str, "name");
                AbstractC0048Bt.m(c1161hJ, "value");
                int C2 = c1161hJ.C();
                switch (C2 == 0 ? -1 : AbstractC1227iJ.a[AbstractC1888sN.v(C2)]) {
                    case -1:
                        throw new C0552Ve("Value case is null.", null);
                    case 0:
                    default:
                        throw new C0057Cc();
                    case 1:
                        id.d(new YI(str), Boolean.valueOf(c1161hJ.t()));
                        break;
                    case 2:
                        id.d(new YI(str), Float.valueOf(c1161hJ.x()));
                        break;
                    case 3:
                        id.d(new YI(str), Double.valueOf(c1161hJ.w()));
                        break;
                    case 4:
                        id.d(new YI(str), Integer.valueOf(c1161hJ.y()));
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        id.d(new YI(str), Long.valueOf(c1161hJ.z()));
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        YI yi = new YI(str);
                        String A2 = c1161hJ.A();
                        AbstractC0048Bt.m(A2, "value.string");
                        id.d(yi, A2);
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        YI yi2 = new YI(str);
                        InterfaceC1920st n2 = c1161hJ.B().n();
                        AbstractC0048Bt.m(n2, "value.stringSet.stringsList");
                        id.d(yi2, AbstractC0720ac.M0(n2));
                        break;
                    case 8:
                        YI yi3 = new YI(str);
                        C1151h9 u2 = c1161hJ.u();
                        int size = u2.size();
                        if (size == 0) {
                            bArr = AbstractC2052ut.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u2.m(bArr2, size);
                            bArr = bArr2;
                        }
                        AbstractC0048Bt.m(bArr, "value.bytes.toByteArray()");
                        id.d(yi3, bArr);
                        break;
                    case 9:
                        throw new C0552Ve("Value not set.", null);
                }
            }
            return new ID(EB.X(id.a()), true);
        } catch (C0230It e) {
            throw new C0552Ve("Unable to parse preferences proto.", e);
        }
    }

    public void u(Object obj, IL il) {
        AbstractC2181wq a;
        Map a2 = ((ID) obj).a();
        C0767bJ n2 = C0898dJ.n();
        for (Map.Entry entry : a2.entrySet()) {
            YI yi = (YI) entry.getKey();
            Object value = entry.getValue();
            String str = yi.a;
            if (value instanceof Boolean) {
                C1095gJ D2 = C1161hJ.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D2.c();
                C1161hJ.q((C1161hJ) D2.i, booleanValue);
                a = D2.a();
            } else if (value instanceof Float) {
                C1095gJ D3 = C1161hJ.D();
                float floatValue = ((Number) value).floatValue();
                D3.c();
                C1161hJ.r((C1161hJ) D3.i, floatValue);
                a = D3.a();
            } else if (value instanceof Double) {
                C1095gJ D4 = C1161hJ.D();
                double doubleValue = ((Number) value).doubleValue();
                D4.c();
                C1161hJ.o((C1161hJ) D4.i, doubleValue);
                a = D4.a();
            } else if (value instanceof Integer) {
                C1095gJ D5 = C1161hJ.D();
                int intValue = ((Number) value).intValue();
                D5.c();
                C1161hJ.s((C1161hJ) D5.i, intValue);
                a = D5.a();
            } else if (value instanceof Long) {
                C1095gJ D6 = C1161hJ.D();
                long longValue = ((Number) value).longValue();
                D6.c();
                C1161hJ.l((C1161hJ) D6.i, longValue);
                a = D6.a();
            } else if (value instanceof String) {
                C1095gJ D7 = C1161hJ.D();
                D7.c();
                C1161hJ.m((C1161hJ) D7.i, (String) value);
                a = D7.a();
            } else if (value instanceof Set) {
                C1095gJ D8 = C1161hJ.D();
                C0963eJ o2 = C1029fJ.o();
                AbstractC0048Bt.l(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o2.c();
                C1029fJ.l((C1029fJ) o2.i, (Set) value);
                D8.c();
                C1161hJ.n((C1161hJ) D8.i, (C1029fJ) o2.a());
                a = D8.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                C1095gJ D9 = C1161hJ.D();
                byte[] bArr = (byte[]) value;
                C1151h9 c1151h9 = C1151h9.j;
                C1151h9 l2 = C1151h9.l(bArr, 0, bArr.length);
                D9.c();
                C1161hJ.p((C1161hJ) D9.i, l2);
                a = D9.a();
            }
            n2.getClass();
            n2.c();
            C0898dJ.l((C0898dJ) n2.i).put(str, (C1161hJ) a);
        }
        C0898dJ c0898dJ = (C0898dJ) n2.a();
        HL hl = new HL(il);
        int a3 = c0898dJ.a(null);
        Logger logger = C0627Yb.w;
        if (a3 > 4096) {
            a3 = 4096;
        }
        C0627Yb c0627Yb = new C0627Yb(hl, a3);
        c0898dJ.b(c0627Yb);
        if (c0627Yb.u > 0) {
            c0627Yb.c0();
        }
    }

    @Override // o.IR
    public void lock() {
    }

    @Override // o.IR
    public void unlock() {
    }
}
