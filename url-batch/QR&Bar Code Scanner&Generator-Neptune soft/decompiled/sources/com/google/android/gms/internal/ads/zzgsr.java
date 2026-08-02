package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgsr<T> implements zzgth<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgui.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgso zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzgsc zzn;
    private final zzgty zzo;
    private final zzgqr zzp;
    private final zzgst zzq;
    private final zzgsj zzr;

    private zzgsr(int[] iArr, Object[] objArr, int i, int i2, zzgso zzgsoVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgst zzgstVar, zzgsc zzgscVar, zzgty zzgtyVar, zzgqr zzgqrVar, zzgsj zzgsjVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgsoVar instanceof zzgre;
        this.zzj = z;
        boolean z3 = false;
        if (zzgqrVar != null && zzgqrVar.zzh(zzgsoVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgstVar;
        this.zzn = zzgscVar;
        this.zzo = zzgtyVar;
        this.zzp = zzgqrVar;
        this.zzg = zzgsoVar;
        this.zzr = zzgsjVar;
    }

    private final int zzA(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzC(int i) {
        return this.zzc[i + 1];
    }

    private static long zzD(Object obj, long j) {
        return ((Long) zzgui.zzh(obj, j)).longValue();
    }

    private final zzgri zzE(int i) {
        int i2 = i / 3;
        return (zzgri) this.zzd[i2 + i2 + 1];
    }

    private final zzgth zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgth zzgthVar = (zzgth) this.zzd[i3];
        if (zzgthVar != null) {
            return zzgthVar;
        }
        zzgth zzb2 = zzgsw.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i, Object obj2, zzgty zzgtyVar) {
        int i2 = this.zzc[i];
        Object zzh = zzgui.zzh(obj, zzC(i) & 1048575);
        if (zzh == null || zzE(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzH(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzI(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        long zzC = zzC(i) & 1048575;
        if (zzQ(obj2, i)) {
            Object zzh = zzgui.zzh(obj, zzC);
            Object zzh2 = zzgui.zzh(obj2, zzC);
            if (zzh != null && zzh2 != null) {
                zzgui.zzv(obj, zzC, zzgro.zzg(zzh, zzh2));
                zzM(obj, i);
            } else if (zzh2 != null) {
                zzgui.zzv(obj, zzC, zzh2);
                zzM(obj, i);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = zzC & 1048575;
        if (zzT(obj2, i2, i)) {
            Object zzh = zzT(obj, i2, i) ? zzgui.zzh(obj, j) : null;
            Object zzh2 = zzgui.zzh(obj2, j);
            if (zzh != null && zzh2 != null) {
                zzgui.zzv(obj, j, zzgro.zzg(zzh, zzh2));
                zzN(obj, i2, i);
            } else if (zzh2 != null) {
                zzgui.zzv(obj, j, zzh2);
                zzN(obj, i2, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzgsz zzgszVar) throws IOException {
        if (zzP(i)) {
            zzgui.zzv(obj, i & 1048575, zzgszVar.zzu());
        } else if (this.zzi) {
            zzgui.zzv(obj, i & 1048575, zzgszVar.zzt());
        } else {
            zzgui.zzv(obj, i & 1048575, zzgszVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzz = zzz(i);
        long j = 1048575 & zzz;
        if (j == 1048575) {
            return;
        }
        zzgui.zzt(obj, j, (1 << (zzz >>> 20)) | zzgui.zzd(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgui.zzt(obj, zzz(i2) & 1048575, i);
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzQ(obj, i) == zzQ(obj2, i);
    }

    private static boolean zzP(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzQ(Object obj, int i) {
        int zzz = zzz(i);
        long j = zzz & 1048575;
        if (j != 1048575) {
            return (zzgui.zzd(obj, j) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i);
        long j2 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzgui.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgui.zzc(obj, j2)) != 0;
            case 2:
                return zzgui.zzf(obj, j2) != 0;
            case 3:
                return zzgui.zzf(obj, j2) != 0;
            case 4:
                return zzgui.zzd(obj, j2) != 0;
            case 5:
                return zzgui.zzf(obj, j2) != 0;
            case 6:
                return zzgui.zzd(obj, j2) != 0;
            case 7:
                return zzgui.zzz(obj, j2);
            case 8:
                Object zzh = zzgui.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgpw) {
                    return !zzgpw.zzb.equals(zzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgui.zzh(obj, j2) != null;
            case 10:
                return !zzgpw.zzb.equals(zzgui.zzh(obj, j2));
            case 11:
                return zzgui.zzd(obj, j2) != 0;
            case 12:
                return zzgui.zzd(obj, j2) != 0;
            case 13:
                return zzgui.zzd(obj, j2) != 0;
            case 14:
                return zzgui.zzf(obj, j2) != 0;
            case 15:
                return zzgui.zzd(obj, j2) != 0;
            case 16:
                return zzgui.zzf(obj, j2) != 0;
            case 17:
                return zzgui.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzQ(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzS(Object obj, int i, zzgth zzgthVar) {
        return zzgthVar.zzk(zzgui.zzh(obj, i & 1048575));
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zzgui.zzd(obj, (long) (zzz(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzgui.zzh(obj, j)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzV(Object obj, zzgqm zzgqmVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int zzC = zzC(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzC & i2;
            switch (zzB) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzf(i6, zzgui.zzb(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzo(i6, zzgui.zzc(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzb(i6, zzgui.zzz(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzX(i6, unsafe.getObject(obj, j), zzgqmVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzv(i6, unsafe.getObject(obj, j), zzF(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzd(i6, (zzgpw) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzgqmVar.zzq(i6, unsafe.getObject(obj, j), zzF(i4));
                        break;
                    }
                case 18:
                    zzgtj.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 19:
                    zzgtj.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 20:
                    zzgtj.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 21:
                    zzgtj.zzaa(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 22:
                    zzgtj.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 23:
                    zzgtj.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 24:
                    zzgtj.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 25:
                    zzgtj.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 26:
                    zzgtj.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar);
                    break;
                case 27:
                    zzgtj.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, zzF(i4));
                    break;
                case 28:
                    zzgtj.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar);
                    break;
                case 29:
                    z = false;
                    zzgtj.zzZ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 30:
                    z = false;
                    zzgtj.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 31:
                    z = false;
                    zzgtj.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 32:
                    z = false;
                    zzgtj.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 33:
                    z = false;
                    zzgtj.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 34:
                    z = false;
                    zzgtj.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, false);
                    break;
                case 35:
                    zzgtj.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 36:
                    zzgtj.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 37:
                    zzgtj.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 38:
                    zzgtj.zzaa(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 39:
                    zzgtj.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 40:
                    zzgtj.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 41:
                    zzgtj.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 42:
                    zzgtj.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 43:
                    zzgtj.zzZ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 44:
                    zzgtj.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 45:
                    zzgtj.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 46:
                    zzgtj.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 47:
                    zzgtj.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 48:
                    zzgtj.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, true);
                    break;
                case 49:
                    zzgtj.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzgqmVar, zzF(i4));
                    break;
                case 50:
                    zzW(zzgqmVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzf(i6, zzo(obj, j));
                    }
                    break;
                case 52:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzo(i6, zzp(obj, j));
                    }
                    break;
                case 53:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzt(i6, zzD(obj, j));
                    }
                    break;
                case 54:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzJ(i6, zzD(obj, j));
                    }
                    break;
                case 55:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzr(i6, zzs(obj, j));
                    }
                    break;
                case 56:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzm(i6, zzD(obj, j));
                    }
                    break;
                case 57:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzk(i6, zzs(obj, j));
                    }
                    break;
                case 58:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzb(i6, zzU(obj, j));
                    }
                    break;
                case 59:
                    if (zzT(obj, i6, i4)) {
                        zzX(i6, unsafe.getObject(obj, j), zzgqmVar);
                    }
                    break;
                case 60:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzv(i6, unsafe.getObject(obj, j), zzF(i4));
                    }
                    break;
                case 61:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzd(i6, (zzgpw) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzH(i6, zzs(obj, j));
                    }
                    break;
                case 63:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzi(i6, zzs(obj, j));
                    }
                    break;
                case 64:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzw(i6, zzs(obj, j));
                    }
                    break;
                case 65:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzy(i6, zzD(obj, j));
                    }
                    break;
                case 66:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzA(i6, zzs(obj, j));
                    }
                    break;
                case 67:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzC(i6, zzD(obj, j));
                    }
                    break;
                case 68:
                    if (zzT(obj, i6, i4)) {
                        zzgqmVar.zzq(i6, unsafe.getObject(obj, j), zzF(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzgty zzgtyVar = this.zzo;
        zzgtyVar.zzr(zzgtyVar.zzd(obj), zzgqmVar);
    }

    private final void zzW(zzgqm zzgqmVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzX(int i, Object obj, zzgqm zzgqmVar) throws IOException {
        if (obj instanceof String) {
            zzgqmVar.zzF(i, (String) obj);
        } else {
            zzgqmVar.zzd(i, (zzgpw) obj);
        }
    }

    static zzgtz zzd(Object obj) {
        zzgre zzgreVar = (zzgre) obj;
        zzgtz zzgtzVar = zzgreVar.zzc;
        if (zzgtzVar != zzgtz.zzc()) {
            return zzgtzVar;
        }
        zzgtz zze = zzgtz.zze();
        zzgreVar.zzc = zze;
        return zze;
    }

    static zzgsr zzl(Class cls, zzgsl zzgslVar, zzgst zzgstVar, zzgsc zzgscVar, zzgty zzgtyVar, zzgqr zzgqrVar, zzgsj zzgsjVar) {
        if (zzgslVar instanceof zzgsy) {
            return zzm((zzgsy) zzgslVar, zzgstVar, zzgscVar, zzgtyVar, zzgqrVar, zzgsjVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzgsr zzm(zzgsy zzgsyVar, zzgst zzgstVar, zzgsc zzgscVar, zzgty zzgtyVar, zzgqr zzgqrVar, zzgsj zzgsjVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        Class<?> cls;
        int i20;
        int i21;
        int i22;
        Field zzI;
        char charAt12;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field zzI2;
        Object obj2;
        Field zzI3;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        char charAt16;
        boolean z = zzgsyVar.zzc() == 2;
        String zzd = zzgsyVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (zzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt16 = zzd.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt17 = i32 | (charAt16 << i33);
            i31 = i29;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt18 = zzd.charAt(i31);
            if (charAt18 >= 55296) {
                int i35 = charAt18 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    charAt11 = zzd.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i35 |= (charAt11 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                charAt18 = i35 | (charAt11 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int charAt19 = zzd.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    charAt10 = zzd.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                charAt19 = i38 | (charAt10 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            charAt = zzd.charAt(i37);
            if (charAt >= 55296) {
                int i41 = charAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    charAt9 = zzd.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                charAt = i41 | (charAt9 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int charAt20 = zzd.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    charAt8 = zzd.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                charAt20 = i44 | (charAt8 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            charAt2 = zzd.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    charAt7 = zzd.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                charAt2 = i47 | (charAt7 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int charAt21 = zzd.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    charAt6 = zzd.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                charAt21 = i50 | (charAt6 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int charAt22 = zzd.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    charAt5 = zzd.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                charAt22 = i53 | (charAt5 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            charAt3 = zzd.charAt(i52);
            if (charAt3 >= 55296) {
                int i56 = charAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    charAt4 = zzd.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                charAt3 = i56 | (charAt4 << i57);
                i55 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i31 = i55;
            int i58 = charAt21;
            i4 = charAt20;
            i5 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzgsyVar.zze();
        Class<?> cls2 = zzgsyVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i59 = charAt3 + i5;
        int i60 = charAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int charAt23 = zzd.charAt(i31);
            if (charAt23 >= c) {
                int i65 = charAt23 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    charAt15 = zzd.charAt(i66);
                    if (charAt15 < c) {
                        break;
                    }
                    i65 |= (charAt15 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                charAt23 = i65 | (charAt15 << i67);
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int charAt24 = zzd.charAt(i14);
            if (charAt24 >= c) {
                int i69 = charAt24 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    charAt14 = zzd.charAt(i70);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i69 |= (charAt14 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                charAt24 = i69 | (charAt14 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = charAt24 & 255;
            int i73 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i75 = charAt25 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        charAt13 = zzd.charAt(i76);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i75 |= (charAt13 & 8191) << i77;
                        i77 += 13;
                        i76 = i26;
                        i4 = i18;
                    }
                    charAt25 = i75 | (charAt13 << i77);
                    i24 = i26;
                } else {
                    i18 = i4;
                    i24 = i74;
                }
                int i78 = i72 - 51;
                i21 = i24;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i62 / 3;
                    i25 = i2 + 1;
                    objArr2[i79 + i79 + 1] = zze[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i62 / 3;
                        i25 = i2 + 1;
                        objArr2[i80 + i80 + 1] = zze[i2];
                    }
                    int i81 = charAt25 + charAt25;
                    obj = zze[i81];
                    if (obj instanceof Field) {
                        zzI2 = zzI(cls2, (String) obj);
                        zze[i81] = zzI2;
                    } else {
                        zzI2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzI2);
                    int i82 = i81 + 1;
                    obj2 = zze[i82];
                    if (obj2 instanceof Field) {
                        zzI3 = zzI(cls2, (String) obj2);
                        zze[i82] = zzI3;
                    } else {
                        zzI3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzI3);
                    str = zzd;
                    cls = cls2;
                    i20 = objectFieldOffset3;
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i22 = 0;
                }
                i2 = i25;
                int i812 = charAt25 + charAt25;
                obj = zze[i812];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzI2);
                int i822 = i812 + 1;
                obj2 = zze[i822];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(zzI3);
                str = zzd;
                cls = cls2;
                i20 = objectFieldOffset32;
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i22 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field zzI4 = zzI(cls2, (String) zze[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i84 = i62 / 3;
                    objArr2[i84 + i84 + 1] = zzI4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i85 = i62 / 3;
                        i23 = i83 + 1;
                        objArr2[i85 + i85 + 1] = zze[i83];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i86 = i62 / 3;
                            i23 = i83 + 1;
                            objArr2[i86 + i86 + 1] = zze[i83];
                        }
                    } else if (i72 == 50) {
                        int i87 = i60 + 1;
                        iArr[i60] = i62;
                        int i88 = i62 / 3;
                        int i89 = i88 + i88;
                        int i90 = i83 + 1;
                        objArr2[i89] = zze[i83];
                        if ((charAt24 & 2048) != 0) {
                            i83 = i90 + 1;
                            objArr2[i89 + 1] = zze[i90];
                            i60 = i87;
                        } else {
                            i60 = i87;
                            i19 = i90;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i72 > 17) {
                                str = zzd;
                                cls = cls2;
                                i20 = 1048575;
                                i21 = i16;
                                i22 = 0;
                            } else {
                                int i91 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i92 = charAt26 & 8191;
                                    int i93 = 13;
                                    while (true) {
                                        i21 = i91 + 1;
                                        charAt12 = zzd.charAt(i91);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i92 |= (charAt12 & 8191) << i93;
                                        i93 += 13;
                                        i91 = i21;
                                    }
                                    charAt26 = i92 | (charAt12 << i93);
                                } else {
                                    i21 = i91;
                                }
                                int i94 = i3 + i3 + (charAt26 / 32);
                                Object obj3 = zze[i94];
                                str = zzd;
                                if (obj3 instanceof Field) {
                                    zzI = (Field) obj3;
                                } else {
                                    zzI = zzI(cls2, (String) obj3);
                                    zze[i94] = zzI;
                                }
                                cls = cls2;
                                i20 = (int) unsafe.objectFieldOffset(zzI);
                                i22 = charAt26 % 32;
                            }
                            if (i72 >= 18 && i72 <= 49) {
                                iArr[i61] = objectFieldOffset;
                                i61++;
                            }
                            i2 = i19;
                        }
                    }
                    i19 = i23;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    cls = cls2;
                    i20 = 1048575;
                    i21 = i16;
                    i22 = 0;
                    if (i72 >= 18) {
                        iArr[i61] = objectFieldOffset;
                        i61++;
                    }
                    i2 = i19;
                }
                i19 = i83;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                cls = cls2;
                i20 = 1048575;
                i21 = i16;
                i22 = 0;
                if (i72 >= 18) {
                }
                i2 = i19;
            }
            int i95 = i62 + 1;
            iArr2[i62] = charAt23;
            int i96 = i95 + 1;
            iArr2[i95] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | objectFieldOffset;
            i62 = i96 + 1;
            iArr2[i96] = i20 | (i22 << 20);
            cls2 = cls;
            charAt = i17;
            charAt3 = i73;
            i31 = i21;
            length = i15;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzgsr(iArr3, objArr2, charAt, i4, zzgsyVar.zza(), z, false, iArr, charAt3, i59, zzgstVar, zzgscVar, zzgtyVar, zzgqrVar, zzgsjVar, null);
    }

    private static double zzo(Object obj, long j) {
        return ((Double) zzgui.zzh(obj, j)).doubleValue();
    }

    private static float zzp(Object obj, long j) {
        return ((Float) zzgui.zzh(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzq(Object obj) {
        int i;
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int i2;
        int zzu;
        boolean z;
        int zzd2;
        int zzi;
        int zzD;
        int zzE8;
        int i3;
        int zzE9;
        int zzE10;
        int zzE11;
        int zzF2;
        int zzE12;
        int zzd3;
        int zzE13;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.zzc.length) {
            int zzC = zzC(i7);
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = zzC & i5;
            switch (zzB) {
                case 0:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgql.zzE(i10 << 3);
                        zzE5 = zzE + 8;
                        i8 += zzE5;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgql.zzE(i10 << 3);
                        zzE5 = zzE2 + 4;
                        i8 += zzE5;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzE3 = zzgql.zzE(i10 << 3);
                        zzF = zzgql.zzF(j2);
                        i8 += zzE3 + zzF;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzE3 = zzgql.zzE(i10 << 3);
                        zzF = zzgql.zzF(j3);
                        i8 += zzE3 + zzF;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzE4 = zzgql.zzE(i10 << 3);
                        zzy = zzgql.zzy(i13);
                        i2 = zzE4 + zzy;
                        i8 += i2;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgql.zzE(i10 << 3);
                        zzE5 = zzE + 8;
                        i8 += zzE5;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgql.zzE(i10 << 3);
                        zzE5 = zzE2 + 4;
                        i8 += zzE5;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE5 = zzgql.zzE(i10 << 3) + 1;
                        i8 += zzE5;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgpw) {
                            zzE6 = zzgql.zzE(i10 << 3);
                            zzd = ((zzgpw) object).zzd();
                            zzE7 = zzgql.zzE(zzd);
                            i2 = zzE6 + zzE7 + zzd;
                            i8 += i2;
                            break;
                        } else {
                            zzE4 = zzgql.zzE(i10 << 3);
                            zzy = zzgql.zzC((String) object);
                            i2 = zzE4 + zzy;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE5 = zzgtj.zzo(i10, unsafe.getObject(obj, j), zzF(i7));
                        i8 += zzE5;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzgpw zzgpwVar = (zzgpw) unsafe.getObject(obj, j);
                        zzE6 = zzgql.zzE(i10 << 3);
                        zzd = zzgpwVar.zzd();
                        zzE7 = zzgql.zzE(zzd);
                        i2 = zzE6 + zzE7 + zzd;
                        i8 += i2;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzE4 = zzgql.zzE(i10 << 3);
                        zzy = zzgql.zzE(i14);
                        i2 = zzE4 + zzy;
                        i8 += i2;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzE4 = zzgql.zzE(i10 << 3);
                        zzy = zzgql.zzy(i15);
                        i2 = zzE4 + zzy;
                        i8 += i2;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgql.zzE(i10 << 3);
                        zzE5 = zzE2 + 4;
                        i8 += zzE5;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgql.zzE(i10 << 3);
                        zzE5 = zzE + 8;
                        i8 += zzE5;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzE4 = zzgql.zzE(i10 << 3);
                        zzy = zzgql.zzE((i16 >> 31) ^ (i16 + i16));
                        i2 = zzE4 + zzy;
                        i8 += i2;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += zzgql.zzE(i10 << 3) + zzgql.zzF((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzE5 = zzgql.zzx(i10, (zzgso) unsafe.getObject(obj, j), zzF(i7));
                        i8 += zzE5;
                        break;
                    }
                case 18:
                    zzE5 = zzgtj.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 19:
                    zzE5 = zzgtj.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 20:
                    zzE5 = zzgtj.zzm(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 21:
                    zzE5 = zzgtj.zzx(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 22:
                    zzE5 = zzgtj.zzk(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 23:
                    zzE5 = zzgtj.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 24:
                    zzE5 = zzgtj.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 25:
                    zzE5 = zzgtj.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzE5;
                    break;
                case 26:
                    zzu = zzgtj.zzu(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case 27:
                    zzu = zzgtj.zzp(i10, (List) unsafe.getObject(obj, j), zzF(i7));
                    i8 += zzu;
                    break;
                case 28:
                    zzu = zzgtj.zzc(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case 29:
                    zzu = zzgtj.zzv(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzu;
                    break;
                case 30:
                    z = false;
                    zzd2 = zzgtj.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 31:
                    z = false;
                    zzd2 = zzgtj.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 32:
                    z = false;
                    zzd2 = zzgtj.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 33:
                    z = false;
                    zzd2 = zzgtj.zzq(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 34:
                    z = false;
                    zzd2 = zzgtj.zzs(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 35:
                    zzi = zzgtj.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 36:
                    zzi = zzgtj.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 37:
                    zzi = zzgtj.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 38:
                    zzi = zzgtj.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 39:
                    zzi = zzgtj.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 40:
                    zzi = zzgtj.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 41:
                    zzi = zzgtj.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 42:
                    zzi = zzgtj.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 43:
                    zzi = zzgtj.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 44:
                    zzi = zzgtj.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 45:
                    zzi = zzgtj.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 46:
                    zzi = zzgtj.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 47:
                    zzi = zzgtj.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 48:
                    zzi = zzgtj.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgql.zzD(i10);
                        zzE8 = zzgql.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 49:
                    zzu = zzgtj.zzj(i10, (List) unsafe.getObject(obj, j), zzF(i7));
                    i8 += zzu;
                    break;
                case 50:
                    zzgsj.zza(i10, unsafe.getObject(obj, j), zzH(i7));
                    break;
                case 51:
                    if (zzT(obj, i10, i7)) {
                        zzE9 = zzgql.zzE(i10 << 3);
                        zzu = zzE9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 52:
                    if (zzT(obj, i10, i7)) {
                        zzE10 = zzgql.zzE(i10 << 3);
                        zzu = zzE10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 53:
                    if (zzT(obj, i10, i7)) {
                        long zzD2 = zzD(obj, j);
                        zzE11 = zzgql.zzE(i10 << 3);
                        zzF2 = zzgql.zzF(zzD2);
                        i8 += zzE11 + zzF2;
                    }
                    break;
                case 54:
                    if (zzT(obj, i10, i7)) {
                        long zzD3 = zzD(obj, j);
                        zzE11 = zzgql.zzE(i10 << 3);
                        zzF2 = zzgql.zzF(zzD3);
                        i8 += zzE11 + zzF2;
                    }
                    break;
                case 55:
                    if (zzT(obj, i10, i7)) {
                        int zzs = zzs(obj, j);
                        i3 = zzgql.zzE(i10 << 3);
                        zzi = zzgql.zzy(zzs);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (zzT(obj, i10, i7)) {
                        zzE9 = zzgql.zzE(i10 << 3);
                        zzu = zzE9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 57:
                    if (zzT(obj, i10, i7)) {
                        zzE10 = zzgql.zzE(i10 << 3);
                        zzu = zzE10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 58:
                    if (zzT(obj, i10, i7)) {
                        zzu = zzgql.zzE(i10 << 3) + 1;
                        i8 += zzu;
                    }
                    break;
                case 59:
                    if (zzT(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgpw) {
                            zzE12 = zzgql.zzE(i10 << 3);
                            zzd3 = ((zzgpw) object2).zzd();
                            zzE13 = zzgql.zzE(zzd3);
                            i4 = zzE12 + zzE13 + zzd3;
                            i8 += i4;
                        } else {
                            i3 = zzgql.zzE(i10 << 3);
                            zzi = zzgql.zzC((String) object2);
                            i4 = i3 + zzi;
                            i8 += i4;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i10, i7)) {
                        zzu = zzgtj.zzo(i10, unsafe.getObject(obj, j), zzF(i7));
                        i8 += zzu;
                    }
                    break;
                case 61:
                    if (zzT(obj, i10, i7)) {
                        zzgpw zzgpwVar2 = (zzgpw) unsafe.getObject(obj, j);
                        zzE12 = zzgql.zzE(i10 << 3);
                        zzd3 = zzgpwVar2.zzd();
                        zzE13 = zzgql.zzE(zzd3);
                        i4 = zzE12 + zzE13 + zzd3;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (zzT(obj, i10, i7)) {
                        int zzs2 = zzs(obj, j);
                        i3 = zzgql.zzE(i10 << 3);
                        zzi = zzgql.zzE(zzs2);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (zzT(obj, i10, i7)) {
                        int zzs3 = zzs(obj, j);
                        i3 = zzgql.zzE(i10 << 3);
                        zzi = zzgql.zzy(zzs3);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (zzT(obj, i10, i7)) {
                        zzE10 = zzgql.zzE(i10 << 3);
                        zzu = zzE10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 65:
                    if (zzT(obj, i10, i7)) {
                        zzE9 = zzgql.zzE(i10 << 3);
                        zzu = zzE9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 66:
                    if (zzT(obj, i10, i7)) {
                        int zzs4 = zzs(obj, j);
                        i3 = zzgql.zzE(i10 << 3);
                        zzi = zzgql.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 67:
                    if (zzT(obj, i10, i7)) {
                        long zzD4 = zzD(obj, j);
                        i8 += zzgql.zzE(i10 << 3) + zzgql.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                    }
                    break;
                case 68:
                    if (zzT(obj, i10, i7)) {
                        zzu = zzgql.zzx(i10, (zzgso) unsafe.getObject(obj, j), zzF(i7));
                        i8 += zzu;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        zzgty zzgtyVar = this.zzo;
        int zza2 = i8 + zzgtyVar.zza(zzgtyVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private final int zzr(Object obj) {
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int zzo;
        int zzD;
        int zzE8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzC = zzC(i3);
            int zzB = zzB(zzC);
            int i4 = this.zzc[i3];
            long j = zzC & 1048575;
            if (zzB >= zzgqw.DOUBLE_LIST_PACKED.zza() && zzB <= zzgqw.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(obj, i3)) {
                        zzE = zzgql.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgql.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj, i3)) {
                        long zzf = zzgui.zzf(obj, j);
                        zzE3 = zzgql.zzE(i4 << 3);
                        zzF = zzgql.zzF(zzf);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj, i3)) {
                        long zzf2 = zzgui.zzf(obj, j);
                        zzE3 = zzgql.zzE(i4 << 3);
                        zzF = zzgql.zzF(zzf2);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj, i3)) {
                        int zzd2 = zzgui.zzd(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzy(zzd2);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj, i3)) {
                        zzE = zzgql.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgql.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj, i3)) {
                        zzE5 = zzgql.zzE(i4 << 3);
                        zzo = zzE5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzQ(obj, i3)) {
                        break;
                    } else {
                        Object zzh = zzgui.zzh(obj, j);
                        if (zzh instanceof zzgpw) {
                            zzE6 = zzgql.zzE(i4 << 3);
                            zzd = ((zzgpw) zzh).zzd();
                            zzE7 = zzgql.zzE(zzd);
                            i = zzE6 + zzE7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzE4 = zzgql.zzE(i4 << 3);
                            zzy = zzgql.zzC((String) zzh);
                            i = zzE4 + zzy;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzQ(obj, i3)) {
                        zzo = zzgtj.zzo(i4, zzgui.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(obj, i3)) {
                        zzgpw zzgpwVar = (zzgpw) zzgui.zzh(obj, j);
                        zzE6 = zzgql.zzE(i4 << 3);
                        zzd = zzgpwVar.zzd();
                        zzE7 = zzgql.zzE(zzd);
                        i = zzE6 + zzE7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj, i3)) {
                        int zzd3 = zzgui.zzd(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzE(zzd3);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj, i3)) {
                        int zzd4 = zzgui.zzd(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzy(zzd4);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgql.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj, i3)) {
                        zzE = zzgql.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj, i3)) {
                        int zzd5 = zzgui.zzd(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzE((zzd5 >> 31) ^ (zzd5 + zzd5));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj, i3)) {
                        long zzf3 = zzgui.zzf(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzF((zzf3 >> 63) ^ (zzf3 + zzf3));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(obj, i3)) {
                        zzo = zzgql.zzx(i4, (zzgso) zzgui.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzgtj.zzh(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzgtj.zzf(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzgtj.zzm(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzgtj.zzx(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzgtj.zzk(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzgtj.zzh(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzgtj.zzf(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 25:
                    zzo = zzgtj.zza(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 26:
                    zzo = zzgtj.zzu(i4, (List) zzgui.zzh(obj, j));
                    i2 += zzo;
                    break;
                case 27:
                    zzo = zzgtj.zzp(i4, (List) zzgui.zzh(obj, j), zzF(i3));
                    i2 += zzo;
                    break;
                case 28:
                    zzo = zzgtj.zzc(i4, (List) zzgui.zzh(obj, j));
                    i2 += zzo;
                    break;
                case 29:
                    zzo = zzgtj.zzv(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 30:
                    zzo = zzgtj.zzd(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 31:
                    zzo = zzgtj.zzf(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzgtj.zzh(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 33:
                    zzo = zzgtj.zzq(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 34:
                    zzo = zzgtj.zzs(i4, (List) zzgui.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 35:
                    zzy = zzgtj.zzi((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzgtj.zzg((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzgtj.zzn((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzgtj.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzgtj.zzl((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzgtj.zzi((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzgtj.zzg((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzy = zzgtj.zzb((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzgtj.zzw((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzgtj.zze((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzgtj.zzg((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzgtj.zzi((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzgtj.zzr((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzgtj.zzt((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgql.zzD(i4);
                        zzE8 = zzgql.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzgtj.zzj(i4, (List) zzgui.zzh(obj, j), zzF(i3));
                    i2 += zzo;
                    break;
                case 50:
                    zzgsj.zza(i4, zzgui.zzh(obj, j), zzH(i3));
                    break;
                case 51:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgql.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgql.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i4, i3)) {
                        long zzD2 = zzD(obj, j);
                        zzE3 = zzgql.zzE(i4 << 3);
                        zzF = zzgql.zzF(zzD2);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i4, i3)) {
                        long zzD3 = zzD(obj, j);
                        zzE3 = zzgql.zzE(i4 << 3);
                        zzF = zzgql.zzF(zzD3);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i4, i3)) {
                        int zzs = zzs(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzy(zzs);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgql.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgql.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i4, i3)) {
                        zzE5 = zzgql.zzE(i4 << 3);
                        zzo = zzE5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzT(obj, i4, i3)) {
                        break;
                    } else {
                        Object zzh2 = zzgui.zzh(obj, j);
                        if (zzh2 instanceof zzgpw) {
                            zzE6 = zzgql.zzE(i4 << 3);
                            zzd = ((zzgpw) zzh2).zzd();
                            zzE7 = zzgql.zzE(zzd);
                            i = zzE6 + zzE7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzE4 = zzgql.zzE(i4 << 3);
                            zzy = zzgql.zzC((String) zzh2);
                            i = zzE4 + zzy;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzT(obj, i4, i3)) {
                        zzo = zzgtj.zzo(i4, zzgui.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i4, i3)) {
                        zzgpw zzgpwVar2 = (zzgpw) zzgui.zzh(obj, j);
                        zzE6 = zzgql.zzE(i4 << 3);
                        zzd = zzgpwVar2.zzd();
                        zzE7 = zzgql.zzE(zzd);
                        i = zzE6 + zzE7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i4, i3)) {
                        int zzs2 = zzs(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzE(zzs2);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i4, i3)) {
                        int zzs3 = zzs(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzy(zzs3);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgql.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgql.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i4, i3)) {
                        int zzs4 = zzs(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i4, i3)) {
                        long zzD4 = zzD(obj, j);
                        zzE4 = zzgql.zzE(i4 << 3);
                        zzy = zzgql.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i4, i3)) {
                        zzo = zzgql.zzx(i4, (zzgso) zzgui.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgty zzgtyVar = this.zzo;
        return i2 + zzgtyVar.zza(zzgtyVar.zzd(obj));
    }

    private static int zzs(Object obj, long j) {
        return ((Integer) zzgui.zzh(obj, j)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgpi zzgpiVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzgsj.zzb(object)) {
            zzgsi zzb2 = zzgsi.zza().zzb();
            zzgsj.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgpi zzgpiVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgpj.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgpj.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzgpj.zzm(bArr, i, zzgpiVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgpiVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzgpj.zzj(bArr, i, zzgpiVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgpiVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzgpj.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzgpj.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzgpj.zzm(bArr, i, zzgpiVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzgpiVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzgpj.zzj(bArr, i, zzgpiVar);
                    int i9 = zzgpiVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzgun.zzj(bArr, zzj2, zzj2 + i9)) {
                            throw zzgrq.zzd();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzgro.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzgpj.zzd(zzF(i8), bArr, i, i2, zzgpiVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzgpiVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzgro.zzg(object, zzgpiVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzgpj.zza(bArr, i, zzgpiVar);
                    unsafe.putObject(obj, j, zzgpiVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzgpj.zzj(bArr, i, zzgpiVar);
                    int i10 = zzgpiVar.zza;
                    zzgri zzE = zzE(i8);
                    if (zzE == null || zzE.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzh(i3, Long.valueOf(i10));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzgpj.zzj(bArr, i, zzgpiVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgqe.zzF(zzgpiVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzgpj.zzm(bArr, i, zzgpiVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgqe.zzG(zzgpiVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzgpj.zzc(zzF(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgpiVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzgpiVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzgro.zzg(object2, zzgpiVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d9, code lost:
    
        if (r0 != r5) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02db, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r10 = r19;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02f1, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0322, code lost:
    
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0345, code lost:
    
        if (r0 != r15) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x008f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzv(Object obj, byte[] bArr, int i, int i2, zzgpi zzgpiVar) throws IOException {
        byte b;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe2;
        int i13;
        int i14;
        Unsafe unsafe3;
        int i15;
        Unsafe unsafe4;
        zzgsr<T> zzgsrVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i16 = i2;
        zzgpi zzgpiVar2 = zzgpiVar;
        Unsafe unsafe5 = zzb;
        int i17 = -1;
        int i18 = 1048575;
        int i19 = i;
        int i20 = 1048575;
        int i21 = -1;
        int i22 = 0;
        int i23 = 0;
        while (i19 < i16) {
            int i24 = i19 + 1;
            byte b2 = bArr2[i19];
            if (b2 < 0) {
                i3 = zzgpj.zzk(b2, bArr2, i24, zzgpiVar2);
                b = zzgpiVar2.zza;
            } else {
                b = b2;
                i3 = i24;
            }
            int i25 = b >>> 3;
            int i26 = b & 7;
            int zzy = i25 > i21 ? zzgsrVar.zzy(i25, i22 / 3) : zzgsrVar.zzx(i25);
            if (zzy == i17) {
                i4 = i3;
                i5 = i25;
                unsafe = unsafe5;
                i6 = i17;
                i7 = 0;
            } else {
                int[] iArr = zzgsrVar.zzc;
                int i27 = iArr[zzy + 1];
                int zzB = zzB(i27);
                Unsafe unsafe6 = unsafe5;
                long j = i27 & i18;
                if (zzB <= 17) {
                    int i28 = iArr[zzy + 2];
                    int i29 = 1 << (i28 >>> 20);
                    int i30 = i28 & 1048575;
                    if (i30 != i20) {
                        i12 = zzy;
                        if (i20 != 1048575) {
                            long j2 = i20;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j2, i23);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i30 != 1048575) {
                            i23 = unsafe4.getInt(obj2, i30);
                        }
                        unsafe2 = unsafe4;
                        i20 = i30;
                    } else {
                        i12 = zzy;
                        unsafe2 = unsafe6;
                    }
                    switch (zzB) {
                        case 0:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            i15 = i3;
                            if (i26 != 1) {
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                zzgui.zzr(obj2, j, Double.longBitsToDouble(zzgpj.zzn(bArr2, i15)));
                                i19 = i15 + 8;
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 1:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            i15 = i3;
                            if (i26 != 5) {
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                zzgui.zzs(obj2, j, Float.intBitsToFloat(zzgpj.zzb(bArr2, i15)));
                                i19 = i15 + 4;
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            i15 = i3;
                            if (i26 != 0) {
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                int zzm = zzgpj.zzm(bArr2, i15, zzgpiVar2);
                                unsafe3.putLong(obj, j, zzgpiVar2.zzb);
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i19 = zzm;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            i15 = i3;
                            if (i26 != 0) {
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                i19 = zzgpj.zzj(bArr2, i15, zzgpiVar2);
                                unsafe3.putInt(obj2, j, zzgpiVar2.zza);
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 1) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                unsafe3.putLong(obj, j, zzgpj.zzn(bArr2, i3));
                                i19 = i3 + 8;
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 5) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j, zzgpj.zzb(bArr2, i3));
                                i19 = i3 + 4;
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 7:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 0) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                i19 = zzgpj.zzm(bArr2, i3, zzgpiVar2);
                                zzgui.zzp(obj2, j, zzgpiVar2.zzb != 0);
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 8:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 2) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                i19 = (i27 & 536870912) == 0 ? zzgpj.zzg(bArr2, i3, zzgpiVar2) : zzgpj.zzh(bArr2, i3, zzgpiVar2);
                                unsafe3.putObject(obj2, j, zzgpiVar2.zzc);
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 9:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 2) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                i19 = zzgpj.zzd(zzgsrVar.zzF(i14), bArr2, i3, i16, zzgpiVar2);
                                Object object = unsafe3.getObject(obj2, j);
                                if (object == null) {
                                    unsafe3.putObject(obj2, j, zzgpiVar2.zzc);
                                } else {
                                    unsafe3.putObject(obj2, j, zzgro.zzg(object, zzgpiVar2.zzc));
                                }
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 10:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 2) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                i19 = zzgpj.zza(bArr2, i3, zzgpiVar2);
                                unsafe3.putObject(obj2, j, zzgpiVar2.zzc);
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 12:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 0) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                i19 = zzgpj.zzj(bArr2, i3, zzgpiVar2);
                                unsafe3.putInt(obj2, j, zzgpiVar2.zza);
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 15:
                            i8 = 1048575;
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            if (i26 != 0) {
                                i15 = i3;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                i19 = zzgpj.zzj(bArr2, i3, zzgpiVar2);
                                unsafe3.putInt(obj2, j, zzgqe.zzF(zzgpiVar2.zza));
                                i23 |= i29;
                                unsafe5 = unsafe3;
                                i22 = i14;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        case 16:
                            if (i26 != 0) {
                                i13 = i20;
                                int i31 = i12;
                                i5 = i25;
                                unsafe3 = unsafe2;
                                i15 = i3;
                                i14 = i31;
                                i4 = i15;
                                unsafe = unsafe3;
                                i7 = i14;
                                i20 = i13;
                                i6 = -1;
                                break;
                            } else {
                                int zzm2 = zzgpj.zzm(bArr2, i3, zzgpiVar2);
                                i13 = i20;
                                int i32 = i12;
                                i5 = i25;
                                i8 = 1048575;
                                unsafe2.putLong(obj, j, zzgqe.zzG(zzgpiVar2.zzb));
                                i23 |= i29;
                                unsafe5 = unsafe2;
                                i22 = i32;
                                i19 = zzm2;
                                i20 = i13;
                                i21 = i5;
                                i18 = i8;
                                i17 = -1;
                                break;
                            }
                        default:
                            i13 = i20;
                            i14 = i12;
                            i5 = i25;
                            unsafe3 = unsafe2;
                            i15 = i3;
                            i4 = i15;
                            unsafe = unsafe3;
                            i7 = i14;
                            i20 = i13;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i25;
                    int i33 = i3;
                    i8 = 1048575;
                    int i34 = i20;
                    if (zzB != 27) {
                        i7 = zzy;
                        if (zzB <= 49) {
                            i10 = i23;
                            i11 = i34;
                            unsafe = unsafe6;
                            i6 = -1;
                            i19 = zzw(obj, bArr, i33, i2, b, i5, i26, i7, i27, zzB, j, zzgpiVar);
                        } else {
                            i9 = i33;
                            i10 = i23;
                            unsafe = unsafe6;
                            i11 = i34;
                            i6 = -1;
                            if (zzB != 50) {
                                i19 = zzu(obj, bArr, i9, i2, b, i5, i26, i27, zzB, j, i7, zzgpiVar);
                            } else if (i26 == 2) {
                                i19 = zzt(obj, bArr, i9, i2, i7, j, zzgpiVar);
                            }
                        }
                        unsafe5 = unsafe;
                        i18 = 1048575;
                    } else if (i26 == 2) {
                        zzgrn zzgrnVar = (zzgrn) unsafe6.getObject(obj2, j);
                        if (!zzgrnVar.zzc()) {
                            int size = zzgrnVar.size();
                            zzgrnVar = zzgrnVar.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, zzgrnVar);
                        }
                        i19 = zzgpj.zze(zzgsrVar.zzF(zzy), b, bArr, i33, i2, zzgrnVar, zzgpiVar);
                        unsafe5 = unsafe6;
                        i23 = i23;
                        i20 = i34;
                        i21 = i5;
                        i22 = zzy;
                        i18 = i8;
                        i17 = -1;
                    } else {
                        i7 = zzy;
                        i9 = i33;
                        i10 = i23;
                        unsafe = unsafe6;
                        i11 = i34;
                        i6 = -1;
                    }
                    i4 = i9;
                    i23 = i10;
                    i20 = i11;
                }
            }
            i19 = zzgpj.zzi(b, bArr, i4, i2, zzd(obj), zzgpiVar);
            zzgsrVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i16 = i2;
            zzgpiVar2 = zzgpiVar;
            i17 = i6;
            i21 = i5;
            i22 = i7;
            unsafe5 = unsafe;
            i18 = 1048575;
        }
        int i35 = i23;
        Unsafe unsafe7 = unsafe5;
        if (i20 != i18) {
            unsafe7.putInt(obj, i20, i35);
        }
        if (i19 == i2) {
            return i19;
        }
        throw zzgrq.zzg();
    }

    private final int zzw(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgpi zzgpiVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12 = i;
        Unsafe unsafe = zzb;
        zzgrn zzgrnVar = (zzgrn) unsafe.getObject(obj, j2);
        if (!zzgrnVar.zzc()) {
            int size = zzgrnVar.size();
            zzgrnVar = zzgrnVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzgrnVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzgqn zzgqnVar = (zzgqn) zzgrnVar;
                    int zzj2 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i13 = zzgpiVar.zza + zzj2;
                    while (zzj2 < i13) {
                        zzgqnVar.zze(Double.longBitsToDouble(zzgpj.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i13) {
                        return zzj2;
                    }
                    throw zzgrq.zzj();
                }
                if (i5 == 1) {
                    zzgqn zzgqnVar2 = (zzgqn) zzgrnVar;
                    zzgqnVar2.zze(Double.longBitsToDouble(zzgpj.zzn(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = zzgpj.zzj(bArr, i8, zzgpiVar);
                            if (i3 == zzgpiVar.zza) {
                                zzgqnVar2.zze(Double.longBitsToDouble(zzgpj.zzn(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzgqx zzgqxVar = (zzgqx) zzgrnVar;
                    int zzj3 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i14 = zzgpiVar.zza + zzj3;
                    while (zzj3 < i14) {
                        zzgqxVar.zze(Float.intBitsToFloat(zzgpj.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i14) {
                        return zzj3;
                    }
                    throw zzgrq.zzj();
                }
                if (i5 == 5) {
                    zzgqx zzgqxVar2 = (zzgqx) zzgrnVar;
                    zzgqxVar2.zze(Float.intBitsToFloat(zzgpj.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = zzgpj.zzj(bArr, i9, zzgpiVar);
                            if (i3 == zzgpiVar.zza) {
                                zzgqxVar2.zze(Float.intBitsToFloat(zzgpj.zzb(bArr, i12)));
                            }
                        }
                    }
                    return i9;
                }
                return i12;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzgsd zzgsdVar = (zzgsd) zzgrnVar;
                    int zzj4 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i15 = zzgpiVar.zza + zzj4;
                    while (zzj4 < i15) {
                        zzj4 = zzgpj.zzm(bArr, zzj4, zzgpiVar);
                        zzgsdVar.zzg(zzgpiVar.zzb);
                    }
                    if (zzj4 == i15) {
                        return zzj4;
                    }
                    throw zzgrq.zzj();
                }
                if (i5 == 0) {
                    zzgsd zzgsdVar2 = (zzgsd) zzgrnVar;
                    int zzm = zzgpj.zzm(bArr, i12, zzgpiVar);
                    zzgsdVar2.zzg(zzgpiVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzgpj.zzj(bArr, zzm, zzgpiVar);
                        if (i3 != zzgpiVar.zza) {
                            return zzm;
                        }
                        zzm = zzgpj.zzm(bArr, zzj5, zzgpiVar);
                        zzgsdVar2.zzg(zzgpiVar.zzb);
                    }
                    return zzm;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzgpj.zzf(bArr, i12, zzgrnVar, zzgpiVar);
                }
                if (i5 == 0) {
                    return zzgpj.zzl(i3, bArr, i, i2, zzgrnVar, zzgpiVar);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzgsd zzgsdVar3 = (zzgsd) zzgrnVar;
                    int zzj6 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i16 = zzgpiVar.zza + zzj6;
                    while (zzj6 < i16) {
                        zzgsdVar3.zzg(zzgpj.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i16) {
                        return zzj6;
                    }
                    throw zzgrq.zzj();
                }
                if (i5 == 1) {
                    zzgsd zzgsdVar4 = (zzgsd) zzgrnVar;
                    zzgsdVar4.zzg(zzgpj.zzn(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = zzgpj.zzj(bArr, i10, zzgpiVar);
                            if (i3 == zzgpiVar.zza) {
                                zzgsdVar4.zzg(zzgpj.zzn(bArr, i12));
                            }
                        }
                    }
                    return i10;
                }
                return i12;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzgrf zzgrfVar = (zzgrf) zzgrnVar;
                    int zzj7 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i17 = zzgpiVar.zza + zzj7;
                    while (zzj7 < i17) {
                        zzgrfVar.zzh(zzgpj.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i17) {
                        return zzj7;
                    }
                    throw zzgrq.zzj();
                }
                if (i5 == 5) {
                    zzgrf zzgrfVar2 = (zzgrf) zzgrnVar;
                    zzgrfVar2.zzh(zzgpj.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = zzgpj.zzj(bArr, i11, zzgpiVar);
                            if (i3 == zzgpiVar.zza) {
                                zzgrfVar2.zzh(zzgpj.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i12;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzgpk zzgpkVar = (zzgpk) zzgrnVar;
                    zzj = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i18 = zzgpiVar.zza + zzj;
                    while (zzj < i18) {
                        zzj = zzgpj.zzm(bArr, zzj, zzgpiVar);
                        zzgpkVar.zze(zzgpiVar.zzb != 0);
                    }
                    if (zzj != i18) {
                        throw zzgrq.zzj();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zzgpk zzgpkVar2 = (zzgpk) zzgrnVar;
                    int zzm2 = zzgpj.zzm(bArr, i12, zzgpiVar);
                    zzgpkVar2.zze(zzgpiVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzgpj.zzj(bArr, zzm2, zzgpiVar);
                        if (i3 != zzgpiVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzgpj.zzm(bArr, zzj8, zzgpiVar);
                        zzgpkVar2.zze(zzgpiVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i12;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzgpj.zzj(bArr, i12, zzgpiVar);
                        int i19 = zzgpiVar.zza;
                        if (i19 < 0) {
                            throw zzgrq.zzf();
                        }
                        if (i19 == 0) {
                            zzgrnVar.add("");
                        } else {
                            zzgrnVar.add(new String(bArr, zzj9, i19, zzgro.zzb));
                            zzj9 += i19;
                        }
                        while (zzj9 < i2) {
                            int zzj10 = zzgpj.zzj(bArr, zzj9, zzgpiVar);
                            if (i3 != zzgpiVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzgpj.zzj(bArr, zzj10, zzgpiVar);
                            int i20 = zzgpiVar.zza;
                            if (i20 < 0) {
                                throw zzgrq.zzf();
                            }
                            if (i20 == 0) {
                                zzgrnVar.add("");
                            } else {
                                zzgrnVar.add(new String(bArr, zzj9, i20, zzgro.zzb));
                                zzj9 += i20;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i21 = zzgpiVar.zza;
                    if (i21 < 0) {
                        throw zzgrq.zzf();
                    }
                    if (i21 == 0) {
                        zzgrnVar.add("");
                    } else {
                        int i22 = zzj11 + i21;
                        if (!zzgun.zzj(bArr, zzj11, i22)) {
                            throw zzgrq.zzd();
                        }
                        zzgrnVar.add(new String(bArr, zzj11, i21, zzgro.zzb));
                        zzj11 = i22;
                    }
                    while (zzj11 < i2) {
                        int zzj12 = zzgpj.zzj(bArr, zzj11, zzgpiVar);
                        if (i3 != zzgpiVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzgpj.zzj(bArr, zzj12, zzgpiVar);
                        int i23 = zzgpiVar.zza;
                        if (i23 < 0) {
                            throw zzgrq.zzf();
                        }
                        if (i23 == 0) {
                            zzgrnVar.add("");
                        } else {
                            int i24 = zzj11 + i23;
                            if (!zzgun.zzj(bArr, zzj11, i24)) {
                                throw zzgrq.zzd();
                            }
                            zzgrnVar.add(new String(bArr, zzj11, i23, zzgro.zzb));
                            zzj11 = i24;
                        }
                    }
                    return zzj11;
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return zzgpj.zze(zzF(i6), i3, bArr, i, i2, zzgrnVar, zzgpiVar);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i25 = zzgpiVar.zza;
                    if (i25 < 0) {
                        throw zzgrq.zzf();
                    }
                    if (i25 > bArr.length - zzj13) {
                        throw zzgrq.zzj();
                    }
                    if (i25 == 0) {
                        zzgrnVar.add(zzgpw.zzb);
                    } else {
                        zzgrnVar.add(zzgpw.zzw(bArr, zzj13, i25));
                        zzj13 += i25;
                    }
                    while (zzj13 < i2) {
                        int zzj14 = zzgpj.zzj(bArr, zzj13, zzgpiVar);
                        if (i3 != zzgpiVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzgpj.zzj(bArr, zzj14, zzgpiVar);
                        int i26 = zzgpiVar.zza;
                        if (i26 < 0) {
                            throw zzgrq.zzf();
                        }
                        if (i26 > bArr.length - zzj13) {
                            throw zzgrq.zzj();
                        }
                        if (i26 == 0) {
                            zzgrnVar.add(zzgpw.zzb);
                        } else {
                            zzgrnVar.add(zzgpw.zzw(bArr, zzj13, i26));
                            zzj13 += i26;
                        }
                    }
                    return zzj13;
                }
                return i12;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzj = zzgpj.zzl(i3, bArr, i, i2, zzgrnVar, zzgpiVar);
                    }
                    return i12;
                }
                zzj = zzgpj.zzf(bArr, i12, zzgrnVar, zzgpiVar);
                zzgre zzgreVar = (zzgre) obj;
                zzgtz zzgtzVar = zzgreVar.zzc;
                if (zzgtzVar == zzgtz.zzc()) {
                    zzgtzVar = null;
                }
                Object zzC = zzgtj.zzC(i4, zzgrnVar, zzE(i6), zzgtzVar, this.zzo);
                if (zzC != null) {
                    zzgreVar.zzc = (zzgtz) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzgrf zzgrfVar3 = (zzgrf) zzgrnVar;
                    int zzj15 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i27 = zzgpiVar.zza + zzj15;
                    while (zzj15 < i27) {
                        zzj15 = zzgpj.zzj(bArr, zzj15, zzgpiVar);
                        zzgrfVar3.zzh(zzgqe.zzF(zzgpiVar.zza));
                    }
                    if (zzj15 == i27) {
                        return zzj15;
                    }
                    throw zzgrq.zzj();
                }
                if (i5 == 0) {
                    zzgrf zzgrfVar4 = (zzgrf) zzgrnVar;
                    int zzj16 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    zzgrfVar4.zzh(zzgqe.zzF(zzgpiVar.zza));
                    while (zzj16 < i2) {
                        int zzj17 = zzgpj.zzj(bArr, zzj16, zzgpiVar);
                        if (i3 != zzgpiVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzgpj.zzj(bArr, zzj17, zzgpiVar);
                        zzgrfVar4.zzh(zzgqe.zzF(zzgpiVar.zza));
                    }
                    return zzj16;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzgsd zzgsdVar5 = (zzgsd) zzgrnVar;
                    int zzj18 = zzgpj.zzj(bArr, i12, zzgpiVar);
                    int i28 = zzgpiVar.zza + zzj18;
                    while (zzj18 < i28) {
                        zzj18 = zzgpj.zzm(bArr, zzj18, zzgpiVar);
                        zzgsdVar5.zzg(zzgqe.zzG(zzgpiVar.zzb));
                    }
                    if (zzj18 == i28) {
                        return zzj18;
                    }
                    throw zzgrq.zzj();
                }
                if (i5 == 0) {
                    zzgsd zzgsdVar6 = (zzgsd) zzgrnVar;
                    int zzm3 = zzgpj.zzm(bArr, i12, zzgpiVar);
                    zzgsdVar6.zzg(zzgqe.zzG(zzgpiVar.zzb));
                    while (zzm3 < i2) {
                        int zzj19 = zzgpj.zzj(bArr, zzm3, zzgpiVar);
                        if (i3 != zzgpiVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzgpj.zzm(bArr, zzj19, zzgpiVar);
                        zzgsdVar6.zzg(zzgqe.zzG(zzgpiVar.zzb));
                    }
                    return zzm3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    zzgth zzF = zzF(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = zzgpj.zzc(zzF, bArr, i, i2, i29, zzgpiVar);
                    zzgrnVar.add(zzgpiVar.zzc);
                    while (zzc < i2) {
                        int zzj20 = zzgpj.zzj(bArr, zzc, zzgpiVar);
                        if (i3 != zzgpiVar.zza) {
                            return zzc;
                        }
                        zzc = zzgpj.zzc(zzF, bArr, zzj20, i2, i29, zzgpiVar);
                        zzgrnVar.add(zzgpiVar.zzc);
                    }
                    return zzc;
                }
                return i12;
        }
    }

    private final int zzx(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, 0);
    }

    private final int zzy(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, i2);
    }

    private final int zzz(int i) {
        return this.zzc[i + 2];
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzC = zzC(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzC;
            int i5 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzgro.zzc(Double.doubleToLongBits(zzgui.zzb(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzgui.zzc(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzgro.zzc(zzgui.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzgro.zzc(zzgui.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzgui.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzgro.zzc(zzgui.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzgui.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzgro.zza(zzgui.zzz(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzgui.zzh(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzh = zzgui.zzh(obj, j);
                    if (zzh != null) {
                        i5 = zzh.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzgui.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzgui.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzgui.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzgui.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzgro.zzc(zzgui.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzgui.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzgro.zzc(zzgui.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzh2 = zzgui.zzh(obj, j);
                    if (zzh2 != null) {
                        i5 = zzh2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzc = zzgui.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzgui.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgro.zzc(Double.doubleToLongBits(zzo(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzp(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgro.zzc(zzD(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgro.zzc(zzD(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgro.zzc(zzD(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgro.zza(zzU(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzgui.zzh(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgui.zzh(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgui.zzh(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgro.zzc(zzD(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzs(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgro.zzc(zzD(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgui.zzh(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzo.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0448, code lost:
    
        if (r6 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x044a, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0450, code lost:
    
        r3 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0454, code lost:
    
        if (r3 >= r9.zzm) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0456, code lost:
    
        r9.zzG(r12, r9.zzk[r3], r2, r9.zzo);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0462, code lost:
    
        if (r7 != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0466, code lost:
    
        if (r0 != r32) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x046d, code lost:
    
        throw com.google.android.gms.internal.ads.zzgrq.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0474, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0470, code lost:
    
        if (r0 > r32) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0472, code lost:
    
        if (r1 != r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0479, code lost:
    
        throw com.google.android.gms.internal.ads.zzgrq.zzg();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgpi zzgpiVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzgsr<T> zzgsrVar;
        Object obj3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj4;
        zzgpi zzgpiVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzm;
        int i20;
        int i21;
        int i22;
        int i23;
        zzgsr<T> zzgsrVar2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        zzgpi zzgpiVar3 = zzgpiVar;
        Unsafe unsafe2 = zzb;
        int i26 = i;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 1048575;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b = bArr2[i26];
                if (b < 0) {
                    i7 = zzgpj.zzk(b, bArr2, i32, zzgpiVar3);
                    i6 = zzgpiVar3.zza;
                } else {
                    i6 = b;
                    i7 = i32;
                }
                int i33 = i6 >>> 3;
                int i34 = i6 & 7;
                int zzy = i33 > i30 ? zzgsrVar2.zzy(i33, i28 / 3) : zzgsrVar2.zzx(i33);
                if (zzy == -1) {
                    i8 = i7;
                    i9 = i6;
                    i10 = i29;
                    i11 = i33;
                    unsafe = unsafe2;
                    i4 = i25;
                    i12 = 0;
                } else {
                    int[] iArr = zzgsrVar2.zzc;
                    int i35 = iArr[zzy + 1];
                    int zzB = zzB(i35);
                    int i36 = i6;
                    int i37 = i7;
                    long j = i35 & 1048575;
                    if (zzB <= 17) {
                        int i38 = iArr[zzy + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i31) {
                            i14 = zzy;
                            if (i31 != 1048575) {
                                unsafe2.putInt(obj5, i31, i29);
                            }
                            i29 = unsafe2.getInt(obj5, i40);
                            i15 = i40;
                        } else {
                            i14 = zzy;
                            i15 = i31;
                        }
                        int i41 = i29;
                        switch (zzB) {
                            case 0:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 1) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzgui.zzr(obj5, j, Double.longBitsToDouble(zzgpj.zzn(bArr2, i17)));
                                    i26 = i17 + 8;
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 1:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 5) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzgui.zzs(obj5, j, Float.intBitsToFloat(zzgpj.zzb(bArr2, i17)));
                                    i26 = i17 + 4;
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 2:
                            case 3:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzm = zzgpj.zzm(bArr2, i17, zzgpiVar3);
                                    unsafe2.putLong(obj, j, zzgpiVar3.zzb);
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i26 = zzm;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 4:
                            case 11:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgpj.zzj(bArr2, i17, zzgpiVar3);
                                    unsafe2.putInt(obj5, j, zzgpiVar3.zza);
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 5:
                            case 14:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 1) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j, zzgpj.zzn(bArr2, i20));
                                    i26 = i20 + 8;
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 6:
                            case 13:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 5) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(obj5, j, zzgpj.zzb(bArr2, i20));
                                    i26 = i20 + 4;
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 7:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgpj.zzm(bArr2, i20, zzgpiVar3);
                                    zzgui.zzp(obj5, j, zzgpiVar3.zzb != 0);
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 8:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = (536870912 & i35) == 0 ? zzgpj.zzg(bArr2, i20, zzgpiVar3) : zzgpj.zzh(bArr2, i20, zzgpiVar3);
                                    unsafe2.putObject(obj5, j, zzgpiVar3.zzc);
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 9:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgpj.zzd(zzgsrVar2.zzF(i19), bArr2, i20, i24, zzgpiVar3);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj5, j, zzgpiVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzgro.zzg(unsafe2.getObject(obj5, j), zzgpiVar3.zzc));
                                    }
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 10:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgpj.zza(bArr2, i20, zzgpiVar3);
                                    unsafe2.putObject(obj5, j, zzgpiVar3.zzc);
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 12:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgpj.zzj(bArr2, i20, zzgpiVar3);
                                    int i42 = zzgpiVar3.zza;
                                    zzgri zzE = zzgsrVar2.zzE(i19);
                                    if (zzE == null || zzE.zza(i42)) {
                                        unsafe2.putInt(obj5, j, i42);
                                        i29 = i41 | i39;
                                        i28 = i19;
                                        i27 = i16;
                                        i30 = i18;
                                        i31 = i15;
                                        i25 = i3;
                                    } else {
                                        zzd(obj).zzh(i16, Long.valueOf(i42));
                                        i29 = i41;
                                        i28 = i19;
                                        i27 = i16;
                                        i30 = i18;
                                        i31 = i15;
                                        i25 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgpj.zzj(bArr2, i20, zzgpiVar3);
                                    unsafe2.putInt(obj5, j, zzgqe.zzF(zzgpiVar3.zza));
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 16:
                                if (i34 != 0) {
                                    i16 = i36;
                                    i18 = i33;
                                    i19 = i14;
                                    i17 = i37;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzm = zzgpj.zzm(bArr2, i37, zzgpiVar3);
                                    i16 = i36;
                                    i18 = i33;
                                    i19 = i14;
                                    unsafe2.putLong(obj, j, zzgqe.zzG(zzgpiVar3.zzb));
                                    i29 = i41 | i39;
                                    i28 = i19;
                                    i26 = zzm;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            default:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 3) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgpj.zzc(zzgsrVar2.zzF(i19), bArr, i17, i2, (i18 << 3) | 4, zzgpiVar);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj5, j, zzgpiVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzgro.zzg(unsafe2.getObject(obj5, j), zzgpiVar3.zzc));
                                    }
                                    i29 = i41 | i39;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i28 = i19;
                                    i27 = i16;
                                    i30 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                        }
                    } else {
                        int i43 = zzy;
                        if (zzB != 27) {
                            i10 = i29;
                            i21 = i31;
                            if (zzB <= 49) {
                                i23 = i36;
                                i12 = i43;
                                i11 = i33;
                                unsafe = unsafe2;
                                i26 = zzw(obj, bArr, i37, i2, i36, i33, i34, i12, i35, zzB, j, zzgpiVar);
                                if (i26 != i37) {
                                    zzgsrVar2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i27 = i23;
                                    i24 = i2;
                                    i25 = i3;
                                    zzgpiVar3 = zzgpiVar;
                                    i28 = i12;
                                    i29 = i10;
                                    i30 = i11;
                                    i31 = i21;
                                    unsafe2 = unsafe;
                                } else {
                                    i9 = i23;
                                    i4 = i3;
                                    i8 = i26;
                                    i31 = i21;
                                }
                            } else {
                                i22 = i37;
                                i23 = i36;
                                i12 = i43;
                                unsafe = unsafe2;
                                i11 = i33;
                                if (zzB != 50) {
                                    i26 = zzu(obj, bArr, i22, i2, i23, i11, i34, i35, zzB, j, i12, zzgpiVar);
                                    if (i26 != i22) {
                                        zzgsrVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i23;
                                        i24 = i2;
                                        i25 = i3;
                                        zzgpiVar3 = zzgpiVar;
                                        i28 = i12;
                                        i29 = i10;
                                        i30 = i11;
                                        i31 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i9 = i23;
                                        i4 = i3;
                                        i8 = i26;
                                        i31 = i21;
                                    }
                                } else if (i34 == 2) {
                                    i26 = zzt(obj, bArr, i22, i2, i12, j, zzgpiVar);
                                    if (i26 != i22) {
                                        zzgsrVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i23;
                                        i24 = i2;
                                        i25 = i3;
                                        zzgpiVar3 = zzgpiVar;
                                        i28 = i12;
                                        i29 = i10;
                                        i30 = i11;
                                        i31 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i9 = i23;
                                        i4 = i3;
                                        i8 = i26;
                                        i31 = i21;
                                    }
                                }
                            }
                        } else if (i34 == 2) {
                            zzgrn zzgrnVar = (zzgrn) unsafe2.getObject(obj5, j);
                            if (!zzgrnVar.zzc()) {
                                int size = zzgrnVar.size();
                                zzgrnVar = zzgrnVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j, zzgrnVar);
                            }
                            i15 = i31;
                            i26 = zzgpj.zze(zzgsrVar2.zzF(i43), i36, bArr, i37, i2, zzgrnVar, zzgpiVar);
                            bArr2 = bArr;
                            i24 = i2;
                            i28 = i43;
                            i27 = i36;
                            i30 = i33;
                            i29 = i29;
                            i31 = i15;
                            i25 = i3;
                        } else {
                            i10 = i29;
                            i21 = i31;
                            i22 = i37;
                            i23 = i36;
                            i12 = i43;
                            unsafe = unsafe2;
                            i11 = i33;
                        }
                        i9 = i23;
                        i4 = i3;
                        i8 = i22;
                        i31 = i21;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzgpiVar2 = zzgpiVar;
                        if (zzgpiVar2.zzd != zzgqq.zza()) {
                            i13 = i11;
                            if (zzgpiVar2.zzd.zzc(this.zzg, i13) != null) {
                                throw null;
                            }
                            i26 = zzgpj.zzi(i9, bArr, i8, i2, zzd(obj), zzgpiVar);
                            obj4 = obj;
                            i24 = i2;
                            i27 = i9;
                            zzgsrVar2 = this;
                            zzgpiVar3 = zzgpiVar2;
                            i30 = i13;
                            obj5 = obj4;
                            i28 = i12;
                            i29 = i10;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i25 = i4;
                        } else {
                            obj4 = obj;
                        }
                    } else {
                        obj4 = obj;
                        zzgpiVar2 = zzgpiVar;
                    }
                    i13 = i11;
                    i26 = zzgpj.zzi(i9, bArr, i8, i2, zzd(obj), zzgpiVar);
                    i24 = i2;
                    i27 = i9;
                    zzgsrVar2 = this;
                    zzgpiVar3 = zzgpiVar2;
                    i30 = i13;
                    obj5 = obj4;
                    i28 = i12;
                    i29 = i10;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i25 = i4;
                } else {
                    i5 = 1048575;
                    zzgsrVar = this;
                    obj2 = obj;
                    i26 = i8;
                    i27 = i9;
                    i29 = i10;
                    obj3 = null;
                }
            } else {
                unsafe = unsafe2;
                i4 = i25;
                obj2 = obj5;
                zzgsrVar = zzgsrVar2;
                obj3 = null;
                i5 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final Object zze() {
        return ((zzgre) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = zzC(this.zzk[i2]) & 1048575;
            Object zzh = zzgui.zzh(obj, zzC);
            if (zzh != null) {
                ((zzgsi) zzh).zzc();
                zzgui.zzv(obj, zzC, zzh);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(obj, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzh(Object obj, zzgsz zzgszVar, zzgqq zzgqqVar) throws IOException {
        Objects.requireNonNull(zzgqqVar);
        zzgty zzgtyVar = this.zzo;
        zzgqr zzgqrVar = this.zzp;
        zzgqv zzgqvVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzgszVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzgui.zzr(obj, zzC & 1048575, zzgszVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzgui.zzs(obj, zzC & 1048575, zzgszVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzgui.zzu(obj, zzC & 1048575, zzgszVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzgui.zzu(obj, zzC & 1048575, zzgszVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzgui.zzt(obj, zzC & 1048575, zzgszVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzgui.zzu(obj, zzC & 1048575, zzgszVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzgui.zzt(obj, zzC & 1048575, zzgszVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzgui.zzp(obj, zzC & 1048575, zzgszVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzgszVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzQ(obj, zzx)) {
                                    long j = zzC & 1048575;
                                    zzgui.zzv(obj, j, zzgro.zzg(zzgui.zzh(obj, j), zzgszVar.zzs(zzF(zzx), zzgqqVar)));
                                    break;
                                } else {
                                    zzgui.zzv(obj, zzC & 1048575, zzgszVar.zzs(zzF(zzx), zzgqqVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzgui.zzv(obj, zzC & 1048575, zzgszVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzgui.zzt(obj, zzC & 1048575, zzgszVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzgszVar.zze();
                                zzgri zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzgtj.zzD(zzc, zze, obj2, zzgtyVar);
                                    break;
                                }
                                zzgui.zzt(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzgui.zzt(obj, zzC & 1048575, zzgszVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzgui.zzu(obj, zzC & 1048575, zzgszVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzgui.zzt(obj, zzC & 1048575, zzgszVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzgui.zzu(obj, zzC & 1048575, zzgszVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzQ(obj, zzx)) {
                                    long j2 = zzC & 1048575;
                                    zzgui.zzv(obj, j2, zzgro.zzg(zzgui.zzh(obj, j2), zzgszVar.zzr(zzF(zzx), zzgqqVar)));
                                    break;
                                } else {
                                    zzgui.zzv(obj, zzC & 1048575, zzgszVar.zzr(zzF(zzx), zzgqqVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzgszVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzgszVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzgszVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzgszVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzgszVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzgszVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzgszVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzgszVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    ((zzgqf) zzgszVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzgqf) zzgszVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzgszVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgqqVar);
                                break;
                            case 28:
                                zzgszVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzgszVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzgszVar.zzy(zza2);
                                obj2 = zzgtj.zzC(zzc, zza2, zzE(zzx), obj2, zzgtyVar);
                                break;
                            case 31:
                                zzgszVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzgszVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzgszVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzgszVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzgszVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzgszVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzgszVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzgszVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzgszVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzgszVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzgszVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzgszVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzgszVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzgszVar.zzy(zza3);
                                obj2 = zzgtj.zzC(zzc, zza3, zzE(zzx), obj2, zzgtyVar);
                                break;
                            case 45:
                                zzgszVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzgszVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzgszVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzgszVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzgszVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgqqVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzh = zzgui.zzh(obj, zzC2);
                                if (zzh == null) {
                                    zzh = zzgsi.zza().zzb();
                                    zzgui.zzv(obj, zzC2, zzh);
                                } else if (zzgsj.zzb(zzh)) {
                                    Object zzb2 = zzgsi.zza().zzb();
                                    zzgsj.zzc(zzb2, zzh);
                                    zzgui.zzv(obj, zzC2, zzb2);
                                    zzh = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzgui.zzv(obj, zzC & 1048575, Double.valueOf(zzgszVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzgui.zzv(obj, zzC & 1048575, Float.valueOf(zzgszVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzgui.zzv(obj, zzC & 1048575, Long.valueOf(zzgszVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzgui.zzv(obj, zzC & 1048575, Long.valueOf(zzgszVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 55:
                                zzgui.zzv(obj, zzC & 1048575, Integer.valueOf(zzgszVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzgui.zzv(obj, zzC & 1048575, Long.valueOf(zzgszVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzgui.zzv(obj, zzC & 1048575, Integer.valueOf(zzgszVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzgui.zzv(obj, zzC & 1048575, Boolean.valueOf(zzgszVar.zzN()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzgszVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(obj, zzc, zzx)) {
                                    long j3 = zzC & 1048575;
                                    zzgui.zzv(obj, j3, zzgro.zzg(zzgui.zzh(obj, j3), zzgszVar.zzs(zzF(zzx), zzgqqVar)));
                                } else {
                                    zzgui.zzv(obj, zzC & 1048575, zzgszVar.zzs(zzF(zzx), zzgqqVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case 61:
                                zzgui.zzv(obj, zzC & 1048575, zzgszVar.zzp());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzgui.zzv(obj, zzC & 1048575, Integer.valueOf(zzgszVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzgszVar.zze();
                                zzgri zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzgtj.zzD(zzc, zze2, obj2, zzgtyVar);
                                    break;
                                }
                                zzgui.zzv(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzgui.zzv(obj, zzC & 1048575, Integer.valueOf(zzgszVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzgui.zzv(obj, zzC & 1048575, Long.valueOf(zzgszVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzgui.zzv(obj, zzC & 1048575, Integer.valueOf(zzgszVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 67:
                                zzgui.zzv(obj, zzC & 1048575, Long.valueOf(zzgszVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzgui.zzv(obj, zzC & 1048575, zzgszVar.zzr(zzF(zzx), zzgqqVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzgtyVar.zzf();
                                }
                                if (!zzgtyVar.zzp(obj2, zzgszVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        obj2 = zzG(obj, this.zzk[i], obj2, zzgtyVar);
                                    }
                                    if (obj2 != null) {
                                        zzgtyVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzgrp unused) {
                        zzgtyVar.zzq(zzgszVar);
                        if (obj2 == null) {
                            obj2 = zzgtyVar.zzc(obj);
                        }
                        if (!zzgtyVar.zzp(obj2, zzgszVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                obj2 = zzG(obj, this.zzk[i2], obj2, zzgtyVar);
                            }
                            if (obj2 != null) {
                                zzgtyVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                            obj2 = zzG(obj, this.zzk[i3], obj2, zzgtyVar);
                        }
                        if (obj2 != null) {
                            zzgtyVar.zzn(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object zzc2 = !this.zzh ? null : zzgqrVar.zzc(zzgqqVar, this.zzg, zzc);
                    if (zzc2 != null) {
                        if (zzgqvVar == null) {
                            zzgqvVar = zzgqrVar.zzb(obj);
                        }
                        zzgqv zzgqvVar2 = zzgqvVar;
                        obj2 = zzgqrVar.zzd(zzgszVar, zzc2, zzgqqVar, zzgqvVar2, obj2, zzgtyVar);
                        zzgqvVar = zzgqvVar2;
                    } else {
                        zzgtyVar.zzq(zzgszVar);
                        if (obj2 == null) {
                            obj2 = zzgtyVar.zzc(obj);
                        }
                        if (!zzgtyVar.zzp(obj2, zzgszVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                obj2 = zzG(obj, this.zzk[i4], obj2, zzgtyVar);
                            }
                            if (obj2 != null) {
                                zzgtyVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    obj2 = zzG(obj, this.zzk[i5], obj2, zzgtyVar);
                }
                if (obj2 != null) {
                    zzgtyVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgpi zzgpiVar) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i, i2, zzgpiVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzgpiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzgui.zzb(obj, j)) == Double.doubleToLongBits(zzgui.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzgui.zzc(obj, j)) == Float.floatToIntBits(zzgui.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzgui.zzf(obj, j) == zzgui.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzgui.zzf(obj, j) == zzgui.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzgui.zzd(obj, j) == zzgui.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzgui.zzf(obj, j) == zzgui.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzgui.zzd(obj, j) == zzgui.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzgui.zzz(obj, j) == zzgui.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzgtj.zzH(zzgui.zzh(obj, j), zzgui.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzgtj.zzH(zzgui.zzh(obj, j), zzgui.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzgtj.zzH(zzgui.zzh(obj, j), zzgui.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzgui.zzd(obj, j) == zzgui.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzgui.zzd(obj, j) == zzgui.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzgui.zzd(obj, j) == zzgui.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzgui.zzf(obj, j) == zzgui.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzgui.zzd(obj, j) == zzgui.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzgui.zzf(obj, j) == zzgui.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzgtj.zzH(zzgui.zzh(obj, j), zzgui.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzH = zzgtj.zzH(zzgui.zzh(obj, j), zzgui.zzh(obj2, j));
                    break;
                case 50:
                    zzH = zzgtj.zzH(zzgui.zzh(obj, j), zzgui.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzz = zzz(i) & 1048575;
                    if (zzgui.zzd(obj, zzz) == zzgui.zzd(obj2, zzz) && zzgtj.zzH(zzgui.zzh(obj, j), zzgui.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzC = zzC(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzC) != 0 && !zzR(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(obj, i7, i6) && !zzS(obj, zzC, zzF(i6))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzgsi) zzgui.zzh(obj, zzC & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzgui.zzh(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgth zzF = zzF(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzF.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzR(obj, i6, i, i2, i10) && !zzS(obj, zzC, zzF(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzn(Object obj, zzgqm zzgqmVar) throws IOException {
        if (!this.zzj) {
            zzV(obj, zzgqmVar);
            return;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzf(i2, zzgui.zzb(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzo(i2, zzgui.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzt(i2, zzgui.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzJ(i2, zzgui.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzr(i2, zzgui.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzm(i2, zzgui.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzk(i2, zzgui.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzb(i2, zzgui.zzz(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj, i)) {
                        zzX(i2, zzgui.zzh(obj, zzC & 1048575), zzgqmVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzv(i2, zzgui.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzd(i2, (zzgpw) zzgui.zzh(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzH(i2, zzgui.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzi(i2, zzgui.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzw(i2, zzgui.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzy(i2, zzgui.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzA(i2, zzgui.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzC(i2, zzgui.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(obj, i)) {
                        zzgqmVar.zzq(i2, zzgui.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzgtj.zzL(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 19:
                    zzgtj.zzP(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 20:
                    zzgtj.zzS(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 21:
                    zzgtj.zzaa(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 22:
                    zzgtj.zzR(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 23:
                    zzgtj.zzO(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 24:
                    zzgtj.zzN(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 25:
                    zzgtj.zzJ(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 26:
                    zzgtj.zzY(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar);
                    break;
                case 27:
                    zzgtj.zzT(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, zzF(i));
                    break;
                case 28:
                    zzgtj.zzK(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar);
                    break;
                case 29:
                    zzgtj.zzZ(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 30:
                    zzgtj.zzM(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 31:
                    zzgtj.zzU(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 32:
                    zzgtj.zzV(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 33:
                    zzgtj.zzW(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 34:
                    zzgtj.zzX(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, false);
                    break;
                case 35:
                    zzgtj.zzL(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 36:
                    zzgtj.zzP(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 37:
                    zzgtj.zzS(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 38:
                    zzgtj.zzaa(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 39:
                    zzgtj.zzR(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 40:
                    zzgtj.zzO(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 41:
                    zzgtj.zzN(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 42:
                    zzgtj.zzJ(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 43:
                    zzgtj.zzZ(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 44:
                    zzgtj.zzM(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 45:
                    zzgtj.zzU(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 46:
                    zzgtj.zzV(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 47:
                    zzgtj.zzW(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 48:
                    zzgtj.zzX(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, true);
                    break;
                case 49:
                    zzgtj.zzQ(i2, (List) zzgui.zzh(obj, zzC & 1048575), zzgqmVar, zzF(i));
                    break;
                case 50:
                    zzW(zzgqmVar, i2, zzgui.zzh(obj, zzC & 1048575), i);
                    break;
                case 51:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzf(i2, zzo(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzo(i2, zzp(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzt(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzJ(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzr(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzm(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzk(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzb(i2, zzU(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i2, i)) {
                        zzX(i2, zzgui.zzh(obj, zzC & 1048575), zzgqmVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzv(i2, zzgui.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzd(i2, (zzgpw) zzgui.zzh(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzH(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzi(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzw(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzy(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzA(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzC(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i2, i)) {
                        zzgqmVar.zzq(i2, zzgui.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgty zzgtyVar = this.zzo;
        zzgtyVar.zzr(zzgtyVar.zzd(obj), zzgqmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j = 1048575 & zzC;
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj2, i)) {
                        zzgui.zzr(obj, j, zzgui.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj2, i)) {
                        zzgui.zzs(obj, j, zzgui.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj2, i)) {
                        zzgui.zzu(obj, j, zzgui.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj2, i)) {
                        zzgui.zzu(obj, j, zzgui.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj2, i)) {
                        zzgui.zzt(obj, j, zzgui.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj2, i)) {
                        zzgui.zzu(obj, j, zzgui.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj2, i)) {
                        zzgui.zzt(obj, j, zzgui.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj2, i)) {
                        zzgui.zzp(obj, j, zzgui.zzz(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj2, i)) {
                        zzgui.zzv(obj, j, zzgui.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzQ(obj2, i)) {
                        zzgui.zzv(obj, j, zzgui.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj2, i)) {
                        zzgui.zzt(obj, j, zzgui.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj2, i)) {
                        zzgui.zzt(obj, j, zzgui.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj2, i)) {
                        zzgui.zzt(obj, j, zzgui.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj2, i)) {
                        zzgui.zzu(obj, j, zzgui.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj2, i)) {
                        zzgui.zzt(obj, j, zzgui.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj2, i)) {
                        zzgui.zzu(obj, j, zzgui.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzgtj.zzI(this.zzr, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i2, i)) {
                        zzgui.zzv(obj, j, zzgui.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i2, i)) {
                        zzgui.zzv(obj, j, zzgui.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzgtj.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgtj.zzE(this.zzp, obj, obj2);
        }
    }
}
