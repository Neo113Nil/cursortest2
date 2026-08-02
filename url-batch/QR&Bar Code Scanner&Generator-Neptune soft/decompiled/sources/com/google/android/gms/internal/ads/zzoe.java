package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzoe extends zzod {
    private int[] zzd;
    private int[] zze;

    zzoe() {
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr2) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final zzne zzi(zzne zzneVar) throws zznf {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzne.zza;
        }
        if (zzneVar.zzd != 2) {
            throw new zznf(zzneVar);
        }
        boolean z = zzneVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new zzne(zzneVar.zzb, length, 2) : zzne.zza;
            }
            int i2 = iArr[i];
            if (i2 >= zzneVar.zzc) {
                throw new zznf(zzneVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzod
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzod
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
