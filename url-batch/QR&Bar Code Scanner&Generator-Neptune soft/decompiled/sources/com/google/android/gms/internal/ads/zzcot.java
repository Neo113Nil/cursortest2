package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcot implements zzgxi {
    private final zzcop zza;

    public zzcot(zzcop zzcopVar) {
        this.zza = zzcopVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzgxq.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzgxq.zzb(zzf);
        return zzf;
    }
}
