package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqr implements zzaqh {
    private zzaht zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzeu zzb = new zzeu(10);
    private long zze = -9223372036854775807L;

    public zzaqr(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        zzaht zzs = zzagkVar.zzs(zzarvVar.zzb(), 5);
        this.zzc = zzs;
        zzt zztVar = new zzt();
        zztVar.zza(zzarvVar.zzc());
        zztVar.zzn(this.zza);
        zztVar.zzo("application/id3");
        zzs.zzA(zztVar.zzQ());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int zzd = zzeuVar.zzd();
            int i = this.zzg;
            if (i < 10) {
                int min = Math.min(zzd, 10 - i);
                byte[] zzi = zzeuVar.zzi();
                int zzg = zzeuVar.zzg();
                zzeu zzeuVar2 = this.zzb;
                System.arraycopy(zzi, zzg, zzeuVar2.zzi(), this.zzg, min);
                if (this.zzg + min == 10) {
                    zzeuVar2.zzh(0);
                    if (zzeuVar2.zzs() != 73 || zzeuVar2.zzs() != 68 || zzeuVar2.zzs() != 51) {
                        zzeh.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzeuVar2.zzk(3);
                        this.zzf = zzeuVar2.zzG() + 10;
                    }
                }
            }
            int min2 = Math.min(zzd, this.zzf - this.zzg);
            this.zzc.zzc(zzeuVar, min2);
            this.zzg += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzf() {
        int i;
        this.zzc.getClass();
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            zzguk.zzi(this.zze != -9223372036854775807L);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
