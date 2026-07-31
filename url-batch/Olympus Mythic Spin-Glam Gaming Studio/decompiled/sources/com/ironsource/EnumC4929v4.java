package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC4929v4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    @NotNull
    public static final a b = new a(null);

    @NotNull
    private final String a;

    /* renamed from: com.ironsource.v4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4929v4 a(@Nullable String str) {
            EnumC4929v4 enumC4929v4;
            EnumC4929v4[] values = EnumC4929v4.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC4929v4 = null;
                    break;
                }
                enumC4929v4 = values[i];
                if (Intrinsics.areEqual(enumC4929v4.b(), str)) {
                    break;
                }
                i++;
            }
            return enumC4929v4 == null ? EnumC4929v4.NONE : enumC4929v4;
        }

        private a() {
        }
    }

    EnumC4929v4(String str) {
        this.a = str;
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    @NotNull
    public static final EnumC4929v4 a(@Nullable String str) {
        return b.a(str);
    }
}
