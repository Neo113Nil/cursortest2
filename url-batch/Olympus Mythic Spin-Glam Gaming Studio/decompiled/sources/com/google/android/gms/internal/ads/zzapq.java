package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.ironsource.O6;
import com.ironsource.X3;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzapq {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    @Nullable
    public static zzapk zza(zzeu zzeuVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String zzN = zzeuVar.zzN(charset);
        if (zzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzeuVar, list);
            }
            String zzN2 = zzeuVar.zzN(charset);
            if (zzN2 != null) {
                Matcher matcher2 = pattern.matcher(zzN2);
                if (matcher2.matches()) {
                    return zzd(zzN.trim(), matcher2, zzeuVar, list);
                }
            }
        }
        return null;
    }

    static zzcx zzb(String str) {
        zzapp zzappVar = new zzapp();
        zze(str, zzappVar);
        return zzappVar.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
    
        if (r4.equals("i") != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static SpannedString zzc(@Nullable String str, String str2, List list) {
        int i;
        char c;
        int i2 = -1;
        int i3 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i5 < str2.length()) {
            int i6 = i5 + 1;
            char charAt = str2.charAt(i5);
            int i7 = 2;
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                } else if (i6 < str2.length()) {
                    char charAt2 = str2.charAt(i6);
                    int indexOf = str2.indexOf(62, i6);
                    int length = indexOf == i2 ? str2.length() : indexOf + i3;
                    int i8 = length - 2;
                    int i9 = str2.charAt(i8) == '/' ? i3 : i4;
                    int i10 = i5 + (charAt2 == '/' ? 2 : i3);
                    if (i9 == 0) {
                        i8 = length - 1;
                    }
                    String substring = str2.substring(i10, i8);
                    if (!substring.trim().isEmpty()) {
                        String trim = substring.trim();
                        zzguk.zza(!trim.isEmpty());
                        String str3 = zzfm.zza;
                        String str4 = trim.split("[ \\.]", 2)[i4];
                        int hashCode = str4.hashCode();
                        if (hashCode == 98) {
                            if (str4.equals("b")) {
                                i7 = 0;
                                switch (i7) {
                                }
                            }
                            i7 = i2;
                            switch (i7) {
                            }
                        } else if (hashCode == 99) {
                            if (str4.equals("c")) {
                                i7 = 1;
                                switch (i7) {
                                }
                            }
                            i7 = i2;
                            switch (i7) {
                            }
                        } else if (hashCode != 105) {
                            if (hashCode == 3650) {
                                if (str4.equals("rt")) {
                                    i7 = 5;
                                    switch (i7) {
                                    }
                                }
                                i7 = i2;
                                switch (i7) {
                                }
                            } else if (hashCode == 3314158) {
                                if (str4.equals(O6.q)) {
                                    i7 = 3;
                                    switch (i7) {
                                    }
                                }
                                i7 = i2;
                                switch (i7) {
                                }
                            } else if (hashCode == 3511770) {
                                if (str4.equals("ruby")) {
                                    i7 = 4;
                                    switch (i7) {
                                    }
                                }
                                i7 = i2;
                                switch (i7) {
                                }
                            } else if (hashCode != 117) {
                                if (hashCode == 118 && str4.equals("v")) {
                                    i7 = 7;
                                    switch (i7) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            if (charAt2 != '/') {
                                                if (i9 == 0) {
                                                    arrayDeque.push(zzapn.zza(substring, spannableStringBuilder.length()));
                                                    break;
                                                }
                                            } else {
                                                while (!arrayDeque.isEmpty()) {
                                                    zzapn zzapnVar = (zzapn) arrayDeque.pop();
                                                    zzf(str, zzapnVar, arrayList, spannableStringBuilder, list);
                                                    if (arrayDeque.isEmpty()) {
                                                        arrayList.clear();
                                                    } else {
                                                        arrayList.add(new zzapm(zzapnVar, spannableStringBuilder.length(), null));
                                                    }
                                                    if (zzapnVar.zza.equals(str4)) {
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                                i7 = i2;
                                switch (i7) {
                                }
                            } else {
                                if (str4.equals("u")) {
                                    i7 = 6;
                                    switch (i7) {
                                    }
                                }
                                i7 = i2;
                                switch (i7) {
                                }
                            }
                        }
                        i4 = 0;
                    }
                    i5 = length;
                    i3 = 1;
                    i4 = 0;
                }
                i = i3;
            } else {
                int indexOf2 = str2.indexOf(59, i6);
                int indexOf3 = str2.indexOf(32, i6);
                if (indexOf2 == i2) {
                    indexOf2 = indexOf3;
                } else if (indexOf3 != i2) {
                    indexOf2 = Math.min(indexOf2, indexOf3);
                }
                if (indexOf2 != i2) {
                    String substring2 = str2.substring(i6, indexOf2);
                    int hashCode2 = substring2.hashCode();
                    if (hashCode2 == 3309) {
                        if (substring2.equals("gt")) {
                            c = 1;
                            if (c != 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i5 = indexOf2 + 1;
                            i3 = 1;
                            i2 = -1;
                            i4 = 0;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i5 = indexOf2 + 1;
                        i3 = 1;
                        i2 = -1;
                        i4 = 0;
                    } else if (hashCode2 == 3464) {
                        if (substring2.equals("lt")) {
                            c = 0;
                            if (c != 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i5 = indexOf2 + 1;
                            i3 = 1;
                            i2 = -1;
                            i4 = 0;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i5 = indexOf2 + 1;
                        i3 = 1;
                        i2 = -1;
                        i4 = 0;
                    } else if (hashCode2 != 96708) {
                        if (hashCode2 == 3374865 && substring2.equals("nbsp")) {
                            c = 2;
                            if (c != 0) {
                                spannableStringBuilder.append('<');
                            } else if (c == 1) {
                                spannableStringBuilder.append('>');
                            } else if (c == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (c != 3) {
                                StringBuilder sb = new StringBuilder(substring2.length() + 33);
                                sb.append("ignoring unsupported entity: '&");
                                sb.append(substring2);
                                sb.append(";'");
                                zzeh.zzc("WebvttCueParser", sb.toString());
                            } else {
                                spannableStringBuilder.append('&');
                            }
                            if (indexOf2 == indexOf3) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i5 = indexOf2 + 1;
                            i3 = 1;
                            i2 = -1;
                            i4 = 0;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i5 = indexOf2 + 1;
                        i3 = 1;
                        i2 = -1;
                        i4 = 0;
                    } else {
                        if (substring2.equals("amp")) {
                            c = 3;
                            if (c != 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i5 = indexOf2 + 1;
                            i3 = 1;
                            i2 = -1;
                            i4 = 0;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i5 = indexOf2 + 1;
                        i3 = 1;
                        i2 = -1;
                        i4 = 0;
                    }
                } else {
                    i = 1;
                    spannableStringBuilder.append(charAt);
                }
            }
            i3 = i;
            i5 = i6;
            i2 = -1;
            i4 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzapn) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzapn.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    @Nullable
    private static zzapk zzd(@Nullable String str, Matcher matcher, zzeu zzeuVar, List list) {
        zzapp zzappVar = new zzapp();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            zzappVar.zza = zzaps.zza(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            zzappVar.zzb = zzaps.zza(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zze(group3, zzappVar);
            StringBuilder sb = new StringBuilder();
            String zzN = zzeuVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzN.trim());
                zzN = zzeuVar.zzN(StandardCharsets.UTF_8);
            }
            zzappVar.zzc = zzc(str, sb.toString(), list);
            return new zzapk(zzappVar.zza().zzr(), zzappVar.zza, zzappVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzeh.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zze(String str, zzapp zzappVar) {
        char c;
        char c2;
        char c3;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    char c4 = 65535;
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c4 == 0) {
                            i2 = 0;
                        } else if (c4 == 1 || c4 == 2) {
                            i2 = 1;
                        } else if (c4 != 3) {
                            zzeh.zzc("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzappVar.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzappVar.zze = zzaps.zzb(group2);
                        zzappVar.zzf = 0;
                    } else {
                        zzappVar.zze = Integer.parseInt(group2);
                        zzappVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2 && c != 3) {
                                if (c == 4) {
                                    i = 3;
                                } else if (c != 5) {
                                    zzeh.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    zzappVar.zzd = i;
                } else if (X3.i.L.equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0 || c3 == 1) {
                            i = 0;
                        } else if (c3 != 2 && c3 != 3) {
                            if (c3 == 4 || c3 == 5) {
                                i = 2;
                            } else {
                                zzeh.zzc("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzappVar.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzappVar.zzh = zzaps.zzb(group2);
                } else if ("size".equals(group)) {
                    zzappVar.zzj = zzaps.zzb(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c2 = 0;
                        }
                        c2 = 65535;
                    } else {
                        if (group2.equals("lr")) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            zzeh.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzappVar.zzk = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    zzeh.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                zzeh.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    private static void zzf(@Nullable String str, zzapn zzapnVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        Comparator comparator;
        int i = zzapnVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzapnVar.zza;
        int hashCode = str2.hashCode();
        int i2 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals(O6.q)) {
                c = 6;
            }
            c = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c = 5;
            }
            c = 65535;
        } else {
            if (str2.equals("u")) {
                c = 3;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                int zzg = zzg(list2, str, zzapnVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzapm.zza;
                Collections.sort(arrayList, comparator);
                int i3 = i;
                int i4 = 0;
                int i5 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((zzapm) arrayList.get(i4)).zzc().zza)) {
                        zzapm zzapmVar = (zzapm) arrayList.get(i4);
                        int zzg2 = zzg(list2, str, zzapmVar.zzc());
                        if (zzg2 == i2) {
                            zzg2 = zzg != i2 ? zzg : 1;
                        }
                        int i6 = zzapmVar.zzc().zzb - i5;
                        int zzd2 = zzapmVar.zzd() - i5;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i6, zzd2);
                        spannableStringBuilder.delete(i6, zzd2);
                        spannableStringBuilder.setSpan(new zzdd(subSequence.toString(), zzg2), i3, i6, 33);
                        i5 += subSequence.length();
                        i3 = i6;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : zzapnVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdg(zzapnVar.zzc), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzh = zzh(list2, str, zzapnVar);
        for (int i7 = 0; i7 < zzh.size(); i7++) {
            zzapj zzapjVar = ((zzapo) zzh.get(i7)).zzb;
            if (zzapjVar != null) {
                if (zzapjVar.zzf() != -1) {
                    zzde.zza(spannableStringBuilder, new StyleSpan(zzapjVar.zzf()), i, length, 33);
                }
                if (zzapjVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzapjVar.zzo()) {
                    zzde.zza(spannableStringBuilder, new ForegroundColorSpan(zzapjVar.zzm()), i, length, 33);
                }
                if (zzapjVar.zzr()) {
                    zzde.zza(spannableStringBuilder, new BackgroundColorSpan(zzapjVar.zzp()), i, length, 33);
                }
                if (zzapjVar.zzk() != null) {
                    zzde.zza(spannableStringBuilder, new TypefaceSpan(zzapjVar.zzk()), i, length, 33);
                }
                int zzu = zzapjVar.zzu();
                if (zzu == 1) {
                    zzde.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzapjVar.zzv(), true), i, length, 33);
                } else if (zzu == 2) {
                    zzde.zza(spannableStringBuilder, new RelativeSizeSpan(zzapjVar.zzv()), i, length, 33);
                } else if (zzu == 3) {
                    zzde.zza(spannableStringBuilder, new RelativeSizeSpan(zzapjVar.zzv() / 100.0f), i, length, 33);
                }
                if (zzapjVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdc(), i, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, @Nullable String str, zzapn zzapnVar) {
        List zzh = zzh(list, str, zzapnVar);
        for (int i = 0; i < zzh.size(); i++) {
            zzapj zzapjVar = ((zzapo) zzh.get(i)).zzb;
            if (zzapjVar.zzx() != -1) {
                return zzapjVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, @Nullable String str, zzapn zzapnVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzapj zzapjVar = (zzapj) list.get(i);
            int zze = zzapjVar.zze(str, zzapnVar.zza, zzapnVar.zzd, zzapnVar.zzc);
            if (zze > 0) {
                arrayList.add(new zzapo(zze, zzapjVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
