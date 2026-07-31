package io.bidmachine.iab.mraid;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.iab.utils.ClickAreaFactory;
import io.bidmachine.iab.utils.ClickPointGenerator;
import io.bidmachine.iab.utils.ClickPointGeneratorKt;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.model.ClickArea;
import io.bidmachine.util.SdkDispatchers;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=BI\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010404038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lio/bidmachine/iab/mraid/MraidAdRedirectHandler;", "", "Lkotlin/Function0;", "Lio/bidmachine/iab/mraid/MraidWebViewController;", "controllerProvider", "", "Lio/bidmachine/rendering/model/ScriptConfig;", "scriptConfigsProvider", "Ljava/lang/Runnable;", "onOpenProductLink", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "ioDispatcher", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Runnable;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "controller", "", "width", "height", "Lio/bidmachine/rendering/model/ClickArea;", "clickArea", "", "a", "(Lio/bidmachine/iab/mraid/MraidWebViewController;IILio/bidmachine/rendering/model/ClickArea;)V", "Landroid/graphics/PointF;", "point", "(Landroid/graphics/PointF;IILio/bidmachine/iab/mraid/MraidWebViewController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Point;", "p", "b", "(Landroid/graphics/Point;Lio/bidmachine/iab/mraid/MraidWebViewController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "()V", "Lio/bidmachine/iab/utils/ClickAreaFactory;", "clickAreaFactory", "handle", "(Lio/bidmachine/iab/utils/ClickAreaFactory;)V", "Lkotlin/jvm/functions/Function0;", "c", "Ljava/lang/Runnable;", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lkotlinx/coroutines/CoroutineScope;", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lio/bidmachine/iab/utils/ClickPointGenerator;", "g", "Lio/bidmachine/iab/utils/ClickPointGenerator;", "clickPointGenerator", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/bidmachine/iab/mraid/MraidAdRedirectHandler$Companion$a;", "kotlin.jvm.PlatformType", "h", "Ljava/util/concurrent/atomic/AtomicReference;", "state", "Lkotlinx/coroutines/Job;", "i", "Lkotlinx/coroutines/Job;", "currentJob", "Companion", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MraidAdRedirectHandler {

    /* renamed from: a, reason: from kotlin metadata */
    private final Function0 controllerProvider;

    /* renamed from: b, reason: from kotlin metadata */
    private final Function0 scriptConfigsProvider;

    /* renamed from: c, reason: from kotlin metadata */
    private final Runnable onOpenProductLink;

    /* renamed from: d, reason: from kotlin metadata */
    private final CoroutineDispatcher mainDispatcher;

    /* renamed from: e, reason: from kotlin metadata */
    private final CoroutineDispatcher ioDispatcher;

    /* renamed from: f, reason: from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* renamed from: g, reason: from kotlin metadata */
    private final ClickPointGenerator clickPointGenerator;

    /* renamed from: h, reason: from kotlin metadata */
    private final AtomicReference state;

    /* renamed from: i, reason: from kotlin metadata */
    private Job currentJob;

    static final class a extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ ClickArea c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ MraidWebViewController f;

        /* renamed from: io.bidmachine.iab.mraid.MraidAdRedirectHandler$a$a, reason: collision with other inner class name */
        static final class C1774a extends Lambda implements Function0 {
            final /* synthetic */ ClickPointGenerator.Distribution a;
            final /* synthetic */ PointF b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1774a(ClickPointGenerator.Distribution distribution, PointF pointF) {
                super(0);
                this.a = distribution;
                this.b = pointF;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo4828invoke() {
                return "SimulateClick: distribution=" + this.a + ", normalized=(" + this.b.x + ", " + this.b.y + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ClickArea clickArea, int i, int i2, MraidWebViewController mraidWebViewController, Continuation continuation) {
            super(2, continuation);
            this.c = clickArea;
            this.d = i;
            this.e = i2;
            this.f = mraidWebViewController;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MraidAdRedirectHandler.this.new a(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ClickPointGenerator.Distribution distribution = MraidClickKt.hasClcScript((List) MraidAdRedirectHandler.this.scriptConfigsProvider.mo4828invoke()) ? ClickPointGenerator.Distribution.Uniform.INSTANCE : ClickPointGenerator.Distribution.Legacy.INSTANCE;
                    PointF generate = MraidAdRedirectHandler.this.clickPointGenerator.generate(this.c, distribution);
                    MraidLog.d("MraidAdRedirectHandler", new C1774a(distribution, generate));
                    MraidAdRedirectHandler mraidAdRedirectHandler = MraidAdRedirectHandler.this;
                    int i2 = this.d;
                    int i3 = this.e;
                    MraidWebViewController mraidWebViewController = this.f;
                    this.a = 1;
                    if (mraidAdRedirectHandler.a(generate, i2, i3, mraidWebViewController, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                MraidAdRedirectHandler.this.state.set(Companion.a.Idle);
                throw th;
            }
            MraidAdRedirectHandler.this.state.set(Companion.a.Idle);
            return Unit.INSTANCE;
        }
    }

    static final class b extends SuspendLambda implements Function2 {
        Object a;
        int b;
        final /* synthetic */ PointF c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ MraidAdRedirectHandler f;
        final /* synthetic */ MraidWebViewController g;

        static final class a extends Lambda implements Function0 {
            final /* synthetic */ Point a;
            final /* synthetic */ int b;
            final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Point point, int i, int i2) {
                super(0);
                this.a = point;
                this.b = i;
                this.c = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo4828invoke() {
                return "SimulateClick: absolute=(" + this.a.x + ", " + this.a.y + "), view=" + this.b + 'x' + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PointF pointF, int i, int i2, MraidAdRedirectHandler mraidAdRedirectHandler, MraidWebViewController mraidWebViewController, Continuation continuation) {
            super(2, continuation);
            this.c = pointF;
            this.d = i;
            this.e = i2;
            this.f = mraidAdRedirectHandler;
            this.g = mraidWebViewController;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Point point;
            MraidAdRedirectHandler mraidAdRedirectHandler;
            MraidWebViewController mraidWebViewController;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Point relativeToView = ClickPointGeneratorKt.relativeToView(this.c, this.d, this.e);
                MraidLog.d("MraidAdRedirectHandler", new a(relativeToView, this.d, this.e));
                MraidAdRedirectHandler mraidAdRedirectHandler2 = this.f;
                MraidWebViewController mraidWebViewController2 = this.g;
                this.a = relativeToView;
                this.b = 1;
                if (mraidAdRedirectHandler2.a(relativeToView, mraidWebViewController2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                point = relativeToView;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.f.onOpenProductLink.run();
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        this.b = 4;
                        if (DelayKt.delay(150L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.f.onOpenProductLink.run();
                        return Unit.INSTANCE;
                    }
                    point = (Point) this.a;
                    ResultKt.throwOnFailure(obj);
                    mraidAdRedirectHandler = this.f;
                    mraidWebViewController = this.g;
                    this.a = null;
                    this.b = 3;
                    if (mraidAdRedirectHandler.b(point, mraidWebViewController, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.b = 4;
                    if (DelayKt.delay(150L, this) == coroutine_suspended) {
                    }
                    this.f.onOpenProductLink.run();
                    return Unit.INSTANCE;
                }
                point = (Point) this.a;
                ResultKt.throwOnFailure(obj);
            }
            this.a = point;
            this.b = 2;
            if (DelayKt.delay(150L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mraidAdRedirectHandler = this.f;
            mraidWebViewController = this.g;
            this.a = null;
            this.b = 3;
            if (mraidAdRedirectHandler.b(point, mraidWebViewController, this) == coroutine_suspended) {
            }
            this.b = 4;
            if (DelayKt.delay(150L, this) == coroutine_suspended) {
            }
            this.f.onOpenProductLink.run();
            return Unit.INSTANCE;
        }
    }

    static final class c extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MraidWebViewController b;
        final /* synthetic */ Point c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MraidWebViewController mraidWebViewController, Point point, Continuation continuation) {
            super(2, continuation);
            this.b = mraidWebViewController;
            this.c = point;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MraidWebView mraidWebView = this.b.getMraidWebView();
            Point point = this.c;
            Integer[] numArr = {Boxing.boxInt(0), Boxing.boxInt(1)};
            for (int i = 0; i < 2; i++) {
                MotionEvent obtainMotionEvent = Utils.obtainMotionEvent(numArr[i].intValue(), point);
                mraidWebView.dispatchTouchEvent(obtainMotionEvent);
                obtainMotionEvent.recycle();
            }
            return Unit.INSTANCE;
        }
    }

    static final class d extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MraidWebViewController b;
        final /* synthetic */ Point c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MraidWebViewController mraidWebViewController, Point point, Continuation continuation) {
            super(2, continuation);
            this.b = mraidWebViewController;
            this.c = point;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.applyClick(this.c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MraidAdRedirectHandler(@NotNull Function0 controllerProvider, @NotNull Function0 scriptConfigsProvider, @NotNull Runnable onOpenProductLink) {
        this(controllerProvider, scriptConfigsProvider, onOpenProductLink, null, null, 24, null);
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        Intrinsics.checkNotNullParameter(scriptConfigsProvider, "scriptConfigsProvider");
        Intrinsics.checkNotNullParameter(onOpenProductLink, "onOpenProductLink");
    }

    private final void a(MraidWebViewController controller, int width, int height, ClickArea clickArea) {
        Job launch$default;
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, Companion.a.Idle, Companion.a.Processing)) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.ioDispatcher, null, new a(clickArea, width, height, controller, null), 2, null);
            this.currentJob = launch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(Point point, MraidWebViewController mraidWebViewController, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.mainDispatcher, new d(mraidWebViewController, point, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void complete() {
        Job job = this.currentJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.currentJob = null;
    }

    public final void handle(@NotNull ClickAreaFactory clickAreaFactory) {
        Intrinsics.checkNotNullParameter(clickAreaFactory, "clickAreaFactory");
        MraidWebViewController mraidWebViewController = (MraidWebViewController) this.controllerProvider.mo4828invoke();
        a(mraidWebViewController, mraidWebViewController.getMraidWebView().getMeasuredWidth(), mraidWebViewController.getMraidWebView().getMeasuredHeight(), clickAreaFactory.build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MraidAdRedirectHandler(@NotNull Function0 controllerProvider, @NotNull Function0 scriptConfigsProvider, @NotNull Runnable onOpenProductLink, @NotNull CoroutineDispatcher mainDispatcher) {
        this(controllerProvider, scriptConfigsProvider, onOpenProductLink, mainDispatcher, null, 16, null);
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        Intrinsics.checkNotNullParameter(scriptConfigsProvider, "scriptConfigsProvider");
        Intrinsics.checkNotNullParameter(onOpenProductLink, "onOpenProductLink");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    public MraidAdRedirectHandler(@NotNull Function0 controllerProvider, @NotNull Function0 scriptConfigsProvider, @NotNull Runnable onOpenProductLink, @NotNull CoroutineDispatcher mainDispatcher, @NotNull CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        Intrinsics.checkNotNullParameter(scriptConfigsProvider, "scriptConfigsProvider");
        Intrinsics.checkNotNullParameter(onOpenProductLink, "onOpenProductLink");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.controllerProvider = controllerProvider;
        this.scriptConfigsProvider = scriptConfigsProvider;
        this.onOpenProductLink = onOpenProductLink;
        this.mainDispatcher = mainDispatcher;
        this.ioDispatcher = ioDispatcher;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(mainDispatcher));
        this.clickPointGenerator = new ClickPointGenerator();
        this.state = new AtomicReference(Companion.a.Idle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(PointF pointF, int i, int i2, MraidWebViewController mraidWebViewController, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new b(pointF, i, i2, this, mraidWebViewController, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Point point, MraidWebViewController mraidWebViewController, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.mainDispatcher, new c(mraidWebViewController, point, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public /* synthetic */ MraidAdRedirectHandler(Function0 function0, Function0 function02, Runnable runnable, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, runnable, (i & 8) != 0 ? SdkDispatchers.INSTANCE.getDefault().getMain() : coroutineDispatcher, (i & 16) != 0 ? SdkDispatchers.INSTANCE.getDefault().getIo() : coroutineDispatcher2);
    }
}
