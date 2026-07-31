package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4947w4 implements P8, O8 {

    @NotNull
    private final InterfaceC4968x7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4947w4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O8
    public void a(@NotNull Context context, @NotNull EnumC4929v4 source, @NotNull String key, @NotNull String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        B4 a = this.a.a(context, source);
        if (a != null) {
            a.b(key, value);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C4947w4(@NotNull InterfaceC4968x7 sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.P8
    @Nullable
    public String a(@NotNull Context context, @NotNull EnumC4929v4 source, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        B4 a = this.a.a(context, source);
        if (a != null) {
            return B4.a(a, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C4947w4(InterfaceC4968x7 interfaceC4968x7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C5001z4() : interfaceC4968x7);
    }
}
