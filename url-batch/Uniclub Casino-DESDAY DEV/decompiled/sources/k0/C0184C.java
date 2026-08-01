package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: k0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0184C extends i1.k {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2760f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2761g = true;
    public static boolean h = true;
    public static boolean i = true;

    public void A(View view, Matrix matrix) {
        if (f2761g) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2761g = false;
            }
        }
    }

    @Override // i1.k
    public void v(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.v(view, i2);
        } else if (i) {
            try {
                AbstractC0183B.a(view, i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void y(View view, int i2, int i3, int i4, int i5) {
        if (h) {
            try {
                AbstractC0182A.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public void z(View view, Matrix matrix) {
        if (f2760f) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2760f = false;
            }
        }
    }
}
