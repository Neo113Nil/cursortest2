package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdtq {
    public final long zza;
    public final int[] zzb;

    private zzdtq(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzgjz zza(JsonReader jsonReader) throws IOException {
        int[] iArr;
        int i = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgjz zzi = zzgjz.zzi();
            jsonReader.beginObject();
            zzdtq zzdtqVar = null;
            Long l = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Objects.equals(nextName, "id")) {
                    l = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(nextName, "event_types")) {
                    zzgjw zzgjwVar2 = new zzgjw();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgjwVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzi = zzgjwVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (l != null && !zzi.isEmpty()) {
                long longValue = l.longValue();
                if (zzi == null) {
                    iArr = new int[0];
                } else {
                    int[] iArr2 = new int[zzi.size()];
                    for (int i2 = 0; i2 < zzi.size(); i2++) {
                        iArr2[i2] = ((Integer) zzi.get(i2)).intValue();
                    }
                    iArr = iArr2;
                }
                zzdtqVar = new zzdtq(longValue, iArr);
            }
            if (zzdtqVar != null) {
                zzgjwVar.zzf(zzdtqVar);
            }
        }
        jsonReader.endArray();
        return zzgjwVar.zzi();
    }
}
