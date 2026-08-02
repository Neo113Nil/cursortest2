package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzann implements zzang {
    final /* synthetic */ zzano zza;
    private final zzej zzb = new zzej(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzann(zzano zzanoVar, int i) {
        this.zza = zzanoVar;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zza(zzek zzekVar) {
        List list;
        SparseArray sparseArray;
        int i;
        zzacn zzacnVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzer zzerVar;
        zzacn zzacnVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzanr zzanrVar;
        zzer zzerVar2;
        if (zzekVar.zzm() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzer zzerVar3 = (zzer) list.get(0);
        if ((zzekVar.zzm() & 128) != 0) {
            zzekVar.zzL(1);
            int zzq = zzekVar.zzq();
            int i2 = 3;
            zzekVar.zzL(3);
            zzekVar.zzF(this.zzb, 2);
            this.zzb.zzn(3);
            int i3 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzekVar.zzF(this.zzb, 2);
            int i4 = 4;
            this.zzb.zzn(4);
            int i5 = 12;
            zzekVar.zzL(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int zzb = zzekVar.zzb();
            while (zzb > 0) {
                int i6 = 5;
                zzekVar.zzF(this.zzb, 5);
                zzej zzejVar = this.zzb;
                int zzd = zzejVar.zzd(8);
                zzejVar.zzn(i2);
                int zzd2 = this.zzb.zzd(i3);
                this.zzb.zzn(i4);
                int zzd3 = this.zzb.zzd(i5);
                int zzd4 = zzekVar.zzd();
                int i7 = zzd4 + zzd3;
                String str = null;
                ArrayList arrayList = null;
                int i8 = -1;
                int i9 = 0;
                while (zzekVar.zzd() < i7) {
                    int zzm = zzekVar.zzm();
                    int zzd5 = zzekVar.zzd() + zzekVar.zzm();
                    if (zzd5 > i7) {
                        break;
                    }
                    if (zzm == i6) {
                        long zzu = zzekVar.zzu();
                        if (zzu != 1094921523) {
                            if (zzu != 1161904947) {
                                if (zzu != 1094921524) {
                                    if (zzu == 1212503619) {
                                        zzerVar2 = zzerVar3;
                                        i8 = 36;
                                    }
                                    zzerVar2 = zzerVar3;
                                }
                                zzerVar2 = zzerVar3;
                                i8 = Opcodes.IRETURN;
                            }
                            zzerVar2 = zzerVar3;
                            i8 = Opcodes.I2D;
                        }
                        zzerVar2 = zzerVar3;
                        i8 = Opcodes.LOR;
                    } else {
                        if (zzm != 106) {
                            if (zzm != 122) {
                                if (zzm == 127) {
                                    int zzm2 = zzekVar.zzm();
                                    if (zzm2 != 21) {
                                        if (zzm2 == 14) {
                                            zzerVar2 = zzerVar3;
                                            i8 = Opcodes.L2I;
                                        } else {
                                            if (zzm2 == 33) {
                                                zzerVar2 = zzerVar3;
                                                i8 = Opcodes.F2I;
                                            }
                                            zzerVar2 = zzerVar3;
                                        }
                                    }
                                    zzerVar2 = zzerVar3;
                                    i8 = Opcodes.IRETURN;
                                } else if (zzm == 123) {
                                    zzerVar2 = zzerVar3;
                                    i8 = Opcodes.L2D;
                                } else if (zzm == 10) {
                                    String trim = zzekVar.zzA(i2, zzfuj.zzc).trim();
                                    i9 = zzekVar.zzm();
                                    zzerVar2 = zzerVar3;
                                    str = trim;
                                } else if (zzm == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzekVar.zzd() < zzd5) {
                                        String trim2 = zzekVar.zzA(i2, zzfuj.zzc).trim();
                                        int zzm3 = zzekVar.zzm();
                                        zzer zzerVar4 = zzerVar3;
                                        byte[] bArr = new byte[i4];
                                        zzekVar.zzG(bArr, 0, i4);
                                        arrayList2.add(new zzanp(trim2, zzm3, bArr));
                                        zzerVar3 = zzerVar4;
                                        i2 = 3;
                                        i4 = 4;
                                    }
                                    zzerVar2 = zzerVar3;
                                    arrayList = arrayList2;
                                    i8 = 89;
                                } else {
                                    zzerVar2 = zzerVar3;
                                    if (zzm == 111) {
                                        i8 = 257;
                                    }
                                }
                            }
                            zzerVar2 = zzerVar3;
                            i8 = Opcodes.I2D;
                        }
                        zzerVar2 = zzerVar3;
                        i8 = Opcodes.LOR;
                    }
                    zzekVar.zzL(zzd5 - zzekVar.zzd());
                    zzerVar3 = zzerVar2;
                    i2 = 3;
                    i4 = 4;
                    i6 = 5;
                }
                zzer zzerVar5 = zzerVar3;
                zzekVar.zzK(i7);
                zzanq zzanqVar = new zzanq(i8, str, i9, arrayList, Arrays.copyOfRange(zzekVar.zzM(), zzd4, i7));
                if (zzd == 6 || zzd == 5) {
                    zzd = zzanqVar.zza;
                }
                zzb -= zzd3 + 5;
                sparseBooleanArray3 = this.zza.zzh;
                if (!sparseBooleanArray3.get(zzd2)) {
                    zzanrVar = this.zza.zze;
                    zzant zza = zzanrVar.zza(zzd, zzanqVar);
                    this.zzd.put(zzd2, zzd2);
                    this.zzc.put(zzd2, zza);
                }
                zzerVar3 = zzerVar5;
                i2 = 3;
                i4 = 4;
                i5 = 12;
                i3 = 13;
            }
            zzer zzerVar6 = zzerVar3;
            int size = this.zzd.size();
            int i10 = 0;
            while (i10 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzano zzanoVar = this.zza;
                int keyAt = sparseIntArray.keyAt(i10);
                int valueAt = sparseIntArray.valueAt(i10);
                sparseBooleanArray = zzanoVar.zzh;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.zza.zzi;
                sparseBooleanArray2.put(valueAt, true);
                zzant zzantVar = (zzant) this.zzc.valueAt(i10);
                if (zzantVar != null) {
                    zzacnVar2 = this.zza.zzl;
                    zzans zzansVar = new zzans(zzq, keyAt, 8192);
                    zzerVar = zzerVar6;
                    zzantVar.zzb(zzerVar, zzacnVar2, zzansVar);
                    sparseArray2 = this.zza.zzg;
                    sparseArray2.put(valueAt, zzantVar);
                } else {
                    zzerVar = zzerVar6;
                }
                i10++;
                zzerVar6 = zzerVar;
            }
            zzano zzanoVar2 = this.zza;
            int i11 = this.zze;
            sparseArray = zzanoVar2.zzg;
            sparseArray.remove(i11);
            this.zza.zzm = 0;
            zzano zzanoVar3 = this.zza;
            i = zzanoVar3.zzm;
            if (i == 0) {
                zzacnVar = zzanoVar3.zzl;
                zzacnVar.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzb(zzer zzerVar, zzacn zzacnVar, zzans zzansVar) {
    }
}
