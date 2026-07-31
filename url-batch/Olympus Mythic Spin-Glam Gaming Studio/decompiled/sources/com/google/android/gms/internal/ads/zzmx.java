package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RestrictTo
/* loaded from: classes5.dex */
public final class zzmx {
    private final Object zza;

    @Nullable
    @GuardedBy
    private Looper zzb;

    @Nullable
    @GuardedBy
    private HandlerThread zzc;

    @GuardedBy
    private int zzd;

    public zzmx() {
        throw null;
    }

    public zzmx(@Nullable Looper looper) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }

    public final Looper zza() {
        Looper looper;
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    boolean z = false;
                    if (this.zzd == 0 && this.zzc == null) {
                        z = true;
                    }
                    zzguk.zzi(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.zzc = handlerThread;
                    handlerThread.start();
                    this.zzb = this.zzc.getLooper();
                }
                this.zzd++;
                looper = this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void zzb() {
        HandlerThread handlerThread;
        synchronized (this.zza) {
            try {
                zzguk.zzi(this.zzd > 0);
                int i = this.zzd - 1;
                this.zzd = i;
                if (i == 0 && (handlerThread = this.zzc) != null) {
                    handlerThread.quit();
                    this.zzc = null;
                    this.zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
