package o;

/* renamed from: o.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1935t4 {
    public static final /* synthetic */ InterfaceC0937dx[] a;
    public static final C0234Ix b;

    static {
        VM vm = UM.a;
        a = new InterfaceC0937dx[]{vm.g(new UJ(vm.c(AbstractC1935t4.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        C0208Hx c0208Hx = OW.i;
        InterfaceC0517Tv b2 = vm.b(C1869s4.class);
        c0208Hx.getClass();
        int P0 = c0208Hx.P0(b2);
        C0234Ix c0234Ix = new C0234Ix();
        c0234Ix.a = P0;
        b = c0234Ix;
    }

    public static final InterfaceC1738q4 a(OW ow) {
        InterfaceC1738q4 interfaceC1738q4;
        AbstractC0048Bt.n(ow, "<this>");
        InterfaceC0937dx interfaceC0937dx = a[0];
        C0234Ix c0234Ix = b;
        c0234Ix.getClass();
        AbstractC0048Bt.n(interfaceC0937dx, "property");
        C1869s4 c1869s4 = (C1869s4) ow.h.get(c0234Ix.a);
        return (c1869s4 == null || (interfaceC1738q4 = c1869s4.a) == null) ? C0460Rq.t : interfaceC1738q4;
    }
}
