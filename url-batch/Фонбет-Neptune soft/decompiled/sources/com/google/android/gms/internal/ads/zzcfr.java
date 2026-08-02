package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzcfr extends zzcer {
    public zzcfr(zzcej zzcejVar, zzbav zzbavVar, boolean z, zzeds zzedsVar) {
        super(zzcejVar, zzbavVar, z, new zzbrp(zzcejVar, zzcejVar.zzE(), new zzbbe(zzcejVar.getContext())), null, zzedsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzS(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcej)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcej zzcejVar = (zzcej) webView;
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            zzbxlVar.zzd(str, map, 1);
        }
        zzfqt.zza();
        int i = zzfqy.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcejVar.zzN() != null) {
            zzcejVar.zzN().zzF();
        }
        if (zzcejVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzH);
        } else if (zzcejVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzG);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzF);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzx(zzcejVar.getContext(), zzcejVar.zzn().afmaVersion, str2);
    }
}
