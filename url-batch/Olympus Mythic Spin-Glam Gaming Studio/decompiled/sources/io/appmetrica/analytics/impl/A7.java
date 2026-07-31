package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class A7 implements Converter {
    public final Ge a;

    /* JADX WARN: Multi-variable type inference failed */
    public A7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E7 fromModel(@NotNull C5846z7 c5846z7) {
        E7 e7 = new E7();
        Boolean bool = c5846z7.a;
        if (bool != null) {
            e7.a = this.a.fromModel(bool).intValue();
        }
        Double d = c5846z7.c;
        if (d != null) {
            e7.c = d.doubleValue();
        }
        Double d2 = c5846z7.b;
        if (d2 != null) {
            e7.b = d2.doubleValue();
        }
        Long l = c5846z7.h;
        if (l != null) {
            e7.h = l.longValue();
        }
        Integer num = c5846z7.f;
        if (num != null) {
            e7.f = num.intValue();
        }
        Integer num2 = c5846z7.e;
        if (num2 != null) {
            e7.e = num2.intValue();
        }
        Integer num3 = c5846z7.g;
        if (num3 != null) {
            e7.g = num3.intValue();
        }
        Integer num4 = c5846z7.d;
        if (num4 != null) {
            e7.d = num4.intValue();
        }
        String str = c5846z7.i;
        if (str != null) {
            e7.i = str;
        }
        String str2 = c5846z7.j;
        if (str2 != null) {
            e7.j = str2;
        }
        return e7;
    }

    public A7(@NotNull Ge ge) {
        this.a = ge;
    }

    public /* synthetic */ A7(Ge ge, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ge() : ge);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5846z7 toModel(@Nullable E7 e7) {
        if (e7 == null) {
            return new C5846z7(null, null, null, null, null, null, null, null, null, null);
        }
        E7 e72 = new E7();
        Boolean a = this.a.a(e7.a);
        double d = e7.c;
        Double valueOf = !((d > e72.c ? 1 : (d == e72.c ? 0 : -1)) == 0) ? Double.valueOf(d) : null;
        double d2 = e7.b;
        Double valueOf2 = !(d2 == e72.b) ? Double.valueOf(d2) : null;
        long j = e7.h;
        Long valueOf3 = j != e72.h ? Long.valueOf(j) : null;
        int i = e7.f;
        Integer valueOf4 = i != e72.f ? Integer.valueOf(i) : null;
        int i2 = e7.e;
        Integer valueOf5 = i2 != e72.e ? Integer.valueOf(i2) : null;
        int i3 = e7.g;
        Integer valueOf6 = i3 != e72.g ? Integer.valueOf(i3) : null;
        int i4 = e7.d;
        Integer valueOf7 = i4 != e72.d ? Integer.valueOf(i4) : null;
        String str = e7.i;
        String str2 = !Intrinsics.areEqual(str, e72.i) ? str : null;
        String str3 = e7.j;
        return new C5846z7(a, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !Intrinsics.areEqual(str3, e72.j) ? str3 : null);
    }
}
