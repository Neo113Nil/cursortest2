package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbdn {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final zzdsr zzd;
    private Runnable zze;
    private zzbdk zzf;
    private CustomTabsSession zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbdn(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdsr zzdsrVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdsrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzkG)).booleanValue() != false) goto L23;
     */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        ScheduledExecutorService scheduledExecutorService;
        zzbdk zzbdkVar = this.zzf;
        if (zzbdkVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbdkVar.zza().booleanValue()) {
            return;
        }
        if (this.zzh != null && this.zzg != null && (scheduledExecutorService = this.zza) != null) {
            if (this.zzi == 0 || com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() > this.zzi) {
            }
            this.zzg.requestPostMessageChannel(Uri.parse(this.zzh));
            scheduledExecutorService.schedule(this.zze, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkH)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkJ));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    final void zzc() {
        this.zzi = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkF)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbdn.this.zzh();
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
            if (((Boolean) zzben.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zzb());
            }
            customTabsSession.postMessage(jSONObject.toString(), null);
            zzbdl zzbdlVar = new zzbdl(this, str);
            if (((Boolean) zzben.zze.zze()).booleanValue()) {
                this.zzb.zzb(this.zzg, zzbdlVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbdlVar);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating JSON: ", e);
        }
    }

    final JSONObject zze(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    final JSONObject zzf(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzben.zze.zze()).booleanValue() ? ((Long) zzben.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzben.zzc.zze()).booleanValue()) {
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

    public final void zza(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
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
        zzdsr zzdsrVar = this.zzd;
        zzbdk zzbdkVar = new zzbdk(this, customTabsCallback, zzdsrVar);
        this.zzf = zzbdkVar;
        CustomTabsSession newSession = customTabsClient.newSession(zzbdkVar);
        this.zzg = newSession;
        if (newSession == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(zzdsrVar, null, "pact_action", new Pair("pe", "pact_init"));
    }
}
