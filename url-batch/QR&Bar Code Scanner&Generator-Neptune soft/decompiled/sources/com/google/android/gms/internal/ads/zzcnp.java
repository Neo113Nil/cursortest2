package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcnp {
    private final zzcnq zza;
    private final zzcno zzb;

    public zzcnp(zzcnq zzcnqVar, zzcno zzcnoVar, byte[] bArr) {
        this.zzb = zzcnoVar;
        this.zza = zzcnqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzcnx] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzape zzK = r0.zzK();
        if (zzK == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzapa zzc = zzK.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.zza.getContext();
        zzcnq zzcnqVar = this.zza;
        return zzc.zzf(context, str, (View) zzcnqVar, zzcnqVar.zzk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzcnx] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzape zzK = r0.zzK();
        if (zzK == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzapa zzc = zzK.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.zza.getContext();
        zzcnq zzcnqVar = this.zza;
        return zzc.zzh(context, (View) zzcnqVar, zzcnqVar.zzk());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnn
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnp.this.zza(str);
                }
            });
        }
    }

    final /* synthetic */ void zza(String str) {
        zzcno zzcnoVar = this.zzb;
        Uri parse = Uri.parse(str);
        zzcmw zzaL = ((zzcni) zzcnoVar.zza).zzaL();
        if (zzaL == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaL.zzi(parse);
        }
    }
}
