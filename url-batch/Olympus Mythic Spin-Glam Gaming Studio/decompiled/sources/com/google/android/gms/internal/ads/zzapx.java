package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzapx implements zzaqh {
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
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzapx(@Nullable String str, int i, String str2) {
        zzet zzetVar = new zzet(new byte[128], 128);
        this.zza = zzetVar;
        this.zzb = new zzeu(zzetVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzf = zzarvVar.zzc();
        this.zzg = zzagkVar.zzs(zzarvVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) {
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (true) {
                    if (zzeuVar.zzd() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int zzs = zzeuVar.zzs();
                        if (zzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzeu zzeuVar2 = this.zzb;
                            zzeuVar2.zzi()[0] = 11;
                            zzeuVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = zzs == 11;
                    } else {
                        this.zzj = zzeuVar.zzs() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzeuVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzeuVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzm) {
                    zzguk.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzeu zzeuVar3 = this.zzb;
                byte[] zzi = zzeuVar3.zzi();
                int min2 = Math.min(zzeuVar.zzd(), 128 - this.zzi);
                zzeuVar.zzm(zzi, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 128) {
                    zzet zzetVar = this.zza;
                    zzetVar.zzf(0);
                    zzafg zzc = zzafh.zzc(zzetVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzc.zzc != zzvVar.zzI || zzc.zzb != zzvVar.zzK || !Objects.equals(zzc.zza, zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        String str = zzc.zza;
                        zztVar.zzo(str);
                        zztVar.zzH(zzc.zzc);
                        zztVar.zzJ(zzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i4 = zzc.zzf;
                        zztVar.zzj(i4);
                        if ("audio/ac3".equals(str)) {
                            zztVar.zzi(i4);
                        }
                        zzv zzQ = zztVar.zzQ();
                        this.zzl = zzQ;
                        this.zzg.zzA(zzQ);
                    }
                    this.zzm = zzc.zzd;
                    this.zzk = (zzc.zze * 1000000) / this.zzl.zzK;
                    zzeuVar3.zzh(0);
                    this.zzg.zzc(zzeuVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }
}
