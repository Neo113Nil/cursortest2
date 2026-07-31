package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzaro implements zzarh {
    final /* synthetic */ zzarr zza;
    private final zzet zzb;

    public zzaro(zzarr zzarrVar) {
        Objects.requireNonNull(zzarrVar);
        this.zza = zzarrVar;
        this.zzb = new zzet(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zzb(zzeu zzeuVar) {
        if (zzeuVar.zzs() == 0 && (zzeuVar.zzs() & 128) != 0) {
            zzeuVar.zzk(6);
            int zzd = zzeuVar.zzd() / 4;
            for (int i = 0; i < zzd; i++) {
                zzet zzetVar = this.zzb;
                zzeuVar.zzl(zzetVar, 4);
                int zzj = zzetVar.zzj(16);
                zzetVar.zzh(3);
                if (zzj == 0) {
                    zzetVar.zzh(13);
                } else {
                    int zzj2 = zzetVar.zzj(13);
                    zzarr zzarrVar = this.zza;
                    if (zzarrVar.zzj().get(zzj2) == null) {
                        zzarrVar.zzj().put(zzj2, new zzari(new zzarp(zzarrVar, zzj2)));
                        zzarrVar.zzo(zzarrVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
