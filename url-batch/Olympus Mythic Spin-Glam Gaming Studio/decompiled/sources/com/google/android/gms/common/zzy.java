package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
/* loaded from: classes14.dex */
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z, int i, int i2, String str, Throwable th, long j) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    /* synthetic */ zzy(boolean z, int i, int i2, String str, Throwable th, long j, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }

    @Deprecated
    static zzy zzb() {
        return zze;
    }

    static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    static zzy zzd(@NonNull String str, @NonNull Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    @VisibleForTesting
    public static zzy zzf(int i, long j) {
        return new zzy(true, i, 1, null, null, j);
    }

    static zzy zzg(int i, int i2, @NonNull String str, Throwable th) {
        return new zzy(false, i, i2, str, th, -1L);
    }

    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.zzc;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}
