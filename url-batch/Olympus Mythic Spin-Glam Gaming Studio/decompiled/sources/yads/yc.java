package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.X3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class yc extends SuspendLambda implements Function2 {
    public final /* synthetic */ cd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(cd cdVar, Continuation continuation) {
        super(2, continuation);
        this.b = cdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new yc(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yc(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Class<AdvertisingIdClient> cls;
        mc mcVar;
        ResolveInfo resolveInfo;
        Object a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wy0 wy0Var = this.b.b;
        zy0 zy0Var = wy0Var.a;
        zy0Var.getClass();
        mc mcVar2 = null;
        try {
            try {
                cls = AdvertisingIdClient.class;
                int i = AdvertisingIdClient.$r8$clinit;
            } catch (Throwable unused) {
                boolean z = ob1.a;
                cls = null;
            }
        } catch (Throwable unused2) {
            boolean z2 = ob1.a;
        }
        if (cls != null && (a = sm2.a(cls, "getAdvertisingIdInfo", zy0Var.a)) != null) {
            String str = (String) rm2.a(a, "getId", new Object[0]);
            Boolean bool = (Boolean) rm2.a(a, X3.j.M, new Object[0]);
            if (bool != null && str != null) {
                mcVar = new mc(str, bool.booleanValue());
                if (mcVar == null) {
                    return mcVar;
                }
                bz0 bz0Var = wy0Var.b;
                bz0Var.c.getClass();
                Intent a2 = dz0.a();
                ss2 ss2Var = bz0Var.a;
                Context context = bz0Var.d;
                ss2Var.getClass();
                try {
                    resolveInfo = context.getPackageManager().resolveService(a2, 0);
                } catch (Throwable unused3) {
                    boolean z3 = ob1.a;
                    resolveInfo = null;
                }
                if (resolveInfo == null) {
                    return null;
                }
                try {
                    yy0 yy0Var = new yy0();
                    if (bz0Var.d.bindService(a2, yy0Var, 1)) {
                        mc a3 = bz0Var.b.a(yy0Var);
                        bz0Var.d.unbindService(yy0Var);
                        mcVar2 = a3;
                    } else {
                        boolean z4 = ob1.a;
                    }
                    return mcVar2;
                } catch (Throwable unused4) {
                    boolean z5 = ob1.a;
                    return mcVar2;
                }
            }
        }
        mcVar = null;
        if (mcVar == null) {
        }
    }
}
