package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class P3 {

    @Nullable
    private final c a;

    @Nullable
    private final a b;

    @Nullable
    private final d c;

    @Nullable
    private final b d;

    public static final class a {

        @Nullable
        private final g a;

        @Nullable
        private final c b;

        @Nullable
        private final b c;

        @Nullable
        private final d d;

        /* renamed from: com.ironsource.P3$a$a, reason: collision with other inner class name */
        public interface InterfaceC0349a {
            @Nullable
            List<e> a();
        }

        public static final class b implements InterfaceC0349a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final Integer b;

            @Nullable
            private final Long c;

            @Nullable
            private final c.C0352c d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final Long g;

            @Nullable
            private final Boolean h;

            @Nullable
            private final JSONObject i;

            @Nullable
            private final Boolean j;

            @Nullable
            private final Integer k;

            @Nullable
            private final Integer l;

            @Nullable
            private final Integer m;

            @Nullable
            private final f n;

            public b() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            @Nullable
            public final Boolean A() {
                return this.h;
            }

            @Nullable
            public final Boolean B() {
                return this.j;
            }

            @NotNull
            public final b a(@Nullable List<e> list, @Nullable Integer num, @Nullable Long l, @Nullable c.C0352c c0352c, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Long l2, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Boolean bool3, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable f fVar) {
                return new b(list, num, l, c0352c, num2, bool, l2, bool2, jSONObject, bool3, num3, num4, num5, fVar);
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final Boolean c() {
                return this.j;
            }

            @Nullable
            public final Integer d() {
                return this.k;
            }

            @Nullable
            public final Integer e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f) && Intrinsics.areEqual(this.g, bVar.g) && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.i, bVar.i) && Intrinsics.areEqual(this.j, bVar.j) && Intrinsics.areEqual(this.k, bVar.k) && Intrinsics.areEqual(this.l, bVar.l) && Intrinsics.areEqual(this.m, bVar.m) && Intrinsics.areEqual(this.n, bVar.n);
            }

            @Nullable
            public final Integer f() {
                return this.m;
            }

            @Nullable
            public final f g() {
                return this.n;
            }

            @Nullable
            public final Integer h() {
                return this.b;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                c.C0352c c0352c = this.d;
                int hashCode4 = (hashCode3 + (c0352c == null ? 0 : c0352c.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l2 = this.g;
                int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.k;
                int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.l;
                int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.m;
                int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
                f fVar = this.n;
                return hashCode13 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final Long i() {
                return this.c;
            }

            @Nullable
            public final c.C0352c j() {
                return this.d;
            }

            @Nullable
            public final Integer k() {
                return this.e;
            }

            @Nullable
            public final Boolean l() {
                return this.f;
            }

            @Nullable
            public final Long m() {
                return this.g;
            }

            @Nullable
            public final Boolean n() {
                return this.h;
            }

            @Nullable
            public final JSONObject o() {
                return this.i;
            }

            @Nullable
            public final JSONObject p() {
                return this.i;
            }

            @Nullable
            public final Integer q() {
                return this.m;
            }

            @Nullable
            public final Integer r() {
                return this.l;
            }

            @Nullable
            public final Long s() {
                return this.c;
            }

            @Nullable
            public final Integer t() {
                return this.e;
            }

            @NotNull
            public String toString() {
                return "Banner(placements=" + this.a + ", maxNumOfAdaptersToLoadOnStart=" + this.b + ", atim=" + this.c + ", events=" + this.d + ", bannerInterval=" + this.e + ", collectBiddingDataAsyncEnabled=" + this.f + ", collectBiddingDataTimeout=" + this.g + ", sharedManagersThread=" + this.h + ", adUnits=" + this.i + ", isOneFlow=" + this.j + ", delayLoadFailure=" + this.k + ", advancedLoading=" + this.l + ", adapterTimeOutInSeconds=" + this.m + ", providers=" + this.n + ")";
            }

            @Nullable
            public final Boolean u() {
                return this.f;
            }

            @Nullable
            public final Long v() {
                return this.g;
            }

            @Nullable
            public final Integer w() {
                return this.k;
            }

            @Nullable
            public final c.C0352c x() {
                return this.d;
            }

            @Nullable
            public final Integer y() {
                return this.b;
            }

            @Nullable
            public final f z() {
                return this.n;
            }

            public b(@Nullable List<e> list, @Nullable Integer num, @Nullable Long l, @Nullable c.C0352c c0352c, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Long l2, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Boolean bool3, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable f fVar) {
                this.a = list;
                this.b = num;
                this.c = l;
                this.d = c0352c;
                this.e = num2;
                this.f = bool;
                this.g = l2;
                this.h = bool2;
                this.i = jSONObject;
                this.j = bool3;
                this.k = num3;
                this.l = num4;
                this.m = num5;
                this.n = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0349a
            @Nullable
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ b(List list, Integer num, Long l, c.C0352c c0352c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : c0352c, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : num5, (i & 8192) == 0 ? fVar : null);
            }
        }

        public static final class c implements InterfaceC0349a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final c.C0352c b;

            @Nullable
            private final Integer c;

            @Nullable
            private final Integer d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final Long g;

            @Nullable
            private final Boolean h;

            @Nullable
            private final JSONObject i;

            @Nullable
            private final Integer j;

            @Nullable
            private final Integer k;

            @Nullable
            private final Boolean l;

            @Nullable
            private final Integer m;

            @Nullable
            private final Integer n;

            @Nullable
            private final f o;

            public c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            @Nullable
            public final Integer A() {
                return this.m;
            }

            @Nullable
            public final f B() {
                return this.o;
            }

            @Nullable
            public final Boolean C() {
                return this.h;
            }

            @Nullable
            public final Boolean D() {
                return this.l;
            }

            @NotNull
            public final c a(@Nullable List<e> list, @Nullable c.C0352c c0352c, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool3, @Nullable Integer num6, @Nullable Integer num7, @Nullable f fVar) {
                return new c(list, c0352c, num, num2, num3, bool, l, bool2, jSONObject, num4, num5, bool3, num6, num7, fVar);
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final Integer c() {
                return this.j;
            }

            @Nullable
            public final Integer d() {
                return this.k;
            }

            @Nullable
            public final Boolean e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d) && Intrinsics.areEqual(this.e, cVar.e) && Intrinsics.areEqual(this.f, cVar.f) && Intrinsics.areEqual(this.g, cVar.g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.i, cVar.i) && Intrinsics.areEqual(this.j, cVar.j) && Intrinsics.areEqual(this.k, cVar.k) && Intrinsics.areEqual(this.l, cVar.l) && Intrinsics.areEqual(this.m, cVar.m) && Intrinsics.areEqual(this.n, cVar.n) && Intrinsics.areEqual(this.o, cVar.o);
            }

            @Nullable
            public final Integer f() {
                return this.m;
            }

            @Nullable
            public final Integer g() {
                return this.n;
            }

            @Nullable
            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0352c c0352c = this.b;
                int hashCode2 = (hashCode + (c0352c == null ? 0 : c0352c.hashCode())) * 31;
                Integer num = this.c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.d;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.e;
                int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.g;
                int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.i;
                int hashCode9 = (hashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.k;
                int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num6 = this.m;
                int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.n;
                int hashCode14 = (hashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final c.C0352c i() {
                return this.b;
            }

            @Nullable
            public final Integer j() {
                return this.c;
            }

            @Nullable
            public final Integer k() {
                return this.d;
            }

            @Nullable
            public final Integer l() {
                return this.e;
            }

            @Nullable
            public final Boolean m() {
                return this.f;
            }

            @Nullable
            public final Long n() {
                return this.g;
            }

            @Nullable
            public final Boolean o() {
                return this.h;
            }

            @Nullable
            public final JSONObject p() {
                return this.i;
            }

            @Nullable
            public final JSONObject q() {
                return this.i;
            }

            @Nullable
            public final Integer r() {
                return this.d;
            }

            @Nullable
            public final Integer s() {
                return this.k;
            }

            @Nullable
            public final Integer t() {
                return this.n;
            }

            @NotNull
            public String toString() {
                return "Interstitial(placements=" + this.a + ", events=" + this.b + ", maxNumOfAdaptersToLoadOnStart=" + this.c + ", adapterTimeOutInSeconds=" + this.d + ", delayLoadFailure=" + this.e + ", collectBiddingDataAsyncEnabled=" + this.f + ", collectBiddingDataTimeout=" + this.g + ", sharedManagersThread=" + this.h + ", adUnits=" + this.i + ", expiredDurationInMinutes=" + this.j + ", advancedLoading=" + this.k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.m + ", atim=" + this.n + ", providers=" + this.o + ")";
            }

            @Nullable
            public final Boolean u() {
                return this.f;
            }

            @Nullable
            public final Long v() {
                return this.g;
            }

            @Nullable
            public final Integer w() {
                return this.e;
            }

            @Nullable
            public final c.C0352c x() {
                return this.b;
            }

            @Nullable
            public final Integer y() {
                return this.j;
            }

            @Nullable
            public final Integer z() {
                return this.c;
            }

            public c(@Nullable List<e> list, @Nullable c.C0352c c0352c, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool3, @Nullable Integer num6, @Nullable Integer num7, @Nullable f fVar) {
                this.a = list;
                this.b = c0352c;
                this.c = num;
                this.d = num2;
                this.e = num3;
                this.f = bool;
                this.g = l;
                this.h = bool2;
                this.i = jSONObject;
                this.j = num4;
                this.k = num5;
                this.l = bool3;
                this.m = num6;
                this.n = num7;
                this.o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0349a
            @Nullable
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ c(List list, c.C0352c c0352c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0352c, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) == 0 ? fVar : null);
            }
        }

        public static final class d implements InterfaceC0349a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final c.C0352c b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final Long d;

            @Nullable
            private final Boolean e;

            @Nullable
            private final JSONObject f;

            @Nullable
            private final Integer g;

            @Nullable
            private final Integer h;

            @Nullable
            private final Integer i;

            @Nullable
            private final Integer j;

            @Nullable
            private final Long k;

            @Nullable
            private final f l;

            public d() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            @NotNull
            public final d a(@Nullable List<e> list, @Nullable c.C0352c c0352c, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l2, @Nullable f fVar) {
                return new d(list, c0352c, bool, l, bool2, jSONObject, num, num2, num3, num4, l2, fVar);
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final Integer c() {
                return this.j;
            }

            @Nullable
            public final Long d() {
                return this.k;
            }

            @Nullable
            public final f e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c) && Intrinsics.areEqual(this.d, dVar.d) && Intrinsics.areEqual(this.e, dVar.e) && Intrinsics.areEqual(this.f, dVar.f) && Intrinsics.areEqual(this.g, dVar.g) && Intrinsics.areEqual(this.h, dVar.h) && Intrinsics.areEqual(this.i, dVar.i) && Intrinsics.areEqual(this.j, dVar.j) && Intrinsics.areEqual(this.k, dVar.k) && Intrinsics.areEqual(this.l, dVar.l);
            }

            @Nullable
            public final c.C0352c f() {
                return this.b;
            }

            @Nullable
            public final Boolean g() {
                return this.c;
            }

            @Nullable
            public final Long h() {
                return this.d;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C0352c c0352c = this.b;
                int hashCode2 = (hashCode + (c0352c == null ? 0 : c0352c.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.d;
                int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.e;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f;
                int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num = this.g;
                int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.h;
                int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.j;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Long l2 = this.k;
                int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
                f fVar = this.l;
                return hashCode11 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final Boolean i() {
                return this.e;
            }

            @Nullable
            public final JSONObject j() {
                return this.f;
            }

            @Nullable
            public final Integer k() {
                return this.g;
            }

            @Nullable
            public final Integer l() {
                return this.h;
            }

            @Nullable
            public final Integer m() {
                return this.i;
            }

            @Nullable
            public final JSONObject n() {
                return this.f;
            }

            @Nullable
            public final Integer o() {
                return this.j;
            }

            @Nullable
            public final Integer p() {
                return this.g;
            }

            @Nullable
            public final Long q() {
                return this.k;
            }

            @Nullable
            public final Boolean r() {
                return this.c;
            }

            @Nullable
            public final Long s() {
                return this.d;
            }

            @Nullable
            public final Integer t() {
                return this.h;
            }

            @NotNull
            public String toString() {
                return "NativeAd(placements=" + this.a + ", events=" + this.b + ", collectBiddingDataAsyncEnabled=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", sharedManagersThread=" + this.e + ", adUnits=" + this.f + ", advancedLoading=" + this.g + ", delayLoadFailure=" + this.h + ", maxNumOfAdaptersToLoadOnStart=" + this.i + ", adapterTimeOutInSeconds=" + this.j + ", atim=" + this.k + ", providers=" + this.l + ")";
            }

            @Nullable
            public final c.C0352c u() {
                return this.b;
            }

            @Nullable
            public final Integer v() {
                return this.i;
            }

            @Nullable
            public final f w() {
                return this.l;
            }

            @Nullable
            public final Boolean x() {
                return this.e;
            }

            public d(@Nullable List<e> list, @Nullable c.C0352c c0352c, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Long l2, @Nullable f fVar) {
                this.a = list;
                this.b = c0352c;
                this.c = bool;
                this.d = l;
                this.e = bool2;
                this.f = jSONObject;
                this.g = num;
                this.h = num2;
                this.i = num3;
                this.j = num4;
                this.k = l2;
                this.l = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0349a
            @Nullable
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ d(List list, c.C0352c c0352c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c0352c, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : jSONObject, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : l2, (i & 2048) == 0 ? fVar : null);
            }
        }

        public static final class e {

            @Nullable
            private final Integer a;

            @Nullable
            private final String b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final String d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final C0350a g;

            @Nullable
            private final b h;

            /* renamed from: com.ironsource.P3$a$e$a, reason: collision with other inner class name */
            public static final class C0350a {

                @Nullable
                private final Boolean a;

                @Nullable
                private final String b;

                @Nullable
                private final Integer c;

                public C0350a() {
                    this(null, null, null, 7, null);
                }

                @Nullable
                public final Boolean a() {
                    return this.a;
                }

                @Nullable
                public final String b() {
                    return this.b;
                }

                @Nullable
                public final Integer c() {
                    return this.c;
                }

                @Nullable
                public final Boolean d() {
                    return this.a;
                }

                @Nullable
                public final Integer e() {
                    return this.c;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0350a)) {
                        return false;
                    }
                    C0350a c0350a = (C0350a) obj;
                    return Intrinsics.areEqual(this.a, c0350a.a) && Intrinsics.areEqual(this.b, c0350a.b) && Intrinsics.areEqual(this.c, c0350a.c);
                }

                @Nullable
                public final String f() {
                    return this.b;
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.c;
                    return hashCode2 + (num != null ? num.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Capping(enabled=" + this.a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
                }

                public C0350a(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
                    this.a = bool;
                    this.b = str;
                    this.c = num;
                }

                @NotNull
                public final C0350a a(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
                    return new C0350a(bool, str, num);
                }

                public static /* synthetic */ C0350a a(C0350a c0350a, Boolean bool, String str, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c0350a.a;
                    }
                    if ((i & 2) != 0) {
                        str = c0350a.b;
                    }
                    if ((i & 4) != 0) {
                        num = c0350a.c;
                    }
                    return c0350a.a(bool, str, num);
                }

                public /* synthetic */ C0350a(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
                }
            }

            public static final class b {

                @Nullable
                private final Boolean a;

                @Nullable
                private final Integer b;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Nullable
                public final Boolean a() {
                    return this.a;
                }

                @Nullable
                public final Integer b() {
                    return this.b;
                }

                @Nullable
                public final Boolean c() {
                    return this.a;
                }

                @Nullable
                public final Integer d() {
                    return this.b;
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
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    return hashCode + (num != null ? num.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Pacing(enabled=" + this.a + ", numOfSeconds=" + this.b + ")";
                }

                public b(@Nullable Boolean bool, @Nullable Integer num) {
                    this.a = bool;
                    this.b = num;
                }

                @NotNull
                public final b a(@Nullable Boolean bool, @Nullable Integer num) {
                    return new b(bool, num);
                }

                public /* synthetic */ b(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
                }

                public static /* synthetic */ b a(b bVar, Boolean bool, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = bVar.a;
                    }
                    if ((i & 2) != 0) {
                        num = bVar.b;
                    }
                    return bVar.a(bool, num);
                }
            }

            public e() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @Nullable
            public final Integer a() {
                return this.a;
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.c;
            }

            @Nullable
            public final String d() {
                return this.d;
            }

            @Nullable
            public final Integer e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b) && Intrinsics.areEqual(this.c, eVar.c) && Intrinsics.areEqual(this.d, eVar.d) && Intrinsics.areEqual(this.e, eVar.e) && Intrinsics.areEqual(this.f, eVar.f) && Intrinsics.areEqual(this.g, eVar.g) && Intrinsics.areEqual(this.h, eVar.h);
            }

            @Nullable
            public final Boolean f() {
                return this.f;
            }

            @Nullable
            public final C0350a g() {
                return this.g;
            }

            @Nullable
            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.e;
                int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool2 = this.f;
                int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0350a c0350a = this.g;
                int hashCode7 = (hashCode6 + (c0350a == null ? 0 : c0350a.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            @Nullable
            public final C0350a i() {
                return this.g;
            }

            @Nullable
            public final Boolean j() {
                return this.f;
            }

            @Nullable
            public final b k() {
                return this.h;
            }

            @Nullable
            public final Integer l() {
                return this.a;
            }

            @Nullable
            public final String m() {
                return this.b;
            }

            @Nullable
            public final Integer n() {
                return this.e;
            }

            @Nullable
            public final String o() {
                return this.d;
            }

            @Nullable
            public final Boolean p() {
                return this.c;
            }

            @NotNull
            public String toString() {
                return "Placement(placementId=" + this.a + ", placementName=" + this.b + ", isDefault=" + this.c + ", virtualItemName=" + this.d + ", virtualItemCount=" + this.e + ", delivery=" + this.f + ", capping=" + this.g + ", pacing=" + this.h + ")";
            }

            public e(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C0350a c0350a, @Nullable b bVar) {
                this.a = num;
                this.b = str;
                this.c = bool;
                this.d = str2;
                this.e = num2;
                this.f = bool2;
                this.g = c0350a;
                this.h = bVar;
            }

            @NotNull
            public final e a(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable C0350a c0350a, @Nullable b bVar) {
                return new e(num, str, bool, str2, num2, bool2, c0350a, bVar);
            }

            public /* synthetic */ e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C0350a c0350a, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c0350a, (i & 128) == 0 ? bVar : null);
            }
        }

        public static final class f {

            @Nullable
            private final Boolean a;

            @Nullable
            private final Boolean b;

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }

            @Nullable
            public final Boolean b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.a;
            }

            @Nullable
            public final Boolean d() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b);
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                return hashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Providers(parallelInit=" + this.a + ", waitUntilAllProvidersFinishInit=" + this.b + ")";
            }

            public f(@Nullable Boolean bool, @Nullable Boolean bool2) {
                this.a = bool;
                this.b = bool2;
            }

            @NotNull
            public final f a(@Nullable Boolean bool, @Nullable Boolean bool2) {
                return new f(bool, bool2);
            }

            public static /* synthetic */ f a(f fVar, Boolean bool, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = fVar.a;
                }
                if ((i & 2) != 0) {
                    bool2 = fVar.b;
                }
                return fVar.a(bool, bool2);
            }

            public /* synthetic */ f(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
            }
        }

        public static final class g implements InterfaceC0349a {

            @Nullable
            private final List<e> a;

            @Nullable
            private final Integer b;

            @Nullable
            private final Integer c;

            @Nullable
            private final Integer d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Integer f;

            @Nullable
            private final Boolean g;

            @Nullable
            private final Long h;

            @Nullable
            private final Boolean i;

            @Nullable
            private final JSONObject j;

            @Nullable
            private final Integer k;

            @Nullable
            private final Boolean l;

            @Nullable
            private final Integer m;

            @Nullable
            private final Integer n;

            @Nullable
            private final f o;

            public g() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            @Nullable
            public final Integer A() {
                return this.m;
            }

            @Nullable
            public final f B() {
                return this.o;
            }

            @Nullable
            public final Boolean C() {
                return this.i;
            }

            @Nullable
            public final Boolean D() {
                return this.l;
            }

            @NotNull
            public final g a(@Nullable List<e> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num6, @Nullable Boolean bool3, @Nullable Integer num7, @Nullable Integer num8, @Nullable f fVar) {
                return new g(list, num, num2, num3, num4, num5, bool, l, bool2, jSONObject, num6, bool3, num7, num8, fVar);
            }

            @Nullable
            public final List<e> b() {
                return this.a;
            }

            @Nullable
            public final JSONObject c() {
                return this.j;
            }

            @Nullable
            public final Integer d() {
                return this.k;
            }

            @Nullable
            public final Boolean e() {
                return this.l;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.areEqual(this.a, gVar.a) && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.c, gVar.c) && Intrinsics.areEqual(this.d, gVar.d) && Intrinsics.areEqual(this.e, gVar.e) && Intrinsics.areEqual(this.f, gVar.f) && Intrinsics.areEqual(this.g, gVar.g) && Intrinsics.areEqual(this.h, gVar.h) && Intrinsics.areEqual(this.i, gVar.i) && Intrinsics.areEqual(this.j, gVar.j) && Intrinsics.areEqual(this.k, gVar.k) && Intrinsics.areEqual(this.l, gVar.l) && Intrinsics.areEqual(this.m, gVar.m) && Intrinsics.areEqual(this.n, gVar.n) && Intrinsics.areEqual(this.o, gVar.o);
            }

            @Nullable
            public final Integer f() {
                return this.m;
            }

            @Nullable
            public final Integer g() {
                return this.n;
            }

            @Nullable
            public final f h() {
                return this.o;
            }

            public int hashCode() {
                List<e> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.c;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.d;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.e;
                int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f;
                int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.h;
                int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.i;
                int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.j;
                int hashCode10 = (hashCode9 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num6 = this.k;
                int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Boolean bool3 = this.l;
                int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num7 = this.m;
                int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                Integer num8 = this.n;
                int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
                f fVar = this.o;
                return hashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            @Nullable
            public final Integer i() {
                return this.b;
            }

            @Nullable
            public final Integer j() {
                return this.c;
            }

            @Nullable
            public final Integer k() {
                return this.d;
            }

            @Nullable
            public final Integer l() {
                return this.e;
            }

            @Nullable
            public final Integer m() {
                return this.f;
            }

            @Nullable
            public final Boolean n() {
                return this.g;
            }

            @Nullable
            public final Long o() {
                return this.h;
            }

            @Nullable
            public final Boolean p() {
                return this.i;
            }

            @Nullable
            public final JSONObject q() {
                return this.j;
            }

            @Nullable
            public final Integer r() {
                return this.c;
            }

            @Nullable
            public final Integer s() {
                return this.e;
            }

            @Nullable
            public final Integer t() {
                return this.n;
            }

            @NotNull
            public String toString() {
                return "Rewarded(placements=" + this.a + ", maxNumOfAdaptersToLoadOnStart=" + this.b + ", adapterTimeOutInSeconds=" + this.c + ", loadRVInterval=" + this.d + ", advancedLoading=" + this.e + ", expiredDurationInMinutes=" + this.f + ", collectBiddingDataAsyncEnabled=" + this.g + ", collectBiddingDataTimeout=" + this.h + ", sharedManagersThread=" + this.i + ", adUnits=" + this.j + ", delayLoadFailure=" + this.k + ", isOneFlow=" + this.l + ", parallelLoad=" + this.m + ", atim=" + this.n + ", providers=" + this.o + ")";
            }

            @Nullable
            public final Boolean u() {
                return this.g;
            }

            @Nullable
            public final Long v() {
                return this.h;
            }

            @Nullable
            public final Integer w() {
                return this.k;
            }

            @Nullable
            public final Integer x() {
                return this.f;
            }

            @Nullable
            public final Integer y() {
                return this.d;
            }

            @Nullable
            public final Integer z() {
                return this.b;
            }

            public g(@Nullable List<e> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable Long l, @Nullable Boolean bool2, @Nullable JSONObject jSONObject, @Nullable Integer num6, @Nullable Boolean bool3, @Nullable Integer num7, @Nullable Integer num8, @Nullable f fVar) {
                this.a = list;
                this.b = num;
                this.c = num2;
                this.d = num3;
                this.e = num4;
                this.f = num5;
                this.g = bool;
                this.h = l;
                this.i = bool2;
                this.j = jSONObject;
                this.k = num6;
                this.l = bool3;
                this.m = num7;
                this.n = num8;
                this.o = fVar;
            }

            @Override // com.ironsource.P3.a.InterfaceC0349a
            @Nullable
            public List<e> a() {
                return this.a;
            }

            public /* synthetic */ g(List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : jSONObject, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num7, (i & 8192) != 0 ? null : num8, (i & 16384) == 0 ? fVar : null);
            }
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        @Nullable
        public final g a() {
            return this.a;
        }

        @Nullable
        public final c b() {
            return this.b;
        }

        @Nullable
        public final b c() {
            return this.c;
        }

        @Nullable
        public final d d() {
            return this.d;
        }

        @Nullable
        public final b e() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d);
        }

        @Nullable
        public final c f() {
            return this.b;
        }

        @Nullable
        public final d g() {
            return this.d;
        }

        @Nullable
        public final g h() {
            return this.a;
        }

        public int hashCode() {
            g gVar = this.a;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.c;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            d dVar = this.d;
            return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdFormats(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(@Nullable g gVar, @Nullable c cVar, @Nullable b bVar, @Nullable d dVar) {
            this.a = gVar;
            this.b = cVar;
            this.c = bVar;
            this.d = dVar;
        }

        @NotNull
        public final a a(@Nullable g gVar, @Nullable c cVar, @Nullable b bVar, @Nullable d dVar) {
            return new a(gVar, cVar, bVar, dVar);
        }

        public static /* synthetic */ a a(a aVar, g gVar, c cVar, b bVar, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gVar = aVar.a;
            }
            if ((i & 2) != 0) {
                cVar = aVar.b;
            }
            if ((i & 4) != 0) {
                bVar = aVar.c;
            }
            if ((i & 8) != 0) {
                dVar = aVar.d;
            }
            return aVar.a(gVar, cVar, bVar, dVar);
        }

        public /* synthetic */ a(g gVar, c cVar, b bVar, d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gVar, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : dVar);
        }
    }

    public static final class b {

        @Nullable
        private final Integer a;

        @Nullable
        private final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Nullable
        public final Integer a() {
            return this.a;
        }

        @Nullable
        public final String b() {
            return this.b;
        }

        @Nullable
        public final String c() {
            return this.b;
        }

        @Nullable
        public final Integer d() {
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
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdQuality(initMode=" + this.a + ", adqInitBlob=" + this.b + ")";
        }

        public b(@Nullable Integer num, @Nullable String str) {
            this.a = num;
            this.b = str;
        }

        @NotNull
        public final b a(@Nullable Integer num, @Nullable String str) {
            return new b(num, str);
        }

        public /* synthetic */ b(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ b a(b bVar, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            return bVar.a(num, str);
        }
    }

    public static final class c {

        @Nullable
        private final e a;

        @Nullable
        private final C0352c b;

        @Nullable
        private final h c;

        @Nullable
        private final f d;

        @Nullable
        private final a e;

        @Nullable
        private final b f;

        @Nullable
        private final g g;

        @Nullable
        private final d h;

        @Nullable
        private final Boolean i;

        @Nullable
        private final Boolean j;

        public static final class a {

            @Nullable
            private final String a;

            @Nullable
            private final String b;

            @Nullable
            private final String c;

            @Nullable
            private final Integer d;

            @Nullable
            private final Long e;

            @Nullable
            private final Integer f;

            @Nullable
            private final Boolean g;

            @Nullable
            private final Boolean h;

            @Nullable
            private final Integer i;

            @Nullable
            private final Boolean j;

            @Nullable
            private final C0351a k;

            @Nullable
            private final C0351a l;

            @Nullable
            private final C0351a m;

            @Nullable
            private final C0351a n;

            /* renamed from: com.ironsource.P3$c$a$a, reason: collision with other inner class name */
            public static final class C0351a {

                @Nullable
                private final Boolean a;

                @Nullable
                private final Integer b;

                @Nullable
                private final Boolean c;

                @Nullable
                private final Integer d;

                @Nullable
                private final Integer e;

                @Nullable
                private final Boolean f;

                @Nullable
                private final Boolean g;

                @Nullable
                private final Integer h;

                @Nullable
                private final Integer i;

                @Nullable
                private final Boolean j;

                public C0351a() {
                    this(null, null, null, null, null, null, null, null, null, null, 1023, null);
                }

                @Nullable
                public final Boolean a() {
                    return this.a;
                }

                @Nullable
                public final Boolean b() {
                    return this.j;
                }

                @Nullable
                public final Integer c() {
                    return this.b;
                }

                @Nullable
                public final Boolean d() {
                    return this.c;
                }

                @Nullable
                public final Integer e() {
                    return this.d;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0351a)) {
                        return false;
                    }
                    C0351a c0351a = (C0351a) obj;
                    return Intrinsics.areEqual(this.a, c0351a.a) && Intrinsics.areEqual(this.b, c0351a.b) && Intrinsics.areEqual(this.c, c0351a.c) && Intrinsics.areEqual(this.d, c0351a.d) && Intrinsics.areEqual(this.e, c0351a.e) && Intrinsics.areEqual(this.f, c0351a.f) && Intrinsics.areEqual(this.g, c0351a.g) && Intrinsics.areEqual(this.h, c0351a.h) && Intrinsics.areEqual(this.i, c0351a.i) && Intrinsics.areEqual(this.j, c0351a.j);
                }

                @Nullable
                public final Integer f() {
                    return this.e;
                }

                @Nullable
                public final Boolean g() {
                    return this.f;
                }

                @Nullable
                public final Boolean h() {
                    return this.g;
                }

                public int hashCode() {
                    Boolean bool = this.a;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.b;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.c;
                    int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num2 = this.d;
                    int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.e;
                    int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Boolean bool3 = this.f;
                    int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Boolean bool4 = this.g;
                    int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    Integer num4 = this.h;
                    int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    Integer num5 = this.i;
                    int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    Boolean bool5 = this.j;
                    return hashCode9 + (bool5 != null ? bool5.hashCode() : 0);
                }

                @Nullable
                public final Integer i() {
                    return this.h;
                }

                @Nullable
                public final Integer j() {
                    return this.i;
                }

                @Nullable
                public final Integer k() {
                    return this.d;
                }

                @Nullable
                public final Boolean l() {
                    return this.j;
                }

                @Nullable
                public final Integer m() {
                    return this.b;
                }

                @Nullable
                public final Boolean n() {
                    return this.c;
                }

                @Nullable
                public final Boolean o() {
                    return this.a;
                }

                @Nullable
                public final Integer p() {
                    return this.h;
                }

                @Nullable
                public final Integer q() {
                    return this.e;
                }

                @Nullable
                public final Integer r() {
                    return this.i;
                }

                @Nullable
                public final Boolean s() {
                    return this.f;
                }

                @Nullable
                public final Boolean t() {
                    return this.g;
                }

                @NotNull
                public String toString() {
                    return "AdFormatAuction(programmatic=" + this.a + ", minTimeBeforeFirstAuction=" + this.b + ", objectPerWaterfall=" + this.c + ", auctionRetryInterval=" + this.d + ", timeToWaitBeforeAuction=" + this.e + ", isAuctionOnShowStart=" + this.f + ", isLoadWhileShow=" + this.g + ", timeToDeleteOldWaterfallAfterAuction=" + this.h + ", timeToWaitBeforeLoad=" + this.i + ", enableAuctionFallback=" + this.j + ")";
                }

                public C0351a(@Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool5) {
                    this.a = bool;
                    this.b = num;
                    this.c = bool2;
                    this.d = num2;
                    this.e = num3;
                    this.f = bool3;
                    this.g = bool4;
                    this.h = num4;
                    this.i = num5;
                    this.j = bool5;
                }

                @NotNull
                public final C0351a a(@Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool5) {
                    return new C0351a(bool, num, bool2, num2, num3, bool3, bool4, num4, num5, bool5);
                }

                public /* synthetic */ C0351a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) == 0 ? bool5 : null);
                }
            }

            public a() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            @Nullable
            public final C0351a A() {
                return this.k;
            }

            @Nullable
            public final Boolean B() {
                return this.j;
            }

            @Nullable
            public final String a() {
                return this.a;
            }

            @Nullable
            public final Boolean b() {
                return this.j;
            }

            @Nullable
            public final C0351a c() {
                return this.k;
            }

            @Nullable
            public final C0351a d() {
                return this.l;
            }

            @Nullable
            public final C0351a e() {
                return this.m;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g) && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.i, aVar.i) && Intrinsics.areEqual(this.j, aVar.j) && Intrinsics.areEqual(this.k, aVar.k) && Intrinsics.areEqual(this.l, aVar.l) && Intrinsics.areEqual(this.m, aVar.m) && Intrinsics.areEqual(this.n, aVar.n);
            }

            @Nullable
            public final C0351a f() {
                return this.n;
            }

            @Nullable
            public final String g() {
                return this.b;
            }

            @Nullable
            public final String h() {
                return this.c;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.e;
                int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
                Integer num2 = this.f;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.g;
                int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.h;
                int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num3 = this.i;
                int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool3 = this.j;
                int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                C0351a c0351a = this.k;
                int hashCode11 = (hashCode10 + (c0351a == null ? 0 : c0351a.hashCode())) * 31;
                C0351a c0351a2 = this.l;
                int hashCode12 = (hashCode11 + (c0351a2 == null ? 0 : c0351a2.hashCode())) * 31;
                C0351a c0351a3 = this.m;
                int hashCode13 = (hashCode12 + (c0351a3 == null ? 0 : c0351a3.hashCode())) * 31;
                C0351a c0351a4 = this.n;
                return hashCode13 + (c0351a4 != null ? c0351a4.hashCode() : 0);
            }

            @Nullable
            public final Integer i() {
                return this.d;
            }

            @Nullable
            public final Long j() {
                return this.e;
            }

            @Nullable
            public final Integer k() {
                return this.f;
            }

            @Nullable
            public final Boolean l() {
                return this.g;
            }

            @Nullable
            public final Boolean m() {
                return this.h;
            }

            @Nullable
            public final Integer n() {
                return this.i;
            }

            @Nullable
            public final String o() {
                return this.a;
            }

            @Nullable
            public final Integer p() {
                return this.f;
            }

            @Nullable
            public final Long q() {
                return this.e;
            }

            @Nullable
            public final Integer r() {
                return this.d;
            }

            @Nullable
            public final String s() {
                return this.b;
            }

            @Nullable
            public final C0351a t() {
                return this.m;
            }

            @NotNull
            public String toString() {
                return "Auction(auctionData=" + this.a + ", auctioneerURL=" + this.b + ", extAuctioneerURL=" + this.c + ", auctionTrials=" + this.d + ", auctionTimeout=" + this.e + ", auctionSavedHistory=" + this.f + ", compressAuctionRequest=" + this.g + ", compressAuctionResponse=" + this.h + ", encryptionVersion=" + this.i + ", tokenPerAdapter=" + this.j + ", rewarded=" + this.k + ", interstitial=" + this.l + ", banner=" + this.m + ", nativeAd=" + this.n + ")";
            }

            @Nullable
            public final Boolean u() {
                return this.g;
            }

            @Nullable
            public final Boolean v() {
                return this.h;
            }

            @Nullable
            public final Integer w() {
                return this.i;
            }

            @Nullable
            public final String x() {
                return this.c;
            }

            @Nullable
            public final C0351a y() {
                return this.l;
            }

            @Nullable
            public final C0351a z() {
                return this.n;
            }

            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Long l, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable C0351a c0351a, @Nullable C0351a c0351a2, @Nullable C0351a c0351a3, @Nullable C0351a c0351a4) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = num;
                this.e = l;
                this.f = num2;
                this.g = bool;
                this.h = bool2;
                this.i = num3;
                this.j = bool3;
                this.k = c0351a;
                this.l = c0351a2;
                this.m = c0351a3;
                this.n = c0351a4;
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Long l, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable C0351a c0351a, @Nullable C0351a c0351a2, @Nullable C0351a c0351a3, @Nullable C0351a c0351a4) {
                return new a(str, str2, str3, num, l, num2, bool, bool2, num3, bool3, c0351a, c0351a2, c0351a3, c0351a4);
            }

            public /* synthetic */ a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C0351a c0351a, C0351a c0351a2, C0351a c0351a3, C0351a c0351a4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : c0351a, (i & 2048) != 0 ? null : c0351a2, (i & 4096) != 0 ? null : c0351a3, (i & 8192) == 0 ? c0351a4 : null);
            }
        }

        public static final class b {

            @Nullable
            private final Boolean a;

            @Nullable
            private final String b;

            @Nullable
            private final String c;

            @Nullable
            private final Boolean d;

            @Nullable
            private final Integer e;

            @Nullable
            private final Boolean f;

            @Nullable
            private final List<String> g;

            public b() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final String c() {
                return this.c;
            }

            @Nullable
            public final Boolean d() {
                return this.d;
            }

            @Nullable
            public final Integer e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && Intrinsics.areEqual(this.d, bVar.d) && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f) && Intrinsics.areEqual(this.g, bVar.g);
            }

            @Nullable
            public final Boolean f() {
                return this.f;
            }

            @Nullable
            public final List<String> g() {
                return this.g;
            }

            @Nullable
            public final Boolean h() {
                return this.a;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.e;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f;
                int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                List<String> list = this.g;
                return hashCode6 + (list != null ? list.hashCode() : 0);
            }

            @Nullable
            public final Boolean i() {
                return this.d;
            }

            @Nullable
            public final List<String> j() {
                return this.g;
            }

            @Nullable
            public final String k() {
                return this.c;
            }

            @Nullable
            public final String l() {
                return this.b;
            }

            @Nullable
            public final Boolean m() {
                return this.f;
            }

            @Nullable
            public final Integer n() {
                return this.e;
            }

            @NotNull
            public String toString() {
                return "CrashReporter(enabled=" + this.a + ", reporterURL=" + this.b + ", reporterKeyword=" + this.c + ", includeANR=" + this.d + ", timeout=" + this.e + ", setIgnoreDebugger=" + this.f + ", keysToInclude=" + this.g + ")";
            }

            public b(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable List<String> list) {
                this.a = bool;
                this.b = str;
                this.c = str2;
                this.d = bool2;
                this.e = num;
                this.f = bool3;
                this.g = list;
            }

            @NotNull
            public final b a(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable List<String> list) {
                return new b(bool, str, str2, bool2, num, bool3, list);
            }

            public static /* synthetic */ b a(b bVar, Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = bVar.a;
                }
                if ((i & 2) != 0) {
                    str = bVar.b;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = bVar.c;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    bool2 = bVar.d;
                }
                Boolean bool4 = bool2;
                if ((i & 16) != 0) {
                    num = bVar.e;
                }
                Integer num2 = num;
                if ((i & 32) != 0) {
                    bool3 = bVar.f;
                }
                Boolean bool5 = bool3;
                if ((i & 64) != 0) {
                    list = bVar.g;
                }
                return bVar.a(bool, str3, str4, bool4, num2, bool5, list);
            }

            public /* synthetic */ b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : list);
            }
        }

        /* renamed from: com.ironsource.P3$c$c, reason: collision with other inner class name */
        public static final class C0352c {

            @Nullable
            private final Boolean a;

            @Nullable
            private final Boolean b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final Integer d;

            @Nullable
            private final String e;

            @Nullable
            private final String f;

            @Nullable
            private final Integer g;

            @Nullable
            private final Integer h;

            @Nullable
            private final Integer i;

            @Nullable
            private final List<Integer> j;

            @Nullable
            private final List<Integer> k;

            @Nullable
            private final List<Integer> l;

            @Nullable
            private final List<Integer> m;

            @Nullable
            private final JSONObject n;

            @Nullable
            private final a o;

            @Nullable
            private final String p;

            /* renamed from: com.ironsource.P3$c$c$a */
            public static final class a {

                @Nullable
                private final String a;

                @Nullable
                private final Boolean b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Nullable
                public final String a() {
                    return this.a;
                }

                @Nullable
                public final Boolean b() {
                    return this.b;
                }

                @Nullable
                public final Boolean c() {
                    return this.b;
                }

                @Nullable
                public final String d() {
                    return this.a;
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
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.b;
                    return hashCode + (bool != null ? bool.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Pixel(pixelEventsUrl=" + this.a + ", pixelEventsEnabled=" + this.b + ")";
                }

                public a(@Nullable String str, @Nullable Boolean bool) {
                    this.a = str;
                    this.b = bool;
                }

                @NotNull
                public final a a(@Nullable String str, @Nullable Boolean bool) {
                    return new a(str, bool);
                }

                public /* synthetic */ a(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
                }

                public static /* synthetic */ a a(a aVar, String str, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.a;
                    }
                    if ((i & 2) != 0) {
                        bool = aVar.b;
                    }
                    return aVar.a(str, bool);
                }
            }

            public C0352c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
            }

            @Nullable
            public final a A() {
                return this.o;
            }

            @Nullable
            public final Boolean B() {
                return this.b;
            }

            @Nullable
            public final Boolean C() {
                return this.a;
            }

            @Nullable
            public final String D() {
                return this.f;
            }

            @Nullable
            public final String E() {
                return this.e;
            }

            @Nullable
            public final List<Integer> F() {
                return this.l;
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }

            @Nullable
            public final List<Integer> b() {
                return this.j;
            }

            @Nullable
            public final List<Integer> c() {
                return this.k;
            }

            @Nullable
            public final List<Integer> d() {
                return this.l;
            }

            @Nullable
            public final List<Integer> e() {
                return this.m;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0352c)) {
                    return false;
                }
                C0352c c0352c = (C0352c) obj;
                return Intrinsics.areEqual(this.a, c0352c.a) && Intrinsics.areEqual(this.b, c0352c.b) && Intrinsics.areEqual(this.c, c0352c.c) && Intrinsics.areEqual(this.d, c0352c.d) && Intrinsics.areEqual(this.e, c0352c.e) && Intrinsics.areEqual(this.f, c0352c.f) && Intrinsics.areEqual(this.g, c0352c.g) && Intrinsics.areEqual(this.h, c0352c.h) && Intrinsics.areEqual(this.i, c0352c.i) && Intrinsics.areEqual(this.j, c0352c.j) && Intrinsics.areEqual(this.k, c0352c.k) && Intrinsics.areEqual(this.l, c0352c.l) && Intrinsics.areEqual(this.m, c0352c.m) && Intrinsics.areEqual(this.n, c0352c.n) && Intrinsics.areEqual(this.o, c0352c.o) && Intrinsics.areEqual(this.p, c0352c.p);
            }

            @Nullable
            public final JSONObject f() {
                return this.n;
            }

            @Nullable
            public final a g() {
                return this.o;
            }

            @Nullable
            public final String h() {
                return this.p;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.c;
                int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num = this.d;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.e;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.g;
                int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.h;
                int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.i;
                int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                List<Integer> list = this.j;
                int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
                List<Integer> list2 = this.k;
                int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<Integer> list3 = this.l;
                int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<Integer> list4 = this.m;
                int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
                JSONObject jSONObject = this.n;
                int hashCode14 = (hashCode13 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                a aVar = this.o;
                int hashCode15 = (hashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str3 = this.p;
                return hashCode15 + (str3 != null ? str3.hashCode() : 0);
            }

            @Nullable
            public final Boolean i() {
                return this.b;
            }

            @Nullable
            public final Boolean j() {
                return this.c;
            }

            @Nullable
            public final Integer k() {
                return this.d;
            }

            @Nullable
            public final String l() {
                return this.e;
            }

            @Nullable
            public final String m() {
                return this.f;
            }

            @Nullable
            public final Integer n() {
                return this.g;
            }

            @Nullable
            public final Integer o() {
                return this.h;
            }

            @Nullable
            public final Integer p() {
                return this.i;
            }

            @Nullable
            public final String q() {
                return this.p;
            }

            @Nullable
            public final Integer r() {
                return this.g;
            }

            @Nullable
            public final Boolean s() {
                return this.c;
            }

            @Nullable
            public final Integer t() {
                return this.d;
            }

            @NotNull
            public String toString() {
                return "Events(sendUltraEvents=" + this.a + ", sendEventsToggle=" + this.b + ", eventsCompression=" + this.c + ", eventsCompressionLevel=" + this.d + ", serverEventsURL=" + this.e + ", serverEventsType=" + this.f + ", backupThreshold=" + this.g + ", maxNumberOfEvents=" + this.h + ", maxEventsPerBatch=" + this.i + ", optOut=" + this.j + ", optIn=" + this.k + ", triggerEvents=" + this.l + ", nonConnectivityEvents=" + this.m + ", genericParams=" + this.n + ", pixel=" + this.o + ", abt=" + this.p + ")";
            }

            @Nullable
            public final JSONObject u() {
                return this.n;
            }

            @Nullable
            public final Integer v() {
                return this.i;
            }

            @Nullable
            public final Integer w() {
                return this.h;
            }

            @Nullable
            public final List<Integer> x() {
                return this.m;
            }

            @Nullable
            public final List<Integer> y() {
                return this.k;
            }

            @Nullable
            public final List<Integer> z() {
                return this.j;
            }

            public C0352c(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable JSONObject jSONObject, @Nullable a aVar, @Nullable String str3) {
                this.a = bool;
                this.b = bool2;
                this.c = bool3;
                this.d = num;
                this.e = str;
                this.f = str2;
                this.g = num2;
                this.h = num3;
                this.i = num4;
                this.j = list;
                this.k = list2;
                this.l = list3;
                this.m = list4;
                this.n = jSONObject;
                this.o = aVar;
                this.p = str3;
            }

            @NotNull
            public final C0352c a(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<Integer> list, @Nullable List<Integer> list2, @Nullable List<Integer> list3, @Nullable List<Integer> list4, @Nullable JSONObject jSONObject, @Nullable a aVar, @Nullable String str3) {
                return new C0352c(bool, bool2, bool3, num, str, str2, num2, num3, num4, list, list2, list3, list4, jSONObject, aVar, str3);
            }

            public /* synthetic */ C0352c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List list, List list2, List list3, List list4, JSONObject jSONObject, a aVar, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : list4, (i & 8192) != 0 ? null : jSONObject, (i & 16384) != 0 ? null : aVar, (i & 32768) != 0 ? null : str3);
            }
        }

        public static final class d {

            @Nullable
            private final Map<String, String> a;

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Nullable
            public final Map<String, String> a() {
                return this.a;
            }

            @Nullable
            public final Map<String, String> b() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
            }

            public int hashCode() {
                Map<String, String> map = this.a;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            @NotNull
            public String toString() {
                return "External(mediationTypes=" + this.a + ")";
            }

            public d(@Nullable Map<String, String> map) {
                this.a = map;
            }

            @NotNull
            public final d a(@Nullable Map<String, String> map) {
                return new d(map);
            }

            public /* synthetic */ d(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : map);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ d a(d dVar, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = dVar.a;
                }
                return dVar.a(map);
            }
        }

        public static final class e {

            @Nullable
            private final Integer a;

            @Nullable
            private final Integer b;

            @Nullable
            private final Integer c;

            @Nullable
            private final Boolean d;

            public e() {
                this(null, null, null, null, 15, null);
            }

            @Nullable
            public final Integer a() {
                return this.a;
            }

            @Nullable
            public final Integer b() {
                return this.b;
            }

            @Nullable
            public final Integer c() {
                return this.c;
            }

            @Nullable
            public final Boolean d() {
                return this.d;
            }

            @Nullable
            public final Integer e() {
                return this.c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b) && Intrinsics.areEqual(this.c, eVar.c) && Intrinsics.areEqual(this.d, eVar.d);
            }

            @Nullable
            public final Integer f() {
                return this.b;
            }

            @Nullable
            public final Integer g() {
                return this.a;
            }

            @Nullable
            public final Boolean h() {
                return this.d;
            }

            public int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.c;
                int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.d;
                return hashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Loggers(server=" + this.a + ", publisher=" + this.b + ", console=" + this.c + ", shouldSendPublisherLogsOnUIThread=" + this.d + ")";
            }

            public e(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool) {
                this.a = num;
                this.b = num2;
                this.c = num3;
                this.d = bool;
            }

            @NotNull
            public final e a(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool) {
                return new e(num, num2, num3, bool);
            }

            public static /* synthetic */ e a(e eVar, Integer num, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.a;
                }
                if ((i & 2) != 0) {
                    num2 = eVar.b;
                }
                if ((i & 4) != 0) {
                    num3 = eVar.c;
                }
                if ((i & 8) != 0) {
                    bool = eVar.d;
                }
                return eVar.a(num, num2, num3, bool);
            }

            public /* synthetic */ e(Integer num, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : bool);
            }
        }

        public static final class f {

            @Nullable
            private final String a;

            @Nullable
            private final String b;

            @Nullable
            private final JSONObject c;

            public f() {
                this(null, null, null, 7, null);
            }

            @Nullable
            public final String a() {
                return this.a;
            }

            @Nullable
            public final String b() {
                return this.b;
            }

            @Nullable
            public final JSONObject c() {
                return this.c;
            }

            @Nullable
            public final JSONObject d() {
                return this.c;
            }

            @Nullable
            public final String e() {
                return this.b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c);
            }

            @Nullable
            public final String f() {
                return this.a;
            }

            public int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                JSONObject jSONObject = this.c;
                return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Segment(name=" + this.a + ", id=" + this.b + ", custom=" + this.c + ")";
            }

            public f(@Nullable String str, @Nullable String str2, @Nullable JSONObject jSONObject) {
                this.a = str;
                this.b = str2;
                this.c = jSONObject;
            }

            @NotNull
            public final f a(@Nullable String str, @Nullable String str2, @Nullable JSONObject jSONObject) {
                return new f(str, str2, jSONObject);
            }

            public static /* synthetic */ f a(f fVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fVar.a;
                }
                if ((i & 2) != 0) {
                    str2 = fVar.b;
                }
                if ((i & 4) != 0) {
                    jSONObject = fVar.c;
                }
                return fVar.a(str, str2, jSONObject);
            }

            public /* synthetic */ f(String str, String str2, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jSONObject);
            }
        }

        public static final class g {

            @Nullable
            private final Boolean a;

            @Nullable
            private final a b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final C0353c d;

            @Nullable
            private final List<String> e;

            @Nullable
            private final Integer f;

            @Nullable
            private final Boolean g;

            @Nullable
            private final b h;

            public static final class a {

                @Nullable
                private final String a;

                @Nullable
                private final String b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                @Nullable
                public final String a() {
                    return this.a;
                }

                @Nullable
                public final String b() {
                    return this.b;
                }

                @Nullable
                public final String c() {
                    return this.b;
                }

                @Nullable
                public final String d() {
                    return this.a;
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
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "ConsentView(pre=" + this.a + ", post=" + this.b + ")";
                }

                public a(@Nullable String str, @Nullable String str2) {
                    this.a = str;
                    this.b = str2;
                }

                @NotNull
                public final a a(@Nullable String str, @Nullable String str2) {
                    return new a(str, str2);
                }

                public /* synthetic */ a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ a a(a aVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.a;
                    }
                    if ((i & 2) != 0) {
                        str2 = aVar.b;
                    }
                    return aVar.a(str, str2);
                }
            }

            public static final class b {

                @Nullable
                private final JSONObject a;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Nullable
                public final JSONObject a() {
                    return this.a;
                }

                @Nullable
                public final JSONObject b() {
                    return this.a;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
                }

                public int hashCode() {
                    JSONObject jSONObject = this.a;
                    if (jSONObject == null) {
                        return 0;
                    }
                    return jSONObject.hashCode();
                }

                @NotNull
                public String toString() {
                    return "EpConfig(traits=" + this.a + ")";
                }

                public b(@Nullable JSONObject jSONObject) {
                    this.a = jSONObject;
                }

                @NotNull
                public final b a(@Nullable JSONObject jSONObject) {
                    return new b(jSONObject);
                }

                public /* synthetic */ b(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : jSONObject);
                }

                public static /* synthetic */ b a(b bVar, JSONObject jSONObject, int i, Object obj) {
                    if ((i & 1) != 0) {
                        jSONObject = bVar.a;
                    }
                    return bVar.a(jSONObject);
                }
            }

            /* renamed from: com.ironsource.P3$c$g$c, reason: collision with other inner class name */
            public static final class C0353c {

                @Nullable
                private final Map<String, a> a;

                /* renamed from: com.ironsource.P3$c$g$c$a */
                public static final class a {

                    @Nullable
                    private final List<String> a;

                    /* JADX WARN: Multi-variable type inference failed */
                    public a() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    @Nullable
                    public final List<String> a() {
                        return this.a;
                    }

                    @Nullable
                    public final List<String> b() {
                        return this.a;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
                    }

                    public int hashCode() {
                        List<String> list = this.a;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Provider(skanIds=" + this.a + ")";
                    }

                    public a(@Nullable List<String> list) {
                        this.a = list;
                    }

                    @NotNull
                    public final a a(@Nullable List<String> list) {
                        return new a(list);
                    }

                    public /* synthetic */ a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ a a(a aVar, List list, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = aVar.a;
                        }
                        return aVar.a(list);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C0353c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                @Nullable
                public final Map<String, a> a() {
                    return this.a;
                }

                @Nullable
                public final Map<String, a> b() {
                    return this.a;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0353c) && Intrinsics.areEqual(this.a, ((C0353c) obj).a);
                }

                public int hashCode() {
                    Map<String, a> map = this.a;
                    if (map == null) {
                        return 0;
                    }
                    return map.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Skd(providers=" + this.a + ")";
                }

                public C0353c(@Nullable Map<String, a> map) {
                    this.a = map;
                }

                @NotNull
                public final C0353c a(@Nullable Map<String, a> map) {
                    return new C0353c(map);
                }

                public /* synthetic */ C0353c(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ C0353c a(C0353c c0353c, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        map = c0353c.a;
                    }
                    return c0353c.a(map);
                }
            }

            public g() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @Nullable
            public final Boolean a() {
                return this.a;
            }

            @Nullable
            public final a b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.c;
            }

            @Nullable
            public final C0353c d() {
                return this.d;
            }

            @Nullable
            public final List<String> e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.areEqual(this.a, gVar.a) && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.c, gVar.c) && Intrinsics.areEqual(this.d, gVar.d) && Intrinsics.areEqual(this.e, gVar.e) && Intrinsics.areEqual(this.f, gVar.f) && Intrinsics.areEqual(this.g, gVar.g) && Intrinsics.areEqual(this.h, gVar.h);
            }

            @Nullable
            public final Integer f() {
                return this.f;
            }

            @Nullable
            public final Boolean g() {
                return this.g;
            }

            @Nullable
            public final b h() {
                return this.h;
            }

            public int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                a aVar = this.b;
                int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                Boolean bool2 = this.c;
                int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C0353c c0353c = this.d;
                int hashCode4 = (hashCode3 + (c0353c == null ? 0 : c0353c.hashCode())) * 31;
                List<String> list = this.e;
                int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.f;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.g;
                int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                b bVar = this.h;
                return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            @Nullable
            public final a i() {
                return this.b;
            }

            @Nullable
            public final b j() {
                return this.h;
            }

            @Nullable
            public final List<String> k() {
                return this.e;
            }

            @Nullable
            public final Boolean l() {
                return this.c;
            }

            @Nullable
            public final Boolean m() {
                return this.g;
            }

            @Nullable
            public final Boolean n() {
                return this.a;
            }

            @Nullable
            public final C0353c o() {
                return this.d;
            }

            @Nullable
            public final Integer p() {
                return this.f;
            }

            @NotNull
            public String toString() {
                return "Settings(sid=" + this.a + ", consentView=" + this.b + ", passAdditionalContextualSignals=" + this.c + ", skd=" + this.d + ", isp=" + this.e + ", uaeh=" + this.f + ", sharedThreadPool=" + this.g + ", epConfig=" + this.h + ")";
            }

            public g(@Nullable Boolean bool, @Nullable a aVar, @Nullable Boolean bool2, @Nullable C0353c c0353c, @Nullable List<String> list, @Nullable Integer num, @Nullable Boolean bool3, @Nullable b bVar) {
                this.a = bool;
                this.b = aVar;
                this.c = bool2;
                this.d = c0353c;
                this.e = list;
                this.f = num;
                this.g = bool3;
                this.h = bVar;
            }

            @NotNull
            public final g a(@Nullable Boolean bool, @Nullable a aVar, @Nullable Boolean bool2, @Nullable C0353c c0353c, @Nullable List<String> list, @Nullable Integer num, @Nullable Boolean bool3, @Nullable b bVar) {
                return new g(bool, aVar, bool2, c0353c, list, num, bool3, bVar);
            }

            public /* synthetic */ g(Boolean bool, a aVar, Boolean bool2, C0353c c0353c, List list, Integer num, Boolean bool3, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : c0353c, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool3, (i & 128) == 0 ? bVar : null);
            }
        }

        public static final class h {

            @Nullable
            private final List<String> a;

            @Nullable
            private final JSONObject b;

            @Nullable
            private final Boolean c;

            @Nullable
            private final Boolean d;

            @Nullable
            private final Boolean e;

            public h() {
                this(null, null, null, null, null, 31, null);
            }

            @Nullable
            public final List<String> a() {
                return this.a;
            }

            @Nullable
            public final JSONObject b() {
                return this.b;
            }

            @Nullable
            public final Boolean c() {
                return this.c;
            }

            @Nullable
            public final Boolean d() {
                return this.d;
            }

            @Nullable
            public final Boolean e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.areEqual(this.a, hVar.a) && Intrinsics.areEqual(this.b, hVar.b) && Intrinsics.areEqual(this.c, hVar.c) && Intrinsics.areEqual(this.d, hVar.d) && Intrinsics.areEqual(this.e, hVar.e);
            }

            @Nullable
            public final Boolean f() {
                return this.d;
            }

            @Nullable
            public final Boolean g() {
                return this.c;
            }

            @Nullable
            public final Boolean h() {
                return this.e;
            }

            public int hashCode() {
                List<String> list = this.a;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                JSONObject jSONObject = this.b;
                int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool = this.c;
                int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.d;
                int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.e;
                return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            @Nullable
            public final List<String> i() {
                return this.a;
            }

            @Nullable
            public final JSONObject j() {
                return this.b;
            }

            @NotNull
            public String toString() {
                return "Token(optInKeys=" + this.a + ", tokenGenericParams=" + this.b + ", compressToken=" + this.c + ", compressExternalToken=" + this.d + ", oneToken=" + this.e + ")";
            }

            public h(@Nullable List<String> list, @Nullable JSONObject jSONObject, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
                this.a = list;
                this.b = jSONObject;
                this.c = bool;
                this.d = bool2;
                this.e = bool3;
            }

            @NotNull
            public final h a(@Nullable List<String> list, @Nullable JSONObject jSONObject, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
                return new h(list, jSONObject, bool, bool2, bool3);
            }

            public static /* synthetic */ h a(h hVar, List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.a;
                }
                if ((i & 2) != 0) {
                    jSONObject = hVar.b;
                }
                JSONObject jSONObject2 = jSONObject;
                if ((i & 4) != 0) {
                    bool = hVar.c;
                }
                Boolean bool4 = bool;
                if ((i & 8) != 0) {
                    bool2 = hVar.d;
                }
                Boolean bool5 = bool2;
                if ((i & 16) != 0) {
                    bool3 = hVar.e;
                }
                return hVar.a(list, jSONObject2, bool4, bool5, bool3);
            }

            public /* synthetic */ h(List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        @Nullable
        public final e a() {
            return this.a;
        }

        @Nullable
        public final Boolean b() {
            return this.j;
        }

        @Nullable
        public final C0352c c() {
            return this.b;
        }

        @Nullable
        public final h d() {
            return this.c;
        }

        @Nullable
        public final f e() {
            return this.d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d) && Intrinsics.areEqual(this.e, cVar.e) && Intrinsics.areEqual(this.f, cVar.f) && Intrinsics.areEqual(this.g, cVar.g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.i, cVar.i) && Intrinsics.areEqual(this.j, cVar.j);
        }

        @Nullable
        public final a f() {
            return this.e;
        }

        @Nullable
        public final b g() {
            return this.f;
        }

        @Nullable
        public final g h() {
            return this.g;
        }

        public int hashCode() {
            e eVar = this.a;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            C0352c c0352c = this.b;
            int hashCode2 = (hashCode + (c0352c == null ? 0 : c0352c.hashCode())) * 31;
            h hVar = this.c;
            int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            f fVar = this.d;
            int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar = this.e;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f;
            int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            g gVar = this.g;
            int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            d dVar = this.h;
            int hashCode8 = (hashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.i;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.j;
            return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Nullable
        public final d i() {
            return this.h;
        }

        @Nullable
        public final Boolean j() {
            return this.i;
        }

        @Nullable
        public final a k() {
            return this.e;
        }

        @Nullable
        public final b l() {
            return this.f;
        }

        @Nullable
        public final C0352c m() {
            return this.b;
        }

        @Nullable
        public final d n() {
            return this.h;
        }

        @Nullable
        public final Boolean o() {
            return this.j;
        }

        @Nullable
        public final e p() {
            return this.a;
        }

        @Nullable
        public final f q() {
            return this.d;
        }

        @Nullable
        public final g r() {
            return this.g;
        }

        @Nullable
        public final h s() {
            return this.c;
        }

        @Nullable
        public final Boolean t() {
            return this.i;
        }

        @NotNull
        public String toString() {
            return "Application(loggers=" + this.a + ", events=" + this.b + ", token=" + this.c + ", segment=" + this.d + ", auction=" + this.e + ", crashReporter=" + this.f + ", settings=" + this.g + ", external=" + this.h + ", uuidEnabled=" + this.i + ", integration=" + this.j + ")";
        }

        public c(@Nullable e eVar, @Nullable C0352c c0352c, @Nullable h hVar, @Nullable f fVar, @Nullable a aVar, @Nullable b bVar, @Nullable g gVar, @Nullable d dVar, @Nullable Boolean bool, @Nullable Boolean bool2) {
            this.a = eVar;
            this.b = c0352c;
            this.c = hVar;
            this.d = fVar;
            this.e = aVar;
            this.f = bVar;
            this.g = gVar;
            this.h = dVar;
            this.i = bool;
            this.j = bool2;
        }

        @NotNull
        public final c a(@Nullable e eVar, @Nullable C0352c c0352c, @Nullable h hVar, @Nullable f fVar, @Nullable a aVar, @Nullable b bVar, @Nullable g gVar, @Nullable d dVar, @Nullable Boolean bool, @Nullable Boolean bool2) {
            return new c(eVar, c0352c, hVar, fVar, aVar, bVar, gVar, dVar, bool, bool2);
        }

        public /* synthetic */ c(e eVar, C0352c c0352c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : c0352c, (i & 4) != 0 ? null : hVar, (i & 8) != 0 ? null : fVar, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : bool, (i & 512) == 0 ? bool2 : null);
        }
    }

    public static final class d {

        @Nullable
        private final String a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Nullable
        public final String a() {
            return this.a;
        }

        @Nullable
        public final String b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
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
            return "TestSuite(controllerUrl=" + this.a + ")";
        }

        public d(@Nullable String str) {
            this.a = str;
        }

        @NotNull
        public final d a(@Nullable String str) {
            return new d(str);
        }

        public /* synthetic */ d(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.a;
            }
            return dVar.a(str);
        }
    }

    public P3() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final c a() {
        return this.a;
    }

    @Nullable
    public final a b() {
        return this.b;
    }

    @Nullable
    public final d c() {
        return this.c;
    }

    @Nullable
    public final b d() {
        return this.d;
    }

    @Nullable
    public final a e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P3)) {
            return false;
        }
        P3 p3 = (P3) obj;
        return Intrinsics.areEqual(this.a, p3.a) && Intrinsics.areEqual(this.b, p3.b) && Intrinsics.areEqual(this.c, p3.c) && Intrinsics.areEqual(this.d, p3.d);
    }

    @Nullable
    public final b f() {
        return this.d;
    }

    @Nullable
    public final c g() {
        return this.a;
    }

    @Nullable
    public final d h() {
        return this.c;
    }

    public int hashCode() {
        c cVar = this.a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Configurations2(application=" + this.a + ", adFormats=" + this.b + ", testSuite=" + this.c + ", adQuality=" + this.d + ")";
    }

    public P3(@Nullable c cVar, @Nullable a aVar, @Nullable d dVar, @Nullable b bVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = dVar;
        this.d = bVar;
    }

    @NotNull
    public final P3 a(@Nullable c cVar, @Nullable a aVar, @Nullable d dVar, @Nullable b bVar) {
        return new P3(cVar, aVar, dVar, bVar);
    }

    public static /* synthetic */ P3 a(P3 p3, c cVar, a aVar, d dVar, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = p3.a;
        }
        if ((i & 2) != 0) {
            aVar = p3.b;
        }
        if ((i & 4) != 0) {
            dVar = p3.c;
        }
        if ((i & 8) != 0) {
            bVar = p3.d;
        }
        return p3.a(cVar, aVar, dVar, bVar);
    }

    public /* synthetic */ P3(c cVar, a aVar, d dVar, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : bVar);
    }
}
