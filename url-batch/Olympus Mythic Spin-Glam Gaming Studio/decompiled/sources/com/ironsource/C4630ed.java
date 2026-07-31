package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4630ed extends AbstractC4745l3 {

    @NotNull
    public static final C4630ed P;

    static {
        C4630ed c4630ed = new C4630ed();
        P = c4630ed;
        c4630ed.H = "outcome";
        c4630ed.G = 0;
        c4630ed.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c4630ed.e();
    }

    private C4630ed() {
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void a(@Nullable ArrayList<C4966x5> arrayList) {
    }

    @Override // com.ironsource.AbstractC4745l3
    protected int c(@Nullable C4966x5 c4966x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean d(@Nullable C4966x5 c4966x5) {
        return true;
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
    protected boolean g(@Nullable C4966x5 c4966x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean h(@Nullable C4966x5 c4966x5) {
        return false;
    }

    public final void i() {
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        a(new C4966x5(EnumC4984y5.INIT_DEFERRED_DATA, new C4545a9().a()));
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean j(@Nullable C4966x5 c4966x5) {
        return false;
    }
}
