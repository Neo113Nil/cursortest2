package o;

/* loaded from: classes.dex */
public interface UC {
    boolean a(InterfaceC2114vp interfaceC2114vp);

    Object b(Object obj, InterfaceC2312yp interfaceC2312yp);

    default UC c(UC uc) {
        return uc == RC.a ? this : new C2035uc(this, uc);
    }
}
