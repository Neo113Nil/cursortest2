package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: o.h10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142h10 {
    public static final C1142h10 b;
    public final C1010f10 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = C0944e10.q;
        } else {
            b = C1010f10.b;
        }
    }

    public C1142h10(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new C0944e10(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new C0879d10(this, windowInsets);
        } else if (i >= 28) {
            this.a = new C0813c10(this, windowInsets);
        } else {
            this.a = new C0748b10(this, windowInsets);
        }
    }

    public static C0644Ys a(C0644Ys c0644Ys, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c0644Ys.a - i);
        int max2 = Math.max(0, c0644Ys.b - i2);
        int max3 = Math.max(0, c0644Ys.c - i3);
        int max4 = Math.max(0, c0644Ys.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c0644Ys : C0644Ys.a(max, max2, max3, max4);
    }

    public static C1142h10 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C1142h10 c1142h10 = new C1142h10(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AZ.a;
            C1142h10 a = AbstractC1834rZ.a(view);
            C1010f10 c1010f10 = c1142h10.a;
            c1010f10.p(a);
            c1010f10.d(view.getRootView());
        }
        return c1142h10;
    }

    public final WindowInsets b() {
        C1010f10 c1010f10 = this.a;
        if (c1010f10 instanceof AbstractC0682a10) {
            return ((AbstractC0682a10) c1010f10).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1142h10) {
            return Objects.equals(this.a, ((C1142h10) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        C1010f10 c1010f10 = this.a;
        if (c1010f10 == null) {
            return 0;
        }
        return c1010f10.hashCode();
    }

    public C1142h10() {
        this.a = new C1010f10(this);
    }
}
