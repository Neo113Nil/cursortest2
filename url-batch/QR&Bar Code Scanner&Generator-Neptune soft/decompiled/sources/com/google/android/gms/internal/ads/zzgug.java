package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgug extends zzguh {
    zzgug(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final byte zza(long j) {
        return Memory.peekByte(j);
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final double zzb(Object obj, long j) {
        return Double.longBitsToDouble(zzm(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(zzl(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final void zzd(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final void zze(Object obj, long j, boolean z) {
        if (zzgui.zzb) {
            zzgui.zzG(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzgui.zzH(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final void zzf(Object obj, long j, byte b) {
        if (zzgui.zzb) {
            zzgui.zzG(obj, j, b);
        } else {
            zzgui.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final void zzg(Object obj, long j, double d) {
        zzq(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final void zzh(Object obj, long j, float f) {
        zzp(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzguh
    public final boolean zzi(Object obj, long j) {
        return zzgui.zzb ? zzgui.zzw(obj, j) : zzgui.zzx(obj, j);
    }
}
