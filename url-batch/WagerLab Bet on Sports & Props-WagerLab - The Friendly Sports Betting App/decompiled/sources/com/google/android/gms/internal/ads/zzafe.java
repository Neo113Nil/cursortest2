package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzafe extends zzafg {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafe() {
        super(new zzacr());
        this.zzb = C.TIME_UNSET;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzef zzefVar) {
        return Double.valueOf(Double.longBitsToDouble(zzefVar.zzD()));
    }

    private static String zzh(zzef zzefVar) {
        int zzt = zzefVar.zzt();
        int zzg = zzefVar.zzg();
        zzefVar.zzk(zzt);
        return new String(zzefVar.zzi(), zzg, zzt);
    }

    private static HashMap zzi(zzef zzefVar) {
        int zzH = zzefVar.zzH();
        HashMap hashMap = new HashMap(zzH);
        for (int i = 0; i < zzH; i++) {
            String zzh = zzh(zzefVar);
            Object zzj = zzj(zzefVar, zzefVar.zzs());
            if (zzj != null) {
                hashMap.put(zzh, zzj);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzef zzefVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzef zzefVar, long j) {
        if (zzefVar.zzs() == 2 && "onMetaData".equals(zzh(zzefVar)) && zzefVar.zzd() != 0 && zzefVar.zzs() == 8) {
            HashMap zzi = zzi(zzefVar);
            Object obj = zzi.get(TypedValues.TransitionType.S_DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }

    private static Object zzj(zzef zzefVar, int i) {
        if (i == 0) {
            return zzg(zzefVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzefVar.zzs() == 1);
        }
        if (i == 2) {
            return zzh(zzefVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzi(zzefVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzefVar).doubleValue());
                zzefVar.zzk(2);
                return date;
            }
            int zzH = zzefVar.zzH();
            ArrayList arrayList = new ArrayList(zzH);
            for (int i2 = 0; i2 < zzH; i2++) {
                Object zzj = zzj(zzefVar, zzefVar.zzs());
                if (zzj != null) {
                    arrayList.add(zzj);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String zzh = zzh(zzefVar);
            int zzs = zzefVar.zzs();
            if (zzs == 9) {
                return hashMap;
            }
            Object zzj2 = zzj(zzefVar, zzs);
            if (zzj2 != null) {
                hashMap.put(zzh, zzj2);
            }
        }
    }
}
