package yads;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class ia3 {
    public static ja3 a(ja3 ja3Var, String[] strArr, Map map) {
        int i = 0;
        if (ja3Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (ja3) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                ja3 ja3Var2 = new ja3();
                int length = strArr.length;
                while (i < length) {
                    ja3Var2.a((ja3) map.get(strArr[i]));
                    i++;
                }
                return ja3Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return ja3Var.a((ja3) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    ja3Var.a((ja3) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ja3Var;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, ja3 ja3Var, ga3 ga3Var, Map map, int i3) {
        int i4;
        ga3 ga3Var2;
        int i5;
        int i6 = ja3Var.h;
        if (i6 == -1 && ja3Var.i == -1) {
            i4 = -1;
        } else {
            i4 = (i6 == 1 ? (char) 1 : (char) 0) | (ja3Var.i == 1 ? (char) 2 : (char) 0);
        }
        if (i4 != -1) {
            int i7 = ja3Var.h;
            if (i7 == -1 && ja3Var.i == -1) {
                i5 = -1;
            } else {
                i5 = (i7 == 1 ? 1 : 0) | (ja3Var.i == 1 ? 2 : 0);
            }
            spannableStringBuilder.setSpan(new StyleSpan(i5), i, i2, 33);
        }
        if (ja3Var.f == 1) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (ja3Var.g == 1) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (ja3Var.c) {
            if (ja3Var.c) {
                p23.a(spannableStringBuilder, new ForegroundColorSpan(ja3Var.b), i, i2);
            } else {
                throw new IllegalStateException("Font color has not been defined.");
            }
        }
        if (ja3Var.e) {
            if (ja3Var.e) {
                p23.a(spannableStringBuilder, new BackgroundColorSpan(ja3Var.d), i, i2);
            } else {
                throw new IllegalStateException("Background color has not been defined.");
            }
        }
        if (ja3Var.a != null) {
            p23.a(spannableStringBuilder, new TypefaceSpan(ja3Var.a), i, i2);
        }
        if (ja3Var.r != null) {
            p23.a(spannableStringBuilder, new j63(), i, i2);
        }
        int i8 = ja3Var.m;
        if (i8 == 2) {
            ga3 ga3Var3 = ga3Var;
            while (true) {
                if (ga3Var3 == null) {
                    ga3Var3 = null;
                    break;
                }
                ja3 a = a(ga3Var3.f, ga3Var3.g, map);
                if (a != null && a.m == 1) {
                    break;
                } else {
                    ga3Var3 = ga3Var3.j;
                }
            }
            if (ga3Var3 != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(ga3Var3);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        ga3Var2 = null;
                        break;
                    }
                    ga3 ga3Var4 = (ga3) arrayDeque.pop();
                    ja3 a2 = a(ga3Var4.f, ga3Var4.g, map);
                    if (a2 != null && a2.m == 3) {
                        ga3Var2 = ga3Var4;
                        break;
                    }
                    ArrayList arrayList = ga3Var4.m;
                    for (int size = (arrayList == null ? 0 : arrayList.size()) - 1; size >= 0; size--) {
                        arrayDeque.push(ga3Var4.a(size));
                    }
                }
                if (ga3Var2 != null) {
                    ArrayList arrayList2 = ga3Var2.m;
                    if ((arrayList2 == null ? 0 : arrayList2.size()) == 1 && ga3Var2.a(0).b != null) {
                        String str = ga3Var2.a(0).b;
                        int i9 = sb3.a;
                        ja3 a3 = a(ga3Var2.f, ga3Var2.g, map);
                        if ((a3 != null ? a3.n : -1) == -1) {
                            a(ga3Var3.f, ga3Var3.g, map);
                        }
                        spannableStringBuilder.setSpan(new ms2(), i, i2, 33);
                    } else {
                        gh1.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    }
                }
            }
        } else if (i8 == 3 || i8 == 4) {
            spannableStringBuilder.setSpan(new dg0(), i, i2, 33);
        }
        if (ja3Var.q == 1) {
            p23.a(spannableStringBuilder, new f01(), i, i2);
        }
        int i10 = ja3Var.j;
        if (i10 == 1) {
            p23.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ja3Var.k, true), i, i2);
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            p23.a(spannableStringBuilder, new RelativeSizeSpan(ja3Var.k / 100.0f), i, i2);
        } else {
            p23.a(spannableStringBuilder, new RelativeSizeSpan(ja3Var.k), i, i2);
        }
    }
}
