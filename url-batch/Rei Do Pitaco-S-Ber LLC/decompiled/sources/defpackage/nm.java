package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nm implements Iterable, vo {
    public final String[] f;

    public nm(String[] strArr) {
        this.f = strArr;
    }

    public final String a(String str) {
        str.getClass();
        String[] strArr = this.f;
        int length = strArr.length - 2;
        int r = oo.r(length, 0, -2);
        if (r > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == r) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.f[i * 2];
    }

    public final j0 c() {
        j0 j0Var = new j0(21);
        ArrayList arrayList = (ArrayList) j0Var.g;
        arrayList.getClass();
        String[] strArr = this.f;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return j0Var;
    }

    public final String d(int i) {
        return this.f[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nm) {
            return Arrays.equals(this.f, ((nm) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        bw[] bwVarArr = new bw[size];
        for (int i = 0; i < size; i++) {
            bwVarArr[i] = new bw(b(i), d(i));
        }
        return new i(bwVarArr);
    }

    public final int size() {
        return this.f.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = b(i);
            String d = d(i);
            sb.append(b);
            sb.append(": ");
            if (z60.n(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
