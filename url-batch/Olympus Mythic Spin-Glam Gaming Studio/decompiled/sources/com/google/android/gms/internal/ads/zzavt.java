package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzavt implements zzavs {
    @Override // com.google.android.gms.internal.ads.zzavs
    public final byte zza(zzawe zzaweVar, int i) {
        return zzaweVar.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final zzawe zzb(zzawe zzaweVar, int i, int i2) {
        byte[] bArr;
        int length;
        if (i < 0 || i > i2 || i2 > (length = (bArr = zzaweVar.zza).length) || i > i2 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzawe(zzawe.zzh(bArr, i, i2 - i));
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final zzavs zzc() {
        return new zzavt();
    }
}
