package o;

import java.util.Map;

/* renamed from: o.Qt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0437Qt implements InterfaceC0948e4, NI {
    public static final /* synthetic */ InterfaceC0937dx[] e;
    public final C2245xo a;
    public final IS b;
    public final SA c;
    public final InterfaceC0411Pt d;

    static {
        VM vm = UM.a;
        e = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0437Qt.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public C0437Qt(C1216i8 c1216i8, C1558nM c1558nM, C2245xo c2245xo) {
        AbstractC0048Bt.n(c1216i8, "c");
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        AbstractC0048Bt.n(c2245xo, "fqName");
        this.a = c2245xo;
        this.b = c1558nM != null ? c1198hu.j.H0(c1558nM) : IS.e;
        OT ot = c1198hu.a;
        K2 k2 = new K2(c1216i8, 6, this);
        VA va = (VA) ot;
        va.getClass();
        this.c = new SA(va, k2);
        this.d = c1558nM != null ? (InterfaceC0411Pt) AbstractC0720ac.o0(c1558nM.b()) : null;
    }

    @Override // o.InterfaceC0948e4
    public final AbstractC1004ey c() {
        return (JR) AbstractC0772bO.o(this.c, e[0]);
    }

    @Override // o.InterfaceC0948e4
    public final IS d() {
        return this.b;
    }

    @Override // o.InterfaceC0948e4
    public final C2245xo e() {
        return this.a;
    }

    @Override // o.InterfaceC0948e4
    public Map f() {
        return C1384kk.h;
    }
}
