package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbuy extends zzcgu {
    private final zzbux zza;

    public zzbuy(zzbux zzbuxVar, String str) {
        super(str);
        this.zza = zzbuxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgu, com.google.android.gms.internal.ads.zzcgh
    public final boolean zza(String str) {
        zzcgp.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzcgp.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
