package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxn {
    private static final zzgxn zzb = new zzgxn(true);
    final zzhao zza = new zzhah();
    private boolean zzc;
    private boolean zzd;

    private zzgxn() {
    }

    static int zza(zzhbf zzhbfVar, int i, Object obj) {
        int zzD = zzgxd.zzD(i << 3);
        if (zzhbfVar == zzhbf.GROUP) {
            zzgzj zzgzjVar = (zzgzj) obj;
            byte[] bArr = zzgyl.zzb;
            if (zzgzjVar instanceof zzgvw) {
                throw null;
            }
            zzD += zzD;
        }
        return zzD + zzb(zzhbfVar, obj);
    }

    static int zzb(zzhbf zzhbfVar, Object obj) {
        int zzd;
        int zzD;
        zzhbf zzhbfVar2 = zzhbf.DOUBLE;
        zzhbg zzhbgVar = zzhbg.INT;
        switch (zzhbfVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzgxd.zzf;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzgxd.zzf;
                return 4;
            case INT64:
                return zzgxd.zzE(((Long) obj).longValue());
            case UINT64:
                return zzgxd.zzE(((Long) obj).longValue());
            case INT32:
                return zzgxd.zzE(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzgxd.zzf;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzgxd.zzf;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzgxd.zzf;
                return 1;
            case STRING:
                if (!(obj instanceof zzgwm)) {
                    return zzgxd.zzC((String) obj);
                }
                int i6 = zzgxd.zzf;
                zzd = ((zzgwm) obj).zzd();
                zzD = zzgxd.zzD(zzd);
                break;
            case GROUP:
                int i7 = zzgxd.zzf;
                return ((zzgzj) obj).zzaY();
            case MESSAGE:
                if (!(obj instanceof zzgyt)) {
                    return zzgxd.zzz((zzgzj) obj);
                }
                int i8 = zzgxd.zzf;
                zzd = ((zzgyt) obj).zza();
                zzD = zzgxd.zzD(zzd);
                break;
            case BYTES:
                if (!(obj instanceof zzgwm)) {
                    int i9 = zzgxd.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzgxd.zzD(zzd);
                    break;
                } else {
                    int i10 = zzgxd.zzf;
                    zzd = ((zzgwm) obj).zzd();
                    zzD = zzgxd.zzD(zzd);
                    break;
                }
            case UINT32:
                return zzgxd.zzD(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzgyc ? zzgxd.zzE(((zzgyc) obj).zza()) : zzgxd.zzE(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i11 = zzgxd.zzf;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i12 = zzgxd.zzf;
                return 8;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                return zzgxd.zzD((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((Long) obj).longValue();
                return zzgxd.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzgxm zzgxmVar, Object obj) {
        zzhbf zzb2 = zzgxmVar.zzb();
        int zza = zzgxmVar.zza();
        if (!zzgxmVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int i = 0;
        if (!zzgxmVar.zzd()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += zza(zzb2, zza, it.next());
            }
            return i;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += zzb(zzb2, it2.next());
        }
        return zzgxd.zzD(zza << 3) + i + zzgxd.zzD(i);
    }

    public static zzgxn zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgxm zzgxmVar = (zzgxm) entry.getKey();
        if (zzgxmVar.zzc() != zzhbg.MESSAGE) {
            return true;
        }
        if (!zzgxmVar.zze()) {
            return zzk(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzk(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzgzk) {
            return ((zzgzk) obj).zzbw();
        }
        if (obj instanceof zzgyt) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i;
        int zzD;
        int zzD2;
        zzgxm zzgxmVar = (zzgxm) entry.getKey();
        Object value = entry.getValue();
        if (zzgxmVar.zzc() != zzhbg.MESSAGE || zzgxmVar.zze() || zzgxmVar.zzd()) {
            return zzc(zzgxmVar, value);
        }
        if (value instanceof zzgyt) {
            int zza = ((zzgxm) entry.getKey()).zza();
            int zzD3 = zzgxd.zzD(8);
            i = zzD3 + zzD3;
            zzD = zzgxd.zzD(16) + zzgxd.zzD(zza);
            int zzD4 = zzgxd.zzD(24);
            int zza2 = ((zzgyt) value).zza();
            zzD2 = zzD4 + zzgxd.zzD(zza2) + zza2;
        } else {
            int zza3 = ((zzgxm) entry.getKey()).zza();
            int zzD5 = zzgxd.zzD(8);
            i = zzD5 + zzD5;
            zzD = zzgxd.zzD(16) + zzgxd.zzD(zza3);
            zzD2 = zzgxd.zzD(24) + zzgxd.zzz((zzgzj) value);
        }
        return i + zzD + zzD2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzm(zzgxm zzgxmVar, Object obj) {
        boolean z;
        zzgxmVar.zzb();
        byte[] bArr = zzgyl.zzb;
        obj.getClass();
        zzhbf zzhbfVar = zzhbf.DOUBLE;
        zzhbg zzhbgVar = zzhbg.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzgwm) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzgyc)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzgzj) || (obj instanceof zzgyt)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxmVar.zza()), zzgxmVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgxn zzgxnVar = new zzgxn();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzgxnVar.zzh((zzgxm) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgxnVar.zzh((zzgxm) entry.getKey(), entry.getValue());
        }
        zzgxnVar.zzd = this.zzd;
        return zzgxnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgxn) {
            return this.zza.equals(((zzgxn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zzl(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i += zzl((Map.Entry) it.next());
        }
        return i;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzgys(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            if (zzg.getValue() instanceof zzgxy) {
                ((zzgxy) zzg.getValue()).zzbW();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzgxm zzgxmVar, Object obj) {
        if (!zzgxmVar.zze()) {
            zzm(zzgxmVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzm(zzgxmVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzgyt) {
            this.zzd = true;
        }
        this.zza.put(zzgxmVar, obj);
    }

    public final boolean zzi() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzj(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzj((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgxn(boolean z) {
        zzg();
        zzg();
    }
}
