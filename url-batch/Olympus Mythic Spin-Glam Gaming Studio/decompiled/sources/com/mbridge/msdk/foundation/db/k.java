package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONObject;

/* compiled from: ReplaceTempDao.java */
/* loaded from: classes3.dex */
public class k extends a {
    private static String a = "ReplaceTempDao";
    private static k b;

    private k(f fVar) {
        super(fVar);
    }

    public static k a(f fVar) {
        if (b == null) {
            synchronized (e.class) {
                try {
                    if (b == null) {
                        b = new k(fVar);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (r4 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject b(String str) {
        JSONObject jSONObject = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp WHERE d_key = ? ", new String[]{str});
        if (rawQuery != null) {
            try {
                if (rawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (rawQuery.moveToNext()) {
                        jSONObject = MintegralNetworkBridge.jsonObjectInit(rawQuery.getString(rawQuery.getColumnIndex("d_value")));
                    }
                }
            } catch (Throwable th) {
                try {
                    q0.b(a, th.getMessage());
                } catch (Throwable th2) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            }
        }
        if (rawQuery != null) {
            try {
                rawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0061, code lost:
    
        if (r0 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject d() {
        JSONObject jSONObject;
        a(7);
        JSONObject jSONObject2 = null;
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp", null);
        if (rawQuery != null) {
            try {
                if (rawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (rawQuery.moveToNext()) {
                        try {
                            jSONObject.put(rawQuery.getString(rawQuery.getColumnIndex("d_key")), MintegralNetworkBridge.jsonObjectInit(rawQuery.getString(rawQuery.getColumnIndex("d_value"))));
                        } catch (Throwable th) {
                            th = th;
                            try {
                                q0.b(a, th.getMessage());
                            } catch (Throwable th2) {
                                if (rawQuery != null) {
                                    try {
                                        rawQuery.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th2;
                            }
                        }
                    }
                    jSONObject2 = jSONObject;
                    jSONObject = jSONObject2;
                }
            } catch (Throwable th3) {
                JSONObject jSONObject3 = jSONObject2;
                th = th3;
                jSONObject = jSONObject3;
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        jSONObject = jSONObject2;
        return jSONObject;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!a(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = ? ", new String[]{str});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean a(String str) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key= ? ", new String[]{str});
        if (rawQuery != null && rawQuery.getCount() > 0) {
            try {
                rawQuery.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        if (rawQuery == null) {
            return false;
        }
        try {
            rawQuery.close();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public void a(int i) {
        long currentTimeMillis = System.currentTimeMillis() - (i * BrandSafetyUtils.g);
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("c_replace_temp", "time<?", new String[]{String.valueOf(currentTimeMillis)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
