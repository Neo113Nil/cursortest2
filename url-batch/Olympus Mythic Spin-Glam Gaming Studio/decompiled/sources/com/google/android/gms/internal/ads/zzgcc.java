package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzgcc {

    @NotNull
    private final zzgby zza;

    public final /* synthetic */ zzgca zza() {
        zzifm zzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
        return (zzgca) zzbu;
    }

    public final /* synthetic */ zziiq zzb() {
        Map zzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(zzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziiq(zzb);
    }

    public final void zzc(@NotNull zziiq zziiqVar, @NotNull String key, @NotNull zzgbw value) {
        Intrinsics.checkNotNullParameter(zziiqVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zziiq zziiqVar, String key) {
        Intrinsics.checkNotNullParameter(zziiqVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
