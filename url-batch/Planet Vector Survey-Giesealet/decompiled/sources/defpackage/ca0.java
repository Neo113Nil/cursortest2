package defpackage;

import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ca0 {
    public final /* synthetic */ int a = 1;
    public l70 b;
    public l70 c;
    public final l70 d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public ca0() {
        l70 l70Var = new l70(new dk0[16]);
        this.b = l70Var;
        int i = wn0.a;
        this.g = new b70();
        this.c = l70Var;
        this.d = new l70(new Object[16]);
        this.h = new l70(new bu[16]);
    }

    public static final void a(ca0 ca0Var, t50 t50Var, ea0 ea0Var) {
        for (t50 t50Var2 = t50Var.h; t50Var2 != null; t50Var2 = t50Var2.h) {
            if (t50Var2 == ((ba0) ca0Var.f)) {
                p10 n = ((p10) ca0Var.e).n();
                ea0Var.t = n != null ? (iy) n.F.g : null;
                ca0Var.h = ea0Var;
                return;
            } else {
                if ((t50Var2.f & 2) != 0) {
                    return;
                }
                t50Var2.i0(ea0Var);
            }
        }
    }

    public static t50 c(s50 s50Var, t50 t50Var) {
        t50 t50Var2;
        if (s50Var instanceof z50) {
            t50Var2 = ((z50) s50Var).f();
            t50Var2.f = fa0.f(t50Var2);
        } else {
            g9 g9Var = new g9();
            g9Var.f = fa0.d(s50Var);
            g9Var.r = s50Var;
            g9Var.t = new HashSet();
            t50Var2 = g9Var;
        }
        if (t50Var2.q) {
            cy.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        t50Var2.l = true;
        t50 t50Var3 = t50Var.i;
        if (t50Var3 != null) {
            t50Var3.h = t50Var2;
            t50Var2.i = t50Var3;
        }
        t50Var.i = t50Var2;
        t50Var2.h = t50Var;
        return t50Var2;
    }

    public static t50 d(t50 t50Var) {
        boolean z = t50Var.q;
        if (z) {
            w60 w60Var = fa0.a;
            if (!z) {
                cy.b("autoInvalidateRemovedNode called on unattached node");
            }
            fa0.a(t50Var, -1, 2);
            t50Var.g0();
            t50Var.Y();
        }
        t50 t50Var2 = t50Var.i;
        t50 t50Var3 = t50Var.h;
        if (t50Var2 != null) {
            t50Var2.h = t50Var3;
            t50Var.i = null;
        }
        if (t50Var3 != null) {
            t50Var3.i = t50Var2;
            t50Var.h = null;
        }
        t50Var3.getClass();
        return t50Var3;
    }

    public static void m(s50 s50Var, s50 s50Var2, t50 t50Var) {
        if ((s50Var instanceof z50) && (s50Var2 instanceof z50)) {
            t50Var.getClass();
            ((z50) s50Var2).g(t50Var);
            if (t50Var.q) {
                fa0.c(t50Var);
                return;
            } else {
                t50Var.m = true;
                return;
            }
        }
        if (!(t50Var instanceof g9)) {
            cy.b("Unknown Modifier.Node type");
            return;
        }
        g9 g9Var = (g9) t50Var;
        if (g9Var.q) {
            g9Var.k0();
        }
        g9Var.r = s50Var2;
        g9Var.f = fa0.d(s50Var2);
        if (g9Var.q) {
            g9Var.j0(false);
        }
        if (t50Var.q) {
            fa0.c(t50Var);
        } else {
            t50Var.m = true;
        }
    }

    public void b() {
        this.e = null;
        this.f = null;
        l70 l70Var = this.b;
        l70Var.g();
        ((b70) this.g).b();
        this.c = l70Var;
        this.d.g();
        ((l70) this.h).g();
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public void e() {
        Set set = (Set) this.e;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ck0 ck0Var = (ck0) it.next();
                it.remove();
                ck0Var.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Finally extract failed */
    public void f() {
        l70 l70Var = this.b;
        Set set = (Set) this.e;
        if (set == null) {
            return;
        }
        l70 l70Var2 = this.d;
        int i = 1;
        if (l70Var2.f != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                b70 b70Var = (b70) this.i;
                for (int i2 = l70Var2.f - 1; -1 < i2; i2--) {
                    Object obj = l70Var2.d[i2];
                    try {
                        if (obj instanceof dk0) {
                            ck0 ck0Var = ((dk0) obj).a;
                            set.remove(ck0Var);
                            ck0Var.j();
                        }
                        if (obj instanceof p10) {
                            if (b70Var == null || !b70Var.c(obj)) {
                                ((p10) obj).G();
                            } else {
                                ca0 ca0Var = ((p10) obj).F;
                                ea0 ea0Var = ((iy) ca0Var.g).s;
                                for (ea0 ea0Var2 = (ea0) ca0Var.h; !nz.l(ea0Var2, ea0Var) && ea0Var2 != null; ea0Var2 = ea0Var2.s) {
                                    ea0Var2.J0();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        yh yhVar = (yh) this.f;
                        if (yhVar != null) {
                            x40.W(th, new f8(i, yhVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (l70Var.f != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.e;
                if (set2 != null) {
                    Object[] objArr = l70Var.d;
                    int i3 = l70Var.f;
                    for (int i4 = 0; i4 < i3; i4++) {
                        dk0 dk0Var = (dk0) objArr[i4];
                        ck0 ck0Var2 = dk0Var.a;
                        set2.remove(ck0Var2);
                        try {
                            ck0Var2.c();
                        } catch (Throwable th2) {
                            yh yhVar2 = (yh) this.f;
                            if (yhVar2 != null) {
                                x40.W(th2, new f8(i, yhVar2, dk0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void g(dk0 dk0Var) {
        l70 l70Var = this.b;
        b70 b70Var = (b70) this.g;
        if (b70Var.c(dk0Var)) {
            b70Var.k(dk0Var);
            if (!this.c.i(dk0Var) && !l70Var.i(dk0Var)) {
                Object[] objArr = l70Var.d;
                int i = l70Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((dk0) objArr[i2]).a instanceof bf0) {
                        throw null;
                    }
                }
            }
            Set set = (Set) this.e;
            if (set == null) {
                return;
            } else {
                set.add(dk0Var.a);
            }
        }
        this.d.b(dk0Var);
    }

    public boolean h(int i) {
        return (((t50) this.j).g & i) != 0;
    }

    public void i(Set set, yh yhVar) {
        b();
        this.e = set;
        this.f = yhVar;
    }

    public void j() {
        for (t50 t50Var = (t50) this.j; t50Var != null; t50Var = t50Var.i) {
            t50Var.f0();
            if (t50Var.l) {
                w60 w60Var = fa0.a;
                if (!t50Var.q) {
                    cy.b("autoInvalidateInsertedNode called on unattached node");
                }
                fa0.a(t50Var, -1, 1);
            }
            if (t50Var.m) {
                fa0.c(t50Var);
            }
            t50Var.l = false;
            t50Var.m = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(int i, l70 l70Var, l70 l70Var2, t50 t50Var, boolean z) {
        int i2;
        l70 l70Var3;
        l70 l70Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        aa0 aa0Var = (aa0) this.k;
        if (aa0Var == null) {
            i2 = i;
            l70Var3 = l70Var;
            l70Var4 = l70Var2;
            aa0Var = new aa0(this, t50Var, i2, l70Var3, l70Var4, z);
            this.k = aa0Var;
        } else {
            i2 = i;
            l70Var3 = l70Var;
            l70Var4 = l70Var2;
            aa0Var.a = t50Var;
            aa0Var.b = i2;
            aa0Var.c = l70Var3;
            aa0Var.d = l70Var4;
            aa0Var.e = z;
        }
        ca0 ca0Var = aa0Var.f;
        int i9 = l70Var3.f - i2;
        int i10 = l70Var4.f - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        jz jzVar = new jz(i11 * 3);
        jz jzVar2 = new jz(i11 * 4);
        int i12 = 0;
        jzVar2.e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = jzVar2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = jzVar2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            jzVar2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            jzVar2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            jzVar2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            jzVar2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && aa0Var.a(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        jzVar.d(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    jzVar2.e(i23, iArr2[i15], i19, iArr2[c2]);
                    jzVar2.e(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = jzVar.b;
        if (i55 % 3 != 0) {
            cy.b("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            jzVar.f(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        jzVar.d(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < jzVar.b) {
            int[] iArr8 = jzVar.a;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                t50 t50Var2 = aa0Var.a.i;
                t50Var2.getClass();
                if ((t50Var2.f & 2) != 0) {
                    ea0 ea0Var = t50Var2.k;
                    ea0Var.getClass();
                    ea0 ea0Var2 = ea0Var.t;
                    ea0 ea0Var3 = ea0Var.s;
                    ea0Var3.getClass();
                    if (ea0Var2 != null) {
                        ea0Var2.s = ea0Var3;
                    }
                    ea0Var3.t = ea0Var2;
                    a(ca0Var, aa0Var.a, ea0Var3);
                }
                aa0Var.a = d(t50Var2);
                i57++;
            }
            while (i58 < i62) {
                t50 c5 = c((s50) aa0Var.d.d[aa0Var.b + i58], aa0Var.a);
                aa0Var.a = c5;
                if (aa0Var.e) {
                    t50 t50Var3 = c5.i;
                    t50Var3.getClass();
                    ea0 ea0Var4 = t50Var3.k;
                    ea0Var4.getClass();
                    i10 m = nz.m(aa0Var.a);
                    if (m != null) {
                        k10 k10Var = new k10((p10) ca0Var.e, m);
                        aa0Var.a.i0(k10Var);
                        a(ca0Var, aa0Var.a, k10Var);
                        k10Var.t = ea0Var4.t;
                        k10Var.s = ea0Var4;
                        ea0Var4.t = k10Var;
                    } else {
                        aa0Var.a.i0(ea0Var4);
                    }
                    aa0Var.a.X();
                    aa0Var.a.f0();
                    t50 t50Var4 = aa0Var.a;
                    w60 w60Var = fa0.a;
                    if (!t50Var4.q) {
                        cy.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    fa0.a(t50Var4, -1, 1);
                } else {
                    c5.l = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    t50 t50Var5 = aa0Var.a.i;
                    t50Var5.getClass();
                    aa0Var.a = t50Var5;
                    l70 l70Var5 = aa0Var.c;
                    int i64 = aa0Var.b;
                    s50 s50Var = (s50) l70Var5.d[i64 + i57];
                    s50 s50Var2 = (s50) aa0Var.d.d[i64 + i58];
                    if (!nz.l(s50Var, s50Var2)) {
                        m(s50Var, s50Var2, aa0Var.a);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (t50 t50Var6 = ((su0) this.i).h; t50Var6 != null && t50Var6 != ((ba0) this.f); t50Var6 = t50Var6.h) {
            i65 |= t50Var6.f;
            t50Var6.g = i65;
        }
    }

    public void l() {
        k10 k10Var;
        p10 p10Var = (p10) this.e;
        ea0 ea0Var = (iy) this.g;
        for (t50 t50Var = ((su0) this.i).h; t50Var != null; t50Var = t50Var.h) {
            i10 m = nz.m(t50Var);
            if (m != null) {
                ea0 ea0Var2 = t50Var.k;
                if (ea0Var2 != null) {
                    k10 k10Var2 = (k10) ea0Var2;
                    i10 i10Var = k10Var2.Q;
                    k10Var2.V0(m);
                    k10Var = k10Var2;
                    if (i10Var != t50Var) {
                        cd0 cd0Var = k10Var2.L;
                        k10Var = k10Var2;
                        if (cd0Var != null) {
                            ((pv) cd0Var).c();
                            k10Var = k10Var2;
                        }
                    }
                } else {
                    k10 k10Var3 = new k10(p10Var, m);
                    t50Var.i0(k10Var3);
                    k10Var = k10Var3;
                }
                ea0Var.t = k10Var;
                k10Var.s = ea0Var;
                ea0Var = k10Var;
            } else {
                t50Var.i0(ea0Var);
            }
        }
        p10 n = p10Var.n();
        ea0Var.t = n != null ? (iy) n.F.g : null;
        this.h = ea0Var;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                t50 t50Var = (t50) this.j;
                su0 su0Var = (su0) this.i;
                if (t50Var == su0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (t50Var != null && t50Var != su0Var) {
                            sb.append(String.valueOf(t50Var));
                            if (t50Var.i == su0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                t50Var = t50Var.i;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ca0(p10 p10Var) {
        this.e = p10Var;
        ba0 ba0Var = new ba0();
        ba0Var.g = -1;
        this.f = ba0Var;
        iy iyVar = new iy(p10Var);
        this.g = iyVar;
        this.h = iyVar;
        su0 su0Var = iyVar.Q;
        this.i = su0Var;
        this.j = su0Var;
        this.d = new l70(new u50[16]);
    }
}
