package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public abstract class Cg {

    public static final class a extends Cg {

        @NotNull
        private final Bg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Bg error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        @NotNull
        public final Bg a() {
            return this.a;
        }

        @NotNull
        public final Bg b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull Bg error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error);
        }

        public static /* synthetic */ a a(a aVar, Bg bg, int i, Object obj) {
            if ((i & 1) != 0) {
                bg = aVar.a;
            }
            return aVar.a(bg);
        }
    }

    public static final class b extends Cg {

        @NotNull
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ Cg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Cg() {
    }
}
