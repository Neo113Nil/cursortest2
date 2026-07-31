package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4570b7 {

    /* renamed from: com.ironsource.b7$a */
    public static final class a implements InterfaceC4570b7 {

        @NotNull
        private final Y6 a;

        public a(@NotNull Y6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.a = failure;
        }

        @NotNull
        public final Y6 a() {
            return this.a;
        }

        @NotNull
        public final Y6 b() {
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
            return "Failure(failure=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull Y6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, Y6 y6, int i, Object obj) {
            if ((i & 1) != 0) {
                y6 = aVar.a;
            }
            return aVar.a(y6);
        }

        @Override // com.ironsource.InterfaceC4570b7
        public void a(@NotNull InterfaceC4588c7 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.a);
        }
    }

    default void a(@NotNull InterfaceC4588c7 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
