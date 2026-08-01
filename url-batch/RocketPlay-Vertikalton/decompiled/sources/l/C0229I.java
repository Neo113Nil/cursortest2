package l;

import k.InterfaceC0187C;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229I extends AbstractViewOnTouchListenerC0284w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0234N f3326j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0237Q f3327k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0229I(C0237Q c0237q, C0237Q c0237q2, C0234N c0234n) {
        super(c0237q2);
        this.f3327k = c0237q;
        this.f3326j = c0234n;
    }

    @Override // l.AbstractViewOnTouchListenerC0284w0
    public final InterfaceC0187C b() {
        return this.f3326j;
    }

    @Override // l.AbstractViewOnTouchListenerC0284w0
    public final boolean c() {
        C0237Q c0237q = this.f3327k;
        if (c0237q.getInternalPopup().a()) {
            return true;
        }
        c0237q.f3362f.g(c0237q.getTextDirection(), c0237q.getTextAlignment());
        return true;
    }
}
