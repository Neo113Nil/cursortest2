package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes14.dex */
public final class e implements i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public j Y;
    public final b a;
    public final g b;
    public final SparseArray c;
    public final boolean d;
    public final n e;
    public final n f;
    public final n g;
    public final n h;
    public final n i;
    public final n j;
    public final n k;
    public final n l;
    public final n m;
    public ByteBuffer n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public d t;
    public boolean u;
    public int v;
    public long w;
    public boolean x;
    public long y;
    public long z;

    public e() {
        b bVar = new b();
        this.p = -1L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1L;
        this.z = -1L;
        this.A = -9223372036854775807L;
        this.a = bVar;
        bVar.d = new c(this);
        this.d = true;
        this.b = new g();
        this.c = new SparseArray();
        this.g = new n(4);
        this.h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new n(4);
        this.e = new n(l.a);
        this.f = new n(4);
        this.j = new n();
        this.k = new n();
        this.l = new n(8);
        this.m = new n();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        f fVar = new f();
        long j = bVar.b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        bVar.a(fVar.a.a, 0, 4, false);
        fVar.b = 4;
        for (long k = fVar.a.k(); k != 440786851; k = ((k << 8) & (-256)) | (fVar.a.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) {
            int i2 = fVar.b + 1;
            fVar.b = i2;
            if (i2 == i) {
                return false;
            }
            bVar.a(fVar.a.a, 0, 1, false);
        }
        long a = fVar.a(bVar);
        long j3 = fVar.b;
        if (a == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + a >= j) {
            return false;
        }
        while (true) {
            long j4 = fVar.b;
            long j5 = j3 + a;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (fVar.a(bVar) == Long.MIN_VALUE) {
                return false;
            }
            long a2 = fVar.a(bVar);
            if (a2 < 0 || a2 > 2147483647L) {
                return false;
            }
            if (a2 != 0) {
                bVar.a((int) a2, false);
                fVar.b = (int) (fVar.b + a2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.A = -9223372036854775807L;
        this.E = 0;
        b bVar = this.a;
        bVar.e = 0;
        bVar.b.clear();
        g gVar = bVar.c;
        gVar.b = 0;
        gVar.c = 0;
        g gVar2 = this.b;
        gVar2.b = 0;
        gVar2.c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar = this.j;
        nVar.b = 0;
        nVar.c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x02ee, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02ef, code lost:
    
        r5 = true;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x066e, code lost:
    
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x080f, code lost:
    
        if (r9 != 7) goto L417;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0591  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v82, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v86 */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        long j;
        int i9;
        int i10;
        double longBitsToDouble;
        long j2;
        boolean z2;
        int i11;
        int a;
        q pVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar;
        int i12;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar2;
        int i13 = 0;
        this.W = false;
        boolean z3 = true;
        while (z3 && !this.W) {
            b bVar2 = this.a;
            if (bVar2.d == null) {
                throw new IllegalStateException();
            }
            while (true) {
                if (!bVar2.b.isEmpty() && bVar.c >= ((a) bVar2.b.peek()).b) {
                    c cVar = bVar2.d;
                    int i14 = ((a) bVar2.b.pop()).a;
                    e eVar = cVar.a;
                    if (i14 != 160) {
                        if (i14 == 174) {
                            String str2 = eVar.t.a;
                            if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                                d dVar = eVar.t;
                                dVar.a(eVar.Y, dVar.b);
                                SparseArray sparseArray = eVar.c;
                                d dVar2 = eVar.t;
                                sparseArray.put(dVar2.b, dVar2);
                            }
                            eVar.t = null;
                        } else {
                            if (i14 == 19899) {
                                int i15 = eVar.v;
                                if (i15 != -1) {
                                    long j3 = eVar.w;
                                    if (j3 != -1) {
                                        if (i15 == 475249515) {
                                            eVar.y = j3;
                                        }
                                    }
                                }
                                throw new r("Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i14 == 25152) {
                                d dVar3 = eVar.t;
                                if (dVar3.e) {
                                    byte[] bArr = dVar3.g;
                                    if (bArr != null) {
                                        dVar3.i = new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(true, new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(com.fyber.inneractive.sdk.player.exoplayer2.b.b, "video/webm", bArr));
                                    } else {
                                        throw new r("Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                }
                            } else if (i14 == 28032) {
                                d dVar4 = eVar.t;
                                if (dVar4.e && dVar4.f != null) {
                                    throw new r("Combining encryption and compression is not supported");
                                }
                            } else if (i14 == 357149030) {
                                if (eVar.q == -9223372036854775807L) {
                                    eVar.q = 1000000L;
                                }
                                long j4 = eVar.r;
                                if (j4 != -9223372036854775807L) {
                                    eVar.s = eVar.a(j4);
                                }
                            } else if (i14 != 374648427) {
                                if (i14 != 475249515) {
                                    eVar.getClass();
                                } else if (!eVar.u) {
                                    j jVar = eVar.Y;
                                    if (eVar.p != -1 && eVar.s != -9223372036854775807L && (gVar = eVar.B) != null && (i12 = gVar.a) != 0 && (gVar2 = eVar.C) != null && gVar2.a == i12) {
                                        int[] iArr2 = new int[i12];
                                        long[] jArr = new long[i12];
                                        long[] jArr2 = new long[i12];
                                        long[] jArr3 = new long[i12];
                                        for (int i16 = 0; i16 < i12; i16++) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar3 = eVar.B;
                                            if (i16 >= 0) {
                                                if (i16 < gVar3.a) {
                                                    jArr3[i16] = gVar3.b[i16];
                                                    long j5 = eVar.p;
                                                    com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar4 = eVar.C;
                                                    if (i16 < 0) {
                                                        gVar4.getClass();
                                                    } else if (i16 < gVar4.a) {
                                                        jArr[i16] = gVar4.b[i16] + j5;
                                                    }
                                                    StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i16, ", size is ");
                                                    a2.append(gVar4.a);
                                                    throw new IndexOutOfBoundsException(a2.toString());
                                                }
                                            } else {
                                                gVar3.getClass();
                                            }
                                            StringBuilder a3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i16, ", size is ");
                                            a3.append(gVar3.a);
                                            throw new IndexOutOfBoundsException(a3.toString());
                                        }
                                        int i17 = 0;
                                        while (true) {
                                            int i18 = i12 - 1;
                                            if (i17 < i18) {
                                                int i19 = i17 + 1;
                                                iArr2[i17] = (int) (jArr[i19] - jArr[i17]);
                                                jArr2[i17] = jArr3[i19] - jArr3[i17];
                                                i17 = i19;
                                            } else {
                                                iArr2[i18] = (int) ((eVar.p + eVar.o) - jArr[i18]);
                                                jArr2[i18] = eVar.s - jArr3[i18];
                                                eVar.B = null;
                                                eVar.C = null;
                                                pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr2, jArr, jArr2, jArr3);
                                            }
                                        }
                                    } else {
                                        eVar.B = null;
                                        eVar.C = null;
                                        pVar = new p(eVar.s);
                                    }
                                    jVar.a(pVar);
                                    eVar.u = true;
                                }
                            } else if (eVar.c.size() != 0) {
                                eVar.Y.b();
                            } else {
                                throw new r("No valid tracks were found");
                            }
                        }
                    } else if (eVar.E == 2) {
                        if (!eVar.X) {
                            eVar.M |= 1;
                        }
                        eVar.a((d) eVar.c.get(eVar.K), eVar.F);
                        i7 = 0;
                        eVar.E = 0;
                    }
                    i7 = 0;
                } else {
                    ?? r4 = 0;
                    int i20 = 8;
                    if (bVar2.e == 0) {
                        long a4 = bVar2.c.a(bVar, true, false, 4);
                        if (a4 == -2) {
                            bVar.e = 0;
                            while (true) {
                                bVar.a(bVar2.a, r4, 4, r4);
                                byte b = bVar2.a[r4];
                                int i21 = 0;
                                while (true) {
                                    long[] jArr4 = g.d;
                                    if (i21 >= 8) {
                                        i11 = -1;
                                    } else if ((jArr4[i21] & b) != 0) {
                                        i11 = i21 + 1;
                                    } else {
                                        i21++;
                                    }
                                }
                                if (i11 != -1 && i11 <= 4) {
                                    a = (int) g.a(bVar2.a, i11, false);
                                    bVar2.d.a.getClass();
                                    if (a == 357149030 || a == 524531317 || a == 475249515 || a == 374648427) {
                                    }
                                }
                                bVar.a(1);
                                r4 = 0;
                            }
                            bVar.a(i11);
                            j2 = a;
                            z = true;
                        } else {
                            z = true;
                            j2 = a4;
                        }
                        if (j2 == -1) {
                            z2 = 0;
                            z3 = false;
                        } else {
                            bVar2.f = (int) j2;
                            bVar2.e = z ? 1 : 0;
                        }
                    } else {
                        z = true;
                    }
                    if (bVar2.e == z) {
                        bVar2.g = bVar2.c.a(bVar, false, z, 8);
                        bVar2.e = 2;
                    }
                    c cVar2 = bVar2.d;
                    int i22 = bVar2.f;
                    cVar2.a.getClass();
                    switch (i22) {
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case AD_RESPONSE_EMPTY_VALUE:
                        case 231:
                        case 241:
                        case 251:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        bVar.a((int) bVar2.g);
                        bVar2.e = 0;
                    } else if (i == 1) {
                        long j6 = bVar.c;
                        bVar2.b.add(new a(bVar2.f, bVar2.g + j6));
                        c cVar3 = bVar2.d;
                        int i23 = bVar2.f;
                        long j7 = bVar2.g;
                        e eVar2 = cVar3.a;
                        eVar2.getClass();
                        if (i23 == 160) {
                            i2 = 0;
                            eVar2.X = false;
                        } else if (i23 == 174) {
                            i2 = 0;
                            eVar2.t = new d();
                        } else if (i23 != 187) {
                            if (i23 == 19899) {
                                eVar2.v = -1;
                                eVar2.w = -1L;
                            } else if (i23 == 20533) {
                                eVar2.t.e = true;
                            } else if (i23 == 21968) {
                                eVar2.t.q = true;
                            } else if (i23 == 408125543) {
                                long j8 = eVar2.p;
                                if (j8 != -1 && j8 != j6) {
                                    throw new r("Multiple Segment elements not supported");
                                }
                                eVar2.p = j6;
                                eVar2.o = j7;
                            } else if (i23 != 475249515) {
                                if (i23 == 524531317 && !eVar2.u) {
                                    if (eVar2.d && eVar2.y != -1) {
                                        eVar2.x = true;
                                    } else {
                                        eVar2.Y.a(new p(eVar2.s));
                                        eVar2.u = true;
                                    }
                                }
                            } else {
                                eVar2.B = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                                eVar2.C = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                            }
                            i2 = 0;
                        } else {
                            i2 = 0;
                            eVar2.D = false;
                        }
                        bVar2.e = i2 == true ? 1 : 0;
                        i4 = i2;
                    } else if (i == 2) {
                        long j9 = bVar2.g;
                        if (j9 <= 8) {
                            c cVar4 = bVar2.d;
                            int i24 = bVar2.f;
                            int i25 = (int) j9;
                            bVar.b(bVar2.a, 0, i25, false);
                            long j10 = 0;
                            for (int i26 = 0; i26 < i25; i26++) {
                                j10 = (j10 << 8) | (bVar2.a[i26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                            }
                            e eVar3 = cVar4.a;
                            eVar3.getClass();
                            if (i24 != 20529) {
                                if (i24 != 20530) {
                                    switch (i24) {
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                            eVar3.t.c = (int) j10;
                                            break;
                                        case 136:
                                            eVar3.t.L = j10 == 1;
                                            break;
                                        case 155:
                                            eVar3.G = eVar3.a(j10);
                                            break;
                                        case 159:
                                            eVar3.t.G = (int) j10;
                                            break;
                                        case 176:
                                            eVar3.t.j = (int) j10;
                                            break;
                                        case 179:
                                            eVar3.B.a(eVar3.a(j10));
                                            break;
                                        case 186:
                                            eVar3.t.k = (int) j10;
                                            break;
                                        case AD_RESPONSE_EMPTY_VALUE:
                                            eVar3.t.b = (int) j10;
                                            break;
                                        case 231:
                                            eVar3.A = eVar3.a(j10);
                                            break;
                                        case 241:
                                            if (!eVar3.D) {
                                                eVar3.C.a(j10);
                                                eVar3.D = true;
                                                break;
                                            }
                                            break;
                                        case 251:
                                            eVar3.X = true;
                                            break;
                                        case 16980:
                                            if (j10 != 3) {
                                                throw new r("ContentCompAlgo " + j10 + " not supported");
                                            }
                                            break;
                                        case 17029:
                                            if (j10 < 1 || j10 > 2) {
                                                throw new r("DocTypeReadVersion " + j10 + " not supported");
                                            }
                                            break;
                                        case 17143:
                                            if (j10 != 1) {
                                                throw new r("EBMLReadVersion " + j10 + " not supported");
                                            }
                                            break;
                                        case 18401:
                                            if (j10 != 5) {
                                                throw new r("ContentEncAlgo " + j10 + " not supported");
                                            }
                                            break;
                                        case 18408:
                                            if (j10 != 1) {
                                                throw new r("AESSettingsCipherMode " + j10 + " not supported");
                                            }
                                            break;
                                        case 21420:
                                            eVar3.w = j10 + eVar3.p;
                                            break;
                                        case 21432:
                                            int i27 = (int) j10;
                                            if (i27 != 0) {
                                                if (i27 != 1) {
                                                    if (i27 != 3) {
                                                        if (i27 == 15) {
                                                            eVar3.t.p = 3;
                                                            break;
                                                        }
                                                    } else {
                                                        eVar3.t.p = 1;
                                                        break;
                                                    }
                                                } else {
                                                    eVar3.t.p = 2;
                                                    break;
                                                }
                                            } else {
                                                eVar3.t.p = 0;
                                                i3 = 0;
                                                bVar2.e = i3 == true ? 1 : 0;
                                                i4 = i3;
                                                break;
                                            }
                                            break;
                                        case 21680:
                                            eVar3.t.l = (int) j10;
                                            break;
                                        case 21682:
                                            eVar3.t.n = (int) j10;
                                            break;
                                        case 21690:
                                            eVar3.t.m = (int) j10;
                                            break;
                                        case 21930:
                                            eVar3.t.M = j10 == 1;
                                            break;
                                        case 22186:
                                            eVar3.t.J = j10;
                                            break;
                                        case 22203:
                                            eVar3.t.K = j10;
                                            break;
                                        case 25188:
                                            eVar3.t.H = (int) j10;
                                            break;
                                        case 2352003:
                                            eVar3.t.d = (int) j10;
                                            break;
                                        case 2807729:
                                            eVar3.q = j10;
                                            break;
                                        default:
                                            switch (i24) {
                                                case 21945:
                                                    int i28 = (int) j10;
                                                    if (i28 != 1) {
                                                        if (i28 == 2) {
                                                            eVar3.t.t = 1;
                                                            break;
                                                        }
                                                    } else {
                                                        eVar3.t.t = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 21946:
                                                    int i29 = (int) j10;
                                                    if (i29 != 1) {
                                                        if (i29 == 16) {
                                                            eVar3.t.s = 6;
                                                            break;
                                                        } else if (i29 == 18) {
                                                            eVar3.t.s = 7;
                                                            break;
                                                        } else if (i29 != 6) {
                                                        }
                                                    }
                                                    eVar3.t.s = 3;
                                                    break;
                                                case 21947:
                                                    d dVar5 = eVar3.t;
                                                    dVar5.q = true;
                                                    int i30 = (int) j10;
                                                    if (i30 != 1) {
                                                        if (i30 != 9) {
                                                            if (i30 == 4 || i30 == 5 || i30 == 6 || i30 == 7) {
                                                                dVar5.r = 2;
                                                                break;
                                                            }
                                                        } else {
                                                            dVar5.r = 6;
                                                            break;
                                                        }
                                                    } else {
                                                        dVar5.r = 1;
                                                        break;
                                                    }
                                                case 21948:
                                                    eVar3.t.u = (int) j10;
                                                    break;
                                                case 21949:
                                                    eVar3.t.v = (int) j10;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j10 != 1) {
                                    throw new r("ContentEncodingScope " + j10 + " not supported");
                                }
                            } else if (j10 != 0) {
                                throw new r("ContentEncodingOrder " + j10 + " not supported");
                            }
                            i3 = 0;
                            bVar2.e = i3 == true ? 1 : 0;
                            i4 = i3;
                        } else {
                            throw new r("Invalid integer size: " + bVar2.g);
                        }
                    } else if (i == 3) {
                        long j11 = bVar2.g;
                        if (j11 <= 2147483647L) {
                            c cVar5 = bVar2.d;
                            int i31 = bVar2.f;
                            int i32 = (int) j11;
                            if (i32 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i32];
                                bVar.b(bArr2, 0, i32, false);
                                str = new String(bArr2);
                            }
                            e eVar4 = cVar5.a;
                            eVar4.getClass();
                            if (i31 == 134) {
                                eVar4.t.a = str;
                            } else if (i31 != 17026) {
                                if (i31 == 2274716) {
                                    eVar4.t.N = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw new r("DocType " + str + " not supported");
                            }
                            i4 = 0;
                            bVar2.e = 0;
                        } else {
                            throw new r("String element size: " + bVar2.g);
                        }
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new r(m.a("Invalid element type ", i));
                        }
                        long j12 = bVar2.g;
                        if (j12 != 4 && j12 != 8) {
                            throw new r("Invalid float size: " + bVar2.g);
                        }
                        c cVar6 = bVar2.d;
                        int i33 = bVar2.f;
                        int i34 = (int) j12;
                        bVar.b(bVar2.a, 0, i34, false);
                        long j13 = 0;
                        for (int i35 = 0; i35 < i34; i35++) {
                            j13 = (j13 << 8) | (bVar2.a[i35] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        }
                        if (i34 == 4) {
                            longBitsToDouble = Float.intBitsToFloat((int) j13);
                        } else {
                            longBitsToDouble = Double.longBitsToDouble(j13);
                        }
                        e eVar5 = cVar6.a;
                        if (i33 == 181) {
                            eVar5.t.I = (int) longBitsToDouble;
                        } else if (i33 != 17545) {
                            switch (i33) {
                                case 21969:
                                    eVar5.t.w = (float) longBitsToDouble;
                                    break;
                                case 21970:
                                    eVar5.t.x = (float) longBitsToDouble;
                                    break;
                                case 21971:
                                    eVar5.t.y = (float) longBitsToDouble;
                                    break;
                                case 21972:
                                    eVar5.t.z = (float) longBitsToDouble;
                                    break;
                                case 21973:
                                    eVar5.t.A = (float) longBitsToDouble;
                                    break;
                                case 21974:
                                    eVar5.t.B = (float) longBitsToDouble;
                                    break;
                                case 21975:
                                    eVar5.t.C = (float) longBitsToDouble;
                                    break;
                                case 21976:
                                    eVar5.t.D = (float) longBitsToDouble;
                                    break;
                                case 21977:
                                    eVar5.t.E = (float) longBitsToDouble;
                                    break;
                                case 21978:
                                    eVar5.t.F = (float) longBitsToDouble;
                                    break;
                                default:
                                    eVar5.getClass();
                                    break;
                            }
                        } else {
                            eVar5.r = (long) longBitsToDouble;
                        }
                        i4 = 0;
                        bVar2.e = 0;
                    } else {
                        c cVar7 = bVar2.d;
                        int i36 = bVar2.f;
                        int i37 = (int) bVar2.g;
                        e eVar6 = cVar7.a;
                        if (i36 == 161 || i36 == 163) {
                            i5 = 0;
                            if (eVar6.E == 0) {
                                eVar6.K = (int) eVar6.b.a(bVar, false, true, 8);
                                eVar6.L = eVar6.b.c;
                                eVar6.G = -9223372036854775807L;
                                eVar6.E = 1;
                                n nVar = eVar6.g;
                                nVar.b = 0;
                                nVar.c = 0;
                            }
                            d dVar6 = (d) eVar6.c.get(eVar6.K);
                            if (dVar6 == null) {
                                bVar.a(i37 - eVar6.L);
                                eVar6.E = 0;
                            } else {
                                if (eVar6.E == 1) {
                                    eVar6.a(bVar, 3);
                                    int i38 = (eVar6.g.a[2] & 6) >> 1;
                                    if (i38 == 0) {
                                        eVar6.I = 1;
                                        int[] iArr3 = eVar6.J;
                                        if (iArr3 == null) {
                                            iArr3 = new int[1];
                                        } else if (iArr3.length < 1) {
                                            iArr3 = new int[Math.max(iArr3.length * 2, 1)];
                                        }
                                        eVar6.J = iArr3;
                                        iArr3[0] = (i37 - eVar6.L) - 3;
                                    } else if (i36 == 163) {
                                        eVar6.a(bVar, 4);
                                        int i39 = (eVar6.g.a[3] & 255) + 1;
                                        eVar6.I = i39;
                                        int[] iArr4 = eVar6.J;
                                        if (iArr4 == null) {
                                            iArr4 = new int[i39];
                                        } else if (iArr4.length < i39) {
                                            int length = iArr4.length;
                                            i8 = 2;
                                            iArr = new int[Math.max(length * 2, i39)];
                                            eVar6.J = iArr;
                                            if (i38 != i8) {
                                                int i40 = (i37 - eVar6.L) - 4;
                                                int i41 = eVar6.I;
                                                Arrays.fill(iArr, 0, i41, i40 / i41);
                                            } else {
                                                int i42 = 1;
                                                int i43 = 0;
                                                if (i38 == 1) {
                                                    int i44 = 0;
                                                    int i45 = 0;
                                                    int i46 = 4;
                                                    while (true) {
                                                        int i47 = eVar6.I - i42;
                                                        if (i44 < i47) {
                                                            eVar6.J[i44] = i43;
                                                            while (true) {
                                                                i9 = i46 + 1;
                                                                eVar6.a(bVar, i9);
                                                                int i48 = eVar6.g.a[i46] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                                int[] iArr5 = eVar6.J;
                                                                i10 = iArr5[i44] + i48;
                                                                iArr5[i44] = i10;
                                                                if (i48 != 255) {
                                                                    break;
                                                                }
                                                                i46 = i9;
                                                            }
                                                            i45 += i10;
                                                            i44++;
                                                            i46 = i9;
                                                            i42 = 1;
                                                            i43 = 0;
                                                        } else {
                                                            eVar6.J[i47] = ((i37 - eVar6.L) - i46) - i45;
                                                        }
                                                    }
                                                } else {
                                                    if (i38 != 3) {
                                                        throw new r(m.a("Unexpected lacing value: ", i38));
                                                    }
                                                    int i49 = 0;
                                                    int i50 = 0;
                                                    int i51 = 4;
                                                    while (true) {
                                                        int i52 = eVar6.I - 1;
                                                        if (i49 < i52) {
                                                            eVar6.J[i49] = 0;
                                                            int i53 = i51 + 1;
                                                            eVar6.a(bVar, i53);
                                                            if (eVar6.g.a[i51] == 0) {
                                                                throw new r("No valid varint length mask found");
                                                            }
                                                            int i54 = 0;
                                                            while (true) {
                                                                if (i54 < i20) {
                                                                    int i55 = 1 << (7 - i54);
                                                                    if ((eVar6.g.a[i51] & i55) != 0) {
                                                                        int i56 = i53 + i54;
                                                                        eVar6.a(bVar, i56);
                                                                        int i57 = eVar6.g.a[i51] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED & (~i55);
                                                                        int i58 = i53;
                                                                        long j14 = i57;
                                                                        while (true) {
                                                                            int i59 = i58;
                                                                            if (i59 < i56) {
                                                                                i58 = i59 + 1;
                                                                                j14 = (j14 << 8) | (eVar6.g.a[i59] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                                                                            } else {
                                                                                if (i49 > 0) {
                                                                                    j14 -= (1 << ((i54 * 7) + 6)) - 1;
                                                                                }
                                                                                long j15 = j14;
                                                                                i51 = i56;
                                                                                j = j15;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i54++;
                                                                        i20 = 8;
                                                                    }
                                                                } else {
                                                                    i51 = i53;
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j >= -2147483648L && j <= 2147483647L) {
                                                                int i60 = (int) j;
                                                                int[] iArr6 = eVar6.J;
                                                                if (i49 != 0) {
                                                                    i60 += iArr6[i49 - 1];
                                                                }
                                                                iArr6[i49] = i60;
                                                                i50 += i60;
                                                                i49++;
                                                                i20 = 8;
                                                            }
                                                        } else {
                                                            eVar6.J[i52] = ((i37 - eVar6.L) - i51) - i50;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        iArr = iArr4;
                                        i8 = 2;
                                        eVar6.J = iArr;
                                        if (i38 != i8) {
                                        }
                                    } else {
                                        throw new r("Lacing only supported in SimpleBlocks.");
                                    }
                                    byte[] bArr3 = eVar6.g.a;
                                    eVar6.F = eVar6.a((bArr3[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr3[0] << 8)) + eVar6.A;
                                    byte b2 = eVar6.g.a[2];
                                    eVar6.M = ((dVar6.c == 2 || (i36 == 163 && (b2 & 128) == 128)) ? 1 : 0) | ((b2 & 8) == 8 ? Integer.MIN_VALUE : 0);
                                    eVar6.E = 2;
                                    eVar6.H = 0;
                                    i6 = 163;
                                } else {
                                    i6 = 163;
                                }
                                if (i36 == i6) {
                                    while (true) {
                                        int i61 = eVar6.H;
                                        if (i61 < eVar6.I) {
                                            eVar6.a(bVar, dVar6, eVar6.J[i61]);
                                            eVar6.a(dVar6, eVar6.F + ((eVar6.H * dVar6.d) / 1000));
                                            eVar6.H++;
                                        } else {
                                            i7 = 0;
                                            eVar6.E = 0;
                                        }
                                    }
                                } else {
                                    i7 = 0;
                                    eVar6.a(bVar, dVar6, eVar6.J[0]);
                                }
                                bVar2.e = i7;
                            }
                        } else if (i36 == 16981) {
                            i5 = 0;
                            byte[] bArr4 = new byte[i37];
                            eVar6.t.f = bArr4;
                            bVar.b(bArr4, 0, i37, false);
                        } else if (i36 == 18402) {
                            i5 = 0;
                            byte[] bArr5 = new byte[i37];
                            eVar6.t.g = bArr5;
                            bVar.b(bArr5, 0, i37, false);
                        } else if (i36 == 21419) {
                            i5 = 0;
                            Arrays.fill(eVar6.i.a, (byte) 0);
                            bVar.b(eVar6.i.a, 4 - i37, i37, false);
                            eVar6.i.e(0);
                            eVar6.v = (int) eVar6.i.k();
                        } else if (i36 != 25506) {
                            if (i36 != 30322) {
                                eVar6.getClass();
                                throw new r(m.a("Unexpected id: ", i36));
                            }
                            byte[] bArr6 = new byte[i37];
                            eVar6.t.o = bArr6;
                            i5 = 0;
                            bVar.b(bArr6, 0, i37, false);
                        } else {
                            i5 = 0;
                            byte[] bArr7 = new byte[i37];
                            eVar6.t.h = bArr7;
                            bVar.b(bArr7, 0, i37, false);
                        }
                        i7 = i5;
                        bVar2.e = i7;
                    }
                }
            }
            if (z3) {
                long j16 = bVar.c;
                if (this.x) {
                    this.z = j16;
                    oVar.a = this.y;
                    this.x = z2;
                    return 1;
                }
                if (this.u) {
                    long j17 = this.z;
                    if (j17 != -1) {
                        oVar.a = j17;
                        this.z = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            i13 = 0;
        }
        int i62 = i13;
        if (z3) {
            return i62;
        }
        return -1;
    }

    public final void a(d dVar, long j) {
        byte[] b;
        if ("S_TEXT/UTF8".equals(dVar.a)) {
            byte[] bArr = this.k.a;
            long j2 = this.G;
            if (j2 == -9223372036854775807L) {
                b = a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                b = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * r5)) / 1000))));
            }
            System.arraycopy(b, 0, bArr, 19, 12);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
            n nVar = this.k;
            rVar.a(nVar.c, nVar);
            this.V += this.k.c;
        }
        dVar.O.a(j, this.M, this.V, 0, dVar.g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar2 = this.j;
        nVar2.b = 0;
        nVar2.c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i) {
        n nVar = this.g;
        if (nVar.c >= i) {
            return;
        }
        if (nVar.a() < i) {
            n nVar2 = this.g;
            byte[] bArr = nVar2.a;
            byte[] copyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i));
            int i2 = this.g.c;
            nVar2.a = copyOf;
            nVar2.c = i2;
            nVar2.b = 0;
        }
        n nVar3 = this.g;
        byte[] bArr2 = nVar3.a;
        int i3 = nVar3.c;
        bVar.b(bArr2, i3, i - i3, false);
        this.g.d(i);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i) {
        int a;
        int a2;
        int i2;
        if ("S_TEXT/UTF8".equals(dVar.a)) {
            byte[] bArr = Z;
            int i3 = i + 32;
            if (this.k.a() < i3) {
                this.k.a = Arrays.copyOf(bArr, i3 + i);
            }
            bVar.b(this.k.a, 32, i, false);
            this.k.e(0);
            this.k.d(i3);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
        if (!this.O) {
            if (dVar.e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.g.a, 0, 1, false);
                    this.N++;
                    byte b = this.g.a[0];
                    if ((b & 128) != 128) {
                        this.S = b;
                        this.P = true;
                    } else {
                        throw new r("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.l.a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        n nVar = this.g;
                        nVar.a[0] = (byte) ((z ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.g);
                        this.V++;
                        this.l.e(0);
                        rVar.a(8, this.l);
                        this.V += 8;
                    }
                    if (z) {
                        if (!this.R) {
                            bVar.b(this.g.a, 0, 1, false);
                            this.N++;
                            this.g.e(0);
                            this.T = this.g.j();
                            this.R = true;
                        }
                        int i4 = this.T * 4;
                        this.g.c(i4);
                        bVar.b(this.g.a, 0, i4, false);
                        this.N += i4;
                        short s = (short) ((this.T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.n = ByteBuffer.allocate(i5);
                        }
                        this.n.position(0);
                        this.n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.T;
                            if (i6 >= i2) {
                                break;
                            }
                            int m = this.g.m();
                            if (i6 % 2 == 0) {
                                this.n.putShort((short) (m - i7));
                            } else {
                                this.n.putInt(m - i7);
                            }
                            i6++;
                            i7 = m;
                        }
                        int i8 = (i - this.N) - i7;
                        if (i2 % 2 == 1) {
                            this.n.putInt(i8);
                        } else {
                            this.n.putShort((short) i8);
                            this.n.putInt(0);
                        }
                        n nVar2 = this.m;
                        nVar2.a = this.n.array();
                        nVar2.c = i5;
                        nVar2.b = 0;
                        rVar.a(i5, this.m);
                        this.V += i5;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f;
                if (bArr2 != null) {
                    n nVar3 = this.j;
                    int length = bArr2.length;
                    nVar3.a = bArr2;
                    nVar3.c = length;
                    nVar3.b = 0;
                }
            }
            this.O = true;
        }
        int i9 = i + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.a) && !"V_MPEGH/ISO/HEVC".equals(dVar.a)) {
            while (true) {
                int i10 = this.N;
                if (i10 >= i9) {
                    break;
                }
                int i11 = i9 - i10;
                n nVar4 = this.j;
                int i12 = nVar4.c - nVar4.b;
                if (i12 > 0) {
                    a2 = Math.min(i11, i12);
                    rVar.a(a2, this.j);
                } else {
                    a2 = rVar.a(bVar, i11, false);
                }
                this.N += a2;
                this.V += a2;
            }
        } else {
            byte[] bArr3 = this.f.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = dVar.P;
            int i14 = 4 - i13;
            while (this.N < i9) {
                int i15 = this.U;
                if (i15 == 0) {
                    n nVar5 = this.j;
                    int min = Math.min(i13, nVar5.c - nVar5.b);
                    bVar.b(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.j.a(bArr3, i14, min);
                    }
                    this.N += i13;
                    this.f.e(0);
                    this.U = this.f.m();
                    this.e.e(0);
                    rVar.a(4, this.e);
                    this.V += 4;
                } else {
                    n nVar6 = this.j;
                    int i16 = nVar6.c - nVar6.b;
                    if (i16 > 0) {
                        a = Math.min(i15, i16);
                        rVar.a(a, this.j);
                    } else {
                        a = rVar.a(bVar, i15, false);
                    }
                    this.N += a;
                    this.V += a;
                    this.U = i15 - a;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.a)) {
            this.h.e(0);
            rVar.a(4, this.h);
            this.V += 4;
        }
    }

    public final long a(long j) {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return z.a(j, j2, 1000L);
        }
        throw new r("Can't scale timecode prior to timecodeScale being set.");
    }
}
