package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgu extends zzbr {
    public static final zzl zzd = new zzl() { // from class: com.google.android.gms.internal.ads.zzgt
    };
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzad zzh;
    public final int zzi;
    public final zzbi zzj;
    final boolean zzk;

    private zzgu(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzgu zzb(Throwable th, String str, int i, zzad zzadVar, int i2, boolean z, int i3) {
        return new zzgu(1, th, null, i3, str, i, zzadVar, zzadVar == null ? 4 : i2, z);
    }

    public static zzgu zzc(IOException iOException, int i) {
        return new zzgu(0, iOException, i);
    }

    public static zzgu zzd(RuntimeException runtimeException, int i) {
        return new zzgu(2, runtimeException, i);
    }

    final zzgu zza(zzbi zzbiVar) {
        String message = getMessage();
        int i = zzeg.zza;
        return new zzgu(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbiVar, this.zzc, this.zzk);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgu(int i, Throwable th, String str, int i2, String str2, int i3, zzad zzadVar, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, zzadVar, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + String.valueOf(zzadVar) + ", format_supported=" + zzeg.zzL(i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgu(String str, Throwable th, int i, int i2, String str2, int i3, zzad zzadVar, int i4, zzbi zzbiVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 != 1) {
                z2 = false;
                zzcw.zzd(z2);
                zzcw.zzd(th != null);
                this.zze = i5;
                this.zzf = str2;
                this.zzg = i3;
                this.zzh = zzadVar;
                this.zzi = i4;
                this.zzj = zzbiVar;
                this.zzk = z;
            }
            i5 = 1;
        } else {
            i5 = i2;
        }
        z2 = true;
        zzcw.zzd(z2);
        zzcw.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzadVar;
        this.zzi = i4;
        this.zzj = zzbiVar;
        this.zzk = z;
    }
}
