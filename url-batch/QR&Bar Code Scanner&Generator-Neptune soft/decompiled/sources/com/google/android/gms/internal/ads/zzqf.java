package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzqf extends zzgi {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzqf() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgi, com.google.android.gms.internal.ads.zzgc
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzl() {
        return this.zzg;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final void zzn(int i) {
        this.zzh = i;
    }

    public final boolean zzo(zzgi zzgiVar) {
        ByteBuffer byteBuffer;
        zzdd.zzd(!zzgiVar.zzd(BasicMeasure.EXACTLY));
        zzdd.zzd(!zzgiVar.zzd(268435456));
        zzdd.zzd(!zzgiVar.zzd(4));
        if (zzp()) {
            if (this.zzg >= this.zzh || zzgiVar.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgiVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzgiVar.zzd;
            if (zzgiVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzgiVar.zzd(Integer.MIN_VALUE)) {
            zzc(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzgiVar.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzgiVar.zzd;
        return true;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }
}
