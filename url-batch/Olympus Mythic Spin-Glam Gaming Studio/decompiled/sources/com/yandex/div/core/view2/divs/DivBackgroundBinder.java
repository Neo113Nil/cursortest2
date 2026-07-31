package com.yandex.div.core.view2.divs;

import android.R;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivSizeUnit;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBackgroundBinder.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001:\u0001BB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0#H\u0012Jp\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016JJ\u0010,\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u0006\u0010 \u001a\u00020!H\u0012Jh\u0010.\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\u0006\u0010 \u001a\u00020!H\u0012J.\u0010/\u001a\u00020\u001b*\u00020\b2\u0006\u0010%\u001a\u00020&2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\rH\u0012J<\u00100\u001a\u00020\u001b*\u00020\b2\u0006\u0010%\u001a\u00020&2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001d0\rH\u0012J\u0014\u00101\u001a\u000202*\u0002032\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J$\u00104\u001a\u00020\u000e*\u00020\u001d2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J\u0014\u00104\u001a\u000209*\u00020:2\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J\u001c\u00104\u001a\u00020;*\u00020<2\u0006\u00107\u001a\u0002082\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J\u001c\u00104\u001a\u00020=*\u00020>2\u0006\u00107\u001a\u0002082\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J0\u0010?\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0012J\u0016\u0010@\u001a\u00020\u001b*\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010\u0006H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068R@RX\u0092\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR>\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8R@RX\u0092\u000e¢\u0006\u0012\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R>\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8R@RX\u0092\u000e¢\u0006\u0012\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006C"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;", "", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "(Lcom/yandex/div/core/images/DivImageLoader;)V", "value", "Landroid/graphics/drawable/Drawable;", "additionalLayer", "Landroid/view/View;", "getAdditionalLayer", "(Landroid/view/View;)Landroid/graphics/drawable/Drawable;", "setAdditionalLayer", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "defaultBackgroundList", "getDefaultBackgroundList$annotations", "(Landroid/view/View;)V", "getDefaultBackgroundList", "(Landroid/view/View;)Ljava/util/List;", "setDefaultBackgroundList", "(Landroid/view/View;Ljava/util/List;)V", "focusedBackgroundList", "getFocusedBackgroundList$annotations", "getFocusedBackgroundList", "setFocusedBackgroundList", "addBackgroundSubscriptions", "", "backgroundList", "Lcom/yandex/div2/DivBackground;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "subscriber", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "callback", "Lkotlin/Function1;", "bindBackground", "context", "Lcom/yandex/div/core/view2/BindingContext;", "view", "newDefaultBackgroundList", "oldDefaultBackgroundList", "newFocusedBackgroundList", "oldFocusedBackgroundList", "bindDefaultBackground", "newAdditionalLayer", "bindFocusBackground", "applyDefaultBackground", "applyFocusedBackground", "isVectorCompatible", "", "Lcom/yandex/div2/DivImageBackground;", "toBackgroundState", "divView", "Lcom/yandex/div/core/view2/Div2View;", "metrics", "Landroid/util/DisplayMetrics;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "Lcom/yandex/div2/DivFilter;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "Lcom/yandex/div2/DivRadialGradientCenter;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "Lcom/yandex/div2/DivRadialGradientRadius;", "toDrawable", "updateBackground", "drawable", "DivBackgroundState", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes9.dex */
public class DivBackgroundBinder {

    @NotNull
    private final DivImageLoader imageLoader;

    private static /* synthetic */ void getDefaultBackgroundList$annotations(View view) {
    }

    private static /* synthetic */ void getFocusedBackgroundList$annotations(View view) {
    }

    public DivBackgroundBinder(@NotNull DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    public static /* synthetic */ void bindBackground$default(DivBackgroundBinder divBackgroundBinder, BindingContext bindingContext, View view, List list, List list2, List list3, List list4, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindBackground");
        }
        divBackgroundBinder.bindBackground(bindingContext, view, list, (i & 8) != 0 ? null : list2, list3, (i & 32) != 0 ? null : list4, expressionSubscriber, (i & 128) != 0 ? null : drawable);
    }

    public void bindBackground(@NotNull BindingContext context, @NotNull View view, @Nullable List<? extends DivBackground> newDefaultBackgroundList, @Nullable List<? extends DivBackground> oldDefaultBackgroundList, @Nullable List<? extends DivBackground> newFocusedBackgroundList, @Nullable List<? extends DivBackground> oldFocusedBackgroundList, @NotNull ExpressionSubscriber subscriber, @Nullable Drawable additionalLayer) {
        if (newFocusedBackgroundList == null) {
            bindDefaultBackground(context, view, additionalLayer, newDefaultBackgroundList, oldDefaultBackgroundList, subscriber);
        } else {
            bindFocusBackground(context, view, additionalLayer, newDefaultBackgroundList, oldDefaultBackgroundList, newFocusedBackgroundList, oldFocusedBackgroundList, subscriber);
        }
    }

    private void bindDefaultBackground(final BindingContext context, final View view, final Drawable newAdditionalLayer, final List<? extends DivBackground> newDefaultBackgroundList, List<? extends DivBackground> oldDefaultBackgroundList, ExpressionSubscriber subscriber) {
        List<? extends DivBackground> emptyList = newDefaultBackgroundList == null ? CollectionsKt.emptyList() : newDefaultBackgroundList;
        if (oldDefaultBackgroundList == null) {
            oldDefaultBackgroundList = CollectionsKt.emptyList();
        }
        Drawable additionalLayer = getAdditionalLayer(view);
        if (emptyList.size() == oldDefaultBackgroundList.size()) {
            Iterator<T> it = emptyList.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((DivBackground) next, oldDefaultBackgroundList.get(i))) {
                        break;
                    } else {
                        i = i2;
                    }
                } else if (Intrinsics.areEqual(newAdditionalLayer, additionalLayer)) {
                    return;
                }
            }
        }
        applyDefaultBackground(view, context, newAdditionalLayer, newDefaultBackgroundList);
        List<? extends DivBackground> list = emptyList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!DivDataExtensionsKt.isConstant((DivBackground) it2.next())) {
                addBackgroundSubscriptions(newDefaultBackgroundList, context.getExpressionResolver(), subscriber, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindDefaultBackground$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m7168invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7168invoke(@NotNull Object obj) {
                        DivBackgroundBinder.this.applyDefaultBackground(view, context, newAdditionalLayer, newDefaultBackgroundList);
                    }
                });
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDefaultBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends DivBackground> list) {
        List<? extends DivBackgroundState> emptyList;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends DivBackground> list2 = list;
            emptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                emptyList.add(toBackgroundState((DivBackground) it.next(), bindingContext.getDivView(), displayMetrics, expressionResolver));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (Intrinsics.areEqual(defaultBackgroundList, emptyList) && Intrinsics.areEqual(additionalLayer, drawable)) {
            return;
        }
        updateBackground(view, toDrawable(emptyList, bindingContext, view, drawable));
        setDefaultBackgroundList(view, emptyList);
        setFocusedBackgroundList(view, null);
        setAdditionalLayer(view, drawable);
    }

    private void bindFocusBackground(final BindingContext context, final View view, final Drawable newAdditionalLayer, final List<? extends DivBackground> newDefaultBackgroundList, List<? extends DivBackground> oldDefaultBackgroundList, final List<? extends DivBackground> newFocusedBackgroundList, List<? extends DivBackground> oldFocusedBackgroundList, ExpressionSubscriber subscriber) {
        List<? extends DivBackground> emptyList = newDefaultBackgroundList == null ? CollectionsKt.emptyList() : newDefaultBackgroundList;
        if (oldDefaultBackgroundList == null) {
            oldDefaultBackgroundList = CollectionsKt.emptyList();
        }
        if (oldFocusedBackgroundList == null) {
            oldFocusedBackgroundList = CollectionsKt.emptyList();
        }
        Drawable additionalLayer = getAdditionalLayer(view);
        if (emptyList.size() == oldDefaultBackgroundList.size()) {
            Iterator<T> it = emptyList.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (newFocusedBackgroundList.size() == oldFocusedBackgroundList.size()) {
                        Iterator<T> it2 = newFocusedBackgroundList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                int i3 = i + 1;
                                if (i < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (!DivDataExtensionsKt.equalsToConstant((DivBackground) next, oldFocusedBackgroundList.get(i))) {
                                    break;
                                } else {
                                    i = i3;
                                }
                            } else if (Intrinsics.areEqual(newAdditionalLayer, additionalLayer)) {
                                return;
                            }
                        }
                    }
                } else {
                    Object next2 = it.next();
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((DivBackground) next2, oldDefaultBackgroundList.get(i2))) {
                        break;
                    } else {
                        i2 = i4;
                    }
                }
            }
        }
        applyFocusedBackground(view, context, newAdditionalLayer, newDefaultBackgroundList, newFocusedBackgroundList);
        List<? extends DivBackground> list = emptyList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (!DivDataExtensionsKt.isConstant((DivBackground) it3.next())) {
                    break;
                }
            }
        }
        List<? extends DivBackground> list2 = newFocusedBackgroundList;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            if (!DivDataExtensionsKt.isConstant((DivBackground) it4.next())) {
                Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindFocusBackground$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m7169invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7169invoke(@NotNull Object obj) {
                        DivBackgroundBinder.this.applyFocusedBackground(view, context, newAdditionalLayer, newDefaultBackgroundList, newFocusedBackgroundList);
                    }
                };
                ExpressionResolver expressionResolver = context.getExpressionResolver();
                addBackgroundSubscriptions(newDefaultBackgroundList, expressionResolver, subscriber, function1);
                addBackgroundSubscriptions(newFocusedBackgroundList, expressionResolver, subscriber, function1);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyFocusedBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends DivBackground> list, List<? extends DivBackground> list2) {
        List<? extends DivBackgroundState> emptyList;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            List<? extends DivBackground> list3 = list;
            emptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                emptyList.add(toBackgroundState((DivBackground) it.next(), divView, displayMetrics, expressionResolver));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<? extends DivBackground> list4 = list2;
        List<? extends DivBackgroundState> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList.add(toBackgroundState((DivBackground) it2.next(), divView, displayMetrics, expressionResolver));
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        List<DivBackgroundState> focusedBackgroundList = getFocusedBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (Intrinsics.areEqual(defaultBackgroundList, emptyList) && Intrinsics.areEqual(focusedBackgroundList, arrayList) && Intrinsics.areEqual(additionalLayer, drawable)) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, toDrawable(arrayList, bindingContext, view, drawable));
        if (list != null || drawable != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, toDrawable(emptyList, bindingContext, view, drawable));
        }
        updateBackground(view, stateListDrawable);
        setDefaultBackgroundList(view, emptyList);
        setFocusedBackgroundList(view, arrayList);
        setAdditionalLayer(view, drawable);
    }

    private void updateBackground(View view, Drawable drawable) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(com.yandex.div.R.drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = ContextCompat.getDrawable(view.getContext(), com.yandex.div.R.drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z = true;
        } else {
            z = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z) {
            Drawable background2 = view.getBackground();
            Intrinsics.checkNotNull(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            Intrinsics.checkNotNull(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, com.yandex.div.R.drawable.native_animation_background);
        }
    }

    private void addBackgroundSubscriptions(List<? extends DivBackground> backgroundList, ExpressionResolver resolver, ExpressionSubscriber subscriber, Function1 callback) {
        if (backgroundList != null) {
            Iterator<T> it = backgroundList.iterator();
            while (it.hasNext()) {
                ExpressionSubscribersKt.observeBackground(subscriber, (DivBackground) it.next(), resolver, callback);
            }
        }
    }

    private Drawable toDrawable(List<? extends DivBackgroundState> list, BindingContext bindingContext, View view, Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        if (list == null) {
            if (drawable != null) {
                return new LayerDrawable(new Drawable[]{drawable});
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Drawable mutate = ((DivBackgroundState) it.next()).toDrawable(bindingContext, view, this.imageLoader).mutate();
            if (mutate != null) {
                arrayList.add(mutate);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (drawable != null) {
            mutableList.add(drawable);
        }
        List list2 = mutableList;
        if (list2.isEmpty()) {
            return null;
        }
        return new LayerDrawable((Drawable[]) list2.toArray(new Drawable[0]));
    }

    private DivBackgroundState toBackgroundState(DivBackground divBackground, Div2View div2View, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        List emptyList;
        int i5;
        if (divBackground instanceof DivBackground.LinearGradient) {
            DivBackground.LinearGradient linearGradient = (DivBackground.LinearGradient) divBackground;
            long longValue = ((Number) linearGradient.getValue().angle.evaluate(expressionResolver)).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i5 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i5 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.LinearGradient(i5, ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(linearGradient.getValue(), expressionResolver), div2View));
        }
        if (divBackground instanceof DivBackground.RadialGradient) {
            DivBackground.RadialGradient radialGradient = (DivBackground.RadialGradient) divBackground;
            DivBackgroundState.RadialGradient.Center backgroundState = toBackgroundState(radialGradient.getValue().centerX, displayMetrics, expressionResolver);
            DivBackgroundState.RadialGradient.Center backgroundState2 = toBackgroundState(radialGradient.getValue().centerY, displayMetrics, expressionResolver);
            ExpressionList expressionList = radialGradient.getValue().colors;
            if (expressionList == null || (emptyList = expressionList.evaluate(expressionResolver)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            return new DivBackgroundState.RadialGradient(backgroundState, backgroundState2, emptyList, toBackgroundState(radialGradient.getValue().radius, displayMetrics, expressionResolver));
        }
        if (divBackground instanceof DivBackground.Image) {
            DivBackground.Image image = (DivBackground.Image) divBackground;
            double doubleValue = ((Number) image.getValue().alpha.evaluate(expressionResolver)).doubleValue();
            DivAlignmentHorizontal divAlignmentHorizontal = (DivAlignmentHorizontal) image.getValue().contentAlignmentHorizontal.evaluate(expressionResolver);
            DivAlignmentVertical divAlignmentVertical = (DivAlignmentVertical) image.getValue().contentAlignmentVertical.evaluate(expressionResolver);
            Uri uri = (Uri) image.getValue().imageUrl.evaluate(expressionResolver);
            boolean booleanValue = ((Boolean) image.getValue().preloadRequired.evaluate(expressionResolver)).booleanValue();
            DivImageScale divImageScale = (DivImageScale) image.getValue().scale.evaluate(expressionResolver);
            List list = image.getValue().filters;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(toBackgroundState((DivFilter) it.next(), expressionResolver));
                }
            } else {
                arrayList = null;
            }
            return new DivBackgroundState.Image(doubleValue, divAlignmentHorizontal, divAlignmentVertical, uri, booleanValue, divImageScale, arrayList, isVectorCompatible(image.getValue(), expressionResolver));
        }
        if (divBackground instanceof DivBackground.Solid) {
            return new DivBackgroundState.Solid(((Number) ((DivBackground.Solid) divBackground).getValue().color.evaluate(expressionResolver)).intValue());
        }
        if (!(divBackground instanceof DivBackground.NinePatch)) {
            throw new NoWhenBranchMatchedException();
        }
        DivBackground.NinePatch ninePatch = (DivBackground.NinePatch) divBackground;
        Uri uri2 = (Uri) ninePatch.getValue().imageUrl.evaluate(expressionResolver);
        long longValue2 = ((Number) ninePatch.getValue().insets.left.evaluate(expressionResolver)).longValue();
        long j2 = longValue2 >> 31;
        if (j2 == 0 || j2 == -1) {
            i = (int) longValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue2 + "' to Int");
            }
            i = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue3 = ((Number) ninePatch.getValue().insets.top.evaluate(expressionResolver)).longValue();
        long j3 = longValue3 >> 31;
        if (j3 == 0 || j3 == -1) {
            i2 = (int) longValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue3 + "' to Int");
            }
            i2 = longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue4 = ((Number) ninePatch.getValue().insets.right.evaluate(expressionResolver)).longValue();
        long j4 = longValue4 >> 31;
        if (j4 == 0 || j4 == -1) {
            i3 = (int) longValue4;
        } else {
            KAssert kAssert4 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue4 + "' to Int");
            }
            i3 = longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long longValue5 = ((Number) ninePatch.getValue().insets.bottom.evaluate(expressionResolver)).longValue();
        long j5 = longValue5 >> 31;
        if (j5 == 0 || j5 == -1) {
            i4 = (int) longValue5;
        } else {
            KAssert kAssert5 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + longValue5 + "' to Int");
            }
            i4 = longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new DivBackgroundState.NinePatch(uri2, new Rect(i, i2, i3, i4));
    }

    private boolean isVectorCompatible(DivImageBackground divImageBackground, ExpressionResolver expressionResolver) {
        List list;
        return ((Number) divImageBackground.alpha.evaluate(expressionResolver)).doubleValue() == 1.0d && ((list = divImageBackground.filters) == null || list.isEmpty());
    }

    private DivBackgroundState.RadialGradient.Center toBackgroundState(DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Fixed) {
            DivRadialGradientCenter.Fixed fixed = (DivRadialGradientCenter.Fixed) divRadialGradientCenter;
            return new DivBackgroundState.RadialGradient.Center.Fixed(BaseDivViewExtensionsKt.toPxF(((Number) fixed.getValue().value.evaluate(expressionResolver)).longValue(), (DivSizeUnit) fixed.getValue().unit.evaluate(expressionResolver), displayMetrics));
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Relative) {
            return new DivBackgroundState.RadialGradient.Center.Relative((float) ((Number) ((DivRadialGradientCenter.Relative) divRadialGradientCenter).getValue().value.evaluate(expressionResolver)).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState.RadialGradient.Radius toBackgroundState(DivRadialGradientRadius divRadialGradientRadius, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.FixedSize) {
            return new DivBackgroundState.RadialGradient.Radius.Fixed(BaseDivViewExtensionsKt.toPxF(((DivRadialGradientRadius.FixedSize) divRadialGradientRadius).getValue(), displayMetrics, expressionResolver));
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.Relative) {
            return new DivBackgroundState.RadialGradient.Radius.Relative((DivRadialGradientRelativeRadius.Value) ((DivRadialGradientRadius.Relative) divRadialGradientRadius).getValue().value.evaluate(expressionResolver));
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState.Image.Filter toBackgroundState(DivFilter divFilter, ExpressionResolver expressionResolver) {
        int i;
        if (divFilter instanceof DivFilter.Blur) {
            DivFilter.Blur blur = (DivFilter.Blur) divFilter;
            long longValue = ((Number) blur.getValue().radius.evaluate(expressionResolver)).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.Image.Filter.Blur(i, blur);
        }
        if (divFilter instanceof DivFilter.RtlMirror) {
            return new DivBackgroundState.Image.Filter.RtlMirror((DivFilter.RtlMirror) divFilter);
        }
        throw new NoWhenBranchMatchedException();
    }

    private List<DivBackgroundState> getDefaultBackgroundList(View view) {
        Object tag = view.getTag(com.yandex.div.R.id.div_default_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private void setDefaultBackgroundList(View view, List<? extends DivBackgroundState> list) {
        SpecialsBridge.yandexViewSetTag(view, com.yandex.div.R.id.div_default_background_list_tag, list);
    }

    private List<DivBackgroundState> getFocusedBackgroundList(View view) {
        Object tag = view.getTag(com.yandex.div.R.id.div_focused_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private void setFocusedBackgroundList(View view, List<? extends DivBackgroundState> list) {
        SpecialsBridge.yandexViewSetTag(view, com.yandex.div.R.id.div_focused_background_list_tag, list);
    }

    private Drawable getAdditionalLayer(View view) {
        Object tag = view.getTag(com.yandex.div.R.id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    private void setAdditionalLayer(View view, Drawable drawable) {
        SpecialsBridge.yandexViewSetTag(view, com.yandex.div.R.id.div_additional_background_layer_tag, drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DivBackgroundBinder.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "", "()V", "toDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "target", "Landroid/view/View;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "Image", "LinearGradient", "NinePatch", "RadialGradient", "Solid", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$LinearGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$NinePatch;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Solid;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static abstract class DivBackgroundState {
        public /* synthetic */ DivBackgroundState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DivBackgroundState() {
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$LinearGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "angle", "", "colormap", "Lcom/yandex/div/internal/graphics/Colormap;", "(ILcom/yandex/div/internal/graphics/Colormap;)V", "getAngle", "()I", "getColormap", "()Lcom/yandex/div/internal/graphics/Colormap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class LinearGradient extends DivBackgroundState {
            private final int angle;

            @NotNull
            private final Colormap colormap;

            public static /* synthetic */ LinearGradient copy$default(LinearGradient linearGradient, int i, Colormap colormap, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = linearGradient.angle;
                }
                if ((i2 & 2) != 0) {
                    colormap = linearGradient.colormap;
                }
                return linearGradient.copy(i, colormap);
            }

            /* renamed from: component1, reason: from getter */
            public final int getAngle() {
                return this.angle;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Colormap getColormap() {
                return this.colormap;
            }

            @NotNull
            public final LinearGradient copy(int angle, @NotNull Colormap colormap) {
                return new LinearGradient(angle, colormap);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LinearGradient)) {
                    return false;
                }
                LinearGradient linearGradient = (LinearGradient) other;
                return this.angle == linearGradient.angle && Intrinsics.areEqual(this.colormap, linearGradient.colormap);
            }

            public int hashCode() {
                return (Integer.hashCode(this.angle) * 31) + this.colormap.hashCode();
            }

            @NotNull
            public String toString() {
                return "LinearGradient(angle=" + this.angle + ", colormap=" + this.colormap + ')';
            }

            public final int getAngle() {
                return this.angle;
            }

            @NotNull
            public final Colormap getColormap() {
                return this.colormap;
            }

            public LinearGradient(int i, @NotNull Colormap colormap) {
                super(null);
                this.angle = i;
                this.colormap = colormap;
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "centerX", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "centerY", "colors", "", "", "radius", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "(Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;Ljava/util/List;Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;)V", "getCenterX", "()Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "getCenterY", "getColors", "()Ljava/util/List;", "getRadius", "()Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Center", "Radius", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class RadialGradient extends DivBackgroundState {

            @NotNull
            private final Center centerX;

            @NotNull
            private final Center centerY;

            @NotNull
            private final List<Integer> colors;

            @NotNull
            private final Radius radius;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RadialGradient copy$default(RadialGradient radialGradient, Center center, Center center2, List list, Radius radius, int i, Object obj) {
                if ((i & 1) != 0) {
                    center = radialGradient.centerX;
                }
                if ((i & 2) != 0) {
                    center2 = radialGradient.centerY;
                }
                if ((i & 4) != 0) {
                    list = radialGradient.colors;
                }
                if ((i & 8) != 0) {
                    radius = radialGradient.radius;
                }
                return radialGradient.copy(center, center2, list, radius);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Center getCenterX() {
                return this.centerX;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Center getCenterY() {
                return this.centerY;
            }

            @NotNull
            public final List<Integer> component3() {
                return this.colors;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final Radius getRadius() {
                return this.radius;
            }

            @NotNull
            public final RadialGradient copy(@NotNull Center centerX, @NotNull Center centerY, @NotNull List<Integer> colors, @NotNull Radius radius) {
                return new RadialGradient(centerX, centerY, colors, radius);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RadialGradient)) {
                    return false;
                }
                RadialGradient radialGradient = (RadialGradient) other;
                return Intrinsics.areEqual(this.centerX, radialGradient.centerX) && Intrinsics.areEqual(this.centerY, radialGradient.centerY) && Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.radius, radialGradient.radius);
            }

            public int hashCode() {
                return (((((this.centerX.hashCode() * 31) + this.centerY.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.radius.hashCode();
            }

            @NotNull
            public String toString() {
                return "RadialGradient(centerX=" + this.centerX + ", centerY=" + this.centerY + ", colors=" + this.colors + ", radius=" + this.radius + ')';
            }

            @NotNull
            public final Center getCenterX() {
                return this.centerX;
            }

            @NotNull
            public final Center getCenterY() {
                return this.centerY;
            }

            @NotNull
            public final List<Integer> getColors() {
                return this.colors;
            }

            @NotNull
            public final Radius getRadius() {
                return this.radius;
            }

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "", "()V", "toRadialGradientDrawableCenter", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "Fixed", "Relative", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Relative;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static abstract class Center {
                public /* synthetic */ Center(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "value", "", "(F)V", "getValue", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Relative extends Center {
                    private final float value;

                    public static /* synthetic */ Relative copy$default(Relative relative, float f, int i, Object obj) {
                        if ((i & 1) != 0) {
                            f = relative.value;
                        }
                        return relative.copy(f);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final float getValue() {
                        return this.value;
                    }

                    @NotNull
                    public final Relative copy(float value) {
                        return new Relative(value);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Relative) && Float.compare(this.value, ((Relative) other).value) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.value);
                    }

                    @NotNull
                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }

                    public Relative(float f) {
                        super(null);
                        this.value = f;
                    }

                    public final float getValue() {
                        return this.value;
                    }
                }

                private Center() {
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "valuePx", "", "(F)V", "getValuePx", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Fixed extends Center {
                    private final float valuePx;

                    public static /* synthetic */ Fixed copy$default(Fixed fixed, float f, int i, Object obj) {
                        if ((i & 1) != 0) {
                            f = fixed.valuePx;
                        }
                        return fixed.copy(f);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    @NotNull
                    public final Fixed copy(float valuePx) {
                        return new Fixed(valuePx);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) other).valuePx) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }

                    public Fixed(float f) {
                        super(null);
                        this.valuePx = f;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }
                }

                @NotNull
                public final RadialGradientDrawable.Center toRadialGradientDrawableCenter() {
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Center.Fixed(((Fixed) this).getValuePx());
                    }
                    if (this instanceof Relative) {
                        return new RadialGradientDrawable.Center.Relative(((Relative) this).getValue());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            public RadialGradient(@NotNull Center center, @NotNull Center center2, @NotNull List<Integer> list, @NotNull Radius radius) {
                super(null);
                this.centerX = center;
                this.centerY = center2;
                this.colors = list;
                this.radius = radius;
            }

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "", "()V", "toRadialGradientDrawableRadius", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "Fixed", "Relative", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Relative;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static abstract class Radius {

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DivRadialGradientRelativeRadius.Value.values().length];
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Radius(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "value", "Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "(Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;)V", "getValue", "()Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Relative extends Radius {

                    @NotNull
                    private final DivRadialGradientRelativeRadius.Value value;

                    public static /* synthetic */ Relative copy$default(Relative relative, DivRadialGradientRelativeRadius.Value value, int i, Object obj) {
                        if ((i & 1) != 0) {
                            value = relative.value;
                        }
                        return relative.copy(value);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final DivRadialGradientRelativeRadius.Value getValue() {
                        return this.value;
                    }

                    @NotNull
                    public final Relative copy(@NotNull DivRadialGradientRelativeRadius.Value value) {
                        return new Relative(value);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Relative) && this.value == ((Relative) other).value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }

                    public Relative(@NotNull DivRadialGradientRelativeRadius.Value value) {
                        super(null);
                        this.value = value;
                    }

                    @NotNull
                    public final DivRadialGradientRelativeRadius.Value getValue() {
                        return this.value;
                    }
                }

                private Radius() {
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "valuePx", "", "(F)V", "getValuePx", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Fixed extends Radius {
                    private final float valuePx;

                    public static /* synthetic */ Fixed copy$default(Fixed fixed, float f, int i, Object obj) {
                        if ((i & 1) != 0) {
                            f = fixed.valuePx;
                        }
                        return fixed.copy(f);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    @NotNull
                    public final Fixed copy(float valuePx) {
                        return new Fixed(valuePx);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) other).valuePx) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }

                    public Fixed(float f) {
                        super(null);
                        this.valuePx = f;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }
                }

                @NotNull
                public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius() {
                    RadialGradientDrawable.Radius.Relative.Type type;
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Radius.Fixed(((Fixed) this).getValuePx());
                    }
                    if (!(this instanceof Relative)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i = WhenMappings.$EnumSwitchMapping$0[((Relative) this).getValue().ordinal()];
                    if (i == 1) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
                    } else if (i == 2) {
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
                    } else if (i == 3) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
                    }
                    return new RadialGradientDrawable.Radius.Relative(type);
                }
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001@BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003Ja\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\u001e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001J\u0014\u00109\u001a\u00020:*\u00020\u00052\u0006\u0010;\u001a\u00020\u000bH\u0002J\f\u0010<\u001a\u00020=*\u00020\rH\u0002J\f\u0010>\u001a\u00020?*\u00020\u0007H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006A"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "alpha", "", "contentAlignmentHorizontal", "Lcom/yandex/div2/DivAlignmentHorizontal;", "contentAlignmentVertical", "Lcom/yandex/div2/DivAlignmentVertical;", UnifiedMediationParams.KEY_IMAGE_URL, "Landroid/net/Uri;", "preloadRequired", "", "scale", "Lcom/yandex/div2/DivImageScale;", "filters", "", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "isVectorCompatible", "(DLcom/yandex/div2/DivAlignmentHorizontal;Lcom/yandex/div2/DivAlignmentVertical;Landroid/net/Uri;ZLcom/yandex/div2/DivImageScale;Ljava/util/List;Z)V", "getAlpha", "()D", "getContentAlignmentHorizontal", "()Lcom/yandex/div2/DivAlignmentHorizontal;", "getContentAlignmentVertical", "()Lcom/yandex/div2/DivAlignmentVertical;", "getFilters", "()Ljava/util/List;", "getImageUrl", "()Landroid/net/Uri;", "()Z", "getPreloadRequired", "getScale", "()Lcom/yandex/div2/DivImageScale;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "getDivImageBackground", "Landroid/graphics/drawable/Drawable;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "target", "Landroid/view/View;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "hashCode", "", "toString", "", "toHorizontalAlignment", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentHorizontal;", "isRtl", "toScaleType", "Lcom/yandex/div/internal/drawable/ScalingDrawable$ScaleType;", "toVerticalAlignment", "Lcom/yandex/div/internal/drawable/ScalingDrawable$AlignmentVertical;", "Filter", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Image extends DivBackgroundState {
            private final double alpha;

            @NotNull
            private final DivAlignmentHorizontal contentAlignmentHorizontal;

            @NotNull
            private final DivAlignmentVertical contentAlignmentVertical;

            @Nullable
            private final List<Filter> filters;

            @NotNull
            private final Uri imageUrl;
            private final boolean isVectorCompatible;
            private final boolean preloadRequired;

            @NotNull
            private final DivImageScale scale;

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[DivImageScale.values().length];
                    try {
                        iArr[DivImageScale.FILL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DivImageScale.FIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DivImageScale.STRETCH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                    try {
                        iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[DivAlignmentVertical.values().length];
                    try {
                        iArr3[DivAlignmentVertical.CENTER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }

            /* renamed from: component1, reason: from getter */
            public final double getAlpha() {
                return this.alpha;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final DivAlignmentHorizontal getContentAlignmentHorizontal() {
                return this.contentAlignmentHorizontal;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final DivAlignmentVertical getContentAlignmentVertical() {
                return this.contentAlignmentVertical;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getPreloadRequired() {
                return this.preloadRequired;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final DivImageScale getScale() {
                return this.scale;
            }

            @Nullable
            public final List<Filter> component7() {
                return this.filters;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getIsVectorCompatible() {
                return this.isVectorCompatible;
            }

            @NotNull
            public final Image copy(double alpha, @NotNull DivAlignmentHorizontal contentAlignmentHorizontal, @NotNull DivAlignmentVertical contentAlignmentVertical, @NotNull Uri imageUrl, boolean preloadRequired, @NotNull DivImageScale scale, @Nullable List<? extends Filter> filters, boolean isVectorCompatible) {
                return new Image(alpha, contentAlignmentHorizontal, contentAlignmentVertical, imageUrl, preloadRequired, scale, filters, isVectorCompatible);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Double.compare(this.alpha, image.alpha) == 0 && this.contentAlignmentHorizontal == image.contentAlignmentHorizontal && this.contentAlignmentVertical == image.contentAlignmentVertical && Intrinsics.areEqual(this.imageUrl, image.imageUrl) && this.preloadRequired == image.preloadRequired && this.scale == image.scale && Intrinsics.areEqual(this.filters, image.filters) && this.isVectorCompatible == image.isVectorCompatible;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((((((Double.hashCode(this.alpha) * 31) + this.contentAlignmentHorizontal.hashCode()) * 31) + this.contentAlignmentVertical.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
                boolean z = this.preloadRequired;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int hashCode2 = (((hashCode + i) * 31) + this.scale.hashCode()) * 31;
                List<Filter> list = this.filters;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                boolean z2 = this.isVectorCompatible;
                return hashCode3 + (z2 ? 1 : z2 ? 1 : 0);
            }

            @NotNull
            public String toString() {
                return "Image(alpha=" + this.alpha + ", contentAlignmentHorizontal=" + this.contentAlignmentHorizontal + ", contentAlignmentVertical=" + this.contentAlignmentVertical + ", imageUrl=" + this.imageUrl + ", preloadRequired=" + this.preloadRequired + ", scale=" + this.scale + ", filters=" + this.filters + ", isVectorCompatible=" + this.isVectorCompatible + ')';
            }

            public final double getAlpha() {
                return this.alpha;
            }

            @NotNull
            public final DivAlignmentHorizontal getContentAlignmentHorizontal() {
                return this.contentAlignmentHorizontal;
            }

            @NotNull
            public final DivAlignmentVertical getContentAlignmentVertical() {
                return this.contentAlignmentVertical;
            }

            @NotNull
            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            public final boolean getPreloadRequired() {
                return this.preloadRequired;
            }

            @NotNull
            public final DivImageScale getScale() {
                return this.scale;
            }

            @Nullable
            public final List<Filter> getFilters() {
                return this.filters;
            }

            public final boolean isVectorCompatible() {
                return this.isVectorCompatible;
            }

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "", "()V", "toDiv", "Lcom/yandex/div2/DivFilter;", "Blur", "RtlMirror", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$Blur;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$RtlMirror;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static abstract class Filter {
                public /* synthetic */ Filter(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$Blur;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "radius", "", "div", "Lcom/yandex/div2/DivFilter$Blur;", "(ILcom/yandex/div2/DivFilter$Blur;)V", "getDiv", "()Lcom/yandex/div2/DivFilter$Blur;", "getRadius", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class Blur extends Filter {

                    @NotNull
                    private final DivFilter.Blur div;
                    private final int radius;

                    public static /* synthetic */ Blur copy$default(Blur blur, int i, DivFilter.Blur blur2, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            i = blur.radius;
                        }
                        if ((i2 & 2) != 0) {
                            blur2 = blur.div;
                        }
                        return blur.copy(i, blur2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final int getRadius() {
                        return this.radius;
                    }

                    @NotNull
                    /* renamed from: component2, reason: from getter */
                    public final DivFilter.Blur getDiv() {
                        return this.div;
                    }

                    @NotNull
                    public final Blur copy(int radius, @NotNull DivFilter.Blur div) {
                        return new Blur(radius, div);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Blur)) {
                            return false;
                        }
                        Blur blur = (Blur) other;
                        return this.radius == blur.radius && Intrinsics.areEqual(this.div, blur.div);
                    }

                    public int hashCode() {
                        return (Integer.hashCode(this.radius) * 31) + this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Blur(radius=" + this.radius + ", div=" + this.div + ')';
                    }

                    public Blur(int i, @NotNull DivFilter.Blur blur) {
                        super(null);
                        this.radius = i;
                        this.div = blur;
                    }

                    @NotNull
                    public final DivFilter.Blur getDiv() {
                        return this.div;
                    }

                    public final int getRadius() {
                        return this.radius;
                    }
                }

                private Filter() {
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$RtlMirror;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "div", "Lcom/yandex/div2/DivFilter$RtlMirror;", "(Lcom/yandex/div2/DivFilter$RtlMirror;)V", "getDiv", "()Lcom/yandex/div2/DivFilter$RtlMirror;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final /* data */ class RtlMirror extends Filter {

                    @NotNull
                    private final DivFilter.RtlMirror div;

                    public static /* synthetic */ RtlMirror copy$default(RtlMirror rtlMirror, DivFilter.RtlMirror rtlMirror2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            rtlMirror2 = rtlMirror.div;
                        }
                        return rtlMirror.copy(rtlMirror2);
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final DivFilter.RtlMirror getDiv() {
                        return this.div;
                    }

                    @NotNull
                    public final RtlMirror copy(@NotNull DivFilter.RtlMirror div) {
                        return new RtlMirror(div);
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof RtlMirror) && Intrinsics.areEqual(this.div, ((RtlMirror) other).div);
                    }

                    public int hashCode() {
                        return this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "RtlMirror(div=" + this.div + ')';
                    }

                    public RtlMirror(@NotNull DivFilter.RtlMirror rtlMirror) {
                        super(null);
                        this.div = rtlMirror;
                    }

                    @NotNull
                    public final DivFilter.RtlMirror getDiv() {
                        return this.div;
                    }
                }

                @NotNull
                public final DivFilter toDiv() {
                    if (this instanceof Blur) {
                        return ((Blur) this).getDiv();
                    }
                    if (this instanceof RtlMirror) {
                        return ((RtlMirror) this).getDiv();
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Image(double d, @NotNull DivAlignmentHorizontal divAlignmentHorizontal, @NotNull DivAlignmentVertical divAlignmentVertical, @NotNull Uri uri, boolean z, @NotNull DivImageScale divImageScale, @Nullable List<? extends Filter> list, boolean z2) {
                super(null);
                this.alpha = d;
                this.contentAlignmentHorizontal = divAlignmentHorizontal;
                this.contentAlignmentVertical = divAlignmentVertical;
                this.imageUrl = uri;
                this.preloadRequired = z;
                this.scale = divImageScale;
                this.filters = list;
                this.isVectorCompatible = z2;
            }

            @NotNull
            public final Drawable getDivImageBackground(@NotNull final BindingContext context, @NotNull final View target, @NotNull DivImageLoader imageLoader) {
                final ScalingDrawable scalingDrawable = new ScalingDrawable();
                scalingDrawable.setAlpha((int) (this.alpha * 255));
                scalingDrawable.setCustomScaleType(toScaleType(this.scale));
                scalingDrawable.setAlignmentHorizontal(toHorizontalAlignment(this.contentAlignmentHorizontal, ViewsKt.isLayoutRtl(target)));
                scalingDrawable.setAlignmentVertical(toVerticalAlignment(this.contentAlignmentVertical));
                String uri = this.imageUrl.toString();
                final Div2View divView = context.getDivView();
                context.getDivView().addLoadReference(imageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        ArrayList arrayList;
                        View view = target;
                        BindingContext bindingContext = context;
                        Bitmap bitmap = cachedBitmap.getBitmap();
                        List<DivBackgroundBinder.DivBackgroundState.Image.Filter> filters = this.getFilters();
                        if (filters != null) {
                            List<DivBackgroundBinder.DivBackgroundState.Image.Filter> list = filters;
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((DivBackgroundBinder.DivBackgroundState.Image.Filter) it.next()).toDiv());
                            }
                        } else {
                            arrayList = null;
                        }
                        final ScalingDrawable scalingDrawable2 = scalingDrawable;
                        BaseDivViewExtensionsKt.applyBitmapFilters(view, bindingContext, bitmap, arrayList, new Function1() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Bitmap) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Bitmap bitmap2) {
                                ScalingDrawable.this.setBitmap(bitmap2);
                            }
                        });
                    }

                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                        if (!this.isVectorCompatible()) {
                            onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, this.getImageUrl(), null, 2, null));
                        } else {
                            scalingDrawable.setPicture(pictureDrawable.getPicture());
                        }
                    }
                }), target);
                return scalingDrawable;
            }

            private final ScalingDrawable.ScaleType toScaleType(DivImageScale divImageScale) {
                int i = WhenMappings.$EnumSwitchMapping$0[divImageScale.ordinal()];
                if (i == 1) {
                    return ScalingDrawable.ScaleType.FILL;
                }
                if (i == 2) {
                    return ScalingDrawable.ScaleType.FIT;
                }
                if (i == 3) {
                    return ScalingDrawable.ScaleType.STRETCH;
                }
                return ScalingDrawable.ScaleType.NO_SCALE;
            }

            private final ScalingDrawable.AlignmentHorizontal toHorizontalAlignment(DivAlignmentHorizontal divAlignmentHorizontal, boolean z) {
                int i = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
                if (i == 1) {
                    return ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i == 2) {
                    return ScalingDrawable.AlignmentHorizontal.CENTER;
                }
                if (i == 3) {
                    return ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                if (i == 4) {
                    return z ? ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i == 5) {
                    return z ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                throw new NoWhenBranchMatchedException();
            }

            private final ScalingDrawable.AlignmentVertical toVerticalAlignment(DivAlignmentVertical divAlignmentVertical) {
                int i = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
                if (i == 1) {
                    return ScalingDrawable.AlignmentVertical.CENTER;
                }
                if (i == 2) {
                    return ScalingDrawable.AlignmentVertical.BOTTOM;
                }
                return ScalingDrawable.AlignmentVertical.TOP;
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Solid;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "color", "", "(I)V", "getColor", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Solid extends DivBackgroundState {
            private final int color;

            public static /* synthetic */ Solid copy$default(Solid solid, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = solid.color;
                }
                return solid.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getColor() {
                return this.color;
            }

            @NotNull
            public final Solid copy(int color) {
                return new Solid(color);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Solid) && this.color == ((Solid) other).color;
            }

            public int hashCode() {
                return Integer.hashCode(this.color);
            }

            @NotNull
            public String toString() {
                return "Solid(color=" + this.color + ')';
            }

            public final int getColor() {
                return this.color;
            }

            public Solid(int i) {
                super(null);
                this.color = i;
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$NinePatch;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", UnifiedMediationParams.KEY_IMAGE_URL, "Landroid/net/Uri;", "insets", "Landroid/graphics/Rect;", "(Landroid/net/Uri;Landroid/graphics/Rect;)V", "getImageUrl", "()Landroid/net/Uri;", "getInsets", "()Landroid/graphics/Rect;", "component1", "component2", "copy", "equals", "", "other", "", "getNinePatchDrawable", "Landroid/graphics/drawable/Drawable;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "target", "Landroid/view/View;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "hashCode", "", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NinePatch extends DivBackgroundState {

            @NotNull
            private final Uri imageUrl;

            @NotNull
            private final Rect insets;

            public static /* synthetic */ NinePatch copy$default(NinePatch ninePatch, Uri uri, Rect rect, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = ninePatch.imageUrl;
                }
                if ((i & 2) != 0) {
                    rect = ninePatch.insets;
                }
                return ninePatch.copy(uri, rect);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Rect getInsets() {
                return this.insets;
            }

            @NotNull
            public final NinePatch copy(@NotNull Uri imageUrl, @NotNull Rect insets) {
                return new NinePatch(imageUrl, insets);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NinePatch)) {
                    return false;
                }
                NinePatch ninePatch = (NinePatch) other;
                return Intrinsics.areEqual(this.imageUrl, ninePatch.imageUrl) && Intrinsics.areEqual(this.insets, ninePatch.insets);
            }

            public int hashCode() {
                return (this.imageUrl.hashCode() * 31) + this.insets.hashCode();
            }

            @NotNull
            public String toString() {
                return "NinePatch(imageUrl=" + this.imageUrl + ", insets=" + this.insets + ')';
            }

            @NotNull
            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            @NotNull
            public final Rect getInsets() {
                return this.insets;
            }

            public NinePatch(@NotNull Uri uri, @NotNull Rect rect) {
                super(null);
                this.imageUrl = uri;
                this.insets = rect;
            }

            @NotNull
            public final Drawable getNinePatchDrawable(@NotNull final Div2View divView, @NotNull View target, @NotNull DivImageLoader imageLoader) {
                final NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                divView.addLoadReference(imageLoader.loadImage(this.imageUrl.toString(), new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$NinePatch$getNinePatchDrawable$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        NinePatchDrawable ninePatchDrawable2 = ninePatchDrawable;
                        DivBackgroundBinder.DivBackgroundState.NinePatch ninePatch = this;
                        ninePatchDrawable2.setBottom(ninePatch.getInsets().bottom);
                        ninePatchDrawable2.setLeft(ninePatch.getInsets().left);
                        ninePatchDrawable2.setRight(ninePatch.getInsets().right);
                        ninePatchDrawable2.setTop(ninePatch.getInsets().top);
                        ninePatchDrawable2.setBitmap(cachedBitmap.getBitmap());
                    }
                }), target);
                return ninePatchDrawable;
            }
        }

        @NotNull
        public final Drawable toDrawable(@NotNull BindingContext context, @NotNull View target, @NotNull DivImageLoader imageLoader) {
            if (this instanceof Image) {
                return ((Image) this).getDivImageBackground(context, target, imageLoader);
            }
            if (this instanceof NinePatch) {
                return ((NinePatch) this).getNinePatchDrawable(context.getDivView(), target, imageLoader);
            }
            if (this instanceof Solid) {
                return new ColorDrawable(((Solid) this).getColor());
            }
            if (this instanceof LinearGradient) {
                return new LinearGradientDrawable(r4.getAngle(), ((LinearGradient) this).getColormap());
            }
            if (!(this instanceof RadialGradient)) {
                throw new NoWhenBranchMatchedException();
            }
            RadialGradient radialGradient = (RadialGradient) this;
            return new RadialGradientDrawable(radialGradient.getRadius().toRadialGradientDrawableRadius(), radialGradient.getCenterX().toRadialGradientDrawableCenter(), radialGradient.getCenterY().toRadialGradientDrawableCenter(), CollectionsKt.toIntArray(radialGradient.getColors()));
        }
    }
}
