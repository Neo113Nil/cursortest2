package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i2, zzfw zzfwVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = z;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
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

    private final void zzB(Object obj, Object obj2, int i) {
        long zzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object zzf = zzhi.zzf(obj, zzv);
            Object zzf2 = zzhi.zzf(obj2, zzv);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, zzv, zzez.zzg(zzf, zzf2));
                zzD(obj, i);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, zzv, zzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int zzv = zzv(i);
        int i2 = this.zzc[i];
        long j = zzv & 1048575;
        if (zzJ(obj2, i2, i)) {
            Object zzf = zzJ(obj, i2, i) ? zzhi.zzf(obj, j) : null;
            Object zzf2 = zzhi.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(zzf, zzf2));
                zzE(obj, i2, i);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, j, zzf2);
                zzE(obj, i2, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int zzs = zzs(i);
        long j = 1048575 & zzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzhi.zzn(obj, zzs(i2) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int zzs = zzs(i);
        long j = zzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i);
        long j2 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j2)) != 0;
            case 2:
                return zzhi.zzd(obj, j2) != 0;
            case 3:
                return zzhi.zzd(obj, j2) != 0;
            case 4:
                return zzhi.zzc(obj, j2) != 0;
            case 5:
                return zzhi.zzd(obj, j2) != 0;
            case 6:
                return zzhi.zzc(obj, j2) != 0;
            case 7:
                return zzhi.zzt(obj, j2);
            case 8:
                Object zzf = zzhi.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzee) {
                    return !zzee.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j2) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j2));
            case 11:
                return zzhi.zzc(obj, j2) != 0;
            case 12:
                return zzhi.zzc(obj, j2) != 0;
            case 13:
                return zzhi.zzc(obj, j2) != 0;
            case 14:
                return zzhi.zzd(obj, j2) != 0;
            case 15:
                return zzhi.zzc(obj, j2) != 0;
            case 16:
                return zzhi.zzd(obj, j2) != 0;
            case 17:
                return zzhi.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzG(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i2) {
        return zzhi.zzc(obj, (long) (zzs(i2) & 1048575)) == i;
    }

    static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzc = zzgz.zzc();
        zzeuVar.zzc = zzc;
        return zzc;
    }

    static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
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
        Field zzA;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field zzA2;
        Object obj2;
        Field zzA3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        boolean z = zzggVar.zzc() == 2;
        String zzd = zzggVar.zzd();
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
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
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
        Object[] zze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
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
                        zzA2 = zzA(cls, (String) obj);
                        zze[i83] = zzA2;
                    } else {
                        zzA2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzA2);
                    int i84 = i83 + 1;
                    obj2 = zze[i84];
                    if (obj2 instanceof Field) {
                        zzA3 = zzA(cls, (String) obj2);
                        zze[i84] = zzA3;
                    } else {
                        zzA3 = (Field) obj2;
                    }
                    str = zzd;
                    objArr = objArr2;
                    i21 = i2;
                    i22 = i80;
                    i20 = (int) unsafe.objectFieldOffset(zzA3);
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
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzA2);
                int i842 = i832 + 1;
                obj2 = zze[i842];
                if (obj2 instanceof Field) {
                }
                str = zzd;
                objArr = objArr2;
                i21 = i2;
                i22 = i80;
                i20 = (int) unsafe.objectFieldOffset(zzA3);
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i85 = i2 + 1;
                Field zzA4 = zzA(cls, (String) zze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i86 = i63 / 3;
                    objArr2[i86 + i86 + 1] = zzA4.getType();
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                            i20 = 1048575;
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i73 > 17) {
                                str = zzd;
                                i21 = i19;
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
                                    zzA = (Field) obj3;
                                } else {
                                    zzA = zzA(cls, (String) obj3);
                                    zze[i96] = zzA;
                                }
                                i21 = i19;
                                i23 = charAt26 % 32;
                                i20 = (int) unsafe.objectFieldOffset(zzA);
                            }
                            if (i73 >= 18 && i73 <= 49) {
                                iArr[i62] = objectFieldOffset;
                                i62++;
                            }
                        }
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                    i20 = 1048575;
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i21 = i19;
                    i22 = i16;
                    i23 = 0;
                    if (i73 >= 18) {
                        iArr[i62] = objectFieldOffset;
                        i62++;
                    }
                }
                i19 = i85;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                i20 = 1048575;
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i21 = i19;
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
            i2 = i21;
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
        return new zzfz(iArr3, objArr2, charAt, i4, zzggVar.zza(), z, false, iArr, charAt3, i60, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzdt.zzj(bArr, i, zzdsVar);
                    int i9 = zzdsVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzhm.zzd(bArr, zzj2, zzj2 + i9)) {
                            throw zzfa.zzb();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzez.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzdt.zzd(zzy(i8), bArr, i, i2, zzdsVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzdt.zza(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i10 = zzdsVar.zza;
                    zzex zzx = zzx(i8);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzc(obj).zzf(i3, Long.valueOf(i10));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzdt.zzj(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzdt.zzc(zzy(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzm;
        int zzd;
        int i11;
        int i12;
        int i13;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i15 = 1048575;
        int i16 = -1;
        int i17 = i;
        int i18 = -1;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        while (i17 < i14) {
            int i22 = i17 + 1;
            byte b2 = bArr2[i17];
            if (b2 < 0) {
                i3 = zzdt.zzk(b2, bArr2, i22, zzdsVar2);
                b = zzdsVar2.zza;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            int zzr = i23 > i18 ? zzfzVar.zzr(i23, i20 / 3) : zzfzVar.zzq(i23);
            if (zzr == i16) {
                i4 = i3;
                i5 = i23;
                i6 = i16;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i25 = iArr[zzr + 1];
                int zzu = zzu(i25);
                long j = i25 & i15;
                if (zzu <= 17) {
                    int i26 = iArr[zzr + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    if (i28 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i21);
                        }
                        if (i28 != 1048575) {
                            i21 = unsafe2.getInt(obj2, i28);
                        }
                        i19 = i28;
                    }
                    switch (zzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i9)));
                                i17 = i9 + 8;
                                i21 |= i27;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i9)));
                                i17 = i9 + 4;
                                i21 |= i27;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzm = zzdt.zzm(bArr2, i9, zzdsVar2);
                                unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                i21 |= i27;
                                i17 = zzm;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = zzdt.zzj(bArr2, i9, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i21 |= i27;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i9 = i3;
                                unsafe2.putLong(obj, j, zzdt.zzn(bArr2, i3));
                                i17 = i9 + 8;
                                i21 |= i27;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, i3));
                                i17 = i3 + 4;
                                i21 |= i27;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = zzdt.zzm(bArr2, i3, zzdsVar2);
                                zzhi.zzk(obj2, j, zzdsVar2.zzb != 0);
                                i21 |= i27;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = (536870912 & i25) == 0 ? zzdt.zzg(bArr2, i3, zzdsVar2) : zzdt.zzh(bArr2, i3, zzdsVar2);
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i21 |= i27;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzd(zzfzVar.zzy(i8), bArr2, i3, i14, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i21 |= i27;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zza(bArr2, i3, zzdsVar2);
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i21 |= i27;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i3, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i21 |= i27;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i8 = zzr;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i3, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar2.zza));
                                i21 |= i27;
                                i17 = zzd;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 16:
                            if (i24 != 0) {
                                i5 = i23;
                                i8 = zzr;
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                zzm = zzdt.zzm(bArr2, i3, zzdsVar2);
                                i8 = zzr;
                                i5 = i23;
                                i10 = 1048575;
                                unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                i21 |= i27;
                                i17 = zzm;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        default:
                            i5 = i23;
                            i8 = zzr;
                            i9 = i3;
                            i4 = i9;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i8 = zzr;
                    int i29 = i3;
                    i10 = 1048575;
                    i5 = i23;
                    if (zzu == 27) {
                        if (i24 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj2, j);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzeyVar);
                            }
                            i17 = zzdt.zze(zzfzVar.zzy(i8), b, bArr, i29, i2, zzeyVar, zzdsVar);
                            i21 = i21;
                            i20 = i8;
                            i18 = i5;
                            i15 = i10;
                            i16 = -1;
                        } else {
                            i11 = i29;
                            i12 = i21;
                            i13 = i19;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                        }
                    } else if (zzu <= 49) {
                        i12 = i21;
                        i13 = i19;
                        i6 = -1;
                        unsafe = unsafe2;
                        i7 = i8;
                        i17 = zzp(obj, bArr, i29, i2, b, i5, i24, i8, i25, zzu, j, zzdsVar);
                        if (i17 != i29) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i14 = i2;
                            zzdsVar2 = zzdsVar;
                            i19 = i13;
                            i16 = i6;
                            i18 = i5;
                            i21 = i12;
                            i20 = i7;
                            unsafe2 = unsafe;
                            i15 = 1048575;
                            zzfzVar = this;
                        } else {
                            i4 = i17;
                            i19 = i13;
                            i21 = i12;
                        }
                    } else {
                        i11 = i29;
                        i12 = i21;
                        i13 = i19;
                        unsafe = unsafe2;
                        i7 = i8;
                        i6 = -1;
                        if (zzu != 50) {
                            i17 = zzn(obj, bArr, i11, i2, b, i5, i24, i25, zzu, j, i7, zzdsVar);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                zzdsVar2 = zzdsVar;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                zzfzVar = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        } else if (i24 == 2) {
                            i17 = zzm(obj, bArr, i11, i2, i7, j, zzdsVar);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                zzdsVar2 = zzdsVar;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                zzfzVar = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        }
                    }
                    i4 = i11;
                    i19 = i13;
                    i21 = i12;
                }
            }
            i17 = zzdt.zzi(b, bArr, i4, i2, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            zzdsVar2 = zzdsVar;
            i16 = i6;
            i18 = i5;
            i20 = i7;
            unsafe2 = unsafe;
            i15 = 1048575;
        }
        int i30 = i21;
        int i31 = i19;
        Unsafe unsafe3 = unsafe2;
        if (i31 != i15) {
            unsafe3.putInt(obj, i31, i30);
        }
        if (i17 == i2) {
            return i17;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzds zzdsVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12 = i;
        Unsafe unsafe = zzb;
        zzey zzeyVar = (zzey) unsafe.getObject(obj, j2);
        if (!zzeyVar.zzc()) {
            int size = zzeyVar.size();
            zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzeyVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int zzj2 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i13 = zzdsVar.zza + zzj2;
                    while (zzj2 < i13) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i13) {
                        return zzj2;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = zzdt.zzj(bArr, i8, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int zzj3 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i14 = zzdsVar.zza + zzj3;
                    while (zzj3 < i14) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i14) {
                        return zzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = zzdt.zzj(bArr, i9, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i12)));
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
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int zzj4 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i15 = zzdsVar.zza + zzj4;
                    while (zzj4 < i15) {
                        zzj4 = zzdt.zzm(bArr, zzj4, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (zzj4 == i15) {
                        return zzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int zzm = zzdt.zzm(bArr, i12, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzdt.zzj(bArr, zzm, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzm;
                        }
                        zzm = zzdt.zzm(bArr, zzj5, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return zzm;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzdt.zzf(bArr, i12, zzeyVar, zzdsVar);
                }
                if (i5 == 0) {
                    return zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int zzj6 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i16 = zzdsVar.zza + zzj6;
                    while (zzj6 < i16) {
                        zzflVar3.zze(zzdt.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i16) {
                        return zzj6;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = zzdt.zzj(bArr, i10, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzflVar4.zze(zzdt.zzn(bArr, i12));
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
                    zzev zzevVar = (zzev) zzeyVar;
                    int zzj7 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i17 = zzdsVar.zza + zzj7;
                    while (zzj7 < i17) {
                        zzevVar.zze(zzdt.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i17) {
                        return zzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = zzdt.zzj(bArr, i11, zzdsVar);
                            if (i3 == zzdsVar.zza) {
                                zzevVar2.zze(zzdt.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i12;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    zzj = zzdt.zzj(bArr, i12, zzdsVar);
                    int i18 = zzdsVar.zza + zzj;
                    while (zzj < i18) {
                        zzj = zzdt.zzm(bArr, zzj, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (zzj != i18) {
                        throw zzfa.zzf();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int zzm2 = zzdt.zzm(bArr, i12, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzdt.zzj(bArr, zzm2, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzdt.zzm(bArr, zzj8, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i12;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzdt.zzj(bArr, i12, zzdsVar);
                        int i19 = zzdsVar.zza;
                        if (i19 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i19 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, zzj9, i19, zzez.zzb));
                            zzj9 += i19;
                        }
                        while (zzj9 < i2) {
                            int zzj10 = zzdt.zzj(bArr, zzj9, zzdsVar);
                            if (i3 != zzdsVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzdt.zzj(bArr, zzj10, zzdsVar);
                            int i20 = zzdsVar.zza;
                            if (i20 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i20 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, zzj9, i20, zzez.zzb));
                                zzj9 += i20;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i21 = zzdsVar.zza;
                    if (i21 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i21 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i22 = zzj11 + i21;
                        if (!zzhm.zzd(bArr, zzj11, i22)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, zzj11, i21, zzez.zzb));
                        zzj11 = i22;
                    }
                    while (zzj11 < i2) {
                        int zzj12 = zzdt.zzj(bArr, zzj11, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzdt.zzj(bArr, zzj12, zzdsVar);
                        int i23 = zzdsVar.zza;
                        if (i23 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i23 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i24 = zzj11 + i23;
                            if (!zzhm.zzd(bArr, zzj11, i24)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, zzj11, i23, zzez.zzb));
                            zzj11 = i24;
                        }
                    }
                    return zzj11;
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return zzdt.zze(zzy(i6), i3, bArr, i, i2, zzeyVar, zzdsVar);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i25 = zzdsVar.zza;
                    if (i25 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i25 > bArr.length - zzj13) {
                        throw zzfa.zzf();
                    }
                    if (i25 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, zzj13, i25));
                        zzj13 += i25;
                    }
                    while (zzj13 < i2) {
                        int zzj14 = zzdt.zzj(bArr, zzj13, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzdt.zzj(bArr, zzj14, zzdsVar);
                        int i26 = zzdsVar.zza;
                        if (i26 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i26 > bArr.length - zzj13) {
                            throw zzfa.zzf();
                        }
                        if (i26 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, zzj13, i26));
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
                        zzj = zzdt.zzl(i3, bArr, i, i2, zzeyVar, zzdsVar);
                    }
                    return i12;
                }
                zzj = zzdt.zzf(bArr, i12, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object zzd = zzgj.zzd(i4, zzeyVar, zzx(i6), zzgzVar, this.zzm);
                if (zzd != null) {
                    zzeuVar.zzc = (zzgz) zzd;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int zzj15 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i27 = zzdsVar.zza + zzj15;
                    while (zzj15 < i27) {
                        zzj15 = zzdt.zzj(bArr, zzj15, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (zzj15 == i27) {
                        return zzj15;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int zzj16 = zzdt.zzj(bArr, i12, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (zzj16 < i2) {
                        int zzj17 = zzdt.zzj(bArr, zzj16, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzdt.zzj(bArr, zzj17, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return zzj16;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int zzj18 = zzdt.zzj(bArr, i12, zzdsVar);
                    int i28 = zzdsVar.zza + zzj18;
                    while (zzj18 < i28) {
                        zzj18 = zzdt.zzm(bArr, zzj18, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (zzj18 == i28) {
                        return zzj18;
                    }
                    throw zzfa.zzf();
                }
                if (i5 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int zzm3 = zzdt.zzm(bArr, i12, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (zzm3 < i2) {
                        int zzj19 = zzdt.zzj(bArr, zzm3, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzdt.zzm(bArr, zzj19, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return zzm3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    zzgh zzy = zzy(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = zzdt.zzc(zzy, bArr, i, i2, i29, zzdsVar);
                    zzeyVar.add(zzdsVar.zzc);
                    while (zzc < i2) {
                        int zzj20 = zzdt.zzj(bArr, zzc, zzdsVar);
                        if (i3 != zzdsVar.zza) {
                            return zzc;
                        }
                        zzc = zzdt.zzc(zzy, bArr, zzj20, i2, i29, zzdsVar);
                        zzeyVar.add(zzdsVar.zzc);
                    }
                    return zzc;
                }
                return i12;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i2);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i2) {
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

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i) {
        int i2 = i / 3;
        return (zzex) this.zzd[i2 + i2 + 1];
    }

    private final zzgh zzy(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgh zzghVar = (zzgh) this.zzd[i3];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzv = zzv(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzv;
            int i5 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzez.zza(zzhi.zzt(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzhi.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j);
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
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzl(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.zzm.zza(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03b8, code lost:
    
        if (r0 != r19) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ba, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r9 = r37;
        r2 = r17;
        r3 = r18;
        r1 = r20;
        r5 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03d4, code lost:
    
        r7 = r36;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03fa, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x041d, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzb(Object obj, byte[] bArr, int i, int i2, int i3, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
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
        int i22;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i23 = i2;
        int i24 = i3;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i25 = i;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        int i30 = 1048575;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b = bArr2[i25];
                if (b < 0) {
                    int zzk = zzdt.zzk(b, bArr2, i31, zzdsVar2);
                    i5 = zzdsVar2.zza;
                    i31 = zzk;
                } else {
                    i5 = b;
                }
                int i32 = i5 >>> 3;
                int i33 = i5 & 7;
                int zzr = i32 > i29 ? zzfzVar.zzr(i32, i27 / 3) : zzfzVar.zzq(i32);
                if (zzr == -1) {
                    i6 = i32;
                    i7 = i5;
                    i8 = i28;
                    unsafe = unsafe2;
                    i4 = i24;
                    i9 = 0;
                    i10 = i31;
                } else {
                    int[] iArr = zzfzVar.zzc;
                    int i34 = iArr[zzr + 1];
                    int zzu = zzu(i34);
                    int i35 = i31;
                    long j = i34 & 1048575;
                    int i36 = i5;
                    if (zzu <= 17) {
                        int i37 = iArr[zzr + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i30) {
                            i13 = zzr;
                            if (i30 != 1048575) {
                                unsafe2.putInt(obj3, i30, i28);
                            }
                            i11 = i39;
                            i14 = unsafe2.getInt(obj3, i39);
                        } else {
                            i13 = zzr;
                            i11 = i30;
                            i14 = i28;
                        }
                        switch (zzu) {
                            case 0:
                                i17 = i13;
                                i16 = i35;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 == 1) {
                                    zzhi.zzl(obj3, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i16)));
                                    i25 = i16 + 8;
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i27 = i17;
                                    i29 = i6;
                                    i26 = i36;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 1:
                                i17 = i13;
                                i16 = i35;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 == 5) {
                                    zzhi.zzm(obj3, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i16)));
                                    i25 = i16 + 4;
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i27 = i17;
                                    i29 = i6;
                                    i26 = i36;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 2:
                            case 3:
                                i17 = i13;
                                i16 = i35;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 == 0) {
                                    int zzm = zzdt.zzm(bArr2, i16, zzdsVar2);
                                    unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i25 = zzm;
                                    i27 = i17;
                                    i29 = i6;
                                    i26 = i36;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 4:
                            case 11:
                                i17 = i13;
                                i16 = i35;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 == 0) {
                                    i25 = zzdt.zzj(bArr2, i16, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzdsVar2.zza);
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i27 = i17;
                                    i29 = i6;
                                    i26 = i36;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 5:
                            case 14:
                                i16 = i35;
                                i18 = i36;
                                bArr2 = bArr;
                                int i40 = i13;
                                i6 = i32;
                                i19 = i40;
                                if (i33 == 1) {
                                    i36 = i18;
                                    i17 = i19;
                                    unsafe2.putLong(obj, j, zzdt.zzn(bArr2, i16));
                                    i25 = i16 + 8;
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i27 = i17;
                                    i29 = i6;
                                    i26 = i36;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i36 = i18;
                                    i17 = i19;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 6:
                            case 13:
                                i20 = i2;
                                i16 = i35;
                                i18 = i36;
                                bArr2 = bArr;
                                int i41 = i13;
                                i6 = i32;
                                i19 = i41;
                                if (i33 == 5) {
                                    unsafe2.putInt(obj3, j, zzdt.zzb(bArr2, i16));
                                    i21 = i16 + 4;
                                    int i42 = i14 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i25 = i21;
                                    i26 = i18;
                                    i30 = i11;
                                    i23 = i20;
                                    i28 = i42;
                                    i29 = i6;
                                    break;
                                } else {
                                    i36 = i18;
                                    i17 = i19;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 7:
                                i20 = i2;
                                i16 = i35;
                                i18 = i36;
                                bArr2 = bArr;
                                int i43 = i13;
                                i6 = i32;
                                i19 = i43;
                                if (i33 == 0) {
                                    i21 = zzdt.zzm(bArr2, i16, zzdsVar2);
                                    zzhi.zzk(obj3, j, zzdsVar2.zzb != 0);
                                    int i422 = i14 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i25 = i21;
                                    i26 = i18;
                                    i30 = i11;
                                    i23 = i20;
                                    i28 = i422;
                                    i29 = i6;
                                    break;
                                } else {
                                    i36 = i18;
                                    i17 = i19;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 8:
                                i20 = i2;
                                i16 = i35;
                                i18 = i36;
                                bArr2 = bArr;
                                int i44 = i13;
                                i6 = i32;
                                i19 = i44;
                                if (i33 == 2) {
                                    i21 = (536870912 & i34) == 0 ? zzdt.zzg(bArr2, i16, zzdsVar2) : zzdt.zzh(bArr2, i16, zzdsVar2);
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    int i4222 = i14 | i38;
                                    i24 = i3;
                                    i27 = i19;
                                    i25 = i21;
                                    i26 = i18;
                                    i30 = i11;
                                    i23 = i20;
                                    i28 = i4222;
                                    i29 = i6;
                                    break;
                                } else {
                                    i36 = i18;
                                    i17 = i19;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 9:
                                i15 = i13;
                                i16 = i35;
                                i22 = i36;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 == 2) {
                                    i25 = zzdt.zzd(zzfzVar.zzy(i15), bArr2, i16, i2, zzdsVar2);
                                    if ((i14 & i38) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    int i45 = i14 | i38;
                                    i24 = i3;
                                    i27 = i15;
                                    i29 = i6;
                                    i30 = i11;
                                    i28 = i45;
                                    i26 = i22;
                                    i23 = i2;
                                    break;
                                } else {
                                    i36 = i22;
                                    i17 = i15;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 10:
                                i15 = i13;
                                i16 = i35;
                                i22 = i36;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 == 2) {
                                    i25 = zzdt.zza(bArr2, i16, zzdsVar2);
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i27 = i15;
                                    i26 = i22;
                                    i29 = i6;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i36 = i22;
                                    i17 = i15;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 12:
                                i15 = i13;
                                i16 = i35;
                                i22 = i36;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 != 0) {
                                    i36 = i22;
                                    i17 = i15;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                } else {
                                    i25 = zzdt.zzj(bArr2, i16, zzdsVar2);
                                    int i46 = zzdsVar2.zza;
                                    zzex zzx = zzfzVar.zzx(i15);
                                    if (zzx == null || zzx.zza()) {
                                        unsafe2.putInt(obj3, j, i46);
                                        i28 = i14 | i38;
                                        i24 = i3;
                                        i27 = i15;
                                        i26 = i22;
                                        i29 = i6;
                                        i30 = i11;
                                        i23 = i2;
                                        break;
                                    } else {
                                        zzc(obj).zzf(i22, Long.valueOf(i46));
                                        i24 = i3;
                                        i28 = i14;
                                        i27 = i15;
                                        i26 = i22;
                                        i29 = i6;
                                        i30 = i11;
                                        i23 = i2;
                                    }
                                }
                                break;
                            case 15:
                                i15 = i13;
                                i16 = i35;
                                i22 = i36;
                                bArr2 = bArr;
                                i6 = i32;
                                if (i33 == 0) {
                                    i25 = zzdt.zzj(bArr2, i16, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzei.zzb(zzdsVar2.zza));
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i27 = i15;
                                    i26 = i22;
                                    i29 = i6;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i36 = i22;
                                    i17 = i15;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            case 16:
                                i15 = i13;
                                i16 = i35;
                                i6 = i32;
                                if (i33 == 0) {
                                    bArr2 = bArr;
                                    int zzm2 = zzdt.zzm(bArr2, i16, zzdsVar2);
                                    i22 = i36;
                                    unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                    i28 = i14 | i38;
                                    i24 = i3;
                                    i27 = i15;
                                    i25 = zzm2;
                                    i26 = i22;
                                    i29 = i6;
                                    i30 = i11;
                                    i23 = i2;
                                    break;
                                } else {
                                    i36 = i36;
                                    i17 = i15;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                            default:
                                if (i33 == 3) {
                                    int i47 = i13;
                                    i25 = zzdt.zzc(zzfzVar.zzy(i47), bArr, i35, i2, (i32 << 3) | 4, zzdsVar);
                                    if ((i14 & i38) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    i28 = i14 | i38;
                                    bArr2 = bArr;
                                    i23 = i2;
                                    i24 = i3;
                                    i27 = i47;
                                    i26 = i36;
                                    i29 = i32;
                                    i30 = i11;
                                    break;
                                } else {
                                    i15 = i13;
                                    i16 = i35;
                                    i6 = i32;
                                    i17 = i15;
                                    i4 = i3;
                                    i8 = i14;
                                    unsafe = unsafe2;
                                    i10 = i16;
                                    i9 = i17;
                                    i7 = i36;
                                    i30 = i11;
                                    break;
                                }
                        }
                    } else {
                        i6 = i32;
                        bArr2 = bArr;
                        if (zzu != 27) {
                            i8 = i28;
                            i11 = i30;
                            if (zzu <= 49) {
                                unsafe = unsafe2;
                                i9 = zzr;
                                i25 = zzp(obj, bArr, i35, i2, i36, i6, i33, zzr, i34, zzu, j, zzdsVar);
                            } else {
                                i12 = i35;
                                unsafe = unsafe2;
                                i9 = zzr;
                                if (zzu != 50) {
                                    i25 = zzn(obj, bArr, i12, i2, i36, i6, i33, i34, zzu, j, i9, zzdsVar);
                                } else if (i33 == 2) {
                                    i25 = zzm(obj, bArr, i12, i2, i9, j, zzdsVar);
                                }
                            }
                        } else if (i33 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj3, j);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzeyVar);
                            }
                            i26 = i36;
                            i11 = i30;
                            i25 = zzdt.zze(zzfzVar.zzy(zzr), i26, bArr, i35, i2, zzeyVar, zzdsVar);
                            i24 = i3;
                            i27 = zzr;
                            i29 = i6;
                            i28 = i28;
                            i30 = i11;
                            i23 = i2;
                        } else {
                            i8 = i28;
                            i11 = i30;
                            i12 = i35;
                            unsafe = unsafe2;
                            i9 = zzr;
                        }
                        i4 = i3;
                        i10 = i12;
                        i7 = i36;
                        i30 = i11;
                    }
                }
                if (i7 != i4 || i4 == 0) {
                    i25 = zzdt.zzi(i7, bArr, i10, i2, zzc(obj), zzdsVar);
                    zzfzVar = this;
                    obj3 = obj;
                    bArr2 = bArr;
                    i23 = i2;
                    zzdsVar2 = zzdsVar;
                    i24 = i4;
                    i26 = i7;
                    i29 = i6;
                    i27 = i9;
                    i28 = i8;
                    unsafe2 = unsafe;
                } else {
                    i25 = i10;
                    i26 = i7;
                    i28 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i24;
            }
        }
        if (i30 != 1048575) {
            long j2 = i30;
            obj2 = obj;
            unsafe.putInt(obj2, j2, i28);
        } else {
            obj2 = obj;
        }
        for (int i48 = this.zzj; i48 < this.zzk; i48++) {
            int i49 = this.zzi[i48];
            int i50 = this.zzc[i49];
            Object zzf = zzhi.zzf(obj2, zzv(i49) & 1048575);
            if (zzf != null && zzx(i49) != null) {
                throw null;
            }
        }
        if (i4 == 0) {
            if (i25 != i2) {
                throw zzfa.zzd();
            }
        } else if (i25 > i2 || i26 != i4) {
            throw zzfa.zzd();
        }
        return i25;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i2 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i2 >= i) {
                break;
            }
            long zzv = zzv(this.zzi[i2]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
            }
            i2++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i, i2, zzdsVar);
        } else {
            zzb(obj, bArr, i, i2, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzv = zzv(i);
            long j = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i) && Double.doubleToLongBits(zzhi.zza(obj, j)) == Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(obj, obj2, i) && Float.floatToIntBits(zzhi.zzb(obj, j)) == Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(obj, obj2, i) && zzhi.zzt(obj, j) == zzhi.zzt(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(obj, obj2, i) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(obj, obj2, i) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(obj, obj2, i) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
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
                    zzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case 50:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
                    long zzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int i6 = this.zzi[i5];
            int i7 = this.zzc[i6];
            int zzv = zzv(i6);
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
            if ((268435456 & zzv) != 0 && !zzH(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(obj, i7, i6) && !zzI(obj, zzv, zzy(i6))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfq) zzhi.zzf(obj, zzv & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzy.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(obj, i6, i, i2, i10) && !zzI(obj, zzv, zzy(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzv = zzv(i);
            long j = 1048575 & zzv;
            int i2 = this.zzc[i];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j);
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
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }
}
