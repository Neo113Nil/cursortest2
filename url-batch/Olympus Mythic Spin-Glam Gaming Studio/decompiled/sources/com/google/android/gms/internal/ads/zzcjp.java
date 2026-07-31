package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcjp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcjs zzd;

    zzcjp(zzcjs zzcjsVar, String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        Objects.requireNonNull(zzcjsVar);
        this.zzd = zzcjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", hashMap);
    }
}
