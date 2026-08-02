package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzawi implements zzauz {
    public static final zzavb zza = new zzawf();
    private static final int zzb = zzbar.zzg("seig");
    private static final byte[] zzc = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final SparseArray zzd;
    private final zzbak zze;
    private final zzbak zzf;
    private final zzbak zzg;
    private final zzbak zzh;
    private final zzbak zzi;
    private final byte[] zzj;
    private final Stack zzk;
    private final LinkedList zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private zzbak zzq;
    private long zzr;
    private long zzs;
    private zzawh zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzava zzx;
    private boolean zzy;

    public zzawi() {
        this(0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzauv zza(List list) {
        Pair create;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzavv zzavvVar = (zzavv) list.get(i);
            if (zzavvVar.zzaR == zzavw.zzX) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzavvVar.zza.zza;
                zzbak zzbakVar = new zzbak(bArr);
                if (zzbakVar.zzd() >= 32) {
                    zzbakVar.zzv(0);
                    if (zzbakVar.zze() == zzbakVar.zza() + 4 && zzbakVar.zze() == zzavw.zzX) {
                        int zzf = zzavw.zzf(zzbakVar.zze());
                        if (zzf > 1) {
                            Log.w("PsshAtomUtil", "Unsupported pssh version: " + zzf);
                        } else {
                            UUID uuid2 = new UUID(zzbakVar.zzl(), zzbakVar.zzl());
                            if (zzf == 1) {
                                zzbakVar.zzw(zzbakVar.zzi() * 16);
                            }
                            int zzi = zzbakVar.zzi();
                            if (zzi == zzbakVar.zza()) {
                                byte[] bArr2 = new byte[zzi];
                                zzbakVar.zzq(bArr2, 0, zzi);
                                create = Pair.create(uuid2, bArr2);
                                uuid = create != null ? null : (UUID) create.first;
                                if (uuid != null) {
                                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList.add(new zzauu(uuid, "video/mp4", bArr, false));
                                }
                            }
                        }
                    }
                }
                create = null;
                if (create != null) {
                }
                if (uuid != null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzauv(arrayList);
    }

    private final void zzb() {
        this.zzm = 0;
        this.zzp = 0;
    }

    private static void zzc(zzbak zzbakVar, int i, zzawq zzawqVar) throws zzasz {
        zzbakVar.zzv(i + 8);
        int zze = zzavw.zze(zzbakVar.zze());
        if ((zze & 1) != 0) {
            throw new zzasz("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zze & 2) != 0;
        int zzi = zzbakVar.zzi();
        int i2 = zzawqVar.zze;
        if (zzi == i2) {
            Arrays.fill(zzawqVar.zzm, 0, zzi, z);
            zzawqVar.zza(zzbakVar.zza());
            zzbakVar.zzq(zzawqVar.zzp.zza, 0, zzawqVar.zzo);
            zzawqVar.zzp.zzv(0);
            zzawqVar.zzq = false;
            return;
        }
        throw new zzasz("Length mismatch: " + zzi + ", " + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x0633, code lost:
    
        zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0637, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzh(long j) throws zzasz {
        zzawo zza2;
        zzawi zzawiVar;
        zzavu zzavuVar;
        SparseArray sparseArray;
        int i;
        int i2;
        byte[] bArr;
        boolean z;
        zzawq zzawqVar;
        int size;
        int i3;
        byte[] bArr2;
        int i4;
        zzavu zzavuVar2;
        int i5;
        byte[] bArr3;
        int i6;
        zzavu zzavuVar3;
        zzawq zzawqVar2;
        List list;
        zzawh zzawhVar;
        int i7;
        int i8;
        int i9;
        long j2;
        int i10;
        int[] iArr;
        int[] iArr2;
        long j3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        loop0: while (true) {
            zzawi zzawiVar2 = this;
            while (!zzawiVar2.zzk.isEmpty() && ((zzavu) zzawiVar2.zzk.peek()).zza == j) {
                zzavu zzavuVar4 = (zzavu) zzawiVar2.zzk.pop();
                int i18 = zzavuVar4.zzaR;
                int i19 = 12;
                int i20 = 8;
                if (i18 == zzavw.zzE) {
                    zzauv zza3 = zza(zzavuVar4.zzb);
                    zzavu zza4 = zzavuVar4.zza(zzavw.zzP);
                    SparseArray sparseArray2 = new SparseArray();
                    int size2 = zza4.zzb.size();
                    long j4 = -9223372036854775807L;
                    int i21 = 0;
                    while (i21 < size2) {
                        zzavv zzavvVar = (zzavv) zza4.zzb.get(i21);
                        int i22 = zzavvVar.zzaR;
                        if (i22 == zzavw.zzB) {
                            zzbak zzbakVar = zzavvVar.zza;
                            zzbakVar.zzv(i19);
                            Pair create = Pair.create(Integer.valueOf(zzbakVar.zze()), new zzawe(zzbakVar.zzi() - 1, zzbakVar.zzi(), zzbakVar.zzi(), zzbakVar.zze()));
                            sparseArray2.put(((Integer) create.first).intValue(), (zzawe) create.second);
                        } else if (i22 == zzavw.zzQ) {
                            zzbak zzbakVar2 = zzavvVar.zza;
                            zzbakVar2.zzv(8);
                            j4 = zzavw.zzf(zzbakVar2.zze()) == 0 ? zzbakVar2.zzm() : zzbakVar2.zzn();
                        }
                        i21++;
                        i19 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size3 = zzavuVar4.zzc.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        zzavu zzavuVar5 = (zzavu) zzavuVar4.zzc.get(i23);
                        if (zzavuVar5.zzaR == zzavw.zzG && (zza2 = zzawd.zza(zzavuVar5, zzavuVar4.zzb(zzavw.zzF), j4, zza3, false)) != null) {
                            sparseArray3.put(zza2.zza, zza2);
                        }
                    }
                    int size4 = sparseArray3.size();
                    if (zzawiVar2.zzd.size() == 0) {
                        for (int i24 = 0; i24 < size4; i24++) {
                            zzawo zzawoVar = (zzawo) sparseArray3.valueAt(i24);
                            zzawh zzawhVar2 = new zzawh(zzawiVar2.zzx.zzbi(i24, zzawoVar.zzb));
                            zzawhVar2.zza(zzawoVar, (zzawe) sparseArray2.get(zzawoVar.zza));
                            zzawiVar2.zzd.put(zzawoVar.zza, zzawhVar2);
                            zzawiVar2.zzs = Math.max(zzawiVar2.zzs, zzawoVar.zze);
                        }
                        zzawiVar2.zzx.zzb();
                    } else {
                        zzbac.zze(zzawiVar2.zzd.size() == size4);
                        for (int i25 = 0; i25 < size4; i25++) {
                            zzawo zzawoVar2 = (zzawo) sparseArray3.valueAt(i25);
                            ((zzawh) zzawiVar2.zzd.get(zzawoVar2.zza)).zza(zzawoVar2, (zzawe) sparseArray2.get(zzawoVar2.zza));
                        }
                    }
                } else {
                    if (i18 == zzavw.zzN) {
                        SparseArray sparseArray4 = zzawiVar2.zzd;
                        byte[] bArr4 = zzawiVar2.zzj;
                        int size5 = zzavuVar4.zzc.size();
                        int i26 = 0;
                        while (i26 < size5) {
                            zzavu zzavuVar6 = (zzavu) zzavuVar4.zzc.get(i26);
                            if (zzavuVar6.zzaR == zzavw.zzO) {
                                zzbak zzbakVar3 = zzavuVar6.zzb(zzavw.zzA).zza;
                                zzbakVar3.zzv(i20);
                                int zze = zzavw.zze(zzbakVar3.zze());
                                zzawh zzawhVar3 = (zzawh) sparseArray4.get(zzbakVar3.zze());
                                if (zzawhVar3 == null) {
                                    zzawhVar3 = null;
                                } else {
                                    if ((zze & 1) != 0) {
                                        long zzn = zzbakVar3.zzn();
                                        zzawq zzawqVar3 = zzawhVar3.zza;
                                        zzawqVar3.zzb = zzn;
                                        zzawqVar3.zzc = zzn;
                                    }
                                    zzawe zzaweVar = zzawhVar3.zzd;
                                    zzawhVar3.zza.zza = new zzawe((zze & 2) != 0 ? zzbakVar3.zzi() - 1 : zzaweVar.zza, (zze & 8) != 0 ? zzbakVar3.zzi() : zzaweVar.zzb, (zze & 16) != 0 ? zzbakVar3.zzi() : zzaweVar.zzc, (zze & 32) != 0 ? zzbakVar3.zzi() : zzaweVar.zzd);
                                }
                                if (zzawhVar3 != null) {
                                    zzawq zzawqVar4 = zzawhVar3.zza;
                                    long j5 = zzawqVar4.zzr;
                                    zzawhVar3.zzb();
                                    if (zzavuVar6.zzb(zzavw.zzz) != null) {
                                        zzbak zzbakVar4 = zzavuVar6.zzb(zzavw.zzz).zza;
                                        zzbakVar4.zzv(i20);
                                        j5 = zzavw.zzf(zzbakVar4.zze()) == r7 ? zzbakVar4.zzn() : zzbakVar4.zzm();
                                    }
                                    List list2 = zzavuVar6.zzb;
                                    int size6 = list2.size();
                                    int i27 = 0;
                                    int i28 = 0;
                                    int i29 = 0;
                                    while (i29 < size6) {
                                        SparseArray sparseArray5 = sparseArray4;
                                        zzavv zzavvVar2 = (zzavv) list2.get(i29);
                                        int i30 = size5;
                                        long j6 = j5;
                                        if (zzavvVar2.zzaR == zzavw.zzC) {
                                            zzbak zzbakVar5 = zzavvVar2.zza;
                                            zzbakVar5.zzv(12);
                                            int zzi = zzbakVar5.zzi();
                                            if (zzi > 0) {
                                                i27 += zzi;
                                                i28++;
                                            }
                                        }
                                        i29++;
                                        size5 = i30;
                                        sparseArray4 = sparseArray5;
                                        j5 = j6;
                                    }
                                    sparseArray = sparseArray4;
                                    i = size5;
                                    long j7 = j5;
                                    zzawhVar3.zzg = 0;
                                    zzawhVar3.zzf = 0;
                                    zzawhVar3.zze = 0;
                                    zzawq zzawqVar5 = zzawhVar3.zza;
                                    zzawqVar5.zzd = i28;
                                    zzawqVar5.zze = i27;
                                    int[] iArr3 = zzawqVar5.zzg;
                                    if (iArr3 == null || iArr3.length < i28) {
                                        zzawqVar5.zzf = new long[i28];
                                        zzawqVar5.zzg = new int[i28];
                                    }
                                    int[] iArr4 = zzawqVar5.zzh;
                                    if (iArr4 == null || iArr4.length < i27) {
                                        int i31 = (i27 * 125) / 100;
                                        zzawqVar5.zzh = new int[i31];
                                        zzawqVar5.zzi = new int[i31];
                                        zzawqVar5.zzj = new long[i31];
                                        zzawqVar5.zzk = new boolean[i31];
                                        zzawqVar5.zzm = new boolean[i31];
                                    }
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (i32 < size6) {
                                        zzavv zzavvVar3 = (zzavv) list2.get(i32);
                                        if (zzavvVar3.zzaR == zzavw.zzC) {
                                            int i35 = i34 + 1;
                                            zzbak zzbakVar6 = zzavvVar3.zza;
                                            zzbakVar6.zzv(8);
                                            int zze2 = zzavw.zze(zzbakVar6.zze());
                                            zzawo zzawoVar3 = zzawhVar3.zzc;
                                            list = list2;
                                            zzawq zzawqVar6 = zzawhVar3.zza;
                                            zzawe zzaweVar2 = zzawqVar6.zza;
                                            i7 = size6;
                                            zzawqVar6.zzg[i34] = zzbakVar6.zzi();
                                            long[] jArr = zzawqVar6.zzf;
                                            zzavuVar2 = zzavuVar4;
                                            long j8 = zzawqVar6.zzb;
                                            jArr[i34] = j8;
                                            if ((zze2 & 1) != 0) {
                                                i6 = i26;
                                                zzavuVar3 = zzavuVar6;
                                                zzawqVar2 = zzawqVar4;
                                                jArr[i34] = j8 + zzbakVar6.zze();
                                            } else {
                                                i6 = i26;
                                                zzavuVar3 = zzavuVar6;
                                                zzawqVar2 = zzawqVar4;
                                            }
                                            int i36 = zze2 & 4;
                                            int i37 = zzaweVar2.zzd;
                                            if (i36 != 0) {
                                                i37 = zzbakVar6.zzi();
                                            }
                                            int i38 = zze2 & 256;
                                            int i39 = zze2 & 512;
                                            int i40 = zze2 & 1024;
                                            int i41 = zze2 & 2048;
                                            long[] jArr2 = zzawoVar3.zzi;
                                            if (jArr2 != null) {
                                                i8 = i37;
                                                bArr3 = bArr4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i9 = i32;
                                                    j2 = zzbar.zzj(zzawoVar3.zzj[0], 1000L, zzawoVar3.zzc);
                                                    int[] iArr5 = zzawqVar6.zzh;
                                                    int[] iArr6 = zzawqVar6.zzi;
                                                    long[] jArr3 = zzawqVar6.zzj;
                                                    zzawhVar = zzawhVar3;
                                                    boolean[] zArr = zzawqVar6.zzk;
                                                    i5 = i9;
                                                    int i42 = zzawoVar3.zzb;
                                                    i10 = zzawqVar6.zzg[i34] + i33;
                                                    long j9 = zzawoVar3.zzc;
                                                    if (i34 <= 0) {
                                                        iArr = iArr5;
                                                        iArr2 = iArr6;
                                                        j3 = zzawqVar6.zzr;
                                                    } else {
                                                        iArr = iArr5;
                                                        iArr2 = iArr6;
                                                        j3 = j7;
                                                    }
                                                    while (i33 < i10) {
                                                        int zzi2 = i38 != 0 ? zzbakVar6.zzi() : zzaweVar2.zzb;
                                                        if (i39 != 0) {
                                                            i11 = i10;
                                                            i12 = zzbakVar6.zzi();
                                                        } else {
                                                            i11 = i10;
                                                            i12 = zzaweVar2.zzc;
                                                        }
                                                        if (i33 == 0) {
                                                            if (i36 != 0) {
                                                                i13 = i36;
                                                                i14 = i8;
                                                                i33 = 0;
                                                                if (i41 == 0) {
                                                                    i15 = i38;
                                                                    i16 = i39;
                                                                    i17 = i40;
                                                                    iArr2[i33] = (int) ((zzbakVar6.zze() * 1000) / j9);
                                                                } else {
                                                                    i15 = i38;
                                                                    i16 = i39;
                                                                    i17 = i40;
                                                                    iArr2[i33] = 0;
                                                                }
                                                                jArr3[i33] = zzbar.zzj(j3, 1000L, j9) - j2;
                                                                iArr[i33] = i12;
                                                                zArr[i33] = 1 != (((i14 >> 16) & 1) ^ 1);
                                                                j3 += zzi2;
                                                                i33++;
                                                                i10 = i11;
                                                                i36 = i13;
                                                                i38 = i15;
                                                                i39 = i16;
                                                                i40 = i17;
                                                            } else {
                                                                i33 = 0;
                                                            }
                                                        }
                                                        if (i40 != 0) {
                                                            i13 = i36;
                                                            i14 = zzbakVar6.zze();
                                                        } else {
                                                            i13 = i36;
                                                            i14 = zzaweVar2.zzd;
                                                        }
                                                        if (i41 == 0) {
                                                        }
                                                        jArr3[i33] = zzbar.zzj(j3, 1000L, j9) - j2;
                                                        iArr[i33] = i12;
                                                        zArr[i33] = 1 != (((i14 >> 16) & 1) ^ 1);
                                                        j3 += zzi2;
                                                        i33++;
                                                        i10 = i11;
                                                        i36 = i13;
                                                        i38 = i15;
                                                        i39 = i16;
                                                        i40 = i17;
                                                    }
                                                    zzawqVar6.zzr = j3;
                                                    i34 = i35;
                                                    i33 = i10;
                                                }
                                            } else {
                                                i8 = i37;
                                                bArr3 = bArr4;
                                            }
                                            i9 = i32;
                                            j2 = 0;
                                            int[] iArr52 = zzawqVar6.zzh;
                                            int[] iArr62 = zzawqVar6.zzi;
                                            long[] jArr32 = zzawqVar6.zzj;
                                            zzawhVar = zzawhVar3;
                                            boolean[] zArr2 = zzawqVar6.zzk;
                                            i5 = i9;
                                            int i422 = zzawoVar3.zzb;
                                            i10 = zzawqVar6.zzg[i34] + i33;
                                            long j92 = zzawoVar3.zzc;
                                            if (i34 <= 0) {
                                            }
                                            while (i33 < i10) {
                                            }
                                            zzawqVar6.zzr = j3;
                                            i34 = i35;
                                            i33 = i10;
                                        } else {
                                            zzavuVar2 = zzavuVar4;
                                            i5 = i32;
                                            bArr3 = bArr4;
                                            i6 = i26;
                                            zzavuVar3 = zzavuVar6;
                                            zzawqVar2 = zzawqVar4;
                                            list = list2;
                                            zzawhVar = zzawhVar3;
                                            i7 = size6;
                                        }
                                        i32 = i5 + 1;
                                        list2 = list;
                                        size6 = i7;
                                        zzavuVar4 = zzavuVar2;
                                        i26 = i6;
                                        zzavuVar6 = zzavuVar3;
                                        zzawqVar4 = zzawqVar2;
                                        bArr4 = bArr3;
                                        zzawhVar3 = zzawhVar;
                                    }
                                    zzavuVar = zzavuVar4;
                                    byte[] bArr5 = bArr4;
                                    i2 = i26;
                                    zzawq zzawqVar7 = zzawqVar4;
                                    zzawh zzawhVar4 = zzawhVar3;
                                    zzavv zzb2 = zzavuVar6.zzb(zzavw.zzaf);
                                    if (zzb2 != null) {
                                        zzawqVar = zzawqVar7;
                                        zzawp zzawpVar = zzawhVar4.zzc.zzh[zzawqVar.zza.zza];
                                        zzbak zzbakVar7 = zzb2.zza;
                                        int i43 = zzawpVar.zza;
                                        zzbakVar7.zzv(8);
                                        if ((zzavw.zze(zzbakVar7.zze()) & 1) == 1) {
                                            zzbakVar7.zzw(8);
                                        }
                                        int zzg = zzbakVar7.zzg();
                                        int zzi3 = zzbakVar7.zzi();
                                        int i44 = zzawqVar.zze;
                                        if (zzi3 != i44) {
                                            throw new zzasz("Length mismatch: " + zzi3 + ", " + i44);
                                        }
                                        if (zzg == 0) {
                                            boolean[] zArr3 = zzawqVar.zzm;
                                            i4 = 0;
                                            for (int i45 = 0; i45 < zzi3; i45++) {
                                                int zzg2 = zzbakVar7.zzg();
                                                i4 += zzg2;
                                                zArr3[i45] = zzg2 > i43;
                                            }
                                        } else {
                                            i4 = zzg * zzi3;
                                            Arrays.fill(zzawqVar.zzm, 0, zzi3, zzg > i43);
                                        }
                                        zzawqVar.zza(i4);
                                    } else {
                                        zzawqVar = zzawqVar7;
                                    }
                                    zzavv zzb3 = zzavuVar6.zzb(zzavw.zzag);
                                    if (zzb3 != null) {
                                        zzbak zzbakVar8 = zzb3.zza;
                                        zzbakVar8.zzv(8);
                                        int zze3 = zzbakVar8.zze();
                                        if ((zzavw.zze(zze3) & 1) == 1) {
                                            zzbakVar8.zzw(8);
                                        }
                                        int zzi4 = zzbakVar8.zzi();
                                        if (zzi4 != 1) {
                                            throw new zzasz("Unexpected saio entry count: " + zzi4);
                                        }
                                        zzawqVar.zzc += zzavw.zzf(zze3) == 0 ? zzbakVar8.zzm() : zzbakVar8.zzn();
                                    }
                                    zzavv zzb4 = zzavuVar6.zzb(zzavw.zzak);
                                    if (zzb4 != null) {
                                        zzc(zzb4.zza, 0, zzawqVar);
                                    }
                                    zzavv zzb5 = zzavuVar6.zzb(zzavw.zzah);
                                    zzavv zzb6 = zzavuVar6.zzb(zzavw.zzai);
                                    if (zzb5 != null && zzb6 != null) {
                                        zzbak zzbakVar9 = zzb5.zza;
                                        zzbak zzbakVar10 = zzb6.zza;
                                        zzbakVar9.zzv(8);
                                        int zze4 = zzbakVar9.zze();
                                        int zze5 = zzbakVar9.zze();
                                        int i46 = zzb;
                                        if (zze5 == i46) {
                                            if (zzavw.zzf(zze4) == 1) {
                                                zzbakVar9.zzw(4);
                                            }
                                            if (zzbakVar9.zze() != 1) {
                                                throw new zzasz("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            zzbakVar10.zzv(8);
                                            int zze6 = zzbakVar10.zze();
                                            if (zzbakVar10.zze() == i46) {
                                                int zzf = zzavw.zzf(zze6);
                                                if (zzf == 1) {
                                                    if (zzbakVar10.zzm() == 0) {
                                                        throw new zzasz("Variable length decription in sgpd found (unsupported)");
                                                    }
                                                } else if (zzf >= 2) {
                                                    zzbakVar10.zzw(4);
                                                }
                                                if (zzbakVar10.zzm() != 1) {
                                                    throw new zzasz("Entry count in sgpd != 1 (unsupported).");
                                                }
                                                zzbakVar10.zzw(2);
                                                z = true;
                                                if (zzbakVar10.zzg() == 1) {
                                                    int zzg3 = zzbakVar10.zzg();
                                                    byte[] bArr6 = new byte[16];
                                                    zzbakVar10.zzq(bArr6, 0, 16);
                                                    zzawqVar.zzl = true;
                                                    zzawqVar.zzn = new zzawp(true, zzg3, bArr6);
                                                }
                                            } else {
                                                z = true;
                                            }
                                            size = zzavuVar6.zzb.size();
                                            i3 = 0;
                                            while (i3 < size) {
                                                zzavv zzavvVar4 = (zzavv) zzavuVar6.zzb.get(i3);
                                                if (zzavvVar4.zzaR == zzavw.zzaj) {
                                                    zzbak zzbakVar11 = zzavvVar4.zza;
                                                    zzbakVar11.zzv(8);
                                                    bArr2 = bArr5;
                                                    zzbakVar11.zzq(bArr2, 0, 16);
                                                    if (Arrays.equals(bArr2, zzc)) {
                                                        zzc(zzbakVar11, 16, zzawqVar);
                                                    }
                                                } else {
                                                    bArr2 = bArr5;
                                                }
                                                i3++;
                                                bArr5 = bArr2;
                                            }
                                            bArr = bArr5;
                                            i20 = 8;
                                            r7 = z;
                                            bArr4 = bArr;
                                            size5 = i;
                                            sparseArray4 = sparseArray;
                                            zzavuVar4 = zzavuVar;
                                            i26 = i2 + 1;
                                        }
                                    }
                                    z = true;
                                    size = zzavuVar6.zzb.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                    }
                                    bArr = bArr5;
                                    i20 = 8;
                                    r7 = z;
                                    bArr4 = bArr;
                                    size5 = i;
                                    sparseArray4 = sparseArray;
                                    zzavuVar4 = zzavuVar;
                                    i26 = i2 + 1;
                                }
                            }
                            zzavuVar = zzavuVar4;
                            sparseArray = sparseArray4;
                            i = size5;
                            i2 = i26;
                            bArr = bArr4;
                            z = r7;
                            r7 = z;
                            bArr4 = bArr;
                            size5 = i;
                            sparseArray4 = sparseArray;
                            zzavuVar4 = zzavuVar;
                            i26 = i2 + 1;
                        }
                        zzauv zza5 = zza(zzavuVar4.zzb);
                        if (zza5 != null) {
                            zzawiVar = this;
                            int size7 = zzawiVar.zzd.size();
                            for (int i47 = 0; i47 < size7; i47++) {
                                zzawh zzawhVar5 = (zzawh) zzawiVar.zzd.valueAt(i47);
                                zzawhVar5.zzb.zza(zzawhVar5.zzc.zzf.zzc(zza5));
                            }
                        }
                    } else {
                        zzawiVar = zzawiVar2;
                        if (!zzawiVar.zzk.isEmpty()) {
                            ((zzavu) zzawiVar.zzk.peek()).zzc(zzavuVar4);
                        }
                    }
                    zzawiVar2 = zzawiVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final void zzd(zzava zzavaVar) {
        this.zzx = zzavaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final void zze(long j, long j2) {
        int size = this.zzd.size();
        for (int i = 0; i < size; i++) {
            ((zzawh) this.zzd.valueAt(i)).zzb();
        }
        this.zzl.clear();
        this.zzk.clear();
        zzb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x007f, code lost:
    
        r2 = r24.zzt;
        r3 = r2.zza;
        r5 = r3.zzh;
        r9 = r2.zze;
        r5 = r5[r9];
        r24.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x008d, code lost:
    
        if (r3.zzl == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x008f, code lost:
    
        r5 = r3.zzp;
        r10 = r3.zza.zza;
        r11 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0097, code lost:
    
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x009a, code lost:
    
        r11 = r2.zzc.zzh[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00a0, code lost:
    
        r10 = r11.zza;
        r3 = r3.zzm[r9];
        r9 = r24.zzh;
        r11 = r9.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x00aa, code lost:
    
        if (true == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00ac, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00b0, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.zzv(0);
        r2 = r2.zzb;
        r2.zzb(r24.zzh, 1);
        r2.zzb(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x00c1, code lost:
    
        if (r3 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00c3, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00d5, code lost:
    
        r24.zzv = r10;
        r5 = r24.zzu + r10;
        r24.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x00e6, code lost:
    
        if (r24.zzt.zzc.zzg != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x00e8, code lost:
    
        r24.zzu = r5 - 8;
        r1.zzi(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00ef, code lost:
    
        r24.zzm = 4;
        r24.zzw = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00f4, code lost:
    
        r2 = r24.zzt;
        r3 = r2.zza;
        r5 = r2.zzc;
        r9 = r2.zzb;
        r2 = r2.zze;
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0100, code lost:
    
        if (r6 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0102, code lost:
    
        r4 = r24.zzv;
        r6 = r24.zzu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0106, code lost:
    
        if (r4 >= r6) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0108, code lost:
    
        r24.zzv += r9.zzd(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0169, code lost:
    
        r10 = (r3.zzj[r2] + r3.zzi[r2]) * 1000;
        r1 = r3.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0178, code lost:
    
        if (true == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x017a, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x017e, code lost:
    
        r12 = r4 | (r3.zzk[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0184, code lost:
    
        if (r1 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0186, code lost:
    
        r1 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0188, code lost:
    
        if (r1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x018a, code lost:
    
        r1 = r5.zzh[r3.zza.zza];
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0192, code lost:
    
        r2 = r24.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0196, code lost:
    
        if (r1 == r2.zzi) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0198, code lost:
    
        r2 = new com.google.android.gms.internal.ads.zzavh(1, r1.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x01a2, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x01a6, code lost:
    
        r2 = r24.zzt;
        r2.zzh = r15;
        r2.zzi = r1;
        r9.zzc(r10, r12, r24.zzu, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x01b8, code lost:
    
        if (r24.zzl.isEmpty() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x01ba, code lost:
    
        r1 = r24.zzt;
        r1.zze++;
        r2 = r1.zzf + 1;
        r1.zzf = r2;
        r3 = r3.zzg;
        r4 = r1.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01cc, code lost:
    
        if (r2 != r3[r4]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01ce, code lost:
    
        r1.zzg = r4 + 1;
        r1.zzf = 0;
        r24.zzt = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01d6, code lost:
    
        r24.zzm = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01d9, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01da, code lost:
    
        r2 = (com.google.android.gms.internal.ads.zzawg) r24.zzl.removeFirst();
        r3 = r2.zzb;
        r2 = r2.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01a0, code lost:
    
        r2 = r2.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01a4, code lost:
    
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x017c, code lost:
    
        r4 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.EXACTLY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0113, code lost:
    
        r10 = r24.zzf.zza;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0126, code lost:
    
        if (r24.zzv >= r24.zzu) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0128, code lost:
    
        r11 = r24.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x012a, code lost:
    
        if (r11 != 0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x015a, code lost:
    
        r11 = r9.zzd(r1, r11, false);
        r24.zzv += r11;
        r24.zzw -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x012c, code lost:
    
        r1.zzh(r10, r6, r4, false);
        r24.zzf.zzv(0);
        r24.zzw = r24.zzf.zzi() - 1;
        r24.zze.zzv(0);
        r9.zzb(r24.zze, 4);
        r9.zzb(r24.zzf, 1);
        r24.zzv += 5;
        r24.zzu += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x00c5, code lost:
    
        r3 = r5.zzj();
        r5.zzw(-2);
        r3 = (r3 * 6) + 2;
        r2.zzb(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x00ae, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x00de, code lost:
    
        r24.zzv = 0;
     */
    @Override // com.google.android.gms.internal.ads.zzauz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzf(zzauy zzauyVar, zzave zzaveVar) throws IOException, InterruptedException {
        long zzn;
        long zzn2;
        zzauy zzauyVar2 = zzauyVar;
        while (true) {
            int i = this.zzm;
            int i2 = 0;
            if (i == 0) {
                if (this.zzp == 0) {
                    if (!zzauyVar2.zzh(this.zzi.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzp = 8;
                    this.zzi.zzv(0);
                    this.zzo = this.zzi.zzm();
                    this.zzn = this.zzi.zze();
                }
                long j = this.zzo;
                if (j == 1) {
                    zzauyVar2.zzh(this.zzi.zza, 8, 8, false);
                    this.zzp += 8;
                    j = this.zzi.zzn();
                    this.zzo = j;
                }
                long j2 = this.zzp;
                if (j < j2) {
                    throw new zzasz("Atom size less than header length (unsupported).");
                }
                long zzd = zzauyVar.zzd() - j2;
                if (this.zzn == zzavw.zzN) {
                    int size = this.zzd.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        zzawq zzawqVar = ((zzawh) this.zzd.valueAt(i3)).zza;
                        zzawqVar.zzc = zzd;
                        zzawqVar.zzb = zzd;
                    }
                }
                int i4 = this.zzn;
                if (i4 == zzavw.zzk) {
                    this.zzt = null;
                    this.zzr = zzd + this.zzo;
                    if (!this.zzy) {
                        this.zzx.zzc(new zzavf(this.zzs));
                        this.zzy = true;
                    }
                    this.zzm = 2;
                } else if (i4 == zzavw.zzE || i4 == zzavw.zzG || i4 == zzavw.zzH || i4 == zzavw.zzI || i4 == zzavw.zzJ || i4 == zzavw.zzN || i4 == zzavw.zzO || i4 == zzavw.zzP || i4 == zzavw.zzS) {
                    long zzd2 = (zzauyVar.zzd() + this.zzo) - 8;
                    this.zzk.add(new zzavu(i4, zzd2));
                    if (this.zzo == this.zzp) {
                        zzh(zzd2);
                    } else {
                        zzb();
                    }
                } else if (i4 == zzavw.zzV || i4 == zzavw.zzU || i4 == zzavw.zzF || i4 == zzavw.zzD || i4 == zzavw.zzW || i4 == zzavw.zzz || i4 == zzavw.zzA || i4 == zzavw.zzR || i4 == zzavw.zzB || i4 == zzavw.zzC || i4 == zzavw.zzX || i4 == zzavw.zzaf || i4 == zzavw.zzag || i4 == zzavw.zzak || i4 == zzavw.zzaj || i4 == zzavw.zzah || i4 == zzavw.zzai || i4 == zzavw.zzT || i4 == zzavw.zzQ || i4 == zzavw.zzaI) {
                    if (this.zzp != 8) {
                        throw new zzasz("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j3 = this.zzo;
                    if (j3 > 2147483647L) {
                        throw new zzasz("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    this.zzq = new zzbak((int) j3);
                    System.arraycopy(this.zzi.zza, 0, this.zzq.zza, 0, 8);
                    this.zzm = 1;
                } else {
                    if (this.zzo > 2147483647L) {
                        throw new zzasz("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzq = null;
                    this.zzm = 1;
                }
            } else if (i != 1) {
                long j4 = Long.MAX_VALUE;
                if (i != 2) {
                    if (i != 3) {
                        break;
                    }
                    if (this.zzt != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zzd;
                    int size2 = sparseArray.size();
                    zzawh zzawhVar = null;
                    for (int i5 = 0; i5 < size2; i5++) {
                        zzawh zzawhVar2 = (zzawh) sparseArray.valueAt(i5);
                        int i6 = zzawhVar2.zzg;
                        zzawq zzawqVar2 = zzawhVar2.zza;
                        if (i6 != zzawqVar2.zzd) {
                            long j5 = zzawqVar2.zzf[i6];
                            if (j5 < j4) {
                                zzawhVar = zzawhVar2;
                                j4 = j5;
                            }
                        }
                    }
                    if (zzawhVar == null) {
                        int zzd3 = (int) (this.zzr - zzauyVar.zzd());
                        if (zzd3 < 0) {
                            throw new zzasz("Offset to end of mdat was negative.");
                        }
                        zzauyVar2.zzi(zzd3, false);
                        zzb();
                    } else {
                        int zzd4 = (int) (zzawhVar.zza.zzf[zzawhVar.zzg] - zzauyVar.zzd());
                        if (zzd4 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd4 = 0;
                        }
                        zzauyVar2.zzi(zzd4, false);
                        this.zzt = zzawhVar;
                    }
                } else {
                    int size3 = this.zzd.size();
                    zzawh zzawhVar3 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzawq zzawqVar3 = ((zzawh) this.zzd.valueAt(i7)).zza;
                        if (zzawqVar3.zzq) {
                            long j6 = zzawqVar3.zzc;
                            if (j6 < j4) {
                                zzawhVar3 = (zzawh) this.zzd.valueAt(i7);
                                j4 = j6;
                            }
                        }
                    }
                    if (zzawhVar3 == null) {
                        this.zzm = 3;
                    } else {
                        int zzd5 = (int) (j4 - zzauyVar.zzd());
                        if (zzd5 < 0) {
                            throw new zzasz("Offset to encryption data was negative.");
                        }
                        zzauyVar2.zzi(zzd5, false);
                        zzawq zzawqVar4 = zzawhVar3.zza;
                        zzauyVar2.zzh(zzawqVar4.zzp.zza, 0, zzawqVar4.zzo, false);
                        zzawqVar4.zzp.zzv(0);
                        zzawqVar4.zzq = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzo) - this.zzp;
                zzbak zzbakVar = this.zzq;
                if (zzbakVar != null) {
                    zzauyVar2.zzh(zzbakVar.zza, 8, i8, false);
                    zzavv zzavvVar = new zzavv(this.zzn, this.zzq);
                    long zzd6 = zzauyVar.zzd();
                    if (this.zzk.isEmpty()) {
                        if (zzavvVar.zzaR == zzavw.zzD) {
                            zzbak zzbakVar2 = zzavvVar.zza;
                            zzbakVar2.zzv(8);
                            int zze = zzbakVar2.zze();
                            zzbakVar2.zzw(4);
                            long zzm = zzbakVar2.zzm();
                            if (zzavw.zzf(zze) == 0) {
                                zzn = zzbakVar2.zzm();
                                zzn2 = zzbakVar2.zzm();
                            } else {
                                zzn = zzbakVar2.zzn();
                                zzn2 = zzbakVar2.zzn();
                            }
                            long j7 = zzd6 + zzn2;
                            long j8 = zzn;
                            long zzj = zzbar.zzj(j8, 1000000L, zzm);
                            zzbakVar2.zzw(2);
                            int zzj2 = zzbakVar2.zzj();
                            int[] iArr = new int[zzj2];
                            long[] jArr = new long[zzj2];
                            long[] jArr2 = new long[zzj2];
                            long[] jArr3 = new long[zzj2];
                            long j9 = zzj;
                            while (i2 < zzj2) {
                                int zze2 = zzbakVar2.zze();
                                if ((zze2 & Integer.MIN_VALUE) != 0) {
                                    throw new zzasz("Unhandled indirect reference");
                                }
                                long zzm2 = zzbakVar2.zzm();
                                iArr[i2] = zze2 & Integer.MAX_VALUE;
                                jArr[i2] = j7;
                                jArr3[i2] = j9;
                                j8 += zzm2;
                                int i9 = zzj2;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                j9 = zzbar.zzj(j8, 1000000L, zzm);
                                jArr4[i2] = j9 - jArr5[i2];
                                zzbakVar2.zzw(4);
                                j7 += iArr[i2];
                                i2++;
                                jArr = jArr;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                zzj2 = i9;
                            }
                            Pair create = Pair.create(Long.valueOf(zzj), new zzaux(iArr, jArr, jArr2, jArr3));
                            ((Long) create.first).longValue();
                            this.zzx.zzc((zzavg) create.second);
                            this.zzy = true;
                        }
                        zzauyVar2 = zzauyVar;
                    } else {
                        ((zzavu) this.zzk.peek()).zzd(zzavvVar);
                    }
                } else {
                    zzauyVar2.zzi(i8, false);
                }
                zzh(zzauyVar.zzd());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final boolean zzg(zzauy zzauyVar) throws IOException, InterruptedException {
        return zzawn.zza(zzauyVar);
    }

    public zzawi(int i, zzbao zzbaoVar, zzawo zzawoVar) {
        this.zzi = new zzbak(16);
        this.zze = new zzbak(zzbai.zza);
        this.zzf = new zzbak(5);
        this.zzg = new zzbak();
        this.zzh = new zzbak(1);
        this.zzj = new byte[16];
        this.zzk = new Stack();
        this.zzl = new LinkedList();
        this.zzd = new SparseArray();
        this.zzs = -9223372036854775807L;
        zzb();
    }
}
