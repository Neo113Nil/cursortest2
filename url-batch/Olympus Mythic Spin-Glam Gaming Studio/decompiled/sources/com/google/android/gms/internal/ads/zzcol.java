package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcol implements zzinw {
    private final zzcod zza;

    private zzcol(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcol zzc(zzcod zzcodVar) {
        return new zzcol(zzcodVar);
    }

    public static WeakReference zzd(zzcod zzcodVar) {
        WeakReference zzc = zzcodVar.zzc();
        zzioe.zzb(zzc);
        return zzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
