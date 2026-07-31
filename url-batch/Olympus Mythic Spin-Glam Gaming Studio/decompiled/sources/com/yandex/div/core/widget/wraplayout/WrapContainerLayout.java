package com.yandex.div.core.widget.wraplayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.C4643f8;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.reporters.b;
import com.safedk.android.utils.h;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ShowSeparatorsMode;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.IntProgression;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WrapContainerLayout.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b,\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002¦\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020 H\u0002J\u0010\u0010m\u001a\u00020k2\u0006\u0010n\u001a\u00020 H\u0002J\u0018\u0010o\u001a\u00020k2\u0006\u0010p\u001a\u00020\u00102\u0006\u0010n\u001a\u00020 H\u0002J\u0010\u0010q\u001a\u00020k2\u0006\u0010l\u001a\u00020 H\u0002J\u0018\u0010r\u001a\u00020k2\u0006\u0010s\u001a\u00020\u00102\u0006\u0010t\u001a\u00020\u0010H\u0002J \u0010u\u001a\u00020k2\u0006\u0010v\u001a\u00020\u00102\u0006\u0010w\u001a\u00020\u00102\u0006\u0010x\u001a\u00020\u0010H\u0002J\u0010\u0010y\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0014J1\u0010|\u001a\u00020k2\u0006\u0010z\u001a\u00020{2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u0010H\u0002J2\u0010\u0081\u0001\u001a\u00020k2\u0006\u0010z\u001a\u00020{2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u0010H\u0002JE\u0010\u0081\u0001\u001a\u0004\u0018\u00010k2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010(2\u0006\u0010z\u001a\u00020{2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0003\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0002J\u0011\u0010\u0085\u0001\u001a\u00020k2\u0006\u0010z\u001a\u00020{H\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0010H\u0016J\u001b\u0010\u0087\u0001\u001a\u00020\u00102\u0007\u0010\u0088\u0001\u001a\u00020d2\u0007\u0010\u0089\u0001\u001a\u00020\u0010H\u0002J-\u0010\u008a\u0001\u001a\u00020\u00102\u0007\u0010\u008b\u0001\u001a\u00020\u00102\u0007\u0010\u008c\u0001\u001a\u00020\u00102\u0007\u0010\u008d\u0001\u001a\u00020\u00102\u0007\u0010\u008e\u0001\u001a\u00020$H\u0002J6\u0010\u008f\u0001\u001a\u00020\u00102\u0007\u0010\u008b\u0001\u001a\u00020\u00102\u0007\u0010\u0090\u0001\u001a\u00020\u00102\u0007\u0010\u008c\u0001\u001a\u00020\u00102\u0007\u0010\u008d\u0001\u001a\u00020\u00102\u0007\u0010\u0091\u0001\u001a\u00020\u0010H\u0002J\u001a\u0010\u0092\u0001\u001a\u00020\u00102\u0007\u0010\u0088\u0001\u001a\u00020d2\u0006\u0010n\u001a\u00020 H\u0002J6\u0010\u0093\u0001\u001a\u00020$2\u0007\u0010\u008b\u0001\u001a\u00020\u00102\u0007\u0010\u008d\u0001\u001a\u00020\u00102\u0007\u0010\u0094\u0001\u001a\u00020\u00102\u0007\u0010\u0095\u0001\u001a\u00020\u00102\u0007\u0010\u0096\u0001\u001a\u00020\u0010H\u0002J\u0019\u0010\u0097\u0001\u001a\u00020k2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0098\u0001\u001a\u00020k2\u0006\u0010~\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u0010H\u0002J3\u0010\u0099\u0001\u001a\u00020k2\u0007\u0010\u009a\u0001\u001a\u00020$2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u0010H\u0014J\u0019\u0010\u009b\u0001\u001a\u00020k2\u0006\u0010s\u001a\u00020\u00102\u0006\u0010t\u001a\u00020\u0010H\u0014J\u0010\u0010\u009c\u0001\u001a\u00020k2\u0007\u0010\u009d\u0001\u001a\u00020\u0010J(\u0010\u009e\u0001\u001a\u00020k2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u0010J\u0010\u0010\u009f\u0001\u001a\u00020k2\u0007\u0010\u009d\u0001\u001a\u00020\u0010J(\u0010 \u0001\u001a\u00020k2\u0006\u0010}\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020\u00102\u0007\u0010\u0080\u0001\u001a\u00020\u0010J\u0014\u0010¡\u0001\u001a\u00020$2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u0010H\u0002J\u0014\u0010¢\u0001\u001a\u00020$2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u0010H\u0002J\u0014\u0010£\u0001\u001a\u00020$2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u0010H\u0002J\u0014\u0010¤\u0001\u001a\u00020$2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u0010H\u0002J\u0014\u0010¥\u0001\u001a\u00020$2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u0010H\u0002R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0012R/\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0006\u001a\u0004\u0018\u00010(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000e\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0012R\u0012\u00101\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u00102\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020 07X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0012R\u000e\u0010:\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0012R\u0012\u0010=\u001a\u00060>R\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010?\u001a\u0004\u0018\u00010(2\b\u0010\u0006\u001a\u0004\u0018\u00010(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\u000e\u001a\u0004\b@\u0010+\"\u0004\bA\u0010-R\u0014\u0010C\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0012R\u0012\u0010E\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010F\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010G\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010H\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R1\u0010I\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00108F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bO\u0010\u000e\u0012\u0004\bJ\u0010K\u001a\u0004\bL\u0010\u0012\"\u0004\bM\u0010NR1\u0010P\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00108F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bT\u0010\u000e\u0012\u0004\bQ\u0010K\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010NR\u0014\u0010U\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0012R\u0014\u0010W\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0012R\u0014\u0010Y\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0012R\u000e\u0010[\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\\\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0012R*\u0010_\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b`\u0010K\u001a\u0004\ba\u0010\u0012\"\u0004\bb\u0010NR\u0018\u0010c\u001a\u00020$*\u00020d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0018\u0010g\u001a\u00020$*\u00020d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010fR\u001a\u0010h\u001a\u00020$*\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006§\u0001"}, d2 = {"Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "", "aspectRatio", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio$delegate", "Lkotlin/properties/ReadWriteProperty;", "betweenItemsSpacing", "", "getBetweenItemsSpacing", "()I", "betweenLinesSpacing", "getBetweenLinesSpacing", "childState", "edgeLineSeparatorOffset", "edgeLineSeparatorsLength", "getEdgeLineSeparatorsLength", "edgeSeparatorsLength", "getEdgeSeparatorsLength", "endLineSeparatorLength", "getEndLineSeparatorLength", "endSeparatorLength", "getEndSeparatorLength", "firstVisibleLine", "Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;", "getFirstVisibleLine", "()Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;", "isRowDirection", "", "itemSpacingPx", "largestMainSize", "getLargestMainSize", "Landroid/graphics/drawable/Drawable;", "lineSeparatorDrawable", "getLineSeparatorDrawable", "()Landroid/graphics/drawable/Drawable;", "setLineSeparatorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "lineSeparatorDrawable$delegate", "lineSeparatorLength", "getLineSeparatorLength", "lineSeparatorMarginBottom", "lineSeparatorMarginLeft", "lineSeparatorMarginRight", "lineSeparatorMarginTop", "lineSpacingPx", b.d, "", "middleLineSeparatorLength", "getMiddleLineSeparatorLength", "middleLineSeparatorOffset", "middleSeparatorLength", "getMiddleSeparatorLength", "offsetsHolder", "Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "separatorDrawable", "getSeparatorDrawable", "setSeparatorDrawable", "separatorDrawable$delegate", "separatorLength", "getSeparatorLength", "separatorMarginBottom", "separatorMarginLeft", "separatorMarginRight", "separatorMarginTop", "showLineSeparators", "getShowLineSeparators$annotations", "()V", "getShowLineSeparators", "setShowLineSeparators", "(I)V", "showLineSeparators$delegate", "showSeparators", "getShowSeparators$annotations", "getShowSeparators", "setShowSeparators", "showSeparators$delegate", "startLineSeparatorLength", "getStartLineSeparatorLength", "startSeparatorLength", "getStartSeparatorLength", "sumOfCrossSize", "getSumOfCrossSize", "tempSumCrossSize", "visibleLinesCount", "getVisibleLinesCount", "value", "wrapDirection", "getWrapDirection$annotations", "getWrapDirection", "setWrapDirection", "hasIncorrectSize", "Landroid/view/View;", "getHasIncorrectSize", "(Landroid/view/View;)Z", "isHidden", "isIncorrectForCrossAxis", "(Ljava/lang/Integer;)Z", "addEdgeSpace", "", "spaceLine", "addLine", "line", "addLineIfNeeded", "childIndex", "addSpaceBetweenLines", "calculateLines", "widthMeasureSpec", "heightMeasureSpec", "determineCrossSize", "measureSpec", "crossAlignment", "paddingAlongCrossAxis", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawLineSeparator", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "drawSeparator", "separator", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;IIII)Lkotlin/Unit;", "drawSeparatorsHorizontal", "drawSeparatorsVertical", "getBaseline", "getLeftOffsetForVerticalLayout", "view", "lineWidth", "getSize", X3.a.t, "size", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "isCrossAxis", "getState", "state", "tooSmallState", "getTopOffsetForHorizontalLayout", "isWrapRequired", "currentLength", "childLength", "lineItemsCount", "layoutHorizontal", "layoutVertical", "onLayout", "changed", "onMeasure", "setItemSpacing", "px", "setLineSeparatorMargins", "setLineSpacing", "setSeparatorMargins", "showLeftSeparator", "showRightSeparator", "showSeparatorAtEnd", "showSeparatorAtStart", "showSeparatorBetween", "WrapLine", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class WrapContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WrapContainerLayout.class, "showSeparators", "getShowSeparators()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WrapContainerLayout.class, "showLineSeparators", "getShowLineSeparators()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WrapContainerLayout.class, "separatorDrawable", "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WrapContainerLayout.class, "lineSeparatorDrawable", "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WrapContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0))};

    /* renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty aspectRatio;
    private int childState;
    private int edgeLineSeparatorOffset;
    private boolean isRowDirection;

    @Px
    private int itemSpacingPx;

    /* renamed from: lineSeparatorDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty lineSeparatorDrawable;

    @Px
    private int lineSeparatorMarginBottom;

    @Px
    private int lineSeparatorMarginLeft;

    @Px
    private int lineSeparatorMarginRight;

    @Px
    private int lineSeparatorMarginTop;

    @Px
    private int lineSpacingPx;

    @NotNull
    private final List<WrapLine> lines;
    private int middleLineSeparatorOffset;

    @NotNull
    private final DivViewGroup.OffsetsHolder offsetsHolder;

    /* renamed from: separatorDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty separatorDrawable;

    @Px
    private int separatorMarginBottom;

    @Px
    private int separatorMarginLeft;

    @Px
    private int separatorMarginRight;

    @Px
    private int separatorMarginTop;

    /* renamed from: showLineSeparators$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty showLineSeparators;

    /* renamed from: showSeparators$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty showSeparators;
    private int tempSumCrossSize;
    private int wrapDirection;

    @ShowSeparatorsMode
    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    @ShowSeparatorsMode
    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }

    private final boolean showSeparatorAtEnd(@ShowSeparatorsMode int mode) {
        return (mode & 4) != 0;
    }

    private final boolean showSeparatorAtStart(@ShowSeparatorsMode int mode) {
        return (mode & 1) != 0;
    }

    private final boolean showSeparatorBetween(@ShowSeparatorsMode int mode) {
        return (mode & 2) != 0;
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    public WrapContainerLayout(@NotNull Context context) {
        super(context, null, 0, 6, null);
        this.showSeparators = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.showLineSeparators = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.separatorDrawable = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.lineSeparatorDrawable = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.isRowDirection = true;
        this.lines = new ArrayList();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, 0.0f, 0.0f, 0, 7, null);
        this.aspectRatio = AspectView.INSTANCE.aspectRatioProperty$div_release();
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    public final void setWrapDirection(int i) {
        if (this.wrapDirection != i) {
            this.wrapDirection = i;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Invalid value for the wrap direction is set: " + this.wrapDirection);
                }
                z = false;
            }
            this.isRowDirection = z;
            requestLayout();
        }
    }

    public final int getShowSeparators() {
        return ((Number) this.showSeparators.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final void setShowSeparators(int i) {
        this.showSeparators.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final int getShowLineSeparators() {
        return ((Number) this.showLineSeparators.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final void setShowLineSeparators(int i) {
        this.showLineSeparators.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    @Nullable
    public final Drawable getSeparatorDrawable() {
        return (Drawable) this.separatorDrawable.getValue(this, $$delegatedProperties[2]);
    }

    public final void setSeparatorDrawable(@Nullable Drawable drawable) {
        this.separatorDrawable.setValue(this, $$delegatedProperties[2], drawable);
    }

    @Nullable
    public final Drawable getLineSeparatorDrawable() {
        return (Drawable) this.lineSeparatorDrawable.getValue(this, $$delegatedProperties[3]);
    }

    public final void setLineSeparatorDrawable(@Nullable Drawable drawable) {
        this.lineSeparatorDrawable.setValue(this, $$delegatedProperties[3], drawable);
    }

    public final void setSeparatorMargins(int left, int top, int right, int bottom) {
        this.separatorMarginLeft = left;
        this.separatorMarginRight = right;
        this.separatorMarginTop = top;
        this.separatorMarginBottom = bottom;
        requestLayout();
    }

    public final void setLineSeparatorMargins(int left, int top, int right, int bottom) {
        this.lineSeparatorMarginLeft = left;
        this.lineSeparatorMarginRight = right;
        this.lineSeparatorMarginTop = top;
        this.lineSeparatorMarginBottom = bottom;
        requestLayout();
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i;
        if (this.isRowDirection) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.separatorMarginLeft;
            i = this.separatorMarginRight;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.separatorMarginTop;
            i = this.separatorMarginBottom;
        }
        return intrinsicHeight + i;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i;
        if (this.isRowDirection) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.lineSeparatorMarginTop;
            i = this.lineSeparatorMarginBottom;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.lineSeparatorMarginLeft;
            i = this.lineSeparatorMarginRight;
        }
        return intrinsicWidth + i;
    }

    private final int getLeftOffsetForVerticalLayout(View view, int lineWidth) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(DivViewGroup.INSTANCE.toHorizontalGravity(divLayoutParams.getGravity()), ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 1) {
            return (((lineWidth - view.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
        }
        if (absoluteGravity == 5) {
            return (lineWidth - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
        }
        return ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
    }

    private final int getTopOffsetForHorizontalLayout(View view, WrapLine line) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int verticalGravity = DivViewGroup.INSTANCE.toVerticalGravity(divLayoutParams.getGravity());
        if (verticalGravity == 16) {
            return (((line.getCrossSize() - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
        }
        if (verticalGravity != 80) {
            return divLayoutParams.getIsBaselineAligned() ? Math.max(line.getMaxBaseline() - view.getBaseline(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) : ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
        }
        return (line.getCrossSize() - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f) {
        this.aspectRatio.setValue(this, $$delegatedProperties[4], Float.valueOf(f));
    }

    public final void setItemSpacing(int px) {
        if (this.itemSpacingPx != px) {
            this.itemSpacingPx = px;
            requestLayout();
        }
    }

    public final void setLineSpacing(int px) {
        if (this.lineSpacingPx != px) {
            this.lineSpacingPx = px;
            requestLayout();
        }
    }

    private final int getBetweenItemsSpacing() {
        return showSeparatorBetween(getShowSeparators()) ? getSeparatorLength() : this.itemSpacingPx;
    }

    private final int getBetweenLinesSpacing() {
        return showSeparatorBetween(getShowLineSeparators()) ? getLineSeparatorLength() : this.lineSpacingPx;
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int mode;
        int size;
        this.lines.clear();
        this.childState = 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        int i2 = 1073741824;
        if (getAspectRatio() != 0.0f && mode2 == 1073741824) {
            int roundToInt = MathKt.roundToInt(size2 / getAspectRatio());
            size = roundToInt;
            i = View.MeasureSpec.makeMeasureSpec(roundToInt, 1073741824);
            mode = 1073741824;
        } else {
            i = heightMeasureSpec;
            mode = View.MeasureSpec.getMode(heightMeasureSpec);
            size = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        calculateLines(widthMeasureSpec, i);
        if (this.isRowDirection) {
            determineCrossSize(i, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            determineCrossSize(widthMeasureSpec, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.isRowDirection ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int sumOfCrossSize = this.isRowDirection ? getSumOfCrossSize() + getVerticalPaddings$div_release() : getLargestMainSize();
        this.childState = getState(mode2, this.childState, size2, largestMainSize, 16777216);
        int resolveSizeAndState = View.resolveSizeAndState(getSize(mode2, size2, largestMainSize, !this.isRowDirection), widthMeasureSpec, this.childState);
        if (!this.isRowDirection || getAspectRatio() == 0.0f || mode2 == 1073741824) {
            i2 = mode;
        } else {
            size = MathKt.roundToInt((16777215 & resolveSizeAndState) / getAspectRatio());
            i = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        this.childState = getState(i2, this.childState, size, sumOfCrossSize, 256);
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(getSize(i2, size, sumOfCrossSize, this.isRowDirection), i, this.childState));
    }

    private final void calculateLines(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int edgeSeparatorsLength;
        int i2;
        int i3;
        this.tempSumCrossSize = getEdgeLineSeparatorsLength();
        int i4 = this.isRowDirection ? widthMeasureSpec : heightMeasureSpec;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int edgeSeparatorsLength2 = getEdgeSeparatorsLength() + (this.isRowDirection ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        WrapLine wrapLine = new WrapLine(0, edgeSeparatorsLength2, 0, 5, null);
        WrapLine wrapLine2 = wrapLine;
        int i5 = 0;
        int i6 = Integer.MIN_VALUE;
        for (Object obj : ViewGroupKt.getChildren(this)) {
            int i7 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            if (!isHidden(view)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int horizontalPaddings$div_release = getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release();
                int verticalPaddings$div_release = getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    i = horizontalPaddings$div_release + getEdgeSeparatorsLength();
                    edgeSeparatorsLength = this.tempSumCrossSize;
                } else {
                    i = horizontalPaddings$div_release + this.tempSumCrossSize;
                    edgeSeparatorsLength = getEdgeSeparatorsLength();
                }
                int i8 = verticalPaddings$div_release + edgeSeparatorsLength;
                int i9 = i;
                DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                view.measure(companion.getChildMeasureSpec(widthMeasureSpec, i9, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(heightMeasureSpec, i8, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
                this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                int measuredWidth = view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release();
                int measuredHeight = view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release();
                if (this.isRowDirection) {
                    i3 = measuredWidth;
                    i2 = measuredHeight;
                } else {
                    i2 = measuredWidth;
                    i3 = measuredHeight;
                }
                int i10 = i2;
                if (isWrapRequired(mode, size, wrapLine2.getMainSize(), i3, wrapLine2.getItemCount())) {
                    if (wrapLine2.getItemCountNotGone() > 0) {
                        addLine(wrapLine2);
                    }
                    wrapLine2 = new WrapLine(i5, edgeSeparatorsLength2, 1);
                    i6 = Integer.MIN_VALUE;
                } else {
                    if (wrapLine2.getItemCount() > 0) {
                        wrapLine2.setMainSize(wrapLine2.getMainSize() + getBetweenItemsSpacing());
                    }
                    wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                }
                if (this.isRowDirection && divLayoutParams.getIsBaselineAligned()) {
                    wrapLine2.setMaxBaseline(Math.max(wrapLine2.getMaxBaseline(), view.getBaseline() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin));
                    wrapLine2.setMaxHeightUnderBaseline(Math.max(wrapLine2.getMaxHeightUnderBaseline(), (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) - view.getBaseline()));
                }
                wrapLine2.setMainSize(wrapLine2.getMainSize() + i3);
                i6 = Math.max(i6, i10);
                wrapLine2.setCrossSize(Math.max(wrapLine2.getCrossSize(), i6));
                addLineIfNeeded(i5, wrapLine2);
            } else {
                wrapLine2.setGoneItemCount(wrapLine2.getGoneItemCount() + 1);
                wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                addLineIfNeeded(i5, wrapLine2);
            }
            i5 = i7;
        }
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getStartSeparatorLength() {
        if (showSeparatorAtStart(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (showSeparatorBetween(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (showSeparatorAtEnd(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getStartLineSeparatorLength() {
        if (showSeparatorAtStart(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleLineSeparatorLength() {
        if (showSeparatorBetween(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndLineSeparatorLength() {
        if (showSeparatorAtEnd(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final boolean isHidden(View view) {
        return view.getVisibility() == 8 || getHasIncorrectSize(view);
    }

    private final boolean getHasIncorrectSize(View view) {
        if (this.isRowDirection) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return isIncorrectForCrossAxis(layoutParams != null ? Integer.valueOf(layoutParams.height) : null);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return isIncorrectForCrossAxis(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
    }

    private final boolean isIncorrectForCrossAxis(Integer num) {
        return num != null && num.intValue() == -1;
    }

    private final void addLineIfNeeded(int childIndex, WrapLine line) {
        if (childIndex != getChildCount() - 1 || line.getItemCountNotGone() == 0) {
            return;
        }
        addLine(line);
    }

    private final void addLine(WrapLine line) {
        this.lines.add(line);
        if (line.getMaxBaseline() > 0) {
            line.setCrossSize(Math.max(line.getCrossSize(), line.getMaxBaseline() + line.getMaxHeightUnderBaseline()));
        }
        this.tempSumCrossSize += line.getCrossSize();
    }

    private final boolean isWrapRequired(int mode, int maxSize, int currentLength, int childLength, int lineItemsCount) {
        return mode != 0 && maxSize < (currentLength + childLength) + (lineItemsCount != 0 ? getBetweenItemsSpacing() : 0);
    }

    private final void determineCrossSize(int measureSpec, int crossAlignment, int paddingAlongCrossAxis) {
        this.middleLineSeparatorOffset = 0;
        this.edgeLineSeparatorOffset = 0;
        if (this.lines.size() != 0 && View.MeasureSpec.getMode(measureSpec) == 1073741824) {
            int size = View.MeasureSpec.getSize(measureSpec);
            if (this.lines.size() == 1) {
                this.lines.get(0).setCrossSize(size - paddingAlongCrossAxis);
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + paddingAlongCrossAxis;
            if (crossAlignment != 1) {
                if (crossAlignment != 5) {
                    if (crossAlignment != 16) {
                        if (crossAlignment != 80) {
                            if (crossAlignment != 16777216) {
                                if (crossAlignment != 33554432) {
                                    if (crossAlignment != 67108864) {
                                        if (crossAlignment != 268435456) {
                                            if (crossAlignment != 536870912) {
                                                if (crossAlignment != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    WrapLine wrapLine = new WrapLine(0, 0, 0, 7, null);
                                    int roundToInt = MathKt.roundToInt(DivViewGroup.INSTANCE.getSpaceEvenlyPart$div_release(sumOfCrossSize, this.lines.size()));
                                    wrapLine.setCrossSize(roundToInt);
                                    int i = roundToInt / 2;
                                    this.middleLineSeparatorOffset = i;
                                    this.edgeLineSeparatorOffset = i;
                                    addSpaceBetweenLines(wrapLine);
                                    addEdgeSpace(wrapLine);
                                    return;
                                }
                                WrapLine wrapLine2 = new WrapLine(0, 0, 0, 7, null);
                                int roundToInt2 = MathKt.roundToInt(DivViewGroup.INSTANCE.getSpaceBetweenPart$div_release(sumOfCrossSize, this.lines.size()));
                                wrapLine2.setCrossSize(roundToInt2);
                                this.middleLineSeparatorOffset = roundToInt2 / 2;
                                addSpaceBetweenLines(wrapLine2);
                                return;
                            }
                            WrapLine wrapLine3 = new WrapLine(0, 0, 0, 7, null);
                            int roundToInt3 = MathKt.roundToInt(DivViewGroup.INSTANCE.getSpaceAroundPart$div_release(sumOfCrossSize, this.lines.size()));
                            wrapLine3.setCrossSize(roundToInt3);
                            this.middleLineSeparatorOffset = roundToInt3;
                            this.edgeLineSeparatorOffset = roundToInt3 / 2;
                            for (int i2 = 0; i2 < this.lines.size(); i2 += 3) {
                                this.lines.add(i2, wrapLine3);
                                this.lines.add(i2 + 2, wrapLine3);
                            }
                            return;
                        }
                    }
                }
                WrapLine wrapLine4 = new WrapLine(0, 0, 0, 7, null);
                wrapLine4.setCrossSize(sumOfCrossSize);
                this.lines.add(0, wrapLine4);
                return;
            }
            WrapLine wrapLine5 = new WrapLine(0, 0, 0, 7, null);
            wrapLine5.setCrossSize(sumOfCrossSize / 2);
            addEdgeSpace(wrapLine5);
        }
    }

    private final void addEdgeSpace(WrapLine spaceLine) {
        this.lines.add(0, spaceLine);
        this.lines.add(spaceLine);
    }

    private final void addSpaceBetweenLines(WrapLine spaceLine) {
        for (int i = 1; i < this.lines.size(); i += 2) {
            this.lines.add(i, spaceLine);
        }
    }

    private final int getSize(int mode, int size, int maxSize, boolean isCrossAxis) {
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalStateException("Unknown size mode is set: " + mode);
            }
        } else {
            if (isCrossAxis) {
                return Math.min(size, maxSize);
            }
            if (maxSize > size || getVisibleLinesCount() > 1) {
                return size;
            }
        }
        return maxSize;
    }

    private final int getVisibleLinesCount() {
        List<WrapLine> list = this.lines;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((WrapLine) it.next()).getItemCountNotGone() > 0 && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    private final int getState(int mode, int state, int size, int maxSize, int tooSmallState) {
        return (mode != 0 && size < maxSize) ? View.combineMeasuredStates(state, tooSmallState) : state;
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.lines.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((WrapLine) it.next()).getMainSize());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((WrapLine) it.next()).getMainSize());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.lines.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((WrapLine) it.next()).getCrossSize();
        }
        return i + getEdgeLineSeparatorsLength() + (getBetweenLinesSpacing() * (getVisibleLinesCount() - 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.isRowDirection) {
            layoutHorizontal(left, right);
        } else {
            layoutVertical(top, bottom);
        }
    }

    private final void layoutHorizontal(int left, int right) {
        int paddingTop = getPaddingTop() + getStartLineSeparatorLength();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(getHorizontalGravity$div_release(), ViewCompat.getLayoutDirection(this));
        boolean z = false;
        for (WrapLine wrapLine : this.lines) {
            float mainSize = (right - left) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, absoluteGravity, wrapLine.getItemCountNotGone());
            float paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndSeparatorLength() : getStartSeparatorLength()) + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z) {
                    paddingTop += getBetweenLinesSpacing();
                }
                z = true;
            }
            IntProgression indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                boolean z2 = false;
                while (true) {
                    View childAt = getChildAt(first);
                    if (childAt != null && !isHidden(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        float f = paddingLeft + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                        if (z2) {
                            f += getBetweenItemsSpacing();
                        }
                        int topOffsetForHorizontalLayout = getTopOffsetForHorizontalLayout(childAt, wrapLine) + paddingTop;
                        childAt.layout(MathKt.roundToInt(f), topOffsetForHorizontalLayout, MathKt.roundToInt(f) + childAt.getMeasuredWidth(), topOffsetForHorizontalLayout + childAt.getMeasuredHeight());
                        paddingLeft = f + childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + wrapLine.getSpaceBetweenChildren();
                        z2 = true;
                    } else if (getHasIncorrectSize(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                    if (first != last) {
                        first += step;
                    }
                }
            }
            paddingTop += wrapLine.getCrossSize();
            wrapLine.setRight(MathKt.roundToInt(paddingLeft));
            wrapLine.setBottom(paddingTop);
        }
    }

    private final void layoutVertical(int top, int bottom) {
        int paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
        Iterator it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((IntIterator) it).nextInt());
            float mainSize = (bottom - top) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, getVerticalGravity$div_release(), wrapLine.getItemCountNotGone());
            float paddingTop = getPaddingTop() + getStartSeparatorLength() + offsetsHolder.getFirstChildOffset();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z) {
                    paddingLeft += getBetweenLinesSpacing();
                }
                z = true;
            }
            int itemCount = wrapLine.getItemCount();
            boolean z2 = false;
            for (int i = 0; i < itemCount; i++) {
                View childAt = getChildAt(wrapLine.getFirstIndex() + i);
                if (childAt != null && !isHidden(childAt)) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    float f = paddingTop + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                    if (z2) {
                        f += getBetweenItemsSpacing();
                    }
                    int leftOffsetForVerticalLayout = getLeftOffsetForVerticalLayout(childAt, wrapLine.getCrossSize()) + paddingLeft;
                    childAt.layout(leftOffsetForVerticalLayout, MathKt.roundToInt(f), childAt.getMeasuredWidth() + leftOffsetForVerticalLayout, MathKt.roundToInt(f) + childAt.getMeasuredHeight());
                    paddingTop = f + childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + wrapLine.getSpaceBetweenChildren();
                    z2 = true;
                } else if (getHasIncorrectSize(childAt)) {
                    childAt.layout(0, 0, 0, 0);
                }
            }
            paddingLeft += wrapLine.getCrossSize();
            wrapLine.setRight(paddingLeft);
            wrapLine.setBottom(MathKt.roundToInt(paddingTop));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getSeparatorDrawable() == null && getLineSeparatorDrawable() == null) {
            return;
        }
        if (getShowSeparators() == 0 && getShowLineSeparators() == 0) {
            return;
        }
        if (this.isRowDirection) {
            drawSeparatorsHorizontal(canvas);
        } else {
            drawSeparatorsVertical(canvas);
        }
    }

    private final void drawSeparatorsHorizontal(Canvas canvas) {
        int i;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showSeparatorAtStart(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int bottom = firstVisibleLine != null ? firstVisibleLine.getBottom() - firstVisibleLine.getCrossSize() : 0;
            ref$IntRef.element = bottom;
            drawSeparatorsHorizontal$drawLineSeparator(this, canvas, bottom - this.edgeLineSeparatorOffset);
        }
        boolean z = false;
        for (WrapLine wrapLine : this.lines) {
            if (wrapLine.getItemCountNotGone() != 0) {
                int bottom2 = wrapLine.getBottom();
                ref$IntRef2.element = bottom2;
                ref$IntRef.element = bottom2 - wrapLine.getCrossSize();
                if (z && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                IntProgression indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
                int first = indices.getFirst();
                int last = indices.getLast();
                int step = indices.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    i = 0;
                    boolean z2 = true;
                    while (true) {
                        View childAt = getChildAt(first);
                        if (childAt != null && !isHidden(childAt)) {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                            i = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + childAt.getRight();
                            if (z2) {
                                if (showLeftSeparator(getShowSeparators())) {
                                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - wrapLine.getEdgeSeparatorOffset());
                                }
                                z2 = false;
                            } else if (showSeparatorBetween(getShowSeparators())) {
                                drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                            }
                        }
                        if (first == last) {
                            break;
                        } else {
                            first += step;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i > 0 && showRightSeparator(getShowSeparators())) {
                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, i + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
                z = true;
            }
        }
        if (ref$IntRef2.element <= 0 || !showSeparatorAtEnd(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsHorizontal$drawLineSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i) {
        wrapContainerLayout.drawLineSeparator(canvas, wrapContainerLayout.getPaddingLeft(), i - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getWidth() - wrapContainerLayout.getPaddingRight(), i);
    }

    private static final void drawSeparatorsHorizontal$lambda$12$drawSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i) {
        wrapContainerLayout.drawSeparator(canvas, i - wrapContainerLayout.getSeparatorLength(), ref$IntRef.element, i, ref$IntRef2.element);
    }

    private final void drawSeparatorsVertical(Canvas canvas) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showLeftSeparator(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int right = firstVisibleLine != null ? firstVisibleLine.getRight() - firstVisibleLine.getCrossSize() : 0;
            ref$IntRef.element = right;
            drawSeparatorsVertical$drawLineSeparator$13(this, canvas, right - this.edgeLineSeparatorOffset);
        }
        Iterator it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((IntIterator) it).nextInt());
            if (wrapLine.getItemCountNotGone() != 0) {
                int right2 = wrapLine.getRight();
                ref$IntRef2.element = right2;
                ref$IntRef.element = right2 - wrapLine.getCrossSize();
                if (z && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                boolean z2 = true;
                z = getLineSeparatorDrawable() != null;
                int itemCount = wrapLine.getItemCount();
                int i = 0;
                for (int i2 = 0; i2 < itemCount; i2++) {
                    View childAt = getChildAt(wrapLine.getFirstIndex() + i2);
                    if (childAt != null && !isHidden(childAt)) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                        i = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + childAt.getBottom();
                        if (z2) {
                            if (showSeparatorAtStart(getShowSeparators())) {
                                drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top - wrapLine.getEdgeSeparatorOffset());
                            }
                            z2 = false;
                        } else if (showSeparatorBetween(getShowSeparators())) {
                            drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                        }
                    }
                }
                if (i > 0 && showSeparatorAtEnd(getShowSeparators())) {
                    drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, i + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
            }
        }
        if (ref$IntRef2.element <= 0 || !showRightSeparator(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsVertical$drawLineSeparator$13(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i) {
        wrapContainerLayout.drawLineSeparator(canvas, i - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getPaddingTop(), i, wrapContainerLayout.getHeight() - wrapContainerLayout.getPaddingBottom());
    }

    private static final void drawSeparatorsVertical$lambda$16$drawSeparator$15(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i) {
        wrapContainerLayout.drawSeparator(canvas, ref$IntRef.element, i - wrapContainerLayout.getSeparatorLength(), ref$IntRef2.element, i);
    }

    private final void drawSeparator(Canvas canvas, int left, int top, int right, int bottom) {
        drawSeparator(getSeparatorDrawable(), canvas, left + this.separatorMarginLeft, top - this.separatorMarginTop, right - this.separatorMarginRight, bottom + this.separatorMarginBottom);
    }

    private final void drawLineSeparator(Canvas canvas, int left, int top, int right, int bottom) {
        drawSeparator(getLineSeparatorDrawable(), canvas, left + this.lineSeparatorMarginLeft, top - this.lineSeparatorMarginTop, right - this.lineSeparatorMarginRight, bottom + this.lineSeparatorMarginBottom);
    }

    private final Unit drawSeparator(Drawable separator, Canvas canvas, int left, int top, int right, int bottom) {
        if (separator == null) {
            return null;
        }
        float f = (left + right) / 2.0f;
        float f2 = (top + bottom) / 2.0f;
        float intrinsicWidth = separator.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = separator.getIntrinsicHeight() / 2.0f;
        separator.setBounds((int) (f - intrinsicWidth), (int) (f2 - intrinsicHeight), (int) (f + intrinsicWidth), (int) (f2 + intrinsicHeight));
        separator.draw(canvas);
        return Unit.INSTANCE;
    }

    private final boolean showLeftSeparator(@ShowSeparatorsMode int mode) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtEnd(mode) : showSeparatorAtStart(mode);
    }

    private final boolean showRightSeparator(@ShowSeparatorsMode int mode) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtStart(mode) : showSeparatorAtEnd(mode);
    }

    private final WrapLine getFirstVisibleLine() {
        Object obj = null;
        if (!this.isRowDirection && com.yandex.div.core.util.ViewsKt.isLayoutRtl(this)) {
            List<WrapLine> list = this.lines;
            ListIterator<WrapLine> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2 = listIterator.previous();
                if (((WrapLine) r2).isVisible()) {
                    obj = r2;
                    break;
                }
            }
        } else {
            for (Object obj2 : this.lines) {
                if (((WrapLine) obj2).isVisible()) {
                    obj = obj2;
                    break;
                }
            }
        }
        return (WrapLine) obj;
    }

    @Override // android.view.View
    public int getBaseline() {
        WrapLine firstVisibleLine = getFirstVisibleLine();
        return firstVisibleLine != null ? firstVisibleLine.getMaxBaseline() + getPaddingTop() : super.getBaseline();
    }

    /* compiled from: WrapContainerLayout.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J'\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010\u000bR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00067"}, d2 = {"Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$WrapLine;", "", "firstIndex", "", "mainSize", "itemCount", "(III)V", "bottom", "getBottom", "()I", "setBottom", "(I)V", "crossSize", "getCrossSize", "setCrossSize", "edgeSeparatorOffset", "getEdgeSeparatorOffset", "setEdgeSeparatorOffset", "getFirstIndex", "goneItemCount", "getGoneItemCount", "setGoneItemCount", C4643f8.k, "", "()Z", "getItemCount", "setItemCount", "itemCountNotGone", "getItemCountNotGone", "getMainSize", "setMainSize", "maxBaseline", "getMaxBaseline", "setMaxBaseline", "maxHeightUnderBaseline", "getMaxHeightUnderBaseline", "setMaxHeightUnderBaseline", "right", "getRight", "setRight", "spaceBetweenChildren", "", "getSpaceBetweenChildren", "()F", "setSpaceBetweenChildren", "(F)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class WrapLine {
        private int bottom;
        private int crossSize;
        private int edgeSeparatorOffset;
        private final int firstIndex;
        private int goneItemCount;
        private int itemCount;
        private int mainSize;
        private int maxBaseline;
        private int maxHeightUnderBaseline;
        private int right;
        private float spaceBetweenChildren;

        public WrapLine() {
            this(0, 0, 0, 7, null);
        }

        public static /* synthetic */ WrapLine copy$default(WrapLine wrapLine, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = wrapLine.firstIndex;
            }
            if ((i4 & 2) != 0) {
                i2 = wrapLine.mainSize;
            }
            if ((i4 & 4) != 0) {
                i3 = wrapLine.itemCount;
            }
            return wrapLine.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getFirstIndex() {
            return this.firstIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMainSize() {
            return this.mainSize;
        }

        /* renamed from: component3, reason: from getter */
        public final int getItemCount() {
            return this.itemCount;
        }

        @NotNull
        public final WrapLine copy(int firstIndex, int mainSize, int itemCount) {
            return new WrapLine(firstIndex, mainSize, itemCount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WrapLine)) {
                return false;
            }
            WrapLine wrapLine = (WrapLine) other;
            return this.firstIndex == wrapLine.firstIndex && this.mainSize == wrapLine.mainSize && this.itemCount == wrapLine.itemCount;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.firstIndex) * 31) + Integer.hashCode(this.mainSize)) * 31) + Integer.hashCode(this.itemCount);
        }

        @NotNull
        public String toString() {
            return "WrapLine(firstIndex=" + this.firstIndex + ", mainSize=" + this.mainSize + ", itemCount=" + this.itemCount + ')';
        }

        public WrapLine(int i, int i2, int i3) {
            this.firstIndex = i;
            this.mainSize = i2;
            this.itemCount = i3;
            this.maxBaseline = -1;
        }

        public /* synthetic */ WrapLine(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }

        public final int getFirstIndex() {
            return this.firstIndex;
        }

        public final int getMainSize() {
            return this.mainSize;
        }

        public final void setMainSize(int i) {
            this.mainSize = i;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final void setItemCount(int i) {
            this.itemCount = i;
        }

        public final int getCrossSize() {
            return this.crossSize;
        }

        public final void setCrossSize(int i) {
            this.crossSize = i;
        }

        public final int getMaxBaseline() {
            return this.maxBaseline;
        }

        public final void setMaxBaseline(int i) {
            this.maxBaseline = i;
        }

        public final int getMaxHeightUnderBaseline() {
            return this.maxHeightUnderBaseline;
        }

        public final void setMaxHeightUnderBaseline(int i) {
            this.maxHeightUnderBaseline = i;
        }

        public final int getRight() {
            return this.right;
        }

        public final void setRight(int i) {
            this.right = i;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final void setBottom(int i) {
            this.bottom = i;
        }

        public final int getGoneItemCount() {
            return this.goneItemCount;
        }

        public final void setGoneItemCount(int i) {
            this.goneItemCount = i;
        }

        public final int getEdgeSeparatorOffset() {
            return this.edgeSeparatorOffset;
        }

        public final void setEdgeSeparatorOffset(int i) {
            this.edgeSeparatorOffset = i;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void setSpaceBetweenChildren(float f) {
            this.spaceBetweenChildren = f;
        }

        public final int getItemCountNotGone() {
            return this.itemCount - this.goneItemCount;
        }

        public final boolean isVisible() {
            return getItemCountNotGone() > 0;
        }
    }
}
