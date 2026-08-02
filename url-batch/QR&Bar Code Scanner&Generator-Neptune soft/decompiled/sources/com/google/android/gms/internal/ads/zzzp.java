package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public interface zzzp {
    public static final zzzp zzb = new zzzp() { // from class: com.google.android.gms.internal.ads.zzzn
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            int i = zzzo.zza;
            return new zzzi[0];
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };

    zzzi[] zza();

    zzzi[] zzb(Uri uri, Map map);
}
