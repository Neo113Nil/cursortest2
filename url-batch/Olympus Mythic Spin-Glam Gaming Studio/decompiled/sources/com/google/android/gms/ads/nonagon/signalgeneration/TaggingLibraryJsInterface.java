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
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzhdi;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzbbd zzc;
    private final zzfma zzd;
    private final int zze;
    private final zzeao zzf;
    private final boolean zzg;
    private final zzhdi zzh = zzcgj.zzf;
    private final zzfte zzi;
    private final zzj zzj;
    private final zza zzk;
    private final zze zzl;

    TaggingLibraryJsInterface(WebView webView, zzbbd zzbbdVar, zzeao zzeaoVar, zzfte zzfteVar, zzfma zzfmaVar, zzj zzjVar, zza zzaVar, zze zzeVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzbbdVar;
        this.zzf = zzeaoVar;
        zzbjg.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlj)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlk)).booleanValue();
        this.zzi = zzfteVar;
        this.zzd = zzfmaVar;
        this.zzj = zzjVar;
        this.zzk = zzaVar;
        this.zzl = zzeVar;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignals(@NonNull String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String zzg = this.zzc.zzb().zzg(this.zza, str, this.zzb);
            if (this.zzg) {
                zzv.zze(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - currentTimeMillis)));
            }
            return zzg;
        } catch (RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignalsWithTimeout(@NonNull final String str, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i);
            String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
            return "";
        }
        try {
            return (String) zzcgj.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbf zzbfVar = new zzbf(this, uuid);
        if (((Boolean) zzblm.zze.zze()).booleanValue()) {
            this.zzj.zzb(this.zzb, zzbfVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlm)).booleanValue()) {
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        TaggingLibraryJsInterface.this.zza(bundle, zzbfVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbfVar);
            }
        }
        return uuid;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String zzj = this.zzc.zzb().zzj(this.zza, this.zzb, null);
            if (this.zzg) {
                zzv.zze(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - currentTimeMillis)));
            }
            return zzj;
        } catch (RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i);
            String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
            return "";
        }
        try {
            return (String) zzcgj.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public void recordClick(@NonNull final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlo)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcgj.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                TaggingLibraryJsInterface.this.zzb(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(@NonNull String str) {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt(VastAttributes.HORIZONTAL_POSITION);
            int i4 = jSONObject.getInt(VastAttributes.VERTICAL_POSITION);
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            try {
                if (i6 != 0) {
                    int i7 = 1;
                    if (i6 != 1) {
                        i7 = 2;
                        if (i6 != 2) {
                            i7 = 3;
                            i2 = i6 != 3 ? -1 : 0;
                        }
                    }
                    i = i7;
                    this.zzc.zzc(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                this.zzc.zzc(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e) {
                e = e;
                int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e2) {
                e = e2;
                int i82 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i = i2;
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }

    final /* synthetic */ void zza(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzz zzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        CookieManager zza = zzf.zza(context);
        bundle.putBoolean("accept_3p_cookie", zza != null ? zza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzb(String str) {
        zzfma zzfmaVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznH)).booleanValue() || (zzfmaVar = this.zzd) == null) ? this.zzc.zzd(parse, this.zza, this.zzb, null) : zzfmaVar.zza(parse, this.zza, this.zzb, null);
        } catch (zzbbe e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzb(parse.toString(), null, null, null);
    }

    final /* synthetic */ WebView zzc() {
        return this.zzb;
    }

    final /* synthetic */ zzhdi zzd() {
        return this.zzh;
    }

    final /* synthetic */ zza zze() {
        return this.zzk;
    }

    final /* synthetic */ zze zzf() {
        return this.zzl;
    }
}
