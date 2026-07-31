package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes4.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {
    public static final int p = z.a("qt  ");
    public int e;
    public int f;
    public long g;
    public int h;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n i;
    public int j;
    public int k;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j l;
    public o[] m;
    public long n;
    public boolean o;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);
    public final Stack d = new Stack();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.a);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.n;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:34:0x00ab, B:36:0x00af, B:38:0x00be, B:40:0x00d4, B:42:0x00d9, B:44:0x00e0, B:51:0x00e8, B:53:0x00cc, B:54:0x00f1, B:56:0x00f6, B:58:0x00fd, B:60:0x0101, B:61:0x0108, B:63:0x010c, B:64:0x0116, B:66:0x011a, B:67:0x0121, B:69:0x0125, B:70:0x012b, B:72:0x012f, B:73:0x0136, B:75:0x013a, B:76:0x0141, B:78:0x0145, B:79:0x014c, B:81:0x0150, B:82:0x0157, B:84:0x015b, B:85:0x0162, B:87:0x0166, B:88:0x016d, B:90:0x0171, B:91:0x0179, B:93:0x017d, B:94:0x0185, B:96:0x0189, B:97:0x0190, B:99:0x0194, B:100:0x019c, B:102:0x01a0, B:103:0x0213, B:112:0x01a6, B:114:0x01ae, B:116:0x01b5, B:118:0x01b9, B:121:0x01bf, B:123:0x01c3, B:126:0x01c8, B:128:0x01cc, B:129:0x01d3, B:131:0x01d7, B:132:0x01de, B:134:0x01e2, B:135:0x01e9, B:137:0x01ed, B:138:0x01f4, B:140:0x01f8, B:141:0x01ff, B:143:0x0203, B:144:0x0208, B:146:0x020c, B:147:0x022b, B:148:0x0232), top: B:33:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:34:0x00ab, B:36:0x00af, B:38:0x00be, B:40:0x00d4, B:42:0x00d9, B:44:0x00e0, B:51:0x00e8, B:53:0x00cc, B:54:0x00f1, B:56:0x00f6, B:58:0x00fd, B:60:0x0101, B:61:0x0108, B:63:0x010c, B:64:0x0116, B:66:0x011a, B:67:0x0121, B:69:0x0125, B:70:0x012b, B:72:0x012f, B:73:0x0136, B:75:0x013a, B:76:0x0141, B:78:0x0145, B:79:0x014c, B:81:0x0150, B:82:0x0157, B:84:0x015b, B:85:0x0162, B:87:0x0166, B:88:0x016d, B:90:0x0171, B:91:0x0179, B:93:0x017d, B:94:0x0185, B:96:0x0189, B:97:0x0190, B:99:0x0194, B:100:0x019c, B:102:0x01a0, B:103:0x0213, B:112:0x01a6, B:114:0x01ae, B:116:0x01b5, B:118:0x01b9, B:121:0x01bf, B:123:0x01c3, B:126:0x01c8, B:128:0x01cc, B:129:0x01d3, B:131:0x01d7, B:132:0x01de, B:134:0x01e2, B:135:0x01e9, B:137:0x01ed, B:138:0x01f4, B:140:0x01f8, B:141:0x01ff, B:143:0x0203, B:144:0x0208, B:146:0x020c, B:147:0x022b, B:148:0x0232), top: B:33:0x00ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j) {
        p pVar;
        boolean z;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar;
        s a;
        e hVar;
        a aVar;
        boolean z2;
        long j2;
        ArrayList arrayList;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar;
        int i;
        int i2;
        int i3;
        long j3;
        boolean z3;
        int i4;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        s sVar;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar2;
        int i5;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i6;
        long j4;
        long[] jArr3;
        long[] jArr4;
        v vVar;
        long[] jArr5;
        boolean z4;
        int i7;
        int[] iArr3;
        int[] iArr4;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar2;
        int i8;
        int i9;
        s sVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3;
        ArrayList arrayList2;
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o b;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o b2;
        int i11;
        String str;
        p pVar2 = this;
        int i12 = 8;
        boolean z5 = true;
        while (!pVar2.d.isEmpty() && ((a) pVar2.d.peek()).P0 == j) {
            a aVar2 = (a) pVar2.d.pop();
            if (aVar2.a == c.C) {
                ArrayList arrayList3 = new ArrayList();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m();
                b c = aVar2.c(c.A0);
                int i13 = 12;
                if (c != null) {
                    boolean z6 = pVar2.o;
                    int i14 = i.a;
                    if (!z6) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = c.P0;
                        nVar2.e(i12);
                        while (true) {
                            int i15 = nVar2.c;
                            int i16 = nVar2.b;
                            if (i15 - i16 < i12) {
                                break;
                            }
                            int b3 = nVar2.b();
                            if (nVar2.b() == c.B0) {
                                nVar2.e(i16);
                                int i17 = i16 + b3;
                                nVar2.e(nVar2.b + i13);
                                while (true) {
                                    int i18 = nVar2.b;
                                    if (i18 >= i17) {
                                        break;
                                    }
                                    int b4 = nVar2.b();
                                    if (nVar2.b() == c.C0) {
                                        nVar2.e(i18);
                                        int i19 = i18 + b4;
                                        nVar2.e(nVar2.b + i12);
                                        ArrayList arrayList4 = new ArrayList();
                                        while (true) {
                                            int i20 = nVar2.b;
                                            if (i20 >= i19) {
                                                break;
                                            }
                                            int i21 = n.a;
                                            int b5 = nVar2.b() + i20;
                                            int b6 = nVar2.b();
                                            int i22 = (b6 >> 24) & 255;
                                            if (i22 == 169 || i22 == 65533) {
                                                int i23 = 16777215 & b6;
                                                if (i23 == n.c) {
                                                    b = n.a(b6, nVar2);
                                                } else {
                                                    if (i23 != n.a && i23 != n.b) {
                                                        if (i23 != n.h && i23 != n.i) {
                                                            if (i23 == n.d) {
                                                                b = n.b(b6, nVar2, "TDRC");
                                                            } else if (i23 == n.e) {
                                                                b = n.b(b6, nVar2, "TPE1");
                                                            } else if (i23 == n.f) {
                                                                b = n.b(b6, nVar2, "TSSE");
                                                            } else if (i23 == n.g) {
                                                                b = n.b(b6, nVar2, "TALB");
                                                            } else if (i23 == n.j) {
                                                                b = n.b(b6, nVar2, "USLT");
                                                            } else if (i23 == n.k) {
                                                                b = n.b(b6, nVar2, "TCON");
                                                            } else {
                                                                if (i23 == n.n) {
                                                                    b = n.b(b6, nVar2, "TIT1");
                                                                }
                                                                Log.d("MetadataUtil", "Skipped unknown metadata entry: " + c.a(b6));
                                                                nVar2.e(b5);
                                                                oVar2 = null;
                                                            }
                                                        }
                                                        b = n.b(b6, nVar2, "TCOM");
                                                    }
                                                    b = n.b(b6, nVar2, "TIT2");
                                                }
                                                oVar = b;
                                                nVar2.e(b5);
                                                oVar2 = oVar;
                                            } else {
                                                try {
                                                    if (b6 == n.m) {
                                                        nVar2.e(nVar2.b + 4);
                                                        if (nVar2.b() == c.F0) {
                                                            nVar2.e(nVar2.b + i12);
                                                            i11 = nVar2.j();
                                                        } else {
                                                            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
                                                            i11 = -1;
                                                        }
                                                        if (i11 > 0) {
                                                            String[] strArr = n.D;
                                                            if (i11 <= strArr.length) {
                                                                str = strArr[i11 - (z5 ? 1 : 0)];
                                                                if (str == null) {
                                                                    oVar = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s("TCON", null, str);
                                                                } else {
                                                                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                    oVar = null;
                                                                }
                                                            }
                                                        }
                                                        str = null;
                                                        if (str == null) {
                                                        }
                                                    } else {
                                                        if (b6 == n.o) {
                                                            b2 = n.a(b6, nVar2, "TPOS");
                                                        } else if (b6 == n.p) {
                                                            b2 = n.a(b6, nVar2, "TRCK");
                                                        } else if (b6 == n.q) {
                                                            b2 = n.a(b6, "TBPM", nVar2, z5, false);
                                                        } else if (b6 == n.r) {
                                                            b2 = n.a(b6, "TCMP", nVar2, z5, z5);
                                                        } else if (b6 == n.l) {
                                                            oVar = n.a(nVar2);
                                                        } else if (b6 == n.s) {
                                                            b2 = n.b(b6, nVar2, "TPE2");
                                                        } else if (b6 == n.t) {
                                                            b2 = n.b(b6, nVar2, "TSOT");
                                                        } else if (b6 == n.u) {
                                                            b2 = n.b(b6, nVar2, "TSO2");
                                                        } else if (b6 == n.v) {
                                                            b2 = n.b(b6, nVar2, "TSOA");
                                                        } else if (b6 == n.w) {
                                                            b2 = n.b(b6, nVar2, "TSOP");
                                                        } else if (b6 == n.x) {
                                                            b2 = n.b(b6, nVar2, "TSOC");
                                                        } else if (b6 == n.y) {
                                                            b2 = n.a(b6, "ITUNESADVISORY", nVar2, false, false);
                                                        } else if (b6 == n.z) {
                                                            b2 = n.a(b6, "ITUNESGAPLESS", nVar2, false, z5);
                                                        } else if (b6 == n.A) {
                                                            b2 = n.b(b6, nVar2, "TVSHOWSORT");
                                                        } else if (b6 == n.B) {
                                                            b2 = n.b(b6, nVar2, "TVSHOW");
                                                        } else {
                                                            if (b6 == n.C) {
                                                                b2 = n.b(b5, nVar2);
                                                            }
                                                            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + c.a(b6));
                                                            nVar2.e(b5);
                                                            oVar2 = null;
                                                        }
                                                        oVar = b2;
                                                    }
                                                    nVar2.e(b5);
                                                    oVar2 = oVar;
                                                } catch (Throwable th) {
                                                    nVar2.e(b5);
                                                    throw th;
                                                }
                                            }
                                            if (oVar2 != null) {
                                                arrayList4.add(oVar2);
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            bVar = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList4);
                                        }
                                    } else {
                                        nVar2.e(nVar2.b + (b4 - i12));
                                    }
                                }
                            } else {
                                nVar2.e(nVar2.b + (b3 - i12));
                                i13 = 12;
                            }
                        }
                    }
                    bVar = null;
                    if (bVar != null) {
                        mVar4.a(bVar);
                    }
                } else {
                    bVar = null;
                }
                long j5 = -9223372036854775807L;
                long j6 = Long.MAX_VALUE;
                int i24 = 0;
                while (i24 < aVar2.R0.size()) {
                    a aVar3 = (a) aVar2.R0.get(i24);
                    if (aVar3.a == c.E && (a = i.a(aVar3, aVar2.c(c.D), -9223372036854775807L, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null, pVar2.o)) != null) {
                        a b7 = aVar3.b(c.F).b(c.G).b(c.H);
                        b c2 = b7.c(c.q0);
                        if (c2 != null) {
                            hVar = new g(c2);
                        } else {
                            b c3 = b7.c(c.r0);
                            if (c3 == null) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Track has no sample table size information");
                            }
                            hVar = new h(c3);
                        }
                        int a2 = hVar.a();
                        if (a2 == 0) {
                            aVar = aVar2;
                            vVar = new v(new long[0], new int[0], 0, new long[0], new int[0]);
                            i4 = i24;
                            j3 = j5;
                            arrayList = arrayList3;
                            mVar = mVar4;
                            j2 = j6;
                            sVar = a;
                            bVar2 = bVar;
                        } else {
                            aVar = aVar2;
                            b c4 = b7.c(c.s0);
                            if (c4 == null) {
                                c4 = b7.c(c.t0);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = c4.P0;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = b7.c(c.p0).P0;
                            j2 = j6;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = b7.c(c.m0).P0;
                            b c5 = b7.c(c.n0);
                            if (c5 != null) {
                                nVar = c5.P0;
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList3;
                                nVar = null;
                            }
                            b c6 = b7.c(c.o0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = c6 != null ? c6.P0 : null;
                            d dVar = new d(nVar4, nVar3, z2);
                            nVar5.e(12);
                            int m = nVar5.m() - 1;
                            int m2 = nVar5.m();
                            int m3 = nVar5.m();
                            if (nVar6 != null) {
                                nVar6.e(12);
                                i = nVar6.m();
                            } else {
                                i = 0;
                            }
                            if (nVar != null) {
                                nVar.e(12);
                                i2 = nVar.m();
                                if (i2 > 0) {
                                    i3 = nVar.m() - 1;
                                    if (hVar.c()) {
                                        j3 = j5;
                                    } else {
                                        j3 = j5;
                                        if ("audio/raw".equals(a.f.f) && m == 0 && i == 0 && i2 == 0) {
                                            z3 = true;
                                            if (z3) {
                                                i4 = i24;
                                                mVar = mVar4;
                                                sVar = a;
                                                bVar2 = bVar;
                                                i5 = a2;
                                                e eVar = hVar;
                                                int i25 = dVar.a;
                                                long[] jArr6 = new long[i25];
                                                int[] iArr5 = new int[i25];
                                                while (dVar.a()) {
                                                    int i26 = dVar.b;
                                                    jArr6[i26] = dVar.d;
                                                    iArr5[i26] = dVar.c;
                                                }
                                                int b8 = eVar.b();
                                                long j7 = m3;
                                                int i27 = 8192 / b8;
                                                int i28 = 0;
                                                for (int i29 = 0; i29 < i25; i29++) {
                                                    int i30 = iArr5[i29];
                                                    int i31 = z.a;
                                                    i28 += ((i30 + i27) - 1) / i27;
                                                }
                                                long[] jArr7 = new long[i28];
                                                int[] iArr6 = new int[i28];
                                                long[] jArr8 = new long[i28];
                                                iArr = new int[i28];
                                                int i32 = 0;
                                                int i33 = 0;
                                                int i34 = 0;
                                                int i35 = 0;
                                                while (i32 < i25) {
                                                    int i36 = iArr5[i32];
                                                    long j8 = jArr6[i32];
                                                    int i37 = i25;
                                                    int i38 = i36;
                                                    while (i38 > 0) {
                                                        int min = Math.min(i27, i38);
                                                        jArr7[i34] = j8;
                                                        long[] jArr9 = jArr6;
                                                        int i39 = b8 * min;
                                                        iArr6[i34] = i39;
                                                        i35 = Math.max(i35, i39);
                                                        jArr8[i34] = i33 * j7;
                                                        iArr[i34] = 1;
                                                        j8 += iArr6[i34];
                                                        i33 += min;
                                                        i38 -= min;
                                                        i34++;
                                                        iArr5 = iArr5;
                                                        jArr6 = jArr9;
                                                        i27 = i27;
                                                    }
                                                    i32++;
                                                    iArr5 = iArr5;
                                                    i25 = i37;
                                                    jArr6 = jArr6;
                                                }
                                                jArr = jArr7;
                                                iArr2 = iArr6;
                                                jArr2 = jArr8;
                                                i6 = i35;
                                                j4 = 0;
                                            } else {
                                                jArr = new long[a2];
                                                iArr2 = new int[a2];
                                                jArr2 = new long[a2];
                                                int[] iArr7 = new int[a2];
                                                i4 = i24;
                                                int i40 = m3;
                                                mVar = mVar4;
                                                int i41 = i2;
                                                int i42 = i3;
                                                int i43 = m;
                                                int i44 = 0;
                                                int i45 = 0;
                                                int i46 = 0;
                                                int i47 = 0;
                                                long j9 = 0;
                                                j4 = 0;
                                                int i48 = i;
                                                int i49 = 0;
                                                bVar2 = bVar;
                                                int i50 = m2;
                                                while (i44 < a2) {
                                                    while (i47 == 0) {
                                                        if (!dVar.a()) {
                                                            throw new IllegalStateException();
                                                        }
                                                        j9 = dVar.d;
                                                        i47 = dVar.c;
                                                        a2 = a2;
                                                        i50 = i50;
                                                    }
                                                    int i51 = i50;
                                                    int i52 = a2;
                                                    if (nVar6 != null) {
                                                        while (i49 == 0 && i48 > 0) {
                                                            i49 = nVar6.m();
                                                            i46 = nVar6.b();
                                                            i48--;
                                                        }
                                                        i49--;
                                                    }
                                                    int i53 = i46;
                                                    jArr[i44] = j9;
                                                    int b9 = hVar.b();
                                                    iArr2[i44] = b9;
                                                    if (b9 > i45) {
                                                        i45 = b9;
                                                    }
                                                    e eVar2 = hVar;
                                                    jArr2[i44] = j4 + i53;
                                                    iArr7[i44] = nVar == null ? 1 : 0;
                                                    if (i44 == i42) {
                                                        iArr7[i44] = 1;
                                                        i9 = -1;
                                                        i41--;
                                                        if (i41 > 0) {
                                                            i42 = nVar.m() - 1;
                                                        }
                                                    } else {
                                                        i9 = -1;
                                                    }
                                                    int i54 = i41;
                                                    int i55 = i42;
                                                    j4 += i40;
                                                    int i56 = i51 - 1;
                                                    if (i56 == 0 && i43 > 0) {
                                                        i43 += i9;
                                                        i56 = nVar5.m();
                                                        i40 = nVar5.m();
                                                    }
                                                    j9 += iArr2[i44];
                                                    i47--;
                                                    i44++;
                                                    i42 = i55;
                                                    hVar = eVar2;
                                                    i40 = i40;
                                                    iArr7 = iArr7;
                                                    i46 = i53;
                                                    i50 = i56;
                                                    i41 = i54;
                                                    a2 = i52;
                                                }
                                                int[] iArr8 = iArr7;
                                                int i57 = i50;
                                                i5 = a2;
                                                if (i49 != 0) {
                                                    throw new IllegalArgumentException();
                                                }
                                                while (i48 > 0) {
                                                    if (nVar6.m() != 0) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    nVar6.b();
                                                    i48--;
                                                }
                                                if (i41 == 0 && i57 == 0 && i47 == 0 && i43 == 0) {
                                                    sVar = a;
                                                } else {
                                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                                    sVar = a;
                                                    sb.append(sVar.a);
                                                    sb.append(": remainingSynchronizationSamples ");
                                                    sb.append(i41);
                                                    sb.append(", remainingSamplesAtTimestampDelta ");
                                                    sb.append(i57);
                                                    sb.append(", remainingSamplesInChunk ");
                                                    sb.append(i47);
                                                    sb.append(", remainingTimestampDeltaChanges ");
                                                    sb.append(i43);
                                                    Log.w("AtomParsers", sb.toString());
                                                }
                                                i6 = i45;
                                                iArr = iArr8;
                                            }
                                            jArr3 = sVar.i;
                                            if (jArr3 != null) {
                                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar5 = mVar;
                                                if (mVar5.a == -1 || mVar5.b == -1) {
                                                    if (jArr3.length == 1 && sVar.b == 1 && jArr2.length >= 2) {
                                                        long j10 = sVar.j[0];
                                                        long a3 = z.a(jArr3[0], sVar.c, sVar.d) + j10;
                                                        long j11 = jArr2[0];
                                                        if (j11 <= j10 && j10 < jArr2[1] && jArr2[jArr2.length - 1] < a3 && a3 <= j4) {
                                                            long a4 = z.a(j10 - j11, sVar.f.s, sVar.c);
                                                            long a5 = z.a(j4 - a3, sVar.f.s, sVar.c);
                                                            if ((a4 != 0 || a5 != 0) && a4 <= 2147483647L && a5 <= 2147483647L) {
                                                                mVar5.a = (int) a4;
                                                                mVar5.b = (int) a5;
                                                                z.a(jArr2, sVar.c);
                                                                vVar = new v(jArr, iArr2, i6, jArr2, iArr);
                                                                mVar = mVar5;
                                                            }
                                                        }
                                                    }
                                                    long[] jArr10 = sVar.i;
                                                    if (jArr10.length == 1) {
                                                        char c7 = 0;
                                                        if (jArr10[0] == 0) {
                                                            int i58 = 0;
                                                            while (i58 < jArr2.length) {
                                                                jArr2[i58] = z.a(jArr2[i58] - sVar.j[c7], 1000000L, sVar.c);
                                                                i58++;
                                                                c7 = 0;
                                                            }
                                                            vVar = new v(jArr, iArr2, i6, jArr2, iArr);
                                                            mVar = mVar5;
                                                        }
                                                    }
                                                    boolean z7 = sVar.b == 1;
                                                    int i59 = 0;
                                                    int i60 = 0;
                                                    int i61 = 0;
                                                    boolean z8 = false;
                                                    while (true) {
                                                        long[] jArr11 = sVar.i;
                                                        if (i59 >= jArr11.length) {
                                                            break;
                                                        }
                                                        long j12 = sVar.j[i59];
                                                        if (j12 != -1) {
                                                            mVar2 = mVar5;
                                                            i8 = i59;
                                                            long a6 = z.a(jArr11[i59], sVar.c, sVar.d);
                                                            int a7 = z.a(jArr2, j12, true, true);
                                                            int a8 = z.a(jArr2, j12 + a6, z7, false);
                                                            int i62 = (a8 - a7) + i60;
                                                            boolean z9 = i61 != a7;
                                                            i61 = a8;
                                                            z8 = z9 | z8;
                                                            i60 = i62;
                                                        } else {
                                                            mVar2 = mVar5;
                                                            i8 = i59;
                                                        }
                                                        i59 = i8 + 1;
                                                        mVar5 = mVar2;
                                                    }
                                                    mVar = mVar5;
                                                    boolean z10 = (i60 != i5) | z8;
                                                    long[] jArr12 = z10 ? new long[i60] : jArr;
                                                    int[] iArr9 = z10 ? new int[i60] : iArr2;
                                                    if (z10) {
                                                        i6 = 0;
                                                    }
                                                    int[] iArr10 = z10 ? new int[i60] : iArr;
                                                    long[] jArr13 = new long[i60];
                                                    int i63 = i6;
                                                    int i64 = 0;
                                                    int i65 = 0;
                                                    long j13 = 0;
                                                    while (true) {
                                                        long[] jArr14 = sVar.i;
                                                        if (i64 >= jArr14.length) {
                                                            break;
                                                        }
                                                        int i66 = i63;
                                                        long[] jArr15 = jArr13;
                                                        long j14 = sVar.j[i64];
                                                        long j15 = jArr14[i64];
                                                        if (j14 != -1) {
                                                            iArr4 = iArr;
                                                            i7 = i64;
                                                            int[] iArr11 = iArr2;
                                                            long a9 = z.a(j15, sVar.c, sVar.d) + j14;
                                                            int a10 = z.a(jArr2, j14, true, true);
                                                            int a11 = z.a(jArr2, a9, z7, false);
                                                            if (z10) {
                                                                int i67 = a11 - a10;
                                                                System.arraycopy(jArr, a10, jArr12, i65, i67);
                                                                iArr3 = iArr11;
                                                                System.arraycopy(iArr3, a10, iArr9, i65, i67);
                                                                System.arraycopy(iArr4, a10, iArr10, i65, i67);
                                                            } else {
                                                                iArr3 = iArr11;
                                                            }
                                                            int i68 = i66;
                                                            while (true) {
                                                                jArr5 = jArr;
                                                                z4 = z7;
                                                                if (a10 >= a11) {
                                                                    break;
                                                                }
                                                                long j16 = j14;
                                                                jArr15[i65] = z.a(j13, 1000000L, sVar.d) + z.a(jArr2[a10] - j14, 1000000L, sVar.c);
                                                                if (z10 && iArr9[i65] > i68) {
                                                                    i68 = iArr3[a10];
                                                                }
                                                                i65++;
                                                                a10++;
                                                                j14 = j16;
                                                                jArr = jArr5;
                                                                z7 = z4;
                                                            }
                                                            i63 = i68;
                                                        } else {
                                                            jArr5 = jArr;
                                                            z4 = z7;
                                                            i7 = i64;
                                                            iArr3 = iArr2;
                                                            iArr4 = iArr;
                                                            i63 = i66;
                                                        }
                                                        j13 += j15;
                                                        i64 = i7 + 1;
                                                        iArr2 = iArr3;
                                                        iArr = iArr4;
                                                        jArr13 = jArr15;
                                                        jArr = jArr5;
                                                        z7 = z4;
                                                    }
                                                    int i69 = i63;
                                                    long[] jArr16 = jArr13;
                                                    boolean z11 = false;
                                                    for (int i70 = 0; i70 < iArr10.length && !z11; i70++) {
                                                        z11 |= (iArr10[i70] & 1) != 0;
                                                    }
                                                    if (!z11) {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                    vVar = new v(jArr12, iArr9, i69, jArr16, iArr10);
                                                } else {
                                                    jArr4 = jArr;
                                                    mVar = mVar5;
                                                }
                                            } else {
                                                jArr4 = jArr;
                                            }
                                            int[] iArr12 = iArr2;
                                            int[] iArr13 = iArr;
                                            z.a(jArr2, sVar.c);
                                            vVar = new v(jArr4, iArr12, i6, jArr2, iArr13);
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                    }
                                    jArr3 = sVar.i;
                                    if (jArr3 != null) {
                                    }
                                    int[] iArr122 = iArr2;
                                    int[] iArr132 = iArr;
                                    z.a(jArr2, sVar.c);
                                    vVar = new v(jArr4, iArr122, i6, jArr2, iArr132);
                                } else {
                                    nVar = null;
                                }
                            } else {
                                i2 = 0;
                            }
                            i3 = -1;
                            if (hVar.c()) {
                            }
                            z3 = false;
                            if (z3) {
                            }
                            jArr3 = sVar.i;
                            if (jArr3 != null) {
                            }
                            int[] iArr1222 = iArr2;
                            int[] iArr1322 = iArr;
                            z.a(jArr2, sVar.c);
                            vVar = new v(jArr4, iArr1222, i6, jArr2, iArr1322);
                        }
                        if (vVar.a != 0) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a12 = this.l.a(i4, sVar.b);
                            o oVar3 = new o(sVar, vVar, a12);
                            int i71 = vVar.d + 30;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar4 = sVar.f;
                            String str2 = oVar4.a;
                            String str3 = oVar4.e;
                            String str4 = oVar4.f;
                            String str5 = oVar4.c;
                            int i72 = oVar4.b;
                            int i73 = oVar4.j;
                            int i74 = oVar4.k;
                            float f = oVar4.l;
                            int i75 = oVar4.m;
                            v vVar2 = vVar;
                            float f2 = oVar4.n;
                            byte[] bArr = oVar4.p;
                            int i76 = oVar4.o;
                            com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = oVar4.q;
                            int i77 = oVar4.r;
                            int i78 = oVar4.s;
                            int i79 = oVar4.t;
                            int i80 = oVar4.u;
                            int i81 = oVar4.v;
                            int i82 = oVar4.x;
                            String str6 = oVar4.y;
                            int i83 = oVar4.z;
                            long j17 = oVar4.w;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar5 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i72, i71, i73, i74, f, i75, f2, bArr, i76, cVar, i77, i78, i79, i80, i81, i82, str6, i83, j17, oVar4.h, oVar4.i, oVar4.d);
                            if (sVar.b == 1) {
                                mVar3 = mVar;
                                int i84 = mVar3.a;
                                sVar2 = sVar;
                                if (i84 != -1 && (i10 = mVar3.b) != -1) {
                                    oVar5 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i72, i71, i73, i74, f, i75, f2, bArr, i76, cVar, i77, i78, i79, i84, i10, i82, str6, i83, j17, oVar5.h, oVar5.i, oVar5.d);
                                }
                                if (bVar2 != null) {
                                    oVar5 = new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar5.a, oVar5.e, oVar5.f, oVar5.c, oVar5.b, oVar5.g, oVar5.j, oVar5.k, oVar5.l, oVar5.m, oVar5.n, oVar5.p, oVar5.o, oVar5.q, oVar5.r, oVar5.s, oVar5.t, oVar5.u, oVar5.v, oVar5.x, oVar5.y, oVar5.z, oVar5.w, oVar5.h, oVar5.i, bVar2);
                                }
                            } else {
                                sVar2 = sVar;
                                mVar3 = mVar;
                            }
                            a12.a(oVar5);
                            long max = Math.max(j3, sVar2.e);
                            arrayList2 = arrayList;
                            arrayList2.add(oVar3);
                            long j18 = vVar2.b[0];
                            if (j18 < j2) {
                                j6 = j18;
                                j5 = max;
                            } else {
                                j5 = max;
                                j6 = j2;
                            }
                            i24 = i4 + 1;
                            mVar4 = mVar3;
                            arrayList3 = arrayList2;
                            bVar = bVar2;
                            aVar2 = aVar;
                            z5 = true;
                            pVar2 = this;
                        }
                    } else {
                        i4 = i24;
                        aVar = aVar2;
                        j3 = j5;
                        arrayList = arrayList3;
                        mVar = mVar4;
                        j2 = j6;
                        bVar2 = bVar;
                    }
                    j6 = j2;
                    arrayList2 = arrayList;
                    j5 = j3;
                    mVar3 = mVar;
                    i24 = i4 + 1;
                    mVar4 = mVar3;
                    arrayList3 = arrayList2;
                    bVar = bVar2;
                    aVar2 = aVar;
                    z5 = true;
                    pVar2 = this;
                }
                pVar = pVar2;
                z = z5;
                ArrayList arrayList5 = arrayList3;
                pVar.n = j5;
                pVar.m = (o[]) arrayList5.toArray(new o[arrayList5.size()]);
                pVar.l.b();
                pVar.l.a(pVar);
                pVar.d.clear();
                pVar.e = 2;
            } else {
                pVar = pVar2;
                z = z5 ? 1 : 0;
                if (!pVar.d.isEmpty()) {
                    ((a) pVar.d.peek()).R0.add(aVar2);
                }
            }
            z5 = z;
            pVar2 = pVar;
            i12 = 8;
        }
        p pVar3 = pVar2;
        if (pVar3.e != 2) {
            pVar3.e = 0;
            pVar3.h = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.l = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        int i;
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j == 0) {
            this.e = 0;
            this.h = 0;
            return;
        }
        o[] oVarArr = this.m;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.b;
                int a = z.a(vVar.e, j2, false);
                while (true) {
                    i = -1;
                    if (a < 0) {
                        a = -1;
                        break;
                    } else if ((vVar.f[a] & 1) != 0) {
                        break;
                    } else {
                        a--;
                    }
                }
                if (a == -1) {
                    a = z.a(vVar.e, j2, true, false);
                    while (a < vVar.e.length) {
                        if ((vVar.f[a] & 1) == 0) {
                            a++;
                        }
                    }
                    oVar.d = i;
                }
                i = a;
                oVar.d = i;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        o[] oVarArr;
        int i;
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this.e;
            if (i2 == 0) {
                if (this.h == 0) {
                    if (!bVar.b(this.c.a, 0, 8, true)) {
                        return -1;
                    }
                    this.h = 8;
                    this.c.e(0);
                    this.g = this.c.k();
                    this.f = this.c.b();
                }
                if (this.g == 1) {
                    bVar.b(this.c.a, 8, 8, false);
                    this.h += 8;
                    this.g = this.c.n();
                }
                int i3 = this.f;
                if (i3 != c.C && i3 != c.E && i3 != c.F && i3 != c.G && i3 != c.H && i3 != c.Q) {
                    if (i3 != c.S && i3 != c.D && i3 != c.T && i3 != c.U && i3 != c.m0 && i3 != c.n0 && i3 != c.o0 && i3 != c.R && i3 != c.p0 && i3 != c.q0 && i3 != c.r0 && i3 != c.s0 && i3 != c.t0 && i3 != c.P && i3 != c.b && i3 != c.A0) {
                        this.i = null;
                        this.e = 1;
                    } else if (this.h == 8) {
                        long j = this.g;
                        if (j <= 2147483647L) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j);
                            this.i = nVar;
                            System.arraycopy(this.c.a, 0, nVar.a, 0, 8);
                            this.e = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    long j2 = (bVar.c + this.g) - this.h;
                    this.d.add(new a(this.f, j2));
                    if (this.g == this.h) {
                        c(j2);
                    } else {
                        this.e = 0;
                        this.h = 0;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    long j3 = Long.MAX_VALUE;
                    int i4 = -1;
                    int i5 = 0;
                    while (true) {
                        oVarArr = this.m;
                        if (i5 >= oVarArr.length) {
                            break;
                        }
                        o oVar2 = oVarArr[i5];
                        int i6 = oVar2.d;
                        v vVar = oVar2.b;
                        if (i6 != vVar.a) {
                            long j4 = vVar.b[i6];
                            if (j4 < j3) {
                                i4 = i5;
                                j3 = j4;
                            }
                        }
                        i5++;
                    }
                    if (i4 == -1) {
                        return -1;
                    }
                    o oVar3 = oVarArr[i4];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.c;
                    int i7 = oVar3.d;
                    v vVar2 = oVar3.b;
                    long j5 = vVar2.b[i7];
                    int i8 = vVar2.c[i7];
                    if (oVar3.a.g == 1) {
                        j5 += 8;
                        i8 -= 8;
                    }
                    int i9 = i8;
                    long j6 = (j5 - bVar.c) + this.j;
                    if (j6 >= 0 && j6 < 262144) {
                        bVar.a((int) j6);
                        int i10 = oVar3.a.k;
                        if (i10 == 0) {
                            while (true) {
                                int i11 = this.j;
                                i = i9;
                                if (i11 >= i) {
                                    break;
                                }
                                int a = rVar.a(bVar, i - i11, false);
                                this.j += a;
                                this.k -= a;
                                i9 = i;
                            }
                        } else {
                            byte[] bArr = this.b.a;
                            boolean z3 = false;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i12 = 4 - i10;
                            i = i9;
                            while (this.j < i) {
                                int i13 = this.k;
                                if (i13 == 0) {
                                    bVar.b(this.b.a, i12, i10, z3);
                                    this.b.e(z3 ? 1 : 0);
                                    this.k = this.b.m();
                                    this.a.e(z3 ? 1 : 0);
                                    rVar.a(4, this.a);
                                    this.j += 4;
                                    i += i12;
                                } else {
                                    int a2 = rVar.a(bVar, i13, z3);
                                    this.j += a2;
                                    this.k -= a2;
                                    z3 = false;
                                }
                            }
                        }
                        int i14 = i;
                        v vVar3 = oVar3.b;
                        rVar.a(vVar3.e[i7], vVar3.f[i7], i14, 0, null);
                        oVar3.d++;
                        this.j = 0;
                        this.k = 0;
                        return 0;
                    }
                    oVar.a = j5;
                    return 1;
                }
                long j7 = this.g;
                int i15 = this.h;
                long j8 = j7 - i15;
                long j9 = bVar.c + j8;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.i;
                if (nVar2 != null) {
                    bVar.b(nVar2.a, i15, (int) j8, false);
                    if (this.f == c.b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.i;
                        nVar3.e(8);
                        if (nVar3.b() != p) {
                            nVar3.e(nVar3.b + 4);
                            while (nVar3.c - nVar3.b > 0) {
                                if (nVar3.b() == p) {
                                }
                            }
                            z2 = false;
                            this.o = z2;
                        }
                        z2 = true;
                        this.o = z2;
                    } else if (!this.d.isEmpty()) {
                        ((a) this.d.peek()).Q0.add(new b(this.f, this.i));
                    }
                } else if (j8 < 262144) {
                    bVar.a((int) j8);
                } else {
                    oVar.a = j9;
                    z = true;
                    c(j9);
                    if (z && this.e != 2) {
                        return 1;
                    }
                }
                z = false;
                c(j9);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j) {
        int i;
        long j2;
        long j3 = Long.MAX_VALUE;
        for (o oVar : this.m) {
            v vVar = oVar.b;
            int a = z.a(vVar.e, j, false);
            while (true) {
                i = -1;
                if (a < 0) {
                    a = -1;
                    break;
                }
                if ((vVar.f[a] & 1) != 0) {
                    break;
                }
                a--;
            }
            if (a == -1) {
                a = z.a(vVar.e, j, true, false);
                while (a < vVar.e.length) {
                    if ((vVar.f[a] & 1) == 0) {
                        a++;
                    }
                }
                j2 = vVar.b[i];
                if (j2 >= j3) {
                    j3 = j2;
                }
            }
            i = a;
            j2 = vVar.b[i];
            if (j2 >= j3) {
            }
        }
        return j3;
    }
}
