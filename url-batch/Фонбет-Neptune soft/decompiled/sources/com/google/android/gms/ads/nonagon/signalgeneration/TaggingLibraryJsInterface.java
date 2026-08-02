package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzffk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgcu;
import com.neptunesoft.gestionbacdz.QuizContract;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzauo zzc;
    private final zzffk zzd;
    private final int zze;
    private final zzdsp zzf;
    private final boolean zzg;
    private final zzgcu zzh = zzbzo.zze;
    private final zzfll zzi;
    private final zze zzj;

    TaggingLibraryJsInterface(WebView webView, zzauo zzauoVar, zzdsp zzdspVar, zzfll zzfllVar, zzffk zzffkVar, zze zzeVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzauoVar;
        this.zzf = zzdspVar;
        zzbbw.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziI)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziJ)).booleanValue();
        this.zzi = zzfllVar;
        this.zzd = zzffkVar;
        this.zzj = zzeVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzg) {
                zzq.zzd(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzo.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbf zzbfVar = new zzbf(this, uuid);
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbfVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziL)).booleanValue()) {
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaggingLibraryJsInterface.this.zzc(bundle, zzbfVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbfVar);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzg) {
                zzq.zzd(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzo.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziN)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzba
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.this.zzd(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            i4 = jSONObject.getInt(QuizContract.QuestionTable.COLUMN_TYPE);
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.zzc.zzd(MotionEvent.obtain(0L, i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    final /* synthetic */ void zzc(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zza = com.google.android.gms.ads.internal.zzu.zzq().zza(this.zza);
        bundle.putBoolean("accept_3p_cookie", zza != null ? zza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzd(String str) {
        zzffk zzffkVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzla)).booleanValue() || (zzffkVar = this.zzd) == null) ? this.zzc.zza(parse, this.zza, this.zzb, null) : zzffkVar.zza(parse, this.zza, this.zzb, null);
        } catch (zzaup e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzc(parse.toString(), null);
    }
}
