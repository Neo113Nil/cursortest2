package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzegg {
    private final zzbep zza;
    private final Context zzb;
    private final zzefk zzc;
    private final zzcgv zzd;
    private final String zze;
    private final zzfir zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzegg(Context context, zzcgv zzcgvVar, zzbep zzbepVar, zzefk zzefkVar, String str, zzfir zzfirVar) {
        this.zzb = context;
        this.zzd = zzcgvVar;
        this.zza = zzbepVar;
        this.zzc = zzefkVar;
        this.zze = str;
        this.zzf = zzfirVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbgy zzbgyVar = (zzbgy) arrayList.get(i);
            if (zzbgyVar.zzw() == 2 && zzbgyVar.zze() > j) {
                j = zzbgyVar.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzegc
                @Override // com.google.android.gms.internal.ads.zzfhk
                public final Object zza(Object obj) {
                    zzegg.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhs)).booleanValue()) {
            zzfiq zzb = zzfiq.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzefz.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzefz.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzefz.zzb(sQLiteDatabase, 2)));
            zzb.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzefz.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i = 0; i < size; i++) {
                zzbgy zzbgyVar = (zzbgy) zzc.get(i);
                zzfiq zzb2 = zzfiq.zzb("oa_signals");
                zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                zzbgt zzf = zzbgyVar.zzf();
                String valueOf = zzf.zzf() ? String.valueOf(zzf.zzh() - 1) : "-1";
                String obj = zzfwb.zzb(zzbgyVar.zzk(), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzegf
                    @Override // com.google.android.gms.internal.ads.zzfsm
                    public final Object apply(Object obj2) {
                        return ((zzbfn) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzbgyVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzbgyVar.zzw() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzbgyVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzbgyVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", valueOf);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzbgyVar.zzx() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzbgyVar.zzt() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzbgyVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzbgyVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzbgyVar.zzv() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzbgyVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzefz.zzc(sQLiteDatabase);
            zzbgz zza = zzbhd.zza();
            zza.zzb(this.zzb.getPackageName());
            zza.zzd(Build.MODEL);
            zza.zze(zzefz.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzg(zzefz.zza(sQLiteDatabase, 1));
            zza.zzc(zzefz.zza(sQLiteDatabase, 3));
            zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zza.zzf(zzefz.zzb(sQLiteDatabase, 2));
            final zzbhd zzbhdVar = (zzbhd) zza.zzam();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzegd
                @Override // com.google.android.gms.internal.ads.zzbeo
                public final void zza(zzbge zzbgeVar) {
                    zzbgeVar.zzi(zzbhd.this);
                }
            });
            zzbho zza2 = zzbhp.zza();
            zza2.zza(this.zzd.zzb);
            zza2.zzc(this.zzd.zzc);
            zza2.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzbhp zzbhpVar = (zzbhp) zza2.zzam();
            this.zza.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzege
                @Override // com.google.android.gms.internal.ads.zzbeo
                public final void zza(zzbge zzbgeVar) {
                    zzbhp zzbhpVar2 = zzbhp.this;
                    zzbfw zzbfwVar = (zzbfw) zzbgeVar.zzb().zzaA();
                    zzbfwVar.zzb(zzbhpVar2);
                    zzbgeVar.zzg(zzbfwVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzefz.zzf(sQLiteDatabase);
        return null;
    }
}
