package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzim {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static long zzb(@Nullable String str, @Nullable String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(str);
                sb.append(X3.j.e);
                zzeh.zze("HttpUtil", sb.toString());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String group = matcher.group(2);
            if (group == null) {
                throw null;
            }
            long parseLong = Long.parseLong(group);
            String group2 = matcher.group(1);
            if (group2 == null) {
                throw null;
            }
            long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
            if (j < 0) {
                return parseLong2;
            }
            if (j == parseLong2) {
                return j;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + 1);
            sb2.append("Inconsistent headers [");
            sb2.append(str);
            sb2.append("] [");
            sb2.append(str2);
            sb2.append(X3.j.e);
            zzeh.zzc("HttpUtil", sb2.toString());
            return Math.max(j, parseLong2);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(str2);
            sb3.append(X3.j.e);
            zzeh.zze("HttpUtil", sb3.toString());
            return j;
        }
    }
}
