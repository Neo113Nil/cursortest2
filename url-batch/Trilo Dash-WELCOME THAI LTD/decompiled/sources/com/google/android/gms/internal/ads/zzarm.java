package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzarm {
    public final zzawy zza;
    public final Object zzb;
    public final int zzc;
    public final zzaxk[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzarm zzl;
    public zzaye zzm;
    private final zzarx[] zzn;
    private final zzary[] zzo;
    private final zzayd zzp;
    private final zzaxa zzq;
    private zzaye zzr;
    private final zzcio zzs;

    public final long zza(long j, boolean z) {
        return zzb(j, false, new boolean[2]);
    }

    public final long zzb(long j, boolean z, boolean[] zArr) {
        zzayb zzaybVar = this.zzm.zzb;
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
        long zzB = this.zza.zzB(zzaybVar.zzb(), this.zze, this.zzd, zArr, j);
        this.zzr = this.zzm;
        this.zzk = false;
        int i2 = 0;
        while (true) {
            zzaxk[] zzaxkVarArr = this.zzd;
            if (i2 >= 2) {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzaybVar);
                return zzB;
            }
            if (zzaxkVarArr[i2] != null) {
                zzayy.zze(zzaybVar.zza(i2) != null);
                this.zzk = true;
            } else {
                zzayy.zze(zzaybVar.zza(i2) == null);
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

    public final boolean zze() throws zzare {
        zzaye zzc = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzaye zzayeVar = this.zzr;
        if (zzayeVar != null) {
            for (int i = 0; i < 2; i++) {
                if (zzc.zza(zzayeVar, i)) {
                }
            }
            return false;
        }
        this.zzm = zzc;
        return true;
    }

    public zzarm(zzarx[] zzarxVarArr, zzary[] zzaryVarArr, long j, zzayd zzaydVar, zzcio zzcioVar, zzaxa zzaxaVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.zzn = zzarxVarArr;
        this.zzo = zzaryVarArr;
        this.zzf = j;
        this.zzp = zzaydVar;
        this.zzs = zzcioVar;
        this.zzq = zzaxaVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
        this.zzc = i;
        this.zzg = i2;
        this.zzi = z;
        this.zzh = j2;
        this.zzd = new zzaxk[2];
        this.zze = new boolean[2];
        this.zza = zzaxaVar.zze(i2, zzcioVar.zzl());
    }
}
