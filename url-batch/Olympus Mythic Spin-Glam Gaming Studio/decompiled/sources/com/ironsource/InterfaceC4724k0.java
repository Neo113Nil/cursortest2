package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC4724k0 {

    /* renamed from: com.ironsource.k0$a */
    public static final class a implements InterfaceC4724k0 {

        @NotNull
        public static final C1364a c = new C1364a(null);

        @Nullable
        private final String a;
        private final boolean b;

        /* renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        public static final class C1364a {
            public /* synthetic */ C1364a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(@Nullable String str) {
                return new a(str);
            }

            private C1364a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@Nullable String str) {
            return new a(str);
        }

        @Nullable
        public final String b() {
            return this.a;
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotReady(reason=" + this.a + ")";
        }

        public a(@Nullable String str) {
            this.a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC4724k0
        public boolean a() {
            return this.b;
        }
    }

    /* renamed from: com.ironsource.k0$b */
    public static final class b implements InterfaceC4724k0 {

        @NotNull
        public static final b a = new b();
        private static final boolean b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC4724k0
        public boolean a() {
            return b;
        }
    }

    boolean a();
}
