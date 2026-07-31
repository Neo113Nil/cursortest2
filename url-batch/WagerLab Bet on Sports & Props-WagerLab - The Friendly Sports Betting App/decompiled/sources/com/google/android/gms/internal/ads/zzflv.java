package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzflv {
    private final zzflx zza;
    private final WebView zzb;
    private zzfny zzc;
    private final HashMap zzd;
    private final zzfml zze;

    private zzflv(zzflx zzflxVar, WebView webView, boolean z) {
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        this.zze = new zzfml();
        zzfnh.zza();
        this.zza = zzflxVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((zzflj) it.next()).zzb(webView);
            }
            this.zzc = new zzfny(webView);
        }
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        WebViewCompat.addWebMessageListener(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzflt(this));
    }

    public static zzflv zza(zzflx zzflxVar, WebView webView, boolean z) {
        return new zzflv(zzflxVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    public final void zzb(zzflu zzfluVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzflj) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfls(this, zzfluVar, timer), 1000L);
    }

    final View zzc() {
        zzfny zzfnyVar = this.zzc;
        if (zzfnyVar == null) {
            return null;
        }
        return (View) zzfnyVar.get();
    }

    public final void zzd(View view, zzflq zzflqVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzflj) it.next()).zzd(view, zzflqVar, "Ad overlay");
        }
        this.zze.zzb(view, zzflqVar, "Ad overlay");
    }

    final /* synthetic */ void zzf(String str) {
        zzflo zzfloVar = zzflo.DEFINED_BY_JAVASCRIPT;
        zzflr zzflrVar = zzflr.DEFINED_BY_JAVASCRIPT;
        zzflw zzflwVar = zzflw.JAVASCRIPT;
        zzfln zzflnVar = new zzfln(zzflk.zza(zzfloVar, zzflrVar, zzflwVar, zzflwVar, false), zzfll.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzflnVar);
        zzflnVar.zzb(zzc());
        for (zzfmk zzfmkVar : this.zze.zza()) {
            zzflnVar.zzd((View) zzfmkVar.zza().get(), zzfmkVar.zzc(), zzfmkVar.zzd());
        }
        zzflnVar.zza();
    }

    final /* synthetic */ void zzg(String str) {
        HashMap hashMap = this.zzd;
        zzflj zzfljVar = (zzflj) hashMap.get(str);
        if (zzfljVar != null) {
            zzfljVar.zzc();
            hashMap.remove(str);
        }
    }
}
