package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class df implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ df(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                for (mu muVar : (mu[]) obj3) {
                    int w = mz.w((Comparable) muVar.c(obj), (Comparable) muVar.c(obj2));
                    if (w != 0) {
                        return w;
                    }
                }
                return 0;
            default:
                return ((Number) ((qu) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
