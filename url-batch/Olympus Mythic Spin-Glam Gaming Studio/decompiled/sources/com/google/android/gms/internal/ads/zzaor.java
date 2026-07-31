package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzaor {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;

    @Nullable
    public final PointF zzb;

    static {
        String str = zzfm.zza;
        Locale locale = Locale.US;
        zzd = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzaor(int i, @Nullable PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:19:0x0085, B:21:0x0091, B:29:0x0097, B:24:0x009c), top: B:18:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaor zza(String str) {
        Matcher matcher;
        int i;
        Matcher matcher2;
        Matcher matcher3;
        boolean find;
        boolean find2;
        PointF pointF;
        String group;
        String group2;
        Matcher matcher4 = zzc.matcher(str);
        PointF pointF2 = null;
        int i2 = -1;
        while (matcher4.find()) {
            String group3 = matcher4.group(1);
            group3.getClass();
            try {
                matcher2 = zzd.matcher(group3);
                matcher3 = zze.matcher(group3);
                find = matcher2.find();
                find2 = matcher3.find();
            } catch (RuntimeException unused) {
            }
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(group3.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(group3);
                    sb.append("'");
                    zzeh.zzb("SsaStyle.Overrides", sb.toString());
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            } else if (find2) {
                group = matcher3.group(1);
                group2 = matcher3.group(2);
            } else {
                pointF = null;
                if (pointF != null) {
                    pointF2 = pointF;
                }
                try {
                    matcher = zzf.matcher(group3);
                    if (matcher.find()) {
                        i = -1;
                    } else {
                        String group4 = matcher.group(1);
                        if (group4 == null) {
                            throw null;
                        }
                        i = zzaos.zzd(group4);
                    }
                    if (i == -1) {
                        i2 = i;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            if (group == null) {
                throw null;
            }
            float parseFloat = Float.parseFloat(group.trim());
            if (group2 == null) {
                throw null;
            }
            pointF = new PointF(parseFloat, Float.parseFloat(group2.trim()));
            if (pointF != null) {
            }
            matcher = zzf.matcher(group3);
            if (matcher.find()) {
            }
            if (i == -1) {
            }
        }
        return new zzaor(i2, pointF2);
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
