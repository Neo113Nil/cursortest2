package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a5 {
    public final d5 a;
    public final int b;
    public final long c;
    public final qv0 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a5(d5 d5Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ns0 ns0Var;
        int i10;
        int i11;
        int i12;
        char c;
        ns0 ns0Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        qv0 a;
        int i13;
        a5 a5Var;
        int i14;
        int i15;
        int i16;
        Layout layout;
        oq0[] oq0VarArr;
        CharSequence charSequence;
        List list;
        zi0 zi0Var;
        float g;
        int i17;
        this.a = d5Var;
        this.b = i;
        this.c = j;
        if (ui.i(j) != 0 || ui.j(j) != 0) {
            dy.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            dy.a("maxLines should be greater than 0");
        }
        dw0 dw0Var = d5Var.e;
        CharSequence charSequence2 = d5Var.k;
        if (i2 == 2) {
            i3 = 0;
            if (!fw0.a(dw0Var.a.h, ze0.m(0)) && !fw0.a(dw0Var.a.h, fw0.c) && (i17 = dw0Var.b.a) != Integer.MIN_VALUE && i17 != 5 && i17 != 4 && charSequence2.length() != 0) {
                Spannable spannable = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!ld0.j(spannable, px.class)) {
                    spannable.setSpan(new px(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        wd0 wd0Var = dw0Var.b;
        ns0 ns0Var3 = dw0Var.a;
        int i18 = wd0Var.a;
        int i19 = 3;
        int i20 = i18 == 1 ? 3 : i18 == 2 ? 4 : i18 == 3 ? 2 : (i18 != 5 && i18 == 6) ? 1 : i3;
        int i21 = i18 == 4 ? 1 : i3;
        int i22 = wd0Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = wd0Var.g;
        int i24 = i23 & 255;
        if (i24 != 1) {
            if (i24 == 2) {
                i4 = i23;
                i5 = i21;
                i6 = 1;
            } else if (i24 == 3) {
                i4 = i23;
                i5 = i21;
                i6 = 2;
            }
            i7 = (i4 >> 8) & 255;
            if (i7 != 1) {
                if (i7 == 2) {
                    i19 = 1;
                } else if (i7 == 3) {
                    i19 = 2;
                } else if (i7 == 4) {
                }
                i8 = (i4 >> 16) & 255;
                if (i8 == 1) {
                    i9 = 2;
                } else {
                    i9 = 2;
                    if (i8 == 2) {
                        ns0Var = ns0Var3;
                        i10 = i20;
                        i11 = 1;
                        if (i2 != i9) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i2 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i2 != 4) {
                                i12 = i22;
                                c = ' ';
                                ns0Var2 = ns0Var;
                                truncateAt = null;
                                a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                                Layout layout2 = a.e;
                                i13 = i10;
                                if (Build.VERSION.SDK_INT < 35 || d5Var.j.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                                    a5Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    i16 = 2;
                                } else {
                                    int ellipsisStart = layout2.getEllipsisStart(0);
                                    i16 = 2;
                                    CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                    a5Var = this;
                                    i14 = i;
                                    i15 = i13;
                                    a = a5Var.a(i15, i5, truncateAt, i14, i12, i6, i19, i11, TextUtils.concat(charSequenceArr));
                                }
                                int i25 = a.f;
                                if (i2 == i16 || a.a() <= ui.g(j) || i14 <= 1) {
                                    a5Var.d = a;
                                } else {
                                    int g2 = ui.g(j);
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= i25) {
                                            i26 = i25;
                                            break;
                                        } else if (a.d(i26) > g2) {
                                            break;
                                        } else {
                                            i26++;
                                        }
                                    }
                                    if (i26 >= 0 && i26 != a5Var.b) {
                                        a = a5Var.a(i15, i5, truncateAt, i26 < 1 ? 1 : i26, i12, i6, i19, i11, a5Var.e);
                                    }
                                    a5Var.d = a;
                                }
                                a5Var.a.j.c(ns0Var2.a.e(), (Float.floatToRawIntBits(a5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(a5Var.c()) << c), ns0Var2.a.a());
                                layout = a5Var.d.e;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), oq0.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        oq0VarArr = (oq0[]) ((Spanned) text2).getSpans(0, layout.getText().length(), oq0.class);
                                        if (oq0VarArr != null) {
                                            int i27 = 0;
                                            while (i27 < oq0VarArr.length) {
                                                int i28 = i27 + 1;
                                                try {
                                                    oq0VarArr[i27].f.setValue(new fr0((Float.floatToRawIntBits(a5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(a5Var.c()) << c)));
                                                    i27 = i28;
                                                } catch (ArrayIndexOutOfBoundsException e) {
                                                    g8.e(e.getMessage());
                                                    throw null;
                                                }
                                            }
                                        }
                                        charSequence = a5Var.e;
                                        if (charSequence instanceof Spanned) {
                                            list = wp.d;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence;
                                            Object[] spans = spanned2.getSpans(0, charSequence.length(), bg0.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj : spans) {
                                                bg0 bg0Var = (bg0) obj;
                                                int spanStart = spanned2.getSpanStart(bg0Var);
                                                int spanEnd = spanned2.getSpanEnd(bg0Var);
                                                int lineForOffset = a5Var.d.e.getLineForOffset(spanStart);
                                                boolean z = lineForOffset >= a5Var.b;
                                                boolean z2 = a5Var.d.e.getEllipsisCount(lineForOffset) > 0 && spanEnd > a5Var.d.e.getEllipsisStart(lineForOffset);
                                                boolean z3 = spanEnd > a5Var.d.e(lineForOffset);
                                                if (z2 || z3 || z) {
                                                    zi0Var = null;
                                                } else {
                                                    int ordinal = (a5Var.d.e.isRtlCharAt(spanStart) ? qk0.e : qk0.d).ordinal();
                                                    if (ordinal == 0) {
                                                        g = a5Var.d.g(spanStart, false);
                                                    } else {
                                                        if (ordinal != 1) {
                                                            g8.c();
                                                            throw null;
                                                        }
                                                        float g3 = a5Var.d.g(spanStart, false);
                                                        if (!bg0Var.g) {
                                                            dy.b("PlaceholderSpan is not laid out yet.");
                                                        }
                                                        g = g3 - bg0Var.e;
                                                    }
                                                    if (!bg0Var.g) {
                                                        dy.b("PlaceholderSpan is not laid out yet.");
                                                    }
                                                    float c2 = a5Var.d.c(lineForOffset) - bg0Var.b();
                                                    zi0Var = new zi0(g, c2, bg0Var.e + g, bg0Var.b() + c2);
                                                }
                                                arrayList.add(zi0Var);
                                            }
                                            list = arrayList;
                                        }
                                        a5Var.f = list;
                                    }
                                }
                                oq0VarArr = null;
                                if (oq0VarArr != null) {
                                }
                                charSequence = a5Var.e;
                                if (charSequence instanceof Spanned) {
                                }
                                a5Var.f = list;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i12 = i22;
                        c = ' ';
                        ns0Var2 = ns0Var;
                        truncateAt = truncateAt2;
                        a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                        Layout layout22 = a.e;
                        i13 = i10;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        a5Var = this;
                        i14 = i;
                        i15 = i13;
                        i16 = 2;
                        int i252 = a.f;
                        if (i2 == i16) {
                        }
                        a5Var.d = a;
                        a5Var.a.j.c(ns0Var2.a.e(), (Float.floatToRawIntBits(a5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(a5Var.c()) << c), ns0Var2.a.a());
                        layout = a5Var.d.e;
                        if (layout.getText() instanceof Spanned) {
                        }
                        oq0VarArr = null;
                        if (oq0VarArr != null) {
                        }
                        charSequence = a5Var.e;
                        if (charSequence instanceof Spanned) {
                        }
                        a5Var.f = list;
                    }
                }
                ns0Var = ns0Var3;
                i10 = i20;
                i11 = i3;
                if (i2 != i9) {
                }
                i12 = i22;
                c = ' ';
                ns0Var2 = ns0Var;
                truncateAt = truncateAt2;
                a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
                Layout layout222 = a.e;
                i13 = i10;
                if (Build.VERSION.SDK_INT < 35) {
                }
                a5Var = this;
                i14 = i;
                i15 = i13;
                i16 = 2;
                int i2522 = a.f;
                if (i2 == i16) {
                }
                a5Var.d = a;
                a5Var.a.j.c(ns0Var2.a.e(), (Float.floatToRawIntBits(a5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(a5Var.c()) << c), ns0Var2.a.a());
                layout = a5Var.d.e;
                if (layout.getText() instanceof Spanned) {
                }
                oq0VarArr = null;
                if (oq0VarArr != null) {
                }
                charSequence = a5Var.e;
                if (charSequence instanceof Spanned) {
                }
                a5Var.f = list;
            }
            i19 = i3;
            i8 = (i4 >> 16) & 255;
            if (i8 == 1) {
            }
            ns0Var = ns0Var3;
            i10 = i20;
            i11 = i3;
            if (i2 != i9) {
            }
            i12 = i22;
            c = ' ';
            ns0Var2 = ns0Var;
            truncateAt = truncateAt2;
            a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
            Layout layout2222 = a.e;
            i13 = i10;
            if (Build.VERSION.SDK_INT < 35) {
            }
            a5Var = this;
            i14 = i;
            i15 = i13;
            i16 = 2;
            int i25222 = a.f;
            if (i2 == i16) {
            }
            a5Var.d = a;
            a5Var.a.j.c(ns0Var2.a.e(), (Float.floatToRawIntBits(a5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(a5Var.c()) << c), ns0Var2.a.a());
            layout = a5Var.d.e;
            if (layout.getText() instanceof Spanned) {
            }
            oq0VarArr = null;
            if (oq0VarArr != null) {
            }
            charSequence = a5Var.e;
            if (charSequence instanceof Spanned) {
            }
            a5Var.f = list;
        }
        i4 = i23;
        i5 = i21;
        i6 = i3;
        i7 = (i4 >> 8) & 255;
        if (i7 != 1) {
        }
        i19 = i3;
        i8 = (i4 >> 16) & 255;
        if (i8 == 1) {
        }
        ns0Var = ns0Var3;
        i10 = i20;
        i11 = i3;
        if (i2 != i9) {
        }
        i12 = i22;
        c = ' ';
        ns0Var2 = ns0Var;
        truncateAt = truncateAt2;
        a = a(i10, i5, truncateAt, i, i12, i6, i19, i11, charSequence3);
        Layout layout22222 = a.e;
        i13 = i10;
        if (Build.VERSION.SDK_INT < 35) {
        }
        a5Var = this;
        i14 = i;
        i15 = i13;
        i16 = 2;
        int i252222 = a.f;
        if (i2 == i16) {
        }
        a5Var.d = a;
        a5Var.a.j.c(ns0Var2.a.e(), (Float.floatToRawIntBits(a5Var.b()) & 4294967295L) | (Float.floatToRawIntBits(a5Var.c()) << c), ns0Var2.a.a());
        layout = a5Var.d.e;
        if (layout.getText() instanceof Spanned) {
        }
        oq0VarArr = null;
        if (oq0VarArr != null) {
        }
        charSequence = a5Var.e;
        if (charSequence instanceof Spanned) {
        }
        a5Var.f = list;
    }

    public final qv0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        lg0 lg0Var;
        float c = c();
        d5 d5Var = this.a;
        l5 l5Var = d5Var.j;
        int i8 = d5Var.o;
        f10 f10Var = d5Var.l;
        dw0 dw0Var = d5Var.e;
        b5 b5Var = c5.a;
        ng0 ng0Var = dw0Var.c;
        return new qv0(charSequence, c, l5Var, i, truncateAt, i8, (ng0Var == null || (lg0Var = ng0Var.a) == null) ? false : lg0Var.a, i3, i5, i6, i7, i4, i2, f10Var);
    }

    public final float b() {
        return this.d.a();
    }

    public final float c() {
        return ui.h(this.c);
    }

    public final void d(kc kcVar) {
        Canvas a = p2.a(kcVar);
        qv0 qv0Var = this.d;
        if (qv0Var.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, c(), b());
        }
        int i = qv0Var.g;
        if (a.getClipBounds(qv0Var.o)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            fv0 fv0Var = tv0.a;
            fv0Var.a = a;
            qv0Var.e.draw(fv0Var);
            if (i != 0) {
                a.translate(0.0f, (-1.0f) * i);
            }
        }
        if (qv0Var.d) {
            a.restore();
        }
    }
}
