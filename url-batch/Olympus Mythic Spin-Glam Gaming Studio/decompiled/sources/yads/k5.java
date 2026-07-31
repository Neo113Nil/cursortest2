package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k5 {
    public final v3 a;
    public final mt1 b;
    public final j5 c;
    public final od d;
    public gp2 e;
    public x12 f;
    public boolean g;

    public k5(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var) {
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        j5 j5Var = new j5(i5Var);
        od odVar = new od(context);
        this.a = v3Var;
        this.b = a;
        this.c = j5Var;
        this.d = odVar;
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "success");
        hashMap.put("durations", this.c.a());
        hashMap.put("load_listener_available", Boolean.valueOf(this.g));
        a(hashMap);
    }

    public final void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "error");
        hashMap.put("failure_reason", str);
        hashMap.put("reason", str2);
        hashMap.put("durations", this.c.a());
        hashMap.put("load_listener_available", Boolean.valueOf(this.g));
        a(hashMap);
    }

    public final void a(HashMap hashMap) {
        io2 io2Var = new io2(hashMap, 2);
        gp2 gp2Var = this.e;
        if (gp2Var != null) {
            io2Var.a.putAll(gp2Var.a());
        }
        x12 x12Var = this.f;
        if (x12Var != null) {
            io2Var = jo2.a(io2Var, x12Var.a());
        }
        fo2 fo2Var = fo2.c;
        Map map = io2Var.a;
        c cVar = io2Var.b;
        Map mutableMap = MapsKt.toMutableMap(map);
        this.b.a(new ho2("ad_loading_result", mutableMap, cVar));
        if (Intrinsics.areEqual(hashMap.get("status"), "success")) {
            od odVar = this.d;
            fo2 fo2Var2 = fo2.c;
            String str = this.a.l;
            if (str == null) {
                str = do2.a;
            }
            odVar.a(fo2Var2, mutableMap, str, null);
        }
    }

    public final void a(Object... objArr) {
        int length = objArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (objArr[i] != null) {
                z = true;
                break;
            }
            i++;
        }
        this.g = z;
    }
}
