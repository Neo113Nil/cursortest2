package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.m;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfdv implements zzfdg {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzfdv(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfml.zzb(bundle, "carrier", this.zza, !TextUtils.isEmpty(r0));
        int i = this.zzb;
        zzfml.zzc(bundle, m.R, i, i != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfml.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfml.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
