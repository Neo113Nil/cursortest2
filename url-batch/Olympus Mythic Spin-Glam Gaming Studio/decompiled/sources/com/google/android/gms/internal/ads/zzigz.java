package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
final class zzigz<T> implements zziho<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziih.zzn();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzigw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zziia zzm;
    private final zziex zzn;

    private zzigz(int[] iArr, Object[] objArr, int i, int i2, zzigw zzigwVar, boolean z, int[] iArr2, int i3, int i4, zzihc zzihcVar, zzigi zzigiVar, zziia zziiaVar, zziex zziexVar, zzigr zzigrVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzigwVar instanceof zzifm;
        boolean z2 = false;
        if (zziexVar != null && (zzigwVar instanceof zzifi)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zziiaVar;
        this.zzn = zziexVar;
        this.zzg = zzigwVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzifm) {
            return ((zzifm) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int zzG(Object obj, long j) {
        return ((Integer) zziih.zzl(obj, j)).intValue();
    }

    private static long zzH(Object obj, long j) {
        return ((Long) zziih.zzl(obj, j)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i) {
        return zzK(obj, i) == zzK(obj2, i);
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzK(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzK(Object obj, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (zziih.zzb(obj, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziih.zzj(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziih.zzh(obj, j2)) != 0;
            case 2:
                return zziih.zzd(obj, j2) != 0;
            case 3:
                return zziih.zzd(obj, j2) != 0;
            case 4:
                return zziih.zzb(obj, j2) != 0;
            case 5:
                return zziih.zzd(obj, j2) != 0;
            case 6:
                return zziih.zzb(obj, j2) != 0;
            case 7:
                return zziih.zzf(obj, j2);
            case 8:
                Object zzl = zziih.zzl(obj, j2);
                return zzl instanceof String ? !((String) zzl).isEmpty() : zzl instanceof zziei ? !zziei.zza.equals(zzl) : zzR();
            case 9:
                return zziih.zzl(obj, j2) != null;
            case 10:
                return !zziei.zza.equals(zziih.zzl(obj, j2));
            case 11:
                return zziih.zzb(obj, j2) != 0;
            case 12:
                return zziih.zzb(obj, j2) != 0;
            case 13:
                return zziih.zzb(obj, j2) != 0;
            case 14:
                return zziih.zzd(obj, j2) != 0;
            case 15:
                return zziih.zzb(obj, j2) != 0;
            case 16:
                return zziih.zzd(obj, j2) != 0;
            case 17:
                return zziih.zzl(obj, j2) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        zziih.zzc(obj, j, (1 << (zzB >>> 20)) | zziih.zzb(obj, j));
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zziih.zzb(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        return zziih.zzb(obj, zzB) == zziih.zzb(obj2, zzB);
    }

    private final void zzO(Object obj, int i, int i2) {
        zziih.zzc(obj, zzB(i2) & 1048575, i);
    }

    private final int zzP(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzQ(int i, int i2) {
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

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final int zzS(byte[] bArr, int i, int i2, zziin zziinVar, Class cls, zzidw zzidwVar) throws IOException {
        int i3;
        zziin zziinVar2 = zziin.zza;
        switch (zziinVar.ordinal()) {
            case 0:
                i3 = i + 8;
                zzidwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzidx.zze(bArr, i)));
                break;
            case 1:
                i3 = i + 4;
                zzidwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzidx.zzd(bArr, i)));
                break;
            case 2:
            case 3:
                int zzc = zzidx.zzc(bArr, i, zzidwVar);
                zzidwVar.zzc = Long.valueOf(zzidwVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zzidx.zza(bArr, i, zzidwVar);
                zzidwVar.zzc = Integer.valueOf(zzidwVar.zza);
                return zza2;
            case 5:
            case 15:
                i3 = i + 8;
                zzidwVar.zzc = Long.valueOf(zzidx.zze(bArr, i));
                break;
            case 6:
            case 14:
                i3 = i + 4;
                zzidwVar.zzc = Integer.valueOf(zzidx.zzd(bArr, i));
                break;
            case 7:
                int zzc2 = zzidx.zzc(bArr, i, zzidwVar);
                zzidwVar.zzc = Boolean.valueOf(zzidwVar.zzb != 0);
                return zzc2;
            case 8:
                return zzidx.zzf(bArr, i, zzidwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzidx.zzh(zzihg.zza().zzb(cls), bArr, i, i2, zzidwVar);
            case 11:
                return zzidx.zzg(bArr, i, zzidwVar);
            case 16:
                int zza3 = zzidx.zza(bArr, i, zzidwVar);
                zzidwVar.zzc = Integer.valueOf(zziem.zzM(zzidwVar.zza));
                return zza3;
            case 17:
                int zzc3 = zzidx.zzc(bArr, i, zzidwVar);
                zzidwVar.zzc = Long.valueOf(zziem.zzN(zzidwVar.zzb));
                return zzc3;
        }
        return i3;
    }

    private static final void zzT(int i, Object obj, zziip zziipVar) throws IOException {
        if (obj instanceof String) {
            zziipVar.zzm(i, (String) obj);
        } else {
            zziipVar.zzn(i, (zziei) obj);
        }
    }

    static zziib zzh(Object obj) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        if (zziibVar != zziib.zza()) {
            return zziibVar;
        }
        zziib zzb2 = zziib.zzb();
        zzifmVar.zzt = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzigz zzm(Class cls, zzigt zzigtVar, zzihc zzihcVar, zzigi zzigiVar, zziia zziiaVar, zziex zziexVar, zzigr zzigrVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char charAt3;
        int i8;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzihi zzihiVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        Field zzn;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzn2;
        Object obj2;
        Field zzn3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        if (!(zzigtVar instanceof zzihi)) {
            throw null;
        }
        zzihi zzihiVar2 = (zzihi) zzigtVar;
        String zzd = zzihiVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (zzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt14 = zzd.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i31;
        }
        if (charAt15 == 0) {
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i3 = 0;
            i2 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = zzd.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt9 = zzd.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt17 = zzd.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt8 = zzd.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt18 = zzd.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt7 = zzd.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt19 = zzd.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt6 = zzd.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt5 = zzd.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            charAt2 = zzd.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt4 = zzd.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt2 = i52 | (charAt4 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            if (zzd.charAt(i51) >= 55296) {
                while (true) {
                    i8 = i54 + 1;
                    if (zzd.charAt(i54) < 55296) {
                        break;
                    }
                    i54 = i8;
                }
                i54 = i8;
            }
            int i55 = i54 + 1;
            int charAt20 = zzd.charAt(i54);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt3 = zzd.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt20 = i56 | (charAt3 << i57);
                i55 = i7;
            }
            int i58 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt20 + charAt2 + charAt16];
            i2 = charAt20;
            i3 = charAt19;
            i4 = charAt16;
            i33 = i55;
            i5 = charAt18;
            i6 = i58;
            iArr = iArr2;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzihiVar2.zze();
        Class<?> cls2 = zzihiVar2.zzb().getClass();
        int i59 = i2 + charAt2;
        int i60 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i60];
        int i61 = i2;
        int i62 = i59;
        int i63 = 0;
        int i64 = 0;
        while (i33 < length) {
            int i65 = i33 + 1;
            int charAt21 = zzd.charAt(i33);
            if (charAt21 >= c) {
                int i66 = charAt21 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i30 = i67 + 1;
                    charAt13 = zzd.charAt(i67);
                    if (charAt13 < c) {
                        break;
                    }
                    i66 |= (charAt13 & 8191) << i68;
                    i68 += 13;
                    i67 = i30;
                }
                charAt21 = i66 | (charAt13 << i68);
                i15 = i30;
            } else {
                i15 = i65;
            }
            int i69 = i15 + 1;
            int charAt22 = zzd.charAt(i15);
            if (charAt22 >= c) {
                int i70 = charAt22 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i29 = i71 + 1;
                    charAt12 = zzd.charAt(i71);
                    if (charAt12 < c) {
                        break;
                    }
                    i70 |= (charAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i29;
                }
                charAt22 = i70 | (charAt12 << i72);
                i16 = i29;
            } else {
                i16 = i69;
            }
            if ((charAt22 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i73 = charAt22 & 255;
            int i74 = length;
            int i75 = charAt22 & 2048;
            int i76 = i3;
            if (i73 >= 51) {
                int i77 = i16 + 1;
                int charAt23 = zzd.charAt(i16);
                if (charAt23 >= 55296) {
                    int i78 = charAt23 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        charAt11 = zzd.charAt(i79);
                        i17 = i5;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i78 |= (charAt11 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        i5 = i17;
                    }
                    charAt23 = i78 | (charAt11 << i80);
                    i26 = i28;
                } else {
                    i17 = i5;
                    i26 = i77;
                }
                int i81 = i73 - 51;
                int i82 = i26;
                if (i81 == 9 || i81 == 17) {
                    i27 = i6 + 1;
                    int i83 = i64 / 3;
                    objArr[i83 + i83 + 1] = zze[i6];
                } else {
                    if (i81 == 12) {
                        if (zzihiVar2.zzc() == 1 || i75 != 0) {
                            i27 = i6 + 1;
                            int i84 = i64 / 3;
                            objArr[i84 + i84 + 1] = zze[i6];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt23 + charAt23;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzn2 = zzn(cls2, (String) obj);
                        zze[i85] = zzn2;
                        iArr[i62] = i64;
                        i62++;
                    } else {
                        zzn2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzn2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    int i87 = i75;
                    if (obj2 instanceof Field) {
                        zzn3 = zzn(cls2, (String) obj2);
                        zze[i86] = zzn3;
                    } else {
                        zzn3 = (Field) obj2;
                    }
                    i21 = objectFieldOffset2;
                    i18 = i6;
                    i75 = i87;
                    zzihiVar = zzihiVar2;
                    i20 = (int) unsafe.objectFieldOffset(zzn3);
                    i16 = i82;
                    i22 = 0;
                    i19 = charAt21;
                    str = zzd;
                }
                i6 = i27;
                int i852 = charAt23 + charAt23;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzn2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                int i872 = i75;
                if (obj2 instanceof Field) {
                }
                i21 = objectFieldOffset22;
                i18 = i6;
                i75 = i872;
                zzihiVar = zzihiVar2;
                i20 = (int) unsafe.objectFieldOffset(zzn3);
                i16 = i82;
                i22 = 0;
                i19 = charAt21;
                str = zzd;
            } else {
                i17 = i5;
                i18 = i6 + 1;
                Field zzn4 = zzn(cls2, (String) zze[i6]);
                i19 = charAt21;
                if (i73 == 9 || i73 == 17) {
                    zzihiVar = zzihiVar2;
                    int i88 = i64 / 3;
                    objArr[i88 + i88 + 1] = zzn4.getType();
                } else {
                    if (i73 == 27) {
                        zzihiVar = zzihiVar2;
                        i24 = 1;
                        i25 = i6 + 2;
                    } else if (i73 == 49) {
                        i25 = i6 + 2;
                        zzihiVar = zzihiVar2;
                        i24 = 1;
                    } else {
                        if (i73 == 12 || i73 == 30 || i73 == 44) {
                            zzihiVar = zzihiVar2;
                            if (zzihiVar2.zzc() == 1 || i75 != 0) {
                                i25 = i6 + 2;
                                int i89 = i64 / 3;
                                objArr[i89 + i89 + 1] = zze[i18];
                                str = zzd;
                                i18 = i25;
                            } else {
                                str = zzd;
                                i75 = 0;
                            }
                        } else if (i73 == 50) {
                            int i90 = i6 + 2;
                            int i91 = i61 + 1;
                            iArr[i61] = i64;
                            int i92 = i64 / 3;
                            int i93 = i92 + i92;
                            objArr[i93] = zze[i18];
                            if (i75 != 0) {
                                i18 = i6 + 3;
                                objArr[i93 + 1] = zze[i90];
                                str = zzd;
                                i61 = i91;
                                zzihiVar = zzihiVar2;
                            } else {
                                i18 = i90;
                                i61 = i91;
                                i75 = 0;
                                zzihiVar = zzihiVar2;
                            }
                        } else {
                            zzihiVar = zzihiVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                        i20 = 1048575;
                        if ((charAt22 & 4096) != 0 || i73 > 17) {
                            i21 = objectFieldOffset;
                            i22 = 0;
                        } else {
                            int i94 = i16 + 1;
                            int charAt24 = str.charAt(i16);
                            if (charAt24 >= 55296) {
                                int i95 = charAt24 & 8191;
                                int i96 = 13;
                                while (true) {
                                    i23 = i94 + 1;
                                    charAt10 = str.charAt(i94);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i95 |= (charAt10 & 8191) << i96;
                                    i96 += 13;
                                    i94 = i23;
                                }
                                charAt24 = i95 | (charAt10 << i96);
                                i94 = i23;
                            }
                            int i97 = i4 + i4 + (charAt24 / 32);
                            Object obj3 = zze[i97];
                            i21 = objectFieldOffset;
                            if (obj3 instanceof Field) {
                                zzn = (Field) obj3;
                            } else {
                                zzn = zzn(cls2, (String) obj3);
                                zze[i97] = zzn;
                            }
                            int i98 = i94;
                            i20 = (int) unsafe.objectFieldOffset(zzn);
                            i22 = charAt24 % 32;
                            i16 = i98;
                        }
                    }
                    int i99 = i64 / 3;
                    objArr[i99 + i99 + i24] = zze[i18];
                    str = zzd;
                    i18 = i25;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                    i20 = 1048575;
                    if ((charAt22 & 4096) != 0) {
                    }
                    i21 = objectFieldOffset;
                    i22 = 0;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                i20 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                i21 = objectFieldOffset;
                i22 = 0;
            }
            int i100 = i64 + 1;
            iArr3[i64] = i19;
            int i101 = i64 + 2;
            Class<?> cls3 = cls2;
            iArr3[i100] = (i75 != 0 ? Integer.MIN_VALUE : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & 256) != 0 ? 268435456 : 0) | (i73 << 20) | i21;
            i64 += 3;
            iArr3[i101] = (i22 << 20) | i20;
            zzd = str;
            i33 = i16;
            i6 = i18;
            length = i74;
            i3 = i76;
            cls2 = cls3;
            zzihiVar2 = zzihiVar;
            i5 = i17;
            c = 55296;
        }
        return new zzigz(iArr3, objArr, i5, i3, zzihiVar2.zzb(), false, iArr, i2, i59, zzihcVar, zzigiVar, zziiaVar, zziexVar, zzigrVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzK(obj2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zziho zzq = zzq(i);
            if (!zzK(obj, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zziho zzq = zzq(i);
            if (!zzM(obj, i2, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final zziho zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zziho zzihoVar = (zziho) objArr[i3];
        if (zzihoVar != null) {
            return zzihoVar;
        }
        zziho zzb2 = zzihg.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzifs zzs(int i) {
        int i2 = i / 3;
        return (zzifs) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zziho zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzK(obj, i)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzL(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zziho zzq = zzq(i2);
        if (!zzM(obj, i, i2)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzO(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zziia zziiaVar, Object obj3) {
        zzifs zzs;
        int i2 = this.zzc[i];
        Object zzl = zziih.zzl(obj, zzA(i) & 1048575);
        if (zzl == null || (zzs = zzs(i)) == null) {
            return obj2;
        }
        zzigo zze = ((zzigp) zzr(i)).zze();
        Iterator it = ((zzigq) zzl).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziic.zzk(obj3);
                }
                int zzc = zzigp.zzc(zze, entry.getKey(), entry.getValue());
                zziei zzieiVar = zziei.zza;
                byte[] bArr = new byte[zzc];
                zzieo zzieoVar = new zzieo(bArr, 0, zzc);
                try {
                    zzigp.zzb(zzieoVar, zze, entry.getKey(), entry.getValue());
                    zziic.zzi((zziib) obj2, i2, zziee.zza(zzieoVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zziho zzihoVar) {
        return zzihoVar.zzl(zziih.zzl(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzihj zzihjVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zziih.zzm(obj, j, zzihjVar.zzn());
        } else if (this.zzi) {
            zziih.zzm(obj, j, zzihjVar.zzm());
        } else {
            zziih.zzm(obj, j, zzihjVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final Object zza() {
        return ((zzifm) this.zzg).zzbg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01bf, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.ads.zziho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzA = zzA(i);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                switch (zzC) {
                    case 0:
                        if (zzI(obj, obj2, i) && Double.doubleToLongBits(zziih.zzj(obj, j)) == Double.doubleToLongBits(zziih.zzj(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 1:
                        if (zzI(obj, obj2, i) && Float.floatToIntBits(zziih.zzh(obj, j)) == Float.floatToIntBits(zziih.zzh(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 2:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 3:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 4:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 5:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 6:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 7:
                        if (zzI(obj, obj2, i) && zziih.zzf(obj, j) == zziih.zzf(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 8:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 9:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 10:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 11:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 12:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 13:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 14:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 15:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 16:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 17:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
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
                        zzF = zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j));
                        break;
                    case 50:
                        zzF = zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j));
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
                        if (zzN(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                }
                if (!zzF) {
                    return false;
                }
            }
        }
        int i2 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i2 >= iArr.length) {
                if (!((zzifm) obj).zzt.equals(((zzifm) obj2).zzt)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzifi) obj).zza.equals(((zzifi) obj2).zza);
                }
                return true;
            }
            int i3 = iArr[i2];
            if (!zzN(obj, obj2, i3)) {
                return false;
            }
            if (!zzM(obj, 0, i3)) {
                long zzA2 = zzA(i3) & 1048575;
                if (!zzihp.zzF(zziih.zzl(obj, zzA2), zziih.zzl(obj2, zzA2))) {
                    return false;
                }
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzA = zzA(i4);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                int i5 = 37;
                switch (zzC) {
                    case 0:
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zziih.zzj(obj, j));
                        byte[] bArr = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 1:
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zziih.zzh(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    case 2:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr2 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 3:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr3 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 4:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 5:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr4 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 6:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 7:
                        i = i3 * 53;
                        floatToIntBits = zzifz.zzb(zziih.zzf(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    case 8:
                        i = i3 * 53;
                        floatToIntBits = ((String) zziih.zzl(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 9:
                        i2 = i3 * 53;
                        Object zzl = zziih.zzl(obj, j);
                        if (zzl != null) {
                            i5 = zzl.hashCode();
                        }
                        i3 = i2 + i5;
                        break;
                    case 10:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzl(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 11:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 12:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 13:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 14:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr5 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 15:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 16:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr6 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 17:
                        i2 = i3 * 53;
                        Object zzl2 = zziih.zzl(obj, j);
                        if (zzl2 != null) {
                            i5 = zzl2.hashCode();
                        }
                        i3 = i2 + i5;
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
                        floatToIntBits = zziih.zzl(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 50:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzl(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i6 >= iArr.length) {
                int hashCode = (i3 * 53) + ((zzifm) obj).zzt.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzifi) obj).zza.zza.hashCode() : hashCode;
            }
            if (!zzM(obj, 0, iArr[i6])) {
                i3 = (i3 * 53) + zziih.zzl(obj, zzA(r3) & 1048575).hashCode();
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzihp.zzH(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzihp.zzG(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzk(obj, j, zziih.zzj(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 1:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzi(obj, j, zziih.zzh(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 2:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 3:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 4:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 5:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 6:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 7:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzg(obj, j, zziih.zzf(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 8:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 11:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 12:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 13:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 14:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 15:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 16:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
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
                    zzify zzifyVar = (zzify) zziih.zzl(obj, j);
                    zzify zzifyVar2 = (zzify) zziih.zzl(obj2, j);
                    int size = zzifyVar.size();
                    int size2 = zzifyVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzifyVar.zza()) {
                            zzifyVar = zzifyVar.zzh(size2 + size);
                        }
                        zzifyVar.addAll(zzifyVar2);
                    }
                    if (size > 0) {
                        zzifyVar2 = zzifyVar;
                    }
                    zziih.zzm(obj, j, zzifyVar2);
                    break;
                case 50:
                    int i4 = zzihp.zza;
                    zziih.zzm(obj, j, zzigr.zzb(zziih.zzl(obj, j), zziih.zzl(obj2, j)));
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
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
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
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260, types: [int] */
    /* JADX WARN: Type inference failed for: r0v262 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
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
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80, types: [int] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84, types: [int] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zziho
    public final int zze(Object obj) {
        int i;
        boolean z;
        ?? r5;
        int zzF;
        int zzF2;
        int zzF3;
        int zzG;
        int zzF4;
        int zzF5;
        int zzb2;
        int zzF6;
        ?? zzs;
        int size;
        int zzF7;
        int zzb3;
        int zzF8;
        int zzb4;
        int zzF9;
        ?? r3;
        ?? r1;
        ?? r0;
        int zzB;
        int zzF10;
        int zzF11;
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
                int zzi = i4 + ((zzifm) obj).zzt.zzi();
                if (!this.zzh) {
                    return zzi;
                }
                zzihu zzihuVar = ((zzifi) obj).zza.zza;
                int zzc = zzihuVar.zzc();
                int i6 = 0;
                for (int i7 = 0; i7 < zzc; i7++) {
                    Map.Entry zzd = zzihuVar.zzd(i7);
                    i6 += zzifb.zzj(((zzihr) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzihuVar.zze()) {
                    i6 += zzifb.zzj((zzifa) entry.getKey(), entry.getValue());
                }
                return zzi + i6;
            }
            int zzA = zzA(i3);
            int zzC = zzC(zzA);
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (zzC <= 17) {
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
            int i11 = zzA & i2;
            if (zzC >= zzifc.zzJ.zza()) {
                zzifc.zzW.zza();
            }
            long j = i11;
            switch (zzC) {
                case 0:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzF = zzier.zzF(i8 << 3);
                        r0 = zzF + 8;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzF2 = zzier.zzF(i8 << 3);
                        r0 = zzF2 + 4;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(j2);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(j3);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(j4);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzF = zzier.zzF(i8 << 3);
                        r0 = zzF + 8;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzF2 = zzier.zzF(i8 << 3);
                        r0 = zzF2 + 4;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzF4 = zzier.zzF(i8 << 3);
                        r0 = zzF4 + 1;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zziei) {
                            zzF5 = zzier.zzF(i12);
                            zzb2 = ((zziei) object).zzb();
                            zzF6 = zzier.zzF(zzb2);
                        } else {
                            zzF5 = zzier.zzF(i12);
                            int i13 = zziim.zza;
                            zzb2 = zziij.zzb((String) object);
                            zzF6 = zzier.zzF(zzb2);
                        }
                        r0 = zzF5 + zzF6 + zzb2;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        zziho zzq = zzq(i3);
                        int i14 = zzihp.zza;
                        zzF5 = zzier.zzF(i8 << 3);
                        zzb2 = ((zzidr) object2).zzaT(zzq);
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zziei zzieiVar = (zziei) unsafe.getObject(obj, j);
                        zzF5 = zzier.zzF(i8 << 3);
                        zzb2 = zzieiVar.zzb();
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzF(i15);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(j5);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzF2 = zzier.zzF(i8 << 3);
                        r0 = zzF2 + 4;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        zzF = zzier.zzF(i8 << 3);
                        r0 = zzF + 8;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        int i16 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzF((i16 >> 31) ^ (i16 + i16));
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG((j6 >> 63) ^ (j6 + j6));
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i3, i, z ? 1 : 0, r5)) {
                        r0 = zzihp.zzD(i8, (zzigw) unsafe.getObject(obj, j), zzq(i3));
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    r0 = zzihp.zzC(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    break;
                case 19:
                    r0 = zzihp.zzA(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzihp.zza;
                    if (list.size() != 0) {
                        zzs = zzihp.zzs(list) + (list.size() * zzier.zzF(i8 << 3));
                        i4 += zzs;
                        break;
                    }
                    zzs = z2;
                    i4 += zzs;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i18 = zzihp.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzt(list2);
                        zzF7 = zzier.zzF(i8 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    }
                    r0 = z2;
                    i4 += r0;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i19 = zzihp.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzw(list3);
                        zzF7 = zzier.zzF(i8 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    }
                    r0 = z2;
                    i4 += r0;
                case 23:
                    r0 = zzihp.zzC(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    break;
                case 24:
                    r0 = zzihp.zzA(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i20 = zzihp.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzier.zzF(i8 << 3) + 1);
                        i4 += r0;
                        break;
                    }
                    r0 = z2;
                    i4 += r0;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i21 = zzihp.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzF12 = zzier.zzF(i8 << 3) * size3;
                        if (r02 instanceof zzigh) {
                            zzigh zzighVar = (zzigh) r02;
                            zzs = zzF12;
                            for (?? r32 = z2; r32 < size3; r32++) {
                                Object zzc2 = zzighVar.zzc();
                                if (zzc2 instanceof zziei) {
                                    zzb4 = ((zziei) zzc2).zzb();
                                    zzF9 = zzier.zzF(zzb4);
                                } else {
                                    int i22 = zziim.zza;
                                    zzb4 = zziij.zzb((String) zzc2);
                                    zzF9 = zzier.zzF(zzb4);
                                }
                                zzs += zzF9 + zzb4;
                            }
                        } else {
                            zzs = zzF12;
                            for (?? r33 = z2; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zziei) {
                                    zzb3 = ((zziei) obj2).zzb();
                                    zzF8 = zzier.zzF(zzb3);
                                } else {
                                    int i23 = zziim.zza;
                                    zzb3 = zziij.zzb((String) obj2);
                                    zzF8 = zzier.zzF(zzb3);
                                }
                                zzs += zzF8 + zzb3;
                            }
                        }
                        i4 += zzs;
                        break;
                    }
                    zzs = z2;
                    i4 += zzs;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zziho zzq2 = zzq(i3);
                    int i24 = zzihp.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z2;
                    } else {
                        r3 = zzier.zzF(i8 << 3) * size4;
                        for (?? r42 = z2; r42 < size4; r42++) {
                            int zzaT = ((zzidr) r03.get(r42)).zzaT(zzq2);
                            r3 = (r3 == true ? 1 : 0) + zzier.zzF(zzaT) + zzaT;
                        }
                    }
                    i4 += r3;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i25 = zzihp.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z2;
                    } else {
                        r1 = size5 * zzier.zzF(i8 << 3);
                        for (?? r2 = z2; r2 < r04.size(); r2++) {
                            int zzb5 = ((zziei) r04.get(r2)).zzb();
                            r1 += zzier.zzF(zzb5) + zzb5;
                        }
                    }
                    i4 += r1;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i26 = zzihp.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzx(list5);
                        zzF7 = zzier.zzF(i8 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    }
                    r0 = z2;
                    i4 += r0;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i27 = zzihp.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzv(list6);
                        zzF7 = zzier.zzF(i8 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    }
                    r0 = z2;
                    i4 += r0;
                case 31:
                    r0 = zzihp.zzA(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    break;
                case 32:
                    r0 = zzihp.zzC(i8, (List) unsafe.getObject(obj, j), z2);
                    i4 += r0;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i28 = zzihp.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzy(list7);
                        zzF7 = zzier.zzF(i8 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    }
                    r0 = z2;
                    i4 += r0;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i29 = zzihp.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzu(list8);
                        zzF7 = zzier.zzF(i8 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    }
                    r0 = z2;
                    i4 += r0;
                case 35:
                    zzB = zzihp.zzB((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzB = zzihp.zzz((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzB = zzihp.zzs((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzB = zzihp.zzt((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzB = zzihp.zzw((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzB = zzihp.zzB((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzB = zzihp.zzz((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i30 = zzihp.zza;
                    zzB = list9.size();
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzB = zzihp.zzx((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzB = zzihp.zzv((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzB = zzihp.zzz((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzB = zzihp.zzB((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzB = zzihp.zzy((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzB = zzihp.zzu((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i8 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i4 += r1;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zziho zzq3 = zzq(i3);
                    int i31 = zzihp.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z2;
                    } else {
                        boolean z4 = z2;
                        r4 = z4;
                        ?? r34 = z4;
                        while (r34 < size6) {
                            int zzD = zzihp.zzD(i8, (zzigw) r05.get(r34), zzq3);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzD;
                        }
                    }
                    i4 += r4;
                    break;
                case 50:
                    zzigq zzigqVar = (zzigq) unsafe.getObject(obj, j);
                    zzigp zzigpVar = (zzigp) zzr(i3);
                    if (!zzigqVar.isEmpty()) {
                        zzs = z2;
                        for (Map.Entry entry2 : zzigqVar.entrySet()) {
                            zzs += zzigpVar.zzd(i8, entry2.getKey(), entry2.getValue());
                        }
                        i4 += zzs;
                        break;
                    }
                    zzs = z2;
                    i4 += zzs;
                case 51:
                    if (zzM(obj, i8, i3)) {
                        zzF = zzier.zzF(i8 << 3);
                        r0 = zzF + 8;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i8, i3)) {
                        zzF2 = zzier.zzF(i8 << 3);
                        r0 = zzF2 + 4;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i8, i3)) {
                        long zzH = zzH(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(zzH);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i8, i3)) {
                        long zzH2 = zzH(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(zzH2);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i8, i3)) {
                        long zzG2 = zzG(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(zzG2);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i8, i3)) {
                        zzF = zzier.zzF(i8 << 3);
                        r0 = zzF + 8;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i8, i3)) {
                        zzF2 = zzier.zzF(i8 << 3);
                        r0 = zzF2 + 4;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i8, i3)) {
                        zzF4 = zzier.zzF(i8 << 3);
                        r0 = zzF4 + 1;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i8, i3)) {
                        int i32 = i8 << 3;
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof zziei) {
                            zzF5 = zzier.zzF(i32);
                            zzb2 = ((zziei) object3).zzb();
                            zzF6 = zzier.zzF(zzb2);
                        } else {
                            zzF5 = zzier.zzF(i32);
                            int i33 = zziim.zza;
                            zzb2 = zziij.zzb((String) object3);
                            zzF6 = zzier.zzF(zzb2);
                        }
                        r0 = zzF5 + zzF6 + zzb2;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i8, i3)) {
                        Object object4 = unsafe.getObject(obj, j);
                        zziho zzq4 = zzq(i3);
                        int i34 = zzihp.zza;
                        zzF5 = zzier.zzF(i8 << 3);
                        zzb2 = ((zzidr) object4).zzaT(zzq4);
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i8, i3)) {
                        zziei zzieiVar2 = (zziei) unsafe.getObject(obj, j);
                        zzF5 = zzier.zzF(i8 << 3);
                        zzb2 = zzieiVar2.zzb();
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i8, i3)) {
                        int zzG3 = zzG(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzF(zzG3);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i8, i3)) {
                        long zzG4 = zzG(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG(zzG4);
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i8, i3)) {
                        zzF2 = zzier.zzF(i8 << 3);
                        r0 = zzF2 + 4;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i8, i3)) {
                        zzF = zzier.zzF(i8 << 3);
                        r0 = zzF + 8;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i8, i3)) {
                        int zzG5 = zzG(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzF((zzG5 >> 31) ^ (zzG5 + zzG5));
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i8, i3)) {
                        long zzH3 = zzH(obj, j);
                        zzF3 = zzier.zzF(i8 << 3);
                        zzG = zzier.zzG((zzH3 >> 63) ^ (zzH3 + zzH3));
                        r0 = zzF3 + zzG;
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i8, i3)) {
                        r0 = zzihp.zzD(i8, (zzigw) unsafe.getObject(obj, j), zzq(i3));
                        i4 += r0;
                        break;
                    } else {
                        break;
                    }
            }
            i3 += 3;
            i5 = i;
            z3 = z;
            z2 = false;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.ads.zziho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zziip zziipVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        int[] iArr2;
        Map.Entry entry3;
        boolean z;
        Map.Entry entry4;
        if (this.zzh) {
            zzifb zzifbVar = ((zzifi) obj).zza;
            if (!zzifbVar.zza.isEmpty()) {
                Iterator zzc = zzifbVar.zzc();
                entry = (Map.Entry) zzc.next();
                it = zzc;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                int i6 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzA = zzA(i);
                    int zzC = zzC(zzA);
                    int i7 = iArr[i];
                    if (zzC <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            if (i9 == i4) {
                                entry4 = entry;
                                i6 = 0;
                            } else {
                                entry4 = entry;
                                i6 = unsafe.getInt(obj, i9);
                            }
                            i5 = i9;
                        } else {
                            entry4 = entry;
                        }
                        int i10 = 1 << (i8 >>> 20);
                        i2 = i5;
                        i3 = i10;
                        entry2 = entry4;
                    } else {
                        i2 = i5;
                        entry2 = entry;
                        i3 = 0;
                    }
                    int i11 = i6;
                    while (entry2 != null && ((zzifj) entry2.getKey()).zza <= i7) {
                        this.zzn.zza(zziipVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzA & i4;
                    switch (zzC) {
                        case 0:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzf(i7, zziih.zzj(obj, j));
                                break;
                            }
                        case 1:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zze(i7, zziih.zzh(obj, j));
                                break;
                            }
                        case 2:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzc(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 3:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzh(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 4:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzi(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 5:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzj(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 6:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzk(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 7:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzl(i7, zziih.zzf(obj, j));
                                break;
                            }
                        case 8:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zzT(i7, unsafe.getObject(obj, j), zziipVar);
                                break;
                            }
                        case 9:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzr(i7, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                        case 10:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzn(i7, (zziei) unsafe.getObject(obj, j));
                                break;
                            }
                        case 11:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzo(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 12:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzg(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 13:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzb(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 14:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzd(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 15:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzp(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 16:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzq(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 17:
                            entry3 = entry2;
                            iArr2 = iArr;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzs(i7, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                        case 18:
                            z = false;
                            zzihp.zza(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 19:
                            z = false;
                            zzihp.zzb(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 20:
                            z = false;
                            zzihp.zzc(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 21:
                            z = false;
                            zzihp.zzd(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 22:
                            z = false;
                            zzihp.zzh(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 23:
                            z = false;
                            zzihp.zzf(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 24:
                            z = false;
                            zzihp.zzk(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 25:
                            z = false;
                            zzihp.zzn(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 26:
                            zzihp.zzo(iArr[i], (List) unsafe.getObject(obj, j), zziipVar);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 27:
                            zzihp.zzq(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, zzq(i));
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 28:
                            zzihp.zzp(iArr[i], (List) unsafe.getObject(obj, j), zziipVar);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 29:
                            z = false;
                            zzihp.zzi(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 30:
                            z = false;
                            zzihp.zzm(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 31:
                            z = false;
                            zzihp.zzl(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 32:
                            z = false;
                            zzihp.zzg(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 33:
                            z = false;
                            zzihp.zzj(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 34:
                            z = false;
                            zzihp.zze(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 35:
                            zzihp.zza(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 36:
                            zzihp.zzb(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 37:
                            zzihp.zzc(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 38:
                            zzihp.zzd(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 39:
                            zzihp.zzh(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 40:
                            zzihp.zzf(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 41:
                            zzihp.zzk(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 42:
                            zzihp.zzn(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 43:
                            zzihp.zzi(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 44:
                            zzihp.zzm(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 45:
                            zzihp.zzl(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 46:
                            zzihp.zzg(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 47:
                            zzihp.zzj(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 48:
                            zzihp.zze(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 49:
                            zzihp.zzr(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, zzq(i));
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zziipVar.zzM(i7, ((zzigp) zzr(i)).zze(), (zzigq) object);
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 51:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzf(i7, ((Double) zziih.zzl(obj, j)).doubleValue());
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 52:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zze(i7, ((Float) zziih.zzl(obj, j)).floatValue());
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 53:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzc(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 54:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzh(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 55:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzi(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 56:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzj(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 57:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzk(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 58:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzl(i7, ((Boolean) zziih.zzl(obj, j)).booleanValue());
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 59:
                            if (zzM(obj, i7, i)) {
                                zzT(i7, unsafe.getObject(obj, j), zziipVar);
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 60:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzr(i7, unsafe.getObject(obj, j), zzq(i));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 61:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzn(i7, (zziei) unsafe.getObject(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 62:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzo(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 63:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzg(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 64:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzb(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 65:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzd(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 66:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzp(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 67:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzq(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 68:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzs(i7, unsafe.getObject(obj, j), zzq(i));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        default:
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                    }
                    i += 3;
                    i5 = i2;
                    entry = entry3;
                    i6 = i11;
                    iArr = iArr2;
                    i4 = 1048575;
                }
                while (entry != null) {
                    this.zzn.zza(zziipVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzifm) obj).zzt.zzg(zziipVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 1048575;
        int i62 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzifm) obj).zzt.zzg(zziipVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x0528 A[LOOP:5: B:312:0x0524->B:314:0x0528, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0539  */
    @Override // com.google.android.gms.internal.ads.zziho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Object obj, zzihj zzihjVar, zziew zziewVar) throws IOException {
        int i;
        Object obj2;
        Object obj3;
        zziewVar.getClass();
        zzF(obj);
        zziia zziiaVar = this.zzm;
        Object obj4 = null;
        while (true) {
            try {
                int zzb2 = zzihjVar.zzb();
                int zzP = zzP(zzb2);
                if (zzP >= 0) {
                    int zzA = zzA(zzP);
                    try {
                    } catch (zzigd unused) {
                        if (obj4 == null) {
                            obj4 = zziic.zzk(obj);
                        }
                        if (!zziiaVar.zzh(obj4, zzihjVar, 0)) {
                            obj3 = obj4;
                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                obj3 = zzx(obj, this.zzj[i2], obj3, zziiaVar, obj);
                            }
                        }
                    }
                    switch (zzC(zzA)) {
                        case 0:
                            zziih.zzk(obj, zzA & 1048575, zzihjVar.zze());
                            zzL(obj, zzP);
                        case 1:
                            zziih.zzi(obj, zzA & 1048575, zzihjVar.zzf());
                            zzL(obj, zzP);
                        case 2:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzh());
                            zzL(obj, zzP);
                        case 3:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzg());
                            zzL(obj, zzP);
                        case 4:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzi());
                            zzL(obj, zzP);
                        case 5:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzj());
                            zzL(obj, zzP);
                        case 6:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzk());
                            zzL(obj, zzP);
                        case 7:
                            zziih.zzg(obj, zzA & 1048575, zzihjVar.zzl());
                            zzL(obj, zzP);
                        case 8:
                            zzz(obj, zzA, zzihjVar);
                            zzL(obj, zzP);
                        case 9:
                            zzigw zzigwVar = (zzigw) zzt(obj, zzP);
                            zzihjVar.zzo(zzigwVar, zzq(zzP), zziewVar);
                            zzu(obj, zzP, zzigwVar);
                        case 10:
                            zziih.zzm(obj, zzA & 1048575, zzihjVar.zzq());
                            zzL(obj, zzP);
                        case 11:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzr());
                            zzL(obj, zzP);
                        case 12:
                            int zzs = zzihjVar.zzs();
                            zzifs zzs2 = zzs(zzP);
                            if (zzs2 != null && !zzs2.zza(zzs)) {
                                obj4 = zzihp.zzJ(obj, zzb2, zzs, obj4, zziiaVar);
                            }
                            zziih.zzc(obj, zzA & 1048575, zzs);
                            zzL(obj, zzP);
                            break;
                        case 13:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzt());
                            zzL(obj, zzP);
                        case 14:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzu());
                            zzL(obj, zzP);
                        case 15:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzv());
                            zzL(obj, zzP);
                        case 16:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzw());
                            zzL(obj, zzP);
                        case 17:
                            zzigw zzigwVar2 = (zzigw) zzt(obj, zzP);
                            zzihjVar.zzp(zzigwVar2, zzq(zzP), zziewVar);
                            zzu(obj, zzP, zzigwVar2);
                        case 18:
                            zzihjVar.zzx(zzigi.zza(obj, zzA & 1048575));
                        case 19:
                            zzihjVar.zzy(zzigi.zza(obj, zzA & 1048575));
                        case 20:
                            zzihjVar.zzA(zzigi.zza(obj, zzA & 1048575));
                        case 21:
                            zzihjVar.zzz(zzigi.zza(obj, zzA & 1048575));
                        case 22:
                            zzihjVar.zzB(zzigi.zza(obj, zzA & 1048575));
                        case 23:
                            zzihjVar.zzC(zzigi.zza(obj, zzA & 1048575));
                        case 24:
                            zzihjVar.zzD(zzigi.zza(obj, zzA & 1048575));
                        case 25:
                            zzihjVar.zzE(zzigi.zza(obj, zzA & 1048575));
                        case 26:
                            if (zzD(zzA)) {
                                ((zzien) zzihjVar).zzF(zzigi.zza(obj, zzA & 1048575), true);
                            } else {
                                ((zzien) zzihjVar).zzF(zzigi.zza(obj, zzA & 1048575), false);
                            }
                        case 27:
                            zzihjVar.zzG(zzigi.zza(obj, zzA & 1048575), zzq(zzP), zziewVar);
                        case 28:
                            zzihjVar.zzI(zzigi.zza(obj, zzA & 1048575));
                        case 29:
                            zzihjVar.zzJ(zzigi.zza(obj, zzA & 1048575));
                        case 30:
                            List zza2 = zzigi.zza(obj, zzA & 1048575);
                            zzihjVar.zzK(zza2);
                            obj4 = zzihp.zzI(obj, zzb2, zza2, zzs(zzP), obj4, zziiaVar);
                        case 31:
                            zzihjVar.zzL(zzigi.zza(obj, zzA & 1048575));
                        case 32:
                            zzihjVar.zzM(zzigi.zza(obj, zzA & 1048575));
                        case 33:
                            zzihjVar.zzN(zzigi.zza(obj, zzA & 1048575));
                        case 34:
                            zzihjVar.zzO(zzigi.zza(obj, zzA & 1048575));
                        case 35:
                            zzihjVar.zzx(zzigi.zza(obj, zzA & 1048575));
                        case 36:
                            zzihjVar.zzy(zzigi.zza(obj, zzA & 1048575));
                        case 37:
                            zzihjVar.zzA(zzigi.zza(obj, zzA & 1048575));
                        case 38:
                            zzihjVar.zzz(zzigi.zza(obj, zzA & 1048575));
                        case 39:
                            zzihjVar.zzB(zzigi.zza(obj, zzA & 1048575));
                        case 40:
                            zzihjVar.zzC(zzigi.zza(obj, zzA & 1048575));
                        case 41:
                            zzihjVar.zzD(zzigi.zza(obj, zzA & 1048575));
                        case 42:
                            zzihjVar.zzE(zzigi.zza(obj, zzA & 1048575));
                        case 43:
                            zzihjVar.zzJ(zzigi.zza(obj, zzA & 1048575));
                        case 44:
                            List zza3 = zzigi.zza(obj, zzA & 1048575);
                            zzihjVar.zzK(zza3);
                            obj4 = zzihp.zzI(obj, zzb2, zza3, zzs(zzP), obj4, zziiaVar);
                        case 45:
                            zzihjVar.zzL(zzigi.zza(obj, zzA & 1048575));
                        case 46:
                            zzihjVar.zzM(zzigi.zza(obj, zzA & 1048575));
                        case 47:
                            zzihjVar.zzN(zzigi.zza(obj, zzA & 1048575));
                        case 48:
                            zzihjVar.zzO(zzigi.zza(obj, zzA & 1048575));
                        case 49:
                            zzihjVar.zzH(zzigi.zza(obj, zzA & 1048575), zzq(zzP), zziewVar);
                        case 50:
                            Object zzr = zzr(zzP);
                            long zzA2 = zzA(zzP) & 1048575;
                            Object zzl = zziih.zzl(obj, zzA2);
                            if (zzl == null) {
                                zzl = zzigq.zza().zzc();
                                zziih.zzm(obj, zzA2, zzl);
                            } else if (zzigr.zza(zzl)) {
                                Object zzc = zzigq.zza().zzc();
                                zzigr.zzb(zzc, zzl);
                                zziih.zzm(obj, zzA2, zzc);
                                zzl = zzc;
                            }
                            zzihjVar.zzP((zzigq) zzl, ((zzigp) zzr).zze(), zziewVar);
                        case 51:
                            zziih.zzm(obj, zzA & 1048575, Double.valueOf(zzihjVar.zze()));
                            zzO(obj, zzb2, zzP);
                        case 52:
                            zziih.zzm(obj, zzA & 1048575, Float.valueOf(zzihjVar.zzf()));
                            zzO(obj, zzb2, zzP);
                        case 53:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzh()));
                            zzO(obj, zzb2, zzP);
                        case 54:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzg()));
                            zzO(obj, zzb2, zzP);
                        case 55:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzi()));
                            zzO(obj, zzb2, zzP);
                        case 56:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzj()));
                            zzO(obj, zzb2, zzP);
                        case 57:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzk()));
                            zzO(obj, zzb2, zzP);
                        case 58:
                            zziih.zzm(obj, zzA & 1048575, Boolean.valueOf(zzihjVar.zzl()));
                            zzO(obj, zzb2, zzP);
                        case 59:
                            zzz(obj, zzA, zzihjVar);
                            zzO(obj, zzb2, zzP);
                        case 60:
                            zzigw zzigwVar3 = (zzigw) zzv(obj, zzb2, zzP);
                            zzihjVar.zzo(zzigwVar3, zzq(zzP), zziewVar);
                            zzw(obj, zzb2, zzP, zzigwVar3);
                        case 61:
                            zziih.zzm(obj, zzA & 1048575, zzihjVar.zzq());
                            zzO(obj, zzb2, zzP);
                        case 62:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzr()));
                            zzO(obj, zzb2, zzP);
                        case 63:
                            int zzs3 = zzihjVar.zzs();
                            zzifs zzs4 = zzs(zzP);
                            if (zzs4 != null && !zzs4.zza(zzs3)) {
                                obj4 = zzihp.zzJ(obj, zzb2, zzs3, obj4, zziiaVar);
                            }
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzs3));
                            zzO(obj, zzb2, zzP);
                            break;
                        case 64:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzt()));
                            zzO(obj, zzb2, zzP);
                        case 65:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzu()));
                            zzO(obj, zzb2, zzP);
                        case 66:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzv()));
                            zzO(obj, zzb2, zzP);
                        case 67:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzw()));
                            zzO(obj, zzb2, zzP);
                        case 68:
                            zzigw zzigwVar4 = (zzigw) zzv(obj, zzb2, zzP);
                            zzihjVar.zzp(zzigwVar4, zzq(zzP), zziewVar);
                            zzw(obj, zzb2, zzP, zzigwVar4);
                        default:
                            if (obj4 == null) {
                                obj4 = zziic.zzk(obj);
                            }
                            if (!zziiaVar.zzh(obj4, zzihjVar, 0)) {
                                obj3 = obj4;
                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                    obj3 = zzx(obj, this.zzj[i3], obj3, zziiaVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj3 = obj4;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        obj3 = zzx(obj, this.zzj[i4], obj3, zziiaVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zziewVar.zzd(this.zzg, zzb2)) != null) {
                        throw null;
                    }
                    if (obj4 == null) {
                        obj4 = zziic.zzk(obj);
                    }
                    if (!zziiaVar.zzh(obj4, zzihjVar, 0)) {
                        obj3 = obj4;
                        for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                            obj3 = zzx(obj, this.zzj[i5], obj3, zziiaVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                obj2 = obj4;
                while (i < this.zzl) {
                }
                if (obj2 != null) {
                }
                throw th;
            }
            obj2 = obj4;
            for (i = this.zzk; i < this.zzl; i++) {
                obj2 = zzx(obj, this.zzj[i], obj2, zziiaVar, obj);
            }
            if (obj2 != null) {
                ((zzifm) obj).zzt = (zziib) obj2;
            }
            throw th;
        }
        if (obj3 != null) {
            ((zzifm) obj).zzt = (zziib) obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:528:0x0b6a, code lost:
    
        throw new com.google.android.gms.internal.ads.zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0e6c, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0edb, code lost:
    
        if (r0 == 1048575) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0edd, code lost:
    
        r9.putInt(r12, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ee1, code lost:
    
        r9 = r11.zzk;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0ee8, code lost:
    
        if (r9 >= r11.zzl) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0eea, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zziib) zzx(r37, r11.zzj[r9], r3, r11.zzm, r37);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0f00, code lost:
    
        if (r3 == null) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f02, code lost:
    
        ((com.google.android.gms.internal.ads.zzifm) r12).zzt = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f07, code lost:
    
        if (r6 != 0) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0f09, code lost:
    
        if (r8 != r14) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f13, code lost:
    
        throw new com.google.android.gms.internal.ads.zzige(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0f1a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0f14, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0f16, code lost:
    
        if (r8 > r14) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0f18, code lost:
    
        if (r7 != r6) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0f20, code lost:
    
        throw new com.google.android.gms.internal.ads.zzige(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0a14 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0a29 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0e45  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0e5a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzi(Object obj, byte[] bArr, int i, int i2, int i3, zzidw zzidwVar) throws IOException {
        String str;
        Object obj2;
        int i4;
        Unsafe unsafe;
        int i5;
        zzigz<T> zzigzVar;
        int i6;
        int i7;
        int i8;
        int zzP;
        int i9;
        zzidw zzidwVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe3;
        zzigz<T> zzigzVar2;
        int zzo;
        int i17;
        int i18;
        zzidw zzidwVar3;
        Unsafe unsafe4;
        int i19;
        boolean z;
        int i20;
        int i21;
        Unsafe unsafe5;
        boolean z2;
        int i22;
        int zzg;
        String str2;
        Unsafe unsafe6;
        int i23;
        zzidw zzidwVar4;
        int i24;
        boolean z3;
        int i25;
        int i26;
        zzidw zzidwVar5;
        int i27;
        int i28;
        int zza2;
        Object obj3;
        Unsafe unsafe7;
        int i29;
        Object obj4;
        int i30;
        long j;
        int i31;
        zzidw zzidwVar6;
        Unsafe unsafe8;
        int i32;
        boolean z4;
        int i33;
        int i34;
        int i35;
        int i36;
        int zza3;
        int i37;
        int i38;
        int i39;
        char c;
        int zza4;
        Object obj5;
        int i40;
        char c2;
        int zza5;
        int zzl;
        zzigz<T> zzigzVar3 = this;
        Object obj6 = obj;
        int i41 = i2;
        int i42 = i3;
        zzidw zzidwVar7 = zzidwVar;
        int i43 = 3;
        zzF(obj);
        Unsafe unsafe9 = zzb;
        int i44 = -1;
        int i45 = i;
        int i46 = -1;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 1048575;
        while (true) {
            if (i45 < i41) {
                int i51 = i45 + 1;
                int i52 = bArr[i45];
                if (i52 < 0) {
                    i51 = zzidx.zzb(i52, bArr, i51, zzidwVar7);
                    i52 = zzidwVar7.zza;
                }
                int i53 = i52 >>> 3;
                if (i53 > i46) {
                    zzP = (i53 < zzigzVar3.zze || i53 > zzigzVar3.zzf) ? i44 : zzigzVar3.zzQ(i53, i47 / i43);
                } else {
                    zzP = zzigzVar3.zzP(i53);
                }
                i47 = zzP;
                if (i47 != i44) {
                    int i54 = i52 & 7;
                    int[] iArr = zzigzVar3.zzc;
                    int i55 = iArr[i47 + 1];
                    int zzC = zzC(i55);
                    long j2 = i55 & 1048575;
                    i49 = i52;
                    if (zzC > 17) {
                        zzidw zzidwVar8 = zzidwVar7;
                        i4 = i50;
                        Unsafe unsafe10 = unsafe9;
                        i12 = -1;
                        if (zzC != 27) {
                            int i56 = i47;
                            zzidwVar4 = zzidwVar8;
                            if (zzC > 49) {
                                str = "Failed to parse the message.";
                                unsafe6 = unsafe10;
                                i23 = i49;
                                if (zzC != 50) {
                                    unsafe2 = unsafe6;
                                    int i57 = i56;
                                    long j3 = iArr[i56 + 2] & 1048575;
                                    switch (zzC) {
                                        case 51:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            z3 = true;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 1) {
                                                i25 = i24 + 8;
                                                unsafe2.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzidx.zze(bArr, i24))));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = i25;
                                                if (i45 == i24) {
                                                    i6 = i3;
                                                    i11 = i45;
                                                    i14 = i57;
                                                    break;
                                                } else {
                                                    zzigzVar3 = this;
                                                    i41 = i2;
                                                    i42 = i3;
                                                    i49 = i10;
                                                    unsafe9 = unsafe2;
                                                    zzidwVar7 = zzidwVar2;
                                                    obj6 = obj2;
                                                    i46 = i13;
                                                    i50 = i4;
                                                    i43 = i9;
                                                    i47 = i57;
                                                    i44 = i12;
                                                    break;
                                                }
                                            }
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                        case 52:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            z3 = true;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 5) {
                                                i25 = i24 + 4;
                                                unsafe2.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzidx.zzd(bArr, i24))));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = i25;
                                                if (i45 == i24) {
                                                }
                                            }
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            z3 = true;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 0) {
                                                int zzc = zzidx.zzc(bArr, i24, zzidwVar2);
                                                unsafe2.putObject(obj2, j2, Long.valueOf(zzidwVar2.zzb));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = zzc;
                                                if (i45 == i24) {
                                                }
                                            }
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            z3 = true;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 0) {
                                                i25 = zzidx.zza(bArr, i24, zzidwVar2);
                                                unsafe2.putObject(obj2, j2, Integer.valueOf(zzidwVar2.zza));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = i25;
                                                if (i45 == i24) {
                                                }
                                            }
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            z3 = true;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 1) {
                                                i25 = i24 + 8;
                                                unsafe2.putObject(obj2, j2, Long.valueOf(zzidx.zze(bArr, i24)));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = i25;
                                                if (i45 == i24) {
                                                }
                                            }
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 5) {
                                                unsafe2.putObject(obj2, j2, Integer.valueOf(zzidx.zzd(bArr, i24)));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = i24 + 4;
                                                z3 = true;
                                                if (i45 == i24) {
                                                }
                                            }
                                            z3 = true;
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 58:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 0) {
                                                int zzc2 = zzidx.zzc(bArr, i24, zzidwVar2);
                                                unsafe2.putObject(obj2, j2, Boolean.valueOf(zzidwVar2.zzb != 0));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = zzc2;
                                                z3 = true;
                                                if (i45 == i24) {
                                                }
                                            }
                                            z3 = true;
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 59:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 2) {
                                                int zza6 = zzidx.zza(bArr, i24, zzidwVar2);
                                                int i58 = zzidwVar2.zza;
                                                if (i58 == 0) {
                                                    unsafe2.putObject(obj2, j2, "");
                                                } else {
                                                    int i59 = zza6 + i58;
                                                    if ((i55 & 536870912) != 0 && !zziim.zzb(bArr, zza6, i59)) {
                                                        throw new zzige("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe2.putObject(obj2, j2, new String(bArr, zza6, i58, StandardCharsets.UTF_8));
                                                    zza6 = i59;
                                                }
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = zza6;
                                                z3 = true;
                                                if (i45 == i24) {
                                                }
                                            }
                                            z3 = true;
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 60:
                                            str = str;
                                            i24 = i51;
                                            i13 = i53;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 2) {
                                                Object zzv = zzv(obj2, i13, i57);
                                                zzidwVar2 = zzidwVar4;
                                                int zzj = zzidx.zzj(zzv, zzq(i57), bArr, i24, i2, zzidwVar);
                                                zzw(obj2, i13, i57, zzv);
                                                i45 = zzj;
                                                unsafe2 = unsafe2;
                                                i57 = i57;
                                                i10 = i23;
                                                z3 = true;
                                                if (i45 == i24) {
                                                }
                                            } else {
                                                zzidwVar2 = zzidwVar4;
                                                i57 = i57;
                                                i10 = i23;
                                                z3 = true;
                                                i45 = i24;
                                                if (i45 == i24) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            str = str;
                                            i24 = i51;
                                            i26 = i23;
                                            zzidwVar5 = zzidwVar4;
                                            i13 = i53;
                                            i27 = i57;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 2) {
                                                int zzg2 = zzidx.zzg(bArr, i24, zzidwVar5);
                                                unsafe2.putObject(obj2, j2, zzidwVar5.zzc);
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = zzg2;
                                                i10 = i26;
                                                i57 = i27;
                                                z3 = true;
                                                zzidwVar2 = zzidwVar5;
                                                if (i45 == i24) {
                                                }
                                            } else {
                                                i10 = i26;
                                                i57 = i27;
                                                z3 = true;
                                                zzidwVar2 = zzidwVar5;
                                                i45 = i24;
                                                if (i45 == i24) {
                                                }
                                            }
                                            break;
                                        case 63:
                                            str = str;
                                            i24 = i51;
                                            i28 = i23;
                                            zzidwVar5 = zzidwVar4;
                                            i13 = i53;
                                            i27 = i57;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 0) {
                                                int zza7 = zzidx.zza(bArr, i24, zzidwVar5);
                                                int i60 = zzidwVar5.zza;
                                                zzifs zzs = zzs(i27);
                                                if (zzs == null || zzs.zza(i60)) {
                                                    i26 = i28;
                                                    unsafe2.putObject(obj2, j2, Integer.valueOf(i60));
                                                    unsafe2.putInt(obj2, j3, i13);
                                                } else {
                                                    i26 = i28;
                                                    zzh(obj).zzk(i26, Long.valueOf(i60));
                                                }
                                                i45 = zza7;
                                                i10 = i26;
                                                i57 = i27;
                                                z3 = true;
                                                zzidwVar2 = zzidwVar5;
                                                if (i45 == i24) {
                                                }
                                            }
                                            zzidwVar2 = zzidwVar5;
                                            i57 = i27;
                                            i10 = i28;
                                            z3 = true;
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 66:
                                            str = str;
                                            i24 = i51;
                                            i28 = i23;
                                            zzidwVar5 = zzidwVar4;
                                            i13 = i53;
                                            i27 = i57;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 0) {
                                                zza2 = zzidx.zza(bArr, i24, zzidwVar5);
                                                unsafe2.putObject(obj2, j2, Integer.valueOf(zziem.zzM(zzidwVar5.zza)));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = zza2;
                                                zzidwVar2 = zzidwVar5;
                                                i57 = i27;
                                                i10 = i28;
                                                z3 = true;
                                                if (i45 == i24) {
                                                }
                                            }
                                            zzidwVar2 = zzidwVar5;
                                            i57 = i27;
                                            i10 = i28;
                                            z3 = true;
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 67:
                                            str = str;
                                            i24 = i51;
                                            i28 = i23;
                                            zzidwVar5 = zzidwVar4;
                                            i13 = i53;
                                            i27 = i57;
                                            i9 = 3;
                                            obj2 = obj;
                                            if (i54 == 0) {
                                                zza2 = zzidx.zzc(bArr, i24, zzidwVar5);
                                                unsafe2.putObject(obj2, j2, Long.valueOf(zziem.zzN(zzidwVar5.zzb)));
                                                unsafe2.putInt(obj2, j3, i13);
                                                i45 = zza2;
                                                zzidwVar2 = zzidwVar5;
                                                i57 = i27;
                                                i10 = i28;
                                                z3 = true;
                                                if (i45 == i24) {
                                                }
                                            }
                                            zzidwVar2 = zzidwVar5;
                                            i57 = i27;
                                            i10 = i28;
                                            z3 = true;
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                        case 68:
                                            if (i54 == 3) {
                                                i9 = 3;
                                                Object zzv2 = zzv(obj, i53, i57);
                                                str = str;
                                                i24 = i51;
                                                i28 = i23;
                                                i45 = zzidx.zzk(zzv2, zzq(i57), bArr, i51, i2, (i23 & (-8)) | 4, zzidwVar);
                                                zzw(obj, i53, i57, zzv2);
                                                zzidwVar2 = zzidwVar4;
                                                obj2 = obj;
                                                i13 = i53;
                                                i10 = i28;
                                                z3 = true;
                                                if (i45 == i24) {
                                                }
                                            } else {
                                                str = str;
                                                i24 = i51;
                                                i9 = 3;
                                                obj2 = obj;
                                                i10 = i23;
                                                zzidwVar2 = zzidwVar4;
                                                z3 = true;
                                                i13 = i53;
                                                i45 = i24;
                                                if (i45 == i24) {
                                                }
                                            }
                                            break;
                                        default:
                                            str = str;
                                            i24 = i51;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            z3 = true;
                                            i9 = 3;
                                            obj2 = obj;
                                            i45 = i24;
                                            if (i45 == i24) {
                                            }
                                            break;
                                    }
                                } else if (i54 == 2) {
                                    Object zzr = zzigzVar3.zzr(i56);
                                    Unsafe unsafe11 = unsafe6;
                                    Object object = unsafe11.getObject(obj, j2);
                                    if (zzigr.zza(object)) {
                                        zzigq zzc3 = zzigq.zza().zzc();
                                        zzigr.zzb(zzc3, object);
                                        unsafe11.putObject(obj, j2, zzc3);
                                        object = zzc3;
                                    }
                                    zzigo zze = ((zzigp) zzr).zze();
                                    zzigq zzigqVar = (zzigq) object;
                                    int zza8 = zzidx.zza(bArr, i51, zzidwVar4);
                                    int i61 = zzidwVar4.zza;
                                    if (i61 >= 0 && i61 <= i2 - zza8) {
                                        int i62 = zza8 + i61;
                                        Object obj7 = zze.zzb;
                                        Object obj8 = zze.zzd;
                                        Object obj9 = obj8;
                                        Object obj10 = obj7;
                                        int i63 = zza8;
                                        while (i63 < i62) {
                                            int i64 = i56;
                                            int i65 = i63 + 1;
                                            int i66 = bArr[i63];
                                            if (i66 < 0) {
                                                i65 = zzidx.zzb(i66, bArr, i65, zzidwVar4);
                                                i66 = zzidwVar4.zza;
                                            }
                                            int i67 = i66;
                                            int i68 = i65;
                                            int i69 = i67 >>> 3;
                                            Object obj11 = obj10;
                                            int i70 = i67 & 7;
                                            int i71 = i62;
                                            if (i69 != 1) {
                                                if (i69 == 2) {
                                                    zziin zziinVar = zze.zzc;
                                                    if (i70 == zziinVar.zzb()) {
                                                        i29 = i64;
                                                        obj4 = obj11;
                                                        obj3 = obj8;
                                                        unsafe7 = unsafe11;
                                                        i30 = i71;
                                                        i63 = zzS(bArr, i68, i2, zziinVar, obj8.getClass(), zzidwVar);
                                                        obj9 = zzidwVar4.zzc;
                                                        obj10 = obj4;
                                                        i56 = i29;
                                                        i62 = i30;
                                                        obj8 = obj3;
                                                        unsafe11 = unsafe7;
                                                    }
                                                }
                                                obj3 = obj8;
                                                unsafe7 = unsafe11;
                                                i29 = i64;
                                                obj4 = obj11;
                                                i30 = i71;
                                            } else {
                                                obj3 = obj8;
                                                unsafe7 = unsafe11;
                                                i29 = i64;
                                                obj4 = obj11;
                                                i30 = i71;
                                                zziin zziinVar2 = zze.zza;
                                                if (i70 == zziinVar2.zzb()) {
                                                    i63 = zzS(bArr, i68, i2, zziinVar2, null, zzidwVar);
                                                    obj10 = zzidwVar4.zzc;
                                                    i56 = i29;
                                                    i62 = i30;
                                                    obj8 = obj3;
                                                    unsafe11 = unsafe7;
                                                }
                                            }
                                            i63 = zzidx.zzp(i67, bArr, i68, i2, zzidwVar4);
                                            obj10 = obj4;
                                            i56 = i29;
                                            i62 = i30;
                                            obj8 = obj3;
                                            unsafe11 = unsafe7;
                                        }
                                        i14 = i56;
                                        Object obj12 = obj10;
                                        Unsafe unsafe12 = unsafe11;
                                        int i72 = i62;
                                        if (i63 != i72) {
                                            throw new zzige(str);
                                        }
                                        zzigqVar.put(obj12, obj9);
                                        if (i72 != i51) {
                                            zzigzVar3 = this;
                                            i42 = i3;
                                            i47 = i14;
                                            i41 = i2;
                                            i45 = i72;
                                            i49 = i23;
                                            zzidwVar7 = zzidwVar4;
                                            i50 = i4;
                                            i46 = i53;
                                            i44 = -1;
                                            unsafe9 = unsafe12;
                                            i43 = 3;
                                            obj6 = obj;
                                        } else {
                                            obj2 = obj;
                                            i6 = i3;
                                            i11 = i72;
                                            i10 = i23;
                                            zzidwVar2 = zzidwVar4;
                                            i13 = i53;
                                            unsafe2 = unsafe12;
                                            i9 = 3;
                                        }
                                    }
                                } else {
                                    i14 = i56;
                                    str2 = str;
                                    str = str2;
                                    i11 = i51;
                                    i10 = i23;
                                    zzidwVar2 = zzidwVar4;
                                    i13 = i53;
                                    unsafe2 = unsafe6;
                                    i9 = 3;
                                    obj2 = obj;
                                    i6 = i3;
                                }
                            } else {
                                long j4 = i55;
                                zzify zzifyVar = (zzify) unsafe10.getObject(obj6, j2);
                                if (zzifyVar.zza()) {
                                    j = j4;
                                } else {
                                    int size = zzifyVar.size();
                                    j = j4;
                                    zzifyVar = zzifyVar.zzh(size + size);
                                    unsafe10.putObject(obj6, j2, zzifyVar);
                                }
                                zzify zzifyVar2 = zzifyVar;
                                switch (zzC) {
                                    case 18:
                                    case 35:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        unsafe8 = unsafe10;
                                        i32 = i49;
                                        if (i54 == 2) {
                                            int i73 = zzidx.zza;
                                            zziet zzietVar = (zziet) zzifyVar2;
                                            i33 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i74 = zzidwVar6.zza;
                                            if (i74 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i74 > bArr.length - i33) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i75 = i33 + i74;
                                            zzietVar.zzi(zzietVar.size() + (i74 >> 3));
                                            while (i33 < i75) {
                                                zzietVar.zzg(Double.longBitsToDouble(zzidx.zze(bArr, i33)));
                                                i33 += 8;
                                            }
                                            if (i33 != i75) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            z4 = true;
                                            if (i33 != i51) {
                                                obj2 = obj;
                                                i6 = i3;
                                                i14 = i56;
                                                i11 = i33;
                                                i10 = i32;
                                                zzidwVar2 = zzidwVar6;
                                                i13 = i53;
                                                unsafe2 = unsafe8;
                                                i9 = 3;
                                                break;
                                            } else {
                                                i42 = i3;
                                                i47 = i56;
                                                i49 = i32;
                                                zzidwVar7 = zzidwVar6;
                                                i50 = i4;
                                                i46 = i53;
                                                i44 = -1;
                                                unsafe9 = unsafe8;
                                                i43 = 3;
                                                i45 = i33;
                                                i41 = i31;
                                                obj6 = obj;
                                                break;
                                            }
                                        } else {
                                            z4 = true;
                                            if (i54 == 1) {
                                                int i76 = i51 + 8;
                                                int i77 = zzidx.zza;
                                                zziet zzietVar2 = (zziet) zzifyVar2;
                                                zzietVar2.zzg(Double.longBitsToDouble(zzidx.zze(bArr, i51)));
                                                while (i76 < i31) {
                                                    int zza9 = zzidx.zza(bArr, i76, zzidwVar6);
                                                    if (i32 == zzidwVar6.zza) {
                                                        zzietVar2.zzg(Double.longBitsToDouble(zzidx.zze(bArr, zza9)));
                                                        i76 = zza9 + 8;
                                                    } else {
                                                        i33 = i76;
                                                        if (i33 != i51) {
                                                        }
                                                    }
                                                }
                                                i33 = i76;
                                                if (i33 != i51) {
                                                }
                                            }
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        unsafe8 = unsafe10;
                                        i32 = i49;
                                        if (i54 == 2) {
                                            int i78 = zzidx.zza;
                                            zzifd zzifdVar = (zzifd) zzifyVar2;
                                            i33 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i79 = zzidwVar6.zza;
                                            if (i79 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i79 > bArr.length - i33) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i80 = i33 + i79;
                                            zzifdVar.zzi(zzifdVar.size() + (i79 >> 2));
                                            while (i33 < i80) {
                                                zzifdVar.zzg(Float.intBitsToFloat(zzidx.zzd(bArr, i33)));
                                                i33 += 4;
                                            }
                                            if (i33 != i80) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            z4 = true;
                                            if (i33 != i51) {
                                            }
                                        } else {
                                            if (i54 == 5) {
                                                i34 = i51 + 4;
                                                int i81 = zzidx.zza;
                                                zzifd zzifdVar2 = (zzifd) zzifyVar2;
                                                zzifdVar2.zzg(Float.intBitsToFloat(zzidx.zzd(bArr, i51)));
                                                while (i34 < i31) {
                                                    int zza10 = zzidx.zza(bArr, i34, zzidwVar6);
                                                    if (i32 == zzidwVar6.zza) {
                                                        zzifdVar2.zzg(Float.intBitsToFloat(zzidx.zzd(bArr, zza10)));
                                                        i34 = zza10 + 4;
                                                    } else {
                                                        i33 = i34;
                                                        z4 = true;
                                                        if (i33 != i51) {
                                                        }
                                                    }
                                                }
                                                i33 = i34;
                                                z4 = true;
                                                if (i33 != i51) {
                                                }
                                            }
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        unsafe8 = unsafe10;
                                        i32 = i49;
                                        if (i54 == 2) {
                                            int i82 = zzidx.zza;
                                            zzigk zzigkVar = (zzigk) zzifyVar2;
                                            i33 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i83 = zzidwVar6.zza;
                                            if (i83 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i83 > bArr.length - i33) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i84 = i83 + i33;
                                            while (i33 < i84) {
                                                i33 = zzidx.zzc(bArr, i33, zzidwVar6);
                                                zzigkVar.zzd(zzidwVar6.zzb);
                                            }
                                            if (i33 != i84) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            z4 = true;
                                            if (i33 != i51) {
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                int i85 = zzidx.zza;
                                                zzigk zzigkVar2 = (zzigk) zzifyVar2;
                                                i34 = zzidx.zzc(bArr, i51, zzidwVar6);
                                                zzigkVar2.zzd(zzidwVar6.zzb);
                                                while (i34 < i31) {
                                                    int zza11 = zzidx.zza(bArr, i34, zzidwVar6);
                                                    if (i32 == zzidwVar6.zza) {
                                                        i34 = zzidx.zzc(bArr, zza11, zzidwVar6);
                                                        zzigkVar2.zzd(zzidwVar6.zzb);
                                                    } else {
                                                        i33 = i34;
                                                        z4 = true;
                                                        if (i33 != i51) {
                                                        }
                                                    }
                                                }
                                                i33 = i34;
                                                z4 = true;
                                                if (i33 != i51) {
                                                }
                                            }
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        unsafe8 = unsafe10;
                                        if (i54 == 2) {
                                            i32 = i49;
                                            i56 = i56;
                                            i33 = zzidx.zzm(bArr, i51, zzifyVar2, zzidwVar6);
                                            z4 = true;
                                        } else if (i54 == 0) {
                                            i32 = i49;
                                            i33 = zzidx.zzl(i49, bArr, i51, i2, zzifyVar2, zzidwVar);
                                            i56 = i56;
                                            z4 = true;
                                        } else {
                                            i32 = i49;
                                            z4 = true;
                                            i56 = i56;
                                            i33 = i51;
                                        }
                                        if (i33 != i51) {
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i35 = i56;
                                        unsafe8 = unsafe10;
                                        i36 = i49;
                                        if (i54 == 2) {
                                            int i86 = zzidx.zza;
                                            zzigk zzigkVar3 = (zzigk) zzifyVar2;
                                            zza3 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i87 = zzidwVar6.zza;
                                            if (i87 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i87 > bArr.length - zza3) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i88 = zza3 + i87;
                                            zzigkVar3.zzi(zzigkVar3.size() + (i87 >> 3));
                                            while (zza3 < i88) {
                                                zzigkVar3.zzd(zzidx.zze(bArr, zza3));
                                                zza3 += 8;
                                            }
                                            if (zza3 != i88) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i32 = i36;
                                            i56 = i35;
                                            z4 = true;
                                            i33 = zza3;
                                            if (i33 != i51) {
                                            }
                                        } else if (i54 == 1) {
                                            int i89 = i51 + 8;
                                            int i90 = zzidx.zza;
                                            zzigk zzigkVar4 = (zzigk) zzifyVar2;
                                            zzigkVar4.zzd(zzidx.zze(bArr, i51));
                                            while (i89 < i31) {
                                                int zza12 = zzidx.zza(bArr, i89, zzidwVar6);
                                                if (i36 == zzidwVar6.zza) {
                                                    zzigkVar4.zzd(zzidx.zze(bArr, zza12));
                                                    i89 = zza12 + 8;
                                                } else {
                                                    i32 = i36;
                                                    i56 = i35;
                                                    i33 = i89;
                                                    z4 = true;
                                                    if (i33 != i51) {
                                                    }
                                                }
                                            }
                                            i32 = i36;
                                            i56 = i35;
                                            i33 = i89;
                                            z4 = true;
                                            if (i33 != i51) {
                                            }
                                        } else {
                                            i32 = i36;
                                            z4 = true;
                                            i56 = i35;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i35 = i56;
                                        unsafe8 = unsafe10;
                                        i36 = i49;
                                        if (i54 == 2) {
                                            int i91 = zzidx.zza;
                                            zzifn zzifnVar = (zzifn) zzifyVar2;
                                            int zza13 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i92 = zzidwVar6.zza;
                                            if (i92 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i92 > bArr.length - zza13) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i93 = zza13 + i92;
                                            zzifnVar.zzj(zzifnVar.size() + (i92 >> 2));
                                            while (zza13 < i93) {
                                                zzifnVar.zzi(zzidx.zzd(bArr, zza13));
                                                zza13 += 4;
                                            }
                                            if (zza13 != i93) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i32 = i36;
                                            i56 = i35;
                                            i33 = zza13;
                                            z4 = true;
                                            if (i33 != i51) {
                                            }
                                        } else {
                                            if (i54 == 5) {
                                                i34 = i51 + 4;
                                                int i94 = zzidx.zza;
                                                zzifn zzifnVar2 = (zzifn) zzifyVar2;
                                                zzifnVar2.zzi(zzidx.zzd(bArr, i51));
                                                while (i34 < i31) {
                                                    int zza14 = zzidx.zza(bArr, i34, zzidwVar6);
                                                    if (i36 == zzidwVar6.zza) {
                                                        zzifnVar2.zzi(zzidx.zzd(bArr, zza14));
                                                        i34 = zza14 + 4;
                                                    } else {
                                                        i32 = i36;
                                                        i56 = i35;
                                                        i33 = i34;
                                                        z4 = true;
                                                        if (i33 != i51) {
                                                        }
                                                    }
                                                }
                                                i32 = i36;
                                                i56 = i35;
                                                i33 = i34;
                                                z4 = true;
                                                if (i33 != i51) {
                                                }
                                            }
                                            i32 = i36;
                                            i56 = i35;
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i35 = i56;
                                        unsafe8 = unsafe10;
                                        i36 = i49;
                                        if (i54 == 2) {
                                            int i95 = zzidx.zza;
                                            zzidy zzidyVar = (zzidy) zzifyVar2;
                                            zza3 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i96 = zzidwVar6.zza;
                                            if (i96 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i96 > bArr.length - zza3) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i97 = i96 + zza3;
                                            while (zza3 < i97) {
                                                zza3 = zzidx.zzc(bArr, zza3, zzidwVar6);
                                                zzidyVar.zzg(zzidwVar6.zzb != 0);
                                            }
                                            if (zza3 != i97) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i32 = i36;
                                            i56 = i35;
                                            z4 = true;
                                            i33 = zza3;
                                            if (i33 != i51) {
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                int i98 = zzidx.zza;
                                                zzidy zzidyVar2 = (zzidy) zzifyVar2;
                                                i34 = zzidx.zzc(bArr, i51, zzidwVar6);
                                                zzidyVar2.zzg(zzidwVar6.zzb != 0);
                                                while (i34 < i31) {
                                                    int zza15 = zzidx.zza(bArr, i34, zzidwVar6);
                                                    if (i36 == zzidwVar6.zza) {
                                                        i34 = zzidx.zzc(bArr, zza15, zzidwVar6);
                                                        zzidyVar2.zzg(zzidwVar6.zzb != 0);
                                                    } else {
                                                        i32 = i36;
                                                        i56 = i35;
                                                        i33 = i34;
                                                        z4 = true;
                                                        if (i33 != i51) {
                                                        }
                                                    }
                                                }
                                                i32 = i36;
                                                i56 = i35;
                                                i33 = i34;
                                                z4 = true;
                                                if (i33 != i51) {
                                                }
                                            }
                                            i32 = i36;
                                            i56 = i35;
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i37 = i56;
                                        unsafe8 = unsafe10;
                                        i38 = i49;
                                        i39 = i51;
                                        long j5 = j;
                                        c = 2;
                                        if (i54 != 2) {
                                            i32 = i38;
                                            i51 = i39;
                                            i56 = i37;
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        } else if ((j5 & 536870912) == 0) {
                                            zza4 = zzidx.zza(bArr, i39, zzidwVar6);
                                            int i99 = zzidwVar6.zza;
                                            if (i99 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i99 == 0) {
                                                obj5 = "";
                                                zzifyVar2.add(obj5);
                                            } else {
                                                obj5 = "";
                                                zzifyVar2.add(new String(bArr, zza4, i99, StandardCharsets.UTF_8));
                                                zza4 += i99;
                                            }
                                            while (zza4 < i31) {
                                                int zza16 = zzidx.zza(bArr, zza4, zzidwVar6);
                                                if (i38 == zzidwVar6.zza) {
                                                    zza4 = zzidx.zza(bArr, zza16, zzidwVar6);
                                                    int i100 = zzidwVar6.zza;
                                                    if (i100 < 0) {
                                                        throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i100 == 0) {
                                                        zzifyVar2.add(obj5);
                                                    } else {
                                                        zzifyVar2.add(new String(bArr, zza4, i100, StandardCharsets.UTF_8));
                                                        zza4 += i100;
                                                    }
                                                } else {
                                                    i51 = i39;
                                                    z4 = true;
                                                    int i101 = zza4;
                                                    i32 = i38;
                                                    i56 = i37;
                                                    i33 = i101;
                                                    if (i33 != i51) {
                                                    }
                                                }
                                            }
                                            i51 = i39;
                                            z4 = true;
                                            int i1012 = zza4;
                                            i32 = i38;
                                            i56 = i37;
                                            i33 = i1012;
                                            if (i33 != i51) {
                                            }
                                        } else {
                                            int zza17 = zzidx.zza(bArr, i39, zzidwVar6);
                                            int i102 = zzidwVar6.zza;
                                            if (i102 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i102 == 0) {
                                                zzifyVar2.add("");
                                            } else {
                                                int i103 = zza17 + i102;
                                                if (!zziim.zzb(bArr, zza17, i103)) {
                                                    throw new zzige("Protocol message had invalid UTF-8.");
                                                }
                                                zzifyVar2.add(new String(bArr, zza17, i102, StandardCharsets.UTF_8));
                                                zza17 = i103;
                                            }
                                            while (zza17 < i31) {
                                                int zza18 = zzidx.zza(bArr, zza17, zzidwVar6);
                                                if (i38 == zzidwVar6.zza) {
                                                    zza17 = zzidx.zza(bArr, zza18, zzidwVar6);
                                                    int i104 = zzidwVar6.zza;
                                                    if (i104 < 0) {
                                                        throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i104 == 0) {
                                                        zzifyVar2.add("");
                                                    } else {
                                                        int i105 = zza17 + i104;
                                                        if (!zziim.zzb(bArr, zza17, i105)) {
                                                            throw new zzige("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzifyVar2.add(new String(bArr, zza17, i104, StandardCharsets.UTF_8));
                                                        zza17 = i105;
                                                    }
                                                } else {
                                                    i32 = i38;
                                                    i51 = i39;
                                                    i56 = i37;
                                                    i33 = zza17;
                                                    z4 = true;
                                                    if (i33 != i51) {
                                                    }
                                                }
                                            }
                                            i32 = i38;
                                            i51 = i39;
                                            i56 = i37;
                                            i33 = zza17;
                                            z4 = true;
                                            if (i33 != i51) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i40 = i56;
                                        unsafe8 = unsafe10;
                                        c2 = 2;
                                        if (i54 == 2) {
                                            c = 2;
                                            i37 = i40;
                                            i38 = i49;
                                            i39 = i51;
                                            zza4 = zzidx.zzn(zzigzVar3.zzq(i40), i49, bArr, i51, i2, zzifyVar2, zzidwVar);
                                            zzidwVar6 = zzidwVar6;
                                            i51 = i39;
                                            z4 = true;
                                            int i10122 = zza4;
                                            i32 = i38;
                                            i56 = i37;
                                            i33 = i10122;
                                            if (i33 != i51) {
                                            }
                                        }
                                        i56 = i40;
                                        i32 = i49;
                                        z4 = true;
                                        i33 = i51;
                                        if (i33 != i51) {
                                        }
                                        break;
                                    case 28:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i40 = i56;
                                        unsafe8 = unsafe10;
                                        c2 = 2;
                                        if (i54 == 2) {
                                            zza5 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i106 = zzidwVar6.zza;
                                            if (i106 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i106 > bArr.length - zza5) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i106 == 0) {
                                                zzifyVar2.add(zziei.zza);
                                            } else {
                                                zzifyVar2.add(zziei.zzt(bArr, zza5, i106));
                                                zza5 += i106;
                                            }
                                            while (zza5 < i31) {
                                                int zza19 = zzidx.zza(bArr, zza5, zzidwVar6);
                                                if (i49 == zzidwVar6.zza) {
                                                    zza5 = zzidx.zza(bArr, zza19, zzidwVar6);
                                                    int i107 = zzidwVar6.zza;
                                                    if (i107 < 0) {
                                                        throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i107 > bArr.length - zza5) {
                                                        throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i107 == 0) {
                                                        zzifyVar2.add(zziei.zza);
                                                    } else {
                                                        zzifyVar2.add(zziei.zzt(bArr, zza5, i107));
                                                        zza5 += i107;
                                                    }
                                                } else {
                                                    i33 = zza5;
                                                    i56 = i40;
                                                    i32 = i49;
                                                    z4 = true;
                                                    if (i33 != i51) {
                                                    }
                                                }
                                            }
                                            i33 = zza5;
                                            i56 = i40;
                                            i32 = i49;
                                            z4 = true;
                                            if (i33 != i51) {
                                            }
                                        }
                                        i56 = i40;
                                        i32 = i49;
                                        z4 = true;
                                        i33 = i51;
                                        if (i33 != i51) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i40 = i56;
                                        unsafe8 = unsafe10;
                                        if (i54 == 2) {
                                            zzl = zzidx.zzm(bArr, i51, zzifyVar2, zzidwVar6);
                                        } else {
                                            if (i54 == 0) {
                                                zzl = zzidx.zzl(i49, bArr, i51, i2, zzifyVar2, zzidwVar);
                                            }
                                            i56 = i40;
                                            i32 = i49;
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        int i108 = zzl;
                                        zzihp.zzI(obj, i53, zzifyVar2, zzigzVar3.zzs(i40), null, zzigzVar3.zzm);
                                        i33 = i108;
                                        i56 = i40;
                                        i32 = i49;
                                        z4 = true;
                                        if (i33 != i51) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i40 = i56;
                                        unsafe8 = unsafe10;
                                        if (i54 == 2) {
                                            int i109 = zzidx.zza;
                                            zzifn zzifnVar3 = (zzifn) zzifyVar2;
                                            zza5 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i110 = zzidwVar6.zza;
                                            if (i110 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i110 > bArr.length - zza5) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i111 = i110 + zza5;
                                            while (zza5 < i111) {
                                                zza5 = zzidx.zza(bArr, zza5, zzidwVar6);
                                                zzifnVar3.zzi(zziem.zzM(zzidwVar6.zza));
                                            }
                                            if (zza5 != i111) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                int i112 = zzidx.zza;
                                                zzifn zzifnVar4 = (zzifn) zzifyVar2;
                                                zza5 = zzidx.zza(bArr, i51, zzidwVar6);
                                                zzifnVar4.zzi(zziem.zzM(zzidwVar6.zza));
                                                while (zza5 < i31) {
                                                    int zza20 = zzidx.zza(bArr, zza5, zzidwVar6);
                                                    if (i49 == zzidwVar6.zza) {
                                                        zza5 = zzidx.zza(bArr, zza20, zzidwVar6);
                                                        zzifnVar4.zzi(zziem.zzM(zzidwVar6.zza));
                                                    }
                                                }
                                            }
                                            i56 = i40;
                                            i32 = i49;
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        i33 = zza5;
                                        i56 = i40;
                                        i32 = i49;
                                        z4 = true;
                                        if (i33 != i51) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        str = "Failed to parse the message.";
                                        i31 = i2;
                                        zzidwVar6 = zzidwVar;
                                        i40 = i56;
                                        unsafe8 = unsafe10;
                                        if (i54 == 2) {
                                            int i113 = zzidx.zza;
                                            zzigk zzigkVar5 = (zzigk) zzifyVar2;
                                            zza5 = zzidx.zza(bArr, i51, zzidwVar6);
                                            int i114 = zzidwVar6.zza;
                                            if (i114 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i114 > bArr.length - zza5) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i115 = i114 + zza5;
                                            while (zza5 < i115) {
                                                zza5 = zzidx.zzc(bArr, zza5, zzidwVar6);
                                                zzigkVar5.zzd(zziem.zzN(zzidwVar6.zzb));
                                            }
                                            if (zza5 != i115) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i54 == 0) {
                                                int i116 = zzidx.zza;
                                                zzigk zzigkVar6 = (zzigk) zzifyVar2;
                                                zza5 = zzidx.zzc(bArr, i51, zzidwVar6);
                                                zzigkVar6.zzd(zziem.zzN(zzidwVar6.zzb));
                                                while (zza5 < i31) {
                                                    int zza21 = zzidx.zza(bArr, zza5, zzidwVar6);
                                                    if (i49 == zzidwVar6.zza) {
                                                        zza5 = zzidx.zzc(bArr, zza21, zzidwVar6);
                                                        zzigkVar6.zzd(zziem.zzN(zzidwVar6.zzb));
                                                    }
                                                }
                                            }
                                            i56 = i40;
                                            i32 = i49;
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        i33 = zza5;
                                        i56 = i40;
                                        i32 = i49;
                                        z4 = true;
                                        if (i33 != i51) {
                                        }
                                        break;
                                    default:
                                        if (i54 == 3) {
                                            int i117 = (i49 & (-8)) | 4;
                                            zziho zzq = zzigzVar3.zzq(i56);
                                            i40 = i56;
                                            str = "Failed to parse the message.";
                                            unsafe8 = unsafe10;
                                            zzidw zzidwVar9 = zzidwVar;
                                            zza5 = zzidx.zzi(zzq, bArr, i51, i2, i117, zzidwVar9);
                                            zzifyVar2.add(zzidwVar9.zzc);
                                            int i118 = i2;
                                            while (zza5 < i118) {
                                                int zza22 = zzidx.zza(bArr, zza5, zzidwVar9);
                                                if (i49 == zzidwVar9.zza) {
                                                    zzidw zzidwVar10 = zzidwVar9;
                                                    zza5 = zzidx.zzi(zzq, bArr, zza22, i2, i117, zzidwVar);
                                                    zzifyVar2.add(zzidwVar10.zzc);
                                                    i118 = i118;
                                                    zzidwVar9 = zzidwVar10;
                                                } else {
                                                    i31 = i118;
                                                    zzidwVar6 = zzidwVar9;
                                                    i33 = zza5;
                                                    i56 = i40;
                                                    i32 = i49;
                                                    z4 = true;
                                                    if (i33 != i51) {
                                                    }
                                                }
                                            }
                                            i31 = i118;
                                            zzidwVar6 = zzidwVar9;
                                            i33 = zza5;
                                            i56 = i40;
                                            i32 = i49;
                                            z4 = true;
                                            if (i33 != i51) {
                                            }
                                        } else {
                                            str = "Failed to parse the message.";
                                            i31 = i2;
                                            unsafe8 = unsafe10;
                                            zzidwVar6 = zzidwVar;
                                            i32 = i49;
                                            z4 = true;
                                            i33 = i51;
                                            if (i33 != i51) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i54 == 2) {
                            zzify zzifyVar3 = (zzify) unsafe10.getObject(obj6, j2);
                            if (!zzifyVar3.zza()) {
                                int size2 = zzifyVar3.size();
                                zzifyVar3 = zzifyVar3.zzh(size2 == 0 ? 10 : size2 + size2);
                                unsafe10.putObject(obj6, j2, zzifyVar3);
                            }
                            i45 = zzidx.zzn(zzigzVar3.zzq(i47), i49, bArr, i51, i2, zzifyVar3, zzidwVar);
                            i41 = i2;
                            i47 = i47;
                            unsafe9 = unsafe10;
                            i49 = i49;
                            i50 = i4;
                            i46 = i53;
                            i44 = -1;
                            i43 = 3;
                            i42 = i3;
                            zzidwVar7 = zzidwVar8;
                        } else {
                            str2 = "Failed to parse the message.";
                            unsafe6 = unsafe10;
                            i14 = i47;
                            i23 = i49;
                            zzidwVar4 = zzidwVar8;
                            str = str2;
                            i11 = i51;
                            i10 = i23;
                            zzidwVar2 = zzidwVar4;
                            i13 = i53;
                            unsafe2 = unsafe6;
                            i9 = 3;
                            obj2 = obj;
                            i6 = i3;
                        }
                    } else {
                        int i119 = iArr[i47 + 2];
                        int i120 = 1 << (i119 >>> 20);
                        int i121 = 1048575;
                        int i122 = i119 & 1048575;
                        if (i122 != i50) {
                            if (i50 != 1048575) {
                                unsafe9.putInt(obj6, i50, i48);
                                i121 = 1048575;
                            }
                            i17 = i122 == i121 ? 0 : unsafe9.getInt(obj6, i122);
                            i18 = i122;
                        } else {
                            i17 = i48;
                            i18 = i50;
                        }
                        switch (zzC) {
                            case 0:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                z = true;
                                i12 = -1;
                                if (i54 != 1) {
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    int i123 = i17 | i120;
                                    zziih.zzk(obj6, j2, Double.longBitsToDouble(zzidx.zze(bArr, i51)));
                                    i41 = i2;
                                    i42 = i3;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = -1;
                                    i48 = i123;
                                    unsafe9 = unsafe4;
                                    zzidwVar7 = zzidwVar3;
                                    i43 = 3;
                                    i45 = i51 + 8;
                                }
                            case 1:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                i12 = -1;
                                if (i54 != 5) {
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i20 = i51 + 4;
                                    i21 = i17 | i120;
                                    zziih.zzi(obj6, j2, Float.intBitsToFloat(zzidx.zzd(bArr, i51)));
                                    i41 = i2;
                                    i42 = i3;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = i12;
                                    i48 = i21;
                                    unsafe9 = unsafe4;
                                    zzidwVar7 = zzidwVar3;
                                    i43 = 3;
                                    i45 = i20;
                                }
                            case 2:
                            case 3:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                i12 = -1;
                                if (i54 == 0) {
                                    int i124 = i17 | i120;
                                    int zzc4 = zzidx.zzc(bArr, i51, zzidwVar3);
                                    unsafe4.putLong(obj, j2, zzidwVar3.zzb);
                                    i41 = i2;
                                    i42 = i3;
                                    zzidwVar7 = zzidwVar3;
                                    i45 = zzc4;
                                    i49 = i19;
                                    i50 = i18;
                                    i43 = 3;
                                    i48 = i124;
                                    unsafe9 = unsafe4;
                                    i46 = i53;
                                    i44 = i12;
                                }
                                z = true;
                                str = "Failed to parse the message.";
                                i6 = i3;
                                unsafe2 = unsafe4;
                                i11 = i51;
                                i4 = i18;
                                i13 = i53;
                                i9 = 3;
                                i48 = i17;
                                obj2 = obj6;
                                i14 = i47;
                                i10 = i19;
                                zzidwVar2 = zzidwVar3;
                                break;
                            case 4:
                            case 11:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                i12 = -1;
                                if (i54 != 0) {
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i21 = i17 | i120;
                                    i20 = zzidx.zza(bArr, i51, zzidwVar3);
                                    unsafe4.putInt(obj6, j2, zzidwVar3.zza);
                                    i41 = i2;
                                    i42 = i3;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = i12;
                                    i48 = i21;
                                    unsafe9 = unsafe4;
                                    zzidwVar7 = zzidwVar3;
                                    i43 = 3;
                                    i45 = i20;
                                }
                            case 5:
                            case 14:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                z = true;
                                i12 = -1;
                                if (i54 == 1) {
                                    int i125 = i120 | i17;
                                    unsafe4.putLong(obj, j2, zzidx.zze(bArr, i51));
                                    i41 = i2;
                                    i42 = i3;
                                    zzidwVar7 = zzidwVar3;
                                    i45 = i51 + 8;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i43 = 3;
                                    unsafe9 = unsafe4;
                                    i48 = i125;
                                    i44 = i12;
                                }
                                str = "Failed to parse the message.";
                                i6 = i3;
                                unsafe2 = unsafe4;
                                i11 = i51;
                                i4 = i18;
                                i13 = i53;
                                i9 = 3;
                                i48 = i17;
                                obj2 = obj6;
                                i14 = i47;
                                i10 = i19;
                                zzidwVar2 = zzidwVar3;
                                break;
                            case 6:
                            case 13:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                i12 = -1;
                                if (i54 != 5) {
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i20 = i51 + 4;
                                    i21 = i17 | i120;
                                    unsafe4.putInt(obj6, j2, zzidx.zzd(bArr, i51));
                                    i41 = i2;
                                    i42 = i3;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = i12;
                                    i48 = i21;
                                    unsafe9 = unsafe4;
                                    zzidwVar7 = zzidwVar3;
                                    i43 = 3;
                                    i45 = i20;
                                }
                            case 7:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                i12 = -1;
                                if (i54 != 0) {
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i21 = i17 | i120;
                                    i20 = zzidx.zzc(bArr, i51, zzidwVar3);
                                    zziih.zzg(obj6, j2, zzidwVar3.zzb != 0);
                                    i41 = i2;
                                    i42 = i3;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = i12;
                                    i48 = i21;
                                    unsafe9 = unsafe4;
                                    zzidwVar7 = zzidwVar3;
                                    i43 = 3;
                                    i45 = i20;
                                }
                            case 8:
                                zzidwVar3 = zzidwVar7;
                                unsafe4 = unsafe9;
                                i19 = i49;
                                i12 = -1;
                                if (i54 != 2) {
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i21 = i17 | i120;
                                    if (zzD(i55)) {
                                        i20 = zzidx.zzf(bArr, i51, zzidwVar3);
                                    } else {
                                        i20 = zzidx.zza(bArr, i51, zzidwVar3);
                                        int i126 = zzidwVar3.zza;
                                        if (i126 < 0) {
                                            throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i126 == 0) {
                                            zzidwVar3.zzc = "";
                                        } else {
                                            zzidwVar3.zzc = new String(bArr, i20, i126, StandardCharsets.UTF_8);
                                            i20 += i126;
                                        }
                                    }
                                    unsafe4.putObject(obj6, j2, zzidwVar3.zzc);
                                    i41 = i2;
                                    i42 = i3;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = i12;
                                    i48 = i21;
                                    unsafe9 = unsafe4;
                                    zzidwVar7 = zzidwVar3;
                                    i43 = 3;
                                    i45 = i20;
                                }
                            case 9:
                                zzidwVar3 = zzidwVar7;
                                unsafe5 = unsafe9;
                                i19 = i49;
                                z2 = 2;
                                i12 = -1;
                                if (i54 != 2) {
                                    unsafe4 = unsafe5;
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    int i127 = i17 | i120;
                                    Object zzt = zzigzVar3.zzt(obj6, i47);
                                    i41 = i2;
                                    int zzj2 = zzidx.zzj(zzt, zzigzVar3.zzq(i47), bArr, i51, i41, zzidwVar);
                                    zzigzVar3.zzu(obj6, i47, zzt);
                                    i42 = i3;
                                    zzidwVar7 = zzidwVar3;
                                    i49 = i19;
                                    i50 = i18;
                                    i44 = -1;
                                    i45 = zzj2;
                                    i48 = i127;
                                    unsafe9 = unsafe5;
                                    i46 = i53;
                                    i43 = 3;
                                }
                            case 10:
                                zzidwVar3 = zzidwVar7;
                                unsafe5 = unsafe9;
                                i19 = i49;
                                z2 = 2;
                                i22 = 3;
                                i12 = -1;
                                if (i54 != 2) {
                                    unsafe4 = unsafe5;
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i17 |= i120;
                                    zzg = zzidx.zzg(bArr, i51, zzidwVar3);
                                    unsafe5.putObject(obj6, j2, zzidwVar3.zzc);
                                    i41 = i2;
                                    i42 = i3;
                                    zzidwVar7 = zzidwVar3;
                                    i49 = i19;
                                    i46 = i53;
                                    i44 = i12;
                                    i45 = zzg;
                                    unsafe9 = unsafe5;
                                    int i128 = i18;
                                    i48 = i17;
                                    i43 = i22;
                                    i50 = i128;
                                }
                            case 12:
                                zzidwVar3 = zzidwVar7;
                                unsafe5 = unsafe9;
                                i19 = i49;
                                i22 = 3;
                                i12 = -1;
                                if (i54 != 0) {
                                    unsafe4 = unsafe5;
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    zzg = zzidx.zza(bArr, i51, zzidwVar3);
                                    int i129 = zzidwVar3.zza;
                                    zzifs zzs2 = zzigzVar3.zzs(i47);
                                    if ((i55 & Integer.MIN_VALUE) == 0 || zzs2 == null || zzs2.zza(i129)) {
                                        i17 |= i120;
                                        unsafe5.putInt(obj6, j2, i129);
                                    } else {
                                        zzh(obj).zzk(i19, Long.valueOf(i129));
                                    }
                                    i41 = i2;
                                    i42 = i3;
                                    zzidwVar7 = zzidwVar3;
                                    i49 = i19;
                                    i46 = i53;
                                    i44 = i12;
                                    i45 = zzg;
                                    unsafe9 = unsafe5;
                                    int i1282 = i18;
                                    i48 = i17;
                                    i43 = i22;
                                    i50 = i1282;
                                }
                            case 15:
                                zzidwVar3 = zzidwVar7;
                                Unsafe unsafe13 = unsafe9;
                                i19 = i49;
                                i22 = 3;
                                i12 = -1;
                                if (i54 != 0) {
                                    unsafe4 = unsafe13;
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i17 |= i120;
                                    zzg = zzidx.zza(bArr, i51, zzidwVar3);
                                    unsafe5 = unsafe13;
                                    unsafe5.putInt(obj6, j2, zziem.zzM(zzidwVar3.zza));
                                    i41 = i2;
                                    i42 = i3;
                                    zzidwVar7 = zzidwVar3;
                                    i49 = i19;
                                    i46 = i53;
                                    i44 = i12;
                                    i45 = zzg;
                                    unsafe9 = unsafe5;
                                    int i12822 = i18;
                                    i48 = i17;
                                    i43 = i22;
                                    i50 = i12822;
                                }
                            case 16:
                                Unsafe unsafe14 = unsafe9;
                                i19 = i49;
                                i12 = -1;
                                if (i54 != 0) {
                                    zzidwVar3 = zzidwVar7;
                                    unsafe4 = unsafe14;
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    int i130 = i17 | i120;
                                    int zzc5 = zzidx.zzc(bArr, i51, zzidwVar7);
                                    unsafe14.putLong(obj, j2, zziem.zzN(zzidwVar7.zzb));
                                    i41 = i2;
                                    i42 = i3;
                                    zzidwVar7 = zzidwVar7;
                                    i45 = zzc5;
                                    i43 = 3;
                                    i49 = i19;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = -1;
                                    unsafe9 = unsafe14;
                                    i48 = i130;
                                }
                            default:
                                if (i54 != 3) {
                                    i12 = -1;
                                    zzidwVar3 = zzidwVar7;
                                    unsafe4 = unsafe9;
                                    i19 = i49;
                                    z = true;
                                    str = "Failed to parse the message.";
                                    i6 = i3;
                                    unsafe2 = unsafe4;
                                    i11 = i51;
                                    i4 = i18;
                                    i13 = i53;
                                    i9 = 3;
                                    i48 = i17;
                                    obj2 = obj6;
                                    i14 = i47;
                                    i10 = i19;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    int i131 = i17 | i120;
                                    Object zzt2 = zzigzVar3.zzt(obj6, i47);
                                    i45 = zzidx.zzk(zzt2, zzigzVar3.zzq(i47), bArr, i51, i2, (i53 << 3) | 4, zzidwVar);
                                    zzigzVar3.zzu(obj6, i47, zzt2);
                                    i47 = i47;
                                    i50 = i18;
                                    i46 = i53;
                                    i44 = -1;
                                    unsafe9 = unsafe9;
                                    i41 = i2;
                                    i42 = i3;
                                    i48 = i131;
                                    i43 = 3;
                                }
                        }
                    }
                } else {
                    i9 = i43;
                    zzidwVar2 = zzidwVar7;
                    str = "Failed to parse the message.";
                    i6 = i42;
                    i10 = i52;
                    i4 = i50;
                    i11 = i51;
                    i12 = i44;
                    i13 = i53;
                    obj2 = obj6;
                    unsafe2 = unsafe9;
                    i14 = 0;
                }
                if (i10 != i6 || i6 == 0) {
                    if (this.zzh) {
                        zziew zziewVar = zzidwVar2.zzd;
                        int i132 = zziew.zzb;
                        int i133 = zzidv.zza;
                        if (zziewVar != zziew.zza) {
                            zzigw zzigwVar = this.zzg;
                            int i134 = zzidx.zza;
                            if (zziewVar.zzd(zzigwVar, i13) != null) {
                                throw null;
                            }
                            i16 = i10;
                            unsafe3 = unsafe2;
                            i15 = i2;
                            zzigzVar2 = this;
                            zzo = zzidx.zzo(i10, bArr, i11, i2, zzh(obj), zzidwVar);
                            i42 = i6;
                            i49 = i16;
                            zzidwVar7 = zzidwVar2;
                            zzigzVar3 = zzigzVar2;
                            i41 = i15;
                            i50 = i4;
                            i45 = zzo;
                            i47 = i14;
                            unsafe9 = unsafe3;
                            obj6 = obj2;
                            i46 = i13;
                            i43 = i9;
                            i44 = i12;
                        }
                    }
                    i15 = i2;
                    i16 = i10;
                    unsafe3 = unsafe2;
                    zzigzVar2 = this;
                    zzo = zzidx.zzo(i16, bArr, i11, i2, zzh(obj), zzidwVar);
                    i42 = i6;
                    i49 = i16;
                    zzidwVar7 = zzidwVar2;
                    zzigzVar3 = zzigzVar2;
                    i41 = i15;
                    i50 = i4;
                    i45 = zzo;
                    i47 = i14;
                    unsafe9 = unsafe3;
                    obj6 = obj2;
                    i46 = i13;
                    i43 = i9;
                    i44 = i12;
                } else {
                    zzigzVar = this;
                    i5 = i2;
                    i8 = i10;
                    unsafe = unsafe2;
                    i45 = i11;
                    i7 = i48;
                }
            } else {
                str = "Failed to parse the message.";
                obj2 = obj6;
                i4 = i50;
                unsafe = unsafe9;
                i5 = i41;
                zzigzVar = zzigzVar3;
                i6 = i42;
                i7 = i48;
                i8 = i49;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzidw zzidwVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zzidwVar);
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzifm) {
                zzifm zzifmVar = (zzifm) obj;
                zzifmVar.zzbq();
                zzifmVar.zzbb();
                zzifmVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzA = zzA(i);
                int i2 = 1048575 & zzA;
                int zzC = zzC(zzA);
                long j = i2;
                if (zzC != 9) {
                    if (zzC != 60 && zzC != 68) {
                        switch (zzC) {
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
                                ((zzify) zziih.zzl(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzigq) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                }
                if (zzK(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            ((zzifm) obj).zzt.zzd();
            if (this.zzh) {
                ((zzifi) obj).zza.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int i6 = this.zzj[i4];
            int zzA = zzA(i6);
            int[] iArr = this.zzc;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i3 = zzb.getInt(obj, i8);
                }
                i2 = i3;
                i = i8;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzA) != 0 && !zzJ(obj, i6, i, i2, i9)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzM(obj, iArr[i6], i6) && !zzy(obj, zzA, zzq(i6))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC != 50) {
                            continue;
                        } else {
                            zzigq zzigqVar = (zzigq) zziih.zzl(obj, zzA & 1048575);
                            if (!zzigqVar.isEmpty() && ((zzigp) zzr(i6)).zze().zzc.zza() == zziio.MESSAGE) {
                                zziho zzihoVar = null;
                                for (Object obj2 : zzigqVar.values()) {
                                    if (zzihoVar == null) {
                                        zzihoVar = zzihg.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzihoVar.zzl(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zziih.zzl(obj, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zziho zzq = zzq(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzq.zzl(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i9) && !zzy(obj, zzA, zzq(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((zzifi) obj).zza.zze();
    }
}
