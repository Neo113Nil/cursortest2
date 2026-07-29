package o;

import android.os.Trace;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1970td {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public C1970td(C0027Ay c0027Ay) {
        this.a = 1;
        this.b = c0027Ay;
        C0384Os c0384Os = new C0384Os(c0027Ay);
        this.c = c0384Os;
        this.d = c0384Os;
        IU iu = c0384Os.H;
        this.e = iu;
        this.f = iu;
    }

    public static final void a(C1970td c1970td, TC tc, ME me) {
        for (TC tc2 = tc.e; tc2 != null; tc2 = tc2.e) {
            if (tc2 == HE.a) {
                C0027Ay l = ((C0027Ay) c1970td.b).l();
                me.n = l != null ? (C0384Os) l.u.c : null;
                c1970td.d = me;
                return;
            } else {
                if ((tc2.c & 2) != 0) {
                    return;
                }
                tc2.h = me;
            }
        }
    }

    public static TC b(SC sc, TC tc) {
        TC tc2;
        if (sc instanceof XC) {
            tc2 = ((XC) sc).d();
            GD gd = NE.a;
            int i = tc2.c;
            if (i == 0) {
                GD gd2 = NE.a;
                Class<?> cls = tc2.getClass();
                int c = gd2.c(cls);
                if (c >= 0) {
                    i = gd2.c[c];
                } else {
                    int i2 = tc2 instanceof InterfaceC2123vy ? 3 : 1;
                    if (tc2 instanceof InterfaceC1055fj) {
                        i2 |= 4;
                    }
                    if (tc2 instanceof InterfaceC2155wQ) {
                        i2 |= 8;
                    }
                    if (tc2 instanceof X7) {
                        i2 |= 16;
                    }
                    if (tc2 instanceof WC) {
                        i2 |= 32;
                    }
                    if (tc2 instanceof X7) {
                        i2 |= 64;
                    }
                    if (tc2 instanceof X7) {
                        i2 |= 128;
                    }
                    if (tc2 instanceof X7) {
                        i2 |= 256;
                    }
                    if (tc2 instanceof C0405Pn) {
                        i2 |= 1024;
                    }
                    if (tc2 instanceof InterfaceC0302Ln) {
                        i2 |= 2048;
                    }
                    if (tc2 instanceof X7) {
                        i2 |= 4096;
                    }
                    if (tc2 instanceof C0182Gx) {
                        i2 |= 8192;
                    }
                    if (tc2 instanceof MO) {
                        i2 |= 16384;
                    }
                    if (tc2 instanceof C0405Pn) {
                        i2 |= 32768;
                    }
                    if (tc2 instanceof C0727aj) {
                        i2 |= 262144;
                    }
                    int b = gd2.b(cls);
                    if (b < 0) {
                        b = ~b;
                    }
                    gd2.b[b] = cls;
                    gd2.c[b] = i2;
                    i = i2;
                }
            }
            tc2.c = i;
        } else {
            X7 x7 = new X7();
            GD gd3 = NE.a;
            x7.c = sc instanceof AppendedSemanticsElement ? 9 : 1;
            x7.n = sc;
            new HashSet();
            tc2 = x7;
        }
        if (tc2.m) {
            AbstractC0868ct.W("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        tc2.i = true;
        TC tc3 = tc.f;
        if (tc3 != null) {
            tc3.e = tc2;
            tc2.f = tc3;
        }
        tc.f = tc2;
        tc2.e = tc;
        return tc2;
    }

    public static TC c(TC tc) {
        boolean z = tc.m;
        if (z) {
            GD gd = NE.a;
            if (!z) {
                AbstractC0868ct.W("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            NE.b(tc, tc.c, 2);
            tc.p();
            tc.l();
        }
        TC tc2 = tc.f;
        TC tc3 = tc.e;
        if (tc2 != null) {
            tc2.e = tc3;
            tc.f = null;
        }
        if (tc3 != null) {
            tc3.f = tc2;
            tc.e = null;
        }
        AbstractC0048Bt.k(tc3);
        return tc3;
    }

    public static void j(SC sc, SC sc2, TC tc) {
        if ((sc instanceof XC) && (sc2 instanceof XC)) {
            GE ge = HE.a;
            AbstractC0048Bt.l(tc, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((XC) sc2).e(tc);
            if (tc.m) {
                NE.c(tc);
                return;
            } else {
                tc.j = true;
                return;
            }
        }
        if (!(tc instanceof X7)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        X7 x7 = (X7) tc;
        if (x7.m) {
            x7.r();
        }
        x7.n = sc2;
        GD gd = NE.a;
        x7.c = sc2 instanceof AppendedSemanticsElement ? 9 : 1;
        if (x7.m) {
            x7.q(false);
        }
        if (tc.m) {
            NE.c(tc);
        } else {
            tc.j = true;
        }
    }

    public void d() {
        Set set = (Set) this.b;
        if (set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) it.next();
                it.remove();
                interfaceC0771bN.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.c;
        Set set = (Set) this.b;
        g(Integer.MIN_VALUE);
        ArrayList arrayList2 = (ArrayList) this.d;
        if (!arrayList2.isEmpty()) {
            Trace.beginSection("Compose:onForgotten");
            try {
                QD qd = (QD) this.g;
                for (int size = arrayList2.size() - 1; -1 < size; size--) {
                    Object obj = arrayList2.get(size);
                    if (obj instanceof InterfaceC0771bN) {
                        set.remove(obj);
                        ((InterfaceC0771bN) obj).c();
                    }
                    if (obj instanceof C0027Ay) {
                        if (qd == null || !qd.c(obj)) {
                            C0027Ay c0027Ay = (C0027Ay) obj;
                            c0027Ay.B = true;
                            c0027Ay.G();
                            if (c0027Ay.v()) {
                                c0027Ay.t();
                            }
                        } else {
                            C1970td c1970td = ((C0027Ay) obj).u;
                            ME me = ((C0384Os) c1970td.c).m;
                            for (ME me2 = (ME) c1970td.d; !AbstractC0048Bt.h(me2, me) && me2 != null; me2 = me2.m) {
                                me2.f66o = true;
                                me2.A.invoke();
                                if (me2.C != null) {
                                    me2.A0(null, false);
                                    me2.l.D(false);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                InterfaceC0771bN interfaceC0771bN = (InterfaceC0771bN) arrayList.get(i);
                set.remove(interfaceC0771bN);
                interfaceC0771bN.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public boolean f(int i) {
        return (i & ((TC) this.f).d) != 0;
    }

    public void g(int i) {
        C2274yD c2274yD = (C2274yD) this.i;
        ArrayList arrayList = (ArrayList) this.f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = 0;
        ArrayList arrayList2 = null;
        int i3 = 0;
        C2274yD c2274yD2 = null;
        C2274yD c2274yD3 = null;
        while (i3 < c2274yD.b) {
            if (i <= c2274yD.c(i3)) {
                Object remove = arrayList.remove(i3);
                int d = c2274yD.d(i3);
                int d2 = ((C2274yD) this.h).d(i3);
                if (arrayList2 == null) {
                    arrayList2 = AbstractC0868ct.N(remove);
                    c2274yD3 = new C2274yD();
                    c2274yD3.a(d);
                    c2274yD2 = new C2274yD();
                    c2274yD2.a(d2);
                } else {
                    AbstractC0048Bt.l(c2274yD2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    AbstractC0048Bt.l(c2274yD3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayList2.add(remove);
                    c2274yD3.a(d);
                    c2274yD2.a(d2);
                }
            } else {
                i3++;
            }
        }
        if (arrayList2 != null) {
            AbstractC0048Bt.l(c2274yD2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            AbstractC0048Bt.l(c2274yD3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayList2.size() - 1;
            while (i2 < size) {
                int i4 = i2 + 1;
                int size2 = arrayList2.size();
                for (int i5 = i4; i5 < size2; i5++) {
                    int c = c2274yD3.c(i2);
                    int c2 = c2274yD3.c(i5);
                    if (c < c2 || (c2 == c && c2274yD2.c(i2) < c2274yD2.c(i5))) {
                        Object obj = arrayList2.get(i2);
                        arrayList2.set(i2, arrayList2.get(i5));
                        arrayList2.set(i5, obj);
                        int c3 = c2274yD2.c(i2);
                        c2274yD2.e(i2, c2274yD2.c(i5));
                        c2274yD2.e(i5, c3);
                        int c4 = c2274yD3.c(i2);
                        c2274yD3.e(i2, c2274yD3.c(i5));
                        c2274yD3.e(i5, c4);
                    }
                }
                i2 = i4;
            }
            ((ArrayList) this.d).addAll(arrayList2);
        }
    }

    public void h(Object obj, int i, int i2, int i3) {
        g(i);
        if (i3 < 0 || i3 >= i) {
            ((ArrayList) this.d).add(obj);
            return;
        }
        ((ArrayList) this.f).add(obj);
        ((C2274yD) this.h).a(i2);
        ((C2274yD) this.i).a(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bc, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x021c, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a6, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0185, code lost:
    
        r25 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0170, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0163, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0222, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0149, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013f, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0145, code lost:
    
        if ((r19 % 2) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014b, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r13 > r3) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r13 == r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0150, code lost:
    
        if (r13 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0160, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0177, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
    
        if (r3 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017f, code lost:
    
        if (r14 == r11) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0182, code lost:
    
        r25 = r22 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0187, code lost:
    
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018d, code lost:
    
        if (r14 <= r7) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018f, code lost:
    
        if (r11 <= r15) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0191, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019d, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019f, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01aa, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ae, code lost:
    
        if (r24 == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b2, code lost:
    
        if (r11 < r12) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b4, code lost:
    
        if (r11 > r3) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
    
        if (r16[r17 + r11] < r14) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(int i, YD yd, YD yd2, TC tc, boolean z) {
        int i2;
        YD yd3;
        YD yd4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        FE fe = (FE) this.i;
        if (fe == null) {
            i2 = i;
            yd3 = yd;
            yd4 = yd2;
            fe = new FE(this, tc, i2, yd3, yd4, z);
            this.i = fe;
        } else {
            i2 = i;
            yd3 = yd;
            yd4 = yd2;
            fe.a = tc;
            fe.b = i2;
            fe.c = yd3;
            fe.d = yd4;
            fe.e = z;
        }
        C1970td c1970td = fe.f;
        int i9 = yd3.j - i2;
        int i10 = yd4.j - i2;
        char c2 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        C1459lt c1459lt = new C1459lt(i11 * 3);
        C1459lt c1459lt2 = new C1459lt(i11 * 4);
        int i12 = 0;
        c1459lt2.d(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = c1459lt2.b;
            if (i14 == 0) {
                break;
            }
            char c3 = c2;
            int[] iArr6 = c1459lt2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            c1459lt2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            c1459lt2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            c1459lt2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            c1459lt2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = ((i24 + i26) + 1) / 2;
                int i28 = i25 / 2;
                int i29 = i28 + 1;
                iArr7[i29] = i23;
                iArr4[i29] = i21;
                int i30 = i15;
                while (i30 < i27) {
                    int i31 = i24 - i26;
                    int i32 = i27;
                    iArr = iArr4;
                    int i33 = -i30;
                    int i34 = Math.abs(i31) % 2 == 1 ? 1 : i15;
                    int i35 = i33;
                    while (true) {
                        if (i35 > i30) {
                            break;
                        }
                        if (i35 != i33) {
                            if (i35 != i30) {
                                i4 = i35;
                                iArr2 = iArr5;
                            } else {
                                i4 = i35;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i28];
                            i6 = i5 + 1;
                            int i36 = ((i6 - i23) + i19) - i4;
                            int i37 = (i30 == 0 && i6 == i5) ? i36 - 1 : i36;
                            int i38 = i5;
                            i7 = i36;
                            while (i6 < i21 && i7 < i17 && fe.a(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i28 + i4] = i6;
                            if (i34 == 0) {
                                int i39 = i7;
                                int i40 = i31 - i4;
                                i8 = i24;
                                if (i40 >= i33 + 1 && i40 <= i30 - 1 && iArr[i28 + i40] <= i6) {
                                    iArr2[i15] = i38;
                                    iArr2[1] = i37;
                                    iArr2[c3] = i6;
                                    iArr2[3] = i39;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i35 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i35;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i28];
                        i6 = i5;
                        int i362 = ((i6 - i23) + i19) - i4;
                        if (i30 == 0) {
                        }
                        int i382 = i5;
                        i7 = i362;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i28 + i4] = i6;
                        if (i34 == 0) {
                        }
                        i35 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (DY.j(iArr2) > 0) {
                        int i41 = iArr2[3];
                        int i42 = iArr2[c];
                        int i43 = i41 - i42;
                        int i44 = iArr2[c3];
                        int i45 = iArr2[i15];
                        int i46 = i44 - i45;
                        if (i43 == i46) {
                            c1459lt.c(i45, i42, i46);
                        } else if (iArr2[4] != 0) {
                            c1459lt.c(i45, i42, DY.j(iArr2));
                        } else if (i43 > i46) {
                            c1459lt.c(i45, i42 + 1, DY.j(iArr2));
                        } else {
                            c1459lt.c(i45 + 1, i42, DY.j(iArr2));
                        }
                    }
                    c1459lt2.d(i23, iArr2[i15], i19, iArr2[1]);
                    c1459lt2.d(iArr2[c3], i21, iArr2[3], i17);
                    c2 = c3;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c2 = c3;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i47 = i12;
        int i48 = c1459lt.b;
        if (i48 % 3 != 0) {
            AbstractC0868ct.W("Array size not a multiple of 3");
            throw null;
        }
        if (i48 > 3) {
            i3 = i47;
            c1459lt.e(i3, i48 - 3);
        } else {
            i3 = i47;
        }
        c1459lt.c(i9, i10, i3);
        int i49 = i3;
        int i50 = i49;
        int i51 = i50;
        while (i49 < c1459lt.b) {
            int[] iArr8 = c1459lt.a;
            int i52 = iArr8[i49];
            int i53 = iArr8[i49 + 2];
            int i54 = i52 - i53;
            int i55 = iArr8[i49 + 1] - i53;
            i49 += 3;
            while (i50 < i54) {
                TC tc2 = fe.a.f;
                AbstractC0048Bt.k(tc2);
                if ((tc2.c & 2) != 0) {
                    ME me = tc2.h;
                    AbstractC0048Bt.k(me);
                    ME me2 = me.n;
                    ME me3 = me.m;
                    AbstractC0048Bt.k(me3);
                    if (me2 != null) {
                        me2.m = me3;
                    }
                    me3.n = me2;
                    a(c1970td, fe.a, me3);
                }
                fe.a = c(tc2);
                i50++;
            }
            while (i51 < i55) {
                TC b = b((SC) fe.d.h[fe.b + i51], fe.a);
                fe.a = b;
                if (fe.e) {
                    TC tc3 = b.f;
                    AbstractC0048Bt.k(tc3);
                    ME me4 = tc3.h;
                    AbstractC0048Bt.k(me4);
                    TC tc4 = fe.a;
                    InterfaceC2123vy interfaceC2123vy = ((tc4.c & 2) == 0 || !(tc4 instanceof InterfaceC2123vy)) ? null : (InterfaceC2123vy) tc4;
                    if (interfaceC2123vy != null) {
                        C2255xy c2255xy = new C2255xy((C0027Ay) c1970td.b, interfaceC2123vy);
                        TC tc5 = fe.a;
                        tc5.h = c2255xy;
                        a(c1970td, tc5, c2255xy);
                        c2255xy.n = me4.n;
                        c2255xy.m = me4;
                        me4.n = c2255xy;
                    } else {
                        tc4.h = me4;
                    }
                    fe.a.k();
                    fe.a.o();
                    NE.a(fe.a);
                } else {
                    b.i = true;
                }
                i51++;
            }
            while (true) {
                int i56 = i53 - 1;
                if (i53 > 0) {
                    TC tc6 = fe.a.f;
                    AbstractC0048Bt.k(tc6);
                    fe.a = tc6;
                    YD yd5 = fe.c;
                    int i57 = fe.b;
                    SC sc = (SC) yd5.h[i57 + i50];
                    SC sc2 = (SC) fe.d.h[i57 + i51];
                    if (!AbstractC0048Bt.h(sc, sc2)) {
                        j(sc, sc2, fe.a);
                    }
                    i50++;
                    i51++;
                    i53 = i56;
                }
            }
        }
        int i58 = i3;
        for (TC tc7 = ((IU) this.e).e; tc7 != null && tc7 != HE.a; tc7 = tc7.e) {
            i58 |= tc7.c;
            tc7.d = i58;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                TC tc = (TC) this.f;
                IU iu = (IU) this.e;
                if (tc == iu) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (tc != null && tc != iu) {
                            sb.append(String.valueOf(tc));
                            if (tc.f == iu) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                tc = tc.f;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C1970td(Set set) {
        this.a = 0;
        this.b = set;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new C2274yD();
        this.i = new C2274yD();
    }
}
