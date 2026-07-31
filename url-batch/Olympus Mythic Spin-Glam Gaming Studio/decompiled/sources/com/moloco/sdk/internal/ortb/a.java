package com.moloco.sdk.internal.ortb;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class a {
    public static final int a = 0;

    @StabilityInferred
    /* renamed from: com.moloco.sdk.internal.ortb.a$a, reason: collision with other inner class name */
    public static final class C1536a extends a {
        public static final int c = 8;

        @NotNull
        public final Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1536a(@NotNull Exception cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.b = cause;
        }

        @NotNull
        public final Exception a() {
            return this.b;
        }

        @NotNull
        public final Exception b() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1536a) && Intrinsics.areEqual(this.b, ((C1536a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "InvalidJson(cause=" + this.b + ')';
        }

        @NotNull
        public final C1536a a(@NotNull Exception cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new C1536a(cause);
        }

        public static /* synthetic */ C1536a a(C1536a c1536a, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = c1536a.b;
            }
            return c1536a.a(exc);
        }
    }

    @StabilityInferred
    public static final class b extends a {
        public static final int c = 8;

        @NotNull
        public final List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull List<String> fields) {
            super(null);
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.b = fields;
        }

        @NotNull
        public final List<String> a() {
            return this.b;
        }

        @NotNull
        public final List<String> b() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.b, ((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "MissingRequiredFields(fields=" + this.b + ')';
        }

        @NotNull
        public final b a(@NotNull List<String> fields) {
            Intrinsics.checkNotNullParameter(fields, "fields");
            return new b(fields);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.b;
            }
            return bVar.a(list);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
