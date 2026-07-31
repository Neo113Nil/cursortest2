package com.ironsource.mediationsdk;

import com.ironsource.C4565b2;
import com.ironsource.C4573ba;
import com.ironsource.C4708j2;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class h {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final ArrayList<C4708j2> b;
    private boolean c;

    @NotNull
    private String d;
    private boolean e;

    @NotNull
    private Map<String, Object> f;

    @NotNull
    private List<String> g;
    private int h;

    @Nullable
    private C4565b2 i;

    @Nullable
    private C4573ba j;

    @NotNull
    private String k;

    @Nullable
    private ISBannerSize l;
    private boolean m;
    private boolean n;
    private boolean o;

    @Nullable
    private String p;

    @Nullable
    private String q;

    @Nullable
    private Boolean r;

    @Nullable
    private Double s;

    @Nullable
    private String t;

    public h(@NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = new ArrayList<>();
        this.d = "";
        this.f = new HashMap();
        this.g = new ArrayList();
        this.h = -1;
        this.k = "";
    }

    @Deprecated
    public static /* synthetic */ void i() {
    }

    @Deprecated
    public static /* synthetic */ void m() {
    }

    @NotNull
    public final IronSource.a a() {
        return this.a;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    @NotNull
    public final IronSource.a c() {
        return this.a;
    }

    public final void d(boolean z) {
        this.n = z;
    }

    @Nullable
    public final C4565b2 e() {
        return this.i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    @Nullable
    public final ISBannerSize f() {
        return this.l;
    }

    @Nullable
    public final Double g() {
        return this.s;
    }

    @NotNull
    public final Map<String, Object> h() {
        return this.f;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String j() {
        return this.d;
    }

    @NotNull
    public final ArrayList<C4708j2> k() {
        return this.b;
    }

    @NotNull
    public final List<String> l() {
        return this.g;
    }

    @Nullable
    public final String n() {
        return this.t;
    }

    @Nullable
    public final C4573ba o() {
        return this.j;
    }

    public final int p() {
        return this.h;
    }

    public final boolean q() {
        return this.n;
    }

    public final boolean r() {
        return this.o;
    }

    @NotNull
    public final String s() {
        return this.k;
    }

    public final boolean t() {
        return this.m;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.a + ")";
    }

    public final boolean u() {
        return this.e;
    }

    @Nullable
    public final Boolean v() {
        return this.r;
    }

    public final boolean w() {
        return this.c;
    }

    @NotNull
    public final h a(@NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new h(adUnit);
    }

    public final void b(@Nullable String str) {
        this.p = str;
    }

    public final void c(boolean z) {
        this.c = z;
    }

    @Nullable
    public final String d() {
        return this.p;
    }

    public final void e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.k = str;
    }

    public static /* synthetic */ h a(h hVar, IronSource.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = hVar.a;
        }
        return hVar.a(aVar);
    }

    @Nullable
    public final String b() {
        return this.q;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void d(@Nullable String str) {
        this.t = str;
    }

    public final void e(boolean z) {
        this.o = z;
    }

    public final void a(@NotNull C4708j2 instanceInfo) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.b.add(instanceInfo);
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f = map;
    }

    public final void a(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.g = list;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(@Nullable C4565b2 c4565b2) {
        this.i = c4565b2;
    }

    public final void a(@Nullable C4573ba c4573ba) {
        this.j = c4573ba;
    }

    public final void a(@Nullable ISBannerSize iSBannerSize) {
        this.l = iSBannerSize;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    public final void a(@Nullable String str) {
        this.q = str;
    }

    public final void a(@Nullable Boolean bool) {
        this.r = bool;
    }

    public final void a(@Nullable Double d) {
        this.s = d;
    }
}
