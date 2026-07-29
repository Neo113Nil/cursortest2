package o;

import java.util.Iterator;
import java.util.List;

/* renamed from: o.Nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0347Nh implements InterfaceC1738q4 {
    public static final /* synthetic */ InterfaceC0937dx[] i;
    public final SA h;

    static {
        VM vm = UM.a;
        i = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0347Nh.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C0347Nh(OT ot, InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(ot, "storageManager");
        this.h = new SA((VA) ot, interfaceC1455lp);
    }

    @Override // o.InterfaceC1738q4
    public final InterfaceC0948e4 c(C2245xo c2245xo) {
        return AbstractC1052fg.n(this, c2245xo);
    }

    @Override // o.InterfaceC1738q4
    public final boolean i(C2245xo c2245xo) {
        return AbstractC1052fg.F(this, c2245xo);
    }

    @Override // o.InterfaceC1738q4
    public boolean isEmpty() {
        return ((List) AbstractC0772bO.o(this.h, i[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) AbstractC0772bO.o(this.h, i[0])).iterator();
    }
}
