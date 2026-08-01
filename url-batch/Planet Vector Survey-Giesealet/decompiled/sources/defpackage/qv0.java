package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qv0 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final boolean k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final a30[] n;
    public final Rect o = new Rect();
    public e10 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qv0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, f10 f10Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout h;
        char c;
        boolean z2;
        int i10;
        int i11;
        long j;
        a30[] a30VarArr;
        long j2;
        int i12;
        Layout layout;
        int i13;
        boolean z3;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic a = tv0.a(i2);
        Layout.Alignment alignment = ev0.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ev0.b : ev0.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, j9.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = f10Var.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a2 == null || f10Var.c() > f || z4) {
                this.k = false;
                i9 = i3;
                textDirectionHeuristic = a;
                h = od0.h(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.k = true;
                if (ceil < 0) {
                    dy.a("negative width");
                }
                if (ceil < 0) {
                    dy.a("negative ellipsized width");
                }
                h = Build.VERSION.SDK_INT >= 33 ? x0.e(charSequence, textPaint, ceil, alignment2, a2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, 0.0f, a2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = a;
            }
            this.e = h;
            Trace.endSection();
            int min = Math.min(h.getLineCount(), i9);
            this.f = min;
            int i14 = min - 1;
            this.d = min >= i9 && (h.getEllipsisCount(i14) > 0 || h.getLineEnd(i14) != charSequence.length());
            long j3 = tv0.b;
            long j4 = 4294967295L;
            if (z) {
                c = ' ';
                z2 = true;
                i10 = 33;
            } else if (this.k) {
                BoringLayout boringLayout = (BoringLayout) h;
                i10 = 33;
                if (Build.VERSION.SDK_INT >= 33) {
                    z3 = boringLayout.isFallbackLineSpacingEnabled();
                    if (!z3) {
                        TextPaint paint = h.getPaint();
                        CharSequence text = h.getText();
                        i11 = 0;
                        Rect h2 = ld0.h(paint, text, h.getLineStart(0), h.getLineEnd(0));
                        int lineAscent = h.getLineAscent(0);
                        c = ' ';
                        int i15 = h2.top;
                        int topPadding = i15 < lineAscent ? lineAscent - i15 : h.getTopPadding();
                        z2 = true;
                        h2 = min != 1 ? ld0.h(paint, text, h.getLineStart(i14), h.getLineEnd(i14)) : h2;
                        int lineDescent = h.getLineDescent(i14);
                        int i16 = h2.bottom;
                        int bottomPadding = i16 > lineDescent ? i16 - lineDescent : h.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            j = (bottomPadding & 4294967295L) | (topPadding << 32);
                            Paint.FontMetricsInt fontMetricsInt = null;
                            if (h.getText() instanceof Spanned) {
                                CharSequence text2 = h.getText();
                                text2.getClass();
                                if (ld0.j((Spanned) text2, a30.class) || h.getText().length() <= 0) {
                                    CharSequence text3 = h.getText();
                                    text3.getClass();
                                    a30VarArr = (a30[]) ((Spanned) text3).getSpans(i11, h.getText().length(), a30.class);
                                    this.n = a30VarArr;
                                    if (a30VarArr == null) {
                                        int length2 = a30VarArr.length;
                                        int i17 = i11;
                                        int i18 = i17;
                                        int i19 = i18;
                                        while (i17 < length2) {
                                            boolean z5 = z2;
                                            a30 a30Var = a30VarArr[i17];
                                            long j5 = j4;
                                            int i20 = a30Var.n;
                                            i18 = i20 < 0 ? Math.max(i18, Math.abs(i20)) : i18;
                                            int i21 = a30Var.o;
                                            if (i21 < 0) {
                                                i19 = Math.max(i18, Math.abs(i21));
                                            }
                                            i17++;
                                            j4 = j5;
                                            z2 = z5;
                                        }
                                        j2 = j4;
                                        j3 = (i18 == 0 && i19 == 0) ? tv0.b : (i18 << c) | (i19 & j2);
                                    } else {
                                        j2 = 4294967295L;
                                    }
                                    this.g = Math.max((int) (j >> c), (int) (j3 >> c));
                                    this.h = Math.max((int) (j & j2), (int) (j3 & j2));
                                    TextPaint textPaint2 = this.a;
                                    a30[] a30VarArr2 = this.n;
                                    i12 = this.f - 1;
                                    layout = this.e;
                                    if (layout.getLineStart(i12) == layout.getLineEnd(i12) || a30VarArr2 == null || a30VarArr2.length == 0) {
                                        i13 = i11;
                                    } else {
                                        SpannableString spannableString = new SpannableString("\u200b");
                                        if (a30VarArr2.length == 0) {
                                            g8.e("Array is empty.");
                                            throw null;
                                        }
                                        a30 a30Var2 = a30VarArr2[i11];
                                        spannableString.setSpan(new a30(a30Var2.d, spannableString.length(), (i12 == 0 || !a30Var2.g) ? a30Var2.g : i11, a30Var2.g, a30Var2.h, a30Var2.i), i11, spannableString.length(), i10);
                                        i13 = i11;
                                        StaticLayout h3 = od0.h(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, a10.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                                        fontMetricsInt = new Paint.FontMetricsInt();
                                        fontMetricsInt.ascent = h3.getLineAscent(i13);
                                        fontMetricsInt.descent = h3.getLineDescent(i13);
                                        fontMetricsInt.top = h3.getLineTop(i13);
                                        fontMetricsInt.bottom = h3.getLineBottom(i13);
                                    }
                                    this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i14) - f(i14))) : i13;
                                    this.l = fontMetricsInt;
                                    Layout layout2 = this.e;
                                    this.i = d31.u(layout2, i14, layout2.getPaint());
                                    Layout layout3 = this.e;
                                    this.j = d31.v(layout3, i14, layout3.getPaint());
                                }
                            }
                            a30VarArr = null;
                            this.n = a30VarArr;
                            if (a30VarArr == null) {
                            }
                            this.g = Math.max((int) (j >> c), (int) (j3 >> c));
                            this.h = Math.max((int) (j & j2), (int) (j3 & j2));
                            TextPaint textPaint22 = this.a;
                            a30[] a30VarArr22 = this.n;
                            i12 = this.f - 1;
                            layout = this.e;
                            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                            }
                            i13 = i11;
                            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (d(i14) - f(i14))) : i13;
                            this.l = fontMetricsInt;
                            Layout layout22 = this.e;
                            this.i = d31.u(layout22, i14, layout22.getPaint());
                            Layout layout32 = this.e;
                            this.j = d31.v(layout32, i14, layout32.getPaint());
                        }
                        j = j3;
                        Paint.FontMetricsInt fontMetricsInt2 = null;
                        if (h.getText() instanceof Spanned) {
                        }
                        a30VarArr = null;
                        this.n = a30VarArr;
                        if (a30VarArr == null) {
                        }
                        this.g = Math.max((int) (j >> c), (int) (j3 >> c));
                        this.h = Math.max((int) (j & j2), (int) (j3 & j2));
                        TextPaint textPaint222 = this.a;
                        a30[] a30VarArr222 = this.n;
                        i12 = this.f - 1;
                        layout = this.e;
                        if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                        }
                        i13 = i11;
                        this.m = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (d(i14) - f(i14))) : i13;
                        this.l = fontMetricsInt2;
                        Layout layout222 = this.e;
                        this.i = d31.u(layout222, i14, layout222.getPaint());
                        Layout layout322 = this.e;
                        this.j = d31.v(layout322, i14, layout322.getPaint());
                    }
                    c = ' ';
                    z2 = true;
                }
                z3 = false;
                if (!z3) {
                }
            } else {
                i10 = 33;
                StaticLayout staticLayout = (StaticLayout) h;
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 33) {
                    z3 = staticLayout.isFallbackLineSpacingEnabled();
                } else {
                    if (i22 >= 28) {
                        z3 = true;
                    }
                    z3 = false;
                }
                if (!z3) {
                }
            }
            i11 = 0;
            j = j3;
            Paint.FontMetricsInt fontMetricsInt22 = null;
            if (h.getText() instanceof Spanned) {
            }
            a30VarArr = null;
            this.n = a30VarArr;
            if (a30VarArr == null) {
            }
            this.g = Math.max((int) (j >> c), (int) (j3 >> c));
            this.h = Math.max((int) (j & j2), (int) (j3 & j2));
            TextPaint textPaint2222 = this.a;
            a30[] a30VarArr2222 = this.n;
            i12 = this.f - 1;
            layout = this.e;
            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
            }
            i13 = i11;
            this.m = fontMetricsInt22 != null ? fontMetricsInt22.bottom - ((int) (d(i14) - f(i14))) : i13;
            this.l = fontMetricsInt22;
            Layout layout2222 = this.e;
            this.i = d31.u(layout2222, i14, layout2222.getPaint());
            Layout layout3222 = this.e;
            this.j = d31.v(layout3222, i14, layout3222.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.e;
        return (z ? layout.getLineBottom(this.f - 1) : layout.getHeight()) + this.g + this.h + this.m;
    }

    public final e10 b() {
        e10 e10Var = this.p;
        if (e10Var != null) {
            return e10Var;
        }
        e10 e10Var2 = new e10(this.e);
        this.p = e10Var2;
        return e10Var2;
    }

    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i != this.f + (-1) || (fontMetricsInt = this.l) == null) ? this.e.getLineBaseline(i) : f(i) - fontMetricsInt.ascent);
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f;
        int i3 = i2 - 1;
        Layout layout = this.e;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.g + layout.getLineBottom(i) + (i == i2 + (-1) ? this.h : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        fv0 fv0Var = tv0.a;
        Layout layout = this.e;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float f(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final float g(int i, boolean z) {
        return (this.e.getLineForOffset(i) == this.f - 1 ? this.i + this.j : 0.0f) + b().b(i, true, z);
    }

    public final float h(int i, boolean z) {
        return (this.e.getLineForOffset(i) == this.f + (-1) ? this.i + this.j : 0.0f) + b().b(i, false, z);
    }
}
