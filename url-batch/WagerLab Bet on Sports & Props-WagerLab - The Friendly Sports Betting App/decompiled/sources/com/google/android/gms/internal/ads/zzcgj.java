package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.WebViewStartUpConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcgj {
    private final Context zzd;
    private String zza = null;
    private zzhlz zzb = null;
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private Profile zze = null;

    zzcgj(Context context) {
        this.zzd = context;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjE)).booleanValue() && !this.zzc.getAndSet(true) && WebViewFeature.isFeatureSupported("GET_VARIATIONS_HEADER")) {
            try {
                String variationsHeader = WebViewCompat.getVariationsHeader();
                if (variationsHeader.isEmpty()) {
                    return;
                }
                this.zza = variationsHeader;
                this.zzb = zzhlz.zzc(Base64.decode(variationsHeader, 0), zzhhr.zzb());
            } catch (zzhiw | IllegalArgumentException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
            }
        }
    }

    public final String zzb() {
        return this.zza;
    }

    public final zzhlz zzc() {
        return this.zzb;
    }

    public final void zzd(Executor executor, boolean z, WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        WebViewCompat.startUpWebView(this.zzd, new WebViewStartUpConfig.Builder(executor).setShouldRunUiThreadStartUpTasks(z).build(), webViewStartUpCallback);
    }

    public final void zze(WebView webView) {
        if (this.zze != null) {
            try {
                WebViewCompat.setProfile(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e) {
                String concat = "WebViewCompat error: ".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoE)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    final void zzf(zzcgm zzcgmVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore", "getInstance", new zzfrs[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e) {
            String message = e.getMessage();
            String.valueOf(message);
            String valueOf = String.valueOf(message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(valueOf));
            try {
                profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfrs[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                String message2 = e2.getMessage();
                String.valueOf(message2);
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(message2)));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zze = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoD)).booleanValue()) {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcgmVar.zza;
                zzdsl zza = zzcgmVar.zzb.zzd().zza();
                zza.zzc("action", "webview_p_l");
                zza.zzc("webview_p_l", Long.toString(elapsedRealtime));
                zza.zzd();
                return;
            }
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoD)).booleanValue()) {
            zzdsl zza2 = zzcgmVar.zzb.zzd().zza();
            zza2.zzc("action", "webview_p_f");
            zza2.zzc("webview_p_f", "No instance");
            zza2.zzd();
        }
    }
}
