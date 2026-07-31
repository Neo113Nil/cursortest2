package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzecn extends zzfqp {
    private final Context zza;
    private final zzgpd zzb;

    public zzecn(Context context, zzgpd zzgpdVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzje)).intValue(), zzfqr.zza);
        this.zza = context;
        this.zzb = zzgpdVar;
    }

    static /* synthetic */ Void zzf(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String sb3 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb3, null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr2 = new String[count];
                int i = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("timestamp");
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter("bd", Long.toString(currentTimeMillis));
                            String valueOf = String.valueOf(clearQuery.build());
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(encodedQuery).length());
                            sb4.append(valueOf);
                            sb4.append("&");
                            sb4.append(encodedQuery);
                            sb = sb4.toString();
                        }
                        strArr2[i] = sb;
                    }
                    i++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i2 = 0; i2 < count; i2++) {
                    zzuVar.zza(strArr2[i2]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void zza(zzfgm zzfgmVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzecn.this.getWritableDatabase();
            }
        };
        zzgpd zzgpdVar = this.zzb;
        zzgot.zzq(zzgpdVar.submit(callable), new zzecg(this, zzfgmVar), zzgpdVar);
    }

    final void zzb(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzecn.zzg(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzc(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                zzecn.this.zzb((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfgm(this) { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                zzecn.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzecp zzecpVar) {
        zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                zzecn.this.zzh(zzecpVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ Void zzh(zzecp zzecpVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzecpVar.zza));
        contentValues.put("gws_query_id", zzecpVar.zzb);
        contentValues.put("url", zzecpVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzecpVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzbo zzD = com.google.android.gms.ads.internal.util.zzs.zzD(context);
        if (zzD != null) {
            try {
                zzD.zzf(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
