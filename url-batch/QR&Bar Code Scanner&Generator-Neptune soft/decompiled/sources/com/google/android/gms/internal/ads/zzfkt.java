package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfkt {
    private final zzfla zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze = "";
    private final String zzf;
    private final zzfku zzg;

    private zzfkt(zzfla zzflaVar, WebView webView, String str, List list, String str2, String str3, zzfku zzfkuVar) {
        this.zza = zzflaVar;
        this.zzb = webView;
        this.zzg = zzfkuVar;
        this.zzf = str2;
    }

    public static zzfkt zzb(zzfla zzflaVar, WebView webView, String str, String str2) {
        return new zzfkt(zzflaVar, webView, null, null, str, "", zzfku.HTML);
    }

    public static zzfkt zzc(zzfla zzflaVar, WebView webView, String str, String str2) {
        return new zzfkt(zzflaVar, webView, null, null, str, "", zzfku.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfku zzd() {
        return this.zzg;
    }

    public final zzfla zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
