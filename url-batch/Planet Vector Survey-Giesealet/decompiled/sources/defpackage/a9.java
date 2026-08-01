package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a9 {
    public final f90 a;
    public final eb0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public a9(f90 f90Var, eb0 eb0Var) {
        this.a = f90Var;
        this.b = eb0Var;
        if ((f90Var == null ? eb0Var : f90Var) != null) {
            return;
        }
        g8.r("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
