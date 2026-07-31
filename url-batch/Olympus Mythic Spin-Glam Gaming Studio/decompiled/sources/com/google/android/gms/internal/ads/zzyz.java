package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzyz implements zzabo {
    public long zza;
    public long zzb;

    @Nullable
    public zzabn zzc;

    @Nullable
    public zzyz zzd;

    public zzyz(long j, int i) {
        zza(j, 65536);
    }

    public final void zza(long j, int i) {
        zzguk.zzi(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzyz zzc() {
        this.zzc = null;
        zzyz zzyzVar = this.zzd;
        this.zzd = null;
        return zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    @Nullable
    public final zzabo zze() {
        zzyz zzyzVar = this.zzd;
        if (zzyzVar == null || zzyzVar.zzc == null) {
            return null;
        }
        return zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final zzabn zzd() {
        zzabn zzabnVar = this.zzc;
        zzabnVar.getClass();
        return zzabnVar;
    }
}
