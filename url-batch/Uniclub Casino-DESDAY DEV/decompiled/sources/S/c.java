package S;

import L.j;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f686a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f687b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f688c;
    public final J0.e d;

    public c(boolean z2, J0.e eVar) {
        this.f688c = z2;
        this.d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        Rect rect = this.f686a;
        ((j) obj).f(rect);
        Rect rect2 = this.f687b;
        ((j) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z2 = this.f688c;
        if (i3 < i4) {
            return z2 ? 1 : -1;
        }
        if (i3 > i4) {
            return z2 ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z2 ? 1 : -1;
        }
        if (i7 > i8) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
