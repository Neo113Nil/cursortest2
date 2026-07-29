package androidx.compose.ui.focus;

import android.view.KeyEvent;
import java.util.ArrayList;
import o.AbstractC0048Bt;
import o.AbstractC0772bO;
import o.AbstractC0868ct;
import o.AbstractC0946e20;
import o.AbstractC1052fg;
import o.AbstractC1473m3;
import o.AbstractC1807r8;
import o.AbstractC1888sN;
import o.C0027Ay;
import o.C0057Cc;
import o.C0078Cx;
import o.C0146Fn;
import o.C0172Gn;
import o.C0182Gx;
import o.C0250Jn;
import o.C0276Kn;
import o.C0353Nn;
import o.C0405Pn;
import o.C0660Zi;
import o.C1032fM;
import o.C1711ph;
import o.C1970td;
import o.C2234xd;
import o.DD;
import o.EnumC2057uy;
import o.IU;
import o.InterfaceC0198Hn;
import o.InterfaceC1455lp;
import o.InterfaceC2114vp;
import o.J2;
import o.M2;
import o.N2;
import o.O2;
import o.P2;
import o.PX;
import o.TC;
import o.UC;
import o.X7;
import o.XC;
import o.YD;

/* loaded from: classes.dex */
public final class a implements InterfaceC0198Hn {
    public final N2 a;
    public final J2 b;
    public final O2 c;
    public final C0172Gn e;
    public DD h;
    public final C0405Pn d = new C0405Pn();
    public final C1711ph f = new C1711ph(1);
    public final UC g = new FocusPropertiesElement(new C0276Kn()).c(new XC() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // o.XC
        public final TC d() {
            return a.this.d;
        }

        @Override // o.XC
        public final /* bridge */ /* synthetic */ void e(TC tc) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return a.this.d.hashCode();
        }
    });

    public a(M2 m2, N2 n2, J2 j2, O2 o2) {
        this.a = n2;
        this.b = j2;
        this.c = o2;
        this.e = new C0172Gn(m2, new J2(0, this, a.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 4));
    }

    public final boolean a(int i, boolean z, boolean z2) {
        boolean o2;
        int v;
        C1711ph c1711ph = this.f;
        C2234xd c2234xd = C2234xd.n;
        try {
            if (c1711ph.h) {
                C1711ph.a(c1711ph);
            }
            c1711ph.h = true;
            ((YD) c1711ph.j).b(c2234xd);
            C0405Pn c0405Pn = this.d;
            if (!z && ((v = AbstractC1888sN.v(AbstractC1807r8.M(c0405Pn))) == 1 || v == 2 || v == 3)) {
                o2 = false;
                if (o2 && z2) {
                    this.b.invoke();
                }
                return o2;
            }
            o2 = AbstractC1807r8.o(c0405Pn, z);
            if (o2) {
                this.b.invoke();
            }
            return o2;
        } finally {
            C1711ph.b(c1711ph);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x00b3, code lost:
    
        if (((((~r12) << 6) & r12) & (-9187201950435737472L)) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00b5, code lost:
    
        r4 = r5.b(r9);
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00bd, code lost:
    
        if (r5.e != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00ce, code lost:
    
        if (((r5.a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00d4, code lost:
    
        r4 = r5.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00d8, code lost:
    
        if (r4 <= 8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00ef, code lost:
    
        if (java.lang.Long.compare((r5.d * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00f1, code lost:
    
        r4 = r5.a;
        r6 = r5.c;
        r10 = r5.b;
        o.UP.a(r4, r6);
        r11 = 0;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00fd, code lost:
    
        if (r11 == r6) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00ff, code lost:
    
        r13 = r11 >> 3;
        r25 = (r11 & 7) << 3;
        r20 = (r4[r13] >> r25) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x010d, code lost:
    
        if (r20 != r7) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0119, code lost:
    
        if (r20 == 254) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x011e, code lost:
    
        r20 = java.lang.Long.hashCode(r10[r11]) * r33;
        r27 = r7;
        r7 = (r20 ^ (r20 << 16)) >>> 7;
        r8 = r5.b(r7);
        r7 = r7 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x014a, code lost:
    
        if ((((r8 - r7) & r6) / 8) != (((r11 - r7) & r6) / 8)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x014c, code lost:
    
        r4[r13] = (r4[r13] & (~(255 << r25))) | ((r20 & 127) << r25);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0169, code lost:
    
        r11 = r11 + 1;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x016e, code lost:
    
        r7 = r8 >> 3;
        r40 = r4[r7];
        r8 = (r8 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x017c, code lost:
    
        if (((r40 >> r8) & 255) != r27) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x017e, code lost:
    
        r4[r7] = (r40 & (~(255 << r8))) | ((r20 & 127) << r8);
        r4[r13] = (r4[r13] & (~(255 << r25))) | (r27 << r25);
        r10[r8] = r10[r11];
        r10[r11] = 0;
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01d4, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01a9, code lost:
    
        r4[r7] = (r40 & (~(255 << r8))) | ((r20 & 127) << r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01be, code lost:
    
        if (r12 != (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01c0, code lost:
    
        r12 = o.UP.b(r4, r11 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01c6, code lost:
    
        r10[r12] = r10[r8];
        r10[r8] = r10[r11];
        r10[r11] = r10[r12];
        r11 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x011b, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x010f, code lost:
    
        r12 = r11;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01e0, code lost:
    
        r27 = r7;
        r5.e = o.UP.c(r5.c) - r5.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0267, code lost:
    
        r4 = r5.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x026b, code lost:
    
        r34 = r4;
        r5.d++;
        r4 = r5.e;
        r6 = r5.a;
        r7 = r34 >> 3;
        r8 = r6[r7];
        r10 = (r34 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0285, code lost:
    
        if (((r8 >> r10) & 255) != r27) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0287, code lost:
    
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x028c, code lost:
    
        r5.e = r4 - r11;
        r4 = r5.c;
        r8 = (r8 & (~(255 << r10))) | (r14 << r10);
        r6[r7] = r8;
        r6[(((r34 - 7) & r4) + (r4 & 7)) >> 3] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x028a, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01ef, code lost:
    
        r27 = 128;
        r4 = o.UP.d(r5.c);
        r6 = r5.a;
        r7 = r5.b;
        r8 = r5.c;
        r5.c(r4);
        r4 = r5.a;
        r10 = r5.b;
        r11 = r5.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0208, code lost:
    
        if (r12 >= r8) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0218, code lost:
    
        if (((r6[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x021a, code lost:
    
        r16 = r7[r12];
        r13 = java.lang.Long.hashCode(r16) * r33;
        r13 = r13 ^ (r13 << 16);
        r18 = r4;
        r4 = r5.b(r13 >>> 7);
        r19 = r6;
        r20 = r7;
        r6 = r13 & 127;
        r13 = r4 >> 3;
        r21 = (r4 & 7) << 3;
        r6 = (r18[r13] & (~(255 << r21))) | (r6 << r21);
        r18[r13] = r6;
        r18[(((r4 - 7) & r11) + (r11 & 7)) >> 3] = r6;
        r10[r4] = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x025e, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r6 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0258, code lost:
    
        r18 = r4;
        r19 = r6;
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00d0, code lost:
    
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x032a, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x032c, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x038b, code lost:
    
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0431  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(KeyEvent keyEvent, InterfaceC1455lp interfaceC1455lp) {
        int i;
        TC tc;
        TC tc2;
        C1970td c1970td;
        TC tc3;
        C1970td c1970td2;
        int size;
        C1970td c1970td3;
        int i2;
        if (this.e.a()) {
            throw new IllegalStateException("Dispatching key event while focus system is invalidated.");
        }
        long f = PX.f(keyEvent.getKeyCode());
        int action = keyEvent.getAction();
        int i3 = 1;
        char c = action != 0 ? action != 1 ? (char) 0 : (char) 1 : (char) 2;
        int i4 = -862048943;
        if (c == 2) {
            DD dd = this.h;
            if (dd == null) {
                dd = new DD(3);
                this.h = dd;
            }
            DD dd2 = dd;
            int hashCode = Long.hashCode(f) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 >>> 7;
            int i7 = i5 & 127;
            int i8 = dd2.c;
            int i9 = i6 & i8;
            int i10 = 0;
            loop0: while (true) {
                long[] jArr = dd2.a;
                int i11 = i9 >> 3;
                int i12 = i4;
                int i13 = (i9 & 7) << 3;
                long j = (jArr[i11] >>> i13) | ((jArr[i11 + 1] << (64 - i13)) & ((-i13) >> 63));
                long j2 = i7;
                int i14 = i3;
                long j3 = j ^ (j2 * 72340172838076673L);
                long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i2 = (i9 + (Long.numberOfTrailingZeros(j4) >> 3)) & i8;
                    if (dd2.b[i2] == f) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                }
                i10 += 8;
                i9 = (i9 + i10) & i8;
                i4 = i12;
                i3 = i14;
            }
            dd2.b[i2] = f;
        } else if (c == 1) {
            DD dd3 = this.h;
            if (dd3 != null && dd3.a(f)) {
                DD dd4 = this.h;
                if (dd4 != null) {
                    int hashCode2 = Long.hashCode(f) * (-862048943);
                    int i15 = hashCode2 ^ (hashCode2 << 16);
                    int i16 = i15 & 127;
                    int i17 = dd4.c;
                    int i18 = (i15 >>> 7) & i17;
                    int i19 = 0;
                    loop18: while (true) {
                        long[] jArr2 = dd4.a;
                        int i20 = i18 >> 3;
                        int i21 = (i18 & 7) << 3;
                        long j5 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                        long j6 = (i16 * 72340172838076673L) ^ j5;
                        long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                        while (true) {
                            if (j7 == 0) {
                                break;
                            }
                            int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i18) & i17;
                            if (dd4.b[numberOfTrailingZeros] == f) {
                                i = numberOfTrailingZeros;
                                break loop18;
                            }
                            j7 &= j7 - 1;
                        }
                        i19 += 8;
                        i18 = (i18 + i19) & i17;
                    }
                    if (i >= 0) {
                        dd4.d--;
                        long[] jArr3 = dd4.a;
                        int i22 = dd4.c;
                        int i23 = i >> 3;
                        int i24 = (i & 7) << 3;
                        long j8 = (254 << i24) | (jArr3[i23] & (~(255 << i24)));
                        jArr3[i23] = j8;
                        jArr3[(((i - 7) & i22) + (i22 & 7)) >> 3] = j8;
                    }
                }
            }
            return false;
        }
        C0405Pn c0405Pn = this.d;
        C0405Pn m = AbstractC1052fg.m(c0405Pn);
        if (m != null) {
            TC tc4 = m.b;
            if (!tc4.m) {
                AbstractC0868ct.W("visitLocalDescendants called on an unattached node");
                throw null;
            }
            if ((tc4.d & 9216) != 0) {
                tc2 = null;
                for (TC tc5 = tc4.f; tc5 != null; tc5 = tc5.f) {
                    int i25 = tc5.c;
                    if ((i25 & 9216) != 0) {
                        if ((i25 & 1024) != 0) {
                            break;
                        }
                        tc2 = tc5;
                    }
                }
            } else {
                tc2 = null;
            }
        }
        if (m != null) {
            TC tc6 = m.b;
            if (!tc6.m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C0027Ay J = AbstractC0946e20.J(m);
            loop10: while (true) {
                if (J == null) {
                    tc3 = null;
                    break;
                }
                if ((((TC) J.u.f).d & 8192) != 0) {
                    while (tc6 != null) {
                        if ((tc6.c & 8192) != 0) {
                            tc3 = tc6;
                            while (tc3 != null) {
                                if (tc3 instanceof C0182Gx) {
                                    break loop10;
                                }
                                tc3 = null;
                            }
                        }
                        tc6 = tc6.e;
                    }
                }
                J = J.l();
                tc6 = (J == null || (c1970td2 = J.u) == null) ? null : (IU) c1970td2.e;
            }
            C0182Gx c0182Gx = (C0182Gx) tc3;
            if (c0182Gx != null) {
                tc2 = c0182Gx.b;
                if (tc2 != null) {
                    TC tc7 = tc2.b;
                    if (!tc7.m) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    TC tc8 = tc7.e;
                    C0027Ay J2 = AbstractC0946e20.J(tc2);
                    ArrayList arrayList = null;
                    while (J2 != null) {
                        if ((((TC) J2.u.f).d & 8192) != 0) {
                            while (tc8 != null) {
                                if ((tc8.c & 8192) != 0) {
                                    for (TC tc9 = tc8; tc9 != null; tc9 = null) {
                                        if (tc9 instanceof C0182Gx) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(tc9);
                                        }
                                    }
                                }
                                tc8 = tc8.e;
                            }
                        }
                        J2 = J2.l();
                        tc8 = (J2 == null || (c1970td3 = J2.u) == null) ? null : (IU) c1970td3.e;
                    }
                    if (arrayList != null && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i26 = size - 1;
                            ((C0182Gx) arrayList.get(size)).getClass();
                            if (i26 < 0) {
                                break;
                            }
                            size = i26;
                        }
                    }
                    for (TC tc10 = tc7; tc10 != null; tc10 = null) {
                        if (tc10 instanceof C0182Gx) {
                        }
                    }
                    if (((Boolean) interfaceC1455lp.invoke()).booleanValue()) {
                        return true;
                    }
                    while (tc7 != null) {
                        if (tc7 instanceof C0182Gx) {
                            P2 p2 = ((C0182Gx) tc7).n;
                            if (p2 != null ? ((Boolean) p2.invoke(new C0078Cx(keyEvent))).booleanValue() : false) {
                                return true;
                            }
                        }
                        tc7 = null;
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i27 = 0; i27 < size2; i27++) {
                            P2 p22 = ((C0182Gx) arrayList.get(i27)).n;
                            if (p22 != null ? ((Boolean) p22.invoke(new C0078Cx(keyEvent))).booleanValue() : false) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        TC tc11 = c0405Pn.b;
        if (!tc11.m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        TC tc12 = tc11.e;
        C0027Ay J3 = AbstractC0946e20.J(c0405Pn);
        loop13: while (true) {
            if (J3 == null) {
                tc = null;
                break;
            }
            if ((((TC) J3.u.f).d & 8192) != 0) {
                while (tc12 != null) {
                    if ((tc12.c & 8192) != 0) {
                        tc = tc12;
                        while (tc != null) {
                            if (tc instanceof C0182Gx) {
                                break loop13;
                            }
                            tc = null;
                        }
                    }
                    tc12 = tc12.e;
                }
            }
            J3 = J3.l();
            tc12 = (J3 == null || (c1970td = J3.u) == null) ? null : (IU) c1970td.e;
        }
        C0182Gx c0182Gx2 = (C0182Gx) tc;
        tc2 = c0182Gx2 != null ? c0182Gx2.b : null;
        if (tc2 != null) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean c(int i, C1032fM c1032fM, InterfaceC2114vp interfaceC2114vp) {
        boolean g;
        C1970td c1970td;
        C0353Nn c0353Nn;
        C0353Nn c0353Nn2;
        boolean z;
        C0405Pn c0405Pn = this.d;
        C0405Pn m = AbstractC1052fg.m(c0405Pn);
        int i2 = 4;
        O2 o2 = this.c;
        C0405Pn c0405Pn2 = null;
        if (m != null) {
            EnumC2057uy enumC2057uy = (EnumC2057uy) o2.i();
            C0250Jn q = m.q();
            if (i == 1) {
                c0353Nn = q.b;
            } else if (i == 2) {
                c0353Nn = q.c;
            } else if (i == 5) {
                c0353Nn = q.d;
            } else if (i == 6) {
                c0353Nn = q.e;
            } else if (i == 3) {
                int ordinal = enumC2057uy.ordinal();
                if (ordinal == 0) {
                    c0353Nn2 = q.h;
                } else {
                    if (ordinal != 1) {
                        throw new C0057Cc();
                    }
                    c0353Nn2 = q.i;
                }
                if (c0353Nn2 == C0353Nn.b) {
                    c0353Nn2 = null;
                }
                if (c0353Nn2 == null) {
                    c0353Nn = q.f;
                }
                c0353Nn = c0353Nn2;
            } else if (i == 4) {
                int ordinal2 = enumC2057uy.ordinal();
                if (ordinal2 == 0) {
                    c0353Nn2 = q.i;
                } else {
                    if (ordinal2 != 1) {
                        throw new C0057Cc();
                    }
                    c0353Nn2 = q.h;
                }
                if (c0353Nn2 == C0353Nn.b) {
                    c0353Nn2 = null;
                }
                if (c0353Nn2 == null) {
                    c0353Nn = q.g;
                }
                c0353Nn = c0353Nn2;
            } else if (i == 7) {
                q.j.getClass();
                c0353Nn = C0353Nn.b;
            } else {
                if (i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                q.k.getClass();
                c0353Nn = C0353Nn.b;
            }
            C0353Nn c0353Nn3 = C0353Nn.c;
            if (!AbstractC0048Bt.h(c0353Nn, c0353Nn3)) {
                C0353Nn c0353Nn4 = C0353Nn.b;
                if (!AbstractC0048Bt.h(c0353Nn, c0353Nn4)) {
                    YD yd = c0353Nn.a;
                    if (c0353Nn == c0353Nn4) {
                        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    }
                    if (c0353Nn == c0353Nn3) {
                        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    }
                    if (!yd.l()) {
                        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    }
                    int i3 = yd.j;
                    if (i3 > 0) {
                        Object[] objArr = yd.h;
                        int i4 = 0;
                        boolean z2 = false;
                        do {
                            TC tc = ((X7) objArr[i4]).b;
                            if (!tc.m) {
                                throw new IllegalStateException("visitChildren called on an unattached node");
                            }
                            YD yd2 = new YD(new TC[16]);
                            TC tc2 = tc.f;
                            if (tc2 == null) {
                                AbstractC0946e20.c(yd2, tc);
                            } else {
                                yd2.b(tc2);
                            }
                            while (true) {
                                if (!yd2.l()) {
                                    break;
                                }
                                TC tc3 = (TC) yd2.n(yd2.j - 1);
                                if ((tc3.d & 1024) == 0) {
                                    AbstractC0946e20.c(yd2, tc3);
                                } else {
                                    while (true) {
                                        if (tc3 == null) {
                                            break;
                                        }
                                        if ((tc3.c & 1024) != 0) {
                                            while (tc3 != null) {
                                                if (tc3 instanceof C0405Pn) {
                                                    C0405Pn c0405Pn3 = (C0405Pn) tc3;
                                                    if (c0405Pn3.q().a ? ((Boolean) interfaceC2114vp.invoke(c0405Pn3)).booleanValue() : AbstractC0772bO.j(c0405Pn3, 7, interfaceC2114vp)) {
                                                        z2 = true;
                                                        break;
                                                    }
                                                }
                                                tc3 = null;
                                            }
                                        } else {
                                            tc3 = tc3.f;
                                        }
                                    }
                                }
                            }
                            i4++;
                        } while (i4 < i3);
                        z = z2;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            return null;
        }
        m = null;
        EnumC2057uy enumC2057uy2 = (EnumC2057uy) o2.i();
        C0660Zi c0660Zi = new C0660Zi(m, this, interfaceC2114vp);
        if (i == 1 || i == 2) {
            if (i == 1) {
                g = AbstractC1473m3.x(c0405Pn, c0660Zi);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                g = AbstractC1473m3.g(c0405Pn, c0660Zi);
            }
            return Boolean.valueOf(g);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return AbstractC0772bO.z(i, c0660Zi, c0405Pn, c1032fM);
        }
        if (i == 7) {
            int ordinal3 = enumC2057uy2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new C0057Cc();
                }
                i2 = 3;
            }
            C0405Pn m2 = AbstractC1052fg.m(c0405Pn);
            if (m2 != null) {
                return AbstractC0772bO.z(i2, c0660Zi, m2, c1032fM);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C0146Fn.a(i))).toString());
        }
        C0405Pn m3 = AbstractC1052fg.m(c0405Pn);
        if (m3 != null) {
            TC tc4 = m3.b;
            if (!tc4.m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            TC tc5 = tc4.e;
            C0027Ay J = AbstractC0946e20.J(m3);
            loop4: while (true) {
                if (J == null) {
                    break;
                }
                if ((((TC) J.u.f).d & 1024) != 0) {
                    while (tc5 != null) {
                        if ((tc5.c & 1024) != 0) {
                            for (TC tc6 = tc5; tc6 != null; tc6 = null) {
                                if (tc6 instanceof C0405Pn) {
                                    C0405Pn c0405Pn4 = (C0405Pn) tc6;
                                    if (c0405Pn4.q().a) {
                                        c0405Pn2 = c0405Pn4;
                                        break loop4;
                                    }
                                }
                            }
                        }
                        tc5 = tc5.e;
                    }
                }
                J = J.l();
                tc5 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
            }
        }
        C0405Pn c0405Pn5 = c0405Pn2;
        return Boolean.valueOf((c0405Pn5 == null || c0405Pn5.equals(c0405Pn)) ? false : ((Boolean) c0660Zi.invoke(c0405Pn5)).booleanValue());
    }
}
