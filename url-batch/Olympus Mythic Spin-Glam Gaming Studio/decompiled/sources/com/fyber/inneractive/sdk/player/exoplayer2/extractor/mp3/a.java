package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* loaded from: classes14.dex */
public final class a implements b {
    public final long a;
    public final int b;
    public final long c;

    public a(int i, long j, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2 == -1 ? -9223372036854775807L : b(j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j) {
        return (Math.max(0L, j - this.a) * 8000000) / this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        long j2 = this.c;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        int i = z.a;
        return ((Math.max(0L, Math.min(j, j2)) * this.b) / 8000000) + this.a;
    }
}
