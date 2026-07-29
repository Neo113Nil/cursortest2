package o;

/* loaded from: classes.dex */
public final class A6 extends TM {
    public static volatile A6 b;
    public final C0502Tg a = new C0502Tg();

    public static A6 H() {
        if (b != null) {
            return b;
        }
        synchronized (A6.class) {
            try {
                if (b == null) {
                    b = new A6();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
