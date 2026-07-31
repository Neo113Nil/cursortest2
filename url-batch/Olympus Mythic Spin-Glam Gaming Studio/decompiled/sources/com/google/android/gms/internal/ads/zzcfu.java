package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzcfu {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzcfu() {
    }

    /* synthetic */ zzcfu(byte[] bArr) {
    }

    public final void zza() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzha)).longValue() <= currentTimeMillis) {
                        this.zzc = 1;
                    }
                }
            } finally {
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
