package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d5 implements td0 {
    public final String d;
    public final dw0 e;
    public final List f;
    public final List g;
    public final ct h;
    public final sl i;
    public final l5 j;
    public final CharSequence k;
    public final f10 l;
    public t7 m;
    public final boolean n;
    public final int o;

    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a2, code lost:
    
        if ((r4.b.c & 1095216660480L) != 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0093, code lost:
    
        if (r7 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0987 A[LOOP:7: B:340:0x0985->B:341:0x0987, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d5(String str, dw0 dw0Var, List list, List list2, ct ctVar, sl slVar) {
        Locale locale;
        int i;
        eg0 eg0Var;
        int i2;
        ns0 ns0Var;
        int size;
        int i3;
        Object obj;
        String str2;
        lv0 lv0Var;
        t30 t30Var;
        long j;
        long b;
        qu0 qu0Var;
        by0 b2;
        Typeface typeface;
        ns0 ns0Var2;
        ?? r1;
        dw0 dw0Var2;
        List list3;
        boolean z;
        String str3;
        float f;
        CharSequence charSequence;
        long j2;
        ng0 ng0Var;
        long j3;
        float k;
        int i4;
        int length;
        mv0 mv0Var;
        eg0 eg0Var2;
        ArrayList arrayList;
        int size2;
        int i5;
        sl slVar2;
        ns0 ns0Var3;
        ArrayList arrayList2;
        int i6;
        int i7;
        int size3;
        int i8;
        boolean z2;
        mv0 mv0Var2;
        int size4;
        int i9;
        Class<zx0> cls;
        sl slVar3;
        Object a20Var;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        lg0 lg0Var;
        CharSequence charSequence2;
        int i14;
        ny0 ny0Var;
        int i15;
        zx0[] zx0VarArr;
        this.d = str;
        this.e = dw0Var;
        this.f = list;
        this.g = list2;
        this.h = ctVar;
        this.i = slVar;
        float a = slVar.a();
        l5 l5Var = new l5(1);
        ((TextPaint) l5Var).density = a;
        l5Var.b = gv0.b;
        l5Var.c = 3;
        l5Var.d = pq0.d;
        this.j = l5Var;
        ng0 ng0Var2 = dw0Var.c;
        p01 p01Var = lp.a;
        p01 p01Var2 = lp.a;
        bt0 bt0Var = (bt0) p01Var2.e;
        if (bt0Var == null) {
            if (gp.k != null) {
                bt0Var = p01Var2.l();
                p01Var2.e = bt0Var;
            } else {
                bt0Var = nz.h;
            }
        }
        this.n = ((Boolean) bt0Var.getValue()).booleanValue();
        int i16 = dw0Var.b.b;
        t30 t30Var2 = dw0Var.a.k;
        int i17 = 2;
        if (i16 != 4) {
            if (i16 != 5) {
                if (i16 == 1) {
                    i = 0;
                } else if (i16 == 2) {
                    i = 1;
                } else {
                    if (i16 != 3 && i16 != Integer.MIN_VALUE) {
                        g8.s("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((t30Var2 == null || (locale = t30Var2.a().a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.o = i;
                eg0Var = new eg0(i17, this);
                wv0 wv0Var = dw0Var.b.i;
                wv0Var = wv0Var == null ? wv0.c : wv0Var;
                l5Var.setFlags(wv0Var.b ? l5Var.getFlags() | 128 : l5Var.getFlags() & (-129));
                i2 = wv0Var.a;
                if (i2 == 1) {
                    l5Var.setFlags(l5Var.getFlags() | 64);
                    l5Var.setHinting(0);
                } else if (i2 == 2) {
                    l5Var.getFlags();
                    l5Var.setHinting(1);
                } else if (i2 == 3) {
                    l5Var.getFlags();
                    l5Var.setHinting(0);
                } else {
                    l5Var.getFlags();
                }
                ns0Var = dw0Var.a;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((k7) obj).a instanceof ns0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                boolean z4 = obj != null;
                long j4 = ns0Var.b;
                str2 = ns0Var.g;
                kv0 kv0Var = ns0Var.a;
                lv0Var = ns0Var.j;
                t30Var = ns0Var.k;
                j = ns0Var.h;
                b = fw0.b(j4);
                if (gw0.a(b, 4294967296L)) {
                    l5Var.setTextSize(slVar.I(j4));
                } else if (gw0.a(b, 8589934592L)) {
                    l5Var.setTextSize(fw0.c(j4) * l5Var.getTextSize());
                }
                qu0Var = ns0Var.f;
                if (qu0Var == null || ns0Var.d != null || ns0Var.c != null) {
                    ut utVar = ns0Var.c;
                    utVar = utVar == null ? ut.f : utVar;
                    st stVar = ns0Var.d;
                    int i18 = stVar != null ? stVar.a : 0;
                    tt ttVar = ns0Var.e;
                    int i19 = ttVar != null ? ttVar.a : 65535;
                    d5 d5Var = (d5) eg0Var.e;
                    b2 = ((dt) d5Var.h).b(qu0Var, utVar, i18, i19);
                    if (b2 instanceof by0) {
                        Object obj2 = b2.d;
                        obj2.getClass();
                        typeface = (Typeface) obj2;
                    } else {
                        t7 t7Var = new t7(b2, d5Var.m);
                        d5Var.m = t7Var;
                        Object obj3 = t7Var.g;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    }
                    l5Var.setTypeface(typeface);
                }
                if (t30Var != null) {
                    t30 t30Var3 = t30.f;
                    ig0 ig0Var = jg0.a;
                    if (!t30Var.equals(ig0Var.g())) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            ArrayList arrayList3 = new ArrayList(ae.Y(t30Var, 10));
                            Iterator it = t30Var.d.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((s30) it.next()).a);
                            }
                            Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                            l5Var.setTextLocales(r0.d((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                        } else {
                            l5Var.setTextLocale((t30Var.d.isEmpty() ? ig0Var.g().a() : t30Var.a()).a);
                        }
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    l5Var.setFontFeatureSettings(str2);
                }
                if (lv0Var != null && !lv0Var.equals(lv0.c)) {
                    l5Var.setTextScaleX(l5Var.getTextScaleX() * lv0Var.a);
                    l5Var.setTextSkewX(l5Var.getTextSkewX() + lv0Var.b);
                }
                l5Var.d(kv0Var.b());
                l5Var.c(kv0Var.e(), 9205357640488583168L, kv0Var.a());
                l5Var.f(ns0Var.n);
                l5Var.g(ns0Var.m);
                l5Var.e(ns0Var.o);
                if (!gw0.a(fw0.b(j), 4294967296L) && fw0.c(j) != 0.0f) {
                    float textScaleX = l5Var.getTextScaleX() * l5Var.getTextSize();
                    float I = slVar.I(j);
                    if (textScaleX != 0.0f) {
                        l5Var.setLetterSpacing(I / textScaleX);
                    }
                } else if (gw0.a(fw0.b(j), 8589934592L)) {
                    l5Var.setLetterSpacing(fw0.c(j));
                }
                long j5 = ns0Var.l;
                i9 i9Var = ns0Var.i;
                boolean z5 = (z4 || !gw0.a(fw0.b(j), 4294967296L) || fw0.c(j) == 0.0f) ? false : true;
                long j6 = ge.g;
                boolean z6 = ge.c(j5, j6) && !ge.c(j5, ge.f);
                boolean z7 = i9Var == null && Float.compare(i9Var.a, 0.0f) != 0;
                ns0Var2 = (!z5 || z6 || z7) ? new ns0(0L, 0L, (ut) null, (st) null, (tt) null, (qu0) null, (String) null, z5 ? j : fw0.c, z7 ? i9Var : null, (lv0) null, (t30) null, z6 ? j5 : j6, (gv0) null, (pq0) null, 63103) : null;
                List list4 = this.f;
                if (ns0Var2 != null) {
                    int size5 = list4.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i20 = 0;
                    while (i20 < size5) {
                        arrayList4.add(i20 == 0 ? new k7(0, this.d.length(), ns0Var2) : (k7) this.f.get(i20 - 1));
                        i20++;
                    }
                    list4 = arrayList4;
                }
                r1 = this.d;
                float textSize = this.j.getTextSize();
                dw0Var2 = this.e;
                list3 = this.g;
                sl slVar4 = this.i;
                z = this.n;
                b5 b5Var = c5.a;
                Class<zx0> cls2 = zx0.class;
                if (z || gp.k == null) {
                    str3 = r1;
                    f = 0.0f;
                    charSequence = str3;
                } else {
                    ng0 ng0Var3 = dw0Var2.c;
                    if (ng0Var3 != null) {
                        lg0 lg0Var2 = ng0Var3.a;
                    }
                    gp a2 = gp.a();
                    int length2 = r1.length();
                    if (!(a2.b() == 1)) {
                        g8.s("Not initialized yet");
                        throw null;
                    }
                    if (length2 < 0) {
                        g8.r("end cannot be negative");
                        throw null;
                    }
                    if (!(length2 >= 0)) {
                        g8.r("start should be <= than end");
                        throw null;
                    }
                    if (!(r1.length() >= 0)) {
                        g8.r("start should be < than charSequence length");
                        throw null;
                    }
                    if (!(length2 <= r1.length())) {
                        g8.r("end should be < than charSequence length");
                        throw null;
                    }
                    if (r1.length() == 0 || length2 == 0) {
                        str3 = r1;
                        f = 0.0f;
                    } else {
                        t7 t7Var2 = a2.e.b;
                        t7Var2.getClass();
                        if (r1 instanceof Spannable) {
                            ny0Var = new ny0((Spannable) r1);
                            i14 = 0;
                        } else if (!(r1 instanceof Spanned) || ((Spanned) r1).nextSpanTransition(-1, length2 + 1, cls2) > length2) {
                            i14 = 0;
                            ny0Var = null;
                        } else {
                            ny0Var = new ny0();
                            i14 = 0;
                            ny0Var.d = false;
                            ny0Var.e = new SpannableString(r1);
                        }
                        if (ny0Var == null || (zx0VarArr = (zx0[]) ny0Var.e.getSpans(i14, length2, cls2)) == null || zx0VarArr.length <= 0) {
                            str3 = r1;
                            f = 0.0f;
                            i15 = 0;
                        } else {
                            int length3 = zx0VarArr.length;
                            f = 0.0f;
                            i15 = 0;
                            int i21 = 0;
                            String str4 = r1;
                            while (true) {
                                str3 = str4;
                                if (i21 >= length3) {
                                    break;
                                }
                                zx0 zx0Var = zx0VarArr[i21];
                                int i22 = i21;
                                int spanStart = ny0Var.e.getSpanStart(zx0Var);
                                int i23 = length3;
                                int spanEnd = ny0Var.e.getSpanEnd(zx0Var);
                                if (spanStart != length2) {
                                    ny0Var.removeSpan(zx0Var);
                                }
                                i15 = Math.min(spanStart, i15);
                                length2 = Math.max(spanEnd, length2);
                                i21 = i22 + 1;
                                length3 = i23;
                                str4 = str3;
                            }
                        }
                        if (i15 != length2 && i15 < str3.length()) {
                            ny0 ny0Var2 = (ny0) t7Var2.w(str3, i15, length2, Integer.MAX_VALUE, false, new j3(3, ny0Var, (y7) t7Var2.e));
                            if (ny0Var2 != null) {
                                charSequence2 = ny0Var2.e;
                                charSequence2.getClass();
                                charSequence = charSequence2;
                            }
                        }
                    }
                    charSequence2 = str3;
                    charSequence2.getClass();
                    charSequence = charSequence2;
                }
                CharSequence charSequence3 = (list4.isEmpty() && list3.isEmpty() && nz.l(dw0Var2.b.d, mv0.c)) ? charSequence : charSequence3;
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (nz.l(dw0Var2.a.m, gv0.c)) {
                    j2 = 0;
                    spannableString.setSpan(c5.a, 0, str3.length(), 33);
                } else {
                    j2 = 0;
                }
                ng0Var = dw0Var2.c;
                if ((ng0Var != null || (lg0Var = ng0Var.a) == null) ? false : lg0Var.a) {
                    wd0 wd0Var = dw0Var2.b;
                    if (wd0Var.f == null) {
                        float k2 = yc0.k(wd0Var.c, textSize, slVar4);
                        if (!Float.isNaN(k2)) {
                            spannableString.setSpan(new v20(k2), 0, spannableString.length(), 33);
                        }
                        j3 = 1095216660480L;
                        mv0Var = dw0Var2.b.d;
                        if (mv0Var != null) {
                            long j7 = mv0Var.a;
                            long j8 = mv0Var.b;
                            if ((!fw0.a(j7, ze0.m(0)) || !fw0.a(j8, ze0.m(0))) && (j7 & j3) != j2 && (j8 & j3) != j2) {
                                long b3 = fw0.b(j7);
                                eg0Var2 = eg0Var;
                                float I2 = gw0.a(b3, 4294967296L) ? slVar4.I(j7) : gw0.a(b3, 8589934592L) ? fw0.c(j7) * textSize : f;
                                long b4 = fw0.b(j8);
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(I2), (int) Math.ceil(gw0.a(b4, 4294967296L) ? slVar4.I(j8) : gw0.a(b4, 8589934592L) ? textSize * fw0.c(j8) : f)), 0, spannableString.length(), 33);
                                arrayList = new ArrayList(list4.size());
                                size2 = list4.size();
                                for (i5 = 0; i5 < size2; i5++) {
                                    k7 k7Var = (k7) list4.get(i5);
                                    Object obj4 = k7Var.a;
                                    if (obj4 instanceof ns0) {
                                        ns0 ns0Var4 = (ns0) obj4;
                                        if (((ns0Var4.f == null && ns0Var4.d == null && ns0Var4.c == null) ? false : true) || ((ns0) obj4).e != null) {
                                            arrayList.add(k7Var);
                                        }
                                    }
                                }
                                ns0 ns0Var5 = dw0Var2.a;
                                qu0 qu0Var2 = ns0Var5.f;
                                ns0 ns0Var6 = ((qu0Var2 == null || ns0Var5.d != null || ns0Var5.c != null) && ns0Var5.e == null) ? null : new ns0(0L, 0L, ns0Var5.c, ns0Var5.d, ns0Var5.e, qu0Var2, (String) null, 0L, (i9) null, (lv0) null, (t30) null, 0L, (gv0) null, (pq0) null, 65475);
                                ha haVar = new ha(3, spannableString, eg0Var2);
                                if (arrayList.size() <= 1) {
                                    if (!arrayList.isEmpty()) {
                                        ns0 ns0Var7 = (ns0) ((k7) arrayList.get(0)).a;
                                        haVar.b(ns0Var6 != null ? ns0Var6.c(ns0Var7) : ns0Var7, Integer.valueOf(((k7) arrayList.get(0)).b), Integer.valueOf(((k7) arrayList.get(0)).c));
                                    }
                                    slVar2 = slVar4;
                                } else {
                                    int size6 = arrayList.size();
                                    int i24 = size6 * 2;
                                    int[] iArr = new int[i24];
                                    int size7 = arrayList.size();
                                    int i25 = 0;
                                    while (i25 < size7) {
                                        k7 k7Var2 = (k7) arrayList.get(i25);
                                        iArr[i25] = k7Var2.b;
                                        iArr[i25 + size6] = k7Var2.c;
                                        i25++;
                                        slVar4 = slVar4;
                                    }
                                    slVar2 = slVar4;
                                    if (i24 > 1) {
                                        Arrays.sort(iArr);
                                    }
                                    if (i24 == 0) {
                                        g8.e("Array is empty.");
                                        throw null;
                                    }
                                    int i26 = iArr[0];
                                    int i27 = 0;
                                    while (i27 < i24) {
                                        int i28 = iArr[i27];
                                        if (i28 == i26) {
                                            arrayList2 = arrayList;
                                            ns0Var3 = ns0Var6;
                                            i6 = i27;
                                            i7 = i24;
                                        } else {
                                            int size8 = arrayList.size();
                                            ns0Var3 = ns0Var6;
                                            int i29 = 0;
                                            while (i29 < size8) {
                                                ArrayList arrayList5 = arrayList;
                                                k7 k7Var3 = (k7) arrayList.get(i29);
                                                int i30 = i27;
                                                int i31 = k7Var3.b;
                                                int i32 = i24;
                                                int i33 = k7Var3.c;
                                                if (i31 != i33 && m7.a(i26, i28, i31, i33)) {
                                                    ns0 ns0Var8 = (ns0) k7Var3.a;
                                                    ns0Var6 = ns0Var6 != null ? ns0Var6.c(ns0Var8) : ns0Var8;
                                                }
                                                i29++;
                                                arrayList = arrayList5;
                                                i27 = i30;
                                                i24 = i32;
                                            }
                                            arrayList2 = arrayList;
                                            i6 = i27;
                                            i7 = i24;
                                            if (ns0Var6 != null) {
                                                haVar.b(ns0Var6, Integer.valueOf(i26), Integer.valueOf(i28));
                                            }
                                            i26 = i28;
                                        }
                                        i27 = i6 + 1;
                                        ns0Var6 = ns0Var3;
                                        arrayList = arrayList2;
                                        i24 = i7;
                                    }
                                }
                                size3 = list4.size();
                                i8 = 0;
                                z2 = false;
                                while (i8 < size3) {
                                    k7 k7Var4 = (k7) list4.get(i8);
                                    Object obj5 = k7Var4.a;
                                    if (obj5 instanceof ns0) {
                                        int i34 = k7Var4.b;
                                        int i35 = k7Var4.c;
                                        if (i34 >= 0 && i34 < spannableString.length() && i35 > i34 && i35 <= spannableString.length()) {
                                            ns0 ns0Var9 = (ns0) obj5;
                                            i9 i9Var2 = ns0Var9.i;
                                            kv0 kv0Var2 = ns0Var9.a;
                                            if (i9Var2 != null) {
                                                spannableString.setSpan(new j9(i9Var2.a, 0), i34, i35, 33);
                                            }
                                            yc0.n(spannableString, kv0Var2.b(), i34, i35);
                                            px0 e = kv0Var2.e();
                                            float a3 = kv0Var2.a();
                                            if (e != null) {
                                                if (e instanceof ks0) {
                                                    yc0.n(spannableString, ((ks0) e).k, i34, i35);
                                                } else {
                                                    spannableString.setSpan(new oq0((nq0) e, a3), i34, i35, 33);
                                                }
                                            }
                                            gv0 gv0Var = ns0Var9.m;
                                            if (gv0Var != null) {
                                                int i36 = gv0Var.a;
                                                hv0 hv0Var = new hv0((i36 | 1) == i36, (i36 | 2) == i36);
                                                i12 = 33;
                                                spannableString.setSpan(hv0Var, i34, i35, 33);
                                            } else {
                                                i12 = 33;
                                            }
                                            yc0.p(spannableString, ns0Var9.b, slVar2, i34, i35);
                                            sl slVar5 = slVar2;
                                            String str5 = ns0Var9.g;
                                            if (str5 != null) {
                                                i10 = size3;
                                                spannableString.setSpan(new ft(0, str5), i34, i35, i12);
                                            } else {
                                                i10 = size3;
                                            }
                                            lv0 lv0Var2 = ns0Var9.j;
                                            if (lv0Var2 != null) {
                                                spannableString.setSpan(new ScaleXSpan(lv0Var2.a), i34, i35, i12);
                                                spannableString.setSpan(new j9(lv0Var2.b, 1), i34, i35, i12);
                                            }
                                            yc0.q(spannableString, ns0Var9.k, i34, i35);
                                            i11 = i8;
                                            z3 = z2;
                                            long j9 = ns0Var9.l;
                                            if (j9 != 16) {
                                                spannableString.setSpan(new BackgroundColorSpan(d31.I(j9)), i34, i35, 33);
                                            }
                                            pq0 pq0Var = ns0Var9.n;
                                            if (pq0Var != null) {
                                                long j10 = pq0Var.b;
                                                slVar2 = slVar5;
                                                int I3 = d31.I(pq0Var.a);
                                                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                                float f2 = pq0Var.c;
                                                qq0 qq0Var = new qq0(I3, intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                                i13 = 33;
                                                spannableString.setSpan(qq0Var, i34, i35, 33);
                                            } else {
                                                slVar2 = slVar5;
                                                i13 = 33;
                                            }
                                            nz nzVar = ns0Var9.o;
                                            if (nzVar != null) {
                                                spannableString.setSpan(new po(nzVar), i34, i35, i13);
                                            }
                                            if (gw0.a(fw0.b(ns0Var9.h), 4294967296L) || gw0.a(fw0.b(ns0Var9.h), 8589934592L)) {
                                                z2 = true;
                                                i8 = i11 + 1;
                                                size3 = i10;
                                            }
                                            z2 = z3;
                                            i8 = i11 + 1;
                                            size3 = i10;
                                        }
                                    }
                                    i10 = size3;
                                    i11 = i8;
                                    z3 = z2;
                                    z2 = z3;
                                    i8 = i11 + 1;
                                    size3 = i10;
                                }
                                if (z2) {
                                    int size9 = list4.size();
                                    int i37 = 0;
                                    while (i37 < size9) {
                                        k7 k7Var5 = (k7) list4.get(i37);
                                        j7 j7Var = (j7) k7Var5.a;
                                        if (j7Var instanceof ns0) {
                                            int i38 = k7Var5.b;
                                            int i39 = k7Var5.c;
                                            if (i38 >= 0 && i38 < spannableString.length() && i39 > i38 && i39 <= spannableString.length()) {
                                                long j11 = ((ns0) j7Var).h;
                                                long b5 = fw0.b(j11);
                                                cls = cls2;
                                                if (gw0.a(b5, 4294967296L)) {
                                                    slVar3 = slVar2;
                                                    a20Var = new b20(slVar3.I(j11));
                                                } else {
                                                    slVar3 = slVar2;
                                                    a20Var = gw0.a(b5, 8589934592L) ? new a20(fw0.c(j11)) : null;
                                                }
                                                if (a20Var != null) {
                                                    spannableString.setSpan(a20Var, i38, i39, 33);
                                                }
                                                i37++;
                                                cls2 = cls;
                                                slVar2 = slVar3;
                                            }
                                        }
                                        cls = cls2;
                                        slVar3 = slVar2;
                                        i37++;
                                        cls2 = cls;
                                        slVar2 = slVar3;
                                    }
                                }
                                Class<zx0> cls3 = cls2;
                                sl slVar6 = slVar2;
                                mv0Var2 = dw0Var2.b.d;
                                if (mv0Var2 != null) {
                                    long j12 = mv0Var2.a;
                                    long b6 = fw0.b(j12);
                                    if (gw0.a(b6, 4294967296L)) {
                                        slVar6.I(j12);
                                    } else if (gw0.a(b6, 8589934592L)) {
                                        fw0.c(j12);
                                    }
                                }
                                size4 = list4.size();
                                for (i9 = 0; i9 < size4; i9++) {
                                    Object obj6 = ((k7) list4.get(i9)).a;
                                }
                                charSequence3 = spannableString;
                                if (list3.size() > 0) {
                                    k7 k7Var6 = (k7) list3.get(0);
                                    if (k7Var6.a != null) {
                                        g8.q();
                                        throw null;
                                    }
                                    for (Object obj7 : spannableString.getSpans(k7Var6.b, k7Var6.c, cls3)) {
                                        spannableString.removeSpan((zx0) obj7);
                                    }
                                    throw null;
                                }
                                this.k = charSequence3;
                                this.l = new f10(charSequence3, this.j, this.o);
                            }
                        }
                        eg0Var2 = eg0Var;
                        arrayList = new ArrayList(list4.size());
                        size2 = list4.size();
                        while (i5 < size2) {
                        }
                        ns0 ns0Var52 = dw0Var2.a;
                        qu0 qu0Var22 = ns0Var52.f;
                        if (qu0Var22 == null || ns0Var52.d != null || ns0Var52.c != null) {
                        }
                        ha haVar2 = new ha(3, spannableString, eg0Var2);
                        if (arrayList.size() <= 1) {
                        }
                        size3 = list4.size();
                        i8 = 0;
                        z2 = false;
                        while (i8 < size3) {
                        }
                        if (z2) {
                        }
                        Class<zx0> cls32 = cls2;
                        sl slVar62 = slVar2;
                        mv0Var2 = dw0Var2.b.d;
                        if (mv0Var2 != null) {
                        }
                        size4 = list4.size();
                        while (i9 < size4) {
                        }
                        charSequence3 = spannableString;
                        if (list3.size() > 0) {
                        }
                        this.k = charSequence3;
                        this.l = new f10(charSequence3, this.j, this.o);
                    }
                }
                wd0 wd0Var2 = dw0Var2.b;
                z20 z20Var = wd0Var2.f;
                z20Var = z20Var == null ? z20.c : z20Var;
                j3 = 1095216660480L;
                k = yc0.k(wd0Var2.c, textSize, slVar4);
                if (!Float.isNaN(k)) {
                    if (spannableString.length() == 0) {
                        i4 = 1;
                    } else {
                        if (spannableString.length() == 0) {
                            g8.e("Char sequence is empty.");
                            throw null;
                        }
                        i4 = 1;
                        if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                            length = spannableString.length();
                            int i40 = length;
                            int i41 = z20Var.b;
                            spannableString.setSpan(new a30(k, i40, (i41 & 1) <= 0, (i41 & 16) <= 0, z20Var.a, false), 0, spannableString.length(), 33);
                        }
                    }
                    length = spannableString.length() + i4;
                    int i402 = length;
                    int i412 = z20Var.b;
                    spannableString.setSpan(new a30(k, i402, (i412 & 1) <= 0, (i412 & 16) <= 0, z20Var.a, false), 0, spannableString.length(), 33);
                }
                mv0Var = dw0Var2.b.d;
                if (mv0Var != null) {
                }
                eg0Var2 = eg0Var;
                arrayList = new ArrayList(list4.size());
                size2 = list4.size();
                while (i5 < size2) {
                }
                ns0 ns0Var522 = dw0Var2.a;
                qu0 qu0Var222 = ns0Var522.f;
                if (qu0Var222 == null || ns0Var522.d != null || ns0Var522.c != null) {
                }
                ha haVar22 = new ha(3, spannableString, eg0Var2);
                if (arrayList.size() <= 1) {
                }
                size3 = list4.size();
                i8 = 0;
                z2 = false;
                while (i8 < size3) {
                }
                if (z2) {
                }
                Class<zx0> cls322 = cls2;
                sl slVar622 = slVar2;
                mv0Var2 = dw0Var2.b.d;
                if (mv0Var2 != null) {
                }
                size4 = list4.size();
                while (i9 < size4) {
                }
                charSequence3 = spannableString;
                if (list3.size() > 0) {
                }
                this.k = charSequence3;
                this.l = new f10(charSequence3, this.j, this.o);
            }
            i = 3;
            this.o = i;
            eg0Var = new eg0(i17, this);
            wv0 wv0Var2 = dw0Var.b.i;
            if (wv0Var2 == null) {
            }
            l5Var.setFlags(wv0Var2.b ? l5Var.getFlags() | 128 : l5Var.getFlags() & (-129));
            i2 = wv0Var2.a;
            if (i2 == 1) {
            }
            ns0Var = dw0Var.a;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j42 = ns0Var.b;
            str2 = ns0Var.g;
            kv0 kv0Var3 = ns0Var.a;
            lv0Var = ns0Var.j;
            t30Var = ns0Var.k;
            j = ns0Var.h;
            b = fw0.b(j42);
            if (gw0.a(b, 4294967296L)) {
            }
            qu0Var = ns0Var.f;
            if (qu0Var == null) {
            }
            ut utVar2 = ns0Var.c;
            if (utVar2 == null) {
            }
            st stVar2 = ns0Var.d;
            if (stVar2 != null) {
            }
            tt ttVar2 = ns0Var.e;
            if (ttVar2 != null) {
            }
            d5 d5Var2 = (d5) eg0Var.e;
            b2 = ((dt) d5Var2.h).b(qu0Var, utVar2, i18, i19);
            if (b2 instanceof by0) {
            }
            l5Var.setTypeface(typeface);
            if (t30Var != null) {
            }
            if (str2 != null) {
                l5Var.setFontFeatureSettings(str2);
            }
            if (lv0Var != null) {
                l5Var.setTextScaleX(l5Var.getTextScaleX() * lv0Var.a);
                l5Var.setTextSkewX(l5Var.getTextSkewX() + lv0Var.b);
            }
            l5Var.d(kv0Var3.b());
            l5Var.c(kv0Var3.e(), 9205357640488583168L, kv0Var3.a());
            l5Var.f(ns0Var.n);
            l5Var.g(ns0Var.m);
            l5Var.e(ns0Var.o);
            if (!gw0.a(fw0.b(j), 4294967296L)) {
            }
            if (gw0.a(fw0.b(j), 8589934592L)) {
            }
            long j52 = ns0Var.l;
            i9 i9Var3 = ns0Var.i;
            if (z4) {
            }
            long j62 = ge.g;
            if (ge.c(j52, j62)) {
            }
            if (i9Var3 == null) {
            }
            if (z5) {
            }
            List list42 = this.f;
            if (ns0Var2 != null) {
            }
            r1 = this.d;
            float textSize2 = this.j.getTextSize();
            dw0Var2 = this.e;
            list3 = this.g;
            sl slVar42 = this.i;
            z = this.n;
            b5 b5Var2 = c5.a;
            Class<zx0> cls22 = zx0.class;
            if (z) {
            }
            str3 = r1;
            f = 0.0f;
            charSequence = str3;
            if (list42.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            if (nz.l(dw0Var2.a.m, gv0.c)) {
            }
            ng0Var = dw0Var2.c;
            if ((ng0Var != null || (lg0Var = ng0Var.a) == null) ? false : lg0Var.a) {
            }
            wd0 wd0Var22 = dw0Var2.b;
            z20 z20Var2 = wd0Var22.f;
            if (z20Var2 == null) {
            }
            j3 = 1095216660480L;
            k = yc0.k(wd0Var22.c, textSize2, slVar42);
            if (!Float.isNaN(k)) {
            }
            mv0Var = dw0Var2.b.d;
            if (mv0Var != null) {
            }
            eg0Var2 = eg0Var;
            arrayList = new ArrayList(list42.size());
            size2 = list42.size();
            while (i5 < size2) {
            }
            ns0 ns0Var5222 = dw0Var2.a;
            qu0 qu0Var2222 = ns0Var5222.f;
            if (qu0Var2222 == null || ns0Var5222.d != null || ns0Var5222.c != null) {
            }
            ha haVar222 = new ha(3, spannableString, eg0Var2);
            if (arrayList.size() <= 1) {
            }
            size3 = list42.size();
            i8 = 0;
            z2 = false;
            while (i8 < size3) {
            }
            if (z2) {
            }
            Class<zx0> cls3222 = cls22;
            sl slVar6222 = slVar2;
            mv0Var2 = dw0Var2.b.d;
            if (mv0Var2 != null) {
            }
            size4 = list42.size();
            while (i9 < size4) {
            }
            charSequence3 = spannableString;
            if (list3.size() > 0) {
            }
            this.k = charSequence3;
            this.l = new f10(charSequence3, this.j, this.o);
        }
        i = 2;
        this.o = i;
        eg0Var = new eg0(i17, this);
        wv0 wv0Var22 = dw0Var.b.i;
        if (wv0Var22 == null) {
        }
        l5Var.setFlags(wv0Var22.b ? l5Var.getFlags() | 128 : l5Var.getFlags() & (-129));
        i2 = wv0Var22.a;
        if (i2 == 1) {
        }
        ns0Var = dw0Var.a;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j422 = ns0Var.b;
        str2 = ns0Var.g;
        kv0 kv0Var32 = ns0Var.a;
        lv0Var = ns0Var.j;
        t30Var = ns0Var.k;
        j = ns0Var.h;
        b = fw0.b(j422);
        if (gw0.a(b, 4294967296L)) {
        }
        qu0Var = ns0Var.f;
        if (qu0Var == null) {
        }
        ut utVar22 = ns0Var.c;
        if (utVar22 == null) {
        }
        st stVar22 = ns0Var.d;
        if (stVar22 != null) {
        }
        tt ttVar22 = ns0Var.e;
        if (ttVar22 != null) {
        }
        d5 d5Var22 = (d5) eg0Var.e;
        b2 = ((dt) d5Var22.h).b(qu0Var, utVar22, i18, i19);
        if (b2 instanceof by0) {
        }
        l5Var.setTypeface(typeface);
        if (t30Var != null) {
        }
        if (str2 != null) {
        }
        if (lv0Var != null) {
        }
        l5Var.d(kv0Var32.b());
        l5Var.c(kv0Var32.e(), 9205357640488583168L, kv0Var32.a());
        l5Var.f(ns0Var.n);
        l5Var.g(ns0Var.m);
        l5Var.e(ns0Var.o);
        if (!gw0.a(fw0.b(j), 4294967296L)) {
        }
        if (gw0.a(fw0.b(j), 8589934592L)) {
        }
        long j522 = ns0Var.l;
        i9 i9Var32 = ns0Var.i;
        if (z4) {
        }
        long j622 = ge.g;
        if (ge.c(j522, j622)) {
        }
        if (i9Var32 == null) {
        }
        if (z5) {
        }
        List list422 = this.f;
        if (ns0Var2 != null) {
        }
        r1 = this.d;
        float textSize22 = this.j.getTextSize();
        dw0Var2 = this.e;
        list3 = this.g;
        sl slVar422 = this.i;
        z = this.n;
        b5 b5Var22 = c5.a;
        Class<zx0> cls222 = zx0.class;
        if (z) {
        }
        str3 = r1;
        f = 0.0f;
        charSequence = str3;
        if (list422.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        if (nz.l(dw0Var2.a.m, gv0.c)) {
        }
        ng0Var = dw0Var2.c;
        if ((ng0Var != null || (lg0Var = ng0Var.a) == null) ? false : lg0Var.a) {
        }
        wd0 wd0Var222 = dw0Var2.b;
        z20 z20Var22 = wd0Var222.f;
        if (z20Var22 == null) {
        }
        j3 = 1095216660480L;
        k = yc0.k(wd0Var222.c, textSize22, slVar422);
        if (!Float.isNaN(k)) {
        }
        mv0Var = dw0Var2.b.d;
        if (mv0Var != null) {
        }
        eg0Var2 = eg0Var;
        arrayList = new ArrayList(list422.size());
        size2 = list422.size();
        while (i5 < size2) {
        }
        ns0 ns0Var52222 = dw0Var2.a;
        qu0 qu0Var22222 = ns0Var52222.f;
        if (qu0Var22222 == null || ns0Var52222.d != null || ns0Var52222.c != null) {
        }
        ha haVar2222 = new ha(3, spannableString, eg0Var2);
        if (arrayList.size() <= 1) {
        }
        size3 = list422.size();
        i8 = 0;
        z2 = false;
        while (i8 < size3) {
        }
        if (z2) {
        }
        Class<zx0> cls32222 = cls222;
        sl slVar62222 = slVar2;
        mv0Var2 = dw0Var2.b.d;
        if (mv0Var2 != null) {
        }
        size4 = list422.size();
        while (i9 < size4) {
        }
        charSequence3 = spannableString;
        if (list3.size() > 0) {
        }
        this.k = charSequence3;
        this.l = new f10(charSequence3, this.j, this.o);
    }

    public final float a() {
        f10 f10Var = this.l;
        float f = f10Var.e;
        TextPaint textPaint = f10Var.b;
        if (!Float.isNaN(f)) {
            return f10Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = f10Var.a;
        lineInstance.setText(new fd(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new rh(4));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new pd0(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                pd0 pd0Var = (pd0) priorityQueue.peek();
                if (pd0Var != null && ((Number) pd0Var.e).intValue() - ((Number) pd0Var.d).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new pd0(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                g8.k();
                return 0.0f;
            }
            pd0 pd0Var2 = (pd0) it.next();
            f2 = Layout.getDesiredWidth(f10Var.b(), ((Number) pd0Var2.d).intValue(), ((Number) pd0Var2.e).intValue(), textPaint);
            while (it.hasNext()) {
                pd0 pd0Var3 = (pd0) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(f10Var.b(), ((Number) pd0Var3.d).intValue(), ((Number) pd0Var3.e).intValue(), textPaint));
            }
        }
        f10Var.e = f2;
        return f2;
    }

    @Override // defpackage.td0
    public final boolean b() {
        t7 t7Var = this.m;
        if (t7Var != null ? t7Var.u() : false) {
            return true;
        }
        if (!this.n) {
            ng0 ng0Var = this.e.c;
            p01 p01Var = lp.a;
            p01 p01Var2 = lp.a;
            bt0 bt0Var = (bt0) p01Var2.e;
            if (bt0Var == null) {
                if (gp.k != null) {
                    bt0Var = p01Var2.l();
                    p01Var2.e = bt0Var;
                } else {
                    bt0Var = nz.h;
                }
            }
            if (((Boolean) bt0Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.td0
    public final float c() {
        return this.l.c();
    }
}
