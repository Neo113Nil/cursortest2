package o;

/* renamed from: o.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1121gj extends InterfaceC1119gh {
    static void t(InterfaceC1121gj interfaceC1121gj, long j) {
        long m = interfaceC1121gj.m();
        interfaceC1121gj.k(j, 0L, AbstractC1035fP.a(ZR.b(m) - BF.b(0L), ZR.a(m) - BF.c(0L)), C0559Vl.i);
    }

    void k(long j, long j2, long j3, AbstractC1807r8 abstractC1807r8);

    C2002u5 l();

    default long m() {
        return ((C1112ga) l().j).b.d;
    }

    void v(long j, float f, float f2, long j2, long j3, AbstractC1807r8 abstractC1807r8);
}
