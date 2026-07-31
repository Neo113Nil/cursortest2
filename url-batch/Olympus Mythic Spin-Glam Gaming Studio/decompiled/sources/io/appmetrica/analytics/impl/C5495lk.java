package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5495lk implements InterfaceC5803xg {
    public final /* synthetic */ C5521mk a;

    public C5495lk(C5521mk c5521mk) {
        this.a = c5521mk;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5803xg
    public final void a(Eg eg) {
        C5751vg a = eg.a();
        if (a == null || this.a.b()) {
            return;
        }
        try {
            C5326f6 c5326f6 = new C5326f6("", "", 0);
            c5326f6.setValueBytes(a.a());
            EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
            c5326f6.d = 4097;
            this.a.a.a(c5326f6);
            C5521mk.b(this.a);
        } catch (Throwable unused) {
        }
    }
}
