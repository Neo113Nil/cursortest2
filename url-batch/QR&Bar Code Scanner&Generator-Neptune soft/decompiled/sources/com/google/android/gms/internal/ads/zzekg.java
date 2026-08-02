package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzekg implements zzehc {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        String optString = zzfdkVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfef zzfefVar = zzfdwVar.zza.zza;
        zzfed zzfedVar = new zzfed();
        zzfedVar.zzp(zzfefVar);
        zzfedVar.zzs(optString);
        Bundle zzd = zzd(zzfefVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfdkVar.zzw.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfdkVar.zzw.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfdkVar.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfdkVar.zzE.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfefVar.zzd;
        zzfedVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzd2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, zzd, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzfef zzG = zzfedVar.zzG();
        Bundle bundle = new Bundle();
        zzfdn zzfdnVar = zzfdwVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfdnVar.zza));
        bundle2.putInt("refresh_interval", zzfdnVar.zzc);
        bundle2.putString("gws_query_id", zzfdnVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfdwVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfdkVar.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfdkVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfdkVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfdkVar.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfdkVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfdkVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfdkVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfdkVar.zzj));
        bundle3.putString("transaction_id", zzfdkVar.zzk);
        bundle3.putString("valid_from_timestamp", zzfdkVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzfdkVar.zzQ);
        if (zzfdkVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfdkVar.zzm.zzb);
            bundle4.putString("rb_type", zzfdkVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        return !TextUtils.isEmpty(zzfdkVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract zzfzp zzc(zzfef zzfefVar, Bundle bundle);
}
