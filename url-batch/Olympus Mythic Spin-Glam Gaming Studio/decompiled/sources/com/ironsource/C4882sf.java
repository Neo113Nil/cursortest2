package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4882sf implements B3 {

    @NotNull
    public static final a d = new a(null);
    public static final int e = -1;
    public static final long f = -1;

    @NotNull
    private final Context a;

    @NotNull
    private final String b;

    @NotNull
    private final K8 c;

    /* renamed from: com.ironsource.sf$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4882sf(@NotNull Context context, @NotNull String baseName, @NotNull K8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.a = context;
        this.b = baseName;
        this.c = sdkSharedPref;
    }

    @Override // com.ironsource.B3
    public void a(@NotNull String identifier, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.a, new C4900tf(identifier, this.b + ".show_count_show_counter").a(), i);
    }

    @Override // com.ironsource.B3
    @Nullable
    public Long b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.c.b(this.a, new C4900tf(identifier, this.b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.B3
    @Nullable
    public Integer c(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Integer.valueOf(this.c.b(this.a, new C4900tf(identifier, this.b + ".show_count_show_counter").a(), -1)));
    }

    @Override // com.ironsource.B3
    public void a(@NotNull String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.a, new C4900tf(identifier, this.b + ".pacing_last_show_time").a(), j);
    }

    @Override // com.ironsource.B3
    public void b(@NotNull String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.a(this.a, new C4900tf(identifier, this.b + ".show_count_threshold").a(), j);
    }

    public /* synthetic */ C4882sf(Context context, String str, K8 k8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new Ne() : k8);
    }

    @Override // com.ironsource.B3
    @Nullable
    public Long a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return a(Long.valueOf(this.c.b(this.a, new C4900tf(identifier, this.b + ".show_count_threshold").a(), -1L)));
    }

    private final Long a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
