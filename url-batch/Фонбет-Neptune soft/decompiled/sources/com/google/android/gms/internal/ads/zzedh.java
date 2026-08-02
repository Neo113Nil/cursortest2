package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.database.core.ServerValues;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzedh extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgcu zzb;

    public zzedh(Context context, zzgcu zzgcuVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhA)).intValue());
        this.zza = context;
        this.zzb = zzgcuVar;
    }

    static /* synthetic */ Void zzb(com.google.android.gms.ads.internal.util.client.zzr zzrVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzrVar);
        return null;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzr zzrVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzrVar);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzr zzrVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{ImagesContract.URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzrVar.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
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

    final /* synthetic */ Void zza(zzedj zzedjVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(zzedjVar.zza));
        contentValues.put("gws_query_id", zzedjVar.zzb);
        contentValues.put(ImagesContract.URL, zzedjVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzedjVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzz = com.google.android.gms.ads.internal.util.zzt.zzz(this.zza);
        if (zzz != null) {
            try {
                zzz.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfio(this) { // from class: com.google.android.gms.internal.ads.zzedf
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzedj zzedjVar) {
        zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.this.zza(zzedjVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void zze(zzfio zzfioVar) {
        zzgcj.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedh.this.getWritableDatabase();
            }
        }), new zzedg(this, zzfioVar), this.zzb);
    }

    final void zzg(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzede
            @Override // java.lang.Runnable
            public final void run() {
                zzedh.zzf(sQLiteDatabase, str, zzrVar);
            }
        });
    }

    public final void zzh(final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.this.zzg((SQLiteDatabase) obj, zzrVar, str);
                return null;
            }
        });
    }
}
