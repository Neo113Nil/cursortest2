package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final class zzeqa {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;

    @Nullable
    final Integer zze;

    zzeqa(String str, String str2, int i, long j, @Nullable Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i = this.zzc;
        long j = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j).length());
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcs)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return sb2;
        }
        StringBuilder sb4 = new StringBuilder(sb2.length() + 1 + num.toString().length());
        sb4.append(sb2);
        sb4.append(".");
        sb4.append(num);
        return sb4.toString();
    }
}
