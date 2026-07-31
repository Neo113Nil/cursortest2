package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivFadeTransition;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivImageScale;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivImageBinder.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0002J$\u0010!\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0002J\u0014\u0010$\u001a\u00020\u0015*\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0002J&\u0010'\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J,\u0010*\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0002J#\u0010,\u001a\u00020\u0015*\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0002¢\u0006\u0002\u00102J&\u00103\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u0003H\u0014J&\u00105\u001a\u00020\u0015*\u00020\u00042\u0006\u00106\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J&\u00107\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u0003H\u0002J&\u00108\u001a\u00020\u0015*\u00020\u00042\u0006\u00106\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J.\u00109\u001a\u00020\u0015*\u00020\u00042\u0006\u0010:\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020#H\u0002J&\u0010;\u001a\u00020\u0015*\u00020\u00042\u0006\u00106\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010<\u001a\u00020\u0015*\u00020=H\u0002J\f\u0010>\u001a\u00020\u000f*\u00020\u0003H\u0002J$\u0010?\u001a\u00020\u0015*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivImageBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Image;", "Lcom/yandex/div2/DivImage;", "Lcom/yandex/div/core/view2/divs/widgets/DivImageView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "placeholderLoader", "Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/images/DivImageLoader;Lcom/yandex/div/core/view2/DivPlaceholderLoader;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "isHighPriorityShow", "", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "view", "div", "applyContentAlignment", "", "Lcom/yandex/div/internal/widget/AspectImageView;", "horizontalAlignment", "Lcom/yandex/div2/DivAlignmentHorizontal;", "verticalAlignment", "Lcom/yandex/div2/DivAlignmentVertical;", "applyFiltersAndSetBitmap", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "filters", "", "Lcom/yandex/div2/DivFilter;", "applyImage", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "applyImageScale", "scale", "Lcom/yandex/div2/DivImageScale;", "applyLoadingFade", "bitmapSource", "Lcom/yandex/div/core/images/BitmapSource;", "applyPlaceholders", "synchronous", "applyTint", "Lcom/yandex/div/core/widget/LoadableImageView;", "tintColor", "", "tintMode", "Lcom/yandex/div2/DivBlendMode;", "(Lcom/yandex/div/core/widget/LoadableImageView;Ljava/lang/Integer;Lcom/yandex/div2/DivBlendMode;)V", "bind", "oldDiv", "bindContentAlignment", "newDiv", "bindFilters", "bindImageScale", "bindPreviewAndImage", "context", "bindTint", "clearTint", "Landroid/widget/ImageView;", "isVectorCompatible", "observePlaceholders", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes10.dex */
public final class DivImageBinder extends DivViewBinder<Div.Image, DivImage, DivImageView> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final DivPlaceholderLoader placeholderLoader;

    public DivImageBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivImageLoader divImageLoader, @NotNull DivPlaceholderLoader divPlaceholderLoader, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivImageView divImageView, @NotNull BindingContext bindingContext, @NotNull DivImage divImage, @Nullable DivImage divImage2) {
        BaseDivViewExtensionsKt.applyDivActions(divImageView, bindingContext, divImage.action, divImage.actions, divImage.longtapActions, divImage.doubletapActions, divImage.hoverStartActions, divImage.hoverEndActions, divImage.pressStartActions, divImage.pressEndActions, divImage.actionAnimation, divImage.captureFocusOnAction);
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(divImageView, divImage.aspect, divImage2 != null ? divImage2.aspect : null, expressionResolver);
        bindImageScale(divImageView, divImage, divImage2, expressionResolver);
        bindContentAlignment(divImageView, divImage, divImage2, expressionResolver);
        bindPreviewAndImage(divImageView, bindingContext, divImage, divImage2, orCreate);
        bindTint(divImageView, divImage, divImage2, expressionResolver);
        bindFilters(divImageView, bindingContext, divImage, divImage2);
    }

    private final void bindImageScale(final DivImageView divImageView, DivImage divImage, DivImage divImage2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.scale, divImage2 != null ? divImage2.scale : null)) {
            return;
        }
        applyImageScale(divImageView, (DivImageScale) divImage.scale.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divImage.scale)) {
            return;
        }
        divImageView.addSubscription(divImage.scale.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindImageScale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivImageScale) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivImageScale divImageScale) {
                DivImageBinder.this.applyImageScale(divImageView, divImageScale);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImageScale(DivImageView divImageView, DivImageScale divImageScale) {
        divImageView.setImageScale(DivUtilKt.toImageScale(divImageScale));
    }

    private final void bindContentAlignment(final DivImageView divImageView, final DivImage divImage, DivImage divImage2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.contentAlignmentHorizontal, divImage2 != null ? divImage2.contentAlignmentHorizontal : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.contentAlignmentVertical, divImage2 != null ? divImage2.contentAlignmentVertical : null)) {
                return;
            }
        }
        applyContentAlignment(divImageView, (DivAlignmentHorizontal) divImage.contentAlignmentHorizontal.evaluate(expressionResolver), (DivAlignmentVertical) divImage.contentAlignmentVertical.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divImage.contentAlignmentHorizontal) && ExpressionsKt.isConstant(divImage.contentAlignmentVertical)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7195invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7195invoke(@NotNull Object obj) {
                DivImageBinder.this.applyContentAlignment(divImageView, (DivAlignmentHorizontal) divImage.contentAlignmentHorizontal.evaluate(expressionResolver), (DivAlignmentVertical) divImage.contentAlignmentVertical.evaluate(expressionResolver));
            }
        };
        divImageView.addSubscription(divImage.contentAlignmentHorizontal.observe(expressionResolver, function1));
        divImageView.addSubscription(divImage.contentAlignmentVertical.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
    }

    private final void bindFilters(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, DivImage divImage2) {
        boolean z;
        List list;
        List list2;
        List list3 = divImage.filters;
        Boolean bool = null;
        boolean areEqual = Intrinsics.areEqual(list3 != null ? Integer.valueOf(list3.size()) : null, (divImage2 == null || (list2 = divImage2.filters) == null) ? null : Integer.valueOf(list2.size()));
        boolean z2 = false;
        if (areEqual) {
            List list4 = divImage.filters;
            if (list4 != null) {
                int i = 0;
                z = true;
                for (Object obj : list4) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    DivFilter divFilter = (DivFilter) obj;
                    if (z) {
                        if (DivDataExtensionsKt.equalsToConstant(divFilter, (divImage2 == null || (list = divImage2.filters) == null) ? null : (DivFilter) list.get(i))) {
                            z = true;
                            i = i2;
                        }
                    }
                    z = false;
                    i = i2;
                }
            } else {
                z = true;
            }
            if (z) {
                return;
            }
        }
        applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.filters);
        List list5 = divImage.filters;
        if (list5 != null) {
            List list6 = list5;
            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                Iterator it = list6.iterator();
                while (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((DivFilter) it.next())) {
                        break;
                    }
                }
            }
            z2 = true;
            bool = Boolean.valueOf(z2);
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindFilters$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m7196invoke(obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7196invoke(@NotNull Object obj2) {
                    DivImageBinder.this.applyFiltersAndSetBitmap(divImageView, bindingContext, divImage.filters);
                }
            };
            List<DivFilter> list7 = divImage.filters;
            if (list7 != null) {
                for (DivFilter divFilter2 : list7) {
                    if (divFilter2 instanceof DivFilter.Blur) {
                        divImageView.addSubscription(((DivFilter.Blur) divFilter2).getValue().radius.observe(bindingContext.getExpressionResolver(), function1));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFiltersAndSetBitmap(final DivImageView divImageView, BindingContext bindingContext, List<? extends DivFilter> list) {
        Bitmap currentBitmapWithoutFilters = divImageView.getCurrentBitmapWithoutFilters();
        if (currentBitmapWithoutFilters == null) {
            divImageView.setImageBitmap(null);
        } else {
            BaseDivViewExtensionsKt.applyBitmapFilters(divImageView, bindingContext, currentBitmapWithoutFilters, list, new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyFiltersAndSetBitmap$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Bitmap) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Bitmap bitmap) {
                    DivImageView.this.setImageBitmap(bitmap);
                }
            });
        }
    }

    private final void observePlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, final ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observePlaceholders$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7198invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7198invoke(@NotNull Object obj) {
                boolean isHighPriorityShow;
                if (DivImageView.this.isImageLoaded()) {
                    return;
                }
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = DivImageView.this;
                BindingContext bindingContext2 = bindingContext;
                DivImage divImage2 = divImage;
                isHighPriorityShow = divImageBinder.isHighPriorityShow(expressionResolver, divImageView2, divImage2);
                divImageBinder.applyPlaceholders(divImageView2, bindingContext2, divImage2, isHighPriorityShow, errorCollector);
            }
        };
        Expression expression = divImage.preview;
        divImageView.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
        divImageView.addSubscription(divImage.placeholderColor.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, boolean z, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression expression = divImage.preview;
        divPlaceholderLoader.applyPlaceholder(divImageView, errorCollector, expression != null ? (String) expression.evaluate(expressionResolver) : null, ((Number) divImage.placeholderColor.evaluate(expressionResolver)).intValue(), z, new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPlaceholders$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Drawable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Drawable drawable) {
                if (DivImageView.this.isImageLoaded() || DivImageView.this.isImagePreview()) {
                    return;
                }
                DivImageView.this.setPlaceholder(drawable);
            }
        }, new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPlaceholders$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ImageRepresentation) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ImageRepresentation imageRepresentation) {
                if (DivImageView.this.isImageLoaded()) {
                    return;
                }
                if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                    DivImageView.this.setCurrentBitmapWithoutFilters$div_release(((ImageRepresentation.Bitmap) imageRepresentation).m7143unboximpl());
                    this.applyFiltersAndSetBitmap(DivImageView.this, bindingContext, divImage.filters);
                    DivImageView.this.previewLoaded();
                    DivImageBinder divImageBinder = this;
                    DivImageView divImageView2 = DivImageView.this;
                    Expression expression2 = divImage.tintColor;
                    divImageBinder.applyTint(divImageView2, expression2 != null ? (Integer) expression2.evaluate(expressionResolver) : null, (DivBlendMode) divImage.tintMode.evaluate(expressionResolver));
                    return;
                }
                if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                    DivImageView.this.previewLoaded();
                    DivImageView.this.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m7150unboximpl());
                }
            }
        });
    }

    private final void bindPreviewAndImage(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, DivImage divImage2, final ErrorCollector errorCollector) {
        boolean z;
        boolean z2;
        boolean equalsToConstant = ExpressionsKt.equalsToConstant(divImage.imageUrl, divImage2 != null ? divImage2.imageUrl : null);
        if (ExpressionsKt.equalsToConstant(divImage.preview, divImage2 != null ? divImage2.preview : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.placeholderColor, divImage2 != null ? divImage2.placeholderColor : null)) {
                z = false;
                boolean z3 = !ExpressionsKt.isConstantOrNull(divImage.preview) && ExpressionsKt.isConstant(divImage.placeholderColor);
                z2 = divImageView.isImageLoaded() && z;
                if (z2 && !z3) {
                    observePlaceholders(divImageView, bindingContext, divImage, errorCollector);
                }
                if (!equalsToConstant && !ExpressionsKt.isConstantOrNull(divImage.imageUrl)) {
                    divImageView.addSubscription(divImage.imageUrl.observe(bindingContext.getExpressionResolver(), new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Uri) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Uri uri) {
                            DivImageBinder.this.applyImage(divImageView, bindingContext, divImage, errorCollector);
                        }
                    }));
                }
                if (applyImage(divImageView, bindingContext, divImage, errorCollector) && z2) {
                    applyPlaceholders(divImageView, bindingContext, divImage, isHighPriorityShow(bindingContext.getExpressionResolver(), divImageView, divImage), errorCollector);
                    return;
                }
            }
        }
        z = true;
        if (ExpressionsKt.isConstantOrNull(divImage.preview)) {
        }
        if (divImageView.isImageLoaded()) {
        }
        if (z2) {
            observePlaceholders(divImageView, bindingContext, divImage, errorCollector);
        }
        if (!equalsToConstant) {
            divImageView.addSubscription(divImage.imageUrl.observe(bindingContext.getExpressionResolver(), new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Uri) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Uri uri) {
                    DivImageBinder.this.applyImage(divImageView, bindingContext, divImage, errorCollector);
                }
            }));
        }
        if (applyImage(divImageView, bindingContext, divImage, errorCollector)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyImage(final DivImageView divImageView, final BindingContext bindingContext, final DivImage divImage, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final Uri uri = (Uri) divImage.imageUrl.evaluate(expressionResolver);
        if (Intrinsics.areEqual(uri, divImageView.getImageUrl())) {
            return false;
        }
        boolean isHighPriorityShow = isHighPriorityShow(expressionResolver, divImageView, divImage);
        divImageView.resetImageLoaded();
        clearTint(divImageView);
        LoadReference loadReference = divImageView.getLoadReference();
        if (loadReference != null) {
            loadReference.cancel();
        }
        applyPlaceholders(divImageView, bindingContext, divImage, isHighPriorityShow, errorCollector);
        divImageView.setImageUrl$div_release(uri);
        DivImageLoader divImageLoader = this.imageLoader;
        String uri2 = uri.toString();
        final Div2View divView = bindingContext.getDivView();
        LoadReference loadImage = divImageLoader.loadImage(uri2, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                DivImageView.this.setCurrentBitmapWithoutFilters$div_release(cachedBitmap.getBitmap());
                this.applyFiltersAndSetBitmap(DivImageView.this, bindingContext, divImage.filters);
                this.applyLoadingFade(DivImageView.this, divImage, expressionResolver, cachedBitmap.getFrom());
                DivImageView.this.imageLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = DivImageView.this;
                Expression expression = divImage.tintColor;
                divImageBinder.applyTint(divImageView2, expression != null ? (Integer) expression.evaluate(expressionResolver) : null, (DivBlendMode) divImage.tintMode.evaluate(expressionResolver));
                DivImageView.this.invalidate();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                boolean isVectorCompatible;
                isVectorCompatible = this.isVectorCompatible(divImage);
                if (!isVectorCompatible) {
                    onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, uri, null, 2, null));
                    return;
                }
                super.onSuccess(pictureDrawable);
                DivImageView.this.setImageDrawable(pictureDrawable);
                this.applyLoadingFade(DivImageView.this, divImage, expressionResolver, null);
                DivImageView.this.imageLoaded();
                DivImageView.this.invalidate();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                DivImageView.this.setImageUrl$div_release(null);
            }
        });
        bindingContext.getDivView().addLoadReference(loadImage, divImageView);
        divImageView.setLoadReference$div_release(loadImage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVectorCompatible(DivImage divImage) {
        List list;
        return divImage.tintColor == null && ((list = divImage.filters) == null || list.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLoadingFade(DivImageView divImageView, DivImage divImage, ExpressionResolver expressionResolver, BitmapSource bitmapSource) {
        divImageView.animate().cancel();
        DivFadeTransition divFadeTransition = divImage.appearanceAnimation;
        float doubleValue = (float) ((Number) divImage.getAlpha().evaluate(expressionResolver)).doubleValue();
        if (divFadeTransition == null || bitmapSource == BitmapSource.MEMORY) {
            divImageView.setAlpha(doubleValue);
            return;
        }
        long longValue = ((Number) divFadeTransition.getDuration().evaluate(expressionResolver)).longValue();
        Interpolator androidInterpolator = DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) divFadeTransition.getInterpolator().evaluate(expressionResolver));
        divImageView.setAlpha((float) ((Number) divFadeTransition.alpha.evaluate(expressionResolver)).doubleValue());
        divImageView.animate().alpha(doubleValue).setDuration(longValue).setInterpolator(androidInterpolator).setStartDelay(((Number) divFadeTransition.getStartDelay().evaluate(expressionResolver)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHighPriorityShow(ExpressionResolver resolver, DivImageView view, DivImage div) {
        return !view.isImageLoaded() && ((Boolean) div.highPriorityPreviewShow.evaluate(resolver)).booleanValue();
    }

    private final void bindTint(final DivImageView divImageView, final DivImage divImage, DivImage divImage2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divImage.tintColor, divImage2 != null ? divImage2.tintColor : null)) {
            if (ExpressionsKt.equalsToConstant(divImage.tintMode, divImage2 != null ? divImage2.tintMode : null)) {
                return;
            }
        }
        Expression expression = divImage.tintColor;
        applyTint(divImageView, expression != null ? (Integer) expression.evaluate(expressionResolver) : null, (DivBlendMode) divImage.tintMode.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(divImage.tintColor) && ExpressionsKt.isConstant(divImage.tintMode)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindTint$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7197invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7197invoke(@NotNull Object obj) {
                DivImageBinder divImageBinder = DivImageBinder.this;
                DivImageView divImageView2 = divImageView;
                Expression expression2 = divImage.tintColor;
                divImageBinder.applyTint(divImageView2, expression2 != null ? (Integer) expression2.evaluate(expressionResolver) : null, (DivBlendMode) divImage.tintMode.evaluate(expressionResolver));
            }
        };
        Expression expression2 = divImage.tintColor;
        divImageView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
        divImageView.addSubscription(divImage.tintMode.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTint(LoadableImageView loadableImageView, Integer num, DivBlendMode divBlendMode) {
        if ((loadableImageView.isImageLoaded() || loadableImageView.isImagePreview()) && num != null) {
            loadableImageView.setColorFilter(num.intValue(), DivUtilKt.toPorterDuffMode(divBlendMode));
        } else {
            clearTint(loadableImageView);
        }
    }

    private final void clearTint(ImageView imageView) {
        imageView.setColorFilter((ColorFilter) null);
    }
}
