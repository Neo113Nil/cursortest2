package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzuu extends zzcp {
    public static final zzuu zzC;

    @Deprecated
    public static final zzuu zzD;
    public static final zzl zzE;
    public final int zzF;
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
    private final SparseArray zzS;
    private final SparseBooleanArray zzT;

    static {
        zzuu zzuuVar = new zzuu(new zzuw());
        zzC = zzuuVar;
        zzD = zzuuVar;
        zzE = new zzl() { // from class: com.google.android.gms.internal.ads.zzus
        };
    }

    private zzuu(zzuw zzuwVar) {
        super(zzuwVar);
        this.zzG = zzuwVar.zza;
        this.zzH = false;
        this.zzI = zzuwVar.zzb;
        this.zzJ = false;
        this.zzK = zzuwVar.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzF = 0;
        this.zzP = zzuwVar.zzd;
        this.zzQ = false;
        this.zzR = zzuwVar.zze;
        this.zzS = zzuwVar.zzf;
        this.zzT = zzuwVar.zzg;
    }

    public static zzuu zzc(Context context) {
        return new zzuu(new zzuw(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzuu zzuuVar = (zzuu) obj;
            if (super.equals(zzuuVar) && this.zzG == zzuuVar.zzG && this.zzI == zzuuVar.zzI && this.zzK == zzuuVar.zzK && this.zzP == zzuuVar.zzP && this.zzR == zzuuVar.zzR) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzuuVar.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzuuVar.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zztz zztzVar = (zztz) entry.getKey();
                                                if (map2.containsKey(zztzVar) && zzeg.zzS(entry.getValue(), map2.get(zztzVar))) {
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

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 887503681) + (this.zzP ? 1 : 0)) * 961) + (this.zzR ? 1 : 0);
    }

    public final zzuw zzd() {
        return new zzuw(this, null);
    }

    @Deprecated
    public final zzuy zze(int i, zztz zztzVar) {
        Map map = (Map) this.zzS.get(i);
        if (map != null) {
            return (zzuy) map.get(zztzVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zztz zztzVar) {
        Map map = (Map) this.zzS.get(i);
        return map != null && map.containsKey(zztzVar);
    }
}
