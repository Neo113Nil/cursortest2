package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzbva {

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbuy();

    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbuz();
    private final zzbum zzc;

    public zzbva(Context context, VersionInfoParcel versionInfoParcel, String str, zzfrj zzfrjVar) {
        this.zzc = new zzbum(context, versionInfoParcel, str, zza, zzb, zzfrjVar);
    }

    public final zzbuq zza(String str, zzbut zzbutVar, zzbus zzbusVar) {
        return new zzbve(this.zzc, str, zzbutVar, zzbusVar);
    }

    public final zzbvj zzb() {
        return new zzbvj(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
