package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzjn extends zzau {
    public final int zzc;

    @Nullable
    public final String zzd;
    public final int zze;

    @Nullable
    public final zzv zzf;
    public final int zzg;

    @Nullable
    public final zzxo zzh;
    final boolean zzi;

    private zzjn(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static zzjn zza(IOException iOException, int i) {
        return new zzjn(0, iOException, i);
    }

    public static zzjn zzb(Throwable th, String str, int i, @Nullable zzv zzvVar, int i2, @Nullable zzxo zzxoVar, boolean z, int i3) {
        return new zzjn(1, th, null, i3, str, i, zzvVar, zzvVar == null ? 4 : i2, zzxoVar, z);
    }

    public static zzjn zzc(RuntimeException runtimeException, int i) {
        return new zzjn(2, runtimeException, i);
    }

    @CheckResult
    final zzjn zzd(@Nullable zzxo zzxoVar) {
        String message = getMessage();
        String str = zzfm.zza;
        return new zzjn(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzxoVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzjn(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable zzv zzvVar, int i4, @Nullable zzxo zzxoVar, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, zzvVar, i4, zzxoVar, SystemClock.elapsedRealtime(), z);
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(zzvVar);
            String str5 = zzfm.zza;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
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
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i3).length() + 9 + valueOf.length() + 19 + str4.length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(valueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            str3 = sb.toString();
        }
    }

    private zzjn(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable zzv zzvVar, int i4, @Nullable zzxo zzxoVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
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
        zzguk.zza(z2);
        zzguk.zza(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzvVar;
        this.zzg = i4;
        this.zzh = zzxoVar;
        this.zzi = z;
    }
}
