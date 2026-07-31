package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4880sd implements InterfaceC4898td, G {

    @NotNull
    private final String a;

    @NotNull
    private final List<String> b;
    private final int c;

    @NotNull
    private final InterfaceC5010zd d;

    @NotNull
    private final V0 e;
    private boolean f;

    @Nullable
    private Function1 g;

    @NotNull
    private List<C4712j6> h;
    private int i;
    private int j;

    @Nullable
    private Integer k;
    private boolean l;

    public C4880sd(@NotNull String adUnitId, @NotNull List<String> instanceNames, int i, @NotNull InterfaceC5010zd fetcher, @NotNull V0 adUnitTools) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(instanceNames, "instanceNames");
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        this.a = adUnitId;
        this.b = instanceNames;
        this.c = i;
        this.d = fetcher;
        this.e = adUnitTools;
        this.f = true;
        this.h = CollectionsKt.emptyList();
    }

    private final void d() {
        if (this.i >= this.h.size()) {
            return;
        }
        this.j++;
        C4712j6 c4712j6 = this.h.get(this.i);
        this.i++;
        c4712j6.a(this);
    }

    @Override // com.ironsource.InterfaceC4898td
    public boolean a() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC4898td
    @NotNull
    public String b() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4898td
    @Nullable
    public C4712j6 c() {
        Integer num = this.k;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (this.l) {
            return null;
        }
        this.l = true;
        return this.h.get(intValue);
    }

    private final void b(boolean z) {
        if (this.j > 0) {
            return;
        }
        if (!z) {
            this.e.f().e().a();
        }
        Function1 function1 = this.g;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        this.g = null;
    }

    @Override // com.ironsource.InterfaceC4898td
    public void a(@NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.e.f().e().b();
        this.f = false;
        this.g = callback;
        List<C4712j6> a = this.d.a(this.b);
        if (a.isEmpty()) {
            b(false);
            return;
        }
        this.h = a;
        int min = Math.min(this.c, a.size());
        for (int i = 0; i < min; i++) {
            d();
        }
    }

    @Override // com.ironsource.G
    public void b(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int a = a(instance);
        if (a == -1) {
            instance.c();
            IronLog.INTERNAL.warning("stale load success callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.l) {
            instance.c();
        } else {
            a(a);
            b(true);
        }
    }

    @Override // com.ironsource.InterfaceC4898td
    public void a(boolean z) {
        if (!this.l) {
            IronLog.INTERNAL.warning("reset before getting instance for adUnitId: " + b());
            return;
        }
        this.l = false;
        this.i = 0;
        this.j = 0;
        this.g = null;
        this.f = z;
        if (z) {
            this.h = CollectionsKt.emptyList();
            this.k = null;
        }
    }

    private final void a(int i) {
        Integer num = this.k;
        if (num == null) {
            this.e.f().e().c();
            this.k = Integer.valueOf(i);
        } else {
            int min = Math.min(i, num.intValue());
            this.h.get(Math.max(i, num.intValue())).c();
            this.k = Integer.valueOf(min);
        }
    }

    @Override // com.ironsource.G
    public void a(@NotNull IronSourceError error, @NotNull B instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (a(instance) == -1) {
            IronLog.INTERNAL.warning("stale load failure callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.k != null) {
            b(true);
        } else if (this.i < this.h.size()) {
            d();
        } else {
            b(false);
        }
    }

    private final int a(B b) {
        Iterator<C4712j6> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == b) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
