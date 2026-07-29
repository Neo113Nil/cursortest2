package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaan implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzaam
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaan.zza;
            return new zzys[]{new zzaan(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private final byte[] zzb;
    private final zzdy zzc;
    private final zzza zzd;
    private zzyv zze;
    private zzzz zzf;
    private int zzg;
    private zzbl zzh;
    private zzzf zzi;
    private int zzj;
    private int zzk;
    private zzaal zzl;
    private int zzm;
    private long zzn;

    public zzaan() {
        this(0);
    }

    public zzaan(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzdy(new byte[32768], 0);
        this.zzd = new zzza();
        this.zzg = 0;
    }

    private final long zze(zzdy zzdyVar, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.zzi);
        int zzc = zzdyVar.zzc();
        while (zzc <= zzdyVar.zzd() - 16) {
            zzdyVar.zzF(zzc);
            if (zzzb.zzc(zzdyVar, this.zzi, this.zzk, this.zzd)) {
                zzdyVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (!z) {
            zzdyVar.zzF(zzc);
            return -1L;
        }
        while (zzc <= zzdyVar.zzd() - this.zzj) {
            zzdyVar.zzF(zzc);
            try {
                z2 = zzzb.zzc(zzdyVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzdyVar.zzc() <= zzdyVar.zzd() && z2) {
                zzdyVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        zzdyVar.zzF(zzdyVar.zzd());
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn;
        zzzf zzzfVar = this.zzi;
        int i = zzeg.zza;
        this.zzf.zzs((j * 1000000) / zzzfVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zze = zzyvVar;
        this.zzf = zzyvVar.zzv(0, 1);
        zzyvVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        zzzc.zza(zzytVar, false);
        zzdy zzdyVar = new zzdy(4);
        ((zzym) zzytVar).zzm(zzdyVar.zzH(), 0, 4, false);
        return zzdyVar.zzs() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaal zzaalVar = this.zzl;
            if (zzaalVar != null) {
                zzaalVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        boolean zzl;
        zzzv zzzuVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzytVar.zzj();
            long zze = zzytVar.zze();
            zzbl zza2 = zzzc.zza(zzytVar, true);
            ((zzym) zzytVar).zzo((int) (zzytVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zzym) zzytVar).zzm(this.zzb, 0, 42, false);
            zzytVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzdy zzdyVar = new zzdy(4);
            ((zzym) zzytVar).zzn(zzdyVar.zzH(), 0, 4, false);
            if (zzdyVar.zzs() != 1716281667) {
                throw zzbp.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzzf zzzfVar = this.zzi;
            do {
                zzytVar.zzj();
                zzdx zzdxVar = new zzdx(new byte[4], 4);
                zzym zzymVar = (zzym) zzytVar;
                zzymVar.zzm(zzdxVar.zza, 0, 4, false);
                zzl = zzdxVar.zzl();
                int zzc = zzdxVar.zzc(7);
                int zzc2 = zzdxVar.zzc(24) + 4;
                if (zzc == 0) {
                    byte[] bArr = new byte[38];
                    zzymVar.zzn(bArr, 0, 38, false);
                    zzzfVar = new zzzf(bArr, 4);
                } else {
                    if (zzzfVar == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzc == 3) {
                        zzdy zzdyVar2 = new zzdy(zzc2);
                        zzymVar.zzn(zzdyVar2.zzH(), 0, zzc2, false);
                        zzzfVar = zzzfVar.zzf(zzzc.zzb(zzdyVar2));
                    } else if (zzc == 4) {
                        zzdy zzdyVar3 = new zzdy(zzc2);
                        zzymVar.zzn(zzdyVar3.zzH(), 0, zzc2, false);
                        zzdyVar3.zzG(4);
                        zzzfVar = zzzfVar.zzg(Arrays.asList(zzaaf.zzc(zzdyVar3, false, false).zzb));
                    } else if (zzc == 6) {
                        zzdy zzdyVar4 = new zzdy(zzc2);
                        zzymVar.zzn(zzdyVar4.zzH(), 0, zzc2, false);
                        zzdyVar4.zzG(4);
                        zzzfVar = zzzfVar.zze(zzfrh.zzp(zzabh.zzb(zzdyVar4)));
                    } else {
                        zzymVar.zzo(zzc2, false);
                    }
                }
                int i2 = zzeg.zza;
                this.zzi = zzzfVar;
            } while (!zzl);
            Objects.requireNonNull(zzzfVar);
            this.zzj = Math.max(zzzfVar.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zzytVar.zzj();
            zzdy zzdyVar5 = new zzdy(2);
            ((zzym) zzytVar).zzm(zzdyVar5.zzH(), 0, 2, false);
            int zzo = zzdyVar5.zzo();
            if ((zzo >> 2) != 16382) {
                zzytVar.zzj();
                throw zzbp.zza("First frame does not start with sync code.", null);
            }
            zzytVar.zzj();
            this.zzk = zzo;
            zzyv zzyvVar = this.zze;
            int i3 = zzeg.zza;
            long zzf = zzytVar.zzf();
            long zzd = zzytVar.zzd();
            zzzf zzzfVar2 = this.zzi;
            Objects.requireNonNull(zzzfVar2);
            if (zzzfVar2.zzk != null) {
                zzzuVar = new zzzd(zzzfVar2, zzf);
            } else if (zzd == -1 || zzzfVar2.zzj <= 0) {
                zzzuVar = new zzzu(zzzfVar2.zza(), 0L);
            } else {
                zzaal zzaalVar = new zzaal(zzzfVar2, this.zzk, zzf, zzd);
                this.zzl = zzaalVar;
                zzzuVar = zzaalVar.zzb();
            }
            zzyvVar.zzL(zzzuVar);
            this.zzg = 5;
            return 0;
        }
        Objects.requireNonNull(this.zzf);
        zzzf zzzfVar3 = this.zzi;
        Objects.requireNonNull(zzzfVar3);
        zzaal zzaalVar2 = this.zzl;
        if (zzaalVar2 != null && zzaalVar2.zze()) {
            return zzaalVar2.zza(zzytVar, zzzsVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzzb.zzb(zzytVar, zzzfVar3);
            return 0;
        }
        zzdy zzdyVar6 = this.zzc;
        int zzd2 = zzdyVar6.zzd();
        if (zzd2 < 32768) {
            int zza3 = zzytVar.zza(zzdyVar6.zzH(), zzd2, 32768 - zzd2);
            z = zza3 == -1;
            if (!z) {
                this.zzc.zzE(zzd2 + zza3);
            } else if (this.zzc.zza() == 0) {
                zzf();
                return -1;
            }
        } else {
            z = false;
        }
        zzdy zzdyVar7 = this.zzc;
        int zzc3 = zzdyVar7.zzc();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzdyVar7.zzG(Math.min(i5 - i4, zzdyVar7.zza()));
        }
        long zze2 = zze(this.zzc, z);
        zzdy zzdyVar8 = this.zzc;
        int zzc4 = zzdyVar8.zzc() - zzc3;
        zzdyVar8.zzF(zzc3);
        zzzx.zzb(this.zzf, this.zzc, zzc4);
        this.zzm += zzc4;
        if (zze2 != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = zze2;
        }
        zzdy zzdyVar9 = this.zzc;
        if (zzdyVar9.zza() >= 16) {
            return 0;
        }
        int zza4 = zzdyVar9.zza();
        System.arraycopy(zzdyVar9.zzH(), zzdyVar9.zzc(), zzdyVar9.zzH(), 0, zza4);
        this.zzc.zzF(0);
        this.zzc.zzE(zza4);
        return 0;
    }
}
