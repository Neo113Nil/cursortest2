package o;

/* loaded from: classes.dex */
public abstract class ZH {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ZH zh, AbstractC0700aI abstractC0700aI) {
        zh.getClass();
        if (abstractC0700aI instanceof InterfaceC1351kD) {
            ((InterfaceC1351kD) abstractC0700aI).A();
        }
    }

    public static void d(ZH zh, AbstractC0700aI abstractC0700aI, long j) {
        zh.getClass();
        a(zh, abstractC0700aI);
        abstractC0700aI.E(EB.L(j, abstractC0700aI.f), 0.0f, null);
    }

    public static void e(ZH zh, AbstractC0700aI abstractC0700aI, int i, int i2) {
        long c = AbstractC1305jX.c(i, i2);
        if (zh.b() == EnumC2057uy.h || zh.c() == 0) {
            a(zh, abstractC0700aI);
            abstractC0700aI.E(EB.L(c, abstractC0700aI.f), 0.0f, null);
        } else {
            long c2 = AbstractC1305jX.c((zh.c() - abstractC0700aI.b) - ((int) (c >> 32)), (int) (c & 4294967295L));
            a(zh, abstractC0700aI);
            abstractC0700aI.E(EB.L(c2, abstractC0700aI.f), 0.0f, null);
        }
    }

    public static void f(ZH zh, AbstractC0700aI abstractC0700aI) {
        int i = AbstractC0766bI.b;
        C2316yt c2316yt = C2316yt.L;
        long c = AbstractC1305jX.c(0, 0);
        if (zh.b() == EnumC2057uy.h || zh.c() == 0) {
            a(zh, abstractC0700aI);
            abstractC0700aI.E(EB.L(c, abstractC0700aI.f), 0.0f, c2316yt);
        } else {
            long c2 = AbstractC1305jX.c((zh.c() - abstractC0700aI.b) - ((int) (c >> 32)), (int) (c & 4294967295L));
            a(zh, abstractC0700aI);
            abstractC0700aI.E(EB.L(c2, abstractC0700aI.f), 0.0f, c2316yt);
        }
    }

    public abstract EnumC2057uy b();

    public abstract int c();
}
