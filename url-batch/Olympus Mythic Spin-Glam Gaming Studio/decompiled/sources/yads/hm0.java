package yads;

import android.content.Context;
import com.ironsource.O6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class hm0 {
    public final v3 a;
    public final cm b;
    public final da c;
    public final n92 d;

    public hm0(v3 v3Var, yu2 yu2Var, ap apVar) {
        cm cmVar = new cm();
        da daVar = new da(apVar);
        n92 n92Var = new n92(new so1(v3Var, yu2Var, null));
        this.a = v3Var;
        this.b = cmVar;
        this.c = daVar;
        this.d = n92Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        gm0 gm0Var;
        int i;
        Object obj;
        if (continuationImpl instanceof gm0) {
            gm0Var = (gm0) continuationImpl;
            int i2 = gm0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gm0Var.d = i2 - Integer.MIN_VALUE;
                Object obj2 = gm0Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gm0Var.d;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj2);
                        return a((JSONArray) obj2);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return a((JSONArray) obj2);
                }
                ResultKt.throwOnFailure(obj2);
                String str = this.a.c.a;
                Iterator it = this.c.a.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((ba) obj).b, str)) {
                        break;
                    }
                }
                ba baVar = (ba) obj;
                if (baVar == null) {
                    return null;
                }
                ArrayList arrayList = baVar.c;
                v3 v3Var = this.a;
                if (v3Var.a != e00.d) {
                    n92 n92Var = this.d;
                    gm0Var.d = 2;
                    n92Var.getClass();
                    obj2 = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new l92(n92Var, context, null, arrayList, null), gm0Var);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return a((JSONArray) obj2);
                }
                l03 l03Var = v3Var.d.a;
                if (l03Var == null) {
                    boolean z = ob1.a;
                    return null;
                }
                n92 n92Var2 = this.d;
                gm0Var.d = 1;
                n92Var2.getClass();
                obj2 = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new l92(n92Var2, context, l03Var, arrayList, null), gm0Var);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return a((JSONArray) obj2);
            }
        }
        gm0Var = new gm0(this, continuationImpl);
        Object obj22 = gm0Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gm0Var.d;
        if (i == 0) {
        }
    }

    public final String a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(O6.E1, jSONArray);
                cm cmVar = this.b;
                String jSONObject2 = jSONObject.toString();
                cmVar.getClass();
                return cm.a(jSONObject2);
            } catch (JSONException unused) {
                boolean z = ob1.a;
            }
        }
        return null;
    }
}
