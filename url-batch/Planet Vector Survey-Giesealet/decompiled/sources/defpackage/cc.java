package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cc implements ls {
    public static final cc a = new cc();
    public static Boolean b;

    @Override // defpackage.ls
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw y6.u("canFocus is read before it is written");
    }

    @Override // defpackage.ls
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }
}
