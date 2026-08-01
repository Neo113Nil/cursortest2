package l;

import k.InterfaceC0149C;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186H extends AbstractViewOnTouchListenerC0239u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0191M f2895j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0194P f2896k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186H(C0194P c0194p, C0194P c0194p2, C0191M c0191m) {
        super(c0194p2);
        this.f2896k = c0194p;
        this.f2895j = c0191m;
    }

    @Override // l.AbstractViewOnTouchListenerC0239u0
    public final InterfaceC0149C b() {
        return this.f2895j;
    }

    @Override // l.AbstractViewOnTouchListenerC0239u0
    public final boolean c() {
        C0194P c0194p = this.f2896k;
        if (c0194p.getInternalPopup().a()) {
            return true;
        }
        c0194p.f2931f.g(c0194p.getTextDirection(), c0194p.getTextAlignment());
        return true;
    }
}
