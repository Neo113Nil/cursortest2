package com.ironsource;

import com.ironsource.F0;
import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5002z5 implements E0 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final F0 b;

    @NotNull
    private final List<E0> c;

    @NotNull
    private final X8 d;

    @NotNull
    private final C5008zb e;

    @NotNull
    private final C4794ng f;

    @NotNull
    private final T1 g;

    @NotNull
    private final O h;

    @NotNull
    private final C4865rg i;

    @NotNull
    private final Uc j;

    public C5002z5(@NotNull IronSource.a adFormat, @NotNull F0.b level, @NotNull List<? extends E0> eventsInterfaces, @Nullable AbstractC4745l3 abstractC4745l3) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.a = adFormat;
        F0 f0 = new F0(adFormat, level, this, abstractC4745l3);
        this.b = f0;
        this.c = CollectionsKt.toMutableList((Collection) eventsInterfaces);
        X8 x8 = f0.e;
        Intrinsics.checkNotNullExpressionValue(x8, "wrapper.init");
        this.d = x8;
        C5008zb c5008zb = f0.f;
        Intrinsics.checkNotNullExpressionValue(c5008zb, "wrapper.load");
        this.e = c5008zb;
        C4794ng c4794ng = f0.g;
        Intrinsics.checkNotNullExpressionValue(c4794ng, "wrapper.token");
        this.f = c4794ng;
        T1 t1 = f0.h;
        Intrinsics.checkNotNullExpressionValue(t1, "wrapper.auction");
        this.g = t1;
        O o = f0.i;
        Intrinsics.checkNotNullExpressionValue(o, "wrapper.adInteraction");
        this.h = o;
        C4865rg c4865rg = f0.j;
        Intrinsics.checkNotNullExpressionValue(c4865rg, "wrapper.troubleshoot");
        this.i = c4865rg;
        Uc uc = f0.k;
        Intrinsics.checkNotNullExpressionValue(uc, "wrapper.operational");
        this.j = uc;
    }

    @NotNull
    public final O a() {
        return this.h;
    }

    @NotNull
    public final T1 b() {
        return this.g;
    }

    @NotNull
    public final List<E0> c() {
        return this.c;
    }

    @NotNull
    public final X8 d() {
        return this.d;
    }

    @NotNull
    public final C5008zb e() {
        return this.e;
    }

    @NotNull
    public final Uc f() {
        return this.j;
    }

    @NotNull
    public final C4794ng g() {
        return this.f;
    }

    @NotNull
    public final C4865rg h() {
        return this.i;
    }

    @Override // com.ironsource.E0
    @NotNull
    public Map<String, Object> a(@NotNull C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        Iterator<E0> it = this.c.iterator();
        while (it.hasNext()) {
            Map<String, Object> a = it.next().a(event);
            Intrinsics.checkNotNullExpressionValue(a, "it.getEventsAdditionalDataMap(event)");
            hashMap.putAll(a);
        }
        return hashMap;
    }

    public /* synthetic */ C5002z5(IronSource.a aVar, F0.b bVar, List list, AbstractC4745l3 abstractC4745l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : abstractC4745l3);
    }

    public final void a(@NotNull E0 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.c.add(eventInterface);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.a == IronSource.a.BANNER) {
                this.e.d();
            } else {
                this.e.a(false);
            }
        }
    }
}
