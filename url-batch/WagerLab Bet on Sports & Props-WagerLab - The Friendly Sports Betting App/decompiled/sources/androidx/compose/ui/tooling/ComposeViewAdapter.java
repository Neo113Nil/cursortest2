package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.unit.IntRect;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.text.StringsKt;

/* compiled from: ComposeViewAdapter.android.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0004mpsv\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\f\u0010:\u001a\u00020\u0010*\u000204H\u0002J\f\u0010;\u001a\u00020\u0010*\u000204H\u0002J\f\u0010<\u001a\u00020\u0014*\u000204H\u0002J\b\u0010=\u001a\u00020$H\u0002J0\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0014J\b\u0010D\u001a\u00020$H\u0014J\b\u0010E\u001a\u00020$H\u0002J\b\u0010F\u001a\u00020$H\u0002J\f\u0010G\u001a\u00020\u0010*\u000204H\u0002J\u0016\u0010H\u001a\u0004\u0018\u00010\f*\u0002042\u0006\u0010I\u001a\u00020JH\u0002J\u000e\u0010K\u001a\u0004\u0018\u00010L*\u00020MH\u0002J\u001e\u0010N\u001a\u0004\u0018\u00010\f*\u00020M2\u0006\u0010O\u001a\u00020\t2\u0006\u0010P\u001a\u00020\tH\u0002J\u0010\u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020SH\u0014J \u0010\\\u001a\u00020$2\u0011\u0010]\u001a\r\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%H\u0003¢\u0006\u0002\u0010^J\u0093\u0001\u0010_\u001a\u00020$2\u0006\u0010`\u001a\u00020\f2\u0006\u0010a\u001a\u00020\f2\u0016\b\u0002\u0010b\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030d\u0018\u00010c2\b\b\u0002\u0010e\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010f\u001a\u00020g2\b\b\u0002\u0010'\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010h\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020$0#H\u0001¢\u0006\u0002\biJ\r\u0010j\u001a\u00020$H\u0000¢\u0006\u0002\bkJ\u0006\u0010\u001f\u001a\u00020\u0010J\u0010\u0010_\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\r\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%X\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R\u000e\u0010'\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00103\u001a\u00020\f*\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0018\u00107\u001a\u00020\t*\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010T\u001a\u00020U8\u0000@\u0000X\u0081.¢\u0006\u0014\n\u0000\u0012\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0012\u0010l\u001a\u00020m8\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010nR\u0010\u0010o\u001a\u00020pX\u0082\u0004¢\u0006\u0004\n\u0002\u0010qR\u0010\u0010r\u001a\u00020sX\u0082\u0004¢\u0006\u0004\n\u0002\u0010tR\u0010\u0010u\u001a\u00020vX\u0082\u0004¢\u0006\u0004\n\u0002\u0010w¨\u0006x"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "debugViewInfos", "", "debugPaintBounds", "viewInfos", "", "Landroidx/compose/ui/tooling/ViewInfo;", "getViewInfos$ui_tooling", "()Ljava/util/List;", "setViewInfos$ui_tooling", "(Ljava/util/List;)V", "designInfoList", "getDesignInfoList$ui_tooling", "setDesignInfoList$ui_tooling", "slotTableRecord", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "composableName", "hasAnimations", "delayedException", "Landroidx/compose/ui/tooling/ThreadSafeException;", "previewComposition", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "lookForDesignInfoProviders", "designInfoProvidersArgument", "onDraw", "stitchTrees", "getStitchTrees$ui_tooling", "()Z", "setStitchTrees$ui_tooling", "(Z)V", "debugBoundsPaint", "Landroid/graphics/Paint;", "composition", "Landroidx/compose/runtime/Composition;", "fileName", "Landroidx/compose/ui/tooling/data/Group;", "getFileName", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "lineNumber", "getLineNumber", "(Landroidx/compose/ui/tooling/data/Group;)I", "hasNullSourcePosition", "isNullGroup", "toViewInfo", "processViewInfos", "onLayout", "changed", "left", "top", "right", "bottom", "onAttachedToWindow", "findAndTrackAnimations", "findDesignInfoProviders", "hasDesignInfo", "getDesignInfoOrNull", "box", "Landroidx/compose/ui/unit/IntRect;", "getDesignInfoMethodOrNull", "Ljava/lang/reflect/Method;", "", "invokeGetDesignInfo", "x", "y", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "clock", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling$annotations", "()V", "getClock$ui_tooling", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "WrapPreview", "content", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "init", "className", "methodName", "parameterProvider", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProviderIndex", "animationClockStartTime", "", "onCommit", "init$ui_tooling", "dispose", "dispose$ui_tooling", "FakeSavedStateRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1;", "FakeViewModelStoreOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1;", "FakeOnBackPressedDispatcherOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1;", "FakeActivityResultRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1;", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 8;
    private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;
    private final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;
    private final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;
    private final ComposeViewAdapter$FakeViewModelStoreOwner$1 FakeViewModelStoreOwner;
    private final String TAG;
    public PreviewAnimationClock clock;
    private String composableName;
    private final ComposeView composeView;
    private Composition composition;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    private final ThreadSafeException delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private Function0<Unit> onDraw;
    private Function2<? super Composer, ? super Integer, Unit> previewComposition;
    private final CompositionDataRecord slotTableRecord;
    private boolean stitchTrees;
    private List<ViewInfo> viewInfos;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapPreview$lambda$20(ComposeViewAdapter composeViewAdapter, Function2 function2, int i, Composer composer, int i2) {
        composeViewAdapter.WrapPreview(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getClock$ui_tooling$annotations() {
    }

    public final List<ViewInfo> getViewInfos$ui_tooling() {
        return this.viewInfos;
    }

    public final void setViewInfos$ui_tooling(List<ViewInfo> list) {
        this.viewInfos = list;
    }

    public final List<String> getDesignInfoList$ui_tooling() {
        return this.designInfoList;
    }

    public final void setDesignInfoList$ui_tooling(List<String> list) {
        this.designInfoList = list;
    }

    /* renamed from: getStitchTrees$ui_tooling, reason: from getter */
    public final boolean getStitchTrees() {
        return this.stitchTrees;
    }

    public final void setStitchTrees$ui_tooling(boolean z) {
        this.stitchTrees = z;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.INSTANCE.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.getLambda$2086912010$ui_tooling();
        this.designInfoProvidersArgument = "";
        this.onDraw = new Function0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m5711toArgb8_81llA(Color.INSTANCE.m5691getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            /* renamed from: getLifecycle */
            public LifecycleRegistry getLifecycleRegistry() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int requestCode, ActivityResultContract<I, O> contract, I input, ActivityOptionsCompat options) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.INSTANCE.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.getLambda$2086912010$ui_tooling();
        this.designInfoProvidersArgument = "";
        this.onDraw = new Function0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m5711toArgb8_81llA(Color.INSTANCE.m5691getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            /* renamed from: getLifecycle */
            public LifecycleRegistry getLifecycleRegistry() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int requestCode, ActivityResultContract<I, O> contract, I input, ActivityOptionsCompat options) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }

    private final String getFileName(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        return (location == null || (sourceFile = location.getSourceFile()) == null) ? "" : sourceFile;
    }

    private final int getLineNumber(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    private final boolean hasNullSourcePosition(Group group) {
        return getFileName(group).length() == 0 && getLineNumber(group) == -1;
    }

    private final boolean isNullGroup(Group group) {
        if (!hasNullSourcePosition(group) || !group.getChildren().isEmpty()) {
            return false;
        }
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        return (node instanceof LayoutInfo ? (LayoutInfo) node : null) == null;
    }

    private final ViewInfo toViewInfo(Group group) {
        String str;
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (group.getChildren().size() == 1 && hasNullSourcePosition(group) && layoutInfo == null) {
            return toViewInfo((Group) CollectionsKt.single(group.getChildren()));
        }
        Collection<Group> children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (!isNullGroup((Group) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(toViewInfo((Group) it.next()));
        }
        ArrayList arrayList4 = arrayList3;
        SourceLocation location = group.getLocation();
        if (location == null || (str = location.getSourceFile()) == null) {
            str = "";
        }
        String str2 = str;
        SourceLocation location2 = group.getLocation();
        return new ViewInfo(str2, location2 != null ? location2.getLineNumber() : -1, group.getBox(), group.getLocation(), arrayList4, layoutInfo, group.getName());
    }

    private final void processViewInfos() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(toViewInfo(SlotTreeKt.asTree((CompositionData) it.next())));
        }
        List<ViewInfo> list = CollectionsKt.toList(arrayList);
        if (this.stitchTrees) {
            list = ShadowViewInfo_androidKt.stitchTrees(list);
        }
        this.viewInfos = list;
        if (this.debugViewInfos) {
            Log.d(this.TAG, ViewInfoUtil_androidKt.toDebugString$default(list, 0, null, 3, null));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.delayedException.throwIfPresent();
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackAnimations();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeLifecycleOwner.set(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    private final void findAndTrackAnimations() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        boolean z = this.clock != null;
        AnimationSearch animationSearch = new AnimationSearch(new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ComposeViewAdapter) this.receiver).getClock();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((ComposeViewAdapter) this.receiver).setClock$ui_tooling((PreviewAnimationClock) obj);
            }
        }, new ComposeViewAdapter$findAndTrackAnimations$2(this));
        ArrayList arrayList3 = arrayList2;
        boolean searchAny = animationSearch.searchAny(arrayList3);
        this.hasAnimations = searchAny;
        if (z && searchAny) {
            animationSearch.attachAllAnimations(arrayList3);
        }
    }

    private final void findDesignInfoProviders() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<Group> findAll = PreviewUtils_androidKt.findAll((Group) it2.next(), new Function1() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean findDesignInfoProviders$lambda$12$lambda$9;
                    findDesignInfoProviders$lambda$12$lambda$9 = ComposeViewAdapter.findDesignInfoProviders$lambda$12$lambda$9(ComposeViewAdapter.this, (Group) obj);
                    return Boolean.valueOf(findDesignInfoProviders$lambda$12$lambda$9);
                }
            });
            ArrayList arrayList3 = new ArrayList();
            for (Group group : findAll) {
                String designInfoOrNull = getDesignInfoOrNull(group, group.getBox());
                if (designInfoOrNull == null) {
                    Iterator<T> it3 = group.getChildren().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            designInfoOrNull = null;
                            break;
                        }
                        String designInfoOrNull2 = getDesignInfoOrNull((Group) it3.next(), group.getBox());
                        if (designInfoOrNull2 != null) {
                            designInfoOrNull = designInfoOrNull2;
                            break;
                        }
                    }
                }
                if (designInfoOrNull != null) {
                    arrayList3.add(designInfoOrNull);
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        this.designInfoList = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findDesignInfoProviders$lambda$12$lambda$9(ComposeViewAdapter composeViewAdapter, Group group) {
        if (!Intrinsics.areEqual(group.getName(), "remember") && composeViewAdapter.hasDesignInfo(group)) {
            return true;
        }
        Collection<Group> children = group.getChildren();
        if ((children instanceof Collection) && children.isEmpty()) {
            return false;
        }
        for (Group group2 : children) {
            if (Intrinsics.areEqual(group2.getName(), "remember") && composeViewAdapter.hasDesignInfo(group2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasDesignInfo(Group group) {
        Collection<Object> data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? getDesignInfoMethodOrNull(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final String getDesignInfoOrNull(Group group, IntRect intRect) {
        String str;
        Iterator<T> it = group.getData().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                str = invokeGetDesignInfo(next, intRect.getLeft(), intRect.getRight());
            }
        } while (str == null);
        return str;
    }

    private final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            return obj.getClass().getDeclaredMethod("getDesignInfo", Integer.TYPE, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String invokeGetDesignInfo(Object obj, int i, int i2) {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull == null) {
            return null;
        }
        try {
            Object invoke = designInfoMethodOrNull.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), this.designInfoProvidersArgument);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) invoke;
            if (str.length() == 0) {
                str = null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<ViewInfo> list = this.viewInfos;
            ArrayList<ViewInfo> arrayList = new ArrayList();
            for (ViewInfo viewInfo : list) {
                CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) CollectionsKt.listOf(viewInfo), (Iterable) viewInfo.allChildren()));
            }
            for (ViewInfo viewInfo2 : arrayList) {
                if (viewInfo2.hasBounds()) {
                    canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getRight(), viewInfo2.getBounds().getBottom()), this.debugBoundsPaint);
                }
            }
        }
    }

    /* renamed from: getClock$ui_tooling, reason: from getter */
    public final PreviewAnimationClock getClock() {
        return this.clock;
    }

    public final void setClock$ui_tooling(PreviewAnimationClock previewAnimationClock) {
        this.clock = previewAnimationClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void WrapPreview(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-265259911);
        ComposerKt.sourceInformation(startRestartGroup, "C(WrapPreview)N(content)389@15251L61,384@14884L428:ComposeViewAdapter.android.kt#hevd2p");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-265259911, i2, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:379)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalFontLoader().provides(new LayoutlibFontResourceLoader(getContext())), CompositionLocalsKt.getLocalFontFamilyResolver().provides(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext())), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(this.FakeOnBackPressedDispatcherOwner), LocalActivityResultRegistryOwner.INSTANCE.provides(this.FakeActivityResultRegistryOwner)}, ComposableLambdaKt.rememberComposableLambda(-874838087, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    CompositionDataRecord compositionDataRecord;
                    ComposerKt.sourceInformation(composer2, "C390@15265L37:ComposeViewAdapter.android.kt#hevd2p");
                    if (composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-874838087, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:390)");
                        }
                        compositionDataRecord = ComposeViewAdapter.this.slotTableRecord;
                        InspectableKt.Inspectable(compositionDataRecord, function2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WrapPreview$lambda$20;
                    WrapPreview$lambda$20 = ComposeViewAdapter.WrapPreview$lambda$20(ComposeViewAdapter.this, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return WrapPreview$lambda$20;
                }
            });
        }
    }

    public static /* synthetic */ void init$ui_tooling$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i, boolean z, boolean z2, long j, boolean z3, String str3, Function0 function0, Function0 function02, int i2, Object obj) {
        composeViewAdapter.init$ui_tooling(str, str2, (i2 & 4) != 0 ? null : cls, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? -1L : j, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? new Function0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0, (i2 & 1024) != 0 ? new Function0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02);
    }

    public final void init$ui_tooling(final String className, final String methodName, final Class<? extends PreviewParameterProvider<?>> parameterProvider, final int parameterProviderIndex, boolean debugPaintBounds, boolean debugViewInfos, final long animationClockStartTime, boolean lookForDesignInfoProviders, String designInfoProvidersArgument, final Function0<Unit> onCommit, Function0<Unit> onDraw) {
        this.debugPaintBounds = debugPaintBounds;
        this.debugViewInfos = debugViewInfos;
        this.composableName = methodName;
        this.lookForDesignInfoProviders = lookForDesignInfoProviders;
        if (designInfoProvidersArgument == null) {
            designInfoProvidersArgument = "";
        }
        this.designInfoProvidersArgument = designInfoProvidersArgument;
        this.onDraw = onDraw;
        ComposableLambda composableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-658298446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C439@17652L20,441@17702L2933,441@17690L2945:ComposeViewAdapter.android.kt#hevd2p");
                if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-658298446, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:439)");
                }
                EffectsKt.SideEffect(onCommit, composer, 0);
                this.WrapPreview(ComposableLambdaKt.rememberComposableLambda(-1310372571, true, new AnonymousClass1(className, methodName, parameterProvider, parameterProviderIndex, this, animationClockStartTime), composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: ComposeViewAdapter.android.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ long $animationClockStartTime;
                final /* synthetic */ String $className;
                final /* synthetic */ String $methodName;
                final /* synthetic */ Class<? extends PreviewParameterProvider<?>> $parameterProvider;
                final /* synthetic */ int $parameterProviderIndex;
                final /* synthetic */ ComposeViewAdapter this$0;

                AnonymousClass1(String str, String str2, Class<? extends PreviewParameterProvider<?>> cls, int i, ComposeViewAdapter composeViewAdapter, long j) {
                    this.$className = str;
                    this.$methodName = str2;
                    this.$parameterProvider = cls;
                    this.$parameterProviderIndex = i;
                    this.this$0 = composeViewAdapter;
                    this.$animationClockStartTime = j;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    final Composer composer2;
                    ComposerKt.sourceInformation(composer, "C448@18091L1161:ComposeViewAdapter.android.kt#hevd2p");
                    if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1310372571, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:442)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer, -842609394, "CC(remember):ComposeViewAdapter.android.kt#9igjgp");
                    boolean changed = composer.changed(this.$className) | composer.changed(this.$methodName) | composer.changedInstance(composer) | composer.changedInstance(this.$parameterProvider) | composer.changed(this.$parameterProviderIndex) | composer.changedInstance(this.this$0);
                    final String str = this.$className;
                    final String str2 = this.$methodName;
                    final Class<? extends PreviewParameterProvider<?>> cls = this.$parameterProvider;
                    final int i2 = this.$parameterProviderIndex;
                    final ComposeViewAdapter composeViewAdapter = this.this$0;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        composer2 = composer;
                        rememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0071: CONSTRUCTOR (r1v12 'rememberedValue' java.lang.Object) = 
                              (r2v0 'str' java.lang.String A[DONT_INLINE])
                              (r3v0 'str2' java.lang.String A[DONT_INLINE])
                              (r4v1 'composer2' androidx.compose.runtime.Composer A[DONT_INLINE])
                              (r5v0 'cls' java.lang.Class<? extends androidx.compose.ui.tooling.preview.PreviewParameterProvider<?>> A[DONT_INLINE])
                              (r6v0 'i2' int A[DONT_INLINE])
                              (r7v0 'composeViewAdapter' androidx.compose.ui.tooling.ComposeViewAdapter A[DONT_INLINE])
                             A[MD:(java.lang.String, java.lang.String, androidx.compose.runtime.Composer, java.lang.Class, int, androidx.compose.ui.tooling.ComposeViewAdapter):void (m)] (LINE:449) call: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$$ExternalSyntheticLambda0.<init>(java.lang.String, java.lang.String, androidx.compose.runtime.Composer, java.lang.Class, int, androidx.compose.ui.tooling.ComposeViewAdapter):void type: CONSTRUCTOR in method: androidx.compose.ui.tooling.ComposeViewAdapter$init$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "C448@18091L1161:ComposeViewAdapter.android.kt#hevd2p"
                            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
                            r0 = r10 & 3
                            r1 = 2
                            if (r0 == r1) goto Lc
                            r0 = 1
                            goto Ld
                        Lc:
                            r0 = 0
                        Ld:
                            r1 = r10 & 1
                            boolean r0 = r9.shouldExecute(r0, r1)
                            if (r0 == 0) goto Ldc
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L24
                            r0 = -1
                            java.lang.String r1 = "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:442)"
                            r2 = -1310372571(0xffffffffb1e54d25, float:-6.6735475E-9)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r10, r0, r1)
                        L24:
                            r10 = -842609394(0xffffffffcdc6cd0e, float:-4.169159E8)
                            java.lang.String r0 = "CC(remember):ComposeViewAdapter.android.kt#9igjgp"
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r9, r10, r0)
                            java.lang.String r10 = r8.$className
                            boolean r10 = r9.changed(r10)
                            java.lang.String r1 = r8.$methodName
                            boolean r1 = r9.changed(r1)
                            r10 = r10 | r1
                            boolean r1 = r9.changedInstance(r9)
                            r10 = r10 | r1
                            java.lang.Class<? extends androidx.compose.ui.tooling.preview.PreviewParameterProvider<?>> r1 = r8.$parameterProvider
                            boolean r1 = r9.changedInstance(r1)
                            r10 = r10 | r1
                            int r1 = r8.$parameterProviderIndex
                            boolean r1 = r9.changed(r1)
                            r10 = r10 | r1
                            androidx.compose.ui.tooling.ComposeViewAdapter r1 = r8.this$0
                            boolean r1 = r9.changedInstance(r1)
                            r10 = r10 | r1
                            java.lang.String r2 = r8.$className
                            java.lang.String r3 = r8.$methodName
                            java.lang.Class<? extends androidx.compose.ui.tooling.preview.PreviewParameterProvider<?>> r5 = r8.$parameterProvider
                            int r6 = r8.$parameterProviderIndex
                            androidx.compose.ui.tooling.ComposeViewAdapter r7 = r8.this$0
                            java.lang.Object r1 = r9.rememberedValue()
                            if (r10 != 0) goto L6e
                            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r10 = r10.getEmpty()
                            if (r1 != r10) goto L6c
                            goto L6e
                        L6c:
                            r4 = r9
                            goto L77
                        L6e:
                            androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$$ExternalSyntheticLambda0 r1 = new androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$$ExternalSyntheticLambda0
                            r4 = r9
                            r1.<init>(r2, r3, r4, r5, r6, r7)
                            r4.updateRememberedValue(r1)
                        L77:
                            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
                            long r9 = r8.$animationClockStartTime
                            r2 = 0
                            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                            if (r9 < 0) goto Lc6
                            r9 = -349877568(0xffffffffeb254ac0, float:-1.9982576E26)
                            r4.startReplaceGroup(r9)
                            java.lang.String r9 = "477@19736L826"
                            androidx.compose.runtime.ComposerKt.sourceInformation(r4, r9)
                            androidx.compose.ui.tooling.ComposeViewAdapter r9 = r8.this$0
                            r10 = -842557089(0xffffffffcdc7995f, float:-4.1858966E8)
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r4, r10, r0)
                            androidx.compose.ui.tooling.ComposeViewAdapter r10 = r8.this$0
                            boolean r10 = r4.changedInstance(r10)
                            androidx.compose.ui.tooling.ComposeViewAdapter r0 = r8.this$0
                            java.lang.Object r2 = r4.rememberedValue()
                            if (r10 != 0) goto Lad
                            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r10 = r10.getEmpty()
                            if (r2 != r10) goto Lb5
                        Lad:
                            androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$$ExternalSyntheticLambda1 r2 = new androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$$ExternalSyntheticLambda1
                            r2.<init>(r0)
                            r4.updateRememberedValue(r2)
                        Lb5:
                            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r4)
                            androidx.compose.ui.tooling.animation.PreviewAnimationClock r10 = new androidx.compose.ui.tooling.animation.PreviewAnimationClock
                            r10.<init>(r2)
                            r9.setClock$ui_tooling(r10)
                            r4.endReplaceGroup()
                            goto Lcf
                        Lc6:
                            r9 = -348650371(0xffffffffeb38047d, float:-2.2246355E26)
                            r4.startReplaceGroup(r9)
                            r4.endReplaceGroup()
                        Lcf:
                            r1.invoke()
                            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r9 == 0) goto Ldb
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        Ldb:
                            return
                        Ldc:
                            r4 = r9
                            r4.skipToGroupEnd()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.ComposeViewAdapter$init$3.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(String str, String str2, Composer composer, Class cls, int i, ComposeViewAdapter composeViewAdapter) {
                        ThreadSafeException threadSafeException;
                        Throwable cause;
                        try {
                            ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                            Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(cls, i);
                            composableInvoker.invokeComposable(str, str2, composer, Arrays.copyOf(previewProviderParameters, previewProviderParameters.length));
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                                th2 = cause;
                            }
                            threadSafeException = composeViewAdapter.delayedException;
                            threadSafeException.set(th2);
                            throw th;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(ComposeViewAdapter composeViewAdapter) {
                        View childAt = composeViewAdapter.getChildAt(0);
                        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                        KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
                        ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
                        if (viewRootForTest != null) {
                            viewRootForTest.invalidateDescendants();
                        }
                        Snapshot.INSTANCE.sendApplyNotifications();
                        return Unit.INSTANCE;
                    }
                }
            });
            this.previewComposition = composableLambdaInstance;
            this.composeView.setContent(composableLambdaInstance);
            invalidate();
        }

        public final void dispose$ui_tooling() {
            this.composeView.disposeComposition();
            if (this.clock != null) {
                getClock().dispose();
            }
            this.FakeSavedStateRegistryOwner.getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
            this.FakeViewModelStoreOwner.getViewModelStore().clear();
        }

        /* renamed from: hasAnimations, reason: from getter */
        public final boolean getHasAnimations() {
            return this.hasAnimations;
        }

        private final void init(AttributeSet attrs) {
            long j;
            ComposeViewAdapter composeViewAdapter = this;
            ViewTreeLifecycleOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
            ViewTreeSavedStateRegistryOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
            ViewTreeViewModelStoreOwner.set(composeViewAdapter, this.FakeViewModelStoreOwner);
            addView(this.composeView);
            String attributeValue = attrs.getAttributeValue("http://schemas.android.com/tools", "composableName");
            if (attributeValue == null) {
                return;
            }
            String substringBeforeLast$default = StringsKt.substringBeforeLast$default(attributeValue, '.', (String) null, 2, (Object) null);
            String substringAfterLast$default = StringsKt.substringAfterLast$default(attributeValue, '.', (String) null, 2, (Object) null);
            int attributeIntValue = attrs.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
            String attributeValue2 = attrs.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
            Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass = attributeValue2 != null ? PreviewUtils_androidKt.asPreviewProviderClass(attributeValue2) : null;
            try {
                j = Long.parseLong(attrs.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
            } catch (Exception unused) {
                j = -1;
            }
            init$ui_tooling$default(this, substringBeforeLast$default, substringAfterLast$default, asPreviewProviderClass, attributeIntValue, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attrs.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 1536, null);
        }
    }
