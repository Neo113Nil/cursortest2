package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbkl {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzc;
    private final zzeao zzd;
    private Runnable zze;
    private zzbki zzf;
    private CustomTabsSession zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    @VisibleForTesting
    public zzbkl(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, zzeao zzeaoVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzjVar;
        this.zzc = zzaVar;
        this.zzd = zzeaoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzlx)).booleanValue() != false) goto L23;
     */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        ScheduledExecutorService scheduledExecutorService;
        zzbki zzbkiVar = this.zzf;
        if (zzbkiVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbkiVar.zza().booleanValue()) {
            return;
        }
        if (this.zzh != null && this.zzg != null && (scheduledExecutorService = this.zza) != null) {
            if (this.zzi == 0 || com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() > this.zzi) {
            }
            this.zzg.requestPostMessageChannel(Uri.parse(this.zzh));
            scheduledExecutorService.schedule(this.zze, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzly)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlA));
            }
            jSONObject.put(POBConstants.KEY_EIDS, this.zzk);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching the PACT active eids JSON: ", e);
        }
    }

    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    final void zzc() {
        this.zzi = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlw)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbkl.this.zzh();
                }
            };
        }
        zzh();
    }

    final void zzd(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzblm.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zzb());
            }
            customTabsSession.postMessage(jSONObject.toString(), null);
            zzbkj zzbkjVar = new zzbkj(this, str);
            if (((Boolean) zzblm.zze.zze()).booleanValue()) {
                this.zzb.zzb(this.zzg, zzbkjVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbkjVar);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating JSON: ", e);
        }
    }

    @VisibleForTesting
    final JSONObject zze(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblm.zze.zze()).booleanValue() ? ((Long) zzblm.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzblm.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    @VisibleForTesting
    final JSONObject zzf(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzblm.zze.zze()).booleanValue() ? ((Long) zzblm.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzblm.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    public final void zzg(long j) {
        this.zzj = j;
    }

    final /* synthetic */ CustomTabsSession zzi() {
        return this.zzg;
    }

    public final void zza(Context context, CustomTabsClient customTabsClient, String str, CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzeao zzeaoVar = this.zzd;
        zzbki zzbkiVar = new zzbki(this, customTabsCallback, zzeaoVar);
        this.zzf = zzbkiVar;
        CustomTabsSession newSession = customTabsClient.newSession(zzbkiVar);
        this.zzg = newSession;
        if (newSession == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(zzeaoVar, null, "pact_action", new Pair("pe", "pact_init"));
    }
}
