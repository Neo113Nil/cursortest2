package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzehv implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;

    public zzehv(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzehu((zzcwf) this.zza.zzb(), (Context) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzduy) this.zzd.zzb());
    }
}
