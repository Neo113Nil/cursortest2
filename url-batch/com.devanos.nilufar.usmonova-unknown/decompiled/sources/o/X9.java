package o;

/* loaded from: classes.dex */
public final class X9 implements InterfaceC0224In {
    public static final X9 a = new X9();
    public static Boolean b;

    @Override // o.InterfaceC0224In
    public final void a() {
        b = Boolean.FALSE;
    }

    @Override // o.InterfaceC0224In
    public final boolean b() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC0868ct.X("canFocus is read before it is written");
        throw null;
    }
}
