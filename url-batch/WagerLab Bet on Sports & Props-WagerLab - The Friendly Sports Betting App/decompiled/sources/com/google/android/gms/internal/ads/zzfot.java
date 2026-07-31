package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfot implements zzfow {
    private static final zzast zza;

    static {
        zzarw zzi = zzast.zzi();
        zzi.zzo(ExifInterface.LONGITUDE_EAST);
        zza = (zzast) zzi.zzbu();
    }

    zzfot() {
    }

    @Override // com.google.android.gms.internal.ads.zzfow
    public final zzast zza() {
        return zza;
    }
}
