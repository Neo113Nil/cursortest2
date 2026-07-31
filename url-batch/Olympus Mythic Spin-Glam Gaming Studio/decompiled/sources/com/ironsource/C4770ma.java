package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.ma, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4770ma {
    private static C4770ma c;
    private final HashSet<ImpressionDataListener> a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    C4770ma() {
    }

    public static synchronized C4770ma b() {
        C4770ma c4770ma;
        synchronized (C4770ma.class) {
            try {
                if (c == null) {
                    c = new C4770ma();
                }
                c4770ma = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4770ma;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }
}
