package com.composeunstyled;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.composables.core.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: Modal.android.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0007¢\u0006\u0002\u0010\t\"\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Modal", "", "onKeyEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LocalModalWindow", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/view/Window;", "getLocalModalWindow", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Modal_androidKt {
    private static final ProvidableCompositionLocal<Window> LocalModalWindow = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.composeunstyled.Modal_androidKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Window LocalModalWindow$lambda$10;
            LocalModalWindow$lambda$10 = Modal_androidKt.LocalModalWindow$lambda$10();
            return LocalModalWindow$lambda$10;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Modal$lambda$9(Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        Modal(function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void Modal(Function1<? super KeyEvent, Boolean> function1, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final Function1<? super KeyEvent, Boolean> function12;
        int i3;
        Function1<? super KeyEvent, Boolean> function13;
        final View view;
        Object obj;
        final Function1<? super KeyEvent, Boolean> function14;
        int i4;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-336426422);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            function12 = function1;
        } else if ((i & 6) == 0) {
            function12 = function1;
            i3 = (startRestartGroup.changedInstance(function12) ? 4 : 2) | i;
        } else {
            function12 = function1;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                startRestartGroup.startReplaceGroup(1849434622);
                Modal_androidKt$Modal$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.Modal_androidKt$Modal$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m9521invokeZmokQxo(keyEvent.m6792unboximpl());
                        }

                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m9521invokeZmokQxo(android.view.KeyEvent it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return false;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function13 = (Function1) rememberedValue;
                startRestartGroup.endReplaceGroup();
            } else {
                function13 = function12;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336426422, i3, -1, "com.composeunstyled.Modal (Modal.android.kt:31)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view2 = (View) consume;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume2;
            int i6 = i3;
            final CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.composeunstyled.Modal_androidKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        UUID randomUUID;
                        randomUUID = UUID.randomUUID();
                        return randomUUID;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            final UUID uuid = (UUID) RememberSaveableKt.m5102rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = ((i6 & 14) == 4) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(uuid) | startRestartGroup.changedInstance(rememberCompositionContext) | ((i6 & 112) == 32) | startRestartGroup.changedInstance(view2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                view = view2;
                function14 = function13;
                i4 = 0;
                obj = new Function1() { // from class: com.composeunstyled.Modal_androidKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult Modal$lambda$8$lambda$7;
                        Modal$lambda$8$lambda$7 = Modal_androidKt.Modal$lambda$8$lambda$7(context, view, uuid, rememberCompositionContext, function14, content, (DisposableEffectScope) obj2);
                        return Modal$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
            } else {
                view = view2;
                obj = rememberedValue3;
                i4 = 0;
                function14 = function13;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj, startRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function12 = function14;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Modal_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit Modal$lambda$9;
                    Modal$lambda$9 = Modal_androidKt.Modal$lambda$9(Function1.this, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return Modal$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ComposeView] */
    public static final DisposableEffectResult Modal$lambda$8$lambda$7(Context context, View view, UUID uuid, CompositionContext compositionContext, final Function1 function1, final Function2 function2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final ComponentDialog componentDialog = new ComponentDialog(context, R.style.TranslucentDialog);
        ?? composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "modal_" + uuid);
        composeView.setParentCompositionContext(compositionContext);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1795223865, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Modal_androidKt$Modal$2$1$dialog$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* compiled from: Modal.android.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.composeunstyled.Modal_androidKt$Modal$2$1$dialog$1$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ Function1<KeyEvent, Boolean> $onKeyEvent;

                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function1<? super KeyEvent, Boolean> function1, Function2<? super Composer, ? super Integer, Unit> function2) {
                    this.$onKeyEvent = function1;
                    this.$content = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1) {
                    function1.invoke(KeyEvent.m6786boximpl(KeyEvent.m6787constructorimpl(new android.view.KeyEvent(0, 4))));
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2132002297, i, -1, "com.composeunstyled.Modal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Modal.android.kt:48)");
                    }
                    Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.INSTANCE, this.$onKeyEvent);
                    final Function1<KeyEvent, Boolean> function1 = this.$onKeyEvent;
                    Function2<Composer, Integer, Unit> function2 = this.$content;
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onKeyEvent);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    boolean changed = composer.changed(function1);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ea: CONSTRUCTOR (r2v12 'rememberedValue' java.lang.Object) = 
                              (r0v3 'function1' kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> A[DONT_INLINE])
                             A[MD:(kotlin.jvm.functions.Function1):void (m)] (LINE:51) call: com.composeunstyled.Modal_androidKt$Modal$2$1$dialog$1$1$1$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.composeunstyled.Modal_androidKt$Modal$2$1$dialog$1$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.composeunstyled.Modal_androidKt$Modal$2$1$dialog$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instructions count: 281
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.Modal_androidKt$Modal$2$1$dialog$1$1$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1795223865, i, -1, "com.composeunstyled.Modal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Modal.android.kt:45)");
                    }
                    Window window = ComponentDialog.this.getWindow();
                    if (window == null) {
                        throw new IllegalStateException("Attempted to get the dialog's window without content. This should never happen and it's a bug in the library. Kindly open an issue with the steps to reproduce so that we fix it ASAP: https://github.com/composablehorizons/compose-unstyled/issues/new".toString());
                    }
                    CompositionLocalKt.CompositionLocalProvider(Modal_androidKt.getLocalModalWindow().provides(window), ComposableLambdaKt.rememberComposableLambda(2132002297, true, new AnonymousClass1(function1, function2), composer, 54), composer, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            objectRef.element = composeView;
            componentDialog.setContentView((View) objectRef.element);
            ViewTreeLifecycleOwner.set((View) objectRef.element, ViewTreeLifecycleOwner.get(view));
            ViewTreeViewModelStoreOwner.set((View) objectRef.element, ViewTreeViewModelStoreOwner.get(view));
            ViewTreeSavedStateRegistryOwner.set((View) objectRef.element, ViewTreeSavedStateRegistryOwner.get(view));
            componentDialog.setCancelable(false);
            componentDialog.setCanceledOnTouchOutside(false);
            Window window = componentDialog.getWindow();
            if (window == null) {
                throw new IllegalArgumentException("Tried to use a Modal without a window. Is your parent composable attached to an Activity?".toString());
            }
            WindowCompat.setDecorFitsSystemWindows(window, false);
            if (Build.VERSION.SDK_INT >= 30) {
                window.setSoftInputMode(48);
            } else {
                window.setSoftInputMode(16);
            }
            window.setDimAmount(0.0f);
            window.setWindowAnimations(-1);
            componentDialog.show();
            return new DisposableEffectResult() { // from class: com.composeunstyled.Modal_androidKt$Modal$lambda$8$lambda$7$$inlined$onDispose$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    ((ComposeView) Ref.ObjectRef.this.element).disposeComposition();
                    componentDialog.dismiss();
                }
            };
        }

        public static final ProvidableCompositionLocal<Window> getLocalModalWindow() {
            return LocalModalWindow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Window LocalModalWindow$lambda$10() {
            throw new IllegalStateException("CompositionLocal LocalModalWindow not present – did you try to access the modal window without a modal visible on the screen?".toString());
        }
    }
