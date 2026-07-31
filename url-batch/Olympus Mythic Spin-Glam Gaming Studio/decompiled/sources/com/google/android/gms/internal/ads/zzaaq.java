package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzaaq extends zzbl {
    public static final zzaaq zzJ = new zzaaq(new zzaap());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzfm.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    private zzaaq(zzaap zzaapVar) {
        super(zzaapVar);
        this.zzK = zzaapVar.zzz();
        this.zzL = false;
        this.zzM = zzaapVar.zzA();
        this.zzN = false;
        this.zzO = zzaapVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzaapVar.zzC();
        this.zzU = zzaapVar.zzD();
        this.zzV = zzaapVar.zzE();
        this.zzW = false;
        this.zzX = zzaapVar.zzF();
        this.zzY = false;
        this.zzZ = zzaapVar.zzG();
        this.zzaa = zzaapVar.zzH();
    }

    /* synthetic */ zzaaq(zzaap zzaapVar, byte[] bArr) {
        this(zzaapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaaq.class == obj.getClass()) {
            zzaaq zzaaqVar = (zzaaq) obj;
            if (super.equals(zzaaqVar) && this.zzK == zzaaqVar.zzK && this.zzM == zzaaqVar.zzM && this.zzO == zzaaqVar.zzO && this.zzT == zzaaqVar.zzT && this.zzU == zzaaqVar.zzU && this.zzV == zzaaqVar.zzV && this.zzX == zzaaqVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzaaqVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzZ;
                            SparseArray sparseArray2 = zzaaqVar.zzZ;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzzr zzzrVar = (zzzr) entry.getKey();
                                                if (map2.containsKey(zzzrVar) && Objects.equals(entry.getValue(), map2.get(zzzrVar))) {
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

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i) {
        return this.zzaa.get(i);
    }

    @Deprecated
    public final boolean zzb(int i, zzzr zzzrVar) {
        Map map = (Map) this.zzZ.get(i);
        return map != null && map.containsKey(zzzrVar);
    }

    @Nullable
    @Deprecated
    public final zzaar zzc(int i, zzzr zzzrVar) {
        Map map = (Map) this.zzZ.get(i);
        if (map != null) {
            return (zzaar) map.get(zzzrVar);
        }
        return null;
    }

    public final zzaap zzd() {
        return new zzaap(this, null);
    }

    final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }
}
