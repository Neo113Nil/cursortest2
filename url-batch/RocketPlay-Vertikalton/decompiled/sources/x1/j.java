package x1;

import K.X;
import c1.AbstractC0104b;
import j1.InterfaceC0183a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l.C0265n;

/* loaded from: classes.dex */
public final class j implements Iterable, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f4526a;

    public j(String[] strArr) {
        this.f4526a = strArr;
    }

    public final String a(String str) {
        i1.f.e(str, "name");
        String[] strArr = this.f4526a;
        int length = strArr.length - 2;
        int p2 = AbstractC0104b.p(length, 0, -2);
        if (p2 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != p2) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.f4526a[i * 2];
    }

    public final C0265n c() {
        C0265n c0265n = new C0265n(5);
        ArrayList arrayList = (ArrayList) c0265n.f3473a;
        i1.f.e(arrayList, "<this>");
        String[] strArr = this.f4526a;
        i1.f.e(strArr, "elements");
        arrayList.addAll(W0.i.r0(strArr));
        return c0265n;
    }

    public final String d(int i) {
        return this.f4526a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (Arrays.equals(this.f4526a, ((j) obj).f4526a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4526a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        V0.d[] dVarArr = new V0.d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = new V0.d(b(i), d(i));
        }
        return new X(dVarArr);
    }

    public final int size() {
        return this.f4526a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b2 = b(i);
            String d = d(i);
            sb.append(b2);
            sb.append(": ");
            if (y1.b.o(b2)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        i1.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
