package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgtj {
    private static final Class zza;
    private static final zzgty zzb;
    private static final zzgty zzc;
    private static final zzgty zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgua();
    }

    public static zzgty zzA() {
        return zzc;
    }

    public static zzgty zzB() {
        return zzd;
    }

    static Object zzC(int i, List list, zzgri zzgriVar, Object obj, zzgty zzgtyVar) {
        if (zzgriVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgriVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzgtyVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgriVar.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzgtyVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i, int i2, Object obj, zzgty zzgtyVar) {
        if (obj == null) {
            obj = zzgtyVar.zzf();
        }
        zzgtyVar.zzl(obj, i, i2);
        return obj;
    }

    static void zzE(zzgqr zzgqrVar, Object obj, Object obj2) {
        zzgqrVar.zza(obj2);
        throw null;
    }

    static void zzF(zzgty zzgtyVar, Object obj, Object obj2) {
        zzgtyVar.zzo(obj, zzgtyVar.zze(zzgtyVar.zzd(obj), zzgtyVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgre.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void zzI(zzgsj zzgsjVar, Object obj, Object obj2, long j) {
        zzgui.zzv(obj, j, zzgsj.zzc(zzgui.zzh(obj, j), zzgui.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzc(i, list, z);
    }

    public static void zzK(int i, List list, zzgqm zzgqmVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zze(i, list);
    }

    public static void zzL(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzg(i, list, z);
    }

    public static void zzM(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzj(i, list, z);
    }

    public static void zzN(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzl(i, list, z);
    }

    public static void zzO(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzn(i, list, z);
    }

    public static void zzP(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzp(i, list, z);
    }

    public static void zzQ(int i, List list, zzgqm zzgqmVar, zzgth zzgthVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgqmVar.zzq(i, list.get(i2), zzgthVar);
        }
    }

    public static void zzR(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzs(i, list, z);
    }

    public static void zzS(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzu(i, list, z);
    }

    public static void zzT(int i, List list, zzgqm zzgqmVar, zzgth zzgthVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgqmVar.zzv(i, list.get(i2), zzgthVar);
        }
    }

    public static void zzU(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzx(i, list, z);
    }

    public static void zzV(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzz(i, list, z);
    }

    public static void zzW(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzB(i, list, z);
    }

    public static void zzX(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzD(i, list, z);
    }

    public static void zzY(int i, List list, zzgqm zzgqmVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzG(i, list);
    }

    public static void zzZ(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzI(i, list, z);
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgql.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzgqm zzgqmVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgqmVar.zzK(i, list, z);
    }

    private static zzgty zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgty) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzgql.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgql.zzw((zzgpw) list.get(i2));
        }
        return zzD;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgql.zzD(i));
    }

    static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrfVar = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.zzy(zzgrfVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgql.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgql.zzE(i << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgql.zzE(i << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i, List list, zzgth zzgthVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzgql.zzx(i, (zzgso) list.get(i3), zzgthVar);
        }
        return i2;
    }

    static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgql.zzD(i));
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrfVar = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.zzy(zzgrfVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgql.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgql.zzD(i));
    }

    static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsd) {
            zzgsd zzgsdVar = (zzgsd) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.zzF(zzgsdVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgql.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, Object obj, zzgth zzgthVar) {
        if (!(obj instanceof zzgru)) {
            return zzgql.zzE(i << 3) + zzgql.zzA((zzgso) obj, zzgthVar);
        }
        int zzE = zzgql.zzE(i << 3);
        int zza2 = ((zzgru) obj).zza();
        return zzE + zzgql.zzE(zza2) + zza2;
    }

    static int zzp(int i, List list, zzgth zzgthVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgql.zzD(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            zzD += obj instanceof zzgru ? zzgql.zzz((zzgru) obj) : zzgql.zzA((zzgso) obj, zzgthVar);
        }
        return zzD;
    }

    static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgql.zzD(i));
    }

    static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrfVar = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgrfVar.zze(i2);
                i += zzgql.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgql.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgql.zzD(i));
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsd) {
            zzgsd zzgsdVar = (zzgsd) list;
            i = 0;
            while (i2 < size) {
                long zze = zzgsdVar.zze(i2);
                i += zzgql.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgql.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgql.zzD(i) * size;
        if (list instanceof zzgrw) {
            zzgrw zzgrwVar = (zzgrw) list;
            while (i2 < size) {
                Object zzf = zzgrwVar.zzf(i2);
                zzD += zzf instanceof zzgpw ? zzgql.zzw((zzgpw) zzf) : zzgql.zzC((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                zzD += obj instanceof zzgpw ? zzgql.zzw((zzgpw) obj) : zzgql.zzC((String) obj);
                i2++;
            }
        }
        return zzD;
    }

    static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgql.zzD(i));
    }

    static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrf) {
            zzgrf zzgrfVar = (zzgrf) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.zzE(zzgrfVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgql.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgql.zzD(i));
    }

    static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgsd) {
            zzgsd zzgsdVar = (zzgsd) list;
            i = 0;
            while (i2 < size) {
                i += zzgql.zzF(zzgsdVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgql.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgty zzz() {
        return zzb;
    }
}
