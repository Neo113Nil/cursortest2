package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4084il {
    public static final C4084il a = new C4084il();
    public static final Hh b = new Hh();
    public static final LinkedHashSet c = new LinkedHashSet();
    public static Deferred d;
    public static C4162ll e;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (a((kotlin.coroutines.Continuation) r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (com.inmobi.media.N3.a(r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3978el c3978el;
        int i;
        if (continuationImpl instanceof C3978el) {
            c3978el = (C3978el) continuationImpl;
            int i2 = c3978el.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3978el.c = i2 - Integer.MIN_VALUE;
                Object obj = c3978el.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3978el.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Hh hh = b;
                    C4005fl c4005fl = new C4005fl(null);
                    c3978el.c = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                c3978el.c = 2;
            }
        }
        c3978el = new C3978el(this, continuationImpl);
        Object obj2 = c3978el.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3978el.c;
        if (i != 0) {
        }
        c3978el.c = 2;
    }

    public static Object a(Continuation continuation) {
        Hh hh = AbstractC4477xj.a;
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        Object a2 = N3.a(b, new C4032gl(unifiedIdServiceConfig, null), continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        if (inMobiUnifiedIdInterface != null) {
            Boxing.boxBoolean(c.add(inMobiUnifiedIdInterface));
        }
        if (b.b.get() != null) {
            Objects.toString(inMobiUnifiedIdInterface);
            return Unit.INSTANCE;
        }
        Object a2 = a(continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
