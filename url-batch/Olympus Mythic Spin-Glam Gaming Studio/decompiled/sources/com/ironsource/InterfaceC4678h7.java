package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.h7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC4678h7 {

    /* renamed from: com.ironsource.h7$a */
    public interface a extends InterfaceC4678h7 {

        /* renamed from: com.ironsource.h7$a$a, reason: collision with other inner class name */
        public static final class C1363a implements a {

            @NotNull
            private final Exception a;

            public C1363a(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.a = exception;
            }

            @NotNull
            public final C1363a a(@NotNull Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new C1363a(exception);
            }

            @Override // com.ironsource.InterfaceC4678h7.a
            public boolean b() {
                return true;
            }

            @NotNull
            public final Exception c() {
                return this.a;
            }

            @NotNull
            public final Exception d() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1363a) && Intrinsics.areEqual(this.a, ((C1363a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public String toString() {
                return "Exception(exception=" + this.a + ")";
            }

            public static /* synthetic */ C1363a a(C1363a c1363a, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = c1363a.a;
                }
                return c1363a.a(exc);
            }

            @Override // com.ironsource.InterfaceC4678h7.a
            @NotNull
            public String a() {
                String message = this.a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* renamed from: com.ironsource.h7$a$b */
        public static final class b implements a {
            private final int a;

            @Nullable
            private final String b;

            public b(int i, @Nullable String str) {
                this.a = i;
                this.b = str;
            }

            @NotNull
            public final b a(int i, @Nullable String str) {
                return new b(i, str);
            }

            @Override // com.ironsource.InterfaceC4678h7.a
            public boolean b() {
                return this.a != 400;
            }

            public final int c() {
                return this.a;
            }

            @Nullable
            public final String d() {
                return this.b;
            }

            public final int e() {
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
                return this.a == bVar.a && Intrinsics.areEqual(this.b, bVar.b);
            }

            @Nullable
            public final String f() {
                return this.b;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "HttpError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
            }

            public static /* synthetic */ b a(b bVar, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.a;
                }
                if ((i2 & 2) != 0) {
                    str = bVar.b;
                }
                return bVar.a(i, str);
            }

            @Override // com.ironsource.InterfaceC4678h7.a
            @NotNull
            public String a() {
                int i = this.a;
                String str = this.b;
                if (str == null) {
                    str = "Unknown";
                }
                return "HTTP Error - Code: " + i + ", Message: " + str;
            }
        }

        /* renamed from: com.ironsource.h7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC4678h7.a
            @NotNull
            public String a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC4678h7.a
            public boolean b() {
                return true;
            }
        }

        @NotNull
        String a();

        boolean b();
    }

    /* renamed from: com.ironsource.h7$b */
    public static final class b implements InterfaceC4678h7 {

        @NotNull
        private final String a;

        public b(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.a = response;
        }

        @NotNull
        public final b a(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new b(response);
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        @NotNull
        public final String d() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(response=" + this.a + ")";
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }
    }
}
