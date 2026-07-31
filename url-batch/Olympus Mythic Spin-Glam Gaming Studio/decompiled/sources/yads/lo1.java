package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes6.dex */
public final class lo1 {
    public final so1 a;
    public final ws1 b;

    public lo1(so1 so1Var) {
        ws1 ws1Var = new ws1();
        this.a = so1Var;
        this.b = ws1Var;
    }

    public final com.monetization.ads.mediation.base.a a(Context context, er1 er1Var, Class cls) {
        String format;
        com.monetization.ads.mediation.base.a aVar = null;
        try {
            String str = er1Var.b;
            this.b.getClass();
            if (ws1.a.contains(str) && !tq0.a(context, sq0.d)) {
                return null;
            }
            Object a = rm2.a(str, new Object[0]);
            com.monetization.ads.mediation.base.a aVar2 = (com.monetization.ads.mediation.base.a) cls.cast(a);
            if (aVar2 == null) {
                try {
                    if (a == null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        format = String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    } else {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        format = String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{a.getClass().getName(), cls.getName()}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    }
                    a(context, er1Var, format);
                } catch (ClassCastException e) {
                    e = e;
                    aVar = aVar2;
                    a(context, er1Var, "does_not_conform_to_protocol", e);
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar2;
                    a(context, er1Var, "could_not_create_adapter", th);
                    return aVar;
                }
            }
            return aVar2;
        } catch (ClassCastException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(Context context, er1 er1Var, String str, Throwable th) {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("reason", str));
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        boolean z = ob1.a;
        mutableMapOf.put("description", th.getClass().getName() + " " + message);
        this.a.a(context, er1Var, mutableMapOf);
    }

    public final void a(Context context, er1 er1Var, String str) {
        Map mapOf = MapsKt.mapOf(TuplesKt.to("reason", "could_not_create_adapter"), TuplesKt.to("description", str));
        so1 so1Var = this.a;
        so1Var.getClass();
        so1Var.a(context, fo2.e, er1Var, null, mapOf);
    }
}
