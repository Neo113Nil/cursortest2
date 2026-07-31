package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.E4;

/* loaded from: classes10.dex */
public class CrashProvider extends ContentProvider {
    Context a;
    E4 b;
    String c;
    Uri e;
    String h;
    String i;
    UriMatcher d = new UriMatcher(-1);
    final int f = 1;
    final int g = 2;
    final String j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.d.match(uri);
        if (match == 1) {
            return this.h;
        }
        if (match == 2) {
            return this.i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.a = getContext();
        this.b = new E4(this.a);
        this.c = this.a.getPackageName();
        this.e = Uri.parse("content://" + this.c + "/REPORTS");
        this.h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.d.match(uri);
        if (match == 1) {
            return E4.c();
        }
        if (match == 2) {
            return E4.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
