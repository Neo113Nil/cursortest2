package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class ga3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final ja3 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final ga3 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public ga3(String str, String str2, long j, long j2, ja3 ja3Var, String[] strArr, String str3, String str4, ga3 ga3Var) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = ja3Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = ga3Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static ga3 a(String str) {
        return new ga3(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final boolean a(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    public final ga3 a(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (ga3) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((ga3) this.m.get(i)).a(treeSet, z || equals);
        }
    }

    public final ArrayList a(long j, Map map, HashMap hashMap, HashMap hashMap2) {
        ArrayList arrayList = new ArrayList();
        a(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j, false, this.h, treeMap);
        a(j, map, hashMap, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                ha3 ha3Var = (ha3) hashMap.get(pair.first);
                ha3Var.getClass();
                arrayList2.add(new s20(null, null, null, decodeByteArray, ha3Var.c, 0, ha3Var.e, ha3Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, ha3Var.f, ha3Var.g, false, -16777216, ha3Var.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ha3 ha3Var2 = (ha3) hashMap.get(entry.getKey());
            ha3Var2.getClass();
            r20 r20Var = (r20) entry.getValue();
            CharSequence charSequence = r20Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (dg0 dg0Var : (dg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dg0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(dg0Var), spannableStringBuilder.getSpanEnd(dg0Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = ha3Var2.c;
            int i9 = ha3Var2.d;
            r20Var.e = f;
            r20Var.f = i9;
            r20Var.g = ha3Var2.e;
            r20Var.h = ha3Var2.b;
            r20Var.l = ha3Var2.f;
            float f2 = ha3Var2.i;
            int i10 = ha3Var2.h;
            r20Var.k = f2;
            r20Var.j = i10;
            r20Var.p = ha3Var2.j;
            arrayList2.add(r20Var.a());
        }
        return arrayList2;
    }

    public final void a(long j, String str, ArrayList arrayList) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (a(j) && "div".equals(this.a) && this.i != null) {
            arrayList.add(new Pair(str, this.i));
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.m;
            if (i >= (arrayList2 == null ? 0 : arrayList2.size())) {
                return;
            }
            a(i).a(j, str, arrayList);
            i++;
        }
    }

    public final void a(long j, boolean z, String str, TreeMap treeMap) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.c && z) {
            SpannableStringBuilder a = a(str, treeMap);
            String str2 = this.b;
            str2.getClass();
            a.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.a) && z) {
            a(str, treeMap).append('\n');
            return;
        }
        if (a(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap hashMap = this.k;
                String str3 = (String) entry.getKey();
                CharSequence charSequence = ((r20) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str3, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(this.a);
            int i = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i >= (arrayList == null ? 0 : arrayList.size())) {
                    break;
                }
                a(i).a(j, z || equals, str, treeMap);
                i++;
            }
            if (equals) {
                SpannableStringBuilder a2 = a(str, treeMap);
                int length = a2.length() - 1;
                while (length >= 0 && a2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && a2.charAt(length) != '\n') {
                    a2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                HashMap hashMap2 = this.l;
                String str4 = (String) entry2.getKey();
                CharSequence charSequence2 = ((r20) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str4, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            r20 r20Var = new r20();
            r20Var.a = new SpannableStringBuilder();
            treeMap.put(str, r20Var);
        }
        CharSequence charSequence = ((r20) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final void a(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        if (!a(j)) {
            return;
        }
        String str2 = "".equals(this.h) ? str : this.h;
        Iterator it = this.l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            int intValue = this.k.containsKey(str3) ? ((Integer) this.k.get(str3)).intValue() : 0;
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if (intValue != intValue2) {
                r20 r20Var = (r20) treeMap.get(str3);
                r20Var.getClass();
                ha3 ha3Var = (ha3) hashMap.get(str2);
                ha3Var.getClass();
                int i = ha3Var.j;
                ja3 a = ia3.a(this.f, this.g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) r20Var.a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    r20Var.a = spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (a != null) {
                    ia3.a(spannableStringBuilder2, intValue, intValue2, a, this.j, map, i);
                    if ("p".equals(this.a)) {
                        float f = a.s;
                        if (f != Float.MAX_VALUE) {
                            r20Var.q = (f * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = a.o;
                        if (alignment != null) {
                            r20Var.c = alignment;
                        }
                        Layout.Alignment alignment2 = a.p;
                        if (alignment2 != null) {
                            r20Var.d = alignment2;
                        }
                    }
                }
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= (arrayList == null ? 0 : arrayList.size())) {
                return;
            }
            a(i2).a(j, map, hashMap, str2, treeMap);
            i2++;
        }
    }
}
