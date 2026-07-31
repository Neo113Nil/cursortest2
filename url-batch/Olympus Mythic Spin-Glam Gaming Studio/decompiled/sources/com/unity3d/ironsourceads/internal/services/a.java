package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C4715j9;
import com.ironsource.EnumC4751l9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public interface a {

    /* renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1705a {

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C1706a extends AbstractC1705a {

            @NotNull
            private final String a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1706a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @NotNull
            public final String a() {
                return this.a;
            }

            @NotNull
            public final String b() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1706a) && Intrinsics.areEqual(this.a, ((C1706a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorMessage=" + this.a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1706a(@NotNull String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.a = errorMessage;
            }

            @NotNull
            public final C1706a a(@NotNull String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new C1706a(errorMessage);
            }

            public /* synthetic */ C1706a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C1706a a(C1706a c1706a, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c1706a.a;
                }
                return c1706a.a(str);
            }
        }

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC1705a {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC1705a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1705a() {
        }
    }

    static /* synthetic */ AbstractC1705a a(a aVar, Context context, EnumC4751l9 enumC4751l9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i & 2) != 0) {
            enumC4751l9 = EnumC4751l9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC4751l9);
    }

    @NotNull
    AbstractC1705a a(@NotNull Context context, @NotNull C4715j9 c4715j9);

    @NotNull
    AbstractC1705a a(@NotNull Context context, @NotNull EnumC4751l9 enumC4751l9);
}
