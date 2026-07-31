package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.RootConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes12.dex */
public final class Kh implements FlowCollector {
    public final /* synthetic */ Mh a;
    public final /* synthetic */ FlowCollector b;
    public final /* synthetic */ Ref$ObjectRef c;

    public Kh(Mh mh, FlowCollector flowCollector, Ref$ObjectRef ref$ObjectRef) {
        this.a = mh;
        this.b = flowCollector;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fa, code lost:
    
        if (r12.emit(r1, r0) != r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fc, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        if (r12 == r8) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v20, types: [T, java.util.ArrayList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(AbstractC4461x4 abstractC4461x4, Continuation continuation) {
        Jh jh;
        int i;
        Object obj;
        if (continuation instanceof Jh) {
            jh = (Jh) continuation;
            int i2 = jh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jh.d = i2 - Integer.MIN_VALUE;
                Object obj2 = jh.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jh.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!(abstractC4461x4 instanceof C4488y4)) {
                        if (!(abstractC4461x4 instanceof C4093j4)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                    Mh mh = this.a;
                    C4488y4 c4488y4 = (C4488y4) abstractC4461x4;
                    jh.a = abstractC4461x4;
                    jh.d = 1;
                    int i3 = c4488y4.a;
                    if (i3 == 200) {
                        C4067i4 c4067i4 = mh.a;
                        Config config = c4488y4.b;
                        C4308r9 c4308r9 = c4067i4.a;
                        Intrinsics.checkNotNullParameter(config, "<this>");
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("config_value", config.toJson().toString());
                        contentValues.put("config_type", config.getType());
                        contentValues.put("update_ts", Long.valueOf(config.getLastUpdateTimeStamp()));
                        obj = c4308r9.a("config_db", contentValues, 5, jh);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else if (i3 == 304) {
                        C4067i4 c4067i42 = mh.a;
                        String type = c4488y4.b.getType();
                        long lastUpdateTimeStamp = c4488y4.b.getLastUpdateTimeStamp();
                        c4067i42.getClass();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("update_ts", Boxing.boxLong(lastUpdateTimeStamp));
                        obj = C4308r9.a(c4067i42.a, "config_db", contentValues2, "config_type=?", new String[]{type}, jh, 16);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC4461x4 = jh.a;
                        ResultKt.throwOnFailure(obj2);
                        if (((C4488y4) abstractC4461x4).b instanceof RootConfig) {
                            this.c.element = Mh.a(this.a);
                        }
                        return Unit.INSTANCE;
                    }
                    abstractC4461x4 = jh.a;
                    ResultKt.throwOnFailure(obj2);
                }
                FlowCollector flowCollector = this.b;
                Config config2 = ((C4488y4) abstractC4461x4).b;
                jh.a = abstractC4461x4;
                jh.d = 2;
            }
        }
        jh = new Jh(this, continuation);
        Object obj22 = jh.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jh.d;
        if (i != 0) {
        }
        FlowCollector flowCollector2 = this.b;
        Config config22 = ((C4488y4) abstractC4461x4).b;
        jh.a = abstractC4461x4;
        jh.d = 2;
    }
}
