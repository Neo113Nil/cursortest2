package com.mbridge.msdk.config.component.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ComponentSharedPreferencesManager.java */
/* loaded from: classes13.dex */
public class b {
    private static b c;
    private SharedPreferences a;
    private final Map<String, Object> b = new ConcurrentHashMap();

    private b(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        this.a = context.getSharedPreferences(TextUtils.isEmpty(str) ? "mbridge_component_sp" : str, 0);
    }

    public static b a(Context context) {
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        c = new b(context, "mbridge_component_sp");
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.apply();
        a(str, (Object) str2);
    }

    public void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putInt(str, i);
        edit.apply();
        a(str, Integer.valueOf(i));
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        Object a = a(str);
        if (a instanceof String) {
            return (String) a;
        }
        String string = this.a.getString(str, str2);
        a(str, (Object) string);
        return string;
    }

    public int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        Object a = a(str);
        if (a instanceof Integer) {
            return ((Integer) a).intValue();
        }
        int i2 = this.a.getInt(str, i);
        a(str, Integer.valueOf(i2));
        return i2;
    }

    public long a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        Object a = a(str);
        if (a instanceof Long) {
            return ((Long) a).longValue();
        }
        long j2 = this.a.getLong(str, j);
        a(str, Long.valueOf(j2));
        return j2;
    }

    public float a(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        Object a = a(str);
        if (a instanceof Float) {
            return ((Float) a).floatValue();
        }
        float f2 = this.a.getFloat(str, f);
        a(str, Float.valueOf(f2));
        return f2;
    }

    public boolean a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Object a = a(str);
        if (a instanceof Boolean) {
            return ((Boolean) a).booleanValue();
        }
        boolean z2 = this.a.getBoolean(str, z);
        a(str, Boolean.valueOf(z2));
        return z2;
    }

    private Object a(String str) {
        return this.b.get(str);
    }

    private void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
