package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzha extends zzbw {
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzgz
    };
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzaf zzh;
    public final int zzi;
    public final zzbn zzj;
    final boolean zzk;

    private zzha(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzha zzb(Throwable th, String str, int i, zzaf zzafVar, int i2, boolean z, int i3) {
        return new zzha(1, th, null, i3, str, i, zzafVar, zzafVar == null ? 4 : i2, z);
    }

    public static zzha zzc(IOException iOException, int i) {
        return new zzha(0, iOException, i);
    }

    public static zzha zzd(RuntimeException runtimeException, int i) {
        return new zzha(2, runtimeException, i);
    }

    final zzha zza(zzbn zzbnVar) {
        String message = getMessage();
        int i = zzen.zza;
        return new zzha(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbnVar, this.zzc, this.zzk);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzha(int i, Throwable th, String str, int i2, String str2, int i3, zzaf zzafVar, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, zzafVar, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + String.valueOf(zzafVar) + ", format_supported=" + zzen.zzM(i4);
        }
    }

    private zzha(String str, Throwable th, int i, int i2, String str2, int i3, zzaf zzafVar, int i4, zzbn zzbnVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzdd.zzd(z2);
        zzdd.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzafVar;
        this.zzi = i4;
        this.zzj = zzbnVar;
        this.zzk = z;
    }
}
