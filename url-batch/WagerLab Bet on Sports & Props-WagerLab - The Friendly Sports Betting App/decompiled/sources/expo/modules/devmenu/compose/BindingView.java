package expo.modules.devmenu.compose;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import expo.interfaces.devmenu.DevMenuManagerInterface;
import expo.modules.devmenu.DevMenuManager;
import expo.modules.devmenu.compose.DevMenuAction;
import expo.modules.devmenu.compose.newtheme.AppThemeKt;
import expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BindingView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/devmenu/compose/BindingView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "lazyViewModel", "Lkotlin/Lazy;", "Lexpo/modules/devmenu/compose/DevMenuViewModel;", "<init>", "(Landroid/content/Context;Lkotlin/Lazy;)V", "viewModel", "getViewModel", "()Lexpo/modules/devmenu/compose/DevMenuViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BindingView extends LinearLayout {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindingView(final Context context, final Lazy<DevMenuViewModel> lazyViewModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lazyViewModel, "lazyViewModel");
        this.viewModel = lazyViewModel;
        setZ(Float.MAX_VALUE);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2043768585, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.BindingView$1$1

            /* compiled from: BindingView.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: expo.modules.devmenu.compose.BindingView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ Lazy<DevMenuViewModel> $lazyViewModel;
                final /* synthetic */ BindingView this$0;

                AnonymousClass1(BindingView bindingView, Lazy<DevMenuViewModel> lazy, Context context) {
                    this.this$0 = bindingView;
                    this.$lazyViewModel = lazy;
                    this.$context = context;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C22@774L19,22@738L56,25@906L84,28@1024L235,23@807L466:BindingView.kt#9zz9vv");
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-31315007, i, -1, "expo.modules.devmenu.compose.BindingView.<anonymous>.<anonymous>.<anonymous> (BindingView.kt:22)");
                    }
                    DevMenuState state = this.this$0.getViewModel().getState();
                    DevMenuViewModel viewModel = this.this$0.getViewModel();
                    composer.startReplaceGroup(5004770);
                    ComposerKt.sourceInformation(composer, "CC(remember):BindingView.kt#9igjgp");
                    boolean changedInstance = composer.changedInstance(viewModel);
                    BindingView$1$1$1$1$1 rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new BindingView$1$1$1$1$1(viewModel);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    DevMenuBottomSheetKt.DevMenuBottomSheet(state, (Function1) rememberedValue, composer, 0, 0);
                    DevMenuState state2 = this.this$0.getViewModel().getState();
                    composer.startReplaceGroup(5004770);
                    ComposerKt.sourceInformation(composer, "CC(remember):BindingView.kt#9igjgp");
                    boolean changedInstance2 = composer.changedInstance(this.$lazyViewModel);
                    final Lazy<DevMenuViewModel> lazy = this.$lazyViewModel;
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008d: CONSTRUCTOR (r4v6 'rememberedValue2' java.lang.Object) = (r0v6 'lazy' kotlin.Lazy<expo.modules.devmenu.compose.DevMenuViewModel> A[DONT_INLINE]) A[MD:(kotlin.Lazy):void (m)] (LINE:26) call: expo.modules.devmenu.compose.BindingView$1$1$1$$ExternalSyntheticLambda0.<init>(kotlin.Lazy):void type: CONSTRUCTOR in method: expo.modules.devmenu.compose.BindingView$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: expo.modules.devmenu.compose.BindingView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "C22@774L19,22@738L56,25@906L84,28@1024L235,23@807L466:BindingView.kt#9zz9vv"
                            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
                            r0 = r15 & 3
                            r1 = 2
                            if (r0 != r1) goto L15
                            boolean r0 = r14.getSkipping()
                            if (r0 != 0) goto L11
                            goto L15
                        L11:
                            r14.skipToGroupEnd()
                            return
                        L15:
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L24
                            r0 = -1
                            java.lang.String r1 = "expo.modules.devmenu.compose.BindingView.<anonymous>.<anonymous>.<anonymous> (BindingView.kt:22)"
                            r2 = -31315007(0xfffffffffe222bc1, float:-5.389053E37)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r15, r0, r1)
                        L24:
                            expo.modules.devmenu.compose.BindingView r15 = r13.this$0
                            expo.modules.devmenu.compose.DevMenuViewModel r15 = r15.getViewModel()
                            expo.modules.devmenu.compose.DevMenuState r15 = r15.getState()
                            expo.modules.devmenu.compose.BindingView r0 = r13.this$0
                            expo.modules.devmenu.compose.DevMenuViewModel r0 = r0.getViewModel()
                            r1 = 5004770(0x4c5de2, float:7.013177E-39)
                            r14.startReplaceGroup(r1)
                            java.lang.String r2 = "CC(remember):BindingView.kt#9igjgp"
                            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
                            boolean r3 = r14.changedInstance(r0)
                            java.lang.Object r4 = r14.rememberedValue()
                            if (r3 != 0) goto L51
                            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r3 = r3.getEmpty()
                            if (r4 != r3) goto L5c
                        L51:
                            expo.modules.devmenu.compose.BindingView$1$1$1$1$1 r3 = new expo.modules.devmenu.compose.BindingView$1$1$1$1$1
                            r3.<init>(r0)
                            r4 = r3
                            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                            r14.updateRememberedValue(r4)
                        L5c:
                            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                            r14.endReplaceGroup()
                            r0 = 0
                            expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt.DevMenuBottomSheet(r15, r4, r14, r0, r0)
                            expo.modules.devmenu.compose.BindingView r15 = r13.this$0
                            expo.modules.devmenu.compose.DevMenuViewModel r15 = r15.getViewModel()
                            expo.modules.devmenu.compose.DevMenuState r3 = r15.getState()
                            r14.startReplaceGroup(r1)
                            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
                            kotlin.Lazy<expo.modules.devmenu.compose.DevMenuViewModel> r15 = r13.$lazyViewModel
                            boolean r15 = r14.changedInstance(r15)
                            kotlin.Lazy<expo.modules.devmenu.compose.DevMenuViewModel> r0 = r13.$lazyViewModel
                            java.lang.Object r4 = r14.rememberedValue()
                            if (r15 != 0) goto L8b
                            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r15 = r15.getEmpty()
                            if (r4 != r15) goto L93
                        L8b:
                            expo.modules.devmenu.compose.BindingView$1$1$1$$ExternalSyntheticLambda0 r4 = new expo.modules.devmenu.compose.BindingView$1$1$1$$ExternalSyntheticLambda0
                            r4.<init>(r0)
                            r14.updateRememberedValue(r4)
                        L93:
                            r8 = r4
                            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
                            r14.endReplaceGroup()
                            r14.startReplaceGroup(r1)
                            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
                            android.content.Context r15 = r13.$context
                            boolean r15 = r14.changedInstance(r15)
                            android.content.Context r0 = r13.$context
                            java.lang.Object r1 = r14.rememberedValue()
                            if (r15 != 0) goto Lb5
                            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r15 = r15.getEmpty()
                            if (r1 != r15) goto Lbd
                        Lb5:
                            expo.modules.devmenu.compose.BindingView$1$1$1$$ExternalSyntheticLambda1 r1 = new expo.modules.devmenu.compose.BindingView$1$1$1$$ExternalSyntheticLambda1
                            r1.<init>(r0)
                            r14.updateRememberedValue(r1)
                        Lbd:
                            r9 = r1
                            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
                            r14.endReplaceGroup()
                            r11 = 0
                            r12 = 14
                            r4 = 0
                            r5 = 0
                            r7 = 0
                            r10 = r14
                            expo.modules.devmenu.fab.MovableFloatingActionButtonKt.m10889MovableFloatingActionButton_qgk6zs(r3, r4, r5, r7, r8, r9, r10, r11, r12)
                            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r14 == 0) goto Ld7
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        Ld7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: expo.modules.devmenu.compose.BindingView$1$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(Lazy lazy) {
                        ((DevMenuViewModel) lazy.getValue()).onAction(DevMenuAction.Reload.INSTANCE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(Context context) {
                        DevMenuManager devMenuManager = DevMenuManager.INSTANCE;
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
                        DevMenuManagerInterface.DefaultImpls.openMenu$default(devMenuManager, (Activity) context, null, 2, null);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C21@724L561,21@715L570:BindingView.kt#9zz9vv");
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2043768585, i, -1, "expo.modules.devmenu.compose.BindingView.<anonymous>.<anonymous> (BindingView.kt:21)");
                    }
                    AppThemeKt.AppTheme(false, ComposableLambdaKt.rememberComposableLambda(-31315007, true, new AnonymousClass1(BindingView.this, lazyViewModel, context), composer, 54), composer, 48, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            addView(composeView);
        }

        public final DevMenuViewModel getViewModel() {
            return (DevMenuViewModel) this.viewModel.getValue();
        }
    }
