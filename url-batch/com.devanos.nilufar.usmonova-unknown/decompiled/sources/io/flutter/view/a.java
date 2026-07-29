package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC1888sN;
import o.C2258y0;
import o.C2324z0;
import o.InterfaceC1453ln;
import o.InterfaceC2279yI;

/* loaded from: classes.dex */
public final class a implements InterfaceC1453ln {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public final void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        Iterator it;
        C2324z0 c2324z0;
        int i;
        int i2;
        C2324z0 c2324z02;
        String str;
        float f;
        float f2;
        Integer num;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        b bVar = this.a;
        HashMap hashMap = bVar.g;
        InterfaceC2279yI interfaceC2279yI = bVar.e;
        ArrayList arrayList = bVar.p;
        ArrayList arrayList2 = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            C2324z0 b = bVar.b(byteBuffer.getInt());
            ArrayList arrayList3 = b.U;
            b bVar2 = b.a;
            b.E = true;
            b.K = b.r;
            b.L = b.p;
            b.F = b.c;
            b.G = b.d;
            b.H = b.g;
            b.I = b.h;
            b.J = b.l;
            b.c = byteBuffer.getLong();
            b.d = byteBuffer.getInt();
            b.e = byteBuffer.getInt();
            b.f = byteBuffer.getInt();
            b.g = byteBuffer.getInt();
            b.h = byteBuffer.getInt();
            b.i = byteBuffer.getInt();
            b.j = byteBuffer.getInt();
            b.k = byteBuffer.getInt();
            byteBuffer.getInt();
            b.l = byteBuffer.getFloat();
            b.m = byteBuffer.getFloat();
            b.n = byteBuffer.getFloat();
            b.f251o = b.c(byteBuffer, strArr);
            b.p = b.c(byteBuffer, strArr);
            b.q = C2324z0.f(byteBuffer, byteBufferArr);
            b.r = b.c(byteBuffer, strArr);
            b.s = C2324z0.f(byteBuffer, byteBufferArr);
            b.t = b.c(byteBuffer, strArr);
            b.u = C2324z0.f(byteBuffer, byteBufferArr);
            b.v = b.c(byteBuffer, strArr);
            b.w = C2324z0.f(byteBuffer, byteBufferArr);
            b.x = b.c(byteBuffer, strArr);
            b.y = C2324z0.f(byteBuffer, byteBufferArr);
            b.z = b.c(byteBuffer, strArr);
            b.A = b.c(byteBuffer, strArr);
            b.B = b.c(byteBuffer, strArr);
            b.C = byteBuffer.getInt();
            byteBuffer.getInt();
            b.M = byteBuffer.getFloat();
            b.N = byteBuffer.getFloat();
            b.O = byteBuffer.getFloat();
            b.P = byteBuffer.getFloat();
            float[] fArr = b.Q;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i3 = 0; i3 < 16; i3++) {
                fArr[i3] = byteBuffer.getFloat();
            }
            b.Q = fArr;
            float[] fArr2 = b.R;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i4 = 0; i4 < 16; i4++) {
                fArr2[i4] = byteBuffer.getFloat();
            }
            b.R = fArr2;
            b.Y = true;
            b.a0 = true;
            int i5 = byteBuffer.getInt();
            ArrayList arrayList4 = b.T;
            arrayList4.clear();
            for (int i6 = 0; i6 < i5; i6++) {
                C2324z0 b2 = bVar2.b(byteBuffer.getInt());
                b2.S = b;
                arrayList4.add(b2);
            }
            int i7 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i8 = 0; i8 < i7; i8++) {
                C2324z0 b3 = bVar2.b(byteBuffer.getInt());
                b3.S = b;
                arrayList3.add(b3);
            }
            int i9 = byteBuffer.getInt();
            if (i9 == 0) {
                b.V = null;
            } else {
                ArrayList arrayList5 = b.V;
                if (arrayList5 == null) {
                    b.V = new ArrayList(i9);
                } else {
                    arrayList5.clear();
                }
                for (int i10 = 0; i10 < i9; i10++) {
                    C2258y0 a = bVar2.a(byteBuffer.getInt());
                    int i11 = a.c;
                    if (i11 == 1) {
                        b.W = a;
                    } else if (i11 == 2) {
                        b.X = a;
                    } else {
                        b.V.add(a);
                    }
                    b.V.add(a);
                }
            }
            if (!b.g(14)) {
                if (b.g(6)) {
                    bVar.m = b;
                }
                if (b.E) {
                    arrayList2.add(b);
                }
                int i12 = b.i;
                if (i12 != -1 && !interfaceC2279yI.x(i12)) {
                    interfaceC2279yI.L(b.i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        C2324z0 c2324z03 = (C2324z0) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (c2324z03 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            c2324z03.k(fArr3, hashSet, false);
            c2324z03.c(arrayList6);
        }
        Iterator it2 = arrayList6.iterator();
        C2324z0 c2324z04 = null;
        while (it2.hasNext()) {
            C2324z0 c2324z05 = (C2324z0) it2.next();
            if (!arrayList.contains(Integer.valueOf(c2324z05.b))) {
                c2324z04 = c2324z05;
            }
        }
        if (c2324z04 == null && !arrayList6.isEmpty()) {
            c2324z04 = (C2324z0) arrayList6.get(arrayList6.size() - 1);
        }
        if (c2324z04 != null && (c2324z04.b != bVar.q || arrayList6.size() != arrayList.size())) {
            bVar.q = c2324z04.b;
            String e = c2324z04.e();
            if (e == null) {
                e = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.a.setAccessibilityPaneTitle(e);
            } else {
                AccessibilityEvent d = bVar.d(c2324z04.b, 32);
                d.getText().add(e);
                bVar.h(d);
            }
        }
        arrayList.clear();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((C2324z0) it3.next()).b));
        }
        Iterator it4 = hashMap.entrySet().iterator();
        while (it4.hasNext()) {
            C2324z0 c2324z06 = (C2324z0) ((Map.Entry) it4.next()).getValue();
            if (!hashSet.contains(c2324z06)) {
                c2324z06.S = null;
                if (c2324z06.i != -1 && (num = bVar.j) != null) {
                    View platformViewOfNode = bVar.d.platformViewOfNode(num.intValue());
                    interfaceC2279yI.L(c2324z06.i);
                    if (platformViewOfNode == null) {
                        bVar.g(bVar.j.intValue(), 65536);
                        bVar.j = null;
                    }
                }
                int i13 = c2324z06.i;
                if (i13 != -1) {
                    interfaceC2279yI.L(i13);
                }
                C2324z0 c2324z07 = bVar.i;
                if (c2324z07 == c2324z06) {
                    bVar.g(c2324z07.b, 65536);
                    bVar.i = null;
                }
                if (bVar.m == c2324z06) {
                    bVar.m = null;
                }
                if (bVar.f10o == c2324z06) {
                    bVar.f10o = null;
                }
                it4.remove();
            }
        }
        int i14 = 2048;
        AccessibilityEvent d2 = bVar.d(0, 2048);
        d2.setContentChangeTypes(1);
        bVar.h(d2);
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            C2324z0 c2324z08 = (C2324z0) it5.next();
            if (!Float.isNaN(c2324z08.l) && !Float.isNaN(c2324z08.J) && c2324z08.J != c2324z08.l) {
                AccessibilityEvent d3 = bVar.d(c2324z08.b, 4096);
                float f3 = c2324z08.l;
                float f4 = c2324z08.m;
                if (Float.isInfinite(f4)) {
                    if (f3 > 70000.0f) {
                        f3 = 70000.0f;
                    }
                    f4 = 100000.0f;
                }
                if (Float.isInfinite(c2324z08.n)) {
                    f = f4 + 100000.0f;
                    if (f3 < -70000.0f) {
                        f3 = -70000.0f;
                    }
                    f2 = f3 + 100000.0f;
                } else {
                    float f5 = c2324z08.n;
                    f = f4 - f5;
                    f2 = f3 - f5;
                }
                int i15 = c2324z08.G;
                if ((i15 & 16) != 0 || (i15 & 32) != 0) {
                    d3.setScrollY((int) f2);
                    d3.setMaxScrollY((int) f);
                } else if ((i15 & 4) != 0 || (i15 & 8) != 0) {
                    d3.setScrollX((int) f2);
                    d3.setMaxScrollX((int) f);
                }
                int i16 = c2324z08.j;
                if (i16 > 0) {
                    d3.setItemCount(i16);
                    d3.setFromIndex(c2324z08.k);
                    Iterator it6 = c2324z08.U.iterator();
                    int i17 = 0;
                    while (it6.hasNext()) {
                        if (!((C2324z0) it6.next()).g(14)) {
                            i17++;
                        }
                    }
                    d3.setToIndex((c2324z08.k + i17) - 1);
                }
                bVar.h(d3);
            }
            if (c2324z08.g(16) && (((str = c2324z08.p) != null || c2324z08.L != null) && (str == null || !str.equals(c2324z08.L)))) {
                AccessibilityEvent d4 = bVar.d(c2324z08.b, i14);
                d4.setContentChangeTypes(1);
                bVar.h(d4);
            }
            C2324z0 c2324z09 = bVar.i;
            if (c2324z09 == null || c2324z09.b != c2324z08.b) {
                it = it5;
            } else {
                it = it5;
                if ((AbstractC1888sN.d(3) & c2324z08.F) == 0 && c2324z08.g(3)) {
                    AccessibilityEvent d5 = bVar.d(c2324z08.b, 4);
                    d5.getText().add(c2324z08.p);
                    bVar.h(d5);
                }
            }
            C2324z0 c2324z010 = bVar.m;
            if (c2324z010 != null && (i = c2324z010.b) == (i2 = c2324z08.b) && ((c2324z02 = bVar.n) == null || c2324z02.b != i)) {
                bVar.n = c2324z010;
                bVar.h(bVar.d(i2, 8));
            } else if (c2324z010 == null) {
                bVar.n = null;
            }
            C2324z0 c2324z011 = bVar.m;
            if (c2324z011 != null && c2324z011.b == c2324z08.b && (c2324z08.F & AbstractC1888sN.d(5)) != 0 && c2324z08.g(5) && ((c2324z0 = bVar.i) == null || c2324z0.b == bVar.m.b)) {
                String str2 = c2324z08.K;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = c2324z08.r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d6 = bVar.d(c2324z08.b, 16);
                d6.setBeforeText(str2);
                d6.getText().add(str4);
                int i18 = 0;
                while (i18 < str2.length() && i18 < str4.length() && str2.charAt(i18) == str4.charAt(i18)) {
                    i18++;
                }
                if (i18 < str2.length() || i18 < str4.length()) {
                    d6.setFromIndex(i18);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i18 && length2 >= i18 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d6.setRemovedCount((length - i18) + 1);
                    d6.setAddedCount((length2 - i18) + 1);
                } else {
                    d6 = null;
                }
                if (d6 != null) {
                    bVar.h(d6);
                }
                if (c2324z08.H != c2324z08.g || c2324z08.I != c2324z08.h) {
                    AccessibilityEvent d7 = bVar.d(c2324z08.b, 8192);
                    d7.getText().add(str4);
                    d7.setFromIndex(c2324z08.g);
                    d7.setToIndex(c2324z08.h);
                    d7.setItemCount(str4.length());
                    bVar.h(d7);
                }
            }
            it5 = it;
            i14 = 2048;
        }
    }
}
