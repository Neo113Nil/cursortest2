package l;

import k.InterfaceC0142C;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213J extends AbstractViewOnTouchListenerC0267w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0218O f2885j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0221S f2886k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213J(C0221S c0221s, C0221S c0221s2, C0218O c0218o) {
        super(c0221s2);
        this.f2886k = c0221s;
        this.f2885j = c0218o;
    }

    @Override // l.AbstractViewOnTouchListenerC0267w0
    public final InterfaceC0142C b() {
        return this.f2885j;
    }

    @Override // l.AbstractViewOnTouchListenerC0267w0
    public final boolean c() {
        C0221S c0221s = this.f2886k;
        if (c0221s.getInternalPopup().a()) {
            return true;
        }
        c0221s.f2921f.g(c0221s.getTextDirection(), c0221s.getTextAlignment());
        return true;
    }
}
