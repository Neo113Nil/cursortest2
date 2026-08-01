package K;

import o0.AbstractC0274m;
import o0.InterfaceC0272k;
import o0.InterfaceC0273l;

/* renamed from: K.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0009h implements R0.C, InterfaceC0273l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f404f;

    public /* synthetic */ C0009h(int i) {
        this.f404f = i;
    }

    @Override // o0.InterfaceC0273l
    public void a(InterfaceC0272k interfaceC0272k, AbstractC0274m abstractC0274m) {
        switch (this.f404f) {
            case 3:
                interfaceC0272k.f(abstractC0274m);
                break;
            case 4:
                interfaceC0272k.d(abstractC0274m);
                break;
            case 5:
                interfaceC0272k.c(abstractC0274m);
                break;
            case 6:
                interfaceC0272k.a();
                break;
            default:
                interfaceC0272k.e();
                break;
        }
    }
}
