package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzait extends zzaiv {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzait() {
        super(new zzage());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzeu zzeuVar) {
        return Double.valueOf(Double.longBitsToDouble(zzeuVar.zzD()));
    }

    private static String zzh(zzeu zzeuVar) {
        int zzt = zzeuVar.zzt();
        int zzg = zzeuVar.zzg();
        zzeuVar.zzk(zzt);
        return new String(zzeuVar.zzi(), zzg, zzt);
    }

    private static HashMap zzi(zzeu zzeuVar) {
        int zzH = zzeuVar.zzH();
        HashMap hashMap = new HashMap(zzH);
        for (int i = 0; i < zzH; i++) {
            String zzh = zzh(zzeuVar);
            Object zzj = zzj(zzeuVar, zzeuVar.zzs());
            if (zzj != null) {
                hashMap.put(zzh, zzj);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    protected final boolean zza(zzeu zzeuVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    protected final boolean zzb(zzeu zzeuVar, long j) {
        if (zzeuVar.zzs() == 2 && "onMetaData".equals(zzh(zzeuVar)) && zzeuVar.zzd() != 0 && zzeuVar.zzs() == 8) {
            HashMap zzi = zzi(zzeuVar);
            Object obj = zzi.get(IronSourceConstants.EVENTS_DURATION);
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

    @Nullable
    private static Object zzj(zzeu zzeuVar, int i) {
        if (i == 0) {
            return zzg(zzeuVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzeuVar.zzs() == 1);
        }
        if (i == 2) {
            return zzh(zzeuVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzi(zzeuVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzeuVar).doubleValue());
                zzeuVar.zzk(2);
                return date;
            }
            int zzH = zzeuVar.zzH();
            ArrayList arrayList = new ArrayList(zzH);
            for (int i2 = 0; i2 < zzH; i2++) {
                Object zzj = zzj(zzeuVar, zzeuVar.zzs());
                if (zzj != null) {
                    arrayList.add(zzj);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String zzh = zzh(zzeuVar);
            int zzs = zzeuVar.zzs();
            if (zzs == 9) {
                return hashMap;
            }
            Object zzj2 = zzj(zzeuVar, zzs);
            if (zzj2 != null) {
                hashMap.put(zzh, zzj2);
            }
        }
    }
}
