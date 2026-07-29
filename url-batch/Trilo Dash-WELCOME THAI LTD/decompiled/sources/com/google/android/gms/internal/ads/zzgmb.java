package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgmb<T> implements zzgmr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgns.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgly zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzglm zzn;
    private final zzgni zzo;
    private final zzgkb zzp;
    private final zzgmd zzq;
    private final zzglt zzr;

    private zzgmb(int[] iArr, Object[] objArr, int i, int i2, zzgly zzglyVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgmd zzgmdVar, zzglm zzglmVar, zzgni zzgniVar, zzgkb zzgkbVar, zzglt zzgltVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzglyVar instanceof zzgko;
        this.zzj = z;
        boolean z3 = false;
        if (zzgkbVar != null && zzgkbVar.zzh(zzglyVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgmdVar;
        this.zzn = zzglmVar;
        this.zzo = zzgniVar;
        this.zzp = zzgkbVar;
        this.zzg = zzglyVar;
        this.zzr = zzgltVar;
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
        return ((Long) zzgns.zzh(obj, j)).longValue();
    }

    private final zzgks zzE(int i) {
        int i2 = i / 3;
        return (zzgks) this.zzd[i2 + i2 + 1];
    }

    private final zzgmr zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgmr zzgmrVar = (zzgmr) this.zzd[i3];
        if (zzgmrVar != null) {
            return zzgmrVar;
        }
        zzgmr zzb2 = zzgmg.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i, Object obj2, zzgni zzgniVar) {
        int i2 = this.zzc[i];
        Object zzh = zzgns.zzh(obj, zzC(i) & 1048575);
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
            Object zzh = zzgns.zzh(obj, zzC);
            Object zzh2 = zzgns.zzh(obj2, zzC);
            if (zzh != null && zzh2 != null) {
                zzgns.zzv(obj, zzC, zzgky.zzg(zzh, zzh2));
                zzM(obj, i);
            } else if (zzh2 != null) {
                zzgns.zzv(obj, zzC, zzh2);
                zzM(obj, i);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = zzC & 1048575;
        if (zzT(obj2, i2, i)) {
            Object zzh = zzT(obj, i2, i) ? zzgns.zzh(obj, j) : null;
            Object zzh2 = zzgns.zzh(obj2, j);
            if (zzh != null && zzh2 != null) {
                zzgns.zzv(obj, j, zzgky.zzg(zzh, zzh2));
                zzN(obj, i2, i);
            } else if (zzh2 != null) {
                zzgns.zzv(obj, j, zzh2);
                zzN(obj, i2, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzgmj zzgmjVar) throws IOException {
        if (zzP(i)) {
            zzgns.zzv(obj, i & 1048575, zzgmjVar.zzu());
        } else if (this.zzi) {
            zzgns.zzv(obj, i & 1048575, zzgmjVar.zzt());
        } else {
            zzgns.zzv(obj, i & 1048575, zzgmjVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzz = zzz(i);
        long j = 1048575 & zzz;
        if (j == 1048575) {
            return;
        }
        zzgns.zzt(obj, j, (1 << (zzz >>> 20)) | zzgns.zzd(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgns.zzt(obj, zzz(i2) & 1048575, i);
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
            return (zzgns.zzd(obj, j) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i);
        long j2 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzgns.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgns.zzc(obj, j2)) != 0;
            case 2:
                return zzgns.zzf(obj, j2) != 0;
            case 3:
                return zzgns.zzf(obj, j2) != 0;
            case 4:
                return zzgns.zzd(obj, j2) != 0;
            case 5:
                return zzgns.zzf(obj, j2) != 0;
            case 6:
                return zzgns.zzd(obj, j2) != 0;
            case 7:
                return zzgns.zzz(obj, j2);
            case 8:
                Object zzh = zzgns.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgjg) {
                    return !zzgjg.zzb.equals(zzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgns.zzh(obj, j2) != null;
            case 10:
                return !zzgjg.zzb.equals(zzgns.zzh(obj, j2));
            case 11:
                return zzgns.zzd(obj, j2) != 0;
            case 12:
                return zzgns.zzd(obj, j2) != 0;
            case 13:
                return zzgns.zzd(obj, j2) != 0;
            case 14:
                return zzgns.zzf(obj, j2) != 0;
            case 15:
                return zzgns.zzd(obj, j2) != 0;
            case 16:
                return zzgns.zzf(obj, j2) != 0;
            case 17:
                return zzgns.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzQ(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzS(Object obj, int i, zzgmr zzgmrVar) {
        return zzgmrVar.zzk(zzgns.zzh(obj, i & 1048575));
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zzgns.zzd(obj, (long) (zzz(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzgns.zzh(obj, j)).booleanValue();
    }

    private final void zzV(Object obj, zzgjw zzgjwVar) throws IOException {
        int i;
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int zzC = zzC(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzC & i2;
            switch (zzB) {
                case 0:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzgjwVar.zzf(i6, zzgns.zzb(obj, j));
                        continue;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzo(i6, zzgns.zzc(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzb(i6, zzgns.zzz(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        zzX(i6, unsafe.getObject(obj, j), zzgjwVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzv(i6, unsafe.getObject(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzd(i6, (zzgjg) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        zzgjwVar.zzq(i6, unsafe.getObject(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzgmt.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 19:
                    zzgmt.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 20:
                    zzgmt.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 21:
                    zzgmt.zzaa(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 22:
                    zzgmt.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 23:
                    zzgmt.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 24:
                    zzgmt.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 25:
                    zzgmt.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    continue;
                case 26:
                    zzgmt.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar);
                    break;
                case 27:
                    zzgmt.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, zzF(i3));
                    break;
                case 28:
                    zzgmt.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar);
                    break;
                case 29:
                    zzgmt.zzZ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    break;
                case 30:
                    zzgmt.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    break;
                case 31:
                    zzgmt.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    break;
                case 32:
                    zzgmt.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    break;
                case 33:
                    zzgmt.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    break;
                case 34:
                    zzgmt.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, false);
                    break;
                case 35:
                    zzgmt.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 36:
                    zzgmt.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 37:
                    zzgmt.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 38:
                    zzgmt.zzaa(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 39:
                    zzgmt.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 40:
                    zzgmt.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 41:
                    zzgmt.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 42:
                    zzgmt.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 43:
                    zzgmt.zzZ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 44:
                    zzgmt.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 45:
                    zzgmt.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 46:
                    zzgmt.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 47:
                    zzgmt.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 48:
                    zzgmt.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, true);
                    break;
                case 49:
                    zzgmt.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjwVar, zzF(i3));
                    break;
                case 50:
                    zzW(zzgjwVar, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzf(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzo(i6, zzp(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzt(i6, zzD(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzJ(i6, zzD(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzr(i6, zzs(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzm(i6, zzD(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzk(i6, zzs(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzb(i6, zzU(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzT(obj, i6, i3)) {
                        zzX(i6, unsafe.getObject(obj, j), zzgjwVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzv(i6, unsafe.getObject(obj, j), zzF(i3));
                        break;
                    }
                    break;
                case 61:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzd(i6, (zzgjg) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzH(i6, zzs(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzi(i6, zzs(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzw(i6, zzs(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzy(i6, zzD(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzA(i6, zzs(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzC(i6, zzD(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzT(obj, i6, i3)) {
                        zzgjwVar.zzq(i6, unsafe.getObject(obj, j), zzF(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzgni zzgniVar = this.zzo;
        zzgniVar.zzr(zzgniVar.zzd(obj), zzgjwVar);
    }

    private final void zzW(zzgjw zzgjwVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzX(int i, Object obj, zzgjw zzgjwVar) throws IOException {
        if (obj instanceof String) {
            zzgjwVar.zzF(i, (String) obj);
        } else {
            zzgjwVar.zzd(i, (zzgjg) obj);
        }
    }

    static zzgnj zzd(Object obj) {
        zzgko zzgkoVar = (zzgko) obj;
        zzgnj zzgnjVar = zzgkoVar.zzc;
        if (zzgnjVar != zzgnj.zzc()) {
            return zzgnjVar;
        }
        zzgnj zze = zzgnj.zze();
        zzgkoVar.zzc = zze;
        return zze;
    }

    static zzgmb zzl(Class cls, zzglv zzglvVar, zzgmd zzgmdVar, zzglm zzglmVar, zzgni zzgniVar, zzgkb zzgkbVar, zzglt zzgltVar) {
        if (zzglvVar instanceof zzgmi) {
            return zzm((zzgmi) zzglvVar, zzgmdVar, zzglmVar, zzgniVar, zzgkbVar, zzgltVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzgmb zzm(zzgmi zzgmiVar, zzgmd zzgmdVar, zzglm zzglmVar, zzgni zzgniVar, zzgkb zzgkbVar, zzglt zzgltVar) {
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
        boolean z = zzgmiVar.zzc() == 2;
        String zzd = zzgmiVar.zzd();
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
            iArr = zza;
            i3 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
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
        Object[] zze = zzgmiVar.zze();
        Class<?> cls2 = zzgmiVar.zza().getClass();
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
                i20 = i24;
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
                    i21 = objectFieldOffset3;
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
                i21 = objectFieldOffset32;
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
                                i20 = i16;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i91 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i92 = charAt26 & 8191;
                                    int i93 = 13;
                                    while (true) {
                                        i20 = i91 + 1;
                                        charAt12 = zzd.charAt(i91);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i92 |= (charAt12 & 8191) << i93;
                                        i93 += 13;
                                        i91 = i20;
                                    }
                                    charAt26 = i92 | (charAt12 << i93);
                                } else {
                                    i20 = i91;
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
                                i21 = (int) unsafe.objectFieldOffset(zzI);
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
                    i20 = i16;
                    i21 = 1048575;
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
                i20 = i16;
                i21 = 1048575;
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
            iArr2[i96] = (i22 << 20) | i21;
            cls2 = cls;
            charAt = i17;
            charAt3 = i73;
            i31 = i20;
            length = i15;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzgmb(iArr3, objArr2, charAt, i4, zzgmiVar.zza(), z, false, iArr, charAt3, i59, zzgmdVar, zzglmVar, zzgniVar, zzgkbVar, zzgltVar, null);
    }

    private static double zzo(Object obj, long j) {
        return ((Double) zzgns.zzh(obj, j)).doubleValue();
    }

    private static float zzp(Object obj, long j) {
        return ((Float) zzgns.zzh(obj, j)).floatValue();
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
        int zzi;
        int zzD;
        int zzE8;
        int i3;
        int zzE9;
        int zzE10;
        int zzE11;
        int zzF2;
        int zzE12;
        int zzd2;
        int zzE13;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i6 < this.zzc.length) {
            int zzC = zzC(i6);
            int[] iArr = this.zzc;
            int i10 = iArr[i6];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i11 = iArr[i6 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i9) {
                    i8 = unsafe.getInt(obj, i12);
                    i9 = i12;
                }
            } else {
                i = 0;
            }
            long j = zzC & i5;
            switch (zzB) {
                case 0:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i10 << 3);
                        zzE5 = zzE + 8;
                        i7 += zzE5;
                        break;
                    }
                case 1:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i10 << 3);
                        zzE5 = zzE2 + 4;
                        i7 += zzE5;
                        break;
                    }
                case 2:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzE3 = zzgjv.zzE(i10 << 3);
                        zzF = zzgjv.zzF(j2);
                        i7 += zzE3 + zzF;
                        break;
                    }
                case 3:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzE3 = zzgjv.zzE(i10 << 3);
                        zzF = zzgjv.zzF(j3);
                        i7 += zzE3 + zzF;
                        break;
                    }
                case 4:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzE4 = zzgjv.zzE(i10 << 3);
                        zzy = zzgjv.zzy(i13);
                        i2 = zzE4 + zzy;
                        i7 += i2;
                        break;
                    }
                case 5:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i10 << 3);
                        zzE5 = zzE + 8;
                        i7 += zzE5;
                        break;
                    }
                case 6:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i10 << 3);
                        zzE5 = zzE2 + 4;
                        i7 += zzE5;
                        break;
                    }
                case 7:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE5 = zzgjv.zzE(i10 << 3) + 1;
                        i7 += zzE5;
                        break;
                    }
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgjg) {
                            zzE6 = zzgjv.zzE(i10 << 3);
                            zzd = ((zzgjg) object).zzd();
                            zzE7 = zzgjv.zzE(zzd);
                            i2 = zzE6 + zzE7 + zzd;
                            i7 += i2;
                            break;
                        } else {
                            zzE4 = zzgjv.zzE(i10 << 3);
                            zzy = zzgjv.zzC((String) object);
                            i2 = zzE4 + zzy;
                            i7 += i2;
                        }
                    }
                case 9:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE5 = zzgmt.zzo(i10, unsafe.getObject(obj, j), zzF(i6));
                        i7 += zzE5;
                        break;
                    }
                case 10:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzgjg zzgjgVar = (zzgjg) unsafe.getObject(obj, j);
                        zzE6 = zzgjv.zzE(i10 << 3);
                        zzd = zzgjgVar.zzd();
                        zzE7 = zzgjv.zzE(zzd);
                        i2 = zzE6 + zzE7 + zzd;
                        i7 += i2;
                        break;
                    }
                case 11:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzE4 = zzgjv.zzE(i10 << 3);
                        zzy = zzgjv.zzE(i14);
                        i2 = zzE4 + zzy;
                        i7 += i2;
                        break;
                    }
                case 12:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzE4 = zzgjv.zzE(i10 << 3);
                        zzy = zzgjv.zzy(i15);
                        i2 = zzE4 + zzy;
                        i7 += i2;
                        break;
                    }
                case 13:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i10 << 3);
                        zzE5 = zzE2 + 4;
                        i7 += zzE5;
                        break;
                    }
                case 14:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i10 << 3);
                        zzE5 = zzE + 8;
                        i7 += zzE5;
                        break;
                    }
                case 15:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzE4 = zzgjv.zzE(i10 << 3);
                        zzy = zzgjv.zzE((i16 >> 31) ^ (i16 + i16));
                        i2 = zzE4 + zzy;
                        i7 += i2;
                        break;
                    }
                case 16:
                    if ((i & i8) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i7 += zzgjv.zzE(i10 << 3) + zzgjv.zzF((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzE5 = zzgjv.zzx(i10, (zzgly) unsafe.getObject(obj, j), zzF(i6));
                        i7 += zzE5;
                        break;
                    }
                case 18:
                    zzE5 = zzgmt.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 19:
                    zzE5 = zzgmt.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 20:
                    zzE5 = zzgmt.zzm(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 21:
                    zzE5 = zzgmt.zzx(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 22:
                    zzE5 = zzgmt.zzk(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 23:
                    zzE5 = zzgmt.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 24:
                    zzE5 = zzgmt.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 25:
                    zzE5 = zzgmt.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzE5;
                    break;
                case 26:
                    zzu = zzgmt.zzu(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzu;
                    break;
                case 27:
                    zzu = zzgmt.zzp(i10, (List) unsafe.getObject(obj, j), zzF(i6));
                    i7 += zzu;
                    break;
                case 28:
                    zzu = zzgmt.zzc(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzu;
                    break;
                case 29:
                    zzu = zzgmt.zzv(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 30:
                    zzu = zzgmt.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 31:
                    zzu = zzgmt.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 32:
                    zzu = zzgmt.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 33:
                    zzu = zzgmt.zzq(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 34:
                    zzu = zzgmt.zzs(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 35:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 36:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 37:
                    zzi = zzgmt.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 38:
                    zzi = zzgmt.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 39:
                    zzi = zzgmt.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 40:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 41:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 42:
                    zzi = zzgmt.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 43:
                    zzi = zzgmt.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 44:
                    zzi = zzgmt.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 45:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 46:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 47:
                    zzi = zzgmt.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 48:
                    zzi = zzgmt.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i10);
                        zzE8 = zzgjv.zzE(zzi);
                        i3 = zzD + zzE8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 49:
                    zzu = zzgmt.zzj(i10, (List) unsafe.getObject(obj, j), zzF(i6));
                    i7 += zzu;
                    break;
                case 50:
                    zzglt.zza(i10, unsafe.getObject(obj, j), zzH(i6));
                    break;
                case 51:
                    if (zzT(obj, i10, i6)) {
                        zzE9 = zzgjv.zzE(i10 << 3);
                        zzu = zzE9 + 8;
                        i7 += zzu;
                    }
                    break;
                case 52:
                    if (zzT(obj, i10, i6)) {
                        zzE10 = zzgjv.zzE(i10 << 3);
                        zzu = zzE10 + 4;
                        i7 += zzu;
                    }
                    break;
                case 53:
                    if (zzT(obj, i10, i6)) {
                        long zzD2 = zzD(obj, j);
                        zzE11 = zzgjv.zzE(i10 << 3);
                        zzF2 = zzgjv.zzF(zzD2);
                        i7 += zzE11 + zzF2;
                    }
                    break;
                case 54:
                    if (zzT(obj, i10, i6)) {
                        long zzD3 = zzD(obj, j);
                        zzE11 = zzgjv.zzE(i10 << 3);
                        zzF2 = zzgjv.zzF(zzD3);
                        i7 += zzE11 + zzF2;
                    }
                    break;
                case 55:
                    if (zzT(obj, i10, i6)) {
                        int zzs = zzs(obj, j);
                        i3 = zzgjv.zzE(i10 << 3);
                        zzi = zzgjv.zzy(zzs);
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 56:
                    if (zzT(obj, i10, i6)) {
                        zzE9 = zzgjv.zzE(i10 << 3);
                        zzu = zzE9 + 8;
                        i7 += zzu;
                    }
                    break;
                case 57:
                    if (zzT(obj, i10, i6)) {
                        zzE10 = zzgjv.zzE(i10 << 3);
                        zzu = zzE10 + 4;
                        i7 += zzu;
                    }
                    break;
                case 58:
                    if (zzT(obj, i10, i6)) {
                        zzu = zzgjv.zzE(i10 << 3) + 1;
                        i7 += zzu;
                    }
                    break;
                case 59:
                    if (zzT(obj, i10, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgjg) {
                            zzE12 = zzgjv.zzE(i10 << 3);
                            zzd2 = ((zzgjg) object2).zzd();
                            zzE13 = zzgjv.zzE(zzd2);
                            i4 = zzE12 + zzE13 + zzd2;
                            i7 += i4;
                        } else {
                            i3 = zzgjv.zzE(i10 << 3);
                            zzi = zzgjv.zzC((String) object2);
                            i4 = i3 + zzi;
                            i7 += i4;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i10, i6)) {
                        zzu = zzgmt.zzo(i10, unsafe.getObject(obj, j), zzF(i6));
                        i7 += zzu;
                    }
                    break;
                case 61:
                    if (zzT(obj, i10, i6)) {
                        zzgjg zzgjgVar2 = (zzgjg) unsafe.getObject(obj, j);
                        zzE12 = zzgjv.zzE(i10 << 3);
                        zzd2 = zzgjgVar2.zzd();
                        zzE13 = zzgjv.zzE(zzd2);
                        i4 = zzE12 + zzE13 + zzd2;
                        i7 += i4;
                    }
                    break;
                case 62:
                    if (zzT(obj, i10, i6)) {
                        int zzs2 = zzs(obj, j);
                        i3 = zzgjv.zzE(i10 << 3);
                        zzi = zzgjv.zzE(zzs2);
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 63:
                    if (zzT(obj, i10, i6)) {
                        int zzs3 = zzs(obj, j);
                        i3 = zzgjv.zzE(i10 << 3);
                        zzi = zzgjv.zzy(zzs3);
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 64:
                    if (zzT(obj, i10, i6)) {
                        zzE10 = zzgjv.zzE(i10 << 3);
                        zzu = zzE10 + 4;
                        i7 += zzu;
                    }
                    break;
                case 65:
                    if (zzT(obj, i10, i6)) {
                        zzE9 = zzgjv.zzE(i10 << 3);
                        zzu = zzE9 + 8;
                        i7 += zzu;
                    }
                    break;
                case 66:
                    if (zzT(obj, i10, i6)) {
                        int zzs4 = zzs(obj, j);
                        i3 = zzgjv.zzE(i10 << 3);
                        zzi = zzgjv.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 67:
                    if (zzT(obj, i10, i6)) {
                        long zzD4 = zzD(obj, j);
                        i7 += zzgjv.zzE(i10 << 3) + zzgjv.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                    }
                    break;
                case 68:
                    if (zzT(obj, i10, i6)) {
                        zzu = zzgjv.zzx(i10, (zzgly) unsafe.getObject(obj, j), zzF(i6));
                        i7 += zzu;
                    }
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        zzgni zzgniVar = this.zzo;
        int zza2 = i7 + zzgniVar.zza(zzgniVar.zzd(obj));
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
            if (zzB >= zzgkg.DOUBLE_LIST_PACKED.zza() && zzB <= zzgkg.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(obj, i3)) {
                        zzE = zzgjv.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgjv.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj, i3)) {
                        long zzf = zzgns.zzf(obj, j);
                        zzE3 = zzgjv.zzE(i4 << 3);
                        zzF = zzgjv.zzF(zzf);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj, i3)) {
                        long zzf2 = zzgns.zzf(obj, j);
                        zzE3 = zzgjv.zzE(i4 << 3);
                        zzF = zzgjv.zzF(zzf2);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj, i3)) {
                        int zzd2 = zzgns.zzd(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzy(zzd2);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj, i3)) {
                        zzE = zzgjv.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgjv.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj, i3)) {
                        zzE5 = zzgjv.zzE(i4 << 3);
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
                        Object zzh = zzgns.zzh(obj, j);
                        if (zzh instanceof zzgjg) {
                            zzE6 = zzgjv.zzE(i4 << 3);
                            zzd = ((zzgjg) zzh).zzd();
                            zzE7 = zzgjv.zzE(zzd);
                            i = zzE6 + zzE7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzE4 = zzgjv.zzE(i4 << 3);
                            zzy = zzgjv.zzC((String) zzh);
                            i = zzE4 + zzy;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzQ(obj, i3)) {
                        zzo = zzgmt.zzo(i4, zzgns.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(obj, i3)) {
                        zzgjg zzgjgVar = (zzgjg) zzgns.zzh(obj, j);
                        zzE6 = zzgjv.zzE(i4 << 3);
                        zzd = zzgjgVar.zzd();
                        zzE7 = zzgjv.zzE(zzd);
                        i = zzE6 + zzE7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj, i3)) {
                        int zzd3 = zzgns.zzd(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzE(zzd3);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj, i3)) {
                        int zzd4 = zzgns.zzd(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzy(zzd4);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgjv.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj, i3)) {
                        zzE = zzgjv.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj, i3)) {
                        int zzd5 = zzgns.zzd(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzE((zzd5 >> 31) ^ (zzd5 + zzd5));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj, i3)) {
                        long zzf3 = zzgns.zzf(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzF((zzf3 >> 63) ^ (zzf3 + zzf3));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(obj, i3)) {
                        zzo = zzgjv.zzx(i4, (zzgly) zzgns.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzgmt.zzh(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzgmt.zzf(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzgmt.zzm(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzgmt.zzx(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzgmt.zzk(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzgmt.zzh(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzgmt.zzf(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 25:
                    zzo = zzgmt.zza(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 26:
                    zzo = zzgmt.zzu(i4, (List) zzgns.zzh(obj, j));
                    i2 += zzo;
                    break;
                case 27:
                    zzo = zzgmt.zzp(i4, (List) zzgns.zzh(obj, j), zzF(i3));
                    i2 += zzo;
                    break;
                case 28:
                    zzo = zzgmt.zzc(i4, (List) zzgns.zzh(obj, j));
                    i2 += zzo;
                    break;
                case 29:
                    zzo = zzgmt.zzv(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 30:
                    zzo = zzgmt.zzd(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 31:
                    zzo = zzgmt.zzf(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzgmt.zzh(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 33:
                    zzo = zzgmt.zzq(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 34:
                    zzo = zzgmt.zzs(i4, (List) zzgns.zzh(obj, j), false);
                    i2 += zzo;
                    break;
                case 35:
                    zzy = zzgmt.zzi((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzgmt.zzg((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzgmt.zzn((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzgmt.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzgmt.zzl((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzgmt.zzi((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzgmt.zzg((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzy = zzgmt.zzb((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzgmt.zzw((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzgmt.zze((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzgmt.zzg((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzgmt.zzi((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzgmt.zzr((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzgmt.zzt((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        zzD = zzgjv.zzD(i4);
                        zzE8 = zzgjv.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzgmt.zzj(i4, (List) zzgns.zzh(obj, j), zzF(i3));
                    i2 += zzo;
                    break;
                case 50:
                    zzglt.zza(i4, zzgns.zzh(obj, j), zzH(i3));
                    break;
                case 51:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgjv.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgjv.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i4, i3)) {
                        long zzD2 = zzD(obj, j);
                        zzE3 = zzgjv.zzE(i4 << 3);
                        zzF = zzgjv.zzF(zzD2);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i4, i3)) {
                        long zzD3 = zzD(obj, j);
                        zzE3 = zzgjv.zzE(i4 << 3);
                        zzF = zzgjv.zzF(zzD3);
                        i2 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i4, i3)) {
                        int zzs = zzs(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzy(zzs);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgjv.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgjv.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i4, i3)) {
                        zzE5 = zzgjv.zzE(i4 << 3);
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
                        Object zzh2 = zzgns.zzh(obj, j);
                        if (zzh2 instanceof zzgjg) {
                            zzE6 = zzgjv.zzE(i4 << 3);
                            zzd = ((zzgjg) zzh2).zzd();
                            zzE7 = zzgjv.zzE(zzd);
                            i = zzE6 + zzE7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzE4 = zzgjv.zzE(i4 << 3);
                            zzy = zzgjv.zzC((String) zzh2);
                            i = zzE4 + zzy;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzT(obj, i4, i3)) {
                        zzo = zzgmt.zzo(i4, zzgns.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i4, i3)) {
                        zzgjg zzgjgVar2 = (zzgjg) zzgns.zzh(obj, j);
                        zzE6 = zzgjv.zzE(i4 << 3);
                        zzd = zzgjgVar2.zzd();
                        zzE7 = zzgjv.zzE(zzd);
                        i = zzE6 + zzE7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i4, i3)) {
                        int zzs2 = zzs(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzE(zzs2);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i4, i3)) {
                        int zzs3 = zzs(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzy(zzs3);
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgjv.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgjv.zzE(i4 << 3);
                        zzo = zzE + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i4, i3)) {
                        int zzs4 = zzs(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i4, i3)) {
                        long zzD4 = zzD(obj, j);
                        zzE4 = zzgjv.zzE(i4 << 3);
                        zzy = zzgjv.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        i = zzE4 + zzy;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i4, i3)) {
                        zzo = zzgjv.zzx(i4, (zzgly) zzgns.zzh(obj, j), zzF(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgni zzgniVar = this.zzo;
        return i2 + zzgniVar.zza(zzgniVar.zzd(obj));
    }

    private static int zzs(Object obj, long j) {
        return ((Integer) zzgns.zzh(obj, j)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgis zzgisVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzglt.zzb(object)) {
            zzgls zzb2 = zzgls.zza().zzb();
            zzglt.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgis zzgisVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgit.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgit.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzgit.zzm(bArr, i, zzgisVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgisVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzgit.zzj(bArr, i, zzgisVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgisVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzgit.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzgit.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzgit.zzm(bArr, i, zzgisVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzgisVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzgit.zzj(bArr, i, zzgisVar);
                    int i9 = zzgisVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzgnx.zzj(bArr, zzj2, zzj2 + i9)) {
                            throw zzgla.zzd();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzgky.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzgit.zzd(zzF(i8), bArr, i, i2, zzgisVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzgisVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzgky.zzg(object, zzgisVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzgit.zza(bArr, i, zzgisVar);
                    unsafe.putObject(obj, j, zzgisVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzgit.zzj(bArr, i, zzgisVar);
                    int i10 = zzgisVar.zza;
                    zzgks zzE = zzE(i8);
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
                    int zzj4 = zzgit.zzj(bArr, i, zzgisVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgjo.zzF(zzgisVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzgit.zzm(bArr, i, zzgisVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgjo.zzG(zzgisVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzgit.zzc(zzF(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgisVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzgisVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzgky.zzg(object2, zzgisVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e7, code lost:
    
        if (r0 != r5) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e9, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02fd, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x032e, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0351, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0090. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzv(Object obj, byte[] bArr, int i, int i2, zzgis zzgisVar) throws IOException {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int i9;
        int i10;
        Unsafe unsafe2;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzgmb<T> zzgmbVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzgis zzgisVar2 = zzgisVar;
        Unsafe unsafe5 = zzb;
        int i15 = -1;
        int i16 = 1048575;
        int i17 = i;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1048575;
        while (i17 < i14) {
            int i22 = i17 + 1;
            byte b2 = bArr2[i17];
            if (b2 < 0) {
                i3 = zzgit.zzk(b2, bArr2, i22, zzgisVar2);
                b = zzgisVar2.zza;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            int zzy = i23 > i18 ? zzgmbVar.zzy(i23, i19 / 3) : zzgmbVar.zzx(i23);
            if (zzy == i15) {
                i9 = i3;
                i4 = i23;
                unsafe = unsafe5;
                i5 = 0;
            } else {
                int[] iArr = zzgmbVar.zzc;
                int i25 = iArr[zzy + 1];
                int zzB = zzB(i25);
                Unsafe unsafe6 = unsafe5;
                long j = i25 & i16;
                if (zzB <= 17) {
                    int i26 = iArr[zzy + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    if (i28 != i21) {
                        i10 = zzy;
                        if (i21 != 1048575) {
                            long j2 = i21;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j2, i20);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i28 != 1048575) {
                            i20 = unsafe4.getInt(obj2, i28);
                        }
                        unsafe2 = unsafe4;
                        i21 = i28;
                    } else {
                        i10 = zzy;
                        unsafe2 = unsafe6;
                    }
                    switch (zzB) {
                        case 0:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 1) {
                                zzgns.zzr(obj2, j, Double.longBitsToDouble(zzgit.zzn(bArr2, i11)));
                                i17 = i11 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 1:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 5) {
                                zzgns.zzs(obj2, j, Float.intBitsToFloat(zzgit.zzb(bArr2, i11)));
                                i17 = i11 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 2:
                        case 3:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                int zzm = zzgit.zzm(bArr2, i11, zzgisVar2);
                                unsafe3.putLong(obj, j, zzgisVar2.zzb);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i17 = zzm;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 4:
                        case 11:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgit.zzj(bArr2, i11, zzgisVar2);
                                unsafe3.putInt(obj2, j, zzgisVar2.zza);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 5:
                        case 14:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 1) {
                                unsafe3.putLong(obj, j, zzgit.zzn(bArr2, i3));
                                i17 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 6:
                        case 13:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 5) {
                                unsafe3.putInt(obj2, j, zzgit.zzb(bArr2, i3));
                                i17 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 7:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgit.zzm(bArr2, i3, zzgisVar2);
                                zzgns.zzp(obj2, j, zzgisVar2.zzb != 0);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 8:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i17 = (i25 & 536870912) == 0 ? zzgit.zzg(bArr2, i3, zzgisVar2) : zzgit.zzh(bArr2, i3, zzgisVar2);
                                unsafe3.putObject(obj2, j, zzgisVar2.zzc);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 9:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i17 = zzgit.zzd(zzgmbVar.zzF(i13), bArr2, i3, i14, zzgisVar2);
                                Object object = unsafe3.getObject(obj2, j);
                                if (object == null) {
                                    unsafe3.putObject(obj2, j, zzgisVar2.zzc);
                                } else {
                                    unsafe3.putObject(obj2, j, zzgky.zzg(object, zzgisVar2.zzc));
                                }
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 10:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i17 = zzgit.zza(bArr2, i3, zzgisVar2);
                                unsafe3.putObject(obj2, j, zzgisVar2.zzc);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 12:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgit.zzj(bArr2, i3, zzgisVar2);
                                unsafe3.putInt(obj2, j, zzgisVar2.zza);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 15:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgit.zzj(bArr2, i3, zzgisVar2);
                                unsafe3.putInt(obj2, j, zzgjo.zzF(zzgisVar2.zza));
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 16:
                            if (i24 != 0) {
                                i12 = i21;
                                int i29 = i10;
                                i4 = i23;
                                unsafe3 = unsafe2;
                                i11 = i3;
                                i13 = i29;
                                i9 = i11;
                                unsafe = unsafe3;
                                i5 = i13;
                                i21 = i12;
                                break;
                            } else {
                                int zzm2 = zzgit.zzm(bArr2, i3, zzgisVar2);
                                i12 = i21;
                                int i30 = i10;
                                i4 = i23;
                                unsafe2.putLong(obj, j, zzgjo.zzG(zzgisVar2.zzb));
                                i20 |= i27;
                                unsafe5 = unsafe2;
                                i19 = i30;
                                i17 = zzm2;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                        default:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                    }
                    i16 = 1048575;
                    i15 = -1;
                } else {
                    i4 = i23;
                    int i31 = i3;
                    int i32 = i21;
                    if (zzB != 27) {
                        i5 = zzy;
                        if (zzB <= 49) {
                            i7 = i20;
                            i8 = i32;
                            unsafe = unsafe6;
                            i17 = zzw(obj, bArr, i31, i2, b, i4, i24, i5, i25, zzB, j, zzgisVar);
                        } else {
                            i6 = i31;
                            i7 = i20;
                            unsafe = unsafe6;
                            i8 = i32;
                            if (zzB != 50) {
                                i17 = zzu(obj, bArr, i6, i2, b, i4, i24, i25, zzB, j, i5, zzgisVar);
                            } else if (i24 == 2) {
                                i17 = zzt(obj, bArr, i6, i2, i5, j, zzgisVar);
                            }
                        }
                    } else if (i24 == 2) {
                        zzgkx zzgkxVar = (zzgkx) unsafe6.getObject(obj2, j);
                        if (!zzgkxVar.zzc()) {
                            int size = zzgkxVar.size();
                            zzgkxVar = zzgkxVar.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, zzgkxVar);
                        }
                        i17 = zzgit.zze(zzgmbVar.zzF(zzy), b, bArr, i31, i2, zzgkxVar, zzgisVar);
                        unsafe5 = unsafe6;
                        i20 = i20;
                        i21 = i32;
                        i18 = i4;
                        i19 = zzy;
                        i16 = 1048575;
                        i15 = -1;
                    } else {
                        i5 = zzy;
                        i6 = i31;
                        i7 = i20;
                        unsafe = unsafe6;
                        i8 = i32;
                    }
                    i9 = i6;
                    i20 = i7;
                    i21 = i8;
                }
                unsafe5 = unsafe;
                i16 = 1048575;
                i15 = -1;
            }
            i17 = zzgit.zzi(b, bArr, i9, i2, zzd(obj), zzgisVar);
            zzgmbVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            zzgisVar2 = zzgisVar;
            i18 = i4;
            i19 = i5;
            unsafe5 = unsafe;
            i16 = 1048575;
            i15 = -1;
        }
        int i33 = i20;
        Unsafe unsafe7 = unsafe5;
        if (i21 != 1048575) {
            unsafe7.putInt(obj, i21, i33);
        }
        if (i17 == i2) {
            return i17;
        }
        throw zzgla.zzg();
    }

    private final int zzw(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgis zzgisVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12 = i;
        Unsafe unsafe = zzb;
        zzgkx zzgkxVar = (zzgkx) unsafe.getObject(obj, j2);
        if (!zzgkxVar.zzc()) {
            int size = zzgkxVar.size();
            zzgkxVar = zzgkxVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzgkxVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzgjx zzgjxVar = (zzgjx) zzgkxVar;
                    int zzj2 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i13 = zzgisVar.zza + zzj2;
                    while (zzj2 < i13) {
                        zzgjxVar.zze(Double.longBitsToDouble(zzgit.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i13) {
                        return zzj2;
                    }
                    throw zzgla.zzj();
                }
                if (i5 == 1) {
                    zzgjx zzgjxVar2 = (zzgjx) zzgkxVar;
                    zzgjxVar2.zze(Double.longBitsToDouble(zzgit.zzn(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = zzgit.zzj(bArr, i8, zzgisVar);
                            if (i3 == zzgisVar.zza) {
                                zzgjxVar2.zze(Double.longBitsToDouble(zzgit.zzn(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzgkh zzgkhVar = (zzgkh) zzgkxVar;
                    int zzj3 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i14 = zzgisVar.zza + zzj3;
                    while (zzj3 < i14) {
                        zzgkhVar.zze(Float.intBitsToFloat(zzgit.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i14) {
                        return zzj3;
                    }
                    throw zzgla.zzj();
                }
                if (i5 == 5) {
                    zzgkh zzgkhVar2 = (zzgkh) zzgkxVar;
                    zzgkhVar2.zze(Float.intBitsToFloat(zzgit.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = zzgit.zzj(bArr, i9, zzgisVar);
                            if (i3 == zzgisVar.zza) {
                                zzgkhVar2.zze(Float.intBitsToFloat(zzgit.zzb(bArr, i12)));
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
                    zzgln zzglnVar = (zzgln) zzgkxVar;
                    int zzj4 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i15 = zzgisVar.zza + zzj4;
                    while (zzj4 < i15) {
                        zzj4 = zzgit.zzm(bArr, zzj4, zzgisVar);
                        zzglnVar.zzg(zzgisVar.zzb);
                    }
                    if (zzj4 == i15) {
                        return zzj4;
                    }
                    throw zzgla.zzj();
                }
                if (i5 == 0) {
                    zzgln zzglnVar2 = (zzgln) zzgkxVar;
                    int zzm = zzgit.zzm(bArr, i12, zzgisVar);
                    zzglnVar2.zzg(zzgisVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzgit.zzj(bArr, zzm, zzgisVar);
                        if (i3 != zzgisVar.zza) {
                            return zzm;
                        }
                        zzm = zzgit.zzm(bArr, zzj5, zzgisVar);
                        zzglnVar2.zzg(zzgisVar.zzb);
                    }
                    return zzm;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzgit.zzf(bArr, i12, zzgkxVar, zzgisVar);
                }
                if (i5 == 0) {
                    return zzgit.zzl(i3, bArr, i, i2, zzgkxVar, zzgisVar);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzgln zzglnVar3 = (zzgln) zzgkxVar;
                    int zzj6 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i16 = zzgisVar.zza + zzj6;
                    while (zzj6 < i16) {
                        zzglnVar3.zzg(zzgit.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i16) {
                        return zzj6;
                    }
                    throw zzgla.zzj();
                }
                if (i5 == 1) {
                    zzgln zzglnVar4 = (zzgln) zzgkxVar;
                    zzglnVar4.zzg(zzgit.zzn(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = zzgit.zzj(bArr, i10, zzgisVar);
                            if (i3 == zzgisVar.zza) {
                                zzglnVar4.zzg(zzgit.zzn(bArr, i12));
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
                    zzgkp zzgkpVar = (zzgkp) zzgkxVar;
                    int zzj7 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i17 = zzgisVar.zza + zzj7;
                    while (zzj7 < i17) {
                        zzgkpVar.zzh(zzgit.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i17) {
                        return zzj7;
                    }
                    throw zzgla.zzj();
                }
                if (i5 == 5) {
                    zzgkp zzgkpVar2 = (zzgkp) zzgkxVar;
                    zzgkpVar2.zzh(zzgit.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = zzgit.zzj(bArr, i11, zzgisVar);
                            if (i3 == zzgisVar.zza) {
                                zzgkpVar2.zzh(zzgit.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i12;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzgiu zzgiuVar = (zzgiu) zzgkxVar;
                    zzj = zzgit.zzj(bArr, i12, zzgisVar);
                    int i18 = zzgisVar.zza + zzj;
                    while (zzj < i18) {
                        zzj = zzgit.zzm(bArr, zzj, zzgisVar);
                        zzgiuVar.zze(zzgisVar.zzb != 0);
                    }
                    if (zzj != i18) {
                        throw zzgla.zzj();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zzgiu zzgiuVar2 = (zzgiu) zzgkxVar;
                    int zzm2 = zzgit.zzm(bArr, i12, zzgisVar);
                    zzgiuVar2.zze(zzgisVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzgit.zzj(bArr, zzm2, zzgisVar);
                        if (i3 != zzgisVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzgit.zzm(bArr, zzj8, zzgisVar);
                        zzgiuVar2.zze(zzgisVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i12;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i12 = zzgit.zzj(bArr, i12, zzgisVar);
                        int i19 = zzgisVar.zza;
                        if (i19 < 0) {
                            throw zzgla.zzf();
                        }
                        if (i19 == 0) {
                            zzgkxVar.add("");
                        } else {
                            zzgkxVar.add(new String(bArr, i12, i19, zzgky.zzb));
                            i12 += i19;
                        }
                        while (i12 < i2) {
                            int zzj9 = zzgit.zzj(bArr, i12, zzgisVar);
                            if (i3 == zzgisVar.zza) {
                                i12 = zzgit.zzj(bArr, zzj9, zzgisVar);
                                int i20 = zzgisVar.zza;
                                if (i20 < 0) {
                                    throw zzgla.zzf();
                                }
                                if (i20 == 0) {
                                    zzgkxVar.add("");
                                } else {
                                    zzgkxVar.add(new String(bArr, i12, i20, zzgky.zzb));
                                    i12 += i20;
                                }
                            }
                        }
                    } else {
                        i12 = zzgit.zzj(bArr, i12, zzgisVar);
                        int i21 = zzgisVar.zza;
                        if (i21 < 0) {
                            throw zzgla.zzf();
                        }
                        if (i21 == 0) {
                            zzgkxVar.add("");
                        } else {
                            int i22 = i12 + i21;
                            if (!zzgnx.zzj(bArr, i12, i22)) {
                                throw zzgla.zzd();
                            }
                            zzgkxVar.add(new String(bArr, i12, i21, zzgky.zzb));
                            i12 = i22;
                        }
                        while (i12 < i2) {
                            int zzj10 = zzgit.zzj(bArr, i12, zzgisVar);
                            if (i3 == zzgisVar.zza) {
                                i12 = zzgit.zzj(bArr, zzj10, zzgisVar);
                                int i23 = zzgisVar.zza;
                                if (i23 < 0) {
                                    throw zzgla.zzf();
                                }
                                if (i23 == 0) {
                                    zzgkxVar.add("");
                                } else {
                                    int i24 = i12 + i23;
                                    if (!zzgnx.zzj(bArr, i12, i24)) {
                                        throw zzgla.zzd();
                                    }
                                    zzgkxVar.add(new String(bArr, i12, i23, zzgky.zzb));
                                    i12 = i24;
                                }
                            }
                        }
                    }
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return zzgit.zze(zzF(i6), i3, bArr, i, i2, zzgkxVar, zzgisVar);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int zzj11 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i25 = zzgisVar.zza;
                    if (i25 < 0) {
                        throw zzgla.zzf();
                    }
                    if (i25 > bArr.length - zzj11) {
                        throw zzgla.zzj();
                    }
                    if (i25 == 0) {
                        zzgkxVar.add(zzgjg.zzb);
                    } else {
                        zzgkxVar.add(zzgjg.zzw(bArr, zzj11, i25));
                        zzj11 += i25;
                    }
                    while (zzj11 < i2) {
                        int zzj12 = zzgit.zzj(bArr, zzj11, zzgisVar);
                        if (i3 != zzgisVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzgit.zzj(bArr, zzj12, zzgisVar);
                        int i26 = zzgisVar.zza;
                        if (i26 < 0) {
                            throw zzgla.zzf();
                        }
                        if (i26 > bArr.length - zzj11) {
                            throw zzgla.zzj();
                        }
                        if (i26 == 0) {
                            zzgkxVar.add(zzgjg.zzb);
                        } else {
                            zzgkxVar.add(zzgjg.zzw(bArr, zzj11, i26));
                            zzj11 += i26;
                        }
                    }
                    return zzj11;
                }
                return i12;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzj = zzgit.zzl(i3, bArr, i, i2, zzgkxVar, zzgisVar);
                    }
                    return i12;
                }
                zzj = zzgit.zzf(bArr, i12, zzgkxVar, zzgisVar);
                zzgko zzgkoVar = (zzgko) obj;
                zzgnj zzgnjVar = zzgkoVar.zzc;
                if (zzgnjVar == zzgnj.zzc()) {
                    zzgnjVar = null;
                }
                Object zzC = zzgmt.zzC(i4, zzgkxVar, zzE(i6), zzgnjVar, this.zzo);
                if (zzC != null) {
                    zzgkoVar.zzc = (zzgnj) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzgkp zzgkpVar3 = (zzgkp) zzgkxVar;
                    int zzj13 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i27 = zzgisVar.zza + zzj13;
                    while (zzj13 < i27) {
                        zzj13 = zzgit.zzj(bArr, zzj13, zzgisVar);
                        zzgkpVar3.zzh(zzgjo.zzF(zzgisVar.zza));
                    }
                    if (zzj13 == i27) {
                        return zzj13;
                    }
                    throw zzgla.zzj();
                }
                if (i5 == 0) {
                    zzgkp zzgkpVar4 = (zzgkp) zzgkxVar;
                    int zzj14 = zzgit.zzj(bArr, i12, zzgisVar);
                    zzgkpVar4.zzh(zzgjo.zzF(zzgisVar.zza));
                    while (zzj14 < i2) {
                        int zzj15 = zzgit.zzj(bArr, zzj14, zzgisVar);
                        if (i3 != zzgisVar.zza) {
                            return zzj14;
                        }
                        zzj14 = zzgit.zzj(bArr, zzj15, zzgisVar);
                        zzgkpVar4.zzh(zzgjo.zzF(zzgisVar.zza));
                    }
                    return zzj14;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzgln zzglnVar5 = (zzgln) zzgkxVar;
                    int zzj16 = zzgit.zzj(bArr, i12, zzgisVar);
                    int i28 = zzgisVar.zza + zzj16;
                    while (zzj16 < i28) {
                        zzj16 = zzgit.zzm(bArr, zzj16, zzgisVar);
                        zzglnVar5.zzg(zzgjo.zzG(zzgisVar.zzb));
                    }
                    if (zzj16 == i28) {
                        return zzj16;
                    }
                    throw zzgla.zzj();
                }
                if (i5 == 0) {
                    zzgln zzglnVar6 = (zzgln) zzgkxVar;
                    int zzm3 = zzgit.zzm(bArr, i12, zzgisVar);
                    zzglnVar6.zzg(zzgjo.zzG(zzgisVar.zzb));
                    while (zzm3 < i2) {
                        int zzj17 = zzgit.zzj(bArr, zzm3, zzgisVar);
                        if (i3 != zzgisVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzgit.zzm(bArr, zzj17, zzgisVar);
                        zzglnVar6.zzg(zzgjo.zzG(zzgisVar.zzb));
                    }
                    return zzm3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    zzgmr zzF = zzF(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = zzgit.zzc(zzF, bArr, i, i2, i29, zzgisVar);
                    zzgkxVar.add(zzgisVar.zzc);
                    while (zzc < i2) {
                        int zzj18 = zzgit.zzj(bArr, zzc, zzgisVar);
                        if (i3 != zzgisVar.zza) {
                            return zzc;
                        }
                        zzc = zzgit.zzc(zzF, bArr, zzj18, i2, i29, zzgisVar);
                        zzgkxVar.add(zzgisVar.zzc);
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

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
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
                    zzc = zzgky.zzc(Double.doubleToLongBits(zzgns.zzb(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzgns.zzc(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzgns.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzgns.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzgky.zza(zzgns.zzz(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzgns.zzh(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzh = zzgns.zzh(obj, j);
                    if (zzh != null) {
                        i5 = zzh.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzgns.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzgns.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzgns.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzgns.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzgns.zzd(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzh2 = zzgns.zzh(obj, j);
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
                    zzc = zzgns.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzgns.zzh(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgky.zzc(Double.doubleToLongBits(zzo(obj, j)));
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
                        zzc = zzgky.zzc(zzD(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgky.zzc(zzD(obj, j));
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
                        zzc = zzgky.zzc(zzD(obj, j));
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
                        zzc = zzgky.zza(zzU(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzgns.zzh(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgns.zzh(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgns.zzh(obj, j).hashCode();
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
                        zzc = zzgky.zzc(zzD(obj, j));
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
                        zzc = zzgky.zzc(zzD(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzgns.zzh(obj, j).hashCode();
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

    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgis zzgisVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzgmb<T> zzgmbVar;
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
        zzgis zzgisVar2;
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
        zzgmb<T> zzgmbVar2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        zzgis zzgisVar3 = zzgisVar;
        Unsafe unsafe2 = zzb;
        int i26 = i;
        int i27 = 0;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        int i31 = 1048575;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b = bArr2[i26];
                if (b < 0) {
                    i7 = zzgit.zzk(b, bArr2, i32, zzgisVar3);
                    i6 = zzgisVar3.zza;
                } else {
                    i6 = b;
                    i7 = i32;
                }
                int i33 = i6 >>> 3;
                int i34 = i6 & 7;
                int zzy = i33 > i28 ? zzgmbVar2.zzy(i33, i29 / 3) : zzgmbVar2.zzx(i33);
                if (zzy == -1) {
                    i8 = i7;
                    i9 = i6;
                    i10 = i30;
                    i11 = i33;
                    unsafe = unsafe2;
                    i4 = i25;
                    i12 = 0;
                } else {
                    int[] iArr = zzgmbVar2.zzc;
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
                                unsafe2.putInt(obj5, i31, i30);
                            }
                            i30 = unsafe2.getInt(obj5, i40);
                            i15 = i40;
                        } else {
                            i14 = zzy;
                            i15 = i31;
                        }
                        int i41 = i30;
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
                                    zzgns.zzr(obj5, j, Double.longBitsToDouble(zzgit.zzn(bArr2, i17)));
                                    i26 = i17 + 8;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    zzgns.zzs(obj5, j, Float.intBitsToFloat(zzgit.zzb(bArr2, i17)));
                                    i26 = i17 + 4;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    zzm = zzgit.zzm(bArr2, i17, zzgisVar3);
                                    unsafe2.putLong(obj, j, zzgisVar3.zzb);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i26 = zzm;
                                    i27 = i16;
                                    i28 = i18;
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
                                    i26 = zzgit.zzj(bArr2, i17, zzgisVar3);
                                    unsafe2.putInt(obj5, j, zzgisVar3.zza);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    unsafe2.putLong(obj, j, zzgit.zzn(bArr2, i20));
                                    i26 = i20 + 8;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    unsafe2.putInt(obj5, j, zzgit.zzb(bArr2, i20));
                                    i26 = i20 + 4;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    i26 = zzgit.zzm(bArr2, i20, zzgisVar3);
                                    zzgns.zzp(obj5, j, zzgisVar3.zzb != 0);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    i26 = (536870912 & i35) == 0 ? zzgit.zzg(bArr2, i20, zzgisVar3) : zzgit.zzh(bArr2, i20, zzgisVar3);
                                    unsafe2.putObject(obj5, j, zzgisVar3.zzc);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    i26 = zzgit.zzd(zzgmbVar2.zzF(i19), bArr2, i20, i24, zzgisVar3);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj5, j, zzgisVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzgky.zzg(unsafe2.getObject(obj5, j), zzgisVar3.zzc));
                                    }
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    i26 = zzgit.zza(bArr2, i20, zzgisVar3);
                                    unsafe2.putObject(obj5, j, zzgisVar3.zzc);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    i26 = zzgit.zzj(bArr2, i20, zzgisVar3);
                                    int i42 = zzgisVar3.zza;
                                    zzgks zzE = zzgmbVar2.zzE(i19);
                                    if (zzE == null || zzE.zza(i42)) {
                                        unsafe2.putInt(obj5, j, i42);
                                        i30 = i41 | i39;
                                        i29 = i19;
                                        i27 = i16;
                                        i28 = i18;
                                        i31 = i15;
                                        i25 = i3;
                                    } else {
                                        zzd(obj).zzh(i16, Long.valueOf(i42));
                                        i30 = i41;
                                        i29 = i19;
                                        i27 = i16;
                                        i28 = i18;
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
                                    i26 = zzgit.zzj(bArr2, i20, zzgisVar3);
                                    unsafe2.putInt(obj5, j, zzgjo.zzF(zzgisVar3.zza));
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
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
                                    zzm = zzgit.zzm(bArr2, i37, zzgisVar3);
                                    i16 = i36;
                                    i18 = i33;
                                    i19 = i14;
                                    unsafe2.putLong(obj, j, zzgjo.zzG(zzgisVar3.zzb));
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i26 = zzm;
                                    i27 = i16;
                                    i28 = i18;
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
                                    i26 = zzgit.zzc(zzgmbVar2.zzF(i19), bArr, i17, i2, (i18 << 3) | 4, zzgisVar);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj5, j, zzgisVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzgky.zzg(unsafe2.getObject(obj5, j), zzgisVar3.zzc));
                                    }
                                    i30 = i41 | i39;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                        }
                    } else {
                        int i43 = zzy;
                        if (zzB != 27) {
                            i10 = i30;
                            i21 = i31;
                            if (zzB <= 49) {
                                i23 = i36;
                                i12 = i43;
                                i11 = i33;
                                unsafe = unsafe2;
                                i26 = zzw(obj, bArr, i37, i2, i36, i33, i34, i12, i35, zzB, j, zzgisVar);
                                if (i26 != i37) {
                                    zzgmbVar2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i27 = i23;
                                    i24 = i2;
                                    i25 = i3;
                                    zzgisVar3 = zzgisVar;
                                    i29 = i12;
                                    i30 = i10;
                                    i28 = i11;
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
                                    i26 = zzu(obj, bArr, i22, i2, i23, i11, i34, i35, zzB, j, i12, zzgisVar);
                                    if (i26 != i22) {
                                        zzgmbVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i23;
                                        i24 = i2;
                                        i25 = i3;
                                        zzgisVar3 = zzgisVar;
                                        i29 = i12;
                                        i30 = i10;
                                        i28 = i11;
                                        i31 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i9 = i23;
                                        i4 = i3;
                                        i8 = i26;
                                        i31 = i21;
                                    }
                                } else if (i34 == 2) {
                                    i26 = zzt(obj, bArr, i22, i2, i12, j, zzgisVar);
                                    if (i26 != i22) {
                                        zzgmbVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i23;
                                        i24 = i2;
                                        i25 = i3;
                                        zzgisVar3 = zzgisVar;
                                        i29 = i12;
                                        i30 = i10;
                                        i28 = i11;
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
                            zzgkx zzgkxVar = (zzgkx) unsafe2.getObject(obj5, j);
                            if (!zzgkxVar.zzc()) {
                                int size = zzgkxVar.size();
                                zzgkxVar = zzgkxVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j, zzgkxVar);
                            }
                            i15 = i31;
                            i26 = zzgit.zze(zzgmbVar2.zzF(i43), i36, bArr, i37, i2, zzgkxVar, zzgisVar);
                            bArr2 = bArr;
                            i24 = i2;
                            i29 = i43;
                            i27 = i36;
                            i28 = i33;
                            i30 = i30;
                            i31 = i15;
                            i25 = i3;
                        } else {
                            i10 = i30;
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
                        zzgisVar2 = zzgisVar;
                        if (zzgisVar2.zzd != zzgka.zza()) {
                            i13 = i11;
                            if (zzgisVar2.zzd.zzc(this.zzg, i13) != null) {
                                throw null;
                            }
                            i26 = zzgit.zzi(i9, bArr, i8, i2, zzd(obj), zzgisVar);
                            obj4 = obj;
                            i24 = i2;
                            i27 = i9;
                            zzgmbVar2 = this;
                            zzgisVar3 = zzgisVar2;
                            i28 = i13;
                            obj5 = obj4;
                            i29 = i12;
                            i30 = i10;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i25 = i4;
                        } else {
                            obj4 = obj;
                        }
                    } else {
                        obj4 = obj;
                        zzgisVar2 = zzgisVar;
                    }
                    i13 = i11;
                    i26 = zzgit.zzi(i9, bArr, i8, i2, zzd(obj), zzgisVar);
                    i24 = i2;
                    i27 = i9;
                    zzgmbVar2 = this;
                    zzgisVar3 = zzgisVar2;
                    i28 = i13;
                    obj5 = obj4;
                    i29 = i12;
                    i30 = i10;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i25 = i4;
                } else {
                    i5 = 1048575;
                    zzgmbVar = this;
                    obj2 = obj;
                    i26 = i8;
                    i27 = i9;
                    i30 = i10;
                    obj3 = null;
                }
            } else {
                unsafe = unsafe2;
                i4 = i25;
                obj2 = obj5;
                zzgmbVar = zzgmbVar2;
                obj3 = null;
                i5 = 1048575;
            }
        }
        if (i31 != i5) {
            unsafe.putInt(obj2, i31, i30);
        }
        for (int i44 = zzgmbVar.zzl; i44 < zzgmbVar.zzm; i44++) {
            zzgmbVar.zzG(obj2, zzgmbVar.zzk[i44], obj3, zzgmbVar.zzo);
        }
        if (i4 == 0) {
            if (i26 != i2) {
                throw zzgla.zzg();
            }
        } else if (i26 > i2 || i27 != i4) {
            throw zzgla.zzg();
        }
        return i26;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final Object zze() {
        return ((zzgko) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = zzC(this.zzk[i2]) & 1048575;
            Object zzh = zzgns.zzh(obj, zzC);
            if (zzh != null) {
                ((zzgls) zzh).zzc();
                zzgns.zzv(obj, zzC, zzh);
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

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzh(Object obj, zzgmj zzgmjVar, zzgka zzgkaVar) throws IOException {
        Objects.requireNonNull(zzgkaVar);
        zzgni zzgniVar = this.zzo;
        zzgkb zzgkbVar = this.zzp;
        zzgkf zzgkfVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzgmjVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzgns.zzr(obj, zzC & 1048575, zzgmjVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzgns.zzs(obj, zzC & 1048575, zzgmjVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzgns.zzp(obj, zzC & 1048575, zzgmjVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzgmjVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzQ(obj, zzx)) {
                                    long j = zzC & 1048575;
                                    zzgns.zzv(obj, j, zzgky.zzg(zzgns.zzh(obj, j), zzgmjVar.zzs(zzF(zzx), zzgkaVar)));
                                    break;
                                } else {
                                    zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzs(zzF(zzx), zzgkaVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzgmjVar.zze();
                                zzgks zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzgmt.zzD(zzc, zze, obj2, zzgniVar);
                                    break;
                                }
                                zzgns.zzt(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzQ(obj, zzx)) {
                                    long j2 = zzC & 1048575;
                                    zzgns.zzv(obj, j2, zzgky.zzg(zzgns.zzh(obj, j2), zzgmjVar.zzr(zzF(zzx), zzgkaVar)));
                                    break;
                                } else {
                                    zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzr(zzF(zzx), zzgkaVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzgmjVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzgmjVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzgmjVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzgmjVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzgmjVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzgmjVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzgmjVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzgmjVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    ((zzgjp) zzgmjVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzgjp) zzgmjVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzgmjVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkaVar);
                                break;
                            case 28:
                                zzgmjVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzgmjVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmjVar.zzy(zza2);
                                obj2 = zzgmt.zzC(zzc, zza2, zzE(zzx), obj2, zzgniVar);
                                break;
                            case 31:
                                zzgmjVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzgmjVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzgmjVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzgmjVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzgmjVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzgmjVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzgmjVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzgmjVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzgmjVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzgmjVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzgmjVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzgmjVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzgmjVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmjVar.zzy(zza3);
                                obj2 = zzgmt.zzC(zzc, zza3, zzE(zzx), obj2, zzgniVar);
                                break;
                            case 45:
                                zzgmjVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzgmjVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzgmjVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzgmjVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzgmjVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkaVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzh = zzgns.zzh(obj, zzC2);
                                if (zzh == null) {
                                    zzh = zzgls.zza().zzb();
                                    zzgns.zzv(obj, zzC2, zzh);
                                } else if (zzglt.zzb(zzh)) {
                                    Object zzb2 = zzgls.zza().zzb();
                                    zzglt.zzc(zzb2, zzh);
                                    zzgns.zzv(obj, zzC2, zzb2);
                                    zzh = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzgns.zzv(obj, zzC & 1048575, Double.valueOf(zzgmjVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzgns.zzv(obj, zzC & 1048575, Float.valueOf(zzgmjVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 55:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzgns.zzv(obj, zzC & 1048575, Boolean.valueOf(zzgmjVar.zzN()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzgmjVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(obj, zzc, zzx)) {
                                    long j3 = zzC & 1048575;
                                    zzgns.zzv(obj, j3, zzgky.zzg(zzgns.zzh(obj, j3), zzgmjVar.zzs(zzF(zzx), zzgkaVar)));
                                } else {
                                    zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzs(zzF(zzx), zzgkaVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case 61:
                                zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzp());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzgmjVar.zze();
                                zzgks zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzgmt.zzD(zzc, zze2, obj2, zzgniVar);
                                    break;
                                }
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 67:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzr(zzF(zzx), zzgkaVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzgniVar.zzf();
                                }
                                if (!zzgniVar.zzp(obj2, zzgmjVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        obj2 = zzG(obj, this.zzk[i], obj2, zzgniVar);
                                    }
                                    if (obj2 != null) {
                                        zzgniVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzgkz unused) {
                        zzgniVar.zzq(zzgmjVar);
                        if (obj2 == null) {
                            obj2 = zzgniVar.zzc(obj);
                        }
                        if (!zzgniVar.zzp(obj2, zzgmjVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                obj2 = zzG(obj, this.zzk[i2], obj2, zzgniVar);
                            }
                            if (obj2 != null) {
                                zzgniVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                            obj2 = zzG(obj, this.zzk[i3], obj2, zzgniVar);
                        }
                        if (obj2 != null) {
                            zzgniVar.zzn(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object zzc2 = !this.zzh ? null : zzgkbVar.zzc(zzgkaVar, this.zzg, zzc);
                    if (zzc2 != null) {
                        if (zzgkfVar == null) {
                            zzgkfVar = zzgkbVar.zzb(obj);
                        }
                        zzgkf zzgkfVar2 = zzgkfVar;
                        obj2 = zzgkbVar.zzd(zzgmjVar, zzc2, zzgkaVar, zzgkfVar2, obj2, zzgniVar);
                        zzgkfVar = zzgkfVar2;
                    } else {
                        zzgniVar.zzq(zzgmjVar);
                        if (obj2 == null) {
                            obj2 = zzgniVar.zzc(obj);
                        }
                        if (!zzgniVar.zzp(obj2, zzgmjVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                obj2 = zzG(obj, this.zzk[i4], obj2, zzgniVar);
                            }
                            if (obj2 != null) {
                                zzgniVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    obj2 = zzG(obj, this.zzk[i5], obj2, zzgniVar);
                }
                if (obj2 != null) {
                    zzgniVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgis zzgisVar) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i, i2, zzgisVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzgisVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzgns.zzb(obj, j)) == Double.doubleToLongBits(zzgns.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzgns.zzc(obj, j)) == Float.floatToIntBits(zzgns.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzgns.zzz(obj, j) == zzgns.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzgns.zzd(obj, j) == zzgns.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzgns.zzf(obj, j) == zzgns.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
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
                    zzH = zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j));
                    break;
                case 50:
                    zzH = zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j));
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
                    if (zzgns.zzd(obj, zzz) == zzgns.zzd(obj2, zzz) && zzgmt.zzH(zzgns.zzh(obj, j), zzgns.zzh(obj2, j))) {
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

    @Override // com.google.android.gms.internal.ads.zzgmr
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
                        if (zzB == 50 && !((zzgls) zzgns.zzh(obj, zzC & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzgns.zzh(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgmr zzF = zzF(i6);
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

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzn(Object obj, zzgjw zzgjwVar) throws IOException {
        if (!this.zzj) {
            zzV(obj, zzgjwVar);
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
                        zzgjwVar.zzf(i2, zzgns.zzb(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzo(i2, zzgns.zzc(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzt(i2, zzgns.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzJ(i2, zzgns.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzr(i2, zzgns.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzm(i2, zzgns.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzk(i2, zzgns.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzb(i2, zzgns.zzz(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj, i)) {
                        zzX(i2, zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzv(i2, zzgns.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzd(i2, (zzgjg) zzgns.zzh(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzH(i2, zzgns.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzi(i2, zzgns.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzw(i2, zzgns.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzy(i2, zzgns.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzA(i2, zzgns.zzd(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzC(i2, zzgns.zzf(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(obj, i)) {
                        zzgjwVar.zzq(i2, zzgns.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzgmt.zzL(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 19:
                    zzgmt.zzP(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 20:
                    zzgmt.zzS(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 21:
                    zzgmt.zzaa(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 22:
                    zzgmt.zzR(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 23:
                    zzgmt.zzO(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 24:
                    zzgmt.zzN(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 25:
                    zzgmt.zzJ(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 26:
                    zzgmt.zzY(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                    break;
                case 27:
                    zzgmt.zzT(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, zzF(i));
                    break;
                case 28:
                    zzgmt.zzK(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                    break;
                case 29:
                    zzgmt.zzZ(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 30:
                    zzgmt.zzM(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 31:
                    zzgmt.zzU(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 32:
                    zzgmt.zzV(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 33:
                    zzgmt.zzW(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 34:
                    zzgmt.zzX(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                    break;
                case 35:
                    zzgmt.zzL(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 36:
                    zzgmt.zzP(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 37:
                    zzgmt.zzS(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 38:
                    zzgmt.zzaa(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 39:
                    zzgmt.zzR(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 40:
                    zzgmt.zzO(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 41:
                    zzgmt.zzN(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 42:
                    zzgmt.zzJ(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 43:
                    zzgmt.zzZ(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 44:
                    zzgmt.zzM(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 45:
                    zzgmt.zzU(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 46:
                    zzgmt.zzV(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 47:
                    zzgmt.zzW(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 48:
                    zzgmt.zzX(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                    break;
                case 49:
                    zzgmt.zzQ(i2, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, zzF(i));
                    break;
                case 50:
                    zzW(zzgjwVar, i2, zzgns.zzh(obj, zzC & 1048575), i);
                    break;
                case 51:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzf(i2, zzo(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzo(i2, zzp(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzt(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzJ(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzr(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzm(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzk(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzb(i2, zzU(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i2, i)) {
                        zzX(i2, zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzv(i2, zzgns.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzd(i2, (zzgjg) zzgns.zzh(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzH(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzi(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzw(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzy(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzA(i2, zzs(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzC(i2, zzD(obj, zzC & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i2, i)) {
                        zzgjwVar.zzq(i2, zzgns.zzh(obj, zzC & 1048575), zzF(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgni zzgniVar = this.zzo;
        zzgniVar.zzr(zzgniVar.zzd(obj), zzgjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j = 1048575 & zzC;
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj2, i)) {
                        zzgns.zzr(obj, j, zzgns.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj2, i)) {
                        zzgns.zzs(obj, j, zzgns.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj2, i)) {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj2, i)) {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj2, i)) {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj2, i)) {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj2, i)) {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj2, i)) {
                        zzgns.zzp(obj, j, zzgns.zzz(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj2, i)) {
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
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
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj2, i)) {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj2, i)) {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj2, i)) {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj2, i)) {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj2, i)) {
                        zzgns.zzt(obj, j, zzgns.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj2, i)) {
                        zzgns.zzu(obj, j, zzgns.zzf(obj2, j));
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
                    zzgmt.zzI(this.zzr, obj, obj2, j);
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
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
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
                        zzgns.zzv(obj, j, zzgns.zzh(obj2, j));
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
        zzgmt.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgmt.zzE(this.zzp, obj, obj2);
        }
    }
}
