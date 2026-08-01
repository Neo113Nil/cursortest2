package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zp0 implements Comparator {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Comparator b;

    public zp0(zp0 zp0Var) {
        this.b = zp0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Comparator comparator = this.b;
        switch (i) {
            case 0:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return p10.Q.compare(((rp0) obj).c, ((rp0) obj2).c);
            default:
                int compare2 = ((zp0) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : mz.w(Integer.valueOf(((rp0) obj).g), Integer.valueOf(((rp0) obj2).g));
        }
    }

    public zp0(Comparator comparator) {
        this.b = comparator;
    }
}
