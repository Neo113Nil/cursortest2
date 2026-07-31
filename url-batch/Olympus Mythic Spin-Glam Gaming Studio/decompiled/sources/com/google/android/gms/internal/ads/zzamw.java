package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzamw {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;

    @Nullable
    public final zzhbh zzi;

    @Nullable
    public final zzhbh zzj;
    public final int zzk;
    public final int zzl;
    public final boolean zzm;

    @Nullable
    private final zzamx[] zzn;

    @Nullable
    public final zzamx zza(int i) {
        zzamx[] zzamxVarArr = this.zzn;
        if (zzamxVarArr == null) {
            return null;
        }
        return zzamxVarArr[i];
    }

    final /* synthetic */ zzamx[] zzb() {
        return this.zzn;
    }

    /* synthetic */ zzamw(zzamv zzamvVar, byte[] bArr) {
        this.zza = zzamvVar.zzp();
        this.zzb = zzamvVar.zzq();
        this.zzc = zzamvVar.zzr();
        this.zzd = zzamvVar.zzs();
        this.zze = zzamvVar.zzt();
        this.zzf = zzamvVar.zzu();
        zzv zzv = zzamvVar.zzv();
        zzv.getClass();
        this.zzg = zzv;
        this.zzh = zzamvVar.zzw();
        this.zzn = zzamvVar.zzx();
        this.zzk = zzamvVar.zzy();
        this.zzi = zzamvVar.zzz();
        this.zzj = zzamvVar.zzA();
        this.zzm = zzamvVar.zzB();
        this.zzl = zzamvVar.zzC();
    }
}
