package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzamm implements zzamd {
    private final zzang zza;
    private String zzb;
    private zzaeb zzc;
    private zzaml zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamu zzg = new zzamu(32, 128);
    private final zzamu zzh = new zzamu(33, 128);
    private final zzamu zzi = new zzamu(34, 128);
    private final zzamu zzj = new zzamu(39, 128);
    private final zzamu zzk = new zzamu(40, 128);
    private long zzm = C.TIME_UNSET;
    private final zzef zzn = new zzef();

    public zzamm(zzang zzangVar, String str) {
        this.zza = zzangVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzamu zzamuVar = this.zzg;
            zzamuVar.zze(i2);
            zzamu zzamuVar2 = this.zzh;
            zzamuVar2.zze(i2);
            zzamu zzamuVar3 = this.zzi;
            zzamuVar3.zze(i2);
            if (zzamuVar.zzb() && zzamuVar2.zzb() && zzamuVar3.zzb()) {
                String str = this.zzb;
                int i3 = zzamuVar.zzb;
                byte[] bArr = new byte[zzamuVar2.zzb + i3 + zzamuVar3.zzb];
                System.arraycopy(zzamuVar.zza, 0, bArr, 0, i3);
                System.arraycopy(zzamuVar2.zza, 0, bArr, zzamuVar.zzb, zzamuVar2.zzb);
                System.arraycopy(zzamuVar3.zza, 0, bArr, zzamuVar.zzb + zzamuVar2.zzb, zzamuVar3.zzb);
                String str2 = null;
                zzff zzf = zzfl.zzf(zzamuVar2.zza, 3, zzamuVar2.zzb, null);
                zzfa zzfaVar = zzf.zzb;
                if (zzfaVar != null) {
                    int i4 = zzfaVar.zzf;
                    int[] iArr = zzfaVar.zze;
                    int i5 = zzfaVar.zzd;
                    str2 = zzdc.zzc(zzfaVar.zza, zzfaVar.zzb, zzfaVar.zzc, i5, iArr, i4);
                }
                zzs zzsVar = new zzs();
                zzsVar.zza(str);
                zzsVar.zzl(MimeTypes.VIDEO_MP2T);
                zzsVar.zzm(MimeTypes.VIDEO_H265);
                zzsVar.zzj(str2);
                zzsVar.zzt(zzf.zze);
                zzsVar.zzu(zzf.zzf);
                zzsVar.zzv(zzf.zzg);
                zzsVar.zzw(zzf.zzh);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzf.zzk);
                zzgVar.zzb(zzf.zzl);
                zzgVar.zzc(zzf.zzm);
                zzgVar.zze(zzf.zzc + 8);
                zzgVar.zzf(zzf.zzd + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzf.zzi);
                zzsVar.zzo(zzf.zzj);
                zzsVar.zzD(zzf.zza + 1);
                zzsVar.zzp(Collections.singletonList(bArr));
                zzu zzM = zzsVar.zzM();
                this.zzc.zzu(zzM);
                int i6 = zzM.zzq;
                zzghc.zzh(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        zzamu zzamuVar4 = this.zzj;
        if (zzamuVar4.zze(i2)) {
            int zza = zzfl.zza(zzamuVar4.zza, zzamuVar4.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar4.zza, zza);
            zzefVar.zzk(5);
            this.zza.zzc(j2, zzefVar);
        }
        zzamu zzamuVar5 = this.zzk;
        if (zzamuVar5.zze(i2)) {
            int zza2 = zzfl.zza(zzamuVar5.zza, zzamuVar5.zzb);
            zzef zzefVar2 = this.zzn;
            zzefVar2.zzb(zzamuVar5.zza, zza2);
            zzefVar2.zzk(5);
            this.zza.zzc(j2, zzefVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzl = 0L;
        this.zzm = C.TIME_UNSET;
        zzfl.zzi(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaml zzamlVar = this.zzd;
        if (zzamlVar != null) {
            zzamlVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzb = zzanrVar.zzc();
        this.zzc = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzd = new zzaml(this.zzc);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzc.getClass();
        String str = zzeo.zza;
        while (zzefVar.zzd() > 0) {
            int zzg = zzefVar.zzg();
            int zze = zzefVar.zze();
            byte[] zzi = zzefVar.zzi();
            this.zzl += zzefVar.zzd();
            this.zzc.zzz(zzefVar, zzefVar.zzd());
            while (zzg < zze) {
                int zzh = zzfl.zzh(zzi, zzg, zze, this.zzf);
                if (zzh == zze) {
                    zzg(zzi, zzg, zze);
                    return;
                }
                int i = zzi[zzh + 3] & 126;
                int i2 = 3;
                if (zzh > 0) {
                    int i3 = zzh - 1;
                    if (zzi[i3] == 0) {
                        i2 = 4;
                        zzh = i3;
                    }
                }
                int i4 = zzh - zzg;
                if (i4 > 0) {
                    zzg(zzi, zzg, zzh);
                }
                int i5 = zze - zzh;
                long j = this.zzl - i5;
                zzh(j, i5, i4 < 0 ? -i4 : 0, this.zzm);
                zzf(j, i5, i >> 1, this.zzm);
                zzg = zzh + i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        this.zzc.getClass();
        String str = zzeo.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
