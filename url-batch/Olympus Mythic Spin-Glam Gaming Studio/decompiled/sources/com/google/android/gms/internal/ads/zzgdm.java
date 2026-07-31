package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
class zzgdm {
    static final String zza = new UUID(0, 0).toString();
    final zzgdl zzb;
    final zzgdk zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    zzgdm(Context context, String str, String str2, String str3) {
        this.zzb = zzgdl.zza(context);
        this.zzc = zzgdk.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return UUID.nameUUIDFromBytes(sb.toString().getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        String str5 = str2 == null ? POBCommonConstants.NULL_VALUE : "not null";
        int length = str5.length();
        String str6 = str3 == null ? POBCommonConstants.NULL_VALUE : "not null";
        StringBuilder sb2 = new StringBuilder(length + 120 + str6.length());
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str5);
        sb2.append(", hashKey is ");
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    final zzgdj zza(@Nullable String str, @Nullable String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgdj();
        }
        boolean z2 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long zzd = zzd(z2);
        if (zzd != -1) {
            if (currentTimeMillis < zzd) {
                this.zzb.zzb(z2 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= zzd + j) {
                return zzb(str, str2);
            }
        }
        String zze2 = zze(z2);
        return (zze2 != null || z) ? new zzgdj(zze2, zzd(z2)) : zzb(str, str2);
    }

    final zzgdj zzb(String str, String str2) throws IOException {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", uuid);
        return zzf(zzh(str, str2, uuid), true);
    }

    final void zzc(boolean z) throws IOException {
        String str = z ? this.zzg : this.zzf;
        zzgdl zzgdlVar = this.zzb;
        zzgdlVar.zzf(str);
        zzgdlVar.zzf(z ? this.zze : this.zzd);
    }

    final long zzd(boolean z) {
        return this.zzb.zzd(z ? this.zzg : this.zzf, -1L);
    }

    final String zze(boolean z) {
        return this.zzb.zzc(z ? this.zze : this.zzd, null);
    }

    final zzgdj zzf(String str, boolean z) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzgdl zzgdlVar = this.zzb;
        zzgdlVar.zzb(z ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
        zzgdlVar.zzb(z ? this.zze : this.zzd, str);
        return new zzgdj(str, currentTimeMillis);
    }

    final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }
}
