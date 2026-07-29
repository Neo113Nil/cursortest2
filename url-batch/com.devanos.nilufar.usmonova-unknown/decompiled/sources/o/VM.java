package o;

/* loaded from: classes.dex */
public class VM {
    public InterfaceC0517Tv b(Class cls) {
        return new C1902sb(cls);
    }

    public InterfaceC1134gw c(Class cls, String str) {
        return new C1225iH(cls, str);
    }

    public String h(InterfaceC0200Hp interfaceC0200Hp) {
        String obj = interfaceC0200Hp.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String i(AbstractC1596ny abstractC1596ny) {
        return h(abstractC1596ny);
    }

    public InterfaceC1396kw a(AbstractC0485Sp abstractC0485Sp) {
        return abstractC0485Sp;
    }

    public InterfaceC1989tw d(O2 o2) {
        return o2;
    }

    public InterfaceC2253xw e(JD jd) {
        return jd;
    }

    public InterfaceC0466Rw f(WA wa) {
        return wa;
    }

    public InterfaceC0596Ww g(TJ tj) {
        return tj;
    }
}
