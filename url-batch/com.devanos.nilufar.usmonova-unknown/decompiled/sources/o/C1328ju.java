package o;

import java.util.Map;

/* renamed from: o.ju, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328ju extends C0437Qt {
    public static final /* synthetic */ InterfaceC0937dx[] g;
    public final SA f;

    static {
        VM vm = UM.a;
        g = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C1328ju.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1328ju(C1558nM c1558nM, C1216i8 c1216i8) {
        super(c1216i8, c1558nM, AbstractC1433lT.t);
        AbstractC0048Bt.n(c1558nM, "annotation");
        AbstractC0048Bt.n(c1216i8, "c");
        OT ot = ((C1198hu) c1216i8.i).a;
        C1139h0 c1139h0 = new C1139h0(15, this);
        VA va = (VA) ot;
        va.getClass();
        this.f = new SA(va, c1139h0);
    }

    @Override // o.C0437Qt, o.InterfaceC0948e4
    public final Map f() {
        return (Map) AbstractC0772bO.o(this.f, g[0]);
    }
}
