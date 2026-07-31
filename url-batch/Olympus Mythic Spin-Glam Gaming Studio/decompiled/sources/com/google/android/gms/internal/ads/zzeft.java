package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzeft implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeft(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeft zza(zziof zziofVar, zziof zziofVar2) {
        return new zzeft(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        zzfqi zzfqiVar = (zzfqi) this.zza.zzb();
        final CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza((Context) this.zzb.zzb());
        zzfqc zzfqcVar = zzfqc.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = zza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbE));
            }
        }, zzfqcVar, zzfqiVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzefl.zza).zzi();
    }
}
