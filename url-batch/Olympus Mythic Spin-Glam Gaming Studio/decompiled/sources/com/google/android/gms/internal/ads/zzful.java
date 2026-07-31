package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzful {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private String zzc;

    public zzful(String str, @Nullable AdFormat adFormat) {
        this.zza = str;
        this.zzb = adFormat;
    }

    public final zzful zza(String str) {
        this.zzc = str;
        return this;
    }

    final /* synthetic */ String zzb() {
        return this.zza;
    }

    final /* synthetic */ AdFormat zzc() {
        return this.zzb;
    }

    final /* synthetic */ String zzd() {
        return this.zzc;
    }
}
