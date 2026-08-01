package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: k0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0174C extends i1.r {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2735f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2736g = true;
    public static boolean h = true;
    public static boolean i = true;

    @Override // i1.r
    public void s(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.s(view, i2);
        } else if (i) {
            try {
                AbstractC0173B.a(view, i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void v(View view, int i2, int i3, int i4, int i5) {
        if (h) {
            try {
                AbstractC0204z.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void w(View view, Matrix matrix) {
        if (f2735f) {
            try {
                AbstractC0203y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2735f = false;
            }
        }
    }

    public void x(View view, Matrix matrix) {
        if (f2736g) {
            try {
                AbstractC0203y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2736g = false;
            }
        }
    }
}
