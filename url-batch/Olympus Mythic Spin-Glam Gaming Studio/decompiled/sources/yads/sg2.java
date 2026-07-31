package yads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class sg2 {
    public final z83 a;
    public final hv b;
    public final y0 c;
    public final ng2 d;
    public final cg0 e;
    public final wu f;

    public sg2(v3 v3Var, yu2 yu2Var, t8 t8Var, z83 z83Var, hv hvVar) {
        y0 y0Var = new y0();
        ng2 ng2Var = new ng2();
        cg0 cg0Var = new cg0(v3Var, yu2Var, t8Var);
        wu wuVar = new wu();
        this.a = z83Var;
        this.b = hvVar;
        this.c = y0Var;
        this.d = ng2Var;
        this.e = cg0Var;
        this.f = wuVar;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.y);
        p0.startActivity(p1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0084 -> B:10:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, ContinuationImpl continuationImpl) {
        rg2 rg2Var;
        int i;
        Context context2;
        Iterator it;
        Context context3;
        if (continuationImpl instanceof rg2) {
            rg2Var = (rg2) continuationImpl;
            int i2 = rg2Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rg2Var.g = i2 - Integer.MIN_VALUE;
                Object obj = rg2Var.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rg2Var.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Context a = h1.a();
                    if (a != null) {
                        context = a;
                    } else {
                        this.c.getClass();
                        int i3 = 0;
                        Context context4 = context;
                        while (context4 instanceof ContextWrapper) {
                            int i4 = i3 + 1;
                            if (i3 >= 10) {
                                break;
                            }
                            if (context4 instanceof Activity) {
                                context2 = (Activity) context4;
                                break;
                            }
                            context4 = ((ContextWrapper) context4).getBaseContext();
                            i3 = i4;
                        }
                        context2 = null;
                        if (context2 != null) {
                            context = context2;
                        }
                    }
                    it = list.iterator();
                    context3 = context;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mg2 mg2Var = rg2Var.d;
                    it = rg2Var.c;
                    context3 = rg2Var.b;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return mg2Var;
                    }
                    if (it.hasNext()) {
                        mg2Var = (mg2) it.next();
                        rg2Var.b = context3;
                        rg2Var.c = it;
                        rg2Var.d = mg2Var;
                        rg2Var.g = 1;
                        obj = a(context3, mg2Var, rg2Var);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        rg2Var = new rg2(this, continuationImpl);
        Object obj2 = rg2Var.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rg2Var.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[Catch: Exception -> 0x00ab, TryCatch #1 {Exception -> 0x00ab, blocks: (B:11:0x002c, B:12:0x0062, B:14:0x008b, B:15:0x008f, B:17:0x0095, B:19:0x00a3), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, mg2 mg2Var, ContinuationImpl continuationImpl) {
        qg2 qg2Var;
        int i;
        qu quVar;
        qu quVar2;
        List list;
        List list2;
        if (continuationImpl instanceof qg2) {
            qg2Var = (qg2) continuationImpl;
            int i2 = qg2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qg2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = qg2Var.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qg2Var.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    quVar = new qu(mg2Var);
                    try {
                        this.d.getClass();
                        Intent a = ng2.a(context, mg2Var);
                        if (mg2Var.e == nb0.d) {
                            cg0 cg0Var = this.e;
                            qg2Var.b = mg2Var;
                            qg2Var.c = quVar;
                            qg2Var.f = 1;
                            if (cg0Var.a(context, a, qg2Var) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
                        }
                        quVar2 = quVar;
                    } catch (Exception unused) {
                        z83 z83Var = this.a;
                        list = mg2Var.g;
                        Map emptyMap = MapsKt.emptyMap();
                        io2 a2 = z83Var.e.a(z83Var.b, z83Var.c);
                        z83Var.d.getClass();
                        Map plus = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(quVar))), emptyMap);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                z83Var.a.a((String) it.next(), a93.c, plus, a2);
                            }
                        }
                        a(mg2Var, quVar, false);
                        boolean z = ob1.a;
                        return Boxing.boxBoolean(false);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    quVar2 = qg2Var.c;
                    mg2Var = qg2Var.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception unused2) {
                        quVar = quVar2;
                        z83 z83Var2 = this.a;
                        list = mg2Var.g;
                        Map emptyMap2 = MapsKt.emptyMap();
                        io2 a22 = z83Var2.e.a(z83Var2.b, z83Var2.c);
                        z83Var2.d.getClass();
                        Map plus2 = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(quVar))), emptyMap2);
                        if (list != null) {
                        }
                        a(mg2Var, quVar, false);
                        boolean z2 = ob1.a;
                        return Boxing.boxBoolean(false);
                    }
                }
                z83 z83Var3 = this.a;
                list2 = mg2Var.f;
                Map emptyMap3 = MapsKt.emptyMap();
                io2 a3 = z83Var3.e.a(z83Var3.b, z83Var3.c);
                z83Var3.d.getClass();
                Map plus3 = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(quVar2))), emptyMap3);
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        z83Var3.a.a((String) it2.next(), a93.c, plus3, a3);
                    }
                }
                a(mg2Var, quVar2, true);
                return Boxing.boxBoolean(true);
            }
        }
        qg2Var = new qg2(this, continuationImpl);
        Object obj2 = qg2Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qg2Var.f;
        if (i != 0) {
        }
        z83 z83Var32 = this.a;
        list2 = mg2Var.f;
        Map emptyMap32 = MapsKt.emptyMap();
        io2 a32 = z83Var32.e.a(z83Var32.b, z83Var32.c);
        z83Var32.d.getClass();
        Map plus32 = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(quVar2))), emptyMap32);
        if (list2 != null) {
        }
        a(mg2Var, quVar2, true);
        return Boxing.boxBoolean(true);
    }

    public final void a(mg2 mg2Var, qu quVar, boolean z) {
        this.f.getClass();
        String a = wu.a(quVar);
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("click_url", ib3.a(mg2Var.b));
        createMapBuilder.put("deeplink_package_name", mg2Var.a);
        createMapBuilder.put("deeplink_success", Boolean.valueOf(z));
        if (z) {
            createMapBuilder.put("click_destination", a);
        }
        Map mutableMap = MapsKt.toMutableMap(MapsKt.build(createMapBuilder));
        hv hvVar = this.b;
        fo2 fo2Var = fo2.t;
        ho2 a2 = hvVar.a(fo2Var, mutableMap);
        hvVar.d.a(a2);
        hvVar.f.a(fo2Var, a2.b, do2.a, null);
    }
}
