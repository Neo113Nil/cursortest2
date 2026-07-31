package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class o extends l {
    public n n;
    public int o;
    public boolean p;
    public r q;
    public p r;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i;
        byte b = nVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        n nVar2 = this.n;
        if (!nVar2.c[(b >> 1) & (255 >>> (8 - nVar2.d))].a) {
            i = nVar2.a.d;
        } else {
            i = nVar2.a.e;
        }
        long j = this.p ? (this.o + i) / 4 : 0;
        nVar.d(nVar.c + 4);
        byte[] bArr = nVar.a;
        int i2 = nVar.c;
        bArr[i2 - 4] = (byte) (j & 255);
        bArr[i2 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j, j jVar) {
        long j2;
        if (this.n != null) {
            return false;
        }
        n nVar2 = null;
        if (this.q == null) {
            this.q = s.a(nVar);
        } else if (this.r == null) {
            s.a(3, nVar, false);
            nVar.b((int) nVar.e());
            long e = nVar.e();
            String[] strArr = new String[(int) e];
            for (int i = 0; i < e; i++) {
                strArr[i] = nVar.b((int) nVar.e());
            }
            if ((nVar.j() & 1) != 0) {
                this.r = new p();
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit expected to be set");
            }
        } else {
            int i2 = nVar.c;
            byte[] bArr = new byte[i2];
            System.arraycopy(nVar.a, 0, bArr, 0, i2);
            int i3 = this.q.a;
            int i4 = 5;
            s.a(5, nVar, false);
            int j3 = nVar.j() + 1;
            m mVar = new m(nVar.a);
            mVar.b(nVar.b * 8);
            int i5 = 0;
            while (i5 < j3) {
                if (mVar.a(24) == 5653314) {
                    int a = mVar.a(16);
                    int a2 = mVar.a(24);
                    long[] jArr = new long[a2];
                    long j4 = 0;
                    if (!mVar.a()) {
                        boolean a3 = mVar.a();
                        for (int i6 = 0; i6 < a2; i6++) {
                            if (a3) {
                                if (mVar.a()) {
                                    jArr[i6] = mVar.a(i4) + 1;
                                } else {
                                    jArr[i6] = 0;
                                }
                            } else {
                                jArr[i6] = mVar.a(i4) + 1;
                            }
                        }
                    } else {
                        int a4 = mVar.a(i4) + 1;
                        int i7 = 0;
                        while (i7 < a2) {
                            int i8 = 0;
                            for (int i9 = a2 - i7; i9 > 0; i9 >>>= 1) {
                                i8++;
                            }
                            int a5 = mVar.a(i8);
                            int i10 = 0;
                            while (i10 < a5 && i7 < a2) {
                                jArr[i7] = a4;
                                i7++;
                                i10++;
                                j3 = j3;
                            }
                            a4++;
                            j3 = j3;
                        }
                    }
                    int i11 = j3;
                    int a6 = mVar.a(4);
                    if (a6 > 2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("lookup type greater than 2 not decodable: ", a6));
                    }
                    if (a6 == 1 || a6 == 2) {
                        mVar.b(32);
                        mVar.b(32);
                        int a7 = mVar.a(4) + 1;
                        mVar.b(1);
                        if (a6 == 1) {
                            if (a != 0) {
                                j2 = (long) Math.floor(Math.pow(a2, 1.0d / a));
                            }
                            mVar.b((int) (a7 * j4));
                        } else {
                            j2 = a2 * a;
                        }
                        j4 = j2;
                        mVar.b((int) (a7 * j4));
                    }
                    i5++;
                    j3 = i11;
                    i4 = 5;
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected code book to start with [0x56, 0x43, 0x42] at " + ((mVar.c * 8) + mVar.d));
                }
            }
            int i12 = 6;
            int a8 = mVar.a(6) + 1;
            for (int i13 = 0; i13 < a8; i13++) {
                if (mVar.a(16) != 0) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("placeholder of time domain transforms not zeroed out");
                }
            }
            int a9 = mVar.a(6) + 1;
            int i14 = 0;
            while (i14 < a9) {
                int a10 = mVar.a(16);
                if (a10 == 0) {
                    int i15 = 8;
                    mVar.b(8);
                    mVar.b(16);
                    mVar.b(16);
                    mVar.b(6);
                    mVar.b(8);
                    int a11 = mVar.a(4) + 1;
                    int i16 = 0;
                    while (i16 < a11) {
                        mVar.b(i15);
                        i16++;
                        i15 = 8;
                    }
                } else if (a10 == 1) {
                    int a12 = mVar.a(5);
                    int[] iArr = new int[a12];
                    int i17 = -1;
                    for (int i18 = 0; i18 < a12; i18++) {
                        int a13 = mVar.a(4);
                        iArr[i18] = a13;
                        if (a13 > i17) {
                            i17 = a13;
                        }
                    }
                    int i19 = i17 + 1;
                    int[] iArr2 = new int[i19];
                    for (int i20 = 0; i20 < i19; i20++) {
                        iArr2[i20] = mVar.a(3) + 1;
                        int a14 = mVar.a(2);
                        int i21 = 8;
                        if (a14 > 0) {
                            mVar.b(8);
                        }
                        int i22 = 0;
                        while (i22 < (1 << a14)) {
                            mVar.b(i21);
                            i22++;
                            i21 = 8;
                        }
                    }
                    mVar.b(2);
                    int a15 = mVar.a(4);
                    int i23 = 0;
                    int i24 = 0;
                    for (int i25 = 0; i25 < a12; i25++) {
                        i23 += iArr2[iArr[i25]];
                        while (i24 < i23) {
                            mVar.b(a15);
                            i24++;
                        }
                    }
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("floor type greater than 1 not decodable: ", a10));
                }
                i14++;
                i12 = 6;
            }
            int a16 = mVar.a(i12) + 1;
            int i26 = 0;
            while (i26 < a16) {
                if (mVar.a(16) <= 2) {
                    mVar.b(24);
                    mVar.b(24);
                    mVar.b(24);
                    int a17 = mVar.a(i12) + 1;
                    int i27 = 8;
                    mVar.b(8);
                    int[] iArr3 = new int[a17];
                    for (int i28 = 0; i28 < a17; i28++) {
                        iArr3[i28] = ((mVar.a() ? mVar.a(5) : 0) * 8) + mVar.a(3);
                    }
                    int i29 = 0;
                    while (i29 < a17) {
                        int i30 = 0;
                        while (i30 < i27) {
                            if ((iArr3[i29] & (1 << i30)) != 0) {
                                mVar.b(i27);
                            }
                            i30++;
                            i27 = 8;
                        }
                        i29++;
                        i27 = 8;
                    }
                    i26++;
                    i12 = 6;
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("residueType greater than 2 is not decodable");
                }
            }
            int a18 = mVar.a(i12) + 1;
            for (int i31 = 0; i31 < a18; i31++) {
                int a19 = mVar.a(16);
                if (a19 != 0) {
                    Log.e("VorbisUtil", "mapping type other than 0 not supported: " + a19);
                } else {
                    int a20 = mVar.a() ? mVar.a(4) + 1 : 1;
                    if (mVar.a()) {
                        int a21 = mVar.a(8) + 1;
                        for (int i32 = 0; i32 < a21; i32++) {
                            int i33 = i3 - 1;
                            int i34 = 0;
                            for (int i35 = i33; i35 > 0; i35 >>>= 1) {
                                i34++;
                            }
                            mVar.b(i34);
                            int i36 = 0;
                            while (i33 > 0) {
                                i36++;
                                i33 >>>= 1;
                            }
                            mVar.b(i36);
                        }
                    }
                    if (mVar.a(2) != 0) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("to reserved bits must be zero after mapping coupling steps");
                    }
                    if (a20 > 1) {
                        for (int i37 = 0; i37 < i3; i37++) {
                            mVar.b(4);
                        }
                    }
                    for (int i38 = 0; i38 < a20; i38++) {
                        mVar.b(8);
                        mVar.b(8);
                        mVar.b(8);
                    }
                }
            }
            int a22 = mVar.a(6);
            int i39 = a22 + 1;
            q[] qVarArr = new q[i39];
            for (int i40 = 0; i40 < i39; i40++) {
                boolean a23 = mVar.a();
                mVar.a(16);
                mVar.a(16);
                mVar.a(8);
                qVarArr[i40] = new q(a23);
            }
            if (mVar.a()) {
                int i41 = 0;
                while (a22 > 0) {
                    i41++;
                    a22 >>>= 1;
                }
                nVar2 = new n(this.q, bArr, qVarArr, i41);
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("framing bit after modes not set as expected");
            }
        }
        this.n = nVar2;
        if (nVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.a.f);
        arrayList.add(this.n.b);
        r rVar = this.n.a;
        jVar.a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/vorbis", rVar.c, -1, rVar.a, (int) rVar.b, arrayList, null, null);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        r rVar = this.q;
        this.o = rVar != null ? rVar.d : 0;
    }
}
