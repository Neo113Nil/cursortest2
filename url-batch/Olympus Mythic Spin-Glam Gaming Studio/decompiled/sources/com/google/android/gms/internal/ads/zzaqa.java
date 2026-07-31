package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqa implements zzaqh {
    private final zzet zza;
    private final zzeu zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaht zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private zzv zzm;
    private int zzn;
    private long zzo;

    public zzaqa(@Nullable String str, int i, String str2) {
        zzet zzetVar = new zzet(new byte[16], 16);
        this.zza = zzetVar;
        this.zzb = new zzeu(zzetVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzf = zzarvVar.zzc();
        this.zzg = zzagkVar.zzs(zzarvVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzo = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012c  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzeu zzeuVar) {
        boolean z;
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (zzeuVar.zzd() > 0) {
                    if (this.zzj) {
                        int zzs = zzeuVar.zzs();
                        this.zzj = zzs == 172;
                        if (zzs != 64) {
                            if (zzs == 65) {
                            }
                        } else if (zzs != 65) {
                            z = false;
                            this.zzk = z;
                            this.zzh = 1;
                            zzeu zzeuVar2 = this.zzb;
                            zzeuVar2.zzi()[0] = -84;
                            zzeuVar2.zzi()[1] = true == this.zzk ? (byte) 65 : (byte) 64;
                            this.zzi = 2;
                        }
                        z = true;
                        this.zzk = z;
                        this.zzh = 1;
                        zzeu zzeuVar22 = this.zzb;
                        zzeuVar22.zzi()[0] = -84;
                        zzeuVar22.zzi()[1] = true == this.zzk ? (byte) 65 : (byte) 64;
                        this.zzi = 2;
                    } else {
                        this.zzj = zzeuVar.zzs() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzeuVar.zzd(), this.zzn - this.zzi);
                this.zzg.zzc(zzeuVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzn) {
                    zzguk.zzi(this.zzo != -9223372036854775807L);
                    this.zzg.zze(this.zzo, 1, this.zzn, 0, null);
                    this.zzo += this.zzl;
                    this.zzh = 0;
                }
            } else {
                zzeu zzeuVar3 = this.zzb;
                byte[] zzi = zzeuVar3.zzi();
                int min2 = Math.min(zzeuVar.zzd(), 16 - this.zzi);
                zzeuVar.zzm(zzi, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 16) {
                    zzet zzetVar = this.zza;
                    zzetVar.zzf(0);
                    zzafj zzb = zzafk.zzb(zzetVar);
                    zzv zzvVar = this.zzm;
                    if (zzvVar == null || zzvVar.zzI != 2 || zzb.zza != zzvVar.zzK || !"audio/ac4".equals(zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        zztVar.zzo("audio/ac4");
                        zztVar.zzH(2);
                        zztVar.zzJ(zzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        zzv zzQ = zztVar.zzQ();
                        this.zzm = zzQ;
                        this.zzg.zzA(zzQ);
                    }
                    this.zzn = zzb.zzb;
                    this.zzl = (zzb.zzc * 1000000) / this.zzm.zzK;
                    zzeuVar3.zzh(0);
                    this.zzg.zzc(zzeuVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }
}
