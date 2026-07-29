package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzahu implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzahq
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzahu.zza;
            return new zzys[]{new zzahu()};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private zzyv zzb;
    private zzzz zzc;
    private zzahs zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        int zzn;
        zzcw.zzb(this.zzc);
        int i = zzeg.zza;
        int i2 = this.zzd;
        if (i2 == 0) {
            zzcw.zzf(zzytVar.zzf() == 0);
            int i3 = this.zzg;
            if (i3 != -1) {
                ((zzym) zzytVar).zzo(i3, false);
                this.zzd = 4;
            } else {
                if (!zzahx.zzc(zzytVar)) {
                    throw zzbp.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzym) zzytVar).zzo((int) (zzytVar.zze() - zzytVar.zzf()), false);
                this.zzd = 1;
            }
            return 0;
        }
        long j = -1;
        if (i2 == 1) {
            zzdy zzdyVar = new zzdy(8);
            zzahw zza2 = zzahw.zza(zzytVar, zzdyVar);
            if (zza2.zza != 1685272116) {
                zzytVar.zzj();
            } else {
                zzym zzymVar = (zzym) zzytVar;
                zzymVar.zzl(8, false);
                zzdyVar.zzF(0);
                zzymVar.zzm(zzdyVar.zzH(), 0, 8, false);
                j = zzdyVar.zzp();
                zzymVar.zzo(((int) zza2.zzb) + 8, false);
            }
            this.zze = j;
            this.zzd = 2;
            return 0;
        }
        if (i2 == 2) {
            zzahv zzb = zzahx.zzb(zzytVar);
            int i4 = zzb.zza;
            if (i4 == 17) {
                this.zzf = new zzahr(this.zzb, this.zzc, zzb);
            } else if (i4 == 6) {
                this.zzf = new zzaht(this.zzb, this.zzc, zzb, "audio/g711-alaw", -1);
            } else if (i4 == 7) {
                this.zzf = new zzaht(this.zzb, this.zzc, zzb, "audio/g711-mlaw", -1);
            } else {
                int i5 = zzb.zze;
                if (i4 != 1) {
                    if (i4 == 3) {
                        if (i5 == 32) {
                            zzn = 4;
                            if (zzn == 0) {
                                throw zzbp.zzc("Unsupported WAV format type: " + i4);
                            }
                            this.zzf = new zzaht(this.zzb, this.zzc, zzb, "audio/raw", zzn);
                        }
                    }
                    zzn = 0;
                    if (zzn == 0) {
                    }
                }
                zzn = zzeg.zzn(i5);
                if (zzn == 0) {
                }
            }
            this.zzd = 3;
            return 0;
        }
        if (i2 != 3) {
            zzcw.zzf(this.zzh != -1);
            long zzf = this.zzh - zzytVar.zzf();
            zzahs zzahsVar = this.zzf;
            Objects.requireNonNull(zzahsVar);
            return zzahsVar.zzc(zzytVar, zzf) ? -1 : 0;
        }
        Pair zza3 = zzahx.zza(zzytVar);
        this.zzg = ((Long) zza3.first).intValue();
        long longValue = ((Long) zza3.second).longValue();
        long j2 = this.zze;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzg + longValue;
        this.zzh = j3;
        long zzd = zzytVar.zzd();
        if (zzd != -1 && j3 > zzd) {
            Log.w("WavExtractor", "Data exceeds input length: " + j3 + ", " + zzd);
            this.zzh = zzd;
            j3 = zzd;
        }
        zzahs zzahsVar2 = this.zzf;
        Objects.requireNonNull(zzahsVar2);
        zzahsVar2.zza(this.zzg, j3);
        this.zzd = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzb = zzyvVar;
        this.zzc = zzyvVar.zzv(0, 1);
        zzyvVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzahs zzahsVar = this.zzf;
        if (zzahsVar != null) {
            zzahsVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        return zzahx.zzc(zzytVar);
    }
}
