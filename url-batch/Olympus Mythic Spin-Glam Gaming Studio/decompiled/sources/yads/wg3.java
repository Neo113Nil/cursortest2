package yads;

import android.view.View;
import com.pubmatic.sdk.video.POBVastError;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes9.dex */
public final class wg3 implements vj3 {
    public final fe3 a;
    public final tj3 b;

    public wg3(fe3 fe3Var, tj3 tj3Var) {
        this.a = fe3Var;
        this.b = tj3Var;
    }

    @Override // yads.vj3
    public final /* bridge */ void a() {
    }

    @Override // yads.vj3
    public final /* bridge */ void a(float f) {
    }

    @Override // yads.vj3
    public final /* bridge */ void a(long j, float f) {
    }

    @Override // yads.vj3
    public final /* bridge */ void a(View view, List list) {
    }

    @Override // yads.vj3
    public final /* bridge */ void a(uj3 uj3Var) {
    }

    @Override // yads.vj3
    public final /* bridge */ void b() {
    }

    @Override // yads.vj3
    public final /* bridge */ void c() {
    }

    @Override // yads.vj3
    public final /* bridge */ void d() {
    }

    @Override // yads.vj3
    public final /* bridge */ void f() {
    }

    @Override // yads.vj3
    public final /* bridge */ void g() {
    }

    @Override // yads.vj3
    public final void h() {
        this.b.a(this.a, "render_impression");
    }

    @Override // yads.vj3
    public final void i() {
        this.b.a(new pe3(this.a), "renderingStart");
    }

    @Override // yads.vj3
    public final /* bridge */ void j() {
    }

    @Override // yads.vj3
    public final /* bridge */ void k() {
    }

    @Override // yads.vj3
    public final /* bridge */ void l() {
    }

    @Override // yads.vj3
    public final /* bridge */ void m() {
    }

    @Override // yads.vj3
    public final void n() {
        this.b.a(this.a, "impression");
    }

    @Override // yads.vj3
    public final void a(wf3 wf3Var) {
        int i;
        switch (wf3Var.a.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i = 405;
                break;
            case 7:
                i = 402;
                break;
            case 8:
            case 12:
            case 28:
                i = POBVastError.UNDEFINED_ERROR;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i = 400;
                break;
            case 19:
                i = 401;
                break;
            case 23:
                i = 403;
                break;
            case 29:
            case 31:
                i = EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE;
                break;
            case 30:
                i = EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Map mapOf = MapsKt.mapOf(TuplesKt.to("[ERRORCODE]", String.valueOf(i)));
        tj3 tj3Var = this.b;
        List list = (List) this.a.a().get("error");
        if (list != null) {
            tj3Var.a.a(list, mapOf);
        }
    }
}
