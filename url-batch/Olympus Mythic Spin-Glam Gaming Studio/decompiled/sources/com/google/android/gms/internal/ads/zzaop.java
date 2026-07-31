package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzaop implements zzanz {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;

    @Nullable
    private final zzaoo zzc;
    private final zzeu zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaop() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0050, code lost:
    
        if (r3.equals("playresx") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(zzeu zzeuVar, Charset charset) {
        while (true) {
            String zzN = zzeuVar.zzN(charset);
            if (zzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(zzN)) {
                while (true) {
                    String zzN2 = zzeuVar.zzN(charset);
                    if (zzN2 != null && (zzeuVar.zzd() == 0 || zzeuVar.zzp(charset) != 91)) {
                        String[] split = zzN2.split(":");
                        if (split.length == 2) {
                            char c = 0;
                            String zza2 = zzgts.zza(split[0].trim());
                            switch (zza2.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    if (zza2.equals("playresy")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                this.zzf = Float.parseFloat(split[1].trim());
                            } else if (c == 1) {
                                try {
                                    this.zzg = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(zzN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzaoq zzaoqVar = null;
                while (true) {
                    String zzN3 = zzeuVar.zzN(charset);
                    if (zzN3 != null && (zzeuVar.zzd() == 0 || zzeuVar.zzp(charset) != 91)) {
                        if (zzN3.startsWith("Format:")) {
                            zzaoqVar = zzaoq.zza(zzN3);
                        } else if (zzN3.startsWith("Style:")) {
                            if (zzaoqVar == null) {
                                zzeh.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(zzN3));
                            } else {
                                zzaos zza3 = zzaos.zza(zzN3, zzaoqVar);
                                if (zza3 != null) {
                                    linkedHashMap.put(zza3.zza, zza3);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(zzN)) {
                zzeh.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(zzN)) {
                return;
            }
        }
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = zzfm.zza;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    @Override // com.google.android.gms.internal.ads.zzanz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzaoo zzaooVar;
        int i3;
        Charset charset;
        zzaoo zzaooVar2;
        zzeu zzeuVar;
        int parseInt;
        long zzc;
        long j;
        int i4;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int i7;
        Integer num;
        int i8;
        zzaop zzaopVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzeu zzeuVar2 = zzaopVar.zzd;
        zzeuVar2.zzb(bArr, i + i2);
        zzeuVar2.zzh(i);
        Charset zzR = zzeuVar2.zzR();
        if (zzR == null) {
            zzR = StandardCharsets.UTF_8;
        }
        if (zzaopVar.zzb) {
            zzaooVar = zzaopVar.zzc;
        } else {
            zzaopVar.zzb(zzeuVar2, zzR);
            zzaooVar = null;
        }
        while (true) {
            String zzN = zzeuVar2.zzN(zzR);
            if (zzN == null) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    List list = (List) arrayList.get(i9);
                    if (list.isEmpty()) {
                        if (i9 != 0) {
                            i3 = 1;
                            i9 += i3;
                        } else {
                            i9 = 0;
                        }
                    }
                    if (i9 == arrayList.size() - 1) {
                        throw new IllegalStateException();
                    }
                    long longValue = ((Long) arrayList2.get(i9)).longValue();
                    zzduVar.zza(new zzanr(list, longValue, ((Long) arrayList2.get(i9 + 1)).longValue() - longValue));
                    i3 = 1;
                    i9 += i3;
                }
                return;
            }
            if (zzN.startsWith("Format:")) {
                zzaooVar = zzaoo.zza(zzN);
            } else {
                if (zzN.startsWith("Dialogue:")) {
                    if (zzaooVar == null) {
                        zzeh.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(zzN));
                    } else {
                        zzguk.zza(zzN.startsWith("Dialogue:"));
                        String substring = zzN.substring(9);
                        int i10 = zzaooVar.zzf;
                        String[] split = substring.split(StringUtils.COMMA, i10);
                        if (split.length != i10) {
                            zzeh.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(zzN));
                        } else {
                            int i11 = zzaooVar.zza;
                            if (i11 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i11].trim());
                                } catch (RuntimeException unused) {
                                    zzeh.zzc("SsaParser", "Fail to parse layer: ".concat(String.valueOf(split[zzaooVar.zza])));
                                }
                                zzc = zzc(split[zzaooVar.zzb]);
                                if (zzc != -9223372036854775807L) {
                                    zzeh.zzc("SsaParser", "Skipping invalid timing: ".concat(zzN));
                                } else {
                                    long zzc2 = zzc(split[zzaooVar.zzc]);
                                    if (zzc2 == -9223372036854775807L || zzc2 <= zzc) {
                                        charset = zzR;
                                        zzaooVar2 = zzaooVar;
                                        zzeuVar = zzeuVar2;
                                        zzeh.zzc("SsaParser", "Skipping invalid timing: ".concat(zzN));
                                    } else {
                                        Map map = zzaopVar.zze;
                                        zzaos zzaosVar = (map == null || (i8 = zzaooVar.zzd) == -1) ? null : (zzaos) map.get(split[i8].trim());
                                        String str = split[zzaooVar.zze];
                                        zzaor zza2 = zzaor.zza(str);
                                        charset = zzR;
                                        String replace = zzaor.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f = zzaopVar.zzf;
                                        float f2 = zzaopVar.zzg;
                                        SpannableString spannableString = new SpannableString(replace);
                                        zzcx zzcxVar = new zzcx();
                                        zzcxVar.zza(spannableString);
                                        zzcxVar.zzq(parseInt);
                                        if (zzaosVar != null) {
                                            Integer num2 = zzaosVar.zzc;
                                            zzaooVar2 = zzaooVar;
                                            if (num2 != null) {
                                                zzeuVar = zzeuVar2;
                                                j = zzc2;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                zzeuVar = zzeuVar2;
                                                j = zzc2;
                                            }
                                            if (zzaosVar.zzj == 3 && (num = zzaosVar.zzd) != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f3 = zzaosVar.zze;
                                            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                                zzcxVar.zzl(f3 / f2, 1);
                                            }
                                            boolean z = zzaosVar.zzf;
                                            if (z && zzaosVar.zzg) {
                                                i6 = 0;
                                                i7 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i6 = 0;
                                                i7 = 33;
                                                if (z) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (zzaosVar.zzg) {
                                                    i4 = 2;
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                    if (zzaosVar.zzh) {
                                                        spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i7);
                                                    }
                                                    if (zzaosVar.zzi) {
                                                        spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i7);
                                                    }
                                                }
                                            }
                                            i4 = 2;
                                            if (zzaosVar.zzh) {
                                            }
                                            if (zzaosVar.zzi) {
                                            }
                                        } else {
                                            zzaooVar2 = zzaooVar;
                                            zzeuVar = zzeuVar2;
                                            j = zzc2;
                                            i4 = 2;
                                        }
                                        int i12 = zza2.zza;
                                        if (i12 == -1) {
                                            i12 = zzaosVar != null ? zzaosVar.zzb : -1;
                                        }
                                        switch (i12) {
                                            case 0:
                                            default:
                                                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 19);
                                                sb.append("Unknown alignment: ");
                                                sb.append(i12);
                                                zzeh.zzc("SsaParser", sb.toString());
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        zzcxVar.zzd(alignment);
                                        int i13 = Integer.MIN_VALUE;
                                        switch (i12) {
                                            case 0:
                                            default:
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 19);
                                                sb2.append("Unknown alignment: ");
                                                sb2.append(i12);
                                                zzeh.zzc("SsaParser", sb2.toString());
                                            case -1:
                                                i5 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i5 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i5 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i5 = i4;
                                                break;
                                        }
                                        zzcxVar.zzj(i5);
                                        switch (i12) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 19);
                                                sb3.append("Unknown alignment: ");
                                                sb3.append(i12);
                                                zzeh.zzc("SsaParser", sb3.toString());
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i13 = i4;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i13 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i13 = 0;
                                                break;
                                        }
                                        zzcxVar.zzg(i13);
                                        PointF pointF = zza2.zzb;
                                        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                            zzcxVar.zzi(zzd(zzcxVar.zzk()));
                                            zzcxVar.zzf(zzd(zzcxVar.zzh()), 0);
                                        } else {
                                            zzcxVar.zzi(pointF.x / f);
                                            zzcxVar.zzf(pointF.y / f2, 0);
                                        }
                                        zzcy zzr = zzcxVar.zzr();
                                        int zze = zze(j, arrayList2, arrayList);
                                        for (int zze2 = zze(zzc, arrayList2, arrayList); zze2 < zze; zze2++) {
                                            ((List) arrayList.get(zze2)).add(zzr);
                                        }
                                    }
                                    zzaopVar = this;
                                    zzR = charset;
                                    zzaooVar = zzaooVar2;
                                    zzeuVar2 = zzeuVar;
                                }
                            }
                            parseInt = 0;
                            zzc = zzc(split[zzaooVar.zzb]);
                            if (zzc != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = zzR;
                zzaooVar2 = zzaooVar;
                zzeuVar = zzeuVar2;
                zzaopVar = this;
                zzR = charset;
                zzaooVar = zzaooVar2;
                zzeuVar2 = zzeuVar;
            }
        }
    }

    public zzaop(@Nullable List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzeu();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzj = zzfm.zzj((byte[]) list.get(0));
        zzguk.zza(zzj.startsWith("Format:"));
        zzaoo zza2 = zzaoo.zza(zzj);
        zza2.getClass();
        this.zzc = zza2;
        zzb(new zzeu((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
