package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class ll implements n01 {
    public static final ll b = new ll(0);
    public static ll c;
    public final /* synthetic */ int a;

    public /* synthetic */ ll(int i) {
        this.a = i;
    }

    @Override // defpackage.n01
    public k01 a(Class cls) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                return new e80();
            case 2:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                return a50.o(cls);
        }
    }

    @Override // defpackage.n01
    public k01 b(Class cls, m60 m60Var) {
        switch (this.a) {
            case 0:
                a(cls);
                throw null;
            case 1:
                return a(cls);
            case 2:
                a(cls);
                throw null;
            default:
                return a(cls);
        }
    }

    @Override // defpackage.n01
    public final k01 c(ld ldVar, m60 m60Var) {
        switch (this.a) {
            case 0:
                Class cls = ldVar.a;
                cls.getClass();
                return a50.o(cls);
            case 1:
                Class cls2 = ldVar.a;
                cls2.getClass();
                return b(cls2, m60Var);
            case 2:
                return new fn0();
            default:
                Class cls3 = ldVar.a;
                cls3.getClass();
                return b(cls3, m60Var);
        }
    }
}
