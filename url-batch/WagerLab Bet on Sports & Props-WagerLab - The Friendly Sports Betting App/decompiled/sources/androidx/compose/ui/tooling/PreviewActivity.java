package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.compose.ComposeNavigator;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PreviewActivity.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J \u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "TAG", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setComposableContent", "composableFqn", "setParameterizedContent", "className", "methodName", "parameterProvider", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 8;
    private final String TAG = "PreviewActivity";

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(ComposeNavigator.NAME)) == null) {
            return;
        }
        setComposableContent(stringExtra);
    }

    private final void setComposableContent(String composableFqn) {
        Log.d(this.TAG, "PreviewActivity has composable " + composableFqn);
        final String substringBeforeLast$default = StringsKt.substringBeforeLast$default(composableFqn, '.', (String) null, 2, (Object) null);
        final String substringAfterLast$default = StringsKt.substringAfterLast$default(composableFqn, '.', (String) null, 2, (Object) null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            setParameterizedContent(substringBeforeLast$default, substringAfterLast$default, stringExtra);
        } else {
            Log.d(this.TAG, "Previewing '" + substringAfterLast$default + "' without a parameter provider.");
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-840626948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C:PreviewActivity.android.kt#hevd2p");
                    if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840626948, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)");
                    }
                    ComposableInvoker.INSTANCE.invokeComposable(substringBeforeLast$default, substringAfterLast$default, composer, new Object[0]);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 1, null);
        }
    }

    private final void setParameterizedContent(final String className, final String methodName, String parameterProvider) {
        Log.d(this.TAG, "Previewing '" + methodName + "' with parameter provider: '" + parameterProvider + '\'');
        final Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(PreviewUtils_androidKt.asPreviewProviderClass(parameterProvider), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewProviderParameters.length > 1) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-861939235, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C103@4554L33,116@5104L322,106@4645L414,105@4605L840:PreviewActivity.android.kt#hevd2p");
                    if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-861939235, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer, 605084286, "CC(remember):PreviewActivity.android.kt#9igjgp");
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(958604965, true, new AnonymousClass1(previewProviderParameters, mutableIntState), composer, 54);
                    final String str = className;
                    final String str2 = methodName;
                    final Object[] objArr = previewProviderParameters;
                    ScaffoldKt.m2125Scaffold27mzLpw(null, null, null, null, null, rememberComposableLambda, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(57310875, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            invoke(paddingValues, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer2, int i2) {
                            ComposerKt.sourceInformation(composer2, "CN(padding)107@4682L355:PreviewActivity.android.kt#hevd2p");
                            if ((i2 & 6) == 0) {
                                i2 |= composer2.changed(paddingValues) ? 4 : 2;
                            }
                            if (!composer2.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(57310875, i2, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)");
                            }
                            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                            String str3 = str;
                            String str4 = str2;
                            Object[] objArr2 = objArr;
                            MutableIntState mutableIntState2 = mutableIntState;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 666493302, "C:PreviewActivity.android.kt#hevd2p");
                            ComposableInvoker.INSTANCE.invokeComposable(str3, str4, composer2, objArr2[mutableIntState2.getIntValue()]);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 12582912, 131039);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: PreviewActivity.android.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ MutableIntState $index;
                    final /* synthetic */ Object[] $previewParameters;

                    AnonymousClass1(Object[] objArr, MutableIntState mutableIntState) {
                        this.$previewParameters = objArr;
                        this.$index = mutableIntState;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        ComposerKt.sourceInformation(composer, "C119@5251L126,117@5130L274:PreviewActivity.android.kt#hevd2p");
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(958604965, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)");
                        }
                        Function2<Composer, Integer, Unit> m8314getLambda$426398407$ui_tooling = ComposableSingletons$PreviewActivity_androidKt.INSTANCE.m8314getLambda$426398407$ui_tooling();
                        ComposerKt.sourceInformationMarkerStart(composer, 2096374851, "CC(remember):PreviewActivity.android.kt#9igjgp");
                        boolean changedInstance = composer.changedInstance(this.$previewParameters);
                        final MutableIntState mutableIntState = this.$index;
                        final Object[] objArr = this.$previewParameters;
                        Object rememberedValue = composer.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR (r4v1 'rememberedValue' java.lang.Object) = 
                                  (r2v3 'mutableIntState' androidx.compose.runtime.MutableIntState A[DONT_INLINE])
                                  (r3v0 'objArr' java.lang.Object[] A[DONT_INLINE])
                                 A[MD:(androidx.compose.runtime.MutableIntState, java.lang.Object[]):void (m)] (LINE:120) call: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.MutableIntState, java.lang.Object[]):void type: CONSTRUCTOR in method: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r11 = r15
                                r0 = r16
                                java.lang.String r1 = "C119@5251L126,117@5130L274:PreviewActivity.android.kt#hevd2p"
                                androidx.compose.runtime.ComposerKt.sourceInformation(r15, r1)
                                r1 = r0 & 3
                                r2 = 2
                                if (r1 == r2) goto Lf
                                r1 = 1
                                goto L10
                            Lf:
                                r1 = 0
                            L10:
                                r2 = r0 & 1
                                boolean r1 = r15.shouldExecute(r1, r2)
                                if (r1 == 0) goto L74
                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r1 == 0) goto L27
                                r1 = -1
                                java.lang.String r2 = "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)"
                                r3 = 958604965(0x392326a5, float:1.5559288E-4)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r3, r0, r1, r2)
                            L27:
                                androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt r0 = androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.INSTANCE
                                kotlin.jvm.functions.Function2 r0 = r0.m8314getLambda$426398407$ui_tooling()
                                r1 = 2096374851(0x7cf42443, float:1.0141247E37)
                                java.lang.String r2 = "CC(remember):PreviewActivity.android.kt#9igjgp"
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r1, r2)
                                java.lang.Object[] r1 = r14.$previewParameters
                                boolean r1 = r15.changedInstance(r1)
                                androidx.compose.runtime.MutableIntState r2 = r14.$index
                                java.lang.Object[] r3 = r14.$previewParameters
                                java.lang.Object r4 = r15.rememberedValue()
                                if (r1 != 0) goto L4d
                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r1 = r1.getEmpty()
                                if (r4 != r1) goto L55
                            L4d:
                                androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$$ExternalSyntheticLambda0 r4 = new androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$$ExternalSyntheticLambda0
                                r4.<init>(r2, r3)
                                r15.updateRememberedValue(r4)
                            L55:
                                r1 = r4
                                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
                                r12 = 6
                                r13 = 508(0x1fc, float:7.12E-43)
                                r2 = 0
                                r3 = 0
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                r8 = 0
                                r10 = 0
                                androidx.compose.material.FloatingActionButtonKt.m2042ExtendedFloatingActionButtonwqdebIU(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L73
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L73:
                                return
                            L74:
                                r15.skipToGroupEnd()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(MutableIntState mutableIntState, Object[] objArr) {
                            mutableIntState.setIntValue((mutableIntState.getIntValue() + 1) % objArr.length);
                            return Unit.INSTANCE;
                        }
                    }
                }), 1, null);
            } else {
                ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1901447514, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        ComposerKt.sourceInformation(composer, "C:PreviewActivity.android.kt#hevd2p");
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1901447514, i, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)");
                        }
                        ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                        String str = className;
                        String str2 = methodName;
                        Object[] objArr = previewProviderParameters;
                        composableInvoker.invokeComposable(str, str2, composer, Arrays.copyOf(objArr, objArr.length));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 1, null);
            }
        }
    }
