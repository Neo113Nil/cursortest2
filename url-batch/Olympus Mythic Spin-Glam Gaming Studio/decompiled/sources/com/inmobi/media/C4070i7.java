package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4070i7 {
    public static final C4070i7 a = new C4070i7();
    public static InMobiUserDataModel b;
    public static final Mutex c;

    static {
        Intrinsics.checkNotNullExpressionValue(C4070i7.class.getSimpleName(), "getSimpleName(...)");
        c = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, ContinuationImpl continuationImpl) {
        C4044h7 c4044h7;
        int i;
        Mutex mutex;
        try {
            if (continuationImpl instanceof C4044h7) {
                c4044h7 = (C4044h7) continuationImpl;
                int i2 = c4044h7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4044h7.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4044h7.c;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4044h7.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = c;
                        c4044h7.a = inMobiUserDataModel;
                        c4044h7.b = mutex;
                        c4044h7.d = 1;
                        if (mutex.lock(null, c4044h7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = c4044h7.b;
                        InMobiUserDataModel inMobiUserDataModel2 = c4044h7.a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        inMobiUserDataModel = inMobiUserDataModel2;
                    }
                    Objects.toString(b);
                    Objects.toString(inMobiUserDataModel);
                    b = inMobiUserDataModel;
                    return Unit.INSTANCE;
                }
            }
            Objects.toString(b);
            Objects.toString(inMobiUserDataModel);
            b = inMobiUserDataModel;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        c4044h7 = new C4044h7(continuationImpl);
        Object obj2 = c4044h7.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4044h7.d;
        if (i != 0) {
        }
    }

    public final String toString() {
        return String.valueOf(b);
    }
}
