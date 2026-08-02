package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdqx implements zzgxi {
    private final zzdqq zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdqx(zzdqq zzdqqVar, zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzdqqVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkg(((zzdty) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
