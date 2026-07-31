package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface Be {

    public static final class a implements Be {

        @NotNull
        private final C4846qe a;

        @Nullable
        private final C4608d9 b;

        public a(@NotNull C4846qe error, @Nullable C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
            this.b = c4608d9;
        }

        @NotNull
        public final C4846qe a() {
            return this.a;
        }

        @Nullable
        public final C4608d9 b() {
            return this.b;
        }

        @NotNull
        public final C4846qe c() {
            return this.a;
        }

        @Nullable
        public final C4608d9 d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C4608d9 c4608d9 = this.b;
            return hashCode + (c4608d9 == null ? 0 : c4608d9.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        @NotNull
        public final a a(@NotNull C4846qe error, @Nullable C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error, c4608d9);
        }

        public static /* synthetic */ a a(a aVar, C4846qe c4846qe, C4608d9 c4608d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4846qe = aVar.a;
            }
            if ((i & 2) != 0) {
                c4608d9 = aVar.b;
            }
            return aVar.a(c4846qe, c4608d9);
        }

        public /* synthetic */ a(C4846qe c4846qe, C4608d9 c4608d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c4846qe, (i & 2) != 0 ? null : c4608d9);
        }
    }

    public static final class b implements Be {

        @NotNull
        private final C4975xe a;

        @Nullable
        private final C4608d9 b;

        public b(@NotNull C4975xe sdkInitResponse, @Nullable C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            this.a = sdkInitResponse;
            this.b = c4608d9;
        }

        @NotNull
        public final C4975xe a() {
            return this.a;
        }

        @Nullable
        public final C4608d9 b() {
            return this.b;
        }

        @Nullable
        public final C4608d9 c() {
            return this.b;
        }

        @NotNull
        public final C4975xe d() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C4608d9 c4608d9 = this.b;
            return hashCode + (c4608d9 == null ? 0 : c4608d9.hashCode());
        }

        @NotNull
        public String toString() {
            return "Success(sdkInitResponse=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        @NotNull
        public final b a(@NotNull C4975xe sdkInitResponse, @Nullable C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse, c4608d9);
        }

        public static /* synthetic */ b a(b bVar, C4975xe c4975xe, C4608d9 c4608d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4975xe = bVar.a;
            }
            if ((i & 2) != 0) {
                c4608d9 = bVar.b;
            }
            return bVar.a(c4975xe, c4608d9);
        }
    }
}
