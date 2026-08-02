package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfzi extends zzfxu {
    static final zzfxu zza = new zzfzi(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfzi(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a6  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzfzi zzj(int i, Object[] objArr, zzfxt zzfxtVar) {
        byte[] bArr;
        char c;
        char c2;
        boolean z;
        int i2 = i;
        Object[] objArr2 = objArr;
        if (i2 == 0) {
            return (zzfzi) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            zzfwo.zzb(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzfzi(null, objArr2, 1);
        }
        zzfuu.zzb(i2, objArr2.length >> 1, "index");
        int zzh = zzfxw.zzh(i);
        if (i2 == 1) {
            zzfwo.zzb(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            i2 = 1;
        } else {
            int i4 = zzh - 1;
            char c3 = 65535;
            if (zzh <= 128) {
                bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i8]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i8 ^ i3]);
                    zzfwo.zzb(requireNonNull, requireNonNull2);
                    int zza2 = zzfxj.zza(requireNonNull.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArr2[i7] = requireNonNull;
                                objArr2[i7 ^ 1] = requireNonNull2;
                            }
                            i6++;
                        } else {
                            if (requireNonNull.equals(objArr2[i10])) {
                                int i11 = i10 ^ 1;
                                zzfxs zzfxsVar = new zzfxs(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i11]));
                                objArr2[i11] = requireNonNull2;
                                obj = zzfxsVar;
                                break;
                            }
                            zza2 = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 != i2) {
                    c2 = 2;
                    obj = new Object[]{bArr, Integer.valueOf(i6), obj};
                    c = 1;
                    z = obj instanceof Object[];
                    Object obj2 = obj;
                    if (z) {
                        Object[] objArr3 = (Object[]) obj;
                        zzfxs zzfxsVar2 = (zzfxs) objArr3[c2];
                        if (zzfxtVar == null) {
                            throw zzfxsVar2.zza();
                        }
                        zzfxtVar.zzc = zzfxsVar2;
                        Object obj3 = objArr3[0];
                        int intValue = ((Integer) objArr3[c]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj2 = obj3;
                        i2 = intValue;
                    }
                    return new zzfzi(obj2, objArr2, i2);
                }
            } else if (zzh <= 32768) {
                short[] sArr = new short[zzh];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object requireNonNull3 = Objects.requireNonNull(objArr2[i15]);
                    Object requireNonNull4 = Objects.requireNonNull(objArr2[i15 ^ 1]);
                    zzfwo.zzb(requireNonNull3, requireNonNull4);
                    int zza3 = zzfxj.zza(requireNonNull3.hashCode());
                    while (true) {
                        int i16 = zza3 & i4;
                        char c4 = (char) sArr[i16];
                        if (c4 == 65535) {
                            sArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArr2[i14] = requireNonNull3;
                                objArr2[i14 ^ 1] = requireNonNull4;
                            }
                            i12++;
                        } else {
                            if (requireNonNull3.equals(objArr2[c4])) {
                                int i17 = c4 ^ 1;
                                zzfxs zzfxsVar3 = new zzfxs(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i17]));
                                objArr2[i17] = requireNonNull4;
                                obj = zzfxsVar3;
                                break;
                            }
                            zza3 = i16 + 1;
                        }
                    }
                }
                obj = i12 == i2 ? sArr : new Object[]{sArr, Integer.valueOf(i12), obj};
            } else {
                int i18 = 1;
                bArr = new int[zzh];
                Arrays.fill((int[]) bArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i2) {
                    int i21 = i20 + i20;
                    int i22 = i19 + i19;
                    Object requireNonNull5 = Objects.requireNonNull(objArr2[i22]);
                    Object requireNonNull6 = Objects.requireNonNull(objArr2[i22 ^ i18]);
                    zzfwo.zzb(requireNonNull5, requireNonNull6);
                    int zza4 = zzfxj.zza(requireNonNull5.hashCode());
                    while (true) {
                        int i23 = zza4 & i4;
                        ?? r15 = bArr[i23];
                        if (r15 == c3) {
                            bArr[i23] = i21;
                            if (i20 < i19) {
                                objArr2[i21] = requireNonNull5;
                                objArr2[i21 ^ 1] = requireNonNull6;
                            }
                            i20++;
                        } else {
                            if (requireNonNull5.equals(objArr2[r15])) {
                                int i24 = r15 ^ 1;
                                zzfxs zzfxsVar4 = new zzfxs(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i24]));
                                objArr2[i24] = requireNonNull6;
                                obj = zzfxsVar4;
                                break;
                            }
                            zza4 = i23 + 1;
                            c3 = 65535;
                        }
                    }
                    i19++;
                    i18 = 1;
                    c3 = 65535;
                }
                if (i20 != i2) {
                    c = 1;
                    c2 = 2;
                    obj = new Object[]{bArr, Integer.valueOf(i20), obj};
                    z = obj instanceof Object[];
                    Object obj22 = obj;
                    if (z) {
                    }
                    return new zzfzi(obj22, objArr2, i2);
                }
            }
            obj = bArr;
        }
        c2 = 2;
        c = 1;
        z = obj instanceof Object[];
        Object obj222 = obj;
        if (z) {
        }
        return new zzfzi(obj222, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfxu, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i != 1) {
                Object obj3 = this.zzc;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length - 1;
                        int zza2 = zzfxj.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length - 1;
                        int zza3 = zzfxj.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length - 1;
                        int zza4 = zzfxj.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
                        }
                    }
                }
            } else if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                obj2 = Objects.requireNonNull(objArr[1]);
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    final zzfxm zza() {
        return new zzfzh(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    final zzfxw zzf() {
        return new zzfzf(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    final zzfxw zzg() {
        return new zzfzg(this, new zzfzh(this.zzb, 0, this.zzd));
    }
}
