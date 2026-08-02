package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaxq implements zzayq {
    private final zzayq[] zza;

    public zzaxq(zzayq[] zzayqVarArr) {
        this.zza = zzayqVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzayq zzayqVar : this.zza) {
            long zza = zzayqVar.zza();
            if (zza != Long.MIN_VALUE) {
                j = Math.min(j, zza);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzayq
    public final boolean zzbj(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzayq zzayqVar : this.zza) {
                if (zzayqVar.zza() == zza) {
                    z |= zzayqVar.zzbj(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
