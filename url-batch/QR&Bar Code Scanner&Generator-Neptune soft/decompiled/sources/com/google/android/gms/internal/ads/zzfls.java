package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzfls {
    private zzfmq zza;
    private long zzb;
    private int zzc;

    public zzfls() {
        zzb();
        this.zza = new zzfmq(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzfll.zza().zzf(zza(), str);
    }

    public final void zze(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzfll.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzfkv zzfkvVar, zzfkt zzfktVar) {
        zzg(zzfkvVar, zzfktVar, null);
    }

    protected final void zzg(zzfkv zzfkvVar, zzfkt zzfktVar, JSONObject jSONObject) {
        String zzh = zzfkvVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzflw.zzh(jSONObject2, "environment", "app");
        zzflw.zzh(jSONObject2, "adSessionType", zzfktVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzflw.zzh(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzflw.zzh(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzflw.zzh(jSONObject3, "os", "Android");
        zzflw.zzh(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzflw.zzh(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzflw.zzh(jSONObject4, "partnerName", zzfktVar.zze().zzb());
        zzflw.zzh(jSONObject4, "partnerVersion", zzfktVar.zze().zzc());
        zzflw.zzh(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzflw.zzh(jSONObject5, "libraryVersion", "1.3.31-google_20220407");
        zzflw.zzh(jSONObject5, "appId", zzflj.zzb().zza().getApplicationContext().getPackageName());
        zzflw.zzh(jSONObject2, "app", jSONObject5);
        if (zzfktVar.zzf() != null) {
            zzflw.zzh(jSONObject2, "contentUrl", zzfktVar.zzf());
        }
        zzflw.zzh(jSONObject2, "customReferenceData", zzfktVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfktVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfll.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzh(float f) {
        zzfll.zza().zze(zza(), f);
    }

    final void zzi(WebView webView) {
        this.zza = new zzfmq(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != null;
    }
}
