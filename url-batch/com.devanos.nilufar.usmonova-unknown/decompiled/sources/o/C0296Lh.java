package o;

import java.util.List;
import java.util.Set;

/* renamed from: o.Lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296Lh {
    public final VA a;
    public final InterfaceC0761bD b;
    public final C0460Rq c;
    public final InterfaceC1113gb d;
    public final InterfaceC0686a4 e;
    public final InterfaceC1159hH f;
    public final HO g;
    public final InterfaceC0143Fk h;
    public final HO i;
    public final InterfaceC1847rm j;
    public final Iterable k;
    public final C1334k l;
    public final C1623oL m;
    public final Z1 n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1160hI f64o;
    public final C1649ol p;
    public final InterfaceC2341zE q;
    public final HO r;
    public final List s;
    public final C1573nb t;

    public C0296Lh(VA va, InterfaceC0761bD interfaceC0761bD, InterfaceC1113gb interfaceC1113gb, InterfaceC0686a4 interfaceC0686a4, InterfaceC1159hH interfaceC1159hH, InterfaceC0143Fk interfaceC0143Fk, InterfaceC1847rm interfaceC1847rm, Iterable iterable, C1334k c1334k, Z1 z1, InterfaceC1160hI interfaceC1160hI, C1649ol c1649ol, InterfaceC2341zE interfaceC2341zE, C0218Ih c0218Ih, List list, int i) {
        InterfaceC2341zE interfaceC2341zE2;
        C0460Rq c0460Rq = C0460Rq.A;
        HO ho = HO.C;
        HO ho2 = HO.D;
        if ((i & 65536) != 0) {
            InterfaceC2341zE.b.getClass();
            interfaceC2341zE2 = C2275yE.b;
        } else {
            interfaceC2341zE2 = interfaceC2341zE;
        }
        HO ho3 = HO.I;
        List J = (i & 524288) != 0 ? AbstractC0868ct.J(C0528Ug.a) : list;
        AbstractC0048Bt.n(interfaceC0761bD, "moduleDescriptor");
        AbstractC0048Bt.n(c1649ol, "extensionRegistryLite");
        AbstractC0048Bt.n(interfaceC2341zE2, "kotlinTypeChecker");
        this.a = va;
        this.b = interfaceC0761bD;
        this.c = c0460Rq;
        this.d = interfaceC1113gb;
        this.e = interfaceC0686a4;
        this.f = interfaceC1159hH;
        this.g = ho;
        this.h = interfaceC0143Fk;
        this.i = ho2;
        this.j = interfaceC1847rm;
        this.k = iterable;
        this.l = c1334k;
        this.m = C0033Be.a;
        this.n = z1;
        this.f64o = interfaceC1160hI;
        this.p = c1649ol;
        this.q = interfaceC2341zE2;
        this.r = ho3;
        this.s = J;
        this.t = new C1573nb(this);
    }

    public final C0321Mh a(InterfaceC0961eH interfaceC0961eH, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, C1097gL c1097gL, AbstractC1478m8 abstractC1478m8, InterfaceC0607Xh interfaceC0607Xh) {
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(abstractC1478m8, "metadataVersion");
        return new C0321Mh(this, interfaceC0893dE, interfaceC0961eH, c0695aD, c1097gL, abstractC1478m8, interfaceC0607Xh, null, C1318jk.h);
    }

    public final InterfaceC1245ib b(C1639ob c1639ob) {
        AbstractC0048Bt.n(c1639ob, "classId");
        Set set = C1573nb.c;
        return this.t.a(c1639ob, null);
    }
}
