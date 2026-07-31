package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.R;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C5072a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class x {

    public static final class a implements Function3 {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o a;
        public final /* synthetic */ Function7 b;
        public final /* synthetic */ Function5 c;
        public final /* synthetic */ Function6 d;
        public final /* synthetic */ Function7 e;
        public final /* synthetic */ Q f;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i g;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1662a extends FunctionReferenceImpl implements Function0 {
            public C1662a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onReplay", "onReplay()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).z();
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function7 function7, Function5 function5, Function6 function6, Function7 function72, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar) {
            this.a = oVar;
            this.b = function7;
            this.c = function5;
            this.d = function6;
            this.e = function72;
            this.f = q;
            this.g = iVar;
        }

        @ComposableTarget
        @Composable
        public final void a(i.a aVar, Composer composer, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1218472412, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer.<anonymous>.<anonymous> (VastRenderer.kt:110)");
            }
            if (aVar instanceof i.a.C1646a) {
                composer.startReplaceableGroup(1864303375);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d = ((i.a.C1646a) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar = this.a;
                C5103a.a(d, oVar != null ? oVar.a() : null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1864311092);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d2 = ((i.a.c) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar2 = this.a;
                Function0 c = oVar2 != null ? oVar2.c() : null;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function7 function7 = this.b;
                Function5 function5 = this.c;
                Function6 function6 = this.d;
                Function7 function72 = this.e;
                Q q = this.f;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.g;
                composer.startReplaceableGroup(1864322699);
                boolean changed = composer.changed(iVar);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new C1662a(iVar);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(d2, c, fillMaxSize$default, function7, function5, function6, function72, q, (Function0) ((KFunction) rememberedValue), composer, 384, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(1864325634);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e d3 = ((i.a.b) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar3 = this.a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(d3, oVar3 != null ? oVar3.b() : null, this.d, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 3072, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(1959794654);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(1864302146);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1959832970);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((i.a) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1677a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.AbstractC1677a.c) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).A();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
        }

        public final void a(a.AbstractC1677a.c p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.AbstractC1677a.c) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements Function7 {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Function0 f;

        public e(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j, Function0 function0) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = function0;
        }

        public static final i.a b(State<? extends i.a> state) {
            return (i.a) state.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), (StateFlow) obj3, (Function1) obj4, (Function0) obj5, (Composer) obj6, ((Number) obj7).intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget
        @Composable
        public final void a(BoxScope boxScope, boolean z, StateFlow currentAdPartFlow, Function1 onButtonRendered, Function0 onCTA, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            Intrinsics.checkNotNullParameter(onCTA, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432764356, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous> (VastRenderer.kt:324)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1004334236, true, new a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i >> 6) & 14, 1), this.c, this.d, this.e, onCTA, this.f)), composer, ((i >> 3) & 14) | 196608, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final class a implements Function3 {
            public final /* synthetic */ Function1 a;
            public final /* synthetic */ State<i.a> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ long e;
            public final /* synthetic */ Function0 f;
            public final /* synthetic */ Function0 g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1 function1, State<? extends i.a> state, String str, String str2, long j, Function0 function0, Function0 function02) {
                this.a = function1;
                this.b = state;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = function0;
                this.g = function02;
            }

            @ComposableTarget
            @Composable
            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1004334236, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous> (VastRenderer.kt:343)");
                }
                i.a b2 = e.b(this.b);
                if (b2 instanceof i.a.C1646a) {
                    composer.startReplaceableGroup(1205021971);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1677a.c.EnumC1679a.g, this.a, ComposableLambdaKt.composableLambda(composer, -832302220, true, new C1663a(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.c) {
                    composer.startReplaceableGroup(1205613203);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1677a.c.EnumC1679a.g, this.a, ComposableLambdaKt.composableLambda(composer, 1517460509, true, new b(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.b) {
                    composer.startReplaceableGroup(1206186703);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.d) {
                    composer.startReplaceableGroup(1206272108);
                    composer.endReplaceableGroup();
                } else {
                    if (b2 != null) {
                        composer.startReplaceableGroup(-1485150361);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(1206306859);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public static final class b implements Function3 {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                public b(String str, String str2, long j, Function0 function0, Function0 function02) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = function0;
                    this.e = function02;
                }

                @ComposableTarget
                @Composable
                public final void a(Modifier it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1517460509, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:366)");
                    }
                    String str = this.a;
                    String str2 = this.b;
                    long j = this.c;
                    composer.startReplaceableGroup(-1483932583);
                    boolean changed = composer.changed(this.d) | composer.changed(this.e);
                    final Function0 function0 = this.d;
                    final Function0 function02 = this.e;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$e$a$b$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public final Object mo4828invoke() {
                                return x.e.a.b.a(Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r.a(it, str, str2, j, (Function0) rememberedValue, composer, i & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.mo4828invoke();
                    if (function02 != null) {
                        function02.mo4828invoke();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$e$a$a, reason: collision with other inner class name */
            public static final class C1663a implements Function3 {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                public C1663a(String str, String str2, long j, Function0 function0, Function0 function02) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = function0;
                    this.e = function02;
                }

                @ComposableTarget
                @Composable
                public final void a(Modifier it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-832302220, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:349)");
                    }
                    String str = this.a;
                    String str2 = this.b;
                    long j = this.c;
                    composer.startReplaceableGroup(-1483951655);
                    boolean changed = composer.changed(this.d) | composer.changed(this.e);
                    final Function0 function0 = this.d;
                    final Function0 function02 = this.e;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$e$a$a$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public final Object mo4828invoke() {
                                return x.e.a.C1663a.a(Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r.a(it, str, str2, j, (Function0) rememberedValue, composer, i & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.mo4828invoke();
                    if (function02 != null) {
                        function02.mo4828invoke();
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static final class f implements Function7 {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ Painter c;
        public final /* synthetic */ Painter d;
        public final /* synthetic */ Function0 e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ Shape i;
        public final /* synthetic */ long j;

        public f(Alignment alignment, PaddingValues paddingValues, Painter painter, Painter painter2, Function0 function0, long j, long j2, long j3, Shape shape, long j4) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = painter;
            this.d = painter2;
            this.e = function0;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = shape;
            this.j = j4;
        }

        public static final /* synthetic */ a.AbstractC1677a.c a(MutableState mutableState) {
            return b(mutableState);
        }

        public static final a.AbstractC1677a.c b(MutableState<a.AbstractC1677a.c> mutableState) {
            return (a.AbstractC1677a.c) mutableState.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Function2) obj4, (Function1) obj5, (Composer) obj6, ((Number) obj7).intValue());
            return Unit.INSTANCE;
        }

        public static final void b(MutableState<a.AbstractC1677a.c> mutableState, a.AbstractC1677a.c cVar) {
            mutableState.setValue(cVar);
        }

        @ComposableTarget
        @Composable
        public final void a(BoxScope boxScope, boolean z, boolean z2, Function2 onButtonReplaced, Function1 onMuteChange, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonReplaced, "onButtonReplaced");
            Intrinsics.checkNotNullParameter(onMuteChange, "onMuteChange");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changed(onButtonReplaced) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= composer.changed(onMuteChange) ? 16384 : 8192;
            }
            if ((74899 & i2) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-545982054, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous> (VastRenderer.kt:260)");
            }
            composer.startReplaceableGroup(-1304207447);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(a.AbstractC1677a.c.EnumC1679a.e), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -2071462974, true, new a(z2, this.c, this.d, (MutableState) rememberedValue, onButtonReplaced, onMuteChange, this.e, z, this.f, this.g, this.h, this.i, this.j)), composer, ((i2 >> 3) & 14) | 196608, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final class a implements Function3 {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ Painter b;
            public final /* synthetic */ Painter c;
            public final /* synthetic */ MutableState<a.AbstractC1677a.c> d;
            public final /* synthetic */ Function2 e;
            public final /* synthetic */ Function1 f;
            public final /* synthetic */ Function0 g;
            public final /* synthetic */ boolean h;
            public final /* synthetic */ long i;
            public final /* synthetic */ long j;
            public final /* synthetic */ long k;
            public final /* synthetic */ Shape l;
            public final /* synthetic */ long m;

            public a(boolean z, Painter painter, Painter painter2, MutableState<a.AbstractC1677a.c> mutableState, Function2 function2, Function1 function1, Function0 function0, boolean z2, long j, long j2, long j3, Shape shape, long j4) {
                this.a = z;
                this.b = painter;
                this.c = painter2;
                this.d = mutableState;
                this.e = function2;
                this.f = function1;
                this.g = function0;
                this.h = z2;
                this.i = j;
                this.j = j2;
                this.k = j3;
                this.l = shape;
                this.m = j4;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
                  (r2v10 ?? I:java.lang.Object) from 0x00e0: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r2v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:3217)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            @androidx.compose.runtime.ComposableTarget
            @androidx.compose.runtime.Composable
            public final void a(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
                  (r2v10 ?? I:java.lang.Object) from 0x00e0: INVOKE (r20v0 ?? I:androidx.compose.runtime.Composer), (r2v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:3217)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public static final Unit a(Function2 function2, boolean z, MutableState mutableState, a.AbstractC1677a.c it) {
                Intrinsics.checkNotNullParameter(it, "it");
                f.b(mutableState, it);
                function2.invoke(f.b(mutableState), z ? a.AbstractC1677a.c.EnumC1679a.e : a.AbstractC1677a.c.EnumC1679a.f);
                return Unit.INSTANCE;
            }

            public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                SemanticsPropertiesKt.setTestTag(semantics, str);
                return Unit.INSTANCE;
            }

            public static final Unit a(Function1 function1, boolean z, Function2 function2, Function0 function0, MutableState mutableState) {
                function1.invoke(Boolean.valueOf(!z));
                f.b(mutableState, new a.AbstractC1677a.c(z ? a.AbstractC1677a.c.EnumC1679a.e : a.AbstractC1677a.c.EnumC1679a.f, f.b(mutableState).e(), f.b(mutableState).f()));
                function2.invoke(f.b(mutableState), z ? a.AbstractC1677a.c.EnumC1679a.f : a.AbstractC1677a.c.EnumC1679a.e);
                if (function0 != null) {
                    function0.mo4828invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final class g implements Function5 {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ long c;

        public static final class a implements Function3 {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i b;
            public final /* synthetic */ long c;

            public a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, long j) {
                this.a = z;
                this.b = iVar;
                this.c = j;
            }

            @ComposableTarget
            @Composable
            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1435522410, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous>.<anonymous> (VastRenderer.kt:407)");
                }
                v.a(this.a, this.b, null, this.c, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }
        }

        public g(Alignment alignment, PaddingValues paddingValues, long j) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = j;
        }

        @ComposableTarget
        @Composable
        public final void a(BoxScope boxScope, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(progress, "progress");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(progress) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967084142, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous> (VastRenderer.kt:399)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z || ((progress instanceof i.c) && ((i.c) progress).c() > 0), PaddingKt.padding(boxScope.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.a), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -1435522410, true, new a(z, progress, this.c)), composer, 196608, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class h implements Function2 {
        public static final h a = new h();

        @Composable
        public final Function7 a(Composer composer, int i) {
            composer.startReplaceableGroup(-1165352185);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165352185, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:199)");
            }
            Function7 a2 = x.a(0L, 0L, null, 0L, null, null, 0L, null, null, null, composer, 0, 1023);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class i implements Function2 {
        public static final i a = new i();

        @Composable
        public final Function11 a(Composer composer, int i) {
            composer.startReplaceableGroup(1971947846);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1971947846, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:200)");
            }
            Function11 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class j implements Function2 {
        public static final j a = new j();

        @Composable
        public final Function11 a(Composer composer, int i) {
            composer.startReplaceableGroup(489092871);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489092871, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:201)");
            }
            Function11 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class k implements Function2 {
        public static final k a = new k();

        @Composable
        public final Function7 a(Composer composer, int i) {
            composer.startReplaceableGroup(-462412988);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462412988, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:203)");
            }
            Function7 a2 = x.a((Alignment) null, (PaddingValues) null, 0L, (String) null, (String) null, (Function0) null, composer, 0, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class l implements Function2 {
        public static final l a = new l();

        @Composable
        public final Function5 a(Composer composer, int i) {
            composer.startReplaceableGroup(-185458362);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-185458362, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:205)");
            }
            Function5 a2 = x.a((Alignment) null, (PaddingValues) null, 0L, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class m implements Function2 {
        public static final m a = new m();

        @Composable
        public final Function6 a(Composer composer, int i) {
            composer.startReplaceableGroup(1409102370);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409102370, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:206)");
            }
            Function6 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class n implements Function2 {
        public static final n a = new n();

        @Composable
        public final Void a(Composer composer, int i) {
            composer.startReplaceableGroup(-1364519647);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364519647, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:207)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class o implements Function2 {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Function2 c;
        public final /* synthetic */ Function2 d;
        public final /* synthetic */ Function2 e;
        public final /* synthetic */ Function2 f;
        public final /* synthetic */ Function2 g;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o h;
        public final /* synthetic */ Function2 i;
        public final /* synthetic */ Function2 j;
        public final /* synthetic */ Function2 k;
        public final /* synthetic */ Q l;
        public final /* synthetic */ boolean m;

        public static final class a implements Function2 {
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i a;
            public final /* synthetic */ long b;
            public final /* synthetic */ Function2 c;
            public final /* synthetic */ Function2 d;
            public final /* synthetic */ Function2 e;
            public final /* synthetic */ Function2 f;
            public final /* synthetic */ Function2 g;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o h;
            public final /* synthetic */ Function2 i;
            public final /* synthetic */ Function2 j;
            public final /* synthetic */ Function2 k;
            public final /* synthetic */ Q l;
            public final /* synthetic */ boolean m;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2 function26, Function2 function27, Function2 function28, Q q, boolean z) {
                this.a = iVar;
                this.b = j;
                this.c = function2;
                this.d = function22;
                this.e = function23;
                this.f = function24;
                this.g = function25;
                this.h = oVar;
                this.i = function26;
                this.j = function27;
                this.k = function28;
                this.l = q;
                this.m = z;
            }

            @ComposableTarget
            @Composable
            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2103457343, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:216)");
                }
                x.a(this.a, null, this.b, (Function7) this.c.invoke(composer, 0), (Function11) this.d.invoke(composer, 0), (Function11) this.e.invoke(composer, 0), (Function11) this.f.invoke(composer, 0), (Function7) this.g.invoke(composer, 0), this.h, (Function5) this.i.invoke(composer, 0), (Function6) this.j.invoke(composer, 0), (Function7) this.k.invoke(composer, 0), this.l, this.m, composer, 0, 0, 2);
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

        public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2 function26, Function2 function27, Function2 function28, Q q, boolean z) {
            this.a = iVar;
            this.b = j;
            this.c = function2;
            this.d = function22;
            this.e = function23;
            this.f = function24;
            this.g = function25;
            this.h = oVar;
            this.i = function26;
            this.j = function27;
            this.k = function28;
            this.l = q;
            this.m = z;
        }

        @ComposableTarget
        @Composable
        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482604196, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:215)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, ComposableLambdaKt.composableLambda(composer, 2103457343, true, new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m)), composer, 48, 1);
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

    public /* synthetic */ class p extends FunctionReferenceImpl implements Function3 {
        public static final p a = new p();

        public p() {
            super(3, x.class, "defaultMuteButtonView", "defaultMuteButtonView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/MuteButtonView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n invoke(Context p0, Flow p1, Flow p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.a(p0, p1, p2);
        }
    }

    public /* synthetic */ class q extends FunctionReferenceImpl implements Function3 {
        public static final q a = new q();

        public q() {
            super(3, x.class, "defaultProgressBarView", "defaultProgressBarView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/VastProgressBarView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Context p0, Flow p1, Flow p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return x.c(p0, p1, p2);
        }
    }

    public /* synthetic */ class r extends FunctionReferenceImpl implements Function2 {
        public static final r a = new r();

        public r() {
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

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Modifier modifier, long j2, Function7 function7, Function11 function11, Function11 function112, Function11 function113, Function7 function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function5 function5, Function6 function6, Function7 function73, Q q2, boolean z, int i2, int i3, int i4, Composer composer, int i5) {
        a(iVar, modifier, j2, function7, function11, function112, function113, function72, oVar, function5, function6, function73, q2, z, composer, i2 | 1, i3, i4);
        return Unit.INSTANCE;
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q b(@NotNull Context context, @NotNull Flow isPlaying, @NotNull Flow progress) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q(context, isPlaying, progress, 0, 0, null, null, null, null, 504, null);
    }

    @NotNull
    public static final w c(@NotNull Context context, @NotNull Flow isPlaying, @NotNull Flow progress) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new w(context, isPlaying, progress, 0, 0, 0, 56, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, @Nullable Modifier modifier, long j2, @Nullable Function7 function7, @Nullable Function11 function11, @Nullable Function11 function112, @Nullable Function11 function113, @Nullable Function7 function72, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, @Nullable Function5 function5, @Nullable Function6 function6, @Nullable Function7 function73, @NotNull final Q viewVisibilityTracker, boolean z, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Function11 function114;
        Function11 function115;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar2;
        int i6;
        Modifier modifier2;
        long m1456getBlack0d7_KjU;
        int i7;
        Function7 function74;
        int i8;
        Function11 function116;
        Function7 function75;
        Function5 function52;
        Function6 function62;
        Function5 function53;
        Function7 function76;
        boolean z2;
        int i9;
        int i10;
        Function7 function77;
        Function7 function78;
        boolean z3;
        Object obj;
        final boolean z4;
        Function5 function54;
        final Function7 function79;
        final Function11 function117;
        final Function11 function118;
        final Function7 function710;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar3;
        final Modifier modifier3;
        final Function7 function711;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Composer startRestartGroup = composer.startRestartGroup(1488753766);
        int i15 = 2;
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(adViewModel) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i17 = i5;
        int i18 = i4 & 4;
        if (i18 != 0) {
            i17 |= 384;
        } else if ((i2 & 384) == 0) {
            i17 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i4 & 8) == 0 && startRestartGroup.changed(function7)) {
                i14 = 2048;
                i17 |= i14;
            }
            i14 = 1024;
            i17 |= i14;
        }
        if ((i2 & 24576) == 0) {
            if ((i4 & 16) == 0 && startRestartGroup.changed(function11)) {
                i13 = 16384;
                i17 |= i13;
            }
            i13 = 8192;
            i17 |= i13;
        }
        if ((i2 & 196608) == 0) {
            function114 = function112;
            i17 |= ((i4 & 32) == 0 && startRestartGroup.changed(function114)) ? 131072 : 65536;
        } else {
            function114 = function112;
        }
        if ((i2 & 1572864) == 0) {
            function115 = function113;
            i17 |= ((i4 & 64) == 0 && startRestartGroup.changed(function115)) ? 1048576 : 524288;
        } else {
            function115 = function113;
        }
        if ((i2 & 12582912) == 0) {
            if ((i4 & 128) == 0 && startRestartGroup.changed(function72)) {
                i12 = 8388608;
                i17 |= i12;
            }
            i12 = 4194304;
            i17 |= i12;
        }
        int i19 = i4 & 256;
        if (i19 != 0) {
            i17 |= 100663296;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            if ((i2 & 100663296) == 0) {
                i17 |= startRestartGroup.changed(oVar2) ? 67108864 : 33554432;
            }
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            if ((i4 & 512) == 0 && startRestartGroup.changed(function5)) {
                i11 = 536870912;
                i17 |= i11;
            }
            i11 = 268435456;
            i17 |= i11;
        }
        if ((i3 & 6) == 0) {
            if ((i4 & 1024) == 0 && startRestartGroup.changed(function6)) {
                i15 = 4;
            }
            i6 = i3 | i15;
        } else {
            i6 = i3;
        }
        int i20 = i4 & 2048;
        if (i20 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(function73) ? 32 : 16;
        }
        if ((i4 & 4096) != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 |= startRestartGroup.changed(viewVisibilityTracker) ? 256 : 128;
        }
        int i21 = 8192 & i4;
        if (i21 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
            if ((i17 & 306783379) != 306783378 && (i6 & 1171) == 1170 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                j3 = j2;
                function710 = function7;
                function118 = function11;
                function54 = function5;
                function62 = function6;
                function79 = function73;
                z4 = z;
                function117 = function114;
                oVar3 = oVar2;
                function711 = function72;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier2 = i16 == 0 ? Modifier.INSTANCE : modifier;
                    m1456getBlack0d7_KjU = i18 == 0 ? Color.INSTANCE.m1456getBlack0d7_KjU() : j2;
                    if ((i4 & 8) == 0) {
                        i7 = i17 & (-7169);
                        function74 = a(0L, 0L, null, 0L, null, null, 0L, null, null, null, startRestartGroup, 0, 1023);
                    } else {
                        i7 = i17;
                        function74 = function7;
                    }
                    if ((i4 & 16) == 0) {
                        i8 = i7 & (-57345);
                        function116 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, startRestartGroup, 0, 255);
                    } else {
                        i8 = i7;
                        function116 = function11;
                    }
                    if ((i4 & 32) != 0) {
                        function114 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, 0L, 0L, 0L, null, null, null, startRestartGroup, 0, 255);
                        i8 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        i8 &= -3670017;
                        function115 = function114;
                    }
                    if ((128 & i4) == 0) {
                        function75 = a((Alignment) null, (PaddingValues) null, 0L, (String) null, (String) null, (Function0) null, startRestartGroup, 0, 63);
                        i8 &= -29360129;
                    } else {
                        function75 = function72;
                    }
                    if (i19 != 0) {
                        oVar2 = null;
                    }
                    if ((i4 & 512) == 0) {
                        function52 = a((Alignment) null, (PaddingValues) null, 0L, startRestartGroup, 0, 7);
                        i8 &= -1879048193;
                    } else {
                        function52 = function5;
                    }
                    Function7 function712 = function74;
                    Function7 function713 = function75;
                    if ((1024 & i4) == 0) {
                        function62 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(null, null, startRestartGroup, 0, 3);
                        i6 &= -15;
                    } else {
                        function62 = function6;
                    }
                    Function7 function714 = i20 == 0 ? null : function73;
                    function53 = function52;
                    function76 = function713;
                    if (i21 == 0) {
                        i9 = i6;
                        i10 = i8;
                        z2 = true;
                    } else {
                        z2 = z;
                        i9 = i6;
                        i10 = i8;
                    }
                    function77 = function714;
                    function78 = function712;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i4 & 8) != 0) {
                        i17 &= -7169;
                    }
                    if ((16 & i4) != 0) {
                        i17 &= -57345;
                    }
                    if ((32 & i4) != 0) {
                        i17 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        i17 &= -3670017;
                    }
                    if ((128 & i4) != 0) {
                        i17 &= -29360129;
                    }
                    if ((i4 & 512) != 0) {
                        i17 &= -1879048193;
                    }
                    if ((1024 & i4) != 0) {
                        i6 &= -15;
                    }
                    modifier2 = modifier;
                    m1456getBlack0d7_KjU = j2;
                    function78 = function7;
                    function116 = function11;
                    function53 = function5;
                    function62 = function6;
                    z2 = z;
                    i10 = i17;
                    i9 = i6;
                    function76 = function72;
                    function77 = function73;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1488753766, i10, i9, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer (VastRenderer.kt:101)");
                }
                Modifier m158backgroundbw27NRU$default = BackgroundKt.m158backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m1456getBlack0d7_KjU, null, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion = Alignment.INSTANCE;
                Modifier modifier4 = modifier2;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                z3 = z2;
                Function0 constructor = companion2.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(m158backgroundbw27NRU$default);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                State collectAsState = SnapshotStateKt.collectAsState(adViewModel.k(), null, startRestartGroup, 0, 1);
                CrossfadeKt.Crossfade(a((State<? extends i.a>) collectAsState), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1218472412, true, new a(oVar2, function78, function53, function62, function77, viewVisibilityTracker, adViewModel)), startRestartGroup, 3072, 6);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance, adViewModel, a((State<? extends i.a>) collectAsState), function114, function116, function115, startRestartGroup, ((i10 >> 3) & 458752) | ((i10 << 3) & 112) | 6 | ((i10 >> 6) & 7168) | (57344 & i10), 0);
                startRestartGroup.startReplaceableGroup(-1443689911);
                if (function76 != null) {
                    obj = adViewModel;
                } else {
                    Boolean valueOf = Boolean.valueOf(b(SnapshotStateKt.collectAsState(adViewModel.n(), null, startRestartGroup, 0, 1)));
                    StateFlow k2 = adViewModel.k();
                    startRestartGroup.startReplaceableGroup(1864349683);
                    obj = adViewModel;
                    boolean changed = startRestartGroup.changed(obj);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new b(obj);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    KFunction kFunction = (KFunction) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(1864351176);
                    boolean changed2 = startRestartGroup.changed(obj);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new c(obj);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    function76.invoke(boxScopeInstance, valueOf, k2, kFunction, (KFunction) rememberedValue2, startRestartGroup, 6);
                    Unit unit = Unit.INSTANCE;
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-1443680835);
                if (z3) {
                    Function5 b2 = C5072a.b(PaddingKt.m334padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, companion.getBottomStart()), Dp.m2507constructorimpl(12)), null, null, null, startRestartGroup, 0, 14);
                    startRestartGroup.startReplaceableGroup(-1443674828);
                    boolean changed3 = startRestartGroup.changed(obj);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new d(obj);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    b2.invoke(boxScopeInstance, (KFunction) rememberedValue3, adViewModel.k(), startRestartGroup, 6);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                function54 = function53;
                function79 = function77;
                function117 = function114;
                function118 = function116;
                function710 = function78;
                oVar3 = oVar2;
                modifier3 = modifier4;
                function711 = function76;
                j3 = m1456getBlack0d7_KjU;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Function11 function119 = function115;
                final Function5 function55 = function54;
                final Function6 function63 = function62;
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.this, modifier3, j3, function710, function118, function117, function119, function711, oVar3, function55, function63, function79, viewVisibilityTracker, z4, i2, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i17 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((128 & i4) == 0) {
        }
        if (i19 != 0) {
        }
        if ((i4 & 512) == 0) {
        }
        Function7 function7122 = function74;
        Function7 function7132 = function75;
        if ((1024 & i4) == 0) {
        }
        if (i20 == 0) {
        }
        function53 = function52;
        function76 = function7132;
        if (i21 == 0) {
        }
        function77 = function714;
        function78 = function7122;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m158backgroundbw27NRU$default2 = BackgroundKt.m158backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m1456getBlack0d7_KjU, null, 2, null);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Modifier modifier42 = modifier2;
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        z3 = z2;
        Function0 constructor2 = companion22.getConstructor();
        Function3 materializerOf2 = LayoutKt.materializerOf(m158backgroundbw27NRU$default2);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl2, density2, companion22.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        State collectAsState2 = SnapshotStateKt.collectAsState(adViewModel.k(), null, startRestartGroup, 0, 1);
        CrossfadeKt.Crossfade(a((State<? extends i.a>) collectAsState2), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1218472412, true, new a(oVar2, function78, function53, function62, function77, viewVisibilityTracker, adViewModel)), startRestartGroup, 3072, 6);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance2, adViewModel, a((State<? extends i.a>) collectAsState2), function114, function116, function115, startRestartGroup, ((i10 >> 3) & 458752) | ((i10 << 3) & 112) | 6 | ((i10 >> 6) & 7168) | (57344 & i10), 0);
        startRestartGroup.startReplaceableGroup(-1443689911);
        if (function76 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1443680835);
        if (z3) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z3;
        function54 = function53;
        function79 = function77;
        function117 = function114;
        function118 = function116;
        function710 = function78;
        oVar3 = oVar2;
        modifier3 = modifier42;
        function711 = function76;
        j3 = m1456getBlack0d7_KjU;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean b(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static /* synthetic */ Function2 a(long j2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2 function26, Function2 function27, Function2 function28, Q q2, boolean z, int i2, Object obj) {
        long m1456getBlack0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m1456getBlack0d7_KjU() : j2;
        Function2 function29 = (i2 & 2) != 0 ? h.a : function2;
        Function2 function210 = (i2 & 4) != 0 ? i.a : function22;
        Function2 function211 = (i2 & 8) != 0 ? j.a : function23;
        return a(m1456getBlack0d7_KjU, function29, function210, function211, (i2 & 16) != 0 ? function211 : function24, (i2 & 32) != 0 ? k.a : function25, (i2 & 64) != 0 ? null : oVar, (i2 & 128) != 0 ? l.a : function26, (i2 & 256) != 0 ? m.a : function27, (i2 & 512) != 0 ? n.a : function28, (i2 & 1024) != 0 ? a.h.a.k() : q2, (i2 & 2048) != 0 ? true : z);
    }

    @ComposableInferredTarget
    @NotNull
    public static final Function2 a(final long j2, @NotNull final Function2 muteButton, @NotNull final Function2 adCloseCountdownButton, @NotNull final Function2 adSkipCountdownButton, @NotNull final Function2 adSkipCountdownButtonForEndcards, @NotNull final Function2 ctaButton, @Nullable final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, @NotNull final Function2 progressBar, @NotNull final Function2 vastIcon, @NotNull final Function2 playbackControl, @NotNull final Q viewVisibilityTracker, final boolean z) {
        Intrinsics.checkNotNullParameter(muteButton, "muteButton");
        Intrinsics.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        Intrinsics.checkNotNullParameter(adSkipCountdownButton, "adSkipCountdownButton");
        Intrinsics.checkNotNullParameter(adSkipCountdownButtonForEndcards, "adSkipCountdownButtonForEndcards");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(vastIcon, "vastIcon");
        Intrinsics.checkNotNullParameter(playbackControl, "playbackControl");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        return new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x.a(j2, muteButton, adCloseCountdownButton, adSkipCountdownButton, adSkipCountdownButtonForEndcards, ctaButton, oVar, progressBar, vastIcon, playbackControl, viewVisibilityTracker, z, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        };
    }

    public static final ComposeView a(long j2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Function2 function26, Function2 function27, Function2 function28, Q q2, boolean z, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.moloco_fullscreen_ad_view_id);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1482604196, true, new o(adViewModel, j2, function2, function22, function23, function24, function25, oVar, function26, function27, function28, q2, z)));
        return composeView;
    }

    @Composable
    @NotNull
    public static final Function7 a(long j2, long j3, @Nullable Shape shape, long j4, @Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j5, @Nullable Painter painter, @Nullable Painter painter2, @Nullable Function0 function0, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(447650301);
        long b2 = (i3 & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
        long j6 = (i3 & 2) != 0 ? b2 : j3;
        Shape f2 = (i3 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
        long e2 = (i3 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j4;
        Alignment topStart = (i3 & 16) != 0 ? Alignment.INSTANCE.getTopStart() : alignment;
        PaddingValues m329PaddingValues0680j_4 = (i3 & 32) != 0 ? PaddingKt.m329PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m796getPrimary0d7_KjU = (i3 & 64) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m796getPrimary0d7_KjU() : j5;
        Painter painterResource = (i3 & 128) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_volume_off_24, composer, 0) : painter;
        Painter painterResource2 = (i3 & 256) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_volume_up_24, composer, 0) : painter2;
        Function0 function02 = (i3 & 512) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(447650301, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton (VastRenderer.kt:255)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -545982054, true, new f(topStart, m329PaddingValues0680j_4, painterResource, painterResource2, function02, m796getPrimary0d7_KjU, b2, j6, f2, e2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    @Composable
    @NotNull
    public static final Function7 a(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j2, @Nullable String str, @Nullable String str2, @Nullable Function0 function0, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-926425258);
        Alignment bottomEnd = (i3 & 1) != 0 ? Alignment.INSTANCE.getBottomEnd() : alignment;
        PaddingValues m329PaddingValues0680j_4 = (i3 & 2) != 0 ? PaddingKt.m329PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m796getPrimary0d7_KjU = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m796getPrimary0d7_KjU() : j2;
        String stringResource = (i3 & 8) != 0 ? StringResources_androidKt.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        String str3 = (i3 & 16) != 0 ? null : str2;
        Function0 function02 = (i3 & 32) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-926425258, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton (VastRenderer.kt:323)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 432764356, true, new e(bottomEnd, m329PaddingValues0680j_4, str3, stringResource, m796getPrimary0d7_KjU, function02));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    @Composable
    @NotNull
    public static final Function5 a(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, long j2, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(716005120);
        if ((i3 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomCenter();
        }
        if ((i3 & 2) != 0) {
            paddingValues = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(0));
        }
        if ((i3 & 4) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m796getPrimary0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(716005120, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar (VastRenderer.kt:398)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1967084142, true, new g(alignment, paddingValues, j2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static /* synthetic */ Function5 a(String str, String str2, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        return a(str, str2, num, num2);
    }

    @NotNull
    public static final Function5 a(@Nullable final String str, @Nullable final String str2, @ColorInt @Nullable final Integer num, @ColorInt @Nullable final Integer num2) {
        return new Function5() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return x.a(str, num, num2, str2, (Context) obj, (Flow) obj2, (StateFlow) obj3, (Function1) obj4, (Function0) obj5);
            }
        };
    }

    public static final com.moloco.sdk.internal.s a(String str, Integer num, Integer num2, String str2, Context context, Flow ctaAvailable, StateFlow currentAdPart, Function1 onButtonRendered, Function0 onCTA) {
        Function1 a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ctaAvailable, "ctaAvailable");
        Intrinsics.checkNotNullParameter(currentAdPart, "currentAdPart");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onCTA, "onCTA");
        a2 = com.moloco.sdk.internal.v.a(ctaAvailable, currentAdPart, onButtonRendered, onCTA, (r22 & 16) != 0 ? 8388693 : 0, (r22 & 32) != 0 ? null : null, (r22 & 64) != 0 ? null : str, (r22 & 128) != 0 ? null : num, (r22 & 256) != 0 ? null : num2, (r22 & 512) != 0 ? null : str2);
        return (com.moloco.sdk.internal.s) a2.invoke(context);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n a(@NotNull Context context, @NotNull Flow isPlayerPlaying, @NotNull Flow mute) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlayerPlaying, "isPlayerPlaying");
        Intrinsics.checkNotNullParameter(mute, "mute");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n(context, isPlayerPlaying, mute, 0, 0, 0, 0, 0, 0, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED, null);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k a(@NotNull Context context, @NotNull Flow vastPrivacyIcon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastPrivacyIcon, "vastPrivacyIcon");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k(context, vastPrivacyIcon, 0, 0, 12, null);
    }

    @NotNull
    public static final View a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setClickable(false);
        view.setFocusable(false);
        view.setImportantForAccessibility(2);
        return view;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    @NotNull
    public static final Function2 a(@Nullable final Lifecycle lifecycle, @ColorInt final int i2, @Nullable final Function3 function3, @Nullable final Function3 function32, @Nullable final Function3 function33, @Nullable final Function2 function2, @Nullable final Function5 function5, @Nullable final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, @NotNull final Q viewVisibilityTracker, final boolean z, @NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull final Function0 onShouldReplay) {
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        return new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x.a(Lifecycle.this, i2, function3, function32, function33, function2, function5, oVar, viewVisibilityTracker, z, externalLinkHandler, onShouldReplay, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        };
    }

    public static final y a(Lifecycle lifecycle, int i2, Function3 function3, Function3 function32, Function3 function33, Function2 function2, Function5 function5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar, Q q2, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function0 function0, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        return new y(context, adViewModel, lifecycle, i2, function3, function32, function33, function2, function5, oVar, q2, z, rVar, function0);
    }

    public static final i.a a(State<? extends i.a> state) {
        return (i.a) state.getValue();
    }
}
