package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzxi extends zzci {
    public final boolean zzC;
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
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
    private final SparseArray zzR;
    private final SparseBooleanArray zzS;

    static {
        new zzxi(new zzxg());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
    }

    private zzxi(zzxg zzxgVar) {
        super(zzxgVar);
        this.zzC = zzxgVar.zza;
        this.zzD = false;
        this.zzE = zzxgVar.zzb;
        this.zzF = false;
        this.zzG = zzxgVar.zzc;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = zzxgVar.zzd;
        this.zzM = zzxgVar.zze;
        this.zzN = zzxgVar.zzf;
        this.zzO = false;
        this.zzP = zzxgVar.zzg;
        this.zzQ = false;
        this.zzR = zzxgVar.zzh;
        this.zzS = zzxgVar.zzi;
    }

    public static zzxi zzd(Context context) {
        return new zzxi(new zzxg(context));
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxi zzxiVar = (zzxi) obj;
            if (super.equals(zzxiVar) && this.zzC == zzxiVar.zzC && this.zzE == zzxiVar.zzE && this.zzG == zzxiVar.zzG && this.zzL == zzxiVar.zzL && this.zzM == zzxiVar.zzM && this.zzN == zzxiVar.zzN && this.zzP == zzxiVar.zzP) {
                SparseBooleanArray sparseBooleanArray = this.zzS;
                SparseBooleanArray sparseBooleanArray2 = zzxiVar.zzS;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzR;
                            SparseArray sparseArray2 = zzxiVar.zzR;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwi zzwiVar = (zzwi) entry.getKey();
                                                if (map2.containsKey(zzwiVar) && zzet.zzG(entry.getValue(), map2.get(zzwiVar))) {
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

    @Override // com.google.android.gms.internal.ads.zzci
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzC ? 1 : 0)) * 961) + (this.zzE ? 1 : 0)) * 961) + (this.zzG ? 1 : 0)) * 28629151) + (this.zzL ? 1 : 0)) * 31) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 961) + (this.zzP ? 1 : 0)) * 31;
    }

    public final zzxg zzc() {
        return new zzxg(this, null);
    }

    @Deprecated
    public final zzxj zze(int i, zzwi zzwiVar) {
        Map map = (Map) this.zzR.get(i);
        if (map != null) {
            return (zzxj) map.get(zzwiVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzS.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzwi zzwiVar) {
        Map map = (Map) this.zzR.get(i);
        return map != null && map.containsKey(zzwiVar);
    }
}
