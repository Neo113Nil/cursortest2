package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.ironsource.B5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoReportDataDao.java */
/* loaded from: classes3.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {
    private static final String a = "com.mbridge.msdk.foundation.db.n";
    private static n b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (b == null) {
            synchronized (n.class) {
                try {
                    if (b == null) {
                        b = new n(fVar);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        if (r1 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized int d() {
        int i;
        i = 0;
        Cursor cursor = null;
        try {
            try {
                cursor = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursor != null && cursor.moveToFirst()) {
                    i = cursor.getInt(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
        return i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x035f, code lost:
    
        if (r11 == null) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0367 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<com.mbridge.msdk.foundation.entity.n> a(String str) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        com.mbridge.msdk.foundation.entity.n nVar;
        String str2;
        ArrayList arrayList;
        Cursor cursor4;
        com.mbridge.msdk.foundation.entity.n nVar2;
        String str3 = str;
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    cursor2 = getReadableDatabase().query("reward_report", null, "key=?", new String[]{str}, null, null, null);
                    if (cursor2 != null) {
                        try {
                            if (cursor2.getCount() > 0) {
                                ArrayList arrayList2 = new ArrayList();
                                while (cursor2.moveToNext()) {
                                    String string = cursor2.getString(cursor2.getColumnIndex("key"));
                                    int i = cursor2.getInt(cursor2.getColumnIndex("networkType"));
                                    String string2 = cursor2.getString(cursor2.getColumnIndex("network_str"));
                                    cursor2.getInt(cursor2.getColumnIndex("isCompleteView"));
                                    cursor2.getInt(cursor2.getColumnIndex("watchedMillis"));
                                    int i2 = cursor2.getInt(cursor2.getColumnIndex(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH));
                                    String string3 = cursor2.getString(cursor2.getColumnIndex("offerUrl"));
                                    String string4 = cursor2.getString(cursor2.getColumnIndex("reason"));
                                    int i3 = cursor2.getInt(cursor2.getColumnIndex("result"));
                                    String string5 = cursor2.getString(cursor2.getColumnIndex(IronSourceConstants.EVENTS_DURATION));
                                    int i4 = cursor2.getInt(cursor2.getColumnIndex("videoSize"));
                                    String string6 = cursor2.getString(cursor2.getColumnIndex("campaignId"));
                                    String string7 = cursor2.getString(cursor2.getColumnIndex("video_url"));
                                    String string8 = cursor2.getString(cursor2.getColumnIndex("unitId"));
                                    String string9 = cursor2.getString(cursor2.getColumnIndex(com.safedk.android.analytics.brandsafety.m.x));
                                    String string10 = cursor2.getString(cursor2.getColumnIndex("rid_n"));
                                    String string11 = cursor2.getString(cursor2.getColumnIndex("ad_type"));
                                    String string12 = cursor2.getString(cursor2.getColumnIndex("resource_type"));
                                    ArrayList arrayList3 = arrayList2;
                                    String string13 = cursor2.getString(cursor2.getColumnIndex("device_id"));
                                    String string14 = cursor2.getString(cursor2.getColumnIndex("creative"));
                                    int i5 = cursor2.getInt(cursor2.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T));
                                    if (str3.equals("2000021")) {
                                        try {
                                            try {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i, string3, string4, string2);
                                                nVar.b(string6);
                                                nVar.v(string7);
                                                nVar.n(string9);
                                                nVar.o(string10);
                                                nVar.u(string8);
                                                str2 = str3;
                                                cursor3 = cursor2;
                                            } catch (Exception e) {
                                                e = e;
                                                e.printStackTrace();
                                                q0.b(a, e.getMessage());
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                try {
                                                    cursor.close();
                                                } catch (Exception unused) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } else {
                                        if (str3.equals("2000022")) {
                                            try {
                                                cursor4 = cursor2;
                                                try {
                                                    nVar = new com.mbridge.msdk.foundation.entity.n(string, i, i2, string3, i3, string5, i4, string2);
                                                    nVar.b(string6);
                                                    nVar.v(string7);
                                                    nVar.n(string9);
                                                    nVar.u(string8);
                                                    nVar.m(string4);
                                                    nVar.o(string10);
                                                    nVar.a(string11);
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    cursor2 = cursor4;
                                                    e.printStackTrace();
                                                    q0.b(a, e.getMessage());
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cursor = cursor4;
                                                    if (cursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                e.printStackTrace();
                                                q0.b(a, e.getMessage());
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor4 = cursor2;
                                            }
                                        } else {
                                            cursor4 = cursor2;
                                            try {
                                                if (str3.equals("2000025")) {
                                                    nVar = new com.mbridge.msdk.foundation.entity.n(string, i, i2, string3, i3, string5, i4, string2);
                                                } else if (str3.equals("2000024")) {
                                                    nVar = new com.mbridge.msdk.foundation.entity.n(string, i, string3, string4, string2);
                                                } else if ("2000039".equals(str3)) {
                                                    try {
                                                        nVar = new com.mbridge.msdk.foundation.entity.n(cursor4.getString(cursor4.getColumnIndex("h5_click_data")));
                                                        str2 = str3;
                                                        cursor3 = cursor4;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        cursor2 = cursor4;
                                                        e.printStackTrace();
                                                        q0.b(a, e.getMessage());
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor = cursor4;
                                                        if (cursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    try {
                                                        if ("2000043".equals(str3)) {
                                                            try {
                                                                String string15 = cursor4.getString(cursor4.getColumnIndex("type"));
                                                                String string16 = cursor4.getString(cursor4.getColumnIndex(CampaignEx.ENDCARD_URL));
                                                                cursor4 = cursor4;
                                                                com.mbridge.msdk.foundation.entity.n nVar3 = new com.mbridge.msdk.foundation.entity.n(str, i3, string5, string16, string6, string8, string4, string15);
                                                                nVar3.n(string9);
                                                                nVar3.o(string10);
                                                                if (!TextUtils.isEmpty(string6)) {
                                                                    nVar3.b(string6);
                                                                }
                                                                nVar3.a(i5);
                                                                nVar3.a(string11);
                                                                nVar3.p(string12);
                                                                nVar3.d(string13);
                                                                nVar3.c(string14);
                                                                str2 = str;
                                                                nVar = nVar3;
                                                                cursor3 = cursor4;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                cursor4 = cursor4;
                                                                cursor2 = cursor4;
                                                                e.printStackTrace();
                                                                q0.b(a, e.getMessage());
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                cursor4 = cursor4;
                                                                cursor = cursor4;
                                                                if (cursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            str2 = str;
                                                            if ("2000045".equals(str2)) {
                                                                nVar2 = new com.mbridge.msdk.foundation.entity.n();
                                                                nVar2.j(str2);
                                                                nVar2.c(i);
                                                                nVar2.d(i3);
                                                                nVar2.b(string6);
                                                                cursor3 = cursor4;
                                                                nVar2.t(cursor3.getString(cursor3.getColumnIndex("template_url")));
                                                                nVar2.m(string4);
                                                                nVar2.n(string9);
                                                                nVar2.o(string10);
                                                                nVar2.u(string8);
                                                            } else {
                                                                cursor3 = cursor4;
                                                                if ("2000044".equals(str2)) {
                                                                    nVar2 = new com.mbridge.msdk.foundation.entity.n();
                                                                    nVar2.j(str2);
                                                                    nVar2.c(i);
                                                                    nVar2.b(string6);
                                                                    nVar2.i(cursor3.getString(cursor3.getColumnIndex("image_url")));
                                                                    nVar2.m(string4);
                                                                    nVar2.n(string9);
                                                                    nVar2.o(string10);
                                                                    nVar2.u(string8);
                                                                } else if ("2000054".equals(str2)) {
                                                                    com.mbridge.msdk.foundation.entity.n nVar4 = new com.mbridge.msdk.foundation.entity.n();
                                                                    nVar4.j(str2);
                                                                    nVar4.p(string12);
                                                                    nVar4.u(string8);
                                                                    nVar4.d(string13);
                                                                    nVar4.a(string11);
                                                                    nVar4.b(string6);
                                                                    nVar4.n(string9);
                                                                    nVar4.o(string10);
                                                                    nVar4.d(i3);
                                                                    nVar4.m(string4);
                                                                    nVar4.c(i);
                                                                    nVar4.c(string14);
                                                                    nVar4.a(i5);
                                                                    nVar = nVar4;
                                                                } else {
                                                                    nVar = null;
                                                                }
                                                            }
                                                            nVar = nVar2;
                                                        }
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        cursor3 = cursor4;
                                                        cursor2 = cursor3;
                                                        e.printStackTrace();
                                                        q0.b(a, e.getMessage());
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        cursor3 = cursor4;
                                                        cursor = cursor3;
                                                        if (cursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                cursor3 = cursor4;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cursor3 = cursor4;
                                            }
                                        }
                                        str2 = str3;
                                        cursor3 = cursor4;
                                    }
                                    if (nVar != null) {
                                        try {
                                            arrayList = arrayList3;
                                            arrayList.add(nVar);
                                        } catch (Exception e8) {
                                            e = e8;
                                            cursor2 = cursor3;
                                            e.printStackTrace();
                                            q0.b(a, e.getMessage());
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor = cursor3;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                    int i6 = cursor3.getInt(cursor3.getColumnIndex("id"));
                                    getWritableDatabase().delete("reward_report", "id = ?", new String[]{i6 + ""});
                                    arrayList2 = arrayList;
                                    cursor2 = cursor3;
                                    str3 = str2;
                                }
                                ArrayList arrayList4 = arrayList2;
                                try {
                                    cursor2.close();
                                } catch (Exception unused2) {
                                }
                                return arrayList4;
                            }
                        } catch (Exception e9) {
                            e = e9;
                        } catch (Throwable th9) {
                            th = th9;
                            cursor3 = cursor2;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    cursor2 = null;
                } catch (Throwable th10) {
                    th = th10;
                    cursor = null;
                }
                if (cursor2 != null) {
                    cursor2 = cursor2;
                    try {
                        cursor2.close();
                    } catch (Exception unused3) {
                    }
                }
            }
            return null;
        }
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        try {
            if (nVar != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key", nVar.n());
                    contentValues.put("networkType", Integer.valueOf(nVar.q()));
                    contentValues.put("network_str", nVar.r());
                    contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                    contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, Integer.valueOf(nVar.C()));
                    if (!TextUtils.isEmpty(nVar.s())) {
                        contentValues.put("offerUrl", nVar.s());
                    }
                    if (!TextUtils.isEmpty(nVar.t())) {
                        contentValues.put("reason", URLEncoder.encode(nVar.t(), B5.O));
                    }
                    contentValues.put("result", Integer.valueOf(nVar.x()));
                    contentValues.put(IronSourceConstants.EVENTS_DURATION, nVar.g());
                    contentValues.put("videoSize", Long.valueOf(nVar.D()));
                    contentValues.put("type", nVar.h());
                    String i = nVar.i();
                    if (!TextUtils.isEmpty(i)) {
                        contentValues.put(CampaignEx.ENDCARD_URL, i);
                    }
                    String E = nVar.E();
                    if (!TextUtils.isEmpty(E)) {
                        contentValues.put("video_url", E);
                    }
                    String u = nVar.u();
                    if (!TextUtils.isEmpty(u)) {
                        contentValues.put(com.safedk.android.analytics.brandsafety.m.x, u);
                    }
                    String v = nVar.v();
                    if (!TextUtils.isEmpty(v)) {
                        contentValues.put("rid_n", v);
                    }
                    String z = nVar.z();
                    if (!TextUtils.isEmpty(z)) {
                        contentValues.put("template_url", z);
                    }
                    String l = nVar.l();
                    if (!TextUtils.isEmpty(l)) {
                        contentValues.put("image_url", l);
                    }
                    String a2 = nVar.a();
                    if (!TextUtils.isEmpty(a2)) {
                        contentValues.put("ad_type", URLEncoder.encode(a2, B5.O));
                    }
                    contentValues.put("unitId", nVar.B());
                    contentValues.put("campaignId", nVar.d());
                    if ("2000039".equals(nVar.n())) {
                        String b2 = o.b(nVar);
                        if (a1.b(b2)) {
                            contentValues.put("h5_click_data", b2);
                        }
                    }
                    String w = nVar.w();
                    if (!TextUtils.isEmpty(w)) {
                        contentValues.put("resource_type", URLEncoder.encode(w, B5.O));
                    }
                    String f = nVar.f();
                    if (!TextUtils.isEmpty(f)) {
                        contentValues.put("device_id", URLEncoder.encode(f, B5.O));
                    }
                    String e = nVar.e();
                    if (!TextUtils.isEmpty(e)) {
                        contentValues.put("creative", URLEncoder.encode(e, B5.O));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                    return getWritableDatabase().insert("reward_report", null, contentValues);
                } catch (Exception e2) {
                    q0.b(a, e2.getMessage());
                }
            }
            return -1L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
