package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzts implements zzvz {
    private final zzfxr zza;
    private long zzb;

    public zzts(List list, List list2) {
        zzfxo zzfxoVar = new zzfxo();
        zzdi.zzd(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzfxoVar.zzf(new zztr((zzvz) list.get(i), (List) list2.get(i)));
        }
        this.zza = zzfxoVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            zztr zztrVar = (zztr) this.zza.get(i);
            long zzb = zztrVar.zzb();
            if ((zztrVar.zza().contains(1) || zztrVar.zza().contains(2) || zztrVar.zza().contains(4)) && zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.zzb;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.zza.size(); i++) {
            long zzc = ((zztr) this.zza.get(i)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j) {
        for (int i = 0; i < this.zza.size(); i++) {
            ((zztr) this.zza.get(i)).zzm(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (int i = 0; i < this.zza.size(); i++) {
                long zzc2 = ((zztr) this.zza.get(i)).zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= zzkfVar.zza;
                if (zzc2 == zzc || z3) {
                    z |= ((zztr) this.zza.get(i)).zzo(zzkfVar);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zztr) this.zza.get(i)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
