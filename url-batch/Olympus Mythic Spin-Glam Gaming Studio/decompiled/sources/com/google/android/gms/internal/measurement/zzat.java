package com.google.android.gms.internal.measurement;

import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes13.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032d  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        zzat zzatVar;
        zzap zzatVar2;
        zzap zzapVar;
        int i;
        String str7;
        int i2;
        int i3;
        int i4;
        int i5;
        zzg zzgVar2;
        int i6;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || AppLovinEventTypes.USER_EXECUTED_SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                str4 = "trim";
                if (!str4.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str5 = "charAt";
                        str6 = str3;
                        if (str.equals(str6)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1776922004:
                        str5 = "charAt";
                        if (str.equals("toString")) {
                            c = 14;
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c = 65535;
                        break;
                    case -1464939364:
                        str5 = "charAt";
                        if (str.equals("toLocaleLowerCase")) {
                            c = '\f';
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c = 65535;
                        break;
                    case -1361633751:
                        str5 = "charAt";
                        if (str.equals(str5)) {
                            str6 = str3;
                            c = 0;
                            break;
                        }
                        str6 = str3;
                        c = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str5 = "charAt";
                            str6 = str3;
                            c = 1;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c = '\r';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case -906336856:
                        if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                            c = 7;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c = 11;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c = 4;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case -399551817:
                        if (str.equals("toUpperCase")) {
                            c = 15;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case 3568674:
                        if (str.equals(str4)) {
                            c = 16;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c = 5;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c = '\b';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c = '\t';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c = '\n';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c = 6;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            str5 = "charAt";
                            str6 = str3;
                            c = 3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                    default:
                        str5 = "charAt";
                        str6 = str3;
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        zzh.zzj(str5, 1, list);
                        int zza = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                        String str8 = this.zza;
                        return (zza < 0 || zza >= str8.length()) ? zzap.zzm : new zzat(String.valueOf(str8.charAt(zza)));
                    case 1:
                        zzatVar = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb = new StringBuilder(zzatVar.zza);
                            for (int i7 = 0; i7 < list.size(); i7++) {
                                sb.append(zzgVar.zzb((zzap) list.get(i7)).zzi());
                            }
                            zzatVar2 = new zzat(sb.toString());
                            return zzatVar2;
                        }
                        return zzatVar;
                    case 2:
                        zzatVar = this;
                        zzh.zzh(str6, 1, list);
                        String str9 = zzatVar.zza;
                        zzap zzb = zzgVar.zzb((zzap) list.get(0));
                        if ("length".equals(zzb.zzi())) {
                            zzapVar = zzap.zzk;
                        } else {
                            double doubleValue = zzb.zzh().doubleValue();
                            zzapVar = (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str9.length()) ? zzap.zzl : zzap.zzk;
                        }
                        return zzapVar;
                    case 3:
                        zzatVar = this;
                        zzh.zzj("indexOf", 2, list);
                        zzatVar2 = new zzah(Double.valueOf(zzatVar.zza.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
                        return zzatVar2;
                    case 4:
                        zzatVar = this;
                        zzh.zzj("lastIndexOf", 2, list);
                        String str10 = zzatVar.zza;
                        String zzi = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                        zzatVar2 = new zzah(Double.valueOf(str10.lastIndexOf(zzi, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r0)))));
                        return zzatVar2;
                    case 5:
                        zzatVar = this;
                        zzh.zzj("match", 1, list);
                        Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(zzatVar.zza);
                        if (matcher.find()) {
                            zzatVar2 = new zzae(Arrays.asList(new zzat(matcher.group())));
                            return zzatVar2;
                        }
                        zzapVar = zzap.zzg;
                        return zzapVar;
                    case 6:
                        zzatVar = this;
                        zzh.zzj("replace", 2, list);
                        zzap zzapVar2 = zzap.zzf;
                        if (!list.isEmpty()) {
                            str7 = zzgVar.zzb((zzap) list.get(0)).zzi();
                            if (list.size() > 1) {
                                zzapVar2 = zzgVar.zzb((zzap) list.get(1));
                            }
                        }
                        String str11 = str7;
                        String str12 = zzatVar.zza;
                        int indexOf = str12.indexOf(str11);
                        if (indexOf >= 0) {
                            if (zzapVar2 instanceof zzai) {
                                i2 = 0;
                                zzapVar2 = ((zzai) zzapVar2).zza(zzgVar, Arrays.asList(new zzat(str11), new zzah(Double.valueOf(indexOf)), zzatVar));
                            } else {
                                i2 = 0;
                            }
                            zzatVar2 = new zzat(str12.substring(i2, indexOf) + zzapVar2.zzi() + str12.substring(indexOf + str11.length()));
                            return zzatVar2;
                        }
                        return zzatVar;
                    case 7:
                        zzatVar = this;
                        zzh.zzj(AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, list);
                        if (Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(zzatVar.zza).find()) {
                            zzatVar2 = new zzah(Double.valueOf(r0.start()));
                            return zzatVar2;
                        }
                        zzapVar = new zzah(Double.valueOf(-1.0d));
                        return zzapVar;
                    case '\b':
                        zzatVar = this;
                        zzh.zzj("slice", 2, list);
                        String str13 = zzatVar.zza;
                        double zza2 = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                        double max = zza2 < 0.0d ? Math.max(str13.length() + zza2, 0.0d) : Math.min(zza2, str13.length());
                        double zza3 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str13.length());
                        int i8 = (int) max;
                        zzatVar2 = new zzat(str13.substring(i8, Math.max(0, ((int) (zza3 < 0.0d ? Math.max(str13.length() + zza3, 0.0d) : Math.min(zza3, str13.length()))) - i8) + i8));
                        return zzatVar2;
                    case '\t':
                        zzatVar = this;
                        zzh.zzj("split", 2, list);
                        String str14 = zzatVar.zza;
                        if (str14.length() == 0) {
                            zzapVar = new zzae(Arrays.asList(zzatVar));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (list.isEmpty()) {
                                arrayList.add(zzatVar);
                            } else {
                                String zzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                                long zzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                                if (zzd == 0) {
                                    zzapVar = new zzae();
                                } else {
                                    String[] split = str14.split(Pattern.quote(zzi2), ((int) zzd) + 1);
                                    int length = split.length;
                                    if (!zzi2.isEmpty() || length <= 0) {
                                        i3 = -1;
                                        i4 = length;
                                        i5 = 0;
                                    } else {
                                        boolean isEmpty = split[0].isEmpty();
                                        i3 = -1;
                                        i4 = length - 1;
                                        i5 = isEmpty;
                                        if (!split[i4].isEmpty()) {
                                            i4 = length;
                                            i5 = isEmpty;
                                        }
                                    }
                                    if (length > zzd) {
                                        i4 += i3;
                                    }
                                    while (i5 < i4) {
                                        arrayList.add(new zzat(split[i5]));
                                        i5++;
                                    }
                                }
                            }
                            zzapVar = new zzae(arrayList);
                        }
                        return zzapVar;
                    case '\n':
                        zzatVar = this;
                        zzh.zzj("substring", 2, list);
                        String str15 = zzatVar.zza;
                        if (list.isEmpty()) {
                            zzgVar2 = zzgVar;
                            i6 = 0;
                        } else {
                            zzgVar2 = zzgVar;
                            i6 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                        }
                        int zza4 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str15.length();
                        int min = Math.min(Math.max(i6, 0), str15.length());
                        int min2 = Math.min(Math.max(zza4, 0), str15.length());
                        zzatVar2 = new zzat(str15.substring(Math.min(min, min2), Math.max(min, min2)));
                        return zzatVar2;
                    case 11:
                        zzatVar = this;
                        zzh.zzh(str2, 0, list);
                        zzatVar2 = new zzat(zzatVar.zza.toUpperCase());
                        return zzatVar2;
                    case '\f':
                        zzatVar = this;
                        zzh.zzh("toLocaleLowerCase", 0, list);
                        zzatVar2 = new zzat(zzatVar.zza.toLowerCase());
                        return zzatVar2;
                    case '\r':
                        zzatVar = this;
                        zzh.zzh("toLowerCase", 0, list);
                        zzatVar2 = new zzat(zzatVar.zza.toLowerCase(Locale.ENGLISH));
                        return zzatVar2;
                    case 14:
                        zzatVar = this;
                        zzh.zzh("toString", 0, list);
                        return zzatVar;
                    case 15:
                        zzatVar = this;
                        zzh.zzh("toUpperCase", 0, list);
                        zzatVar2 = new zzat(zzatVar.zza.toUpperCase(Locale.ENGLISH));
                        return zzatVar2;
                    case 16:
                        zzh.zzh("toUpperCase", 0, list);
                        zzatVar = this;
                        zzatVar2 = new zzat(zzatVar.zza.trim());
                        return zzatVar2;
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str3 = "hasOwnProperty";
        str4 = "trim";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        switch (c) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
