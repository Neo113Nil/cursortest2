package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes14.dex */
public final class f {
    public final n a = new n(8);
    public int b;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int i = 0;
        bVar.a(this.a.a, 0, 1, false);
        int i2 = this.a.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        bVar.a(this.a.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.a.a[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
