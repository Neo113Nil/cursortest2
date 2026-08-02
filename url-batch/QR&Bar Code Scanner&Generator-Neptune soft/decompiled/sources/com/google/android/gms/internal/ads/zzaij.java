package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaij implements zzaib {
    final /* synthetic */ zzaik zza;
    private final zzee zzb = new zzee(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaij(zzaik zzaikVar, int i) {
        this.zza = zzaikVar;
        this.zze = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
    
        if (r29.zzk() == 21) goto L26;
     */
    @Override // com.google.android.gms.internal.ads.zzaib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzef zzefVar) {
        List list;
        SparseArray sparseArray;
        int i;
        zzzl zzzlVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzel zzelVar;
        int i2;
        zzzl zzzlVar2;
        SparseArray sparseArray2;
        zzel zzelVar2;
        int i3;
        int i4;
        SparseBooleanArray sparseBooleanArray3;
        zzain zzainVar;
        zzel zzelVar3;
        int i5;
        int i6;
        if (zzefVar.zzk() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzel zzelVar4 = (zzel) list.get(0);
        if ((zzefVar.zzk() & 128) == 0) {
            return;
        }
        zzefVar.zzG(1);
        int zzo = zzefVar.zzo();
        int i7 = 3;
        zzefVar.zzG(3);
        zzefVar.zzA(this.zzb, 2);
        this.zzb.zzj(3);
        int i8 = 13;
        this.zza.zzq = this.zzb.zzc(13);
        zzefVar.zzA(this.zzb, 2);
        int i9 = 4;
        this.zzb.zzj(4);
        int i10 = 12;
        zzefVar.zzG(this.zzb.zzc(12));
        this.zzc.clear();
        this.zzd.clear();
        int zza = zzefVar.zza();
        while (zza > 0) {
            int i11 = 5;
            zzefVar.zzA(this.zzb, 5);
            int zzc = this.zzb.zzc(8);
            this.zzb.zzj(i7);
            int zzc2 = this.zzb.zzc(i8);
            this.zzb.zzj(i9);
            int zzc3 = this.zzb.zzc(i10);
            int zzc4 = zzefVar.zzc();
            int i12 = zzc4 + zzc3;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (true) {
                if (zzefVar.zzc() >= i12) {
                    zzelVar2 = zzelVar4;
                    i3 = zzo;
                    i4 = i9;
                    break;
                }
                int zzk = zzefVar.zzk();
                int zzc5 = zzefVar.zzc() + zzefVar.zzk();
                if (zzc5 > i12) {
                    zzelVar2 = zzelVar4;
                    i3 = zzo;
                    i4 = 4;
                    break;
                }
                if (zzk == i11) {
                    long zzs = zzefVar.zzs();
                    if (zzs == 1094921523) {
                        i13 = 129;
                    } else if (zzs == 1161904947) {
                        i13 = 135;
                    } else {
                        if (zzs != 1094921524) {
                            if (zzs == 1212503619) {
                                i13 = 36;
                            }
                        }
                        i13 = 172;
                    }
                    zzelVar3 = zzelVar4;
                    i5 = zzo;
                } else if (zzk == 106) {
                    zzelVar3 = zzelVar4;
                    i5 = zzo;
                    i13 = 129;
                } else {
                    if (zzk == 122) {
                        zzelVar3 = zzelVar4;
                        i13 = 135;
                        i6 = 4;
                        i5 = zzo;
                    } else if (zzk != 127) {
                        if (zzk == 123) {
                            zzelVar3 = zzelVar4;
                            i13 = 138;
                        } else if (zzk == 10) {
                            zzelVar3 = zzelVar4;
                            str = zzefVar.zzx(3, zzfsk.zzc).trim();
                        } else {
                            int i14 = 3;
                            if (zzk == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (zzefVar.zzc() < zzc5) {
                                    String trim = zzefVar.zzx(i14, zzfsk.zzc).trim();
                                    int zzk2 = zzefVar.zzk();
                                    zzel zzelVar5 = zzelVar4;
                                    byte[] bArr = new byte[4];
                                    zzefVar.zzB(bArr, 0, 4);
                                    arrayList2.add(new zzail(trim, zzk2, bArr));
                                    zzelVar4 = zzelVar5;
                                    zzo = zzo;
                                    i14 = 3;
                                }
                                zzelVar3 = zzelVar4;
                                i5 = zzo;
                                i6 = 4;
                                arrayList = arrayList2;
                                i13 = 89;
                            } else {
                                zzelVar3 = zzelVar4;
                                i5 = zzo;
                                i6 = 4;
                                if (zzk == 111) {
                                    i13 = 257;
                                }
                            }
                        }
                        i5 = zzo;
                    }
                    zzefVar.zzG(zzc5 - zzefVar.zzc());
                    i9 = i6;
                    zzelVar4 = zzelVar3;
                    zzo = i5;
                    i11 = 5;
                }
                i6 = 4;
                zzefVar.zzG(zzc5 - zzefVar.zzc());
                i9 = i6;
                zzelVar4 = zzelVar3;
                zzo = i5;
                i11 = 5;
            }
            zzefVar.zzF(i12);
            zzaim zzaimVar = new zzaim(i13, str, arrayList, Arrays.copyOfRange(zzefVar.zzH(), zzc4, i12));
            if (zzc == 6 || zzc == 5) {
                zzc = zzaimVar.zza;
            }
            zza -= zzc3 + 5;
            sparseBooleanArray3 = this.zza.zzg;
            if (!sparseBooleanArray3.get(zzc2)) {
                zzainVar = this.zza.zze;
                zzaip zza2 = zzainVar.zza(zzc, zzaimVar);
                this.zzd.put(zzc2, zzc2);
                this.zzc.put(zzc2, zza2);
            }
            i9 = i4;
            zzelVar4 = zzelVar2;
            zzo = i3;
            i7 = 3;
            i10 = 12;
            i8 = 13;
        }
        zzel zzelVar6 = zzelVar4;
        int i15 = zzo;
        int size = this.zzd.size();
        int i16 = 0;
        while (i16 < size) {
            int keyAt = this.zzd.keyAt(i16);
            int valueAt = this.zzd.valueAt(i16);
            sparseBooleanArray = this.zza.zzg;
            sparseBooleanArray.put(keyAt, true);
            sparseBooleanArray2 = this.zza.zzh;
            sparseBooleanArray2.put(valueAt, true);
            zzaip zzaipVar = (zzaip) this.zzc.valueAt(i16);
            if (zzaipVar != null) {
                zzzlVar2 = this.zza.zzk;
                i2 = i15;
                zzaio zzaioVar = new zzaio(i2, keyAt, 8192);
                zzelVar = zzelVar6;
                zzaipVar.zzb(zzelVar, zzzlVar2, zzaioVar);
                sparseArray2 = this.zza.zzf;
                sparseArray2.put(valueAt, zzaipVar);
            } else {
                zzelVar = zzelVar6;
                i2 = i15;
            }
            i16++;
            zzelVar6 = zzelVar;
            i15 = i2;
        }
        sparseArray = this.zza.zzf;
        sparseArray.remove(this.zze);
        this.zza.zzl = 0;
        zzaik zzaikVar = this.zza;
        i = zzaikVar.zzl;
        if (i == 0) {
            zzzlVar = zzaikVar.zzk;
            zzzlVar.zzC();
            this.zza.zzm = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaib
    public final void zzb(zzel zzelVar, zzzl zzzlVar, zzaio zzaioVar) {
    }
}
