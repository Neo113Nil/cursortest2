package o;

import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class ZZ implements InterfaceC0764bG {
    public final Object h;
    public final Object i;
    public final Object j;

    public /* synthetic */ ZZ(TO to, String str, ScheduledFuture scheduledFuture) {
        this.h = to;
        this.i = str;
        this.j = scheduledFuture;
    }

    public UZ a(InterfaceC0517Tv interfaceC0517Tv, String str) {
        UZ a;
        XZ xz = (XZ) this.i;
        AbstractC0048Bt.n(interfaceC0517Tv, "modelClass");
        AbstractC0048Bt.n(str, "key");
        C0680a00 c0680a00 = (C0680a00) this.h;
        c0680a00.getClass();
        LinkedHashMap linkedHashMap = c0680a00.a;
        UZ uz = (UZ) linkedHashMap.get(str);
        if (interfaceC0517Tv.f(uz)) {
            if (xz instanceof NP) {
                NP np = (NP) xz;
                AbstractC0048Bt.k(uz);
                AbstractC0106Dz abstractC0106Dz = np.d;
                if (abstractC0106Dz != null) {
                    KP kp = np.e;
                    AbstractC0048Bt.k(kp);
                    AbstractC1305jX.h(uz, kp, abstractC0106Dz);
                }
            }
            AbstractC0048Bt.l(uz, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return uz;
        }
        C2142wD c2142wD = new C2142wD((AbstractC0656Ze) this.j);
        c2142wD.a.put(C1623oL.r, str);
        try {
            try {
                a = xz.c(interfaceC0517Tv, c2142wD);
            } catch (AbstractMethodError unused) {
                a = xz.a(AbstractC1473m3.D(interfaceC0517Tv));
            }
        } catch (AbstractMethodError unused2) {
            a = xz.b(AbstractC1473m3.D(interfaceC0517Tv), c2142wD);
        }
        AbstractC0048Bt.n(a, "viewModel");
        UZ uz2 = (UZ) linkedHashMap.put(str, a);
        if (uz2 != null) {
            uz2.b();
        }
        return a;
    }

    @Override // o.InterfaceC0764bG
    public void onComplete(MU mu) {
        TO to = (TO) this.h;
        String str = (String) this.i;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.j;
        synchronized (to.a) {
            to.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public ZZ(C0680a00 c0680a00, XZ xz, AbstractC0656Ze abstractC0656Ze) {
        AbstractC0048Bt.n(c0680a00, "store");
        AbstractC0048Bt.n(abstractC0656Ze, "extras");
        this.h = c0680a00;
        this.i = xz;
        this.j = abstractC0656Ze;
    }
}
