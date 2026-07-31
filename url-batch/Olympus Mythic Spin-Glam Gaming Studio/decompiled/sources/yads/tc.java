package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes4.dex */
public final class tc {
    public static final Object f = new Object();
    public static volatile tc g;
    public final cd a;
    public final pc b;
    public final uc c;
    public final tb0 d;
    public final Deferred e;

    public tc(Context context) {
        Deferred async$default;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new a20()));
        fd fdVar = new fd(context);
        cd cdVar = new cd(context);
        pc pcVar = new pc(context);
        uc ucVar = new uc();
        this.a = cdVar;
        this.b = pcVar;
        this.c = ucVar;
        bu2 a = fdVar.a.a(fdVar.b);
        Long l = a != null ? a.U0 : null;
        this.d = new tb0((l == null || l.longValue() <= 0) ? 1000L : l.longValue(), TimeUnit.MILLISECONDS);
        async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScope, null, CoroutineStart.LAZY, new qc(this, null), 1, null);
        this.e = async$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        rc rcVar;
        int i;
        oc ocVar;
        bu2 a;
        boolean z;
        oc ocVar2;
        mc mcVar;
        mc mcVar2;
        String str;
        String c;
        String c2;
        String c3;
        if (continuationImpl instanceof rc) {
            rcVar = (rc) continuationImpl;
            int i2 = rcVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rcVar.d = i2 - Integer.MIN_VALUE;
                Object obj = rcVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rcVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long longValue = ((Number) this.d.c.getValue()).longValue();
                    sc scVar = new sc(this, null);
                    rcVar.d = 1;
                    obj = TimeoutKt.withTimeoutOrNull(longValue, scVar, rcVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ocVar = (oc) obj;
                pc pcVar = this.b;
                a = pcVar.b.a(pcVar.c);
                z = false;
                if (a == null && a.T0) {
                    kc kcVar = pcVar.a;
                    kcVar.getClass();
                    synchronized (kc.b) {
                        c = ((qg1) kcVar.a).c("google_advertising_id_key");
                        c2 = ((qg1) kcVar.a).c("huawei_advertising_id_key");
                        c3 = ((qg1) kcVar.a).c("app_set_advertising_id_key");
                    }
                    ocVar2 = new oc(c != null ? new mc(c, false) : null, c2 != null ? new mc(c2, false) : null, false, c3);
                } else {
                    ocVar2 = null;
                }
                this.c.getClass();
                if (ocVar != null || (mcVar = ocVar.a) == null) {
                    mcVar = ocVar2 == null ? ocVar2.a : null;
                }
                if (ocVar != null || (mcVar2 = ocVar.b) == null) {
                    mcVar2 = ocVar2 == null ? ocVar2.b : null;
                }
                if (ocVar == null) {
                    z = ocVar.c;
                } else if (ocVar2 != null) {
                    z = ocVar2.c;
                }
                if (ocVar != null || (str = ocVar.d) == null) {
                    str = ocVar2 == null ? ocVar2.d : null;
                }
                if (mcVar != null && mcVar2 == null && str == null) {
                    return null;
                }
                return new oc(mcVar, mcVar2, z, str);
            }
        }
        rcVar = new rc(this, continuationImpl);
        Object obj2 = rcVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rcVar.d;
        if (i != 0) {
        }
        ocVar = (oc) obj2;
        pc pcVar2 = this.b;
        a = pcVar2.b.a(pcVar2.c);
        z = false;
        if (a == null) {
        }
        ocVar2 = null;
        this.c.getClass();
        if (ocVar != null) {
        }
        if (ocVar2 == null) {
        }
        if (ocVar != null) {
        }
        if (ocVar2 == null) {
        }
        if (ocVar == null) {
        }
        if (ocVar != null) {
        }
        if (ocVar2 == null) {
        }
        if (mcVar != null) {
        }
        return new oc(mcVar, mcVar2, z, str);
    }
}
