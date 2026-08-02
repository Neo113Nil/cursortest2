package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdzb implements zzdyp {
    private final long zza;
    private final zzeon zzb;

    zzdzb(long j, Context context, zzdyu zzdyuVar, zzcom zzcomVar, String str) {
        this.zza = j;
        zzfbp zzt = zzcomVar.zzt();
        zzt.zzc(context);
        zzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzt.zzb(str);
        zzeon zza = zzt.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdza(this, zzdyuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
