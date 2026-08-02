package io.flutter.view;

import D.AbstractC0009j;
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

/* loaded from: classes.dex */
public final class b implements E.l, E.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f695a;

    public /* synthetic */ b(Object obj) {
        this.f695a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        io.flutter.plugin.platform.i iVar;
        ArrayList arrayList;
        Iterator it;
        g gVar;
        int i2;
        int i3;
        g gVar2;
        String str;
        float f2;
        float f3;
        Integer num;
        h hVar;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        h hVar2 = (h) this.f695a;
        hVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean hasRemaining = byteBuffer.hasRemaining();
            iVar = hVar2.f782e;
            if (!hasRemaining) {
                break;
            }
            g b2 = hVar2.b(byteBuffer.getInt());
            b2.f731E = true;
            b2.f736K = b2.f769r;
            b2.L = b2.f767p;
            b2.f732F = b2.f754c;
            b2.f733G = b2.f755d;
            b2.f734H = b2.f758g;
            b2.f735I = b2.f759h;
            b2.J = b2.f763l;
            b2.f754c = byteBuffer.getLong();
            b2.f755d = byteBuffer.getInt();
            b2.f756e = byteBuffer.getInt();
            b2.f757f = byteBuffer.getInt();
            b2.f758g = byteBuffer.getInt();
            b2.f759h = byteBuffer.getInt();
            b2.f760i = byteBuffer.getInt();
            b2.f761j = byteBuffer.getInt();
            b2.f762k = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f763l = byteBuffer.getFloat();
            b2.f764m = byteBuffer.getFloat();
            b2.f765n = byteBuffer.getFloat();
            b2.f766o = h.c(byteBuffer, strArr);
            b2.f767p = h.c(byteBuffer, strArr);
            b2.f768q = g.D(byteBuffer, byteBufferArr);
            b2.f769r = h.c(byteBuffer, strArr);
            b2.f770s = g.D(byteBuffer, byteBufferArr);
            b2.f771t = h.c(byteBuffer, strArr);
            b2.u = g.D(byteBuffer, byteBufferArr);
            b2.f772v = h.c(byteBuffer, strArr);
            b2.f773w = g.D(byteBuffer, byteBufferArr);
            b2.f774x = h.c(byteBuffer, strArr);
            b2.f775y = g.D(byteBuffer, byteBufferArr);
            b2.f776z = h.c(byteBuffer, strArr);
            b2.A = h.c(byteBuffer, strArr);
            b2.f728B = h.c(byteBuffer, strArr);
            b2.f729C = byteBuffer.getInt();
            byteBuffer.getInt();
            b2.f737M = byteBuffer.getFloat();
            b2.f738N = byteBuffer.getFloat();
            b2.f739O = byteBuffer.getFloat();
            b2.P = byteBuffer.getFloat();
            float[] fArr = b2.f740Q;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i4 = 0; i4 < 16; i4++) {
                fArr[i4] = byteBuffer.getFloat();
            }
            b2.f740Q = fArr;
            float[] fArr2 = b2.f741R;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i5 = 0; i5 < 16; i5++) {
                fArr2[i5] = byteBuffer.getFloat();
            }
            b2.f741R = fArr2;
            b2.f748Y = true;
            b2.f751a0 = true;
            int i6 = byteBuffer.getInt();
            ArrayList arrayList3 = b2.f743T;
            arrayList3.clear();
            int i7 = 0;
            while (true) {
                hVar = b2.f750a;
                if (i7 >= i6) {
                    break;
                }
                g b3 = hVar.b(byteBuffer.getInt());
                b3.f742S = b2;
                arrayList3.add(b3);
                i7++;
            }
            int i8 = byteBuffer.getInt();
            ArrayList arrayList4 = b2.f744U;
            arrayList4.clear();
            for (int i9 = 0; i9 < i8; i9++) {
                g b4 = hVar.b(byteBuffer.getInt());
                b4.f742S = b2;
                arrayList4.add(b4);
            }
            int i10 = byteBuffer.getInt();
            if (i10 == 0) {
                b2.f745V = null;
            } else {
                ArrayList arrayList5 = b2.f745V;
                if (arrayList5 == null) {
                    b2.f745V = new ArrayList(i10);
                } else {
                    arrayList5.clear();
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    f a2 = hVar.a(byteBuffer.getInt());
                    int i12 = a2.f725c;
                    if (i12 == 1) {
                        b2.f746W = a2;
                    } else if (i12 == 2) {
                        b2.f747X = a2;
                    } else {
                        b2.f745V.add(a2);
                    }
                    b2.f745V.add(a2);
                }
            }
            if (!b2.E(14)) {
                if (b2.E(6)) {
                    hVar2.f790m = b2;
                }
                if (b2.f731E) {
                    arrayList2.add(b2);
                }
                int i13 = b2.f760i;
                if (i13 != -1 && !iVar.h(i13)) {
                    iVar.f(b2.f760i);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = hVar2.f784g;
        g gVar3 = (g) hashMap.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (gVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            gVar3.I(fArr3, hashSet, false);
            gVar3.A(arrayList6);
        }
        Iterator it2 = arrayList6.iterator();
        g gVar4 = null;
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = hVar2.f793p;
            if (!hasNext) {
                break;
            }
            g gVar5 = (g) it2.next();
            if (!arrayList.contains(Integer.valueOf(gVar5.f752b))) {
                gVar4 = gVar5;
            }
        }
        if (gVar4 == null && !arrayList6.isEmpty()) {
            gVar4 = (g) arrayList6.get(arrayList6.size() - 1);
        }
        if (gVar4 != null && (gVar4.f752b != hVar2.f794q || arrayList6.size() != arrayList.size())) {
            hVar2.f794q = gVar4.f752b;
            String C2 = gVar4.C();
            if (C2 == null) {
                C2 = " ";
            }
            if (Build.VERSION.SDK_INT >= 28) {
                hVar2.f778a.setAccessibilityPaneTitle(C2);
            } else {
                AccessibilityEvent d2 = hVar2.d(gVar4.f752b, 32);
                d2.getText().add(C2);
                hVar2.h(d2);
            }
        }
        arrayList.clear();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((g) it3.next()).f752b));
        }
        Iterator it4 = hashMap.entrySet().iterator();
        while (it4.hasNext()) {
            g gVar6 = (g) ((Map.Entry) it4.next()).getValue();
            if (!hashSet.contains(gVar6)) {
                gVar6.f742S = null;
                if (gVar6.f760i != -1 && (num = hVar2.f787j) != null) {
                    View platformViewOfNode = hVar2.f781d.platformViewOfNode(num.intValue());
                    iVar.f(gVar6.f760i);
                    if (platformViewOfNode == null) {
                        hVar2.g(hVar2.f787j.intValue(), 65536);
                        hVar2.f787j = null;
                    }
                }
                int i14 = gVar6.f760i;
                if (i14 != -1) {
                    iVar.f(i14);
                }
                g gVar7 = hVar2.f786i;
                if (gVar7 == gVar6) {
                    hVar2.g(gVar7.f752b, 65536);
                    hVar2.f786i = null;
                }
                if (hVar2.f790m == gVar6) {
                    hVar2.f790m = null;
                }
                if (hVar2.f792o == gVar6) {
                    hVar2.f792o = null;
                }
                it4.remove();
            }
        }
        int i15 = 2048;
        AccessibilityEvent d3 = hVar2.d(0, 2048);
        d3.setContentChangeTypes(1);
        hVar2.h(d3);
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            g gVar8 = (g) it5.next();
            if (!Float.isNaN(gVar8.f763l) && !Float.isNaN(gVar8.J) && gVar8.J != gVar8.f763l) {
                AccessibilityEvent d4 = hVar2.d(gVar8.f752b, 4096);
                float f4 = gVar8.f763l;
                float f5 = gVar8.f764m;
                if (Float.isInfinite(f5)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(gVar8.f765n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    float f6 = gVar8.f765n;
                    f2 = f5 - f6;
                    f3 = f4 - f6;
                }
                if (g.z(gVar8, e.SCROLL_UP) || g.z(gVar8, e.SCROLL_DOWN)) {
                    d4.setScrollY((int) f3);
                    d4.setMaxScrollY((int) f2);
                } else if (g.z(gVar8, e.SCROLL_LEFT) || g.z(gVar8, e.SCROLL_RIGHT)) {
                    d4.setScrollX((int) f3);
                    d4.setMaxScrollX((int) f2);
                }
                int i16 = gVar8.f761j;
                if (i16 > 0) {
                    d4.setItemCount(i16);
                    d4.setFromIndex(gVar8.f762k);
                    Iterator it6 = gVar8.f744U.iterator();
                    int i17 = 0;
                    while (it6.hasNext()) {
                        if (!((g) it6.next()).E(14)) {
                            i17++;
                        }
                    }
                    d4.setToIndex((gVar8.f762k + i17) - 1);
                }
                hVar2.h(d4);
            }
            if (gVar8.E(16) && (((str = gVar8.f767p) != null || gVar8.L != null) && (str == null || !str.equals(gVar8.L)))) {
                AccessibilityEvent d5 = hVar2.d(gVar8.f752b, i15);
                d5.setContentChangeTypes(1);
                hVar2.h(d5);
            }
            g gVar9 = hVar2.f786i;
            if (gVar9 == null || gVar9.f752b != gVar8.f752b) {
                it = it5;
            } else {
                it = it5;
                if ((AbstractC0009j.d(3) & gVar8.f732F) == 0 && gVar8.E(3)) {
                    AccessibilityEvent d6 = hVar2.d(gVar8.f752b, 4);
                    d6.getText().add(gVar8.f767p);
                    hVar2.h(d6);
                }
            }
            g gVar10 = hVar2.f790m;
            if (gVar10 != null && (i2 = gVar10.f752b) == (i3 = gVar8.f752b) && ((gVar2 = hVar2.f791n) == null || gVar2.f752b != i2)) {
                hVar2.f791n = gVar10;
                hVar2.h(hVar2.d(i3, 8));
            } else if (gVar10 == null) {
                hVar2.f791n = null;
            }
            g gVar11 = hVar2.f790m;
            if (gVar11 != null && gVar11.f752b == gVar8.f752b && (gVar8.f732F & AbstractC0009j.d(5)) != 0 && gVar8.E(5) && ((gVar = hVar2.f786i) == null || gVar.f752b == hVar2.f790m.f752b)) {
                String str2 = gVar8.f736K;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = gVar8.f769r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent d7 = hVar2.d(gVar8.f752b, 16);
                d7.setBeforeText(str2);
                d7.getText().add(str4);
                int i18 = 0;
                while (i18 < str2.length() && i18 < str4.length() && str2.charAt(i18) == str4.charAt(i18)) {
                    i18++;
                }
                if (i18 < str2.length() || i18 < str4.length()) {
                    d7.setFromIndex(i18);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i18 && length2 >= i18 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    d7.setRemovedCount((length - i18) + 1);
                    d7.setAddedCount((length2 - i18) + 1);
                } else {
                    d7 = null;
                }
                if (d7 != null) {
                    hVar2.h(d7);
                }
                if (gVar8.f734H != gVar8.f758g || gVar8.f735I != gVar8.f759h) {
                    AccessibilityEvent d8 = hVar2.d(gVar8.f752b, 8192);
                    d8.getText().add(str4);
                    d8.setFromIndex(gVar8.f758g);
                    d8.setToIndex(gVar8.f759h);
                    d8.setItemCount(str4.length());
                    hVar2.h(d8);
                }
            }
            it5 = it;
            i15 = 2048;
        }
    }
}
