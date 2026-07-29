package o;

import java.util.Comparator;

/* renamed from: o.gE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090gE implements Comparator {
    public static final C1090gE b = new C1090gE(0);
    public static final C1090gE c = new C1090gE(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C1090gE(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC0048Bt.n(comparable, "a");
                AbstractC0048Bt.n(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC0048Bt.n(comparable3, "a");
                AbstractC0048Bt.n(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }
}
