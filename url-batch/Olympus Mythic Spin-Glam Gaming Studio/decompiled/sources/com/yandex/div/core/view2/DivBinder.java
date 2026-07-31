package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
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
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivTreeVisitorKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivBinder.kt */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B§\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)¢\u0006\u0002\u0010*J\r\u0010+\u001a\u00020,H\u0011¢\u0006\u0002\b-J(\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0017J(\u00107\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020:2\u0006\u00105\u001a\u000206H\u0012J(\u0010;\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020<2\u0006\u00105\u001a\u000206H\u0012J(\u0010=\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020>2\u0006\u00105\u001a\u000206H\u0012J \u0010?\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020@H\u0012J(\u0010A\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020B2\u0006\u00105\u001a\u000206H\u0012J \u0010C\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020DH\u0012J \u0010E\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020FH\u0012J(\u0010G\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020H2\u0006\u00105\u001a\u000206H\u0012J \u0010I\u001a\u00020,2\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0012J(\u0010M\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020N2\u0006\u00105\u001a\u000206H\u0012J(\u0010O\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020P2\u0006\u00105\u001a\u000206H\u0012J \u0010Q\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020RH\u0012J(\u0010S\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020T2\u0006\u00105\u001a\u000206H\u0012J(\u0010U\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020V2\u0006\u00105\u001a\u000206H\u0012J(\u0010W\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020X2\u0006\u00105\u001a\u000206H\u0012J(\u0010Y\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020Z2\u0006\u00105\u001a\u000206H\u0012J \u0010[\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020\\H\u0012J(\u0010]\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020^2\u0006\u00105\u001a\u000206H\u0012J \u0010_\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0012J \u0010`\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J \u0010a\u001a\u00020,2\u0006\u00108\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00109\u001a\u00020BH\u0012J1\u0010`\u001a\u00020,\"\b\b\u0000\u0010b*\u000204*\b\u0012\u0004\u0012\u0002Hb0c2\u0006\u00108\u001a\u0002002\u0006\u0010d\u001a\u0002HbH\u0012¢\u0006\u0002\u0010eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/yandex/div/core/view2/DivBinder;", "", "validator", "Lcom/yandex/div/core/view2/DivValidator;", "textBinder", "Lcom/yandex/div/core/view2/divs/DivTextBinder;", "containerBinder", "Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "separatorBinder", "Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "imageBinder", "Lcom/yandex/div/core/view2/divs/DivImageBinder;", "gifImageBinder", "Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "gridBinder", "Lcom/yandex/div/core/view2/divs/DivGridBinder;", "galleryBinder", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "pagerBinder", "Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;", "tabsBinder", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "stateBinder", "Lcom/yandex/div/core/view2/divs/DivStateBinder;", "customBinder", "Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "indicatorBinder", "Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "sliderBinder", "Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "inputBinder", "Lcom/yandex/div/core/view2/divs/DivInputBinder;", "selectBinder", "Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "videoBinder", "Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "extensionController", "Lcom/yandex/div/core/extension/DivExtensionController;", "pagerIndicatorConnector", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "switchBinder", "Lcom/yandex/div/core/view2/divs/DivSwitchBinder;", "(Lcom/yandex/div/core/view2/DivValidator;Lcom/yandex/div/core/view2/divs/DivTextBinder;Lcom/yandex/div/core/view2/divs/DivContainerBinder;Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;Lcom/yandex/div/core/view2/divs/DivImageBinder;Lcom/yandex/div/core/view2/divs/DivGifImageBinder;Lcom/yandex/div/core/view2/divs/DivGridBinder;Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;Lcom/yandex/div/core/view2/divs/DivStateBinder;Lcom/yandex/div/core/view2/divs/DivCustomBinder;Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;Lcom/yandex/div/core/view2/divs/DivSliderBinder;Lcom/yandex/div/core/view2/divs/DivInputBinder;Lcom/yandex/div/core/view2/divs/DivSelectBinder;Lcom/yandex/div/core/view2/divs/DivVideoBinder;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;Lcom/yandex/div/core/view2/divs/DivSwitchBinder;)V", "attachIndicators", "", "attachIndicators$div_release", "bind", "parentContext", "Lcom/yandex/div/core/view2/BindingContext;", "view", "Landroid/view/View;", "div", "Lcom/yandex/div2/Div;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "bindContainer", "context", "data", "Lcom/yandex/div2/Div$Container;", "bindCustom", "Lcom/yandex/div2/Div$Custom;", "bindGallery", "Lcom/yandex/div2/Div$Gallery;", "bindGifImage", "Lcom/yandex/div2/Div$GifImage;", "bindGrid", "Lcom/yandex/div2/Div$Grid;", "bindImage", "Lcom/yandex/div2/Div$Image;", "bindIndicator", "Lcom/yandex/div2/Div$Indicator;", "bindInput", "Lcom/yandex/div2/Div$Input;", "bindLayoutParams", "Lcom/yandex/div2/DivBase;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "bindPager", "Lcom/yandex/div2/Div$Pager;", "bindSelect", "Lcom/yandex/div2/Div$Select;", "bindSeparator", "Lcom/yandex/div2/Div$Separator;", "bindSlider", "Lcom/yandex/div2/Div$Slider;", "bindState", "Lcom/yandex/div2/Div$State;", "bindSwitch", "Lcom/yandex/div2/Div$Switch;", "bindTabs", "Lcom/yandex/div2/Div$Tabs;", "bindText", "Lcom/yandex/div2/Div$Text;", "bindVideo", "Lcom/yandex/div2/Div$Video;", "setContainerData", "setDataWithoutBinding", "setGridData", "T", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "newDiv", "(Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/Div;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes6.dex */
public class DivBinder {

    @NotNull
    private final DivContainerBinder containerBinder;

    @NotNull
    private final DivCustomBinder customBinder;

    @NotNull
    private final DivExtensionController extensionController;

    @NotNull
    private final DivGalleryBinder galleryBinder;

    @NotNull
    private final DivGifImageBinder gifImageBinder;

    @NotNull
    private final DivGridBinder gridBinder;

    @NotNull
    private final DivImageBinder imageBinder;

    @NotNull
    private final DivIndicatorBinder indicatorBinder;

    @NotNull
    private final DivInputBinder inputBinder;

    @NotNull
    private final DivPagerBinder pagerBinder;

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @NotNull
    private final DivSelectBinder selectBinder;

    @NotNull
    private final DivSeparatorBinder separatorBinder;

    @NotNull
    private final DivSliderBinder sliderBinder;

    @NotNull
    private final DivStateBinder stateBinder;

    @NotNull
    private final DivSwitchBinder switchBinder;

    @NotNull
    private final DivTabsBinder tabsBinder;

    @NotNull
    private final DivTextBinder textBinder;

    @NotNull
    private final DivValidator validator;

    @NotNull
    private final DivVideoBinder videoBinder;

    public DivBinder(@NotNull DivValidator divValidator, @NotNull DivTextBinder divTextBinder, @NotNull DivContainerBinder divContainerBinder, @NotNull DivSeparatorBinder divSeparatorBinder, @NotNull DivImageBinder divImageBinder, @NotNull DivGifImageBinder divGifImageBinder, @NotNull DivGridBinder divGridBinder, @NotNull DivGalleryBinder divGalleryBinder, @NotNull DivPagerBinder divPagerBinder, @NotNull DivTabsBinder divTabsBinder, @NotNull DivStateBinder divStateBinder, @NotNull DivCustomBinder divCustomBinder, @NotNull DivIndicatorBinder divIndicatorBinder, @NotNull DivSliderBinder divSliderBinder, @NotNull DivInputBinder divInputBinder, @NotNull DivSelectBinder divSelectBinder, @NotNull DivVideoBinder divVideoBinder, @NotNull DivExtensionController divExtensionController, @NotNull PagerIndicatorConnector pagerIndicatorConnector, @NotNull DivSwitchBinder divSwitchBinder) {
        this.validator = divValidator;
        this.textBinder = divTextBinder;
        this.containerBinder = divContainerBinder;
        this.separatorBinder = divSeparatorBinder;
        this.imageBinder = divImageBinder;
        this.gifImageBinder = divGifImageBinder;
        this.gridBinder = divGridBinder;
        this.galleryBinder = divGalleryBinder;
        this.pagerBinder = divPagerBinder;
        this.tabsBinder = divTabsBinder;
        this.stateBinder = divStateBinder;
        this.customBinder = divCustomBinder;
        this.indicatorBinder = divIndicatorBinder;
        this.sliderBinder = divSliderBinder;
        this.inputBinder = divInputBinder;
        this.selectBinder = divSelectBinder;
        this.videoBinder = divVideoBinder;
        this.extensionController = divExtensionController;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.switchBinder = divSwitchBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public void bind(@NotNull BindingContext parentContext, @NotNull View view, @NotNull Div div, @NotNull DivStatePath path) {
        try {
            BindingContext childContext = DivTreeVisitorKt.getChildContext(parentContext, div, path);
            Div2View divView = childContext.getDivView();
            ExpressionResolver expressionResolver = childContext.getExpressionResolver();
            ReusableTokenList currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release == null || currentRebindReusableList$div_release.pop(div) == null) {
                if (!this.validator.validate(div, expressionResolver)) {
                    bindLayoutParams(view, div.value(), expressionResolver);
                    return;
                }
                this.extensionController.beforeBindView(divView, expressionResolver, view, div.value());
                if (!(div instanceof Div.Custom)) {
                    Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<*>");
                    Div div2 = ((DivHolderView) view).getDiv();
                    if (div2 != null) {
                        this.extensionController.unbindView(divView, expressionResolver, view, div2.value());
                    }
                }
                if (div instanceof Div.Text) {
                    bindText(childContext, view, (Div.Text) div);
                } else if (div instanceof Div.Image) {
                    bindImage(childContext, view, (Div.Image) div);
                } else if (div instanceof Div.GifImage) {
                    bindGifImage(childContext, view, (Div.GifImage) div);
                } else if (div instanceof Div.Separator) {
                    bindSeparator(childContext, view, (Div.Separator) div);
                } else if (div instanceof Div.Container) {
                    bindContainer(childContext, view, (Div.Container) div, path);
                } else if (div instanceof Div.Grid) {
                    bindGrid(childContext, view, (Div.Grid) div, path);
                } else if (div instanceof Div.Gallery) {
                    bindGallery(childContext, view, (Div.Gallery) div, path);
                } else if (div instanceof Div.Pager) {
                    bindPager(childContext, view, (Div.Pager) div, path);
                } else if (div instanceof Div.Tabs) {
                    bindTabs(childContext, view, (Div.Tabs) div, path);
                } else if (div instanceof Div.State) {
                    bindState(childContext, view, (Div.State) div, path);
                } else if (div instanceof Div.Custom) {
                    bindCustom(childContext, view, (Div.Custom) div, path);
                } else if (div instanceof Div.Indicator) {
                    bindIndicator(childContext, view, (Div.Indicator) div);
                } else if (div instanceof Div.Slider) {
                    bindSlider(childContext, view, (Div.Slider) div, path);
                } else if (div instanceof Div.Input) {
                    bindInput(childContext, view, (Div.Input) div, path);
                } else if (div instanceof Div.Select) {
                    bindSelect(childContext, view, (Div.Select) div, path);
                } else if (div instanceof Div.Video) {
                    bindVideo(childContext, view, (Div.Video) div, path);
                } else {
                    if (!(div instanceof Div.Switch)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bindSwitch(childContext, view, (Div.Switch) div, path);
                }
                Unit unit = Unit.INSTANCE;
                if (div instanceof Div.Custom) {
                    return;
                }
                this.extensionController.bindView(divView, expressionResolver, view, div.value());
            }
        } catch (ParsingException e) {
            if (!ExpressionFallbacksHelperKt.isExpressionResolveFail(e)) {
                throw e;
            }
        }
    }

    @MainThread
    public void attachIndicators$div_release() {
        this.pagerIndicatorConnector.attach$div_release();
    }

    private void bindText(BindingContext context, View view, Div.Text data) {
        DivTextBinder divTextBinder = this.textBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView");
        divTextBinder.bindView(context, (DivLineHeightTextView) view, data);
    }

    private void bindImage(BindingContext context, View view, Div.Image data) {
        DivImageBinder divImageBinder = this.imageBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivImageView");
        divImageBinder.bindView(context, (DivImageView) view, data);
    }

    private void bindGifImage(BindingContext context, View view, Div.GifImage data) {
        DivGifImageBinder divGifImageBinder = this.gifImageBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGifImageView");
        divGifImageBinder.bindView(context, (DivGifImageView) view, data);
    }

    private void bindSeparator(BindingContext context, View view, Div.Separator data) {
        DivSeparatorBinder divSeparatorBinder = this.separatorBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSeparatorView");
        divSeparatorBinder.bindView(context, (DivSeparatorView) view, data);
    }

    private void bindContainer(BindingContext context, View view, Div.Container data, DivStatePath path) {
        DivContainerBinder divContainerBinder = this.containerBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        divContainerBinder.bindView(context, (ViewGroup) view, data, path);
    }

    private void bindGrid(BindingContext context, View view, Div.Grid data, DivStatePath path) {
        DivGridBinder divGridBinder = this.gridBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGridLayout");
        divGridBinder.bindView(context, (DivGridLayout) view, data, path);
    }

    private void bindGallery(BindingContext context, View view, Div.Gallery data, DivStatePath path) {
        DivGalleryBinder divGalleryBinder = this.galleryBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivRecyclerView");
        divGalleryBinder.bindView(context, (DivRecyclerView) view, data, path);
    }

    private void bindPager(BindingContext context, View view, Div.Pager data, DivStatePath path) {
        DivPagerBinder divPagerBinder = this.pagerBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerView");
        divPagerBinder.bindView(context, (DivPagerView) view, data, path);
    }

    private void bindTabs(BindingContext context, View view, Div.Tabs data, DivStatePath path) {
        DivTabsBinder divTabsBinder = this.tabsBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivTabsLayout");
        divTabsBinder.bindView(context, (DivTabsLayout) view, data, path);
    }

    private void bindState(BindingContext context, View view, Div.State data, DivStatePath path) {
        DivStateBinder divStateBinder = this.stateBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivStateLayout");
        divStateBinder.bindView(context, (DivStateLayout) view, data, path);
    }

    private void bindCustom(BindingContext context, View view, Div.Custom data, DivStatePath path) {
        DivCustomBinder divCustomBinder = this.customBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCustomWrapper");
        divCustomBinder.bindView(context, (DivCustomWrapper) view, data, path);
    }

    private void bindIndicator(BindingContext context, View view, Div.Indicator data) {
        DivIndicatorBinder divIndicatorBinder = this.indicatorBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView");
        divIndicatorBinder.bindView(context, (DivPagerIndicatorView) view, data);
    }

    private void bindSlider(BindingContext context, View view, Div.Slider data, DivStatePath path) {
        DivSliderBinder divSliderBinder = this.sliderBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSliderView");
        divSliderBinder.bindView(context, (DivSliderView) view, data, path);
    }

    private void bindInput(BindingContext context, View view, Div.Input data, DivStatePath path) {
        DivInputBinder divInputBinder = this.inputBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivInputView");
        divInputBinder.bindView(context, (DivInputView) view, data, path);
    }

    private void bindSelect(BindingContext context, View view, Div.Select data, DivStatePath path) {
        DivSelectBinder divSelectBinder = this.selectBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSelectView");
        divSelectBinder.bindView(context, (DivSelectView) view, data, path);
    }

    private void bindVideo(BindingContext context, View view, Div.Video data, DivStatePath path) {
        DivVideoBinder divVideoBinder = this.videoBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivVideoView");
        divVideoBinder.bindView(context, (DivVideoView) view, data, path);
    }

    private void bindSwitch(BindingContext context, View view, Div.Switch data, DivStatePath path) {
        DivSwitchBinder divSwitchBinder = this.switchBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSwitchView");
        divSwitchBinder.bindView(context, (DivSwitchView) view, data, path);
    }

    private void bindLayoutParams(View view, DivBase data, ExpressionResolver resolver) {
        BaseDivViewExtensionsKt.applyMargins(view, data.getMargins(), resolver);
    }

    public void setDataWithoutBinding(@NotNull BindingContext context, @NotNull View view, @NotNull Div div) {
        if (div instanceof Div.Text) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Image) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivImageView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.GifImage) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGifImageView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Separator) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSeparatorView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Container) {
            setContainerData(context, view, (Div.Container) div);
            return;
        }
        if (div instanceof Div.Grid) {
            setGridData(context, view, (Div.Grid) div);
            return;
        }
        if (div instanceof Div.Gallery) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivRecyclerView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Pager) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Tabs) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivTabsLayout");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.State) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivStateLayout");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Custom) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCustomWrapper");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Indicator) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Slider) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSliderView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Input) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivInputView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
            return;
        }
        if (div instanceof Div.Select) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSelectView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
        } else if (div instanceof Div.Video) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivVideoView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
        } else {
            if (!(div instanceof Div.Switch)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSwitchView");
            setDataWithoutBinding((DivHolderView<BindingContext>) view, context, (BindingContext) div);
        }
    }

    private <T extends Div> void setDataWithoutBinding(DivHolderView<T> divHolderView, BindingContext bindingContext, T t) {
        divHolderView.setDiv(t);
        divHolderView.setBindingContext(bindingContext);
    }

    private void setContainerData(BindingContext context, View view, Div.Container data) {
        DivContainerBinder divContainerBinder = this.containerBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        divContainerBinder.setDataWithoutBinding(context, (ViewGroup) view, data);
    }

    private void setGridData(BindingContext context, View view, Div.Grid data) {
        DivGridBinder divGridBinder = this.gridBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGridLayout");
        divGridBinder.setDataWithoutBinding(context, (DivGridLayout) view, data);
    }
}
