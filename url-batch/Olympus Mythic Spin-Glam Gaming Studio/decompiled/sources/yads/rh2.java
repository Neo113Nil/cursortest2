package yads;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes12.dex */
public final class rh2 {
    public final jv a;
    public final iv b;
    public final lo1 c;
    public final gh2 d;
    public final hh2 e;

    public rh2(so1 so1Var, jv jvVar) {
        iv ivVar = new iv();
        lo1 lo1Var = new lo1(so1Var);
        gh2 gh2Var = new gh2();
        hh2 hh2Var = new hh2();
        this.a = jvVar;
        this.b = ivVar;
        this.c = lo1Var;
        this.d = gh2Var;
        this.e = hh2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(rh2 rh2Var, Context context, e00 e00Var, l03 l03Var, List list, long j, ContinuationImpl continuationImpl) {
        oh2 oh2Var;
        Object obj;
        Object coroutine_suspended;
        int i;
        List list2;
        rh2Var.getClass();
        if (continuationImpl instanceof oh2) {
            oh2Var = (oh2) continuationImpl;
            int i2 = oh2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oh2Var.d = i2 - Integer.MIN_VALUE;
                obj = oh2Var.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = oh2Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        tg2 tg2Var = tg2.d;
                        return new xg2(CollectionsKt.listOf(xq1.a()));
                    }
                    ph2 ph2Var = new ph2(j, context, list, null, e00Var, rh2Var, l03Var);
                    oh2Var.d = 1;
                    obj = CoroutineScopeKt.coroutineScope(ph2Var, oh2Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        list2 = (List) obj;
                        if (!list2.isEmpty()) {
                            return new xg2(list2);
                        }
                        tg2 tg2Var2 = tg2.d;
                        return new xg2(CollectionsKt.listOf(xq1.a()));
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                qh2 qh2Var = new qh2((List) obj, null);
                oh2Var.d = 2;
                obj = BuildersKt.withContext(io2, qh2Var, oh2Var);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = (List) obj;
                if (!list2.isEmpty()) {
                }
            }
        }
        oh2Var = new oh2(rh2Var, continuationImpl);
        obj = oh2Var.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = oh2Var.d;
        if (i != 0) {
        }
        CoroutineDispatcher io22 = Dispatchers.getIO();
        qh2 qh2Var2 = new qh2((List) obj, null);
        oh2Var.d = 2;
        obj = BuildersKt.withContext(io22, qh2Var2, oh2Var);
        if (obj == coroutine_suspended) {
        }
        list2 = (List) obj;
        if (!list2.isEmpty()) {
        }
    }

    public static final void a(rh2 rh2Var, er1 er1Var) {
        rh2Var.getClass();
        if (StringsKt.contains((CharSequence) er1Var.b, (CharSequence) "LevelPlay", true)) {
            List listOf = CollectionsKt.listOf((Object[]) new String[]{MBridgeConstans.APP_KEY, "placement_name"});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOf) {
                if (!er1Var.c.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Required configuration parameters are missing");
            }
        }
    }
}
