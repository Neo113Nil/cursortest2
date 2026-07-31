package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes14.dex */
public final class d implements h {
    public static final byte[] r = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r g;
    public boolean k;
    public boolean l;
    public long m;
    public int n;
    public long o;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r p;
    public long q;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[7]);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(Arrays.copyOf(r, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;

    public d(boolean z, String str) {
        this.a = z;
        this.d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i = 7;
        while (true) {
            int i2 = nVar.c;
            int i3 = nVar.b;
            int i4 = i2 - i3;
            if (i4 <= 0) {
                return;
            }
            int i5 = this.h;
            if (i5 == 0) {
                byte[] bArr = nVar.a;
                while (true) {
                    if (i3 >= i2) {
                        nVar.e(i3);
                        break;
                    }
                    int i6 = i3 + 1;
                    byte b = bArr[i3];
                    int i7 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i8 = this.j;
                    if (i8 != 512 || i7 < 240 || i7 == 255) {
                        int i9 = i8 | i7;
                        if (i9 == 329) {
                            this.j = 768;
                        } else if (i9 == 511) {
                            this.j = 512;
                        } else if (i9 == 836) {
                            this.j = 1024;
                        } else {
                            if (i9 == 1075) {
                                this.h = 1;
                                this.i = 3;
                                this.n = 0;
                                this.c.e(0);
                                nVar.e(i6);
                                break;
                            }
                            if (i8 != 256) {
                                this.j = 256;
                            }
                        }
                        i3 = i6;
                    } else {
                        this.k = (b & 1) == 0;
                        this.h = 2;
                        this.i = 0;
                        nVar.e(i6);
                    }
                }
                i = 7;
            } else if (i5 == 1) {
                byte[] bArr2 = this.c.a;
                int min = Math.min(i4, 10 - this.i);
                nVar.a(bArr2, this.i, min);
                int i10 = this.i + min;
                this.i = i10;
                if (i10 == 10) {
                    this.g.a(10, this.c);
                    this.c.e(6);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.g;
                    int i11 = this.c.i() + 10;
                    this.h = 3;
                    this.i = 10;
                    this.p = rVar;
                    this.q = 0L;
                    this.n = i11;
                }
            } else if (i5 == 2) {
                int i12 = this.k ? i : 5;
                byte[] bArr3 = this.b.a;
                int min2 = Math.min(i4, i12 - this.i);
                nVar.a(bArr3, this.i, min2);
                int i13 = this.i + min2;
                this.i = i13;
                if (i13 == i12) {
                    this.b.b(0);
                    if (this.l) {
                        this.b.c(10);
                    } else {
                        int a = this.b.a(2) + 1;
                        if (a != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + a + ", but assuming AAC LC.");
                            a = 2;
                        }
                        int a2 = this.b.a(4);
                        this.b.c(1);
                        byte[] bArr4 = {(byte) (((a << 3) & 248) | ((a2 >> 1) & i)), (byte) (((a2 << i) & 128) | ((this.b.a(3) << 3) & 120))};
                        Pair a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr4);
                        com.fyber.inneractive.sdk.player.exoplayer2.o a4 = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.e, "audio/mp4a-latm", -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), Collections.singletonList(bArr4), null, this.d);
                        this.m = 1024000000 / a4.s;
                        this.f.a(a4);
                        this.l = true;
                    }
                    this.b.c(4);
                    int a5 = this.b.a(13);
                    int i14 = a5 - 7;
                    if (this.k) {
                        i14 = a5 - 9;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f;
                    long j = this.m;
                    this.h = 3;
                    this.i = 0;
                    this.p = rVar2;
                    this.q = j;
                    this.n = i14;
                }
            } else if (i5 == 3) {
                int min3 = Math.min(i4, this.n - this.i);
                this.p.a(min3, nVar);
                int i15 = this.i + min3;
                this.i = i15;
                int i16 = this.n;
                if (i15 == i16) {
                    this.p.a(this.o, 1, i16, 0, null);
                    this.o += this.q;
                    this.h = 0;
                    this.i = 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.e = e0Var.e;
        e0Var.b();
        this.f = jVar.a(e0Var.d, 1);
        if (this.a) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(e0Var.d, 4);
            this.g = a;
            e0Var.b();
            a.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
            return;
        }
        this.g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.h();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z, long j) {
        this.o = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }
}
