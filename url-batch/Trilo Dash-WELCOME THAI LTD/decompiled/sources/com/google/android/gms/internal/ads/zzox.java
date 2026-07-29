package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzox implements zzmz {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzmx zze = zzmx.zza;
    private zzmx zzf;
    private zzmx zzg;
    private zzmx zzh;
    private boolean zzi;
    private zzow zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzox() {
        zzmx zzmxVar = zzmx.zza;
        this.zzf = zzmxVar;
        this.zzg = zzmxVar;
        this.zzh = zzmxVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final zzmx zza(zzmx zzmxVar) throws zzmy {
        if (zzmxVar.zzd != 2) {
            throw new zzmy(zzmxVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzmxVar.zzb;
        }
        this.zze = zzmxVar;
        zzmx zzmxVar2 = new zzmx(i, zzmxVar.zzc, 2);
        this.zzf = zzmxVar2;
        this.zzi = true;
        return zzmxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final ByteBuffer zzb() {
        int zza;
        zzow zzowVar = this.zzj;
        if (zzowVar != null && (zza = zzowVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzowVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzc() {
        if (zzg()) {
            zzmx zzmxVar = this.zze;
            this.zzg = zzmxVar;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzow(zzmxVar.zzb, zzmxVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzow zzowVar = this.zzj;
                if (zzowVar != null) {
                    zzowVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzd() {
        zzow zzowVar = this.zzj;
        if (zzowVar != null) {
            zzowVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzow zzowVar = this.zzj;
            Objects.requireNonNull(zzowVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzowVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzmx.zza;
        zzmx zzmxVar = zzmx.zza;
        this.zzf = zzmxVar;
        this.zzg = zzmxVar;
        this.zzh = zzmxVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzh() {
        zzow zzowVar;
        return this.zzp && ((zzowVar = this.zzj) == null || zzowVar.zza() == 0);
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            double d = this.zzc;
            double d2 = j;
            Double.isNaN(d);
            Double.isNaN(d2);
            return (long) (d * d2);
        }
        long j3 = this.zzn;
        Objects.requireNonNull(this.zzj);
        long zzb = j3 - r3.zzb();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzeg.zzw(j, zzb, j2) : zzeg.zzw(j, zzb * i, j2 * i2);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
