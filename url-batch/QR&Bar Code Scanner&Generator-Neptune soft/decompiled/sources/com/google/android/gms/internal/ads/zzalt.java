package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.util.Date;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzalt extends zzgwr {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgxb zzm;
    private long zzn;

    public zzalt() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgxb.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgww.zza(zzalp.zzf(byteBuffer));
            this.zzh = zzgww.zza(zzalp.zzf(byteBuffer));
            this.zzi = zzalp.zze(byteBuffer);
            this.zzj = zzalp.zzf(byteBuffer);
        } else {
            this.zza = zzgww.zza(zzalp.zze(byteBuffer));
            this.zzh = zzgww.zza(zzalp.zze(byteBuffer));
            this.zzi = zzalp.zze(byteBuffer);
            this.zzj = zzalp.zze(byteBuffer);
        }
        this.zzk = zzalp.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & UByte.MAX_VALUE) | ((short) ((r1[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)))) / 256.0f;
        zzalp.zzd(byteBuffer);
        zzalp.zze(byteBuffer);
        zzalp.zze(byteBuffer);
        this.zzm = new zzgxb(zzalp.zzb(byteBuffer), zzalp.zzb(byteBuffer), zzalp.zzb(byteBuffer), zzalp.zzb(byteBuffer), zzalp.zza(byteBuffer), zzalp.zza(byteBuffer), zzalp.zza(byteBuffer), zzalp.zzb(byteBuffer), zzalp.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzalp.zze(byteBuffer);
    }
}
