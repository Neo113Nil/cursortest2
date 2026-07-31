package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes15.dex */
final class zznk<T> implements zzns<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzol.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznh zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoe zzl;
    private final zzlq zzm;

    private zznk(int[] iArr, Object[] objArr, int i, int i2, zznh zznhVar, boolean z, int[] iArr2, int i3, int i4, zznm zznmVar, zzmu zzmuVar, zzoe zzoeVar, zzlq zzlqVar, zznc zzncVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlqVar != null && (zznhVar instanceof zzma)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoeVar;
        this.zzm = zzlqVar;
        this.zzg = zznhVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzns zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzns zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzol.zzq(obj, j, (1 << (zzp >>> 20)) | zzol.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzol.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzol.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzol.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzol.zzb(obj, j2)) != 0;
            case 2:
                return zzol.zzd(obj, j2) != 0;
            case 3:
                return zzol.zzd(obj, j2) != 0;
            case 4:
                return zzol.zzc(obj, j2) != 0;
            case 5:
                return zzol.zzd(obj, j2) != 0;
            case 6:
                return zzol.zzc(obj, j2) != 0;
            case 7:
                return zzol.zzw(obj, j2);
            case 8:
                Object zzf = zzol.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzld) {
                    return !zzld.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzol.zzf(obj, j2) != null;
            case 10:
                return !zzld.zzb.equals(zzol.zzf(obj, j2));
            case 11:
                return zzol.zzc(obj, j2) != 0;
            case 12:
                return zzol.zzc(obj, j2) != 0;
            case 13:
                return zzol.zzc(obj, j2) != 0;
            case 14:
                return zzol.zzd(obj, j2) != 0;
            case 15:
                return zzol.zzc(obj, j2) != 0;
            case 16:
                return zzol.zzd(obj, j2) != 0;
            case 17:
                return zzol.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzns zznsVar) {
        return zznsVar.zzk(zzol.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmd) {
            return ((zzmd) obj).zzcw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzol.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzol.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzor zzorVar) throws IOException {
        if (obj instanceof String) {
            zzorVar.zzG(i, (String) obj);
        } else {
            zzorVar.zzd(i, (zzld) obj);
        }
    }

    static zzof zzd(Object obj) {
        zzmd zzmdVar = (zzmd) obj;
        zzof zzofVar = zzmdVar.zzc;
        if (zzofVar != zzof.zzc()) {
            return zzofVar;
        }
        zzof zzf = zzof.zzf();
        zzmdVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zznk zzl(Class cls, zzne zzneVar, zznm zznmVar, zzmu zzmuVar, zzoe zzoeVar, zzlq zzlqVar, zznc zzncVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zznr zznrVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzz;
        int i25;
        char charAt11;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        if (!(zzneVar instanceof zznr)) {
            throw null;
        }
        zznr zznrVar2 = (zznr) zzneVar;
        String zzd = zznrVar2.zzd();
        int length = zzd.length();
        char c = 55296;
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
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i36 = charAt16 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt15 = zzd.charAt(i35);
                if (charAt15 < 55296) {
                    break;
                }
                i36 |= (charAt15 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt16 = i36 | (charAt15 << i37);
            i35 = i33;
        }
        if (charAt16 == 0) {
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
            iArr = zza;
            i6 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt17 = zzd.charAt(i35);
            if (charAt17 >= 55296) {
                int i39 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt17 = i39 | (charAt10 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt18 = i42 | (charAt9 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt19 = i45 | (charAt8 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            int charAt20 = zzd.charAt(i44);
            if (charAt20 >= 55296) {
                int i48 = charAt20 & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt20 = i48 | (charAt7 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt = i51 | (charAt6 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            charAt2 = zzd.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt2 = i54 | (charAt5 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt21 = i57 | (charAt4 << i58);
                i56 = i8;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i7 = i59 + 1;
                    charAt3 = zzd.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i7;
                }
                charAt22 = i60 | (charAt3 << i61);
                i59 = i7;
            }
            int i62 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i2 = charAt19;
            i3 = charAt22;
            i4 = i62;
            iArr = iArr2;
            i5 = charAt20;
            i6 = charAt17;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zznrVar2.zze();
        Class<?> cls2 = zznrVar2.zza().getClass();
        int i63 = i3 + charAt2;
        int i64 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i3;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i35 < length) {
            int i69 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    if (charAt14 < c) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                }
                charAt23 = i70 | (charAt14 << i72);
                i15 = i32;
            } else {
                i15 = i69;
            }
            int i73 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i31 = i75 + 1;
                    charAt13 = zzd.charAt(i75);
                    if (charAt13 < c) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i31;
                }
                charAt24 = i74 | (charAt13 << i76);
                i16 = i31;
            } else {
                i16 = i73;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = charAt24 & 255;
            int i78 = length;
            int i79 = charAt24 & 2048;
            int i80 = i5;
            if (i77 >= 51) {
                int i81 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        charAt12 = zzd.charAt(i83);
                        i17 = i2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i82 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i83 = i30;
                        i2 = i17;
                    }
                    charAt25 = i82 | (charAt12 << i84);
                    i28 = i30;
                } else {
                    i17 = i2;
                    i28 = i81;
                }
                int i85 = i77 - 51;
                int i86 = i28;
                if (i85 == 9 || i85 == 17) {
                    i29 = i4 + 1;
                    int i87 = i68 / 3;
                    objArr[i87 + i87 + 1] = zze[i4];
                } else {
                    if (i85 == 12) {
                        if (zznrVar2.zzc() == 1 || i79 != 0) {
                            i29 = i4 + 1;
                            int i88 = i68 / 3;
                            objArr[i88 + i88 + 1] = zze[i4];
                        } else {
                            i79 = 0;
                        }
                    }
                    int i89 = charAt25 + charAt25;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzz2 = zzz(cls2, (String) obj);
                        zze[i89] = zzz2;
                    } else {
                        zzz2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz2);
                    int i90 = i89 + 1;
                    obj2 = zze[i90];
                    int i91 = i79;
                    if (obj2 instanceof Field) {
                        zzz3 = zzz(cls2, (String) obj2);
                        zze[i90] = zzz3;
                    } else {
                        zzz3 = (Field) obj2;
                    }
                    i18 = i4;
                    i22 = i86;
                    i19 = charAt23;
                    i20 = (int) unsafe.objectFieldOffset(zzz3);
                    i23 = 0;
                    str = zzd;
                    zznrVar = zznrVar2;
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i91;
                }
                i4 = i29;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzz2);
                int i902 = i892 + 1;
                obj2 = zze[i902];
                int i912 = i79;
                if (obj2 instanceof Field) {
                }
                i18 = i4;
                i22 = i86;
                i19 = charAt23;
                i20 = (int) unsafe.objectFieldOffset(zzz3);
                i23 = 0;
                str = zzd;
                zznrVar = zznrVar2;
                objectFieldOffset = objectFieldOffset22;
                i24 = i912;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i4]);
                i19 = charAt23;
                if (i77 == 9 || i77 == 17) {
                    zznrVar = zznrVar2;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = zzz4.getType();
                } else {
                    if (i77 == 27) {
                        zznrVar = zznrVar2;
                        i26 = 1;
                        i27 = i4 + 2;
                    } else if (i77 == 49) {
                        i27 = i4 + 2;
                        zznrVar = zznrVar2;
                        i26 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            zznrVar = zznrVar2;
                            if (zznrVar2.zzc() == 1 || i79 != 0) {
                                i27 = i4 + 2;
                                int i93 = i68 / 3;
                                objArr[i93 + i93 + 1] = zze[i18];
                                str = zzd;
                                i18 = i27;
                            } else {
                                str = zzd;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i4 + 2;
                            int i95 = i65 + 1;
                            iArr[i65] = i68;
                            int i96 = i68 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = zze[i18];
                            if (i79 != 0) {
                                i18 = i4 + 3;
                                objArr[i97 + 1] = zze[i94];
                                str = zzd;
                                i65 = i95;
                                zznrVar = zznrVar2;
                            } else {
                                i18 = i94;
                                i65 = i95;
                                i79 = 0;
                                zznrVar = zznrVar2;
                            }
                        } else {
                            zznrVar = zznrVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                        i20 = 1048575;
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i21 = i79;
                            i22 = i16;
                            i23 = 0;
                        } else {
                            int i98 = i16 + 1;
                            int charAt26 = str.charAt(i16);
                            if (charAt26 >= 55296) {
                                int i99 = charAt26 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i25 = i98 + 1;
                                    charAt11 = str.charAt(i98);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt11 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i25;
                                }
                                charAt26 = i99 | (charAt11 << i100);
                                i98 = i25;
                            }
                            int i101 = i6 + i6 + (charAt26 / 32);
                            Object obj3 = zze[i101];
                            i22 = i98;
                            if (obj3 instanceof Field) {
                                zzz = (Field) obj3;
                            } else {
                                zzz = zzz(cls2, (String) obj3);
                                zze[i101] = zzz;
                            }
                            i21 = i79;
                            i23 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzz);
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i24 = i21;
                    }
                    int i102 = i68 / 3;
                    objArr[i102 + i102 + i26] = zze[i18];
                    str = zzd;
                    i18 = i27;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i21 = i79;
                    i22 = i16;
                    i23 = 0;
                    if (i77 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i24 = i21;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                i20 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i21 = i79;
                i22 = i16;
                i23 = 0;
                if (i77 >= 18) {
                }
                i24 = i21;
            }
            int i103 = i68 + 1;
            iArr3[i68] = i19;
            int i104 = i68 + 2;
            Class<?> cls3 = cls2;
            iArr3[i103] = objectFieldOffset | (i24 != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i77 << 20);
            i68 += 3;
            iArr3[i104] = (i23 << 20) | i20;
            zzd = str;
            i4 = i18;
            length = i78;
            i5 = i80;
            cls2 = cls3;
            zznrVar2 = zznrVar;
            i35 = i22;
            i2 = i17;
            c = 55296;
        }
        return new zznk(iArr3, objArr, i2, i5, zznrVar2.zza(), false, iArr, i3, i63, zznmVar, zzmuVar, zzoeVar, zzlqVar, zzncVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzol.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzol.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzol.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzol.zzf(obj, j)).longValue();
    }

    private final zzmg zzu(int i) {
        int i2 = i / 3;
        return (zzmg) this.zzd[i2 + i2 + 1];
    }

    private final zzns zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzns zznsVar = (zzns) objArr[i3];
        if (zznsVar != null) {
            return zznsVar;
        }
        zzns zzb2 = zznp.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzns zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzns zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v256, types: [int] */
    /* JADX WARN: Type inference failed for: r0v263, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v116, types: [int] */
    /* JADX WARN: Type inference failed for: r1v119, types: [int] */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [int] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v40, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(Object obj) {
        int i;
        boolean z;
        ?? r5;
        int zzz;
        int zzz2;
        int zzz3;
        int zzA;
        int zzz4;
        int zzz5;
        int zzd;
        int zzz6;
        ?? zzg;
        int size;
        int zzz7;
        int zzy;
        int zzy2;
        ?? r3;
        int zzx;
        ?? r1;
        ?? r0;
        int zze;
        int zzz8;
        int zzz9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z2 = false;
        int i2 = 1048575;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int zza2 = i4 + ((zzmd) obj).zzc.zza();
                if (!this.zzh) {
                    return zza2;
                }
                zzoa zzoaVar = ((zzma) obj).zzb.zza;
                int zzc = zzoaVar.zzc();
                int i6 = 0;
                for (int i7 = 0; i7 < zzc; i7++) {
                    Map.Entry zzg2 = zzoaVar.zzg(i7);
                    i6 += zzlu.zzb((zzlt) ((zznw) zzg2).zza(), zzg2.getValue());
                }
                for (Map.Entry entry : zzoaVar.zzd()) {
                    i6 += zzlu.zzb((zzlt) entry.getKey(), entry.getValue());
                }
                return zza2 + i6;
            }
            int zzs = zzs(i3);
            int zzr = zzr(zzs);
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (zzr <= 17) {
                if (i10 != i5) {
                    z3 = i10 == i2 ? z2 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                z = z3;
                r5 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                z = z3;
                r5 = z2;
            }
            int i11 = zzs & i2;
            if (zzr >= zzlv.zzJ.zza()) {
                zzlv.zzW.zza();
            }
            long j = i11;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz = zzlk.zzz(i8 << 3);
                        r0 = zzz + 8;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 1:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz2 = zzlk.zzz(i8 << 3);
                        r0 = zzz2 + 4;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 2:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(j2);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 3:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(j3);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 4:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(j4);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 5:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz = zzlk.zzz(i8 << 3);
                        r0 = zzz + 8;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 6:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz2 = zzlk.zzz(i8 << 3);
                        r0 = zzz2 + 4;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 7:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz4 = zzlk.zzz(i8 << 3);
                        r0 = zzz4 + 1;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 8:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzld) {
                            zzz5 = zzlk.zzz(i12);
                            zzd = ((zzld) object).zzd();
                            zzz6 = zzlk.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i4 += r0;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        } else {
                            zzz3 = zzlk.zzz(i12);
                            zzA = zzlk.zzy((String) object);
                            r0 = zzz3 + zzA;
                            i4 += r0;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        }
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 9:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        r0 = zznu.zzh(i8, unsafe.getObject(obj, j), zzv(i3));
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 10:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzld zzldVar = (zzld) unsafe.getObject(obj, j);
                        zzz5 = zzlk.zzz(i8 << 3);
                        zzd = zzldVar.zzd();
                        zzz6 = zzlk.zzz(zzd);
                        r0 = zzz5 + zzz6 + zzd;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 11:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i13 = unsafe.getInt(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzz(i13);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 12:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(j5);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 13:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz2 = zzlk.zzz(i8 << 3);
                        r0 = zzz2 + 4;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 14:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz = zzlk.zzz(i8 << 3);
                        r0 = zzz + 8;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 15:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i14 = unsafe.getInt(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzz((i14 >> 31) ^ (i14 + i14));
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 16:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA((j6 >> 63) ^ (j6 + j6));
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 17:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        r0 = zzlk.zzw(i8, (zznh) unsafe.getObject(obj, j), zzv(i3));
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 18:
                    r0 = zznu.zzd(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 19:
                    r0 = zznu.zzb(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i15 = zznu.zza;
                    if (list.size() != 0) {
                        zzg = zznu.zzg(list) + (list.size() * zzlk.zzz(i8 << 3));
                        i4 += zzg;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    zzg = z2;
                    i4 += zzg;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i16 = zznu.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzz3 = zznu.zzl(list2);
                        zzz7 = zzlk.zzz(i8 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    r0 = z2;
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zznu.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzz3 = zznu.zzf(list3);
                        zzz7 = zzlk.zzz(i8 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    r0 = z2;
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 23:
                    r0 = zznu.zzd(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 24:
                    r0 = zznu.zzb(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i18 = zznu.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzlk.zzz(i8 << 3) + 1);
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    r0 = z2;
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i19 = zznu.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzz10 = zzlk.zzz(i8 << 3) * size3;
                        if (r02 instanceof zzmt) {
                            zzmt zzmtVar = (zzmt) r02;
                            zzg = zzz10;
                            for (?? r32 = z2; r32 < size3; r32++) {
                                Object zzc2 = zzmtVar.zzc();
                                if (zzc2 instanceof zzld) {
                                    int zzd2 = ((zzld) zzc2).zzd();
                                    zzy2 = zzg + zzlk.zzz(zzd2) + zzd2;
                                } else {
                                    zzy2 = zzg + zzlk.zzy((String) zzc2);
                                }
                                zzg = zzy2;
                            }
                        } else {
                            zzg = zzz10;
                            for (?? r33 = z2; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzld) {
                                    int zzd3 = ((zzld) obj2).zzd();
                                    zzy = zzg + zzlk.zzz(zzd3) + zzd3;
                                } else {
                                    zzy = zzg + zzlk.zzy((String) obj2);
                                }
                                zzg = zzy;
                            }
                        }
                        i4 += zzg;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    zzg = z2;
                    i4 += zzg;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzns zzv = zzv(i3);
                    int i20 = zznu.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z2;
                    } else {
                        r3 = zzlk.zzz(i8 << 3) * size4;
                        for (?? r42 = z2; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzms) {
                                int zza3 = ((zzms) obj3).zza();
                                zzx = (r3 == true ? 1 : 0) + zzlk.zzz(zza3) + zza3;
                            } else {
                                zzx = (r3 == true ? 1 : 0) + zzlk.zzx((zznh) obj3, zzv);
                            }
                            r3 = zzx;
                        }
                    }
                    i4 += r3;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i21 = zznu.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z2;
                    } else {
                        r1 = size5 * zzlk.zzz(i8 << 3);
                        for (?? r2 = z2; r2 < r04.size(); r2++) {
                            int zzd4 = ((zzld) r04.get(r2)).zzd();
                            r1 += zzlk.zzz(zzd4) + zzd4;
                        }
                    }
                    i4 += r1;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i22 = zznu.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzz3 = zznu.zzk(list5);
                        zzz7 = zzlk.zzz(i8 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    r0 = z2;
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i23 = zznu.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzz3 = zznu.zza(list6);
                        zzz7 = zzlk.zzz(i8 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    r0 = z2;
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 31:
                    r0 = zznu.zzb(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 32:
                    r0 = zznu.zzd(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i24 = zznu.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzz3 = zznu.zzi(list7);
                        zzz7 = zzlk.zzz(i8 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    r0 = z2;
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i25 = zznu.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzz3 = zznu.zzj(list8);
                        zzz7 = zzlk.zzz(i8 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                    r0 = z2;
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 35:
                    zze = zznu.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 36:
                    zze = zznu.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 37:
                    zze = zznu.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 38:
                    zze = zznu.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 39:
                    zze = zznu.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 40:
                    zze = zznu.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 41:
                    zze = zznu.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i26 = zznu.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 43:
                    zze = zznu.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 44:
                    zze = zznu.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 45:
                    zze = zznu.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 46:
                    zze = zznu.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 47:
                    zze = zznu.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 48:
                    zze = zznu.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzlk.zzz(i8 << 3);
                        zzz9 = zzlk.zzz(zze);
                        r1 = zzz8 + zzz9 + zze;
                        i4 += r1;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzns zzv2 = zzv(i3);
                    int i27 = zznu.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z2;
                    } else {
                        boolean z4 = z2;
                        r4 = z4;
                        ?? r34 = z4;
                        while (r34 < size6) {
                            int zzw = zzlk.zzw(i8, (zznh) r05.get(r34), zzv2);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzw;
                        }
                    }
                    i4 += r4;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 50:
                    zznb zznbVar = (zznb) unsafe.getObject(obj, j);
                    if (zznbVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zznbVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 51:
                    if (zzM(obj, i8, i3)) {
                        zzz = zzlk.zzz(i8 << 3);
                        r0 = zzz + 8;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 52:
                    if (zzM(obj, i8, i3)) {
                        zzz2 = zzlk.zzz(i8 << 3);
                        r0 = zzz2 + 4;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 53:
                    if (zzM(obj, i8, i3)) {
                        long zzt = zzt(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(zzt);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 54:
                    if (zzM(obj, i8, i3)) {
                        long zzt2 = zzt(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(zzt2);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 55:
                    if (zzM(obj, i8, i3)) {
                        long zzo = zzo(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(zzo);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 56:
                    if (zzM(obj, i8, i3)) {
                        zzz = zzlk.zzz(i8 << 3);
                        r0 = zzz + 8;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 57:
                    if (zzM(obj, i8, i3)) {
                        zzz2 = zzlk.zzz(i8 << 3);
                        r0 = zzz2 + 4;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 58:
                    if (zzM(obj, i8, i3)) {
                        zzz4 = zzlk.zzz(i8 << 3);
                        r0 = zzz4 + 1;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 59:
                    if (zzM(obj, i8, i3)) {
                        int i28 = i8 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzld) {
                            zzz5 = zzlk.zzz(i28);
                            zzd = ((zzld) object2).zzd();
                            zzz6 = zzlk.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i4 += r0;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        } else {
                            zzz3 = zzlk.zzz(i28);
                            zzA = zzlk.zzy((String) object2);
                            r0 = zzz3 + zzA;
                            i4 += r0;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        }
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 60:
                    if (zzM(obj, i8, i3)) {
                        r0 = zznu.zzh(i8, unsafe.getObject(obj, j), zzv(i3));
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 61:
                    if (zzM(obj, i8, i3)) {
                        zzld zzldVar2 = (zzld) unsafe.getObject(obj, j);
                        zzz5 = zzlk.zzz(i8 << 3);
                        zzd = zzldVar2.zzd();
                        zzz6 = zzlk.zzz(zzd);
                        r0 = zzz5 + zzz6 + zzd;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 62:
                    if (zzM(obj, i8, i3)) {
                        int zzo2 = zzo(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzz(zzo2);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 63:
                    if (zzM(obj, i8, i3)) {
                        long zzo3 = zzo(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA(zzo3);
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 64:
                    if (zzM(obj, i8, i3)) {
                        zzz2 = zzlk.zzz(i8 << 3);
                        r0 = zzz2 + 4;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 65:
                    if (zzM(obj, i8, i3)) {
                        zzz = zzlk.zzz(i8 << 3);
                        r0 = zzz + 8;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 66:
                    if (zzM(obj, i8, i3)) {
                        int zzo4 = zzo(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzz((zzo4 >> 31) ^ (zzo4 + zzo4));
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 67:
                    if (zzM(obj, i8, i3)) {
                        long zzt3 = zzt(obj, j);
                        zzz3 = zzlk.zzz(i8 << 3);
                        zzA = zzlk.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        r0 = zzz3 + zzA;
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                case 68:
                    if (zzM(obj, i8, i3)) {
                        r0 = zzlk.zzw(i8, (zznh) unsafe.getObject(obj, j), zzv(i3));
                        i4 += r0;
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    } else {
                        i3 += 3;
                        i5 = i;
                        z3 = z;
                        z2 = false;
                        i2 = 1048575;
                    }
                default:
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzmd) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzma) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzs = zzs(i3);
            int i5 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzol.zza(obj, j));
                    byte[] bArr = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzol.zzb(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr2 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr3 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr4 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzmk.zza(zzol.zzw(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzol.zzf(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzf = zzol.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr5 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzol.zzd(obj, j);
                    byte[] bArr6 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzf2 = zzol.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i4 = i2 + i7;
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
                    i = i4 * 53;
                    floatToIntBits = zzol.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzol.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzmk.zza(zzN(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzol.zzf(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzol.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzol.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzol.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0f53, code lost:
    
        if (r2 == 1048575) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0f55, code lost:
    
        r12.putInt(r44, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0f59, code lost:
    
        r2 = r43.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0f5d, code lost:
    
        if (r2 >= r43.zzk) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0f5f, code lost:
    
        r3 = r43.zzi;
        r6 = r43.zzc;
        r3 = r3[r2];
        r6 = r6[r3];
        r6 = com.google.android.gms.internal.measurement.zzol.zzf(r44, zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0f71, code lost:
    
        if (r6 != null) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0f7c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0f79, code lost:
    
        if (zzu(r3) != null) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0f7e, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.zznb) r6;
        r1 = (com.google.android.gms.internal.measurement.zzna) zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0f86, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0f89, code lost:
    
        if (r8 != 0) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0f8b, code lost:
    
        if (r1 != r14) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f93, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f98, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0f94, code lost:
    
        if (r1 > r14) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0f96, code lost:
    
        if (r4 != r8) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0f9e, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0ba2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0bb5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0ec0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0ed4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0ef0  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzks zzksVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzq;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe2;
        zzks zzksVar2;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe3;
        int zzg;
        int i18;
        int i19;
        zzks zzksVar3;
        int i20;
        Unsafe unsafe4;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Unsafe unsafe5;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Unsafe unsafe6;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int zzf;
        int i42;
        zzmj zzmjVar;
        Object obj2;
        Unsafe unsafe7;
        int i43;
        int i44;
        int i45;
        int zzj;
        int i46;
        int i47;
        int i48;
        boolean z;
        int i49;
        int zzh;
        int i50 = i2;
        int i51 = i3;
        zzks zzksVar4 = zzksVar;
        int i52 = 3;
        zzA(obj);
        Unsafe unsafe8 = zzb;
        int i53 = 0;
        int i54 = -1;
        int i55 = i;
        int i56 = -1;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 1048575;
        while (true) {
            if (i55 < i50) {
                int i61 = i55 + 1;
                int i62 = bArr[i55];
                if (i62 < 0) {
                    i61 = zzkt.zzi(i62, bArr, i61, zzksVar4);
                    i62 = zzksVar4.zza;
                }
                int i63 = i62 >>> 3;
                if (i63 > i56) {
                    zzq = (i63 < this.zze || i63 > this.zzf) ? i54 : zzq(i63, i57 / i52);
                } else if (i63 < this.zze || i63 > this.zzf) {
                    i10 = i54;
                    if (i10 == i54) {
                        int i64 = i62 & 7;
                        int[] iArr = this.zzc;
                        int i65 = iArr[i10 + 1];
                        int zzr = zzr(i65);
                        long j = i65 & 1048575;
                        int i66 = i62;
                        String str = "Protocol message had invalid UTF-8.";
                        if (zzr > 17) {
                            int i67 = i61;
                            int i68 = i63;
                            Unsafe unsafe9 = unsafe8;
                            int i69 = i60;
                            int i70 = i58;
                            i14 = 0;
                            i13 = -1;
                            int i71 = i10;
                            zzks zzksVar5 = zzksVar4;
                            if (zzr != 27) {
                                i25 = i69;
                                if (zzr > 49) {
                                    i26 = i67;
                                    i27 = i68;
                                    i53 = i71;
                                    i28 = i66;
                                    zzksVar2 = zzksVar5;
                                    if (zzr != 50) {
                                        long j2 = iArr[i53 + 2] & 1048575;
                                        switch (zzr) {
                                            case 51:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                if (i64 == 1) {
                                                    i31 = i30 + 8;
                                                    unsafe2.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzkt.zzn(bArr, i30))));
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                        i15 = i55;
                                                        i53 = i29;
                                                        i6 = i3;
                                                        int i72 = i25;
                                                        i58 = i70;
                                                        i60 = i72;
                                                        break;
                                                    } else {
                                                        i51 = i3;
                                                        unsafe8 = unsafe2;
                                                        i56 = i12;
                                                        zzksVar4 = zzksVar2;
                                                        i57 = i29;
                                                        i53 = 0;
                                                        i54 = -1;
                                                        i50 = i2;
                                                        i59 = i9;
                                                        i52 = i11;
                                                        int i73 = i25;
                                                        i58 = i70;
                                                        i60 = i73;
                                                    }
                                                }
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                            case 52:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                if (i64 == 5) {
                                                    i31 = i30 + 4;
                                                    unsafe2.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzkt.zzb(bArr, i30))));
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                if (i64 == 0) {
                                                    i31 = zzkt.zzk(bArr, i30, zzksVar2);
                                                    unsafe2.putObject(obj, j, Long.valueOf(zzksVar2.zzb));
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                if (i64 == 0) {
                                                    i31 = zzkt.zzh(bArr, i30, zzksVar2);
                                                    unsafe2.putObject(obj, j, Integer.valueOf(zzksVar2.zza));
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                if (i64 == 1) {
                                                    i31 = i30 + 8;
                                                    unsafe2.putObject(obj, j, Long.valueOf(zzkt.zzn(bArr, i30)));
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                if (i64 == 5) {
                                                    i31 = i30 + 4;
                                                    unsafe2.putObject(obj, j, Integer.valueOf(zzkt.zzb(bArr, i30)));
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 58:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                if (i64 == 0) {
                                                    i31 = zzkt.zzk(bArr, i30, zzksVar2);
                                                    unsafe2.putObject(obj, j, Boolean.valueOf(zzksVar2.zzb != 0));
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 59:
                                                i9 = i28;
                                                i11 = 3;
                                                unsafe2 = unsafe9;
                                                i12 = i27;
                                                i30 = i26;
                                                if (i64 == 2) {
                                                    int zzh2 = zzkt.zzh(bArr, i30, zzksVar2);
                                                    int i74 = zzksVar2.zza;
                                                    if (i74 == 0) {
                                                        unsafe2.putObject(obj, j, "");
                                                        i29 = i53;
                                                    } else {
                                                        i29 = i53;
                                                        int i75 = zzh2 + i74;
                                                        if ((i65 & 536870912) != 0 && !zzoo.zzd(bArr, zzh2, i75)) {
                                                            throw new zzmm(str);
                                                        }
                                                        unsafe2.putObject(obj, j, new String(bArr, zzh2, i74, zzmk.zza));
                                                        zzh2 = i75;
                                                    }
                                                    unsafe2.putInt(obj, j2, i12);
                                                    i55 = zzh2;
                                                    if (i55 == i30) {
                                                    }
                                                } else {
                                                    i29 = i53;
                                                    i55 = i30;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                break;
                                            case 60:
                                                unsafe2 = unsafe9;
                                                if (i64 == 2) {
                                                    Object zzy = zzy(obj, i27, i53);
                                                    i11 = 3;
                                                    i32 = i28;
                                                    i12 = i27;
                                                    int zzm = zzkt.zzm(zzy, zzv(i53), bArr, i26, i2, zzksVar);
                                                    zzG(obj, i12, i53, zzy);
                                                    i55 = zzm;
                                                    unsafe2 = unsafe2;
                                                    i29 = i53;
                                                    i30 = i26;
                                                    i9 = i32;
                                                    if (i55 == i30) {
                                                    }
                                                } else {
                                                    i11 = 3;
                                                    i12 = i27;
                                                    i30 = i26;
                                                    i29 = i53;
                                                    i9 = i28;
                                                    i55 = i30;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                unsafe2 = unsafe9;
                                                if (i64 == 2) {
                                                    i31 = zzkt.zza(bArr, i26, zzksVar2);
                                                    unsafe2.putObject(obj, j, zzksVar2.zzc);
                                                    unsafe2.putInt(obj, j2, i27);
                                                    i9 = i28;
                                                    i29 = i53;
                                                    i11 = 3;
                                                    i12 = i27;
                                                    i30 = i26;
                                                    i55 = i31;
                                                    if (i55 == i30) {
                                                    }
                                                } else {
                                                    i9 = i28;
                                                    i29 = i53;
                                                    i11 = 3;
                                                    i12 = i27;
                                                    i30 = i26;
                                                    i55 = i30;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                break;
                                            case 63:
                                                i32 = i28;
                                                i33 = i26;
                                                i34 = i53;
                                                unsafe2 = unsafe9;
                                                if (i64 == 0) {
                                                    int zzh3 = zzkt.zzh(bArr, i33, zzksVar2);
                                                    int i76 = zzksVar2.zza;
                                                    zzmg zzu = zzu(i34);
                                                    if (zzu == null || zzu.zza(i76)) {
                                                        i35 = i32;
                                                        unsafe2.putObject(obj, j, Integer.valueOf(i76));
                                                        unsafe2.putInt(obj, j2, i27);
                                                    } else {
                                                        i35 = i32;
                                                        zzd(obj).zzj(i35, Long.valueOf(i76));
                                                    }
                                                    i29 = i34;
                                                    i11 = 3;
                                                    int i77 = i35;
                                                    i12 = i27;
                                                    i30 = i33;
                                                    i55 = zzh3;
                                                    i9 = i77;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i12 = i27;
                                                i30 = i33;
                                                i29 = i34;
                                                i9 = i32;
                                                i11 = 3;
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 66:
                                                i32 = i28;
                                                i33 = i26;
                                                i34 = i53;
                                                unsafe2 = unsafe9;
                                                if (i64 == 0) {
                                                    int zzh4 = zzkt.zzh(bArr, i33, zzksVar2);
                                                    unsafe2.putObject(obj, j, Integer.valueOf(zzlg.zzb(zzksVar2.zza)));
                                                    unsafe2.putInt(obj, j2, i27);
                                                    i12 = i27;
                                                    i30 = i33;
                                                    i29 = i34;
                                                    i11 = 3;
                                                    i55 = zzh4;
                                                    i9 = i32;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                i12 = i27;
                                                i30 = i33;
                                                i29 = i34;
                                                i9 = i32;
                                                i11 = 3;
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                            case 67:
                                                if (i64 == 0) {
                                                    int zzk = zzkt.zzk(bArr, i26, zzksVar2);
                                                    unsafe2 = unsafe9;
                                                    unsafe2.putObject(obj, j, Long.valueOf(zzlg.zzc(zzksVar2.zzb)));
                                                    unsafe2.putInt(obj, j2, i27);
                                                    i12 = i27;
                                                    i30 = i26;
                                                    i55 = zzk;
                                                    i29 = i53;
                                                    i9 = i28;
                                                    i11 = 3;
                                                    if (i55 == i30) {
                                                    }
                                                } else {
                                                    i12 = i27;
                                                    i11 = 3;
                                                    i9 = i28;
                                                    i29 = i53;
                                                    i30 = i26;
                                                    unsafe2 = unsafe9;
                                                    i55 = i30;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i64 == 3) {
                                                    Object zzy2 = zzy(obj, i27, i53);
                                                    i55 = zzkt.zzl(zzy2, zzv(i53), bArr, i26, i2, (i28 & (-8)) | 4, zzksVar);
                                                    zzG(obj, i27, i53, zzy2);
                                                    i12 = i27;
                                                    i11 = 3;
                                                    zzksVar2 = zzksVar2;
                                                    i29 = i53;
                                                    i30 = i26;
                                                    unsafe2 = unsafe9;
                                                    i9 = i28;
                                                    if (i55 == i30) {
                                                    }
                                                } else {
                                                    i12 = i27;
                                                    i11 = 3;
                                                    i29 = i53;
                                                    i9 = i28;
                                                    i30 = i26;
                                                    unsafe2 = unsafe9;
                                                    i55 = i30;
                                                    if (i55 == i30) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i12 = i27;
                                                i29 = i53;
                                                i9 = i28;
                                                i30 = i26;
                                                unsafe2 = unsafe9;
                                                i11 = 3;
                                                i55 = i30;
                                                if (i55 == i30) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i64 == 2) {
                                            Object zzw = zzw(i53);
                                            Object object = unsafe9.getObject(obj, j);
                                            if (!((zznb) object).zze()) {
                                                zznb zzb2 = zznb.zza().zzb();
                                                zznc.zza(zzb2, object);
                                                unsafe9.putObject(obj, j, zzb2);
                                            }
                                            throw null;
                                        }
                                        unsafe5 = unsafe9;
                                        i6 = i3;
                                        i12 = i27;
                                        unsafe2 = unsafe5;
                                        i9 = i28;
                                        i11 = 3;
                                        i15 = i26;
                                        int i722 = i25;
                                        i58 = i70;
                                        i60 = i722;
                                    }
                                } else {
                                    long j3 = i65;
                                    zzmj zzmjVar2 = (zzmj) unsafe9.getObject(obj, j);
                                    if (!zzmjVar2.zzc()) {
                                        int size = zzmjVar2.size();
                                        zzmjVar2 = zzmjVar2.zzd(size + size);
                                        unsafe9.putObject(obj, j, zzmjVar2);
                                    }
                                    zzmj zzmjVar3 = zzmjVar2;
                                    switch (zzr) {
                                        case 18:
                                        case 35:
                                            i36 = i2;
                                            unsafe6 = unsafe9;
                                            i37 = i67;
                                            i53 = i71;
                                            int i78 = i68;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i64 == 2) {
                                                int i79 = zzkt.zza;
                                                zzlm zzlmVar = (zzlm) zzmjVar3;
                                                int zzh5 = zzkt.zzh(bArr, i37, zzksVar2);
                                                int i80 = zzksVar2.zza;
                                                int i81 = zzh5 + i80;
                                                if (i81 > bArr.length) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlmVar.zzg(zzlmVar.size() + (i80 / 8));
                                                while (zzh5 < i81) {
                                                    zzlmVar.zzf(Double.longBitsToDouble(zzkt.zzn(bArr, zzh5)));
                                                    zzh5 += 8;
                                                    i78 = i78;
                                                }
                                                i68 = i78;
                                                if (zzh5 != i81) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i15 = zzh5;
                                                if (i15 != i37) {
                                                    i6 = i3;
                                                    i9 = i38;
                                                    i12 = i68;
                                                    unsafe2 = unsafe6;
                                                    i11 = 3;
                                                    int i7222 = i25;
                                                    i58 = i70;
                                                    i60 = i7222;
                                                    break;
                                                } else {
                                                    i51 = i3;
                                                    i50 = i36;
                                                    i57 = i53;
                                                    i59 = i38;
                                                    i53 = 0;
                                                    i54 = -1;
                                                    i56 = i68;
                                                    unsafe8 = unsafe6;
                                                    i52 = 3;
                                                    i55 = i15;
                                                    zzksVar4 = zzksVar2;
                                                    int i732 = i25;
                                                    i58 = i70;
                                                    i60 = i732;
                                                }
                                            } else {
                                                i68 = i78;
                                                if (i64 == 1) {
                                                    i15 = i37 + 8;
                                                    int i82 = zzkt.zza;
                                                    zzlm zzlmVar2 = (zzlm) zzmjVar3;
                                                    zzlmVar2.zzf(Double.longBitsToDouble(zzkt.zzn(bArr, i37)));
                                                    while (i15 < i36) {
                                                        int zzh6 = zzkt.zzh(bArr, i15, zzksVar2);
                                                        if (i38 == zzksVar2.zza) {
                                                            zzlmVar2.zzf(Double.longBitsToDouble(zzkt.zzn(bArr, zzh6)));
                                                            i15 = zzh6 + 8;
                                                        } else if (i15 != i37) {
                                                        }
                                                    }
                                                    if (i15 != i37) {
                                                    }
                                                }
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                        case 19:
                                        case 36:
                                            i36 = i2;
                                            unsafe6 = unsafe9;
                                            i37 = i67;
                                            i53 = i71;
                                            i39 = i68;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i64 == 2) {
                                                int i83 = zzkt.zza;
                                                zzlw zzlwVar = (zzlw) zzmjVar3;
                                                i40 = zzkt.zzh(bArr, i37, zzksVar2);
                                                int i84 = zzksVar2.zza;
                                                int i85 = i40 + i84;
                                                if (i85 > bArr.length) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlwVar.zzg(zzlwVar.size() + (i84 / 4));
                                                while (i40 < i85) {
                                                    zzlwVar.zzf(Float.intBitsToFloat(zzkt.zzb(bArr, i40)));
                                                    i40 += 4;
                                                }
                                                if (i40 != i85) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i64 == 5) {
                                                    i40 = i37 + 4;
                                                    int i86 = zzkt.zza;
                                                    zzlw zzlwVar2 = (zzlw) zzmjVar3;
                                                    zzlwVar2.zzf(Float.intBitsToFloat(zzkt.zzb(bArr, i37)));
                                                    while (i40 < i36) {
                                                        int zzh7 = zzkt.zzh(bArr, i40, zzksVar2);
                                                        if (i38 == zzksVar2.zza) {
                                                            zzlwVar2.zzf(Float.intBitsToFloat(zzkt.zzb(bArr, zzh7)));
                                                            i40 = zzh7 + 4;
                                                        }
                                                    }
                                                }
                                                i68 = i39;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            i15 = i40;
                                            i68 = i39;
                                            if (i15 != i37) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i36 = i2;
                                            unsafe6 = unsafe9;
                                            int i87 = i67;
                                            i53 = i71;
                                            i39 = i68;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i64 == 2) {
                                                int i88 = zzkt.zza;
                                                zzmw zzmwVar = (zzmw) zzmjVar3;
                                                i15 = zzkt.zzh(bArr, i87, zzksVar2);
                                                int i89 = zzksVar2.zza + i15;
                                                while (i15 < i89) {
                                                    i15 = zzkt.zzk(bArr, i15, zzksVar2);
                                                    zzmwVar.zzg(zzksVar2.zzb);
                                                    i87 = i87;
                                                }
                                                int i90 = i87;
                                                if (i15 != i89) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i68 = i39;
                                                i37 = i90;
                                                if (i15 != i37) {
                                                }
                                            } else if (i64 == 0) {
                                                int i91 = zzkt.zza;
                                                zzmw zzmwVar2 = (zzmw) zzmjVar3;
                                                i37 = i87;
                                                i40 = zzkt.zzk(bArr, i37, zzksVar2);
                                                zzmwVar2.zzg(zzksVar2.zzb);
                                                while (i40 < i36) {
                                                    int zzh8 = zzkt.zzh(bArr, i40, zzksVar2);
                                                    if (i38 == zzksVar2.zza) {
                                                        i40 = zzkt.zzk(bArr, zzh8, zzksVar2);
                                                        zzmwVar2.zzg(zzksVar2.zzb);
                                                    } else {
                                                        i15 = i40;
                                                        i68 = i39;
                                                        if (i15 != i37) {
                                                        }
                                                    }
                                                }
                                                i15 = i40;
                                                i68 = i39;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                i37 = i87;
                                                i68 = i39;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i36 = i2;
                                            unsafe6 = unsafe9;
                                            i41 = i67;
                                            i53 = i71;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i64 == 2) {
                                                zzf = zzkt.zzf(bArr, i41, zzmjVar3, zzksVar2);
                                                i15 = zzf;
                                                i37 = i41;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    i15 = zzkt.zzj(i38, bArr, i41, i2, zzmjVar3, zzksVar);
                                                    i37 = i41;
                                                    if (i15 != i37) {
                                                    }
                                                }
                                                i37 = i41;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i36 = i2;
                                            unsafe6 = unsafe9;
                                            i41 = i67;
                                            i53 = i71;
                                            i38 = i66;
                                            if (i64 == 2) {
                                                int i92 = zzkt.zza;
                                                zzmw zzmwVar3 = (zzmw) zzmjVar3;
                                                zzf = zzkt.zzh(bArr, i41, zzksVar5);
                                                int i93 = zzksVar5.zza;
                                                int i94 = zzf + i93;
                                                if (i94 > bArr.length) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmwVar3.zzh(zzmwVar3.size() + (i93 / 8));
                                                while (zzf < i94) {
                                                    zzmwVar3.zzg(zzkt.zzn(bArr, zzf));
                                                    zzf += 8;
                                                }
                                                if (zzf != i94) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzksVar2 = zzksVar;
                                                i15 = zzf;
                                                i37 = i41;
                                                if (i15 != i37) {
                                                }
                                            } else if (i64 == 1) {
                                                i42 = i41 + 8;
                                                int i95 = zzkt.zza;
                                                zzmw zzmwVar4 = (zzmw) zzmjVar3;
                                                zzmwVar4.zzg(zzkt.zzn(bArr, i41));
                                                while (true) {
                                                    zzksVar2 = zzksVar;
                                                    if (i42 < i36) {
                                                        int zzh9 = zzkt.zzh(bArr, i42, zzksVar2);
                                                        if (i38 == zzksVar2.zza) {
                                                            zzmwVar4.zzg(zzkt.zzn(bArr, zzh9));
                                                            i42 = zzh9 + 8;
                                                        }
                                                    }
                                                }
                                                i15 = i42;
                                                i37 = i41;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                zzksVar2 = zzksVar;
                                                i37 = i41;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i36 = i2;
                                            unsafe6 = unsafe9;
                                            i41 = i67;
                                            i53 = i71;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i64 == 2) {
                                                int i96 = zzkt.zza;
                                                zzme zzmeVar = (zzme) zzmjVar3;
                                                zzf = zzkt.zzh(bArr, i41, zzksVar2);
                                                int i97 = zzksVar2.zza;
                                                int i98 = zzf + i97;
                                                if (i98 > bArr.length) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmeVar.zzi(zzmeVar.size() + (i97 / 4));
                                                while (zzf < i98) {
                                                    zzmeVar.zzh(zzkt.zzb(bArr, zzf));
                                                    zzf += 4;
                                                }
                                                if (zzf != i98) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i15 = zzf;
                                                i37 = i41;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                if (i64 == 5) {
                                                    i42 = i41 + 4;
                                                    int i99 = zzkt.zza;
                                                    zzme zzmeVar2 = (zzme) zzmjVar3;
                                                    zzmeVar2.zzh(zzkt.zzb(bArr, i41));
                                                    while (i42 < i36) {
                                                        int zzh10 = zzkt.zzh(bArr, i42, zzksVar2);
                                                        if (i38 == zzksVar2.zza) {
                                                            zzmeVar2.zzh(zzkt.zzb(bArr, zzh10));
                                                            i42 = zzh10 + 4;
                                                        } else {
                                                            i15 = i42;
                                                            i37 = i41;
                                                            if (i15 != i37) {
                                                            }
                                                        }
                                                    }
                                                    i15 = i42;
                                                    i37 = i41;
                                                    if (i15 != i37) {
                                                    }
                                                }
                                                i37 = i41;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i36 = i2;
                                            unsafe6 = unsafe9;
                                            i41 = i67;
                                            i53 = i71;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i64 == 2) {
                                                int i100 = zzkt.zza;
                                                zzku zzkuVar = (zzku) zzmjVar3;
                                                zzf = zzkt.zzh(bArr, i41, zzksVar2);
                                                int i101 = zzksVar2.zza + zzf;
                                                while (zzf < i101) {
                                                    zzf = zzkt.zzk(bArr, zzf, zzksVar2);
                                                    zzkuVar.zze(zzksVar2.zzb != 0);
                                                }
                                                if (zzf != i101) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    int i102 = zzkt.zza;
                                                    zzku zzkuVar2 = (zzku) zzmjVar3;
                                                    zzf = zzkt.zzk(bArr, i41, zzksVar2);
                                                    zzkuVar2.zze(zzksVar2.zzb != 0);
                                                    while (zzf < i36) {
                                                        int zzh11 = zzkt.zzh(bArr, zzf, zzksVar2);
                                                        if (i38 == zzksVar2.zza) {
                                                            zzf = zzkt.zzk(bArr, zzh11, zzksVar2);
                                                            zzkuVar2.zze(zzksVar2.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i37 = i41;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            i15 = zzf;
                                            i37 = i41;
                                            if (i15 != i37) {
                                            }
                                            break;
                                        case 26:
                                            i38 = i66;
                                            unsafe6 = unsafe9;
                                            i41 = i67;
                                            i53 = i71;
                                            if (i64 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    zzksVar2 = zzksVar;
                                                    i15 = zzkt.zzh(bArr, i41, zzksVar2);
                                                    int i103 = zzksVar2.zza;
                                                    if (i103 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i103 == 0) {
                                                        zzmjVar = zzmjVar3;
                                                        obj2 = "";
                                                        zzmjVar.add(obj2);
                                                    } else {
                                                        zzmjVar = zzmjVar3;
                                                        obj2 = "";
                                                        zzmjVar.add(new String(bArr, i15, i103, zzmk.zza));
                                                        i15 += i103;
                                                    }
                                                    i36 = i2;
                                                    while (i15 < i36) {
                                                        int zzh12 = zzkt.zzh(bArr, i15, zzksVar2);
                                                        if (i38 == zzksVar2.zza) {
                                                            i15 = zzkt.zzh(bArr, zzh12, zzksVar2);
                                                            int i104 = zzksVar2.zza;
                                                            if (i104 < 0) {
                                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i104 == 0) {
                                                                zzmjVar.add(obj2);
                                                            } else {
                                                                zzmjVar.add(new String(bArr, i15, i104, zzmk.zza));
                                                                i15 += i104;
                                                            }
                                                        } else {
                                                            i68 = i68;
                                                        }
                                                    }
                                                    i68 = i68;
                                                } else {
                                                    i36 = i2;
                                                    zzksVar2 = zzksVar;
                                                    int zzh13 = zzkt.zzh(bArr, i41, zzksVar2);
                                                    int i105 = zzksVar2.zza;
                                                    if (i105 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i105 == 0) {
                                                        zzmjVar3.add("");
                                                        i68 = i68;
                                                    } else {
                                                        int i106 = zzh13 + i105;
                                                        if (!zzoo.zzd(bArr, zzh13, i106)) {
                                                            throw new zzmm(str);
                                                        }
                                                        i68 = i68;
                                                        zzmjVar3.add(new String(bArr, zzh13, i105, zzmk.zza));
                                                        zzh13 = i106;
                                                    }
                                                    while (zzh13 < i36) {
                                                        int zzh14 = zzkt.zzh(bArr, zzh13, zzksVar2);
                                                        if (i38 == zzksVar2.zza) {
                                                            zzh13 = zzkt.zzh(bArr, zzh14, zzksVar2);
                                                            int i107 = zzksVar2.zza;
                                                            if (i107 < 0) {
                                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i107 == 0) {
                                                                zzmjVar3.add("");
                                                            } else {
                                                                int i108 = zzh13 + i107;
                                                                if (!zzoo.zzd(bArr, zzh13, i108)) {
                                                                    throw new zzmm(str);
                                                                }
                                                                zzmjVar3.add(new String(bArr, zzh13, i107, zzmk.zza));
                                                                zzh13 = i108;
                                                            }
                                                        } else {
                                                            i15 = zzh13;
                                                        }
                                                    }
                                                    i15 = zzh13;
                                                }
                                                i37 = i41;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                i36 = i2;
                                                zzksVar2 = zzksVar;
                                                i68 = i68;
                                                i37 = i41;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            if (i64 == 2) {
                                                unsafe6 = unsafe9;
                                                int zze = zzkt.zze(zzv(i71), i66, bArr, i67, i2, zzmjVar3, zzksVar);
                                                zzksVar2 = zzksVar;
                                                i68 = i68;
                                                i53 = i71;
                                                i38 = i66;
                                                i37 = i67;
                                                i15 = zze;
                                                i36 = i2;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                unsafe6 = unsafe9;
                                                i36 = i2;
                                                i68 = i68;
                                                i37 = i67;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            unsafe7 = unsafe9;
                                            if (i64 == 2) {
                                                int zzh15 = zzkt.zzh(bArr, i67, zzksVar5);
                                                int i109 = zzksVar5.zza;
                                                if (i109 < 0) {
                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i109 > bArr.length - zzh15) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i109 == 0) {
                                                    zzmjVar3.add(zzld.zzb);
                                                } else {
                                                    zzmjVar3.add(zzld.zzj(bArr, zzh15, i109));
                                                    zzh15 += i109;
                                                }
                                                while (zzh15 < i2) {
                                                    int zzh16 = zzkt.zzh(bArr, zzh15, zzksVar5);
                                                    if (i66 == zzksVar5.zza) {
                                                        zzh15 = zzkt.zzh(bArr, zzh16, zzksVar5);
                                                        int i110 = zzksVar5.zza;
                                                        if (i110 < 0) {
                                                            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i110 > bArr.length - zzh15) {
                                                            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i110 == 0) {
                                                            zzmjVar3.add(zzld.zzb);
                                                        } else {
                                                            zzmjVar3.add(zzld.zzj(bArr, zzh15, i110));
                                                            zzh15 += i110;
                                                        }
                                                    } else {
                                                        i68 = i68;
                                                        i15 = zzh15;
                                                        i37 = i67;
                                                        i36 = i2;
                                                        unsafe6 = unsafe7;
                                                        i53 = i71;
                                                        i38 = i66;
                                                        zzksVar2 = zzksVar5;
                                                        if (i15 != i37) {
                                                        }
                                                    }
                                                }
                                                i68 = i68;
                                                i15 = zzh15;
                                                i37 = i67;
                                                i36 = i2;
                                                unsafe6 = unsafe7;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar5;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                i68 = i68;
                                                i37 = i67;
                                                i36 = i2;
                                                unsafe6 = unsafe7;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar5;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            unsafe7 = unsafe9;
                                            i43 = i67;
                                            i44 = i2;
                                            if (i64 == 2) {
                                                zzj = zzkt.zzf(bArr, i43, zzmjVar3, zzksVar5);
                                                i45 = i43;
                                            } else {
                                                if (i64 == 0) {
                                                    i45 = i43;
                                                    zzj = zzkt.zzj(i66, bArr, i43, i2, zzmjVar3, zzksVar);
                                                }
                                                i37 = i43;
                                                i36 = i44;
                                                unsafe6 = unsafe7;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar5;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            zzmg zzu2 = zzu(i71);
                                            zzoe zzoeVar = this.zzl;
                                            int i111 = zznu.zza;
                                            if (zzu2 == null) {
                                                i46 = zzj;
                                                i47 = i45;
                                                i48 = i68;
                                                z = true;
                                            } else if (zzmjVar3 != null) {
                                                int size2 = zzmjVar3.size();
                                                Object obj3 = null;
                                                int i112 = 0;
                                                int i113 = 0;
                                                while (i112 < size2) {
                                                    int i114 = zzj;
                                                    Integer num = (Integer) zzmjVar3.get(i112);
                                                    int i115 = i45;
                                                    int intValue = num.intValue();
                                                    if (zzu2.zza(intValue)) {
                                                        if (i112 != i113) {
                                                            zzmjVar3.set(i113, num);
                                                        }
                                                        i113++;
                                                        i49 = i68;
                                                    } else {
                                                        i49 = i68;
                                                        obj3 = zznu.zzn(obj, i49, intValue, obj3, zzoeVar);
                                                    }
                                                    i112++;
                                                    i68 = i49;
                                                    i45 = i115;
                                                    zzj = i114;
                                                }
                                                i46 = zzj;
                                                i47 = i45;
                                                i48 = i68;
                                                z = true;
                                                if (i113 != size2) {
                                                    zzmjVar3.subList(i113, size2).clear();
                                                }
                                            } else {
                                                i46 = zzj;
                                                i47 = i45;
                                                i48 = i68;
                                                z = true;
                                                Iterator it = zzmjVar3.iterator();
                                                Object obj4 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzu2.zza(intValue2)) {
                                                        obj4 = zznu.zzn(obj, i48, intValue2, obj4, zzoeVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i15 = i46;
                                            i68 = i48;
                                            i36 = i44;
                                            i37 = i47;
                                            unsafe6 = unsafe7;
                                            i53 = i71;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i15 != i37) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            unsafe7 = unsafe9;
                                            i43 = i67;
                                            i44 = i2;
                                            if (i64 == 2) {
                                                int i116 = zzkt.zza;
                                                zzme zzmeVar3 = (zzme) zzmjVar3;
                                                zzh = zzkt.zzh(bArr, i43, zzksVar5);
                                                int i117 = zzksVar5.zza + zzh;
                                                while (zzh < i117) {
                                                    zzh = zzkt.zzh(bArr, zzh, zzksVar5);
                                                    zzmeVar3.zzh(zzlg.zzb(zzksVar5.zza));
                                                }
                                                if (zzh != i117) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    int i118 = zzkt.zza;
                                                    zzme zzmeVar4 = (zzme) zzmjVar3;
                                                    zzh = zzkt.zzh(bArr, i43, zzksVar5);
                                                    zzmeVar4.zzh(zzlg.zzb(zzksVar5.zza));
                                                    while (zzh < i44) {
                                                        int zzh17 = zzkt.zzh(bArr, zzh, zzksVar5);
                                                        if (i66 == zzksVar5.zza) {
                                                            zzh = zzkt.zzh(bArr, zzh17, zzksVar5);
                                                            zzmeVar4.zzh(zzlg.zzb(zzksVar5.zza));
                                                        }
                                                    }
                                                }
                                                i37 = i43;
                                                i36 = i44;
                                                unsafe6 = unsafe7;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar5;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            i15 = zzh;
                                            i37 = i43;
                                            i36 = i44;
                                            unsafe6 = unsafe7;
                                            i53 = i71;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i15 != i37) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            unsafe7 = unsafe9;
                                            i44 = i2;
                                            if (i64 == 2) {
                                                int i119 = zzkt.zza;
                                                zzmw zzmwVar5 = (zzmw) zzmjVar3;
                                                i43 = i67;
                                                zzh = zzkt.zzh(bArr, i43, zzksVar5);
                                                int i120 = zzksVar5.zza + zzh;
                                                while (zzh < i120) {
                                                    zzh = zzkt.zzk(bArr, zzh, zzksVar5);
                                                    zzmwVar5.zzg(zzlg.zzc(zzksVar5.zzb));
                                                }
                                                if (zzh != i120) {
                                                    throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                i43 = i67;
                                                if (i64 == 0) {
                                                    int i121 = zzkt.zza;
                                                    zzmw zzmwVar6 = (zzmw) zzmjVar3;
                                                    zzh = zzkt.zzk(bArr, i43, zzksVar5);
                                                    zzmwVar6.zzg(zzlg.zzc(zzksVar5.zzb));
                                                    while (zzh < i44) {
                                                        int zzh18 = zzkt.zzh(bArr, zzh, zzksVar5);
                                                        if (i66 == zzksVar5.zza) {
                                                            zzh = zzkt.zzk(bArr, zzh18, zzksVar5);
                                                            zzmwVar6.zzg(zzlg.zzc(zzksVar5.zzb));
                                                        }
                                                    }
                                                }
                                                i37 = i43;
                                                i36 = i44;
                                                unsafe6 = unsafe7;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar5;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            i15 = zzh;
                                            i37 = i43;
                                            i36 = i44;
                                            unsafe6 = unsafe7;
                                            i53 = i71;
                                            i38 = i66;
                                            zzksVar2 = zzksVar5;
                                            if (i15 != i37) {
                                            }
                                            break;
                                        default:
                                            if (i64 == 3) {
                                                int i122 = (i66 & (-8)) | 4;
                                                zzns zzv = zzv(i71);
                                                int zzc = zzkt.zzc(zzv, bArr, i67, i2, i122, zzksVar);
                                                zzmjVar3.add(zzksVar5.zzc);
                                                int i123 = i2;
                                                while (zzc < i123) {
                                                    int zzh19 = zzkt.zzh(bArr, zzc, zzksVar5);
                                                    if (i66 == zzksVar5.zza) {
                                                        zzc = zzkt.zzc(zzv, bArr, zzh19, i2, i122, zzksVar);
                                                        zzmjVar3.add(zzksVar5.zzc);
                                                        i123 = i123;
                                                        unsafe9 = unsafe9;
                                                    } else {
                                                        unsafe7 = unsafe9;
                                                        i15 = zzc;
                                                        i36 = i123;
                                                        i37 = i67;
                                                        unsafe6 = unsafe7;
                                                        i53 = i71;
                                                        i38 = i66;
                                                        zzksVar2 = zzksVar5;
                                                        if (i15 != i37) {
                                                        }
                                                    }
                                                }
                                                unsafe7 = unsafe9;
                                                i15 = zzc;
                                                i36 = i123;
                                                i37 = i67;
                                                unsafe6 = unsafe7;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar5;
                                                if (i15 != i37) {
                                                }
                                            } else {
                                                i36 = i2;
                                                unsafe6 = unsafe9;
                                                i37 = i67;
                                                i53 = i71;
                                                i38 = i66;
                                                zzksVar2 = zzksVar5;
                                                i15 = i37;
                                                if (i15 != i37) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else if (i64 == 2) {
                                zzmj zzmjVar4 = (zzmj) unsafe9.getObject(obj, j);
                                if (!zzmjVar4.zzc()) {
                                    int size3 = zzmjVar4.size();
                                    zzmjVar4 = zzmjVar4.zzd(size3 == 0 ? 10 : size3 + size3);
                                    unsafe9.putObject(obj, j, zzmjVar4);
                                }
                                i25 = i69;
                                i55 = zzkt.zze(zzv(i71), i66, bArr, i67, i2, zzmjVar4, zzksVar);
                                i57 = i71;
                                i59 = i66;
                                i52 = 3;
                                unsafe8 = unsafe9;
                                i53 = 0;
                                i54 = -1;
                                i56 = i68;
                                i50 = i2;
                                i51 = i3;
                                zzksVar4 = zzksVar5;
                                int i7322 = i25;
                                i58 = i70;
                                i60 = i7322;
                            } else {
                                i25 = i69;
                                zzksVar2 = zzksVar5;
                                unsafe5 = unsafe9;
                                i53 = i71;
                                i26 = i67;
                                i28 = i66;
                                i27 = i68;
                                i6 = i3;
                                i12 = i27;
                                unsafe2 = unsafe5;
                                i9 = i28;
                                i11 = 3;
                                i15 = i26;
                                int i72222 = i25;
                                i58 = i70;
                                i60 = i72222;
                            }
                        } else {
                            int i124 = iArr[i10 + 2];
                            int i125 = 1 << (i124 >>> 20);
                            int i126 = i124 & 1048575;
                            int i127 = i60;
                            if (i126 != i127) {
                                if (i127 != 1048575) {
                                    unsafe8.putInt(obj, i127, i58);
                                }
                                i60 = i126;
                                i58 = i126 == 1048575 ? 0 : unsafe8.getInt(obj, i126);
                            } else {
                                i60 = i127;
                            }
                            switch (zzr) {
                                case 0:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i20 = 3;
                                    i14 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 1) {
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i55 = i21 + 8;
                                        i58 |= i125;
                                        zzol.zzo(obj, j, Double.longBitsToDouble(zzkt.zzn(bArr, i21)));
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i52 = 3;
                                        i57 = i19;
                                        i54 = -1;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe8 = unsafe4;
                                        i53 = i14;
                                    }
                                case 1:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i20 = 3;
                                    i14 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 5) {
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i55 = i21 + 4;
                                        i58 |= i125;
                                        zzol.zzp(obj, j, Float.intBitsToFloat(zzkt.zzb(bArr, i21)));
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe8 = unsafe4;
                                        i53 = i14;
                                    }
                                case 2:
                                case 3:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i20 = 3;
                                    i14 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 0) {
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        i55 = zzkt.zzk(bArr, i21, zzksVar3);
                                        unsafe4.putLong(obj, j, zzksVar3.zzb);
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe8 = unsafe4;
                                        i53 = i14;
                                    }
                                case 4:
                                case 11:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i20 = 3;
                                    i14 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 0) {
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        i55 = zzkt.zzh(bArr, i21, zzksVar3);
                                        unsafe4.putInt(obj, j, zzksVar3.zza);
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe8 = unsafe4;
                                        i53 = i14;
                                    }
                                case 5:
                                case 14:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i20 = 3;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 1) {
                                        i14 = 0;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i55 = i21 + 8;
                                        i58 |= i125;
                                        i14 = 0;
                                        unsafe4.putLong(obj, j, zzkt.zzn(bArr, i21));
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe8 = unsafe4;
                                        i53 = i14;
                                    }
                                case 6:
                                case 13:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i20 = 3;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    i22 = 0;
                                    if (i64 != 5) {
                                        i14 = i22;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i55 = i21 + 4;
                                        i58 |= i125;
                                        unsafe4.putInt(obj, j, zzkt.zzb(bArr, i21));
                                        i50 = i2;
                                        i51 = i3;
                                        i52 = i20;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        Unsafe unsafe10 = unsafe4;
                                        i53 = i22;
                                        zzksVar4 = zzksVar3;
                                        i57 = i19;
                                        unsafe8 = unsafe10;
                                    }
                                case 7:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i20 = 3;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    i22 = 0;
                                    if (i64 != 0) {
                                        i14 = i22;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        i55 = zzkt.zzk(bArr, i21, zzksVar3);
                                        zzol.zzm(obj, j, zzksVar3.zzb != 0);
                                        i50 = i2;
                                        i51 = i3;
                                        i52 = i20;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        Unsafe unsafe102 = unsafe4;
                                        i53 = i22;
                                        zzksVar4 = zzksVar3;
                                        i57 = i19;
                                        unsafe8 = unsafe102;
                                    }
                                case 8:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    int i128 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 2) {
                                        i66 = i128;
                                        i20 = 3;
                                        i14 = 0;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        if ((i65 & 536870912) != 0) {
                                            int zzh20 = zzkt.zzh(bArr, i21, zzksVar3);
                                            int i129 = zzksVar3.zza;
                                            if (i129 < 0) {
                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i130 = i58 | i125;
                                            if (i129 == 0) {
                                                zzksVar3.zzc = "";
                                                i23 = i130;
                                                i66 = i128;
                                                i22 = 0;
                                                i20 = 3;
                                            } else {
                                                int i131 = zzoo.zza;
                                                int length = bArr.length;
                                                if ((((length - zzh20) - i129) | zzh20 | i129) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh20), Integer.valueOf(i129)));
                                                }
                                                int i132 = zzh20 + i129;
                                                char[] cArr = new char[i129];
                                                int i133 = 0;
                                                while (zzh20 < i132) {
                                                    byte b = bArr[zzh20];
                                                    if (zzom.zzd(b)) {
                                                        zzh20++;
                                                        cArr[i133] = (char) b;
                                                        i133++;
                                                    } else {
                                                        while (zzh20 < i132) {
                                                            int i134 = zzh20 + 1;
                                                            byte b2 = bArr[zzh20];
                                                            if (zzom.zzd(b2)) {
                                                                cArr[i133] = (char) b2;
                                                                i133++;
                                                                zzh20 = i134;
                                                                while (zzh20 < i132) {
                                                                    byte b3 = bArr[zzh20];
                                                                    if (zzom.zzd(b3)) {
                                                                        zzh20++;
                                                                        cArr[i133] = (char) b3;
                                                                        i133++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i135 = i130;
                                                                if (b2 >= -32) {
                                                                    int i136 = i128;
                                                                    String str2 = str;
                                                                    if (b2 < -16) {
                                                                        if (i134 >= i132 - 1) {
                                                                            throw new zzmm(str2);
                                                                        }
                                                                        int i137 = zzh20 + 2;
                                                                        zzh20 += 3;
                                                                        zzom.zzb(b2, bArr[i134], bArr[i137], cArr, i133);
                                                                        str = str2;
                                                                        i133++;
                                                                    } else {
                                                                        if (i134 >= i132 - 2) {
                                                                            throw new zzmm(str2);
                                                                        }
                                                                        byte b4 = bArr[i134];
                                                                        int i138 = zzh20 + 3;
                                                                        byte b5 = bArr[zzh20 + 2];
                                                                        zzh20 += 4;
                                                                        zzom.zza(b2, b4, b5, bArr[i138], cArr, i133);
                                                                        i133 += 2;
                                                                        str = str2;
                                                                    }
                                                                    i128 = i136;
                                                                } else {
                                                                    if (i134 >= i132) {
                                                                        throw new zzmm(str);
                                                                    }
                                                                    zzh20 += 2;
                                                                    zzom.zzc(b2, bArr[i134], cArr, i133);
                                                                    i133++;
                                                                }
                                                                i130 = i135;
                                                            }
                                                        }
                                                        i23 = i130;
                                                        i66 = i128;
                                                        i20 = 3;
                                                        i22 = 0;
                                                        zzksVar3.zzc = new String(cArr, 0, i133);
                                                        zzh20 = i132;
                                                    }
                                                }
                                                while (zzh20 < i132) {
                                                }
                                                i23 = i130;
                                                i66 = i128;
                                                i20 = 3;
                                                i22 = 0;
                                                zzksVar3.zzc = new String(cArr, 0, i133);
                                                zzh20 = i132;
                                            }
                                            i58 = i23;
                                            i55 = zzh20;
                                        } else {
                                            i66 = i128;
                                            i22 = 0;
                                            i20 = 3;
                                            int zzh21 = zzkt.zzh(bArr, i21, zzksVar3);
                                            int i139 = zzksVar3.zza;
                                            if (i139 < 0) {
                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i140 = i58 | i125;
                                            if (i139 == 0) {
                                                zzksVar3.zzc = "";
                                            } else {
                                                zzksVar3.zzc = new String(bArr, zzh21, i139, zzmk.zza);
                                                zzh21 += i139;
                                            }
                                            i55 = zzh21;
                                            i58 = i140;
                                        }
                                        unsafe4.putObject(obj, j, zzksVar3.zzc);
                                        i50 = i2;
                                        i51 = i3;
                                        i52 = i20;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        Unsafe unsafe1022 = unsafe4;
                                        i53 = i22;
                                        zzksVar4 = zzksVar3;
                                        i57 = i19;
                                        unsafe8 = unsafe1022;
                                    }
                                case 9:
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i24 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 2) {
                                        i21 = i61;
                                        i66 = i24;
                                        i20 = 3;
                                        i14 = 0;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        Object zzx = zzx(obj, i19);
                                        i50 = i2;
                                        int zzm2 = zzkt.zzm(zzx, zzv(i19), bArr, i61, i50, zzksVar);
                                        zzF(obj, i19, zzx);
                                        i51 = i3;
                                        i55 = zzm2;
                                        zzksVar4 = zzksVar3;
                                        i59 = i24;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe8 = unsafe4;
                                        i53 = 0;
                                    }
                                case 10:
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i24 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 2) {
                                        i21 = i61;
                                        i66 = i24;
                                        i20 = 3;
                                        i14 = 0;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        i55 = zzkt.zza(bArr, i61, zzksVar3);
                                        unsafe4.putObject(obj, j, zzksVar3.zzc);
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i59 = i24;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe8 = unsafe4;
                                        i53 = 0;
                                    }
                                case 12:
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i24 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 0) {
                                        i21 = i61;
                                        i66 = i24;
                                        i20 = 3;
                                        i14 = 0;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i55 = zzkt.zzh(bArr, i61, zzksVar3);
                                        int i141 = zzksVar3.zza;
                                        zzmg zzu3 = zzu(i19);
                                        if ((i65 & Integer.MIN_VALUE) == 0 || zzu3 == null || zzu3.zza(i141)) {
                                            i58 |= i125;
                                            unsafe4.putInt(obj, j, i141);
                                        } else {
                                            zzd(obj).zzj(i24, Long.valueOf(i141));
                                        }
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i59 = i24;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe8 = unsafe4;
                                        i53 = 0;
                                    }
                                case 15:
                                    i18 = i63;
                                    unsafe4 = unsafe8;
                                    i24 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzksVar3 = zzksVar4;
                                    if (i64 != 0) {
                                        i21 = i61;
                                        i66 = i24;
                                        i20 = 3;
                                        i14 = 0;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        i55 = zzkt.zzh(bArr, i61, zzksVar3);
                                        unsafe4.putInt(obj, j, zzlg.zzb(zzksVar3.zza));
                                        i50 = i2;
                                        i51 = i3;
                                        zzksVar4 = zzksVar3;
                                        i59 = i24;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe8 = unsafe4;
                                        i53 = 0;
                                    }
                                case 16:
                                    i18 = i63;
                                    Unsafe unsafe11 = unsafe8;
                                    i13 = -1;
                                    i19 = i10;
                                    if (i64 != 0) {
                                        unsafe4 = unsafe11;
                                        zzksVar3 = zzksVar4;
                                        i20 = 3;
                                        i66 = i66;
                                        i14 = 0;
                                        i21 = i61;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        i55 = zzkt.zzk(bArr, i61, zzksVar4);
                                        unsafe4 = unsafe11;
                                        unsafe11.putLong(obj, j, zzlg.zzc(zzksVar4.zzb));
                                        i50 = i2;
                                        i51 = i3;
                                        i59 = i66;
                                        zzksVar4 = zzksVar4;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe8 = unsafe4;
                                        i53 = 0;
                                    }
                                default:
                                    i52 = 3;
                                    if (i64 != 3) {
                                        i18 = i63;
                                        Unsafe unsafe12 = unsafe8;
                                        i13 = -1;
                                        i19 = i10;
                                        zzksVar3 = zzksVar4;
                                        i20 = 3;
                                        unsafe4 = unsafe12;
                                        i14 = 0;
                                        i21 = i61;
                                        i6 = i3;
                                        i15 = i21;
                                        i11 = i20;
                                        unsafe2 = unsafe4;
                                        i53 = i19;
                                        i9 = i66;
                                        zzksVar2 = zzksVar3;
                                        i12 = i18;
                                        break;
                                    } else {
                                        i58 |= i125;
                                        Object zzx2 = zzx(obj, i10);
                                        int i142 = i10;
                                        i55 = zzkt.zzl(zzx2, zzv(i10), bArr, i61, i2, (i63 << 3) | 4, zzksVar);
                                        zzF(obj, i142, zzx2);
                                        i57 = i142;
                                        unsafe8 = unsafe8;
                                        i59 = i66;
                                        i54 = -1;
                                        i56 = i63;
                                        i53 = 0;
                                        i50 = i2;
                                        i51 = i3;
                                    }
                            }
                        }
                    } else {
                        i11 = i52;
                        i9 = i62;
                        i12 = i63;
                        i13 = i54;
                        i14 = i53;
                        unsafe2 = unsafe8;
                        zzksVar2 = zzksVar4;
                        i6 = i51;
                        i15 = i61;
                    }
                    if (i9 == i6 || i6 == 0) {
                        if (this.zzh) {
                            zzlp zzlpVar = zzksVar2.zzd;
                            int i143 = zzlp.zzb;
                            int i144 = zznp.zza;
                            if (zzlpVar != zzlp.zza) {
                                zznh zznhVar = this.zzg;
                                int i145 = zzkt.zza;
                                if (zzlpVar.zzb(zznhVar, i12) != null) {
                                    throw null;
                                }
                                i17 = i9;
                                unsafe3 = unsafe2;
                                i16 = i2;
                                zzg = zzkt.zzg(i9, bArr, i15, i2, zzd(obj), zzksVar);
                                i51 = i6;
                                i59 = i17;
                                i56 = i12;
                                zzksVar4 = zzksVar2;
                                i57 = i53;
                                i50 = i16;
                                i52 = i11;
                                i53 = i14;
                                i55 = zzg;
                                unsafe8 = unsafe3;
                                i54 = i13;
                            }
                        }
                        i16 = i2;
                        i17 = i9;
                        unsafe3 = unsafe2;
                        zzg = zzkt.zzg(i17, bArr, i15, i2, zzd(obj), zzksVar);
                        i51 = i6;
                        i59 = i17;
                        i56 = i12;
                        zzksVar4 = zzksVar2;
                        i57 = i53;
                        i50 = i16;
                        i52 = i11;
                        i53 = i14;
                        i55 = zzg;
                        unsafe8 = unsafe3;
                        i54 = i13;
                    } else {
                        i5 = i2;
                        i4 = i15;
                        unsafe = unsafe2;
                        i8 = i60;
                        i7 = i58;
                    }
                } else {
                    zzq = zzq(i63, i53);
                }
                i10 = zzq;
                if (i10 == i54) {
                }
                if (i9 == i6) {
                }
                if (this.zzh) {
                }
                i16 = i2;
                i17 = i9;
                unsafe3 = unsafe2;
                zzg = zzkt.zzg(i17, bArr, i15, i2, zzd(obj), zzksVar);
                i51 = i6;
                i59 = i17;
                i56 = i12;
                zzksVar4 = zzksVar2;
                i57 = i53;
                i50 = i16;
                i52 = i11;
                i53 = i14;
                i55 = zzg;
                unsafe8 = unsafe3;
                i54 = i13;
            } else {
                i4 = i55;
                unsafe = unsafe8;
                i5 = i50;
                i6 = i51;
                i7 = i58;
                i8 = i60;
                i9 = i59;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final Object zze() {
        return ((zzmd) this.zzg).zzcj();
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzmd) {
                zzmd zzmdVar = (zzmd) obj;
                zzmdVar.zzcu(Integer.MAX_VALUE);
                zzmdVar.zza = 0;
                zzmdVar.zzcs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzs = zzs(i);
                int i2 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = i2;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                ((zzmj) zzol.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zznb) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zznu.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznu.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzo(obj, j, zzol.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzp(obj, j, zzol.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzm(obj, j, zzol.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzq(obj, j, zzol.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzol.zzr(obj, j, zzol.zzd(obj2, j));
                        zzD(obj, i);
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
                    zzmj zzmjVar = (zzmj) zzol.zzf(obj, j);
                    zzmj zzmjVar2 = (zzmj) zzol.zzf(obj2, j);
                    int size = zzmjVar.size();
                    int size2 = zzmjVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmjVar.zzc()) {
                            zzmjVar = zzmjVar.zzd(size2 + size);
                        }
                        zzmjVar.addAll(zzmjVar2);
                    }
                    if (size > 0) {
                        zzmjVar2 = zzmjVar;
                    }
                    zzol.zzs(obj, j, zzmjVar2);
                    break;
                case 50:
                    int i4 = zznu.zza;
                    zzol.zzs(obj, j, zznc.zza(zzol.zzf(obj, j), zzol.zzf(obj2, j)));
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
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzE(obj, i3, i);
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
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzol.zzs(obj, j, zzol.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzks zzksVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzksVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.measurement.zzns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzor zzorVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        Map.Entry entry3;
        int[] iArr2;
        ?? r9 = 1;
        if (this.zzh) {
            zzlu zzluVar = ((zzma) obj).zzb;
            if (!zzluVar.zza.isEmpty()) {
                entry = (Map.Entry) zzluVar.zze().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i6 = 1048575;
                int i7 = 1048575;
                int i8 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzs = zzs(i);
                    int zzr = zzr(zzs);
                    int i9 = iArr[i];
                    if (zzr <= 17) {
                        int i10 = iArr[i + 2];
                        int i11 = i10 & i6;
                        if (i11 != i7) {
                            i8 = i11 == i6 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        int i12 = r9 << (i10 >>> 20);
                        i3 = i8;
                        i4 = i12;
                        i2 = i7;
                    } else {
                        i2 = i7;
                        i3 = i8;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzs & i6;
                    switch (zzr) {
                        case 0:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzf(i9, zzol.zza(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 1:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzo(i9, zzol.zzb(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 2:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzt(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 3:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzK(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 4:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzr(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 5:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzm(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 6:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzk(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 7:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzb(i9, zzol.zzw(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 8:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzO(i9, unsafe.getObject(obj, j), zzorVar);
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 9:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzv(i9, unsafe.getObject(obj, j), zzv(i5));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 10:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzd(i9, (zzld) unsafe.getObject(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 11:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzI(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 12:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzi(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 13:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzx(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 14:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzz(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 15:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzB(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 16:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzorVar.zzD(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 17:
                            i5 = i;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzorVar.zzq(i9, unsafe.getObject(obj, j), zzv(i5));
                            }
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 18:
                            zznu.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 19:
                            zznu.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 20:
                            zznu.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 21:
                            zznu.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 22:
                            zznu.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 23:
                            zznu.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 24:
                            zznu.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 25:
                            zznu.zzq(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 26:
                            int i13 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i14 = zznu.zza;
                            if (list != null && !list.isEmpty()) {
                                zzorVar.zzH(i13, list);
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 27:
                            int i15 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzns zzv = zzv(i);
                            int i16 = zznu.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i17 = 0; i17 < list2.size(); i17 += r9) {
                                    ((zzll) zzorVar).zzv(i15, list2.get(i17), zzv);
                                }
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 28:
                            int i18 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i19 = zznu.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzorVar.zze(i18, list3);
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 29:
                            zznu.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 30:
                            zznu.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 31:
                            zznu.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 32:
                            zznu.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 33:
                            zznu.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 34:
                            zznu.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, false);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 35:
                            zznu.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 36:
                            zznu.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 37:
                            zznu.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 38:
                            zznu.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 39:
                            zznu.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 40:
                            zznu.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 41:
                            zznu.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 42:
                            zznu.zzq(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 43:
                            zznu.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 44:
                            zznu.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 45:
                            zznu.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 46:
                            zznu.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 47:
                            zznu.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 48:
                            zznu.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzorVar, r9);
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 49:
                            int i20 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzns zzv2 = zzv(i);
                            int i21 = zznu.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i22 = 0; i22 < list4.size(); i22 += r9) {
                                    ((zzll) zzorVar).zzq(i20, list4.get(i22), zzv2);
                                }
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 51:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzf(i9, zzm(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 52:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzo(i9, zzn(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 53:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzt(i9, zzt(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 54:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzK(i9, zzt(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 55:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzr(i9, zzo(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 56:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzm(i9, zzt(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 57:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzk(i9, zzo(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 58:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzb(i9, zzN(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 59:
                            if (zzM(obj, i9, i)) {
                                zzO(i9, unsafe.getObject(obj, j), zzorVar);
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 60:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzv(i9, unsafe.getObject(obj, j), zzv(i));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 61:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzd(i9, (zzld) unsafe.getObject(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 62:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzI(i9, zzo(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 63:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzi(i9, zzo(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 64:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzx(i9, zzo(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 65:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzz(i9, zzt(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 66:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzB(i9, zzo(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 67:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzD(i9, zzt(obj, j));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 68:
                            if (zzM(obj, i9, i)) {
                                zzorVar.zzq(i9, unsafe.getObject(obj, j), zzv(i));
                            }
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        default:
                            i5 = i;
                            entry3 = entry;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            entry = entry3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                    }
                }
                entry2 = entry;
                if (entry2 != null) {
                    ((zzmd) obj).zzc.zzl(zzorVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i62 = 1048575;
        int i72 = 1048575;
        int i82 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        entry2 = entry;
        if (entry2 != null) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzol.zza(obj, j)) == Double.doubleToLongBits(zzol.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzol.zzb(obj, j)) == Float.floatToIntBits(zzol.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzol.zzd(obj, j) == zzol.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzol.zzd(obj, j) == zzol.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzol.zzc(obj, j) == zzol.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzol.zzd(obj, j) == zzol.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzol.zzc(obj, j) == zzol.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzol.zzw(obj, j) == zzol.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzol.zzc(obj, j) == zzol.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzol.zzc(obj, j) == zzol.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzol.zzc(obj, j) == zzol.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzol.zzd(obj, j) == zzol.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzol.zzc(obj, j) == zzol.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzol.zzd(obj, j) == zzol.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
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
                    zzE = zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j));
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
                    long zzp = zzp(i) & 1048575;
                    if (zzol.zzc(obj, zzp) == zzol.zzc(obj2, zzp) && zznu.zzE(zzol.zzf(obj, j), zzol.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzmd) obj).zzc.equals(((zzmd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzma) obj).zzb.equals(((zzma) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i7, i6) && !zzK(obj, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zznb) zzol.zzf(obj, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzol.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzns zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, zzs, zzv(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((zzma) obj).zzb.zzh();
    }
}
