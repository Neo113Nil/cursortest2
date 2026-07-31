package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcod {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzcod(zzcoc zzcocVar, byte[] bArr) {
        this.zza = zzcocVar.zzd();
        this.zzb = zzcocVar.zze();
        this.zzd = zzcocVar.zzg();
        this.zzc = zzcocVar.zzf();
    }

    final Context zza() {
        return this.zzb;
    }

    final Context zzb() {
        return this.zzb;
    }

    final WeakReference zzc() {
        return this.zzd;
    }

    final VersionInfoParcel zzd() {
        return this.zza;
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }

    final zzcoa zzf() {
        return new zzcoa(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    final zzbmb zzh() {
        return new zzbmb(this.zzb);
    }

    final long zzi() {
        return this.zzc;
    }
}
