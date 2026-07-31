package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcot implements zzhpx {
    private final zzcor zza;

    private zzcot(zzcor zzcorVar) {
        this.zza = zzcorVar;
    }

    public static zzcot zzc(zzcor zzcorVar) {
        return new zzcot(zzcorVar);
    }

    public static View zzd(zzcor zzcorVar) {
        View zzb = zzcorVar.zzb();
        zzhqf.zzb(zzb);
        return zzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
