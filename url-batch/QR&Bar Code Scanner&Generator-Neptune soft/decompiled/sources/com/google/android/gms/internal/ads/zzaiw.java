package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaiw implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzais
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzaiw.zza;
            return new zzzi[]{new zzaiw()};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private zzzl zzb;
    private zzaap zzc;
    private zzaiu zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r2 == 32) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        int i;
        zzdd.zzb(this.zzc);
        int i2 = zzen.zza;
        int i3 = this.zzd;
        int i4 = 4;
        if (i3 == 0) {
            zzdd.zzf(zzzjVar.zzf() == 0);
            int i5 = this.zzg;
            if (i5 != -1) {
                ((zzyy) zzzjVar).zzo(i5, false);
                this.zzd = 4;
            } else {
                if (!zzaiz.zzc(zzzjVar)) {
                    throw zzbu.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzyy) zzzjVar).zzo((int) (zzzjVar.zze() - zzzjVar.zzf()), false);
                this.zzd = 1;
            }
            return 0;
        }
        long j = -1;
        if (i3 == 1) {
            zzef zzefVar = new zzef(8);
            zzaiy zza2 = zzaiy.zza(zzzjVar, zzefVar);
            if (zza2.zza != 1685272116) {
                zzzjVar.zzj();
            } else {
                zzyy zzyyVar = (zzyy) zzzjVar;
                zzyyVar.zzl(8, false);
                zzefVar.zzF(0);
                zzyyVar.zzm(zzefVar.zzH(), 0, 8, false);
                j = zzefVar.zzp();
                zzyyVar.zzo(((int) zza2.zzb) + 8, false);
            }
            this.zze = j;
            this.zzd = 2;
            return 0;
        }
        if (i3 == 2) {
            zzaix zzb = zzaiz.zzb(zzzjVar);
            int i6 = zzb.zza;
            if (i6 == 17) {
                this.zzf = new zzait(this.zzb, this.zzc, zzb);
            } else if (i6 == 6) {
                this.zzf = new zzaiv(this.zzb, this.zzc, zzb, "audio/g711-alaw", -1);
            } else if (i6 == 7) {
                this.zzf = new zzaiv(this.zzb, this.zzc, zzb, "audio/g711-mlaw", -1);
            } else {
                int i7 = zzb.zze;
                if (i6 != 1) {
                    if (i6 != 3) {
                    }
                    i = 0;
                    if (i != 0) {
                        throw zzbu.zzc("Unsupported WAV format type: " + i6);
                    }
                    this.zzf = new zzaiv(this.zzb, this.zzc, zzb, "audio/raw", i);
                }
                i4 = zzen.zzn(i7);
                i = i4;
                if (i != 0) {
                }
            }
            this.zzd = 3;
            return 0;
        }
        if (i3 != 3) {
            zzdd.zzf(this.zzh != -1);
            long zzf = this.zzh - zzzjVar.zzf();
            zzaiu zzaiuVar = this.zzf;
            Objects.requireNonNull(zzaiuVar);
            return zzaiuVar.zzc(zzzjVar, zzf) ? -1 : 0;
        }
        Pair zza3 = zzaiz.zza(zzzjVar);
        this.zzg = ((Long) zza3.first).intValue();
        long longValue = ((Long) zza3.second).longValue();
        long j2 = this.zze;
        if (j2 != -1 && longValue == 4294967295L) {
            longValue = j2;
        }
        long j3 = this.zzg + longValue;
        this.zzh = j3;
        long zzd = zzzjVar.zzd();
        if (zzd != -1 && j3 > zzd) {
            zzdw.zze("WavExtractor", "Data exceeds input length: " + j3 + ", " + zzd);
            this.zzh = zzd;
            j3 = zzd;
        }
        zzaiu zzaiuVar2 = this.zzf;
        Objects.requireNonNull(zzaiuVar2);
        zzaiuVar2.zza(this.zzg, j3);
        this.zzd = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzb = zzzlVar;
        this.zzc = zzzlVar.zzv(0, 1);
        zzzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzaiu zzaiuVar = this.zzf;
        if (zzaiuVar != null) {
            zzaiuVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        return zzaiz.zzc(zzzjVar);
    }
}
