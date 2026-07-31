package com.ironsource;

import com.ironsource.AbstractC4745l3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes12.dex */
public class G9 extends AbstractC4745l3 {
    private static G9 R;
    private String P;
    private final M8 Q = Kb.Y().s();

    private G9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized G9 i() {
        G9 g9;
        synchronized (G9.class) {
            try {
                if (R == null) {
                    G9 g92 = new G9();
                    R = g92;
                    g92.e();
                }
                g9 = R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g9;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected int c(C4966x5 c4966x5) {
        int f = f(c4966x5.c());
        return f == AbstractC4745l3.e.BANNER.b() ? this.Q.a(IronSource.a.BANNER) : f == AbstractC4745l3.e.NATIVE_AD.b() ? this.Q.a(IronSource.a.NATIVE_AD) : this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean d(C4966x5 c4966x5) {
        int c = c4966x5.c();
        return c == EnumC4984y5.IS_CALLBACK_LOAD_SUCCESS.b() || c == EnumC4984y5.IS_INSTANCE_OPENED.b() || c == EnumC4984y5.IS_INSTANCE_CLOSED.b() || c == EnumC4984y5.IS_AUCTION_SUCCESS.b() || c == EnumC4984y5.IS_AUCTION_FAILED.b() || c == EnumC4984y5.BN_INSTANCE_SHOW.b() || c == EnumC4984y5.BN_AUCTION_SUCCESS.b() || c == EnumC4984y5.BN_AUCTION_FAILED.b() || c == EnumC4984y5.NT_INSTANCE_LOAD_SUCCESS.b() || c == EnumC4984y5.NT_INSTANCE_SHOW.b() || c == EnumC4984y5.NT_AUCTION_SUCCESS.b() || c == EnumC4984y5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC4745l3
    protected String e(int i) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void f(C4966x5 c4966x5) {
        this.P = c4966x5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean j(C4966x5 c4966x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void d() {
        this.J.add(Integer.valueOf(EnumC4984y5.IS_LOAD_CALLED.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.IS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_RELOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_RELOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.BN_INSTANCE_SHOW.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.NT_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.NT_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.NT_INSTANCE_SHOW.b()));
    }
}
