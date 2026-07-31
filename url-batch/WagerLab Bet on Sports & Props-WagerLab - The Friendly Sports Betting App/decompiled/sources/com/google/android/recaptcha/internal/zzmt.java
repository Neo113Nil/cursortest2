package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    public static int zza(zzms zzmsVar, Object obj) {
        int zzd;
        int zzA;
        zzpw zzd2 = zzmsVar.zzd();
        int zza = zzmsVar.zza();
        zzmsVar.zzg();
        int zzA2 = zzln.zzA(zza << 3);
        if (zzd2 == zzpw.GROUP) {
            zzoi zzoiVar = (zzoi) obj;
            byte[] bArr = zznl.zzb;
            if (zzoiVar instanceof zzkp) {
                throw null;
            }
            zzA2 += zzA2;
        }
        zzpx zzpxVar = zzpx.INT;
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
                i = zzln.zzB(((Long) obj).longValue());
                return zzA2 + i;
            case UINT64:
                i = zzln.zzB(((Long) obj).longValue());
                return zzA2 + i;
            case INT32:
                i = zzln.zzB(((Integer) obj).intValue());
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
                if (!(obj instanceof zzle)) {
                    i = zzln.zzz((String) obj);
                    return zzA2 + i;
                }
                zzd = ((zzle) obj).zzd();
                zzA = zzln.zzA(zzd);
                i = zzA + zzd;
                return zzA2 + i;
            case GROUP:
                i = ((zzoi) obj).zzo();
                return zzA2 + i;
            case MESSAGE:
                if (!(obj instanceof zzns)) {
                    i = zzln.zzx((zzoi) obj);
                    return zzA2 + i;
                }
                zzd = ((zzns) obj).zza();
                zzA = zzln.zzA(zzd);
                i = zzA + zzd;
                return zzA2 + i;
            case BYTES:
                if (obj instanceof zzle) {
                    zzd = ((zzle) obj).zzd();
                    zzA = zzln.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzln.zzA(zzd);
                }
                i = zzA + zzd;
                return zzA2 + i;
            case UINT32:
                i = zzln.zzA(((Integer) obj).intValue());
                return zzA2 + i;
            case ENUM:
                i = obj instanceof zznf ? zzln.zzB(((zznf) obj).zza()) : zzln.zzB(((Integer) obj).intValue());
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
                i = zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                return zzA2 + i;
            case SINT64:
                long longValue = ((Long) obj).longValue();
                i = zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                return zzA2 + i;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
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
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzmsVar, zzl(value));
            return;
        }
        Object zze = zze(zzmsVar);
        if (zze == null) {
            this.zza.put(zzmsVar, zzl(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        this.zza.put(zzmsVar, zze instanceof zzon ? zzmsVar.zzc((zzon) zze, (zzon) value) : zzmsVar.zzb(((zzoi) zze).zzae(), (zzoi) value).zzk());
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int zzA;
        int zzA2;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return zza(zzmsVar, value);
        }
        zzmsVar.zzg();
        zzmsVar.zzf();
        if (value instanceof zzns) {
            int zza = ((zzms) entry.getKey()).zza();
            int zzA3 = zzln.zzA(8);
            i = zzA3 + zzA3;
            zzA = zzln.zzA(16) + zzln.zzA(zza);
            int zzA4 = zzln.zzA(24);
            int zza2 = ((zzns) value).zza();
            zzA2 = zzA4 + zzln.zzA(zza2) + zza2;
        } else {
            int zza3 = ((zzms) entry.getKey()).zza();
            int zzA5 = zzln.zzA(8);
            i = zzA5 + zzA5;
            zzA = zzln.zzA(16) + zzln.zzA(zza3);
            zzA2 = zzln.zzA(24) + zzln.zzx((zzoi) value);
        }
        return i + zzA + zzA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmt) {
            return this.zza.equals(((zzmt) obj).zza);
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
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int zzc = this.zza.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzmtVar.zzi((zzms) ((zzpa) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (!(obj instanceof zzns)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = this.zza.zzg(i).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int zzc = zzmtVar.zza.zzc();
        for (int i = 0; i < zzc; i++) {
            zzm(zzmtVar.zza.zzg(i));
        }
        Iterator it = zzmtVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzms zzmsVar, Object obj) {
        boolean z;
        zzmsVar.zzg();
        zzmsVar.zzd();
        byte[] bArr = zznl.zzb;
        obj.getClass();
        zzpw zzpwVar = zzpw.DOUBLE;
        zzpx zzpxVar = zzpx.INT;
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
                if (!(obj instanceof zzle)) {
                    break;
                }
                if (obj instanceof zzns) {
                    this.zzd = true;
                }
                this.zza.put(zzmsVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzns) {
                }
                this.zza.put(zzmsVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzoi)) {
                    break;
                }
                if (obj instanceof zzns) {
                }
                this.zza.put(zzmsVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzmsVar.zza()), zzmsVar.zzd().zza(), obj.getClass().getName()));
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

    private zzmt(boolean z) {
        zzg();
        zzg();
    }
}
