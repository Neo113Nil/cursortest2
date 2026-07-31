package com.google.android.gms.internal.ads;

import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaiv {
    public final zzais zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaiv(zzais zzaisVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, int i2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzghc.zza(length == length2);
        zzghc.zza(jArr.length == length2);
        int length3 = iArr2.length;
        zzghc.zza(length3 == length2);
        this.zza = zzaisVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = i2;
        if (length3 > 0) {
            int i3 = length3 - 1;
            iArr2[i3] = iArr2[i3] | C.BUFFER_FLAG_LAST_SAMPLE;
        }
    }

    public final int zza(long j) {
        for (int zzm = zzeo.zzm(this.zzf, j, true, false); zzm >= 0; zzm--) {
            if ((this.zzg[zzm] & 1) != 0) {
                return zzm;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        long[] jArr = this.zzf;
        for (int zzo = zzeo.zzo(jArr, j, true, false); zzo < jArr.length; zzo++) {
            if ((this.zzg[zzo] & 1) != 0) {
                return zzo;
            }
        }
        return -1;
    }
}
