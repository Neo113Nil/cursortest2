package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzaub;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzbg implements zzatw {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zza(zzaub zzaubVar) {
        String str = this.zza;
        String obj = zzaubVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(obj);
        String sb2 = sb.toString();
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        this.zzb.zza((Object) null);
    }
}
