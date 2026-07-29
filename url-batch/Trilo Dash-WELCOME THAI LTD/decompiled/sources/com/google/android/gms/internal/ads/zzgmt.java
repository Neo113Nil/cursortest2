package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgmt {
    private static final Class zza;
    private static final zzgni zzb;
    private static final zzgni zzc;
    private static final zzgni zzd;

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
        zzd = new zzgnk();
    }

    public static zzgni zzA() {
        return zzc;
    }

    public static zzgni zzB() {
        return zzd;
    }

    static Object zzC(int i, List list, zzgks zzgksVar, Object obj, zzgni zzgniVar) {
        if (zzgksVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgksVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzgniVar);
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
                if (!zzgksVar.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzgniVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i, int i2, Object obj, zzgni zzgniVar) {
        if (obj == null) {
            obj = zzgniVar.zzf();
        }
        zzgniVar.zzl(obj, i, i2);
        return obj;
    }

    static void zzE(zzgkb zzgkbVar, Object obj, Object obj2) {
        zzgkbVar.zza(obj2);
        throw null;
    }

    static void zzF(zzgni zzgniVar, Object obj, Object obj2) {
        zzgniVar.zzo(obj, zzgniVar.zze(zzgniVar.zzd(obj), zzgniVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgko.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void zzI(zzglt zzgltVar, Object obj, Object obj2, long j) {
        zzgns.zzv(obj, j, zzglt.zzc(zzgns.zzh(obj, j), zzgns.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzc(i, list, z);
    }

    public static void zzK(int i, List list, zzgjw zzgjwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zze(i, list);
    }

    public static void zzL(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzg(i, list, z);
    }

    public static void zzM(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzj(i, list, z);
    }

    public static void zzN(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzl(i, list, z);
    }

    public static void zzO(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzn(i, list, z);
    }

    public static void zzP(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzp(i, list, z);
    }

    public static void zzQ(int i, List list, zzgjw zzgjwVar, zzgmr zzgmrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgjwVar.zzq(i, list.get(i2), zzgmrVar);
        }
    }

    public static void zzR(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzs(i, list, z);
    }

    public static void zzS(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzu(i, list, z);
    }

    public static void zzT(int i, List list, zzgjw zzgjwVar, zzgmr zzgmrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgjwVar.zzv(i, list.get(i2), zzgmrVar);
        }
    }

    public static void zzU(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzx(i, list, z);
    }

    public static void zzV(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzz(i, list, z);
    }

    public static void zzW(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzB(i, list, z);
    }

    public static void zzX(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzD(i, list, z);
    }

    public static void zzY(int i, List list, zzgjw zzgjwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzG(i, list);
    }

    public static void zzZ(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzI(i, list, z);
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjv.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzgjw zzgjwVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzK(i, list, z);
    }

    private static zzgni zzab(boolean z) {
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
            return (zzgni) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
        int zzD = size * zzgjv.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgjv.zzw((zzgjg) list.get(i2));
        }
        return zzD;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgjv.zzD(i));
    }

    static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(zzgkpVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(((Integer) list.get(i2)).intValue());
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
        return size * (zzgjv.zzE(i << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjv.zzE(i << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i, List list, zzgmr zzgmrVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzgjv.zzx(i, (zzgly) list.get(i3), zzgmrVar);
        }
        return i2;
    }

    static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgjv.zzD(i));
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(zzgkpVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgjv.zzD(i));
    }

    static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzglnVar = (zzgln) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(zzglnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, Object obj, zzgmr zzgmrVar) {
        if (!(obj instanceof zzgle)) {
            return zzgjv.zzE(i << 3) + zzgjv.zzA((zzgly) obj, zzgmrVar);
        }
        int zzE = zzgjv.zzE(i << 3);
        int zza2 = ((zzgle) obj).zza();
        return zzE + zzgjv.zzE(zza2) + zza2;
    }

    static int zzp(int i, List list, zzgmr zzgmrVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            zzD += obj instanceof zzgle ? zzgjv.zzz((zzgle) obj) : zzgjv.zzA((zzgly) obj, zzgmrVar);
        }
        return zzD;
    }

    static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgjv.zzD(i));
    }

    static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgkpVar.zze(i2);
                i += zzgjv.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgjv.zzE((intValue >> 31) ^ (intValue + intValue));
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
        return zzt(list) + (size * zzgjv.zzD(i));
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzglnVar = (zzgln) list;
            i = 0;
            while (i2 < size) {
                long zze = zzglnVar.zze(i2);
                i += zzgjv.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgjv.zzF((longValue >> 63) ^ (longValue + longValue));
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
        int zzD = zzgjv.zzD(i) * size;
        if (list instanceof zzglg) {
            zzglg zzglgVar = (zzglg) list;
            while (i2 < size) {
                Object zzf = zzglgVar.zzf(i2);
                zzD += zzf instanceof zzgjg ? zzgjv.zzw((zzgjg) zzf) : zzgjv.zzC((String) zzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                zzD += obj instanceof zzgjg ? zzgjv.zzw((zzgjg) obj) : zzgjv.zzC((String) obj);
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
        return zzw(list) + (size * zzgjv.zzD(i));
    }

    static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzE(zzgkpVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzE(((Integer) list.get(i2)).intValue());
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
        return zzy(list) + (size * zzgjv.zzD(i));
    }

    static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzglnVar = (zzgln) list;
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(zzglnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjv.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgni zzz() {
        return zzb;
    }
}
