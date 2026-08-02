package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzrs implements zzub {
    protected final zzub[] zza;

    public zzrs(zzub[] zzubVarArr) {
        this.zza = zzubVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzub zzubVar : this.zza) {
            long zzb = zzubVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzub zzubVar : this.zza) {
            long zzc = zzubVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final void zzm(long j) {
        for (zzub zzubVar : this.zza) {
            zzubVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final boolean zzo(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzub zzubVar : this.zza) {
                long zzc2 = zzubVar.zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j;
                if (zzc2 == zzc || z3) {
                    z |= zzubVar.zzo(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final boolean zzp() {
        for (zzub zzubVar : this.zza) {
            if (zzubVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
