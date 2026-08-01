package o0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0257C extends h0.f {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3190g = true;
    public static boolean h = true;
    public static boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f3191j = true;

    @Override // h0.f
    public void o(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.o(view, i2);
        } else if (f3191j) {
            try {
                AbstractC0256B.a(view, i2);
            } catch (NoSuchMethodError unused) {
                f3191j = false;
            }
        }
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        if (i) {
            try {
                AbstractC0255A.a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void t(View view, Matrix matrix) {
        if (f3190g) {
            try {
                z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3190g = false;
            }
        }
    }

    public void u(View view, Matrix matrix) {
        if (h) {
            try {
                z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
