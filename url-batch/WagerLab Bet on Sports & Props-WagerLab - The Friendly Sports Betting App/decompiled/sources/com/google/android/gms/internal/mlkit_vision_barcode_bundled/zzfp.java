package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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

/* compiled from: com.google.mlkit:barcode-scanning@@17.3.0 */
/* loaded from: classes5.dex */
final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i, int i2, zzfm zzfmVar, boolean z, int[] iArr2, int i3, int i4, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
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
            zzge zzv = zzv(i);
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
            zzge zzv = zzv(i);
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
        zzgz.zzq(obj, j, (1 << (zzp >>> 20)) | zzgz.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzgz.zzq(obj, zzp(i2) & 1048575, i);
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
            return (zzgz.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j2)) != 0;
            case 2:
                return zzgz.zzd(obj, j2) != 0;
            case 3:
                return zzgz.zzd(obj, j2) != 0;
            case 4:
                return zzgz.zzc(obj, j2) != 0;
            case 5:
                return zzgz.zzd(obj, j2) != 0;
            case 6:
                return zzgz.zzc(obj, j2) != 0;
            case 7:
                return zzgz.zzw(obj, j2);
            case 8:
                Object zzf = zzgz.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzdf) {
                    return !zzdf.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(obj, j2) != null;
            case 10:
                return !zzdf.zzb.equals(zzgz.zzf(obj, j2));
            case 11:
                return zzgz.zzc(obj, j2) != 0;
            case 12:
                return zzgz.zzc(obj, j2) != 0;
            case 13:
                return zzgz.zzc(obj, j2) != 0;
            case 14:
                return zzgz.zzd(obj, j2) != 0;
            case 15:
                return zzgz.zzc(obj, j2) != 0;
            case 16:
                return zzgz.zzd(obj, j2) != 0;
            case 17:
                return zzgz.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzgz.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzgz.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzhh zzhhVar) throws IOException {
        if (obj instanceof String) {
            zzhhVar.zzG(i, (String) obj);
        } else {
            zzhhVar.zzd(i, (zzdf) obj);
        }
    }

    static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zzc()) {
            return zzgtVar;
        }
        zzgt zzf = zzgt.zzf();
        zzehVar.zzc = zzf;
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
    static zzfp zzl(Class cls, zzfj zzfjVar, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
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
        Field zzz;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zzfjVar instanceof zzfw)) {
            throw null;
        }
        zzfw zzfwVar = (zzfw) zzfjVar;
        String zzd = zzfwVar.zzd();
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
        Object[] zze = zzfwVar.zze();
        Class<?> cls2 = zzfwVar.zza().getClass();
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
                iArr[i68] = i69;
                i68++;
            }
            int i78 = charAt24 & 255;
            zzfw zzfwVar2 = zzfwVar;
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
                    int i86 = i69 / 3;
                    objArr[i86 + i86 + 1] = zze[i6];
                } else {
                    if (i85 == 12) {
                        if (zzfwVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i69 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzz2 = (Field) obj;
                            } else {
                                zzz2 = zzz(cls2, (String) obj);
                                zze[i88] = zzz2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzz3 = (Field) obj2;
                            } else {
                                zzz3 = zzz(cls2, (String) obj2);
                                zze[i91] = zzz3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzz3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzz3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzz3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i69 / 3;
                    objArr[i93 + i93 + 1] = zzz4.getType();
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
                        if (zzfwVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i69 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                                    zzz = (Field) obj3;
                                } else {
                                    zzz = zzz(cls2, (String) obj3);
                                    zze[i98] = zzz;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                        iArr[i66] = i69;
                        int i101 = i69 / 3;
                        int i102 = i101 + i101;
                        objArr[i102] = zze[i92];
                        if (i79 != 0) {
                            objArr[i102 + 1] = zze[i99];
                            i6 += 3;
                            str = zzd;
                            i66 = i100;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                    int i103 = i69 / 3;
                    objArr[i103 + i103 + i26] = zze[i25];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                if ((charAt24 & 4096) != 0) {
                }
                c = 55296;
                i21 = 1048575;
                i22 = 0;
                if (i78 >= 18) {
                }
                i23 = i79;
            }
            int i104 = i69 + 1;
            iArr3[i69] = charAt23;
            int i105 = i69 + 2;
            iArr3[i104] = ((charAt24 & 512) != 0 ? C.BUFFER_FLAG_LAST_SAMPLE : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i105] = (i22 << 20) | i21;
            i35 = i17;
            zzd = str;
            c2 = c;
            zzfwVar = zzfwVar2;
            length = i18;
            i7 = i19;
        }
        return new zzfp(iArr3, objArr, i2, i4, zzfwVar.zza(), false, iArr, i5, i64, zzfsVar, zzezVar, zzgsVar, zzdtVar, zzfhVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzgz.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzgz.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzgz.zzf(obj, j)).intValue();
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
        return ((Long) zzgz.zzf(obj, j)).longValue();
    }

    private final zzel zzu(int i) {
        int i2 = i / 3;
        return (zzel) this.zzd[i2 + i2 + 1];
    }

    private final zzge zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzge zzgeVar = (zzge) objArr[i3];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzb2 = zzfu.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzge zzv = zzv(i);
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
        zzge zzv = zzv(i2);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
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
        zzfp<T> zzfpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i5 < zzfpVar.zzc.length) {
            int zzs = zzfpVar.zzs(i5);
            int zzr = zzr(zzs);
            int[] iArr = zzfpVar.zzc;
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i4;
            if (zzr <= 17) {
                if (i11 != i8) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(obj2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzs & i4;
            if (zzr >= zzdy.DOUBLE_LIST_PACKED.zza()) {
                zzdy.SINT64_LIST_PACKED.zza();
            }
            int i13 = i7;
            long j = i12;
            switch (zzr) {
                case 0:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        i7 = i13 + zzdn.zzA(i9 << 3) + 8;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 1:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzA = zzdn.zzA(i9 << 3);
                        zzA4 = zzA + 4;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 2:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzA2 = zzdn.zzA(i9 << 3);
                        zzB = zzdn.zzB(j2);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 3:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzA2 = zzdn.zzA(i9 << 3);
                        zzB = zzdn.zzB(j3);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 4:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzA2 = zzdn.zzA(i9 << 3);
                        zzB = zzdn.zzB(j4);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 5:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzA3 = zzdn.zzA(i9 << 3);
                        zzA4 = zzA3 + 8;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 6:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzA = zzdn.zzA(i9 << 3);
                        zzA4 = zzA + 4;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 7:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzA4 = zzdn.zzA(i9 << 3) + 1;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 8:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        int i14 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzdf) {
                            zzA5 = zzdn.zzA(i14);
                            zzd = ((zzdf) object).zzd();
                            zzA6 = zzdn.zzA(zzd);
                            zzA4 = zzA5 + zzA6 + zzd;
                            i7 = i13 + zzA4;
                            zzfpVar = this;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        } else {
                            zzA2 = zzdn.zzA(i14);
                            zzB = zzdn.zzz((String) object);
                            zzA4 = zzA2 + zzB;
                            i7 = i13 + zzA4;
                            zzfpVar = this;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        }
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 9:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzh = zzgg.zzh(i9, unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
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
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzdf zzdfVar = (zzdf) unsafe.getObject(obj2, j);
                        zzA5 = zzdn.zzA(i9 << 3);
                        zzd = zzdfVar.zzd();
                        zzA6 = zzdn.zzA(zzd);
                        zzA4 = zzA5 + zzA6 + zzd;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 11:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzA2 = zzdn.zzA(i9 << 3);
                        zzB = zzdn.zzA(i15);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 12:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzA2 = zzdn.zzA(i9 << 3);
                        zzB = zzdn.zzB(j5);
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 13:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzA = zzdn.zzA(i9 << 3);
                        zzA4 = zzA + 4;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 14:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzA3 = zzdn.zzA(i9 << 3);
                        zzA4 = zzA3 + 8;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 15:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzA2 = zzdn.zzA(i9 << 3);
                        zzB = zzdn.zzA((i16 >> 31) ^ (i16 + i16));
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 16:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzA2 = zzdn.zzA(i9 << 3);
                        zzB = zzdn.zzB((j6 >> 63) ^ (j6 + j6));
                        zzA4 = zzA2 + zzB;
                        i7 = i13 + zzA4;
                        zzfpVar = this;
                        i5 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzfpVar = this;
                    i7 = i13;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 17:
                    if (zzfpVar.zzJ(obj2, i5, i8, i6, i)) {
                        zzh = zzdn.zzw(i9, (zzfm) unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
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
                    zzh = zzgg.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 19:
                    zzh = zzgg.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzgg.zza;
                    if (list.size() != 0) {
                        zzg = zzgg.zzg(list) + (list.size() * zzdn.zzA(i9 << 3));
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
                    int i18 = zzgg.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzgg.zzl(list2);
                        zzA7 = zzdn.zzA(i9 << 3);
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
                    int i19 = zzgg.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzgg.zzf(list3);
                        zzA7 = zzdn.zzA(i9 << 3);
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
                    zzh = zzgg.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 24:
                    zzh = zzgg.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzgg.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzdn.zzA(i9 << 3) + 1);
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
                    int i21 = zzgg.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzdn.zzA(i9 << 3) * size3;
                        if (list5 instanceof zzey) {
                            zzey zzeyVar = (zzey) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zza2 = zzeyVar.zza();
                                if (zza2 instanceof zzdf) {
                                    int zzd3 = ((zzdf) zza2).zzd();
                                    zzg += zzdn.zzA(zzd3) + zzd3;
                                } else {
                                    zzg += zzdn.zzz((String) zza2);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzdf) {
                                    int zzd4 = ((zzdf) obj3).zzd();
                                    zzg += zzdn.zzA(zzd4) + zzd4;
                                } else {
                                    zzg += zzdn.zzz((String) obj3);
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
                    zzge zzv = zzfpVar.zzv(i5);
                    int i24 = zzgg.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA8 = 0;
                    } else {
                        zzA8 = zzdn.zzA(i9 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zzex) {
                                int zza3 = ((zzex) obj4).zza();
                                zzA8 += zzdn.zzA(zza3) + zza3;
                            } else {
                                zzA8 += zzdn.zzy((zzfm) obj4, zzv);
                            }
                        }
                    }
                    i7 = i13 + zzA8;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzgg.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzA9 = 0;
                    } else {
                        zzA9 = size5 * zzdn.zzA(i9 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd5 = ((zzdf) list7.get(i27)).zzd();
                            zzA9 += zzdn.zzA(zzd5) + zzd5;
                        }
                    }
                    i7 = i13 + zzA9;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzgg.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzgg.zzk(list8);
                        zzA7 = zzdn.zzA(i9 << 3);
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
                    int i29 = zzgg.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzgg.zza(list9);
                        zzA7 = zzdn.zzA(i9 << 3);
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
                    zzh = zzgg.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 32:
                    zzh = zzgg.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i7 = i13 + zzh;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzgg.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzgg.zzi(list10);
                        zzA7 = zzdn.zzA(i9 << 3);
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
                    int i31 = zzgg.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzgg.zzj(list11);
                        zzA7 = zzdn.zzA(i9 << 3);
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
                    zze = zzgg.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    int i32 = zzgg.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zze = zzgg.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzdn.zzA(i9 << 3);
                        zzA11 = zzdn.zzA(zze);
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
                    zzge zzv2 = zzfpVar.zzv(i5);
                    int i33 = zzgg.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzdn.zzw(i9, (zzfm) list13.get(i34), zzv2);
                        }
                    }
                    i7 = i13 + i3;
                    i5 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 50:
                    zzfg zzfgVar = (zzfg) unsafe.getObject(obj2, j);
                    if (!zzfgVar.isEmpty()) {
                        Iterator it = zzfgVar.entrySet().iterator();
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzA12 = zzdn.zzA(i9 << 3);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzA13 = zzdn.zzA(i9 << 3);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        long zzt = zzt(obj2, j);
                        zzl = zzdn.zzA(i9 << 3);
                        i2 = zzdn.zzB(zzt);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        long zzt2 = zzt(obj2, j);
                        zzl = zzdn.zzA(i9 << 3);
                        i2 = zzdn.zzB(zzt2);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        long zzo = zzo(obj2, j);
                        zzl = zzdn.zzA(i9 << 3);
                        i2 = zzdn.zzB(zzo);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzA12 = zzdn.zzA(i9 << 3);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzA13 = zzdn.zzA(i9 << 3);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzh = zzdn.zzA(i9 << 3) + 1;
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        int i35 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzdf) {
                            zzA14 = zzdn.zzA(i35);
                            zzd2 = ((zzdf) object2).zzd();
                            zzA15 = zzdn.zzA(zzd2);
                            zzh = zzA14 + zzA15 + zzd2;
                            i7 = i13 + zzh;
                            i5 += 3;
                            obj2 = obj;
                            i4 = 1048575;
                        } else {
                            zzl = zzdn.zzA(i35);
                            i2 = zzdn.zzz((String) object2);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzh = zzgg.zzh(i9, unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzdf zzdfVar2 = (zzdf) unsafe.getObject(obj2, j);
                        zzA14 = zzdn.zzA(i9 << 3);
                        zzd2 = zzdfVar2.zzd();
                        zzA15 = zzdn.zzA(zzd2);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        int zzo2 = zzo(obj2, j);
                        zzl = zzdn.zzA(i9 << 3);
                        i2 = zzdn.zzA(zzo2);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        long zzo3 = zzo(obj2, j);
                        zzl = zzdn.zzA(i9 << 3);
                        i2 = zzdn.zzB(zzo3);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzA13 = zzdn.zzA(i9 << 3);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzA12 = zzdn.zzA(i9 << 3);
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        int zzo4 = zzo(obj2, j);
                        zzl = zzdn.zzA(i9 << 3);
                        i2 = zzdn.zzA((zzo4 >> 31) ^ (zzo4 + zzo4));
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        long zzt3 = zzt(obj2, j);
                        zzl = zzdn.zzA(i9 << 3);
                        i2 = zzdn.zzB((zzt3 >> 63) ^ (zzt3 + zzt3));
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
                    if (zzfpVar.zzM(obj2, i9, i5)) {
                        zzh = zzdn.zzw(i9, (zzfm) unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
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
        int zza4 = i7 + ((zzeh) obj).zzc.zza();
        if (!zzfpVar.zzh) {
            return zza4;
        }
        zzdx zzdxVar = ((zzed) obj).zzb;
        int zzc = zzdxVar.zza.zzc();
        int i36 = 0;
        for (int i37 = 0; i37 < zzc; i37++) {
            Map.Entry zzg2 = zzdxVar.zza.zzg(i37);
            i36 += zzdx.zza((zzdw) ((zzgi) zzg2).zza(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzdxVar.zza.zzd()) {
            i36 += zzdx.zza((zzdw) entry2.getKey(), entry2.getValue());
        }
        return zza4 + i36;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
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
                    doubleToLongBits = Double.doubleToLongBits(zzgz.zza(obj, j));
                    byte[] bArr = zzep.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzgz.zzb(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr2 = zzep.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr3 = zzep.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr4 = zzep.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zzep.zza(zzgz.zzw(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzf = zzgz.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr5 = zzep.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzc(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr6 = zzep.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzf2 = zzgz.zzf(obj, j);
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
                    floatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzep.zzb;
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
                        byte[] bArr8 = zzep.zzb;
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
                        byte[] bArr9 = zzep.zzb;
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
                        byte[] bArr10 = zzep.zzb;
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
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzep.zza(zzN(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
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
                        byte[] bArr11 = zzep.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
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
                        byte[] bArr12 = zzep.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + ((zzeh) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzed) obj).zzb.zza.hashCode() : hashCode;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzc(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu r41) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzeh) {
                zzeh zzehVar = (zzeh) obj;
                zzehVar.zzW(Integer.MAX_VALUE);
                zzehVar.zza = 0;
                zzehVar.zzU();
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
                                ((zzeo) zzgz.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzfg) object).zzc();
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
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
                        zzgz.zzo(obj, j, zzgz.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzgz.zzp(obj, j, zzgz.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzgz.zzm(obj, j, zzgz.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
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
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
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
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj, j);
                    zzeo zzeoVar2 = (zzeo) zzgz.zzf(obj2, j);
                    int size = zzeoVar.size();
                    int size2 = zzeoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVar.zzc()) {
                            zzeoVar = zzeoVar.zzd(size2 + size);
                        }
                        zzeoVar.addAll(zzeoVar2);
                    }
                    if (size > 0) {
                        zzeoVar2 = zzeoVar;
                    }
                    zzgz.zzs(obj, j, zzeoVar2);
                    break;
                case 50:
                    int i4 = zzgg.zza;
                    zzgz.zzs(obj, j, zzfh.zza(zzgz.zzf(obj, j), zzgz.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                case 63:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
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
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzcu zzcuVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzhh zzhhVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        int i4;
        int i5;
        zzfp<T> zzfpVar = this;
        if (zzfpVar.zzh) {
            zzdx zzdxVar = ((zzed) obj).zzb;
            if (!zzdxVar.zza.isEmpty()) {
                Iterator zzf = zzdxVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zzfpVar.zzc;
                Unsafe unsafe = zzb;
                i = 0;
                int i6 = 1048575;
                int i7 = 0;
                while (i < iArr.length) {
                    int zzs = zzfpVar.zzs(i);
                    int[] iArr2 = zzfpVar.zzc;
                    int zzr = zzr(zzs);
                    int i8 = iArr2[i];
                    if (zzr <= 17) {
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
                    while (entry2 != null && ((zzee) entry2.getKey()).zza <= i8) {
                        zzfpVar.zzm.zzb(zzhhVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzs & 1048575;
                    switch (zzr) {
                        case 0:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzf(i8, zzgz.zza(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 1:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzo(i8, zzgz.zzb(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 2:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzt(i8, unsafe.getLong(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 3:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzK(i8, unsafe.getLong(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 4:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzr(i8, unsafe.getInt(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 5:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzm(i8, unsafe.getLong(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 6:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzk(i8, unsafe.getInt(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 7:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzb(i8, zzgz.zzw(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 8:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzO(i8, unsafe.getObject(obj, j), zzhhVar);
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 9:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzv(i8, unsafe.getObject(obj, j), zzfpVar.zzv(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 10:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzd(i8, (zzdf) unsafe.getObject(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 11:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzI(i8, unsafe.getInt(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 12:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzi(i8, unsafe.getInt(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 13:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzx(i8, unsafe.getInt(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 14:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzz(i8, unsafe.getLong(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 15:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzB(i8, unsafe.getInt(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 16:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzD(i8, unsafe.getLong(obj, j));
                            }
                            zzfpVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 17:
                            if (zzfpVar.zzJ(obj, i, i3, i4, i5)) {
                                zzhhVar.zzq(i8, unsafe.getObject(obj, j), zzfpVar.zzv(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 18:
                            zzgg.zzr(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 19:
                            zzgg.zzv(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 20:
                            zzgg.zzx(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 21:
                            zzgg.zzD(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 22:
                            zzgg.zzw(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 23:
                            zzgg.zzu(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 24:
                            zzgg.zzt(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 25:
                            zzgg.zzq(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 26:
                            int i11 = zzfpVar.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zzgg.zza;
                            if (list != null && !list.isEmpty()) {
                                zzhhVar.zzH(i11, list);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 27:
                            int i13 = zzfpVar.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzge zzv = zzfpVar.zzv(i);
                            int i14 = zzgg.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzdo) zzhhVar).zzv(i13, list2.get(i15), zzv);
                                }
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 28:
                            int i16 = zzfpVar.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zzgg.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzhhVar.zze(i16, list3);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 29:
                            zzgg.zzC(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 30:
                            zzgg.zzs(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 31:
                            zzgg.zzy(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 32:
                            zzgg.zzz(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 33:
                            zzgg.zzA(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 34:
                            zzgg.zzB(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 35:
                            zzgg.zzr(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 36:
                            zzgg.zzv(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 37:
                            zzgg.zzx(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 38:
                            zzgg.zzD(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 39:
                            zzgg.zzw(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 40:
                            zzgg.zzu(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 41:
                            zzgg.zzt(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 42:
                            zzgg.zzq(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 43:
                            zzgg.zzC(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 44:
                            zzgg.zzs(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 45:
                            zzgg.zzy(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 46:
                            zzgg.zzz(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 47:
                            zzgg.zzA(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 48:
                            zzgg.zzB(zzfpVar.zzc[i], (List) unsafe.getObject(obj, j), zzhhVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 49:
                            int i18 = zzfpVar.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzge zzv2 = zzfpVar.zzv(i);
                            int i19 = zzgg.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzdo) zzhhVar).zzq(i18, list4.get(i20), zzv2);
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
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzf(i8, zzm(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 52:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzo(i8, zzn(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 53:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzt(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 54:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzK(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 55:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzr(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 56:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzm(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 57:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzk(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzb(i8, zzN(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 59:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzO(i8, unsafe.getObject(obj, j), zzhhVar);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 60:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzv(i8, unsafe.getObject(obj, j), zzfpVar.zzv(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzd(i8, (zzdf) unsafe.getObject(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzI(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 63:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzi(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 64:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzx(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 65:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzz(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzB(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 67:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzD(i8, zzt(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 68:
                            if (zzfpVar.zzM(obj, i8, i)) {
                                zzhhVar.zzq(i8, unsafe.getObject(obj, j), zzfpVar.zzv(i));
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
                    zzfpVar.zzm.zzb(zzhhVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzeh) obj).zzc.zzl(zzhhVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzfpVar.zzc;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i62 = 1048575;
        int i72 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzeh) obj).zzc.zzl(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzgz.zza(obj, j)) == Double.doubleToLongBits(zzgz.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzgz.zzb(obj, j)) == Float.floatToIntBits(zzgz.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzgz.zzw(obj, j) == zzgz.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzgz.zzc(obj, j) == zzgz.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzgz.zzd(obj, j) == zzgz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
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
                    zzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
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
                    long zzp = zzp(i) & 1048575;
                    if (zzgz.zzc(obj, zzp) == zzgz.zzc(obj2, zzp) && zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj2, i7, i6) && !zzK(obj2, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzfg) zzgz.zzf(obj2, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzgz.zzf(obj2, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzge zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj2, i6, i, i2, i10) && !zzK(obj2, zzs, zzv(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzed) obj).zzb.zzk();
    }
}
