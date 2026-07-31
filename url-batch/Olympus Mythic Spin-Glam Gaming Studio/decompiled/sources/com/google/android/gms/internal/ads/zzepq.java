package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public abstract class zzepq implements zzemq {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        return !TextUtils.isEmpty(zzfldVar.zzv.optString("pubid", ""));
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(zzflo zzfloVar, zzfld zzfldVar) {
        JSONObject jSONObject = zzfldVar.zzv;
        String optString = jSONObject.optString("pubid", "");
        zzflw zzflwVar = zzfloVar.zza.zza;
        zzflv zzflvVar = new zzflv();
        zzflvVar.zzA(zzflwVar);
        zzflvVar.zzg(optString);
        zzflvVar.zzy(true);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.zzd;
        Bundle zzd = zzd(zzmVar.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfldVar.zzD;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        zzflvVar.zza(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, zzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz, zzmVar.zzA, zzmVar.zzB));
        zzflvVar.zzz(zzfldVar.zzaH);
        zzflw zzB = zzflvVar.zzB();
        Bundle bundle = new Bundle();
        zzflg zzflgVar = zzfloVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzflgVar.zza));
        bundle2.putInt("refresh_interval", zzflgVar.zzc);
        bundle2.putString("gws_query_id", zzflgVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzflwVar.zzg;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfldVar.zzw);
        bundle3.putString("ad_source_name", zzfldVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfldVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfldVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfldVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfldVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfldVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfldVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfldVar.zzi));
        bundle3.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, zzfldVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfldVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfldVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfldVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfldVar.zzW);
        zzcct zzcctVar = zzfldVar.zzl;
        if (zzcctVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcctVar.zzb);
            bundle4.putString("rb_type", zzcctVar.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzB, bundle, zzfldVar, zzfloVar);
    }

    protected abstract ListenableFuture zzc(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar);
}
