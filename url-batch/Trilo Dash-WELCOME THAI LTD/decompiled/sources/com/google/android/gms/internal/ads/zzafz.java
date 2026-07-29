package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzafz implements zzaga {
    private final List zza;
    private final zzzz[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzafz(List list) {
        this.zza = list;
        this.zzb = new zzzz[list.size()];
    }

    private final boolean zzf(zzdy zzdyVar, int i) {
        if (zzdyVar.zza() == 0) {
            return false;
        }
        if (zzdyVar.zzk() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzdyVar, 32)) {
                if (this.zzd != 1 || zzf(zzdyVar, 0)) {
                    int zzc = zzdyVar.zzc();
                    int zza = zzdyVar.zza();
                    for (zzzz zzzzVar : this.zzb) {
                        zzdyVar.zzF(zzc);
                        zzzzVar.zzq(zzdyVar, zza);
                    }
                    this.zze += zza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzahj zzahjVar = (zzahj) this.zza.get(i);
            zzahmVar.zzc();
            zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 3);
            zzab zzabVar = new zzab();
            zzabVar.zzH(zzahmVar.zzb());
            zzabVar.zzS("application/dvbsubs");
            zzabVar.zzI(Collections.singletonList(zzahjVar.zzb));
            zzabVar.zzK(zzahjVar.zza);
            zzv.zzk(zzabVar.zzY());
            this.zzb[i] = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzzz zzzzVar : this.zzb) {
                    zzzzVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzf = j;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
