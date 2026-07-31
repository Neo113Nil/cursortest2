package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzftc implements zzhcv {
    final /* synthetic */ zzfqw zza;
    final /* synthetic */ zzfrg zzb;
    final /* synthetic */ zzdge zzc;
    final /* synthetic */ zzfte zzd;

    zzftc(zzfte zzfteVar, zzfqw zzfqwVar, zzfrg zzfrgVar, zzdge zzdgeVar) {
        this.zza = zzfqwVar;
        this.zzb = zzfrgVar;
        this.zzc = zzdgeVar;
        Objects.requireNonNull(zzfteVar);
        this.zzd = zzfteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(@NonNull Throwable th) {
        zzfqw zzfqwVar = this.zza;
        if (zzfqwVar == null) {
            return;
        }
        zzfqwVar.zzd(false);
        zzfrg zzfrgVar = this.zzb;
        if (zzfrgVar != null) {
            zzfrgVar.zza(zzfqwVar);
            zzfrgVar.zzh();
        } else {
            zzfte zzfteVar = this.zzd;
            zzfteVar.zze().zzb(zzfqwVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        char c;
        int i;
        long j;
        int hashCode;
        zzfqw zzfqwVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfqwVar != null) {
            zzfqwVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfrg zzfrgVar = this.zzb;
            if (zzfrgVar == null) {
                this.zzd.zze().zzb(zzfqwVar.zzm());
            } else {
                zzfrgVar.zza(zzfqwVar);
                zzfrgVar.zzh();
            }
        }
        zzdge zzdgeVar = this.zzc;
        if (zzdgeVar != null) {
            String zzb = this.zzd.zzd().zzb();
            if (TextUtils.isEmpty(zzb)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(zzb);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String optString = jSONObject.optString("type");
                String optString2 = jSONObject.optString("precision");
                String optString3 = jSONObject.optString("currency");
                long optLong = jSONObject.optLong("value", 0L);
                int hashCode2 = optString.hashCode();
                char c2 = 65535;
                if (hashCode2 == 66934) {
                    if (optString.equals("CPC")) {
                        c = 1;
                        if (c != 0) {
                        }
                        j = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode != -2131980260) {
                        }
                        zzdgeVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 != 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    j = optLong;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                    }
                    zzdgeVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 != 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                }
                if (hashCode2 == 66944) {
                    if (optString.equals("CPM")) {
                        c = 0;
                        if (c != 0) {
                        }
                        j = optLong;
                        hashCode = optString2.hashCode();
                        if (hashCode != -2131980260) {
                        }
                        zzdgeVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 != 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    j = optLong;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                    }
                    zzdgeVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 != 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                }
                if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                    c = 2;
                    if (c != 0) {
                        i = 1;
                    } else {
                        if (c == 1) {
                            j = optLong;
                            i = 2;
                            hashCode = optString2.hashCode();
                            if (hashCode != -2131980260) {
                                if (hashCode != 399232571) {
                                    if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                        c2 = 1;
                                    }
                                } else if (optString2.equals("PRECISE")) {
                                    c2 = 2;
                                }
                            } else if (optString2.equals("ESTIMATED")) {
                                c2 = 0;
                            }
                            zzdgeVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 != 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                        }
                        if (c != 2) {
                            i = 0;
                        } else {
                            optLong /= 1000;
                            i = 3;
                        }
                    }
                    j = optLong;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                    }
                    zzdgeVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 != 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                }
                c = 65535;
                if (c != 0) {
                }
                j = optLong;
                hashCode = optString2.hashCode();
                if (hashCode != -2131980260) {
                }
                zzdgeVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 != 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "UrlPinger.pingUrl");
            }
        }
    }
}
