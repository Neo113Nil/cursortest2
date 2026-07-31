package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcoy implements zzinw {
    private final zziof zza;

    private zzcoy(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcoy zza(zziof zziofVar) {
        return new zzcoy(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcok) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznd)).booleanValue()) {
            return com.google.android.gms.ads.internal.util.client.zzf.zzf(zza);
        }
        return null;
    }
}
