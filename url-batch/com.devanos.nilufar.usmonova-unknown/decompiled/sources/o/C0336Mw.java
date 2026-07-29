package o;

import java.lang.reflect.Type;

/* renamed from: o.Mw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336Mw extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0362Nw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0336Mw(C0362Nw c0362Nw, int i) {
        super(0);
        this.h = i;
        this.i = c0362Nw;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return JY.d(this.i.e());
            default:
                C0362Nw c0362Nw = this.i;
                InterfaceC1882sH e = c0362Nw.e();
                AbstractC0491Sv abstractC0491Sv = c0362Nw.h;
                if (!(e instanceof C0261Jy) || !AbstractC0048Bt.h(JY.g(abstractC0491Sv.p()), e) || abstractC0491Sv.p().M() != 2) {
                    return (Type) abstractC0491Sv.m().a().get(c0362Nw.i);
                }
                InterfaceC1118gg n = abstractC0491Sv.p().n();
                AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class j = JY.j((InterfaceC1245ib) n);
                if (j != null) {
                    return j;
                }
                throw new C0526Ue("Cannot determine receiver Java type of inherited declaration: " + e);
        }
    }
}
