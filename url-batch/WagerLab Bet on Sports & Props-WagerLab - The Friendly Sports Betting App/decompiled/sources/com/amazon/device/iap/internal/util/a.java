package com.amazon.device.iap.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;

/* compiled from: CursorUtil.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f692a = a.class.getName() + "_PREFS";

    public static String a(String str) {
        f.a((Object) str, "userId");
        Context b = com.amazon.device.iap.internal.d.f().b();
        f.a(b, "context");
        return b.getSharedPreferences(f692a, 0).getString(str, null);
    }

    public static void a(String str, String str2) {
        f.a((Object) str, "userId");
        Context b = com.amazon.device.iap.internal.d.f().b();
        f.a(b, "context");
        SharedPreferences.Editor edit = b.getSharedPreferences(f692a, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
