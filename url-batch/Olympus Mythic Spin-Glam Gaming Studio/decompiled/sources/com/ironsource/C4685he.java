package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.he, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4685he extends AbstractC4745l3 {
    private static C4685he R;
    private String P;
    private final M8 Q = Kb.Y().s();

    private C4685he() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized C4685he i() {
        C4685he c4685he;
        synchronized (C4685he.class) {
            try {
                if (R == null) {
                    C4685he c4685he2 = new C4685he();
                    R = c4685he2;
                    c4685he2.e();
                }
                c4685he = R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4685he;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected int c(C4966x5 c4966x5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean d(C4966x5 c4966x5) {
        int c = c4966x5.c();
        return c == EnumC4984y5.FIRST_INSTANCE.b() || c == EnumC4984y5.INIT_COMPLETE.b() || c == EnumC4984y5.SDK_INIT_FAILED.b() || c == EnumC4984y5.SDK_INIT_SUCCESS.b() || c == EnumC4984y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || c == EnumC4984y5.RV_BUSINESS_INSTANCE_OPENED.b() || c == EnumC4984y5.RV_INSTANCE_CLOSED.b() || c == EnumC4984y5.RV_BUSINESS_INSTANCE_REWARDED.b() || c == EnumC4984y5.RV_AUCTION_FAILED.b() || c == EnumC4984y5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4745l3
    protected String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void f(C4966x5 c4966x5) {
        if (c4966x5.c() == 15 || (c4966x5.c() >= 300 && c4966x5.c() < 400)) {
            this.P = c4966x5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC4745l3
    protected boolean j(C4966x5 c4966x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4745l3
    protected void d() {
        this.J.add(Integer.valueOf(EnumC4984y5.RV_BUSINESS_MEDIATION_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_BUSINESS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_INSTANCE_SHOW_CHANCE.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_INSTANCE_LOAD_FAILED_REASON.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(EnumC4984y5.RV_MEDIATION_LOAD_ERROR.b()));
    }
}
