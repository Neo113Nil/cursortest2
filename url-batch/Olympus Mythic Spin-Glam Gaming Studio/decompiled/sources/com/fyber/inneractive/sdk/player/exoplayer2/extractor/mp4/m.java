package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int A = z.a("seig");
    public static final byte[] B = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f;
    public int l;
    public long m;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n o;
    public long p;
    public int q;
    public l t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j y;
    public boolean z;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.a);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);
    public final byte[] h = new byte[16];
    public final Stack i = new Stack();
    public final LinkedList j = new LinkedList();
    public final SparseArray a = new SparseArray();
    public long r = -9223372036854775807L;
    public long s = -9223372036854775807L;
    public int k = 0;
    public int n = 0;

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((l) this.a.valueAt(i)).a();
        }
        this.j.clear();
        this.q = 0;
        this.i.clear();
        this.k = 0;
        this.n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x007a, code lost:
    
        r2 = r27.t;
        r4 = r2.a;
        r8 = r4.h;
        r9 = r2.e;
        r27.u = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0088, code lost:
    
        if (r4.l == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x008a, code lost:
    
        r8 = r4.p;
        r10 = r4.a.a;
        r11 = r4.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0092, code lost:
    
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0095, code lost:
    
        r11 = r2.c.h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x009b, code lost:
    
        r10 = r11.a;
        r4 = r4.m[r9];
        r9 = r27.e;
        r11 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00a5, code lost:
    
        if (r4 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00a7, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x00ab, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.e(0);
        r2 = r2.b;
        r2.a(1, r27.e);
        r2.a(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00bc, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00be, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x00d3, code lost:
    
        r27.v = r10;
        r27.u += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x00e3, code lost:
    
        if (r27.t.c.g != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00e5, code lost:
    
        r27.u -= 8;
        r1.a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00ed, code lost:
    
        r27.k = 4;
        r27.w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x00f2, code lost:
    
        r2 = r27.t;
        r4 = r2.a;
        r5 = r2.c;
        r8 = r2.b;
        r2 = r2.e;
        r9 = r5.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0100, code lost:
    
        if (r9 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0102, code lost:
    
        r12 = r27.c.a;
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r3 = r9 + 1;
        r9 = 4 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0115, code lost:
    
        if (r27.v >= r27.u) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0117, code lost:
    
        r13 = r27.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0119, code lost:
    
        if (r13 != 0) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x014c, code lost:
    
        if (r27.x == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x014e, code lost:
    
        r27.d.c(r13);
        r1.b(r27.d.a, r7 ? 1 : 0, r27.w, r7);
        r8.a(r27.w, r27.d);
        r13 = r27.w;
        r14 = r27.d;
        r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(r14.c, r14.a);
        r27.d.e("video/hevc".equals(r5.f.f) ? 1 : 0);
        r27.d.d(r14);
        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((r4.j[r2] + r4.i[r2]) * 1000, r27.d, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x019a, code lost:
    
        r27.v += r13;
        r27.w -= r13;
        r6 = 1;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0195, code lost:
    
        r13 = r8.a(r1, r13, r7 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x011b, code lost:
    
        r1.b(r12, r9, r3, r7);
        r27.c.e(r7 ? 1 : 0);
        r27.w = r27.c.m() - r6;
        r27.b.e(r7 ? 1 : 0);
        r8.a(4, r27.b);
        r8.a(r6, r27.c);
        r27.x = r7;
        r27.v += 5;
        r27.u += r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x01ba, code lost:
    
        r6 = (r4.j[r2] + r4.i[r2]) * 1000;
        r1 = r4.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01c7, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01c9, code lost:
    
        r3 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01cd, code lost:
    
        r11 = r3 | (r4.k[r2] ? 1 : 0);
        r2 = r4.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01d7, code lost:
    
        if (r1 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01d9, code lost:
    
        r1 = r4.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01db, code lost:
    
        if (r1 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01dd, code lost:
    
        r1 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01df, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01e9, code lost:
    
        r1 = r27.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01eb, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01ed, code lost:
    
        r9 = r1.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01f4, code lost:
    
        r8.a(r9, r11, r27.u, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0200, code lost:
    
        if (r27.j.isEmpty() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0202, code lost:
    
        r1 = r27.t;
        r1.e++;
        r2 = r1.f + 1;
        r1.f = r2;
        r4 = r4.g;
        r5 = r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0215, code lost:
    
        if (r2 != r4[r5]) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0217, code lost:
    
        r1.g = r5 + 1;
        r2 = 0;
        r1.f = 0;
        r27.t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0224, code lost:
    
        r27.k = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0226, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0222, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0227, code lost:
    
        r27.q -= ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k) r27.j.removeFirst()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0237, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x01f3, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01e1, code lost:
    
        r1 = r5.h[r2].b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01e8, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x01cc, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01a8, code lost:
    
        r3 = r27.v;
        r6 = r27.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x01ac, code lost:
    
        if (r3 >= r6) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x01ae, code lost:
    
        r27.v += r8.a(r1, r6 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x00c0, code lost:
    
        r4 = r8.o();
        r8.e(r8.b - 2);
        r4 = (r4 * 6) + 2;
        r2.a(r4, r8);
        r10 = (r10 + 1) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x00aa, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x00db, code lost:
    
        r27.v = 0;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        long n;
        long n2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = bVar;
        while (true) {
            int i = this.k;
            int i2 = 1;
            boolean z = false;
            if (i == 0) {
                if (this.n == 0) {
                    if (!bVar2.b(this.g.a, 0, 8, true)) {
                        return -1;
                    }
                    this.n = 8;
                    this.g.e(0);
                    this.m = this.g.k();
                    this.l = this.g.b();
                }
                if (this.m == 1) {
                    bVar2.b(this.g.a, 8, 8, false);
                    this.n += 8;
                    this.m = this.g.n();
                }
                long j = this.m;
                long j2 = this.n;
                if (j >= j2) {
                    long j3 = bVar2.c - j2;
                    if (this.l == c.L) {
                        int size = this.a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            u uVar = ((l) this.a.valueAt(i3)).a;
                            uVar.getClass();
                            uVar.c = j3;
                            uVar.b = j3;
                        }
                    }
                    int i4 = this.l;
                    if (i4 == c.i) {
                        this.t = null;
                        this.p = j3 + this.m;
                        if (!this.z) {
                            this.y.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(this.r));
                            this.z = true;
                        }
                        this.k = 2;
                    } else if (i4 != c.C && i4 != c.E && i4 != c.F && i4 != c.G && i4 != c.H && i4 != c.L && i4 != c.M && i4 != c.N && i4 != c.Q) {
                        if (i4 == c.T || i4 == c.S || i4 == c.D || i4 == c.B || i4 == c.U || i4 == c.x || i4 == c.y || i4 == c.P || i4 == c.z || i4 == c.A || i4 == c.V || i4 == c.d0 || i4 == c.e0 || i4 == c.i0 || i4 == c.h0 || i4 == c.f0 || i4 == c.g0 || i4 == c.R || i4 == c.O || i4 == c.G0) {
                            if (this.n == 8) {
                                long j4 = this.m;
                                if (j4 <= 2147483647L) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j4);
                                    this.o = nVar;
                                    System.arraycopy(this.g.a, 0, nVar.a, 0, 8);
                                    this.k = 1;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.m <= 2147483647L) {
                            this.o = null;
                            this.k = 1;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        long j5 = (bVar2.c + this.m) - 8;
                        this.i.add(new a(this.l, j5));
                        if (this.m == this.n) {
                            a(j5);
                        } else {
                            this.k = 0;
                            this.n = 0;
                        }
                    }
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Atom size less than header length (unsupported).");
                }
            } else if (i != 1) {
                long j6 = Long.MAX_VALUE;
                if (i != 2) {
                    if (i != 3) {
                        break;
                    }
                    if (this.t != null) {
                        break;
                    }
                    SparseArray sparseArray = this.a;
                    int size2 = sparseArray.size();
                    l lVar = null;
                    for (int i5 = 0; i5 < size2; i5++) {
                        l lVar2 = (l) sparseArray.valueAt(i5);
                        int i6 = lVar2.g;
                        u uVar2 = lVar2.a;
                        if (i6 != uVar2.d) {
                            long j7 = uVar2.f[i6];
                            if (j7 < j6) {
                                lVar = lVar2;
                                j6 = j7;
                            }
                        }
                    }
                    if (lVar == null) {
                        int i7 = (int) (this.p - bVar2.c);
                        if (i7 >= 0) {
                            bVar2.a(i7);
                            this.k = 0;
                            this.n = 0;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to end of mdat was negative.");
                        }
                    } else {
                        int i8 = (int) (lVar.a.f[lVar.g] - bVar2.c);
                        if (i8 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i8 = 0;
                        }
                        bVar2.a(i8);
                        this.t = lVar;
                    }
                } else {
                    int size3 = this.a.size();
                    l lVar3 = null;
                    for (int i9 = 0; i9 < size3; i9++) {
                        u uVar3 = ((l) this.a.valueAt(i9)).a;
                        if (uVar3.q) {
                            long j8 = uVar3.c;
                            if (j8 < j6) {
                                lVar3 = (l) this.a.valueAt(i9);
                                j6 = j8;
                            }
                        }
                    }
                    if (lVar3 == null) {
                        this.k = 3;
                    } else {
                        int i10 = (int) (j6 - bVar2.c);
                        if (i10 >= 0) {
                            bVar2.a(i10);
                            u uVar4 = lVar3.a;
                            bVar2.b(uVar4.p.a, 0, uVar4.o, false);
                            uVar4.p.e(0);
                            uVar4.q = false;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i11 = ((int) this.m) - this.n;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.o;
                if (nVar2 != null) {
                    bVar2.b(nVar2.a, 8, i11, false);
                    int i12 = this.l;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.o;
                    b bVar3 = new b(i12, nVar3);
                    long j9 = bVar2.c;
                    if (!this.i.isEmpty()) {
                        ((a) this.i.peek()).Q0.add(bVar3);
                    } else {
                        if (i12 == c.B) {
                            nVar3.e(8);
                            int b = (nVar3.b() >> 24) & 255;
                            nVar3.e(nVar3.b + 4);
                            long k = nVar3.k();
                            if (b == 0) {
                                n = nVar3.k();
                                n2 = nVar3.k();
                            } else {
                                n = nVar3.n();
                                n2 = nVar3.n();
                            }
                            long j10 = n2 + j9;
                            long j11 = n;
                            long j12 = j10;
                            long a = z.a(j11, 1000000L, k);
                            nVar3.e(nVar3.b + 2);
                            int o = nVar3.o();
                            int[] iArr = new int[o];
                            long[] jArr = new long[o];
                            long[] jArr2 = new long[o];
                            long[] jArr3 = new long[o];
                            long j13 = j11;
                            long j14 = a;
                            int i13 = 0;
                            while (i13 < o) {
                                int b2 = nVar3.b();
                                if ((Integer.MIN_VALUE & b2) == 0) {
                                    long k2 = nVar3.k();
                                    iArr[i13] = b2 & Integer.MAX_VALUE;
                                    jArr[i13] = j12;
                                    jArr3[i13] = j14;
                                    long j15 = j13 + k2;
                                    long[] jArr4 = jArr3;
                                    long[] jArr5 = jArr2;
                                    long a2 = z.a(j15, 1000000L, k);
                                    jArr5[i13] = a2 - jArr4[i13];
                                    nVar3.e(nVar3.b + 4);
                                    j12 += iArr[i13];
                                    i13++;
                                    jArr2 = jArr5;
                                    jArr = jArr;
                                    jArr3 = jArr4;
                                    o = o;
                                    j13 = j15;
                                    j14 = a2;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(a), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr, jArr, jArr2, jArr3));
                            this.s = ((Long) create.first).longValue();
                            this.y.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.q) create.second);
                            this.z = true;
                        }
                        bVar2 = bVar;
                    }
                } else {
                    bVar2.a(i11);
                }
                a(bVar2.c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:311:0x06d7, code lost:
    
        r2 = r0;
        r2.k = 0;
        r2.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06dd, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        s a;
        m mVar;
        a aVar;
        SparseArray sparseArray;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        u uVar;
        int size;
        int i5;
        byte[] bArr2;
        int i6;
        a aVar2;
        int i7;
        byte[] bArr3;
        int i8;
        a aVar3;
        u uVar2;
        ArrayList arrayList;
        l lVar;
        int i9;
        int i10;
        long j2;
        int i11;
        int i12;
        long j3;
        boolean z;
        int i13;
        boolean z2;
        int i14;
        boolean z3;
        int i15;
        boolean z4;
        j jVar;
        boolean z5;
        loop0: while (true) {
            m mVar2 = this;
            while (!mVar2.i.isEmpty() && ((a) mVar2.i.peek()).P0 == j) {
                a aVar4 = (a) mVar2.i.pop();
                int i16 = aVar4.a;
                int i17 = 12;
                int i18 = 8;
                int i19 = 1;
                if (i16 == c.C) {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.d a2 = a(aVar4.Q0);
                    a b = aVar4.b(c.N);
                    SparseArray sparseArray2 = new SparseArray();
                    int size2 = b.Q0.size();
                    long j4 = -9223372036854775807L;
                    int i20 = 0;
                    while (i20 < size2) {
                        b bVar = (b) b.Q0.get(i20);
                        int i21 = bVar.a;
                        if (i21 == c.z) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
                            nVar.e(i17);
                            Pair create = Pair.create(Integer.valueOf(nVar.b()), new j(nVar.m() - 1, nVar.m(), nVar.m(), nVar.b()));
                            sparseArray2.put(((Integer) create.first).intValue(), (j) create.second);
                        } else if (i21 == c.O) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = bVar.P0;
                            nVar2.e(8);
                            j4 = ((nVar2.b() >> 24) & 255) == 0 ? nVar2.k() : nVar2.n();
                        }
                        i20++;
                        i17 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size3 = aVar4.R0.size();
                    for (int i22 = 0; i22 < size3; i22++) {
                        a aVar5 = (a) aVar4.R0.get(i22);
                        if (aVar5.a == c.E && (a = i.a(aVar5, aVar4.c(c.D), j4, a2, false)) != null) {
                            sparseArray3.put(a.a, a);
                        }
                    }
                    int size4 = sparseArray3.size();
                    if (mVar2.a.size() == 0) {
                        for (int i23 = 0; i23 < size4; i23++) {
                            s sVar = (s) sparseArray3.valueAt(i23);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3 = mVar2.y.a(i23, sVar.b);
                            l lVar2 = new l(a3);
                            j jVar2 = (j) sparseArray2.get(sVar.a);
                            lVar2.c = sVar;
                            jVar2.getClass();
                            lVar2.d = jVar2;
                            a3.a(sVar.f);
                            lVar2.a();
                            mVar2.a.put(sVar.a, lVar2);
                            mVar2.r = Math.max(mVar2.r, sVar.e);
                        }
                        mVar2.y.b();
                    } else {
                        if (mVar2.a.size() != size4) {
                            throw new IllegalStateException();
                        }
                        for (int i24 = 0; i24 < size4; i24++) {
                            s sVar2 = (s) sparseArray3.valueAt(i24);
                            l lVar3 = (l) mVar2.a.get(sVar2.a);
                            j jVar3 = (j) sparseArray2.get(sVar2.a);
                            lVar3.getClass();
                            lVar3.c = sVar2;
                            jVar3.getClass();
                            lVar3.d = jVar3;
                            lVar3.b.a(sVar2.f);
                            lVar3.a();
                        }
                    }
                } else {
                    if (i16 == c.L) {
                        SparseArray sparseArray4 = mVar2.a;
                        byte[] bArr4 = mVar2.h;
                        int size5 = aVar4.R0.size();
                        int i25 = 0;
                        while (i25 < size5) {
                            a aVar6 = (a) aVar4.R0.get(i25);
                            if (aVar6.a == c.M) {
                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = aVar6.c(c.y).P0;
                                nVar3.e(i18);
                                int b2 = nVar3.b();
                                l lVar4 = (l) sparseArray4.get(nVar3.b());
                                if (lVar4 == null) {
                                    lVar4 = null;
                                } else {
                                    if ((b2 & 1) != 0) {
                                        long n = nVar3.n();
                                        u uVar3 = lVar4.a;
                                        uVar3.b = n;
                                        uVar3.c = n;
                                    }
                                    j jVar4 = lVar4.d;
                                    lVar4.a.a = new j((b2 & 2) != 0 ? nVar3.m() - i19 : jVar4.a, (b2 & 8) != 0 ? nVar3.m() : jVar4.b, (b2 & 16) != 0 ? nVar3.m() : jVar4.c, (b2 & 32) != 0 ? nVar3.m() : jVar4.d);
                                }
                                if (lVar4 != null) {
                                    u uVar4 = lVar4.a;
                                    long j5 = uVar4.r;
                                    lVar4.a();
                                    int i26 = c.x;
                                    if (aVar6.c(i26) != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVar6.c(i26).P0;
                                        nVar4.e(i18);
                                        j5 = ((nVar4.b() >> 24) & 255) == i19 ? nVar4.n() : nVar4.k();
                                    }
                                    ArrayList arrayList2 = aVar6.Q0;
                                    int size6 = arrayList2.size();
                                    int i27 = 0;
                                    int i28 = 0;
                                    int i29 = 0;
                                    while (i29 < size6) {
                                        SparseArray sparseArray5 = sparseArray4;
                                        b bVar2 = (b) arrayList2.get(i29);
                                        int i30 = size5;
                                        long j6 = j5;
                                        if (bVar2.a == c.A) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = bVar2.P0;
                                            nVar5.e(12);
                                            int m = nVar5.m();
                                            if (m > 0) {
                                                i27 += m;
                                                i28++;
                                            }
                                        }
                                        i29++;
                                        size5 = i30;
                                        sparseArray4 = sparseArray5;
                                        j5 = j6;
                                    }
                                    sparseArray = sparseArray4;
                                    i = size5;
                                    long j7 = j5;
                                    lVar4.g = 0;
                                    lVar4.f = 0;
                                    lVar4.e = 0;
                                    u uVar5 = lVar4.a;
                                    uVar5.d = i28;
                                    uVar5.e = i27;
                                    int[] iArr = uVar5.g;
                                    if (iArr == null || iArr.length < i28) {
                                        uVar5.f = new long[i28];
                                        uVar5.g = new int[i28];
                                    }
                                    int[] iArr2 = uVar5.h;
                                    if (iArr2 == null || iArr2.length < i27) {
                                        int i31 = (i27 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                        uVar5.h = new int[i31];
                                        uVar5.i = new int[i31];
                                        uVar5.j = new long[i31];
                                        uVar5.k = new boolean[i31];
                                        uVar5.m = new boolean[i31];
                                    }
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (i32 < size6) {
                                        b bVar3 = (b) arrayList2.get(i32);
                                        if (bVar3.a == c.A) {
                                            int i35 = i33 + 1;
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVar3.P0;
                                            nVar6.e(8);
                                            int b3 = nVar6.b();
                                            s sVar3 = lVar4.c;
                                            arrayList = arrayList2;
                                            u uVar6 = lVar4.a;
                                            j jVar5 = uVar6.a;
                                            i9 = size6;
                                            uVar6.g[i33] = nVar6.m();
                                            long[] jArr = uVar6.f;
                                            aVar2 = aVar4;
                                            long j8 = uVar6.b;
                                            jArr[i33] = j8;
                                            if ((b3 & 1) != 0) {
                                                i8 = i25;
                                                aVar3 = aVar6;
                                                uVar2 = uVar4;
                                                jArr[i33] = j8 + nVar6.b();
                                            } else {
                                                i8 = i25;
                                                aVar3 = aVar6;
                                                uVar2 = uVar4;
                                            }
                                            boolean z6 = (b3 & 4) != 0;
                                            int i36 = jVar5.d;
                                            if (z6) {
                                                i36 = nVar6.m();
                                            }
                                            boolean z7 = (b3 & 256) != 0;
                                            boolean z8 = (b3 & 512) != 0;
                                            boolean z9 = (b3 & 1024) != 0;
                                            boolean z10 = (b3 & 2048) != 0;
                                            long[] jArr2 = sVar3.i;
                                            int i37 = i36;
                                            if (jArr2 != null) {
                                                bArr3 = bArr4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i10 = i32;
                                                    j2 = z.a(sVar3.j[0], 1000L, sVar3.c);
                                                    int[] iArr3 = uVar6.h;
                                                    lVar = lVar4;
                                                    int[] iArr4 = uVar6.i;
                                                    i7 = i10;
                                                    long[] jArr3 = uVar6.j;
                                                    boolean[] zArr = uVar6.k;
                                                    i11 = uVar6.g[i33] + i34;
                                                    long j9 = j2;
                                                    long j10 = sVar3.c;
                                                    if (i33 <= 0) {
                                                        i12 = i34;
                                                        j3 = uVar6.r;
                                                    } else {
                                                        i12 = i34;
                                                        j3 = j7;
                                                    }
                                                    while (i12 < i11) {
                                                        if (z7) {
                                                            z = z7;
                                                            i13 = nVar6.m();
                                                        } else {
                                                            z = z7;
                                                            i13 = jVar5.b;
                                                        }
                                                        if (z8) {
                                                            z2 = z8;
                                                            i14 = nVar6.m();
                                                        } else {
                                                            z2 = z8;
                                                            i14 = jVar5.c;
                                                        }
                                                        if (i12 == 0 && z6) {
                                                            z3 = z6;
                                                            i15 = i37;
                                                        } else if (z9) {
                                                            z3 = z6;
                                                            i15 = nVar6.b();
                                                        } else {
                                                            z3 = z6;
                                                            i15 = jVar5.d;
                                                        }
                                                        if (z10) {
                                                            z4 = z9;
                                                            jVar = jVar5;
                                                            z5 = z10;
                                                            iArr4[i12] = (int) ((nVar6.b() * 1000) / j10);
                                                        } else {
                                                            z4 = z9;
                                                            jVar = jVar5;
                                                            z5 = z10;
                                                            iArr4[i12] = 0;
                                                        }
                                                        jArr3[i12] = z.a(j3, 1000L, j10) - j9;
                                                        iArr3[i12] = i14;
                                                        zArr[i12] = ((i15 >> 16) & 1) == 0;
                                                        j3 += i13;
                                                        i12++;
                                                        z7 = z;
                                                        z8 = z2;
                                                        z6 = z3;
                                                        z9 = z4;
                                                        jVar5 = jVar;
                                                        z10 = z5;
                                                    }
                                                    uVar6.r = j3;
                                                    i34 = i11;
                                                    i33 = i35;
                                                }
                                            } else {
                                                bArr3 = bArr4;
                                            }
                                            i10 = i32;
                                            j2 = 0;
                                            int[] iArr32 = uVar6.h;
                                            lVar = lVar4;
                                            int[] iArr42 = uVar6.i;
                                            i7 = i10;
                                            long[] jArr32 = uVar6.j;
                                            boolean[] zArr2 = uVar6.k;
                                            i11 = uVar6.g[i33] + i34;
                                            long j92 = j2;
                                            long j102 = sVar3.c;
                                            if (i33 <= 0) {
                                            }
                                            while (i12 < i11) {
                                            }
                                            uVar6.r = j3;
                                            i34 = i11;
                                            i33 = i35;
                                        } else {
                                            aVar2 = aVar4;
                                            i7 = i32;
                                            bArr3 = bArr4;
                                            i8 = i25;
                                            aVar3 = aVar6;
                                            uVar2 = uVar4;
                                            arrayList = arrayList2;
                                            lVar = lVar4;
                                            i9 = size6;
                                        }
                                        i32 = i7 + 1;
                                        arrayList2 = arrayList;
                                        size6 = i9;
                                        aVar4 = aVar2;
                                        i25 = i8;
                                        aVar6 = aVar3;
                                        uVar4 = uVar2;
                                        bArr4 = bArr3;
                                        lVar4 = lVar;
                                    }
                                    aVar = aVar4;
                                    byte[] bArr5 = bArr4;
                                    i2 = i25;
                                    u uVar7 = uVar4;
                                    l lVar5 = lVar4;
                                    b c = aVar6.c(c.d0);
                                    if (c != null) {
                                        uVar = uVar7;
                                        t tVar = lVar5.c.h[uVar.a.a];
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = c.P0;
                                        int i38 = tVar.a;
                                        nVar7.e(8);
                                        if ((nVar7.b() & 1) == 1) {
                                            nVar7.e(nVar7.b + 8);
                                        }
                                        int j11 = nVar7.j();
                                        int m2 = nVar7.m();
                                        if (m2 == uVar.e) {
                                            if (j11 == 0) {
                                                boolean[] zArr3 = uVar.m;
                                                i6 = 0;
                                                for (int i39 = 0; i39 < m2; i39++) {
                                                    int j12 = nVar7.j();
                                                    i6 += j12;
                                                    zArr3[i39] = j12 > i38;
                                                }
                                            } else {
                                                i6 = j11 * m2;
                                                Arrays.fill(uVar.m, 0, m2, j11 > i38);
                                            }
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = uVar.p;
                                            if (nVar8 == null || nVar8.c < i6) {
                                                uVar.p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i6);
                                            }
                                            uVar.o = i6;
                                            uVar.l = true;
                                            uVar.q = true;
                                        } else {
                                            StringBuilder a4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", m2, ", ");
                                            a4.append(uVar.e);
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(a4.toString());
                                        }
                                    } else {
                                        uVar = uVar7;
                                    }
                                    b c2 = aVar6.c(c.e0);
                                    if (c2 != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = c2.P0;
                                        nVar9.e(8);
                                        int b4 = nVar9.b();
                                        if ((b4 & 1) == 1) {
                                            nVar9.e(nVar9.b + 8);
                                        }
                                        int m3 = nVar9.m();
                                        if (m3 != 1) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected saio entry count: ", m3));
                                        }
                                        uVar.c += ((b4 >> 24) & 255) == 0 ? nVar9.k() : nVar9.n();
                                    }
                                    b c3 = aVar6.c(c.i0);
                                    if (c3 != null) {
                                        a(c3.P0, 0, uVar);
                                    }
                                    b c4 = aVar6.c(c.f0);
                                    b c5 = aVar6.c(c.g0);
                                    if (c4 != null && c5 != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar10 = c4.P0;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar11 = c5.P0;
                                        nVar10.e(8);
                                        int b5 = nVar10.b();
                                        int b6 = nVar10.b();
                                        int i40 = A;
                                        if (b6 == i40) {
                                            if (((b5 >> 24) & 255) == 1) {
                                                nVar10.e(nVar10.b + 4);
                                            }
                                            if (nVar10.b() == 1) {
                                                nVar11.e(8);
                                                int b7 = nVar11.b();
                                                if (nVar11.b() != i40) {
                                                    i4 = 1;
                                                } else {
                                                    int i41 = (b7 >> 24) & 255;
                                                    if (i41 == 1) {
                                                        if (nVar11.k() == 0) {
                                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Variable length decription in sgpd found (unsupported)");
                                                        }
                                                    } else if (i41 >= 2) {
                                                        nVar11.e(nVar11.b + 4);
                                                    }
                                                    if (nVar11.k() == 1) {
                                                        nVar11.e(nVar11.b + 2);
                                                        i4 = 1;
                                                        if (nVar11.j() == 1) {
                                                            int j13 = nVar11.j();
                                                            byte[] bArr6 = new byte[16];
                                                            nVar11.a(bArr6, 0, 16);
                                                            uVar.l = true;
                                                            uVar.n = new t(j13, bArr6);
                                                        }
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sgpd != 1 (unsupported).");
                                                    }
                                                }
                                                size = aVar6.Q0.size();
                                                i5 = 0;
                                                while (i5 < size) {
                                                    b bVar4 = (b) aVar6.Q0.get(i5);
                                                    if (bVar4.a == c.h0) {
                                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar12 = bVar4.P0;
                                                        nVar12.e(8);
                                                        bArr2 = bArr5;
                                                        nVar12.a(bArr2, 0, 16);
                                                        if (Arrays.equals(bArr2, B)) {
                                                            a(nVar12, 16, uVar);
                                                        }
                                                    } else {
                                                        bArr2 = bArr5;
                                                    }
                                                    i5++;
                                                    bArr5 = bArr2;
                                                }
                                                bArr = bArr5;
                                                i3 = 8;
                                                i18 = i3;
                                                size5 = i;
                                                sparseArray4 = sparseArray;
                                                aVar4 = aVar;
                                                i25 = i2 + 1;
                                                byte[] bArr7 = bArr;
                                                i19 = i4;
                                                bArr4 = bArr7;
                                            } else {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sbgp != 1 (unsupported).");
                                            }
                                        }
                                    }
                                    i4 = 1;
                                    size = aVar6.Q0.size();
                                    i5 = 0;
                                    while (i5 < size) {
                                    }
                                    bArr = bArr5;
                                    i3 = 8;
                                    i18 = i3;
                                    size5 = i;
                                    sparseArray4 = sparseArray;
                                    aVar4 = aVar;
                                    i25 = i2 + 1;
                                    byte[] bArr72 = bArr;
                                    i19 = i4;
                                    bArr4 = bArr72;
                                }
                            }
                            aVar = aVar4;
                            sparseArray = sparseArray4;
                            i = size5;
                            i2 = i25;
                            i3 = i18;
                            int i42 = i19;
                            bArr = bArr4;
                            i4 = i42;
                            i18 = i3;
                            size5 = i;
                            sparseArray4 = sparseArray;
                            aVar4 = aVar;
                            i25 = i2 + 1;
                            byte[] bArr722 = bArr;
                            i19 = i4;
                            bArr4 = bArr722;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.drm.d a5 = a(aVar4.Q0);
                        if (a5 != null) {
                            mVar = this;
                            int size7 = mVar.a.size();
                            for (int i43 = 0; i43 < size7; i43++) {
                                l lVar6 = (l) mVar.a.valueAt(i43);
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = lVar6.b;
                                com.fyber.inneractive.sdk.player.exoplayer2.o oVar = lVar6.c.f;
                                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.a, oVar.e, oVar.f, oVar.c, oVar.b, oVar.g, oVar.j, oVar.k, oVar.l, oVar.m, oVar.n, oVar.p, oVar.o, oVar.q, oVar.r, oVar.s, oVar.t, oVar.u, oVar.v, oVar.x, oVar.y, oVar.z, oVar.w, oVar.h, a5, oVar.d));
                            }
                        }
                    } else {
                        mVar = mVar2;
                        if (!mVar.i.isEmpty()) {
                            ((a) mVar.i.peek()).R0.add(aVar4);
                        }
                    }
                    mVar2 = mVar;
                }
            }
        }
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, u uVar) {
        nVar.e(i + 8);
        int b = nVar.b();
        int i2 = c.b;
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int m = nVar.m();
            if (m == uVar.e) {
                Arrays.fill(uVar.m, 0, m, z);
                int i3 = nVar.c - nVar.b;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.p;
                if (nVar2 == null || nVar2.c < i3) {
                    uVar.p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i3);
                }
                uVar.o = i3;
                uVar.l = true;
                uVar.q = true;
                nVar.a(uVar.p.a, 0, i3);
                uVar.p.e(0);
                uVar.q = false;
                return;
            }
            StringBuilder a = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", m, ", ");
            a.append(uVar.e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(a.toString());
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            if (bVar.a == c.V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.P0.a;
                UUID a = q.a(bArr);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(a, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }
}
