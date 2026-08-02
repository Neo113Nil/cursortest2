package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepm implements zzevd {
    final zzfef zza;
    private final long zzb;

    public zzepm(zzfef zzfefVar, long j) {
        Preconditions.checkNotNull(zzfefVar, "the targeting must not be null");
        this.zza = zzfefVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzevd
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfeq.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        zzfeq.zzb(bundle, "extras", zzlVar.zzc);
        int i3 = zzlVar.zzd;
        zzfeq.zze(bundle, "cust_gender", i3, i3 != -1);
        zzfeq.zzd(bundle, "kw", zzlVar.zze);
        int i4 = zzlVar.zzg;
        zzfeq.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        zzfeq.zze(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
        String str = zzlVar.zzi;
        zzfeq.zzf(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzlVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy();
            long time = location.getTime();
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy * 1000.0f);
            bundle2.putLong("lat", (long) (latitude * 1.0E7d));
            bundle2.putLong("long", (long) (longitude * 1.0E7d));
            bundle2.putLong("time", time * 1000);
            bundle.putBundle("uule", bundle2);
        }
        zzfeq.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
        zzfeq.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
        zzfeq.zzb(bundle, "custom_targeting", zzlVar.zzn);
        zzfeq.zzd(bundle, "category_exclusions", zzlVar.zzo);
        zzfeq.zzc(bundle, "request_agent", zzlVar.zzp);
        zzfeq.zzc(bundle, "request_pkg", zzlVar.zzq);
        zzfeq.zzg(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i5 = zzlVar.zzt;
            zzfeq.zze(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            zzfeq.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
