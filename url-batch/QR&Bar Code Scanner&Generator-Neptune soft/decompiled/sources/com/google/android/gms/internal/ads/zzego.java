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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzego extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfzq zzb;

    public zzego(Context context, zzfzq zzfzqVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhj)).intValue());
        this.zza = context;
        this.zzb = zzfzqVar;
    }

    static /* synthetic */ Void zzb(zzcgu zzcguVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzcguVar);
        return null;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcgu zzcguVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcguVar);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzcgu zzcguVar) {
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
                zzcguVar.zza(strArr[i2]);
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

    final /* synthetic */ Void zza(zzegq zzegqVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(zzegqVar.zza));
        contentValues.put("gws_query_id", zzegqVar.zzb);
        contentValues.put(ImagesContract.URL, zzegqVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzegqVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(this.zza);
        if (zzw != null) {
            try {
                zzw.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                zzego.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzegq zzegqVar) {
        zze(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzegj
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                zzego.this.zza(zzegqVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void zze(zzfhk zzfhkVar) {
        zzfzg.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzegh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzego.this.getWritableDatabase();
            }
        }), new zzegn(this, zzfhkVar), this.zzb);
    }

    final void zzg(final SQLiteDatabase sQLiteDatabase, final zzcgu zzcguVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegi
            @Override // java.lang.Runnable
            public final void run() {
                zzego.zzf(sQLiteDatabase, str, zzcguVar);
            }
        });
    }

    public final void zzh(final zzcgu zzcguVar, final String str) {
        zze(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                zzego.this.zzg((SQLiteDatabase) obj, zzcguVar, str);
                return null;
            }
        });
    }
}
