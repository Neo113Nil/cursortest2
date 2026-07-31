package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeod implements zzeun {
    final String zza;
    final int zzb;

    public zzeod(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        Bundle bundle = ((zzcuu) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        Bundle zza = zzfdr.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", str);
        zza.putInt("pvid_s", i);
    }
}
