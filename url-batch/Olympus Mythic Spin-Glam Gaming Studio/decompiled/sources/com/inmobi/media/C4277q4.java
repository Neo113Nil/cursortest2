package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4277q4 {
    public final C4329s4 a;
    public final C4302r4 b;

    public C4277q4(C4329s4 configManagerState, C4302r4 configManagerDI) {
        Intrinsics.checkNotNullParameter(configManagerState, "configManagerState");
        Intrinsics.checkNotNullParameter(configManagerDI, "configManagerDI");
        this.a = configManagerState;
        this.b = configManagerDI;
    }

    public final Config a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String a = B4.a(clazz);
        Config config = (Config) this.a.b.get(a);
        if (config == null) {
            String[] strArr = C4514z4.a;
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                if (this.a.b.get(str) == null) {
                    this.a.b.put(str, AbstractC4383u5.a(str));
                }
            }
            config = (Config) this.a.b.get(a);
            BuildersKt__Builders_commonKt.launch$default(this.b.a, null, null, new C4198n4(this, null), 3, null);
        }
        Intrinsics.checkNotNull(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C4225o4 c4225o4;
        int i;
        int i2;
        if (continuationImpl instanceof C4225o4) {
            c4225o4 = (C4225o4) continuationImpl;
            int i3 = c4225o4.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4225o4.c = i3 - Integer.MIN_VALUE;
                Object obj = c4225o4.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4225o4.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.a.a.getAndSet(true)) {
                        return Unit.INSTANCE;
                    }
                    c4225o4.c = 1;
                    if (a(c4225o4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String[] strArr = C4514z4.a;
                for (i2 = 0; i2 < 5; i2++) {
                    String str = strArr[i2];
                    if (this.a.b.get(str) == null) {
                        this.a.b.put(str, AbstractC4383u5.a(str));
                    }
                }
                BuildersKt__Builders_commonKt.launch$default(this.b.a, null, null, new C4251p4(this, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        c4225o4 = new C4225o4(this, continuationImpl);
        Object obj2 = c4225o4.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4225o4.c;
        if (i != 0) {
        }
        String[] strArr2 = C4514z4.a;
        while (i2 < 5) {
        }
        BuildersKt__Builders_commonKt.launch$default(this.b.a, null, null, new C4251p4(this, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:11:0x004d->B:13:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C4145l4 c4145l4;
        int i;
        if (continuationImpl instanceof C4145l4) {
            c4145l4 = (C4145l4) continuationImpl;
            int i2 = c4145l4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4145l4.c = i2 - Integer.MIN_VALUE;
                Object obj = c4145l4.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4145l4.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4067i4 c4067i4 = (C4067i4) this.b.b.getValue();
                    c4145l4.c = 1;
                    obj = c4067i4.a(c4145l4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                for (Config config : (Iterable) obj) {
                    config.getType();
                    this.a.b.put(config.getType(), config);
                }
                return Unit.INSTANCE;
            }
        }
        c4145l4 = new C4145l4(this, continuationImpl);
        Object obj2 = c4145l4.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4145l4.c;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
