package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhw extends zzbp {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzaf zzf;
    public final int zzg;
    public final zzui zzh;
    final boolean zzi;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
    }

    private zzhw(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzhw zzb(Throwable th, String str, int i, zzaf zzafVar, int i2, boolean z, int i3) {
        return new zzhw(1, th, null, i3, str, i, zzafVar, zzafVar == null ? 4 : i2, z);
    }

    public static zzhw zzc(IOException iOException, int i) {
        return new zzhw(0, iOException, i);
    }

    public static zzhw zzd(RuntimeException runtimeException, int i) {
        return new zzhw(2, runtimeException, i);
    }

    final zzhw zza(zzui zzuiVar) {
        String message = getMessage();
        int i = zzet.zza;
        return new zzhw(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzuiVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzhw(int i, Throwable th, String str, int i2, String str2, int i3, zzaf zzafVar, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, zzafVar, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(zzafVar);
            int i5 = zzet.zza;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i3 + ", format=" + valueOf + ", format_supported=" + str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzhw(String str, Throwable th, int i, int i2, String str2, int i3, zzaf zzafVar, int i4, zzui zzuiVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 != 1) {
                z2 = false;
                zzdi.zzd(z2);
                zzdi.zzd(th != null);
                this.zzc = i5;
                this.zzd = str2;
                this.zze = i3;
                this.zzf = zzafVar;
                this.zzg = i4;
                this.zzh = zzuiVar;
                this.zzi = z;
            }
            i5 = 1;
        } else {
            i5 = i2;
        }
        z2 = true;
        zzdi.zzd(z2);
        zzdi.zzd(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzafVar;
        this.zzg = i4;
        this.zzh = zzuiVar;
        this.zzi = z;
    }
}
