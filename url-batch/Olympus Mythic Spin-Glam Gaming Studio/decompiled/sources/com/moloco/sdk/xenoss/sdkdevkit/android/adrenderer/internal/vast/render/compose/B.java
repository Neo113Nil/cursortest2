package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class B {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ MutableState<Boolean> c;
        public final /* synthetic */ MutableState<Boolean> d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e e;
        public final /* synthetic */ State<Function1> f;
        public final /* synthetic */ State<Function1> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, State<? extends Function1> state, State<? extends Function1> state2, Continuation continuation) {
            super(2, continuation);
            this.c = mutableState;
            this.d = mutableState2;
            this.e = eVar;
            this.f = state;
            this.g = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.g, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.b;
            B.a(this.f).invoke(Boxing.boxBoolean(aVar.e()));
            this.c.setValue(Boxing.boxBoolean(aVar.e()));
            this.d.setValue(Boxing.boxBoolean(aVar.d()));
            B.b(this.g).invoke(Boxing.boxBoolean(aVar.f()));
            View N = this.e.N();
            if (N != null) {
                N.setKeepScreenOn(aVar.d());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$2", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ State<Function1> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<? extends Function1> state, Continuation continuation) {
            super(2, continuation);
            this.c = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation continuation) {
            return ((b) create(iVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.c, continuation);
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
            B.c(this.c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$1$1$jobs$3", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ State<Function1> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(State<? extends Function1> state, Continuation continuation) {
            super(2, continuation);
            this.c = state;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, Continuation continuation) {
            return ((c) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.c, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            B.d(this.c).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) this.b);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$2$1", f = "VastVideoPlayer.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 124}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public Object a;
        public int b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, Continuation continuation) {
            super(2, continuation);
            this.c = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.c, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            View N;
            View view;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                N = this.c.N();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.c;
                if (N != null) {
                    N.setVisibility(4);
                }
                this.a = N;
                this.b = 1;
                if (eVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    view = (View) this.a;
                    ResultKt.throwOnFailure(obj);
                    if (view != null) {
                        view.setVisibility(4);
                    }
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    return Unit.INSTANCE;
                }
                View view2 = (View) this.a;
                ResultKt.throwOnFailure(obj);
                N = view2;
            }
            if (N != null) {
                N.setVisibility(0);
            }
            this.a = N;
            this.b = 2;
            if (DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            view = N;
            if (view != null) {
            }
            if (view != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1", f = "VastVideoPlayer.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ String c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> e;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$3$1$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ String c;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> d;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar2, Continuation continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = str;
                this.d = mVar;
                this.e = mVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar = this.b;
                String str = this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar = this.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar2 = this.e;
                eVar.a(str);
                eVar.seekTo(mVar.a().longValue());
                B.b(eVar, mVar2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar2, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = str;
            this.d = mVar;
            this.e = mVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext a2 = C.o.a();
                a aVar = new a(this.b, this.c, this.d, this.e, null);
                this.a = 1;
                if (BuildersKt.withContext(a2, aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1", f = "VastVideoPlayer.kt", l = {145}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$4$1$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar, Continuation continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = mVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                B.b(this.b, this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext a2 = C.o.a();
                a aVar = new a(this.b, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(a2, aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1", f = "VastVideoPlayer.kt", l = {153}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ boolean c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayerKt$VastVideoPlayer$5$1$1", f = "VastVideoPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, boolean z, Continuation continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.b(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, boolean z, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext a2 = C.o.a();
                a aVar = new a(this.b, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(a2, aVar, this) == coroutine_suspended) {
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

    public static final class h implements DisposableEffectResult {
        public final /* synthetic */ List a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e b;
        public final /* synthetic */ State c;

        public h(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, State state) {
            this.a = list;
            this.b = eVar;
            this.c = state;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.cancel$default((Job) it.next(), null, 1, null);
            }
            this.b.destroy();
            B.a(this.c).invoke(Boolean.FALSE);
        }
    }

    public static final Unit a(String str, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar2, boolean z2, Function1 function1, Function1 function12, Q q, Function1 function13, Function1 function14, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        a(str, z, mVar, mVar2, z2, function1, function12, q, function13, function14, modifier, composer, i | 1, i2, i3);
        return Unit.INSTANCE;
    }

    public static final MutableState b() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final MutableState c() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public static final Function1 d(State<? extends Function1> state) {
        return (Function1) state.getValue();
    }

    public static final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar) {
        if (mVar.a().booleanValue()) {
            eVar.play();
        } else {
            eVar.pause();
        }
    }

    public static final Function1 c(State<? extends Function1> state) {
        return (Function1) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x044d  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull final String uri, final boolean z, @NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> play, @NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> seekToMillis, final boolean z2, @NotNull final Function1 isPlaying, @NotNull final Function1 isVisible, @NotNull final Q viewVisibilityTracker, @NotNull final Function1 onProgressChanged, @NotNull final Function1 onError, @Nullable Modifier modifier, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean changed;
        int i8;
        Object rememberedValue;
        int i9;
        int i10;
        Composer composer2;
        Object rememberedValue2;
        Composer.Companion companion;
        Object rememberedValue3;
        Object rememberedValue4;
        boolean changed2;
        Object rememberedValue5;
        boolean changed3;
        Object rememberedValue6;
        boolean changed4;
        Object rememberedValue7;
        boolean changed5;
        Object rememberedValue8;
        boolean changed6;
        Object rememberedValue9;
        final View N;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(play, "play");
        Intrinsics.checkNotNullParameter(seekToMillis, "seekToMillis");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(isVisible, "isVisible");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer startRestartGroup = composer.startRestartGroup(32444032);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(uri) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(play) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(seekToMillis) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= startRestartGroup.changed(isPlaying) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(isVisible) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(viewVisibilityTracker) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changed(onProgressChanged) ? 67108864 : 33554432;
        }
        if ((i3 & 512) == 0) {
            if ((805306368 & i) == 0) {
                i5 = startRestartGroup.changed(onError) ? 536870912 : 268435456;
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
                i7 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i7 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
            } else {
                i7 = i2;
            }
            if ((i4 & 306783379) != 306783378 && (i7 & 3) == 2 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                composer2 = startRestartGroup;
            } else {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(32444032, i4, i7, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastVideoPlayer (VastVideoPlayer.kt:56)");
                }
                Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Lifecycle lifecycle = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                startRestartGroup.startReplaceableGroup(-794093536);
                changed = startRestartGroup.changed(context) | startRestartGroup.changed(z) | startRestartGroup.changed(lifecycle);
                i8 = i4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    i9 = i8;
                    i10 = i7;
                    composer2 = startRestartGroup;
                    rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context, z, a.g.a.a(), lifecycle, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    i9 = i8;
                    i10 = i7;
                    composer2 = startRestartGroup;
                }
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
                composer2.endReplaceableGroup();
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return B.a();
                    }
                };
                composer2.startReplaceableGroup(773894976);
                composer2.startReplaceableGroup(-492369756);
                rememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope((CoroutineContext) function0.mo4828invoke(), composer2));
                    composer2.updateRememberedValue(rememberedValue2);
                }
                composer2.endReplaceableGroup();
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                composer2.endReplaceableGroup();
                final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(isPlaying, composer2, (i9 >> 15) & 14);
                final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(isVisible, composer2, (i9 >> 18) & 14);
                Object[] objArr = new Object[0];
                composer2.startReplaceableGroup(-794060876);
                rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return B.b();
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer2.endReplaceableGroup();
                final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, null, null, (Function0) rememberedValue3, composer2, 3072, 6);
                Object[] objArr2 = new Object[0];
                composer2.startReplaceableGroup(-794057964);
                rememberedValue4 = composer2.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return B.c();
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                composer2.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, null, null, (Function0) rememberedValue4, composer2, 3072, 6);
                final State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, composer2, (i9 >> 24) & 14);
                final State rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(onError, composer2, (i9 >> 27) & 14);
                composer2.startReplaceableGroup(-794050318);
                changed2 = composer2.changed(fVar) | composer2.changed(rememberUpdatedState) | composer2.changed(mutableState2) | composer2.changed(mutableState) | composer2.changed(rememberUpdatedState2) | composer2.changed(coroutineScope) | composer2.changed(rememberUpdatedState3) | composer2.changed(rememberUpdatedState4);
                rememberedValue5 = composer2.rememberedValue();
                if (!changed2 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return B.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope, mutableState2, mutableState, rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, (DisposableEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                composer2.endReplaceableGroup();
                EffectsKt.DisposableEffect(fVar, (Function1) rememberedValue5, composer2, 0);
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceableGroup(-794013548);
                changed3 = composer2.changed(fVar);
                rememberedValue6 = composer2.rememberedValue();
                if (!changed3 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new d(fVar, null);
                    composer2.updateRememberedValue(rememberedValue6);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2) rememberedValue6, composer2, 6);
                composer2.startReplaceableGroup(-794002009);
                changed4 = composer2.changed(fVar) | composer2.changed(uri) | composer2.changed(seekToMillis) | composer2.changed(play);
                rememberedValue7 = composer2.rememberedValue();
                if (!changed4 || rememberedValue7 == companion.getEmpty()) {
                    e eVar = new e(fVar, uri, seekToMillis, play, null);
                    composer2.updateRememberedValue(eVar);
                    rememberedValue7 = eVar;
                }
                composer2.endReplaceableGroup();
                int i11 = i9 >> 3;
                EffectsKt.LaunchedEffect(fVar, uri, seekToMillis, (Function2) rememberedValue7, composer2, ((i9 << 3) & 112) | (i11 & 896));
                composer2.startReplaceableGroup(-793984702);
                changed5 = composer2.changed(fVar) | composer2.changed(play);
                rememberedValue8 = composer2.rememberedValue();
                if (!changed5 || rememberedValue8 == companion.getEmpty()) {
                    rememberedValue8 = new f(fVar, play, null);
                    composer2.updateRememberedValue(rememberedValue8);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(fVar, play, (Function2) rememberedValue8, composer2, i11 & 112);
                Boolean valueOf = Boolean.valueOf(z2);
                composer2.startReplaceableGroup(-793978438);
                int i12 = i10;
                changed6 = composer2.changed(fVar) | composer2.changed(z2);
                rememberedValue9 = composer2.rememberedValue();
                if (!changed6 || rememberedValue9 == companion.getEmpty()) {
                    rememberedValue9 = new g(fVar, z2, null);
                    composer2.updateRememberedValue(rememberedValue9);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(fVar, valueOf, (Function2) rememberedValue9, composer2, (i9 >> 9) & 112);
                N = fVar.N();
                if (N != null) {
                    composer2.startReplaceableGroup(-1928417913);
                    boolean changed7 = composer2.changed(N);
                    Object rememberedValue10 = composer2.rememberedValue();
                    if (changed7 || rememberedValue10 == companion.getEmpty()) {
                        rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return B.a(N, (Context) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) rememberedValue10, modifier3, null, composer2, (i12 << 3) & 112, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return B.a(uri, z, play, seekToMillis, z2, isPlaying, isVisible, viewVisibilityTracker, onProgressChanged, onError, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        i4 |= i5;
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Context context2 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Lifecycle lifecycle2 = ((LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        startRestartGroup.startReplaceableGroup(-794093536);
        changed = startRestartGroup.changed(context2) | startRestartGroup.changed(z) | startRestartGroup.changed(lifecycle2);
        i8 = i4;
        rememberedValue = startRestartGroup.rememberedValue();
        if (changed) {
        }
        i9 = i8;
        i10 = i7;
        composer2 = startRestartGroup;
        rememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(context2, z, a.g.a.a(), lifecycle2, MetricsRecorder.INSTANCE.withNoMediation()), viewVisibilityTracker);
        composer2.updateRememberedValue(rememberedValue);
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f) rememberedValue;
        composer2.endReplaceableGroup();
        Function0 function02 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return B.a();
            }
        };
        composer2.startReplaceableGroup(773894976);
        composer2.startReplaceableGroup(-492369756);
        rememberedValue2 = composer2.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue2 == companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        composer2.endReplaceableGroup();
        final State rememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(isPlaying, composer2, (i9 >> 15) & 14);
        final State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(isVisible, composer2, (i9 >> 18) & 14);
        Object[] objArr3 = new Object[0];
        composer2.startReplaceableGroup(-794060876);
        rememberedValue3 = composer2.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        final MutableState mutableState3 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, null, null, (Function0) rememberedValue3, composer2, 3072, 6);
        Object[] objArr22 = new Object[0];
        composer2.startReplaceableGroup(-794057964);
        rememberedValue4 = composer2.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        final MutableState mutableState22 = (MutableState) RememberSaveableKt.rememberSaveable(objArr22, null, null, (Function0) rememberedValue4, composer2, 3072, 6);
        final State rememberUpdatedState32 = SnapshotStateKt.rememberUpdatedState(onProgressChanged, composer2, (i9 >> 24) & 14);
        final State rememberUpdatedState42 = SnapshotStateKt.rememberUpdatedState(onError, composer2, (i9 >> 27) & 14);
        composer2.startReplaceableGroup(-794050318);
        changed2 = composer2.changed(fVar2) | composer2.changed(rememberUpdatedState5) | composer2.changed(mutableState22) | composer2.changed(mutableState3) | composer2.changed(rememberUpdatedState22) | composer2.changed(coroutineScope2) | composer2.changed(rememberUpdatedState32) | composer2.changed(rememberUpdatedState42);
        rememberedValue5 = composer2.rememberedValue();
        if (!changed2) {
        }
        rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.B$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return B.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e.this, coroutineScope2, mutableState22, mutableState3, rememberUpdatedState5, rememberUpdatedState22, rememberUpdatedState32, rememberUpdatedState42, (DisposableEffectScope) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue5);
        composer2.endReplaceableGroup();
        EffectsKt.DisposableEffect(fVar2, (Function1) rememberedValue5, composer2, 0);
        Unit unit2 = Unit.INSTANCE;
        composer2.startReplaceableGroup(-794013548);
        changed3 = composer2.changed(fVar2);
        rememberedValue6 = composer2.rememberedValue();
        if (!changed3) {
        }
        rememberedValue6 = new d(fVar2, null);
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2) rememberedValue6, composer2, 6);
        composer2.startReplaceableGroup(-794002009);
        changed4 = composer2.changed(fVar2) | composer2.changed(uri) | composer2.changed(seekToMillis) | composer2.changed(play);
        rememberedValue7 = composer2.rememberedValue();
        if (!changed4) {
        }
        e eVar2 = new e(fVar2, uri, seekToMillis, play, null);
        composer2.updateRememberedValue(eVar2);
        rememberedValue7 = eVar2;
        composer2.endReplaceableGroup();
        int i112 = i9 >> 3;
        EffectsKt.LaunchedEffect(fVar2, uri, seekToMillis, (Function2) rememberedValue7, composer2, ((i9 << 3) & 112) | (i112 & 896));
        composer2.startReplaceableGroup(-793984702);
        changed5 = composer2.changed(fVar2) | composer2.changed(play);
        rememberedValue8 = composer2.rememberedValue();
        if (!changed5) {
        }
        rememberedValue8 = new f(fVar2, play, null);
        composer2.updateRememberedValue(rememberedValue8);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(fVar2, play, (Function2) rememberedValue8, composer2, i112 & 112);
        Boolean valueOf2 = Boolean.valueOf(z2);
        composer2.startReplaceableGroup(-793978438);
        int i122 = i10;
        changed6 = composer2.changed(fVar2) | composer2.changed(z2);
        rememberedValue9 = composer2.rememberedValue();
        if (!changed6) {
        }
        rememberedValue9 = new g(fVar2, z2, null);
        composer2.updateRememberedValue(rememberedValue9);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(fVar2, valueOf2, (Function2) rememberedValue9, composer2, (i9 >> 9) & 112);
        N = fVar2.N();
        if (N != null) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Function1 b(State<? extends Function1> state) {
        return (Function1) state.getValue();
    }

    public static final CoroutineContext a() {
        return C.o.a();
    }

    public static final DisposableEffectResult a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e eVar, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, State state, State state2, State state3, State state4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new h(CollectionsKt.listOf((Object[]) new Job[]{FlowKt.launchIn(FlowKt.onEach(eVar.isPlaying(), new a(mutableState, mutableState2, eVar, state, state2, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(eVar.o(), new b(state3, null)), coroutineScope), FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(eVar.f()), new c(state4, null)), coroutineScope)}), eVar, state);
    }

    public static final FrameLayout a(View view, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final Function1 a(State<? extends Function1> state) {
        return (Function1) state.getValue();
    }
}
