package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzakt {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd = Pattern.compile(String.format(Locale.US, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final Pattern zze = Pattern.compile(String.format(Locale.US, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final Pattern zzf = Pattern.compile("\\\\an(\\d+)");
    public final int zza;
    public final PointF zzb;

    private zzakt(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:4|5|6|(2:(1:9)|10)(1:(1:36)(8:37|(1:17)|18|19|21|(3:23|24|25)(1:32)|(3:27|28|29)(1:31)|30))|11|12|13|14|15|(0)|18|19|21|(0)(0)|(0)(0)|30|2) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: RuntimeException -> 0x00a0, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00a0, blocks: (B:19:0x0082, B:23:0x008e, B:25:0x0095), top: B:18:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzakt zza(String str) {
        Matcher matcher;
        int i;
        Matcher matcher2;
        Matcher matcher3;
        boolean find;
        boolean find2;
        PointF pointF;
        String str2;
        String str3;
        Matcher matcher4 = zzc.matcher(str);
        PointF pointF2 = null;
        int i2 = -1;
        while (matcher4.find()) {
            String group = matcher4.group(1);
            group.getClass();
            try {
                matcher2 = zzd.matcher(group);
                matcher3 = zze.matcher(group);
                find = matcher2.find();
                find2 = matcher3.find();
            } catch (RuntimeException unused) {
            }
            if (find) {
                if (find2) {
                    zzea.zze("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + group + "'");
                }
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            } else if (find2) {
                String group2 = matcher3.group(1);
                String group3 = matcher3.group(2);
                str2 = group2;
                str3 = group3;
            } else {
                pointF = null;
                if (pointF != null) {
                    pointF2 = pointF;
                }
                matcher = zzf.matcher(group);
                if (matcher.find()) {
                    i = -1;
                } else {
                    String group4 = matcher.group(1);
                    group4.getClass();
                    i = zzaku.zzd(group4);
                }
                if (i == -1) {
                    i2 = i;
                }
            }
            str2.getClass();
            float parseFloat = Float.parseFloat(str2.trim());
            str3.getClass();
            pointF = new PointF(parseFloat, Float.parseFloat(str3.trim()));
            if (pointF != null) {
            }
            matcher = zzf.matcher(group);
            if (matcher.find()) {
            }
            if (i == -1) {
            }
        }
        return new zzakt(i2, pointF2);
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
