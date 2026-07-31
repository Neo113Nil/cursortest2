package yads;

import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.MapsKt;

/* loaded from: classes3.dex */
public final class r12 implements hp2 {
    public final k8 a;
    public final v8 b;
    public final v12 c;
    public final im3 d;

    public r12() {
        d52 d52Var = new d52();
        v12 v12Var = new v12();
        im3 im3Var = new im3();
        this.a = new k8();
        this.b = new v8(d52Var);
        this.c = v12Var;
        this.d = im3Var;
    }

    @Override // yads.hp2
    public final ho2 a(Object obj) {
        v3 v3Var = (v3) obj;
        io2 io2Var = new io2(new HashMap(), 2);
        d8 d8Var = v3Var.e;
        if (d8Var != null) {
            io2Var = jo2.a(io2Var, this.a.a(d8Var));
        }
        io2Var.b(v3Var.c.a, "ad_unit_id");
        io2Var.b(v3Var.a.b, "ad_type");
        l03 l03Var = v3Var.d.a;
        if (l03Var != null) {
            io2Var.b(l03Var.b().b, "size_type");
            io2Var.b(Integer.valueOf(l03Var.getWidth()), "width");
            io2Var.b(Integer.valueOf(l03Var.getHeight()), "height");
            xl a = l03Var.a();
            io2Var.a(a != null ? a.b : null, "banner_size_calculation_type");
        }
        io2Var.b(Boolean.valueOf(v3Var.g == cb3.c), "is_passback");
        io2Var.b(Boolean.valueOf(v3Var.m), "image_loading_automatically");
        List list = v3Var.b.c;
        if (!list.isEmpty()) {
            io2Var.b(list, "image_sizes");
        }
        fo2 fo2Var = fo2.c;
        return new ho2("ad_request", MapsKt.toMutableMap(io2Var.a), io2Var.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    @Override // yads.hp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ho2 a(xp2 xp2Var, int i, Object obj, hm3 hm3Var) {
        String str;
        String str2;
        go2 go2Var;
        t8 t8Var;
        v3 v3Var = (v3) obj;
        d52 d52Var = this.b.a;
        String str3 = null;
        t8 t8Var2 = xp2Var != null ? (t8) xp2Var.a : null;
        io2 a = d52Var.a.a(v3Var, t8Var2, t8Var2 != null ? (s12) t8Var2.t : null);
        l03 l03Var = v3Var.d.a;
        if (l03Var != null) {
            a.b(l03Var.b().b, "size_type");
            a.b(Integer.valueOf(l03Var.getWidth()), "width");
            a.b(Integer.valueOf(l03Var.getHeight()), "height");
            xl a2 = l03Var.a();
            a.a(a2 != null ? a2.b : null, "banner_size_calculation_type");
        }
        if (i == -1) {
            str = "error_code";
        } else {
            str = "code";
        }
        a.b(Integer.valueOf(i), str);
        if (xp2Var != null && (t8Var = (t8) xp2Var.a) != null) {
            if (t8Var.q != null) {
                str2 = "mediation";
            } else if (t8Var.t != null) {
                str2 = "ad";
            }
            a.b(str2, ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE);
            if (xp2Var != null) {
                t8 t8Var3 = (t8) xp2Var.a;
                a.b = t8Var3 != null ? t8Var3.i : null;
            }
            t8 t8Var4 = xp2Var == null ? (t8) xp2Var.a : null;
            if (204 != i) {
                go2Var = go2.e;
            } else if (t8Var4 != null && i == 200) {
                this.c.getClass();
                s12 s12Var = (s12) t8Var4.t;
                if (s12Var != null) {
                    go2Var = (go2) s12Var.e.get("status");
                } else {
                    go2Var = t8Var4.q == null ? go2.d : null;
                }
            } else {
                go2Var = go2.d;
            }
            if (go2Var != null) {
                a.b(go2Var.b, "status");
            }
            if (hm3Var != null) {
                this.d.getClass();
                if (hm3Var instanceof z3) {
                    str3 = g4.a(v3Var, ((z3) hm3Var).c).b;
                }
            }
            a.a(str3, NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
            fo2 fo2Var = fo2.c;
            return new ho2("ad_response", MapsKt.toMutableMap(a.a), a.b);
        }
        str2 = "empty";
        a.b(str2, ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE);
        if (xp2Var != null) {
        }
        if (xp2Var == null) {
        }
        if (204 != i) {
        }
        if (go2Var != null) {
        }
        if (hm3Var != null) {
        }
        a.a(str3, NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
        fo2 fo2Var2 = fo2.c;
        return new ho2("ad_response", MapsKt.toMutableMap(a.a), a.b);
    }
}
