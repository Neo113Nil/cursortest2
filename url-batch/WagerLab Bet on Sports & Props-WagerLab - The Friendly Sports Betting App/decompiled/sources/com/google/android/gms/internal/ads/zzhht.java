package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhht extends zzhhs {
    zzhht() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhs
    final void zza(Object obj) {
        ((zzhid) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhhs
    final void zzb(zzhlk zzhlkVar, Map.Entry entry) throws IOException {
        zzhie zzhieVar = (zzhie) entry.getKey();
        if (!zzhieVar.zzc) {
            zzhli zzhliVar = zzhli.DOUBLE;
            switch (zzhieVar.zzb) {
                case DOUBLE:
                    zzhlkVar.zzf(zzhieVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzhlkVar.zze(zzhieVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzhlkVar.zzc(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzhlkVar.zzh(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzhlkVar.zzi(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzhlkVar.zzj(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzhlkVar.zzk(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzhlkVar.zzl(zzhieVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzhlkVar.zzm(zzhieVar.zza, (String) entry.getValue());
                    break;
                case GROUP:
                    zzhlkVar.zzs(zzhieVar.zza, entry.getValue(), zzhkc.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzhlkVar.zzr(zzhieVar.zza, entry.getValue(), zzhkc.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzhlkVar.zzn(zzhieVar.zza, (zzhhb) entry.getValue());
                    break;
                case UINT32:
                    zzhlkVar.zzo(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzhlkVar.zzi(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzhlkVar.zzb(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzhlkVar.zzd(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzhlkVar.zzp(zzhieVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzhlkVar.zzq(zzhieVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhli zzhliVar2 = zzhli.DOUBLE;
        switch (zzhieVar.zzb) {
            case DOUBLE:
                zzhkm.zza(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case FLOAT:
                zzhkm.zzb(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case INT64:
                zzhkm.zzc(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case UINT64:
                zzhkm.zzd(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case INT32:
                zzhkm.zzh(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case FIXED64:
                zzhkm.zzf(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case FIXED32:
                zzhkm.zzk(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case BOOL:
                zzhkm.zzn(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case STRING:
                zzhkm.zzo(zzhieVar.zza, (List) entry.getValue(), zzhlkVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzhkm.zzr(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhkc.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzhkm.zzq(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhkc.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzhkm.zzp(zzhieVar.zza, (List) entry.getValue(), zzhlkVar);
                break;
            case UINT32:
                zzhkm.zzi(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case ENUM:
                zzhkm.zzh(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case SFIXED32:
                zzhkm.zzl(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case SFIXED64:
                zzhkm.zzg(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case SINT32:
                zzhkm.zzj(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
            case SINT64:
                zzhkm.zze(zzhieVar.zza, (List) entry.getValue(), zzhlkVar, zzhieVar.zzd);
                break;
        }
    }
}
