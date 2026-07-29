package o;

/* loaded from: classes.dex */
public interface SC extends UC {
    @Override // o.UC
    default boolean a(InterfaceC2114vp interfaceC2114vp) {
        return ((Boolean) interfaceC2114vp.invoke(this)).booleanValue();
    }

    @Override // o.UC
    default Object b(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return interfaceC2312yp.invoke(obj, this);
    }
}
