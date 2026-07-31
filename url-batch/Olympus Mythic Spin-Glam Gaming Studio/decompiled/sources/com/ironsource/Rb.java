package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Rb {

    @NotNull
    public static final a m = new a(null);
    private static final int n = 0;
    private final boolean a;

    @NotNull
    private J1 b;
    private int c;
    private long d;
    private boolean e;

    @NotNull
    private final ArrayList<C4593cc> f;

    @Nullable
    private C4593cc g;
    private int h;

    @NotNull
    private C4869s2 i;
    private long j;
    private boolean k;
    private boolean l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Rb(int i, long j, boolean z, @NotNull J1 events, @NotNull C4869s2 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.a = z4;
        this.f = new ArrayList<>();
        this.c = i;
        this.d = j;
        this.e = z;
        this.b = events;
        this.h = i2;
        this.i = auctionSettings;
        this.j = j2;
        this.k = z2;
        this.l = z3;
    }

    public final void a(@NotNull J1 j1) {
        Intrinsics.checkNotNullParameter(j1, "<set-?>");
        this.b = j1;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    @NotNull
    public final C4869s2 d() {
        return this.i;
    }

    @Nullable
    public final C4593cc e() {
        Iterator<C4593cc> it = this.f.iterator();
        while (it.hasNext()) {
            C4593cc next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    @NotNull
    public final J1 g() {
        return this.b;
    }

    public final long h() {
        return this.j;
    }

    public final boolean i() {
        return this.k;
    }

    public final boolean j() {
        return this.a;
    }

    public final boolean k() {
        return this.l;
    }

    @NotNull
    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.e + "}";
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final boolean a() {
        return this.e;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(@NotNull C4869s2 c4869s2) {
        Intrinsics.checkNotNullParameter(c4869s2, "<set-?>");
        this.i = c4869s2;
    }

    public final void a(@Nullable C4593cc c4593cc) {
        if (c4593cc != null) {
            this.f.add(c4593cc);
            if (this.g == null) {
                this.g = c4593cc;
            } else if (c4593cc.b() == 0) {
                this.g = c4593cc;
            }
        }
    }

    @Nullable
    public final C4593cc a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Iterator<C4593cc> it = this.f.iterator();
        while (it.hasNext()) {
            C4593cc next = it.next();
            if (Intrinsics.areEqual(next.c(), placementName)) {
                return next;
            }
        }
        return null;
    }
}
