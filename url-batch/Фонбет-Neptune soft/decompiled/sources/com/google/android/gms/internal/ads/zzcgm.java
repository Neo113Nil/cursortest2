package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcgm {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzcgm(zzcgk zzcgkVar, zzcgl zzcglVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j;
        versionInfoParcel = zzcgkVar.zza;
        this.zza = versionInfoParcel;
        context = zzcgkVar.zzb;
        this.zzb = context;
        weakReference = zzcgkVar.zzd;
        this.zzd = weakReference;
        j = zzcgkVar.zzc;
        this.zzc = j;
    }

    final long zza() {
        return this.zzc;
    }

    final Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzj zzc() {
        return new com.google.android.gms.ads.internal.zzj(this.zzb, this.zza);
    }

    final zzbel zzd() {
        return new zzbel(this.zzb);
    }

    final VersionInfoParcel zze() {
        return this.zza;
    }

    final String zzf() {
        return com.google.android.gms.ads.internal.zzu.zzp().zzc(this.zzb, this.zza.afmaVersion);
    }

    final WeakReference zzg() {
        return this.zzd;
    }
}
