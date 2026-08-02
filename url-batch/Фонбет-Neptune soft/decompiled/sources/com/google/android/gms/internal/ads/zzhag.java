package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhag {
    public static final /* synthetic */ int zza = 0;
    private static final zzhas zzb;

    static {
        int i = zzgzt.zza;
        zzb = new zzhau();
    }

    public static void zzA(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzu(i, list, z);
    }

    public static void zzB(int i, List list, zzhbh zzhbhVar, zzhae zzhaeVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzgxe) zzhbhVar).zzv(i, list.get(i2), zzhaeVar);
        }
    }

    public static void zzC(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzy(i, list, z);
    }

    public static void zzD(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzA(i, list, z);
    }

    public static void zzE(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzC(i, list, z);
    }

    public static void zzF(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzE(i, list, z);
    }

    public static void zzG(int i, List list, zzhbh zzhbhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzH(i, list);
    }

    public static void zzH(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzJ(i, list, z);
    }

    public static void zzI(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzL(i, list, z);
    }

    static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(zzgxzVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgxd.zzD(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgxd.zzD(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(zzgxzVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(zzgyyVar.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzh(int i, Object obj, zzhae zzhaeVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzgyu)) {
            return zzgxd.zzD(i2) + zzgxd.zzA((zzgzj) obj, zzhaeVar);
        }
        int zzD = zzgxd.zzD(i2);
        int zza2 = ((zzgyu) obj).zza();
        return zzD + zzgxd.zzD(zza2) + zza2;
    }

    static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i = 0;
            while (i2 < size) {
                int zzd = zzgxzVar.zzd(i2);
                i += zzgxd.zzD((zzd >> 31) ^ (zzd + zzd));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgxd.zzD((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i = 0;
            while (i2 < size) {
                long zza2 = zzgyyVar.zza(i2);
                i += zzgxd.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgxd.zzE((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzD(zzgxzVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(zzgyyVar.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgxd.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzhas zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i, List list, zzgye zzgyeVar, Object obj2, zzhas zzhasVar) {
        if (zzgyeVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzgyeVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzo(obj, i, intValue, obj2, zzhasVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgyeVar.zza(intValue2)) {
                    obj2 = zzo(obj, i, intValue2, obj2, zzhasVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzo(Object obj, int i, int i2, Object obj2, zzhas zzhasVar) {
        if (obj2 == null) {
            obj2 = zzhasVar.zza(obj);
        }
        zzhasVar.zzh(obj2, i, i2);
        return obj2;
    }

    static void zzp(zzgxj zzgxjVar, Object obj, Object obj2) {
        if (((zzgxu) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzq(zzhas zzhasVar, Object obj, Object obj2) {
        zzgxy zzgxyVar = (zzgxy) obj;
        zzhat zzhatVar = zzgxyVar.zzt;
        zzhat zzhatVar2 = ((zzgxy) obj2).zzt;
        if (!zzhat.zzc().equals(zzhatVar2)) {
            if (zzhat.zzc().equals(zzhatVar)) {
                zzhatVar = zzhat.zze(zzhatVar, zzhatVar2);
            } else {
                zzhatVar.zzd(zzhatVar2);
            }
        }
        zzgxyVar.zzt = zzhatVar;
    }

    public static void zzr(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzhbh zzhbhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zze(i, list);
    }

    public static void zzt(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzg(i, list, z);
    }

    public static void zzu(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzj(i, list, z);
    }

    public static void zzv(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzl(i, list, z);
    }

    public static void zzw(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzn(i, list, z);
    }

    public static void zzx(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzp(i, list, z);
    }

    public static void zzy(int i, List list, zzhbh zzhbhVar, zzhae zzhaeVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzgxe) zzhbhVar).zzq(i, list.get(i2), zzhaeVar);
        }
    }

    public static void zzz(int i, List list, zzhbh zzhbhVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhbhVar.zzs(i, list, z);
    }
}
