package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzinj extends zzino {
    final String zza;

    public zzinj(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
