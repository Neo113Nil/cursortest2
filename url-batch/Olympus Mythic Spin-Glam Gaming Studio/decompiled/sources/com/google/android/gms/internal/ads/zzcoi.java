package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcoi implements zzinw {
    private final zzcod zza;

    private zzcoi(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcoi zzc(zzcod zzcodVar) {
        return new zzcoi(zzcodVar);
    }

    public static Context zzd(zzcod zzcodVar) {
        Context zzb = zzcodVar.zzb();
        zzioe.zzb(zzb);
        return zzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
