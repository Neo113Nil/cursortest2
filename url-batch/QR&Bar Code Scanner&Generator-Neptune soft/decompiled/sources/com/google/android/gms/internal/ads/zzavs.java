package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzavs {
    private final zzbak zza = new zzbak(8);
    private int zzb;

    private final long zzb(zzauy zzauyVar) throws IOException, InterruptedException {
        int i = 0;
        zzauyVar.zzg(this.zza.zza, 0, 1, false);
        int i2 = this.zza.zza[0] & UByte.MAX_VALUE;
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
        zzauyVar.zzg(this.zza.zza, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.zza.zza[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.zzb += i4 + 1;
        return i5;
    }

    public final boolean zza(zzauy zzauyVar) throws IOException, InterruptedException {
        long zzc = zzauyVar.zzc();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (zzc != -1 && zzc <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = zzc;
        }
        int i = (int) j;
        zzauyVar.zzg(this.zza.zza, 0, 4, false);
        long zzm = this.zza.zzm();
        this.zzb = 4;
        while (zzm != 440786851) {
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzauyVar.zzg(this.zza.zza, 0, 1, false);
            zzm = ((zzm << 8) & (-256)) | (this.zza.zza[0] & UByte.MAX_VALUE);
        }
        long zzb = zzb(zzauyVar);
        long j2 = this.zzb;
        if (zzb != Long.MIN_VALUE && (zzc == -1 || j2 + zzb < zzc)) {
            while (true) {
                long j3 = this.zzb;
                long j4 = j2 + zzb;
                if (j3 < j4) {
                    if (zzb(zzauyVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long zzb2 = zzb(zzauyVar);
                    if (zzb2 < 0) {
                        return false;
                    }
                    if (zzb2 != 0) {
                        zzauyVar.zzf((int) zzb2, false);
                        this.zzb = (int) (this.zzb + zzb2);
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
