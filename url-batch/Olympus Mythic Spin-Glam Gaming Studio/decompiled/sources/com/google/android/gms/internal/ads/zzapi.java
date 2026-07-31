package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.appevents.UserDataStore;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzapi {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzeu zzc = new zzeu();
    private final StringBuilder zzd = new StringBuilder();

    static void zzb(zzeu zzeuVar) {
        while (true) {
            for (boolean z = true; zzeuVar.zzd() > 0 && z; z = false) {
                char c = (char) zzeuVar.zzi()[zzeuVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzeuVar.zzk(1);
                } else {
                    int zzg = zzeuVar.zzg();
                    int zze = zzeuVar.zze();
                    byte[] zzi = zzeuVar.zzi();
                    if (zzg + 2 <= zze) {
                        int i = zzg + 1;
                        if (zzi[zzg] == 47) {
                            int i2 = zzg + 2;
                            if (zzi[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    }
                                    if (((char) zzi[i2]) == '*' && ((char) zzi[i3]) == '/') {
                                        zze = i2 + 2;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzeuVar.zzk(zze - zzeuVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    @Nullable
    static String zzc(zzeu zzeuVar, StringBuilder sb) {
        zzb(zzeuVar);
        if (zzeuVar.zzd() == 0) {
            return null;
        }
        String zzd = zzd(zzeuVar, sb);
        if (!zzd.isEmpty()) {
            return zzd;
        }
        char zzs = (char) zzeuVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzs).length());
        sb2.append(zzs);
        return sb2.toString();
    }

    private static String zzd(zzeu zzeuVar, StringBuilder sb) {
        sb.setLength(0);
        int zzg = zzeuVar.zzg();
        int zze = zzeuVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzg < zze && !z; z = true) {
                char c = (char) zzeuVar.zzi()[zzg];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzg++;
                }
            }
        }
        zzeuVar.zzk(zzg - zzeuVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0311, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00ab, code lost:
    
        if (")".equals(zzc(r6, r3)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza(zzeu zzeuVar) {
        String str;
        String sb;
        char c;
        int i = -1;
        StringBuilder sb2 = this.zzd;
        int i2 = 0;
        sb2.setLength(0);
        int zzg = zzeuVar.zzg();
        while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
        }
        zzeu zzeuVar2 = this.zzc;
        zzeuVar2.zzb(zzeuVar.zzi(), zzeuVar.zzg());
        zzeuVar2.zzh(zzg);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzb(zzeuVar2);
            if (zzeuVar2.zzd() >= 5 && "::cue".equals(zzeuVar2.zzK(5, StandardCharsets.UTF_8))) {
                int zzg2 = zzeuVar2.zzg();
                String zzc = zzc(zzeuVar2, sb2);
                if (zzc != null) {
                    if ("{".equals(zzc)) {
                        zzeuVar2.zzh(zzg2);
                        str = "";
                    } else if ("(".equals(zzc)) {
                        int zzg3 = zzeuVar2.zzg();
                        int zze = zzeuVar2.zze();
                        int i3 = i2;
                        while (zzg3 < zze && i3 == 0) {
                            int i4 = zzg3 + 1;
                            i3 = ((char) zzeuVar2.zzi()[zzg3]) == ')' ? 1 : i2;
                            zzg3 = i4;
                        }
                        str = zzeuVar2.zzK((zzg3 + i) - zzeuVar2.zzg(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zzc(zzeuVar2, sb2))) {
                        break;
                    }
                    zzapj zzapjVar = new zzapj();
                    if (!str.isEmpty()) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != i) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzapjVar.zzd(group);
                            }
                            str = str.substring(i2, indexOf);
                        }
                        String str2 = zzfm.zza;
                        String[] split = str.split("\\.", i);
                        String str3 = split[i2];
                        int indexOf2 = str3.indexOf(35);
                        if (indexOf2 != i) {
                            zzapjVar.zzb(str3.substring(i2, indexOf2));
                            zzapjVar.zza(str3.substring(indexOf2 + 1));
                        } else {
                            zzapjVar.zzb(str3);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzapjVar.zzc((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i5 = i2;
                    String str4 = null;
                    while (i5 == 0) {
                        int zzg4 = zzeuVar2.zzg();
                        str4 = zzc(zzeuVar2, sb2);
                        int i6 = (str4 == null || "}".equals(str4)) ? 1 : i2;
                        if (i6 == 0) {
                            zzeuVar2.zzh(zzg4);
                            zzb(zzeuVar2);
                            String zzd = zzd(zzeuVar2, sb2);
                            if (!zzd.isEmpty() && ":".equals(zzc(zzeuVar2, sb2))) {
                                zzb(zzeuVar2);
                                StringBuilder sb3 = new StringBuilder();
                                int i7 = i2;
                                while (true) {
                                    if (i7 != 0) {
                                        sb = sb3.toString();
                                        break;
                                    }
                                    int zzg5 = zzeuVar2.zzg();
                                    String zzc2 = zzc(zzeuVar2, sb2);
                                    if (zzc2 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zzc2) || ";".equals(zzc2)) {
                                        zzeuVar2.zzh(zzg5);
                                        i7 = 1;
                                    } else {
                                        sb3.append(zzc2);
                                    }
                                }
                                if (sb != null && !sb.isEmpty()) {
                                    int zzg6 = zzeuVar2.zzg();
                                    String zzc3 = zzc(zzeuVar2, sb2);
                                    if (!";".equals(zzc3)) {
                                        if ("}".equals(zzc3)) {
                                            zzeuVar2.zzh(zzg6);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if ("color".equals(zzd)) {
                                        zzapjVar.zzn(zzds.zzb(sb));
                                    } else if ("background-color".equals(zzd)) {
                                        zzapjVar.zzq(zzds.zzb(sb));
                                    } else if ("ruby-position".equals(zzd)) {
                                        if ("over".equals(sb)) {
                                            zzapjVar.zzw(1);
                                        } else if ("under".equals(sb)) {
                                            zzapjVar.zzw(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd)) {
                                        zzapjVar.zzy("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd)) {
                                        if ("underline".equals(sb)) {
                                            zzapjVar.zzh(true);
                                        }
                                    } else if ("font-family".equals(zzd)) {
                                        zzapjVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd)) {
                                        if ("bold".equals(sb)) {
                                            zzapjVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd)) {
                                        if ("italic".equals(sb)) {
                                            zzapjVar.zzj(true);
                                        }
                                    } else if ("font-size".equals(zzd)) {
                                        Matcher matcher2 = zzb.matcher(zzgts.zza(sb));
                                        if (matcher2.matches()) {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (group2.equals("%")) {
                                                    c = 2;
                                                    if (c != 0) {
                                                    }
                                                    String group3 = matcher2.group(1);
                                                    group3.getClass();
                                                    zzapjVar.zzs(Float.parseFloat(group3));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzapjVar.zzs(Float.parseFloat(group32));
                                            } else if (hashCode != 3240) {
                                                if (hashCode == 3592 && group2.equals("px")) {
                                                    c = 0;
                                                    if (c != 0) {
                                                        zzapjVar.zzt(1);
                                                    } else if (c == 1) {
                                                        zzapjVar.zzt(2);
                                                    } else {
                                                        if (c != 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                        zzapjVar.zzt(3);
                                                    }
                                                    String group322 = matcher2.group(1);
                                                    group322.getClass();
                                                    zzapjVar.zzs(Float.parseFloat(group322));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group3222 = matcher2.group(1);
                                                group3222.getClass();
                                                zzapjVar.zzs(Float.parseFloat(group3222));
                                            } else {
                                                if (group2.equals(UserDataStore.EMAIL)) {
                                                    c = 1;
                                                    if (c != 0) {
                                                    }
                                                    String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzapjVar.zzs(Float.parseFloat(group32222));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzapjVar.zzs(Float.parseFloat(group322222));
                                            }
                                        } else {
                                            StringBuilder sb4 = new StringBuilder(sb.length() + 22);
                                            sb4.append("Invalid font-size: '");
                                            sb4.append(sb);
                                            sb4.append("'.");
                                            zzeh.zzc("WebvttCssParser", sb4.toString());
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        i5 = i6;
                        i2 = 0;
                    }
                    if ("}".equals(str4)) {
                        arrayList.add(zzapjVar);
                    }
                    i = -1;
                    i2 = 0;
                }
            }
            str = null;
            if (str == null) {
                break;
            }
            break;
        }
    }
}
