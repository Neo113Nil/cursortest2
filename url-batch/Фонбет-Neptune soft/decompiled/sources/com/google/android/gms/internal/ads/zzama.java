package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzama implements zzack {
    private final zzamb zza;
    private final zzek zzb;
    private final zzek zzc;
    private final zzej zzd;
    private zzacn zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzama() {
        throw null;
    }

    public zzama(int i) {
        this.zza = new zzamb(true, null, 0);
        this.zzb = new zzek(2048);
        this.zzg = -1L;
        zzek zzekVar = new zzek(10);
        this.zzc = zzekVar;
        byte[] zzM = zzekVar.zzM();
        this.zzd = new zzej(zzM, zzM.length);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        zzdi.zzb(this.zze);
        int zza = zzaclVar.zza(this.zzb.zzM(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzO(new zzadh(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzK(0);
        this.zzb.zzJ(zza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zze = zzacnVar;
        this.zza.zzb(zzacnVar, new zzans(Integer.MIN_VALUE, 0, 1));
        zzacnVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzaby zzabyVar;
        int i = 0;
        while (true) {
            zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(this.zzc.zzM(), 0, 10, false);
            this.zzc.zzK(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzL(3);
            int zzl = this.zzc.zzl();
            i += zzl + 10;
            zzabyVar.zzl(zzl, false);
        }
        zzaclVar.zzj();
        zzabyVar.zzl(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzabyVar.zzm(this.zzc.zzM(), 0, 2, false);
            this.zzc.zzK(0);
            if (zzamb.zzf(this.zzc.zzq())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzabyVar.zzm(this.zzc.zzM(), 0, 4, false);
                this.zzd.zzl(14);
                int zzd = this.zzd.zzd(13);
                if (zzd <= 6) {
                    i2++;
                    zzaclVar.zzj();
                    zzabyVar.zzl(i2, false);
                } else {
                    zzabyVar.zzl(zzd - 6, false);
                    i4 += zzd;
                }
            } else {
                i2++;
                zzaclVar.zzj();
                zzabyVar.zzl(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }
}
