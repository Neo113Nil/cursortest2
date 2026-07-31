package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzaov {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgxw zze = zzgxw.zzj("auto", "none");
    private static final zzgxw zzf = zzgxw.zzk("dot", "sesame", "circle");
    private static final zzgxw zzg = zzgxw.zzj("filled", "open");
    private static final zzgxw zzh = zzgxw.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaov(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Nullable
    public static zzaov zza(@Nullable String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        String zza = zzgts.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgxw zzq = zzgxw.zzq(TextUtils.split(zza, zzd));
        String str2 = (String) zzgya.zzb(zzgzw.zza(zzh, zzq), "outside");
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals("outside")) {
                z = true;
            }
            z = -1;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        zzgzv zza2 = zzgzw.zza(zze, zzq);
        if (zza2.isEmpty()) {
            zzgzv zza3 = zzgzw.zza(zzg, zzq);
            zzgzv zza4 = zzgzw.zza(zzf, zzq);
            if (!zza3.isEmpty() || !zza4.isEmpty()) {
                String str3 = (String) zzgya.zzb(zza3, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgya.zzb(zza4, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i = 1;
                }
                if (i == 0) {
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                }
                i2 = i4;
            }
        } else {
            String str5 = (String) zza2.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i = 0;
            }
        }
        return new zzaov(i, i2, i3);
    }
}
