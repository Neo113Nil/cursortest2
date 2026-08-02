package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zztl implements zzvx {
    public final zzvx zza;
    final /* synthetic */ zztm zzb;
    private boolean zzc;

    public zztl(zztm zztmVar, zzvx zzvxVar) {
        this.zzb = zztmVar;
        this.zza = zzvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zza(zzjz zzjzVar, zzhd zzhdVar, int i) {
        zztm zztmVar = this.zzb;
        if (zztmVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhdVar.zzc(4);
            return -4;
        }
        long zzb = zztmVar.zzb();
        int zza = this.zza.zza(zzjzVar, zzhdVar, i);
        if (zza != -5) {
            long j = this.zzb.zzb;
            if (j == Long.MIN_VALUE || ((zza != -4 || zzhdVar.zze < j) && !(zza == -3 && zzb == Long.MIN_VALUE && !zzhdVar.zzd))) {
                return zza;
            }
            zzhdVar.zzb();
            zzhdVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzaf zzafVar = zzjzVar.zza;
        zzafVar.getClass();
        int i2 = zzafVar.zzC;
        if (i2 == 0) {
            if (zzafVar.zzD != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzafVar.zzD : 0;
        zzad zzb2 = zzafVar.zzb();
        zzb2.zzF(i2);
        zzb2.zzG(i3);
        zzjzVar.zza = zzb2.zzad();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
