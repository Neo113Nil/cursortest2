package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class Le implements Ke {

    @NotNull
    private final K8 a;

    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "sessionNumber";

        @NotNull
        public static final String c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Le() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Me
    public void a(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a.a(context, a.b, i);
    }

    @Override // com.ironsource.Me
    public int b(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.a.b(context, a.b, i);
    }

    public Le(@NotNull K8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC4863re
    public long a(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC4863re
    public void b(@NotNull Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a.a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ Le(K8 k8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ne() : k8);
    }
}
