package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzaos {
    public final String zza;
    public final int zzb;

    @Nullable
    @ColorInt
    public final Integer zzc;

    @Nullable
    @ColorInt
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaos(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0108 A[Catch: RuntimeException -> 0x0057, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0057, blocks: (B:7:0x003c, B:9:0x004b, B:10:0x005b, B:12:0x005f, B:13:0x006c, B:15:0x0070, B:16:0x007d, B:18:0x0081, B:20:0x0089, B:22:0x00b3, B:24:0x00b8, B:27:0x00c7, B:29:0x00cb, B:32:0x00da, B:34:0x00de, B:37:0x00ef, B:39:0x00f3, B:42:0x0104, B:44:0x0108, B:46:0x0110, B:52:0x012c, B:50:0x0120, B:65:0x0091), top: B:6:0x003c, inners: #1 }] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaos zza(String str, zzaoq zzaoqVar) {
        float f;
        int i;
        int i2;
        int parseInt;
        zzguk.zza(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = split.length;
        int i3 = zzaoqVar.zzk;
        if (length != i3) {
            Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(length), str};
            String str2 = zzfm.zza;
            zzeh.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String trim = split[zzaoqVar.zza].trim();
            int i4 = zzaoqVar.zzb;
            int zzd = i4 != -1 ? zzd(split[i4].trim()) : -1;
            int i5 = zzaoqVar.zzc;
            Integer zzb = i5 != -1 ? zzb(split[i5].trim()) : null;
            int i6 = zzaoqVar.zzd;
            Integer zzb2 = i6 != -1 ? zzb(split[i6].trim()) : null;
            int i7 = zzaoqVar.zze;
            if (i7 != -1) {
                String trim2 = split[i7].trim();
                try {
                    f = Float.parseFloat(trim2);
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(trim2).length() + 29);
                    sb.append("Failed to parse font size: '");
                    sb.append(trim2);
                    sb.append("'");
                    zzeh.zzd("SsaStyle", sb.toString(), e);
                }
                int i8 = zzaoqVar.zzf;
                boolean z = i8 == -1 && zze(split[i8].trim());
                int i9 = zzaoqVar.zzg;
                boolean z2 = i9 == -1 && zze(split[i9].trim());
                int i10 = zzaoqVar.zzh;
                boolean z3 = i10 == -1 && zze(split[i10].trim());
                int i11 = zzaoqVar.zzi;
                boolean z4 = i11 == -1 && zze(split[i11].trim());
                i = zzaoqVar.zzj;
                if (i != -1) {
                    String trim3 = split[i].trim();
                    try {
                        parseInt = Integer.parseInt(trim3.trim());
                    } catch (NumberFormatException unused) {
                    }
                    if (parseInt == 1 || parseInt == 3) {
                        i2 = parseInt;
                        return new zzaos(trim, zzd, zzb, zzb2, f, z, z2, z3, z4, i2);
                    }
                    zzeh.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
                }
                i2 = -1;
                return new zzaos(trim, zzd, zzb, zzb2, f, z, z2, z3, z4, i2);
            }
            f = -3.4028235E38f;
            int i82 = zzaoqVar.zzf;
            if (i82 == -1) {
            }
            int i92 = zzaoqVar.zzg;
            if (i92 == -1) {
            }
            int i102 = zzaoqVar.zzh;
            if (i102 == -1) {
            }
            int i112 = zzaoqVar.zzi;
            if (i112 == -1) {
            }
            i = zzaoqVar.zzj;
            if (i != -1) {
            }
            i2 = -1;
            return new zzaos(trim, zzd, zzb, zzb2, f, z, z2, z3, z4, i2);
        } catch (RuntimeException e2) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            zzeh.zzd("SsaStyle", sb2.toString(), e2);
            return null;
        }
    }

    @Nullable
    @ColorInt
    public static Integer zzb(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzguk.zza(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzhbj.zza(((parseLong >> 24) & 255) ^ 255), zzhbj.zza(parseLong & 255), zzhbj.zza((parseLong >> 8) & 255), zzhbj.zza((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            zzeh.zzd("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                zzeh.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            zzeh.zzd("SsaStyle", sb.toString(), e);
            return false;
        }
    }
}
