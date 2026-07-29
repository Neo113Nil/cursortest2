package o;

/* renamed from: o.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2311yo implements InterfaceC2114vp {
    public final /* synthetic */ int h;

    public /* synthetic */ C2311yo(int i) {
        this.h = i;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o.lp, o.ny] */
    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                return C0827cE.d((String) obj);
            case 1:
                return ((QA) obj).b.invoke();
            case 2:
                return (InterfaceC2204x9) obj;
            case 3:
                return (InterfaceC2204x9) obj;
            default:
                if (((C2245xo) obj) != null) {
                    return Boolean.valueOf(!r2.equals(AbstractC1433lT.y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
