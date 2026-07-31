package com.google.android.gms.internal.ads;

import androidx.media3.common.PlaybackException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzrr implements zzru {
    zzrr() {
    }

    @Override // com.google.android.gms.internal.ads.zzru
    public final zzrn zza(zzrp zzrpVar, zzu zzuVar) {
        if (zzuVar.zzs == null) {
            return null;
        }
        return new zzrv(new zzrm(new zzrx(1), PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED));
    }

    @Override // com.google.android.gms.internal.ads.zzru
    public final int zzb(zzu zzuVar) {
        return zzuVar.zzs != null ? 1 : 0;
    }
}
