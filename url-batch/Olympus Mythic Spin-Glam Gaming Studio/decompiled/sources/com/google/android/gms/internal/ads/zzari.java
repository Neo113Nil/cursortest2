package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzari implements zzarw {
    private final zzarh zza;
    private final zzeu zzb = new zzeu(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzari(zzarh zzarhVar) {
        this.zza = zzarhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.zza.zza(zzfjVar, zzagkVar, zzarvVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzc(zzeu zzeuVar, int i) {
        int i2 = i & 1;
        int zzg = i2 != 0 ? zzeuVar.zzg() + zzeuVar.zzs() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzeuVar.zzh(zzg);
            this.zzd = 0;
        }
        while (zzeuVar.zzd() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzs = zzeuVar.zzs();
                    zzeuVar.zzh(zzeuVar.zzg() - 1);
                    if (zzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzeuVar.zzd(), 3 - this.zzd);
                zzeu zzeuVar2 = this.zzb;
                zzeuVar.zzm(zzeuVar2.zzi(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    zzeuVar2.zzh(0);
                    zzeuVar2.zzf(3);
                    zzeuVar2.zzk(1);
                    int zzs2 = zzeuVar2.zzs();
                    boolean z = (zzs2 & 128) != 0;
                    int zzs3 = zzeuVar2.zzs();
                    this.zze = z;
                    this.zzc = (((zzs2 & 15) << 8) | zzs3) + 3;
                    int zzj = zzeuVar2.zzj();
                    int i5 = this.zzc;
                    if (zzj < i5) {
                        int zzj2 = zzeuVar2.zzj();
                        zzeuVar2.zzc(Math.min(4098, Math.max(i5, zzj2 + zzj2)));
                    }
                }
            } else {
                int min2 = Math.min(zzeuVar.zzd(), this.zzc - this.zzd);
                zzeu zzeuVar3 = this.zzb;
                zzeuVar.zzm(zzeuVar3.zzi(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzeuVar3.zzf(i7);
                    } else {
                        if (zzfm.zzL(zzeuVar3.zzi(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzeuVar3.zzf(this.zzc - 4);
                    }
                    zzeuVar3.zzh(0);
                    this.zza.zzb(zzeuVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
