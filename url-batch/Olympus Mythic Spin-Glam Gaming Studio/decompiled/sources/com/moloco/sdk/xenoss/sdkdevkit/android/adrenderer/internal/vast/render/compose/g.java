package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.DECKt$DEC$1$1", f = "DEC.kt", l = {25}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.DECKt$DEC$1$1$1", f = "DEC.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g$a$a, reason: collision with other inner class name */
        public static final class C1655a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1655a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Continuation continuation) {
                super(2, continuation);
                this.b = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1655a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1655a(this.b, continuation);
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
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.b.a().getMain();
                C1655a c1655a = new C1655a(this.b, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c1655a, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.DECKt$DEC$2$1$1", f = "DEC.kt", l = {35}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function0 c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Continuation continuation) {
            super(2, continuation);
            this.c = function0;
            this.d = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((b) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.c, this.d, continuation);
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
                final Function0 function0 = this.c;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar = this.d;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return g.b.a(Function0.this, eVar, (Offset) obj2, (Offset) obj3);
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

        public static final Unit a(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Offset offset, Offset offset2) {
            if (function0 != null) {
                function0.mo4828invoke();
            } else {
                eVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a.a(offset.getPackedValue()));
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {
        public d(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.receiver).u();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Function0 function0, Function6 function6, Modifier modifier, int i, int i2, Composer composer, int i3) {
        a(eVar, function0, function6, modifier, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0090  */
    @Composable
    @ComposableInferredTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, @Nullable final Function0 function0, @Nullable final Function6 function6, @Nullable Modifier modifier, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        Object rememberedValue3;
        Composer.Companion companion;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-595771397);
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(function6) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-595771397, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.DEC (DEC.kt:22)");
                }
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(-602684476);
                changed = startRestartGroup.changed(viewModel);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new a(viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2) rememberedValue, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor = companion2.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(modifier4);
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
                Modifier testTag = TestTagKt.testTag(Modifier.INSTANCE, "DECContainer");
                startRestartGroup.startReplaceableGroup(491790676);
                changed2 = startRestartGroup.changed(function0) | startRestartGroup.changed(viewModel);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new b(function0, viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(testTag, unit, (Function2) rememberedValue2);
                String g = viewModel.g();
                startRestartGroup.startReplaceableGroup(491799591);
                rememberedValue3 = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return g.a();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(pointerInput, g, (Function0) rememberedValue3, viewModel.M(), startRestartGroup, 384, 0);
                startRestartGroup.startReplaceableGroup(491803165);
                if (function6 != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a2 = a(SnapshotStateKt.collectAsState(viewModel.O(), null, startRestartGroup, 0, 1));
                    startRestartGroup.startReplaceableGroup(1423888860);
                    boolean changed3 = startRestartGroup.changed(viewModel);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = new c(viewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    KFunction kFunction = (KFunction) rememberedValue4;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(1423890616);
                    boolean changed4 = startRestartGroup.changed(viewModel);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue5 == companion.getEmpty()) {
                        rememberedValue5 = new d(viewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceableGroup();
                    function6.invoke(boxScopeInstance, a2, kFunction, (KFunction) rememberedValue5, startRestartGroup, 6);
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
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e.this, function0, function6, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(-602684476);
        changed = startRestartGroup.changed(viewModel);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new a(viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2) rememberedValue, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0 constructor2 = companion22.getConstructor();
        Function3 materializerOf2 = LayoutKt.materializerOf(modifier4);
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
        Modifier testTag2 = TestTagKt.testTag(Modifier.INSTANCE, "DECContainer");
        startRestartGroup.startReplaceableGroup(491790676);
        changed2 = startRestartGroup.changed(function0) | startRestartGroup.changed(viewModel);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new b(function0, viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        Modifier pointerInput2 = SuspendingPointerInputFilterKt.pointerInput(testTag2, unit2, (Function2) rememberedValue2);
        String g2 = viewModel.g();
        startRestartGroup.startReplaceableGroup(491799591);
        rememberedValue3 = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue3 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r.a(pointerInput2, g2, (Function0) rememberedValue3, viewModel.M(), startRestartGroup, 384, 0);
        startRestartGroup.startReplaceableGroup(491803165);
        if (function6 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a(State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> state) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) state.getValue();
    }
}
