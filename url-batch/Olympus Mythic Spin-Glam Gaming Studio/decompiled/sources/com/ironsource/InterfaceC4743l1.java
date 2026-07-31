package com.ironsource;

import com.ironsource.C4797o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.l1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC4743l1 {

    /* renamed from: com.ironsource.l1$a */
    public static final class a {

        @NotNull
        public static final C1365a a = new C1365a(null);

        /* renamed from: com.ironsource.l1$a$a, reason: collision with other inner class name */
        public static final class C1365a {
            public /* synthetic */ C1365a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull C4797o1.j errorCode, @NotNull C4797o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(403, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @NotNull
            public final InterfaceC4743l1 b(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(404, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4743l1 c(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(409, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4743l1 d(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(401, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4743l1 e(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(408, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4743l1 f(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(405, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            private C1365a() {
            }

            @NotNull
            public final InterfaceC4743l1 a() {
                return new b(406, new ArrayList());
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(407, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4743l1 a(boolean z) {
                if (z) {
                    return new b(410, new ArrayList());
                }
                return new b(411, new ArrayList());
            }
        }

        /* renamed from: com.ironsource.l1$a$b */
        public static final class b {

            @NotNull
            public static final b a = new b();
            public static final int b = 401;
            public static final int c = 403;
            public static final int d = 404;
            public static final int e = 405;
            public static final int f = 406;
            public static final int g = 407;
            public static final int h = 408;
            public static final int i = 409;
            public static final int j = 410;
            public static final int k = 411;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4743l1 a() {
            return a.a();
        }

        @NotNull
        public static final InterfaceC4743l1 b(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.b(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 c(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.c(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 d(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.d(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 e(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.e(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 f(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.f(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.a(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 a(boolean z) {
            return a.a(z);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull C4797o1.j jVar, @NotNull C4797o1.k kVar) {
            return a.a(jVar, kVar);
        }
    }

    /* renamed from: com.ironsource.l1$b */
    public static final class b implements InterfaceC4743l1 {
        private final int a;

        @NotNull
        private final List<InterfaceC4815p1> b;

        public b(int i, @NotNull List<InterfaceC4815p1> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.a = i;
            this.b = arrayList;
        }

        @Override // com.ironsource.InterfaceC4743l1
        public void a(@NotNull InterfaceC4868s1 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.a(this.a, this.b);
        }
    }

    /* renamed from: com.ironsource.l1$c */
    public static final class c {

        @NotNull
        public static final a a = new a(null);

        /* renamed from: com.ironsource.l1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4743l1 a() {
                return new b(201, new ArrayList());
            }

            @NotNull
            public final InterfaceC4743l1 b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull C4797o1.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(207, CollectionsKt.mutableListOf(ext1));
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull InterfaceC4815p1 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(202, CollectionsKt.mutableListOf(duration));
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull C4797o1.j errorCode, @NotNull C4797o1.k errorReason, @NotNull C4797o1.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(203, CollectionsKt.mutableListOf(errorCode, errorReason, duration));
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(204, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* renamed from: com.ironsource.l1$c$b */
        public static final class b {

            @NotNull
            public static final b a = new b();
            public static final int b = 201;
            public static final int c = 202;
            public static final int d = 203;
            public static final int e = 204;
            public static final int f = 205;
            public static final int g = 206;
            public static final int h = 207;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.a(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 b() {
            return a.b();
        }

        @NotNull
        public static final InterfaceC4743l1 a() {
            return a.a();
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull C4797o1.j jVar, @NotNull C4797o1.k kVar, @NotNull C4797o1.f fVar) {
            return a.a(jVar, kVar, fVar);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull InterfaceC4815p1 interfaceC4815p1) {
            return a.a(interfaceC4815p1);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull C4797o1.l lVar) {
            return a.a(lVar);
        }
    }

    /* renamed from: com.ironsource.l1$d */
    public static final class d {

        @NotNull
        public static final a a = new a(null);

        /* renamed from: com.ironsource.l1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4743l1 a() {
                return new b(101, new ArrayList());
            }

            @NotNull
            public final InterfaceC4743l1 b(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(110, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull InterfaceC4815p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @NotNull
            public final InterfaceC4743l1 b() {
                return new b(112, new ArrayList());
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull C4797o1.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(103, CollectionsKt.mutableListOf(duration));
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull C4797o1.j errorCode, @NotNull C4797o1.k errorReason, @NotNull C4797o1.f duration, @NotNull C4797o1.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, CollectionsKt.mutableListOf(errorCode, errorReason, duration, loaderState));
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull C4797o1.j errorCode, @NotNull C4797o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(109, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull InterfaceC4815p1 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(111, CollectionsKt.mutableListOf(ext1));
            }

            @NotNull
            public final InterfaceC4743l1 a(@NotNull C4797o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(113, CollectionsKt.mutableListOf(errorReason));
            }
        }

        /* renamed from: com.ironsource.l1$d$b */
        public static final class b {

            @NotNull
            public static final b a = new b();
            public static final int b = 101;
            public static final int c = 102;
            public static final int d = 103;
            public static final int e = 104;
            public static final int f = 105;
            public static final int g = 109;
            public static final int h = 110;
            public static final int i = 111;
            public static final int j = 112;
            public static final int k = 113;

            private b() {
            }
        }

        @NotNull
        public static final InterfaceC4743l1 a() {
            return a.a();
        }

        @NotNull
        public static final InterfaceC4743l1 b() {
            return a.b();
        }

        @NotNull
        public static final b c() {
            return a.c();
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.a(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 b(@NotNull InterfaceC4815p1... interfaceC4815p1Arr) {
            return a.b(interfaceC4815p1Arr);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull C4797o1.j jVar, @NotNull C4797o1.k kVar) {
            return a.a(jVar, kVar);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull C4797o1.j jVar, @NotNull C4797o1.k kVar, @NotNull C4797o1.f fVar, @NotNull C4797o1.l lVar) {
            return a.a(jVar, kVar, fVar, lVar);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull InterfaceC4815p1 interfaceC4815p1) {
            return a.a(interfaceC4815p1);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull C4797o1.f fVar) {
            return a.a(fVar);
        }

        @NotNull
        public static final InterfaceC4743l1 a(@NotNull C4797o1.k kVar) {
            return a.a(kVar);
        }
    }

    void a(@NotNull InterfaceC4868s1 interfaceC4868s1);
}
