package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

/* compiled from: ObservableMap.java */
/* loaded from: classes4.dex */
public class a {
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<b<String>>> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e.getMessage(), e);
        }
    }

    public Map<String, CopyOnWriteArrayList<b<String>>> c() {
        return this.a;
    }

    public boolean d() {
        return this.b.isEmpty();
    }

    @NonNull
    public Set<String> e() {
        return this.b.keySet();
    }

    public int f() {
        return this.b.size();
    }

    @NonNull
    public Collection<Object> g() {
        return this.b.values();
    }

    @NonNull
    public String toString() {
        return this.b.toString();
    }

    public void a(String str, b<String> bVar) {
        try {
            this.a.computeIfAbsent(str, new Function() { // from class: com.mbridge.msdk.config.dynamic.binddata.wrapper.a$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    CopyOnWriteArrayList a;
                    a = a.a((String) obj);
                    return a;
                }
            }).addIfAbsent(bVar);
        } catch (Exception e) {
            q0.b("ObservableMap", "Failed to add map observer: " + e.getMessage(), e);
        }
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        return this.b.remove(obj);
    }

    public Map<String, Object> b() {
        return this.b;
    }

    public void b(Map<String, CopyOnWriteArrayList<b<String>>> map) {
        this.a.clear();
        this.a.putAll(map);
    }

    @Nullable
    public Object b(@Nullable Object obj) {
        return this.b.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CopyOnWriteArrayList a(String str) {
        return new CopyOnWriteArrayList();
    }

    public boolean a(@Nullable Object obj) {
        return this.b.containsKey(obj);
    }

    @NonNull
    public Set<Map.Entry<String, Object>> a() {
        return this.b.entrySet();
    }

    public void a(@NonNull Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e) {
            q0.b("ObservableMap", e.getMessage(), e);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e.getMessage(), e);
            return 0;
        }
    }

    private void a(final String str, final Object obj, String str2) {
        CopyOnWriteArrayList<b<String>> copyOnWriteArrayList;
        if (this.a.containsKey(str) && (copyOnWriteArrayList = this.a.get(str)) != null) {
            for (final b<String> bVar : copyOnWriteArrayList) {
                if (bVar instanceof d) {
                    View a = ((d) bVar).a();
                    if (a != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.a(str, obj);
                        } else {
                            a.post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.binddata.wrapper.a$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.this.a(str, obj);
                                }
                            });
                        }
                    } else {
                        bVar.a(str, obj);
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }
}
