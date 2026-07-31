package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes5.dex */
final class zzip<T> implements zzix<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i, int i2, zzim zzimVar, boolean z, int[] iArr2, int i3, int i4, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzgxVar != null && (zzimVar instanceof zzhh)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
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
            zzix zzv = zzv(i);
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
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i);
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
        zzjq.zzq(obj, j, (1 << (zzp >>> 20)) | zzjq.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzjq.zzq(obj, zzp(i2) & 1048575, i);
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
            return (zzjq.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzjq.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjq.zzb(obj, j2)) != 0;
            case 2:
                return zzjq.zzd(obj, j2) != 0;
            case 3:
                return zzjq.zzd(obj, j2) != 0;
            case 4:
                return zzjq.zzc(obj, j2) != 0;
            case 5:
                return zzjq.zzd(obj, j2) != 0;
            case 6:
                return zzjq.zzc(obj, j2) != 0;
            case 7:
                return zzjq.zzw(obj, j2);
            case 8:
                Object zzf = zzjq.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzgk) {
                    return !zzgk.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjq.zzf(obj, j2) != null;
            case 10:
                return !zzgk.zzb.equals(zzjq.zzf(obj, j2));
            case 11:
                return zzjq.zzc(obj, j2) != 0;
            case 12:
                return zzjq.zzc(obj, j2) != 0;
            case 13:
                return zzjq.zzc(obj, j2) != 0;
            case 14:
                return zzjq.zzd(obj, j2) != 0;
            case 15:
                return zzjq.zzc(obj, j2) != 0;
            case 16:
                return zzjq.zzd(obj, j2) != 0;
            case 17:
                return zzjq.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzjq.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzjq.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzjw zzjwVar) throws IOException {
        if (obj instanceof String) {
            zzjwVar.zzG(i, (String) obj);
        } else {
            zzjwVar.zzd(i, (zzgk) obj);
        }
    }

    static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzf = zzjk.zzf();
        zzhkVar.zzc = zzf;
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
    static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
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
        zziw zziwVar;
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
        if (!(zzijVar instanceof zziw)) {
            throw null;
        }
        zziw zziwVar2 = (zziw) zzijVar;
        String zzd = zziwVar2.zzd();
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
        Object[] zze = zziwVar2.zze();
        Class<?> cls2 = zziwVar2.zza().getClass();
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
                        if (zziwVar2.zzc() == 1 || i79 != 0) {
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
                    zziwVar = zziwVar2;
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
                zziwVar = zziwVar2;
                objectFieldOffset = objectFieldOffset22;
                i24 = i912;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i4]);
                i19 = charAt23;
                if (i77 == 9 || i77 == 17) {
                    zziwVar = zziwVar2;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = zzz4.getType();
                } else {
                    if (i77 == 27) {
                        zziwVar = zziwVar2;
                        i26 = 1;
                        i27 = i4 + 2;
                    } else if (i77 == 49) {
                        i27 = i4 + 2;
                        zziwVar = zziwVar2;
                        i26 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            zziwVar = zziwVar2;
                            if (zziwVar2.zzc() == 1 || i79 != 0) {
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
                                zziwVar = zziwVar2;
                            } else {
                                i18 = i94;
                                i65 = i95;
                                i79 = 0;
                                zziwVar = zziwVar2;
                            }
                        } else {
                            zziwVar = zziwVar2;
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
            zziwVar2 = zziwVar;
            i35 = i22;
            i2 = i17;
            c = 55296;
        }
        return new zzip(iArr3, objArr, i2, i5, zziwVar2.zza(), false, iArr, i3, i63, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzjq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzjq.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzjq.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzjq.zzf(obj, j)).longValue();
    }

    private final zzhm zzu(int i) {
        int i2 = i / 3;
        return (zzhm) this.zzd[i2 + i2 + 1];
    }

    private final zzix zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzix zzixVar = (zzix) objArr[i3];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzb2 = zziu.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzix zzv = zzv(i);
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
        zzix zzv = zzv(i2);
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
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [int] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzix
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
        while (i3 < this.zzc.length) {
            int zzs = zzs(i3);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr[i3 + 2];
            int i8 = i7 & i2;
            if (zzr <= 17) {
                if (i8 != i5) {
                    z3 = i8 == i2 ? z2 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = i5;
                z = z3;
                r5 = 1 << (i7 >>> 20);
            } else {
                i = i5;
                z = z3;
                r5 = z2;
            }
            int i9 = zzs & i2;
            if (zzr >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            long j = i9;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzz = zzgr.zzz(i6 << 3);
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
                        zzz2 = zzgr.zzz(i6 << 3);
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
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(j2);
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
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(j3);
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
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(j4);
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
                        zzz = zzgr.zzz(i6 << 3);
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
                        zzz2 = zzgr.zzz(i6 << 3);
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
                        zzz4 = zzgr.zzz(i6 << 3);
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
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgk) {
                            zzz5 = zzgr.zzz(i10);
                            zzd = ((zzgk) object).zzd();
                            zzz6 = zzgr.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i4 += r0;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        } else {
                            zzz3 = zzgr.zzz(i10);
                            zzA = zzgr.zzy((String) object);
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
                        r0 = zziz.zzh(i6, unsafe.getObject(obj, j), zzv(i3));
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
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj, j);
                        zzz5 = zzgr.zzz(i6 << 3);
                        zzd = zzgkVar.zzd();
                        zzz6 = zzgr.zzz(zzd);
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
                        int i11 = unsafe.getInt(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzz(i11);
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
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(j5);
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
                        zzz2 = zzgr.zzz(i6 << 3);
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
                        zzz = zzgr.zzz(i6 << 3);
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
                        int i12 = unsafe.getInt(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzz((i12 >> 31) ^ (i12 + i12));
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
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA((j6 >> 63) ^ (j6 + j6));
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
                        r0 = zzgr.zzw(i6, (zzim) unsafe.getObject(obj, j), zzv(i3));
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
                    r0 = zziz.zzd(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 19:
                    r0 = zziz.zzb(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zziz.zza;
                    if (list.size() != 0) {
                        zzg = zziz.zzg(list) + (list.size() * zzgr.zzz(i6 << 3));
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
                    int i14 = zziz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzz3 = zziz.zzl(list2);
                        zzz7 = zzgr.zzz(i6 << 3);
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
                    int i15 = zziz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzz3 = zziz.zzf(list3);
                        zzz7 = zzgr.zzz(i6 << 3);
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
                    r0 = zziz.zzd(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 24:
                    r0 = zziz.zzb(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i16 = zziz.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzgr.zzz(i6 << 3) + 1);
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
                    int i17 = zziz.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzz10 = zzgr.zzz(i6 << 3) * size3;
                        if (r02 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) r02;
                            zzg = zzz10;
                            for (?? r32 = z2; r32 < size3; r32++) {
                                Object zzc = zzhyVar.zzc();
                                if (zzc instanceof zzgk) {
                                    int zzd2 = ((zzgk) zzc).zzd();
                                    zzy2 = zzg + zzgr.zzz(zzd2) + zzd2;
                                } else {
                                    zzy2 = zzg + zzgr.zzy((String) zzc);
                                }
                                zzg = zzy2;
                            }
                        } else {
                            zzg = zzz10;
                            for (?? r33 = z2; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzgk) {
                                    int zzd3 = ((zzgk) obj2).zzd();
                                    zzy = zzg + zzgr.zzz(zzd3) + zzd3;
                                } else {
                                    zzy = zzg + zzgr.zzy((String) obj2);
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
                    zzix zzv = zzv(i3);
                    int i18 = zziz.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z2;
                    } else {
                        r3 = zzgr.zzz(i6 << 3) * size4;
                        for (?? r42 = z2; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzhx) {
                                int zza2 = ((zzhx) obj3).zza();
                                zzx = (r3 == true ? 1 : 0) + zzgr.zzz(zza2) + zza2;
                            } else {
                                zzx = (r3 == true ? 1 : 0) + zzgr.zzx((zzim) obj3, zzv);
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
                    int i19 = zziz.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z2;
                    } else {
                        r1 = size5 * zzgr.zzz(i6 << 3);
                        for (?? r2 = z2; r2 < r04.size(); r2++) {
                            int zzd4 = ((zzgk) r04.get(r2)).zzd();
                            r1 += zzgr.zzz(zzd4) + zzd4;
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
                    int i20 = zziz.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzz3 = zziz.zzk(list5);
                        zzz7 = zzgr.zzz(i6 << 3);
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
                    int i21 = zziz.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzz3 = zziz.zza(list6);
                        zzz7 = zzgr.zzz(i6 << 3);
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
                    r0 = zziz.zzb(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 32:
                    r0 = zziz.zzd(i6, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i22 = zziz.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzz3 = zziz.zzi(list7);
                        zzz7 = zzgr.zzz(i6 << 3);
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
                    int i23 = zziz.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzz3 = zziz.zzj(list8);
                        zzz7 = zzgr.zzz(i6 << 3);
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
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    int i24 = zziz.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zze = zziz.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzz8 = zzgr.zzz(i6 << 3);
                        zzz9 = zzgr.zzz(zze);
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
                    zzix zzv2 = zzv(i3);
                    int i25 = zziz.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z2;
                    } else {
                        boolean z4 = z2;
                        r4 = z4;
                        ?? r34 = z4;
                        while (r34 < size6) {
                            int zzw = zzgr.zzw(i6, (zzim) r05.get(r34), zzv2);
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
                    zzig zzigVar = (zzig) unsafe.getObject(obj, j);
                    if (zzigVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    i5 = i;
                    z3 = z;
                    z2 = false;
                    i2 = 1048575;
                case 51:
                    if (zzM(obj, i6, i3)) {
                        zzz = zzgr.zzz(i6 << 3);
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
                    if (zzM(obj, i6, i3)) {
                        zzz2 = zzgr.zzz(i6 << 3);
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
                    if (zzM(obj, i6, i3)) {
                        long zzt = zzt(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(zzt);
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
                    if (zzM(obj, i6, i3)) {
                        long zzt2 = zzt(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(zzt2);
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
                    if (zzM(obj, i6, i3)) {
                        long zzo = zzo(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(zzo);
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
                    if (zzM(obj, i6, i3)) {
                        zzz = zzgr.zzz(i6 << 3);
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
                    if (zzM(obj, i6, i3)) {
                        zzz2 = zzgr.zzz(i6 << 3);
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
                    if (zzM(obj, i6, i3)) {
                        zzz4 = zzgr.zzz(i6 << 3);
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
                    if (zzM(obj, i6, i3)) {
                        int i26 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgk) {
                            zzz5 = zzgr.zzz(i26);
                            zzd = ((zzgk) object2).zzd();
                            zzz6 = zzgr.zzz(zzd);
                            r0 = zzz5 + zzz6 + zzd;
                            i4 += r0;
                            i3 += 3;
                            i5 = i;
                            z3 = z;
                            z2 = false;
                            i2 = 1048575;
                        } else {
                            zzz3 = zzgr.zzz(i26);
                            zzA = zzgr.zzy((String) object2);
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
                    if (zzM(obj, i6, i3)) {
                        r0 = zziz.zzh(i6, unsafe.getObject(obj, j), zzv(i3));
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
                    if (zzM(obj, i6, i3)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj, j);
                        zzz5 = zzgr.zzz(i6 << 3);
                        zzd = zzgkVar2.zzd();
                        zzz6 = zzgr.zzz(zzd);
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
                    if (zzM(obj, i6, i3)) {
                        int zzo2 = zzo(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzz(zzo2);
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
                    if (zzM(obj, i6, i3)) {
                        long zzo3 = zzo(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA(zzo3);
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
                    if (zzM(obj, i6, i3)) {
                        zzz2 = zzgr.zzz(i6 << 3);
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
                    if (zzM(obj, i6, i3)) {
                        zzz = zzgr.zzz(i6 << 3);
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
                    if (zzM(obj, i6, i3)) {
                        int zzo4 = zzo(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzz((zzo4 >> 31) ^ (zzo4 + zzo4));
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
                    if (zzM(obj, i6, i3)) {
                        long zzt3 = zzt(obj, j);
                        zzz3 = zzgr.zzz(i6 << 3);
                        zzA = zzgr.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
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
                    if (zzM(obj, i6, i3)) {
                        r0 = zzgr.zzw(i6, (zzim) unsafe.getObject(obj, j), zzv(i3));
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
        int zza3 = i4 + ((zzhk) obj).zzc.zza();
        if (!this.zzh) {
            return zza3;
        }
        zzhb zzhbVar = ((zzhh) obj).zzb;
        int zzc2 = zzhbVar.zza.zzc();
        int i27 = 0;
        for (int i28 = 0; i28 < zzc2; i28++) {
            Map.Entry zzg2 = zzhbVar.zza.zzg(i28);
            i27 += zzhb.zzb((zzha) ((zzjb) zzg2).zza(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzhbVar.zza.zzd()) {
            i27 += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i27;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzs = zzs(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (zzr) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j));
                    byte[] bArr = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr2 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr3 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr4 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zzhp.zza(zzjq.zzw(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzf = zzjq.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr5 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr6 = zzhp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzf2 = zzjq.zzf(obj, j);
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
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzhp.zza(zzN(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzo(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzhp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + ((zzhk) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzhh) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0f36, code lost:
    
        if (r1 == r13) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0f38, code lost:
    
        r41.putInt(r46, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0f3e, code lost:
    
        r1 = r14.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0f42, code lost:
    
        if (r1 >= r14.zzk) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0f44, code lost:
    
        r2 = r14.zzi;
        r3 = r14.zzc;
        r2 = r2[r1];
        r3 = r3[r2];
        r3 = com.google.android.gms.internal.play_billing.zzjq.zzf(r46, r14.zzs(r2) & r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0f56, code lost:
    
        if (r3 != null) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0f61, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0f5e, code lost:
    
        if (r14.zzu(r2) != null) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0f63, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzig) r3;
        r0 = (com.google.android.gms.internal.play_billing.zzif) r14.zzw(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0f6b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0f6e, code lost:
    
        if (r0 != 0) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0f70, code lost:
    
        if (r8 != r12) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0f78, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f7d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f79, code lost:
    
        if (r8 > r12) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0f7b, code lost:
    
        if (r9 != r0) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f83, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0ba2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0bb6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0e95 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0eab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0ecb  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int i5;
        zzip<T> zzipVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzq;
        zzfz zzfzVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int zzg;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        zzfz zzfzVar3;
        int i28;
        int i29;
        zzip<T> zzipVar2;
        int i30;
        int i31;
        int i32;
        int i33;
        zzip<T> zzipVar3;
        int i34;
        int i35;
        int i36;
        int zza2;
        int i37;
        int zzh;
        Object obj2;
        int i38;
        int i39;
        boolean z;
        int i40;
        int i41;
        int i42;
        zzip<T> zzipVar4;
        int i43;
        int zzh2;
        Object obj3;
        int i44;
        int i45;
        int zzj;
        int i46;
        int i47;
        int i48;
        int i49;
        int zzh3;
        int zzh4;
        zzip<T> zzipVar5 = this;
        int i50 = i2;
        int i51 = i3;
        zzfz zzfzVar4 = zzfzVar;
        int i52 = 3;
        zzA(obj);
        Unsafe unsafe3 = zzb;
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
                    i61 = zzga.zzi(i62, bArr, i61, zzfzVar4);
                    i62 = zzfzVar4.zza;
                }
                int i63 = i62 >>> 3;
                if (i63 > i56) {
                    zzq = (i63 < zzipVar5.zze || i63 > zzipVar5.zzf) ? i54 : zzipVar5.zzq(i63, i57 / i52);
                } else if (i63 < zzipVar5.zze || i63 > zzipVar5.zzf) {
                    i10 = i54;
                    if (i10 != i54) {
                        zzfzVar2 = zzfzVar4;
                        i11 = i52;
                        i9 = i62;
                        i12 = i63;
                        i13 = i54;
                        i14 = i53;
                        i15 = i14;
                        unsafe = unsafe3;
                        zzipVar = zzipVar5;
                        i16 = i61;
                        i6 = i51;
                    } else {
                        int i64 = i62 & 7;
                        int[] iArr = zzipVar5.zzc;
                        int i65 = iArr[i10 + 1];
                        int zzr = zzr(i65);
                        long j = i65 & 1048575;
                        int i66 = i62;
                        String str = "Protocol message had invalid UTF-8.";
                        if (zzr <= 17) {
                            int i67 = iArr[i10 + 2];
                            int i68 = 1 << (i67 >>> 20);
                            int i69 = i67 & 1048575;
                            int i70 = i60;
                            if (i69 != i70) {
                                if (i70 != 1048575) {
                                    unsafe3.putInt(obj, i70, i58);
                                }
                                i60 = i69;
                                i58 = i69 == 1048575 ? 0 : unsafe3.getInt(obj, i69);
                            } else {
                                i60 = i70;
                            }
                            switch (zzr) {
                                case 0:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i20 = 3;
                                    i15 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 1) {
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i55 = i21 + 8;
                                        i58 |= i68;
                                        zzjq.zzo(obj, j, Double.longBitsToDouble(zzga.zzn(bArr, i21)));
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = 3;
                                        i57 = i19;
                                        i54 = -1;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe3 = unsafe2;
                                        i53 = i15;
                                    }
                                case 1:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i20 = 3;
                                    i15 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 5) {
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i55 = i21 + 4;
                                        i58 |= i68;
                                        zzjq.zzp(obj, j, Float.intBitsToFloat(zzga.zzb(bArr, i21)));
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe3 = unsafe2;
                                        i53 = i15;
                                    }
                                case 2:
                                case 3:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i20 = 3;
                                    i15 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 0) {
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        i55 = zzga.zzk(bArr, i21, zzfzVar2);
                                        unsafe2.putLong(obj, j, zzfzVar2.zzb);
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe3 = unsafe2;
                                        i53 = i15;
                                    }
                                case 4:
                                case 11:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i20 = 3;
                                    i15 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 0) {
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        i55 = zzga.zzh(bArr, i21, zzfzVar2);
                                        unsafe2.putInt(obj, j, zzfzVar2.zza);
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe3 = unsafe2;
                                        i53 = i15;
                                    }
                                case 5:
                                case 14:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i20 = 3;
                                    i15 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 1) {
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i55 = i21 + 8;
                                        i58 |= i68;
                                        unsafe2.putLong(obj, j, zzga.zzn(bArr, i21));
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe3 = unsafe2;
                                        i53 = i15;
                                    }
                                case 6:
                                case 13:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i20 = 3;
                                    i15 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 5) {
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i55 = i21 + 4;
                                        i58 |= i68;
                                        unsafe2.putInt(obj, j, zzga.zzb(bArr, i21));
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe3 = unsafe2;
                                        i53 = i15;
                                    }
                                case 7:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i20 = 3;
                                    i15 = 0;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 0) {
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        i55 = zzga.zzk(bArr, i21, zzfzVar2);
                                        zzjq.zzm(obj, j, zzfzVar2.zzb != 0);
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = i20;
                                        i57 = i19;
                                        i54 = i13;
                                        i59 = i66;
                                        i56 = i18;
                                        unsafe3 = unsafe2;
                                        i53 = i15;
                                    }
                                case 8:
                                    i21 = i61;
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    int i71 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 2) {
                                        i66 = i71;
                                        i20 = 3;
                                        i15 = 0;
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        if ((i65 & 536870912) != 0) {
                                            int i72 = i58 | i68;
                                            int zzh5 = zzga.zzh(bArr, i21, zzfzVar2);
                                            int i73 = zzfzVar2.zza;
                                            if (i73 < 0) {
                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i73 == 0) {
                                                zzfzVar2.zzc = "";
                                                i25 = i72;
                                                i22 = i71;
                                                i23 = 0;
                                                i24 = 3;
                                            } else {
                                                int i74 = zzjt.zza;
                                                int length = bArr.length;
                                                if ((((length - zzh5) - i73) | zzh5 | i73) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh5), Integer.valueOf(i73)));
                                                }
                                                int i75 = zzh5 + i73;
                                                char[] cArr = new char[i73];
                                                int i76 = 0;
                                                while (zzh5 < i75) {
                                                    byte b = bArr[zzh5];
                                                    if (zzjr.zzd(b)) {
                                                        zzh5++;
                                                        cArr[i76] = (char) b;
                                                        i76++;
                                                    } else {
                                                        while (zzh5 < i75) {
                                                            int i77 = zzh5 + 1;
                                                            byte b2 = bArr[zzh5];
                                                            if (zzjr.zzd(b2)) {
                                                                cArr[i76] = (char) b2;
                                                                i76++;
                                                                zzh5 = i77;
                                                                while (zzh5 < i75) {
                                                                    byte b3 = bArr[zzh5];
                                                                    if (zzjr.zzd(b3)) {
                                                                        zzh5++;
                                                                        cArr[i76] = (char) b3;
                                                                        i76++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i78 = i72;
                                                                if (b2 >= -32) {
                                                                    int i79 = i71;
                                                                    String str2 = str;
                                                                    if (b2 < -16) {
                                                                        if (i77 >= i75 - 1) {
                                                                            throw new zzhr(str2);
                                                                        }
                                                                        int i80 = zzh5 + 2;
                                                                        zzh5 += 3;
                                                                        zzjr.zzb(b2, bArr[i77], bArr[i80], cArr, i76);
                                                                        str = str2;
                                                                        i76++;
                                                                    } else {
                                                                        if (i77 >= i75 - 2) {
                                                                            throw new zzhr(str2);
                                                                        }
                                                                        byte b4 = bArr[i77];
                                                                        int i81 = zzh5 + 3;
                                                                        byte b5 = bArr[zzh5 + 2];
                                                                        zzh5 += 4;
                                                                        zzjr.zza(b2, b4, b5, bArr[i81], cArr, i76);
                                                                        i76 += 2;
                                                                        str = str2;
                                                                    }
                                                                    i71 = i79;
                                                                } else {
                                                                    if (i77 >= i75) {
                                                                        throw new zzhr(str);
                                                                    }
                                                                    zzh5 += 2;
                                                                    zzjr.zzc(b2, bArr[i77], cArr, i76);
                                                                    i76++;
                                                                }
                                                                i72 = i78;
                                                            }
                                                        }
                                                        i25 = i72;
                                                        i22 = i71;
                                                        i24 = 3;
                                                        i23 = 0;
                                                        zzfzVar2.zzc = new String(cArr, 0, i76);
                                                        zzh5 = i75;
                                                    }
                                                }
                                                while (zzh5 < i75) {
                                                }
                                                i25 = i72;
                                                i22 = i71;
                                                i24 = 3;
                                                i23 = 0;
                                                zzfzVar2.zzc = new String(cArr, 0, i76);
                                                zzh5 = i75;
                                            }
                                            i58 = i25;
                                            i55 = zzh5;
                                        } else {
                                            i22 = i71;
                                            i23 = 0;
                                            i24 = 3;
                                            int zzh6 = zzga.zzh(bArr, i21, zzfzVar2);
                                            int i82 = zzfzVar2.zza;
                                            if (i82 < 0) {
                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i83 = i58 | i68;
                                            if (i82 == 0) {
                                                zzfzVar2.zzc = "";
                                            } else {
                                                zzfzVar2.zzc = new String(bArr, zzh6, i82, zzhp.zza);
                                                zzh6 += i82;
                                            }
                                            i55 = zzh6;
                                            i58 = i83;
                                        }
                                        unsafe2.putObject(obj, j, zzfzVar2.zzc);
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i52 = i24;
                                        i57 = i19;
                                        i54 = -1;
                                        i59 = i22;
                                        unsafe3 = unsafe2;
                                        i53 = i23;
                                        i56 = i18;
                                    }
                                case 9:
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i26 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 2) {
                                        i21 = i61;
                                        i66 = i26;
                                        i20 = 3;
                                        i15 = 0;
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        Object zzx = zzipVar5.zzx(obj, i19);
                                        i50 = i2;
                                        int zzm = zzga.zzm(zzx, zzipVar5.zzv(i19), bArr, i61, i50, zzfzVar);
                                        zzipVar5.zzF(obj, i19, zzx);
                                        i51 = i3;
                                        i55 = zzm;
                                        zzfzVar4 = zzfzVar2;
                                        i59 = i26;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe3 = unsafe2;
                                        i53 = 0;
                                    }
                                case 10:
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i26 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 2) {
                                        i21 = i61;
                                        i66 = i26;
                                        i20 = 3;
                                        i15 = 0;
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        i55 = zzga.zza(bArr, i61, zzfzVar2);
                                        unsafe2.putObject(obj, j, zzfzVar2.zzc);
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i59 = i26;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe3 = unsafe2;
                                        i53 = 0;
                                    }
                                case 12:
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i26 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 0) {
                                        i21 = i61;
                                        i66 = i26;
                                        i20 = 3;
                                        i15 = 0;
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i55 = zzga.zzh(bArr, i61, zzfzVar2);
                                        int i84 = zzfzVar2.zza;
                                        zzhm zzu = zzipVar5.zzu(i19);
                                        if ((i65 & Integer.MIN_VALUE) == 0 || zzu == null || zzu.zza(i84)) {
                                            i58 |= i68;
                                            unsafe2.putInt(obj, j, i84);
                                        } else {
                                            zzd(obj).zzj(i26, Long.valueOf(i84));
                                        }
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i59 = i26;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe3 = unsafe2;
                                        i53 = 0;
                                    }
                                case 15:
                                    i18 = i63;
                                    unsafe2 = unsafe3;
                                    i26 = i66;
                                    i13 = -1;
                                    i19 = i10;
                                    zzfzVar2 = zzfzVar4;
                                    if (i64 != 0) {
                                        i21 = i61;
                                        i66 = i26;
                                        i20 = 3;
                                        i15 = 0;
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        i55 = zzga.zzh(bArr, i61, zzfzVar2);
                                        unsafe2.putInt(obj, j, zzgn.zzb(zzfzVar2.zza));
                                        i50 = i2;
                                        i51 = i3;
                                        zzfzVar4 = zzfzVar2;
                                        i59 = i26;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe3 = unsafe2;
                                        i53 = 0;
                                    }
                                case 16:
                                    i18 = i63;
                                    Unsafe unsafe4 = unsafe3;
                                    i13 = -1;
                                    i19 = i10;
                                    if (i64 != 0) {
                                        unsafe2 = unsafe4;
                                        zzfzVar2 = zzfzVar4;
                                        i20 = 3;
                                        i66 = i66;
                                        i15 = 0;
                                        i21 = i61;
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        i55 = zzga.zzk(bArr, i61, zzfzVar4);
                                        unsafe2 = unsafe4;
                                        unsafe4.putLong(obj, j, zzgn.zzc(zzfzVar4.zzb));
                                        i50 = i2;
                                        i51 = i3;
                                        i59 = i66;
                                        zzfzVar4 = zzfzVar4;
                                        i57 = i19;
                                        i54 = i13;
                                        i56 = i18;
                                        i52 = 3;
                                        unsafe3 = unsafe2;
                                        i53 = 0;
                                    }
                                default:
                                    i52 = 3;
                                    if (i64 != 3) {
                                        i18 = i63;
                                        Unsafe unsafe5 = unsafe3;
                                        i13 = -1;
                                        i19 = i10;
                                        zzfzVar2 = zzfzVar4;
                                        i20 = 3;
                                        unsafe2 = unsafe5;
                                        i15 = 0;
                                        i21 = i61;
                                        i16 = i21;
                                        i11 = i20;
                                        unsafe = unsafe2;
                                        i14 = i19;
                                        i9 = i66;
                                        i12 = i18;
                                        zzipVar = zzipVar5;
                                        i6 = i3;
                                        break;
                                    } else {
                                        i58 |= i68;
                                        Object zzx2 = zzipVar5.zzx(obj, i10);
                                        int i85 = i10;
                                        i55 = zzga.zzl(zzx2, zzipVar5.zzv(i10), bArr, i61, i2, (i63 << 3) | 4, zzfzVar);
                                        zzipVar5.zzF(obj, i85, zzx2);
                                        i57 = i85;
                                        unsafe3 = unsafe3;
                                        i59 = i66;
                                        i54 = -1;
                                        i56 = i63;
                                        i53 = 0;
                                        i50 = i2;
                                        i51 = i3;
                                    }
                            }
                        } else {
                            int i86 = i61;
                            int i87 = i63;
                            Unsafe unsafe6 = unsafe3;
                            i15 = 0;
                            i13 = -1;
                            int i88 = i10;
                            zzfz zzfzVar5 = zzfzVar4;
                            int i89 = i60;
                            int i90 = i58;
                            if (zzr != 27) {
                                i27 = i89;
                                zzfzVar3 = zzfzVar5;
                                if (zzr <= 49) {
                                    long j2 = i65;
                                    Unsafe unsafe7 = zzb;
                                    zzho zzhoVar = (zzho) unsafe7.getObject(obj, j);
                                    if (zzhoVar.zzc()) {
                                        obj2 = "";
                                    } else {
                                        int size = zzhoVar.size();
                                        obj2 = "";
                                        zzhoVar = zzhoVar.zzd(size + size);
                                        unsafe7.putObject(obj, j, zzhoVar);
                                    }
                                    zzho zzhoVar2 = zzhoVar;
                                    switch (zzr) {
                                        case 18:
                                        case 35:
                                            unsafe = unsafe6;
                                            i38 = i2;
                                            int i91 = i66;
                                            i39 = i86;
                                            i14 = i88;
                                            zzipVar2 = zzipVar5;
                                            if (i64 == 2) {
                                                int i92 = zzga.zza;
                                                zzgt zzgtVar = (zzgt) zzhoVar2;
                                                int zzh7 = zzga.zzh(bArr, i39, zzfzVar3);
                                                int i93 = zzfzVar3.zza;
                                                int i94 = zzh7 + i93;
                                                if (i94 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzgtVar.zzg(zzgtVar.size() + (i93 / 8));
                                                while (zzh7 < i94) {
                                                    zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr, zzh7)));
                                                    zzh7 += 8;
                                                    i91 = i91;
                                                }
                                                int i95 = i91;
                                                if (zzh7 != i94) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i55 = zzh7;
                                                i40 = i95;
                                                z = true;
                                                if (i55 == i39) {
                                                    i51 = i3;
                                                    i59 = i40;
                                                    zzipVar5 = zzipVar2;
                                                    i57 = i14;
                                                    i50 = i38;
                                                    zzfzVar4 = zzfzVar3;
                                                    i53 = 0;
                                                    i54 = -1;
                                                    i56 = i87;
                                                    unsafe3 = unsafe;
                                                    i52 = 3;
                                                    break;
                                                } else {
                                                    i6 = i3;
                                                    i9 = i40;
                                                    i16 = i55;
                                                    i12 = i87;
                                                    i11 = 3;
                                                    zzfz zzfzVar6 = zzfzVar3;
                                                    zzipVar = zzipVar2;
                                                    zzfzVar2 = zzfzVar6;
                                                    int i96 = i27;
                                                    i58 = i90;
                                                    i60 = i96;
                                                    break;
                                                }
                                            } else {
                                                int i97 = i91;
                                                z = true;
                                                if (i64 == 1) {
                                                    int i98 = i39 + 8;
                                                    int i99 = zzga.zza;
                                                    zzgt zzgtVar2 = (zzgt) zzhoVar2;
                                                    zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr, i39)));
                                                    while (true) {
                                                        if (i98 < i38) {
                                                            int zzh8 = zzga.zzh(bArr, i98, zzfzVar3);
                                                            i40 = i97;
                                                            if (i40 == zzfzVar3.zza) {
                                                                zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr, zzh8)));
                                                                i98 = zzh8 + 8;
                                                                i97 = i40;
                                                            }
                                                        } else {
                                                            i40 = i97;
                                                        }
                                                    }
                                                    i55 = i98;
                                                    if (i55 == i39) {
                                                    }
                                                } else {
                                                    i40 = i97;
                                                    i55 = i39;
                                                    if (i55 == i39) {
                                                    }
                                                }
                                            }
                                        case 19:
                                        case 36:
                                            unsafe = unsafe6;
                                            i38 = i2;
                                            i41 = i66;
                                            i39 = i86;
                                            i14 = i88;
                                            zzipVar2 = zzipVar5;
                                            if (i64 == 2) {
                                                int i100 = zzga.zza;
                                                zzhd zzhdVar = (zzhd) zzhoVar2;
                                                int zzh9 = zzga.zzh(bArr, i39, zzfzVar3);
                                                int i101 = zzfzVar3.zza;
                                                int i102 = zzh9 + i101;
                                                if (i102 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzhdVar.zzg(zzhdVar.size() + (i101 / 4));
                                                while (zzh9 < i102) {
                                                    zzhdVar.zzf(Float.intBitsToFloat(zzga.zzb(bArr, zzh9)));
                                                    zzh9 += 4;
                                                }
                                                if (zzh9 != i102) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i55 = zzh9;
                                                i40 = i41;
                                                z = true;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                if (i64 == 5) {
                                                    i42 = i39 + 4;
                                                    int i103 = zzga.zza;
                                                    zzhd zzhdVar2 = (zzhd) zzhoVar2;
                                                    zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr, i39)));
                                                    while (i42 < i38) {
                                                        int zzh10 = zzga.zzh(bArr, i42, zzfzVar3);
                                                        if (i41 == zzfzVar3.zza) {
                                                            zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr, zzh10)));
                                                            i42 = zzh10 + 4;
                                                        } else {
                                                            i55 = i42;
                                                            i40 = i41;
                                                            z = true;
                                                            if (i55 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i55 = i42;
                                                    i40 = i41;
                                                    z = true;
                                                    if (i55 == i39) {
                                                    }
                                                }
                                                i40 = i41;
                                                z = true;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            unsafe = unsafe6;
                                            i38 = i2;
                                            i41 = i66;
                                            i39 = i86;
                                            i14 = i88;
                                            zzipVar2 = zzipVar5;
                                            if (i64 == 2) {
                                                int i104 = zzga.zza;
                                                zzib zzibVar = (zzib) zzhoVar2;
                                                int zzh11 = zzga.zzh(bArr, i39, zzfzVar3);
                                                int i105 = zzfzVar3.zza + zzh11;
                                                while (zzh11 < i105) {
                                                    zzh11 = zzga.zzk(bArr, zzh11, zzfzVar3);
                                                    zzibVar.zzf(zzfzVar3.zzb);
                                                }
                                                if (zzh11 != i105) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i55 = zzh11;
                                                z = true;
                                                i40 = i41;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    int i106 = zzga.zza;
                                                    zzib zzibVar2 = (zzib) zzhoVar2;
                                                    i42 = zzga.zzk(bArr, i39, zzfzVar3);
                                                    zzibVar2.zzf(zzfzVar3.zzb);
                                                    while (i42 < i38) {
                                                        int zzh12 = zzga.zzh(bArr, i42, zzfzVar3);
                                                        if (i41 == zzfzVar3.zza) {
                                                            i42 = zzga.zzk(bArr, zzh12, zzfzVar3);
                                                            zzibVar2.zzf(zzfzVar3.zzb);
                                                        } else {
                                                            i55 = i42;
                                                            i40 = i41;
                                                            z = true;
                                                            if (i55 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i55 = i42;
                                                    i40 = i41;
                                                    z = true;
                                                    if (i55 == i39) {
                                                    }
                                                }
                                                i40 = i41;
                                                z = true;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            unsafe = unsafe6;
                                            i38 = i2;
                                            zzipVar4 = zzipVar5;
                                            i43 = i66;
                                            i39 = i86;
                                            z = true;
                                            i14 = i88;
                                            if (i64 == 2) {
                                                i55 = zzga.zzf(bArr, i39, zzhoVar2, zzfzVar3);
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    zzipVar2 = zzipVar4;
                                                    i40 = i43;
                                                    z = true;
                                                    i55 = zzga.zzj(i43, bArr, i39, i2, zzhoVar2, zzfzVar);
                                                    if (i55 == i39) {
                                                    }
                                                }
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            unsafe = unsafe6;
                                            i38 = i2;
                                            zzipVar4 = zzipVar5;
                                            i43 = i66;
                                            i39 = i86;
                                            i14 = i88;
                                            if (i64 == 2) {
                                                int i107 = zzga.zza;
                                                zzib zzibVar3 = (zzib) zzhoVar2;
                                                zzh2 = zzga.zzh(bArr, i39, zzfzVar3);
                                                int i108 = zzfzVar3.zza;
                                                int i109 = zzh2 + i108;
                                                if (i109 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzibVar3.zzg(zzibVar3.size() + (i108 / 8));
                                                while (zzh2 < i109) {
                                                    zzibVar3.zzf(zzga.zzn(bArr, zzh2));
                                                    zzh2 += 8;
                                                }
                                                if (zzh2 != i109) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i55 = zzh2;
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                z = true;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                z = true;
                                                if (i64 == 1) {
                                                    int i110 = i39 + 8;
                                                    int i111 = zzga.zza;
                                                    zzib zzibVar4 = (zzib) zzhoVar2;
                                                    zzibVar4.zzf(zzga.zzn(bArr, i39));
                                                    while (i110 < i38) {
                                                        int zzh13 = zzga.zzh(bArr, i110, zzfzVar3);
                                                        if (i43 == zzfzVar3.zza) {
                                                            zzibVar4.zzf(zzga.zzn(bArr, zzh13));
                                                            i110 = zzh13 + 8;
                                                        } else {
                                                            i55 = i110;
                                                            zzipVar2 = zzipVar4;
                                                            i40 = i43;
                                                            if (i55 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i55 = i110;
                                                    zzipVar2 = zzipVar4;
                                                    i40 = i43;
                                                    if (i55 == i39) {
                                                    }
                                                }
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            unsafe = unsafe6;
                                            i38 = i2;
                                            zzipVar4 = zzipVar5;
                                            i43 = i66;
                                            i39 = i86;
                                            i14 = i88;
                                            if (i64 == 2) {
                                                int i112 = zzga.zza;
                                                zzhl zzhlVar = (zzhl) zzhoVar2;
                                                zzh2 = zzga.zzh(bArr, i39, zzfzVar3);
                                                int i113 = zzfzVar3.zza;
                                                int i114 = zzh2 + i113;
                                                if (i114 > bArr.length) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzhlVar.zzh(zzhlVar.size() + (i113 / 4));
                                                while (zzh2 < i114) {
                                                    zzhlVar.zzg(zzga.zzb(bArr, zzh2));
                                                    zzh2 += 4;
                                                }
                                                if (zzh2 != i114) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i64 == 5) {
                                                    zzh2 = i39 + 4;
                                                    int i115 = zzga.zza;
                                                    zzhl zzhlVar2 = (zzhl) zzhoVar2;
                                                    zzhlVar2.zzg(zzga.zzb(bArr, i39));
                                                    while (zzh2 < i38) {
                                                        int zzh14 = zzga.zzh(bArr, zzh2, zzfzVar3);
                                                        if (i43 == zzfzVar3.zza) {
                                                            zzhlVar2.zzg(zzga.zzb(bArr, zzh14));
                                                            zzh2 = zzh14 + 4;
                                                        }
                                                    }
                                                }
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                z = true;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            i55 = zzh2;
                                            zzipVar2 = zzipVar4;
                                            i40 = i43;
                                            z = true;
                                            if (i55 == i39) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            unsafe = unsafe6;
                                            i38 = i2;
                                            zzipVar4 = zzipVar5;
                                            i43 = i66;
                                            i39 = i86;
                                            i14 = i88;
                                            if (i64 == 2) {
                                                int i116 = zzga.zza;
                                                zzgb zzgbVar = (zzgb) zzhoVar2;
                                                zzh2 = zzga.zzh(bArr, i39, zzfzVar3);
                                                int i117 = zzfzVar3.zza + zzh2;
                                                while (zzh2 < i117) {
                                                    zzh2 = zzga.zzk(bArr, zzh2, zzfzVar3);
                                                    zzgbVar.zze(zzfzVar3.zzb != 0);
                                                }
                                                if (zzh2 != i117) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i55 = zzh2;
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                z = true;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    int i118 = zzga.zza;
                                                    zzgb zzgbVar2 = (zzgb) zzhoVar2;
                                                    int zzk = zzga.zzk(bArr, i39, zzfzVar3);
                                                    zzgbVar2.zze(zzfzVar3.zzb != 0);
                                                    while (zzk < i38) {
                                                        int zzh15 = zzga.zzh(bArr, zzk, zzfzVar3);
                                                        if (i43 == zzfzVar3.zza) {
                                                            zzk = zzga.zzk(bArr, zzh15, zzfzVar3);
                                                            zzgbVar2.zze(zzfzVar3.zzb != 0);
                                                        } else {
                                                            i55 = zzk;
                                                            zzipVar2 = zzipVar4;
                                                            i40 = i43;
                                                            z = true;
                                                            if (i55 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i55 = zzk;
                                                    zzipVar2 = zzipVar4;
                                                    i40 = i43;
                                                    z = true;
                                                    if (i55 == i39) {
                                                    }
                                                }
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                z = true;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            unsafe = unsafe6;
                                            zzipVar4 = zzipVar5;
                                            i43 = i66;
                                            i14 = i88;
                                            if (i64 == 2) {
                                                if ((536870912 & j2) == 0) {
                                                    i39 = i86;
                                                    i55 = zzga.zzh(bArr, i39, zzfzVar3);
                                                    int i119 = zzfzVar3.zza;
                                                    if (i119 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i119 == 0) {
                                                        obj3 = obj2;
                                                        zzhoVar2.add(obj3);
                                                    } else {
                                                        obj3 = obj2;
                                                        zzhoVar2.add(new String(bArr, i55, i119, zzhp.zza));
                                                        i55 += i119;
                                                    }
                                                    i38 = i2;
                                                    while (i55 < i38) {
                                                        int zzh16 = zzga.zzh(bArr, i55, zzfzVar3);
                                                        if (i43 == zzfzVar3.zza) {
                                                            i55 = zzga.zzh(bArr, zzh16, zzfzVar3);
                                                            int i120 = zzfzVar3.zza;
                                                            if (i120 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i120 == 0) {
                                                                zzhoVar2.add(obj3);
                                                            } else {
                                                                zzhoVar2.add(new String(bArr, i55, i120, zzhp.zza));
                                                                i55 += i120;
                                                            }
                                                        } else {
                                                            i87 = i87;
                                                        }
                                                    }
                                                    i87 = i87;
                                                } else {
                                                    i38 = i2;
                                                    Object obj4 = obj2;
                                                    i39 = i86;
                                                    int zzh17 = zzga.zzh(bArr, i39, zzfzVar3);
                                                    int i121 = zzfzVar3.zza;
                                                    if (i121 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i121 == 0) {
                                                        zzhoVar2.add(obj4);
                                                        i87 = i87;
                                                    } else {
                                                        int i122 = zzh17 + i121;
                                                        if (!zzjt.zzd(bArr, zzh17, i122)) {
                                                            throw new zzhr(str);
                                                        }
                                                        i87 = i87;
                                                        zzhoVar2.add(new String(bArr, zzh17, i121, zzhp.zza));
                                                        zzh17 = i122;
                                                    }
                                                    while (zzh17 < i38) {
                                                        int zzh18 = zzga.zzh(bArr, zzh17, zzfzVar3);
                                                        if (i43 == zzfzVar3.zza) {
                                                            zzh17 = zzga.zzh(bArr, zzh18, zzfzVar3);
                                                            int i123 = zzfzVar3.zza;
                                                            if (i123 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i123 == 0) {
                                                                zzhoVar2.add(obj4);
                                                            } else {
                                                                int i124 = zzh17 + i123;
                                                                if (!zzjt.zzd(bArr, zzh17, i124)) {
                                                                    throw new zzhr(str);
                                                                }
                                                                zzhoVar2.add(new String(bArr, zzh17, i123, zzhp.zza));
                                                                zzh17 = i124;
                                                            }
                                                        } else {
                                                            i55 = zzh17;
                                                        }
                                                    }
                                                    i55 = zzh17;
                                                }
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                z = true;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                i38 = i2;
                                                i39 = i86;
                                                i87 = i87;
                                                zzipVar2 = zzipVar4;
                                                i40 = i43;
                                                z = true;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            if (i64 == 2) {
                                                i38 = i2;
                                                unsafe = unsafe6;
                                                i55 = zzga.zze(zzv(i88), i66, bArr, i86, i38, zzhoVar2, zzfzVar);
                                                i87 = i87;
                                                i14 = i88;
                                                zzfzVar3 = zzfzVar3;
                                                zzipVar2 = this;
                                                i40 = i66;
                                                i39 = i86;
                                                z = true;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                unsafe = unsafe6;
                                                i87 = i87;
                                                z = true;
                                                i40 = i66;
                                                i39 = i86;
                                                i38 = i2;
                                                i14 = i88;
                                                zzipVar2 = this;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            i44 = i2;
                                            i45 = i86;
                                            if (i64 == 2) {
                                                int zzh19 = zzga.zzh(bArr, i45, zzfzVar3);
                                                int i125 = zzfzVar3.zza;
                                                if (i125 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i125 > bArr.length - zzh19) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i125 == 0) {
                                                    zzhoVar2.add(zzgk.zzb);
                                                } else {
                                                    zzhoVar2.add(zzgk.zzj(bArr, zzh19, i125));
                                                    zzh19 += i125;
                                                }
                                                while (zzh19 < i44) {
                                                    int zzh20 = zzga.zzh(bArr, zzh19, zzfzVar3);
                                                    if (i66 == zzfzVar3.zza) {
                                                        zzh19 = zzga.zzh(bArr, zzh20, zzfzVar3);
                                                        int i126 = zzfzVar3.zza;
                                                        if (i126 < 0) {
                                                            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i126 > bArr.length - zzh19) {
                                                            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i126 == 0) {
                                                            zzhoVar2.add(zzgk.zzb);
                                                        } else {
                                                            zzhoVar2.add(zzgk.zzj(bArr, zzh19, i126));
                                                            zzh19 += i126;
                                                        }
                                                    } else {
                                                        unsafe = unsafe6;
                                                        i87 = i87;
                                                        i55 = zzh19;
                                                        z = true;
                                                        i40 = i66;
                                                        i14 = i88;
                                                        zzipVar2 = this;
                                                        int i127 = i44;
                                                        i39 = i45;
                                                        i38 = i127;
                                                        if (i55 == i39) {
                                                        }
                                                    }
                                                }
                                                unsafe = unsafe6;
                                                i87 = i87;
                                                i55 = zzh19;
                                                z = true;
                                                i40 = i66;
                                                i14 = i88;
                                                zzipVar2 = this;
                                                int i1272 = i44;
                                                i39 = i45;
                                                i38 = i1272;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                unsafe = unsafe6;
                                                i87 = i87;
                                                z = true;
                                                i40 = i66;
                                                i14 = i88;
                                                zzipVar2 = this;
                                                int i128 = i44;
                                                i39 = i45;
                                                i38 = i128;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i44 = i2;
                                            i45 = i86;
                                            if (i64 == 2) {
                                                zzj = zzga.zzf(bArr, i45, zzhoVar2, zzfzVar3);
                                            } else if (i64 == 0) {
                                                zzj = zzga.zzj(i66, bArr, i45, i2, zzhoVar2, zzfzVar);
                                            } else {
                                                unsafe = unsafe6;
                                                i40 = i66;
                                                z = true;
                                                i14 = i88;
                                                zzipVar2 = this;
                                                int i1282 = i44;
                                                i39 = i45;
                                                i38 = i1282;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            zzhm zzu2 = zzipVar5.zzu(i88);
                                            zzjj zzjjVar = zzipVar5.zzl;
                                            int i129 = zziz.zza;
                                            if (zzu2 == null) {
                                                i46 = zzj;
                                                i47 = i87;
                                                z = true;
                                            } else if (zzhoVar2 != null) {
                                                int size2 = zzhoVar2.size();
                                                Object obj5 = null;
                                                int i130 = 0;
                                                int i131 = 0;
                                                while (i130 < size2) {
                                                    int i132 = zzj;
                                                    Integer num = (Integer) zzhoVar2.get(i130);
                                                    int intValue = num.intValue();
                                                    if (zzu2.zza(intValue)) {
                                                        if (i130 != i131) {
                                                            zzhoVar2.set(i131, num);
                                                        }
                                                        i131++;
                                                        i49 = 1;
                                                        i48 = i87;
                                                    } else {
                                                        i48 = i87;
                                                        obj5 = zziz.zzn(obj, i48, intValue, obj5, zzjjVar);
                                                        i49 = 1;
                                                    }
                                                    i130 += i49;
                                                    i87 = i48;
                                                    zzj = i132;
                                                }
                                                i46 = zzj;
                                                i47 = i87;
                                                z = true;
                                                if (i131 != size2) {
                                                    zzhoVar2.subList(i131, size2).clear();
                                                }
                                            } else {
                                                i46 = zzj;
                                                i47 = i87;
                                                z = true;
                                                Iterator it = zzhoVar2.iterator();
                                                Object obj6 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzu2.zza(intValue2)) {
                                                        obj6 = zziz.zzn(obj, i47, intValue2, obj6, zzjjVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            unsafe = unsafe6;
                                            i87 = i47;
                                            i40 = i66;
                                            i55 = i46;
                                            i14 = i88;
                                            zzipVar2 = this;
                                            int i12722 = i44;
                                            i39 = i45;
                                            i38 = i12722;
                                            if (i55 == i39) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i44 = i2;
                                            i45 = i86;
                                            if (i64 == 2) {
                                                int i133 = zzga.zza;
                                                zzhl zzhlVar3 = (zzhl) zzhoVar2;
                                                zzh4 = zzga.zzh(bArr, i45, zzfzVar3);
                                                int i134 = zzfzVar3.zza + zzh4;
                                                while (zzh4 < i134) {
                                                    zzh4 = zzga.zzh(bArr, zzh4, zzfzVar3);
                                                    zzhlVar3.zzg(zzgn.zzb(zzfzVar3.zza));
                                                }
                                                if (zzh4 != i134) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                unsafe = unsafe6;
                                                i55 = zzh4;
                                                i40 = i66;
                                                i14 = i88;
                                                zzipVar2 = zzipVar5;
                                                z = true;
                                                int i127222 = i44;
                                                i39 = i45;
                                                i38 = i127222;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    int i135 = zzga.zza;
                                                    zzhl zzhlVar4 = (zzhl) zzhoVar2;
                                                    zzh3 = zzga.zzh(bArr, i45, zzfzVar3);
                                                    zzhlVar4.zzg(zzgn.zzb(zzfzVar3.zza));
                                                    while (zzh3 < i44) {
                                                        int zzh21 = zzga.zzh(bArr, zzh3, zzfzVar3);
                                                        if (i66 == zzfzVar3.zza) {
                                                            zzh3 = zzga.zzh(bArr, zzh21, zzfzVar3);
                                                            zzhlVar4.zzg(zzgn.zzb(zzfzVar3.zza));
                                                        } else {
                                                            unsafe = unsafe6;
                                                            i55 = zzh3;
                                                            i40 = i66;
                                                            i14 = i88;
                                                            zzipVar2 = zzipVar5;
                                                            z = true;
                                                            int i1272222 = i44;
                                                            i39 = i45;
                                                            i38 = i1272222;
                                                            if (i55 == i39) {
                                                            }
                                                        }
                                                    }
                                                    unsafe = unsafe6;
                                                    i55 = zzh3;
                                                    i40 = i66;
                                                    i14 = i88;
                                                    zzipVar2 = zzipVar5;
                                                    z = true;
                                                    int i12722222 = i44;
                                                    i39 = i45;
                                                    i38 = i12722222;
                                                    if (i55 == i39) {
                                                    }
                                                }
                                                unsafe = unsafe6;
                                                i40 = i66;
                                                i14 = i88;
                                                zzipVar2 = zzipVar5;
                                                z = true;
                                                int i12822 = i44;
                                                i39 = i45;
                                                i38 = i12822;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i44 = i2;
                                            if (i64 == 2) {
                                                int i136 = zzga.zza;
                                                zzib zzibVar5 = (zzib) zzhoVar2;
                                                i45 = i86;
                                                zzh4 = zzga.zzh(bArr, i45, zzfzVar3);
                                                int i137 = zzfzVar3.zza + zzh4;
                                                while (zzh4 < i137) {
                                                    zzh4 = zzga.zzk(bArr, zzh4, zzfzVar3);
                                                    zzibVar5.zzf(zzgn.zzc(zzfzVar3.zzb));
                                                }
                                                if (zzh4 != i137) {
                                                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                unsafe = unsafe6;
                                                i55 = zzh4;
                                                i40 = i66;
                                                i14 = i88;
                                                zzipVar2 = zzipVar5;
                                                z = true;
                                                int i127222222 = i44;
                                                i39 = i45;
                                                i38 = i127222222;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                i45 = i86;
                                                if (i64 == 0) {
                                                    int i138 = zzga.zza;
                                                    zzib zzibVar6 = (zzib) zzhoVar2;
                                                    zzh3 = zzga.zzk(bArr, i45, zzfzVar3);
                                                    zzibVar6.zzf(zzgn.zzc(zzfzVar3.zzb));
                                                    while (zzh3 < i44) {
                                                        int zzh22 = zzga.zzh(bArr, zzh3, zzfzVar3);
                                                        if (i66 == zzfzVar3.zza) {
                                                            zzh3 = zzga.zzk(bArr, zzh22, zzfzVar3);
                                                            zzibVar6.zzf(zzgn.zzc(zzfzVar3.zzb));
                                                        } else {
                                                            unsafe = unsafe6;
                                                            i55 = zzh3;
                                                            i40 = i66;
                                                            i14 = i88;
                                                            zzipVar2 = zzipVar5;
                                                            z = true;
                                                            int i1272222222 = i44;
                                                            i39 = i45;
                                                            i38 = i1272222222;
                                                            if (i55 == i39) {
                                                            }
                                                        }
                                                    }
                                                    unsafe = unsafe6;
                                                    i55 = zzh3;
                                                    i40 = i66;
                                                    i14 = i88;
                                                    zzipVar2 = zzipVar5;
                                                    z = true;
                                                    int i12722222222 = i44;
                                                    i39 = i45;
                                                    i38 = i12722222222;
                                                    if (i55 == i39) {
                                                    }
                                                }
                                                unsafe = unsafe6;
                                                i40 = i66;
                                                i14 = i88;
                                                zzipVar2 = zzipVar5;
                                                z = true;
                                                int i128222 = i44;
                                                i39 = i45;
                                                i38 = i128222;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                        default:
                                            if (i64 == 3) {
                                                int i139 = (i66 & (-8)) | 4;
                                                zzix zzv = zzipVar5.zzv(i88);
                                                int zzc = zzga.zzc(zzv, bArr, i86, i2, i139, zzfzVar);
                                                zzhoVar2.add(zzfzVar3.zzc);
                                                for (int i140 = i2; zzc < i140; i140 = i140) {
                                                    int zzh23 = zzga.zzh(bArr, zzc, zzfzVar3);
                                                    if (i66 == zzfzVar3.zza) {
                                                        zzc = zzga.zzc(zzv, bArr, zzh23, i2, i139, zzfzVar);
                                                        zzhoVar2.add(zzfzVar3.zzc);
                                                    } else {
                                                        unsafe = unsafe6;
                                                        i55 = zzc;
                                                        i40 = i66;
                                                        i38 = i140;
                                                        i39 = i86;
                                                        i14 = i88;
                                                        zzipVar2 = zzipVar5;
                                                        z = true;
                                                        if (i55 == i39) {
                                                        }
                                                    }
                                                }
                                                unsafe = unsafe6;
                                                i55 = zzc;
                                                i40 = i66;
                                                i38 = i140;
                                                i39 = i86;
                                                i14 = i88;
                                                zzipVar2 = zzipVar5;
                                                z = true;
                                                if (i55 == i39) {
                                                }
                                            } else {
                                                unsafe = unsafe6;
                                                i38 = i2;
                                                i40 = i66;
                                                i39 = i86;
                                                i14 = i88;
                                                zzipVar2 = zzipVar5;
                                                z = true;
                                                i55 = i39;
                                                if (i55 == i39) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    i28 = i66;
                                    unsafe = unsafe6;
                                    i29 = i86;
                                    i12 = i87;
                                    i14 = i88;
                                    zzipVar2 = zzipVar5;
                                    if (zzr != 50) {
                                        Unsafe unsafe8 = zzb;
                                        long j3 = iArr[i14 + 2] & 1048575;
                                        switch (zzr) {
                                            case 51:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 1) {
                                                    i33 = i32 + 8;
                                                    unsafe8.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr, i32))));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    if (i33 != i32) {
                                                        i50 = i2;
                                                        i51 = i3;
                                                        i56 = i12;
                                                        zzfzVar4 = zzfzVar2;
                                                        i57 = i31;
                                                        zzipVar5 = zzipVar;
                                                        i52 = i11;
                                                        i53 = 0;
                                                        i54 = -1;
                                                        unsafe3 = unsafe;
                                                        i59 = i30;
                                                        i55 = i33;
                                                        break;
                                                    } else {
                                                        i6 = i3;
                                                        i16 = i33;
                                                        i14 = i31;
                                                        i9 = i30;
                                                        i58 = i90;
                                                        i60 = i27;
                                                        break;
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                            case 52:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 5) {
                                                    i33 = i32 + 4;
                                                    unsafe8.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr, i32))));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 0) {
                                                    i33 = zzga.zzk(bArr, i32, zzfzVar2);
                                                    unsafe8.putObject(obj, j, Long.valueOf(zzfzVar2.zzb));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 0) {
                                                    i33 = zzga.zzh(bArr, i32, zzfzVar2);
                                                    unsafe8.putObject(obj, j, Integer.valueOf(zzfzVar2.zza));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 1) {
                                                    i33 = i32 + 8;
                                                    unsafe8.putObject(obj, j, Long.valueOf(zzga.zzn(bArr, i32)));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 5) {
                                                    i33 = i32 + 4;
                                                    unsafe8.putObject(obj, j, Integer.valueOf(zzga.zzb(bArr, i32)));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 58:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 0) {
                                                    i33 = zzga.zzk(bArr, i32, zzfzVar2);
                                                    unsafe8.putObject(obj, j, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 59:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 2) {
                                                    int zzh24 = zzga.zzh(bArr, i32, zzfzVar2);
                                                    int i141 = zzfzVar2.zza;
                                                    if (i141 == 0) {
                                                        unsafe8.putObject(obj, j, "");
                                                    } else {
                                                        int i142 = zzh24 + i141;
                                                        if ((i65 & 536870912) != 0 && !zzjt.zzd(bArr, zzh24, i142)) {
                                                            throw new zzhr(str);
                                                        }
                                                        unsafe8.putObject(obj, j, new String(bArr, zzh24, i141, zzhp.zza));
                                                        zzh24 = i142;
                                                    }
                                                    unsafe8.putInt(obj, j3, i12);
                                                    i33 = zzh24;
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 60:
                                                zzipVar3 = zzipVar2;
                                                i34 = i14;
                                                zzfzVar2 = zzfzVar3;
                                                i35 = i28;
                                                i36 = i29;
                                                if (i64 == 2) {
                                                    Object zzy = zzipVar3.zzy(obj, i12, i34);
                                                    i32 = i36;
                                                    zzipVar = zzipVar3;
                                                    i11 = 3;
                                                    i31 = i34;
                                                    i30 = i35;
                                                    int zzm2 = zzga.zzm(zzy, zzipVar3.zzv(i34), bArr, i32, i2, zzfzVar);
                                                    zzipVar.zzG(obj, i12, i31, zzy);
                                                    i33 = zzm2;
                                                    if (i33 != i32) {
                                                    }
                                                } else {
                                                    i32 = i36;
                                                    i31 = i34;
                                                    i30 = i35;
                                                    i11 = 3;
                                                    zzipVar = zzipVar3;
                                                    i33 = i32;
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                zzipVar3 = zzipVar2;
                                                i34 = i14;
                                                zzfzVar2 = zzfzVar3;
                                                i35 = i28;
                                                i36 = i29;
                                                if (i64 == 2) {
                                                    zza2 = zzga.zza(bArr, i36, zzfzVar2);
                                                    unsafe8.putObject(obj, j, zzfzVar2.zzc);
                                                    unsafe8.putInt(obj, j3, i12);
                                                    i32 = i36;
                                                    i31 = i34;
                                                    i33 = zza2;
                                                    i30 = i35;
                                                    i11 = 3;
                                                    zzipVar = zzipVar3;
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i32 = i36;
                                                i31 = i34;
                                                i30 = i35;
                                                i11 = 3;
                                                zzipVar = zzipVar3;
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 63:
                                                i37 = i28;
                                                zzipVar3 = zzipVar2;
                                                i34 = i14;
                                                i36 = i29;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 0) {
                                                    zza2 = zzga.zzh(bArr, i36, zzfzVar2);
                                                    int i143 = zzfzVar2.zza;
                                                    zzhm zzu3 = zzipVar3.zzu(i34);
                                                    if (zzu3 == null || zzu3.zza(i143)) {
                                                        i35 = i37;
                                                        unsafe8.putObject(obj, j, Integer.valueOf(i143));
                                                        unsafe8.putInt(obj, j3, i12);
                                                    } else {
                                                        i35 = i37;
                                                        zzd(obj).zzj(i35, Long.valueOf(i143));
                                                    }
                                                    i32 = i36;
                                                    i31 = i34;
                                                    i33 = zza2;
                                                    i30 = i35;
                                                    i11 = 3;
                                                    zzipVar = zzipVar3;
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i32 = i36;
                                                zzipVar = zzipVar3;
                                                i31 = i34;
                                                i30 = i37;
                                                i11 = 3;
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 66:
                                                i37 = i28;
                                                zzipVar3 = zzipVar2;
                                                i34 = i14;
                                                i36 = i29;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 0) {
                                                    zzh = zzga.zzh(bArr, i36, zzfzVar2);
                                                    unsafe8.putObject(obj, j, Integer.valueOf(zzgn.zzb(zzfzVar2.zza)));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    i32 = i36;
                                                    zzipVar = zzipVar3;
                                                    i31 = i34;
                                                    i33 = zzh;
                                                    i30 = i37;
                                                    i11 = 3;
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i32 = i36;
                                                zzipVar = zzipVar3;
                                                i31 = i34;
                                                i30 = i37;
                                                i11 = 3;
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 67:
                                                i37 = i28;
                                                zzipVar3 = zzipVar2;
                                                i34 = i14;
                                                i36 = i29;
                                                zzfzVar2 = zzfzVar3;
                                                if (i64 == 0) {
                                                    zzh = zzga.zzk(bArr, i36, zzfzVar2);
                                                    unsafe8.putObject(obj, j, Long.valueOf(zzgn.zzc(zzfzVar2.zzb)));
                                                    unsafe8.putInt(obj, j3, i12);
                                                    i32 = i36;
                                                    zzipVar = zzipVar3;
                                                    i31 = i34;
                                                    i33 = zzh;
                                                    i30 = i37;
                                                    i11 = 3;
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                i32 = i36;
                                                zzipVar = zzipVar3;
                                                i31 = i34;
                                                i30 = i37;
                                                i11 = 3;
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                            case 68:
                                                if (i64 == 3) {
                                                    Object zzy2 = zzipVar2.zzy(obj, i12, i14);
                                                    int zzl = zzga.zzl(zzy2, zzipVar2.zzv(i14), bArr, i29, i2, (i28 & (-8)) | 4, zzfzVar);
                                                    zzipVar2.zzG(obj, i12, i14, zzy2);
                                                    zzfzVar2 = zzfzVar3;
                                                    i32 = i29;
                                                    zzipVar = zzipVar2;
                                                    i31 = i14;
                                                    i33 = zzl;
                                                    i30 = i28;
                                                    i11 = 3;
                                                    i12 = i12;
                                                    if (i33 != i32) {
                                                    }
                                                } else {
                                                    i11 = 3;
                                                    i31 = i14;
                                                    i32 = i29;
                                                    i30 = i28;
                                                    zzipVar = zzipVar2;
                                                    zzfzVar2 = zzfzVar3;
                                                    i33 = i32;
                                                    if (i33 != i32) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i30 = i28;
                                                i31 = i14;
                                                i32 = i29;
                                                i11 = 3;
                                                zzipVar = zzipVar2;
                                                zzfzVar2 = zzfzVar3;
                                                i33 = i32;
                                                if (i33 != i32) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i64 == 2) {
                                            Unsafe unsafe9 = zzb;
                                            Object zzw = zzipVar2.zzw(i14);
                                            Object object = unsafe9.getObject(obj, j);
                                            if (!((zzig) object).zze()) {
                                                zzig zzb2 = zzig.zza().zzb();
                                                zzih.zza(zzb2, object);
                                                unsafe9.putObject(obj, j, zzb2);
                                            }
                                            throw null;
                                        }
                                        i6 = i3;
                                        i9 = i28;
                                        i16 = i29;
                                        i11 = 3;
                                        zzfz zzfzVar62 = zzfzVar3;
                                        zzipVar = zzipVar2;
                                        zzfzVar2 = zzfzVar62;
                                        int i962 = i27;
                                        i58 = i90;
                                        i60 = i962;
                                    }
                                }
                                int i144 = i27;
                                i58 = i90;
                                i60 = i144;
                            } else if (i64 == 2) {
                                zzho zzhoVar3 = (zzho) unsafe6.getObject(obj, j);
                                if (!zzhoVar3.zzc()) {
                                    int size3 = zzhoVar3.size();
                                    zzhoVar3 = zzhoVar3.zzd(size3 == 0 ? 10 : size3 + size3);
                                    unsafe6.putObject(obj, j, zzhoVar3);
                                }
                                i27 = i89;
                                i55 = zzga.zze(zzipVar5.zzv(i88), i66, bArr, i86, i2, zzhoVar3, zzfzVar);
                                i57 = i88;
                                i59 = i66;
                                i52 = 3;
                                unsafe3 = unsafe6;
                                i53 = 0;
                                i54 = -1;
                                i56 = i87;
                                i50 = i2;
                                i51 = i3;
                                zzfzVar4 = zzfzVar5;
                                int i1442 = i27;
                                i58 = i90;
                                i60 = i1442;
                            } else {
                                i27 = i89;
                                unsafe = unsafe6;
                                i14 = i88;
                                i29 = i86;
                                i28 = i66;
                                i12 = i87;
                                zzfzVar3 = zzfzVar5;
                                zzipVar2 = zzipVar5;
                                i6 = i3;
                                i9 = i28;
                                i16 = i29;
                                i11 = 3;
                                zzfz zzfzVar622 = zzfzVar3;
                                zzipVar = zzipVar2;
                                zzfzVar2 = zzfzVar622;
                                int i9622 = i27;
                                i58 = i90;
                                i60 = i9622;
                            }
                        }
                    }
                    if (i9 == i6 || i6 == 0) {
                        if (zzipVar.zzh) {
                            zzgw zzgwVar = zzfzVar2.zzd;
                            int i145 = zzgw.zzb;
                            int i146 = zziu.zza;
                            if (zzgwVar != zzgw.zza) {
                                zzim zzimVar = zzipVar.zzg;
                                int i147 = zzga.zza;
                                if (zzgwVar.zzb(zzimVar, i12) != null) {
                                    throw null;
                                }
                                i17 = i2;
                                zzg = zzga.zzg(i9, bArr, i16, i2, zzd(obj), zzfzVar);
                                i51 = i6;
                                i59 = i9;
                                zzfzVar4 = zzfzVar2;
                                i57 = i14;
                                i50 = i17;
                                zzipVar5 = zzipVar;
                                i52 = i11;
                                i53 = i15;
                                i54 = i13;
                                unsafe3 = unsafe;
                                i56 = i12;
                                i55 = zzg;
                            }
                        }
                        i17 = i2;
                        zzg = zzga.zzg(i9, bArr, i16, i2, zzd(obj), zzfzVar);
                        i51 = i6;
                        i59 = i9;
                        zzfzVar4 = zzfzVar2;
                        i57 = i14;
                        i50 = i17;
                        zzipVar5 = zzipVar;
                        i52 = i11;
                        i53 = i15;
                        i54 = i13;
                        unsafe3 = unsafe;
                        i56 = i12;
                        i55 = zzg;
                    } else {
                        i4 = i2;
                        i55 = i16;
                        i8 = i60;
                        i7 = i58;
                        i5 = 1048575;
                    }
                } else {
                    zzq = zzipVar5.zzq(i63, i53);
                }
                i10 = zzq;
                if (i10 != i54) {
                }
                if (i9 == i6) {
                }
                if (zzipVar.zzh) {
                }
                i17 = i2;
                zzg = zzga.zzg(i9, bArr, i16, i2, zzd(obj), zzfzVar);
                i51 = i6;
                i59 = i9;
                zzfzVar4 = zzfzVar2;
                i57 = i14;
                i50 = i17;
                zzipVar5 = zzipVar;
                i52 = i11;
                i53 = i15;
                i54 = i13;
                unsafe3 = unsafe;
                i56 = i12;
                i55 = zzg;
            } else {
                i4 = i50;
                unsafe = unsafe3;
                i5 = 1048575;
                zzipVar = zzipVar5;
                i6 = i51;
                i7 = i58;
                i8 = i60;
                i9 = i59;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzhk) {
                zzhk zzhkVar = (zzhk) obj;
                zzhkVar.zzy(Integer.MAX_VALUE);
                zzhkVar.zza = 0;
                zzhkVar.zzw();
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
                                ((zzho) zzjq.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
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

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzjq.zzo(obj, j, zzjq.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzjq.zzp(obj, j, zzjq.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzjq.zzm(obj, j, zzjq.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
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
                    zzho zzhoVar = (zzho) zzjq.zzf(obj, j);
                    zzho zzhoVar2 = (zzho) zzjq.zzf(obj2, j);
                    int size = zzhoVar.size();
                    int size2 = zzhoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVar.zzc()) {
                            zzhoVar = zzhoVar.zzd(size2 + size);
                        }
                        zzhoVar.addAll(zzhoVar2);
                    }
                    if (size > 0) {
                        zzhoVar2 = zzhoVar;
                    }
                    zzjq.zzs(obj, j, zzhoVar2);
                    break;
                case 50:
                    int i4 = zziz.zza;
                    zzjq.zzs(obj, j, zzih.zza(zzjq.zzf(obj, j), zzjq.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
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
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzfzVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:238:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr2;
        boolean z;
        ?? r9 = 1;
        if (this.zzh) {
            zzhb zzhbVar = ((zzhh) obj).zzb;
            if (!zzhbVar.zza.isEmpty()) {
                entry = (Map.Entry) zzhbVar.zze().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i6 = 1048575;
                int i7 = 1048575;
                int i8 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzs = zzs(i);
                    int[] iArr3 = this.zzc;
                    int zzr = zzr(zzs);
                    int i9 = iArr3[i];
                    if (zzr <= 17) {
                        int i10 = iArr3[i + 2];
                        int i11 = i10 & i6;
                        if (i11 != i7) {
                            i8 = i11 == i6 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        i2 = i7;
                        i3 = i8;
                        i4 = r9 << (i10 >>> 20);
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
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzf(i9, zzjq.zza(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 1:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzo(i9, zzjq.zzb(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 2:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzt(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 3:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzK(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 4:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzr(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 5:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzm(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 6:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzk(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 7:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzb(i9, zzjq.zzw(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 8:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzO(i9, unsafe.getObject(obj, j), zzjwVar);
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 9:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzv(i9, unsafe.getObject(obj, j), zzv(i5));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 10:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzd(i9, (zzgk) unsafe.getObject(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 11:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzI(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 12:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzi(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 13:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzx(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 14:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzz(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 15:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzB(i9, unsafe.getInt(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 16:
                            i5 = i;
                            iArr2 = iArr;
                            if (zzJ(obj, i5, i2, i3, i4)) {
                                zzjwVar.zzD(i9, unsafe.getLong(obj, j));
                            }
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 17:
                            i5 = i;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzjwVar.zzq(i9, unsafe.getObject(obj, j), zzv(i5));
                            }
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 18:
                            z = false;
                            zziz.zzr(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 19:
                            z = false;
                            zziz.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 20:
                            z = false;
                            zziz.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 21:
                            z = false;
                            zziz.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 22:
                            z = false;
                            zziz.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 23:
                            z = false;
                            zziz.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 24:
                            z = false;
                            zziz.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 25:
                            z = false;
                            zziz.zzq(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 26:
                            int i12 = this.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i13 = zziz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzjwVar.zzH(i12, list);
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 27:
                            int i14 = this.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzix zzv = zzv(i);
                            int i15 = zziz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i16 = 0; i16 < list2.size(); i16 += r9) {
                                    ((zzgs) zzjwVar).zzv(i14, list2.get(i16), zzv);
                                }
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 28:
                            int i17 = this.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i18 = zziz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzjwVar.zze(i17, list3);
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 29:
                            z = false;
                            zziz.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 30:
                            z = false;
                            zziz.zzs(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 31:
                            z = false;
                            zziz.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 32:
                            z = false;
                            zziz.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 33:
                            z = false;
                            zziz.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 34:
                            z = false;
                            zziz.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 35:
                            zziz.zzr(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 36:
                            zziz.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 37:
                            zziz.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 38:
                            zziz.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 39:
                            zziz.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 40:
                            zziz.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 41:
                            zziz.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 42:
                            zziz.zzq(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 43:
                            zziz.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 44:
                            zziz.zzs(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 45:
                            zziz.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 46:
                            zziz.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 47:
                            zziz.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 48:
                            zziz.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, r9);
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 49:
                            int i19 = this.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzix zzv2 = zzv(i);
                            int i20 = zziz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i21 = 0; i21 < list4.size(); i21 += r9) {
                                    ((zzgs) zzjwVar).zzq(i19, list4.get(i21), zzv2);
                                }
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 51:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzf(i9, zzm(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 52:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzo(i9, zzn(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 53:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzt(i9, zzt(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 54:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzK(i9, zzt(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 55:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzr(i9, zzo(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 56:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzm(i9, zzt(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 57:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzk(i9, zzo(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 58:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzb(i9, zzN(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 59:
                            if (zzM(obj, i9, i)) {
                                zzO(i9, unsafe.getObject(obj, j), zzjwVar);
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 60:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzv(i9, unsafe.getObject(obj, j), zzv(i));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 61:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzd(i9, (zzgk) unsafe.getObject(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 62:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzI(i9, zzo(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 63:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzi(i9, zzo(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 64:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzx(i9, zzo(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 65:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzz(i9, zzt(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 66:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzB(i9, zzo(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 67:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzD(i9, zzt(obj, j));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        case 68:
                            if (zzM(obj, i9, i)) {
                                zzjwVar.zzq(i9, unsafe.getObject(obj, j), zzv(i));
                            }
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                        default:
                            i5 = i;
                            iArr2 = iArr;
                            i = i5 + 3;
                            i7 = i2;
                            i8 = i3;
                            iArr = iArr2;
                            r9 = 1;
                            i6 = 1048575;
                    }
                }
                if (entry != null) {
                    ((zzhk) obj).zzc.zzl(zzjwVar);
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
        if (entry != null) {
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzjq.zza(obj, j)) == Double.doubleToLongBits(zzjq.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzjq.zzb(obj, j)) == Float.floatToIntBits(zzjq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzjq.zzw(obj, j) == zzjq.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
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
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
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
                    if (zzjq.zzc(obj, zzp) == zzjq.zzc(obj2, zzp) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
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
            int i8 = this.zzc[i6 + 2];
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
                        if (zzr == 50 && !((zzig) zzjq.zzf(obj, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzjq.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzix zzv = zzv(i6);
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
        return !this.zzh || ((zzhh) obj).zzb.zzh();
    }
}
