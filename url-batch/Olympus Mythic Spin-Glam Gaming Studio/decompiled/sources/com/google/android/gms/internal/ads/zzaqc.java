package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqc implements zzagh {
    private final zzaqd zza;
    private final zzeu zzb;
    private final zzeu zzc;
    private final zzet zzd;
    private zzagk zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i = zzaqb.zza;
    }

    public zzaqc() {
        throw null;
    }

    public zzaqc(int i) {
        this.zza = new zzaqd(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzeu(2048);
        this.zzg = -1L;
        zzeu zzeuVar = new zzeu(10);
        this.zzc = zzeuVar;
        byte[] zzi = zzeuVar.zzi();
        this.zzd = new zzet(zzi, zzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar;
        int i = 0;
        while (true) {
            zzeuVar = this.zzc;
            zzagiVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int zzG = zzeuVar.zzG();
            i += zzG + 10;
            zzagiVar.zzk(zzG);
        }
        zzagiVar.zzl();
        zzagiVar.zzk(i);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
            zzeuVar.zzh(0);
            if (zzaqd.zze(zzeuVar.zzt())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
                zzet zzetVar = this.zzd;
                zzetVar.zzf(14);
                int zzj = zzetVar.zzj(13);
                if (zzj <= 6) {
                    i4++;
                    zzagiVar.zzl();
                    zzagiVar.zzk(i4);
                } else {
                    zzagiVar.zzk(zzj - 6);
                    i3 += zzj;
                }
            } else {
                i4++;
                zzagiVar.zzl();
                zzagiVar.zzk(i4);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zze = zzagkVar;
        this.zza.zzb(zzagkVar, new zzarv(Integer.MIN_VALUE, 0, 1));
        zzagkVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        this.zze.getClass();
        zzeu zzeuVar = this.zzb;
        int zza = zzagiVar.zza(zzeuVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzahj(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(zza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
