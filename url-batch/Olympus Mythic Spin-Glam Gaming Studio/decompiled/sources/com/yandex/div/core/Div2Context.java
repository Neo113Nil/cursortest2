package com.yandex.div.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.StyleRes;
import androidx.core.view.LayoutInflaterCompat;
import androidx.lifecycle.LifecycleOwner;
import com.safedk.android.utils.j;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Div2Context.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 B2\u00020\u0001:\u0003BCDB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB3\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB#\b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0011J\b\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u00105\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u00105\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u00106\u001a\u0004\u0018\u00010!H\u0012J\u0012\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:H\u0016J\"\u0010;\u001a\u00020<2\b\b\u0003\u0010=\u001a\u00020\u00072\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0016J\b\u0010A\u001a\u00020<H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0018\u001a\u00020\u00198VX\u0097\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0092\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006E"}, d2 = {"Lcom/yandex/div/core/Div2Context;", "Landroid/content/ContextWrapper;", "baseContext", "Landroid/view/ContextThemeWrapper;", j.c, "Lcom/yandex/div/core/DivConfiguration;", "themeId", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroid/view/ContextThemeWrapper;Lcom/yandex/div/core/DivConfiguration;ILandroidx/lifecycle/LifecycleOwner;)V", "mask", "marker", "Lkotlin/jvm/internal/DefaultConstructorMarker;", "(Landroid/view/ContextThemeWrapper;Lcom/yandex/div/core/DivConfiguration;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "div2Component", "Lcom/yandex/div/core/dagger/Div2Component;", "(Landroid/view/ContextThemeWrapper;Lcom/yandex/div/core/dagger/Div2Component;Landroidx/lifecycle/LifecycleOwner;)V", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "divVariableController", "Lcom/yandex/div/core/expression/variables/DivVariableController;", "getDivVariableController", "()Lcom/yandex/div/core/expression/variables/DivVariableController;", "globalVariableController", "Lcom/yandex/div/core/expression/variables/GlobalVariableController;", "getGlobalVariableController$annotations", "()V", "getGlobalVariableController", "()Lcom/yandex/div/core/expression/variables/GlobalVariableController;", "globalVariableController$delegate", "Lkotlin/Lazy;", "inflater", "Landroid/view/LayoutInflater;", "getLifecycleOwner$div_release", "()Landroidx/lifecycle/LifecycleOwner;", "performanceDependentSessionProfiler", "Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "getPerformanceDependentSessionProfiler", "()Lcom/yandex/div/internal/viewpool/optimization/PerformanceDependentSessionProfiler;", "value", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "viewPreCreationProfile", "getViewPreCreationProfile", "()Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "setViewPreCreationProfile", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;)V", "viewPreCreationProfileRepository", "Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "getViewPreCreationProfileRepository", "()Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "cancelTooltips", "", "childContext", "getLayoutInflater", "getSystemService", "", "name", "", TimerController.RESET_COMMAND, "", "flags", "tags", "", "Lcom/yandex/div/DivDataTag;", "warmUp", "Companion", "Div2InflaterFactory", "ResetFlag", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Div2Context extends ContextWrapper {
    public static final int RESET_ERROR_COLLECTORS = 2;
    public static final int RESET_EXPRESSION_RUNTIMES = 1;
    private static final int RESET_NONE = 0;
    public static final int RESET_SELECTED_STATES = 4;
    public static final int RESET_VISIBILITY_COUNTERS = 8;

    @NotNull
    private final ContextThemeWrapper baseContext;

    @NotNull
    private final Div2Component div2Component;

    /* renamed from: globalVariableController$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy globalVariableController;

    @Nullable
    private LayoutInflater inflater;

    @Nullable
    private final LifecycleOwner lifecycleOwner;

    /* compiled from: Div2Context.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/Div2Context$ResetFlag;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public @interface ResetFlag {
    }

    public Div2Context(@NotNull ContextThemeWrapper contextThemeWrapper, @NotNull DivConfiguration divConfiguration) {
        this(contextThemeWrapper, divConfiguration, 0, null, 12, null);
    }

    public Div2Context(@NotNull ContextThemeWrapper contextThemeWrapper, @NotNull DivConfiguration divConfiguration, @StyleRes int i) {
        this(contextThemeWrapper, divConfiguration, i, null, 8, null);
    }

    @InternalApi
    @Deprecated
    public static /* synthetic */ void getGlobalVariableController$annotations() {
    }

    /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, LifecycleOwner lifecycleOwner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, div2Component, (i & 4) != 0 ? null : lifecycleOwner);
    }

    @NotNull
    /* renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    @Nullable
    /* renamed from: getLifecycleOwner$div_release, reason: from getter */
    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @MainThread
    private Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, LifecycleOwner lifecycleOwner) {
        super(contextThemeWrapper);
        this.baseContext = contextThemeWrapper;
        this.div2Component = div2Component;
        this.lifecycleOwner = lifecycleOwner;
        this.globalVariableController = LazyKt.lazy(new Function0() { // from class: com.yandex.div.core.Div2Context$globalVariableController$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final GlobalVariableController mo4828invoke() {
                return new GlobalVariableController(Div2Context.this.getDiv2Component().getDivVariableController());
            }
        });
        getDiv2Component().getDivCreationTracker().onContextCreationFinished();
    }

    @NotNull
    public GlobalVariableController getGlobalVariableController() {
        return (GlobalVariableController) this.globalVariableController.getValue();
    }

    @NotNull
    public DivVariableController getDivVariableController() {
        return getDiv2Component().getDivVariableController();
    }

    @NotNull
    public PerformanceDependentSessionProfiler getPerformanceDependentSessionProfiler() {
        return getDiv2Component().getPerformanceDependentSessionProfiler();
    }

    @NotNull
    public ViewPreCreationProfileRepository getViewPreCreationProfileRepository() {
        return getDiv2Component().getViewPreCreationProfileRepository();
    }

    @NotNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return getDiv2Component().getDivViewCreator().getViewPreCreationProfile();
    }

    public void setViewPreCreationProfile(@NotNull ViewPreCreationProfile viewPreCreationProfile) {
        getDiv2Component().getDivViewCreator().setViewPreCreationProfile(viewPreCreationProfile);
    }

    public /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, int i, LifecycleOwner lifecycleOwner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, divConfiguration, (i2 & 4) != 0 ? com.yandex.div.R.style.Div_Theme : i, (i2 & 8) != 0 ? null : lifecycleOwner);
    }

    public Div2Context(@NotNull ContextThemeWrapper contextThemeWrapper, @NotNull DivConfiguration divConfiguration, @StyleRes int i, @Nullable LifecycleOwner lifecycleOwner) {
        this(contextThemeWrapper, DivKit.INSTANCE.getInstance(contextThemeWrapper).getComponent().div2Component().baseContext(contextThemeWrapper).configuration(divConfiguration).themeId(i).divCreationTracker(new DivCreationTracker(SystemClock.uptimeMillis())).divVariableController(divConfiguration.getDivVariableController()).build(), lifecycleOwner);
    }

    @InternalApi
    @Deprecated
    public Div2Context(@NotNull ContextThemeWrapper contextThemeWrapper, @NotNull DivConfiguration divConfiguration, @StyleRes int i, int i2, @Nullable DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, divConfiguration, i, null);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @Nullable
    public Object getSystemService(@NotNull String name) {
        if (Intrinsics.areEqual("layout_inflater", name)) {
            return getLayoutInflater();
        }
        return this.baseContext.getSystemService(name);
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = this.inflater;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            layoutInflater = this.inflater;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.baseContext).cloneInContext(this);
                Intrinsics.checkNotNull(layoutInflater, "null cannot be cast to non-null type android.view.LayoutInflater");
                LayoutInflaterCompat.setFactory2(layoutInflater, new Div2InflaterFactory(this));
                this.inflater = layoutInflater;
            }
        }
        return layoutInflater;
    }

    public void warmUp() {
        getDiv2Component().getDiv2Builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reset$default(Div2Context div2Context, int i, List list, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        div2Context.reset(i, list);
    }

    public void reset(@ResetFlag int flags, @NotNull List<? extends DivDataTag> tags) {
        if ((flags & 1) != 0) {
            getDiv2Component().getRuntimeStoreProvider().reset(tags);
        }
        if ((flags & 2) != 0) {
            getDiv2Component().getErrorCollectors().reset(tags);
        }
        if ((flags & 4) != 0) {
            getDiv2Component().getStateManager().reset(tags);
        }
        if ((flags & 8) != 0) {
            getDiv2Component().getVisibilityActionDispatcher().reset(tags);
        }
    }

    public boolean cancelTooltips() {
        return getDiv2Component().getTooltipController().cancelAllTooltips();
    }

    @NotNull
    public Div2Context childContext(@NotNull ContextThemeWrapper baseContext) {
        return new Div2Context(baseContext, getDiv2Component(), getLifecycleOwner());
    }

    @NotNull
    public Div2Context childContext(@Nullable LifecycleOwner lifecycleOwner) {
        return new Div2Context(this.baseContext, getDiv2Component(), lifecycleOwner);
    }

    @NotNull
    public Div2Context childContext(@NotNull ContextThemeWrapper baseContext, @Nullable LifecycleOwner lifecycleOwner) {
        return new Div2Context(baseContext, getDiv2Component(), lifecycleOwner);
    }

    /* compiled from: Div2Context.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J,\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/Div2Context$Div2InflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "div2Context", "Lcom/yandex/div/core/Div2Context;", "(Lcom/yandex/div/core/Div2Context;)V", "isDiv2View", "", "viewClassName", "", "onCreateView", "Landroid/view/View;", "parent", "name", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Div2InflaterFactory implements LayoutInflater.Factory2 {

        @NotNull
        private static final String DIV_VIEW_CLASS_NAME = "com.yandex.div.core.view2.Div2View";

        @NotNull
        private static final String DIV_VIEW_SIMPLE_CLASS_NAME = "Div2View";

        @NotNull
        private final Div2Context div2Context;

        public Div2InflaterFactory(@NotNull Div2Context div2Context) {
            this.div2Context = div2Context;
        }

        @Override // android.view.LayoutInflater.Factory2
        @Nullable
        public View onCreateView(@Nullable View parent, @NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            return onCreateView(name, context, attrs);
        }

        @Override // android.view.LayoutInflater.Factory
        @Nullable
        public View onCreateView(@NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            if (!isDiv2View(name)) {
                return null;
            }
            return new Div2View(this.div2Context, attrs, 0, 4, null);
        }

        private final boolean isDiv2View(String viewClassName) {
            return Intrinsics.areEqual(DIV_VIEW_CLASS_NAME, viewClassName) || Intrinsics.areEqual(DIV_VIEW_SIMPLE_CLASS_NAME, viewClassName);
        }
    }
}
