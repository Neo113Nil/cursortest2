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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzalr {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static SpannedString zza(String str, String str2, List list) {
        char c;
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        char c3 = 0;
        int i = 0;
        while (i < str2.length()) {
            int i2 = i + 1;
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i2);
                int indexOf2 = str2.indexOf(32, i2);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i2, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            c = 1;
                            if (c != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            c = 0;
                            if (c != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            c = 2;
                            if (c != 0) {
                                spannableStringBuilder.append(Typography.less);
                            } else if (c == 1) {
                                spannableStringBuilder.append(Typography.greater);
                            } else if (c == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (c != 3) {
                                zzea.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            } else {
                                spannableStringBuilder.append(Typography.amp);
                            }
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else {
                        if (substring.equals("amp")) {
                            c = 3;
                            if (c != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    }
                    c3 = 0;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i2 < str2.length()) {
                char charAt2 = str2.charAt(i2);
                int indexOf3 = str2.indexOf(62, i2);
                i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                int i3 = i2 - 2;
                boolean z = str2.charAt(i3) == '/';
                int i4 = i + (charAt2 == '/' ? 2 : 1);
                if (!z) {
                    i3 = i2 - 1;
                }
                String substring2 = str2.substring(i4, i3);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    zzdi.zzd(!trim.isEmpty());
                    int i5 = zzet.zza;
                    String str3 = trim.split("[ \\.]", 2)[c3];
                    int hashCode2 = str3.hashCode();
                    if (hashCode2 == 98) {
                        if (str3.equals("b")) {
                            c2 = 0;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 99) {
                        if (str3.equals("c")) {
                            c2 = 1;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 105) {
                        if (str3.equals("i")) {
                            c2 = 2;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 3650) {
                        if (str3.equals("rt")) {
                            c2 = 5;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 3314158) {
                        if (str3.equals("lang")) {
                            c2 = 3;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 3511770) {
                        if (str3.equals("ruby")) {
                            c2 = 4;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 != 117) {
                        if (hashCode2 == 118 && str3.equals("v")) {
                            c2 = 7;
                            switch (c2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (charAt2 != '/') {
                                        if (!z) {
                                            arrayDeque.push(zzalo.zza(substring2, spannableStringBuilder.length()));
                                            break;
                                        }
                                    } else {
                                        while (!arrayDeque.isEmpty()) {
                                            zzalo zzaloVar = (zzalo) arrayDeque.pop();
                                            zzg(str, zzaloVar, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new zzaln(zzaloVar, spannableStringBuilder.length(), null));
                                            }
                                            if (zzaloVar.zza.equals(str3)) {
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else {
                        if (str3.equals("u")) {
                            c2 = 6;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    }
                }
            }
            i = i2;
            c3 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzg(str, (zzalo) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzg(str, zzalo.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    static zzcz zzb(String str) {
        zzalq zzalqVar = new zzalq();
        zzh(str, zzalqVar);
        return zzalqVar.zza();
    }

    public static zzalk zzc(zzek zzekVar, List list) {
        String zzy = zzekVar.zzy(zzfuj.zzc);
        if (zzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzy);
            if (matcher.matches()) {
                return zze(null, matcher, zzekVar, list);
            }
            String zzy2 = zzekVar.zzy(zzfuj.zzc);
            if (zzy2 != null) {
                Matcher matcher2 = pattern.matcher(zzy2);
                if (matcher2.matches()) {
                    return zze(zzy.trim(), matcher2, zzekVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzalo zzaloVar) {
        List zzf = zzf(list, str, zzaloVar);
        for (int i = 0; i < zzf.size(); i++) {
            zzalj zzaljVar = ((zzalp) zzf.get(i)).zzb;
            if (zzaljVar.zze() != -1) {
                return zzaljVar.zze();
            }
        }
        return -1;
    }

    private static zzalk zze(String str, Matcher matcher, zzek zzekVar, List list) {
        zzalq zzalqVar = new zzalq();
        try {
            String group = matcher.group(1);
            group.getClass();
            zzalqVar.zza = zzalt.zzb(group);
            String group2 = matcher.group(2);
            group2.getClass();
            zzalqVar.zzb = zzalt.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzalqVar);
            StringBuilder sb = new StringBuilder();
            String zzy = zzekVar.zzy(zzfuj.zzc);
            while (!TextUtils.isEmpty(zzy)) {
                if (sb.length() > 0) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb.append(zzy.trim());
                zzy = zzekVar.zzy(zzfuj.zzc);
            }
            zzalqVar.zzc = zza(str, sb.toString(), list);
            return new zzalk(zzalqVar.zza().zzp(), zzalqVar.zza, zzalqVar.zzb);
        } catch (NumberFormatException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzalo zzaloVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzalj zzaljVar = (zzalj) list.get(i);
            int zzf = zzaljVar.zzf(str, zzaloVar.zza, zzaloVar.zzd, zzaloVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzalp(zzf, zzaljVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzalo zzaloVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        Comparator comparator;
        zzalo zzaloVar2;
        zzalo zzaloVar3;
        zzalo zzaloVar4;
        int i;
        int i2 = zzaloVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaloVar.zza;
        int hashCode = str2.hashCode();
        int i3 = -1;
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
            if (str2.equals("lang")) {
                c = 5;
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
                c = 6;
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
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzaloVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzaln.zza;
                Collections.sort(arrayList, comparator);
                int i4 = zzaloVar.zzb;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    zzaloVar2 = ((zzaln) arrayList.get(i5)).zzb;
                    if ("rt".equals(zzaloVar2.zza)) {
                        zzaln zzalnVar = (zzaln) arrayList.get(i5);
                        zzaloVar3 = zzalnVar.zzb;
                        int zzd3 = zzd(list2, str, zzaloVar3);
                        if (zzd3 == i3) {
                            zzd3 = zzd2 != i3 ? zzd2 : 1;
                        }
                        zzaloVar4 = zzalnVar.zzb;
                        int i7 = zzaloVar4.zzb - i6;
                        i = zzalnVar.zzc;
                        int i8 = i - i6;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new zzdf(subSequence.toString(), zzd3), i4, i7, 33);
                        i6 += subSequence.length();
                        i4 = i7;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 4:
                for (String str3 : zzaloVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzaloVar);
        for (int i9 = 0; i9 < zzf.size(); i9++) {
            zzalj zzaljVar = ((zzalp) zzf.get(i9)).zzb;
            if (zzaljVar != null) {
                if (zzaljVar.zzg() != -1) {
                    zzdg.zza(spannableStringBuilder, new StyleSpan(zzaljVar.zzg()), i2, length, 33);
                }
                if (zzaljVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (zzaljVar.zzy()) {
                    zzdg.zza(spannableStringBuilder, new ForegroundColorSpan(zzaljVar.zzc()), i2, length, 33);
                }
                if (zzaljVar.zzx()) {
                    zzdg.zza(spannableStringBuilder, new BackgroundColorSpan(zzaljVar.zzb()), i2, length, 33);
                }
                if (zzaljVar.zzr() != null) {
                    zzdg.zza(spannableStringBuilder, new TypefaceSpan(zzaljVar.zzr()), i2, length, 33);
                }
                int zzd4 = zzaljVar.zzd();
                if (zzd4 == 1) {
                    zzdg.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaljVar.zza(), true), i2, length, 33);
                } else if (zzd4 == 2) {
                    zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zzaljVar.zza()), i2, length, 33);
                } else if (zzd4 == 3) {
                    zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zzaljVar.zza() / 100.0f), i2, length, 33);
                }
                if (zzaljVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzde(), i2, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(String str, zzalq zzalqVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            i2 = 0;
                        } else if (c == 1 || c == 2) {
                            i2 = 1;
                        } else if (c != 3) {
                            zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzalqVar.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzalqVar.zze = zzalt.zza(group2);
                        zzalqVar.zzf = 0;
                    } else {
                        zzalqVar.zze = Integer.parseInt(group2);
                        zzalqVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2 && c != 3) {
                                if (c != 4) {
                                    i = 5;
                                    if (c != 5) {
                                        zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                    }
                                } else {
                                    i = 3;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    zzalqVar.zzd = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1) {
                            i = 0;
                        } else if (c != 2 && c != 3) {
                            if (c == 4 || c == 5) {
                                i = 2;
                            } else {
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzalqVar.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzalqVar.zzh = zzalt.zza(group2);
                } else if ("size".equals(group)) {
                    zzalqVar.zzj = zzalt.zza(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c = 1;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            zzea.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzalqVar.zzk = i;
                } else {
                    zzea.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                zzea.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
