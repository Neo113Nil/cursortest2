package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.AabEntity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.slf4j.Marker;

/* compiled from: CampaignDao.java */
/* loaded from: classes14.dex */
public class e extends com.mbridge.msdk.foundation.db.a<Campaign> {
    private static e r;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;

    /* compiled from: CampaignDao.java */
    class a implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ String b;

        a(List list, String str) {
            this.a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                e.this.a((CampaignEx) it.next(), this.b, 0);
            }
        }
    }

    protected e(f fVar) {
        super(fVar);
        this.a = com.safedk.android.analytics.brandsafety.m.x;
        this.b = "lrid";
        this.c = "cid";
        this.d = CampaignEx.JSON_KEY_PLCT;
        this.e = CampaignEx.JSON_KEY_PLCTB;
        this.f = "timestamp";
        this.g = "ridCount";
        this.h = " WHERE ";
        this.i = " AND ";
        this.j = "SELECT ";
        this.k = Marker.ANY_MARKER;
        this.l = " FROM ";
        this.m = " AND readyState = '0'";
        this.n = " AND is_bid_campaign = 1";
        this.o = " order by ts ASC";
        this.p = " group by request_id";
        this.q = " group by bid_token";
    }

    public static synchronized e a(f fVar) {
        e eVar;
        synchronized (e.class) {
            try {
                if (r == null) {
                    r = new e(fVar);
                }
                eVar = r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public synchronized void b(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 0);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized List<CampaignEx> c(String str) {
        try {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + MBInterstitialActivity.INTENT_CAMAPIGN + " WHERE unitid = ? AND readyState = 2", new String[]{str});
                if (rawQuery == null || rawQuery.getCount() <= 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    arrayList.add(a(rawQuery));
                }
                rawQuery.close();
                return arrayList;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", th.getLocalizedMessage());
                }
                return null;
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
            return null;
        }
    }

    public synchronized void d(String str, String str2) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        String[] strArr = {str, str2};
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "id = ? AND request_id = ? ", strArr);
    }

    public synchronized void e(String str, String str2) {
        String[] strArr;
        try {
            strArr = new String[]{str, str2};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "id = ? AND unitid = ? ", strArr);
    }

    public int f(String str, String str2) {
        String[] strArr;
        String str3;
        if (TextUtils.isEmpty(str)) {
            strArr = new String[]{str2};
            str3 = "unitid = ?  AND is_bid_campaign = 1";
        } else {
            strArr = new String[]{str2, str};
            str3 = "unitid = ?  AND request_id = ?  AND is_bid_campaign = 1";
        }
        String str4 = str3 + " AND readyState = '0'";
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            return getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, str4, strArr);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            q0.b("CampaignDao", e.getLocalizedMessage());
            return 0;
        }
    }

    public synchronized void a(String str, int i, int i2) {
        String[] strArr;
        try {
            strArr = new String[]{str, String.valueOf(i), String.valueOf(i2)};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? AND level = ? AND adSource = ? ", strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (0 == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<String> e(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            try {
                synchronized (new Object()) {
                    cursor = getReadableDatabase().rawQuery("SELECT local_request_id as lrid FROM " + MBInterstitialActivity.INTENT_CAMAPIGN + " WHERE unitid = ? AND readyState = ?", new String[]{str, String.valueOf(2)});
                }
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndex("lrid"));
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                }
            } catch (Exception e) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public synchronized void d() {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 3600000)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "ts< ? AND ts>0", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(String str, int i, int i2, boolean z) {
        String str2;
        String[] strArr;
        try {
            str2 = "unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = ? ";
            strArr = new String[]{str, String.valueOf(i), String.valueOf(i2), String.valueOf(z ? 1 : 0)};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, str2, strArr);
    }

    public synchronized void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArr = {str};
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? AND readyState = 2", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f0, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ee, code lost:
    
        if (0 != 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> f(String str) {
        String[] strArr = {str};
        String str2 = "SELECT request_id as rid, id as cid, plct as plct, plctb as plctb, ts as timestamp FROM campaign" + ((" WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1") + " AND readyState = '0'");
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap = new ConcurrentHashMap<>();
        Cursor cursor = null;
        try {
            try {
                synchronized (new Object()) {
                    cursor = getReadableDatabase().rawQuery(str2, strArr);
                }
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(cursor.getColumnIndex(com.safedk.android.analytics.brandsafety.m.x));
                        String string2 = cursor.getString(cursor.getColumnIndex("cid"));
                        long j = cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCT));
                        long j2 = cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCTB));
                        long j3 = cursor.getLong(cursor.getColumnIndex("timestamp"));
                        if (concurrentHashMap.containsKey(string)) {
                            com.mbridge.msdk.foundation.entity.c cVar = concurrentHashMap.get(string);
                            if (cVar != null) {
                                cVar.a(string);
                                cVar.a(j);
                                cVar.b(j2);
                                cVar.c(j3);
                                if (cVar.c() != null) {
                                    cVar.c().add(string2);
                                }
                            }
                        } else {
                            com.mbridge.msdk.foundation.entity.c cVar2 = new com.mbridge.msdk.foundation.entity.c();
                            cVar2.a(string);
                            cVar2.a(j);
                            cVar2.b(j2);
                            cVar2.c(j3);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(string2);
                            cVar2.a(arrayList);
                            concurrentHashMap.put(string, cVar2);
                        }
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        if (0 != 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<com.mbridge.msdk.foundation.entity.c> d(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String str2 = "SELECT request_id as rid ,count(*) as ridCount ,vcn,token_r,bid_token,local_request_id,ts as timestamp FROM campaign" + ((((" WHERE unitid = ? AND level = 0 AND adSource = 1 AND is_bid_campaign = 1") + " AND readyState = '0'") + " group by request_id") + " order by ts ASC");
        String[] strArr = {str};
        Cursor cursor = null;
        try {
            try {
                synchronized (new Object()) {
                    cursor = getReadableDatabase().rawQuery(str2, strArr);
                }
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        com.mbridge.msdk.foundation.entity.c cVar = new com.mbridge.msdk.foundation.entity.c();
                        String string = cursor.getString(cursor.getColumnIndex(com.safedk.android.analytics.brandsafety.m.x));
                        if (!TextUtils.isEmpty(string)) {
                            String string2 = cursor.getString(cursor.getColumnIndex("local_request_id"));
                            String string3 = cursor.getString(cursor.getColumnIndex("bid_token"));
                            int i = cursor.getInt(cursor.getColumnIndex("ridCount"));
                            int i2 = cursor.getInt(cursor.getColumnIndex("token_r"));
                            long j = cursor.getLong(cursor.getColumnIndex("timestamp"));
                            int i3 = cursor.getInt(cursor.getColumnIndex("vcn"));
                            cVar.a(string);
                            cVar.a(i);
                            cVar.c(j);
                            cVar.b(i2);
                            cVar.c(i3);
                            cVar.c(string2);
                            if (!TextUtils.isEmpty(string3)) {
                                cVar.b(string3);
                            }
                            arrayList.add(cVar);
                        }
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public synchronized void a(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (CampaignEx campaignEx : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        String str2 = "id = ? AND unitid = ? AND request_id = ?  AND is_bid_campaign = ? ";
                        String[] strArr = {campaignEx.getId(), str, campaignEx.getRequestId(), campaignEx.isBidCampaign() ? "1" : "0"};
                        try {
                            SQLiteDatabase writableDatabase = getWritableDatabase();
                            if (writableDatabase != null) {
                                writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, str2, strArr);
                            }
                        } catch (SQLException e) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("CampaignDao", e.getLocalizedMessage());
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                        }
                    } catch (SQLException e) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void c(String str, String str2) {
        try {
            try {
            } catch (Exception e) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String str3 = "";
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                str3 = "unitid = ? AND ";
                arrayList.add(str);
            }
            arrayList.add(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, str3 + "n_local_request_id = ? AND bid_token IS NOT NULL AND n_local_request_id IS NOT NULL", (String[]) arrayList.toArray(new String[0]));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(String str, CampaignEx campaignEx, boolean z, String str2) {
        try {
            try {
                StringBuilder sb = new StringBuilder();
                if (campaignEx == null && !TextUtils.isEmpty(str2)) {
                    sb.append("unitid");
                    sb.append(" = ? AND ");
                    sb.append("request_id");
                    sb.append(" = ?");
                } else if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                    sb.append("unitid");
                    sb.append(" = ? AND ");
                    sb.append("id");
                    sb.append(" = ? AND ");
                    sb.append("request_id");
                    sb.append(" = ?");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                    arrayList.add(String.valueOf(campaignEx.getId()));
                    arrayList.add(campaignEx.getRequestId());
                } else {
                    arrayList.add(str2);
                }
                if (!TextUtils.isEmpty(sb)) {
                    if (s0.a().a("c_n_c_s", true)) {
                        sb.append(" AND readyState");
                        sb.append(" != 0");
                    }
                    if (z) {
                        sb.append(" AND is_bid_campaign = 1");
                    } else {
                        sb.append(" AND is_bid_campaign = 0");
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", (Integer) 2);
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    if (writableDatabase != null) {
                        writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, sb.toString(), strArr);
                    }
                }
            } catch (SQLException e) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(long j, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = "(plctb>0 and (plctb* 1000+ts)< " + currentTimeMillis + " ) or (" + CampaignEx.JSON_KEY_PLCTB + "<=0 and ts< " + (currentTimeMillis - j) + " ) and unitid=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, str2, strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    public synchronized List<CampaignEx> b(String str, int i, int i2, int i3) {
        ArrayList arrayList;
        String str2;
        try {
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i2));
            arrayList.add(String.valueOf(i3));
            str2 = "";
            if (i > 0) {
                str2 = " LIMIT ?";
                arrayList.add(String.valueOf(i));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?" + str2, (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized void a(String str, List<CampaignEx> list, boolean z) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    a(str, campaignEx, z, campaignEx.getRequestId());
                }
            }
        }
    }

    public synchronized void a(String str, List<CampaignEx> list, String str2, int i) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(str2, Integer.valueOf(i));
                        writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
        }
    }

    public synchronized void b(String str, String str2) {
        try {
            try {
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str3 = "unitid = ?";
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = "unitid = ? AND bid_token != ?";
                arrayList.add(str2);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, (str3 + " AND is_bid_campaign = 1") + " AND bid_token IS NOT NULL", (String[]) arrayList.toArray(new String[0]));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z) {
        if (getWritableDatabase() == null) {
            return;
        }
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (CampaignEx campaignEx : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("readyState", (Integer) 0);
                            String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                            getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, z ? "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 1" : "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 0", strArr);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("CampaignDao", e.getLocalizedMessage());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e2.getLocalizedMessage());
                }
            } finally {
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx2 : list2) {
                try {
                    if (campaignEx2.getLoadTimeoutState() == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unitid");
                        sb.append(" = ? AND ");
                        sb.append("id");
                        sb.append(" = ? AND ");
                        sb.append("request_id");
                        sb.append(" = ? ");
                        String[] strArr2 = {str, campaignEx2.getId(), campaignEx2.getRequestId()};
                        if (z) {
                            sb.append(" AND is_bid_campaign = 1");
                        } else {
                            sb.append(" AND is_bid_campaign = 0");
                        }
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("readyState", (Integer) 2);
                        getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues2, sb.toString(), strArr2);
                    }
                } catch (SQLException e3) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CampaignDao", e3.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CampaignEx> b(String str, int i, boolean z) {
        Cursor cursor;
        Exception e;
        ArrayList arrayList;
        Cursor cursor2;
        String str2;
        String[] strArr;
        Cursor cursor3 = null;
        r0 = null;
        ArrayList arrayList2 = null;
        try {
            try {
                if (z) {
                    str2 = "placement_id = ? AND ad_type = ? ";
                    strArr = new String[]{str, String.valueOf(i)};
                } else {
                    str2 = "ad_type = ? ";
                    strArr = new String[]{String.valueOf(i)};
                }
                cursor2 = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE " + str2, strArr);
                if (cursor2 != null) {
                    try {
                        try {
                            if (cursor2.getCount() > 0) {
                                arrayList = new ArrayList();
                                while (cursor2.moveToNext()) {
                                    try {
                                        arrayList.add(a(cursor2));
                                    } catch (Exception e2) {
                                        e = e2;
                                        cursor3 = cursor2;
                                        q0.b("CampaignDao", e.getLocalizedMessage());
                                        if (cursor3 != null) {
                                        }
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Throwable th) {
                            cursor3 = cursor2;
                            th = th;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        cursor = cursor2;
                        e = e3;
                        e = e;
                        cursor3 = cursor;
                        arrayList = null;
                        q0.b("CampaignDao", e.getLocalizedMessage());
                        if (cursor3 != null) {
                            return arrayList;
                        }
                        cursor2 = cursor3;
                        arrayList2 = arrayList;
                        cursor2.close();
                        return arrayList2;
                    }
                }
                if (cursor2 == null) {
                    return arrayList2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            cursor = null;
        }
        cursor2.close();
        return arrayList2;
    }

    public synchronized void a(String str, List<CampaignEx> list, String str2) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("local_request_id", str2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    public synchronized void a(String str, String str2, boolean z, String str3) {
        String[] strArr;
        try {
            try {
                strArr = new String[]{str, str2, z ? "1" : "0", str3};
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "id = ? AND unitid = ? AND is_bid_campaign = ? AND request_id = ? ", strArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(String str, String str2, String str3) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? AND (local_request_id = ?  OR local_request_id = ? )", new String[]{str, str2, str3});
    }

    public synchronized void a(String str, String str2, int i, int i2, boolean z) {
        String[] strArr;
        String str3;
        try {
            try {
                strArr = new String[]{str, str2, String.valueOf(i), String.valueOf(i2)};
                if (z) {
                    str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 1";
                } else {
                    str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 0";
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, str3, strArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "unitid = ? ", strArr);
    }

    public synchronized void a(String str, int i, boolean z) {
        String str2;
        String[] strArr;
        try {
            try {
                if (z) {
                    str2 = "placement_id = ? AND ad_type = ? ";
                    strArr = new String[]{str, String.valueOf(i)};
                } else {
                    str2 = "ad_type = " + i;
                    strArr = new String[]{String.valueOf(i)};
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
            }
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, str2, strArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(long j, String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - j), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete(MBInterstitialActivity.INTENT_CAMAPIGN, "ts< ? and unitid= ? ", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(List<CampaignEx> list, String str, String str2, int i) {
        if (list != null) {
            if (list.size() != 0) {
                if (getWritableDatabase() == null) {
                    return;
                }
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next(), str, str2, i);
                }
            }
        }
    }

    public synchronized long a(CampaignEx campaignEx, String str, String str2, int i) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = campaignEx.getPv_urls().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    contentValues.put("pv_urls", jSONArray.toString());
                }
                contentValues.put("id", campaignEx.getId());
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                contentValues.put("placement_id", str);
                contentValues.put("unitid", str2);
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put("package_name", campaignEx.getPackageName());
                contentValues.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put("image_url", campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, campaignEx.getNetAddress());
                contentValues.put(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, Integer.valueOf(campaignEx.getAc_s()));
                contentValues.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, campaignEx.getAc());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put("video_url", campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().i());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.d());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.j()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.k()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put("creative_id", Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put("mraid", campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put("vst", Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                contentValues.put("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                contentValues.put("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                contentValues.put(CampaignEx.KEY_LOCAL_CHECK_STATE, Integer.valueOf(campaignEx.getLocalCheckShow()));
                contentValues.put(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK, Integer.valueOf(campaignEx.getLocalAllowTrackClick()));
                return getWritableDatabase().insert(MBInterstitialActivity.INTENT_CAMAPIGN, null, contentValues);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long a(CampaignEx campaignEx, String str, int i) {
        String[] strArr;
        String str2;
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = campaignEx.getPv_urls().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    contentValues.put("pv_urls", jSONArray.toString());
                }
                contentValues.put("unitid", str);
                contentValues.put("request_id", campaignEx.getRequestId());
                contentValues.put("n_request_id", campaignEx.getNRid());
                contentValues.put("local_request_id", campaignEx.getLocalRequestId());
                contentValues.put("n_local_request_id", campaignEx.getNLRid());
                contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
                contentValues.put("err_reason_default_ad", campaignEx.getReasond());
                contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
                contentValues.put("package_name", campaignEx.getPackageName());
                contentValues.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put("image_url", campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
                contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
                contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, campaignEx.getNetAddress());
                contentValues.put(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, Integer.valueOf(campaignEx.getAc_s()));
                contentValues.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, campaignEx.getAc());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put("video_url", campaignEx.getVideoUrlEncode());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
                contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
                contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
                contentValues.put("advImp", campaignEx.getAdvImp());
                contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
                contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
                contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
                contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
                contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
                contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
                contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
                contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
                contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
                contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
                contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
                contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
                contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
                if (campaignEx.getRewardTemplateMode() != null) {
                    contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().i());
                }
                contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
                contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
                contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
                contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
                contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
                contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
                contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
                contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
                contentValues.put("ia_url", campaignEx.getKeyIaUrl());
                contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
                contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
                contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
                contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
                contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
                contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
                contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
                contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
                contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
                contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
                CampaignEx.a adchoice = campaignEx.getAdchoice();
                if (adchoice != null) {
                    contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.d());
                    contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.j()));
                    contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.k()));
                }
                contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
                contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
                contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
                contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
                contentValues.put("ad_zip", campaignEx.getAdZip());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
                contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
                contentValues.put("creative_id", Long.valueOf(campaignEx.getCreativeId()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
                contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
                contentValues.put("bid_token", campaignEx.getBidToken());
                contentValues.put("mraid", campaignEx.getMraid());
                contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
                contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
                contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
                contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
                contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
                contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
                contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
                contentValues.put("placement_id", campaignEx.getPlacementId());
                contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
                contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
                contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
                contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
                contentValues.put("vst", Integer.valueOf(campaignEx.getVst()));
                contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
                contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
                contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
                contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
                contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
                contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
                contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
                contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
                contentValues.put(CampaignEx.JSON_KEY_PRIVACY_URL, campaignEx.getPrivacyUrl());
                contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
                contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
                if (campaignEx.getAabEntity() != null) {
                    contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
                }
                contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
                contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                contentValues.put(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                contentValues.put("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                contentValues.put("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                contentValues.put(CampaignEx.KEY_LOCAL_CHECK_STATE, Integer.valueOf(campaignEx.getLocalCheckShow()));
                contentValues.put(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK, Integer.valueOf(campaignEx.getLocalAllowTrackClick()));
                if (a(campaignEx.getId(), campaignEx.getTab(), str, i, campaignEx.getType(), campaignEx.isBidCampaign())) {
                    if (campaignEx.isBidCampaign()) {
                        str2 = "unitid = ? AND is_bid_campaign = 1";
                        strArr = new String[]{str};
                    } else {
                        strArr = new String[]{campaignEx.getId(), str};
                        str2 = "id = ? AND unitid = ? AND is_bid_campaign = 0";
                    }
                    return getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, str2, strArr);
                }
                return getWritableDatabase().insert(MBInterstitialActivity.INTENT_CAMAPIGN, null, contentValues);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CampaignDao", e.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() != 0) {
                new Thread(new a(list, str)).start();
            }
        }
    }

    public synchronized int a(String str, long j) {
        try {
            com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f == null) {
                f = com.mbridge.msdk.setting.i.b().a();
            }
            long d0 = f.d0() * 1000;
            b(d0, str);
            List<CampaignEx> a2 = a(str, 0, 0, 1, false);
            if (a2 != null && !a2.isEmpty()) {
                Iterator<CampaignEx> it = a2.iterator();
                while (it.hasNext()) {
                    if (!it.next().isSpareOffer(j, d0)) {
                        return 0;
                    }
                }
                return 1;
            }
            return -1;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
            return 0;
        } finally {
        }
    }

    public synchronized boolean a(String str, int i, String str2, int i2, int i3, boolean z) {
        String[] strArr;
        String str3;
        try {
            if (z) {
                str3 = "SELECT id FROM campaign WHERE unitid = ? AND is_bid_campaign = 1";
                strArr = new String[]{str2};
            } else {
                strArr = new String[]{str, String.valueOf(i), str2, String.valueOf(i2), String.valueOf(i3)};
                str3 = "SELECT id FROM campaign WHERE id= ? AND tab= ? AND unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            }
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<CampaignEx> a(String str, int i, int i2, int i3) {
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        if (i <= 0) {
            str2 = "";
        } else {
            arrayList.add(String.valueOf(i));
            str2 = " LIMIT ?";
        }
        return a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?" + str2, (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized List<CampaignEx> a(String str, int i, int i2, int i3, boolean z) {
        ArrayList arrayList;
        String str2;
        String str3;
        try {
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i2));
            arrayList.add(String.valueOf(i3));
            if (z) {
                str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 1";
            } else {
                str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            }
            str3 = "";
            if (i > 0) {
                str3 = " LIMIT ?";
                arrayList.add(String.valueOf(i));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a("SELECT * FROM campaign" + str2 + str3, (String[]) arrayList.toArray(new String[0]));
    }

    public synchronized List<CampaignEx> a(String str, int i, int i2, int i3, String str2) {
        String str3;
        ArrayList arrayList;
        String str4;
        try {
            str3 = (" WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1") + " AND readyState = '0'";
            arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(String.valueOf(i2));
            arrayList.add(String.valueOf(i3));
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + " AND request_id = ? ";
                arrayList.add(str2);
            }
            str4 = "";
            if (i > 0) {
                str4 = " LIMIT ?";
                arrayList.add(String.valueOf(i));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a("SELECT * FROM campaign" + (str3 + " order by ts ASC") + str4, (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0778, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0776, code lost:
    
        if (r8 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0762, code lost:
    
        if (r8 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x077c, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x077f A[Catch: all -> 0x0760, TRY_ENTER, TryCatch #0 {, blocks: (B:39:0x075b, B:10:0x0778, B:53:0x077f, B:54:0x0782), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<CampaignEx> a(String str, String[] strArr) {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = getReadableDatabase().rawQuery(str, strArr);
            if (cursor != null) {
                try {
                    try {
                        if (cursor.getCount() > 0) {
                            ArrayList arrayList = new ArrayList();
                            while (cursor.moveToNext()) {
                                CampaignEx campaignEx = new CampaignEx();
                                String string = cursor.getString(cursor.getColumnIndex("pv_urls"));
                                boolean z = false;
                                if (!TextUtils.isEmpty(string)) {
                                    JSONArray jSONArray = new JSONArray(string);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i = 0; i < jSONArray.length(); i++) {
                                        arrayList2.add(jSONArray.getString(i));
                                    }
                                    campaignEx.setPv_urls(arrayList2);
                                }
                                campaignEx.setId(cursor.getString(cursor.getColumnIndex("id")));
                                campaignEx.setTab(cursor.getInt(cursor.getColumnIndex("tab")));
                                campaignEx.setPackageName(cursor.getString(cursor.getColumnIndex("package_name")));
                                campaignEx.setAppName(cursor.getString(cursor.getColumnIndex(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING)));
                                campaignEx.setAppDesc(cursor.getString(cursor.getColumnIndex("app_desc")));
                                campaignEx.setSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_APP_SIZE)));
                                campaignEx.setImageSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_SIZE)));
                                campaignEx.setIconUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_ICON_URL)));
                                campaignEx.setImageUrl(cursor.getString(cursor.getColumnIndex("image_url")));
                                campaignEx.setImpressionURL(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMPRESSION_URL)));
                                campaignEx.setNoticeUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_NOTICE_URL)));
                                campaignEx.setClickURL(cursor.getString(cursor.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
                                campaignEx.setWtick(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK)));
                                campaignEx.setDeepLinkUrl(cursor.getString(cursor.getColumnIndex("deeplink_url")));
                                campaignEx.setUserActivation(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_USER_ACTIVATION))));
                                campaignEx.setOnlyImpressionURL(cursor.getString(cursor.getColumnIndex("only_impression")));
                                campaignEx.setNetAddress(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)));
                                campaignEx.setAc(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)));
                                campaignEx.setAc_s(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH)));
                                campaignEx.setTemplate(cursor.getInt(cursor.getColumnIndex("template")));
                                campaignEx.setLandingType(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_LANDING_TYPE)));
                                campaignEx.setLinkType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_LINK_TYPE)));
                                campaignEx.setClick_mode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_CLICK_MODE)));
                                campaignEx.setRating(Double.parseDouble(cursor.getString(cursor.getColumnIndex("star"))));
                                campaignEx.setNumberRating(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NUMBER_RATING)));
                                campaignEx.setClickInterval(cursor.getInt(cursor.getColumnIndex("cti")));
                                campaignEx.setTimestamp(cursor.getLong(cursor.getColumnIndex("ts")));
                                campaignEx.setCacheLevel(cursor.getInt(cursor.getColumnIndex(AppLovinEventTypes.USER_COMPLETED_LEVEL)));
                                campaignEx.setType(cursor.getInt(cursor.getColumnIndex("adSource")));
                                campaignEx.setAdCall(cursor.getString(cursor.getColumnIndex("ad_call")));
                                campaignEx.setFca(cursor.getInt(cursor.getColumnIndex("fc_a")));
                                campaignEx.setFcb(cursor.getInt(cursor.getColumnIndex("fc_b")));
                                campaignEx.setAd_url_list(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_URL_LIST)));
                                campaignEx.setVideoLength(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_LENGTHL)));
                                campaignEx.setVideoSize(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_SIZE)));
                                campaignEx.setVideoResolution(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_RESOLUTION)));
                                campaignEx.setEndcard_click_result(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_ENDCARD_CLICK)));
                                campaignEx.setVideoUrlEncode(cursor.getString(cursor.getColumnIndex("video_url")));
                                campaignEx.setWatchMile(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WATCH_MILE)));
                                campaignEx.setTImp(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_T_IMP)));
                                campaignEx.setBty(cursor.getInt(cursor.getColumnIndex("bty")));
                                campaignEx.setAdvImp(cursor.getString(cursor.getColumnIndex("advImp")));
                                campaignEx.setLocalRequestId(cursor.getString(cursor.getColumnIndex("local_request_id")));
                                campaignEx.setNRid(cursor.getString(cursor.getColumnIndex("n_request_id")));
                                campaignEx.setNLRid(cursor.getString(cursor.getColumnIndex("n_local_request_id")));
                                campaignEx.setTyped(cursor.getInt(cursor.getColumnIndex("err_type_default_ad")));
                                campaignEx.setReasond(cursor.getString(cursor.getColumnIndex("err_reason_default_ad")));
                                campaignEx.setOfferType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_OFFER_TYPE)));
                                campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
                                campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
                                campaignEx.setEndScreenUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL)));
                                campaignEx.setRewardName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_NAME)));
                                campaignEx.setRewardAmount(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_AMOUNT)));
                                campaignEx.setRewardPlayStatus(cursor.getInt(cursor.getColumnIndex("reward_play_status")));
                                campaignEx.setRetarget_offer(cursor.getInt(cursor.getColumnIndex("retarget")));
                                campaignEx.setCampaignUnitId(cursor.getString(cursor.getColumnIndex("unitid")));
                                campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursor.getString(cursor.getColumnIndex("native_ad_tracking"))));
                                campaignEx.setNativeVideoTrackingString(cursor.getString(cursor.getColumnIndex("native_ad_tracking")));
                                campaignEx.setVideo_end_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.VIDEO_END_TYPE)));
                                campaignEx.setendcard_url(cursor.getString(cursor.getColumnIndex(CampaignEx.ENDCARD_URL)));
                                campaignEx.setPlayable_ads_without_video(cursor.getInt(cursor.getColumnIndex(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO)));
                                campaignEx.setMof_template_url(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL)));
                                campaignEx.setMof_tplid(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID)));
                                campaignEx.setRewardTemplateMode(CampaignEx.c.a(cursor.getString(cursor.getColumnIndex("reward_teamplate"))));
                                campaignEx.setVideoMD5Value(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5)));
                                campaignEx.setGifUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GIF_URL)));
                                campaignEx.setNvT2(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NV_T2)));
                                campaignEx.setClickTimeOutInterval(cursor.getInt(cursor.getColumnIndex("c_coi")));
                                campaignEx.setcUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_UA)));
                                campaignEx.setImpUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_UA)));
                                campaignEx.setOc_time(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TIME)));
                                campaignEx.setOc_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TYPE)));
                                campaignEx.setT_list(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_T_LIST)));
                                campaignEx.setGhId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_ID)));
                                campaignEx.setGhPath(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_PATH)));
                                campaignEx.setBindId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_BIND_ID)));
                                String string2 = cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ADCHOICE));
                                if (!TextUtils.isEmpty(string2)) {
                                    campaignEx.setAdchoice(CampaignEx.a.c(string2));
                                }
                                campaignEx.setAdchoiceSizeHeight(cursor.getInt(cursor.getColumnIndex("adchoice_size_height")));
                                campaignEx.setAdchoiceSizeWidth(cursor.getInt(cursor.getColumnIndex("adchoice_size_width")));
                                campaignEx.setPlct(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCT)));
                                campaignEx.setPlctb(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCTB)));
                                campaignEx.setCandidateCacheTime(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
                                campaignEx.setAdZip(cursor.getString(cursor.getColumnIndex("ad_zip")));
                                campaignEx.setAdHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_HTML)));
                                campaignEx.setBannerUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_URL)));
                                campaignEx.setBannerHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_HTML)));
                                campaignEx.setCreativeId(cursor.getLong(cursor.getColumnIndex("creative_id")));
                                campaignEx.setVidCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID)));
                                campaignEx.setEcCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_CREATIVE_ID)));
                                campaignEx.setEcTemplateId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_TEMP_ID)));
                                campaignEx.setIsBidCampaign(cursor.getInt(cursor.getColumnIndex("is_bid_campaign")) == 1);
                                campaignEx.setBidToken(cursor.getString(cursor.getColumnIndex("bid_token")));
                                campaignEx.setAdType(cursor.getInt(cursor.getColumnIndex("ad_type")));
                                campaignEx.setFac(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FAC)));
                                campaignEx.setTpOffer(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_TP_OFFER)));
                                campaignEx.setMraid(cursor.getString(cursor.getColumnIndex("mraid")));
                                if (cursor.getInt(cursor.getColumnIndex("is_mraid_campaign")) == 1) {
                                    z = true;
                                }
                                campaignEx.setIsMraid(z);
                                campaignEx.setOmid(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_OMID)));
                                campaignEx.setReady_rate(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_READY_RATE)));
                                campaignEx.setExt_data(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_EXT_DATA)));
                                campaignEx.setNscpt(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT)));
                                campaignEx.setReq_ext_data(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA)));
                                campaignEx.setReadyState(cursor.getInt(cursor.getColumnIndex("readyState")));
                                campaignEx.setLoadTimeoutState(cursor.getInt(cursor.getColumnIndex("load_timeout")));
                                campaignEx.setPlacementId(cursor.getString(cursor.getColumnIndex("placement_id")));
                                campaignEx.setMaitve(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVE)));
                                campaignEx.setMaitve_src(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVESRC)));
                                campaignEx.setFlb(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB)));
                                campaignEx.setFlbSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB_SKIP_TIME)));
                                campaignEx.setCbd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD)));
                                campaignEx.setVst(cursor.getInt(cursor.getColumnIndex("vst")));
                                campaignEx.setUseSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_USE_SKIP_TIME)));
                                campaignEx.setProgressBarShow(cursor.getColumnIndex(CampaignEx.JSON_KEY_PROG_BAR));
                                campaignEx.setAdSpaceT(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T)));
                                campaignEx.setVcn(cursor.getInt(cursor.getColumnIndex("vcn")));
                                campaignEx.setTokenRule(cursor.getInt(cursor.getColumnIndex("token_r")));
                                campaignEx.setEncryptPrice(cursor.getString(cursor.getColumnIndex("encrypt_p")));
                                campaignEx.setVideoCheckType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE)));
                                campaignEx.setVideoCtnType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE)));
                                campaignEx.setRsIgnoreCheckRuleByString(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE)));
                                campaignEx.setVideoCompleteTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME)));
                                campaignEx.setAabEntity(AabEntity.parser(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AAB))));
                                campaignEx.setPrivacyUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_PRIVACY_URL)));
                                campaignEx.setPrivacyButtonTemplateVisibility(cursor.getInt(cursor.getColumnIndex("privacy_button_video")));
                                campaignEx.setImpReportType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_REPORT_TYPE)));
                                campaignEx.setAutoShowStoreMiniCard(cursor.getInt(cursor.getColumnIndex("auto_minicard")));
                                campaignEx.setShowStoreMiniCardDelayTime(cursor.getInt(cursor.getColumnIndex("mincard_trigger_time")));
                                campaignEx.setFilterAdsVideoCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE)));
                                campaignEx.setSecondRequestIndex(cursor.getInt(cursor.getColumnIndex("r_index")));
                                campaignEx.setSecondShowIndex(cursor.getInt(cursor.getColumnIndex("s_show_index")));
                                campaignEx.setFilterCallBackState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE)));
                                campaignEx.setFilterAdsShowCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE)));
                                campaignEx.setLocalCheckShow(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_LOCAL_CHECK_STATE)));
                                campaignEx.setLocalAllowTrackClick(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK)));
                                arrayList.add(campaignEx);
                            }
                            cursor.close();
                            return arrayList;
                        }
                    } catch (Exception e) {
                        e = e;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private CampaignEx a(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        try {
            String string = cursor.getString(cursor.getColumnIndex("pv_urls"));
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                campaignEx.setPv_urls(arrayList);
            }
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDao", e.getLocalizedMessage());
            }
        }
        campaignEx.setId(cursor.getString(cursor.getColumnIndex("id")));
        campaignEx.setTab(cursor.getInt(cursor.getColumnIndex("tab")));
        campaignEx.setPackageName(cursor.getString(cursor.getColumnIndex("package_name")));
        campaignEx.setAppName(cursor.getString(cursor.getColumnIndex(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING)));
        campaignEx.setAppDesc(cursor.getString(cursor.getColumnIndex("app_desc")));
        campaignEx.setSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_APP_SIZE)));
        campaignEx.setImageSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_SIZE)));
        campaignEx.setIconUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_ICON_URL)));
        campaignEx.setImageUrl(cursor.getString(cursor.getColumnIndex("image_url")));
        campaignEx.setImpressionURL(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMPRESSION_URL)));
        campaignEx.setNoticeUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_NOTICE_URL)));
        campaignEx.setClickURL(cursor.getString(cursor.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
        campaignEx.setWtick(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK)));
        campaignEx.setDeepLinkUrl(cursor.getString(cursor.getColumnIndex("deeplink_url")));
        campaignEx.setUserActivation(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_USER_ACTIVATION))));
        campaignEx.setOnlyImpressionURL(cursor.getString(cursor.getColumnIndex("only_impression")));
        campaignEx.setNetAddress(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)));
        campaignEx.setAc(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)));
        campaignEx.setAc_s(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH)));
        campaignEx.setTemplate(cursor.getInt(cursor.getColumnIndex("template")));
        campaignEx.setLandingType(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_LANDING_TYPE)));
        campaignEx.setLinkType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_LINK_TYPE)));
        campaignEx.setClick_mode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_CLICK_MODE)));
        campaignEx.setRating(Double.parseDouble(cursor.getString(cursor.getColumnIndex("star"))));
        campaignEx.setNumberRating(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NUMBER_RATING)));
        campaignEx.setClickInterval(cursor.getInt(cursor.getColumnIndex("cti")));
        campaignEx.setTimestamp(cursor.getLong(cursor.getColumnIndex("ts")));
        campaignEx.setCacheLevel(cursor.getInt(cursor.getColumnIndex(AppLovinEventTypes.USER_COMPLETED_LEVEL)));
        campaignEx.setAdCall(cursor.getString(cursor.getColumnIndex("ad_call")));
        campaignEx.setFcb(cursor.getInt(cursor.getColumnIndex("fc_b")));
        campaignEx.setAd_url_list(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_URL_LIST)));
        campaignEx.setVideoLength(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_LENGTHL)));
        campaignEx.setVideoSize(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_SIZE)));
        campaignEx.setVideoResolution(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_RESOLUTION)));
        campaignEx.setEndcard_click_result(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_ENDCARD_CLICK)));
        campaignEx.setVideoUrlEncode(cursor.getString(cursor.getColumnIndex("video_url")));
        campaignEx.setWatchMile(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WATCH_MILE)));
        campaignEx.setTImp(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_T_IMP)));
        campaignEx.setBty(cursor.getInt(cursor.getColumnIndex("bty")));
        campaignEx.setAdvImp(cursor.getString(cursor.getColumnIndex("advImp")));
        campaignEx.setLocalRequestId(cursor.getString(cursor.getColumnIndex("local_request_id")));
        campaignEx.setNRid(cursor.getString(cursor.getColumnIndex("n_request_id")));
        campaignEx.setNLRid(cursor.getString(cursor.getColumnIndex("n_local_request_id")));
        campaignEx.setTyped(cursor.getInt(cursor.getColumnIndex("err_type_default_ad")));
        campaignEx.setReasond(cursor.getString(cursor.getColumnIndex("err_reason_default_ad")));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setOfferType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_OFFER_TYPE)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_HTML_URL)));
        campaignEx.setEndScreenUrl(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_END_SCREEN_URL)));
        campaignEx.setRewardName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_NAME)));
        campaignEx.setRewardAmount(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_AMOUNT)));
        campaignEx.setRewardPlayStatus(cursor.getInt(cursor.getColumnIndex("reward_play_status")));
        campaignEx.setRetarget_offer(cursor.getInt(cursor.getColumnIndex("retarget")));
        campaignEx.setCampaignUnitId(cursor.getString(cursor.getColumnIndex("unitid")));
        campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursor.getString(cursor.getColumnIndex("native_ad_tracking"))));
        campaignEx.setNativeVideoTrackingString(cursor.getString(cursor.getColumnIndex("native_ad_tracking")));
        campaignEx.setVideo_end_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.VIDEO_END_TYPE)));
        campaignEx.setendcard_url(cursor.getString(cursor.getColumnIndex(CampaignEx.ENDCARD_URL)));
        campaignEx.setPlayable_ads_without_video(cursor.getInt(cursor.getColumnIndex(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO)));
        campaignEx.setMof_template_url(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TEMPLATE_URL)));
        campaignEx.setMof_tplid(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_MOF_TPLID)));
        campaignEx.setRewardTemplateMode(CampaignEx.c.a(cursor.getString(cursor.getColumnIndex("reward_teamplate"))));
        campaignEx.setVideoMD5Value(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5)));
        campaignEx.setGifUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GIF_URL)));
        campaignEx.setNvT2(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NV_T2)));
        campaignEx.setClickTimeOutInterval(cursor.getInt(cursor.getColumnIndex("c_coi")));
        campaignEx.setcUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_UA)));
        campaignEx.setImpUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_UA)));
        campaignEx.setJmPd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_JM_PD)));
        campaignEx.setIsDeleted(cursor.getInt(cursor.getColumnIndex("is_deleted")));
        campaignEx.setIsClick(cursor.getInt(cursor.getColumnIndex("is_click")));
        campaignEx.setIsAddSuccesful(cursor.getInt(cursor.getColumnIndex("is_add_sucesful")));
        campaignEx.setIsDownLoadZip(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_IS_DOWNLOAD)));
        campaignEx.setInteractiveCache(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_CACHE)));
        campaignEx.setKeyIaOri(cursor.getInt(cursor.getColumnIndex("ia_ori")));
        campaignEx.setAdType(cursor.getInt(cursor.getColumnIndex("ad_type")));
        campaignEx.setFac(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FAC)));
        campaignEx.setTpOffer(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_TP_OFFER)));
        campaignEx.setIa_ext1(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT1)));
        campaignEx.setIa_ext2(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT2)));
        campaignEx.setKeyIaRst(cursor.getInt(cursor.getColumnIndex("ia_rst")));
        campaignEx.setKeyIaUrl(cursor.getString(cursor.getColumnIndex("ia_url")));
        campaignEx.setKeyIaIcon(cursor.getString(cursor.getColumnIndex("ia_icon")));
        campaignEx.setOc_time(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TIME)));
        campaignEx.setOc_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TYPE)));
        campaignEx.setT_list(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_T_LIST)));
        campaignEx.setGhId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_ID)));
        campaignEx.setGhPath(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_PATH)));
        campaignEx.setBindId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_BIND_ID)));
        String string2 = cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ADCHOICE));
        if (!TextUtils.isEmpty(string2)) {
            campaignEx.setAdchoice(CampaignEx.a.c(string2));
        }
        campaignEx.setAdchoiceSizeHeight(cursor.getInt(cursor.getColumnIndex("adchoice_size_height")));
        campaignEx.setAdchoiceSizeWidth(cursor.getInt(cursor.getColumnIndex("adchoice_size_width")));
        campaignEx.setPlct(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCT)));
        campaignEx.setPlctb(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCTB)));
        campaignEx.setCandidateCacheTime(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
        campaignEx.setAdZip(cursor.getString(cursor.getColumnIndex("ad_zip")));
        campaignEx.setAdHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_HTML)));
        campaignEx.setBannerUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_URL)));
        campaignEx.setBannerHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_HTML)));
        campaignEx.setCreativeId(cursor.getLong(cursor.getColumnIndex("creative_id")));
        campaignEx.setVidCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID)));
        campaignEx.setEcCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_CREATIVE_ID)));
        campaignEx.setEcTemplateId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_TEMP_ID)));
        campaignEx.setIsBidCampaign(cursor.getInt(cursor.getColumnIndex("is_bid_campaign")) == 1);
        campaignEx.setBidToken(cursor.getString(cursor.getColumnIndex("bid_token")));
        campaignEx.setMraid(cursor.getString(cursor.getColumnIndex("mraid")));
        campaignEx.setIsMraid(cursor.getInt(cursor.getColumnIndex("is_mraid_campaign")) == 1);
        campaignEx.setOmid(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_OMID)));
        campaignEx.setReady_rate(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_READY_RATE)));
        campaignEx.setExt_data(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_EXT_DATA)));
        campaignEx.setNscpt(cursor.getInt(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_NSCPT)));
        campaignEx.setReq_ext_data(cursor.getString(cursor.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_REQ_EXT_DATA)));
        campaignEx.setReadyState(cursor.getInt(cursor.getColumnIndex("readyState")));
        campaignEx.setLoadTimeoutState(cursor.getInt(cursor.getColumnIndex("load_timeout")));
        campaignEx.setPlacementId(cursor.getString(cursor.getColumnIndex("placement_id")));
        campaignEx.setMaitve(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVE)));
        campaignEx.setMaitve_src(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVESRC)));
        campaignEx.setFlb(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB)));
        campaignEx.setFlbSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB_SKIP_TIME)));
        campaignEx.setCbd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD)));
        campaignEx.setVst(cursor.getInt(cursor.getColumnIndex("vst")));
        campaignEx.setUseSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_USE_SKIP_TIME)));
        campaignEx.setProgressBarShow(cursor.getColumnIndex(CampaignEx.JSON_KEY_PROG_BAR));
        campaignEx.setAdSpaceT(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T)));
        campaignEx.setVcn(cursor.getInt(cursor.getColumnIndex("vcn")));
        campaignEx.setTokenRule(cursor.getInt(cursor.getColumnIndex("token_r")));
        campaignEx.setEncryptPrice(cursor.getString(cursor.getColumnIndex("encrypt_p")));
        campaignEx.setVideoCheckType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE)));
        campaignEx.setVideoCtnType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE)));
        campaignEx.setRsIgnoreCheckRuleByString(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE)));
        campaignEx.setVideoCompleteTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME)));
        campaignEx.setAabEntity(AabEntity.parser(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AAB))));
        campaignEx.setPrivacyUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_PRIVACY_URL)));
        campaignEx.setPrivacyButtonTemplateVisibility(cursor.getInt(cursor.getColumnIndex("privacy_button_video")));
        campaignEx.setImpReportType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_REPORT_TYPE)));
        campaignEx.setAutoShowStoreMiniCard(cursor.getInt(cursor.getColumnIndex("auto_minicard")));
        campaignEx.setShowStoreMiniCardDelayTime(cursor.getInt(cursor.getColumnIndex("mincard_trigger_time")));
        campaignEx.setFilterAdsVideoCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE)));
        campaignEx.setSecondRequestIndex(cursor.getInt(cursor.getColumnIndex("r_index")));
        campaignEx.setSecondShowIndex(cursor.getInt(cursor.getColumnIndex("s_show_index")));
        campaignEx.setFilterCallBackState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE)));
        campaignEx.setFilterAdsShowCallState(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE)));
        campaignEx.setLocalCheckShow(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_LOCAL_CHECK_STATE)));
        campaignEx.setLocalAllowTrackClick(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_LOCAL_ALLOW_TRACK_CLICK)));
        return campaignEx;
    }

    public synchronized void a(String str, String str2) {
        try {
        } catch (Exception e) {
            q0.b("CampaignDao", e.getLocalizedMessage());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String[] strArr = {str, str2};
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update(MBInterstitialActivity.INTENT_CAMAPIGN, contentValues, "unitid = ? AND bid_token = ? AND bid_token IS NOT NULL", strArr);
        }
    }
}
