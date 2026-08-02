package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgxk extends zzgxj {
    zzgxk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxj
    final void zza(Object obj) {
        ((zzgxu) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgxj
    final void zzb(zzhbh zzhbhVar, Map.Entry entry) throws IOException {
        zzgxv zzgxvVar = (zzgxv) entry.getKey();
        if (!zzgxvVar.zzc) {
            zzhbf zzhbfVar = zzhbf.DOUBLE;
            switch (zzgxvVar.zzb) {
                case DOUBLE:
                    zzhbhVar.zzf(zzgxvVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzhbhVar.zzo(zzgxvVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzhbhVar.zzt(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzhbhVar.zzK(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzhbhVar.zzr(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzhbhVar.zzm(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzhbhVar.zzk(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzhbhVar.zzb(zzgxvVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzhbhVar.zzG(zzgxvVar.zza, (String) entry.getValue());
                    break;
                case GROUP:
                    zzhbhVar.zzq(zzgxvVar.zza, entry.getValue(), zzgzt.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzhbhVar.zzv(zzgxvVar.zza, entry.getValue(), zzgzt.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzhbhVar.zzd(zzgxvVar.zza, (zzgwm) entry.getValue());
                    break;
                case UINT32:
                    zzhbhVar.zzI(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzhbhVar.zzr(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzhbhVar.zzx(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzhbhVar.zzz(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzhbhVar.zzB(zzgxvVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzhbhVar.zzD(zzgxvVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhbf zzhbfVar2 = zzhbf.DOUBLE;
        switch (zzgxvVar.zzb) {
            case DOUBLE:
                zzhag.zzt(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case FLOAT:
                zzhag.zzx(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case INT64:
                zzhag.zzA(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case UINT64:
                zzhag.zzI(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case INT32:
                zzhag.zzz(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case FIXED64:
                zzhag.zzw(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case FIXED32:
                zzhag.zzv(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case BOOL:
                zzhag.zzr(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case STRING:
                zzhag.zzG(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzhag.zzy(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgzt.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzhag.zzB(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgzt.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzhag.zzs(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar);
                break;
            case UINT32:
                zzhag.zzH(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case ENUM:
                zzhag.zzz(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case SFIXED32:
                zzhag.zzC(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case SFIXED64:
                zzhag.zzD(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case SINT32:
                zzhag.zzE(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
            case SINT64:
                zzhag.zzF(zzgxvVar.zza, (List) entry.getValue(), zzhbhVar, zzgxvVar.zzd);
                break;
        }
    }
}
