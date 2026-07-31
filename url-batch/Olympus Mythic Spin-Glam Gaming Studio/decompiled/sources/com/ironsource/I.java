package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class I {

    @NotNull
    private final AbstractC4961x0 a;

    @NotNull
    private final NetworkSettings b;

    @NotNull
    private final Lazy c;

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ V0 a;
        final /* synthetic */ I b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V0 v0, I i) {
            super(0);
            this.a = v0;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseAdAdapter<?, ?> mo4828invoke() {
            return this.a.a(this.b.e(), this.b.a(), this.b.d());
        }
    }

    public I(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData, @NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.a = adUnitData;
        this.b = providerSettings;
        this.c = LazyKt.lazy(new a(adTools, this));
    }

    @NotNull
    public final IronSource.a a() {
        return this.a.b().a();
    }

    @Nullable
    public final BaseAdAdapter<?, ?> b() {
        return (BaseAdAdapter) this.c.getValue();
    }

    @NotNull
    public final String c() {
        String providerName = this.b.getProviderName();
        Intrinsics.checkNotNullExpressionValue(providerName, "providerSettings.providerName");
        return providerName;
    }

    @NotNull
    public final UUID d() {
        return this.a.b().b();
    }

    @NotNull
    public final NetworkSettings e() {
        return this.b;
    }
}
