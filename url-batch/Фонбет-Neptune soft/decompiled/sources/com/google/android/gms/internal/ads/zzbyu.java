package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbyu implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbzt zzb;

    zzbyu(zzbyv zzbyvVar, Context context, zzbzt zzbztVar) {
        this.zza = context;
        this.zzb = zzbztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception while getting advertising Id info", e);
        }
    }
}
