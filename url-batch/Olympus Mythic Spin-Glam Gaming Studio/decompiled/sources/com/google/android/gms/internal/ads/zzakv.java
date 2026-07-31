package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzakv {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i2 + 1;
            if ((zza[i2] & i) != 0) {
                return i3;
            }
            i2 = i3;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~zza[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zzb(zzagi zzagiVar, boolean z, boolean z2, int i) throws IOException {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzagiVar.zzb(bArr, 0, 1, z)) {
                return -1L;
            }
            int zzd = zzd(bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.zzd = zzd;
            if (zzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i2 = this.zzd;
        if (i2 > i) {
            this.zzc = 0;
            return -2L;
        }
        if (i2 != 1) {
            zzagiVar.zzc(this.zzb, 1, i2 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z2);
    }

    public final int zzc() {
        return this.zzd;
    }
}
