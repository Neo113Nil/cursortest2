package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y60 extends ei0 implements n00, mu {
    public y60(String str, String str2) {
        super(zb.d, xp0.class, str, str2);
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        h();
        throw null;
    }

    @Override // defpackage.ac
    public final i00 d() {
        hj0.a.getClass();
        return this;
    }

    public final void h() {
        if (this.j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        i00 g = g();
        if (g == this) {
            throw new fk("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((y60) ((n00) g)).h();
    }
}
