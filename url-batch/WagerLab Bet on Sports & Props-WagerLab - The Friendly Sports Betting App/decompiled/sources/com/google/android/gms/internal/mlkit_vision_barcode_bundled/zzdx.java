package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.3.0 */
/* loaded from: classes5.dex */
final class zzdx {
    private static final zzdx zzb = new zzdx(true);
    final zzgo zza = new zzgh();
    private boolean zzc;
    private boolean zzd;

    private zzdx() {
    }

    public static int zza(zzdw zzdwVar, Object obj) {
        int zzd;
        int zzA;
        zzhf zzd2 = zzdwVar.zzd();
        int zza = zzdwVar.zza();
        zzdwVar.zzg();
        int zzA2 = zzdn.zzA(zza << 3);
        if (zzd2 == zzhf.GROUP) {
            zzfm zzfmVar = (zzfm) obj;
            byte[] bArr = zzep.zzb;
            if (zzfmVar instanceof zzcr) {
                throw null;
            }
            zzA2 += zzA2;
        }
        zzhg zzhgVar = zzhg.INT;
        int i = 4;
        switch (zzd2) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                i = 8;
                return zzA2 + i;
            case FLOAT:
                ((Float) obj).floatValue();
                return zzA2 + i;
            case INT64:
                i = zzdn.zzB(((Long) obj).longValue());
                return zzA2 + i;
            case UINT64:
                i = zzdn.zzB(((Long) obj).longValue());
                return zzA2 + i;
            case INT32:
                i = zzdn.zzB(((Integer) obj).intValue());
                return zzA2 + i;
            case FIXED64:
                ((Long) obj).longValue();
                i = 8;
                return zzA2 + i;
            case FIXED32:
                ((Integer) obj).intValue();
                return zzA2 + i;
            case BOOL:
                ((Boolean) obj).booleanValue();
                i = 1;
                return zzA2 + i;
            case STRING:
                if (!(obj instanceof zzdf)) {
                    i = zzdn.zzz((String) obj);
                    return zzA2 + i;
                }
                zzd = ((zzdf) obj).zzd();
                zzA = zzdn.zzA(zzd);
                i = zzA + zzd;
                return zzA2 + i;
            case GROUP:
                i = ((zzfm) obj).zzF();
                return zzA2 + i;
            case MESSAGE:
                if (!(obj instanceof zzew)) {
                    i = zzdn.zzx((zzfm) obj);
                    return zzA2 + i;
                }
                zzd = ((zzew) obj).zza();
                zzA = zzdn.zzA(zzd);
                i = zzA + zzd;
                return zzA2 + i;
            case BYTES:
                if (obj instanceof zzdf) {
                    zzd = ((zzdf) obj).zzd();
                    zzA = zzdn.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzdn.zzA(zzd);
                }
                i = zzA + zzd;
                return zzA2 + i;
            case UINT32:
                i = zzdn.zzA(((Integer) obj).intValue());
                return zzA2 + i;
            case ENUM:
                i = obj instanceof zzej ? zzdn.zzB(((zzej) obj).zza()) : zzdn.zzB(((Integer) obj).intValue());
                return zzA2 + i;
            case SFIXED32:
                ((Integer) obj).intValue();
                return zzA2 + i;
            case SFIXED64:
                ((Long) obj).longValue();
                i = 8;
                return zzA2 + i;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                i = zzdn.zzA((intValue >> 31) ^ (intValue + intValue));
                return zzA2 + i;
            case SINT64:
                long longValue = ((Long) obj).longValue();
                i = zzdn.zzB((longValue >> 63) ^ (longValue + longValue));
                return zzA2 + i;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzdx zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzfr) {
            return ((zzfr) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzdw zzdwVar = (zzdw) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzew;
        zzdwVar.zzg();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzdwVar, zzl(value));
            return;
        }
        Object zze = zze(zzdwVar);
        if (zze == null) {
            this.zza.put(zzdwVar, zzl(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        this.zza.put(zzdwVar, zze instanceof zzfr ? zzdwVar.zzc((zzfr) zze, (zzfr) value) : zzdwVar.zzb(((zzfm) zze).zzaa(), (zzfm) value).zzj());
    }

    private static boolean zzn(Map.Entry entry) {
        zzdw zzdwVar = (zzdw) entry.getKey();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            return true;
        }
        zzdwVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzfn) {
            return ((zzfn) value).zzad();
        }
        if (value instanceof zzew) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int zzA;
        int zzA2;
        zzdw zzdwVar = (zzdw) entry.getKey();
        Object value = entry.getValue();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            return zza(zzdwVar, value);
        }
        zzdwVar.zzg();
        zzdwVar.zzf();
        if (value instanceof zzew) {
            int zza = ((zzdw) entry.getKey()).zza();
            int zzA3 = zzdn.zzA(8);
            i = zzA3 + zzA3;
            zzA = zzdn.zzA(16) + zzdn.zzA(zza);
            int zzA4 = zzdn.zzA(24);
            int zza2 = ((zzew) value).zza();
            zzA2 = zzA4 + zzdn.zzA(zza2) + zza2;
        } else {
            int zza3 = ((zzdw) entry.getKey()).zza();
            int zzA5 = zzdn.zzA(8);
            i = zzA5 + zzA5;
            zzA = zzdn.zzA(16) + zzdn.zzA(zza3);
            zzA2 = zzdn.zzA(24) + zzdn.zzx((zzfm) value);
        }
        return i + zzA + zzA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdx) {
            return this.zza.equals(((zzdx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int zzc = this.zza.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzo(this.zza.zzg(i2));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            i += zzo((Map.Entry) it.next());
        }
        return i;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzdx clone() {
        zzdx zzdxVar = new zzdx();
        int zzc = this.zza.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzdxVar.zzi((zzdw) ((zzgi) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzdxVar.zzi((zzdw) entry.getKey(), entry.getValue());
        }
        zzdxVar.zzd = this.zzd;
        return zzdxVar;
    }

    public final Object zze(zzdw zzdwVar) {
        Object obj = this.zza.get(zzdwVar);
        if (!(obj instanceof zzew)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzev(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzg = this.zza.zzg(i);
            if (zzg.getValue() instanceof zzeh) {
                ((zzeh) zzg.getValue()).zzT();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzdx zzdxVar) {
        int zzc = zzdxVar.zza.zzc();
        for (int i = 0; i < zzc; i++) {
            zzm(zzdxVar.zza.zzg(i));
        }
        Iterator it = zzdxVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzdw zzdwVar, Object obj) {
        boolean z;
        zzdwVar.zzg();
        zzdwVar.zzd();
        byte[] bArr = zzep.zzb;
        obj.getClass();
        zzhf zzhfVar = zzhf.DOUBLE;
        zzhg zzhgVar = zzhg.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zzdf)) {
                    break;
                }
                if (obj instanceof zzew) {
                    this.zzd = true;
                }
                this.zza.put(zzdwVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzew) {
                }
                this.zza.put(zzdwVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzfm)) {
                    break;
                }
                if (obj instanceof zzew) {
                }
                this.zza.put(zzdwVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzdwVar.zza()), zzdwVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int zzc = this.zza.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzdx(boolean z) {
        zzg();
        zzg();
    }
}
