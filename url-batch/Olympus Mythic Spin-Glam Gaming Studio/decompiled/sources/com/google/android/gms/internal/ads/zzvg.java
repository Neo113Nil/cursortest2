package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzvg extends zziy {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzvg() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zziy, com.google.android.gms.internal.ads.zzit
    public final void zza() {
        super.zza();
        this.zzg = 0;
    }

    public final void zzm(@IntRange int i) {
        this.zzh = i;
    }

    public final long zzn() {
        return this.zzf;
    }

    public final int zzo() {
        return this.zzg;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }

    public final boolean zzq(zziy zziyVar) {
        ByteBuffer byteBuffer;
        zzguk.zza(!zziyVar.zzi(1073741824));
        zzguk.zza(!zziyVar.zzi(268435456));
        zzguk.zza(!zziyVar.zzi(4));
        if (zzp()) {
            if (this.zzg >= this.zzh) {
                return false;
            }
            ByteBuffer byteBuffer2 = zziyVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zziyVar.zzd;
            if (zziyVar.zzi(1)) {
                zzg(1);
            }
        }
        ByteBuffer byteBuffer3 = zziyVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzf = zziyVar.zzd;
        return true;
    }
}
