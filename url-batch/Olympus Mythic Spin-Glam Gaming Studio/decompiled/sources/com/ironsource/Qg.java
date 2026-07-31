package com.ironsource;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Qg {

    @NotNull
    private final List<B> a;

    /* JADX WARN: Multi-variable type inference failed */
    public Qg(@NotNull List<? extends B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.a = instances;
    }

    @NotNull
    public final List<B> a() {
        return this.a;
    }

    @NotNull
    public final List<B> b() {
        return this.a;
    }

    public final int c() {
        return this.a.size();
    }

    @NotNull
    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (B b : this.a) {
            arrayList.add(a(b.h(), b.r()));
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Qg) && Intrinsics.areEqual(this.a, ((Qg) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WaterfallInstances(instances=" + this.a + ")";
    }

    @NotNull
    public final Qg a(@NotNull List<? extends B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new Qg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Qg a(Qg qg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qg.a;
        }
        return qg.a(list);
    }

    private final String a(C4834q2 c4834q2, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c4834q2.c()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}
