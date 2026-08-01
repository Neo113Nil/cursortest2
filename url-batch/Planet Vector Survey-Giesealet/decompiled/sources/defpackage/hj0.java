package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class hj0 {
    public static final ij0 a;

    static {
        ij0 ij0Var = null;
        try {
            ij0Var = (ij0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ij0Var == null) {
            ij0Var = new ij0();
        }
        a = ij0Var;
    }

    public static ld a(Class cls) {
        a.getClass();
        return new ld(cls);
    }
}
