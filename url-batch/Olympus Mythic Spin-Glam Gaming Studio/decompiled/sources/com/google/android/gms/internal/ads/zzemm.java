package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzemm {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    zzemm(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            MeasurementManagerFutures from = MeasurementManagerFutures.from(this.zzb);
            this.zza = from;
            return from == null ? zzhcy.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : from.getMeasurementApiStatusAsync();
        } catch (Exception e) {
            return zzhcy.zzc(e);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
        } catch (Exception e) {
            return zzhcy.zzc(e);
        }
    }
}
