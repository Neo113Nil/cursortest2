package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.C4822p8;
import com.ironsource.InterfaceC4944w1;
import com.ironsource.X3;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4904u1 {

    @NotNull
    public static final b a = new b(null);

    @NotNull
    private static final String b;

    /* renamed from: com.ironsource.u1$a */
    public static final class a {

        @NotNull
        private final String a;

        @NotNull
        private final C4822p8.e b;

        @NotNull
        private final String c;

        @NotNull
        private final JSONObject d;

        public a(@NotNull String name, @NotNull C4822p8.e productType, @NotNull String demandSourceName, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            this.a = name;
            this.b = productType;
            this.c = demandSourceName;
            this.d = params;
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @NotNull
        public final C4822p8.e b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.c;
        }

        @NotNull
        public final JSONObject d() {
            return this.d;
        }

        @NotNull
        public final String e() {
            return this.c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d.toString(), aVar.d.toString());
        }

        @NotNull
        public final String f() {
            return this.a;
        }

        @NotNull
        public final JSONObject g() {
            return this.d;
        }

        @NotNull
        public final C4822p8.e h() {
            return this.b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public final JSONObject i() {
            JSONObject put = IronSourceNetworkBridge.jsonObjectInit(this.d.toString()).put(X3.i.m, this.b).put("demandSourceName", this.c);
            Intrinsics.checkNotNullExpressionValue(put, "JSONObject(params.toStri…eName\", demandSourceName)");
            return put;
        }

        @NotNull
        public String toString() {
            return "CallbackResult(name=" + this.a + ", productType=" + this.b + ", demandSourceName=" + this.c + ", params=" + this.d + ")";
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull C4822p8.e productType, @NotNull String demandSourceName, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        public static /* synthetic */ a a(a aVar, String str, C4822p8.e eVar, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                eVar = aVar.b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject = aVar.d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }
    }

    /* renamed from: com.ironsource.u1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: com.ironsource.u1$c */
    static final class c extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;
        final /* synthetic */ MotionEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation continuation) {
            super(2, continuation);
            this.c = measurementManager;
            this.d = uri;
            this.e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return C4904u1.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4904u1 c4904u1 = C4904u1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                MotionEvent motionEvent = this.e;
                this.a = 1;
                if (c4904u1.a(measurementManager, uri, motionEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: com.ironsource.u1$d */
    static final class d extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MeasurementManager c;
        final /* synthetic */ Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MeasurementManager measurementManager, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.c = measurementManager;
            this.d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return C4904u1.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4904u1 c4904u1 = C4904u1.this;
                MeasurementManager measurementManager = this.c;
                Uri uri = this.d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                this.a = 1;
                if (c4904u1.a(measurementManager, uri, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        String name = b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        b = name;
    }

    @NotNull
    public final a a(@NotNull Context context, @NotNull InterfaceC4944w1 message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof InterfaceC4944w1.a) {
            return a(context, (InterfaceC4944w1.a) message);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a a(Context context, InterfaceC4944w1.a aVar) {
        MeasurementManager a2 = C4742l0.a(context);
        if (a2 == null) {
            Logger.i(b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC4944w1.a.b) {
                return a(aVar, a2);
            }
            if (aVar instanceof InterfaceC4944w1.a.C1380a) {
                return a((InterfaceC4944w1.a.C1380a) aVar, a2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            C4782n4.d().a(e);
            return a(aVar, "failed to handle attribution, message: " + e.getMessage());
        }
    }

    private final a a(InterfaceC4944w1.a aVar, MeasurementManager measurementManager) {
        BuildersKt__BuildersKt.runBlocking$default(null, new d(measurementManager, Uri.parse(aVar.b()), null), 1, null);
        return a(aVar);
    }

    private final a a(InterfaceC4944w1.a.C1380a c1380a, MeasurementManager measurementManager) {
        Uri parse = Uri.parse(c1380a.b());
        long uptimeMillis = SystemClock.uptimeMillis();
        BuildersKt__BuildersKt.runBlocking$default(null, new c(measurementManager, parse, MotionEvent.obtain(uptimeMillis, uptimeMillis, c1380a.n(), c1380a.o().c(), c1380a.o().d(), c1380a.p()), null), 1, null);
        return a(c1380a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C4926v1.a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    private final a a(InterfaceC4944w1.a aVar) {
        JSONObject params = IronSourceNetworkBridge.jsonObjectInit().put("params", IronSourceNetworkBridge.jsonObjectInit().put("type", aVar instanceof InterfaceC4944w1.a.C1380a ? "click" : "impression"));
        String a2 = aVar.a();
        C4822p8.e d2 = aVar.d();
        String e = aVar.e();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        return new a(a2, d2, e, params);
    }

    private final a a(InterfaceC4944w1 interfaceC4944w1, String str) {
        JSONObject put = IronSourceNetworkBridge.jsonObjectInit().put("reason", str).put("type", interfaceC4944w1 instanceof InterfaceC4944w1.a.C1380a ? "click" : "impression");
        String c2 = interfaceC4944w1.c();
        C4822p8.e d2 = interfaceC4944w1.d();
        String e = interfaceC4944w1.e();
        JSONObject put2 = IronSourceNetworkBridge.jsonObjectInit().put("params", put);
        Intrinsics.checkNotNullExpressionValue(put2, "JSONObject().put(\"params\", payload)");
        return new a(c2, d2, e, put2);
    }
}
