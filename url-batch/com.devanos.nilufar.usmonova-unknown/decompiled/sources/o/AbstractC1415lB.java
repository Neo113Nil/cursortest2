package o;

/* renamed from: o.lB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1415lB extends AbstractC0700aI implements InterfaceC1351kD, InterfaceC1119gh {
    public boolean g;
    public boolean h;
    public final C1481mB i = new C1481mB(0, this);
    public FD j;
    public FD k;

    public static void S(ME me) {
        C0053By c0053By;
        ME me2 = me.m;
        C0027Ay c0027Ay = me.l;
        if (!AbstractC0048Bt.h(me2 != null ? me2.l : null, c0027Ay)) {
            c0027Ay.v.q.q.f();
            return;
        }
        InterfaceC1405l2 q = c0027Ay.v.q.q();
        if (q == null || (c0053By = ((C0157Fy) q).q) == null) {
            return;
        }
        c0053By.f();
    }

    public abstract int H(AbstractC2248xr abstractC2248xr);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e0, code lost:
    
        r4 = r38 + 1;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x029d, code lost:
    
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02dc, code lost:
    
        r38 = r4;
        r37 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0119, code lost:
    
        r43 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        r38 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        r4 = r2.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        if (r2.f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        if (((r2.a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        r4 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        if (r4 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (java.lang.Long.compare((r2.e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r4 = r2.a;
        r5 = r2.d;
        r6 = r2.b;
        r11 = r2.c;
        o.UP.a(r4, r5);
        r12 = 0;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        if (r12 == r5) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014f, code lost:
    
        r39 = r12 >> 3;
        r44 = (r12 & 7) << 3;
        r42 = (r4[r39] >> r44) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015d, code lost:
    
        if (r42 != 128) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0169, code lost:
    
        if (r42 == 254) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016e, code lost:
    
        r42 = r6[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0170, code lost:
    
        if (r42 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0172, code lost:
    
        r42 = r42.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        r42 = r42 * (-862048943);
        r43 = r8;
        r8 = (r42 ^ (r42 << 16)) >>> 7;
        r45 = r2.b(r8);
        r8 = r8 & r5;
        r47 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019f, code lost:
    
        if ((((r45 - r8) & r5) / 8) != (((r12 - r8) & r5) / 8)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        r4[r39] = (r4[r39] & (~(255 << r44))) | ((r42 & 127) << r44);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c2, code lost:
    
        r8 = r43;
        r11 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c7, code lost:
    
        r46 = r12;
        r8 = r45 >> 3;
        r11 = r4[r8];
        r50 = (r45 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d7, code lost:
    
        if (((r11 >> r50) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d9, code lost:
    
        r4[r8] = (r11 & (~(255 << r50))) | ((r42 & 127) << r50);
        r4[r39] = (r4[r39] & (~(255 << r44))) | (128 << r44);
        r6[r45] = r6[r46];
        r6[r46] = null;
        r47[r45] = r47[r46];
        r47[r46] = 0.0f;
        r6 = r46;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0241, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020c, code lost:
    
        r4[r8] = (r11 & (~(255 << r50))) | ((r42 & 127) << r50);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x021f, code lost:
    
        if (r6 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0221, code lost:
    
        r6 = o.UP.b(r4, r46 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0227, code lost:
    
        r6[r6] = r6[r45];
        r6[r45] = r6[r46];
        r6[r46] = r6[r6];
        r47[r6] = r47[r45];
        r47[r45] = r47[r46];
        r47[r46] = r47[r6];
        r12 = r46 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0177, code lost:
    
        r42 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016b, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
    
        r55 = r12;
        r12 = r12 + 1;
        r6 = r55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0250, code lost:
    
        r43 = r8;
        r2.f = o.UP.c(r2.d) - r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e5, code lost:
    
        r4 = r2.b(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02e9, code lost:
    
        r2.e++;
        r5 = r2.f;
        r6 = r2.a;
        r8 = r4 >> 3;
        r11 = r6[r8];
        r15 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0301, code lost:
    
        if (((r11 >> r15) & 255) != 128) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0304, code lost:
    
        r33 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0306, code lost:
    
        r2.f = r5 - r33;
        r5 = r2.d;
        r5 = ((~(255 << r15)) & r11) | (r11 << r15);
        r6[r8] = r5;
        r6[(((r4 - 7) & r5) + (r5 & 7)) >> 3] = r5;
        r4 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025f, code lost:
    
        r43 = r8;
        r4 = o.UP.d(r2.d);
        r5 = r2.a;
        r6 = r2.b;
        r8 = r2.c;
        r11 = r2.d;
        r2.d(r4);
        r4 = r2.a;
        r12 = r2.b;
        r4 = r2.c;
        r4 = r2.d;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0282, code lost:
    
        if (r4 >= r11) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0292, code lost:
    
        if (((r5[r4 >> 3] >> ((r4 & 7) << 3)) & 255) >= 128) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0294, code lost:
    
        r36 = r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0296, code lost:
    
        if (r36 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0298, code lost:
    
        r37 = r36.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x029f, code lost:
    
        r37 = r37 * (-862048943);
        r37 = r37 ^ (r37 << 16);
        r38 = r4;
        r4 = r2.b(r37 >>> 7);
        r4 = r37 & 127;
        r37 = r5;
        r42 = r4 >> 3;
        r44 = (r4 & 7) << 3;
        r4 = (r4[r42] & (~(255 << r44))) | (r4 << r44);
        r4[r42] = r4;
        r4[(((r4 - 7) & r4) + (r4 & 7)) >> 3] = r4;
        r12[r4] = r36;
        r4[r4] = r8[r38];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(C0831cI c0831cI) {
        long j;
        long j2;
        long j3;
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC1415lB Q;
        C0765bH snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        Object[] objArr2;
        float[] fArr2;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        Object obj4;
        int i3;
        if (this.h || c0831cI.b.m() == null) {
            return;
        }
        FD fd = this.k;
        if (fd == null) {
            fd = new FD();
            this.k = fd;
        }
        FD fd2 = this.j;
        if (fd2 == null) {
            fd2 = new FD();
            this.j = fd2;
        }
        Object[] objArr3 = fd2.b;
        float[] fArr3 = fd2.c;
        long[] jArr3 = fd2.a;
        int length = jArr3.length - 2;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 255;
            j2 = 128;
            while (true) {
                long j5 = jArr3[i5];
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = (i5 << 3) + i7;
                            Object obj5 = objArr3[i8];
                            float f = fArr3[i8];
                            int hashCode = (obj5 != null ? obj5.hashCode() : 0) * (-862048943);
                            int i9 = hashCode ^ (hashCode << 16);
                            int i10 = i9 >>> 7;
                            objArr2 = objArr3;
                            int i11 = i9 & 127;
                            fArr2 = fArr3;
                            int i12 = fd.d;
                            int i13 = i10 & i12;
                            int i14 = 0;
                            while (true) {
                                long[] jArr4 = fd.a;
                                int i15 = i13 >> 3;
                                int i16 = (i13 & 7) << 3;
                                long j6 = jArr4[i15] >>> i16;
                                int i17 = 1;
                                long j7 = jArr4[i15 + 1] << (64 - i16);
                                jArr2 = jArr3;
                                long j8 = j6 | (j7 & ((-i16) >> 63));
                                j4 = j5;
                                long j9 = i11;
                                long j10 = j8 ^ (j9 * 72340172838076673L);
                                long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
                                while (true) {
                                    if (j11 == 0) {
                                        break;
                                    }
                                    int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j11) >> 3)) & i12;
                                    int i18 = i11;
                                    if (AbstractC0048Bt.h(fd.b[numberOfTrailingZeros], obj5)) {
                                        obj4 = obj5;
                                        i3 = numberOfTrailingZeros;
                                        break;
                                    } else {
                                        j11 &= j11 - 1;
                                        i11 = i18;
                                    }
                                }
                                i14 += 8;
                                i13 = (i13 + i14) & i12;
                                jArr3 = jArr2;
                                j5 = j4;
                                i11 = i2;
                            }
                            if (i3 < 0) {
                                i3 = ~i3;
                            }
                            fd.b[i3] = obj4;
                            fd.c[i3] = f;
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            fArr2 = fArr3;
                            jArr2 = jArr3;
                            j4 = j5;
                            i = i4;
                        }
                        j5 = j4 >> i;
                        i7++;
                        i4 = i;
                        fArr3 = fArr2;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                    }
                    objArr = objArr3;
                    fArr = fArr3;
                    jArr = jArr3;
                    obj = null;
                    if (i6 != i4) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                    fArr = fArr3;
                    jArr = jArr3;
                    obj = null;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                fArr3 = fArr;
                objArr3 = objArr;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            j = 255;
            j2 = 128;
            j3 = -9187201950435737472L;
            obj = null;
        }
        fd2.a();
        ZG zg = O().j;
        if (zg != null && (snapshotObserver = ((S2) zg).getSnapshotObserver()) != null) {
            snapshotObserver.a(c0831cI, C2316yt.u, new K2(c0831cI, 18, this));
        }
        Object[] objArr4 = fd2.b;
        long[] jArr5 = fd2.a;
        int length2 = jArr5.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j12 = jArr5[i19];
                if ((((~j12) << 7) & j12 & j3) != j3) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j12 & j) >= j2) {
                            obj3 = obj;
                        } else {
                            if (objArr4[(i19 << 3) + i21] != null) {
                                throw new ClassCastException();
                            }
                            obj3 = obj;
                            if (fd.c(obj3) < 0 && (Q = Q()) != null) {
                                do {
                                    FD fd3 = Q.j;
                                    if (fd3 != null && fd3.c(obj3) >= 0) {
                                        break;
                                    } else {
                                        Q = Q.Q();
                                    }
                                } while (Q != null);
                            }
                        }
                        j12 >>= 8;
                        i21++;
                        obj = obj3;
                    }
                    obj2 = obj;
                    if (i20 != 8) {
                        break;
                    }
                } else {
                    obj2 = obj;
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                obj = obj2;
            }
        }
        fd.a();
    }

    public final int J(AbstractC2248xr abstractC2248xr) {
        int H;
        if (M() && (H = H(abstractC2248xr)) != Integer.MIN_VALUE) {
            return H + ((int) (this.f & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract AbstractC1415lB K();

    public abstract InterfaceC1991ty L();

    public abstract boolean M();

    public abstract EnumC2057uy N();

    public abstract C0027Ay O();

    public abstract M5 P();

    public abstract AbstractC1415lB Q();

    public abstract long R();

    public M5 T(int i, int i2, InterfaceC2114vp interfaceC2114vp) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new M5(i, i2, interfaceC2114vp, this);
        }
        AbstractC0868ct.W("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    public abstract void U();

    @Override // o.InterfaceC1351kD
    public final void A() {
    }
}
