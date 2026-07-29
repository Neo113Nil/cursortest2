package o;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985ef implements InterfaceC0246Jj {
    public Context a;

    public C0985ef(Context context, int i) {
        switch (i) {
            case 2:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // o.InterfaceC0246Jj
    public void a(AbstractC0868ct abstractC0868ct) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0032Bd("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0139Fg(this, abstractC0868ct, threadPoolExecutor, 1));
    }

    public C1051ff b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C1051ff c1051ff = new C1051ff();
        c1051ff.h = C0478Si.a(AbstractC1473m3.e);
        M1 m1 = new M1(context);
        c1051ff.i = m1;
        c1051ff.j = C0478Si.a(new C0208Hx(m1, 4, new Y1(16, m1)));
        M1 m12 = c1051ff.i;
        c1051ff.k = new C0506Tk(m12, 1);
        InterfaceC1557nL a = C0478Si.a(new C0208Hx(c1051ff.k, 19, C0478Si.a(new C0506Tk(m12, 0))));
        c1051ff.l = a;
        C0218Ih c0218Ih = new C0218Ih(25);
        M1 m13 = c1051ff.i;
        C0950e6 c0950e6 = new C0950e6(m13, a, c0218Ih, 19);
        InterfaceC1557nL interfaceC1557nL = c1051ff.h;
        InterfaceC1557nL interfaceC1557nL2 = c1051ff.j;
        C1216i8 c1216i8 = new C1216i8(interfaceC1557nL, interfaceC1557nL2, c0950e6, a, a);
        C1370kW c1370kW = new C1370kW();
        c1370kW.h = m13;
        c1370kW.i = interfaceC1557nL2;
        c1370kW.j = a;
        c1370kW.k = c0950e6;
        c1370kW.l = interfaceC1557nL;
        c1370kW.m = a;
        c1370kW.n = a;
        c1051ff.m = C0478Si.a(new C0950e6(c1216i8, c1370kW, new C1334k(interfaceC1557nL, a, c0950e6, a, 20), 25));
        return c1051ff;
    }
}
