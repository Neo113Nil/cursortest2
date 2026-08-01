package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements Iterable, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f2454a;

    public l(String[] strArr) {
        this.f2454a = strArr;
    }

    public final String a(String str) {
        X0.d.e(str, "name");
        String[] strArr = this.f2454a;
        int length = strArr.length - 2;
        int N2 = q1.l.N(length, 0, -2);
        if (N2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != N2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f2454a[i * 2];
    }

    public final C.g c() {
        C.g gVar = new C.g(26);
        ArrayList arrayList = (ArrayList) gVar.f62b;
        X0.d.e(arrayList, "<this>");
        String[] strArr = this.f2454a;
        X0.d.e(strArr, "elements");
        List asList = Arrays.asList(strArr);
        X0.d.d(asList, "asList(...)");
        arrayList.addAll(asList);
        return gVar;
    }

    public final String d(int i) {
        return this.f2454a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (Arrays.equals(this.f2454a, ((l) obj).f2454a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2454a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        P0.b[] bVarArr = new P0.b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = new P0.b(b(i), d(i));
        }
        return new Q0.a(bVarArr);
    }

    public final int size() {
        return this.f2454a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (j1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        X0.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
