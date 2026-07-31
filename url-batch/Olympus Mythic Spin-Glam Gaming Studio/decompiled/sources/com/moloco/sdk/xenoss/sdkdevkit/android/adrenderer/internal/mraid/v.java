package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5055e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor"})
/* loaded from: classes10.dex */
public final class v extends C5054d {

    @NotNull
    public static final a f = new a(null);
    public static final int g = 8;

    @NotNull
    public static final String h = "MraidWebView";

    @NotNull
    public final w c;

    @NotNull
    public final StateFlow d;

    @NotNull
    public final StateFlow e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2", f = "MraidWebView.kt", l = {65}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ v c;
        public final /* synthetic */ String d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2$1", f = "MraidWebView.kt", l = {90}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ v c;
            public final /* synthetic */ String d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2$1$1", f = "MraidWebView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v$b$a$a, reason: collision with other inner class name */
            public static final class C1593a extends SuspendLambda implements Function3 {
                public int a;
                public /* synthetic */ boolean b;
                public /* synthetic */ Object c;

                public C1593a(Continuation continuation) {
                    super(3, continuation);
                }

                public final Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, Continuation continuation) {
                    C1593a c1593a = new C1593a(continuation);
                    c1593a.b = z;
                    c1593a.c = dVar;
                    return c1593a.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj2, (Continuation) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return TuplesKt.to(Boxing.boxBoolean(z), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.c);
                }
            }

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidWebView$loadHtml$2$1$2", f = "MraidWebView.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v$b$a$b, reason: collision with other inner class name */
            public static final class C1594b extends SuspendLambda implements Function2 {
                public int a;
                public /* synthetic */ Object b;

                public C1594b(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Pair<Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> pair, Continuation continuation) {
                    return ((C1594b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C1594b c1594b = new C1594b(continuation);
                    c1594b.b = obj;
                    return c1594b;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.b;
                    return Boxing.boxBoolean(((Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, v vVar, String str, Continuation continuation) {
                super(2, continuation);
                this.b = z;
                this.c = vVar;
                this.d = str;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        if (this.b) {
                            Context context = this.c.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            C5055e.a(this.c, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c(context), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e(), null, 4, null).a(this.d));
                        } else {
                            C5055e.a(this.c, this.d);
                        }
                        Flow flowCombine = FlowKt.flowCombine(this.c.c.b(), this.c.c.a(), new C1593a(null));
                        C1594b c1594b = new C1594b(null);
                        this.a = 1;
                        obj = FlowKt.first(flowCombine, c1594b, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, v.h, e.toString(), null, false, 12, null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.c);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.component1()).booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) pair.component2();
                return dVar != null ? new x.a(dVar) : booleanValue ? new x.b(new c(null, 1, null)) : new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, v vVar, String str, Continuation continuation) {
            super(2, continuation);
            this.b = z;
            this.c = vVar;
            this.d = str;
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.b.a().getMain();
                a aVar = new a(this.b, this.c, this.d, null);
                this.a = 1;
                obj = BuildersKt.withContext(main, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Context context, @NotNull o mraidJsCommandUrlSource) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidJsCommandUrlSource, "mraidJsCommandUrlSource");
        WebView.setWebContentsDebuggingEnabled(false);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setScrollContainer(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        setVisibility(8);
        w wVar = new w(context, mraidJsCommandUrlSource);
        setWebViewClient(wVar);
        this.c = wVar;
        this.d = wVar.b();
        this.e = wVar.a();
    }

    @NotNull
    public final StateFlow c() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d, android.webkit.WebView
    public void destroy() {
        super.destroy();
        setWebViewClient(new WebViewClientCompat());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NotNull
    public final StateFlow getUnrecoverableError() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Nullable
    public final Object a(@NotNull String str, boolean z, @NotNull Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new b(z, this, str, null), continuation);
    }
}
