package o;

/* renamed from: o.mB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481mB extends ZH {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C1481mB(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.ZH
    public final EnumC2057uy b() {
        switch (this.a) {
            case 0:
                return ((AbstractC1415lB) this.b).N();
            default:
                return ((S2) this.b).getLayoutDirection();
        }
    }

    @Override // o.ZH
    public final int c() {
        switch (this.a) {
            case 0:
                return ((AbstractC1415lB) this.b).C();
            default:
                return ((S2) this.b).getRoot().v.q.b;
        }
    }
}
