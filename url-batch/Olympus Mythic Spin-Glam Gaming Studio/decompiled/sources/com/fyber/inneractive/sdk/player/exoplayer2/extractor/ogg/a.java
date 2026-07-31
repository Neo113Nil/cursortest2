package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* loaded from: classes4.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return (this.a.f * 1000000) / r0.d.i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        if (j == 0) {
            return this.a.b;
        }
        b bVar = this.a;
        long j2 = (bVar.d.i * j) / 1000000;
        long j3 = bVar.b;
        long j4 = bVar.c;
        long j5 = ((((j4 - j3) * j2) / bVar.f) - 30000) + j3;
        if (j5 >= j3) {
            j3 = j5;
        }
        return j3 >= j4 ? j4 - 1 : j3;
    }
}
