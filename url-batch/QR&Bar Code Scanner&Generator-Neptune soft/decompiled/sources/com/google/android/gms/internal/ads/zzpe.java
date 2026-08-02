package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzpe implements zzng {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzne zze = zzne.zza;
    private zzne zzf;
    private zzne zzg;
    private zzne zzh;
    private boolean zzi;
    private zzpd zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzpe() {
        zzne zzneVar = zzne.zza;
        this.zzf = zzneVar;
        this.zzg = zzneVar;
        this.zzh = zzneVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final zzne zza(zzne zzneVar) throws zznf {
        if (zzneVar.zzd != 2) {
            throw new zznf(zzneVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzneVar.zzb;
        }
        this.zze = zzneVar;
        zzne zzneVar2 = new zzne(i, zzneVar.zzc, 2);
        this.zzf = zzneVar2;
        this.zzi = true;
        return zzneVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final ByteBuffer zzb() {
        int zza;
        zzpd zzpdVar = this.zzj;
        if (zzpdVar != null && (zza = zzpdVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzpdVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzc() {
        if (zzg()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                zzne zzneVar = this.zzg;
                this.zzj = new zzpd(zzneVar.zzb, zzneVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzpd zzpdVar = this.zzj;
                if (zzpdVar != null) {
                    zzpdVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzd() {
        zzpd zzpdVar = this.zzj;
        if (zzpdVar != null) {
            zzpdVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzpd zzpdVar = this.zzj;
            Objects.requireNonNull(zzpdVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzpdVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzne.zza;
        zzne zzneVar = zzne.zza;
        this.zzf = zzneVar;
        this.zzg = zzneVar;
        this.zzh = zzneVar;
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

    @Override // com.google.android.gms.internal.ads.zzng
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.zzf.zzb != this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final boolean zzh() {
        zzpd zzpdVar;
        return this.zzp && ((zzpdVar = this.zzj) == null || zzpdVar.zza() == 0);
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (this.zzc * j);
        }
        long j3 = this.zzn;
        Objects.requireNonNull(this.zzj);
        long zzb = j3 - r3.zzb();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzen.zzw(j, zzb, j2) : zzen.zzw(j, zzb * i, j2 * i2);
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
