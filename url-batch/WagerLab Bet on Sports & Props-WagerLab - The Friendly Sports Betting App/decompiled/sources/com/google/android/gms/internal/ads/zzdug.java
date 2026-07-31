package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdug implements zzdtv {
    private final long zza;
    private final zzelq zzb;

    zzdug(long j, Context context, zzdtz zzdtzVar, zzcgv zzcgvVar, String str) {
        this.zza = j;
        zzfap zzl = zzcgvVar.zzl();
        zzl.zzd(context);
        zzl.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzl.zzc(str);
        zzelq zza = zzl.zza().zza();
        this.zzb = zza;
        zza.zzdW(new zzduf(this, zzdtzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzc() {
        this.zzb.zzc();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
