package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzcns extends zzcmw {
    public zzcns(zzcmp zzcmpVar, zzbep zzbepVar, boolean z) {
        super(zzcmpVar, zzbepVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzM(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcmp)) {
            com.google.android.gms.ads.internal.util.zze.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcmp zzcmpVar = (zzcmp) webView;
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcmpVar.zzP() != null) {
            zzcmpVar.zzP().zzD();
        }
        if (zzcmpVar.zzQ().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzM);
        } else if (zzcmpVar.zzaC()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzL);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzK);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzu(zzcmpVar.getContext(), zzcmpVar.zzp().zza, str2);
    }
}
