package com.google.android.gms.stats;

import android.os.PowerManager;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes15.dex */
public class WakeLock {
    private static final long zzb = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService zzc = null;
    private static final Object zzd = new Object();
    private static volatile zzd zze = new zzb();
    com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;
    private final PowerManager.WakeLock zzg;
    private int zzh;
    private Future zzi;
    private long zzj;
    private final Set zzk;
    private boolean zzl;
    private int zzm;
    private final String zzp;
    private final Map zzs;

    public static /* synthetic */ void zza(WakeLock wakeLock) {
        synchronized (wakeLock.zzf) {
            try {
                if (wakeLock.isHeld()) {
                    Log.e("WakeLock", String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    wakeLock.zzc();
                    if (wakeLock.isHeld()) {
                        wakeLock.zzh = 1;
                        wakeLock.zzd(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzc() {
        if (this.zzk.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.zzk);
        this.zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void zzd(int i) {
        synchronized (this.zzf) {
            try {
                if (isHeld()) {
                    if (this.zzl) {
                        int i2 = this.zzh - 1;
                        this.zzh = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.zzh = 0;
                    }
                    zzc();
                    Iterator it = this.zzs.values().iterator();
                    if (it.hasNext()) {
                        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                        throw null;
                    }
                    this.zzs.clear();
                    Future future = this.zzi;
                    if (future != null) {
                        future.cancel(false);
                        this.zzi = null;
                        this.zzj = 0L;
                    }
                    this.zzm = 0;
                    if (this.zzg.isHeld()) {
                        try {
                            try {
                                this.zzg.release();
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.zzp).concat(" failed to release!"), e);
                                if (this.zza != null) {
                                    this.zza = null;
                                }
                            }
                        } finally {
                            if (this.zza != null) {
                                this.zza = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.zzp).concat(" should be held!"));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isHeld() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzh > 0;
        }
        return z;
    }
}
