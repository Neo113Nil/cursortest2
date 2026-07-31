package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzchb implements zzhpx {
    private final zzcgx zza;

    private zzchb(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public static zzchb zzc(zzcgx zzcgxVar) {
        return new zzchb(zzcgxVar);
    }

    public static Context zzd(zzcgx zzcgxVar) {
        Context zzb = zzcgxVar.zzb();
        zzhqf.zzb(zzb);
        return zzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
