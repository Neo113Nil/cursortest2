package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcop {
    private final zzcgv zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzcop(zzcon zzconVar, zzcoo zzcooVar) {
        zzcgv zzcgvVar;
        Context context;
        WeakReference weakReference;
        zzcgvVar = zzconVar.zza;
        this.zza = zzcgvVar;
        context = zzconVar.zzb;
        this.zzb = context;
        weakReference = zzconVar.zzc;
        this.zzc = weakReference;
    }

    final Context zza() {
        return this.zzb;
    }

    public final zzape zzb() {
        return new zzape(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    final zzbll zzc() {
        return new zzbll(this.zzb);
    }

    final zzcgv zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    final WeakReference zzf() {
        return this.zzc;
    }
}
