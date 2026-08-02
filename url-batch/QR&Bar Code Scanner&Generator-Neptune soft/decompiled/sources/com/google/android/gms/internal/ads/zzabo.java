package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzabo implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzabn
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzabo.zza;
            return new zzzi[]{new zzabo(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private final byte[] zzb;
    private final zzef zzc;
    private final zzzq zzd;
    private zzzl zze;
    private zzaap zzf;
    private int zzg;
    private zzbq zzh;
    private zzzv zzi;
    private int zzj;
    private int zzk;
    private zzabm zzl;
    private int zzm;
    private long zzn;

    public zzabo() {
        this(0);
    }

    public zzabo(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzef(new byte[32768], 0);
        this.zzd = new zzzq();
        this.zzg = 0;
    }

    private final long zze(zzef zzefVar, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.zzi);
        int zzc = zzefVar.zzc();
        while (zzc <= zzefVar.zzd() - 16) {
            zzefVar.zzF(zzc);
            if (zzzr.zzc(zzefVar, this.zzi, this.zzk, this.zzd)) {
                zzefVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (!z) {
            zzefVar.zzF(zzc);
            return -1L;
        }
        while (zzc <= zzefVar.zzd() - this.zzj) {
            zzefVar.zzF(zzc);
            try {
                z2 = zzzr.zzc(zzefVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzefVar.zzc() <= zzefVar.zzd() && z2) {
                zzefVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        zzefVar.zzF(zzefVar.zzd());
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn;
        zzzv zzzvVar = this.zzi;
        int i = zzen.zza;
        this.zzf.zzs((j * 1000000) / zzzvVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zze = zzzlVar;
        this.zzf = zzzlVar.zzv(0, 1);
        zzzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        zzzs.zza(zzzjVar, false);
        zzef zzefVar = new zzef(4);
        ((zzyy) zzzjVar).zzm(zzefVar.zzH(), 0, 4, false);
        return zzefVar.zzs() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzabm zzabmVar = this.zzl;
            if (zzabmVar != null) {
                zzabmVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        boolean zzl;
        zzaal zzaakVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzzjVar.zzj();
            long zze = zzzjVar.zze();
            zzbq zza2 = zzzs.zza(zzzjVar, true);
            ((zzyy) zzzjVar).zzo((int) (zzzjVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zzyy) zzzjVar).zzm(this.zzb, 0, 42, false);
            zzzjVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzef zzefVar = new zzef(4);
            ((zzyy) zzzjVar).zzn(zzefVar.zzH(), 0, 4, false);
            if (zzefVar.zzs() != 1716281667) {
                throw zzbu.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzzv zzzvVar = this.zzi;
            do {
                zzzjVar.zzj();
                zzee zzeeVar = new zzee(new byte[4], 4);
                zzyy zzyyVar = (zzyy) zzzjVar;
                zzyyVar.zzm(zzeeVar.zza, 0, 4, false);
                zzl = zzeeVar.zzl();
                int zzc = zzeeVar.zzc(7);
                int zzc2 = zzeeVar.zzc(24) + 4;
                if (zzc == 0) {
                    byte[] bArr = new byte[38];
                    zzyyVar.zzn(bArr, 0, 38, false);
                    zzzvVar = new zzzv(bArr, 4);
                } else {
                    if (zzzvVar == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzc == 3) {
                        zzef zzefVar2 = new zzef(zzc2);
                        zzyyVar.zzn(zzefVar2.zzH(), 0, zzc2, false);
                        zzzvVar = zzzvVar.zzf(zzzs.zzb(zzefVar2));
                    } else if (zzc == 4) {
                        zzef zzefVar3 = new zzef(zzc2);
                        zzyyVar.zzn(zzefVar3.zzH(), 0, zzc2, false);
                        zzefVar3.zzG(4);
                        zzzvVar = zzzvVar.zzg(Arrays.asList(zzaav.zzc(zzefVar3, false, false).zzb));
                    } else if (zzc == 6) {
                        zzef zzefVar4 = new zzef(zzc2);
                        zzyyVar.zzn(zzefVar4.zzH(), 0, zzc2, false);
                        zzefVar4.zzG(4);
                        zzzvVar = zzzvVar.zze(zzfvn.zzp(zzaci.zzb(zzefVar4)));
                    } else {
                        zzyyVar.zzo(zzc2, false);
                    }
                }
                int i2 = zzen.zza;
                this.zzi = zzzvVar;
            } while (!zzl);
            Objects.requireNonNull(zzzvVar);
            this.zzj = Math.max(zzzvVar.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zzzjVar.zzj();
            zzef zzefVar5 = new zzef(2);
            ((zzyy) zzzjVar).zzm(zzefVar5.zzH(), 0, 2, false);
            int zzo = zzefVar5.zzo();
            if ((zzo >> 2) != 16382) {
                zzzjVar.zzj();
                throw zzbu.zza("First frame does not start with sync code.", null);
            }
            zzzjVar.zzj();
            this.zzk = zzo;
            zzzl zzzlVar = this.zze;
            int i3 = zzen.zza;
            long zzf = zzzjVar.zzf();
            long zzd = zzzjVar.zzd();
            zzzv zzzvVar2 = this.zzi;
            Objects.requireNonNull(zzzvVar2);
            if (zzzvVar2.zzk != null) {
                zzaakVar = new zzzt(zzzvVar2, zzf);
            } else if (zzd == -1 || zzzvVar2.zzj <= 0) {
                zzaakVar = new zzaak(zzzvVar2.zza(), 0L);
            } else {
                zzabm zzabmVar = new zzabm(zzzvVar2, this.zzk, zzf, zzd);
                this.zzl = zzabmVar;
                zzaakVar = zzabmVar.zzb();
            }
            zzzlVar.zzN(zzaakVar);
            this.zzg = 5;
            return 0;
        }
        Objects.requireNonNull(this.zzf);
        zzzv zzzvVar3 = this.zzi;
        Objects.requireNonNull(zzzvVar3);
        zzabm zzabmVar2 = this.zzl;
        if (zzabmVar2 != null && zzabmVar2.zze()) {
            return zzabmVar2.zza(zzzjVar, zzaaiVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzzr.zzb(zzzjVar, zzzvVar3);
            return 0;
        }
        zzef zzefVar6 = this.zzc;
        int zzd2 = zzefVar6.zzd();
        if (zzd2 < 32768) {
            int zza3 = zzzjVar.zza(zzefVar6.zzH(), zzd2, 32768 - zzd2);
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
        zzef zzefVar7 = this.zzc;
        int zzc3 = zzefVar7.zzc();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzefVar7.zzG(Math.min(i5 - i4, zzefVar7.zza()));
        }
        long zze2 = zze(this.zzc, z);
        zzef zzefVar8 = this.zzc;
        int zzc4 = zzefVar8.zzc() - zzc3;
        zzefVar8.zzF(zzc3);
        zzaan.zzb(this.zzf, this.zzc, zzc4);
        this.zzm += zzc4;
        if (zze2 != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = zze2;
        }
        zzef zzefVar9 = this.zzc;
        if (zzefVar9.zza() >= 16) {
            return 0;
        }
        int zza4 = zzefVar9.zza();
        System.arraycopy(zzefVar9.zzH(), zzefVar9.zzc(), zzefVar9.zzH(), 0, zza4);
        this.zzc.zzF(0);
        this.zzc.zzE(zza4);
        return 0;
    }
}
