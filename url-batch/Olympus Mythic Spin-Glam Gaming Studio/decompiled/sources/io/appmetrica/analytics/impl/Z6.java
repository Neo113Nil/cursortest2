package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Z6 {
    public final CounterConfigurationReporterType a;

    public Z6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:2|3)|(3:63|64|(10:66|(2:69|67)|70|6|7|8|(2:15|(10:18|86|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50)|53|54))|60|53|54))|5|6|7|8|(4:10|12|15|(2:18|86))|60|53|54|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0067, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final X6 a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, int i, String str2, boolean z) {
        Cursor cursor;
        String[] strArr2;
        ArrayList<ContentValues> arrayList;
        Bj bj;
        C5858zj c5858zj;
        C5273d4 c5273d4;
        Integer num;
        try {
            cursor = sQLiteDatabase.query("events", new String[]{"global_number", "type", "event_description"}, str, strArr, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    C5340fk c5340fk = Dj.a;
                    c5340fk.getClass();
                    c5340fk.a(new Ej("select_rows_to_delete_exception", th));
                    Do.a(cursor);
                    strArr2 = strArr;
                    arrayList = null;
                    int i2 = sQLiteDatabase.delete("events", str, strArr2);
                    if (arrayList != null) {
                    }
                    return new X6(arrayList, i2);
                } catch (Throwable th3) {
                    Do.a(cursor);
                    throw th3;
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                Do.a(cursor);
                strArr2 = strArr;
                int i22 = sQLiteDatabase.delete("events", str, strArr2);
                if (arrayList != null && arrayList.size() != 0 && i22 == arrayList.size() && z) {
                    bj = Ka.I.f;
                    if (str2 != null && bj != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.a;
                        synchronized (bj) {
                            c5858zj = (C5858zj) bj.c.get(str2);
                            if (c5858zj == null) {
                                c5858zj = new C5858zj(str2, bj.b, counterConfigurationReporterType, bj.a);
                                bj.c.put(str2, c5858zj);
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            JSONArray jSONArray2 = new JSONArray();
                            for (ContentValues contentValues2 : arrayList) {
                                Integer asInteger = contentValues2.getAsInteger("global_number");
                                Integer asInteger2 = contentValues2.getAsInteger("type");
                                if (asInteger != null && asInteger2 != null) {
                                    jSONArray.put(asInteger);
                                    EnumC5798xb a = EnumC5798xb.a(asInteger2.intValue());
                                    if (a == null) {
                                        Map map = AbstractC5465kg.a;
                                        num = null;
                                    } else {
                                        num = (Integer) AbstractC5465kg.c.get(a);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", Y6.a(i)).put("cleared", jSONObject).put("actual_deleted_number", i22));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = Q9.a;
                            EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
                            c5273d4 = new C5273d4(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            c5273d4 = null;
                        }
                        if (c5273d4 != null && c5858zj.c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c5858zj.a);
                                counterConfiguration.setReporterType(c5858zj.c);
                                c5858zj.d.a.reportData(1, c5273d4.d(new Sh(new Wf(c5858zj.b, (ResultReceiver) null), counterConfiguration, new W8(new Ll(LoggerStorage.getOrCreatePublicLogger(c5858zj.a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                        return new X6(arrayList, i22);
                    }
                }
                return new X6(arrayList, i22);
            }
        }
        arrayList = null;
        Do.a(cursor);
        strArr2 = strArr;
        int i222 = sQLiteDatabase.delete("events", str, strArr2);
        if (arrayList != null) {
            bj = Ka.I.f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.a;
                synchronized (bj) {
                }
            }
        }
        return new X6(arrayList, i222);
    }
}
