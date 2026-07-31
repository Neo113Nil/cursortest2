package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;

/* loaded from: classes15.dex */
public final class jm0 {
    public final v3 a;
    public final ea b;
    public final rh2 c;
    public final Json d;

    public jm0(v3 v3Var, yu2 yu2Var, ap apVar) {
        ea eaVar = new ea(apVar);
        rh2 rh2Var = new rh2(new so1(v3Var, yu2Var, null), new jv(v3Var, yu2Var));
        Json json = ad1.a;
        this.a = v3Var;
        this.b = eaVar;
        this.c = rh2Var;
        this.d = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        im0 im0Var;
        int i;
        ns1 ns1Var;
        List list;
        Object obj;
        if (continuationImpl instanceof im0) {
            im0Var = (im0) continuationImpl;
            int i2 = im0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                im0Var.d = i2 - Integer.MIN_VALUE;
                Object obj2 = im0Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = im0Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    String str = this.a.c.a;
                    vs1 vs1Var = this.b.a.c;
                    if (vs1Var != null && (list = vs1Var.c) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.areEqual(((ms1) obj).b, str)) {
                                break;
                            }
                        }
                        ms1 ms1Var = (ms1) obj;
                        if (ms1Var != null) {
                            ns1Var = new ns1(ms1Var.b, ms1Var.c, vs1Var.b);
                            if (ns1Var != null || str == null) {
                                return null;
                            }
                            v3 v3Var = this.a;
                            e00 e00Var = v3Var.a;
                            l03 l03Var = v3Var.d.a;
                            List list2 = ns1Var.b;
                            long j = ns1Var.c;
                            rh2 rh2Var = this.c;
                            im0Var.d = 1;
                            rh2Var.getClass();
                            obj2 = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new nh2(j, context, list2, null, e00Var, rh2Var, l03Var), im0Var);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    ns1Var = null;
                    if (ns1Var != null) {
                        return null;
                    }
                    v3 v3Var2 = this.a;
                    e00 e00Var2 = v3Var2.a;
                    l03 l03Var2 = v3Var2.d.a;
                    List list22 = ns1Var.b;
                    long j2 = ns1Var.c;
                    rh2 rh2Var2 = this.c;
                    im0Var.d = 1;
                    rh2Var2.getClass();
                    obj2 = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new nh2(j2, context, list22, null, e00Var2, rh2Var2, l03Var2), im0Var);
                    if (obj2 == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                Json json = this.d;
                json.getSerializersModule();
                return json.encodeToString(xg2.Companion.serializer(), (xg2) obj2);
            }
        }
        im0Var = new im0(this, continuationImpl);
        Object obj22 = im0Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = im0Var.d;
        if (i != 0) {
        }
        Json json2 = this.d;
        json2.getSerializersModule();
        return json2.encodeToString(xg2.Companion.serializer(), (xg2) obj22);
    }
}
