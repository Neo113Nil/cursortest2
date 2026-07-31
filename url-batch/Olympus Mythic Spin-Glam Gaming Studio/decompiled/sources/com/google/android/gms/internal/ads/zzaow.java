package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzaow {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzapc zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzaow zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzaow zza(String str) {
        return new zzaow(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzaow zzb(@Nullable String str, long j, long j2, @Nullable zzapc zzapcVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzaow zzaowVar) {
        return new zzaow(str, null, j, j2, zzapcVar, strArr, str2, str3, zzaowVar);
    }

    private final void zzi(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        if (z || equals || ("div".equals(str) && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzaow zzaowVar = (zzaow) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzaowVar.zzi(treeSet, z2);
            }
        }
    }

    private final void zzj(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean equals = "".equals(str3);
        boolean zzc = zzc(j);
        if (true != equals) {
            str = str3;
        }
        if (zzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zzf(); i++) {
            zze(i).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z, String str, Map map) {
        HashMap hashMap = this.zzk;
        hashMap.clear();
        HashMap hashMap2 = this.zzl;
        hashMap2.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z) {
            SpannableStringBuilder zzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            zzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence zzb = ((zzcx) entry.getValue()).zzb();
                zzb.getClass();
                hashMap.put(str6, Integer.valueOf(zzb.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < zzf(); i++) {
                zze(i).zzk(j, z || equals, str4, map);
            }
            if (equals) {
                SpannableStringBuilder zzl2 = zzl(str4, map);
                int length = zzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (zzl2.charAt(length) == ' ');
                if (length >= 0 && zzl2.charAt(length) != '\n') {
                    zzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence zzb2 = ((zzcx) entry2.getValue()).zzb();
                zzb2.getClass();
                hashMap2.put(str7, Integer.valueOf(zzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcx zzcxVar = new zzcx();
            zzcxVar.zza(new SpannableStringBuilder());
            map.put(str, zzcxVar);
        }
        CharSequence zzb = ((zzcx) map.get(str)).zzb();
        zzb.getClass();
        return (SpannableStringBuilder) zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzm(long j, Map map, Map map2, String str, Map map3) {
        Iterator it;
        zzaow zzaowVar;
        int i;
        zzapc zza;
        int zzI;
        int i2;
        int i3 = -1;
        if (zzc(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap = this.zzk;
                int intValue = hashMap.containsKey(str4) ? ((Integer) hashMap.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcx zzcxVar = (zzcx) map3.get(str4);
                    zzcxVar.getClass();
                    zzapa zzapaVar = (zzapa) map2.get(str3);
                    zzapaVar.getClass();
                    int i4 = zzapaVar.zzj;
                    zzapc zza2 = zzapb.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcxVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcxVar.zza(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzaow zzaowVar2 = this.zzi;
                        if (zza2.zza() != i3) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zza()), intValue, intValue2, 33);
                        }
                        if (zza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzl()) {
                            zzde.zza(spannableStringBuilder, new ForegroundColorSpan(zza2.zzj()), intValue, intValue2, 33);
                        }
                        if (zza2.zzo()) {
                            zzde.zza(spannableStringBuilder, new BackgroundColorSpan(zza2.zzm()), intValue, intValue2, 33);
                        }
                        if (zza2.zzh() != null) {
                            zzde.zza(spannableStringBuilder, new TypefaceSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzE() != null) {
                            zzaov zzE = zza2.zzE();
                            zzE.getClass();
                            int i5 = zzE.zza;
                            it = it2;
                            if (i5 == -1) {
                                i5 = (i4 == 2 || i4 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = zzE.zzb;
                            }
                            int i6 = zzE.zzc;
                            if (i6 == -2) {
                                i6 = 1;
                            }
                            zzde.zza(spannableStringBuilder, new zzdf(i5, i2, i6), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzv = zza2.zzv();
                        if (zzv == 2) {
                            while (true) {
                                if (zzaowVar2 == null) {
                                    zzaowVar2 = null;
                                    break;
                                }
                                zzapc zza3 = zzapb.zza(zzaowVar2.zzf, zzaowVar2.zzj, map);
                                if (zza3 != null && zza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzaowVar2 = zzaowVar2.zzi;
                                }
                            }
                            if (zzaowVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaowVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaowVar = null;
                                        break;
                                    }
                                    zzaow zzaowVar3 = (zzaow) arrayDeque.pop();
                                    zzapc zza4 = zzapb.zza(zzaowVar3.zzf, zzaowVar3.zzj, map);
                                    if (zza4 != null && zza4.zzv() == 3) {
                                        zzaowVar = zzaowVar3;
                                        break;
                                    }
                                    for (int zzf = zzaowVar3.zzf() - 1; zzf >= 0; zzf--) {
                                        arrayDeque.push(zzaowVar3.zze(zzf));
                                    }
                                }
                                if (zzaowVar != null) {
                                    if (zzaowVar.zzf() != 1 || zzaowVar.zze(0).zzb == null) {
                                        i = -1;
                                        zzeh.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzaowVar.zze(0).zzb;
                                        String str6 = zzfm.zza;
                                        zzapc zza5 = zzapb.zza(zzaowVar.zzf, zzaowVar.zzj, map);
                                        int zzx = zza5 != null ? zza5.zzx() : -1;
                                        i = -1;
                                        if (zzx == -1 && (zza = zzapb.zza(zzaowVar2.zzf, zzaowVar2.zzj, map)) != null) {
                                            zzx = zza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzdd(str5, zzx), intValue, intValue2, 33);
                                    }
                                    if (zza2.zzC()) {
                                        zzde.zza(spannableStringBuilder, new zzdc(), intValue, intValue2, 33);
                                    }
                                    zzI = zza2.zzI();
                                    if (zzI != 1) {
                                        zzde.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zzJ(), true), intValue, intValue2, 33);
                                    } else if (zzI == 2) {
                                        zzde.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zzJ()), intValue, intValue2, 33);
                                    } else if (zzI == 3) {
                                        zzde.zzb(spannableStringBuilder, zza2.zzJ() / 100.0f, intValue, intValue2, 33);
                                    }
                                    if ("p".equals(this.zza)) {
                                        if (zza2.zzq() != Float.MAX_VALUE) {
                                            zzcxVar.zzp((zza2.zzq() * (-90.0f)) / 100.0f);
                                        }
                                        if (zza2.zzy() != null) {
                                            zzcxVar.zzd(zza2.zzy());
                                        }
                                        if (zza2.zzA() != null) {
                                            zzcxVar.zze(zza2.zzA());
                                        }
                                    }
                                    i3 = i;
                                    it2 = it;
                                }
                            }
                        } else if (zzv == 3 || zzv == 4) {
                            spannableStringBuilder.setSpan(new zzaou(), intValue, intValue2, 33);
                        }
                        i = -1;
                        if (zza2.zzC()) {
                        }
                        zzI = zza2.zzI();
                        if (zzI != 1) {
                        }
                        if ("p".equals(this.zza)) {
                        }
                        i3 = i;
                        it2 = it;
                    }
                }
            }
            for (int i7 = 0; i7 < zzf(); i7++) {
                zze(i7).zzm(j, map, map2, str3, map3);
            }
        }
    }

    public final boolean zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(zzaow zzaowVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaowVar);
    }

    public final zzaow zze(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzaow) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final List zzh(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzapa zzapaVar = (zzapa) map2.get(pair.first);
                zzapaVar.getClass();
                zzcx zzcxVar = new zzcx();
                zzcxVar.zzc(decodeByteArray);
                zzcxVar.zzi(zzapaVar.zzb);
                zzcxVar.zzj(0);
                zzcxVar.zzf(zzapaVar.zzc, 0);
                zzcxVar.zzg(zzapaVar.zze);
                zzcxVar.zzm(zzapaVar.zzf);
                zzcxVar.zzn(zzapaVar.zzg);
                zzcxVar.zzo(zzapaVar.zzj);
                arrayList2.add(zzcxVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzapa zzapaVar2 = (zzapa) map2.get(entry.getKey());
            zzapaVar2.getClass();
            zzcx zzcxVar2 = (zzcx) entry.getValue();
            CharSequence zzb = zzcxVar2.zzb();
            zzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzb;
            for (zzaou zzaouVar : (zzaou[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzaou.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaouVar), spannableStringBuilder.getSpanEnd(zzaouVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcxVar2.zzf(zzapaVar2.zzc, zzapaVar2.zzd);
            zzcxVar2.zzg(zzapaVar2.zze);
            zzcxVar2.zzi(zzapaVar2.zzb);
            zzcxVar2.zzm(zzapaVar2.zzf);
            zzcxVar2.zzl(zzapaVar2.zzi, zzapaVar2.zzh);
            zzcxVar2.zzo(zzapaVar2.zzj);
            arrayList2.add(zzcxVar2.zzr());
        }
        return arrayList2;
    }

    private zzaow(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable zzapc zzapcVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzaow zzaowVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzapcVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaowVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
