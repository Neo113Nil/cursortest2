package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public enum H3 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second("s", 1000);


    @NotNull
    public static final a c = new a(null);

    @NotNull
    private final String a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final H3 a(@Nullable String str) {
            for (H3 h3 : H3.values()) {
                if (Intrinsics.areEqual(h3.a, str)) {
                    return h3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    H3(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final long a(@Nullable Integer num) {
        return (num != null ? num.intValue() : 1) * this.b;
    }

    public static /* synthetic */ long a(H3 h3, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return h3.a(num);
    }
}
