package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.kobakei.ratethisapp.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbjw {
    public static final zzbja zza = zzbja.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbja zzb = zzbja.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbja zzc = zzbja.zzc("gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME);
    public static final zzbja zzd = zzbja.zzc("gads:sdk_crash_report_class_prefix", "com.google.");
    public static final zzbja zze = zzbja.zzd("gads:sdk_crash_report_enabled", false);
    public static final zzbja zzf = zzbja.zzd("gads:sdk_crash_report_full_stacktrace", false);
    public static final zzbja zzg = zzbja.zza("gads:trapped_exception_sample_rate", 0.01d);
}
