package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzasq {
    public final zzayc zza;
    public final Object zzb;
    public final int zzc;
    public final zzayo[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzasq zzl;
    public zzazi zzm;
    private final zzatb[] zzn;
    private final zzatc[] zzo;
    private final zzazh zzp;
    private final zzaye zzq;
    private zzazi zzr;
    private final zzcjv zzs;

    public final long zza(long j, boolean z) {
        return zzb(j, false, new boolean[2]);
    }

    public final long zzb(long j, boolean z, boolean[] zArr) {
        zzazf zzazfVar = this.zzm.zzb;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zzB = this.zza.zzB(zzazfVar.zzb(), this.zze, this.zzd, zArr, j);
        this.zzr = this.zzm;
        this.zzk = false;
        int i2 = 0;
        while (true) {
            zzayo[] zzayoVarArr = this.zzd;
            if (i2 >= 2) {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzazfVar);
                return zzB;
            }
            if (zzayoVarArr[i2] != null) {
                zzbac.zze(zzazfVar.zza(i2) != null);
                this.zzk = true;
            } else {
                zzbac.zze(zzazfVar.zza(i2) == null);
            }
            i2++;
        }
    }

    public final void zzc() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    public final boolean zzd() {
        return this.zzj && (!this.zzk || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final boolean zze() throws zzasi {
        zzazi zzc = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzazi zzaziVar = this.zzr;
        if (zzaziVar != null) {
            for (int i = 0; i < 2; i++) {
                if (zzc.zza(zzaziVar, i)) {
                }
            }
            return false;
        }
        this.zzm = zzc;
        return true;
    }

    public zzasq(zzatb[] zzatbVarArr, zzatc[] zzatcVarArr, long j, zzazh zzazhVar, zzcjv zzcjvVar, zzaye zzayeVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.zzn = zzatbVarArr;
        this.zzo = zzatcVarArr;
        this.zzf = j;
        this.zzp = zzazhVar;
        this.zzs = zzcjvVar;
        this.zzq = zzayeVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
        this.zzc = i;
        this.zzg = i2;
        this.zzi = z;
        this.zzh = j2;
        this.zzd = new zzayo[2];
        this.zze = new boolean[2];
        this.zza = zzayeVar.zze(i2, zzcjvVar.zzl());
    }
}
