package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public l a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        boolean z;
        boolean equals;
        try {
            g gVar = new g();
            if (gVar.a(bVar, true) && (gVar.a & 2) == 2) {
                int min = Math.min(gVar.e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(min);
                bVar.a(nVar.a, 0, min, false);
                nVar.e(0);
                if (nVar.c - nVar.b >= 5 && nVar.j() == 127 && nVar.k() == 1179402563) {
                    this.a = new d();
                } else {
                    nVar.e(0);
                    try {
                        z = s.a(1, nVar, true);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused) {
                        z = false;
                    }
                    if (z) {
                        this.a = new o();
                    } else {
                        nVar.e(0);
                        int i = i.o;
                        int i2 = nVar.c - nVar.b;
                        byte[] bArr = i.p;
                        if (i2 < bArr.length) {
                            equals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            nVar.a(bArr2, 0, bArr.length);
                            equals = Arrays.equals(bArr2, bArr);
                        }
                        if (equals) {
                            this.a = new i();
                        }
                    }
                }
                return true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(0, 1);
        jVar.b();
        l lVar = this.a;
        lVar.c = jVar;
        lVar.b = a;
        lVar.a = new f();
        lVar.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        l lVar = this.a;
        f fVar = lVar.a;
        g gVar = fVar.a;
        gVar.a = 0;
        gVar.b = 0L;
        gVar.c = 0;
        gVar.d = 0;
        gVar.e = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = fVar.b;
        nVar.b = 0;
        nVar.c = 0;
        fVar.c = -1;
        fVar.e = false;
        if (j == 0) {
            lVar.a(!lVar.l);
        } else if (lVar.h != 0) {
            lVar.e = lVar.d.c(j2);
            lVar.h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        l lVar = this.a;
        int i = lVar.h;
        if (i == 0) {
            boolean z = true;
            while (z) {
                if (!lVar.a.a(bVar)) {
                    lVar.h = 3;
                    return -1;
                }
                long j = bVar.c;
                long j2 = lVar.f;
                lVar.k = j - j2;
                z = lVar.a(lVar.a.b, j2, lVar.j);
                if (z) {
                    lVar.f = bVar.c;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = lVar.j.a;
            lVar.i = oVar2.s;
            if (!lVar.m) {
                lVar.b.a(oVar2);
                lVar.m = true;
            }
            c cVar = lVar.j.b;
            if (cVar != null) {
                lVar.d = cVar;
            } else {
                long j3 = bVar.b;
                if (j3 == -1) {
                    lVar.d = new k();
                } else {
                    g gVar = lVar.a.a;
                    lVar.d = new b(lVar.f, j3, lVar, gVar.d + gVar.e, gVar.b);
                }
            }
            lVar.j = null;
            lVar.h = 2;
            lVar.a.a();
        } else if (i == 1) {
            bVar.a((int) lVar.f);
            lVar.h = 2;
        } else if (i == 2) {
            long a = lVar.d.a(bVar);
            if (a >= 0) {
                oVar.a = a;
                return 1;
            }
            if (a < -1) {
                lVar.a(-(a + 2));
            }
            if (!lVar.l) {
                lVar.c.a(lVar.d.b());
                lVar.l = true;
            }
            if (lVar.k <= 0 && !lVar.a.a(bVar)) {
                lVar.h = 3;
                return -1;
            }
            lVar.k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = lVar.a.b;
            long a2 = lVar.a(nVar);
            if (a2 >= 0) {
                long j4 = lVar.g;
                if (j4 + a2 >= lVar.e) {
                    lVar.b.a(nVar.c, nVar);
                    lVar.b.a((j4 * 1000000) / lVar.i, 1, nVar.c, 0, null);
                    lVar.e = -1L;
                }
            }
            lVar.g += a2;
        } else {
            throw new IllegalStateException();
        }
        return 0;
    }
}
