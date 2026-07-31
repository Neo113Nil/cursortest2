package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivViewCreator.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/DivViewCreator;", "Lcom/yandex/div/internal/core/DivVisitor;", "Landroid/view/View;", "context", "Landroid/content/Context;", "viewPool", "Lcom/yandex/div/internal/viewpool/ViewPool;", "validator", "Lcom/yandex/div/core/view2/DivValidator;", "viewPreCreationProfile", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "repository", "Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "(Landroid/content/Context;Lcom/yandex/div/internal/viewpool/ViewPool;Lcom/yandex/div/core/view2/DivValidator;Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;)V", "value", "getViewPreCreationProfile", "()Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "setViewPreCreationProfile", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;)V", "create", "div", "Lcom/yandex/div2/Div;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "defaultVisit", "data", "visit", "Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div2/Div$Separator;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes10.dex */
public class DivViewCreator extends DivVisitor<View> {

    @NotNull
    private final Context context;

    @NotNull
    private final DivValidator validator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private ViewPreCreationProfile viewPreCreationProfile;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG_TEXT = "DIV2.TEXT_VIEW";

    @NotNull
    public static final String TAG_IMAGE = "DIV2.IMAGE_VIEW";

    @NotNull
    public static final String TAG_GIF_IMAGE = "DIV2.IMAGE_GIF_VIEW";

    @NotNull
    public static final String TAG_OVERLAP_CONTAINER = "DIV2.OVERLAP_CONTAINER_VIEW";

    @NotNull
    public static final String TAG_LINEAR_CONTAINER = "DIV2.LINEAR_CONTAINER_VIEW";

    @NotNull
    public static final String TAG_WRAP_CONTAINER = "DIV2.WRAP_CONTAINER_VIEW";

    @NotNull
    public static final String TAG_GRID = "DIV2.GRID_VIEW";

    @NotNull
    public static final String TAG_GALLERY = "DIV2.GALLERY_VIEW";

    @NotNull
    public static final String TAG_PAGER = "DIV2.PAGER_VIEW";

    @NotNull
    public static final String TAG_TABS = "DIV2.TAB_VIEW";

    @NotNull
    public static final String TAG_STATE = "DIV2.STATE";

    @NotNull
    public static final String TAG_CUSTOM = "DIV2.CUSTOM";

    @NotNull
    public static final String TAG_INDICATOR = "DIV2.INDICATOR";

    @NotNull
    public static final String TAG_SLIDER = "DIV2.SLIDER";

    @NotNull
    public static final String TAG_INPUT = "DIV2.INPUT";

    @NotNull
    public static final String TAG_SELECT = "DIV2.SELECT";

    @NotNull
    public static final String TAG_VIDEO = "DIV2.VIDEO";

    @NotNull
    public static final String TAG_SWITCH = "DIV2.SWITCH";

    @NotNull
    private static final String[] TAGS = {TAG_TEXT, TAG_IMAGE, TAG_GIF_IMAGE, TAG_OVERLAP_CONTAINER, TAG_LINEAR_CONTAINER, TAG_WRAP_CONTAINER, TAG_GRID, TAG_GALLERY, TAG_PAGER, TAG_TABS, TAG_STATE, TAG_CUSTOM, TAG_INDICATOR, TAG_SLIDER, TAG_INPUT, TAG_SELECT, TAG_VIDEO, TAG_SWITCH};

    public DivViewCreator(@NotNull Context context, @NotNull ViewPool viewPool, @NotNull DivValidator divValidator, @NotNull ViewPreCreationProfile viewPreCreationProfile, @NotNull ViewPreCreationProfileRepository viewPreCreationProfileRepository) {
        Object runBlocking$default;
        this.context = context;
        this.viewPool = viewPool;
        this.validator = divValidator;
        String id = viewPreCreationProfile.getId();
        if (id != null) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new DivViewCreator$viewPreCreationProfile$1$1(viewPreCreationProfileRepository, id, null), 1, null);
            ViewPreCreationProfile viewPreCreationProfile2 = (ViewPreCreationProfile) runBlocking$default;
            if (viewPreCreationProfile2 != null) {
                viewPreCreationProfile = viewPreCreationProfile2;
            }
        }
        this.viewPreCreationProfile = viewPreCreationProfile;
        ViewPreCreationProfile viewPreCreationProfile3 = getViewPreCreationProfile();
        viewPool.register(TAG_TEXT, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivLineHeightTextView lambda$22$lambda$21$lambda$3;
                lambda$22$lambda$21$lambda$3 = DivViewCreator.lambda$22$lambda$21$lambda$3(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$3;
            }
        }, viewPreCreationProfile3.getText().getCapacity());
        viewPool.register(TAG_IMAGE, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda9
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivImageView lambda$22$lambda$21$lambda$4;
                lambda$22$lambda$21$lambda$4 = DivViewCreator.lambda$22$lambda$21$lambda$4(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$4;
            }
        }, viewPreCreationProfile3.getImage().getCapacity());
        viewPool.register(TAG_GIF_IMAGE, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda10
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivGifImageView lambda$22$lambda$21$lambda$5;
                lambda$22$lambda$21$lambda$5 = DivViewCreator.lambda$22$lambda$21$lambda$5(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$5;
            }
        }, viewPreCreationProfile3.getGifImage().getCapacity());
        viewPool.register(TAG_OVERLAP_CONTAINER, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda11
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivFrameLayout lambda$22$lambda$21$lambda$6;
                lambda$22$lambda$21$lambda$6 = DivViewCreator.lambda$22$lambda$21$lambda$6(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$6;
            }
        }, viewPreCreationProfile3.getOverlapContainer().getCapacity());
        viewPool.register(TAG_LINEAR_CONTAINER, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda12
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivLinearLayout lambda$22$lambda$21$lambda$7;
                lambda$22$lambda$21$lambda$7 = DivViewCreator.lambda$22$lambda$21$lambda$7(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$7;
            }
        }, viewPreCreationProfile3.getLinearContainer().getCapacity());
        viewPool.register(TAG_WRAP_CONTAINER, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda13
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivWrapLayout lambda$22$lambda$21$lambda$8;
                lambda$22$lambda$21$lambda$8 = DivViewCreator.lambda$22$lambda$21$lambda$8(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$8;
            }
        }, viewPreCreationProfile3.getWrapContainer().getCapacity());
        viewPool.register(TAG_GRID, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda14
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivGridLayout lambda$22$lambda$21$lambda$9;
                lambda$22$lambda$21$lambda$9 = DivViewCreator.lambda$22$lambda$21$lambda$9(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$9;
            }
        }, viewPreCreationProfile3.getGrid().getCapacity());
        viewPool.register(TAG_GALLERY, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda15
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivRecyclerView lambda$22$lambda$21$lambda$10;
                lambda$22$lambda$21$lambda$10 = DivViewCreator.lambda$22$lambda$21$lambda$10(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$10;
            }
        }, viewPreCreationProfile3.getGallery().getCapacity());
        viewPool.register(TAG_PAGER, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda16
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivPagerView lambda$22$lambda$21$lambda$11;
                lambda$22$lambda$21$lambda$11 = DivViewCreator.lambda$22$lambda$21$lambda$11(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$11;
            }
        }, viewPreCreationProfile3.getPager().getCapacity());
        viewPool.register(TAG_TABS, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda17
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivTabsLayout lambda$22$lambda$21$lambda$12;
                lambda$22$lambda$21$lambda$12 = DivViewCreator.lambda$22$lambda$21$lambda$12(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$12;
            }
        }, viewPreCreationProfile3.getTab().getCapacity());
        viewPool.register(TAG_STATE, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivStateLayout lambda$22$lambda$21$lambda$13;
                lambda$22$lambda$21$lambda$13 = DivViewCreator.lambda$22$lambda$21$lambda$13(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$13;
            }
        }, viewPreCreationProfile3.getState().getCapacity());
        viewPool.register(TAG_CUSTOM, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivCustomWrapper lambda$22$lambda$21$lambda$14;
                lambda$22$lambda$21$lambda$14 = DivViewCreator.lambda$22$lambda$21$lambda$14(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$14;
            }
        }, viewPreCreationProfile3.getCustom().getCapacity());
        viewPool.register(TAG_INDICATOR, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivPagerIndicatorView lambda$22$lambda$21$lambda$15;
                lambda$22$lambda$21$lambda$15 = DivViewCreator.lambda$22$lambda$21$lambda$15(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$15;
            }
        }, viewPreCreationProfile3.getIndicator().getCapacity());
        viewPool.register(TAG_SLIDER, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivSliderView lambda$22$lambda$21$lambda$16;
                lambda$22$lambda$21$lambda$16 = DivViewCreator.lambda$22$lambda$21$lambda$16(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$16;
            }
        }, viewPreCreationProfile3.getSlider().getCapacity());
        viewPool.register(TAG_INPUT, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivInputView lambda$22$lambda$21$lambda$17;
                lambda$22$lambda$21$lambda$17 = DivViewCreator.lambda$22$lambda$21$lambda$17(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$17;
            }
        }, viewPreCreationProfile3.getInput().getCapacity());
        viewPool.register(TAG_SELECT, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda6
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivSelectView lambda$22$lambda$21$lambda$18;
                lambda$22$lambda$21$lambda$18 = DivViewCreator.lambda$22$lambda$21$lambda$18(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$18;
            }
        }, viewPreCreationProfile3.getSelect().getCapacity());
        viewPool.register(TAG_VIDEO, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda7
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivVideoView lambda$22$lambda$21$lambda$19;
                lambda$22$lambda$21$lambda$19 = DivViewCreator.lambda$22$lambda$21$lambda$19(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$19;
            }
        }, viewPreCreationProfile3.getVideo().getCapacity());
        viewPool.register(TAG_SWITCH, new ViewFactory() { // from class: com.yandex.div.core.view2.DivViewCreator$$ExternalSyntheticLambda8
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                DivSwitchView lambda$22$lambda$21$lambda$20;
                lambda$22$lambda$21$lambda$20 = DivViewCreator.lambda$22$lambda$21$lambda$20(DivViewCreator.this);
                return lambda$22$lambda$21$lambda$20;
            }
        }, viewPreCreationProfile3.getSwitch().getCapacity());
    }

    @NotNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.viewPreCreationProfile;
    }

    public void setViewPreCreationProfile(@NotNull ViewPreCreationProfile viewPreCreationProfile) {
        ViewPool viewPool = this.viewPool;
        viewPool.changeCapacity(TAG_TEXT, viewPreCreationProfile.getText().getCapacity());
        viewPool.changeCapacity(TAG_IMAGE, viewPreCreationProfile.getImage().getCapacity());
        viewPool.changeCapacity(TAG_GIF_IMAGE, viewPreCreationProfile.getGifImage().getCapacity());
        viewPool.changeCapacity(TAG_OVERLAP_CONTAINER, viewPreCreationProfile.getOverlapContainer().getCapacity());
        viewPool.changeCapacity(TAG_LINEAR_CONTAINER, viewPreCreationProfile.getLinearContainer().getCapacity());
        viewPool.changeCapacity(TAG_WRAP_CONTAINER, viewPreCreationProfile.getWrapContainer().getCapacity());
        viewPool.changeCapacity(TAG_GRID, viewPreCreationProfile.getGrid().getCapacity());
        viewPool.changeCapacity(TAG_GALLERY, viewPreCreationProfile.getGallery().getCapacity());
        viewPool.changeCapacity(TAG_PAGER, viewPreCreationProfile.getPager().getCapacity());
        viewPool.changeCapacity(TAG_TABS, viewPreCreationProfile.getTab().getCapacity());
        viewPool.changeCapacity(TAG_STATE, viewPreCreationProfile.getState().getCapacity());
        viewPool.changeCapacity(TAG_CUSTOM, viewPreCreationProfile.getCustom().getCapacity());
        viewPool.changeCapacity(TAG_INDICATOR, viewPreCreationProfile.getIndicator().getCapacity());
        viewPool.changeCapacity(TAG_SLIDER, viewPreCreationProfile.getSlider().getCapacity());
        viewPool.changeCapacity(TAG_INPUT, viewPreCreationProfile.getInput().getCapacity());
        viewPool.changeCapacity(TAG_SELECT, viewPreCreationProfile.getSelect().getCapacity());
        viewPool.changeCapacity(TAG_VIDEO, viewPreCreationProfile.getVideo().getCapacity());
        viewPool.changeCapacity(TAG_SWITCH, viewPreCreationProfile.getSwitch().getCapacity());
        this.viewPreCreationProfile = viewPreCreationProfile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLineHeightTextView lambda$22$lambda$21$lambda$3(DivViewCreator divViewCreator) {
        return new DivLineHeightTextView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivImageView lambda$22$lambda$21$lambda$4(DivViewCreator divViewCreator) {
        return new DivImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGifImageView lambda$22$lambda$21$lambda$5(DivViewCreator divViewCreator) {
        return new DivGifImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivFrameLayout lambda$22$lambda$21$lambda$6(DivViewCreator divViewCreator) {
        return new DivFrameLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLinearLayout lambda$22$lambda$21$lambda$7(DivViewCreator divViewCreator) {
        return new DivLinearLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivWrapLayout lambda$22$lambda$21$lambda$8(DivViewCreator divViewCreator) {
        return new DivWrapLayout(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGridLayout lambda$22$lambda$21$lambda$9(DivViewCreator divViewCreator) {
        return new DivGridLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivRecyclerView lambda$22$lambda$21$lambda$10(DivViewCreator divViewCreator) {
        return new DivRecyclerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerView lambda$22$lambda$21$lambda$11(DivViewCreator divViewCreator) {
        return new DivPagerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DivTabsLayout lambda$22$lambda$21$lambda$12(DivViewCreator divViewCreator) {
        return new DivTabsLayout(divViewCreator.context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivStateLayout lambda$22$lambda$21$lambda$13(DivViewCreator divViewCreator) {
        return new DivStateLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivCustomWrapper lambda$22$lambda$21$lambda$14(DivViewCreator divViewCreator) {
        return new DivCustomWrapper(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerIndicatorView lambda$22$lambda$21$lambda$15(DivViewCreator divViewCreator) {
        return new DivPagerIndicatorView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSliderView lambda$22$lambda$21$lambda$16(DivViewCreator divViewCreator) {
        return new DivSliderView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivInputView lambda$22$lambda$21$lambda$17(DivViewCreator divViewCreator) {
        return new DivInputView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSelectView lambda$22$lambda$21$lambda$18(DivViewCreator divViewCreator) {
        return new DivSelectView(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivVideoView lambda$22$lambda$21$lambda$19(DivViewCreator divViewCreator) {
        return new DivVideoView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSwitchView lambda$22$lambda$21$lambda$20(DivViewCreator divViewCreator) {
        return new DivSwitchView(divViewCreator.context);
    }

    @NotNull
    public View create(@NotNull Div div, @NotNull ExpressionResolver resolver) {
        if (this.validator.validate(div, resolver)) {
            View visit = visit(div, resolver);
            visit.setBackground(NoOpDrawable.INSTANCE);
            return visit;
        }
        return new Space(this.context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View defaultVisit(@NotNull Div data, @NotNull ExpressionResolver resolver) {
        return this.viewPool.obtain(INSTANCE.getTag(data, resolver));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull Div.Separator data, @NotNull ExpressionResolver resolver) {
        return new DivSeparatorView(this.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull Div.Grid data, @NotNull ExpressionResolver resolver) {
        View defaultVisit = defaultVisit((Div) data, resolver);
        Intrinsics.checkNotNull(defaultVisit, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) defaultVisit;
        Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.getValue()).iterator();
        while (it.hasNext()) {
            viewGroup.addView(create((Div) it.next(), resolver));
        }
        return viewGroup;
    }

    /* compiled from: DivViewCreator.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001b\u001a\u00020\u0005*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/DivViewCreator$Companion;", "", "()V", "TAGS", "", "", "getTAGS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "TAG_CUSTOM", "TAG_GALLERY", "TAG_GIF_IMAGE", "TAG_GRID", "TAG_IMAGE", "TAG_INDICATOR", "TAG_INPUT", "TAG_LINEAR_CONTAINER", "TAG_OVERLAP_CONTAINER", "TAG_PAGER", "TAG_SELECT", "TAG_SLIDER", "TAG_STATE", "TAG_SWITCH", "TAG_TABS", "TAG_TEXT", "TAG_VIDEO", "TAG_WRAP_CONTAINER", "getTag", "Lcom/yandex/div2/Div;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String[] getTAGS() {
            return DivViewCreator.TAGS;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTag(Div div, ExpressionResolver expressionResolver) {
            if (div instanceof Div.Container) {
                Div.Container container = (Div.Container) div;
                return DivUtilKt.isWrapContainer(container.getValue(), expressionResolver) ? DivViewCreator.TAG_WRAP_CONTAINER : container.getValue().orientation.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP ? DivViewCreator.TAG_OVERLAP_CONTAINER : DivViewCreator.TAG_LINEAR_CONTAINER;
            }
            if (div instanceof Div.Custom) {
                return DivViewCreator.TAG_CUSTOM;
            }
            if (div instanceof Div.Gallery) {
                return DivViewCreator.TAG_GALLERY;
            }
            if (div instanceof Div.GifImage) {
                return DivViewCreator.TAG_GIF_IMAGE;
            }
            if (div instanceof Div.Grid) {
                return DivViewCreator.TAG_GRID;
            }
            if (div instanceof Div.Image) {
                return DivViewCreator.TAG_IMAGE;
            }
            if (div instanceof Div.Indicator) {
                return DivViewCreator.TAG_INDICATOR;
            }
            if (div instanceof Div.Input) {
                return DivViewCreator.TAG_INPUT;
            }
            if (div instanceof Div.Pager) {
                return DivViewCreator.TAG_PAGER;
            }
            if (div instanceof Div.Select) {
                return DivViewCreator.TAG_SELECT;
            }
            if (div instanceof Div.Slider) {
                return DivViewCreator.TAG_SLIDER;
            }
            if (div instanceof Div.Switch) {
                return DivViewCreator.TAG_SWITCH;
            }
            if (div instanceof Div.State) {
                return DivViewCreator.TAG_STATE;
            }
            if (div instanceof Div.Tabs) {
                return DivViewCreator.TAG_TABS;
            }
            if (div instanceof Div.Text) {
                return DivViewCreator.TAG_TEXT;
            }
            if (div instanceof Div.Video) {
                return DivViewCreator.TAG_VIDEO;
            }
            if (div instanceof Div.Separator) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
