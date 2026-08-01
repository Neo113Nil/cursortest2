package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class si {
    public static final p60 a;

    static {
        dl0 dl0Var = qe.e;
        int i = dl0Var.c;
        pi piVar = new pi(dl0Var, dl0Var, 1);
        int i2 = dl0Var.c;
        ta0 ta0Var = qe.x;
        int i3 = (ta0Var.c << 6) | i2;
        ri riVar = new ri(dl0Var, ta0Var, 0);
        int i4 = (i2 << 6) | ta0Var.c;
        ri riVar2 = new ri(ta0Var, dl0Var, 0);
        p60 p60Var = az.a;
        p60 p60Var2 = new p60();
        p60Var2.h(i | (i << 6), piVar);
        p60Var2.h(i3, riVar);
        p60Var2.h(i4, riVar2);
        a = p60Var2;
    }
}
