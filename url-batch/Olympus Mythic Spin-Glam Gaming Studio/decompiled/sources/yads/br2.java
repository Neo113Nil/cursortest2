package yads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class br2 extends mx0 {
    public final al2 m;
    public final mt2 n;
    public final vr2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br2(Context context, t8 t8Var, v3 v3Var, yu2 yu2Var, xw0 xw0Var) {
        super(context, t8Var, v3Var, yu2Var, xw0Var, new a5());
        sq2 sq2Var;
        al2 al2Var = new al2();
        new u22();
        mt2 mt2Var = new mt2(v3Var, yu2Var);
        this.m = al2Var;
        this.n = mt2Var;
        vr2 vr2Var = null;
        if (t8Var != null && (sq2Var = t8Var.r) != null) {
            if (sq2Var.b) {
                oy2 oy2Var = sq2Var.d;
                if (oy2Var != null) {
                    vr2Var = new my2(context, v3Var, yu2Var, oy2Var);
                }
            } else {
                nv nvVar = sq2Var.c;
                if (nvVar != null) {
                    vr2Var = new lv(nvVar, al2Var);
                }
            }
        }
        this.o = vr2Var;
    }

    @Override // yads.mx0, yads.x3
    public final void a(int i, Bundle bundle) {
        if (i == 13) {
            g();
        } else {
            super.a(i, bundle);
        }
    }

    @Override // yads.mx0
    public final mx0 e() {
        return this;
    }

    public final void g() {
        Map emptyMap;
        sq2 sq2Var;
        mt2 mt2Var = this.n;
        Context context = this.a;
        t8 t8Var = this.b;
        mt2Var.getClass();
        Boolean bool = null;
        io2 io2Var = new io2((Map) null, 3);
        if (t8Var != null && (sq2Var = t8Var.r) != null) {
            bool = Boolean.valueOf(sq2Var.b);
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "server_side"));
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "client_side"));
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            emptyMap = MapsKt.emptyMap();
        }
        io2Var.b(emptyMap, "reward_info");
        mt2Var.a(context, t8Var, fo2.w, io2Var);
        vr2 vr2Var = this.o;
        if (vr2Var != null) {
            vr2Var.a();
        }
    }
}
