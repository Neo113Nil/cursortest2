package o;

import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: o.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216i8 implements InterfaceC0597Wx, InterfaceC2374zl {
    public final /* synthetic */ int h = 2;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public C1216i8(InterfaceC1557nL interfaceC1557nL, InterfaceC1557nL interfaceC1557nL2, C0950e6 c0950e6, InterfaceC1557nL interfaceC1557nL3, InterfaceC1557nL interfaceC1557nL4) {
        this.i = interfaceC1557nL;
        this.j = interfaceC1557nL2;
        this.k = c0950e6;
        this.l = interfaceC1557nL3;
        this.m = interfaceC1557nL4;
    }

    @Override // o.InterfaceC1557nL
    public Object get() {
        return new C0217Ig((Executor) ((InterfaceC1557nL) this.i).get(), (JC) ((InterfaceC1557nL) this.j).get(), (C0153Fu) ((C0950e6) this.k).get(), (InterfaceC0480Sk) ((InterfaceC1557nL) this.l).get(), (AU) ((InterfaceC1557nL) this.m).get());
    }

    @Override // o.InterfaceC0597Wx
    public void h() {
        ((C1370kW) this.j).h();
        C1370kW c1370kW = (C1370kW) this.k;
        ((HashMap) c1370kW.i).put((C0827cE) this.l, new C1606o4((InterfaceC0948e4) AbstractC0720ac.D0((ArrayList) this.m)));
    }

    @Override // o.InterfaceC0597Wx
    public InterfaceC0623Xx j(C0827cE c0827cE) {
        return ((C1370kW) this.i).j(c0827cE);
    }

    @Override // o.InterfaceC0597Wx
    public void k(C0827cE c0827cE, C1705pb c1705pb) {
        ((C1370kW) this.i).k(c0827cE, c1705pb);
    }

    @Override // o.InterfaceC0597Wx
    public void l(C0827cE c0827cE, C1639ob c1639ob, C0827cE c0827cE2) {
        ((C1370kW) this.i).l(c0827cE, c1639ob, c0827cE2);
    }

    @Override // o.InterfaceC0597Wx
    public void m(C0827cE c0827cE, Object obj) {
        ((C1370kW) this.i).m(c0827cE, obj);
    }

    @Override // o.InterfaceC0597Wx
    public InterfaceC0597Wx n(C1639ob c1639ob, C0827cE c0827cE) {
        return ((C1370kW) this.i).n(c1639ob, c0827cE);
    }

    public String toString() {
        switch (this.h) {
            case 2:
                List list = (List) this.l;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.i) + ", mProviderPackage: " + ((String) this.j) + ", mQuery: " + ((String) this.k) + ", mCertificates:");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1216i8(String str, String str2, String str3, List list) {
        str.getClass();
        this.i = str;
        str2.getClass();
        this.j = str2;
        this.k = str3;
        list.getClass();
        this.l = list;
        this.m = str + "-" + str2 + "-" + str3;
    }

    public C1216i8(C1198hu c1198hu, InterfaceC1569nX interfaceC1569nX, InterfaceC0235Iy interfaceC0235Iy) {
        AbstractC0048Bt.n(interfaceC1569nX, "typeParameterResolver");
        this.i = c1198hu;
        this.j = interfaceC1569nX;
        this.k = interfaceC0235Iy;
        this.l = interfaceC0235Iy;
        this.m = new C0950e6(this, interfaceC1569nX);
    }

    public C1216i8(C1370kW c1370kW, C1370kW c1370kW2, C0827cE c0827cE, ArrayList arrayList) {
        this.j = c1370kW;
        this.k = c1370kW2;
        this.l = c0827cE;
        this.m = arrayList;
        this.i = c1370kW;
    }
}
