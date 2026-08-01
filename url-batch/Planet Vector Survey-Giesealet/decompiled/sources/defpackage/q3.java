package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q3 implements ViewTranslationCallback {
    public static final q3 a = new q3();

    public final boolean onClearTranslation(View view) {
        bu buVar;
        view.getClass();
        e4 contentCaptureManager$ui_release = ((f3) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = b4.d;
        zy j = contentCaptureManager$ui_release.j();
        Object[] objArr = j.c;
        long[] jArr = j.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        a70 a70Var = ((tp0) objArr[(i << 3) + i3]).a.d.d;
                        Object g = a70Var.g(vp0.B);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = a70Var.g(mp0.l);
                            h0 h0Var = (h0) (g2 != null ? g2 : null);
                            if (h0Var != null && (buVar = (bu) h0Var.b) != null) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        mu muVar;
        view.getClass();
        e4 contentCaptureManager$ui_release = ((f3) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = b4.d;
        zy j = contentCaptureManager$ui_release.j();
        Object[] objArr = j.c;
        long[] jArr = j.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        a70 a70Var = ((tp0) objArr[(i << 3) + i3]).a.d.d;
                        Object g = a70Var.g(vp0.B);
                        if (g == null) {
                            g = null;
                        }
                        if (nz.l(g, Boolean.TRUE)) {
                            Object g2 = a70Var.g(mp0.k);
                            h0 h0Var = (h0) (g2 != null ? g2 : null);
                            if (h0Var != null && (muVar = (mu) h0Var.b) != null) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        mu muVar;
        view.getClass();
        e4 contentCaptureManager$ui_release = ((f3) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.i = b4.e;
        zy j = contentCaptureManager$ui_release.j();
        Object[] objArr = j.c;
        long[] jArr = j.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        a70 a70Var = ((tp0) objArr[(i << 3) + i3]).a.d.d;
                        Object g = a70Var.g(vp0.B);
                        if (g == null) {
                            g = null;
                        }
                        if (nz.l(g, Boolean.FALSE)) {
                            Object g2 = a70Var.g(mp0.k);
                            h0 h0Var = (h0) (g2 != null ? g2 : null);
                            if (h0Var != null && (muVar = (mu) h0Var.b) != null) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
