package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a'\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\n\u001a;\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u0004\u001a\u001b\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u001b\u0010\u001f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b \u0010\u0004\u001a#\u0010\u001f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b!\u0010\n\u001a\u001b\u0010\u001f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010\r\u001a'\u0010#\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b$\u0010\n\u001a'\u0010%\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b&\u0010\n\u001a;\u0010'\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b(\u0010\u001a\u001a\u0016\u0010)\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010*\u001a\u00020+H\u0007\u001a\u0016\u0010.\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010*\u001a\u00020+H\u0007\u001a\u0016\u00100\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010*\u001a\u00020+H\u0007\u001a \u00102\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206H\u0007\u001a \u0010:\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u00103\u001a\u00020;2\b\b\u0002\u00105\u001a\u000206H\u0007\u001a \u0010>\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u00103\u001a\u00020?2\b\b\u0002\u00105\u001a\u000206H\u0007\u001a'\u0010B\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\bC\u0010\n\"\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"width", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "height-3ABfNKs", "size", "size-3ABfNKs", "size-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "size-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "widthIn", "min", "max", "widthIn-VpY3zN4", "heightIn", "heightIn-VpY3zN4", "sizeIn", ViewProps.MIN_WIDTH, ViewProps.MIN_HEIGHT, ViewProps.MAX_WIDTH, ViewProps.MAX_HEIGHT, "sizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredHeight", "requiredHeight-3ABfNKs", "requiredSize", "requiredSize-3ABfNKs", "requiredSize-VpY3zN4", "requiredSize-6HolHcs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSizeIn", "requiredSizeIn-qDBjuR0", "fillMaxWidth", "fraction", "", "FillWholeMaxWidth", "Landroidx/compose/foundation/layout/FillElement;", "fillMaxHeight", "FillWholeMaxHeight", "fillMaxSize", "FillWholeMaxSize", "wrapContentWidth", "align", "Landroidx/compose/ui/Alignment$Horizontal;", "unbounded", "", "WrapContentWidthCenter", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthStart", "wrapContentHeight", "Landroidx/compose/ui/Alignment$Vertical;", "WrapContentHeightCenter", "WrapContentHeightTop", "wrapContentSize", "Landroidx/compose/ui/Alignment;", "WrapContentSizeCenter", "WrapContentSizeTopStart", "defaultMinSize", "defaultMinSize-VpY3zN4", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    private static final FillElement FillWholeMaxWidth = FillElement.INSTANCE.width(1.0f);
    private static final FillElement FillWholeMaxHeight = FillElement.INSTANCE.height(1.0f);
    private static final FillElement FillWholeMaxSize = FillElement.INSTANCE.size(1.0f);
    private static final WrapContentElement WrapContentWidthCenter = WrapContentElement.INSTANCE.width(Alignment.INSTANCE.getCenterHorizontally(), false);
    private static final WrapContentElement WrapContentWidthStart = WrapContentElement.INSTANCE.width(Alignment.INSTANCE.getStart(), false);
    private static final WrapContentElement WrapContentHeightCenter = WrapContentElement.INSTANCE.height(Alignment.INSTANCE.getCenterVertically(), false);
    private static final WrapContentElement WrapContentHeightTop = WrapContentElement.INSTANCE.height(Alignment.INSTANCE.getTop(), false);
    private static final WrapContentElement WrapContentSizeCenter = WrapContentElement.INSTANCE.size(Alignment.INSTANCE.getCenter(), false);
    private static final WrapContentElement WrapContentSizeTopStart = WrapContentElement.INSTANCE.size(Alignment.INSTANCE.getTopStart(), false);

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m894width3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(f, 0.0f, f, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m8399boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m875height3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m8399boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m890size6HolHcs(Modifier modifier, long j) {
        return m891sizeVpY3zN4(modifier, DpSize.m8499getWidthD9Ej5fM(j), DpSize.m8497getHeightD9Ej5fM(j));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m896widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        return m895widthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m895widthInVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(f, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m8399boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m877heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        return m876heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m876heightInVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m8399boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m893sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        return m892sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m892sizeInqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new SizeElement(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set(ViewProps.MIN_WIDTH, Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set(ViewProps.MIN_HEIGHT, Dp.m8399boximpl(f2));
                inspectorInfo.getProperties().set(ViewProps.MAX_WIDTH, Dp.m8399boximpl(f3));
                inspectorInfo.getProperties().set(ViewProps.MAX_HEIGHT, Dp.m8399boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m886requiredWidth3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(f, 0.0f, f, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m8399boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m878requiredHeight3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(Dp.m8399boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m882requiredSize6HolHcs(Modifier modifier, long j) {
        return m883requiredSizeVpY3zN4(modifier, DpSize.m8499getWidthD9Ej5fM(j), DpSize.m8497getHeightD9Ej5fM(j));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m888requiredWidthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        return m887requiredWidthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m887requiredWidthInVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(f, 0.0f, f2, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m8399boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m880requiredHeightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        return m879requiredHeightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m879requiredHeightInVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(0.0f, f, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m8399boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m885requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        return m884requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m884requiredSizeInqDBjuR0(Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new SizeElement(f, f2, f3, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set(ViewProps.MIN_WIDTH, Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set(ViewProps.MIN_HEIGHT, Dp.m8399boximpl(f2));
                inspectorInfo.getProperties().set(ViewProps.MAX_WIDTH, Dp.m8399boximpl(f3));
                inspectorInfo.getProperties().set(ViewProps.MAX_HEIGHT, Dp.m8399boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxWidth : FillElement.INSTANCE.width(f));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxHeight : FillElement.INSTANCE.height(f));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxSize : FillElement.INSTANCE.size(f));
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }

    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z) {
        WrapContentElement width;
        if (Intrinsics.areEqual(horizontal, Alignment.INSTANCE.getCenterHorizontally()) && !z) {
            width = WrapContentWidthCenter;
        } else if (Intrinsics.areEqual(horizontal, Alignment.INSTANCE.getStart()) && !z) {
            width = WrapContentWidthStart;
        } else {
            width = WrapContentElement.INSTANCE.width(horizontal, z);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.INSTANCE.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        WrapContentElement height;
        if (Intrinsics.areEqual(vertical, Alignment.INSTANCE.getCenterVertically()) && !z) {
            height = WrapContentHeightCenter;
        } else if (Intrinsics.areEqual(vertical, Alignment.INSTANCE.getTop()) && !z) {
            height = WrapContentHeightTop;
        } else {
            height = WrapContentElement.INSTANCE.height(vertical, z);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z) {
        WrapContentElement size;
        if (Intrinsics.areEqual(alignment, Alignment.INSTANCE.getCenter()) && !z) {
            size = WrapContentSizeCenter;
        } else if (Intrinsics.areEqual(alignment, Alignment.INSTANCE.getTopStart()) && !z) {
            size = WrapContentSizeTopStart;
        } else {
            size = WrapContentElement.INSTANCE.size(alignment, z);
        }
        return modifier.then(size);
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m874defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        return m873defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m873defaultMinSizeVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new UnspecifiedConstraintsElement(f, f2, null));
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m889size3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("size");
                inspectorInfo.setValue(Dp.m8399boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m891sizeVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set("height", Dp.m8399boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m881requiredSize3ABfNKs(Modifier modifier, final float f) {
        return modifier.then(new SizeElement(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m8399boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m883requiredSizeVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new SizeElement(f, f2, f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set("height", Dp.m8399boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }
}
