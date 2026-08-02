package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzebr implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzebr(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfih zzfihVar = (zzfih) this.zza.zzb();
        final CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfhy zzi = zzfhr.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzebo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaH));
            }
        }, zzfib.WEBVIEW_COOKIE, zzfihVar).zzi(1L, TimeUnit.SECONDS);
        final zzebp zzebpVar = new zzfhk() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfhu
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzg.zzi("");
            }
        }).zza();
    }
}
