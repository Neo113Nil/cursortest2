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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.commons.io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaky {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzale zzf;
    public final String zzg;
    public final String zzh;
    public final zzaky zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzaky zzb(String str, long j, long j2, zzale zzaleVar, String[] strArr, String str2, String str3, zzaky zzakyVar) {
        return new zzaky(str, null, j, j2, zzaleVar, strArr, str2, str3, zzakyVar);
    }

    public static zzaky zzc(String str) {
        return new zzaky(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcz zzczVar = new zzcz();
            zzczVar.zzl(new SpannableStringBuilder());
            map.put(str, zzczVar);
        }
        CharSequence zzq = ((zzcz) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.zzh != null)) {
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
                zzaky zzakyVar = (zzaky) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzakyVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j, str, list);
        }
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        zzaky zzakyVar;
        int i;
        int i2;
        zzale zza;
        int i3;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            for (Map.Entry entry : this.zzl.entrySet()) {
                String str3 = (String) entry.getKey();
                int intValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    zzcz zzczVar = (zzcz) map3.get(str3);
                    zzczVar.getClass();
                    zzalc zzalcVar = (zzalc) map2.get(str2);
                    zzalcVar.getClass();
                    zzale zza2 = zzald.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzczVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzczVar.zzl(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        zzaky zzakyVar2 = this.zzi;
                        if (zza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzH()) {
                            zzdg.zza(spannableStringBuilder, new ForegroundColorSpan(zza2.zzd()), intValue, intValue2, 33);
                        }
                        if (zza2.zzG()) {
                            zzdg.zza(spannableStringBuilder, new BackgroundColorSpan(zza2.zzc()), intValue, intValue2, 33);
                        }
                        if (zza2.zzD() != null) {
                            zzdg.zza(spannableStringBuilder, new TypefaceSpan(zza2.zzD()), intValue, intValue2, 33);
                        }
                        if (zza2.zzk() != null) {
                            zzakx zzk = zza2.zzk();
                            zzk.getClass();
                            int i4 = zzk.zza;
                            if (i4 == -1) {
                                int i5 = zzalcVar.zzj;
                                i4 = (i5 == 2 || i5 == 1) ? 3 : 1;
                                i3 = 1;
                            } else {
                                i3 = zzk.zzb;
                            }
                            int i6 = zzk.zzc;
                            if (i6 == -2) {
                                i6 = 1;
                            }
                            zzdg.zza(spannableStringBuilder, new zzdh(i4, i3, i6), intValue, intValue2, 33);
                        }
                        int zzg = zza2.zzg();
                        if (zzg == 2) {
                            while (true) {
                                if (zzakyVar2 == null) {
                                    zzakyVar2 = null;
                                    break;
                                }
                                zzale zza3 = zzald.zza(zzakyVar2.zzf, zzakyVar2.zzj, map);
                                if (zza3 != null && zza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzakyVar2 = zzakyVar2.zzi;
                                }
                            }
                            if (zzakyVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzakyVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzakyVar = null;
                                        break;
                                    }
                                    zzaky zzakyVar3 = (zzaky) arrayDeque.pop();
                                    zzale zza4 = zzald.zza(zzakyVar3.zzf, zzakyVar3.zzj, map);
                                    if (zza4 != null && zza4.zzg() == 3) {
                                        zzakyVar = zzakyVar3;
                                        break;
                                    }
                                    for (int zza5 = zzakyVar3.zza() - 1; zza5 >= 0; zza5--) {
                                        arrayDeque.push(zzakyVar3.zzd(zza5));
                                    }
                                }
                                if (zzakyVar != null) {
                                    if (zzakyVar.zza() != 1 || zzakyVar.zzd(0).zzb == null) {
                                        zzea.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzakyVar.zzd(0).zzb;
                                        int i7 = zzet.zza;
                                        zzale zza6 = zzald.zza(zzakyVar.zzf, zzakyVar.zzj, map);
                                        if (zza6 != null) {
                                            i2 = zza6.zzf();
                                            i = -1;
                                        } else {
                                            i = -1;
                                            i2 = -1;
                                        }
                                        if (i2 == i && (zza = zzald.zza(zzakyVar2.zzf, zzakyVar2.zzj, map)) != null) {
                                            i2 = zza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzdf(str4, i2), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (zzg == 3 || zzg == 4) {
                            spannableStringBuilder.setSpan(new zzakw(), intValue, intValue2, 33);
                        }
                        if (zza2.zzF()) {
                            zzdg.zza(spannableStringBuilder, new zzde(), intValue, intValue2, 33);
                        }
                        int zze = zza2.zze();
                        if (zze == 1) {
                            zzdg.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zza2.zza(), true), intValue, intValue2, 33);
                        } else if (zze == 2) {
                            zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zza()), intValue, intValue2, 33);
                        } else if (zze == 3) {
                            zzdg.zza(spannableStringBuilder, new RelativeSizeSpan(zza2.zza() / 100.0f), intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzb() != Float.MAX_VALUE) {
                                zzczVar.zzj((zza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzj() != null) {
                                zzczVar.zzm(zza2.zzj());
                            }
                            if (zza2.zzi() != null) {
                                zzczVar.zzg(zza2.zzi());
                            }
                        }
                    }
                }
            }
            for (int i8 = 0; i8 < zza(); i8++) {
                zzd(i8).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z) {
            SpannableStringBuilder zzi = zzi(str, map);
            String str2 = this.zzb;
            str2.getClass();
            zzi.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap = this.zzk;
                String str3 = (String) entry.getKey();
                CharSequence zzq = ((zzcz) entry.getValue()).zzq();
                zzq.getClass();
                hashMap.put(str3, Integer.valueOf(zzq.length()));
            }
            boolean equals = "p".equals(this.zza);
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzm(j, z || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder zzi2 = zzi(str, map);
                int length = zzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (zzi2.charAt(length) == ' ');
                if (length >= 0 && zzi2.charAt(length) != '\n') {
                    zzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap hashMap2 = this.zzl;
                String str4 = (String) entry2.getKey();
                CharSequence zzq2 = ((zzcz) entry2.getValue()).zzq();
                zzq2.getClass();
                hashMap2.put(str4, Integer.valueOf(zzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzaky zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzaky) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalc zzalcVar = (zzalc) map2.get(pair.first);
                zzalcVar.getClass();
                zzcz zzczVar = new zzcz();
                zzczVar.zzc(decodeByteArray);
                zzczVar.zzh(zzalcVar.zzb);
                zzczVar.zzi(0);
                zzczVar.zze(zzalcVar.zzc, 0);
                zzczVar.zzf(zzalcVar.zze);
                zzczVar.zzk(zzalcVar.zzf);
                zzczVar.zzd(zzalcVar.zzg);
                zzczVar.zzo(zzalcVar.zzj);
                arrayList2.add(zzczVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalc zzalcVar2 = (zzalc) map2.get(entry.getKey());
            zzalcVar2.getClass();
            zzcz zzczVar2 = (zzcz) entry.getValue();
            CharSequence zzq = zzczVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzakw zzakwVar : (zzakw[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzakw.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzakwVar), spannableStringBuilder.getSpanEnd(zzakwVar), (CharSequence) "");
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
            zzczVar2.zze(zzalcVar2.zzc, zzalcVar2.zzd);
            zzczVar2.zzf(zzalcVar2.zze);
            zzczVar2.zzh(zzalcVar2.zzb);
            zzczVar2.zzk(zzalcVar2.zzf);
            zzczVar2.zzn(zzalcVar2.zzi, zzalcVar2.zzh);
            zzczVar2.zzo(zzalcVar2.zzj);
            arrayList2.add(zzczVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzaky zzakyVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzakyVar);
    }

    public final boolean zzg(long j) {
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

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private zzaky(String str, String str2, long j, long j2, zzale zzaleVar, String[] strArr, String str3, String str4, zzaky zzakyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaleVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzakyVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
