package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: LruReplaceTempCache.java */
/* loaded from: classes5.dex */
public class a {
    private final LinkedHashMap<String, JSONObject> a;
    private final int b;
    private int c;

    public a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = i;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.c += b(str, jSONObject);
                JSONObject put = this.a.put(str, jSONObject);
                if (put != null) {
                    this.c -= b(str, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a(this.b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.c < 0 || (this.a.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c <= i || this.a.isEmpty()) {
                        break;
                    }
                    Map.Entry<String, JSONObject> next = this.a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int b = b(key, next.getValue());
                        this.a.remove(key);
                        this.c -= b;
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
        }
    }
}
