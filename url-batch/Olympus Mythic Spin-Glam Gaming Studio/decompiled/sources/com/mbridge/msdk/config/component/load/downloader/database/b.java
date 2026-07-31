package com.mbridge.msdk.config.component.load.downloader.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.ironsource.V5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;

/* compiled from: DownloadInfo.java */
/* loaded from: classes6.dex */
public class b {
    private String a;
    private long b;
    private long c;
    private String d;
    private String e;
    private long f;
    private long g;
    private String h;
    private int i;
    private String j;
    private String k;
    private String l;
    private long m;
    private int n;

    private b() {
    }

    public void a(long j) {
        this.b = j;
    }

    public void b(int i) {
        this.i = i;
    }

    public void c(long j) {
        this.g = j;
    }

    public long d() {
        return this.b;
    }

    public void e(long j) {
        this.c = j;
    }

    public void f(String str) {
        this.a = str;
    }

    public long g() {
        return this.m;
    }

    public String h() {
        return this.h;
    }

    public String i() {
        return this.a;
    }

    public int j() {
        return this.i;
    }

    public long k() {
        return this.g;
    }

    public long l() {
        return this.f;
    }

    public String m() {
        return this.e;
    }

    public long n() {
        return this.c;
    }

    public String a() {
        return this.l;
    }

    public String b() {
        return this.k;
    }

    public String c() {
        return this.j;
    }

    public void d(String str) {
        this.d = str;
        try {
            URL url = new URL(str);
            this.e = url.getProtocol() + "://" + url.getHost() + url.getPath();
        } catch (Exception e) {
            q0.b("DownloadInfo", e.getMessage(), e);
        }
    }

    public void e(String str) {
        this.h = str;
    }

    public String f() {
        return this.d;
    }

    public void a(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.k = str;
    }

    public void c(String str) {
        this.j = str;
    }

    public int e() {
        return this.n;
    }

    public void a(int i) {
        this.n = i;
    }

    public void b(long j) {
        this.m = j;
    }

    public static b a(String str, String str2, long j, long j2, long j3, long j4, long j5, int i, String str3, int i2, String str4, String str5, String str6) {
        b bVar = new b();
        bVar.d(str);
        bVar.f(str2);
        bVar.c(j4);
        bVar.a(j);
        bVar.e(j2);
        bVar.d(j3);
        bVar.c(str3);
        bVar.b(i2);
        bVar.e(str4);
        bVar.b(str5);
        bVar.a(str6);
        bVar.b(j5);
        bVar.a(i);
        return bVar;
    }

    public static ContentValues b(b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("URL", bVar.m());
        contentValues.put(V5.c.c, bVar.i());
        contentValues.put("fileSize", Long.valueOf(bVar.k()));
        contentValues.put("touchTime", Long.valueOf(bVar.l()));
        contentValues.put("createTime", Long.valueOf(bVar.d()));
        contentValues.put("successTime", Long.valueOf(bVar.n()));
        contentValues.put("downloadedSize", Long.valueOf(bVar.g()));
        contentValues.put("downloadProgress", Integer.valueOf(bVar.e()));
        contentValues.put("md5", bVar.h());
        contentValues.put("status", Integer.valueOf(bVar.j()));
        contentValues.put("cacheKey", bVar.b());
        contentValues.put("businessType", bVar.a());
        return contentValues;
    }

    public void d(long j) {
        this.f = j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(Cursor cursor) {
        char c;
        b bVar = new b();
        cursor.moveToFirst();
        for (String str : cursor.getColumnNames()) {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                str.hashCode();
                switch (str.hashCode()) {
                    case -1638078763:
                        if (str.equals("downloadProgress")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1268298384:
                        if (str.equals("successTime")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -892481550:
                        if (str.equals("status")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -735662143:
                        if (str.equals(V5.c.c)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -735564899:
                        if (str.equals("fileSize")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -672734438:
                        if (str.equals("businessType")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -433508483:
                        if (str.equals("cacheKey")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -389131437:
                        if (str.equals("contentType")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107902:
                        if (str.equals("md5")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 363785900:
                        if (str.equals("touchTime")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1144404936:
                        if (str.equals("downloadedSize")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1369213417:
                        if (str.equals("createTime")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1731535326:
                        if (str.equals("originalURL")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        bVar.a(cursor.getInt(columnIndex));
                        break;
                    case 1:
                        bVar.e(cursor.getLong(columnIndex));
                        break;
                    case 2:
                        bVar.b(cursor.getInt(columnIndex));
                        break;
                    case 3:
                        bVar.f(cursor.getString(columnIndex));
                        break;
                    case 4:
                        bVar.c(cursor.getLong(columnIndex));
                        break;
                    case 5:
                        bVar.a(cursor.getString(columnIndex));
                        break;
                    case 6:
                        bVar.b(cursor.getString(columnIndex));
                        break;
                    case 7:
                        bVar.c(cursor.getString(columnIndex));
                        break;
                    case '\b':
                        bVar.e(cursor.getString(columnIndex));
                        break;
                    case '\t':
                        bVar.d(cursor.getLong(columnIndex));
                        break;
                    case '\n':
                        bVar.b(cursor.getLong(columnIndex));
                        break;
                    case 11:
                        bVar.a(cursor.getLong(columnIndex));
                        break;
                    case '\f':
                        bVar.d(cursor.getString(columnIndex));
                        break;
                }
            }
        }
        return bVar;
    }

    public static ContentValues a(b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("originalURL", bVar.f());
        contentValues.put("URL", bVar.m());
        contentValues.put(V5.c.c, bVar.i());
        contentValues.put("fileSize", Long.valueOf(bVar.k()));
        contentValues.put("touchTime", Long.valueOf(bVar.l()));
        contentValues.put("createTime", Long.valueOf(bVar.d()));
        contentValues.put("successTime", Long.valueOf(bVar.n()));
        contentValues.put("downloadedSize", Long.valueOf(bVar.g()));
        contentValues.put("downloadProgress", Integer.valueOf(bVar.e()));
        contentValues.put("md5", bVar.h());
        contentValues.put("status", Integer.valueOf(bVar.j()));
        contentValues.put("cacheKey", bVar.b());
        contentValues.put("businessType", bVar.a());
        return contentValues;
    }
}
