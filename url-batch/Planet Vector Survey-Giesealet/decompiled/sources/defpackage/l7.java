package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l7 implements CharSequence {
    public final List d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;

    static {
        j3 j3Var = sn0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r0.a(r2.c);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l7(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.d = list;
        this.e = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                k7 k7Var = (k7) list.get(i);
                Object obj = k7Var.a;
                if (obj instanceof ns0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(k7Var);
                } else if (obj instanceof wd0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(k7Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f = arrayList;
        this.g = arrayList2;
        List n0 = arrayList2 != null ? zd.n0(arrayList2, new us(5)) : null;
        if (n0 == null || n0.isEmpty()) {
            return;
        }
        int i2 = ((k7) zd.c0(n0)).c;
        int i3 = yy.a;
        int i4 = 1;
        o60 o60Var = new o60(1);
        o60Var.a(i2);
        int size2 = n0.size();
        while (i4 < size2) {
            k7 k7Var2 = (k7) n0.get(i4);
            while (true) {
                int i5 = o60Var.b;
                if (i5 == 0) {
                    break;
                }
                if (i5 == 0) {
                    g8.e("IntList is empty.");
                    throw null;
                }
                int i6 = o60Var.a[i5 - 1];
                int i7 = k7Var2.b;
                int i8 = k7Var2.c;
                if (i7 >= i6) {
                    o60Var.c(i5 - 1);
                } else if (i8 > i6) {
                    dy.a("Paragraph overlap not allowed, end " + i8 + " should be less than or equal to " + i6);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return nz.l(this.e, l7Var.e) && nz.l(this.d, l7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        List list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            dy.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.e;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        int i3 = m7.a;
        if (i > i2) {
            dy.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                k7 k7Var = (k7) list.get(i4);
                int i5 = k7Var.b;
                int i6 = k7Var.c;
                if (m7.a(i, i2, i5, i6)) {
                    arrayList.add(new k7(k7Var.a, Math.max(i, k7Var.b) - i, Math.min(i2, i6) - i, k7Var.d));
                }
            }
        }
        arrayList = null;
        return new l7(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l7(String str) {
        this((List) null, str);
        int i = m7.a;
    }

    public /* synthetic */ l7(String str, int i) {
        this(str, wp.d);
    }

    public l7(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
