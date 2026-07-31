package com.google.android.gms.ads.h5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbrp;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes15.dex */
public final class H5AdsRequestHandler {
    private final zzbrp zza;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbrp(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zzb();
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        return this.zza.zza(str);
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return zzbrp.zzc(str);
    }
}
