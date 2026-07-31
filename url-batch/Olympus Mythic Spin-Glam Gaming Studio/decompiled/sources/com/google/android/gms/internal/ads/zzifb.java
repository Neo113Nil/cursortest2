package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zzifb {
    private static final zzifb zzd = new zzifb(true);
    final zzihu zza = new zzihq();
    boolean zzb;
    boolean zzc;

    private zzifb() {
    }

    public static zzifb zza() {
        return zzd;
    }

    static void zzf(zzier zzierVar, zziin zziinVar, int i, Object obj) throws IOException {
        if (zziinVar == zziin.zzj) {
            zzierVar.zzb(i, 3);
            ((zzigw) obj).zzcX(zzierVar);
            zzierVar.zzb(i, 4);
            return;
        }
        zzierVar.zzb(i, zziinVar.zzb());
        zziio zziioVar = zziio.INT;
        switch (zziinVar.ordinal()) {
            case 0:
                zzierVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzierVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzierVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zzierVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zzierVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zzierVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zzierVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zzierVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zziei)) {
                    zzierVar.zzw((String) obj);
                    break;
                } else {
                    zzierVar.zzk((zziei) obj);
                    break;
                }
            case 9:
                ((zzigw) obj).zzcX(zzierVar);
                break;
            case 10:
                zzierVar.zzo((zzigw) obj);
                break;
            case 11:
                if (!(obj instanceof zziei)) {
                    byte[] bArr = (byte[]) obj;
                    zzierVar.zzl(bArr, 0, bArr.length);
                    break;
                } else {
                    zzierVar.zzk((zziei) obj);
                    break;
                }
            case 12:
                zzierVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzifq)) {
                    zzierVar.zzq(((Integer) obj).intValue());
                    break;
                } else {
                    zzierVar.zzq(((zzifq) obj).zza());
                    break;
                }
            case 14:
                zzierVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zzierVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzierVar.zzr((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzierVar.zzt((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int zzh(zziin zziinVar, int i, Object obj) {
        int zzF = zzier.zzF(i << 3);
        if (zziinVar == zziin.zzj) {
            zzF += zzF;
        }
        return zzF + zzi(zziinVar, obj);
    }

    static int zzi(zziin zziinVar, Object obj) {
        int zzb;
        int zzF;
        zziin zziinVar2 = zziin.zza;
        zziio zziioVar = zziio.INT;
        switch (zziinVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return zzier.zzG(((Long) obj).longValue());
            case 3:
                return zzier.zzG(((Long) obj).longValue());
            case 4:
                return zzier.zzG(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                if (!(obj instanceof zziei)) {
                    int i = zziim.zza;
                    zzb = zziij.zzb((String) obj);
                    zzF = zzier.zzF(zzb);
                    break;
                } else {
                    zzb = ((zziei) obj).zzb();
                    zzF = zzier.zzF(zzb);
                    break;
                }
            case 9:
                return ((zzigw) obj).zzbr();
            case 10:
                if (!(obj instanceof zzigc)) {
                    return zzier.zzH((zzigw) obj);
                }
                zzb = ((zzigc) obj).zzb();
                zzF = zzier.zzF(zzb);
                break;
            case 11:
                if (!(obj instanceof zziei)) {
                    zzb = ((byte[]) obj).length;
                    zzF = zzier.zzF(zzb);
                    break;
                } else {
                    zzb = ((zziei) obj).zzb();
                    zzF = zzier.zzF(zzb);
                    break;
                }
            case 12:
                return zzier.zzF(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzifq ? zzier.zzG(((zzifq) obj).zza()) : zzier.zzG(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzier.zzF((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzier.zzG((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzF + zzb;
    }

    public static int zzj(zzifa zzifaVar, Object obj) {
        zziin zzb = zzifaVar.zzb();
        int zza = zzifaVar.zza();
        if (!zzifaVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzifaVar.zze()) {
            int i2 = 0;
            while (i < size) {
                i2 += zzh(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzi(zzb, list.get(i));
            i++;
        }
        return zzier.zzF(zza << 3) + i3 + zzier.zzF(i3);
    }

    private static boolean zzk(Map.Entry entry) {
        zzifa zzifaVar = (zzifa) entry.getKey();
        if (zzifaVar.zzc() != zziio.MESSAGE) {
            return true;
        }
        if (!zzifaVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzigx) {
            return ((zzigx) obj).zzbi();
        }
        if (obj instanceof zzigc) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int zzF;
        int zzF2;
        zzifa zzifaVar = (zzifa) entry.getKey();
        Object value = entry.getValue();
        if (zzifaVar.zzc() != zziio.MESSAGE || zzifaVar.zzd() || zzifaVar.zze()) {
            return zzj(zzifaVar, value);
        }
        if (value instanceof zzigc) {
            int zza = ((zzifa) entry.getKey()).zza();
            int zzF3 = zzier.zzF(8);
            i = zzF3 + zzF3;
            zzF = zzier.zzF(16) + zzier.zzF(zza);
            int zzF4 = zzier.zzF(24);
            int zzb = ((zzigc) value).zzb();
            zzF2 = zzF4 + zzier.zzF(zzb) + zzb;
        } else {
            int zza2 = ((zzifa) entry.getKey()).zza();
            int zzF5 = zzier.zzF(8);
            i = zzF5 + zzF5;
            zzF = zzier.zzF(16) + zzier.zzF(zza2);
            zzF2 = zzier.zzF(24) + zzier.zzH((zzigw) value);
        }
        return i + zzF + zzF2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzifa zzifaVar, Object obj) {
        boolean z;
        zzifaVar.zzb();
        obj.getClass();
        zziin zziinVar = zziin.zza;
        zziio zziioVar = zziio.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zziei) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzifq)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzigw) || (obj instanceof zzigc)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzifaVar.zza()), zzifaVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzifb zzifbVar = new zzifb();
        zzihu zzihuVar = this.zza;
        int zzc = zzihuVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzd2 = zzihuVar.zzd(i);
            zzifbVar.zzd(((zzihr) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zzihuVar.zze()) {
            zzifbVar.zzd((zzifa) entry.getKey(), entry.getValue());
        }
        zzifbVar.zzc = this.zzc;
        return zzifbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzifb) {
            return this.zza.equals(((zzifb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzihu zzihuVar = this.zza;
        int zzc = zzihuVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zzihuVar.zzd(i).getValue();
            if (value instanceof zzifm) {
                ((zzifm) value).zzbm();
            }
        }
        Iterator it = zzihuVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzifm) {
                ((zzifm) value2).zzbm();
            }
        }
        zzihuVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzihu zzihuVar = this.zza;
        return zzihuVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzigb(zzihuVar.entrySet().iterator()) : zzihuVar.entrySet().iterator();
    }

    public final void zzd(zzifa zzifaVar, Object obj) {
        if (!zzifaVar.zzd()) {
            zzn(zzifaVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzifaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzigc) {
            this.zzc = true;
        }
        this.zza.put(zzifaVar, obj);
    }

    public final boolean zze() {
        zzihu zzihuVar = this.zza;
        int zzc = zzihuVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzihuVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzihuVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzihu zzihuVar = this.zza;
        int zzc = zzihuVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzihuVar.zzd(i2));
        }
        Iterator it = zzihuVar.zze().iterator();
        while (it.hasNext()) {
            i += zzm((Map.Entry) it.next());
        }
        return i;
    }

    private zzifb(boolean z) {
        zzb();
        zzb();
    }
}
