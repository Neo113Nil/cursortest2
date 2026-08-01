package K;

import k0.AbstractC0191m;
import k0.InterfaceC0189k;
import k0.InterfaceC0190l;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0007g implements K0.E, InterfaceC0190l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f410f;

    public /* synthetic */ C0007g(int i) {
        this.f410f = i;
    }

    @Override // k0.InterfaceC0190l
    public void a(InterfaceC0189k interfaceC0189k, AbstractC0191m abstractC0191m) {
        switch (this.f410f) {
            case 4:
                interfaceC0189k.f(abstractC0191m);
                break;
            case 5:
                interfaceC0189k.b(abstractC0191m);
                break;
            case 6:
                interfaceC0189k.e(abstractC0191m);
                break;
            case 7:
                interfaceC0189k.a();
                break;
            default:
                interfaceC0189k.c();
                break;
        }
    }
}
