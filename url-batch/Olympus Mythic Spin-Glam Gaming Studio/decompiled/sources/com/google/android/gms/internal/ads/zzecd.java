package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzecd implements zzebs {
    private final long zza;
    private final zzeui zzb;

    zzecd(long j, Context context, zzebw zzebwVar, zzcob zzcobVar, String str) {
        this.zza = j;
        zzfji zzn = zzcobVar.zzn();
        zzn.zzd(context);
        zzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzn.zzc(str);
        zzeui zza = zzn.zza().zza();
        this.zzb = zza;
        zza.zzg(new zzecc(this, zzebwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzd(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzb() {
        this.zzb.zzQ(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzc() {
        this.zzb.zzb();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
