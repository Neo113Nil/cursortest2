package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ob, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4807ob<T> {

    /* renamed from: com.ironsource.ob$a */
    public static final class a<T> implements InterfaceC4807ob<T> {

        @NotNull
        private final IronSourceError a;

        public a(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        @NotNull
        public final IronSourceError a() {
            return this.a;
        }

        @NotNull
        public final IronSourceError b() {
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
        public final a<T> a(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* renamed from: com.ironsource.ob$b */
    public static final class b<T> implements InterfaceC4807ob<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }

        public final T b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.a + ")";
        }

        @NotNull
        public final b<T> a(T t) {
            return new b<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.a;
            }
            return bVar.a(obj);
        }
    }
}
