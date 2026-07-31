package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbkg implements zzbjl {
    private final zzdvs zza;

    public zzbkg(zzdvs zzdvsVar) {
        Preconditions.checkNotNull(zzdvsVar, "The Inspector Manager must not be null");
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey(PermissionsResponse.EXPIRES_KEY)) {
            try {
                j = Long.parseLong((String) map.get(PermissionsResponse.EXPIRES_KEY));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j);
    }
}
