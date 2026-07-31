package com.moloco.sdk.internal.publisher.nativead.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class e extends FrameLayout implements LifecycleOwner, k {

    @NotNull
    public static final a d = new a(null);
    public static final int e = 8;

    @Deprecated
    @NotNull
    public static final String f = "NativeAdVideoContainerView";

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a;

    @NotNull
    public final LifecycleRegistry b;

    @Nullable
    public View c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2 {
        public static final b a = new b();

        public b() {
            super(2, x.class, "defaultVastIconView", "defaultVastIconView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/LinearVastIconView;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k invoke(Context p0, Flow p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return x.a(p0, p1);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.class, "onReplay", "onReplay()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.receiver).z();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a vastAdController, @NotNull Q viewVisibilityTracker, @NotNull y watermark, @Nullable Function0 function0) {
        super(context);
        Function2 a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastAdController, "vastAdController");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.a = vastAdController;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.b = lifecycleRegistry;
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        a2 = x.a((r26 & 1) != 0 ? null : getLifecycle(), (r26 & 2) != 0 ? -16777216 : -16777216, (r26 & 4) != 0 ? x.p.a : f.a(), (r26 & 8) != 0 ? x.q.a : null, (r26 & 16) != 0 ? null : g.b(), (r26 & 32) != 0 ? x.r.a : b.a, (r26 & 64) != 0 ? x.a((String) null, (String) null, (Integer) null, (Integer) null, 15, (Object) null) : null, (r26 & 128) == 0 ? new o(function0, function0, function0) : null, (r26 & 256) != 0 ? a.h.a.k() : viewVisibilityTracker, (r26 & 512) != 0, (r26 & 1024) != 0 ? a.h.a.f() : null, (r26 & 2048) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: INVOKE (r4v7 'a2' kotlin.jvm.functions.Function2) = 
              (wrap:androidx.lifecycle.Lifecycle:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.Lifecycle) : (wrap:androidx.lifecycle.Lifecycle:0x002f: INVOKE (r19v0 'this' com.moloco.sdk.internal.publisher.nativead.ui.e A[IMMUTABLE_TYPE, THIS]) VIRTUAL call: com.moloco.sdk.internal.publisher.nativead.ui.e.getLifecycle():androidx.lifecycle.Lifecycle A[MD:():androidx.lifecycle.Lifecycle (m), WRAPPED] (LINE:21)))
              (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-16777216 int) : (-16777216 int))
              (wrap:kotlin.jvm.functions.Function3:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] (LINE:6983) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.p.a com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$p) : (wrap:kotlin.jvm.functions.Function3:0x0033: INVOKE  STATIC call: com.moloco.sdk.internal.publisher.nativead.ui.f.a():kotlin.jvm.functions.Function3 A[MD:():kotlin.jvm.functions.Function3 (m), WRAPPED] (LINE:23)))
              (wrap:kotlin.jvm.functions.Function3:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: SGET  A[WRAPPED] (LINE:6984) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.q.a com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$q) : (null kotlin.jvm.functions.Function3))
              (wrap:kotlin.jvm.functions.Function3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function3) : (wrap:kotlin.jvm.functions.Function3:0x0037: INVOKE  STATIC call: com.moloco.sdk.internal.publisher.nativead.ui.g.b():kotlin.jvm.functions.Function3 A[MD:():kotlin.jvm.functions.Function3 (m), WRAPPED] (LINE:25)))
              (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x002c: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] (LINE:6986) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.r.a com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$r) : (wrap:com.moloco.sdk.internal.publisher.nativead.ui.e$b:0x003b: SGET  A[WRAPPED] (LINE:26) com.moloco.sdk.internal.publisher.nativead.ui.e.b.a com.moloco.sdk.internal.publisher.nativead.ui.e$b))
              (wrap:kotlin.jvm.functions.Function5:?: TERNARY null = ((wrap:int:0x0035: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: INVOKE 
              (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
              (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
              (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
              (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
              (15 int)
              (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
             STATIC call: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, java.lang.Object):kotlin.jvm.functions.Function5 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, java.lang.Object):kotlin.jvm.functions.Function5 (m), WRAPPED] (LINE:6987)) : (null kotlin.jvm.functions.Function5))
              (wrap:com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (wrap:com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o:0x0041: CONSTRUCTOR 
              (r24v0 'function0' kotlin.jvm.functions.Function0)
              (r24v0 'function0' kotlin.jvm.functions.Function0)
              (r24v0 'function0' kotlin.jvm.functions.Function0)
             A[MD:(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void (m), WRAPPED] (LINE:28) call: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR) : (null com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o))
              (wrap:com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q:?: TERNARY null = ((wrap:int:0x0058: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005e: INVOKE 
              (wrap:com.moloco.sdk.service_locator.a$h:0x005c: SGET  A[WRAPPED] (LINE:6989) com.moloco.sdk.service_locator.a.h.a com.moloco.sdk.service_locator.a$h)
             VIRTUAL call: com.moloco.sdk.service_locator.a.h.k():com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q A[MD:():com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q (m), WRAPPED] (LINE:6989)) : (r22v0 'viewVisibilityTracker' com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r:?: TERNARY null = ((wrap:int:0x006d: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0073: INVOKE 
              (wrap:com.moloco.sdk.service_locator.a$h:0x0071: SGET  A[WRAPPED] (LINE:6991) com.moloco.sdk.service_locator.a.h.a com.moloco.sdk.service_locator.a$h)
             VIRTUAL call: com.moloco.sdk.service_locator.a.h.f():com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r A[MD:():com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r (m), WRAPPED] (LINE:6991)) : (null com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x007a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:6992) call: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda3.<init>():void type: CONSTRUCTOR) : (wrap:com.moloco.sdk.internal.publisher.nativead.ui.e$c:0x0046: CONSTRUCTOR (r21v0 'vastAdController' com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) A[MD:(java.lang.Object):void (m), WRAPPED] (LINE:37) call: com.moloco.sdk.internal.publisher.nativead.ui.e.c.<init>(java.lang.Object):void type: CONSTRUCTOR))
             STATIC call: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(androidx.lifecycle.Lifecycle, int, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q, boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, kotlin.jvm.functions.Function0):kotlin.jvm.functions.Function2 A[MD:(androidx.lifecycle.Lifecycle, int, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q, boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, kotlin.jvm.functions.Function0):kotlin.jvm.functions.Function2 (m), WRAPPED] (LINE:6993) in method: com.moloco.sdk.internal.publisher.nativead.ui.e.<init>(android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, kotlin.jvm.functions.Function0):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda3, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 17 more
            */
        /*
            this = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "vastAdController"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "viewVisibilityTracker"
            r13 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            java.lang.String r4 = "watermark"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r19.<init>(r20)
            r0.a = r2
            androidx.lifecycle.LifecycleRegistry r4 = new androidx.lifecycle.LifecycleRegistry
            r4.<init>(r0)
            r0.b = r4
            androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.CREATED
            r4.setCurrentState(r5)
            androidx.lifecycle.Lifecycle r5 = r19.getLifecycle()
            kotlin.jvm.functions.Function3 r7 = com.moloco.sdk.internal.publisher.nativead.ui.f.a()
            kotlin.jvm.functions.Function3 r9 = com.moloco.sdk.internal.publisher.nativead.ui.g.b()
            com.moloco.sdk.internal.publisher.nativead.ui.e$b r10 = com.moloco.sdk.internal.publisher.nativead.ui.e.b.a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o r12 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o
            r4 = r24
            r12.<init>(r4, r4, r4)
            com.moloco.sdk.internal.publisher.nativead.ui.e$c r4 = new com.moloco.sdk.internal.publisher.nativead.ui.e$c
            r4.<init>(r2)
            r17 = 1536(0x600, float:2.152E-42)
            r18 = 0
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = r4
            kotlin.jvm.functions.Function2 r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r4.invoke(r1, r2)
            android.view.View r1 = (android.view.View) r1
            r3.a(r1)
            r0.c = r1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r0.addView(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.ui.e.<init>(android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, kotlin.jvm.functions.Function0):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoView$moloco_sdk_release$annotations() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.a.destroy();
        removeAllViews();
        this.c = null;
        Lifecycle.State state = this.b.getState();
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            this.b.setCurrentState(state2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.b;
    }

    @Nullable
    public final View getVideoView$moloco_sdk_release() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    @VisibleForTesting
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "onAttachedToWindow", null, false, 12, null);
        this.b.setCurrentState(hasWindowFocus() ? Lifecycle.State.RESUMED : Lifecycle.State.STARTED);
    }

    @Override // android.view.ViewGroup, android.view.View
    @VisibleForTesting
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "onDetachedFromWindow", null, false, 12, null);
        if (this.b.getState() != Lifecycle.State.DESTROYED) {
            this.b.setCurrentState(Lifecycle.State.CREATED);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Lifecycle.State state = this.b.getState();
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        if (state.isAtLeast(state2)) {
            LifecycleRegistry lifecycleRegistry = this.b;
            if (z) {
                state2 = Lifecycle.State.RESUMED;
            }
            lifecycleRegistry.setCurrentState(state2);
        }
    }
}
