package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcnl {

    @Nullable
    private Profile zza = null;

    zzcnl() {
    }

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                WebViewCompat.setProfile(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e) {
                String concat = "WebViewCompat error: ".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpP)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    @RequiresApi
    @UiThread
    final void zzb(zzcnp zzcnpVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzgbu.zza("androidx.webkit.ProfileStore", Constants.GET_INSTANCE, new zzgbt[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e) {
            String valueOf = String.valueOf(e.getMessage());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(valueOf));
            try {
                profileStore = (ProfileStore) zzgbu.zza("androidx.webkit.ProfileStore$-CC", Constants.GET_INSTANCE, new zzgbt[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e2.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpO)).booleanValue()) {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcnpVar.zza;
                zzeai zza = zzcnpVar.zzb.zzd().zza();
                zza.zzc("action", "webview_p_l");
                zza.zzc("webview_p_l", Long.toString(elapsedRealtime));
                zza.zzd();
                return;
            }
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpO)).booleanValue()) {
            zzeai zza2 = zzcnpVar.zzb.zzd().zza();
            zza2.zzc("action", "webview_p_f");
            zza2.zzc("webview_p_f", "No instance");
            zza2.zzd();
        }
    }
}
