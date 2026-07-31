package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C5103a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5103a {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionKt$Companion$1$1", f = "Companion.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$a, reason: collision with other inner class name */
    public static final class C1650a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionKt$Companion$1$1$1", f = "Companion.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$a$a, reason: collision with other inner class name */
        public static final class C1651a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1651a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, Continuation continuation) {
                super(2, continuation);
                this.b = hVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1651a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1651a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.b();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1650a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, Continuation continuation) {
            super(2, continuation);
            this.b = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1650a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1650a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.b.a().getMain();
                C1651a c1651a = new C1651a(this.b, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c1651a, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionKt$Companion$3$1", f = "Companion.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$b */
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, Continuation continuation) {
            super(2, continuation);
            this.c = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((b) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.b;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar = this.c;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return C5103a.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.this, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.a = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(pointerInputScope, function2, this) == coroutine_suspended) {
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

        public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, Offset offset, Offset offset2) {
            hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a.a(offset.getPackedValue()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionKt$Companion$4$1", f = "Companion.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$c */
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h c;
        public final /* synthetic */ Function0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.c = hVar;
            this.d = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((c) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.c, this.d, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.b;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar = this.c;
                final Function0 function0 = this.d;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$c$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return C5103a.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.this, function0, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.a = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(pointerInputScope, function2, this) == coroutine_suspended) {
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

        public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, Function0 function0, Offset offset, Offset offset2) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a;
            hVar.a(cVar.a(offset.getPackedValue()));
            if (function0 != null) {
                function0.mo4828invoke();
            } else {
                hVar.b(cVar.a(offset.getPackedValue()));
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$d */
    public static final class d implements DisposableEffectResult {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h a;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar) {
            this.a = hVar;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.a.y();
        }
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        a(hVar, function0, modifier, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(j.b bVar, Modifier modifier, int i, int i2, Composer composer, int i3) {
        a(bVar, modifier, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    @ComposableTarget
    @Composable
    public static final void a(@NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, @Nullable final Function0 function0, @Nullable Modifier modifier, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-1013674470);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1013674470, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Companion (Companion.kt:41)");
            }
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1879727858);
            boolean changed = startRestartGroup.changed(viewModel);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new C1650a(viewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2) rememberedValue, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1879723537);
            boolean changed2 = startRestartGroup.changed(viewModel);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5103a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.this, (DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1) rememberedValue2, startRestartGroup, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a = a(SnapshotStateKt.collectAsState(viewModel.K(), null, startRestartGroup, 0, 1));
            if (a instanceof j.a) {
                startRestartGroup.startReplaceableGroup(1858351850);
                startRestartGroup.startReplaceableGroup(-1879713188);
                boolean changed3 = startRestartGroup.changed(viewModel);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new b(viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                z.a((j.a) a, SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (Function2) rememberedValue3), startRestartGroup, 0, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (a instanceof j.b) {
                startRestartGroup.startReplaceableGroup(1858734483);
                startRestartGroup.startReplaceableGroup(-1879701076);
                boolean changed4 = startRestartGroup.changed(viewModel) | startRestartGroup.changed(function0);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new c(viewModel, function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                a((j.b) a, SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (Function2) rememberedValue4), startRestartGroup, 0, 0);
                startRestartGroup.endReplaceableGroup();
            } else if (a == null) {
                startRestartGroup.startReplaceableGroup(1859162717);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1879717243);
                startRestartGroup.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5103a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.this, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @ComposableTarget
    @Composable
    public static final void a(final j.b bVar, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2103037730);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103037730, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionVastResourceImage (Companion.kt:85)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            A.a(bVar, null, startRestartGroup, i3 & 14, 2);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5103a.a(j.b.this, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @ComposableTarget
    @Composable
    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-882012692);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-882012692, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionVastResourceImagePreview (Companion.kt:96)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, C5107c.a.a(), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5103a.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final DisposableEffectResult a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new d(hVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a(State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> state) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) state.getValue();
    }
}
