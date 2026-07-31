package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C5019a;
import com.moloco.sdk.internal.ortb.model.C5020b;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.ForegroundMonitor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "a", "(Ljava/lang/Throwable;)V", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;", CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;", "c", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/l;", "storeInstallerImpl", "d", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes11.dex */
public final class VastActivity extends ComponentActivity {

    @NotNull
    public static final String f = "VastActivity";

    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a i;

    @Nullable
    public static Function2 j;

    @Nullable
    public static Function0 k;

    @Nullable
    public static Job l;

    @Nullable
    public static y m;

    @Nullable
    public static MetricsRecorder n;

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a ac;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());

    /* renamed from: c, reason: from kotlin metadata */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l storeInstallerImpl;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;

    @NotNull
    public static final MutableSharedFlow g = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @NotNull
    public static WeakReference<VastActivity> h = new WeakReference<>(null);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2", f = "VastActivity.kt", l = {265}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a, reason: collision with other inner class name */
        public static final class C1630a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a b;
            public final /* synthetic */ x c;
            public final /* synthetic */ Function1 d;
            public final /* synthetic */ Context e;
            public final /* synthetic */ String f;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a, reason: collision with other inner class name */
            public static final class C1631a extends SuspendLambda implements Function2 {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Context d;
                public final /* synthetic */ x e;
                public final /* synthetic */ String f;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1", f = "VastActivity.kt", l = {272}, m = "invokeSuspend")
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a, reason: collision with other inner class name */
                public static final class C1632a extends SuspendLambda implements Function2 {
                    public int a;
                    public final /* synthetic */ Function1 b;

                    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$1", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C1633a extends SuspendLambda implements Function2 {
                        public int a;
                        public /* synthetic */ Object b;
                        public final /* synthetic */ Function1 c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C1633a(Function1 function1, Continuation continuation) {
                            super(2, continuation);
                            this.c = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
                            return ((C1633a) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C1633a c1633a = new C1633a(this.c, continuation);
                            c1633a.b = obj;
                            return c1633a;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.c.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b);
                            return Unit.INSTANCE;
                        }
                    }

                    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$1$2", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$a$b */
                    public static final class b extends SuspendLambda implements Function2 {
                        public int a;
                        public /* synthetic */ Object b;

                        public b(Continuation continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
                            return ((b) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            b bVar = new b(continuation);
                            bVar.b = obj;
                            return bVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Boxing.boxBoolean(VastActivity.INSTANCE.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1632a(Function1 function1, Continuation continuation) {
                        super(2, continuation);
                        this.b = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C1632a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C1632a(this.b, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Flow onEach = FlowKt.onEach(VastActivity.g, new C1633a(this.b, null));
                            b bVar = new b(null);
                            this.a = 1;
                            if (FlowKt.firstOrNull(onEach, bVar, this) == coroutine_suspended) {
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

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$Companion$showAd$2$1$2", f = "VastActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$a$a$a$b */
                public static final class b extends SuspendLambda implements Function2 {
                    public int a;
                    public final /* synthetic */ Context b;
                    public final /* synthetic */ x c;
                    public final /* synthetic */ String d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(Context context, x xVar, String str, Continuation continuation) {
                        super(2, continuation);
                        this.b = context;
                        this.c = xVar;
                        this.d = str;
                    }

                    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
                        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                        if (p1 == null) {
                            return;
                        }
                        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.D);
                        p0.startActivity(p1);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new b(this.b, this.c, this.d, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Boolean forceFullScreen;
                        String clickthroughUrl;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Context context = this.b;
                        Intent intent = new Intent(this.b, (Class<?>) VastActivity.class);
                        x xVar = this.c;
                        String str = this.d;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.g(intent, xVar.i());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, xVar.e());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, xVar.f());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, xVar.g());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, xVar.h());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent, xVar.d());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent, xVar.c());
                        C5019a a = xVar.a();
                        if (a != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent, a.getEnabled());
                        }
                        C5019a a2 = xVar.a();
                        if (a2 != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, a2.getUrl());
                        }
                        if (xVar.b() != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, true);
                        }
                        C5020b b = xVar.b();
                        if (b != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent, b.getOnSkip());
                        }
                        C5020b b2 = xVar.b();
                        if (b2 != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, b2.getEventLink());
                        }
                        C5020b b3 = xVar.b();
                        if (b3 != null && (clickthroughUrl = b3.getClickthroughUrl()) != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent, clickthroughUrl);
                        }
                        C5020b b4 = xVar.b();
                        if (b4 != null && (forceFullScreen = b4.getForceFullScreen()) != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent, forceFullScreen.booleanValue());
                        }
                        if (str != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent, str);
                        }
                        intent.setFlags(268435456);
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1631a(Function1 function1, Context context, x xVar, String str, Continuation continuation) {
                    super(2, continuation);
                    this.c = function1;
                    this.d = context;
                    this.e = xVar;
                    this.f = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1631a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C1631a c1631a = new C1631a(this.c, this.d, this.e, this.f, continuation);
                    c1631a.b = obj;
                    return c1631a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Job launch$default;
                    Job launch$default2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    Companion companion = VastActivity.INSTANCE;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1632a(this.c, null), 3, null);
                    VastActivity.l = launch$default;
                    launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(this.d, this.e, this.f, null), 3, null);
                    return launch$default2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1630a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, x xVar, Function1 function1, Context context, String str, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = xVar;
                this.d = function1;
                this.e = context;
                this.f = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1630a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1630a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Companion companion = VastActivity.INSTANCE;
                        VastActivity.i = this.b;
                        VastActivity.j = this.c.j();
                        C1631a c1631a = new C1631a(this.d, this.e, this.c, this.f, null);
                        this.a = 1;
                        obj = CoroutineScopeKt.coroutineScope(c1631a, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (Job) obj;
                } finally {
                    Companion companion2 = VastActivity.INSTANCE;
                    VastActivity b = companion2.b();
                    if (b != null) {
                        b.finish();
                    }
                    VastActivity.k = null;
                    VastActivity.i = null;
                    VastActivity.n = null;
                    VastActivity.j = null;
                    companion2.a();
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final VastActivity b() {
            return (VastActivity) VastActivity.h.get();
        }

        public final void a(VastActivity vastActivity) {
            VastActivity.h = new WeakReference(vastActivity);
            if (vastActivity == null) {
                a();
            }
        }

        @Nullable
        public final Object a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, @NotNull Context context, @NotNull x xVar, @NotNull Function0 function0, @NotNull y yVar, @Nullable String str, @NotNull MetricsRecorder metricsRecorder, @NotNull Function1 function1, @NotNull Continuation continuation) {
            VastActivity.m = yVar;
            VastActivity.k = function0;
            VastActivity.n = metricsRecorder;
            Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new C1630a(aVar, xVar, function1, context, str, null), continuation);
            return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
        }

        public final void a() {
            Job job = VastActivity.l;
            if (job == null || !job.isActive()) {
                return;
            }
            Job job2 = VastActivity.l;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            VastActivity.l = null;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return (bVar instanceof b.f) || Intrinsics.areEqual(bVar, b.e.b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$onComposeDependencyMissing$1", f = "VastActivity.kt", l = {198}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = VastActivity.g;
                b.f fVar = new b.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.b);
                this.a = 1;
                if (mutableSharedFlow.emit(fVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$onCreate$1", f = "VastActivity.kt", l = {TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = VastActivity.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, VastActivity.f, "VastActivity received event: " + bVar2, null, false, 12, null);
                MutableSharedFlow mutableSharedFlow = VastActivity.g;
                this.b = bVar2;
                this.a = 1;
                if (mutableSharedFlow.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
                ResultKt.throwOnFailure(obj);
            }
            if (VastActivity.INSTANCE.a(bVar)) {
                VastActivity.this.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d implements Function2 {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b;
        public final /* synthetic */ Function2 c;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Function2 function2) {
            this.b = aVar;
            this.c = function2;
        }

        @ComposableTarget
        @Composable
        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-369589045, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity.onCreate.<anonymous> (VastActivity.kt:181)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a(VastActivity.this, this.b, this.c, VastActivity.m, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.D, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar;
        super.onCreate(savedInstanceState);
        com.moloco.sdk.internal.android_context.b.a(getApplicationContext());
        ForegroundMonitor foregroundMonitor = ForegroundMonitor.a;
        foregroundMonitor.a();
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                VastActivity.a(VastActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        r f2 = a.h.a.f();
        this.storeInstallerImpl = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m(this, registerForActivityResult, LifecycleOwnerKt.getLifecycleScope(this), foregroundMonitor.b(), 0L, null, null, 112, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean f3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent);
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        boolean b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent2);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        boolean e2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent3);
        Intent intent4 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        boolean d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent4);
        Intent intent5 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
        String a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent5);
        Intent intent6 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(f3, b2, e2, d2, a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent6), n);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar2 = this.storeInstallerImpl;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        } else {
            lVar = lVar2;
        }
        Intent intent7 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
        String j2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.j(intent7);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d();
        Intent intent8 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
        boolean f4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.f(intent8);
        Intent intent9 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(f4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.g(intent9));
        Intent intent10 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
        boolean b3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.b(intent10);
        Intent intent11 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
        boolean e3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.e(intent11);
        Intent intent12 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
        String c2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.c(intent12);
        Intent intent13 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
        String a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.a(intent13);
        Intent intent14 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k a3 = iVar.a(f2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h(lVar, j2, dVar, bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a(b3, e3, c2, a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.d(intent14)), n));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = i;
        if (aVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        Function2 function2 = j;
        if (function2 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b4 = a.k.a.b();
        Intent intent15 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
        boolean o = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.o(intent15);
        Intent intent16 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
        Boolean m2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.m(intent16);
        Intent intent17 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
        int n2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.n(intent17);
        Intent intent18 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent18, "getIntent(...)");
        int k2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.k(intent18);
        Intent intent19 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent19, "getIntent(...)");
        int l2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.l(intent19);
        Intent intent20 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent20, "getIntent(...)");
        boolean i2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.i(intent20);
        Intent intent21 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent21, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, f2, this, b4, o, m2, n2, k2, l2, i2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x.h(intent21), a3);
        this.ac = a4;
        INSTANCE.a(this);
        FlowKt.launchIn(FlowKt.onEach(a4.a(), new c(null)), this.scope);
        try {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-369589045, true, new d(a4, function2)), 1, null);
            a4.d();
        } catch (ClassNotFoundException e4) {
            a(e4);
        } catch (NoClassDefFoundError e5) {
            a(e5);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Function0 function0 = k;
        if (function0 != null) {
            function0.mo4828invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.ac;
        if (aVar != null) {
            aVar.destroy();
        }
        this.ac = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = this.storeInstallerImpl;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        }
        lVar.cancel();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        INSTANCE.a((VastActivity) null);
    }

    public static final void a(VastActivity vastActivity, ActivityResult activityResult) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultCode=" + activityResult.getResultCode(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, f, "Activity result received: resultData=" + activityResult.getData(), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = vastActivity.storeInstallerImpl;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storeInstallerImpl");
            lVar = null;
        }
        lVar.a(activityResult.getResultCode());
    }

    public final void a(Throwable e2) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f, "Compose dependency not available, cannot show fullscreen VAST ad", e2, false, 8, null);
        MetricsRecorder metricsRecorder = n;
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.f0.c()));
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(null), 3, null);
        finish();
    }
}
