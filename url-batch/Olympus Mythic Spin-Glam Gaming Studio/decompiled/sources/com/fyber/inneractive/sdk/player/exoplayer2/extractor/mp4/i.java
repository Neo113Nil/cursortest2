package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class i {
    public static final int a = z.a("vide");
    public static final int b = z.a("soun");
    public static final int c = z.a("text");
    public static final int d = z.a("sbtl");
    public static final int e = z.a("subt");
    public static final int f = z.a("clcp");
    public static final int g = z.a("cenc");
    public static final int h = z.a(Constants.REFERRER_API_META);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r14 == 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x050e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s a(a aVar, b bVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, boolean z) {
        long j2;
        b bVar2;
        long j3;
        s sVar;
        Pair create;
        b c2;
        Pair pair;
        String str;
        int i;
        long j4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        List list;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        int i14;
        String str3;
        String str4;
        long j5;
        List list2;
        a b2 = aVar.b(c.F);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = b2.c(c.T).P0;
        nVar.e(16);
        int b3 = nVar.b();
        int i15 = b3 == b ? 1 : b3 == a ? 2 : (b3 == c || b3 == d || b3 == e || b3 == f) ? 3 : b3 == h ? 4 : -1;
        if (i15 == -1) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = aVar.c(c.P).P0;
        nVar2.e(8);
        int b4 = (nVar2.b() >> 24) & 255;
        nVar2.e(nVar2.b + (b4 == 0 ? 8 : 16));
        int b5 = nVar2.b();
        nVar2.e(nVar2.b + 4);
        int i16 = nVar2.b;
        int i17 = b4 == 0 ? 4 : 8;
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                nVar2.e(nVar2.b + i17);
                break;
            }
            if (nVar2.a[i16 + i18] != -1) {
                j2 = b4 == 0 ? nVar2.k() : nVar2.n();
            } else {
                i18++;
            }
        }
        j2 = -9223372036854775807L;
        nVar2.e(nVar2.b + 16);
        int b6 = nVar2.b();
        int b7 = nVar2.b();
        nVar2.e(nVar2.b + 4);
        int b8 = nVar2.b();
        int b9 = nVar2.b();
        int i19 = (b6 == 0 && b7 == 65536 && b8 == -65536 && b9 == 0) ? 90 : (b6 == 0 && b7 == -65536 && b8 == 65536 && b9 == 0) ? 270 : (b6 == -65536 && b7 == 0 && b8 == 0 && b9 == -65536) ? 180 : 0;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j3 = j2;
        } else {
            bVar2 = bVar;
            j3 = j;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = bVar2.P0;
        nVar3.e(8);
        int b10 = nVar3.b();
        int i20 = c.b;
        nVar3.e(nVar3.b + (((b10 >> 24) & 255) == 0 ? 8 : 16));
        long k = nVar3.k();
        long a2 = j3 != -9223372036854775807L ? z.a(j3, 1000000L, k) : -9223372036854775807L;
        a b11 = b2.b(c.G).b(c.H);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = b2.c(c.S).P0;
        nVar4.e(8);
        int b12 = (nVar4.b() >> 24) & 255;
        nVar4.e(nVar4.b + (b12 == 0 ? 8 : 16));
        long k2 = nVar4.k();
        nVar4.e(nVar4.b + (b12 == 0 ? 4 : 8));
        int o = nVar4.o();
        Pair create2 = Pair.create(Long.valueOf(k2), "" + ((char) (((o >> 10) & 31) + 96)) + ((char) (((o >> 5) & 31) + 96)) + ((char) ((o & 31) + 96)));
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = b11.c(c.U).P0;
        String str5 = (String) create2.second;
        nVar5.e(12);
        int b13 = nVar5.b();
        f fVar = new f(b13);
        int i21 = 0;
        while (i21 < b13) {
            int i22 = nVar5.b;
            int b14 = nVar5.b();
            String str6 = "childAtomSize should be positive";
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b14 > 0, "childAtomSize should be positive");
            int b15 = nVar5.b();
            int i23 = b13;
            if (b15 == c.c || b15 == c.d || b15 == c.a0 || b15 == c.l0 || b15 == c.e || b15 == c.f || b15 == c.g || b15 == c.K0) {
                pair = create2;
                str = "childAtomSize should be positive";
                i = i19;
                j4 = k;
                i2 = b14;
                i3 = i15;
                i4 = i21;
                i5 = -1;
                i6 = 16;
            } else if (b15 == c.L0) {
                pair = create2;
                str = "childAtomSize should be positive";
                i = i19;
                j4 = k;
                i2 = b14;
                i3 = i15;
                i4 = i21;
                i6 = 16;
                i5 = -1;
            } else {
                if (b15 == c.j || b15 == c.b0 || b15 == c.o || b15 == c.q || b15 == c.s || b15 == c.v || b15 == c.t || b15 == c.u || b15 == c.y0 || b15 == c.z0 || b15 == c.m || b15 == c.n || b15 == c.k || b15 == c.O0) {
                    j4 = k;
                    nVar5.e(i22 + 16);
                    if (z) {
                        i10 = nVar5.o();
                        nVar5.e(nVar5.b + 6);
                    } else {
                        nVar5.e(nVar5.b + 8);
                        i10 = 0;
                    }
                    if (i10 == 0 || i10 == 1) {
                        int o2 = nVar5.o();
                        nVar5.e(nVar5.b + 6);
                        byte[] bArr = nVar5.a;
                        int i24 = nVar5.b;
                        i3 = i15;
                        int i25 = i24 + 1;
                        nVar5.b = i25;
                        pair = create2;
                        int i26 = (bArr[i24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                        nVar5.b = i24 + 2;
                        i11 = i26 | (bArr[i25] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        nVar5.b = i24 + 4;
                        if (i10 == 1) {
                            nVar5.e(i24 + 20);
                        }
                        i12 = o2;
                    } else if (i10 == 2) {
                        nVar5.e(nVar5.b + 16);
                        i11 = (int) Math.round(Double.longBitsToDouble(nVar5.g()));
                        i12 = nVar5.m();
                        nVar5.e(nVar5.b + 20);
                        pair = create2;
                        i3 = i15;
                    } else {
                        pair = create2;
                        i = i19;
                    }
                    int i27 = nVar5.b;
                    if (b15 == c.b0) {
                        b15 = a(nVar5, i22, b14, fVar, i21);
                        nVar5.e(i27);
                    }
                    String str7 = b15 == c.o ? "audio/ac3" : b15 == c.q ? "audio/eac3" : b15 == c.s ? "audio/vnd.dts" : (b15 == c.t || b15 == c.u) ? "audio/vnd.dts.hd" : b15 == c.v ? "audio/vnd.dts.hd;profile=lbr" : b15 == c.y0 ? "audio/3gpp" : b15 == c.z0 ? "audio/amr-wb" : (b15 == c.m || b15 == c.n) ? "audio/raw" : b15 == c.k ? "audio/mpeg" : b15 == c.O0 ? "audio/alac" : null;
                    byte[] bArr2 = null;
                    while (i27 - i22 < b14) {
                        nVar5.e(i27);
                        int b16 = nVar5.b();
                        int i28 = i19;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b16 > 0, str6);
                        int b17 = nVar5.b();
                        int i29 = b14;
                        int i30 = c.K;
                        int i31 = i21;
                        if (b17 == i30 || (z && b17 == c.l)) {
                            boolean z2 = false;
                            if (b17 == i30) {
                                i13 = i27;
                                str2 = str6;
                            } else {
                                i13 = nVar5.b;
                                while (i13 - i27 < b16) {
                                    nVar5.e(i13);
                                    int b18 = nVar5.b();
                                    if (b18 > 0) {
                                        z2 = true;
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z2, str6);
                                    str2 = str6;
                                    if (nVar5.b() != c.K) {
                                        i13 += b18;
                                        str6 = str2;
                                        z2 = false;
                                    }
                                }
                                str2 = str6;
                                i14 = -1;
                                i13 = -1;
                                if (i13 == i14) {
                                    Pair a3 = a(i13, nVar5);
                                    String str8 = (String) a3.first;
                                    byte[] bArr3 = (byte[]) a3.second;
                                    if ("audio/mp4a-latm".equals(str8)) {
                                        Pair a4 = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr3);
                                        i11 = ((Integer) a4.first).intValue();
                                        i12 = ((Integer) a4.second).intValue();
                                    }
                                    bArr2 = bArr3;
                                    str7 = str8;
                                }
                            }
                            i14 = -1;
                            if (i13 == i14) {
                            }
                        } else {
                            if (b17 == c.p) {
                                nVar5.e(i27 + 8);
                                String num = Integer.toString(b5);
                                int i32 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[(nVar5.j() & 192) >> 6];
                                int j6 = nVar5.j();
                                int i33 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.d[(j6 & 56) >> 3];
                                if ((j6 & 4) != 0) {
                                    i33++;
                                }
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(num, "audio/ac3", -1, -1, i33, i32, null, dVar, str5);
                            } else if (b17 == c.r) {
                                nVar5.e(i27 + 8);
                                String num2 = Integer.toString(b5);
                                nVar5.e(nVar5.b + 2);
                                int i34 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.b[(nVar5.j() & 192) >> 6];
                                int j7 = nVar5.j();
                                int i35 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.d[(j7 & 14) >> 1];
                                if ((j7 & 1) != 0) {
                                    i35++;
                                }
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(num2, "audio/eac3", -1, -1, i35, i34, null, dVar, str5);
                            } else if (b17 == c.w) {
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b5), str7, -1, -1, i12, i11, null, dVar, str5);
                            } else if (b17 == c.O0) {
                                bArr2 = new byte[b16];
                                nVar5.e(i27);
                                nVar5.a(bArr2, 0, b16);
                            }
                            str2 = str6;
                        }
                        i27 += b16;
                        str6 = str2;
                        i19 = i28;
                        b14 = i29;
                        i21 = i31;
                    }
                    i = i19;
                    int i36 = b14;
                    int i37 = i21;
                    if (fVar.b == null && str7 != null) {
                        fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b5), str7, -1, -1, i12, i11, "audio/raw".equals(str7) ? 2 : -1, -1, -1, bArr2 == null ? null : Collections.singletonList(bArr2), dVar, 0, str5, null);
                    }
                    i7 = i36;
                    i8 = i37;
                    nVar5.e(i22 + i7);
                    i21 = i8 + 1;
                    b13 = i23;
                    k = j4;
                    i15 = i3;
                    create2 = pair;
                    i19 = i;
                } else {
                    int i38 = c.k0;
                    if (b15 != i38 && b15 != c.u0 && b15 != c.v0 && b15 != c.w0) {
                        if (b15 != c.x0) {
                            if (b15 == c.N0) {
                                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b5), "application/x-camera-motion", dVar);
                            }
                            pair = create2;
                            i = i19;
                            j4 = k;
                        }
                    }
                    nVar5.e(i22 + 16);
                    if (b15 == i38) {
                        j5 = Long.MAX_VALUE;
                        list2 = null;
                        str4 = "application/ttml+xml";
                    } else if (b15 == c.u0) {
                        int i39 = b14 - 16;
                        byte[] bArr4 = new byte[i39];
                        nVar5.a(bArr4, 0, i39);
                        list2 = Collections.singletonList(bArr4);
                        j5 = Long.MAX_VALUE;
                        str4 = "application/x-quicktime-tx3g";
                    } else {
                        if (b15 == c.v0) {
                            str3 = "application/x-mp4-vtt";
                        } else if (b15 == c.w0) {
                            str4 = "application/ttml+xml";
                            j5 = 0;
                            list2 = null;
                        } else {
                            if (b15 != c.x0) {
                                throw new IllegalStateException();
                            }
                            fVar.d = 1;
                            str3 = "application/x-mp4-cea-608";
                        }
                        j5 = Long.MAX_VALUE;
                        list2 = null;
                        str4 = str3;
                    }
                    fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b5), str4, 0, str5, -1, dVar, j5, list2);
                    pair = create2;
                    i = i19;
                    j4 = k;
                }
                i7 = b14;
                i3 = i15;
                i8 = i21;
                nVar5.e(i22 + i7);
                i21 = i8 + 1;
                b13 = i23;
                k = j4;
                i15 = i3;
                create2 = pair;
                i19 = i;
            }
            nVar5.e(i22 + 16);
            nVar5.e(nVar5.b + i6);
            int o3 = nVar5.o();
            int o4 = nVar5.o();
            nVar5.e(nVar5.b + 50);
            int i40 = nVar5.b;
            i7 = i2;
            if (b15 == c.a0) {
                i8 = i4;
                b15 = a(nVar5, i22, i7, fVar, i8);
                nVar5.e(i40);
            } else {
                i8 = i4;
            }
            int i41 = i5;
            float f2 = 1.0f;
            boolean z3 = false;
            String str9 = null;
            List list3 = null;
            byte[] bArr5 = null;
            while (i40 - i22 < i7) {
                nVar5.e(i40);
                int i42 = nVar5.b;
                int b19 = nVar5.b();
                if (b19 == 0 && nVar5.b - i22 == i7) {
                    break;
                }
                String str10 = str;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b19 > 0, str10);
                int b20 = nVar5.b();
                if (b20 == c.I) {
                    if (str9 != null) {
                        throw new IllegalStateException();
                    }
                    nVar5.e(i42 + 8);
                    com.fyber.inneractive.sdk.player.exoplayer2.video.a a5 = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar5);
                    list = a5.a;
                    fVar.c = a5.b;
                    if (!z3) {
                        f2 = a5.e;
                    }
                    str9 = "video/avc";
                } else if (b20 != c.J) {
                    if (b20 == c.M0) {
                        if (str9 != null) {
                            throw new IllegalStateException();
                        }
                        str9 = b15 == c.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (b20 == c.h) {
                        if (str9 != null) {
                            throw new IllegalStateException();
                        }
                        str9 = "video/3gpp";
                    } else if (b20 != c.K) {
                        if (b20 != c.j0) {
                            if (b20 != c.I0) {
                                i9 = b15;
                                if (b20 == c.H0) {
                                    int j8 = nVar5.j();
                                    nVar5.e(nVar5.b + 3);
                                    if (j8 == 0) {
                                        int j9 = nVar5.j();
                                        if (j9 == 0) {
                                            i41 = 0;
                                        } else if (j9 == 1) {
                                            i41 = 1;
                                        } else if (j9 == 2) {
                                            i41 = 2;
                                        } else if (j9 == 3) {
                                            i41 = 3;
                                        }
                                    }
                                }
                                break;
                                break;
                            }
                            int i43 = i42 + 8;
                            while (i43 - i42 < b19) {
                                nVar5.e(i43);
                                int b21 = nVar5.b();
                                i9 = b15;
                                if (nVar5.b() == c.J0) {
                                    bArr5 = Arrays.copyOfRange(nVar5.a, i43, b21 + i43);
                                    break;
                                }
                                i43 += b21;
                                b15 = i9;
                            }
                            i9 = b15;
                            bArr5 = null;
                        } else {
                            nVar5.e(i42 + 8);
                            f2 = nVar5.m() / nVar5.m();
                            i9 = b15;
                            z3 = true;
                        }
                        i40 += b19;
                        b15 = i9;
                        str = str10;
                    } else {
                        if (str9 != null) {
                            throw new IllegalStateException();
                        }
                        Pair a6 = a(i42, nVar5);
                        str9 = (String) a6.first;
                        list3 = Collections.singletonList((byte[]) a6.second);
                    }
                    i9 = b15;
                    break;
                    i40 += b19;
                    b15 = i9;
                    str = str10;
                } else {
                    if (str9 != null) {
                        throw new IllegalStateException();
                    }
                    nVar5.e(i42 + 8);
                    com.fyber.inneractive.sdk.player.exoplayer2.video.d a7 = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(nVar5);
                    list = a7.a;
                    fVar.c = a7.b;
                    str9 = "video/hevc";
                }
                i9 = b15;
                list3 = list;
                break;
                i40 += b19;
                b15 = i9;
                str = str10;
            }
            if (str9 != null) {
                fVar.b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(b5), str9, -1, o3, o4, list3, i, f2, bArr5, i41, null, dVar);
            }
            nVar5.e(i22 + i7);
            i21 = i8 + 1;
            b13 = i23;
            k = j4;
            i15 = i3;
            create2 = pair;
            i19 = i;
        }
        Pair pair2 = create2;
        long j10 = k;
        int i44 = i15;
        a b22 = aVar.b(c.Q);
        if (b22 == null || (c2 = b22.c(c.R)) == null) {
            sVar = null;
            create = Pair.create(null, null);
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = c2.P0;
            nVar6.e(8);
            int b23 = (nVar6.b() >> 24) & 255;
            int m = nVar6.m();
            long[] jArr = new long[m];
            long[] jArr2 = new long[m];
            for (int i45 = 0; i45 < m; i45++) {
                jArr[i45] = b23 == 1 ? nVar6.n() : nVar6.k();
                jArr2[i45] = b23 == 1 ? nVar6.g() : nVar6.b();
                byte[] bArr6 = nVar6.a;
                int i46 = nVar6.b;
                int i47 = i46 + 1;
                nVar6.b = i47;
                int i48 = (bArr6[i46] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                nVar6.b = i46 + 2;
                if (((short) ((bArr6[i47] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i48)) != 1) {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
                nVar6.e(i46 + 4);
            }
            create = Pair.create(jArr, jArr2);
            sVar = null;
        }
        return fVar.b == null ? sVar : new s(b5, i44, ((Long) pair2.first).longValue(), j10, a2, fVar.b, fVar.d, fVar.a, fVar.c, (long[]) create.first, (long[]) create.second);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, int i2, f fVar, int i3) {
        int i4 = nVar.b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            nVar.e(i4);
            int b2 = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(b2 > 0, "childAtomSize should be positive");
            if (nVar.b() == c.W) {
                int i5 = i4 + 8;
                Pair pair = null;
                boolean z = false;
                Integer num = null;
                t tVar = null;
                while (i5 - i4 < b2) {
                    nVar.e(i5);
                    int b3 = nVar.b();
                    int b4 = nVar.b();
                    if (b4 == c.c0) {
                        num = Integer.valueOf(nVar.b());
                    } else if (b4 == c.X) {
                        nVar.e(nVar.b + 4);
                        z = nVar.b() == g;
                    } else if (b4 == c.Y) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= b3) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i6);
                            int b5 = nVar.b();
                            if (nVar.b() == c.Z) {
                                nVar.e(nVar.b + 6);
                                nVar.j();
                                int j = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new t(j, bArr);
                                break;
                            }
                            i6 += b5;
                        }
                    }
                    i5 += b3;
                }
                if (z) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(num != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, tVar);
                }
                if (pair != null) {
                    fVar.a[i3] = (t) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            i4 += b2;
        }
    }

    public static Pair a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        nVar.e(i + 12);
        nVar.e(nVar.b + 1);
        a(nVar);
        nVar.e(nVar.b + 2);
        int j = nVar.j();
        if ((j & 128) != 0) {
            nVar.e(nVar.b + 2);
        }
        if ((j & 64) != 0) {
            nVar.e(nVar.b + nVar.o());
        }
        if ((j & 32) != 0) {
            nVar.e(nVar.b + 2);
        }
        nVar.e(nVar.b + 1);
        a(nVar);
        int j2 = nVar.j();
        if (j2 == 32) {
            str = "video/mp4v-es";
        } else if (j2 == 33) {
            str = "video/avc";
        } else if (j2 != 35) {
            if (j2 != 64) {
                str = null;
                if (j2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (j2 == 165) {
                    str = "audio/ac3";
                } else if (j2 != 166) {
                    switch (j2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (j2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        nVar.e(nVar.b + 12);
        nVar.e(nVar.b + 1);
        int a2 = a(nVar);
        byte[] bArr = new byte[a2];
        nVar.a(bArr, 0, a2);
        return Pair.create(str, bArr);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int j = nVar.j();
        int i = j & 127;
        while ((j & 128) == 128) {
            j = nVar.j();
            i = (i << 7) | (j & 127);
        }
        return i;
    }
}
