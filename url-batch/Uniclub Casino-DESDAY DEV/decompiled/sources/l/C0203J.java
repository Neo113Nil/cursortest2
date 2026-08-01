package l;

import k.InterfaceC0153C;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203J extends AbstractViewOnTouchListenerC0257w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0208O f2894j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0211S f2895k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203J(C0211S c0211s, C0211S c0211s2, C0208O c0208o) {
        super(c0211s2);
        this.f2895k = c0211s;
        this.f2894j = c0208o;
    }

    @Override // l.AbstractViewOnTouchListenerC0257w0
    public final InterfaceC0153C b() {
        return this.f2894j;
    }

    @Override // l.AbstractViewOnTouchListenerC0257w0
    public final boolean c() {
        C0211S c0211s = this.f2895k;
        if (c0211s.getInternalPopup().a()) {
            return true;
        }
        c0211s.f2930f.g(c0211s.getTextDirection(), c0211s.getTextAlignment());
        return true;
    }
}
