package o;

/* loaded from: classes.dex */
public interface XZ {
    default UZ a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default UZ b(Class cls, C2142wD c2142wD) {
        return a(cls);
    }

    default UZ c(InterfaceC0517Tv interfaceC0517Tv, C2142wD c2142wD) {
        return b(AbstractC1473m3.D(interfaceC0517Tv), c2142wD);
    }
}
