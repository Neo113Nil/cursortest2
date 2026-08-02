package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzlj zzljVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i) {
        int i2 = i / 3;
        return (zzkg) this.zzd[i2 + i2 + 1];
    }

    private final zzlu zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        if (zzO(obj2, i)) {
            Object zzf = zzmv.zzf(obj, zzB);
            Object zzf2 = zzmv.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
                zzJ(obj, i);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, zzB, zzf2);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int zzB = zzB(i);
        int i2 = this.zzc[i];
        long j = zzB & 1048575;
        if (zzR(obj2, i2, i)) {
            Object zzf = zzR(obj, i2, i) ? zzmv.zzf(obj, j) : null;
            Object zzf2 = zzmv.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(zzf, zzf2));
                zzK(obj, i2, i);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, j, zzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmv.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int zzB = zzB(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
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
            long j = zzB & i2;
            switch (zzA) {
                case 0:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i6, zzmv.zza(obj, j));
                        continue;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        zzndVar.zzo(i6, zzmv.zzb(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        zzndVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        zzndVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        zzndVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        zzndVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        zzndVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        zzndVar.zzb(i6, zzmv.zzw(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        zzndVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        zzndVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        zzndVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        zzndVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        zzndVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        zzndVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 19:
                    zzlw.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 20:
                    zzlw.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 21:
                    zzlw.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 22:
                    zzlw.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 23:
                    zzlw.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 24:
                    zzlw.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 25:
                    zzlw.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    continue;
                case 26:
                    zzlw.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, zzE(i3));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, zzE(i3));
                    break;
                case 50:
                    zzM(zzndVar, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzf(i6, zzn(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzo(i6, zzo(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzt(i6, zzC(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzJ(i6, zzC(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzr(i6, zzr(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzm(i6, zzC(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzk(i6, zzr(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzb(i6, zzS(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i3)) {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                        break;
                    }
                    break;
                case 61:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzH(i6, zzr(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzi(i6, zzr(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzw(i6, zzr(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzy(i6, zzC(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzA(i6, zzr(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzC(i6, zzC(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i3)) {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j2 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j2)) != 0;
            case 2:
                return zzmv.zzd(obj, j2) != 0;
            case 3:
                return zzmv.zzd(obj, j2) != 0;
            case 4:
                return zzmv.zzc(obj, j2) != 0;
            case 5:
                return zzmv.zzd(obj, j2) != 0;
            case 6:
                return zzmv.zzc(obj, j2) != 0;
            case 7:
                return zzmv.zzw(obj, j2);
            case 8:
                Object zzf = zzmv.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j2) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j2));
            case 11:
                return zzmv.zzc(obj, j2) != 0;
            case 12:
                return zzmv.zzc(obj, j2) != 0;
            case 13:
                return zzmv.zzc(obj, j2) != 0;
            case 14:
                return zzmv.zzd(obj, j2) != 0;
            case 15:
                return zzmv.zzc(obj, j2) != 0;
            case 16:
                return zzmv.zzd(obj, j2) != 0;
            case 17:
                return zzmv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzO(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzmv.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i, (String) obj);
        } else {
            zzndVar.zzd(i, (zzjb) obj);
        }
    }

    static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zze = zzmm.zze();
        zzkcVar.zzc = zze;
        return zze;
    }

    static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
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
        int i20;
        Object[] objArr;
        String str;
        int i21;
        int i22;
        int i23;
        Field zzG;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field zzG2;
        Object obj2;
        Field zzG3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        boolean z = zzltVar.zzc() == 2;
        String zzd = zzltVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (zzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i33 = charAt17 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt16 = zzd.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i33 |= (charAt16 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt17 = i33 | (charAt16 << i34);
            i32 = i30;
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
            int i35 = i32 + 1;
            int charAt18 = zzd.charAt(i32);
            if (charAt18 >= 55296) {
                int i36 = charAt18 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    charAt11 = zzd.charAt(i35);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i36 |= (charAt11 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                charAt18 = i36 | (charAt11 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int charAt19 = zzd.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt19 = i39 | (charAt10 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            charAt = zzd.charAt(i38);
            if (charAt >= 55296) {
                int i42 = charAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                charAt = i42 | (charAt9 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int charAt20 = zzd.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                charAt20 = i45 | (charAt8 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            charAt2 = zzd.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                charAt2 = i48 | (charAt7 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int charAt21 = zzd.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                charAt21 = i51 | (charAt6 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int charAt22 = zzd.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt22 = i54 | (charAt5 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            charAt3 = zzd.charAt(i53);
            if (charAt3 >= 55296) {
                int i57 = charAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                charAt3 = i57 | (charAt4 << i58);
                i56 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i32 = i56;
            int i59 = charAt21;
            i4 = charAt20;
            i5 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i60 = charAt3 + i5;
        int i61 = charAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int charAt23 = zzd.charAt(i32);
            if (charAt23 >= c) {
                int i66 = charAt23 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    charAt15 = zzd.charAt(i67);
                    if (charAt15 < c) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                charAt23 = i66 | (charAt15 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int charAt24 = zzd.charAt(i14);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                charAt24 = i70 | (charAt14 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = charAt24 & 255;
            int i74 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        charAt13 = zzd.charAt(i77);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    charAt25 = i76 | (charAt13 << i78);
                    i25 = i27;
                } else {
                    i18 = i4;
                    i25 = i75;
                }
                int i79 = i73 - 51;
                int i80 = i25;
                if (i79 == 9 || i79 == 17) {
                    int i81 = i63 / 3;
                    i26 = i2 + 1;
                    objArr2[i81 + i81 + 1] = zze[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i82 = i63 / 3;
                        i26 = i2 + 1;
                        objArr2[i82 + i82 + 1] = zze[i2];
                    }
                    int i83 = charAt25 + charAt25;
                    obj = zze[i83];
                    if (obj instanceof Field) {
                        zzG2 = zzG(cls, (String) obj);
                        zze[i83] = zzG2;
                    } else {
                        zzG2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzG2);
                    int i84 = i83 + 1;
                    obj2 = zze[i84];
                    if (obj2 instanceof Field) {
                        zzG3 = zzG(cls, (String) obj2);
                        zze[i84] = zzG3;
                    } else {
                        zzG3 = (Field) obj2;
                    }
                    str = zzd;
                    i21 = i3;
                    objArr = objArr2;
                    i19 = i2;
                    i22 = i80;
                    i20 = (int) unsafe.objectFieldOffset(zzG3);
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                }
                i2 = i26;
                int i832 = charAt25 + charAt25;
                obj = zze[i832];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzG2);
                int i842 = i832 + 1;
                obj2 = zze[i842];
                if (obj2 instanceof Field) {
                }
                str = zzd;
                i21 = i3;
                objArr = objArr2;
                i19 = i2;
                i22 = i80;
                i20 = (int) unsafe.objectFieldOffset(zzG3);
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i85 = i2 + 1;
                Field zzG4 = zzG(cls, (String) zze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i86 = i63 / 3;
                    objArr2[i86 + i86 + 1] = zzG4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i87 = i63 / 3;
                        i24 = i2 + 2;
                        objArr2[i87 + i87 + 1] = zze[i85];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i88 = i63 / 3;
                            i24 = i2 + 2;
                            objArr2[i88 + i88 + 1] = zze[i85];
                        }
                    } else if (i73 == 50) {
                        int i89 = i61 + 1;
                        iArr[i61] = i63;
                        int i90 = i63 / 3;
                        int i91 = i90 + i90;
                        int i92 = i2 + 2;
                        objArr2[i91] = zze[i85];
                        if ((charAt24 & 2048) != 0) {
                            i85 = i2 + 3;
                            objArr2[i91 + 1] = zze[i92];
                            i61 = i89;
                        } else {
                            i61 = i89;
                            i19 = i92;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                            i20 = 1048575;
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i73 > 17) {
                                str = zzd;
                                i21 = i3;
                                i22 = i16;
                                i23 = 0;
                            } else {
                                int i93 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i94 = charAt26 & 8191;
                                    int i95 = 13;
                                    while (true) {
                                        i22 = i93 + 1;
                                        charAt12 = zzd.charAt(i93);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i94 |= (charAt12 & 8191) << i95;
                                        i95 += 13;
                                        i93 = i22;
                                    }
                                    charAt26 = i94 | (charAt12 << i95);
                                } else {
                                    i22 = i93;
                                }
                                int i96 = i3 + i3 + (charAt26 / 32);
                                Object obj3 = zze[i96];
                                str = zzd;
                                if (obj3 instanceof Field) {
                                    zzG = (Field) obj3;
                                } else {
                                    zzG = zzG(cls, (String) obj3);
                                    zze[i96] = zzG;
                                }
                                i21 = i3;
                                i23 = charAt26 % 32;
                                i20 = (int) unsafe.objectFieldOffset(zzG);
                            }
                            if (i73 >= 18 && i73 <= 49) {
                                iArr[i62] = objectFieldOffset;
                                i62++;
                            }
                        }
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                    i20 = 1048575;
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i21 = i3;
                    i22 = i16;
                    i23 = 0;
                    if (i73 >= 18) {
                        iArr[i62] = objectFieldOffset;
                        i62++;
                    }
                }
                i19 = i85;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                i20 = 1048575;
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i21 = i3;
                i22 = i16;
                i23 = 0;
                if (i73 >= 18) {
                }
            }
            int i97 = i63 + 1;
            iArr2[i63] = charAt23;
            int i98 = i63 + 2;
            iArr2[i97] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | objectFieldOffset;
            i63 += 3;
            iArr2[i98] = (i23 << 20) | i20;
            i3 = i21;
            i2 = i19;
            charAt = i17;
            charAt3 = i74;
            i32 = i22;
            length = i15;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzlm(iArr3, objArr2, charAt, i4, zzltVar.zza(), z, false, iArr, charAt3, i60, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i2;
        int zzu;
        int zzi;
        int zzz;
        int zzA8;
        int i3;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd2;
        int zzA13;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i6 < this.zzc.length) {
            int zzB3 = zzB(i6);
            int[] iArr = this.zzc;
            int i10 = iArr[i6];
            int zzA14 = zzA(zzB3);
            if (zzA14 <= 17) {
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
            long j = zzB3 & i5;
            switch (zzA14) {
                case 0:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i7 += zzA5;
                        break;
                    }
                case 1:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i7 += zzA5;
                        break;
                    }
                case 2:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzjj.zzA(i10 << 3);
                        zzB = zzjj.zzB(j2);
                        i7 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzjj.zzA(i10 << 3);
                        zzB = zzjj.zzB(j3);
                        i7 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i10 << 3);
                        zzv = zzjj.zzv(i13);
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 5:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i7 += zzA5;
                        break;
                    }
                case 6:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i7 += zzA5;
                        break;
                    }
                case 7:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzjj.zzA(i10 << 3) + 1;
                        i7 += zzA5;
                        break;
                    }
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjb) {
                            zzA6 = zzjj.zzA(i10 << 3);
                            zzd = ((zzjb) object).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i2 = zzA6 + zzA7 + zzd;
                            i7 += i2;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i10 << 3);
                            zzv = zzjj.zzy((String) object);
                            i2 = zzA4 + zzv;
                            i7 += i2;
                        }
                    }
                case 9:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzlw.zzo(i10, unsafe.getObject(obj, j), zzE(i6));
                        i7 += zzA5;
                        break;
                    }
                case 10:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        zzA6 = zzjj.zzA(i10 << 3);
                        zzd = zzjbVar.zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i2 = zzA6 + zzA7 + zzd;
                        i7 += i2;
                        break;
                    }
                case 11:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i10 << 3);
                        zzv = zzjj.zzA(i14);
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 12:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i10 << 3);
                        zzv = zzjj.zzv(i15);
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 13:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i7 += zzA5;
                        break;
                    }
                case 14:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i7 += zzA5;
                        break;
                    }
                case 15:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i10 << 3);
                        zzv = zzjj.zzA((i16 >> 31) ^ (i16 + i16));
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 16:
                    if ((i & i8) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i7 += zzjj.zzA(i10 << 3) + zzjj.zzB((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzjj.zzu(i10, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        i7 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzlw.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 19:
                    zzA5 = zzlw.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 20:
                    zzA5 = zzlw.zzm(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 21:
                    zzA5 = zzlw.zzx(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 22:
                    zzA5 = zzlw.zzk(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 23:
                    zzA5 = zzlw.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 24:
                    zzA5 = zzlw.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 25:
                    zzA5 = zzlw.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 26:
                    zzu = zzlw.zzu(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzu;
                    break;
                case 27:
                    zzu = zzlw.zzp(i10, (List) unsafe.getObject(obj, j), zzE(i6));
                    i7 += zzu;
                    break;
                case 28:
                    zzu = zzlw.zzc(i10, (List) unsafe.getObject(obj, j));
                    i7 += zzu;
                    break;
                case 29:
                    zzu = zzlw.zzv(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 30:
                    zzu = zzlw.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 31:
                    zzu = zzlw.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 32:
                    zzu = zzlw.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 33:
                    zzu = zzlw.zzq(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 34:
                    zzu = zzlw.zzs(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 35:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 36:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 37:
                    zzi = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 38:
                    zzi = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 39:
                    zzi = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 40:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 41:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 42:
                    zzi = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 43:
                    zzi = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 44:
                    zzi = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 45:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 46:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 47:
                    zzi = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 48:
                    zzi = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i10);
                        zzA8 = zzjj.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 49:
                    zzu = zzlw.zzj(i10, (List) unsafe.getObject(obj, j), zzE(i6));
                    i7 += zzu;
                    break;
                case 50:
                    zzle.zza(i10, unsafe.getObject(obj, j), zzF(i6));
                    break;
                case 51:
                    if (zzR(obj, i10, i6)) {
                        zzA9 = zzjj.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i7 += zzu;
                    }
                    break;
                case 52:
                    if (zzR(obj, i10, i6)) {
                        zzA10 = zzjj.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i7 += zzu;
                    }
                    break;
                case 53:
                    if (zzR(obj, i10, i6)) {
                        long zzC = zzC(obj, j);
                        zzA11 = zzjj.zzA(i10 << 3);
                        zzB2 = zzjj.zzB(zzC);
                        i7 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzR(obj, i10, i6)) {
                        long zzC2 = zzC(obj, j);
                        zzA11 = zzjj.zzA(i10 << 3);
                        zzB2 = zzjj.zzB(zzC2);
                        i7 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzR(obj, i10, i6)) {
                        int zzr = zzr(obj, j);
                        i3 = zzjj.zzA(i10 << 3);
                        zzi = zzjj.zzv(zzr);
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 56:
                    if (zzR(obj, i10, i6)) {
                        zzA9 = zzjj.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i7 += zzu;
                    }
                    break;
                case 57:
                    if (zzR(obj, i10, i6)) {
                        zzA10 = zzjj.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i7 += zzu;
                    }
                    break;
                case 58:
                    if (zzR(obj, i10, i6)) {
                        zzu = zzjj.zzA(i10 << 3) + 1;
                        i7 += zzu;
                    }
                    break;
                case 59:
                    if (zzR(obj, i10, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            zzA12 = zzjj.zzA(i10 << 3);
                            zzd2 = ((zzjb) object2).zzd();
                            zzA13 = zzjj.zzA(zzd2);
                            i4 = zzA12 + zzA13 + zzd2;
                            i7 += i4;
                        } else {
                            i3 = zzjj.zzA(i10 << 3);
                            zzi = zzjj.zzy((String) object2);
                            i4 = i3 + zzi;
                            i7 += i4;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i10, i6)) {
                        zzu = zzlw.zzo(i10, unsafe.getObject(obj, j), zzE(i6));
                        i7 += zzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i10, i6)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        zzA12 = zzjj.zzA(i10 << 3);
                        zzd2 = zzjbVar2.zzd();
                        zzA13 = zzjj.zzA(zzd2);
                        i4 = zzA12 + zzA13 + zzd2;
                        i7 += i4;
                    }
                    break;
                case 62:
                    if (zzR(obj, i10, i6)) {
                        int zzr2 = zzr(obj, j);
                        i3 = zzjj.zzA(i10 << 3);
                        zzi = zzjj.zzA(zzr2);
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 63:
                    if (zzR(obj, i10, i6)) {
                        int zzr3 = zzr(obj, j);
                        i3 = zzjj.zzA(i10 << 3);
                        zzi = zzjj.zzv(zzr3);
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 64:
                    if (zzR(obj, i10, i6)) {
                        zzA10 = zzjj.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i7 += zzu;
                    }
                    break;
                case 65:
                    if (zzR(obj, i10, i6)) {
                        zzA9 = zzjj.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i7 += zzu;
                    }
                    break;
                case 66:
                    if (zzR(obj, i10, i6)) {
                        int zzr4 = zzr(obj, j);
                        i3 = zzjj.zzA(i10 << 3);
                        zzi = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i4 = i3 + zzi;
                        i7 += i4;
                    }
                    break;
                case 67:
                    if (zzR(obj, i10, i6)) {
                        long zzC3 = zzC(obj, j);
                        i7 += zzjj.zzA(i10 << 3) + zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                    }
                    break;
                case 68:
                    if (zzR(obj, i10, i6)) {
                        zzu = zzjj.zzu(i10, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        i7 += zzu;
                    }
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int zza2 = i7 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzz;
        int zzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzB2 = zzB(i3);
            int zzA9 = zzA(zzB2);
            int i4 = this.zzc[i3];
            long j = zzB2 & 1048575;
            if (zzA9 >= zzju.DOUBLE_LIST_PACKED.zza() && zzA9 <= zzju.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i3)) {
                        long zzd2 = zzmv.zzd(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzd2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i3)) {
                        long zzd3 = zzmv.zzd(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzd3);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i3)) {
                        int zzc = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzc);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i3)) {
                        zzA5 = zzjj.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i3)) {
                        break;
                    } else {
                        Object zzf = zzmv.zzf(obj, j);
                        if (zzf instanceof zzjb) {
                            zzA6 = zzjj.zzA(i4 << 3);
                            zzd = ((zzjb) zzf).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i4 << 3);
                            zzv = zzjj.zzy((String) zzf);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzO(obj, i3)) {
                        zzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i3)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j);
                        zzA6 = zzjj.zzA(i4 << 3);
                        zzd = zzjbVar.zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i3)) {
                        int zzc2 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA(zzc2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i3)) {
                        int zzc3 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzc3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i3)) {
                        int zzc4 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i3)) {
                        long zzd4 = zzmv.zzd(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i3)) {
                        zzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzlw.zzx(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 26:
                    zzo = zzlw.zzu(i4, (List) zzmv.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 27:
                    zzo = zzlw.zzp(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i4, (List) zzmv.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 30:
                    zzo = zzlw.zzd(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 31:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 35:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += zzo;
                    break;
                case 50:
                    zzle.zza(i4, zzmv.zzf(obj, j), zzF(i3));
                    break;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i4, i3)) {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzC);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i4, i3)) {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzC2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i4, i3)) {
                        int zzr = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzr);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i4, i3)) {
                        zzA5 = zzjj.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i4, i3)) {
                        break;
                    } else {
                        Object zzf2 = zzmv.zzf(obj, j);
                        if (zzf2 instanceof zzjb) {
                            zzA6 = zzjj.zzA(i4 << 3);
                            zzd = ((zzjb) zzf2).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i4 << 3);
                            zzv = zzjj.zzy((String) zzf2);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzR(obj, i4, i3)) {
                        zzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i4, i3)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j);
                        zzA6 = zzjj.zzA(i4 << 3);
                        zzd = zzjbVar2.zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i4, i3)) {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA(zzr2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i4, i3)) {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzr3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i4, i3)) {
                        int zzr4 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i4, i3)) {
                        long zzC3 = zzC(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i4, i3)) {
                        zzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i2 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzip.zzj(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzip.zzj(bArr, i, zzioVar);
                    int i9 = zzioVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzna.zzf(bArr, zzj2, zzj2 + i9)) {
                            throw zzkm.zzc();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzkk.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzip.zzd(zzE(i8), bArr, i, i2, zzioVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzip.zza(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, zzioVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzip.zzj(bArr, i, zzioVar);
                    int i10 = zzioVar.zza;
                    zzkg zzD = zzD(i8);
                    if (zzD == null || zzD.zza(i10)) {
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
                    int zzj4 = zzip.zzj(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzip.zzc(zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzioVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object2, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        byte b;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int zzm;
        int zzd;
        int i9;
        int i10;
        int i11;
        zzlm<T> zzlmVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i13 = 1048575;
        int i14 = -1;
        int i15 = i;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i15 < i12) {
            int i20 = i15 + 1;
            byte b2 = bArr2[i15];
            if (b2 < 0) {
                i3 = zzip.zzk(b2, bArr2, i20, zzioVar2);
                b = zzioVar2.zza;
            } else {
                b = b2;
                i3 = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            int zzx = i21 > i16 ? zzlmVar.zzx(i21, i17 / 3) : zzlmVar.zzw(i21);
            if (zzx == i14) {
                i4 = i3;
                i5 = i21;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i23 = iArr[zzx + 1];
                int zzA = zzA(i23);
                long j = i23 & i13;
                if (zzA <= 17) {
                    int i24 = iArr[zzx + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = i24 & 1048575;
                    if (i26 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i18);
                        }
                        if (i26 != 1048575) {
                            i18 = unsafe2.getInt(obj2, i26);
                        }
                        i19 = i26;
                    }
                    switch (zzA) {
                        case 0:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 1) {
                                zzmv.zzo(obj2, j, Double.longBitsToDouble(zzip.zzn(bArr2, i8)));
                                i15 = i8 + 8;
                                i18 |= i25;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 1:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 5) {
                                zzmv.zzp(obj2, j, Float.intBitsToFloat(zzip.zzb(bArr2, i8)));
                                i15 = i8 + 4;
                                i18 |= i25;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 2:
                        case 3:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 0) {
                                zzm = zzip.zzm(bArr2, i8, zzioVar2);
                                unsafe2.putLong(obj, j, zzioVar2.zzb);
                                i18 |= i25;
                                i15 = zzm;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 4:
                        case 11:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 0) {
                                i15 = zzip.zzj(bArr2, i8, zzioVar2);
                                unsafe2.putInt(obj2, j, zzioVar2.zza);
                                i18 |= i25;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 5:
                        case 14:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 1) {
                                i8 = i3;
                                unsafe2.putLong(obj, j, zzip.zzn(bArr2, i3));
                                i15 = i8 + 8;
                                i18 |= i25;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 6:
                        case 13:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 5) {
                                unsafe2.putInt(obj2, j, zzip.zzb(bArr2, i3));
                                i15 = i3 + 4;
                                i18 |= i25;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 7:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 0) {
                                i15 = zzip.zzm(bArr2, i3, zzioVar2);
                                zzmv.zzm(obj2, j, zzioVar2.zzb != 0);
                                i18 |= i25;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 8:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 2) {
                                i15 = (536870912 & i23) == 0 ? zzip.zzg(bArr2, i3, zzioVar2) : zzip.zzh(bArr2, i3, zzioVar2);
                                unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                i18 |= i25;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 9:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 2) {
                                zzd = zzip.zzd(zzlmVar.zzE(i7), bArr2, i3, i12, zzioVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i18 |= i25;
                                i15 = zzd;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 10:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 2) {
                                zzd = zzip.zza(bArr2, i3, zzioVar2);
                                unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                i18 |= i25;
                                i15 = zzd;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 12:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 0) {
                                zzd = zzip.zzj(bArr2, i3, zzioVar2);
                                unsafe2.putInt(obj2, j, zzioVar2.zza);
                                i18 |= i25;
                                i15 = zzd;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 15:
                            zzioVar2 = zzioVar;
                            i7 = zzx;
                            i5 = i21;
                            if (i22 == 0) {
                                zzd = zzip.zzj(bArr2, i3, zzioVar2);
                                unsafe2.putInt(obj2, j, zzjf.zzb(zzioVar2.zza));
                                i18 |= i25;
                                i15 = zzd;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 16:
                            if (i22 != 0) {
                                i5 = i21;
                                i7 = zzx;
                                i8 = i3;
                                i4 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                break;
                            } else {
                                zzioVar2 = zzioVar;
                                zzm = zzip.zzm(bArr2, i3, zzioVar2);
                                i7 = zzx;
                                i5 = i21;
                                unsafe2.putLong(obj, j, zzjf.zzc(zzioVar2.zzb));
                                i18 |= i25;
                                i15 = zzm;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                        default:
                            i5 = i21;
                            i7 = zzx;
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                    }
                } else {
                    zzioVar2 = zzioVar;
                    i7 = zzx;
                    int i27 = i3;
                    i5 = i21;
                    if (zzA == 27) {
                        if (i22 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe2.getObject(obj2, j);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzkjVar);
                            }
                            i15 = zzip.zze(zzlmVar.zzE(i7), b, bArr, i27, i2, zzkjVar, zzioVar);
                            i18 = i18;
                            i17 = i7;
                            i16 = i5;
                        } else {
                            i9 = i27;
                            i10 = i18;
                            i11 = i19;
                            unsafe = unsafe2;
                            i6 = i7;
                        }
                    } else if (zzA <= 49) {
                        i10 = i18;
                        i11 = i19;
                        unsafe = unsafe2;
                        i6 = i7;
                        i15 = zzv(obj, bArr, i27, i2, b, i5, i22, i7, i23, zzA, j, zzioVar);
                        if (i15 != i27) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i12 = i2;
                            zzioVar2 = zzioVar;
                            i19 = i11;
                            i16 = i5;
                            i18 = i10;
                            i17 = i6;
                            unsafe2 = unsafe;
                            i14 = -1;
                            i13 = 1048575;
                            zzlmVar = this;
                        } else {
                            i4 = i15;
                            i19 = i11;
                            i18 = i10;
                        }
                    } else {
                        i9 = i27;
                        i10 = i18;
                        i11 = i19;
                        unsafe = unsafe2;
                        i6 = i7;
                        if (zzA != 50) {
                            i15 = zzt(obj, bArr, i9, i2, b, i5, i22, i23, zzA, j, i6, zzioVar);
                            if (i15 != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                zzioVar2 = zzioVar;
                                i19 = i11;
                                i16 = i5;
                                i18 = i10;
                                i17 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                zzlmVar = this;
                            } else {
                                i4 = i15;
                                i19 = i11;
                                i18 = i10;
                            }
                        } else if (i22 == 2) {
                            i15 = zzs(obj, bArr, i9, i2, i6, j, zzioVar);
                            if (i15 != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                zzioVar2 = zzioVar;
                                i19 = i11;
                                i16 = i5;
                                i18 = i10;
                                i17 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                zzlmVar = this;
                            } else {
                                i4 = i15;
                                i19 = i11;
                                i18 = i10;
                            }
                        }
                    }
                    i4 = i9;
                    i19 = i11;
                    i18 = i10;
                }
                i14 = -1;
                i13 = 1048575;
            }
            i15 = zzip.zzi(b, bArr, i4, i2, zzd(obj), zzioVar);
            zzlmVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i12 = i2;
            zzioVar2 = zzioVar;
            i16 = i5;
            i17 = i6;
            unsafe2 = unsafe;
            i14 = -1;
            i13 = 1048575;
        }
        int i28 = i18;
        int i29 = i19;
        Unsafe unsafe3 = unsafe2;
        if (i29 != 1048575) {
            unsafe3.putInt(obj, i29, i28);
        }
        if (i15 == i2) {
            return i15;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzio zzioVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12 = i;
        Unsafe unsafe = zzb;
        zzkj zzkjVar = (zzkj) unsafe.getObject(obj, j2);
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkjVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar;
                    int zzj2 = zzip.zzj(bArr, i12, zzioVar);
                    int i13 = zzioVar.zza + zzj2;
                    while (zzj2 < i13) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i13) {
                        return zzj2;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = zzip.zzj(bArr, i8, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar;
                    int zzj3 = zzip.zzj(bArr, i12, zzioVar);
                    int i14 = zzioVar.zza + zzj3;
                    while (zzj3 < i14) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i14) {
                        return zzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = zzip.zzj(bArr, i9, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i12)));
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
                    zzky zzkyVar = (zzky) zzkjVar;
                    int zzj4 = zzip.zzj(bArr, i12, zzioVar);
                    int i15 = zzioVar.zza + zzj4;
                    while (zzj4 < i15) {
                        zzj4 = zzip.zzm(bArr, zzj4, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (zzj4 == i15) {
                        return zzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar;
                    int zzm = zzip.zzm(bArr, i12, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzip.zzj(bArr, zzm, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm;
                        }
                        zzm = zzip.zzm(bArr, zzj5, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return zzm;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzip.zzf(bArr, i12, zzkjVar, zzioVar);
                }
                if (i5 == 0) {
                    return zzip.zzl(i3, bArr, i, i2, zzkjVar, zzioVar);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar;
                    int zzj6 = zzip.zzj(bArr, i12, zzioVar);
                    int i16 = zzioVar.zza + zzj6;
                    while (zzj6 < i16) {
                        zzkyVar3.zzg(zzip.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i16) {
                        return zzj6;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar;
                    zzkyVar4.zzg(zzip.zzn(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = zzip.zzj(bArr, i10, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, i12));
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
                    zzkd zzkdVar = (zzkd) zzkjVar;
                    int zzj7 = zzip.zzj(bArr, i12, zzioVar);
                    int i17 = zzioVar.zza + zzj7;
                    while (zzj7 < i17) {
                        zzkdVar.zzh(zzip.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i17) {
                        return zzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar;
                    zzkdVar2.zzh(zzip.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = zzip.zzj(bArr, i11, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i12;
            case 25:
            case 42:
                if (i5 == 2) {
                    zziq zziqVar = (zziq) zzkjVar;
                    zzj = zzip.zzj(bArr, i12, zzioVar);
                    int i18 = zzioVar.zza + zzj;
                    while (zzj < i18) {
                        zzj = zzip.zzm(bArr, zzj, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (zzj != i18) {
                        throw zzkm.zzf();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar;
                    int zzm2 = zzip.zzm(bArr, i12, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzip.zzj(bArr, zzm2, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzip.zzm(bArr, zzj8, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i12;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i12 = zzip.zzj(bArr, i12, zzioVar);
                        int i19 = zzioVar.zza;
                        if (i19 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i19 == 0) {
                            zzkjVar.add("");
                        } else {
                            zzkjVar.add(new String(bArr, i12, i19, zzkk.zzb));
                            i12 += i19;
                        }
                        while (i12 < i2) {
                            int zzj9 = zzip.zzj(bArr, i12, zzioVar);
                            if (i3 == zzioVar.zza) {
                                i12 = zzip.zzj(bArr, zzj9, zzioVar);
                                int i20 = zzioVar.zza;
                                if (i20 < 0) {
                                    throw zzkm.zzd();
                                }
                                if (i20 == 0) {
                                    zzkjVar.add("");
                                } else {
                                    zzkjVar.add(new String(bArr, i12, i20, zzkk.zzb));
                                    i12 += i20;
                                }
                            }
                        }
                    } else {
                        i12 = zzip.zzj(bArr, i12, zzioVar);
                        int i21 = zzioVar.zza;
                        if (i21 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i21 == 0) {
                            zzkjVar.add("");
                        } else {
                            int i22 = i12 + i21;
                            if (!zzna.zzf(bArr, i12, i22)) {
                                throw zzkm.zzc();
                            }
                            zzkjVar.add(new String(bArr, i12, i21, zzkk.zzb));
                            i12 = i22;
                        }
                        while (i12 < i2) {
                            int zzj10 = zzip.zzj(bArr, i12, zzioVar);
                            if (i3 == zzioVar.zza) {
                                i12 = zzip.zzj(bArr, zzj10, zzioVar);
                                int i23 = zzioVar.zza;
                                if (i23 < 0) {
                                    throw zzkm.zzd();
                                }
                                if (i23 == 0) {
                                    zzkjVar.add("");
                                } else {
                                    int i24 = i12 + i23;
                                    if (!zzna.zzf(bArr, i12, i24)) {
                                        throw zzkm.zzc();
                                    }
                                    zzkjVar.add(new String(bArr, i12, i23, zzkk.zzb));
                                    i12 = i24;
                                }
                            }
                        }
                    }
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return zzip.zze(zzE(i6), i3, bArr, i, i2, zzkjVar, zzioVar);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int zzj11 = zzip.zzj(bArr, i12, zzioVar);
                    int i25 = zzioVar.zza;
                    if (i25 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i25 > bArr.length - zzj11) {
                        throw zzkm.zzf();
                    }
                    if (i25 == 0) {
                        zzkjVar.add(zzjb.zzb);
                    } else {
                        zzkjVar.add(zzjb.zzl(bArr, zzj11, i25));
                        zzj11 += i25;
                    }
                    while (zzj11 < i2) {
                        int zzj12 = zzip.zzj(bArr, zzj11, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzip.zzj(bArr, zzj12, zzioVar);
                        int i26 = zzioVar.zza;
                        if (i26 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i26 > bArr.length - zzj11) {
                            throw zzkm.zzf();
                        }
                        if (i26 == 0) {
                            zzkjVar.add(zzjb.zzb);
                        } else {
                            zzkjVar.add(zzjb.zzl(bArr, zzj11, i26));
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
                        zzj = zzip.zzl(i3, bArr, i, i2, zzkjVar, zzioVar);
                    }
                    return i12;
                }
                zzj = zzip.zzf(bArr, i12, zzkjVar, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object zzC = zzlw.zzC(i4, zzkjVar, zzD(i6), zzmmVar, this.zzn);
                if (zzC != null) {
                    zzkcVar.zzc = (zzmm) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar;
                    int zzj13 = zzip.zzj(bArr, i12, zzioVar);
                    int i27 = zzioVar.zza + zzj13;
                    while (zzj13 < i27) {
                        zzj13 = zzip.zzj(bArr, zzj13, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (zzj13 == i27) {
                        return zzj13;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar;
                    int zzj14 = zzip.zzj(bArr, i12, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (zzj14 < i2) {
                        int zzj15 = zzip.zzj(bArr, zzj14, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzj14;
                        }
                        zzj14 = zzip.zzj(bArr, zzj15, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return zzj14;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar;
                    int zzj16 = zzip.zzj(bArr, i12, zzioVar);
                    int i28 = zzioVar.zza + zzj16;
                    while (zzj16 < i28) {
                        zzj16 = zzip.zzm(bArr, zzj16, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (zzj16 == i28) {
                        return zzj16;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar;
                    int zzm3 = zzip.zzm(bArr, i12, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (zzm3 < i2) {
                        int zzj17 = zzip.zzj(bArr, zzm3, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzip.zzm(bArr, zzj17, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return zzm3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    zzlu zzE = zzE(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = zzip.zzc(zzE, bArr, i, i2, i29, zzioVar);
                    zzkjVar.add(zzioVar.zzc);
                    while (zzc < i2) {
                        int zzj18 = zzip.zzj(bArr, zzc, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzc;
                        }
                        zzc = zzip.zzc(zzE, bArr, zzj18, i2, i29, zzioVar);
                        zzkjVar.add(zzioVar.zzc);
                    }
                    return zzc;
                }
                return i12;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzB = zzB(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzB;
            int i5 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzkk.zza(zzmv.zzw(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
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
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zza(zzS(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0368, code lost:
    
        if (r0 != r21) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x036a, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r18;
        r3 = r19;
        r5 = r21;
        r2 = r24;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0384, code lost:
    
        r2 = r0;
        r7 = r18;
        r6 = r25;
        r0 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03b4, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03d9, code lost:
    
        if (r0 != r15) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzlm<T> zzlmVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj3;
        zzio zzioVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int zzg;
        zzlm<T> zzlmVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i22 = i2;
        int i23 = i3;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i24 = i;
        int i25 = 0;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (true) {
            if (i24 < i22) {
                int i30 = i24 + 1;
                byte b = bArr2[i24];
                if (b < 0) {
                    int zzk = zzip.zzk(b, bArr2, i30, zzioVar3);
                    i5 = zzioVar3.zza;
                    i30 = zzk;
                } else {
                    i5 = b;
                }
                int i31 = i5 >>> 3;
                int i32 = i5 & 7;
                int zzx = i31 > i26 ? zzlmVar2.zzx(i31, i27 / 3) : zzlmVar2.zzw(i31);
                if (zzx == -1) {
                    i6 = i31;
                    i7 = i30;
                    i8 = i5;
                    i9 = i28;
                    unsafe = unsafe2;
                    i10 = i23;
                    i11 = 0;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i33 = iArr[zzx + 1];
                    int zzA = zzA(i33);
                    int i34 = i30;
                    long j = i33 & 1048575;
                    if (zzA <= 17) {
                        int i35 = iArr[zzx + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i29) {
                            i13 = i5;
                            if (i29 != 1048575) {
                                unsafe2.putInt(obj4, i29, i28);
                            }
                            i28 = unsafe2.getInt(obj4, i37);
                            i14 = i37;
                        } else {
                            i13 = i5;
                            i14 = i29;
                        }
                        int i38 = i28;
                        switch (zzA) {
                            case 0:
                                i16 = zzx;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 1) {
                                    zzmv.zzo(obj4, j, Double.longBitsToDouble(zzip.zzn(bArr2, i18)));
                                    i24 = i18 + 8;
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i23 = i3;
                                    i27 = i16;
                                    i25 = i13;
                                    i29 = i14;
                                    i22 = i2;
                                    break;
                                } else {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 1:
                                i16 = zzx;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 5) {
                                    zzmv.zzp(obj4, j, Float.intBitsToFloat(zzip.zzb(bArr2, i18)));
                                    i24 = i18 + 4;
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i23 = i3;
                                    i27 = i16;
                                    i25 = i13;
                                    i29 = i14;
                                    i22 = i2;
                                    break;
                                } else {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = zzx;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 0) {
                                    int zzm = zzip.zzm(bArr2, i18, zzioVar3);
                                    unsafe2.putLong(obj, j, zzioVar3.zzb);
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i23 = i3;
                                    i24 = zzm;
                                    i27 = i16;
                                    i25 = i13;
                                    i29 = i14;
                                    i22 = i2;
                                    break;
                                } else {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = zzx;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 0) {
                                    i24 = zzip.zzj(bArr2, i18, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzioVar3.zza);
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i23 = i3;
                                    i27 = i16;
                                    i25 = i13;
                                    i29 = i14;
                                    i22 = i2;
                                    break;
                                } else {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 5:
                            case 14:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 1) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    unsafe2.putLong(obj, j, zzip.zzn(bArr2, i21));
                                    i24 = i18 + 8;
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i23 = i3;
                                    i27 = i16;
                                    i25 = i13;
                                    i29 = i14;
                                    i22 = i2;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 6:
                            case 13:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj4, j, zzip.zzb(bArr2, i21));
                                    i24 = i21 + 4;
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i27 = i19;
                                    i25 = i20;
                                    i29 = i14;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 7:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 0) {
                                    i24 = zzip.zzm(bArr2, i21, zzioVar3);
                                    zzmv.zzm(obj4, j, zzioVar3.zzb != 0);
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i27 = i19;
                                    i25 = i20;
                                    i29 = i14;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 8:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 2) {
                                    zzg = (536870912 & i33) == 0 ? zzip.zzg(bArr2, i21, zzioVar3) : zzip.zzh(bArr2, i21, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i28 = i38 | i36;
                                    i24 = zzg;
                                    i27 = i19;
                                    i25 = i20;
                                    i29 = i14;
                                    i26 = i17;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 9:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 2) {
                                    zzg = zzip.zzd(zzlmVar2.zzE(i19), bArr2, i21, i22, zzioVar3);
                                    if ((i38 & i36) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i28 = i38 | i36;
                                    i24 = zzg;
                                    i27 = i19;
                                    i25 = i20;
                                    i29 = i14;
                                    i26 = i17;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 10:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 2) {
                                    zzg = zzip.zza(bArr2, i21, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i28 = i38 | i36;
                                    i24 = zzg;
                                    i27 = i19;
                                    i25 = i20;
                                    i29 = i14;
                                    i26 = i17;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 12:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 != 0) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                } else {
                                    zzg = zzip.zzj(bArr2, i21, zzioVar3);
                                    int i39 = zzioVar3.zza;
                                    zzkg zzD = zzlmVar2.zzD(i19);
                                    if (zzD == null || zzD.zza(i39)) {
                                        unsafe2.putInt(obj4, j, i39);
                                        i28 = i38 | i36;
                                        i24 = zzg;
                                        i27 = i19;
                                        i25 = i20;
                                        i29 = i14;
                                        i26 = i17;
                                        i23 = i3;
                                        break;
                                    } else {
                                        zzd(obj).zzh(i20, Long.valueOf(i39));
                                        i24 = zzg;
                                        i27 = i19;
                                        i28 = i38;
                                        i25 = i20;
                                        i29 = i14;
                                        i26 = i17;
                                        i23 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i19 = zzx;
                                i20 = i13;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 0) {
                                    i24 = zzip.zzj(bArr2, i21, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzjf.zzb(zzioVar3.zza));
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i27 = i19;
                                    i25 = i20;
                                    i29 = i14;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            case 16:
                                if (i32 == 0) {
                                    int zzm2 = zzip.zzm(bArr2, i34, zzioVar3);
                                    int i40 = zzx;
                                    i20 = i13;
                                    unsafe2.putLong(obj, j, zzjf.zzc(zzioVar3.zzb));
                                    i28 = i38 | i36;
                                    i26 = i31;
                                    i24 = zzm2;
                                    i27 = i40;
                                    i25 = i20;
                                    i29 = i14;
                                    i23 = i3;
                                    break;
                                } else {
                                    i17 = i31;
                                    i16 = zzx;
                                    i18 = i34;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                            default:
                                i16 = zzx;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 3) {
                                    i24 = zzip.zzc(zzlmVar2.zzE(i16), bArr, i18, i2, (i17 << 3) | 4, zzioVar);
                                    if ((i38 & i36) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i28 = i38 | i36;
                                    i26 = i17;
                                    i23 = i3;
                                    i27 = i16;
                                    i25 = i13;
                                    i29 = i14;
                                    i22 = i2;
                                    break;
                                } else {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i38;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i29 = i14;
                                    break;
                                }
                        }
                    } else {
                        int i41 = zzx;
                        i13 = i5;
                        if (zzA != 27) {
                            i9 = i28;
                            i14 = i29;
                            if (zzA <= 49) {
                                i6 = i31;
                                unsafe = unsafe2;
                                i11 = i41;
                                i24 = zzv(obj, bArr, i34, i2, i13, i6, i32, i41, i33, zzA, j, zzioVar);
                            } else {
                                i6 = i31;
                                unsafe = unsafe2;
                                i15 = i34;
                                i11 = i41;
                                if (zzA != 50) {
                                    i24 = zzt(obj, bArr, i15, i2, i13, i6, i32, i33, zzA, j, i11, zzioVar);
                                } else if (i32 == 2) {
                                    i24 = zzs(obj, bArr, i15, i2, i11, j, zzioVar);
                                }
                            }
                        } else if (i32 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe2.getObject(obj4, j);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzkjVar);
                            }
                            i25 = i13;
                            i14 = i29;
                            i24 = zzip.zze(zzlmVar2.zzE(i41), i25, bArr, i34, i2, zzkjVar, zzioVar);
                            i23 = i3;
                            i26 = i31;
                            i27 = i41;
                            i28 = i28;
                            i29 = i14;
                            i22 = i2;
                        } else {
                            i9 = i28;
                            i14 = i29;
                            i6 = i31;
                            unsafe = unsafe2;
                            i15 = i34;
                            i11 = i41;
                        }
                        i10 = i3;
                        i7 = i15;
                        i8 = i13;
                        i29 = i14;
                    }
                }
                if (i8 != i10 || i10 == 0) {
                    int i42 = i10;
                    if (this.zzh) {
                        zzioVar2 = zzioVar;
                        if (zzioVar2.zzd != zzjo.zza()) {
                            i12 = i6;
                            if (zzioVar2.zzd.zzc(this.zzg, i12) != null) {
                                throw null;
                            }
                            i24 = zzip.zzi(i8, bArr, i7, i2, zzd(obj), zzioVar);
                            obj3 = obj;
                            i22 = i2;
                            i25 = i8;
                            zzlmVar2 = this;
                            i26 = i12;
                            obj4 = obj3;
                            i27 = i11;
                            i28 = i9;
                            bArr2 = bArr;
                            i23 = i42;
                            zzioVar3 = zzioVar2;
                            unsafe2 = unsafe;
                        } else {
                            obj3 = obj;
                        }
                    } else {
                        obj3 = obj;
                        zzioVar2 = zzioVar;
                    }
                    i12 = i6;
                    i24 = zzip.zzi(i8, bArr, i7, i2, zzd(obj), zzioVar);
                    i22 = i2;
                    i25 = i8;
                    zzlmVar2 = this;
                    i26 = i12;
                    obj4 = obj3;
                    i27 = i11;
                    i28 = i9;
                    bArr2 = bArr;
                    i23 = i42;
                    zzioVar3 = zzioVar2;
                    unsafe2 = unsafe;
                } else {
                    zzlmVar = this;
                    obj2 = obj;
                    i4 = i10;
                    i24 = i7;
                    i25 = i8;
                    i28 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i23;
                obj2 = obj4;
                zzlmVar = zzlmVar2;
            }
        }
        if (i29 != 1048575) {
            unsafe.putInt(obj2, i29, i28);
        }
        for (int i43 = zzlmVar.zzk; i43 < zzlmVar.zzl; i43++) {
            int i44 = zzlmVar.zzj[i43];
            int i45 = zzlmVar.zzc[i44];
            Object zzf = zzmv.zzf(obj2, zzlmVar.zzB(i44) & 1048575);
            if (zzf != null && zzlmVar.zzD(i44) != null) {
                throw null;
            }
        }
        if (i4 == 0) {
            if (i24 != i2) {
                throw zzkm.zze();
            }
        } else if (i24 > i2 || i25 != i4) {
            throw zzkm.zze();
        }
        return i24;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzB = zzB(this.zzj[i2]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzioVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj, i)) {
                        zzndVar.zzf(i2, zzmv.zza(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i)) {
                        zzndVar.zzo(i2, zzmv.zzb(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i)) {
                        zzndVar.zzt(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i)) {
                        zzndVar.zzJ(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i)) {
                        zzndVar.zzr(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i)) {
                        zzndVar.zzm(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i)) {
                        zzndVar.zzk(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i)) {
                        zzndVar.zzb(i2, zzmv.zzw(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i)) {
                        zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i)) {
                        zzndVar.zzH(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i)) {
                        zzndVar.zzi(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i)) {
                        zzndVar.zzw(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i)) {
                        zzndVar.zzy(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i)) {
                        zzndVar.zzA(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i)) {
                        zzndVar.zzC(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                    break;
                case 28:
                    zzlw.zzI(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                    break;
                case 50:
                    zzM(zzndVar, i2, zzmv.zzf(obj, zzB & 1048575), i);
                    break;
                case 51:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzf(i2, zzn(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzo(i2, zzo(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzt(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzJ(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzr(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzm(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzk(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzb(i2, zzS(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i2, i)) {
                        zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzH(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzi(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzw(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzy(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzA(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzC(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i) && Double.doubleToLongBits(zzmv.zza(obj, j)) == Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i) && Float.floatToIntBits(zzmv.zzb(obj, j)) == Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i) && zzmv.zzw(obj, j) == zzmv.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
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
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzB = zzB(i6);
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
            if ((268435456 & zzB) != 0 && !zzP(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i7, i6) && !zzQ(obj, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzE = zzE(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzE.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzP(obj, i6, i, i2, i10) && !zzQ(obj, zzB, zzE(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = 1048575 & zzB;
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }
}
