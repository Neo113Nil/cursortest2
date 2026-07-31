package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class zc extends SuspendLambda implements Function2 {
    public final /* synthetic */ cd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(cd cdVar, Continuation continuation) {
        super(2, continuation);
        this.b = cdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zc(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zc(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ResolveInfo resolveInfo;
        mc mcVar;
        OpenDeviceIdentifierService openDeviceIdentifierService;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        b01 b01Var = this.b.c;
        b01Var.c.getClass();
        Intent a = e01.a();
        ss2 ss2Var = b01Var.a;
        Context context = b01Var.d;
        ss2Var.getClass();
        try {
            resolveInfo = context.getPackageManager().resolveService(a, 0);
        } catch (Throwable unused) {
            boolean z = ob1.a;
            resolveInfo = null;
        }
        if (resolveInfo == null) {
            return null;
        }
        try {
            com.monetization.ads.core.identifiers.ad.huawei.a aVar = new com.monetization.ads.core.identifiers.ad.huawei.a();
            if (!b01Var.d.bindService(a, aVar, 1)) {
                boolean z2 = ob1.a;
                return null;
            }
            b01Var.b.getClass();
            try {
                openDeviceIdentifierService = (OpenDeviceIdentifierService) aVar.a.poll(5L, TimeUnit.SECONDS);
            } catch (Exception unused2) {
                boolean z3 = ob1.a;
            }
            if (openDeviceIdentifierService != null) {
                String oaid = openDeviceIdentifierService.getOaid();
                boolean oaidTrackLimited = openDeviceIdentifierService.getOaidTrackLimited();
                if (oaid != null) {
                    mcVar = new mc(oaid, oaidTrackLimited);
                    b01Var.d.unbindService(aVar);
                    return mcVar;
                }
            }
            mcVar = null;
            b01Var.d.unbindService(aVar);
            return mcVar;
        } catch (Throwable unused3) {
            boolean z4 = ob1.a;
            return null;
        }
    }
}
