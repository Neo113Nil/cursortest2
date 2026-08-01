package o0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import c1.AbstractC0104b;

/* renamed from: o0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0299B extends AbstractC0104b {
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3616e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3617f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3618g = true;

    public void C(View view, int i, int i2, int i3, int i4) {
        if (f3617f) {
            try {
                z.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3617f = false;
            }
        }
    }

    public void D(View view, Matrix matrix) {
        if (d) {
            try {
                y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void E(View view, Matrix matrix) {
        if (f3616e) {
            try {
                y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3616e = false;
            }
        }
    }

    @Override // c1.AbstractC0104b
    public void y(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.y(view, i);
        } else if (f3618g) {
            try {
                AbstractC0298A.a(view, i);
            } catch (NoSuchMethodError unused) {
                f3618g = false;
            }
        }
    }
}
