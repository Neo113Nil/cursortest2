package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
final class zziif extends zziig {
    zziif(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final boolean zza(Object obj, long j) {
        return zziih.zza ? zziih.zzp(obj, j) : zziih.zzq(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final void zzb(Object obj, long j, boolean z) {
        if (zziih.zza) {
            zziih.zzr(obj, j, z);
        } else {
            zziih.zzs(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final void zzd(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final double zze(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final void zzf(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
