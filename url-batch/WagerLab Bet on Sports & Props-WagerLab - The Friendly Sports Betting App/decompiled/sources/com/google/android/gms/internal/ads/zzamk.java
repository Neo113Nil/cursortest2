package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzamk implements zzamd {
    private final zzang zza;
    private long zzf;
    private String zzh;
    private zzaeb zzi;
    private zzamj zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private final boolean[] zzg = new boolean[3];
    private final zzamu zzc = new zzamu(7, 128);
    private final zzamu zzd = new zzamu(8, 128);
    private final zzamu zze = new zzamu(6, 128);
    private long zzl = C.TIME_UNSET;
    private final zzef zzn = new zzef();

    public zzamk(zzang zzangVar, boolean z, boolean z2, String str) {
        this.zza = zzangVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = C.TIME_UNSET;
        zzfl.zzi(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzamj zzamjVar = this.zzj;
        if (zzamjVar != null) {
            zzamjVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        this.zzi = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzj = new zzamj(this.zzi, false, false);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzef zzefVar) {
        int i;
        int i2;
        int i3;
        this.zzi.getClass();
        String str = zzeo.zza;
        int zzg = zzefVar.zzg();
        int zze = zzefVar.zze();
        byte[] zzi = zzefVar.zzi();
        this.zzf += zzefVar.zzd();
        this.zzi.zzz(zzefVar, zzefVar.zzd());
        while (true) {
            int zzh = zzfl.zzh(zzi, zzg, zze, this.zzg);
            if (zzh == zze) {
                zzg(zzi, zzg, zze);
                return;
            }
            int i4 = zzi[zzh + 3] & Ascii.US;
            if (zzh > 0) {
                int i5 = zzh - 1;
                if (zzi[i5] == 0) {
                    i2 = 4;
                    i = i5;
                    i3 = i - zzg;
                    if (i3 > 0) {
                        zzg(zzi, zzg, i);
                    }
                    int i6 = zze - i;
                    long j = this.zzf - i6;
                    zzh(j, i6, i3 >= 0 ? -i3 : 0, this.zzl);
                    zzf(j, i4, this.zzl);
                    zzg = i + i2;
                }
            }
            i = zzh;
            i2 = 3;
            i3 = i - zzg;
            if (i3 > 0) {
            }
            int i62 = zze - i;
            long j2 = this.zzf - i62;
            zzh(j2, i62, i3 >= 0 ? -i3 : 0, this.zzl);
            zzf(j2, i4, this.zzl);
            zzg = i + i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        this.zzi.getClass();
        String str = zzeo.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzamu zzamuVar = this.zzc;
            zzamuVar.zze(i2);
            zzamu zzamuVar2 = this.zzd;
            zzamuVar2.zze(i2);
            if (this.zzk) {
                if (zzamuVar.zzb()) {
                    zzfk zzd = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                    this.zza.zzb(zzd.zzm);
                    this.zzj.zza(zzd);
                    zzamuVar.zza();
                } else if (zzamuVar2.zzb()) {
                    this.zzj.zzb(zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb));
                    zzamuVar2.zza();
                }
            } else if (zzamuVar.zzb() && zzamuVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzamuVar.zza, zzamuVar.zzb));
                arrayList.add(Arrays.copyOf(zzamuVar2.zza, zzamuVar2.zzb));
                zzfk zzd2 = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                zzfj zzg = zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb);
                String zzb = zzdc.zzb(zzd2.zza, zzd2.zzb, zzd2.zzc);
                zzaeb zzaebVar = this.zzi;
                zzs zzsVar = new zzs();
                zzsVar.zza(this.zzh);
                zzsVar.zzl(this.zzb);
                zzsVar.zzm(MimeTypes.VIDEO_H264);
                zzsVar.zzj(zzb);
                zzsVar.zzt(zzd2.zze);
                zzsVar.zzu(zzd2.zzf);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzd2.zzj);
                zzgVar.zzb(zzd2.zzk);
                zzgVar.zzc(zzd2.zzl);
                zzgVar.zze(zzd2.zzh + 8);
                zzgVar.zzf(zzd2.zzi + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzd2.zzg);
                zzsVar.zzp(arrayList);
                int i3 = zzd2.zzm;
                zzsVar.zzo(i3);
                zzaebVar.zzu(zzsVar.zzM());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zzd2);
                this.zzj.zzb(zzg);
                zzamuVar.zza();
                zzamuVar2.zza();
            }
        }
        zzamu zzamuVar3 = this.zze;
        if (zzamuVar3.zze(i2)) {
            int zza = zzfl.zza(zzamuVar3.zza, zzamuVar3.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar3.zza, zza);
            zzefVar.zzh(4);
            this.zza.zzc(j2, zzefVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
