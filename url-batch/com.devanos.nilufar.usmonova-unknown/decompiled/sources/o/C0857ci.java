package o;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: o.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857ci extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0923di i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0857ci(C0923di c0923di, int i) {
        super(1);
        this.h = i;
        this.i = c0923di;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        C0321Mh a;
        MK a2;
        MK a3;
        switch (this.h) {
            case 0:
                C0827cE c0827cE = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE, "it");
                C0923di c0923di = this.i;
                LinkedHashMap linkedHashMap = c0923di.a;
                C2120vv c2120vv = C2017uK.C;
                AbstractC0048Bt.m(c2120vv, "PARSER");
                AbstractC1054fi abstractC1054fi = c0923di.i;
                byte[] bArr = (byte[]) linkedHashMap.get(c0827cE);
                Collection<C2017uK> B = bArr != null ? PQ.B(PQ.y(new V7(c2120vv, new ByteArrayInputStream(bArr), abstractC1054fi, 2))) : C1318jk.h;
                ArrayList arrayList = new ArrayList(B.size());
                for (C2017uK c2017uK : B) {
                    SB sb = abstractC1054fi.b.i;
                    AbstractC0048Bt.m(c2017uK, "it");
                    C1251ii e = sb.e(c2017uK);
                    if (!abstractC1054fi.r(e)) {
                        e = null;
                    }
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                abstractC1054fi.j(arrayList, c0827cE);
                return AbstractC1052fg.i(arrayList);
            case 1:
                C0827cE c0827cE2 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE2, "it");
                C0923di c0923di2 = this.i;
                LinkedHashMap linkedHashMap2 = c0923di2.b;
                C2120vv c2120vv2 = CK.C;
                AbstractC0048Bt.m(c2120vv2, "PARSER");
                AbstractC1054fi abstractC1054fi2 = c0923di2.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c0827cE2);
                Collection<CK> B2 = bArr2 != null ? PQ.B(PQ.y(new V7(c2120vv2, new ByteArrayInputStream(bArr2), abstractC1054fi2, 2))) : C1318jk.h;
                ArrayList arrayList2 = new ArrayList(B2.size());
                for (CK ck : B2) {
                    SB sb2 = abstractC1054fi2.b.i;
                    AbstractC0048Bt.m(ck, "it");
                    arrayList2.add(sb2.f(ck));
                }
                abstractC1054fi2.k(arrayList2, c0827cE2);
                return AbstractC1052fg.i(arrayList2);
            default:
                C0827cE c0827cE3 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE3, "it");
                C0923di c0923di3 = this.i;
                C0321Mh c0321Mh = c0923di3.i.b;
                byte[] bArr3 = (byte[]) c0923di3.c.get(c0827cE3);
                if (bArr3 != null) {
                    OK ok = (OK) OK.w.b(new ByteArrayInputStream(bArr3), c0321Mh.a.p);
                    if (ok != null) {
                        SB sb3 = c0321Mh.i;
                        C0321Mh c0321Mh2 = sb3.a;
                        InterfaceC0893dE interfaceC0893dE = c0321Mh2.b;
                        C0695aD c0695aD = c0321Mh2.d;
                        List<C0833cK> list = ok.r;
                        AbstractC0048Bt.m(list, "proto.annotationList");
                        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(list));
                        for (C0833cK c0833cK : list) {
                            C2002u5 c2002u5 = sb3.b;
                            AbstractC0048Bt.m(c0833cK, "it");
                            arrayList3.add(c2002u5.B(c0833cK, interfaceC0893dE));
                        }
                        C1316ji c1316ji = new C1316ji(c0321Mh2.a.a, c0321Mh2.c, arrayList3.isEmpty() ? C0460Rq.t : new C1803r4(0, arrayList3), AbstractC1052fg.C(interfaceC0893dE, ok.l), PX.E((EnumC0703aL) AbstractC1650om.d.c(ok.k)), ok, c0321Mh2.b, c0695aD, c0321Mh2.e, c0321Mh2.g);
                        List list2 = ok.m;
                        AbstractC0048Bt.m(list2, "proto.typeParameterList");
                        a = c0321Mh2.a(c1316ji, list2, c0321Mh2.b, c0321Mh2.d, c0321Mh2.e, c0321Mh2.f);
                        XW xw = a.h;
                        List b = xw.b();
                        int i = ok.j;
                        if ((i & 4) == 4) {
                            a2 = ok.n;
                            AbstractC0048Bt.m(a2, "underlyingType");
                        } else {
                            if ((i & 8) != 8) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                            }
                            a2 = c0695aD.a(ok.f76o);
                        }
                        JR d = xw.d(a2, false);
                        int i2 = ok.j;
                        if ((i2 & 16) == 16) {
                            a3 = ok.p;
                            AbstractC0048Bt.m(a3, "expandedType");
                        } else {
                            if ((i2 & 32) != 32) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                            }
                            a3 = c0695aD.a(ok.q);
                        }
                        c1316ji.K0(b, d, xw.d(a3, false));
                        return c1316ji;
                    }
                }
                return null;
        }
    }
}
