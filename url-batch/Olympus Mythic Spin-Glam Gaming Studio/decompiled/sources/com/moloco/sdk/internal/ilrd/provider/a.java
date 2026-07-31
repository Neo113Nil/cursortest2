package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.moloco.sdk.IlrdRequest;
import com.moloco.sdk.internal.ilrd.c;
import com.moloco.sdk.internal.ilrd.g;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class a implements c {

    @NotNull
    public static final C1533a h = new C1533a(null);
    public static final int i = 8;

    @Nullable
    public static volatile AppLovinCommunicatorSubscriber j = null;

    @NotNull
    public static final String k = "max_revenue_events";

    @NotNull
    public static final String l = "ApplovinIlrd";

    @NotNull
    public final Context a;

    @NotNull
    public final CoroutineScope b;

    @NotNull
    public final com.moloco.sdk.internal.ilrd.model.a c;

    @NotNull
    public final Lazy d;

    @NotNull
    public final Lazy e;

    @NotNull
    public final MutableStateFlow f;

    @NotNull
    public final MutableSharedFlow g;

    /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$a, reason: collision with other inner class name */
    public static final class C1533a {
        public /* synthetic */ C1533a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1533a() {
        }
    }

    public static final class b implements AppLovinCommunicatorSubscriber {

        @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.provider.ApplovinIlrd$createCallback$1$onMessageReceived$1", f = "ApplovinIlrd.kt", l = {114}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.internal.ilrd.provider.a$b$a, reason: collision with other inner class name */
        public static final class C1534a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ a b;
            public final /* synthetic */ c.a.b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1534a(a aVar, c.a.b bVar, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1534a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1534a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.b.g;
                    c.a.b bVar = this.c;
                    this.a = 1;
                    if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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

        public b() {
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "Moloco";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (CoroutineScopeKt.isActive(a.this.b) && Intrinsics.areEqual(a.k, message.getTopic())) {
                Bundle messageData = message.getMessageData();
                Intrinsics.checkNotNullExpressionValue(messageData, "getMessageData(...)");
                BuildersKt__Builders_commonKt.launch$default(a.this.b, null, null, new C1534a(a.this, a.this.a(messageData), null), 3, null);
            }
        }
    }

    public a(@NotNull Context context, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = context;
        this.b = scope;
        this.c = com.moloco.sdk.internal.ilrd.model.a.a;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.d(a.this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.c(a.this);
            }
        });
        this.f = StateFlowKt.MutableStateFlow(g.c.b);
        this.g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public static final SharedFlow c(a aVar) {
        return FlowKt.asSharedFlow(aVar.g);
    }

    public static final StateFlow d(a aVar) {
        return FlowKt.asStateFlow(aVar.f);
    }

    public final Object e() {
        Object m8023constructorimpl;
        AppLovinCommunicator appLovinCommunicator;
        try {
            Result.Companion companion = Result.INSTANCE;
            int i2 = AppLovinCommunicator.$r8$clinit;
            int i3 = AppLovinCommunicatorMessage.$r8$clinit;
            try {
                appLovinCommunicator = AppLovinCommunicator.getInstance();
            } catch (Throwable unused) {
                appLovinCommunicator = AppLovinCommunicator.getInstance(this.a);
            }
            m8023constructorimpl = Result.m8023constructorimpl(appLovinCommunicator);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        b d = d();
        j = d;
        ((AppLovinCommunicator) m8023constructorimpl).subscribe(d, k);
        return Result.m8023constructorimpl(Unit.INSTANCE);
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public StateFlow getState() {
        return (StateFlow) this.d.getValue();
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public synchronized Object b() {
        Object e;
        try {
            e = e();
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(e);
            if (m8026exceptionOrNullimpl != null) {
                this.f.setValue(new g.a(m8026exceptionOrNullimpl.toString()));
            }
            if (Result.m8029isSuccessimpl(e)) {
                this.f.setValue(g.b.b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public SharedFlow c() {
        return (SharedFlow) this.e.getValue();
    }

    public final b d() {
        return new b();
    }

    @Override // com.moloco.sdk.internal.ilrd.c
    @NotNull
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.c;
    }

    public final c.a.b a(Bundle bundle) {
        double d = bundle.getDouble("revenue");
        String string = bundle.getString("country_code");
        String string2 = bundle.getString(BrandSafetyEvent.ad);
        String string3 = bundle.getString(BrandSafetyEvent.l);
        String string4 = bundle.getString(BrandSafetyEvent.k);
        String string5 = bundle.getString("ad_format");
        String string6 = bundle.getString("user_segment");
        String string7 = bundle.getString("id");
        IlrdRequest.MaxImpression.Builder newBuilder = IlrdRequest.MaxImpression.newBuilder();
        newBuilder.setRevenue(d);
        if (string != null) {
            newBuilder.setCountryCode(string);
        }
        if (string2 != null) {
            newBuilder.setNetworkName(string2);
        }
        if (string3 != null) {
            newBuilder.setMaxAdUnitId(string3);
        }
        if (string4 != null) {
            newBuilder.setThirdPartyAdPlacementId(string4);
        }
        if (string5 != null) {
            newBuilder.setAdFormat(string5);
        }
        if (string6 != null) {
            newBuilder.setUserSegment(string6);
        }
        if (string7 != null) {
            newBuilder.setId(string7);
        }
        IlrdRequest.MaxImpression build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new c.a.b(build);
    }
}
