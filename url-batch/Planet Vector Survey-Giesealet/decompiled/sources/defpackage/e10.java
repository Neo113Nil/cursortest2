package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e10 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public e10(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int v = tt0.v(((Layout) this.a).getText(), '\n', i, 4);
            i = v < 0 ? ((Layout) this.a).getText().length() : v + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.a).getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.b).size()];
        ((ArrayList) this.b).size();
    }

    public float a(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float b(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.b;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return a(i, z);
        }
        int x = nk.x(layout, i, z2);
        int lineStart = layout.getLineStart(x);
        int lineEnd = layout.getLineEnd(x);
        if (i != lineStart && i != lineEnd) {
            return a(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return a(i, z);
        }
        Integer valueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i8 = size - 1;
        int i9 = 0;
        while (true) {
            if (i9 > i8) {
                i2 = -(i9 + 1);
                break;
            }
            i2 = (i9 + i8) >>> 1;
            int w = mz.w((Comparable) arrayList.get(i2), valueOf);
            if (w >= 0) {
                if (w <= 0) {
                    break;
                }
                i8 = i2 - 1;
            } else {
                i9 = i2 + 1;
            }
        }
        int i10 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z2 && i10 > 0) {
            int i11 = i10 - 1;
            if (i == ((Number) arrayList.get(i11)).intValue()) {
                i10 = i11;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1;
        int c = c(lineEnd, lineStart);
        int intValue = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
        int i12 = lineStart - intValue;
        int i13 = c - intValue;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i10]) {
            bidi = (Bidi) arrayList2.get(i10);
            i4 = x;
            i3 = c;
            i5 = -1;
        } else {
            int intValue2 = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i10)).intValue();
            int i14 = intValue3 - intValue2;
            char[] cArr = (char[]) this.e;
            i3 = c;
            if (cArr == null || cArr.length < i14) {
                cArr = new char[i14];
            }
            i4 = x;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i14)) {
                i5 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i14, layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i10, bidi);
                    zArr[i10] = z3;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.e;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.e = cArr;
                }
            } else {
                i5 = -1;
                z3 = true;
            }
            bidi = null;
            arrayList2.set(i10, bidi);
            zArr[i10] = z3;
            if (bidi != null) {
            }
            this.e = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i12, i13) : null;
        if (createLineBidi == null) {
            z4 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                d10[] d10VarArr = new d10[runCount];
                for (int i15 = 0; i15 < runCount; i15++) {
                    d10VarArr[i15] = new d10(createLineBidi.getRunStart(i15) + lineStart, createLineBidi.getRunLimit(i15) + lineStart, createLineBidi.getRunLevel(i15) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i16 = 0; i16 < runCount2; i16++) {
                    bArr[i16] = (byte) createLineBidi.getRunLevel(i16);
                }
                boolean z6 = false;
                Bidi.reorderVisually(bArr, 0, d10VarArr, 0, runCount);
                if (i != lineStart) {
                    int i17 = i4;
                    int c2 = i > i3 ? c(i, lineStart) : i;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= runCount) {
                            i6 = i5;
                            break;
                        }
                        if (d10VarArr[i18].b == c2) {
                            i6 = i18;
                            break;
                        }
                        i18++;
                    }
                    d10 d10Var = d10VarArr[i6];
                    if (z || z5 == d10Var.c) {
                        z6 = z5;
                    } else if (!z5) {
                        z6 = true;
                    }
                    return (i6 == 0 && z6) ? layout.getLineLeft(i17) : (i6 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(d10VarArr[i6 - 1].b) : layout.getPrimaryHorizontal(d10VarArr[i6 + 1].b) : layout.getLineRight(i17);
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= runCount) {
                        i7 = i5;
                        break;
                    }
                    if (d10VarArr[i19].a == i) {
                        i7 = i19;
                        break;
                    }
                    i19++;
                }
                d10 d10Var2 = d10VarArr[i7];
                if (!z && z5 != d10Var2.c) {
                    z6 = z5;
                } else if (!z5) {
                    z6 = true;
                }
                if (i7 == 0 && z6) {
                    return layout.getLineLeft(i4);
                }
                return (i7 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(d10VarArr[i7 - 1].a) : layout.getPrimaryHorizontal(d10VarArr[i7 + 1].a) : layout.getLineRight(i4);
            }
            z4 = true;
        }
        int i20 = i4;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
        if (z || z5 == isRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i20) : layout.getLineRight(i20);
    }

    public int c(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.a).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((nz.s(charAt, 8192) < 0 || nz.s(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void d(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        g70 g70Var = (g70) ((LinkedHashMap) this.c).get(str);
        if (g70Var != null) {
            ((et0) g70Var).j(obj);
        }
        g70 g70Var2 = (g70) ((LinkedHashMap) this.d).get(str);
        if (g70Var2 != null) {
            ((et0) g70Var2).j(obj);
        }
    }

    public e10(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new qf(2, this);
    }
}
