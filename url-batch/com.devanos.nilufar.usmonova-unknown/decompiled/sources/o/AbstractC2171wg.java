package o;

/* renamed from: o.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2171wg {
    public static final InterfaceC0658Zg a;

    static {
        String str;
        InterfaceC0658Zg interfaceC0658Zg;
        int i = HU.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            C0191Hg c0191Hg = AbstractC0115Ei.a;
            C1325jr c1325jr = AbstractC1810rB.a;
            C1325jr c1325jr2 = c1325jr.m;
            interfaceC0658Zg = c1325jr;
            if (c1325jr == null) {
                interfaceC0658Zg = RunnableC2105vg.q;
            }
        } else {
            interfaceC0658Zg = RunnableC2105vg.q;
        }
        a = interfaceC0658Zg;
    }
}
