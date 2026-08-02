package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzvf extends zzcu {
    public static final zzvf zzD;

    @Deprecated
    public static final zzvf zzE;
    public static final zzn zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    private final SparseArray zzT;
    private final SparseBooleanArray zzU;

    static {
        zzvf zzvfVar = new zzvf(new zzvd());
        zzD = zzvfVar;
        zzE = zzvfVar;
        zzF = new zzn() { // from class: com.google.android.gms.internal.ads.zzvb
        };
    }

    private zzvf(zzvd zzvdVar) {
        super(zzvdVar);
        this.zzG = zzvdVar.zza;
        this.zzH = false;
        this.zzI = zzvdVar.zzb;
        this.zzJ = false;
        this.zzK = zzvdVar.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzvdVar.zzd;
        this.zzQ = zzvdVar.zze;
        this.zzR = false;
        this.zzS = zzvdVar.zzf;
        this.zzT = zzvdVar.zzg;
        this.zzU = zzvdVar.zzh;
    }

    public static zzvf zzd(Context context) {
        return new zzvf(new zzvd(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzvf zzvfVar = (zzvf) obj;
            if (super.equals(zzvfVar) && this.zzG == zzvfVar.zzG && this.zzI == zzvfVar.zzI && this.zzK == zzvfVar.zzK && this.zzP == zzvfVar.zzP && this.zzQ == zzvfVar.zzQ && this.zzS == zzvfVar.zzS) {
                SparseBooleanArray sparseBooleanArray = this.zzU;
                SparseBooleanArray sparseBooleanArray2 = zzvfVar.zzU;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzT;
                            SparseArray sparseArray2 = zzvfVar.zzT;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzuh zzuhVar = (zzuh) entry.getKey();
                                                if (map2.containsKey(zzuhVar) && zzen.zzT(entry.getValue(), map2.get(zzuhVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 961) + (this.zzS ? 1 : 0);
    }

    public final zzvd zzc() {
        return new zzvd(this, null);
    }

    @Deprecated
    public final zzvh zze(int i, zzuh zzuhVar) {
        Map map = (Map) this.zzT.get(i);
        if (map != null) {
            return (zzvh) map.get(zzuhVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzU.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzuh zzuhVar) {
        Map map = (Map) this.zzT.get(i);
        return map != null && map.containsKey(zzuhVar);
    }
}
