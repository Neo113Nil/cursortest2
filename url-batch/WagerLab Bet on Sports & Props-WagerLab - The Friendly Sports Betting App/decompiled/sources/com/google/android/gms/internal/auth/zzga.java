package com.google.android.gms.internal.auth;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.C;
import com.facebook.soloader.Elf64;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i, int i2, zzfx zzfxVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = iArr2;
        this.zzi = i4;
        this.zzj = i5;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i, int i2) {
        zzhj.zzn(obj, zzl(i2) & 1048575, i);
    }

    private final void zzB(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzo(i) & 1048575, obj2);
        zzz(obj, i);
    }

    private final void zzC(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzo(i2) & 1048575, obj2);
        zzA(obj, i, i2);
    }

    private final boolean zzD(Object obj, Object obj2, int i) {
        return zzE(obj, i) == zzE(obj2, i);
    }

    private final boolean zzE(Object obj, int i) {
        int zzl = zzl(i);
        long j = zzl & 1048575;
        if (j != 1048575) {
            return (zzhj.zzc(obj, j) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j2)) != 0;
            case 2:
                return zzhj.zzd(obj, j2) != 0;
            case 3:
                return zzhj.zzd(obj, j2) != 0;
            case 4:
                return zzhj.zzc(obj, j2) != 0;
            case 5:
                return zzhj.zzd(obj, j2) != 0;
            case 6:
                return zzhj.zzc(obj, j2) != 0;
            case 7:
                return zzhj.zzt(obj, j2);
            case 8:
                Object zzf = zzhj.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzef) {
                    return !zzef.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j2) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j2));
            case 11:
                return zzhj.zzc(obj, j2) != 0;
            case 12:
                return zzhj.zzc(obj, j2) != 0;
            case 13:
                return zzhj.zzc(obj, j2) != 0;
            case 14:
                return zzhj.zzd(obj, j2) != 0;
            case 15:
                return zzhj.zzc(obj, j2) != 0;
            case 16:
                return zzhj.zzd(obj, j2) != 0;
            case 17:
                return zzhj.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzE(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzG(Object obj, int i, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i, int i2) {
        return zzhj.zzc(obj, (long) (zzl(i2) & 1048575)) == i;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzd = zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
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
        zzgh zzghVar;
        int i18;
        int i19;
        int i20;
        String str;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzv;
        char charAt10;
        int i25;
        int i26;
        Object obj;
        Field zzv2;
        Object obj2;
        Field zzv3;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String zzd = zzghVar2.zzd();
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
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i33 = charAt15 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt14 = zzd.charAt(i32);
                if (charAt14 < 55296) {
                    break;
                }
                i33 |= (charAt14 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt15 = i33 | (charAt14 << i34);
            i32 = i30;
        }
        if (charAt15 == 0) {
            i4 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt16 = zzd.charAt(i32);
            if (charAt16 >= 55296) {
                int i36 = charAt16 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    charAt9 = zzd.charAt(i35);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i36 |= (charAt9 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                charAt16 = i36 | (charAt9 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int charAt17 = zzd.charAt(i35);
            if (charAt17 >= 55296) {
                int i39 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt8 = zzd.charAt(i38);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i39 |= (charAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt17 = i39 | (charAt8 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt7 = zzd.charAt(i41);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i42 |= (charAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt18 = i42 | (charAt7 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt6 = zzd.charAt(i44);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i45 |= (charAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt19 = i45 | (charAt6 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            charAt = zzd.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt5 = zzd.charAt(i47);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i48 |= (charAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt = i48 | (charAt5 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int charAt20 = zzd.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt4 = zzd.charAt(i50);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i51 |= (charAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt20 = i51 | (charAt4 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int charAt21 = zzd.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt3 = zzd.charAt(i53);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i54 |= (charAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt21 = i54 | (charAt3 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt22 = zzd.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt2 = zzd.charAt(i56);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i57 |= (charAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt22 = i57 | (charAt2 << i58);
                i56 = i8;
            }
            i2 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i59 = charAt20;
            i3 = charAt18;
            i4 = i59;
            iArr = iArr2;
            i5 = charAt19;
            i6 = charAt22;
            i7 = charAt16;
            i32 = i56;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i60 = i6 + i4;
        int i61 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i61];
        int i62 = 0;
        int i63 = 0;
        int i64 = i6;
        int i65 = i60;
        while (i32 < length) {
            int i66 = i32 + 1;
            int charAt23 = zzd.charAt(i32);
            if (charAt23 >= c) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    charAt13 = zzd.charAt(i68);
                    if (charAt13 < c) {
                        break;
                    }
                    i67 |= (charAt13 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                }
                charAt23 = i67 | (charAt13 << i69);
                i16 = i29;
            } else {
                i16 = i66;
            }
            int i70 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i28 = i72 + 1;
                    charAt12 = zzd.charAt(i72);
                    if (charAt12 < c) {
                        break;
                    }
                    i71 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i28;
                }
                charAt24 = i71 | (charAt12 << i73);
                i17 = i28;
            } else {
                i17 = i70;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = charAt24 & 255;
            if (i74 >= 51) {
                int i75 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                zzghVar = zzghVar2;
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = 13;
                    while (true) {
                        i27 = i75 + 1;
                        charAt11 = zzd.charAt(i75);
                        if (charAt11 < c2) {
                            break;
                        }
                        i76 |= (charAt11 & 8191) << i77;
                        i77 += 13;
                        i75 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i76 | (charAt11 << i77);
                    i75 = i27;
                }
                int i78 = i74 - 51;
                i18 = length;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i63 / 3;
                    i26 = i2 + 1;
                    objArr[i79 + i79 + 1] = zze[i2];
                } else {
                    if (i78 == 12 && (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0)) {
                        int i80 = i63 / 3;
                        i26 = i2 + 1;
                        objArr[i80 + i80 + 1] = zze[i2];
                    }
                    int i81 = charAt25 + charAt25;
                    obj = zze[i81];
                    if (obj instanceof Field) {
                        zzv2 = zzv(cls2, (String) obj);
                        zze[i81] = zzv2;
                    } else {
                        zzv2 = (Field) obj;
                    }
                    i19 = charAt23;
                    int i82 = i75;
                    i23 = (int) unsafe.objectFieldOffset(zzv2);
                    int i83 = i81 + 1;
                    obj2 = zze[i83];
                    if (obj2 instanceof Field) {
                        zzv3 = zzv(cls2, (String) obj2);
                        zze[i83] = zzv3;
                    } else {
                        zzv3 = (Field) obj2;
                    }
                    i24 = (int) unsafe.objectFieldOffset(zzv3);
                    str = zzd;
                    i21 = i82;
                    i22 = 0;
                }
                i2 = i26;
                int i812 = charAt25 + charAt25;
                obj = zze[i812];
                if (obj instanceof Field) {
                }
                i19 = charAt23;
                int i822 = i75;
                i23 = (int) unsafe.objectFieldOffset(zzv2);
                int i832 = i812 + 1;
                obj2 = zze[i832];
                if (obj2 instanceof Field) {
                }
                i24 = (int) unsafe.objectFieldOffset(zzv3);
                str = zzd;
                i21 = i822;
                i22 = 0;
            } else {
                zzghVar = zzghVar2;
                i18 = length;
                i19 = charAt23;
                int i84 = i2 + 1;
                Field zzv4 = zzv(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    i20 = i84;
                    int i85 = i63 / 3;
                    objArr[i85 + i85 + 1] = zzv4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        int i86 = i63 / 3;
                        i25 = i2 + 2;
                        objArr[i86 + i86 + 1] = zze[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i20 = i84;
                        if (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0) {
                            int i87 = i63 / 3;
                            i25 = i2 + 2;
                            objArr[i87 + i87 + 1] = zze[i20];
                        }
                    } else if (i74 == 50) {
                        int i88 = i64 + 1;
                        iArr[i64] = i63;
                        int i89 = i63 / 3;
                        i20 = i2 + 2;
                        int i90 = i89 + i89;
                        objArr[i90] = zze[i84];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i90 + 1] = zze[i20];
                            i20 = i2 + 3;
                        }
                        i64 = i88;
                    } else {
                        i20 = i84;
                    }
                    i20 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                int i91 = 1048575;
                if ((charAt24 & 4096) == 0 || i74 > 17) {
                    str = zzd;
                    i21 = i17;
                    i22 = 0;
                } else {
                    int i92 = i17 + 1;
                    int charAt26 = zzd.charAt(i17);
                    if (charAt26 >= 55296) {
                        int i93 = charAt26 & 8191;
                        int i94 = 13;
                        while (true) {
                            i21 = i92 + 1;
                            charAt10 = zzd.charAt(i92);
                            if (charAt10 < 55296) {
                                break;
                            }
                            i93 |= (charAt10 & 8191) << i94;
                            i94 += 13;
                            i92 = i21;
                        }
                        charAt26 = i93 | (charAt10 << i94);
                    } else {
                        i21 = i92;
                    }
                    int i95 = i7 + i7 + (charAt26 / 32);
                    Object obj3 = zze[i95];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzv = (Field) obj3;
                    } else {
                        zzv = zzv(cls2, (String) obj3);
                        zze[i95] = zzv;
                    }
                    i22 = charAt26 % 32;
                    i91 = (int) unsafe.objectFieldOffset(zzv);
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i65] = objectFieldOffset;
                    i65++;
                }
                i23 = objectFieldOffset;
                i24 = i91;
                i2 = i20;
            }
            int i96 = i63 + 1;
            iArr3[i63] = i19;
            int i97 = i63 + 2;
            iArr3[i96] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? C.BUFFER_FLAG_LAST_SAMPLE : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i23;
            i63 += 3;
            iArr3[i97] = (i22 << 20) | i24;
            i32 = i21;
            zzghVar2 = zzghVar;
            zzd = str;
            length = i18;
            c = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i3, i5, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i6, i60, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j) {
        return ((Integer) zzhj.zzf(obj, j)).intValue();
    }

    private final int zzl(int i) {
        return this.zzc[i + 2];
    }

    private final int zzm(int i, int i2) {
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

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzhj.zzf(obj, j)).longValue();
    }

    private final zzey zzq(int i) {
        int i2 = i / 3;
        return (zzey) this.zzd[i2 + i2 + 1];
    }

    private final zzgi zzr(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgi zzgiVar = (zzgi) this.zzd[i3];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzb2 = zzgf.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzs(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzt(Object obj, int i) {
        zzgi zzr = zzr(i);
        int zzo = zzo(i) & 1048575;
        if (!zzE(obj, i)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private final Object zzu(Object obj, int i, int i2) {
        zzgi zzr = zzr(i2);
        if (!zzI(obj, i, i2)) {
            return zzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i2) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private static Field zzv(Class cls, String str) {
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

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzx(Object obj, Object obj2, int i) {
        if (zzE(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i);
            if (!zzE(obj, i)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzz(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzI(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgi zzr = zzr(i);
            if (!zzI(obj, i2, i)) {
                if (zzH(object)) {
                    Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzA(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i) {
        int zzl = zzl(i);
        long j = 1048575 & zzl;
        if (j == 1048575) {
            return;
        }
        zzhj.zzn(obj, j, (1 << (zzl >>> 20)) | zzhj.zzc(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzo = zzo(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzo;
            int i5 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j));
                    byte[] bArr = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr2 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr3 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr4 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = zzfa.zza(zzhj.zzt(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zzhj.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr5 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr6 = zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object zzf2 = zzhj.zzf(obj, j);
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
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j)).floatValue());
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j)).booleanValue());
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cb1, code lost:
    
        if (r14 == 1048575) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0cb3, code lost:
    
        r29.putInt(r10, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0cb9, code lost:
    
        r1 = r34.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0cbd, code lost:
    
        if (r1 >= r34.zzj) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0cbf, code lost:
    
        r2 = r34.zzh[r1];
        r5 = r34.zzc[r2];
        r5 = com.google.android.gms.internal.auth.zzhj.zzf(r10, zzo(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0cd5, code lost:
    
        if (r5 != null) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0cdc, code lost:
    
        if (zzq(r2) != null) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0ce1, code lost:
    
        r5 = (com.google.android.gms.internal.auth.zzfr) r5;
        r1 = (com.google.android.gms.internal.auth.zzfq) zzs(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0ce9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0cde, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0cea, code lost:
    
        if (r7 != 0) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0cec, code lost:
    
        if (r3 != r4) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0cf3, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0cf8, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0cf4, code lost:
    
        if (r3 > r4) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0cf6, code lost:
    
        if (r6 != r7) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0cfd, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0c63 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0c75 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x09fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0c7f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzb(Object obj, byte[] bArr, int i, int i2, int i3, zzdt zzdtVar) throws IOException {
        int i4;
        Unsafe unsafe;
        Object obj2;
        int i5;
        int zzm;
        int i6;
        byte[] bArr2;
        int i7;
        int i8;
        zzdt zzdtVar2;
        zzdt zzdtVar3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int zzj;
        int i17;
        int i18;
        int zzh;
        int i19;
        int i20;
        int i21;
        int i22;
        int zzk;
        int i23;
        zzdt zzdtVar4;
        int i24;
        int zza2;
        int zzh2;
        int i25;
        int i26;
        int i27;
        Object obj3;
        int i28;
        Unsafe unsafe2;
        int i29;
        Unsafe unsafe3;
        byte[] bArr3;
        Object obj4;
        int i30;
        zzdt zzdtVar5;
        int i31;
        Unsafe unsafe4;
        Object obj5;
        int i32;
        int i33;
        Object obj6 = obj;
        byte[] bArr4 = bArr;
        int i34 = i2;
        zzdt zzdtVar6 = zzdtVar;
        zzw(obj6);
        Unsafe unsafe5 = zzb;
        int i35 = 0;
        int i36 = i;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = -1;
        int i41 = 1048575;
        while (true) {
            if (i36 < i34) {
                int i42 = i36 + 1;
                int i43 = bArr4[i36];
                if (i43 < 0) {
                    i42 = zzdu.zzi(i43, bArr4, i42, zzdtVar6);
                    i43 = zzdtVar6.zza;
                }
                int i44 = i42;
                int i45 = i43;
                i36 = i44;
                int i46 = i45 >>> 3;
                if (i46 > i40) {
                    int i47 = i37 / 3;
                    if (i46 >= this.zze && i46 <= this.zzf) {
                        zzm = zzm(i46, i47);
                        if (zzm == -1) {
                            int i48 = i45 & 7;
                            int[] iArr = this.zzc;
                            int i49 = iArr[zzm + 1];
                            int i50 = zzm;
                            int zzn = zzn(i49);
                            int i51 = i45;
                            long j = i49 & 1048575;
                            if (zzn > 17) {
                                Unsafe unsafe6 = unsafe5;
                                obj2 = obj6;
                                i7 = i50;
                                if (zzn != 27) {
                                    unsafe = unsafe6;
                                    i8 = i41;
                                    i9 = i39;
                                    i11 = i36;
                                    zzdtVar3 = zzdtVar;
                                    if (zzn > 49) {
                                        i10 = i51;
                                        if (zzn != 50) {
                                            Unsafe unsafe7 = zzb;
                                            long j2 = iArr[i7 + 2] & 1048575;
                                            switch (zzn) {
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                    i19 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 1) {
                                                        unsafe7.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr2, i21))));
                                                        i22 = i21 + 8;
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = i22;
                                                        if (i36 != i21) {
                                                            i4 = i3;
                                                            i7 = i20;
                                                            i6 = i19;
                                                            i39 = i9;
                                                            break;
                                                        } else {
                                                            i34 = i2;
                                                            bArr4 = bArr2;
                                                            obj6 = obj2;
                                                            i40 = i46;
                                                            zzdtVar6 = zzdtVar2;
                                                            i37 = i20;
                                                            i38 = i19;
                                                            i41 = i8;
                                                            i39 = i9;
                                                            unsafe5 = unsafe;
                                                            i35 = 0;
                                                        }
                                                    }
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                case 52:
                                                    i19 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 5) {
                                                        unsafe7.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr2, i21))));
                                                        i22 = i21 + 4;
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = i22;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    i19 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 0) {
                                                        zzk = zzdu.zzk(bArr2, i21, zzdtVar2);
                                                        unsafe7.putObject(obj2, j, Long.valueOf(zzdtVar2.zzb));
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = zzk;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case 55:
                                                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                                                    i19 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 0) {
                                                        zzk = zzdu.zzh(bArr2, i21, zzdtVar2);
                                                        unsafe7.putObject(obj2, j, Integer.valueOf(zzdtVar2.zza));
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = zzk;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    i19 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 1) {
                                                        unsafe7.putObject(obj2, j, Long.valueOf(zzdu.zzn(bArr2, i21)));
                                                        i22 = i21 + 8;
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = i22;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    i19 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 5) {
                                                        unsafe7.putObject(obj2, j, Integer.valueOf(zzdu.zzb(bArr2, i21)));
                                                        i22 = i21 + 4;
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = i22;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                                                    i23 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 0) {
                                                        zzk = zzdu.zzk(bArr2, i21, zzdtVar2);
                                                        i19 = i23;
                                                        unsafe7.putObject(obj2, j, Boolean.valueOf(zzdtVar2.zzb != 0));
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = zzk;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i19 = i23;
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case 59:
                                                    i23 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 2) {
                                                        int zzh3 = zzdu.zzh(bArr2, i21, zzdtVar2);
                                                        int i52 = zzdtVar2.zza;
                                                        if (i52 == 0) {
                                                            unsafe7.putObject(obj2, j, "");
                                                        } else {
                                                            if ((i49 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 && !zzhn.zzc(bArr2, zzh3, zzh3 + i52)) {
                                                                throw zzfb.zzb();
                                                            }
                                                            unsafe7.putObject(obj2, j, new String(bArr2, zzh3, i52, zzfa.zzb));
                                                            zzh3 += i52;
                                                        }
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = zzh3;
                                                        i19 = i23;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i19 = i23;
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case 60:
                                                    bArr2 = bArr;
                                                    if (i48 == 2) {
                                                        Object zzu = zzu(obj2, i46, i7);
                                                        int zzm2 = zzdu.zzm(zzu, zzr(i7), bArr2, i11, i2, zzdtVar3);
                                                        zzdtVar2 = zzdtVar3;
                                                        bArr2 = bArr2;
                                                        zzC(obj2, i46, i7, zzu);
                                                        i36 = zzm2;
                                                        i20 = i7;
                                                        i19 = i10;
                                                        i21 = i11;
                                                        if (i36 != i21) {
                                                        }
                                                    } else {
                                                        zzdtVar2 = zzdtVar3;
                                                        i20 = i7;
                                                        i19 = i10;
                                                        i21 = i11;
                                                        i36 = i21;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    break;
                                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                    zzdtVar4 = zzdtVar3;
                                                    i24 = i10;
                                                    bArr2 = bArr;
                                                    if (i48 == 2) {
                                                        zza2 = zzdu.zza(bArr2, i11, zzdtVar4);
                                                        unsafe7.putObject(obj2, j, zzdtVar4.zzc);
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = zza2;
                                                        i20 = i7;
                                                        i19 = i24;
                                                        i21 = i11;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i36 != i21) {
                                                        }
                                                    } else {
                                                        i20 = i7;
                                                        i19 = i24;
                                                        i21 = i11;
                                                        zzdtVar2 = zzdtVar4;
                                                        i36 = i21;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    break;
                                                case 63:
                                                    zzdtVar4 = zzdtVar3;
                                                    i19 = i10;
                                                    i20 = i7;
                                                    bArr2 = bArr;
                                                    if (i48 == 0) {
                                                        zza2 = zzdu.zzh(bArr2, i11, zzdtVar4);
                                                        int i53 = zzdtVar4.zza;
                                                        i7 = i20;
                                                        zzey zzq = zzq(i7);
                                                        if (zzq == null || zzq.zza()) {
                                                            i24 = i19;
                                                            unsafe7.putObject(obj2, j, Integer.valueOf(i53));
                                                            unsafe7.putInt(obj2, j2, i46);
                                                        } else {
                                                            i24 = i19;
                                                            zzc(obj2).zzh(i24, Long.valueOf(i53));
                                                        }
                                                        i36 = zza2;
                                                        i20 = i7;
                                                        i19 = i24;
                                                        i21 = i11;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar4;
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                                    zzdtVar4 = zzdtVar3;
                                                    i19 = i10;
                                                    i20 = i7;
                                                    bArr2 = bArr;
                                                    if (i48 == 0) {
                                                        zzh2 = zzdu.zzh(bArr2, i11, zzdtVar4);
                                                        unsafe7.putObject(obj2, j, Integer.valueOf(zzej.zzb(zzdtVar4.zza)));
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = zzh2;
                                                        i21 = i11;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar4;
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                                case 67:
                                                    zzdtVar4 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    if (i48 == 0) {
                                                        zzh2 = zzdu.zzk(bArr2, i11, zzdtVar4);
                                                        i19 = i10;
                                                        i20 = i7;
                                                        unsafe7.putObject(obj2, j, Long.valueOf(zzej.zzc(zzdtVar4.zzb)));
                                                        unsafe7.putInt(obj2, j2, i46);
                                                        i36 = zzh2;
                                                        i21 = i11;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i36 != i21) {
                                                        }
                                                    } else {
                                                        i19 = i10;
                                                        i20 = i7;
                                                        i21 = i11;
                                                        zzdtVar2 = zzdtVar4;
                                                        i36 = i21;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    break;
                                                case 68:
                                                    if (i48 == 3) {
                                                        Object zzu2 = zzu(obj2, i46, i7);
                                                        int zzl = zzdu.zzl(zzu2, zzr(i7), bArr, i11, i2, (i10 & (-8)) | 4, zzdtVar);
                                                        bArr2 = bArr;
                                                        zzdtVar4 = zzdtVar;
                                                        zzC(obj2, i46, i7, zzu2);
                                                        i36 = zzl;
                                                        i19 = i10;
                                                        i20 = i7;
                                                        i21 = i11;
                                                        zzdtVar2 = zzdtVar4;
                                                        if (i36 != i21) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    i19 = i10;
                                                    i20 = i7;
                                                    i21 = i11;
                                                    zzdtVar2 = zzdtVar3;
                                                    bArr2 = bArr;
                                                    i36 = i21;
                                                    if (i36 != i21) {
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i48 == 2) {
                                                Unsafe unsafe8 = zzb;
                                                Object zzs = zzs(i7);
                                                Object object = unsafe8.getObject(obj2, j);
                                                if (!((zzfr) object).zze()) {
                                                    zzfr zzb2 = zzfr.zza().zzb();
                                                    zzfs.zza(zzb2, object);
                                                    unsafe8.putObject(obj2, j, zzb2);
                                                }
                                                throw null;
                                            }
                                            i4 = i3;
                                            i6 = i10;
                                            i36 = i11;
                                            i39 = i9;
                                            zzdtVar2 = zzdtVar3;
                                            bArr2 = bArr;
                                        }
                                    } else {
                                        long j3 = i49;
                                        Unsafe unsafe9 = zzb;
                                        zzez zzezVar = (zzez) unsafe9.getObject(obj2, j);
                                        if (!zzezVar.zzc()) {
                                            int size = zzezVar.size();
                                            zzezVar = zzezVar.zzd(size != 0 ? size + size : 10);
                                            unsafe9.putObject(obj2, j, zzezVar);
                                        }
                                        switch (zzn) {
                                            case 18:
                                            case 35:
                                                zzez zzezVar2 = zzezVar;
                                                i12 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 != 2) {
                                                    if (i48 == 1) {
                                                        zzek zzekVar = (zzek) zzezVar2;
                                                        zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i13)));
                                                        i14 = i13 + 8;
                                                        while (i14 < i2) {
                                                            int zzh4 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i12 == zzdtVar3.zza) {
                                                                zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, zzh4)));
                                                                i14 = zzh4 + 8;
                                                            }
                                                        }
                                                    }
                                                    i11 = i13;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                        i4 = i3;
                                                        zzdtVar2 = zzdtVar3;
                                                        i6 = i12;
                                                        i39 = i9;
                                                        bArr2 = bArr;
                                                        break;
                                                    } else {
                                                        bArr4 = bArr;
                                                        i37 = i7;
                                                        obj6 = obj2;
                                                        i40 = i46;
                                                        i41 = i8;
                                                        i39 = i9;
                                                        unsafe5 = unsafe;
                                                        i35 = 0;
                                                        zzdtVar6 = zzdtVar3;
                                                        i38 = i12;
                                                        i34 = i2;
                                                    }
                                                } else {
                                                    zzek zzekVar2 = (zzek) zzezVar2;
                                                    i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                    int i54 = zzdtVar3.zza + i14;
                                                    while (i14 < i54) {
                                                        zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr, i14)));
                                                        i14 += 8;
                                                    }
                                                    if (i14 != i54) {
                                                        throw zzfb.zzf();
                                                    }
                                                }
                                                i36 = i14;
                                                i11 = i13;
                                                if (i36 == i11) {
                                                }
                                            case 19:
                                            case 36:
                                                zzez zzezVar3 = zzezVar;
                                                i12 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    zzer zzerVar = (zzer) zzezVar3;
                                                    i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                    int i55 = zzdtVar3.zza + i14;
                                                    while (i14 < i55) {
                                                        zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i14)));
                                                        i14 += 4;
                                                    }
                                                    if (i14 != i55) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i48 == 5) {
                                                        zzer zzerVar2 = (zzer) zzezVar3;
                                                        zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, i13)));
                                                        i14 = i13 + 4;
                                                        while (i14 < i2) {
                                                            int zzh5 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i12 == zzdtVar3.zza) {
                                                                zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, zzh5)));
                                                                i14 = zzh5 + 4;
                                                            }
                                                        }
                                                    }
                                                    i11 = i13;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i36 = i14;
                                                i11 = i13;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                zzez zzezVar4 = zzezVar;
                                                i12 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    zzfm zzfmVar = (zzfm) zzezVar4;
                                                    i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                    int i56 = zzdtVar3.zza + i14;
                                                    while (i14 < i56) {
                                                        i14 = zzdu.zzk(bArr, i14, zzdtVar3);
                                                        zzfmVar.zze(zzdtVar3.zzb);
                                                    }
                                                    if (i14 != i56) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        zzfm zzfmVar2 = (zzfm) zzezVar4;
                                                        i14 = zzdu.zzk(bArr, i13, zzdtVar3);
                                                        zzfmVar2.zze(zzdtVar3.zzb);
                                                        while (i14 < i2) {
                                                            int zzh6 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i12 == zzdtVar3.zza) {
                                                                i14 = zzdu.zzk(bArr, zzh6, zzdtVar3);
                                                                zzfmVar2.zze(zzdtVar3.zzb);
                                                            }
                                                        }
                                                    }
                                                    i11 = i13;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i36 = i14;
                                                i11 = i13;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                i15 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    i14 = zzdu.zzf(bArr, i13, zzezVar, zzdtVar3);
                                                    i12 = i15;
                                                    i36 = i14;
                                                    i11 = i13;
                                                    if (i36 == i11) {
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        int zzj2 = zzdu.zzj(i15, bArr, i13, i2, zzezVar, zzdtVar3);
                                                        i12 = i15;
                                                        i36 = zzj2;
                                                        i11 = i13;
                                                        if (i36 == i11) {
                                                        }
                                                    }
                                                    i12 = i15;
                                                    i11 = i13;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                i15 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    zzfm zzfmVar3 = (zzfm) zzezVar;
                                                    i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                    int i57 = zzdtVar3.zza + i14;
                                                    while (i14 < i57) {
                                                        zzfmVar3.zze(zzdu.zzn(bArr, i14));
                                                        i14 += 8;
                                                    }
                                                    if (i14 != i57) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i48 == 1) {
                                                        zzfm zzfmVar4 = (zzfm) zzezVar;
                                                        zzfmVar4.zze(zzdu.zzn(bArr, i13));
                                                        i14 = i13 + 8;
                                                        while (i14 < i2) {
                                                            int zzh7 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i15 == zzdtVar3.zza) {
                                                                zzfmVar4.zze(zzdu.zzn(bArr, zzh7));
                                                                i14 = zzh7 + 8;
                                                            }
                                                        }
                                                    }
                                                    i12 = i15;
                                                    i11 = i13;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i15;
                                                i36 = i14;
                                                i11 = i13;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                i15 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    zzew zzewVar = (zzew) zzezVar;
                                                    i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                    int i58 = zzdtVar3.zza + i14;
                                                    while (i14 < i58) {
                                                        zzewVar.zze(zzdu.zzb(bArr, i14));
                                                        i14 += 4;
                                                    }
                                                    if (i14 != i58) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i48 == 5) {
                                                        zzew zzewVar2 = (zzew) zzezVar;
                                                        zzewVar2.zze(zzdu.zzb(bArr, i13));
                                                        i14 = i13 + 4;
                                                        while (i14 < i2) {
                                                            int zzh8 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i15 == zzdtVar3.zza) {
                                                                zzewVar2.zze(zzdu.zzb(bArr, zzh8));
                                                                i14 = zzh8 + 4;
                                                            }
                                                        }
                                                    }
                                                    i12 = i15;
                                                    i11 = i13;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i15;
                                                i36 = i14;
                                                i11 = i13;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                i15 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    zzdv zzdvVar = (zzdv) zzezVar;
                                                    i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                    int i59 = zzdtVar3.zza + i14;
                                                    while (i14 < i59) {
                                                        i14 = zzdu.zzk(bArr, i14, zzdtVar3);
                                                        zzdvVar.zze(zzdtVar3.zzb != 0);
                                                    }
                                                    if (i14 != i59) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        zzdv zzdvVar2 = (zzdv) zzezVar;
                                                        i14 = zzdu.zzk(bArr, i13, zzdtVar3);
                                                        zzdvVar2.zze(zzdtVar3.zzb != 0);
                                                        while (i14 < i2) {
                                                            int zzh9 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i15 == zzdtVar3.zza) {
                                                                i14 = zzdu.zzk(bArr, zzh9, zzdtVar3);
                                                                zzdvVar2.zze(zzdtVar3.zzb != 0);
                                                            }
                                                        }
                                                    }
                                                    i12 = i15;
                                                    i11 = i13;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i15;
                                                i36 = i14;
                                                i11 = i13;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 26:
                                                i15 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    if ((j3 & 536870912) == 0) {
                                                        i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                        int i60 = zzdtVar3.zza;
                                                        if (i60 < 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i60 == 0) {
                                                            zzezVar.add("");
                                                        } else {
                                                            zzezVar.add(new String(bArr, i14, i60, zzfa.zzb));
                                                            i14 += i60;
                                                        }
                                                        while (i14 < i2) {
                                                            int zzh10 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i15 == zzdtVar3.zza) {
                                                                i14 = zzdu.zzh(bArr, zzh10, zzdtVar3);
                                                                int i61 = zzdtVar3.zza;
                                                                if (i61 < 0) {
                                                                    throw zzfb.zzc();
                                                                }
                                                                if (i61 == 0) {
                                                                    zzezVar.add("");
                                                                } else {
                                                                    zzezVar.add(new String(bArr, i14, i61, zzfa.zzb));
                                                                    i14 += i61;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                        int i62 = zzdtVar3.zza;
                                                        if (i62 < 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i62 == 0) {
                                                            zzezVar.add("");
                                                        } else {
                                                            int i63 = i14 + i62;
                                                            if (!zzhn.zzc(bArr, i14, i63)) {
                                                                throw zzfb.zzb();
                                                            }
                                                            zzezVar.add(new String(bArr, i14, i62, zzfa.zzb));
                                                            i14 = i63;
                                                        }
                                                        while (i14 < i2) {
                                                            int zzh11 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                            if (i15 == zzdtVar3.zza) {
                                                                i14 = zzdu.zzh(bArr, zzh11, zzdtVar3);
                                                                int i64 = zzdtVar3.zza;
                                                                if (i64 < 0) {
                                                                    throw zzfb.zzc();
                                                                }
                                                                if (i64 == 0) {
                                                                    zzezVar.add("");
                                                                } else {
                                                                    int i65 = i14 + i64;
                                                                    if (!zzhn.zzc(bArr, i14, i65)) {
                                                                        throw zzfb.zzb();
                                                                    }
                                                                    zzezVar.add(new String(bArr, i14, i64, zzfa.zzb));
                                                                    i14 = i65;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i12 = i15;
                                                    i36 = i14;
                                                    i11 = i13;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i15;
                                                i11 = i13;
                                                i36 = i11;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 27:
                                                i15 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    int zze = zzdu.zze(zzr(i7), i15, bArr, i13, i2, zzezVar, zzdtVar3);
                                                    i13 = i13;
                                                    i12 = i15;
                                                    i36 = zze;
                                                    zzdtVar3 = zzdtVar3;
                                                    i11 = i13;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i15;
                                                i11 = i13;
                                                i36 = i11;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 28:
                                                i15 = i51;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 2) {
                                                    i14 = zzdu.zzh(bArr, i13, zzdtVar3);
                                                    int i66 = zzdtVar3.zza;
                                                    if (i66 < 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i66 > bArr.length - i14) {
                                                        throw zzfb.zzf();
                                                    }
                                                    if (i66 == 0) {
                                                        zzezVar.add(zzef.zzb);
                                                    } else {
                                                        zzezVar.add(zzef.zzk(bArr, i14, i66));
                                                        i14 += i66;
                                                    }
                                                    while (i14 < i2) {
                                                        int zzh12 = zzdu.zzh(bArr, i14, zzdtVar3);
                                                        if (i15 == zzdtVar3.zza) {
                                                            i14 = zzdu.zzh(bArr, zzh12, zzdtVar3);
                                                            int i67 = zzdtVar3.zza;
                                                            if (i67 < 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i67 > bArr.length - i14) {
                                                                throw zzfb.zzf();
                                                            }
                                                            if (i67 == 0) {
                                                                zzezVar.add(zzef.zzb);
                                                            } else {
                                                                zzezVar.add(zzef.zzk(bArr, i14, i67));
                                                                i14 += i67;
                                                            }
                                                        } else {
                                                            i12 = i15;
                                                            i36 = i14;
                                                            i11 = i13;
                                                            if (i36 == i11) {
                                                            }
                                                        }
                                                    }
                                                    i12 = i15;
                                                    i36 = i14;
                                                    i11 = i13;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i15;
                                                i11 = i13;
                                                i36 = i11;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                if (i48 == 2) {
                                                    zzj = zzdu.zzf(bArr, i11, zzezVar, zzdtVar3);
                                                    i16 = i51;
                                                    i17 = i11;
                                                } else if (i48 == 0) {
                                                    i16 = i51;
                                                    zzj = zzdu.zzj(i16, bArr, i11, i2, zzezVar, zzdtVar3);
                                                    i17 = i11;
                                                } else {
                                                    i7 = i7;
                                                    i12 = i51;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i7 = i7;
                                                zzey zzq2 = zzq(i7);
                                                zzgz zzgzVar = this.zzl;
                                                int i68 = zzgk.zza;
                                                if (zzq2 == null) {
                                                    i18 = zzj;
                                                } else if (zzezVar instanceof RandomAccess) {
                                                    int size2 = zzezVar.size();
                                                    Object obj7 = null;
                                                    int i69 = 0;
                                                    int i70 = 0;
                                                    while (i69 < size2) {
                                                        int i71 = zzj;
                                                        int intValue = ((Integer) zzezVar.get(i69)).intValue();
                                                        if (zzq2.zza()) {
                                                            if (i69 != i70) {
                                                                zzezVar.set(i70, Integer.valueOf(intValue));
                                                            }
                                                            i70++;
                                                        } else {
                                                            obj7 = zzgk.zzc(obj2, i46, intValue, obj7, zzgzVar);
                                                        }
                                                        i69++;
                                                        zzj = i71;
                                                    }
                                                    i18 = zzj;
                                                    if (i70 != size2) {
                                                        zzezVar.subList(i70, size2).clear();
                                                    }
                                                } else {
                                                    i18 = zzj;
                                                    Iterator it = zzezVar.iterator();
                                                    Object obj8 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzq2.zza()) {
                                                            obj8 = zzgk.zzc(obj2, i46, intValue2, obj8, zzgzVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                i12 = i16;
                                                i11 = i17;
                                                i36 = i18;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                if (i48 == 2) {
                                                    zzew zzewVar3 = (zzew) zzezVar;
                                                    zzh = zzdu.zzh(bArr, i11, zzdtVar3);
                                                    int i72 = zzdtVar3.zza + zzh;
                                                    while (zzh < i72) {
                                                        zzh = zzdu.zzh(bArr, zzh, zzdtVar3);
                                                        zzewVar3.zze(zzej.zzb(zzdtVar3.zza));
                                                    }
                                                    if (zzh != i72) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        zzew zzewVar4 = (zzew) zzezVar;
                                                        zzh = zzdu.zzh(bArr, i11, zzdtVar3);
                                                        zzewVar4.zze(zzej.zzb(zzdtVar3.zza));
                                                        while (zzh < i2) {
                                                            int zzh13 = zzdu.zzh(bArr, zzh, zzdtVar3);
                                                            if (i51 == zzdtVar3.zza) {
                                                                zzh = zzdu.zzh(bArr, zzh13, zzdtVar3);
                                                                zzewVar4.zze(zzej.zzb(zzdtVar3.zza));
                                                            }
                                                        }
                                                    }
                                                    i12 = i51;
                                                    i7 = i7;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i51;
                                                i7 = i7;
                                                i36 = zzh;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                if (i48 == 2) {
                                                    zzfm zzfmVar5 = (zzfm) zzezVar;
                                                    zzh = zzdu.zzh(bArr, i11, zzdtVar3);
                                                    int i73 = zzdtVar3.zza + zzh;
                                                    while (zzh < i73) {
                                                        zzh = zzdu.zzk(bArr, zzh, zzdtVar3);
                                                        zzfmVar5.zze(zzej.zzc(zzdtVar3.zzb));
                                                    }
                                                    if (zzh != i73) {
                                                        throw zzfb.zzf();
                                                    }
                                                } else {
                                                    if (i48 == 0) {
                                                        zzfm zzfmVar6 = (zzfm) zzezVar;
                                                        zzh = zzdu.zzk(bArr, i11, zzdtVar3);
                                                        zzfmVar6.zze(zzej.zzc(zzdtVar3.zzb));
                                                        while (zzh < i2) {
                                                            int zzh14 = zzdu.zzh(bArr, zzh, zzdtVar3);
                                                            if (i51 == zzdtVar3.zza) {
                                                                zzh = zzdu.zzk(bArr, zzh14, zzdtVar3);
                                                                zzfmVar6.zze(zzej.zzc(zzdtVar3.zzb));
                                                            }
                                                        }
                                                    }
                                                    i12 = i51;
                                                    i7 = i7;
                                                    i36 = i11;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i12 = i51;
                                                i7 = i7;
                                                i36 = zzh;
                                                if (i36 == i11) {
                                                }
                                                break;
                                            default:
                                                zzez zzezVar5 = zzezVar;
                                                i12 = i51;
                                                int i74 = i2;
                                                i13 = i11;
                                                i7 = i7;
                                                if (i48 == 3) {
                                                    zzgi zzr = zzr(i7);
                                                    int i75 = (i12 & (-8)) | 4;
                                                    int zzc = zzdu.zzc(zzr, bArr, i13, i74, i75, zzdtVar3);
                                                    i11 = i13;
                                                    zzezVar5.add(zzdtVar3.zzc);
                                                    while (zzc < i74) {
                                                        int zzh15 = zzdu.zzh(bArr, zzc, zzdtVar3);
                                                        if (i12 == zzdtVar3.zza) {
                                                            zzc = zzdu.zzc(zzr, bArr, zzh15, i74, i75, zzdtVar3);
                                                            zzezVar5.add(zzdtVar3.zzc);
                                                            i74 = i2;
                                                        } else {
                                                            i36 = zzc;
                                                            if (i36 == i11) {
                                                            }
                                                        }
                                                    }
                                                    i36 = zzc;
                                                    if (i36 == i11) {
                                                    }
                                                }
                                                i11 = i13;
                                                i36 = i11;
                                                if (i36 == i11) {
                                                }
                                                break;
                                        }
                                    }
                                } else if (i48 == 2) {
                                    zzez zzezVar6 = (zzez) unsafe6.getObject(obj2, j);
                                    if (!zzezVar6.zzc()) {
                                        int size3 = zzezVar6.size();
                                        zzezVar6 = zzezVar6.zzd(size3 != 0 ? size3 + size3 : 10);
                                        unsafe6.putObject(obj2, j, zzezVar6);
                                    }
                                    int zze2 = zzdu.zze(zzr(i7), i51, bArr, i36, i2, zzezVar6, zzdtVar);
                                    bArr4 = bArr;
                                    i38 = i51;
                                    i37 = i7;
                                    obj6 = obj2;
                                    i40 = i46;
                                    i35 = 0;
                                    zzdtVar6 = zzdtVar;
                                    i36 = zze2;
                                    unsafe5 = unsafe6;
                                    i34 = i2;
                                } else {
                                    zzdtVar3 = zzdtVar;
                                    unsafe = unsafe6;
                                    i8 = i41;
                                    i9 = i39;
                                    i10 = i51;
                                    i11 = i36;
                                    i4 = i3;
                                    i6 = i10;
                                    i36 = i11;
                                    i39 = i9;
                                    zzdtVar2 = zzdtVar3;
                                    bArr2 = bArr;
                                }
                            } else {
                                int i76 = iArr[i50 + 2];
                                int i77 = 1 << (i76 >>> 20);
                                int i78 = i76 & 1048575;
                                if (i78 != i41) {
                                    int i79 = 1048575;
                                    if (i41 != 1048575) {
                                        unsafe5.putInt(obj6, i41, i39);
                                        i79 = 1048575;
                                    }
                                    i39 = i78 == i79 ? 0 : unsafe5.getInt(obj6, i78);
                                    i41 = i78;
                                }
                                switch (zzn) {
                                    case 0:
                                        zzdtVar6 = zzdtVar;
                                        i25 = i36;
                                        i26 = i41;
                                        i7 = i50;
                                        i27 = 0;
                                        obj3 = obj6;
                                        i28 = i39;
                                        unsafe2 = unsafe5;
                                        if (i48 != 1) {
                                            i36 = i25;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            zzhj.zzl(obj3, j, Double.longBitsToDouble(zzdu.zzn(bArr4, i25)));
                                            i36 = i25 + 8;
                                            Unsafe unsafe10 = unsafe2;
                                            i39 = i28 | i77;
                                            unsafe5 = unsafe10;
                                            i35 = i27;
                                            i37 = i7;
                                            i40 = i46;
                                            obj6 = obj3;
                                            i38 = i51;
                                            i41 = i26;
                                            i34 = i2;
                                        }
                                    case 1:
                                        zzdtVar6 = zzdtVar;
                                        i25 = i36;
                                        i26 = i41;
                                        i7 = i50;
                                        i27 = 0;
                                        obj3 = obj6;
                                        i28 = i39;
                                        unsafe2 = unsafe5;
                                        if (i48 != 5) {
                                            i36 = i25;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            zzhj.zzm(obj3, j, Float.intBitsToFloat(zzdu.zzb(bArr4, i25)));
                                            i36 = i25 + 4;
                                            Unsafe unsafe102 = unsafe2;
                                            i39 = i28 | i77;
                                            unsafe5 = unsafe102;
                                            i35 = i27;
                                            i37 = i7;
                                            i40 = i46;
                                            obj6 = obj3;
                                            i38 = i51;
                                            i41 = i26;
                                            i34 = i2;
                                        }
                                    case 2:
                                    case 3:
                                        zzdtVar6 = zzdtVar;
                                        i25 = i36;
                                        i26 = i41;
                                        i7 = i50;
                                        i28 = i39;
                                        if (i48 != 0) {
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i36 = i25;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            int zzk2 = zzdu.zzk(bArr4, i25, zzdtVar6);
                                            unsafe5.putLong(obj6, j, zzdtVar6.zzb);
                                            i39 = i28 | i77;
                                            unsafe5 = unsafe5;
                                            i37 = i7;
                                            i36 = zzk2;
                                            i40 = i46;
                                            obj6 = obj6;
                                            i38 = i51;
                                            i41 = i26;
                                            i35 = 0;
                                            i34 = i2;
                                        }
                                    case 4:
                                    case 11:
                                        zzdtVar6 = zzdtVar;
                                        i25 = i36;
                                        i26 = i41;
                                        i7 = i50;
                                        i29 = 0;
                                        i28 = i39;
                                        if (i48 != 0) {
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i36 = i25;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            int zzh16 = zzdu.zzh(bArr4, i25, zzdtVar6);
                                            unsafe5.putInt(obj6, j, zzdtVar6.zza);
                                            i39 = i28 | i77;
                                            i41 = i26;
                                            i36 = zzh16;
                                            i35 = i29;
                                            i37 = i7;
                                            i40 = i46;
                                            i38 = i51;
                                            i34 = i2;
                                        }
                                    case 5:
                                    case 14:
                                        Unsafe unsafe11 = unsafe5;
                                        byte[] bArr5 = bArr4;
                                        i26 = i41;
                                        i7 = i50;
                                        i29 = 0;
                                        Object obj9 = obj6;
                                        i28 = i39;
                                        if (i48 != 1) {
                                            i25 = i36;
                                            obj6 = obj9;
                                            unsafe5 = unsafe11;
                                            unsafe2 = unsafe5;
                                            obj3 = obj6;
                                            i36 = i25;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            long zzn2 = zzdu.zzn(bArr5, i36);
                                            obj6 = obj9;
                                            bArr4 = bArr5;
                                            unsafe5 = unsafe11;
                                            zzdtVar6 = zzdtVar;
                                            unsafe5.putLong(obj6, j, zzn2);
                                            i36 += 8;
                                            i39 = i28 | i77;
                                            i41 = i26;
                                            i35 = i29;
                                            i37 = i7;
                                            i40 = i46;
                                            i38 = i51;
                                            i34 = i2;
                                        }
                                    case 6:
                                    case 13:
                                        unsafe3 = unsafe5;
                                        bArr3 = bArr4;
                                        i26 = i41;
                                        i7 = i50;
                                        i29 = 0;
                                        obj4 = obj6;
                                        i30 = i36;
                                        i28 = i39;
                                        zzdtVar5 = zzdtVar;
                                        if (i48 != 5) {
                                            i36 = i30;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            unsafe3.putInt(obj4, j, zzdu.zzb(bArr3, i30));
                                            i31 = i30 + 4;
                                            i39 = i28 | i77;
                                            Object obj10 = obj4;
                                            bArr4 = bArr3;
                                            unsafe5 = unsafe3;
                                            zzdtVar6 = zzdtVar5;
                                            i36 = i31;
                                            obj6 = obj10;
                                            i41 = i26;
                                            i35 = i29;
                                            i37 = i7;
                                            i40 = i46;
                                            i38 = i51;
                                            i34 = i2;
                                        }
                                    case 7:
                                        unsafe3 = unsafe5;
                                        bArr3 = bArr4;
                                        i26 = i41;
                                        i7 = i50;
                                        i29 = 0;
                                        obj4 = obj6;
                                        i30 = i36;
                                        i28 = i39;
                                        zzdtVar5 = zzdtVar;
                                        if (i48 != 0) {
                                            i36 = i30;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i31 = zzdu.zzk(bArr3, i30, zzdtVar5);
                                            zzhj.zzk(obj4, j, zzdtVar5.zzb != 0);
                                            i39 = i28 | i77;
                                            Object obj102 = obj4;
                                            bArr4 = bArr3;
                                            unsafe5 = unsafe3;
                                            zzdtVar6 = zzdtVar5;
                                            i36 = i31;
                                            obj6 = obj102;
                                            i41 = i26;
                                            i35 = i29;
                                            i37 = i7;
                                            i40 = i46;
                                            i38 = i51;
                                            i34 = i2;
                                        }
                                    case 8:
                                        unsafe3 = unsafe5;
                                        bArr3 = bArr4;
                                        i26 = i41;
                                        int i80 = i39;
                                        i7 = i50;
                                        obj4 = obj6;
                                        i30 = i36;
                                        zzdtVar5 = zzdtVar;
                                        if (i48 != 2) {
                                            i28 = i80;
                                            i36 = i30;
                                            obj3 = obj4;
                                            unsafe2 = unsafe3;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            if ((i49 & C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
                                                i31 = zzdu.zzh(bArr3, i30, zzdtVar5);
                                                int i81 = zzdtVar5.zza;
                                                if (i81 < 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i81 == 0) {
                                                    zzdtVar5.zzc = "";
                                                    i28 = i80;
                                                    i29 = 0;
                                                } else {
                                                    int i82 = zzhn.zza;
                                                    int length = bArr3.length;
                                                    if ((((length - i31) - i81) | i31 | i81) < 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i31), Integer.valueOf(i81)));
                                                    }
                                                    int i83 = i31 + i81;
                                                    char[] cArr = new char[i81];
                                                    int i84 = 0;
                                                    while (i31 < i83) {
                                                        byte b = bArr3[i31];
                                                        if (zzhk.zzd(b)) {
                                                            i31++;
                                                            cArr[i84] = (char) b;
                                                            i84++;
                                                        } else {
                                                            while (i31 < i83) {
                                                                int i85 = i31 + 1;
                                                                int i86 = i31;
                                                                byte b2 = bArr3[i86];
                                                                if (zzhk.zzd(b2)) {
                                                                    int i87 = i84 + 1;
                                                                    cArr[i84] = (char) b2;
                                                                    i31 = i85;
                                                                    while (true) {
                                                                        i84 = i87;
                                                                        if (i31 < i83) {
                                                                            byte b3 = bArr3[i31];
                                                                            if (zzhk.zzd(b3)) {
                                                                                i31++;
                                                                                i87 = i84 + 1;
                                                                                cArr[i84] = (char) b3;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i88 = i80;
                                                                    if (b2 < -32) {
                                                                        if (i85 >= i83) {
                                                                            throw zzfb.zzb();
                                                                        }
                                                                        zzhk.zzc(b2, bArr3[i85], cArr, i84);
                                                                        i31 = i86 + 2;
                                                                        i84++;
                                                                    } else if (b2 < -16) {
                                                                        if (i85 >= i83 - 1) {
                                                                            throw zzfb.zzb();
                                                                        }
                                                                        zzhk.zzb(b2, bArr3[i85], bArr3[i86 + 2], cArr, i84);
                                                                        i31 = i86 + 3;
                                                                        i80 = i88;
                                                                        i84++;
                                                                    } else {
                                                                        if (i85 >= i83 - 2) {
                                                                            throw zzfb.zzb();
                                                                        }
                                                                        char[] cArr2 = cArr;
                                                                        zzhk.zza(b2, bArr3[i85], bArr3[i86 + 2], bArr3[i86 + 3], cArr2, i84);
                                                                        i84 += 2;
                                                                        cArr = cArr2;
                                                                        i31 = i86 + 4;
                                                                    }
                                                                    i80 = i88;
                                                                }
                                                            }
                                                            i28 = i80;
                                                            i29 = 0;
                                                            zzdtVar5.zzc = new String(cArr, 0, i84);
                                                            i31 = i83;
                                                        }
                                                    }
                                                    while (i31 < i83) {
                                                    }
                                                    i28 = i80;
                                                    i29 = 0;
                                                    zzdtVar5.zzc = new String(cArr, 0, i84);
                                                    i31 = i83;
                                                }
                                            } else {
                                                i28 = i80;
                                                i29 = 0;
                                                i31 = zzdu.zzh(bArr3, i30, zzdtVar5);
                                                int i89 = zzdtVar5.zza;
                                                if (i89 < 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i89 == 0) {
                                                    zzdtVar5.zzc = "";
                                                } else {
                                                    zzdtVar5.zzc = new String(bArr3, i31, i89, zzfa.zzb);
                                                    i31 += i89;
                                                }
                                            }
                                            unsafe3.putObject(obj4, j, zzdtVar5.zzc);
                                            i39 = i28 | i77;
                                            Object obj1022 = obj4;
                                            bArr4 = bArr3;
                                            unsafe5 = unsafe3;
                                            zzdtVar6 = zzdtVar5;
                                            i36 = i31;
                                            obj6 = obj1022;
                                            i41 = i26;
                                            i35 = i29;
                                            i37 = i7;
                                            i40 = i46;
                                            i38 = i51;
                                            i34 = i2;
                                        }
                                        break;
                                    case 9:
                                        Object obj11 = obj6;
                                        Unsafe unsafe12 = unsafe5;
                                        i26 = i41;
                                        int i90 = i39;
                                        i7 = i50;
                                        if (i48 != 2) {
                                            i51 = i51;
                                            i36 = i36;
                                            obj3 = obj11;
                                            i28 = i90;
                                            unsafe2 = unsafe12;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            Object zzt = zzt(obj11, i7);
                                            i51 = i51;
                                            byte[] bArr6 = bArr4;
                                            int zzm3 = zzdu.zzm(zzt, zzr(i7), bArr6, i36, i2, zzdtVar);
                                            zzB(obj11, i7, zzt);
                                            i39 = i90 | i77;
                                            bArr4 = bArr6;
                                            unsafe5 = unsafe12;
                                            zzdtVar6 = zzdtVar;
                                            i36 = zzm3;
                                            obj6 = obj11;
                                            i41 = i26;
                                            i34 = i2;
                                            i37 = i7;
                                            i40 = i46;
                                            i38 = i51;
                                            i35 = 0;
                                        }
                                    case 10:
                                        Object obj12 = obj6;
                                        unsafe4 = unsafe5;
                                        obj5 = obj12;
                                        zzdtVar6 = zzdtVar;
                                        i26 = i41;
                                        i32 = i39;
                                        i7 = i50;
                                        i33 = i51;
                                        if (i48 != 2) {
                                            obj3 = obj5;
                                            unsafe2 = unsafe4;
                                            i51 = i33;
                                            i28 = i32;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i36 = zzdu.zza(bArr4, i36, zzdtVar6);
                                            unsafe4.putObject(obj5, j, zzdtVar6.zzc);
                                            i39 = i32 | i77;
                                            Unsafe unsafe13 = unsafe4;
                                            obj6 = obj5;
                                            unsafe5 = unsafe13;
                                            i41 = i26;
                                            i34 = i2;
                                            i38 = i33;
                                            i37 = i7;
                                            i40 = i46;
                                            i35 = 0;
                                        }
                                    case 12:
                                        Object obj13 = obj6;
                                        unsafe4 = unsafe5;
                                        obj5 = obj13;
                                        zzdtVar6 = zzdtVar;
                                        i26 = i41;
                                        i32 = i39;
                                        i7 = i50;
                                        i33 = i51;
                                        if (i48 != 0) {
                                            obj3 = obj5;
                                            unsafe2 = unsafe4;
                                            i51 = i33;
                                            i28 = i32;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i36 = zzdu.zzh(bArr4, i36, zzdtVar6);
                                            int i91 = zzdtVar6.zza;
                                            zzey zzq3 = zzq(i7);
                                            if ((i49 & Integer.MIN_VALUE) == 0 || zzq3 == null || zzq3.zza()) {
                                                unsafe4.putInt(obj5, j, i91);
                                                i39 = i32 | i77;
                                                Unsafe unsafe132 = unsafe4;
                                                obj6 = obj5;
                                                unsafe5 = unsafe132;
                                                i41 = i26;
                                                i34 = i2;
                                                i38 = i33;
                                                i37 = i7;
                                                i40 = i46;
                                                i35 = 0;
                                            } else {
                                                zzc(obj5).zzh(i33, Long.valueOf(i91));
                                                obj6 = obj5;
                                                unsafe5 = unsafe4;
                                                i41 = i26;
                                                i38 = i33;
                                                i39 = i32;
                                                i37 = i7;
                                                i40 = i46;
                                                i35 = 0;
                                                i34 = i2;
                                            }
                                        }
                                        break;
                                    case 15:
                                        Object obj14 = obj6;
                                        Unsafe unsafe14 = unsafe5;
                                        zzdtVar6 = zzdtVar;
                                        i26 = i41;
                                        i32 = i39;
                                        i7 = i50;
                                        if (i48 != 0) {
                                            obj3 = obj14;
                                            unsafe2 = unsafe14;
                                            i28 = i32;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            i36 = zzdu.zzh(bArr4, i36, zzdtVar6);
                                            unsafe14.putInt(obj14, j, zzej.zzb(zzdtVar6.zza));
                                            i39 = i32 | i77;
                                            obj6 = obj14;
                                            unsafe5 = unsafe14;
                                            i41 = i26;
                                            i34 = i2;
                                            i37 = i7;
                                            i40 = i46;
                                            i38 = i51;
                                            i35 = 0;
                                        }
                                    case 16:
                                        if (i48 != 0) {
                                            i7 = i50;
                                            i26 = i41;
                                            i28 = i39;
                                            obj3 = obj6;
                                            unsafe2 = unsafe5;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            zzdtVar6 = zzdtVar;
                                            int zzk3 = zzdu.zzk(bArr4, i36, zzdtVar6);
                                            unsafe5.putLong(obj6, j, zzej.zzc(zzdtVar6.zzb));
                                            i39 |= i77;
                                            obj6 = obj6;
                                            unsafe5 = unsafe5;
                                            i36 = zzk3;
                                            i37 = i50;
                                            i40 = i46;
                                            i38 = i51;
                                            i35 = 0;
                                            i34 = i2;
                                        }
                                    default:
                                        i25 = i36;
                                        i26 = i41;
                                        i7 = i50;
                                        i27 = 0;
                                        obj3 = obj6;
                                        i28 = i39;
                                        unsafe2 = unsafe5;
                                        if (i48 != 3) {
                                            i36 = i25;
                                            bArr2 = bArr;
                                            i8 = i26;
                                            i4 = i3;
                                            obj2 = obj3;
                                            unsafe = unsafe2;
                                            i39 = i28;
                                            i6 = i51;
                                            zzdtVar2 = zzdtVar;
                                            break;
                                        } else {
                                            Object zzt2 = zzt(obj3, i7);
                                            int zzl2 = zzdu.zzl(zzt2, zzr(i7), bArr4, i25, i2, (i46 << 3) | 4, zzdtVar);
                                            zzB(obj3, i7, zzt2);
                                            i39 = i28 | i77;
                                            unsafe5 = unsafe2;
                                            bArr4 = bArr;
                                            zzdtVar6 = zzdtVar;
                                            i36 = zzl2;
                                            i35 = i27;
                                            i37 = i7;
                                            i40 = i46;
                                            obj6 = obj3;
                                            i38 = i51;
                                            i41 = i26;
                                            i34 = i2;
                                        }
                                }
                            }
                        } else {
                            unsafe = unsafe5;
                            i6 = i45;
                            bArr2 = bArr4;
                            i7 = i35;
                            i8 = i41;
                            i4 = i3;
                            zzdtVar2 = zzdtVar6;
                            obj2 = obj6;
                        }
                        if (i6 == i4 || i4 == 0) {
                            i36 = zzdu.zzg(i6, bArr2, i36, i2, zzc(obj2), zzdtVar2);
                            bArr4 = bArr;
                            i38 = i6;
                            i34 = i2;
                            i37 = i7;
                            obj6 = obj2;
                            i40 = i46;
                            i41 = i8;
                            unsafe5 = unsafe;
                            i35 = 0;
                            zzdtVar6 = zzdtVar;
                        } else {
                            i5 = i2;
                            i38 = i6;
                            i41 = i8;
                        }
                    }
                    zzm = -1;
                    if (zzm == -1) {
                    }
                    if (i6 == i4) {
                    }
                    i36 = zzdu.zzg(i6, bArr2, i36, i2, zzc(obj2), zzdtVar2);
                    bArr4 = bArr;
                    i38 = i6;
                    i34 = i2;
                    i37 = i7;
                    obj6 = obj2;
                    i40 = i46;
                    i41 = i8;
                    unsafe5 = unsafe;
                    i35 = 0;
                    zzdtVar6 = zzdtVar;
                } else {
                    if (i46 >= this.zze && i46 <= this.zzf) {
                        zzm = zzm(i46, i35);
                        if (zzm == -1) {
                        }
                        if (i6 == i4) {
                        }
                        i36 = zzdu.zzg(i6, bArr2, i36, i2, zzc(obj2), zzdtVar2);
                        bArr4 = bArr;
                        i38 = i6;
                        i34 = i2;
                        i37 = i7;
                        obj6 = obj2;
                        i40 = i46;
                        i41 = i8;
                        unsafe5 = unsafe;
                        i35 = 0;
                        zzdtVar6 = zzdtVar;
                    }
                    zzm = -1;
                    if (zzm == -1) {
                    }
                    if (i6 == i4) {
                    }
                    i36 = zzdu.zzg(i6, bArr2, i36, i2, zzc(obj2), zzdtVar2);
                    bArr4 = bArr;
                    i38 = i6;
                    i34 = i2;
                    i37 = i7;
                    obj6 = obj2;
                    i40 = i46;
                    i41 = i8;
                    unsafe5 = unsafe;
                    i35 = 0;
                    zzdtVar6 = zzdtVar;
                }
            } else {
                i4 = i3;
                unsafe = unsafe5;
                obj2 = obj6;
                i5 = i34;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzo = zzo(i);
                int i2 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j = i2;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
                        switch (zzn) {
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
                                this.zzk.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i], i)) {
                        zzr(i).zze(zzb.getObject(obj, j));
                    }
                }
                if (zzE(obj, i)) {
                    zzr(i).zze(zzb.getObject(obj, j));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i)) {
                        zzhj.zzl(obj, j, zzhj.zza(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i)) {
                        zzhj.zzm(obj, j, zzhj.zzb(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i)) {
                        zzhj.zzk(obj, j, zzhj.zzt(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i);
                    break;
                case 10:
                    if (zzE(obj2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i);
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
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzgk.zza;
                    zzhj.zzp(obj, j, zzfs.zza(zzhj.zzf(obj, j), zzhj.zzf(obj2, j)));
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
                    if (zzI(obj2, i2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                case 63:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                    if (zzI(obj2, i2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i, i2, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzf;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i) && Double.doubleToLongBits(zzhj.zza(obj, j)) == Double.doubleToLongBits(zzhj.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i) && Float.floatToIntBits(zzhj.zzb(obj, j)) == Float.floatToIntBits(zzhj.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i) && zzhj.zzt(obj, j) == zzhj.zzt(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i) && zzhj.zzc(obj, j) == zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i) && zzhj.zzd(obj, j) == zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
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
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    break;
                case 50:
                    zzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
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
                    long zzl = zzl(i) & 1048575;
                    if (zzhj.zzc(obj, zzl) == zzhj.zzc(obj2, zzl) && zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzi) {
            int i6 = this.zzh[i3];
            int i7 = this.zzc[i6];
            int zzo = zzo(i6);
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
            if ((268435456 & zzo) != 0 && !zzF(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj2, i7, i6) && !zzG(obj2, zzo, zzr(i6))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50 && !((zzfr) zzhj.zzf(obj2, zzo & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhj.zzf(obj2, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgi zzr = zzr(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzr.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj2, i6, i, i2, i10) && !zzG(obj2, zzo, zzr(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return true;
    }
}
