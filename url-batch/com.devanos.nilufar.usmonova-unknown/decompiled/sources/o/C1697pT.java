package o;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.pT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697pT extends UW {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C1697pT(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // o.AbstractC1964tX
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // o.AbstractC1964tX
    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // o.UW
    public final AbstractC1701pX g(SW sw) {
        switch (this.c) {
            case 0:
                AbstractC0048Bt.n(sw, "key");
                if (!((ArrayList) this.d).contains(sw)) {
                    return null;
                }
                InterfaceC2364zb c = sw.c();
                AbstractC0048Bt.l(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return AbstractC2228xX.j((InterfaceC1437lX) c);
            default:
                AbstractC0048Bt.n(sw, "key");
                return (AbstractC1701pX) ((Map) this.d).get(sw);
        }
    }
}
