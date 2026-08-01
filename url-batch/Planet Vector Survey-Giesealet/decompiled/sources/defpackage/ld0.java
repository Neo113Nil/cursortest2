package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ld0 implements d01 {
    public static final zl0 a(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new zl0(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final Object[] b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        p8.V(objArr, objArr2, 0, i, 6);
        p8.T(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        p8.V(objArr, objArr2, 0, i, 6);
        p8.T(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        p8.V(objArr, objArr2, 0, i, 6);
        p8.T(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void e(a70 a70Var, Object obj, Object obj2) {
        int f = a70Var.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : a70Var.c[f];
        if (obj3 != null) {
            if (obj3 instanceof b70) {
                ((b70) obj3).a(obj2);
            } else if (obj3 != obj2) {
                b70 b70Var = new b70();
                b70Var.a(obj3);
                b70Var.a(obj2);
                obj2 = b70Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            a70Var.c[f] = obj2;
            return;
        }
        int i = ~f;
        a70Var.b[i] = obj;
        a70Var.c[i] = obj2;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static a70 g() {
        long[] jArr = vn0.a;
        return new a70();
    }

    public static final Rect h(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    metricAffectingSpanArr.getClass();
                    int i4 = 0;
                    while (true) {
                        if (!(i4 < metricAffectingSpanArr.length)) {
                            break;
                        }
                        int i5 = i4 + 1;
                        try {
                            MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i4];
                            if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                                metricAffectingSpan.updateMeasureState(textPaint2);
                            }
                            i4 = i5;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            g8.e(e.getMessage());
                            return null;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final sv0 i(np0 np0Var) {
        mu muVar;
        ArrayList arrayList = new ArrayList();
        Object g = np0Var.d.g(mp0.a);
        if (g == null) {
            g = null;
        }
        h0 h0Var = (h0) g;
        if (h0Var == null || (muVar = (mu) h0Var.b) == null || !((Boolean) muVar.c(arrayList)).booleanValue()) {
            return null;
        }
        return (sv0) arrayList.get(0);
    }

    public static final boolean j(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static int k(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        g8.f("type needs to be >= FIRST and <= LAST, type=", i);
        return 0;
    }

    public static final int l(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean m(zl0 zl0Var) {
        long j = zl0Var.e;
        return (j >>> 32) == (4294967295L & j) && j == zl0Var.f && j == zl0Var.g && j == zl0Var.h;
    }

    public static final long n(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : ge.b(j, ge.d(j) * f);
    }

    public static final boolean o(a70 a70Var, Object obj, Object obj2) {
        Object g = a70Var.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof b70)) {
            if (!g.equals(obj2)) {
                return false;
            }
            a70Var.k(obj);
            return true;
        }
        b70 b70Var = (b70) g;
        boolean k = b70Var.k(obj2);
        if (k && b70Var.g()) {
            a70Var.k(obj);
        }
        return k;
    }

    public static final void p(a70 a70Var, Object obj) {
        boolean z;
        long[] jArr = a70Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = a70Var.b[i4];
                        Object obj3 = a70Var.c[i4];
                        if (obj3 instanceof b70) {
                            b70 b70Var = (b70) obj3;
                            b70Var.k(obj);
                            z = b70Var.g();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            a70Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void q(w5 w5Var, int i) {
        Object obj;
        Iterator<T> it = w5Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((p10) ((Map.Entry) obj).getKey()).e == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        g8.q();
    }

    public static final void r(ih ihVar, qu quVar, Object obj) {
        if (((qh) ihVar).Q || !nz.l(((qh) ihVar).K(), obj)) {
            qh qhVar = (qh) ihVar;
            qhVar.e0(obj);
            qhVar.b(quVar, obj);
        }
    }

    public static final Rect s(fz fzVar) {
        return new Rect(fzVar.a, fzVar.b, fzVar.c, fzVar.d);
    }

    public static final zi0 t(Rect rect) {
        return new zi0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final String u(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
