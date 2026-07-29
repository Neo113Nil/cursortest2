package o;

/* renamed from: o.zs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2381zs extends AbstractC1964tX {
    public final InterfaceC1437lX[] b;
    public final AbstractC1701pX[] c;
    public final boolean d;

    public C2381zs(InterfaceC1437lX[] interfaceC1437lXArr, AbstractC1701pX[] abstractC1701pXArr, boolean z) {
        AbstractC0048Bt.n(interfaceC1437lXArr, "parameters");
        AbstractC0048Bt.n(abstractC1701pXArr, "arguments");
        this.b = interfaceC1437lXArr;
        this.c = abstractC1701pXArr;
        this.d = z;
    }

    @Override // o.AbstractC1964tX
    public final boolean b() {
        return this.d;
    }

    @Override // o.AbstractC1964tX
    public final AbstractC1701pX d(AbstractC1004ey abstractC1004ey) {
        InterfaceC2364zb c = abstractC1004ey.B0().c();
        InterfaceC1437lX interfaceC1437lX = c instanceof InterfaceC1437lX ? (InterfaceC1437lX) c : null;
        if (interfaceC1437lX != null) {
            int index = interfaceC1437lX.getIndex();
            InterfaceC1437lX[] interfaceC1437lXArr = this.b;
            if (index < interfaceC1437lXArr.length && AbstractC0048Bt.h(interfaceC1437lXArr[index].z(), interfaceC1437lX.z())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // o.AbstractC1964tX
    public final boolean e() {
        return this.c.length == 0;
    }
}
