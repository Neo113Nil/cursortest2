package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbqs extends IHsdpServiceCallback.Stub {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbqv zzb;

    zzbqs(zzbqv zzbqvVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbqvVar);
        this.zzb = zzbqvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
    public final void onDismissed(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            this.zzb.zzg("hsdp_on_dismissed", this.zza, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
    public final void onError(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            this.zzb.zzg("hsdp_on_error", this.zza, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
    public final void onShown(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            this.zzb.zzg("hsdp_on_shown", this.zza, bundle);
        }
    }
}
