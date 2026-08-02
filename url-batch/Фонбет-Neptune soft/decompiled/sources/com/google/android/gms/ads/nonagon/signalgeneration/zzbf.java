package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzgcu;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzbf extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    zzbf(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        long j;
        zzgcu zzgcuVar;
        WebView webView;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[3];
        objArr[0] = this.zza;
        objArr[1] = str;
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziX)).longValue();
        } else {
            j = 0;
        }
        objArr[2] = Long.valueOf(j);
        final String format = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'error': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objArr);
        if (!((Boolean) zzbdx.zza.zze()).booleanValue()) {
            webView = this.zzb.zzb;
            webView.evaluateJavascript(format, null);
            return;
        }
        try {
            zzgcuVar = this.zzb.zzh;
            zzgcuVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    WebView webView2;
                    webView2 = zzbf.this.zzb.zzb;
                    webView2.evaluateJavascript(format, null);
                }
            });
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String format;
        zzgcu zzgcuVar;
        WebView webView;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbdx.zza.zze()).booleanValue() ? ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziX)).longValue() : 0L);
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String str = this.zza;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = queryInfo.getQuery();
            objArr[2] = Long.valueOf(((Boolean) zzbdx.zza.zze()).booleanValue() ? ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziX)).longValue() : 0L);
            format = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'signal': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objArr);
        }
        if (!((Boolean) zzbdx.zza.zze()).booleanValue()) {
            webView = this.zzb.zzb;
            webView.evaluateJavascript(format, null);
            return;
        }
        try {
            zzgcuVar = this.zzb.zzh;
            zzgcuVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    WebView webView2;
                    webView2 = zzbf.this.zzb.zzb;
                    webView2.evaluateJavascript(format, null);
                }
            });
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
        }
    }
}
