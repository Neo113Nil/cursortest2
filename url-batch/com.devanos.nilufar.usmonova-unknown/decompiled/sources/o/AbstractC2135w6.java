package o;

import android.content.Context;
import java.util.List;

/* renamed from: o.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2135w6 {
    public static final /* synthetic */ InterfaceC0937dx[] a = {UM.a.g(new UJ(AbstractC2135w6.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final XI b;

    static {
        WI wi = WI.i;
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        ExecutorC0035Bg executorC0035Bg = ExecutorC0035Bg.j;
        C1434lU a2 = PO.a();
        executorC0035Bg.getClass();
        b = new XI(wi, AbstractC1052fg.c(PX.E0(executorC0035Bg, a2)));
    }

    public static final InterfaceC1972tf a(Context context) {
        C1590ns c1590ns;
        XI xi = b;
        InterfaceC0937dx interfaceC0937dx = a[0];
        xi.getClass();
        AbstractC0048Bt.n(context, "thisRef");
        AbstractC0048Bt.n(interfaceC0937dx, "property");
        C1590ns c1590ns2 = xi.d;
        if (c1590ns2 != null) {
            return c1590ns2;
        }
        synchronized (xi.c) {
            try {
                if (xi.d == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC2114vp interfaceC2114vp = xi.a;
                    AbstractC0048Bt.m(applicationContext, "applicationContext");
                    List list = (List) interfaceC2114vp.invoke(applicationContext);
                    InterfaceC0422Qe interfaceC0422Qe = xi.b;
                    LE le = new LE(applicationContext, xi);
                    AbstractC0048Bt.n(list, "migrations");
                    C0657Zf c0657Zf = new C0657Zf(new IF(AbstractC0533Ul.a, new LE(2, le)), AbstractC0868ct.J(new C1709pf(list, null)), new C0218Ih(11), interfaceC0422Qe);
                    xi.d = new C1590ns(29, new C1590ns(29, c0657Zf));
                }
                c1590ns = xi.d;
                AbstractC0048Bt.k(c1590ns);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1590ns;
    }
}
