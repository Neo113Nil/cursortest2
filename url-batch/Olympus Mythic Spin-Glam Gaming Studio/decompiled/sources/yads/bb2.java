package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes15.dex */
public final class bb2 {
    public final mt1 a;
    public final vo b;
    public final za2 c;

    public bb2(i5 i5Var, mt1 mt1Var) {
        vo voVar = new vo();
        za2 za2Var = new za2(i5Var);
        this.a = mt1Var;
        this.b = voVar;
        this.c = za2Var;
    }

    public final void a(wo woVar, yt2 yt2Var) {
        this.b.getClass();
        io2 a = vo.a(woVar);
        go2 go2Var = go2.c;
        a.b("success", "status");
        a.b(this.c.a(), "durations");
        a.a(yt2Var != null ? yt2Var.b : null, "stub_reason");
        fo2 fo2Var = fo2.c;
        this.a.a(new ho2("open_bidding_token_generation_result", MapsKt.toMutableMap(a.a), a.b));
    }

    public final void a(wo woVar) {
        this.b.getClass();
        io2 a = vo.a(woVar);
        go2 go2Var = go2.c;
        a.b("error", "status");
        a.b("Cannot load bidder token. Token generation failed", "failure_reason");
        a.b(this.c.a(), "durations");
        fo2 fo2Var = fo2.c;
        Map map = a.a;
        this.a.a(new ho2("open_bidding_token_generation_result", MapsKt.toMutableMap(map), a.b));
    }
}
