package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzang implements zzagh {
    private zzagk zza;
    private zzann zzb;
    private boolean zzc;

    static {
        int i = zzanf.zza;
    }

    private final boolean zzh(zzagi zzagiVar) throws IOException {
        zzani zzaniVar = new zzani();
        if (zzaniVar.zzc(zzagiVar, true) && (zzaniVar.zza & 2) == 2) {
            int min = Math.min(zzaniVar.zze, 8);
            zzeu zzeuVar = new zzeu(min);
            zzagiVar.zzi(zzeuVar.zzi(), 0, min);
            zzeuVar.zzh(0);
            if (zzeuVar.zzd() >= 5 && zzeuVar.zzs() == 127 && zzeuVar.zzz() == 1179402563) {
                this.zzb = new zzane();
            } else {
                zzeuVar.zzh(0);
                try {
                    if (zzhh.zzc(1, zzeuVar, true)) {
                        this.zzb = new zzanp();
                    }
                } catch (zzat unused) {
                }
                zzeuVar.zzh(0);
                if (zzank.zzd(zzeuVar)) {
                    this.zzb = new zzank();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        try {
            return zzh(zzagiVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zza = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzagiVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzagiVar.zzl();
        }
        if (!this.zzc) {
            zzaht zzs = this.zza.zzs(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzs);
            this.zzc = true;
        }
        return this.zzb.zzg(zzagiVar, zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        zzann zzannVar = this.zzb;
        if (zzannVar != null) {
            zzannVar.zzf(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
