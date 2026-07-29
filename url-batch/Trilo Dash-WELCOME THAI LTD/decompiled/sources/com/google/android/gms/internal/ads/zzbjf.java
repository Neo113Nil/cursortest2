package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbjf {
    public static final zzbja zza = zzbjb.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbja zzb = zzbjb.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbja zzc = new zzbjb("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbja zzd = new zzbjb("gads:consent:gmscore:time_out", Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS), 2);
    public static final zzbja zze = zzbjb.zzf("gads:consent:gmscore:enabled", true);
}
