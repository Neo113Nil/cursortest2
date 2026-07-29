package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzatf implements zzash {
    private int zzb = -1;
    private int zzc = -1;
    private int zzd = 0;
    private ByteBuffer zze;
    private ByteBuffer zzf;
    private boolean zzg;

    public zzatf() {
        ByteBuffer byteBuffer = zza;
        this.zze = byteBuffer;
        this.zzf = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzf;
        this.zzf = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzd() {
        this.zzf = zza;
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zze() {
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[ADDED_TO_REGION, LOOP:2: B:24:0x0080->B:25:0x0082, LOOP_START, PHI: r0
      0x0080: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0040, B:25:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.zzd;
        if (i4 == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i4 != 3) {
            if (i4 != 1073741824) {
                throw new IllegalStateException();
            }
            i = i3 / 2;
            if (this.zze.capacity() >= i) {
                this.zze = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.zze.clear();
            }
            i2 = this.zzd;
            if (i2 != Integer.MIN_VALUE) {
                while (position < limit) {
                    this.zze.put(byteBuffer.get(position + 1));
                    this.zze.put(byteBuffer.get(position + 2));
                    position += 3;
                }
            } else if (i2 == 3) {
                while (position < limit) {
                    this.zze.put((byte) 0);
                    this.zze.put((byte) ((byteBuffer.get(position) & UByte.MAX_VALUE) - 128));
                    position++;
                }
            } else {
                if (i2 != 1073741824) {
                    throw new IllegalStateException();
                }
                while (position < limit) {
                    this.zze.put(byteBuffer.get(position + 2));
                    this.zze.put(byteBuffer.get(position + 3));
                    position += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.zze.flip();
            this.zzf = this.zze;
        }
        i = i3 + i3;
        if (this.zze.capacity() >= i) {
        }
        i2 = this.zzd;
        if (i2 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.zze.flip();
        this.zzf = this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzg() {
        zzd();
        this.zze = zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzh(int i, int i2, int i3) throws zzasg {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzasg(i, i2, i3);
        }
        if (this.zzb == i && this.zzc == i2 && this.zzd == i3) {
            return false;
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        if (i3 != 2) {
            return true;
        }
        this.zze = zza;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzi() {
        int i = this.zzd;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzj() {
        return this.zzg && this.zzf == zza;
    }
}
