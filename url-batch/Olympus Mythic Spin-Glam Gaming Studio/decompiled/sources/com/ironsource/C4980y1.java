package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4980y1 extends AbstractC4745l3 {
    public C4980y1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC4745l3
    protected int c(@Nullable C4966x5 c4966x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC4745l3
    @NotNull
    protected String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void f(@Nullable C4966x5 c4966x5) {
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean h(@Nullable C4966x5 c4966x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean j(@Nullable C4966x5 c4966x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean d(@NotNull C4966x5 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int c = event.c();
        return c == EnumC4984y5.FIRST_INSTANCE.b() || c == EnumC4984y5.INIT_COMPLETE.b() || c == EnumC4984y5.SDK_INIT_FAILED.b() || c == EnumC4984y5.SDK_INIT_SUCCESS.b();
    }
}
