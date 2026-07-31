package com.inmobi.media;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4372tk extends SuspendLambda implements Function2 {
    public Object a;
    public Mutex b;
    public int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ EnumC4530zk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4372tk(String str, Map map, EnumC4530zk enumC4530zk, Continuation continuation) {
        super(2, continuation);
        this.d = str;
        this.e = map;
        this.f = enumC4530zk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4372tk(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4372tk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x014b, code lost:
    
        if (r13.a(r1, r12) == r2) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int a;
        String str;
        Dk dk;
        Mutex mutex;
        ?? r0 = "toString(...)";
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            try {
            } catch (Throwable th) {
                r0.unlock(null);
                throw th;
            }
        } catch (Exception e) {
            C4425vk c4425vk = C4425vk.a;
            e.getMessage();
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4425vk c4425vk2 = C4425vk.a;
            Map map = this.e;
            EnumC4530zk enumC4530zk = this.f;
            Objects.toString(map);
            Objects.toString(enumC4530zk);
            if (C4425vk.h == null) {
                return Unit.INSTANCE;
            }
            if (C4425vk.a(this.d, this.e, this.f)) {
                return Unit.INSTANCE;
            }
            Ik ik = C4425vk.h;
            if (ik == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTelemetryValidator");
                ik = null;
            }
            EnumC4530zk telemetryEventType = this.f;
            String eventType = this.d;
            ik.getClass();
            Intrinsics.checkNotNullParameter(telemetryEventType, "telemetryEventType");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            int ordinal = telemetryEventType.ordinal();
            if (ordinal == 0) {
                a = ik.b.a(eventType);
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                a = ik.c.a(eventType);
            }
            if (a != 0) {
                if (a != 1) {
                    return Unit.INSTANCE;
                }
                if (this.e.get("samplingRate") == null) {
                    this.e.put("samplingRate", Boxing.boxInt(100));
                }
            } else if (this.e.get("samplingRate") == null) {
                this.e.put("samplingRate", Boxing.boxInt(MathKt.roundToInt((1 - C4425vk.b().getSamplingFactor()) * 100)));
            }
            String str2 = this.d;
            int ordinal2 = this.f.ordinal();
            if (ordinal2 == 0) {
                str = "sdk";
            } else {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "template";
            }
            Dk dk2 = new Dk(str2, null, str);
            this.e.put("eventType", dk2.a);
            Map map2 = this.e;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            map2.put("eventId", uuid);
            this.e.put("isTemplateEvent", Boxing.boxBoolean(this.f == EnumC4530zk.b));
            Map map3 = this.e;
            Intrinsics.checkNotNull(map3, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String payload = new JSONObject(map3).toString();
            Intrinsics.checkNotNullExpressionValue(payload, "toString(...)");
            Intrinsics.checkNotNullParameter(payload, "payload");
            dk2.b = payload;
            Mutex mutex2 = C4425vk.b;
            this.a = dk2;
            this.b = mutex2;
            this.c = 1;
            if (mutex2.lock(null, this) != coroutine_suspended) {
                dk = dk2;
                mutex = mutex2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex3 = (Mutex) this.a;
            ResultKt.throwOnFailure(obj);
            r0 = mutex3;
            C4425vk.a.a();
            Unit unit = Unit.INSTANCE;
            r0.unlock(null);
            return Unit.INSTANCE;
        }
        Mutex mutex4 = this.b;
        dk = (Dk) this.a;
        ResultKt.throwOnFailure(obj);
        mutex = mutex4;
        C4425vk c4425vk3 = C4425vk.a;
        this.a = mutex;
        this.b = null;
        this.c = 2;
        r0 = mutex;
    }
}
