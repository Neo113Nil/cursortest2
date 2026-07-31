package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzand {
    private static final zzanu<?, ?> zza = new zzanw();

    @Deprecated
    static int zza(int i, zzamm zzammVar, zzanb zzanbVar) {
        return (zzakn.zzh(i) << 1) + ((zzajm) zzammVar).zza(zzanbVar);
    }

    private static int zza(zzajm zzajmVar, zzanb zzanbVar) {
        return zzakn.zzd(zzajmVar.zza(zzanbVar));
    }

    static int zza(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zza(i, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zza(int i, List<zzajv> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzh = size * zzakn.zzh(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzh += zzakn.zza(list.get(i2));
        }
        return zzh;
    }

    static int zzb(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzakn.zzh(i));
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzakn.zza(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzali zzaliVar = (zzali) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzakn.zza(zzaliVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzc(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zzb(i, 0);
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzakn.zza(i, 0L);
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i, List<zzamm> list, zzanb<?> zzanbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zza(i, list.get(i3), (zzanb) zzanbVar);
        }
        return i2;
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzakn.zzh(i));
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzakn.zzc(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzali zzaliVar = (zzali) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzakn.zzc(zzaliVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzf(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzakn.zzh(i));
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalx)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzakn.zzb(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzalx zzalxVar = (zzalx) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzakn.zzb(zzalxVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zza(int i, Object obj, zzanb<?> zzanbVar) {
        if (obj instanceof zzalu) {
            return zzakn.zzb(i, (zzalu) obj);
        }
        return zzakn.zzh(i) + zza((zzajm) obj, (zzanb) zzanbVar);
    }

    static int zzb(int i, List<?> list, zzanb<?> zzanbVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzh = zzakn.zzh(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzalu) {
                zza2 = zzakn.zza((zzalu) obj);
            } else {
                zza2 = zza((zzajm) obj, (zzanb) zzanbVar);
            }
            zzh += zza2;
        }
        return zzh;
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzakn.zzh(i));
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzakn.zzg(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzali zzaliVar = (zzali) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzakn.zzg(zzaliVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzh(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzakn.zzh(i));
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalx)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzakn.zzd(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzalx zzalxVar = (zzalx) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzakn.zzd(zzalxVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzb(int i, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzh = zzakn.zzh(i) * size;
        if (!(list instanceof zzalt)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzajv) {
                    zza2 = zzakn.zza((zzajv) obj);
                } else {
                    zza2 = zzakn.zza((String) obj);
                }
                zzh += zza2;
                i2++;
            }
            return zzh;
        }
        zzalt zzaltVar = (zzalt) list;
        while (i2 < size) {
            Object zza4 = zzaltVar.zza(i2);
            if (zza4 instanceof zzajv) {
                zza3 = zzakn.zza((zzajv) zza4);
            } else {
                zza3 = zzakn.zza((String) zza4);
            }
            zzh += zza3;
            i2++;
        }
        return zzh;
    }

    static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzakn.zzh(i));
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzali)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzakn.zzi(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzali zzaliVar = (zzali) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzakn.zzi(zzaliVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzj(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzakn.zzh(i));
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzalx)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzakn.zze(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzalx zzalxVar = (zzalx) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzakn.zze(zzalxVar.zzb(i));
            i++;
        }
        return i3;
    }

    public static zzanu<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i, List<Integer> list, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar) {
        if (zzaljVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzaljVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(obj, i, intValue, ub, zzanuVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!zzaljVar.zza(intValue2)) {
                ub = (UB) zza(obj, i, intValue2, ub, zzanuVar);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(Object obj, int i, int i2, UB ub, zzanu<UT, UB> zzanuVar) {
        if (ub == null) {
            ub = zzanuVar.zzc(obj);
        }
        zzanuVar.zzb(ub, i, i2);
        return ub;
    }

    static <T, FT extends zzakz<FT>> void zza(zzakw<FT> zzakwVar, T t, T t2) {
        zzakx<FT> zza2 = zzakwVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzakwVar.zzb(t).zza(zza2);
    }

    static <T> void zza(zzamf zzamfVar, T t, T t2, long j) {
        zzanz.zza(t, j, zzamfVar.zza(zzanz.zze(t, j), zzanz.zze(t2, j)));
    }

    static <T, UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t, T t2) {
        zzanuVar.zzc(t, zzanuVar.zza(zzanuVar.zzd(t), zzanuVar.zzd(t2)));
    }

    public static void zza(Class<?> cls) {
        zzalf.class.isAssignableFrom(cls);
    }

    public static void zza(int i, List<Boolean> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list, z);
    }

    public static void zza(int i, List<zzajv> list, zzaol zzaolVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list);
    }

    public static void zzb(int i, List<Double> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list, z);
    }

    public static void zzc(int i, List<Integer> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Integer> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zze(i, list, z);
    }

    public static void zzf(int i, List<Float> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzf(i, list, z);
    }

    public static void zza(int i, List<?> list, zzaol zzaolVar, zzanb<?> zzanbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zza(i, list, (zzanb) zzanbVar);
    }

    public static void zzg(int i, List<Integer> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzg(i, list, z);
    }

    public static void zzh(int i, List<Long> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzh(i, list, z);
    }

    public static void zzb(int i, List<?> list, zzaol zzaolVar, zzanb<?> zzanbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list, (zzanb) zzanbVar);
    }

    public static void zzi(int i, List<Integer> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzi(i, list, z);
    }

    public static void zzj(int i, List<Long> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzj(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzk(i, list, z);
    }

    public static void zzl(int i, List<Long> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzl(i, list, z);
    }

    public static void zzb(int i, List<String> list, zzaol zzaolVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzb(i, list);
    }

    public static void zzm(int i, List<Integer> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzm(i, list, z);
    }

    public static void zzn(int i, List<Long> list, zzaol zzaolVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaolVar.zzn(i, list, z);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
