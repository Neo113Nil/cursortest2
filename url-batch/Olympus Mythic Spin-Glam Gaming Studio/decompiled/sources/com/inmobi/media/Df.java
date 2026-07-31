package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes9.dex */
public final class Df {
    public static final Df a = new Df();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static Gf c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C4525zf c4525zf;
        Object obj;
        int i;
        Context context;
        AdConfig.OmidConfig omidConfig;
        if (continuationImpl instanceof C4525zf) {
            c4525zf = (C4525zf) continuationImpl;
            int i2 = c4525zf.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4525zf.e = i2 - Integer.MIN_VALUE;
                obj = c4525zf.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4525zf.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4277q4 c4277q4 = AbstractC4015g4.a;
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    AdConfig.OmidConfig omidConfig2 = ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getViewability().getOmidConfig();
                    Context context2 = AbstractC4002fj.a;
                    if (context2 == null) {
                        return Unit.INSTANCE;
                    }
                    c4525zf.a = omidConfig2;
                    c4525zf.b = context2;
                    c4525zf.e = 1;
                    Object a2 = a(context2, omidConfig2, c4525zf);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    context = context2;
                    omidConfig = omidConfig2;
                    obj = a2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = c4525zf.b;
                    omidConfig = c4525zf.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                b.set(2);
                BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new Af(omidConfig, context, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        c4525zf = new C4525zf(this, continuationImpl);
        obj = c4525zf.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4525zf.e;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, AdConfig.OmidConfig omidConfig, ContinuationImpl continuationImpl) {
        Cf cf;
        Object obj;
        int i;
        if (continuationImpl instanceof Cf) {
            cf = (Cf) continuationImpl;
            int i2 = cf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cf.c = i2 - Integer.MIN_VALUE;
                obj = cf.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cf.c;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AtomicInteger atomicInteger = b;
                    if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                        Gf gf = c;
                        if (gf == null) {
                            gf = new Gf(context);
                            c = gf;
                        }
                        cf.c = 1;
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new Ef(gf, omidConfig, null), cf);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
        }
        cf = new Cf(this, continuationImpl);
        obj = cf.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cf.c;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boxing.boxBoolean(z2);
    }
}
