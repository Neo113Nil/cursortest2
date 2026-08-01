package R0;

import X0.d;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f673b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f674c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f675a;

    public /* synthetic */ a(int i) {
        this.f675a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f675a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                d.e(comparable, "a");
                d.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                d.e(comparable3, "a");
                d.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f675a) {
            case 0:
                return f674c;
            default:
                return f673b;
        }
    }
}
