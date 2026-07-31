package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences;", "", "", "key", "getString", "com/vungle/ads/internal/persistence/a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class FilePreferences {
    public static final a d = new a();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public final Executor a;
    public final File b;
    public final ConcurrentHashMap c;

    public FilePreferences(j jVar, PathProvider pathProvider, String str) {
        this.a = jVar;
        File file = new File(pathProvider.a(), str);
        this.b = file;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        Object c = n.c(file);
        if (c instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) c);
        }
    }

    public /* synthetic */ FilePreferences(j jVar, PathProvider pathProvider, String str, int i) {
        this(jVar, pathProvider, str);
    }

    public final void b() {
        final HashMap hashMap = new HashMap(this.c);
        this.a.execute(new Runnable() { // from class: com.vungle.ads.internal.persistence.FilePreferences$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FilePreferences.a(FilePreferences.this, hashMap);
            }
        });
    }

    @Nullable
    public final String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.c.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final void a(FilePreferences this$0, Serializable serializable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serializable, "$serializable");
        n.a(this$0.b, serializable);
    }

    public final String c() {
        Intrinsics.checkNotNullParameter("previous_tcf_token", "key");
        Intrinsics.checkNotNullParameter("", "defaultValue");
        Object obj = this.c.get("previous_tcf_token");
        return obj instanceof String ? (String) obj : "";
    }

    public final FilePreferences a(boolean z, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.c.put(key, Boolean.valueOf(z));
        return this;
    }

    public final FilePreferences b(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.c.put(key, Integer.valueOf(i));
        return this;
    }

    public final Boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.c.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final FilePreferences b(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.c.put(key, Long.valueOf(j));
        return this;
    }

    public final FilePreferences a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.c.put(key, value);
        return this;
    }

    public final int a(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.c.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : i;
    }

    public final long a(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.c.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : j;
    }
}
