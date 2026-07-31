package com.my.target;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class jc implements CookieStore {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final Map f = new HashMap();
    private final nc e = new nc();

    public jc(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_url_resolver_cookie( uri_key, uri, cookie_json) values (?,?,?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_url_resolver_cookie where uri_key=?");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_url_resolver_cookie");
        a();
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_url_resolver_cookie( uri_key TEXT NOT NULL, uri TEXT NOT NULL, cookie_json TEXT NOT NULL)");
        } catch (Throwable th) {
            mi.a("CookieStore: create table cookie error, " + th);
        }
    }

    private boolean b(String str, String str2) {
        return str2.equals(str) || (str2.startsWith(str) && str.charAt(str.length() - 1) == '/') || (str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/');
    }

    private synchronized void c(URI uri, HttpCookie httpCookie) {
        this.a.beginTransaction();
        try {
            b(uri, httpCookie);
            String uri2 = uri.toString();
            String str = uri2 + com.safedk.android.analytics.brandsafety.m.ad + httpCookie.getName();
            String a = this.e.a(httpCookie);
            this.b.bindString(1, str);
            this.b.bindString(2, uri2);
            this.b.bindString(3, a);
            this.b.executeInsert();
            this.a.setTransactionSuccessful();
        } catch (Throwable th) {
            try {
                mi.a("DB insertCookie error: " + th);
            } finally {
                this.a.endTransaction();
                this.b.clearBindings();
            }
        }
    }

    @Override // java.net.CookieStore
    public synchronized void add(URI uri, HttpCookie httpCookie) {
        try {
            URI a = a(uri, httpCookie);
            Set set = (Set) this.f.get(a);
            if (set == null) {
                set = new HashSet();
                this.f.put(a, set);
            }
            set.remove(httpCookie);
            set.add(httpCookie);
            c(a, httpCookie);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.net.CookieStore
    public synchronized List get(URI uri) {
        return a(uri);
    }

    @Override // java.net.CookieStore
    public synchronized List getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(a((URI) it.next()));
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public synchronized List getURIs() {
        return new ArrayList(this.f.keySet());
    }

    @Override // java.net.CookieStore
    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        try {
            Set set = (Set) this.f.get(uri);
            boolean z = set != null && set.remove(httpCookie);
            if (!z) {
                return z;
            }
            b(uri, httpCookie);
            return z;
        } finally {
        }
    }

    @Override // java.net.CookieStore
    public synchronized boolean removeAll() {
        this.f.clear();
        b();
        return true;
    }

    private static URI a(URI uri, HttpCookie httpCookie) {
        if (httpCookie.getDomain() != null) {
            String domain = httpCookie.getDomain();
            if (domain.charAt(0) == '.') {
                domain = domain.substring(1);
            }
            try {
                return new URI(uri.getScheme() == null ? "http" : uri.getScheme(), domain, httpCookie.getPath() == null ? "/" : httpCookie.getPath(), null);
            } catch (Throwable th) {
                mi.a("MyTargetCookieStore: Error - " + th.getMessage());
            }
        }
        return uri;
    }

    private synchronized void b(URI uri, HttpCookie httpCookie) {
        try {
            this.c.bindString(1, uri + com.safedk.android.analytics.brandsafety.m.ad + httpCookie.getName());
            this.c.executeUpdateDelete();
        } finally {
            this.c.clearBindings();
        }
    }

    private synchronized void b() {
        try {
            this.d.executeUpdateDelete();
        } finally {
            this.d.clearBindings();
        }
    }

    private void a() {
        try {
            Cursor rawQuery = this.a.rawQuery("SELECT  uri, cookie_json FROM table_url_resolver_cookie", null);
            while (rawQuery.moveToNext()) {
                try {
                    String a = a(rawQuery, 0);
                    String a2 = a(rawQuery, 1);
                    HttpCookie a3 = a2 != null ? this.e.a(a2) : null;
                    if (a3 != null && a != null) {
                        URI uri = new URI(a);
                        Set set = (Set) this.f.get(uri);
                        if (set == null) {
                            set = new HashSet();
                            this.f.put(uri, set);
                        }
                        set.add(a3);
                    }
                } finally {
                }
            }
            rawQuery.close();
        } catch (Throwable unused) {
        }
    }

    private List a(URI uri) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f.entrySet()) {
            URI uri2 = (URI) entry.getKey();
            if (a(uri2.getHost(), uri.getHost()) && b(uri2.getPath(), uri.getPath())) {
                hashSet.addAll((Collection) entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            a(uri, arrayList);
        }
        return new ArrayList(hashSet);
    }

    private boolean a(String str, String str2) {
        if (str2.equals(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(str);
        return str2.endsWith(sb.toString());
    }

    private synchronized void a(URI uri, List list) {
        this.a.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b(uri, (HttpCookie) it.next());
            }
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
        } catch (Throwable unused) {
            this.a.endTransaction();
        }
    }

    private String a(Cursor cursor, int i) {
        try {
            return cursor.getString(i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
