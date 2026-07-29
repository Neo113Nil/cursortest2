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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzave implements zzatv {
    public static final zzatx zza = new zzavb();
    private static final int zzb = zzazn.zzg("seig");
    private static final byte[] zzc = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final SparseArray zzd;
    private final zzazg zze;
    private final zzazg zzf;
    private final zzazg zzg;
    private final zzazg zzh;
    private final zzazg zzi;
    private final byte[] zzj;
    private final Stack zzk;
    private final LinkedList zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private zzazg zzq;
    private long zzr;
    private long zzs;
    private zzavd zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzatw zzx;
    private boolean zzy;

    public zzave() {
        this(0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzatr zza(List list) {
        Pair create;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzaur zzaurVar = (zzaur) list.get(i);
            if (zzaurVar.zzaR == zzaus.zzX) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzaurVar.zza.zza;
                zzazg zzazgVar = new zzazg(bArr);
                if (zzazgVar.zzd() >= 32) {
                    zzazgVar.zzv(0);
                    if (zzazgVar.zze() == zzazgVar.zza() + 4 && zzazgVar.zze() == zzaus.zzX) {
                        int zzf = zzaus.zzf(zzazgVar.zze());
                        if (zzf > 1) {
                            Log.w("PsshAtomUtil", "Unsupported pssh version: " + zzf);
                        } else {
                            UUID uuid2 = new UUID(zzazgVar.zzl(), zzazgVar.zzl());
                            if (zzf == 1) {
                                zzazgVar.zzw(zzazgVar.zzi() * 16);
                            }
                            int zzi = zzazgVar.zzi();
                            if (zzi == zzazgVar.zza()) {
                                byte[] bArr2 = new byte[zzi];
                                zzazgVar.zzq(bArr2, 0, zzi);
                                create = Pair.create(uuid2, bArr2);
                                uuid = create != null ? null : (UUID) create.first;
                                if (uuid != null) {
                                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList.add(new zzatq(uuid, "video/mp4", bArr, false));
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
        return new zzatr(arrayList);
    }

    private final void zzb() {
        this.zzm = 0;
        this.zzp = 0;
    }

    private static void zzc(zzazg zzazgVar, int i, zzavm zzavmVar) throws zzarv {
        zzazgVar.zzv(i + 8);
        int zze = zzaus.zze(zzazgVar.zze());
        if ((zze & 1) != 0) {
            throw new zzarv("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zze & 2) != 0;
        int zzi = zzazgVar.zzi();
        int i2 = zzavmVar.zze;
        if (zzi == i2) {
            Arrays.fill(zzavmVar.zzm, 0, zzi, z);
            zzavmVar.zza(zzazgVar.zza());
            zzazgVar.zzq(zzavmVar.zzp.zza, 0, zzavmVar.zzo);
            zzavmVar.zzp.zzv(0);
            zzavmVar.zzq = false;
            return;
        }
        throw new zzarv("Length mismatch: " + zzi + ", " + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x0631, code lost:
    
        zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0635, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0599  */
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
    private final void zzh(long j) throws zzarv {
        zzavk zza2;
        zzave zzaveVar;
        zzauq zzauqVar;
        SparseArray sparseArray;
        int i;
        int i2;
        byte[] bArr;
        zzavm zzavmVar;
        int size;
        int i3;
        byte[] bArr2;
        int i4;
        zzauq zzauqVar2;
        int i5;
        byte[] bArr3;
        int i6;
        zzauq zzauqVar3;
        zzavm zzavmVar2;
        List list;
        zzavd zzavdVar;
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
            zzave zzaveVar2 = this;
            while (!zzaveVar2.zzk.isEmpty() && ((zzauq) zzaveVar2.zzk.peek()).zza == j) {
                zzauq zzauqVar4 = (zzauq) zzaveVar2.zzk.pop();
                int i18 = zzauqVar4.zzaR;
                int i19 = 12;
                int i20 = 8;
                if (i18 == zzaus.zzE) {
                    zzatr zza3 = zza(zzauqVar4.zzb);
                    zzauq zza4 = zzauqVar4.zza(zzaus.zzP);
                    SparseArray sparseArray2 = new SparseArray();
                    int size2 = zza4.zzb.size();
                    long j4 = -9223372036854775807L;
                    int i21 = 0;
                    while (i21 < size2) {
                        zzaur zzaurVar = (zzaur) zza4.zzb.get(i21);
                        int i22 = zzaurVar.zzaR;
                        if (i22 == zzaus.zzB) {
                            zzazg zzazgVar = zzaurVar.zza;
                            zzazgVar.zzv(i19);
                            Pair create = Pair.create(Integer.valueOf(zzazgVar.zze()), new zzava(zzazgVar.zzi() - 1, zzazgVar.zzi(), zzazgVar.zzi(), zzazgVar.zze()));
                            sparseArray2.put(((Integer) create.first).intValue(), (zzava) create.second);
                        } else if (i22 == zzaus.zzQ) {
                            zzazg zzazgVar2 = zzaurVar.zza;
                            zzazgVar2.zzv(8);
                            j4 = zzaus.zzf(zzazgVar2.zze()) == 0 ? zzazgVar2.zzm() : zzazgVar2.zzn();
                        }
                        i21++;
                        i19 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size3 = zzauqVar4.zzc.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        zzauq zzauqVar5 = (zzauq) zzauqVar4.zzc.get(i23);
                        if (zzauqVar5.zzaR == zzaus.zzG && (zza2 = zzauz.zza(zzauqVar5, zzauqVar4.zzb(zzaus.zzF), j4, zza3, false)) != null) {
                            sparseArray3.put(zza2.zza, zza2);
                        }
                    }
                    int size4 = sparseArray3.size();
                    if (zzaveVar2.zzd.size() == 0) {
                        for (int i24 = 0; i24 < size4; i24++) {
                            zzavk zzavkVar = (zzavk) sparseArray3.valueAt(i24);
                            zzavd zzavdVar2 = new zzavd(zzaveVar2.zzx.zzbi(i24, zzavkVar.zzb));
                            zzavdVar2.zza(zzavkVar, (zzava) sparseArray2.get(zzavkVar.zza));
                            zzaveVar2.zzd.put(zzavkVar.zza, zzavdVar2);
                            zzaveVar2.zzs = Math.max(zzaveVar2.zzs, zzavkVar.zze);
                        }
                        zzaveVar2.zzx.zzb();
                    } else {
                        zzayy.zze(zzaveVar2.zzd.size() == size4);
                        for (int i25 = 0; i25 < size4; i25++) {
                            zzavk zzavkVar2 = (zzavk) sparseArray3.valueAt(i25);
                            ((zzavd) zzaveVar2.zzd.get(zzavkVar2.zza)).zza(zzavkVar2, (zzava) sparseArray2.get(zzavkVar2.zza));
                        }
                    }
                } else {
                    if (i18 == zzaus.zzN) {
                        SparseArray sparseArray4 = zzaveVar2.zzd;
                        byte[] bArr4 = zzaveVar2.zzj;
                        int size5 = zzauqVar4.zzc.size();
                        int i26 = 0;
                        while (i26 < size5) {
                            zzauq zzauqVar6 = (zzauq) zzauqVar4.zzc.get(i26);
                            if (zzauqVar6.zzaR == zzaus.zzO) {
                                zzazg zzazgVar3 = zzauqVar6.zzb(zzaus.zzA).zza;
                                zzazgVar3.zzv(i20);
                                int zze = zzaus.zze(zzazgVar3.zze());
                                zzavd zzavdVar3 = (zzavd) sparseArray4.get(zzazgVar3.zze());
                                if (zzavdVar3 == null) {
                                    zzavdVar3 = null;
                                } else {
                                    if ((zze & 1) != 0) {
                                        long zzn = zzazgVar3.zzn();
                                        zzavm zzavmVar3 = zzavdVar3.zza;
                                        zzavmVar3.zzb = zzn;
                                        zzavmVar3.zzc = zzn;
                                    }
                                    zzava zzavaVar = zzavdVar3.zzd;
                                    zzavdVar3.zza.zza = new zzava((zze & 2) != 0 ? zzazgVar3.zzi() - 1 : zzavaVar.zza, (zze & 8) != 0 ? zzazgVar3.zzi() : zzavaVar.zzb, (zze & 16) != 0 ? zzazgVar3.zzi() : zzavaVar.zzc, (zze & 32) != 0 ? zzazgVar3.zzi() : zzavaVar.zzd);
                                }
                                if (zzavdVar3 != null) {
                                    zzavm zzavmVar4 = zzavdVar3.zza;
                                    long j5 = zzavmVar4.zzr;
                                    zzavdVar3.zzb();
                                    if (zzauqVar6.zzb(zzaus.zzz) != null) {
                                        zzazg zzazgVar4 = zzauqVar6.zzb(zzaus.zzz).zza;
                                        zzazgVar4.zzv(i20);
                                        j5 = zzaus.zzf(zzazgVar4.zze()) == r7 ? zzazgVar4.zzn() : zzazgVar4.zzm();
                                    }
                                    List list2 = zzauqVar6.zzb;
                                    int size6 = list2.size();
                                    int i27 = 0;
                                    int i28 = 0;
                                    int i29 = 0;
                                    while (i29 < size6) {
                                        SparseArray sparseArray5 = sparseArray4;
                                        zzaur zzaurVar2 = (zzaur) list2.get(i29);
                                        int i30 = size5;
                                        long j6 = j5;
                                        if (zzaurVar2.zzaR == zzaus.zzC) {
                                            zzazg zzazgVar5 = zzaurVar2.zza;
                                            zzazgVar5.zzv(12);
                                            int zzi = zzazgVar5.zzi();
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
                                    zzavdVar3.zzg = 0;
                                    zzavdVar3.zzf = 0;
                                    zzavdVar3.zze = 0;
                                    zzavm zzavmVar5 = zzavdVar3.zza;
                                    zzavmVar5.zzd = i28;
                                    zzavmVar5.zze = i27;
                                    int[] iArr3 = zzavmVar5.zzg;
                                    if (iArr3 == null || iArr3.length < i28) {
                                        zzavmVar5.zzf = new long[i28];
                                        zzavmVar5.zzg = new int[i28];
                                    }
                                    int[] iArr4 = zzavmVar5.zzh;
                                    if (iArr4 == null || iArr4.length < i27) {
                                        int i31 = (i27 * 125) / 100;
                                        zzavmVar5.zzh = new int[i31];
                                        zzavmVar5.zzi = new int[i31];
                                        zzavmVar5.zzj = new long[i31];
                                        zzavmVar5.zzk = new boolean[i31];
                                        zzavmVar5.zzm = new boolean[i31];
                                    }
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (i32 < size6) {
                                        zzaur zzaurVar3 = (zzaur) list2.get(i32);
                                        if (zzaurVar3.zzaR == zzaus.zzC) {
                                            int i35 = i34 + 1;
                                            zzazg zzazgVar6 = zzaurVar3.zza;
                                            zzazgVar6.zzv(8);
                                            int zze2 = zzaus.zze(zzazgVar6.zze());
                                            zzavk zzavkVar3 = zzavdVar3.zzc;
                                            list = list2;
                                            zzavm zzavmVar6 = zzavdVar3.zza;
                                            zzava zzavaVar2 = zzavmVar6.zza;
                                            i7 = size6;
                                            zzavmVar6.zzg[i34] = zzazgVar6.zzi();
                                            long[] jArr = zzavmVar6.zzf;
                                            zzauqVar2 = zzauqVar4;
                                            long j8 = zzavmVar6.zzb;
                                            jArr[i34] = j8;
                                            if ((zze2 & 1) != 0) {
                                                i6 = i26;
                                                zzauqVar3 = zzauqVar6;
                                                zzavmVar2 = zzavmVar4;
                                                jArr[i34] = j8 + zzazgVar6.zze();
                                            } else {
                                                i6 = i26;
                                                zzauqVar3 = zzauqVar6;
                                                zzavmVar2 = zzavmVar4;
                                            }
                                            int i36 = zze2 & 4;
                                            int i37 = zzavaVar2.zzd;
                                            if (i36 != 0) {
                                                i37 = zzazgVar6.zzi();
                                            }
                                            int i38 = zze2 & 256;
                                            int i39 = zze2 & 512;
                                            int i40 = zze2 & 1024;
                                            int i41 = zze2 & 2048;
                                            long[] jArr2 = zzavkVar3.zzi;
                                            if (jArr2 != null) {
                                                i8 = i37;
                                                bArr3 = bArr4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i9 = i32;
                                                    j2 = zzazn.zzj(zzavkVar3.zzj[0], 1000L, zzavkVar3.zzc);
                                                    int[] iArr5 = zzavmVar6.zzh;
                                                    int[] iArr6 = zzavmVar6.zzi;
                                                    long[] jArr3 = zzavmVar6.zzj;
                                                    zzavdVar = zzavdVar3;
                                                    boolean[] zArr = zzavmVar6.zzk;
                                                    i5 = i9;
                                                    int i42 = zzavkVar3.zzb;
                                                    i10 = zzavmVar6.zzg[i34] + i33;
                                                    long j9 = zzavkVar3.zzc;
                                                    if (i34 <= 0) {
                                                        iArr = iArr5;
                                                        iArr2 = iArr6;
                                                        j3 = zzavmVar6.zzr;
                                                    } else {
                                                        iArr = iArr5;
                                                        iArr2 = iArr6;
                                                        j3 = j7;
                                                    }
                                                    while (i33 < i10) {
                                                        int zzi2 = i38 != 0 ? zzazgVar6.zzi() : zzavaVar2.zzb;
                                                        if (i39 != 0) {
                                                            i11 = i10;
                                                            i12 = zzazgVar6.zzi();
                                                        } else {
                                                            i11 = i10;
                                                            i12 = zzavaVar2.zzc;
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
                                                                    iArr2[i33] = (int) ((zzazgVar6.zze() * 1000) / j9);
                                                                } else {
                                                                    i15 = i38;
                                                                    i16 = i39;
                                                                    i17 = i40;
                                                                    iArr2[i33] = 0;
                                                                }
                                                                jArr3[i33] = zzazn.zzj(j3, 1000L, j9) - j2;
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
                                                            i14 = zzazgVar6.zze();
                                                        } else {
                                                            i13 = i36;
                                                            i14 = zzavaVar2.zzd;
                                                        }
                                                        if (i41 == 0) {
                                                        }
                                                        jArr3[i33] = zzazn.zzj(j3, 1000L, j9) - j2;
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
                                                    zzavmVar6.zzr = j3;
                                                    i34 = i35;
                                                    i33 = i10;
                                                }
                                            } else {
                                                i8 = i37;
                                                bArr3 = bArr4;
                                            }
                                            i9 = i32;
                                            j2 = 0;
                                            int[] iArr52 = zzavmVar6.zzh;
                                            int[] iArr62 = zzavmVar6.zzi;
                                            long[] jArr32 = zzavmVar6.zzj;
                                            zzavdVar = zzavdVar3;
                                            boolean[] zArr2 = zzavmVar6.zzk;
                                            i5 = i9;
                                            int i422 = zzavkVar3.zzb;
                                            i10 = zzavmVar6.zzg[i34] + i33;
                                            long j92 = zzavkVar3.zzc;
                                            if (i34 <= 0) {
                                            }
                                            while (i33 < i10) {
                                            }
                                            zzavmVar6.zzr = j3;
                                            i34 = i35;
                                            i33 = i10;
                                        } else {
                                            zzauqVar2 = zzauqVar4;
                                            i5 = i32;
                                            bArr3 = bArr4;
                                            i6 = i26;
                                            zzauqVar3 = zzauqVar6;
                                            zzavmVar2 = zzavmVar4;
                                            list = list2;
                                            zzavdVar = zzavdVar3;
                                            i7 = size6;
                                        }
                                        i32 = i5 + 1;
                                        list2 = list;
                                        size6 = i7;
                                        zzauqVar4 = zzauqVar2;
                                        i26 = i6;
                                        zzauqVar6 = zzauqVar3;
                                        zzavmVar4 = zzavmVar2;
                                        bArr4 = bArr3;
                                        zzavdVar3 = zzavdVar;
                                    }
                                    zzauqVar = zzauqVar4;
                                    byte[] bArr5 = bArr4;
                                    i2 = i26;
                                    zzavm zzavmVar7 = zzavmVar4;
                                    zzavd zzavdVar4 = zzavdVar3;
                                    zzaur zzb2 = zzauqVar6.zzb(zzaus.zzaf);
                                    if (zzb2 != null) {
                                        zzavmVar = zzavmVar7;
                                        zzavl zzavlVar = zzavdVar4.zzc.zzh[zzavmVar.zza.zza];
                                        zzazg zzazgVar7 = zzb2.zza;
                                        int i43 = zzavlVar.zza;
                                        zzazgVar7.zzv(8);
                                        if ((zzaus.zze(zzazgVar7.zze()) & 1) == 1) {
                                            zzazgVar7.zzw(8);
                                        }
                                        int zzg = zzazgVar7.zzg();
                                        int zzi3 = zzazgVar7.zzi();
                                        int i44 = zzavmVar.zze;
                                        if (zzi3 != i44) {
                                            throw new zzarv("Length mismatch: " + zzi3 + ", " + i44);
                                        }
                                        if (zzg == 0) {
                                            boolean[] zArr3 = zzavmVar.zzm;
                                            i4 = 0;
                                            for (int i45 = 0; i45 < zzi3; i45++) {
                                                int zzg2 = zzazgVar7.zzg();
                                                i4 += zzg2;
                                                zArr3[i45] = zzg2 > i43;
                                            }
                                        } else {
                                            i4 = zzg * zzi3;
                                            Arrays.fill(zzavmVar.zzm, 0, zzi3, zzg > i43);
                                        }
                                        zzavmVar.zza(i4);
                                    } else {
                                        zzavmVar = zzavmVar7;
                                    }
                                    zzaur zzb3 = zzauqVar6.zzb(zzaus.zzag);
                                    if (zzb3 != null) {
                                        zzazg zzazgVar8 = zzb3.zza;
                                        zzazgVar8.zzv(8);
                                        int zze3 = zzazgVar8.zze();
                                        if ((zzaus.zze(zze3) & 1) == 1) {
                                            zzazgVar8.zzw(8);
                                        }
                                        int zzi4 = zzazgVar8.zzi();
                                        if (zzi4 != 1) {
                                            throw new zzarv("Unexpected saio entry count: " + zzi4);
                                        }
                                        zzavmVar.zzc += zzaus.zzf(zze3) == 0 ? zzazgVar8.zzm() : zzazgVar8.zzn();
                                    }
                                    zzaur zzb4 = zzauqVar6.zzb(zzaus.zzak);
                                    if (zzb4 != null) {
                                        zzc(zzb4.zza, 0, zzavmVar);
                                    }
                                    zzaur zzb5 = zzauqVar6.zzb(zzaus.zzah);
                                    zzaur zzb6 = zzauqVar6.zzb(zzaus.zzai);
                                    if (zzb5 != null && zzb6 != null) {
                                        zzazg zzazgVar9 = zzb5.zza;
                                        zzazg zzazgVar10 = zzb6.zza;
                                        zzazgVar9.zzv(8);
                                        int zze4 = zzazgVar9.zze();
                                        int zze5 = zzazgVar9.zze();
                                        int i46 = zzb;
                                        if (zze5 == i46) {
                                            if (zzaus.zzf(zze4) == 1) {
                                                zzazgVar9.zzw(4);
                                            }
                                            if (zzazgVar9.zze() != 1) {
                                                throw new zzarv("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            zzazgVar10.zzv(8);
                                            int zze6 = zzazgVar10.zze();
                                            if (zzazgVar10.zze() == i46) {
                                                int zzf = zzaus.zzf(zze6);
                                                if (zzf == 1) {
                                                    if (zzazgVar10.zzm() == 0) {
                                                        throw new zzarv("Variable length decription in sgpd found (unsupported)");
                                                    }
                                                } else if (zzf >= 2) {
                                                    zzazgVar10.zzw(4);
                                                }
                                                if (zzazgVar10.zzm() != 1) {
                                                    throw new zzarv("Entry count in sgpd != 1 (unsupported).");
                                                }
                                                zzazgVar10.zzw(2);
                                                if (zzazgVar10.zzg() == 1) {
                                                    int zzg3 = zzazgVar10.zzg();
                                                    byte[] bArr6 = new byte[16];
                                                    zzazgVar10.zzq(bArr6, 0, 16);
                                                    zzavmVar.zzl = true;
                                                    zzavmVar.zzn = new zzavl(true, zzg3, bArr6);
                                                }
                                                size = zzauqVar6.zzb.size();
                                                i3 = 0;
                                                while (i3 < size) {
                                                    zzaur zzaurVar4 = (zzaur) zzauqVar6.zzb.get(i3);
                                                    if (zzaurVar4.zzaR == zzaus.zzaj) {
                                                        zzazg zzazgVar11 = zzaurVar4.zza;
                                                        zzazgVar11.zzv(8);
                                                        bArr2 = bArr5;
                                                        zzazgVar11.zzq(bArr2, 0, 16);
                                                        if (Arrays.equals(bArr2, zzc)) {
                                                            zzc(zzazgVar11, 16, zzavmVar);
                                                        }
                                                    } else {
                                                        bArr2 = bArr5;
                                                    }
                                                    i3++;
                                                    bArr5 = bArr2;
                                                }
                                                bArr = bArr5;
                                                i20 = 8;
                                                bArr4 = bArr;
                                                size5 = i;
                                                sparseArray4 = sparseArray;
                                                zzauqVar4 = zzauqVar;
                                                r7 = true;
                                                i26 = i2 + 1;
                                            }
                                        }
                                    }
                                    size = zzauqVar6.zzb.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                    }
                                    bArr = bArr5;
                                    i20 = 8;
                                    bArr4 = bArr;
                                    size5 = i;
                                    sparseArray4 = sparseArray;
                                    zzauqVar4 = zzauqVar;
                                    r7 = true;
                                    i26 = i2 + 1;
                                }
                            }
                            zzauqVar = zzauqVar4;
                            sparseArray = sparseArray4;
                            i = size5;
                            i2 = i26;
                            bArr = bArr4;
                            bArr4 = bArr;
                            size5 = i;
                            sparseArray4 = sparseArray;
                            zzauqVar4 = zzauqVar;
                            r7 = true;
                            i26 = i2 + 1;
                        }
                        zzatr zza5 = zza(zzauqVar4.zzb);
                        if (zza5 != null) {
                            zzaveVar = this;
                            int size7 = zzaveVar.zzd.size();
                            for (int i47 = 0; i47 < size7; i47++) {
                                zzavd zzavdVar5 = (zzavd) zzaveVar.zzd.valueAt(i47);
                                zzavdVar5.zzb.zza(zzavdVar5.zzc.zzf.zzc(zza5));
                            }
                        }
                    } else {
                        zzaveVar = zzaveVar2;
                        if (!zzaveVar.zzk.isEmpty()) {
                            ((zzauq) zzaveVar.zzk.peek()).zzc(zzauqVar4);
                        }
                    }
                    zzaveVar2 = zzaveVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzd(zzatw zzatwVar) {
        this.zzx = zzatwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zze(long j, long j2) {
        int size = this.zzd.size();
        for (int i = 0; i < size; i++) {
            ((zzavd) this.zzd.valueAt(i)).zzb();
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
    
        if (r4 >= r6) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0108, code lost:
    
        r24.zzv += r9.zzd(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0169, code lost:
    
        r10 = (r3.zzj[r2] + r3.zzi[r2]) * 1000;
        r1 = r3.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0179, code lost:
    
        if (true == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x017b, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x017f, code lost:
    
        r12 = r4 | (r3.zzk[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0185, code lost:
    
        if (r1 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0187, code lost:
    
        r1 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0189, code lost:
    
        if (r1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x018b, code lost:
    
        r1 = r5.zzh[r3.zza.zza];
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0193, code lost:
    
        r2 = r24.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0197, code lost:
    
        if (r1 == r2.zzi) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0199, code lost:
    
        r2 = new com.google.android.gms.internal.ads.zzaud(1, r1.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x01a3, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x01a7, code lost:
    
        r2 = r24.zzt;
        r2.zzh = r15;
        r2.zzi = r1;
        r9.zzc(r10, r12, r24.zzu, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x01b9, code lost:
    
        if (r24.zzl.isEmpty() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x01bb, code lost:
    
        r1 = r24.zzt;
        r1.zze++;
        r2 = r1.zzf + 1;
        r1.zzf = r2;
        r3 = r3.zzg;
        r4 = r1.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01cd, code lost:
    
        if (r2 != r3[r4]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01cf, code lost:
    
        r1.zzg = r4 + 1;
        r1.zzf = 0;
        r24.zzt = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01d7, code lost:
    
        r24.zzm = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01da, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01db, code lost:
    
        r2 = (com.google.android.gms.internal.ads.zzavc) r24.zzl.removeFirst();
        r3 = r2.zzb;
        r2 = r2.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01e8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01a1, code lost:
    
        r2 = r2.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01a5, code lost:
    
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x017d, code lost:
    
        r4 = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY;
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
    
        if (r24.zzv >= r24.zzu) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0128, code lost:
    
        r11 = r24.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x012a, code lost:
    
        if (r11 != 0) goto L303;
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
    @Override // com.google.android.gms.internal.ads.zzatv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzf(zzatu zzatuVar, zzaua zzauaVar) throws IOException, InterruptedException {
        long zzn;
        long zzn2;
        zzatu zzatuVar2 = zzatuVar;
        while (true) {
            int i = this.zzm;
            int i2 = 0;
            if (i == 0) {
                if (this.zzp == 0) {
                    if (!zzatuVar2.zzh(this.zzi.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzp = 8;
                    this.zzi.zzv(0);
                    this.zzo = this.zzi.zzm();
                    this.zzn = this.zzi.zze();
                }
                long j = this.zzo;
                if (j == 1) {
                    zzatuVar2.zzh(this.zzi.zza, 8, 8, false);
                    this.zzp += 8;
                    j = this.zzi.zzn();
                    this.zzo = j;
                }
                long j2 = this.zzp;
                if (j < j2) {
                    throw new zzarv("Atom size less than header length (unsupported).");
                }
                long zzd = zzatuVar.zzd() - j2;
                if (this.zzn == zzaus.zzN) {
                    int size = this.zzd.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        zzavm zzavmVar = ((zzavd) this.zzd.valueAt(i3)).zza;
                        zzavmVar.zzc = zzd;
                        zzavmVar.zzb = zzd;
                    }
                }
                int i4 = this.zzn;
                if (i4 == zzaus.zzk) {
                    this.zzt = null;
                    this.zzr = zzd + this.zzo;
                    if (!this.zzy) {
                        this.zzx.zzc(new zzaub(this.zzs));
                        this.zzy = true;
                    }
                    this.zzm = 2;
                } else if (i4 == zzaus.zzE || i4 == zzaus.zzG || i4 == zzaus.zzH || i4 == zzaus.zzI || i4 == zzaus.zzJ || i4 == zzaus.zzN || i4 == zzaus.zzO || i4 == zzaus.zzP || i4 == zzaus.zzS) {
                    long zzd2 = (zzatuVar.zzd() + this.zzo) - 8;
                    this.zzk.add(new zzauq(i4, zzd2));
                    if (this.zzo == this.zzp) {
                        zzh(zzd2);
                    } else {
                        zzb();
                    }
                } else if (i4 == zzaus.zzV || i4 == zzaus.zzU || i4 == zzaus.zzF || i4 == zzaus.zzD || i4 == zzaus.zzW || i4 == zzaus.zzz || i4 == zzaus.zzA || i4 == zzaus.zzR || i4 == zzaus.zzB || i4 == zzaus.zzC || i4 == zzaus.zzX || i4 == zzaus.zzaf || i4 == zzaus.zzag || i4 == zzaus.zzak || i4 == zzaus.zzaj || i4 == zzaus.zzah || i4 == zzaus.zzai || i4 == zzaus.zzT || i4 == zzaus.zzQ || i4 == zzaus.zzaI) {
                    if (this.zzp != 8) {
                        throw new zzarv("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j3 = this.zzo;
                    if (j3 > 2147483647L) {
                        throw new zzarv("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    this.zzq = new zzazg((int) j3);
                    System.arraycopy(this.zzi.zza, 0, this.zzq.zza, 0, 8);
                    this.zzm = 1;
                } else {
                    if (this.zzo > 2147483647L) {
                        throw new zzarv("Skipping atom with length > 2147483647 (unsupported).");
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
                    zzavd zzavdVar = null;
                    for (int i5 = 0; i5 < size2; i5++) {
                        zzavd zzavdVar2 = (zzavd) sparseArray.valueAt(i5);
                        int i6 = zzavdVar2.zzg;
                        zzavm zzavmVar2 = zzavdVar2.zza;
                        if (i6 != zzavmVar2.zzd) {
                            long j5 = zzavmVar2.zzf[i6];
                            if (j5 < j4) {
                                zzavdVar = zzavdVar2;
                                j4 = j5;
                            }
                        }
                    }
                    if (zzavdVar == null) {
                        int zzd3 = (int) (this.zzr - zzatuVar.zzd());
                        if (zzd3 < 0) {
                            throw new zzarv("Offset to end of mdat was negative.");
                        }
                        zzatuVar2.zzi(zzd3, false);
                        zzb();
                    } else {
                        int zzd4 = (int) (zzavdVar.zza.zzf[zzavdVar.zzg] - zzatuVar.zzd());
                        if (zzd4 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd4 = 0;
                        }
                        zzatuVar2.zzi(zzd4, false);
                        this.zzt = zzavdVar;
                    }
                } else {
                    int size3 = this.zzd.size();
                    zzavd zzavdVar3 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzavm zzavmVar3 = ((zzavd) this.zzd.valueAt(i7)).zza;
                        if (zzavmVar3.zzq) {
                            long j6 = zzavmVar3.zzc;
                            if (j6 < j4) {
                                zzavdVar3 = (zzavd) this.zzd.valueAt(i7);
                                j4 = j6;
                            }
                        }
                    }
                    if (zzavdVar3 == null) {
                        this.zzm = 3;
                    } else {
                        int zzd5 = (int) (j4 - zzatuVar.zzd());
                        if (zzd5 < 0) {
                            throw new zzarv("Offset to encryption data was negative.");
                        }
                        zzatuVar2.zzi(zzd5, false);
                        zzavm zzavmVar4 = zzavdVar3.zza;
                        zzatuVar2.zzh(zzavmVar4.zzp.zza, 0, zzavmVar4.zzo, false);
                        zzavmVar4.zzp.zzv(0);
                        zzavmVar4.zzq = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzo) - this.zzp;
                zzazg zzazgVar = this.zzq;
                if (zzazgVar != null) {
                    zzatuVar2.zzh(zzazgVar.zza, 8, i8, false);
                    zzaur zzaurVar = new zzaur(this.zzn, this.zzq);
                    long zzd6 = zzatuVar.zzd();
                    if (this.zzk.isEmpty()) {
                        if (zzaurVar.zzaR == zzaus.zzD) {
                            zzazg zzazgVar2 = zzaurVar.zza;
                            zzazgVar2.zzv(8);
                            int zze = zzazgVar2.zze();
                            zzazgVar2.zzw(4);
                            long zzm = zzazgVar2.zzm();
                            if (zzaus.zzf(zze) == 0) {
                                zzn = zzazgVar2.zzm();
                                zzn2 = zzazgVar2.zzm();
                            } else {
                                zzn = zzazgVar2.zzn();
                                zzn2 = zzazgVar2.zzn();
                            }
                            long j7 = zzd6 + zzn2;
                            long j8 = zzn;
                            long zzj = zzazn.zzj(j8, 1000000L, zzm);
                            zzazgVar2.zzw(2);
                            int zzj2 = zzazgVar2.zzj();
                            int[] iArr = new int[zzj2];
                            long[] jArr = new long[zzj2];
                            long[] jArr2 = new long[zzj2];
                            long[] jArr3 = new long[zzj2];
                            long j9 = zzj;
                            while (i2 < zzj2) {
                                int zze2 = zzazgVar2.zze();
                                if ((zze2 & Integer.MIN_VALUE) != 0) {
                                    throw new zzarv("Unhandled indirect reference");
                                }
                                long zzm2 = zzazgVar2.zzm();
                                iArr[i2] = zze2 & Integer.MAX_VALUE;
                                jArr[i2] = j7;
                                jArr3[i2] = j9;
                                j8 += zzm2;
                                int i9 = zzj2;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                j9 = zzazn.zzj(j8, 1000000L, zzm);
                                jArr4[i2] = j9 - jArr5[i2];
                                zzazgVar2.zzw(4);
                                j7 += iArr[i2];
                                i2++;
                                jArr = jArr;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                zzj2 = i9;
                            }
                            Pair create = Pair.create(Long.valueOf(zzj), new zzatt(iArr, jArr, jArr2, jArr3));
                            ((Long) create.first).longValue();
                            this.zzx.zzc((zzauc) create.second);
                            this.zzy = true;
                        }
                        zzatuVar2 = zzatuVar;
                    } else {
                        ((zzauq) this.zzk.peek()).zzd(zzaurVar);
                    }
                } else {
                    zzatuVar2.zzi(i8, false);
                }
                zzh(zzatuVar.zzd());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean zzg(zzatu zzatuVar) throws IOException, InterruptedException {
        return zzavj.zza(zzatuVar);
    }

    public zzave(int i, zzazk zzazkVar, zzavk zzavkVar) {
        this.zzi = new zzazg(16);
        this.zze = new zzazg(zzaze.zza);
        this.zzf = new zzazg(5);
        this.zzg = new zzazg();
        this.zzh = new zzazg(1);
        this.zzj = new byte[16];
        this.zzk = new Stack();
        this.zzl = new LinkedList();
        this.zzd = new SparseArray();
        this.zzs = -9223372036854775807L;
        zzb();
    }
}
