package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC5646rf implements Ol {
    public static final String c = "rf";
    public final InterfaceC5357gb a;
    public final String b;

    public AbstractC5646rf(InterfaceC5357gb interfaceC5357gb) {
        this(interfaceC5357gb, null);
    }

    public abstract /* synthetic */ int a(@NotNull String str, int i);

    public abstract /* synthetic */ long a(@NotNull String str, long j);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5646rf> T a(String str, float f) {
        synchronized (this) {
            this.a.a(str, f);
        }
        return this;
    }

    @Nullable
    public abstract /* synthetic */ String a(@NotNull String str, @Nullable String str2);

    public abstract /* synthetic */ boolean a(@NotNull String str, boolean z);

    @NotNull
    public abstract /* synthetic */ Ol b(@NotNull String str, int i);

    @NotNull
    public abstract /* synthetic */ Ol b(@NotNull String str, long j);

    @NotNull
    public abstract /* synthetic */ Ol b(@NotNull String str, @Nullable String str2);

    @NotNull
    public abstract /* synthetic */ Ol b(@NotNull String str, boolean z);

    public abstract /* synthetic */ boolean b(@NotNull String str);

    public final long c(String str, long j) {
        return this.a.getLong(str, j);
    }

    public final C5672sf d(String str) {
        return new C5672sf(str, this.b);
    }

    @NotNull
    public abstract /* synthetic */ Ol e(@NotNull String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5646rf> T f(String str) {
        synchronized (this) {
            this.a.remove(str);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ol, io.appmetrica.analytics.impl.To
    public void flushAsync() {
        this.a.flushAsync();
    }

    public AbstractC5646rf(InterfaceC5357gb interfaceC5357gb, String str) {
        this.a = interfaceC5357gb;
        this.b = str;
    }

    public final int c(@NonNull String str, int i) {
        return this.a.getInt(str, i);
    }

    @androidx.annotation.Nullable
    public final String c(@NonNull String str, @androidx.annotation.Nullable String str2) {
        return this.a.getString(str, str2);
    }

    public final boolean c(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5646rf> T d(String str, String str2) {
        synchronized (this) {
            this.a.a(str, str2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5646rf> T a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.a.a(str, str2);
        return this;
    }

    public final boolean c(@NonNull String str) {
        return this.a.a(str);
    }

    @NonNull
    public Set<String> c() {
        return this.a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5646rf> T d(String str, long j) {
        synchronized (this) {
            this.a.a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends AbstractC5646rf> T d(String str, int i) {
        synchronized (this) {
            this.a.a(str, i);
        }
        return this;
    }

    public final <T extends AbstractC5646rf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public void a() {
        synchronized (this) {
            this.a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5646rf> T d(String str, boolean z) {
        synchronized (this) {
            this.a.a(str, z);
        }
        return this;
    }
}
