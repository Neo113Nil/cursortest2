package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzeid implements zzeey {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        String optString = zzfbgVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfby zzfbyVar = zzfbsVar.zza.zza;
        zzfbw zzfbwVar = new zzfbw();
        zzfbwVar.zzp(zzfbyVar);
        zzfbwVar.zzs(optString);
        Bundle zzd = zzd(zzfbyVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfbgVar.zzw.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfbgVar.zzw.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfbgVar.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfbgVar.zzE.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfbyVar.zzd;
        zzfbwVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzd2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, zzd, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzfby zzG = zzfbwVar.zzG();
        Bundle bundle = new Bundle();
        zzfbj zzfbjVar = zzfbsVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfbjVar.zza));
        bundle2.putInt("refresh_interval", zzfbjVar.zzc);
        bundle2.putString("gws_query_id", zzfbjVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfbsVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfbgVar.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfbgVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfbgVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfbgVar.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfbgVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfbgVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfbgVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfbgVar.zzj));
        bundle3.putString("transaction_id", zzfbgVar.zzk);
        bundle3.putString("valid_from_timestamp", zzfbgVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzfbgVar.zzQ);
        if (zzfbgVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfbgVar.zzm.zzb);
            bundle4.putString("rb_type", zzfbgVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        return !TextUtils.isEmpty(zzfbgVar.zzw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract zzfvj zzc(zzfby zzfbyVar, Bundle bundle);
}
