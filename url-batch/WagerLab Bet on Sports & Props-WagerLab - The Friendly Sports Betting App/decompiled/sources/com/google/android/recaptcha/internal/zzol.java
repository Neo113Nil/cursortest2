package com.google.android.recaptcha.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.C;
import com.facebook.soloader.Elf64;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i, int i2, zzoi zzoiVar, boolean z, int[] iArr2, int i3, int i4, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzoiVar instanceof zznd;
        boolean z2 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzow zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzow zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzov zzovVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (zzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzps.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzps.zzc(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j2)) != 0;
            case 2:
                return zzps.zzd(obj, j2) != 0;
            case 3:
                return zzps.zzd(obj, j2) != 0;
            case 4:
                return zzps.zzc(obj, j2) != 0;
            case 5:
                return zzps.zzd(obj, j2) != 0;
            case 6:
                return zzps.zzc(obj, j2) != 0;
            case 7:
                return zzps.zzw(obj, j2);
            case 8:
                Object zzf = zzps.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j2) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j2));
            case 11:
                return zzps.zzc(obj, j2) != 0;
            case 12:
                return zzps.zzc(obj, j2) != 0;
            case 13:
                return zzps.zzc(obj, j2) != 0;
            case 14:
                return zzps.zzd(obj, j2) != 0;
            case 15:
                return zzps.zzc(obj, j2) != 0;
            case 16:
                return zzps.zzd(obj, j2) != 0;
            case 17:
                return zzps.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzps.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzpy zzpyVar) throws IOException {
        if (obj instanceof String) {
            zzpyVar.zzG(i, (String) obj);
        } else {
            zzpyVar.zzd(i, (zzle) obj);
        }
    }

    static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int objectFieldOffset;
        char c;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzC;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar = (zzou) zzofVar;
        String zzd = zzouVar.zzd();
        int length = zzd.length();
        char c2 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (zzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i36 = charAt15 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt14 = zzd.charAt(i35);
                if (charAt14 < 55296) {
                    break;
                }
                i36 |= (charAt14 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt15 = i36 | (charAt14 << i37);
            i35 = i33;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt16 = zzd.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt9 = zzd.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt16 = i39 | (charAt9 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt17 = zzd.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt8 = zzd.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt17 = i42 | (charAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt18 = zzd.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt7 = zzd.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt18 = i45 | (charAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt19 = zzd.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt6 = zzd.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt19 = i48 | (charAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt5 = zzd.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt20 = zzd.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt4 = zzd.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt20 = i54 | (charAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt3 = zzd.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt21 = i57 | (charAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt2 = zzd.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i60 |= (charAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                charAt22 = i60 | (charAt2 << i61);
                i59 = i8;
            }
            int i62 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i63 = charAt20;
            i2 = charAt18;
            i3 = i63;
            i4 = charAt19;
            i5 = charAt22;
            i6 = i62;
            iArr = iArr2;
            i7 = charAt16;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzouVar.zze();
        Class<?> cls2 = zzouVar.zza().getClass();
        int i64 = i5 + i3;
        int i65 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = i5;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c2) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i32 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c2) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i32;
                }
                charAt23 = i71 | (charAt13 << i73);
                i16 = i32;
            } else {
                i16 = i70;
            }
            int i74 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c2) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    charAt12 = zzd.charAt(i76);
                    if (charAt12 < c2) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i31;
                }
                charAt24 = i75 | (charAt12 << i77);
                i17 = i31;
            } else {
                i17 = i74;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i69] = i68;
                i69++;
            }
            int i78 = charAt24 & 255;
            zzou zzouVar2 = zzouVar;
            int i79 = charAt24 & 2048;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                char c3 = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i30 = i82 + 1;
                        charAt11 = zzd.charAt(i82);
                        if (charAt11 < c3) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i30;
                        c3 = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i83);
                    i27 = i30;
                } else {
                    i27 = i80;
                }
                int i84 = i27;
                int i85 = i78 - 51;
                i18 = length;
                if (i85 == 9 || i85 == 17) {
                    i28 = i6 + 1;
                    int i86 = i68 / 3;
                    objArr[i86 + i86 + 1] = zze[i6];
                } else {
                    if (i85 == 12) {
                        if (zzouVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i68 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzC2 = (Field) obj;
                            } else {
                                zzC2 = zzC(cls2, (String) obj);
                                zze[i88] = zzC2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzC3 = (Field) obj2;
                            } else {
                                zzC3 = zzC(cls2, (String) obj2);
                                zze[i91] = zzC3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzC3);
                            str = zzd;
                            i23 = i89;
                            i17 = i84;
                            i22 = 0;
                            c = 55296;
                        }
                    }
                    i29 = i79;
                    int i882 = charAt25 + charAt25;
                    obj = zze[i882];
                    int i892 = i29;
                    if (obj instanceof Field) {
                    }
                    int i902 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzC3);
                    str = zzd;
                    i23 = i892;
                    i17 = i84;
                    i22 = 0;
                    c = 55296;
                }
                i6 = i28;
                i29 = i79;
                int i8822 = charAt25 + charAt25;
                obj = zze[i8822];
                int i8922 = i29;
                if (obj instanceof Field) {
                }
                int i9022 = i7;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzC3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i68 / 3;
                    objArr[i93 + i93 + 1] = zzC4.getType();
                } else {
                    if (i78 == 27) {
                        i25 = i92;
                        i26 = 1;
                        i6 += 2;
                    } else if (i78 == 49) {
                        i6 += 2;
                        i25 = i92;
                        i26 = 1;
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (zzouVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i68 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & 4096) != 0 || i78 > 17) {
                                c = 55296;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i95 = i17 + 1;
                                int charAt26 = str.charAt(i17);
                                if (charAt26 >= 55296) {
                                    int i96 = charAt26 & 8191;
                                    int i97 = 13;
                                    while (true) {
                                        i24 = i95 + 1;
                                        charAt10 = str.charAt(i95);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i96 |= (charAt10 & 8191) << i97;
                                        i97 += 13;
                                        i95 = i24;
                                    }
                                    charAt26 = i96 | (charAt10 << i97);
                                } else {
                                    i24 = i95;
                                }
                                int i98 = i19 + i19 + (charAt26 / 32);
                                Object obj3 = zze[i98];
                                if (obj3 instanceof Field) {
                                    zzC = (Field) obj3;
                                } else {
                                    zzC = zzC(cls2, (String) obj3);
                                    zze[i98] = zzC;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC);
                                i22 = charAt26 % 32;
                                i17 = i24;
                                c = 55296;
                                i21 = objectFieldOffset2;
                            }
                            if (i78 >= 18 && i78 <= 49) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        } else {
                            str = zzd;
                            i6 = i92;
                            i79 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        }
                    } else if (i78 == 50) {
                        int i99 = i6 + 2;
                        int i100 = i66 + 1;
                        iArr[i66] = i68;
                        int i101 = i68 / 3;
                        int i102 = i101 + i101;
                        objArr[i102] = zze[i92];
                        if (i79 != 0) {
                            objArr[i102 + 1] = zze[i99];
                            i6 += 3;
                            str = zzd;
                            i66 = i100;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        } else {
                            i6 = i99;
                            i66 = i100;
                            i79 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        }
                    } else {
                        i20 = i92;
                    }
                    int i103 = i68 / 3;
                    objArr[i103 + i103 + i26] = zze[i25];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c = 55296;
                    i21 = 1048575;
                    i22 = 0;
                    if (i78 >= 18) {
                    }
                    i23 = i79;
                }
                str = zzd;
                i6 = i20;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                if ((charAt24 & 4096) != 0) {
                }
                c = 55296;
                i21 = 1048575;
                i22 = 0;
                if (i78 >= 18) {
                }
                i23 = i79;
            }
            int i104 = i68 + 1;
            iArr3[i68] = charAt23;
            int i105 = i68 + 2;
            iArr3[i104] = ((charAt24 & 512) != 0 ? C.BUFFER_FLAG_LAST_SAMPLE : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i68 += 3;
            iArr3[i105] = (i22 << 20) | i21;
            i35 = i17;
            zzd = str;
            c2 = c;
            zzouVar = zzouVar2;
            length = i18;
            i7 = i19;
        }
        return new zzol(iArr3, objArr, i2, i4, zzouVar.zza(), false, iArr, i5, i64, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i) {
        int i2 = i / 3;
        return (zznh) this.zzd[i2 + i2 + 1];
    }

    private final zzow zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzow zzowVar = (zzow) objArr[i3];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpl zzplVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzps.zzf(obj, zzu(i) & 1048575);
        if (zzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzd;
        int zzA6;
        int zzh;
        int zzg;
        int size;
        int zzl;
        int zzA7;
        int zzA8;
        int zzA9;
        int i2;
        int zze;
        int zzA10;
        int zzA11;
        int i3;
        int zzA12;
        int zzA13;
        int zzA14;
        int zzd2;
        int zzA15;
        zzol<T> zzolVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i5 < zzolVar.zzc.length) {
            int zzu = zzolVar.zzu(i5);
            int zzt = zzt(zzu);
            int[] iArr = zzolVar.zzc;
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i4;
            if (zzt <= 17) {
                if (i11 != i8) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(obj2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzu & i4;
            if (zzt >= zzmu.DOUBLE_LIST_PACKED.zza()) {
                zzmu.SINT64_LIST_PACKED.zza();
            }
            int i13 = i7;
            long j = i12;
            switch (zzt) {
                case 0:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        i7 = i13 + zzln.zzA(i9 << 3) + 8;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 1:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzA = zzln.zzA(i9 << 3);
                        zzA4 = zzA + 4;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 2:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j2);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 3:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j3);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 4:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j4);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 5:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzA3 = zzln.zzA(i9 << 3);
                        zzA4 = zzA3 + 8;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 6:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzA = zzln.zzA(i9 << 3);
                        zzA4 = zzA + 4;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 7:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzA4 = zzln.zzA(i9 << 3) + 1;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 8:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        int i14 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzle) {
                            zzA5 = zzln.zzA(i14);
                            zzd = ((zzle) object).zzd();
                            zzA6 = zzln.zzA(zzd);
                            zzA4 = zzA5 + zzA6 + zzd;
                            i7 = i13 + zzA4;
                            zzolVar = this;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        } else {
                            zzA2 = zzln.zzA(i14);
                            zzB = zzln.zzz((String) object);
                            zzA4 = zzA2 + zzB;
                            i7 = i13 + zzA4;
                            zzolVar = this;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        }
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 9:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzh = zzoy.zzh(i9, unsafe.getObject(obj2, j), zzolVar.zzx(i5));
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 10:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj2, j);
                        zzA5 = zzln.zzA(i9 << 3);
                        zzd = zzleVar.zzd();
                        zzA6 = zzln.zzA(zzd);
                        zzA4 = zzA5 + zzA6 + zzd;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 11:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzB = zzln.zzA(i15);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 12:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j5);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 13:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzA = zzln.zzA(i9 << 3);
                        zzA4 = zzA + 4;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 14:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzA3 = zzln.zzA(i9 << 3);
                        zzA4 = zzA3 + 8;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 15:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzB = zzln.zzA((i16 >> 31) ^ (i16 + i16));
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 16:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB((j6 >> 63) ^ (j6 + j6));
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzolVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzolVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 17:
                    if (zzolVar.zzO(obj2, i5, i8, i6, i)) {
                        zzh = zzln.zzw(i9, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i5));
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 18:
                    zzh = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 19:
                    zzh = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzoy.zza;
                    if (list.size() != 0) {
                        zzg = zzoy.zzg(list) + (list.size() * zzln.zzA(i9 << 3));
                        i7 = zzg + i13;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzg = 0;
                    i7 = zzg + i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzoy.zzl(list2);
                        zzA7 = zzln.zzA(i9 << 3);
                        i2 = size * zzA7;
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzoy.zzf(list3);
                        zzA7 = zzln.zzA(i9 << 3);
                        i2 = size * zzA7;
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 23:
                    zzh = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 24:
                    zzh = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzoy.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzln.zzA(i9 << 3) + 1);
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzoy.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzln.zzA(i9 << 3) * size3;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzc = zznuVar.zzc();
                                if (zzc instanceof zzle) {
                                    int zzd3 = ((zzle) zzc).zzd();
                                    zzg += zzln.zzA(zzd3) + zzd3;
                                } else {
                                    zzg += zzln.zzz((String) zzc);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzle) {
                                    int zzd4 = ((zzle) obj3).zzd();
                                    zzg += zzln.zzA(zzd4) + zzd4;
                                } else {
                                    zzg += zzln.zzz((String) obj3);
                                }
                            }
                        }
                        i7 = zzg + i13;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzg = 0;
                    i7 = zzg + i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzow zzx = zzolVar.zzx(i5);
                    int i24 = zzoy.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA8 = 0;
                    } else {
                        zzA8 = zzln.zzA(i9 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zznt) {
                                int zza2 = ((zznt) obj4).zza();
                                zzA8 += zzln.zzA(zza2) + zza2;
                            } else {
                                zzA8 += zzln.zzy((zzoi) obj4, zzx);
                            }
                        }
                    }
                    i7 = i13 + zzA8;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzoy.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzA9 = 0;
                    } else {
                        zzA9 = size5 * zzln.zzA(i9 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd5 = ((zzle) list7.get(i27)).zzd();
                            zzA9 += zzln.zzA(zzd5) + zzd5;
                        }
                    }
                    i7 = i13 + zzA9;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzoy.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzoy.zzk(list8);
                        zzA7 = zzln.zzA(i9 << 3);
                        i2 = size * zzA7;
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzoy.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzoy.zza(list9);
                        zzA7 = zzln.zzA(i9 << 3);
                        i2 = size * zzA7;
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 31:
                    zzh = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 32:
                    zzh = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzoy.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzoy.zzi(list10);
                        zzA7 = zzln.zzA(i9 << 3);
                        i2 = size * zzA7;
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzoy.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzoy.zzj(list11);
                        zzA7 = zzln.zzA(i9 << 3);
                        i2 = size * zzA7;
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzh = 0;
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 35:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 36:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 37:
                    zze = zzoy.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 38:
                    zze = zzoy.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 39:
                    zze = zzoy.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 40:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 41:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzoy.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 43:
                    zze = zzoy.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 44:
                    zze = zzoy.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 45:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 46:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 47:
                    zze = zzoy.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 48:
                    zze = zzoy.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i7 = i13 + zzA9;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzow zzx2 = zzolVar.zzx(i5);
                    int i33 = zzoy.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzln.zzw(i9, (zzoi) list13.get(i34), zzx2);
                        }
                    }
                    i7 = i13 + i3;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj2, j);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzA12 = zzln.zzA(i9 << 3);
                        zzh = zzA12 + 8;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 52:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzA13 = zzln.zzA(i9 << 3);
                        zzh = zzA13 + 4;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 53:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        long zzv = zzv(obj2, j);
                        zzl = zzln.zzA(i9 << 3);
                        i2 = zzln.zzB(zzv);
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 54:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        long zzv2 = zzv(obj2, j);
                        zzl = zzln.zzA(i9 << 3);
                        i2 = zzln.zzB(zzv2);
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 55:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        long zzp = zzp(obj2, j);
                        zzl = zzln.zzA(i9 << 3);
                        i2 = zzln.zzB(zzp);
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 56:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzA12 = zzln.zzA(i9 << 3);
                        zzh = zzA12 + 8;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 57:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzA13 = zzln.zzA(i9 << 3);
                        zzh = zzA13 + 4;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzh = zzln.zzA(i9 << 3) + 1;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 59:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        int i35 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzle) {
                            zzA14 = zzln.zzA(i35);
                            zzd2 = ((zzle) object2).zzd();
                            zzA15 = zzln.zzA(zzd2);
                            zzh = zzA14 + zzA15 + zzd2;
                            i7 = i13 + zzh;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        } else {
                            zzl = zzln.zzA(i35);
                            i2 = zzln.zzz((String) object2);
                            zzh = zzl + i2;
                            i7 = i13 + zzh;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        }
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 60:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzh = zzoy.zzh(i9, unsafe.getObject(obj2, j), zzolVar.zzx(i5));
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj2, j);
                        zzA14 = zzln.zzA(i9 << 3);
                        zzd2 = zzleVar2.zzd();
                        zzA15 = zzln.zzA(zzd2);
                        zzh = zzA14 + zzA15 + zzd2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        int zzp2 = zzp(obj2, j);
                        zzl = zzln.zzA(i9 << 3);
                        i2 = zzln.zzA(zzp2);
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 63:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        long zzp3 = zzp(obj2, j);
                        zzl = zzln.zzA(i9 << 3);
                        i2 = zzln.zzB(zzp3);
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 64:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzA13 = zzln.zzA(i9 << 3);
                        zzh = zzA13 + 4;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 65:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzA12 = zzln.zzA(i9 << 3);
                        zzh = zzA12 + 8;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        int zzp4 = zzp(obj2, j);
                        zzl = zzln.zzA(i9 << 3);
                        i2 = zzln.zzA((zzp4 >> 31) ^ (zzp4 + zzp4));
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 67:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        long zzv3 = zzv(obj2, j);
                        zzl = zzln.zzA(i9 << 3);
                        i2 = zzln.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        zzh = zzl + i2;
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 68:
                    if (zzolVar.zzR(obj2, i9, i5)) {
                        zzh = zzln.zzw(i9, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i5));
                        i7 = i13 + zzh;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                default:
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
            }
        }
        int zza3 = i7 + ((zznd) obj).zzc.zza();
        if (!zzolVar.zzh) {
            return zza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int zzc2 = zzmtVar.zza.zzc();
        int i36 = 0;
        for (int i37 = 0; i37 < zzc2; i37++) {
            Map.Entry zzg2 = zzmtVar.zza.zzg(i37);
            i36 += zzmt.zza((zzms) ((zzpa) zzg2).zza(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            i36 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i36;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (zzt) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzf = zzps.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzf2 = zzps.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i3 = i2 + i7;
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
                    i = i3 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + ((zznd) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0cb6, code lost:
    
        if (r14 == 1048575) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0cb8, code lost:
    
        r25.putInt(r9, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0cbe, code lost:
    
        r10 = r0.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0cc3, code lost:
    
        if (r10 >= r0.zzl) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0cc5, code lost:
    
        r0.zzy(r9, r0.zzj[r10], null, r0.zzm, r34);
        r3 = (com.google.android.recaptcha.internal.zzpm) null;
        r10 = r10 + 1;
        r0 = r33;
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0cdd, code lost:
    
        if (r8 != 0) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0cdf, code lost:
    
        if (r7 != r13) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ce7, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0cec, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0ce8, code lost:
    
        if (r7 > r13) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0cea, code lost:
    
        if (r6 != r8) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cf2, code lost:
    
        throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0b8e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzkt zzktVar) throws IOException {
        Unsafe unsafe;
        Object obj2;
        int i4;
        int i5;
        int i6;
        int zzq;
        int i7;
        byte[] bArr2;
        int i8;
        int i9;
        zzkt zzktVar2;
        boolean z;
        int i10;
        int i11;
        Object obj3;
        int i12;
        int i13;
        int i14;
        zzkt zzktVar3;
        int i15;
        int i16;
        byte[] bArr3;
        int i17;
        int i18;
        int zzl;
        int i19;
        int zzf;
        int zzi;
        int i20;
        Object obj4;
        int i21;
        zzkt zzktVar4;
        int i22;
        int i23;
        zzkt zzktVar5;
        int zzk;
        int zzi2;
        int i24;
        byte[] bArr4;
        zzkt zzktVar6;
        int i25;
        int i26;
        boolean z2;
        Unsafe unsafe2;
        int i27;
        byte[] bArr5;
        Unsafe unsafe3;
        zzkt zzktVar7;
        byte[] bArr6;
        byte[] bArr7;
        zzkt zzktVar8;
        int zzl2;
        zzol<T> zzolVar = this;
        Object obj5 = obj;
        byte[] bArr8 = bArr;
        int i28 = i2;
        zzkt zzktVar9 = zzktVar;
        zzD(obj5);
        Unsafe unsafe4 = zzb;
        int i29 = -1;
        int i30 = i;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        int i35 = 0;
        while (true) {
            if (i30 < i28) {
                int i36 = i30 + 1;
                int i37 = bArr8[i30];
                if (i37 < 0) {
                    i36 = zzku.zzj(i37, bArr8, i36, zzktVar9);
                    i37 = zzktVar9.zza;
                }
                int i38 = i36;
                int i39 = i37;
                int i40 = i39 >>> 3;
                if (i40 > i31) {
                    zzq = (i40 < zzolVar.zze || i40 > zzolVar.zzf) ? i29 : zzolVar.zzs(i40, i32 / 3);
                } else {
                    zzq = zzolVar.zzq(i40);
                }
                Object obj6 = null;
                if (zzq == i29) {
                    i5 = i3;
                    unsafe = unsafe4;
                    obj2 = obj5;
                    i7 = i39;
                    bArr2 = bArr8;
                    i8 = i34;
                    i9 = 0;
                    i6 = i38;
                    zzktVar2 = zzktVar9;
                    z = true;
                } else {
                    int i41 = i39 & 7;
                    int[] iArr = zzolVar.zzc;
                    int i42 = iArr[zzq + 1];
                    int i43 = zzq;
                    int zzt = zzt(i42);
                    long j = i42 & 1048575;
                    if (zzt > 17) {
                        Unsafe unsafe5 = unsafe4;
                        Object obj7 = obj5;
                        int i44 = i40;
                        if (zzt != 27) {
                            unsafe = unsafe5;
                            i8 = i34;
                            i13 = i35;
                            i14 = i38;
                            zzktVar3 = zzktVar;
                            if (zzt > 49) {
                                i7 = i39;
                                if (zzt != 50) {
                                    obj2 = obj;
                                    Unsafe unsafe6 = zzb;
                                    long j2 = iArr[i43 + 2] & 1048575;
                                    switch (zzt) {
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            z = true;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 1) {
                                                i6 = i15 + 8;
                                                unsafe6.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzku.zzp(bArr2, i15))));
                                                unsafe6.putInt(obj2, j2, i40);
                                                if (i6 != i15) {
                                                    i5 = i3;
                                                    i35 = i13;
                                                    break;
                                                } else {
                                                    i28 = i2;
                                                    i30 = i6;
                                                    obj5 = obj2;
                                                    i31 = i40;
                                                    zzktVar9 = zzktVar2;
                                                    i32 = i9;
                                                    i34 = i8;
                                                    i35 = i13;
                                                    unsafe4 = unsafe;
                                                    bArr8 = bArr2;
                                                    i33 = i7;
                                                    break;
                                                }
                                            }
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                        case 52:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 5) {
                                                i16 = i15 + 4;
                                                unsafe6.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzku.zzb(bArr2, i15))));
                                                unsafe6.putInt(obj2, j2, i40);
                                                i6 = i16;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 0) {
                                                i16 = zzku.zzl(bArr2, i15, zzktVar2);
                                                unsafe6.putObject(obj2, j, Long.valueOf(zzktVar2.zzb));
                                                unsafe6.putInt(obj2, j2, i40);
                                                i6 = i16;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 55:
                                        case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 0) {
                                                i16 = zzku.zzi(bArr2, i15, zzktVar2);
                                                unsafe6.putObject(obj2, j, Integer.valueOf(zzktVar2.zza));
                                                unsafe6.putInt(obj2, j2, i40);
                                                i6 = i16;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            z = true;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 1) {
                                                i16 = i15 + 8;
                                                unsafe6.putObject(obj2, j, Long.valueOf(zzku.zzp(bArr2, i15)));
                                                unsafe6.putInt(obj2, j2, i40);
                                                i6 = i16;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 5) {
                                                i16 = i15 + 4;
                                                unsafe6.putObject(obj2, j, Integer.valueOf(zzku.zzb(bArr2, i15)));
                                                unsafe6.putInt(obj2, j2, i40);
                                                i6 = i16;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 0) {
                                                i16 = zzku.zzl(bArr2, i15, zzktVar2);
                                                unsafe6.putObject(obj2, j, Boolean.valueOf(zzktVar2.zzb != 0));
                                                unsafe6.putInt(obj2, j2, i40);
                                                i6 = i16;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 59:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            if (i41 == 2) {
                                                i6 = zzku.zzi(bArr2, i15, zzktVar2);
                                                int i45 = zzktVar2.zza;
                                                if (i45 == 0) {
                                                    unsafe6.putObject(obj2, j, "");
                                                } else {
                                                    int i46 = i6 + i45;
                                                    if ((i42 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 && !zzpv.zze(bArr2, i6, i46)) {
                                                        throw new zznn("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe6.putObject(obj2, j, new String(bArr2, i6, i45, zznl.zza));
                                                    i6 = i46;
                                                }
                                                unsafe6.putInt(obj2, j2, i40);
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 60:
                                            if (i41 == 2) {
                                                Object zzB = zzolVar.zzB(obj2, i44, i43);
                                                int zzn = zzku.zzn(zzB, zzolVar.zzx(i43), bArr, i14, i2, zzktVar3);
                                                zzktVar2 = zzktVar3;
                                                bArr2 = bArr;
                                                zzolVar.zzK(obj2, i44, i43, zzB);
                                                i6 = zzn;
                                                i9 = i43;
                                                i40 = i44;
                                                z = true;
                                                i15 = i14;
                                                if (i6 != i15) {
                                                }
                                            } else {
                                                zzktVar2 = zzktVar3;
                                                bArr2 = bArr;
                                                i9 = i43;
                                                i40 = i44;
                                                z = true;
                                                i15 = i14;
                                                i6 = i15;
                                                if (i6 != i15) {
                                                }
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                            bArr3 = bArr;
                                            i17 = i44;
                                            if (i41 == 2) {
                                                i6 = zzku.zza(bArr3, i14, zzktVar3);
                                                unsafe6.putObject(obj2, j, zzktVar3.zzc);
                                                unsafe6.putInt(obj2, j2, i17);
                                                i9 = i43;
                                                i40 = i17;
                                                i15 = i14;
                                                zzktVar2 = zzktVar3;
                                                bArr2 = bArr3;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            i9 = i43;
                                            i40 = i17;
                                            i15 = i14;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr3;
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 63:
                                            bArr3 = bArr;
                                            i17 = i44;
                                            if (i41 == 0) {
                                                i6 = zzku.zzi(bArr3, i14, zzktVar3);
                                                int i47 = zzktVar3.zza;
                                                zznh zzw = zzolVar.zzw(i43);
                                                if (zzw == null || zzw.zza(i47)) {
                                                    unsafe6.putObject(obj2, j, Integer.valueOf(i47));
                                                    unsafe6.putInt(obj2, j2, i17);
                                                } else {
                                                    zzd(obj2).zzj(i7, Long.valueOf(i47));
                                                }
                                                i9 = i43;
                                                i40 = i17;
                                                i15 = i14;
                                                zzktVar2 = zzktVar3;
                                                bArr2 = bArr3;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            i9 = i43;
                                            i40 = i17;
                                            i15 = i14;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr3;
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                            bArr3 = bArr;
                                            i17 = i44;
                                            if (i41 == 0) {
                                                i6 = zzku.zzi(bArr3, i14, zzktVar3);
                                                unsafe6.putObject(obj2, j, Integer.valueOf(zzli.zzF(zzktVar3.zza)));
                                                unsafe6.putInt(obj2, j2, i17);
                                                i9 = i43;
                                                i40 = i17;
                                                i15 = i14;
                                                zzktVar2 = zzktVar3;
                                                bArr2 = bArr3;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            i9 = i43;
                                            i40 = i17;
                                            i15 = i14;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr3;
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 67:
                                            bArr3 = bArr;
                                            i17 = i44;
                                            if (i41 == 0) {
                                                int zzl3 = zzku.zzl(bArr3, i14, zzktVar3);
                                                unsafe6.putObject(obj2, j, Long.valueOf(zzli.zzG(zzktVar3.zzb)));
                                                unsafe6.putInt(obj2, j2, i17);
                                                i6 = zzl3;
                                                i9 = i43;
                                                i40 = i17;
                                                i15 = i14;
                                                zzktVar2 = zzktVar3;
                                                bArr2 = bArr3;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            i9 = i43;
                                            i40 = i17;
                                            i15 = i14;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr3;
                                            z = true;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                        case 68:
                                            if (i41 == 3) {
                                                i17 = i44;
                                                Object zzB2 = zzolVar.zzB(obj2, i17, i43);
                                                bArr3 = bArr;
                                                int zzm = zzku.zzm(zzB2, zzolVar.zzx(i43), bArr3, i14, i2, (i7 & (-8)) | 4, zzktVar);
                                                zzktVar3 = zzktVar;
                                                zzolVar.zzK(obj2, i17, i43, zzB2);
                                                i6 = zzm;
                                                i9 = i43;
                                                i40 = i17;
                                                i15 = i14;
                                                zzktVar2 = zzktVar3;
                                                bArr2 = bArr3;
                                                z = true;
                                                if (i6 != i15) {
                                                }
                                            }
                                            break;
                                        default:
                                            i9 = i43;
                                            i15 = i14;
                                            i40 = i44;
                                            z = true;
                                            zzktVar2 = zzktVar3;
                                            bArr2 = bArr;
                                            i6 = i15;
                                            if (i6 != i15) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i41 == 2) {
                                        Unsafe unsafe7 = zzb;
                                        Object zzz = zzolVar.zzz(i43);
                                        Object object = unsafe7.getObject(obj, j);
                                        if (zzod.zza(object)) {
                                            zzoc zzb2 = zzoc.zza().zzb();
                                            zzod.zzb(zzb2, object);
                                            unsafe7.putObject(obj, j, zzb2);
                                        }
                                        throw null;
                                    }
                                    obj2 = obj;
                                    i5 = i3;
                                    i9 = i43;
                                    i6 = i14;
                                    i40 = i44;
                                    i35 = i13;
                                    z = true;
                                    zzktVar2 = zzktVar3;
                                    bArr2 = bArr;
                                }
                            } else {
                                long j3 = i42;
                                Unsafe unsafe8 = zzb;
                                zznk zznkVar = (zznk) unsafe8.getObject(obj7, j);
                                if (zznkVar.zzc()) {
                                    i18 = zzt;
                                } else {
                                    int size = zznkVar.size();
                                    i18 = zzt;
                                    zznkVar = zznkVar.zzd(size + size);
                                    unsafe8.putObject(obj7, j, zznkVar);
                                }
                                switch (i18) {
                                    case 18:
                                    case 35:
                                        i7 = i39;
                                        zznk zznkVar2 = zznkVar;
                                        if (i41 == 2) {
                                            int i48 = zzku.zza;
                                            zzmi zzmiVar = (zzmi) zznkVar2;
                                            i30 = zzku.zzi(bArr, i14, zzktVar3);
                                            int i49 = zzktVar3.zza;
                                            int i50 = i30 + i49;
                                            if (i50 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmiVar.zzg(zzmiVar.size() + (i49 / 8));
                                            while (i30 < i50) {
                                                zzmiVar.zzf(Double.longBitsToDouble(zzku.zzp(bArr, i30)));
                                                i30 += 8;
                                            }
                                            if (i30 != i50) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i41 == 1) {
                                                i30 = i14 + 8;
                                                int i51 = zzku.zza;
                                                zzmi zzmiVar2 = (zzmi) zznkVar2;
                                                zzmiVar2.zzf(Double.longBitsToDouble(zzku.zzp(bArr, i14)));
                                                while (i30 < i2) {
                                                    int zzi3 = zzku.zzi(bArr, i30, zzktVar3);
                                                    if (i7 == zzktVar3.zza) {
                                                        zzmiVar2.zzf(Double.longBitsToDouble(zzku.zzp(bArr, zzi3)));
                                                        i30 = zzi3 + 8;
                                                    }
                                                }
                                            }
                                            i30 = i14;
                                        }
                                        if (i30 != i14) {
                                            obj2 = obj;
                                            i5 = i3;
                                            i6 = i30;
                                            zzktVar2 = zzktVar3;
                                            i9 = i43;
                                            i40 = i44;
                                            i35 = i13;
                                            z = true;
                                            bArr2 = bArr;
                                            break;
                                        } else {
                                            obj5 = obj;
                                            bArr8 = bArr;
                                            i28 = i2;
                                            zzktVar9 = zzktVar3;
                                            i32 = i43;
                                            i33 = i7;
                                            i34 = i8;
                                            i31 = i44;
                                            i35 = i13;
                                            unsafe4 = unsafe;
                                            break;
                                        }
                                    case 19:
                                    case 36:
                                        i7 = i39;
                                        zznk zznkVar3 = zznkVar;
                                        if (i41 == 2) {
                                            int i52 = zzku.zza;
                                            zzmv zzmvVar = (zzmv) zznkVar3;
                                            i30 = zzku.zzi(bArr, i14, zzktVar3);
                                            int i53 = zzktVar3.zza;
                                            int i54 = i30 + i53;
                                            if (i54 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzmvVar.zzg(zzmvVar.size() + (i53 / 4));
                                            while (i30 < i54) {
                                                zzmvVar.zzf(Float.intBitsToFloat(zzku.zzb(bArr, i30)));
                                                i30 += 4;
                                            }
                                            if (i30 != i54) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i41 == 5) {
                                                i30 = i14 + 4;
                                                int i55 = zzku.zza;
                                                zzmv zzmvVar2 = (zzmv) zznkVar3;
                                                zzmvVar2.zzf(Float.intBitsToFloat(zzku.zzb(bArr, i14)));
                                                while (i30 < i2) {
                                                    int zzi4 = zzku.zzi(bArr, i30, zzktVar3);
                                                    if (i7 == zzktVar3.zza) {
                                                        zzmvVar2.zzf(Float.intBitsToFloat(zzku.zzb(bArr, zzi4)));
                                                        i30 = zzi4 + 4;
                                                    }
                                                }
                                            }
                                            i30 = i14;
                                        }
                                        if (i30 != i14) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i7 = i39;
                                        zznk zznkVar4 = zznkVar;
                                        if (i41 == 2) {
                                            int i56 = zzku.zza;
                                            zznx zznxVar = (zznx) zznkVar4;
                                            i30 = zzku.zzi(bArr, i14, zzktVar3);
                                            int i57 = zzktVar3.zza + i30;
                                            while (i30 < i57) {
                                                i30 = zzku.zzl(bArr, i30, zzktVar3);
                                                zznxVar.zzg(zzktVar3.zzb);
                                            }
                                            if (i30 != i57) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            if (i41 == 0) {
                                                int i58 = zzku.zza;
                                                zznx zznxVar2 = (zznx) zznkVar4;
                                                zzl = zzku.zzl(bArr, i14, zzktVar3);
                                                zznxVar2.zzg(zzktVar3.zzb);
                                                while (zzl < i2) {
                                                    int zzi5 = zzku.zzi(bArr, zzl, zzktVar3);
                                                    if (i7 == zzktVar3.zza) {
                                                        zzl = zzku.zzl(bArr, zzi5, zzktVar3);
                                                        zznxVar2.zzg(zzktVar3.zzb);
                                                    } else {
                                                        i30 = zzl;
                                                        if (i30 != i14) {
                                                        }
                                                    }
                                                }
                                                i30 = zzl;
                                                if (i30 != i14) {
                                                }
                                            }
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        zznk zznkVar5 = zznkVar;
                                        i19 = i39;
                                        if (i41 == 2) {
                                            zzf = zzku.zzf(bArr, i14, zznkVar5, zzktVar3);
                                            i30 = zzf;
                                            i7 = i19;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            if (i41 == 0) {
                                                i7 = i19;
                                                i30 = zzku.zzk(i19, bArr, i14, i2, zznkVar5, zzktVar3);
                                                if (i30 != i14) {
                                                }
                                            }
                                            i7 = i19;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        zznk zznkVar6 = zznkVar;
                                        i19 = i39;
                                        if (i41 == 2) {
                                            int i59 = zzku.zza;
                                            zznx zznxVar3 = (zznx) zznkVar6;
                                            zzi = zzku.zzi(bArr, i14, zzktVar3);
                                            int i60 = zzktVar3.zza;
                                            int i61 = zzi + i60;
                                            if (i61 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zznxVar3.zzh(zznxVar3.size() + (i60 / 8));
                                            while (zzi < i61) {
                                                zznxVar3.zzg(zzku.zzp(bArr, zzi));
                                                zzi += 8;
                                            }
                                            if (zzi != i61) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i19;
                                            i30 = zzi;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            if (i41 == 1) {
                                                i30 = i14 + 8;
                                                int i62 = zzku.zza;
                                                zznx zznxVar4 = (zznx) zznkVar6;
                                                zznxVar4.zzg(zzku.zzp(bArr, i14));
                                                while (i30 < i2) {
                                                    int zzi6 = zzku.zzi(bArr, i30, zzktVar3);
                                                    if (i19 == zzktVar3.zza) {
                                                        zznxVar4.zzg(zzku.zzp(bArr, zzi6));
                                                        i30 = zzi6 + 8;
                                                    } else {
                                                        i7 = i19;
                                                        if (i30 != i14) {
                                                        }
                                                    }
                                                }
                                                i7 = i19;
                                                if (i30 != i14) {
                                                }
                                            }
                                            i7 = i19;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        zznk zznkVar7 = zznkVar;
                                        i19 = i39;
                                        if (i41 == 2) {
                                            int i63 = zzku.zza;
                                            zzne zzneVar = (zzne) zznkVar7;
                                            zzi = zzku.zzi(bArr, i14, zzktVar3);
                                            int i64 = zzktVar3.zza;
                                            int i65 = zzi + i64;
                                            if (i65 > bArr.length) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzneVar.zzi(zzneVar.size() + (i64 / 4));
                                            while (zzi < i65) {
                                                zzneVar.zzh(zzku.zzb(bArr, zzi));
                                                zzi += 4;
                                            }
                                            if (zzi != i65) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i19;
                                            i30 = zzi;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            if (i41 == 5) {
                                                i30 = i14 + 4;
                                                int i66 = zzku.zza;
                                                zzne zzneVar2 = (zzne) zznkVar7;
                                                zzneVar2.zzh(zzku.zzb(bArr, i14));
                                                while (i30 < i2) {
                                                    int zzi7 = zzku.zzi(bArr, i30, zzktVar3);
                                                    if (i19 == zzktVar3.zza) {
                                                        zzneVar2.zzh(zzku.zzb(bArr, zzi7));
                                                        i30 = zzi7 + 4;
                                                    } else {
                                                        i7 = i19;
                                                        if (i30 != i14) {
                                                        }
                                                    }
                                                }
                                                i7 = i19;
                                                if (i30 != i14) {
                                                }
                                            }
                                            i7 = i19;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        zznk zznkVar8 = zznkVar;
                                        i19 = i39;
                                        if (i41 == 2) {
                                            int i67 = zzku.zza;
                                            zzkv zzkvVar = (zzkv) zznkVar8;
                                            zzi = zzku.zzi(bArr, i14, zzktVar3);
                                            int i68 = zzktVar3.zza + zzi;
                                            while (zzi < i68) {
                                                zzi = zzku.zzl(bArr, zzi, zzktVar3);
                                                zzkvVar.zze(zzktVar3.zzb != 0);
                                            }
                                            if (zzi != i68) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i19;
                                            i30 = zzi;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            if (i41 == 0) {
                                                int i69 = zzku.zza;
                                                zzkv zzkvVar2 = (zzkv) zznkVar8;
                                                i30 = zzku.zzl(bArr, i14, zzktVar3);
                                                zzkvVar2.zze(zzktVar3.zzb != 0);
                                                while (i30 < i2) {
                                                    int zzi8 = zzku.zzi(bArr, i30, zzktVar3);
                                                    if (i19 == zzktVar3.zza) {
                                                        i30 = zzku.zzl(bArr, zzi8, zzktVar3);
                                                        zzkvVar2.zze(zzktVar3.zzb != 0);
                                                    } else {
                                                        i7 = i19;
                                                        if (i30 != i14) {
                                                        }
                                                    }
                                                }
                                                i7 = i19;
                                                if (i30 != i14) {
                                                }
                                            }
                                            i7 = i19;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        i20 = i44;
                                        zznk zznkVar9 = zznkVar;
                                        i19 = i39;
                                        if (i41 != 2) {
                                            i44 = i20;
                                            i7 = i19;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        } else if ((j3 & 536870912) == 0) {
                                            int zzi9 = zzku.zzi(bArr, i14, zzktVar3);
                                            int i70 = zzktVar3.zza;
                                            if (i70 < 0) {
                                                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i70 == 0) {
                                                obj4 = "";
                                                zznkVar9.add(obj4);
                                            } else {
                                                obj4 = "";
                                                zznkVar9.add(new String(bArr, zzi9, i70, zznl.zza));
                                                zzi9 += i70;
                                            }
                                            while (zzi9 < i2) {
                                                int zzi10 = zzku.zzi(bArr, zzi9, zzktVar3);
                                                if (i19 == zzktVar3.zza) {
                                                    zzi9 = zzku.zzi(bArr, zzi10, zzktVar3);
                                                    int i71 = zzktVar3.zza;
                                                    if (i71 < 0) {
                                                        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i71 == 0) {
                                                        zznkVar9.add(obj4);
                                                    } else {
                                                        zznkVar9.add(new String(bArr, zzi9, i71, zznl.zza));
                                                        zzi9 += i71;
                                                    }
                                                } else {
                                                    i30 = zzi9;
                                                    i7 = i19;
                                                    i44 = i20;
                                                    if (i30 != i14) {
                                                    }
                                                }
                                            }
                                            i30 = zzi9;
                                            i7 = i19;
                                            i44 = i20;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            Object obj8 = "";
                                            zzf = zzku.zzi(bArr, i14, zzktVar3);
                                            int i72 = zzktVar3.zza;
                                            if (i72 < 0) {
                                                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i72 == 0) {
                                                zznkVar9.add(obj8);
                                                i44 = i20;
                                            } else {
                                                int i73 = zzf + i72;
                                                if (!zzpv.zze(bArr, zzf, i73)) {
                                                    throw new zznn("Protocol message had invalid UTF-8.");
                                                }
                                                i44 = i20;
                                                zznkVar9.add(new String(bArr, zzf, i72, zznl.zza));
                                                zzf = i73;
                                            }
                                            while (zzf < i2) {
                                                int zzi11 = zzku.zzi(bArr, zzf, zzktVar3);
                                                if (i19 == zzktVar3.zza) {
                                                    zzf = zzku.zzi(bArr, zzi11, zzktVar3);
                                                    int i74 = zzktVar3.zza;
                                                    if (i74 < 0) {
                                                        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i74 == 0) {
                                                        zznkVar9.add(obj8);
                                                    } else {
                                                        int i75 = zzf + i74;
                                                        if (!zzpv.zze(bArr, zzf, i75)) {
                                                            throw new zznn("Protocol message had invalid UTF-8.");
                                                        }
                                                        zznkVar9.add(new String(bArr, zzf, i74, zznl.zza));
                                                        zzf = i75;
                                                        obj8 = obj8;
                                                    }
                                                } else {
                                                    i30 = zzf;
                                                    i7 = i19;
                                                    if (i30 != i14) {
                                                    }
                                                }
                                            }
                                            i30 = zzf;
                                            i7 = i19;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        i21 = i39;
                                        i20 = i44;
                                        zzktVar4 = zzktVar3;
                                        if (i41 == 2) {
                                            int zze = zzku.zze(zzolVar.zzx(i43), i21, bArr, i14, i2, zznkVar, zzktVar4);
                                            i14 = i14;
                                            i30 = zze;
                                            i7 = i21;
                                            zzktVar3 = zzktVar4;
                                            i44 = i20;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            i14 = i14;
                                            zzktVar3 = zzktVar4;
                                            i44 = i20;
                                            i7 = i21;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i21 = i39;
                                        i20 = i44;
                                        zzktVar4 = zzktVar3;
                                        if (i41 == 2) {
                                            int zzi12 = zzku.zzi(bArr, i14, zzktVar4);
                                            int i76 = zzktVar4.zza;
                                            if (i76 < 0) {
                                                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i76 > bArr.length - zzi12) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i76 == 0) {
                                                zznkVar.add(zzle.zzb);
                                            } else {
                                                zznkVar.add(zzle.zzk(bArr, zzi12, i76));
                                                zzi12 += i76;
                                            }
                                            while (zzi12 < i2) {
                                                int zzi13 = zzku.zzi(bArr, zzi12, zzktVar4);
                                                if (i21 == zzktVar4.zza) {
                                                    zzi12 = zzku.zzi(bArr, zzi13, zzktVar4);
                                                    int i77 = zzktVar4.zza;
                                                    if (i77 < 0) {
                                                        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i77 > bArr.length - zzi12) {
                                                        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i77 == 0) {
                                                        zznkVar.add(zzle.zzb);
                                                    } else {
                                                        zznkVar.add(zzle.zzk(bArr, zzi12, i77));
                                                        zzi12 += i77;
                                                    }
                                                } else {
                                                    i30 = zzi12;
                                                    i14 = i14;
                                                    zzktVar3 = zzktVar4;
                                                    i44 = i20;
                                                    i7 = i21;
                                                    if (i30 != i14) {
                                                    }
                                                }
                                            }
                                            i30 = zzi12;
                                            i14 = i14;
                                            zzktVar3 = zzktVar4;
                                            i44 = i20;
                                            i7 = i21;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            i14 = i14;
                                            zzktVar3 = zzktVar4;
                                            i44 = i20;
                                            i7 = i21;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i41 == 2) {
                                            i22 = i39;
                                            i23 = i14;
                                            zzk = zzku.zzf(bArr, i14, zznkVar, zzktVar3);
                                            zzktVar5 = zzktVar3;
                                        } else if (i41 == 0) {
                                            i22 = i39;
                                            i23 = i14;
                                            zzktVar5 = zzktVar3;
                                            zzk = zzku.zzk(i39, bArr, i14, i2, zznkVar, zzktVar3);
                                        } else {
                                            i7 = i39;
                                            i14 = i14;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        zzoy.zzn(obj7, i44, zznkVar, zzolVar.zzw(i43), null, zzolVar.zzm);
                                        zzktVar3 = zzktVar5;
                                        i30 = zzk;
                                        i7 = i22;
                                        i14 = i23;
                                        if (i30 != i14) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i41 == 2) {
                                            int i78 = zzku.zza;
                                            zzne zzneVar3 = (zzne) zznkVar;
                                            zzi2 = zzku.zzi(bArr, i14, zzktVar3);
                                            int i79 = zzktVar3.zza + zzi2;
                                            while (zzi2 < i79) {
                                                zzi2 = zzku.zzi(bArr, zzi2, zzktVar3);
                                                zzneVar3.zzh(zzli.zzF(zzktVar3.zza));
                                            }
                                            if (zzi2 != i79) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i39;
                                            i30 = zzi2;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            if (i41 == 0) {
                                                int i80 = zzku.zza;
                                                zzne zzneVar4 = (zzne) zznkVar;
                                                zzl = zzku.zzi(bArr, i14, zzktVar3);
                                                zzneVar4.zzh(zzli.zzF(zzktVar3.zza));
                                                while (zzl < i2) {
                                                    int zzi14 = zzku.zzi(bArr, zzl, zzktVar3);
                                                    if (i39 == zzktVar3.zza) {
                                                        zzl = zzku.zzi(bArr, zzi14, zzktVar3);
                                                        zzneVar4.zzh(zzli.zzF(zzktVar3.zza));
                                                    } else {
                                                        i7 = i39;
                                                        i30 = zzl;
                                                        if (i30 != i14) {
                                                        }
                                                    }
                                                }
                                                i7 = i39;
                                                i30 = zzl;
                                                if (i30 != i14) {
                                                }
                                            }
                                            i7 = i39;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i41 == 2) {
                                            int i81 = zzku.zza;
                                            zznx zznxVar5 = (zznx) zznkVar;
                                            zzi2 = zzku.zzi(bArr, i14, zzktVar3);
                                            int i82 = zzktVar3.zza + zzi2;
                                            while (zzi2 < i82) {
                                                zzi2 = zzku.zzl(bArr, zzi2, zzktVar3);
                                                zznxVar5.zzg(zzli.zzG(zzktVar3.zzb));
                                            }
                                            if (zzi2 != i82) {
                                                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i7 = i39;
                                            i30 = zzi2;
                                            if (i30 != i14) {
                                            }
                                        } else {
                                            if (i41 == 0) {
                                                int i83 = zzku.zza;
                                                zznx zznxVar6 = (zznx) zznkVar;
                                                zzl = zzku.zzl(bArr, i14, zzktVar3);
                                                zznxVar6.zzg(zzli.zzG(zzktVar3.zzb));
                                                while (zzl < i2) {
                                                    int zzi15 = zzku.zzi(bArr, zzl, zzktVar3);
                                                    if (i39 == zzktVar3.zza) {
                                                        zzl = zzku.zzl(bArr, zzi15, zzktVar3);
                                                        zznxVar6.zzg(zzli.zzG(zzktVar3.zzb));
                                                    } else {
                                                        i7 = i39;
                                                        i30 = zzl;
                                                        if (i30 != i14) {
                                                        }
                                                    }
                                                }
                                                i7 = i39;
                                                i30 = zzl;
                                                if (i30 != i14) {
                                                }
                                            }
                                            i7 = i39;
                                            i30 = i14;
                                            if (i30 != i14) {
                                            }
                                        }
                                        break;
                                    default:
                                        i7 = i39;
                                        byte[] bArr9 = bArr;
                                        int i84 = i2;
                                        zznk zznkVar10 = zznkVar;
                                        if (i41 == 3) {
                                            int i85 = (i7 & (-8)) | 4;
                                            zzow zzx = zzolVar.zzx(i43);
                                            int zzc = zzku.zzc(zzx, bArr9, i14, i84, i85, zzktVar3);
                                            zznkVar10.add(zzktVar3.zzc);
                                            while (zzc < i84) {
                                                int zzi16 = zzku.zzi(bArr9, zzc, zzktVar3);
                                                if (i7 == zzktVar3.zza) {
                                                    zzc = zzku.zzc(zzx, bArr9, zzi16, i84, i85, zzktVar3);
                                                    zznkVar10.add(zzktVar3.zzc);
                                                    bArr9 = bArr;
                                                    i84 = i2;
                                                } else {
                                                    i30 = zzc;
                                                    if (i30 != i14) {
                                                    }
                                                }
                                            }
                                            i30 = zzc;
                                            if (i30 != i14) {
                                            }
                                        }
                                        i30 = i14;
                                        if (i30 != i14) {
                                        }
                                        break;
                                }
                            }
                        } else if (i41 == 2) {
                            zznk zznkVar11 = (zznk) unsafe5.getObject(obj7, j);
                            if (!zznkVar11.zzc()) {
                                int size2 = zznkVar11.size();
                                zznkVar11 = zznkVar11.zzd(size2 == 0 ? 10 : size2 + size2);
                                unsafe5.putObject(obj7, j, zznkVar11);
                            }
                            int zze2 = zzku.zze(zzolVar.zzx(i43), i39, bArr, i38, i2, zznkVar11, zzktVar);
                            bArr8 = bArr;
                            i28 = i2;
                            i33 = i39;
                            obj5 = obj7;
                            i32 = i43;
                            i31 = i44;
                            zzktVar9 = zzktVar;
                            i30 = zze2;
                            unsafe4 = unsafe5;
                        } else {
                            zzktVar3 = zzktVar;
                            obj2 = obj7;
                            unsafe = unsafe5;
                            i8 = i34;
                            i13 = i35;
                            i14 = i38;
                            i7 = i39;
                            i5 = i3;
                            i9 = i43;
                            i6 = i14;
                            i40 = i44;
                            i35 = i13;
                            z = true;
                            zzktVar2 = zzktVar3;
                            bArr2 = bArr;
                        }
                    } else {
                        int i86 = iArr[i43 + 2];
                        int i87 = 1 << (i86 >>> 20);
                        int i88 = i86 & 1048575;
                        if (i88 != i34) {
                            int i89 = 1048575;
                            i24 = i41;
                            if (i34 != 1048575) {
                                unsafe4.putInt(obj5, i34, i35);
                                i89 = 1048575;
                            }
                            i35 = i88 == i89 ? 0 : unsafe4.getInt(obj5, i88);
                            i34 = i88;
                        } else {
                            i24 = i41;
                        }
                        switch (zzt) {
                            case 0:
                                zzkt zzktVar10 = zzktVar9;
                                bArr4 = bArr8;
                                zzktVar6 = zzktVar10;
                                obj2 = obj5;
                                i25 = i34;
                                i26 = i43;
                                z2 = true;
                                i7 = i39;
                                unsafe2 = unsafe4;
                                if (i24 == 1) {
                                    i27 = i38 + 8;
                                    i35 |= i87;
                                    zzps.zzo(obj2, j, Double.longBitsToDouble(zzku.zzp(bArr4, i38)));
                                    byte[] bArr10 = bArr4;
                                    zzktVar9 = zzktVar6;
                                    bArr8 = bArr10;
                                    i34 = i25;
                                    i28 = i2;
                                    i30 = i27;
                                    obj5 = obj2;
                                    i32 = i26;
                                    i33 = i7;
                                    unsafe4 = unsafe2;
                                    i31 = i40;
                                    break;
                                }
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 1:
                                zzkt zzktVar11 = zzktVar9;
                                bArr4 = bArr8;
                                zzktVar6 = zzktVar11;
                                obj2 = obj5;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                unsafe2 = unsafe4;
                                if (i24 == 5) {
                                    i27 = i38 + 4;
                                    i35 |= i87;
                                    zzps.zzp(obj2, j, Float.intBitsToFloat(zzku.zzb(bArr4, i38)));
                                    byte[] bArr102 = bArr4;
                                    zzktVar9 = zzktVar6;
                                    bArr8 = bArr102;
                                    i34 = i25;
                                    i28 = i2;
                                    i30 = i27;
                                    obj5 = obj2;
                                    i32 = i26;
                                    i33 = i7;
                                    unsafe4 = unsafe2;
                                    i31 = i40;
                                    break;
                                }
                                z2 = true;
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 2:
                            case 3:
                                zzkt zzktVar12 = zzktVar9;
                                bArr7 = bArr8;
                                zzktVar8 = zzktVar12;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 != 0) {
                                    unsafe2 = unsafe4;
                                    obj2 = obj5;
                                    z2 = true;
                                    bArr2 = bArr;
                                    i8 = i25;
                                    i5 = i3;
                                    zzktVar2 = zzktVar;
                                    i6 = i38;
                                    z = z2;
                                    i9 = i26;
                                    unsafe = unsafe2;
                                    i40 = i40;
                                    break;
                                } else {
                                    i35 |= i87;
                                    zzl2 = zzku.zzl(bArr7, i38, zzktVar8);
                                    unsafe4.putLong(obj5, j, zzktVar8.zzb);
                                    byte[] bArr11 = bArr7;
                                    zzktVar9 = zzktVar8;
                                    bArr8 = bArr11;
                                    i34 = i25;
                                    i30 = zzl2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    i29 = -1;
                                    i28 = i2;
                                }
                            case 4:
                            case 11:
                                zzkt zzktVar13 = zzktVar9;
                                byte[] bArr12 = bArr8;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 == 0) {
                                    i35 |= i87;
                                    i30 = zzku.zzi(bArr12, i38, zzktVar13);
                                    unsafe4.putInt(obj5, j, zzktVar13.zza);
                                    bArr5 = bArr12;
                                    zzktVar9 = zzktVar13;
                                    bArr8 = bArr5;
                                    i34 = i25;
                                    i28 = i2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                                unsafe2 = unsafe4;
                                obj2 = obj5;
                                z2 = true;
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 5:
                            case 14:
                                byte[] bArr13 = bArr8;
                                Unsafe unsafe9 = unsafe4;
                                zzkt zzktVar14 = zzktVar9;
                                bArr7 = bArr13;
                                i25 = i34;
                                i26 = i43;
                                z2 = true;
                                i7 = i39;
                                if (i24 != 1) {
                                    unsafe2 = unsafe9;
                                    obj2 = obj5;
                                    bArr2 = bArr;
                                    i8 = i25;
                                    i5 = i3;
                                    zzktVar2 = zzktVar;
                                    i6 = i38;
                                    z = z2;
                                    i9 = i26;
                                    unsafe = unsafe2;
                                    i40 = i40;
                                    break;
                                } else {
                                    zzl2 = i38 + 8;
                                    i35 |= i87;
                                    zzktVar8 = zzktVar14;
                                    unsafe4 = unsafe9;
                                    unsafe4.putLong(obj5, j, zzku.zzp(bArr7, i38));
                                    byte[] bArr112 = bArr7;
                                    zzktVar9 = zzktVar8;
                                    bArr8 = bArr112;
                                    i34 = i25;
                                    i30 = zzl2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    i29 = -1;
                                    i28 = i2;
                                }
                            case 6:
                            case 13:
                                byte[] bArr14 = bArr8;
                                unsafe3 = unsafe4;
                                zzkt zzktVar15 = zzktVar9;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 == 5) {
                                    i35 |= i87;
                                    unsafe3.putInt(obj5, j, zzku.zzb(bArr14, i38));
                                    zzktVar9 = zzktVar15;
                                    unsafe4 = unsafe3;
                                    bArr8 = bArr14;
                                    i34 = i25;
                                    i28 = i2;
                                    i30 = i38 + 4;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                                obj2 = obj5;
                                unsafe2 = unsafe3;
                                z2 = true;
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 7:
                                byte[] bArr15 = bArr8;
                                unsafe3 = unsafe4;
                                zzktVar7 = zzktVar9;
                                bArr6 = bArr15;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 == 0) {
                                    i35 |= i87;
                                    i30 = zzku.zzl(bArr6, i38, zzktVar7);
                                    zzps.zzm(obj5, j, zzktVar7.zzb != 0);
                                    bArr5 = bArr6;
                                    zzktVar9 = zzktVar7;
                                    unsafe4 = unsafe3;
                                    bArr8 = bArr5;
                                    i34 = i25;
                                    i28 = i2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                                obj2 = obj5;
                                unsafe2 = unsafe3;
                                z2 = true;
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 8:
                                byte[] bArr16 = bArr8;
                                unsafe3 = unsafe4;
                                zzktVar7 = zzktVar9;
                                bArr6 = bArr16;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 == 2) {
                                    if (zzM(i42)) {
                                        i30 = zzku.zzi(bArr6, i38, zzktVar7);
                                        int i90 = zzktVar7.zza;
                                        if (i90 < 0) {
                                            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i91 = i35 | i87;
                                        if (i90 == 0) {
                                            zzktVar7.zzc = "";
                                        } else {
                                            zzktVar7.zzc = zzpv.zzd(bArr6, i30, i90);
                                            i30 += i90;
                                        }
                                        i35 = i91;
                                    } else {
                                        i30 = zzku.zzg(bArr6, i38, zzktVar7);
                                        i35 |= i87;
                                    }
                                    unsafe3.putObject(obj5, j, zzktVar7.zzc);
                                    bArr5 = bArr6;
                                    zzktVar9 = zzktVar7;
                                    unsafe4 = unsafe3;
                                    bArr8 = bArr5;
                                    i34 = i25;
                                    i28 = i2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                                obj2 = obj5;
                                unsafe2 = unsafe3;
                                z2 = true;
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 9:
                                obj2 = obj5;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 != 2) {
                                    unsafe3 = unsafe4;
                                    unsafe2 = unsafe3;
                                    z2 = true;
                                    bArr2 = bArr;
                                    i8 = i25;
                                    i5 = i3;
                                    zzktVar2 = zzktVar;
                                    i6 = i38;
                                    z = z2;
                                    i9 = i26;
                                    unsafe = unsafe2;
                                    i40 = i40;
                                    break;
                                } else {
                                    i35 |= i87;
                                    Unsafe unsafe10 = unsafe4;
                                    Object zzA = zzolVar.zzA(obj2, i26);
                                    byte[] bArr17 = bArr8;
                                    zzkt zzktVar16 = zzktVar9;
                                    int zzn2 = zzku.zzn(zzA, zzolVar.zzx(i26), bArr17, i38, i2, zzktVar16);
                                    zzolVar.zzJ(obj2, i26, zzA);
                                    zzktVar9 = zzktVar16;
                                    unsafe4 = unsafe10;
                                    bArr8 = bArr17;
                                    i34 = i25;
                                    i28 = i2;
                                    i30 = zzn2;
                                    obj5 = obj2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                            case 10:
                                obj2 = obj5;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 == 2) {
                                    i35 |= i87;
                                    i30 = zzku.zza(bArr8, i38, zzktVar9);
                                    unsafe4.putObject(obj2, j, zzktVar9.zzc);
                                    i34 = i25;
                                    i28 = i2;
                                    obj5 = obj2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                                unsafe2 = unsafe4;
                                z2 = true;
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 12:
                                obj2 = obj5;
                                i25 = i34;
                                i26 = i43;
                                i7 = i39;
                                if (i24 == 0) {
                                    i30 = zzku.zzi(bArr8, i38, zzktVar9);
                                    int i92 = zzktVar9.zza;
                                    zznh zzw2 = zzolVar.zzw(i26);
                                    if ((i42 & Integer.MIN_VALUE) == 0 || zzw2 == null || zzw2.zza(i92)) {
                                        i35 |= i87;
                                        unsafe4.putInt(obj2, j, i92);
                                    } else {
                                        zzd(obj2).zzj(i7, Long.valueOf(i92));
                                    }
                                    i34 = i25;
                                    i28 = i2;
                                    obj5 = obj2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                                unsafe2 = unsafe4;
                                z2 = true;
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                            case 15:
                                obj2 = obj5;
                                i26 = i43;
                                i7 = i39;
                                if (i24 != 0) {
                                    unsafe2 = unsafe4;
                                    i25 = i34;
                                    z2 = true;
                                    bArr2 = bArr;
                                    i8 = i25;
                                    i5 = i3;
                                    zzktVar2 = zzktVar;
                                    i6 = i38;
                                    z = z2;
                                    i9 = i26;
                                    unsafe = unsafe2;
                                    i40 = i40;
                                    break;
                                } else {
                                    i35 |= i87;
                                    i30 = zzku.zzi(bArr8, i38, zzktVar9);
                                    unsafe4.putInt(obj2, j, zzli.zzF(zzktVar9.zza));
                                    i28 = i2;
                                    obj5 = obj2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    break;
                                }
                            case 16:
                                if (i24 != 0) {
                                    i26 = i43;
                                    i7 = i39;
                                    unsafe2 = unsafe4;
                                    obj2 = obj5;
                                    i25 = i34;
                                    z2 = true;
                                    bArr2 = bArr;
                                    i8 = i25;
                                    i5 = i3;
                                    zzktVar2 = zzktVar;
                                    i6 = i38;
                                    z = z2;
                                    i9 = i26;
                                    unsafe = unsafe2;
                                    i40 = i40;
                                    break;
                                } else {
                                    i35 |= i87;
                                    zzl2 = zzku.zzl(bArr8, i38, zzktVar9);
                                    i26 = i43;
                                    i7 = i39;
                                    unsafe4.putLong(obj5, j, zzli.zzG(zzktVar9.zzb));
                                    i30 = zzl2;
                                    i32 = i26;
                                    i33 = i7;
                                    i31 = i40;
                                    i29 = -1;
                                    i28 = i2;
                                }
                            default:
                                zzkt zzktVar17 = zzktVar9;
                                byte[] bArr18 = bArr8;
                                obj2 = obj5;
                                i25 = i34;
                                i26 = i43;
                                z2 = true;
                                i7 = i39;
                                unsafe2 = unsafe4;
                                if (i24 == 3) {
                                    i35 |= i87;
                                    Object zzA2 = zzolVar.zzA(obj2, i26);
                                    int zzm2 = zzku.zzm(zzA2, zzolVar.zzx(i26), bArr18, i38, i2, (i40 << 3) | 4, zzktVar17);
                                    zzolVar.zzJ(obj2, i26, zzA2);
                                    bArr8 = bArr;
                                    i34 = i25;
                                    i28 = i2;
                                    zzktVar9 = zzktVar;
                                    i30 = zzm2;
                                    obj5 = obj2;
                                    i32 = i26;
                                    i33 = i7;
                                    unsafe4 = unsafe2;
                                    i31 = i40;
                                    break;
                                }
                                bArr2 = bArr;
                                i8 = i25;
                                i5 = i3;
                                zzktVar2 = zzktVar;
                                i6 = i38;
                                z = z2;
                                i9 = i26;
                                unsafe = unsafe2;
                                i40 = i40;
                                break;
                        }
                    }
                    i29 = -1;
                }
                if (i7 != i5 || i5 == 0) {
                    if (zzolVar.zzh) {
                        zzmo zzmoVar = zzktVar2.zzd;
                        int i93 = zzmo.zzb;
                        int i94 = zzos.zza;
                        if (zzmoVar != zzmo.zza) {
                            zzoi zzoiVar = zzolVar.zzg;
                            zzmo zzmoVar2 = zzktVar2.zzd;
                            int i95 = zzku.zza;
                            zznc zza2 = zzmoVar2.zza(zzoiVar, i40);
                            if (zza2 == null) {
                                i10 = i7;
                                i30 = zzku.zzh(i10, bArr2, i6, i2, zzd(obj2), zzktVar2);
                                i11 = i2;
                            } else {
                                byte[] bArr19 = bArr2;
                                zzkt zzktVar18 = zzktVar2;
                                zzna zznaVar = (zzna) obj2;
                                zznaVar.zzi();
                                zzmt zzmtVar = zznaVar.zzb;
                                zzpw zzpwVar = zza2.zza.zzb;
                                if (zzpwVar == zzpw.ENUM) {
                                    zzku.zzi(bArr19, i6, zzktVar18);
                                    throw null;
                                }
                                switch (zzpwVar) {
                                    case DOUBLE:
                                        i12 = i6 + 8;
                                        obj6 = Double.valueOf(Double.longBitsToDouble(zzku.zzp(bArr19, i6)));
                                        i6 = i12;
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case FLOAT:
                                        i12 = i6 + 4;
                                        obj6 = Float.valueOf(Float.intBitsToFloat(zzku.zzb(bArr19, i6)));
                                        i6 = i12;
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case INT64:
                                    case UINT64:
                                        i6 = zzku.zzl(bArr19, i6, zzktVar18);
                                        obj6 = Long.valueOf(zzktVar18.zzb);
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case INT32:
                                    case UINT32:
                                        i6 = zzku.zzi(bArr19, i6, zzktVar18);
                                        obj6 = Integer.valueOf(zzktVar18.zza);
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case FIXED64:
                                    case SFIXED64:
                                        i12 = i6 + 8;
                                        obj6 = Long.valueOf(zzku.zzp(bArr19, i6));
                                        i6 = i12;
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case FIXED32:
                                    case SFIXED32:
                                        i12 = i6 + 4;
                                        obj6 = Integer.valueOf(zzku.zzb(bArr19, i6));
                                        i6 = i12;
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case BOOL:
                                        i6 = zzku.zzl(bArr19, i6, zzktVar18);
                                        obj6 = Boolean.valueOf(zzktVar18.zzb != 0 ? z : false);
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case STRING:
                                        i6 = zzku.zzg(bArr19, i6, zzktVar18);
                                        obj3 = zzktVar18.zzc;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case GROUP:
                                        throw null;
                                    case MESSAGE:
                                        throw null;
                                    case BYTES:
                                        i6 = zzku.zza(bArr19, i6, zzktVar18);
                                        obj3 = zzktVar18.zzc;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case ENUM:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case SINT32:
                                        i6 = zzku.zzi(bArr19, i6, zzktVar18);
                                        obj6 = Integer.valueOf(zzli.zzF(zzktVar18.zza));
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    case SINT64:
                                        i6 = zzku.zzl(bArr19, i6, zzktVar18);
                                        obj6 = Long.valueOf(zzli.zzG(zzktVar18.zzb));
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                    default:
                                        obj3 = obj6;
                                        zzmtVar.zzi(zza2.zza, obj3);
                                        i11 = i2;
                                        i30 = i6;
                                        i10 = i7;
                                        break;
                                }
                            }
                            bArr8 = bArr;
                            zzktVar9 = zzktVar;
                            i33 = i10;
                            obj5 = obj2;
                            i31 = i40;
                            i28 = i11;
                            i32 = i9;
                            i34 = i8;
                            unsafe4 = unsafe;
                            i29 = -1;
                        }
                    }
                    i10 = i7;
                    i30 = zzku.zzh(i10, bArr2, i6, i2, zzd(obj2), zzktVar2);
                    i11 = i2;
                    bArr8 = bArr;
                    zzktVar9 = zzktVar;
                    i33 = i10;
                    obj5 = obj2;
                    i31 = i40;
                    i28 = i11;
                    i32 = i9;
                    i34 = i8;
                    unsafe4 = unsafe;
                    i29 = -1;
                } else {
                    i4 = i2;
                    i33 = i7;
                    i34 = i8;
                }
            } else {
                unsafe = unsafe4;
                obj2 = obj5;
                i4 = i28;
                i5 = i3;
                i6 = i30;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                                ((zznk) zzps.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    zznk zznkVar = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j, zznkVar2);
                    break;
                case 50:
                    int i4 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                case 59:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                case 63:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0743 A[LOOP:1: B:39:0x073f->B:41:0x0743, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0710 A[Catch: all -> 0x0707, TRY_ENTER, TryCatch #1 {all -> 0x0707, blocks: (B:53:0x06ef, B:70:0x0710, B:71:0x0714), top: B:52:0x06ef }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x071a A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        Object obj2;
        Object obj3;
        zzol<T> zzolVar;
        Throwable th;
        int i;
        zzpl zzplVar;
        Object obj4;
        Object obj5;
        Object valueOf;
        int ordinal;
        Object zze;
        Object obj6;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar2 = this.zzm;
        Object obj7 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    obj5 = obj;
                    zzplVar = zzplVar2;
                    zzolVar = this;
                    obj4 = obj7;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zznm unused) {
                            obj2 = obj5;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzo(obj2, zzu & 1048575, zzovVar.zza());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 1:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzp(obj2, zzu & 1048575, zzovVar.zzb());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 2:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzl());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 3:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzo());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 4:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzg());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 5:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzk());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 6:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzf());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 7:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzm(obj2, zzu & 1048575, zzovVar.zzN());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 8:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzG(obj2, zzu, zzovVar);
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 9:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar = (zzoi) zzA(obj2, zzq);
                                zzovVar.zzu(zzoiVar, zzx(zzq), zzmoVar);
                                zzJ(obj2, zzq, zzoiVar);
                                obj7 = obj6;
                                obj = obj2;
                            case 10:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzs(obj2, zzu & 1048575, zzovVar.zzp());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 11:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzj());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 12:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                int zze2 = zzovVar.zze();
                                zznh zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze2)) {
                                    obj7 = zzoy.zzo(obj2, zzc, zze2, obj6, zzplVar2);
                                    obj = obj2;
                                }
                                zzps.zzq(obj2, zzu & 1048575, zze2);
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzh());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 14:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzm());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 15:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzi());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 16:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzn());
                                zzH(obj2, zzq);
                                obj7 = obj6;
                                obj = obj2;
                            case 17:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar2 = (zzoi) zzA(obj2, zzq);
                                zzovVar.zzt(zzoiVar2, zzx(zzq), zzmoVar);
                                zzJ(obj2, zzq, zzoiVar2);
                                obj7 = obj6;
                                obj = obj2;
                            case 18:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 19:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 20:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 21:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 22:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 23:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 24:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 25:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 26:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                if (zzM(zzu)) {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, zzu & 1048575), true);
                                } else {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, zzu & 1048575), false);
                                }
                                obj7 = obj6;
                                obj = obj2;
                            case 27:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzF(zznv.zza(obj2, zzu & 1048575), zzx(zzq), zzmoVar);
                                obj7 = obj6;
                                obj = obj2;
                            case 28:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzw(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 29:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzL(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 30:
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                try {
                                    List zza2 = zznv.zza(obj5, zzu & 1048575);
                                    zzovVar.zzy(zza2);
                                    obj7 = zzoy.zzn(obj5, zzc, zza2, zzw(zzq), obj3, zzplVar2);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar2;
                                } catch (zznm unused2) {
                                    obj2 = obj5;
                                    obj7 = obj3;
                                    if (obj7 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj7, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj5;
                                    th = th;
                                    obj7 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 31:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzG(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 32:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzH(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 33:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzI(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 34:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzJ(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 35:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 36:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 37:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 38:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 39:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 40:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 41:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 42:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 43:
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzL(zznv.zza(obj2, zzu & 1048575));
                                obj7 = obj6;
                                obj = obj2;
                            case 44:
                                List zza3 = zznv.zza(obj5, zzu & 1048575);
                                zzovVar.zzy(zza3);
                                try {
                                    obj7 = zzoy.zzn(obj5, zzc, zza3, zzw(zzq), obj4, zzplVar);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                } catch (zznm unused3) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj7 = obj3;
                                    if (obj7 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj7, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    th = th;
                                    obj7 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzovVar.zzG(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 46:
                                zzovVar.zzH(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 47:
                                zzovVar.zzI(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 48:
                                zzovVar.zzJ(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 49:
                                zzovVar.zzC(zznv.zza(obj5, zzu & 1048575), zzx(zzq), zzmoVar);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzf = zzps.zzf(obj5, zzu2);
                                if (zzf == null) {
                                    zzf = zzoc.zza().zzb();
                                    zzps.zzs(obj5, zzu2, zzf);
                                } else if (zzod.zza(zzf)) {
                                    Object zzb2 = zzoc.zza().zzb();
                                    zzod.zzb(zzb2, zzf);
                                    zzps.zzs(obj5, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                zzps.zzs(obj5, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 52:
                                zzps.zzs(obj5, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 53:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 54:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 55:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 56:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 57:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                                zzps.zzs(obj5, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 59:
                                zzG(obj5, zzu, zzovVar);
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 60:
                                zzoi zzoiVar3 = (zzoi) zzB(obj5, zzc, zzq);
                                zzovVar.zzu(zzoiVar3, zzx(zzq), zzmoVar);
                                zzK(obj5, zzc, zzq, zzoiVar3);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                zzps.zzs(obj5, zzu & 1048575, zzovVar.zzp());
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 63:
                                int zze3 = zzovVar.zze();
                                zznh zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze3)) {
                                    obj7 = zzoy.zzo(obj5, zzc, zze3, obj4, zzplVar);
                                    obj = obj5;
                                    break;
                                }
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zze3));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                                break;
                            case 64:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 65:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 67:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj6 = obj4;
                                zzplVar2 = zzplVar;
                                obj7 = obj6;
                                obj = obj2;
                            case 68:
                                try {
                                    zzoi zzoiVar4 = (zzoi) zzB(obj5, zzc, zzq);
                                    zzovVar.zzt(zzoiVar4, zzx(zzq), zzmoVar);
                                    zzK(obj5, zzc, zzq, zzoiVar4);
                                    obj2 = obj5;
                                    obj6 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj7 = obj6;
                                    obj = obj2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj7 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                }
                                break;
                            default:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                if (obj3 == null) {
                                    try {
                                        obj7 = zzplVar2.zza(obj2);
                                    } catch (zznm unused4) {
                                        obj7 = obj3;
                                        if (obj7 == null) {
                                        }
                                        if (!zzplVar2.zzk(obj7, zzovVar, 0)) {
                                        }
                                        obj = obj2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th = th;
                                        obj7 = obj3;
                                        i = zzolVar.zzk;
                                        while (i < zzolVar.zzl) {
                                        }
                                        if (obj7 != null) {
                                        }
                                    }
                                } else {
                                    obj7 = obj3;
                                }
                                try {
                                    try {
                                        if (!zzplVar2.zzk(obj7, zzovVar, 0)) {
                                            for (int i2 = zzolVar.zzk; i2 < zzolVar.zzl; i2++) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i2], obj7, zzplVar2, obj2);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        i = zzolVar.zzk;
                                        while (i < zzolVar.zzl) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i], obj7, zzplVar2, obj2);
                                            i++;
                                            zzolVar = this;
                                        }
                                        if (obj7 != null) {
                                            throw th;
                                        }
                                        zzplVar2.zzj(obj2, obj7);
                                        throw th;
                                    }
                                } catch (zznm unused5) {
                                    if (obj7 == null) {
                                        obj7 = zzplVar2.zza(obj2);
                                    }
                                    if (!zzplVar2.zzk(obj7, zzovVar, 0)) {
                                        for (int i3 = zzolVar.zzk; i3 < zzolVar.zzl; i3++) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i3], obj7, zzplVar2, obj2);
                                        }
                                        if (obj7 == null) {
                                        }
                                    }
                                    obj = obj2;
                                }
                                obj = obj2;
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = obj5;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i4 = this.zzk;
                    while (i4 < this.zzl) {
                        zzy(obj, this.zzj[i4], obj7, zzplVar2, obj);
                        i4++;
                        zzplVar2 = zzplVar2;
                    }
                    obj2 = obj;
                    zzplVar2 = zzplVar2;
                } else {
                    zzplVar = zzplVar2;
                    obj4 = obj7;
                    try {
                        zznc zza4 = !this.zzh ? null : zzmoVar.zza(this.zzg, zzc);
                        if (zza4 != null) {
                            if (zzmtVar == null) {
                                try {
                                    zzmtVar = ((zzna) obj).zzi();
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj2 = obj;
                                    zzolVar = this;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj7 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj7 != null) {
                                    }
                                }
                            }
                            zznc zzncVar = zza4;
                            if (zza4.zza.zzb == zzpw.ENUM) {
                                zzovVar.zzg();
                                throw null;
                            }
                            switch (zza4.zza.zzb) {
                                case DOUBLE:
                                    valueOf = Double.valueOf(zzovVar.zza());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if ((ordinal != 9 || ordinal == 10) && (zze = zzmtVar.zze(zza4.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    }
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case FLOAT:
                                    valueOf = Float.valueOf(zzovVar.zzb());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                        break;
                                    }
                                    byte[] bArr2 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case INT64:
                                    valueOf = Long.valueOf(zzovVar.zzl());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case UINT64:
                                    valueOf = Long.valueOf(zzovVar.zzo());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case INT32:
                                    valueOf = Integer.valueOf(zzovVar.zzg());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case FIXED64:
                                    valueOf = Long.valueOf(zzovVar.zzk());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case FIXED32:
                                    valueOf = Integer.valueOf(zzovVar.zzf());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case BOOL:
                                    valueOf = Boolean.valueOf(zzovVar.zzN());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case STRING:
                                    valueOf = zzovVar.zzr();
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case GROUP:
                                    Object zze4 = zzmtVar.zze(zza4.zza);
                                    if (!(zze4 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzb3 = zzos.zza().zzb(zze4.getClass());
                                    if (!((zznd) zze4).zzL()) {
                                        Object zze5 = zzb3.zze();
                                        zzb3.zzg(zze5, zze4);
                                        zzmtVar.zzi(zza4.zza, zze5);
                                        zze4 = zze5;
                                    }
                                    zzovVar.zzt(zze4, zzb3, zzmoVar);
                                    obj7 = obj4;
                                    break;
                                case MESSAGE:
                                    Object zze6 = zzmtVar.zze(zza4.zza);
                                    if (!(zze6 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzb4 = zzos.zza().zzb(zze6.getClass());
                                    if (!((zznd) zze6).zzL()) {
                                        Object zze7 = zzb4.zze();
                                        zzb4.zzg(zze7, zze6);
                                        zzmtVar.zzi(zza4.zza, zze7);
                                        zze6 = zze7;
                                    }
                                    zzovVar.zzu(zze6, zzb4, zzmoVar);
                                    obj7 = obj4;
                                    break;
                                case BYTES:
                                    valueOf = zzovVar.zzp();
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case UINT32:
                                    valueOf = Integer.valueOf(zzovVar.zzj());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case ENUM:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case SFIXED32:
                                    valueOf = Integer.valueOf(zzovVar.zzh());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case SFIXED64:
                                    valueOf = Long.valueOf(zzovVar.zzm());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case SINT32:
                                    valueOf = Integer.valueOf(zzovVar.zzi());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                case SINT64:
                                    valueOf = Long.valueOf(zzovVar.zzn());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                                default:
                                    valueOf = null;
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj7 = obj4;
                                    break;
                            }
                        } else {
                            obj7 = obj4 == null ? zzplVar.zza(obj) : obj4;
                            try {
                                if (zzplVar.zzk(obj7, zzovVar, 0)) {
                                    obj5 = obj;
                                    obj = obj5;
                                } else {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzpl zzplVar3 = zzplVar;
                                        Object obj8 = obj;
                                        zzy(obj8, this.zzj[i5], obj7, zzplVar3, obj);
                                        zzplVar = zzplVar3;
                                        i5++;
                                        obj = obj8;
                                    }
                                    obj2 = obj;
                                    zzplVar2 = zzplVar;
                                }
                            } catch (Throwable th9) {
                                Object obj9 = obj;
                                zzolVar = this;
                                th = th9;
                                obj2 = obj9;
                                zzplVar2 = zzplVar;
                                i = zzolVar.zzk;
                                while (i < zzolVar.zzl) {
                                }
                                if (obj7 != null) {
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj5 = obj;
                        zzolVar = this;
                        th = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzplVar2 = zzplVar;
                        obj7 = obj3;
                        i = zzolVar.zzk;
                        while (i < zzolVar.zzl) {
                        }
                        if (obj7 != null) {
                        }
                    }
                }
                zzplVar2 = zzplVar;
            } catch (Throwable th11) {
                th = th11;
                obj2 = obj;
                obj3 = obj7;
                zzolVar = this;
            }
        }
        if (obj7 == null) {
            zzplVar2.zzj(obj2, obj7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        int i4;
        int i5;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (!zzmtVar.zza.isEmpty()) {
                Iterator zzf = zzmtVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zzolVar.zzc;
                Unsafe unsafe = zzb;
                i = 0;
                int i6 = 1048575;
                int i7 = 0;
                while (i < iArr.length) {
                    int zzu = zzolVar.zzu(i);
                    int[] iArr2 = zzolVar.zzc;
                    int zzt = zzt(zzu);
                    int i8 = iArr2[i];
                    if (zzt <= 17) {
                        int i9 = iArr2[i + 2];
                        int i10 = i9 & 1048575;
                        if (i10 != i6) {
                            i2 = 1;
                            i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        } else {
                            i2 = 1;
                        }
                        entry2 = entry;
                        i3 = i6;
                        i4 = i7;
                        i5 = i2 << (i9 >>> 20);
                    } else {
                        i2 = 1;
                        entry2 = entry;
                        i3 = i6;
                        i4 = i7;
                        i5 = 0;
                    }
                    while (entry2 != null && ((zznb) entry2.getKey()).zza <= i8) {
                        zzolVar.zzn.zzb(zzpyVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (zzt) {
                        case 0:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzf(i8, zzps.zza(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 1:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzo(i8, zzps.zzb(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 2:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzt(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 3:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzK(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 4:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzr(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 5:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzm(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 6:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzk(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 7:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzb(i8, zzps.zzw(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 8:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzT(i8, unsafe.getObject(obj, j), zzpyVar);
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 9:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzv(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 10:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzd(i8, (zzle) unsafe.getObject(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 11:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzI(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 12:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzi(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 13:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzx(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 14:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzz(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 15:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzB(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 16:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzD(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 17:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzq(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 18:
                            zzoy.zzs(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 19:
                            zzoy.zzw(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 20:
                            zzoy.zzy(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 21:
                            zzoy.zzE(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 22:
                            zzoy.zzx(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 23:
                            zzoy.zzv(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 24:
                            zzoy.zzu(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 25:
                            zzoy.zzr(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 26:
                            int i11 = zzolVar.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zzoy.zza;
                            if (list != null && !list.isEmpty()) {
                                zzpyVar.zzH(i11, list);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 27:
                            int i13 = zzolVar.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzow zzx = zzolVar.zzx(i);
                            int i14 = zzoy.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzlo) zzpyVar).zzv(i13, list2.get(i15), zzx);
                                }
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 28:
                            int i16 = zzolVar.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zzoy.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzpyVar.zze(i16, list3);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 29:
                            zzoy.zzD(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 30:
                            zzoy.zzt(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 31:
                            zzoy.zzz(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 32:
                            zzoy.zzA(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 33:
                            zzoy.zzB(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 34:
                            zzoy.zzC(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 35:
                            zzoy.zzs(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 36:
                            zzoy.zzw(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 37:
                            zzoy.zzy(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 38:
                            zzoy.zzE(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 39:
                            zzoy.zzx(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 40:
                            zzoy.zzv(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 41:
                            zzoy.zzu(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 42:
                            zzoy.zzr(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 43:
                            zzoy.zzD(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 44:
                            zzoy.zzt(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 45:
                            zzoy.zzz(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 46:
                            zzoy.zzA(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 47:
                            zzoy.zzB(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 48:
                            zzoy.zzC(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 49:
                            int i18 = zzolVar.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzow zzx2 = zzolVar.zzx(i);
                            int i19 = zzoy.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzlo) zzpyVar).zzq(i18, list4.get(i20), zzx2);
                                }
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzf(i8, zzn(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 52:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzo(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 53:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzt(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 54:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzK(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 55:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzr(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 56:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzm(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 57:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzk(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzb(i8, zzS(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 59:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzT(i8, unsafe.getObject(obj, j), zzpyVar);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 60:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzv(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzd(i8, (zzle) unsafe.getObject(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzI(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 63:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzi(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 64:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzx(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 65:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzz(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzB(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 67:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzD(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 68:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzq(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        default:
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                    }
                }
                while (entry != null) {
                    zzolVar.zzn.zzb(zzpyVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zznd) obj).zzc.zzl(zzpyVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzolVar.zzc;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i62 = 1048575;
        int i72 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzps.zza(obj, j)) == Double.doubleToLongBits(zzps.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzps.zzb(obj, j)) == Float.floatToIntBits(zzps.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzps.zzw(obj, j) == zzps.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
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
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                case 59:
                case 60:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                case 63:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                case 68:
                    long zzr = zzr(i) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & zzu) != 0 && !zzO(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj2, i7, i6) && !zzP(obj2, zzu, zzx(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj2, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj2, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj2, i6, i, i2, i10) && !zzP(obj2, zzu, zzx(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
