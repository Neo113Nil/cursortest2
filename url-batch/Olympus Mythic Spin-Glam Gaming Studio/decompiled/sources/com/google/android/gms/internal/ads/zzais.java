package com.google.android.gms.internal.ads;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzais implements zzagh {
    private zzagk zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaiq zzo;
    private zzaiw zzp;
    private final zzeu zza = new zzeu(4);
    private final zzeu zzb = new zzeu(9);
    private final zzeu zzc = new zzeu(11);
    private final zzeu zzd = new zzeu();
    private final zzait zze = new zzait();
    private int zzg = 1;

    static {
        int i = zzair.zza;
    }

    private final zzeu zzh(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zzd;
        if (this.zzl > zzeuVar.zzj()) {
            int zzj = zzeuVar.zzj();
            zzeuVar.zzb(new byte[Math.max(zzj + zzj, this.zzl)], 0);
        } else {
            zzeuVar.zzh(0);
        }
        zzeuVar.zzf(this.zzl);
        zzagiVar.zzc(zzeuVar.zzi(), 0, this.zzl);
        return zzeuVar;
    }

    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzahj(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzagiVar.zzi(zzeuVar.zzi(), 0, 3);
        zzeuVar.zzh(0);
        if (zzeuVar.zzx() != 4607062) {
            return false;
        }
        zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
        zzeuVar.zzh(0);
        if ((zzeuVar.zzt() & POBCommonConstants.DEFAULT_MIN_BITRATE) != 0) {
            return false;
        }
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int zzB = zzeuVar.zzB();
        zzagiVar.zzl();
        zzagiVar.zzk(zzB);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        return zzeuVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzf = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        boolean zzf;
        boolean z;
        this.zzf.getClass();
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i == 1) {
                zzeu zzeuVar = this.zzb;
                if (!zzagiVar.zzb(zzeuVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzeuVar.zzh(0);
                zzeuVar.zzk(4);
                int zzs = zzeuVar.zzs();
                int i3 = zzs & 4;
                int i4 = zzs & 1;
                if (i3 != 0 && this.zzo == null) {
                    this.zzo = new zzaiq(this.zzf.zzs(8, 1));
                }
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzaiw(this.zzf.zzs(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzeuVar.zzB() - 5;
                this.zzg = 2;
            } else if (i == 2) {
                zzagiVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i == 3) {
                zzeu zzeuVar2 = this.zzc;
                if (!zzagiVar.zzb(zzeuVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzeuVar2.zzh(0);
                this.zzk = zzeuVar2.zzs();
                this.zzl = zzeuVar2.zzx();
                this.zzm = zzeuVar2.zzx();
                this.zzm = ((zzeuVar2.zzs() << 24) | this.zzm) * 1000;
                zzeuVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                long j = this.zzh ? this.zzi + this.zzm : this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                int i5 = this.zzk;
                if (i5 != 8) {
                    i2 = i5;
                } else if (this.zzo != null) {
                    zzi();
                    zzf = this.zzo.zzf(zzh(zzagiVar), j);
                    z = true;
                    if (!this.zzh && zzf) {
                        this.zzh = true;
                        this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (!z) {
                        return 0;
                    }
                }
                if (i2 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zzf = this.zzp.zzf(zzh(zzagiVar), j);
                        z = true;
                    }
                    zzagiVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                } else {
                    if (i2 == 18 && !this.zzn) {
                        zzait zzaitVar = this.zze;
                        zzf = zzaitVar.zzf(zzh(zzagiVar), j);
                        long zzc = zzaitVar.zzc();
                        if (zzc != -9223372036854775807L) {
                            this.zzf.zzw(new zzahd(zzaitVar.zze(), zzaitVar.zzd(), zzc));
                            this.zzn = true;
                        }
                        z = true;
                    }
                    zzagiVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (!z) {
                }
            }
        }
    }
}
