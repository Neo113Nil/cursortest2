package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzfr {
    private final Context zza;
    private PowerManager.WakeLock zzb;

    public zzfr(Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WakelockTimeout"})
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzb(boolean z, boolean z2) {
        boolean zzh;
        if (z) {
            if (this.zzb == null) {
                Context context = this.zza;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    zzeh.zzc("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    zzeh.zzc("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.zzb = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = this.zzb;
        if (wakeLock == null) {
            return;
        }
        zzh = zzfs.zzh(z, z2);
        if (zzh) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zza(AtomicBoolean atomicBoolean) {
        PowerManager.WakeLock wakeLock;
        if (!atomicBoolean.get() || (wakeLock = this.zzb) == null) {
            return;
        }
        wakeLock.release();
    }
}
