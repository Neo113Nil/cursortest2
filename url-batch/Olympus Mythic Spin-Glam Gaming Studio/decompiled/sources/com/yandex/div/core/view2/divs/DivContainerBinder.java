package com.yandex.div.core.view2.divs;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import com.ironsource.X3;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivCollectionHolder;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.core.widget.ShowSeparatorsMode;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivContainerBinder.kt */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B=\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001d\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010!\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J[\u0010'\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(JS\u0010*\u001a\u00020\u001c*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J9\u0010-\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010.JI\u00100\u001a\b\u0012\u0004\u0012\u00020$0#*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u00101J1\u00106\u001a\b\u0012\u0004\u0012\u0002020#*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107JE\u0010<\u001a\u00020\u001c*\u0002082\u0006\u00109\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u0002022\u0006\u0010,\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b<\u0010=J7\u0010A\u001a\u00020\u001c*\u00020\u00042\u0006\u0010?\u001a\u00020>2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\bA\u0010BJ5\u0010D\u001a\u00020\u001c*\u00020C2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020\u001c*\u00020C2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bF\u0010GJX\u0010M\u001a\u00020\u001c\"\u0012\b\u0000\u0010I*\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020H*\u00028\u00002\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00162\u0014\b\u0004\u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u001c0JH\u0082\b¢\u0006\u0004\bM\u0010NJ-\u0010P\u001a\u00020\u001c*\u00020O2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bP\u0010QJ5\u0010D\u001a\u00020\u001c*\u00020O2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bD\u0010RJX\u0010U\u001a\u00020\u001c\"\u0012\b\u0000\u0010I*\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020H*\u00028\u00002\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00162\u0014\b\u0004\u0010T\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u001c0JH\u0082\b¢\u0006\u0004\bU\u0010NJ^\u0010Z\u001a\u00020\u001c\"\u0012\b\u0000\u0010I*\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020H*\u00028\u00002\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u00162\u001a\b\u0004\u0010Y\u001a\u0014\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u001c0VH\u0082\b¢\u0006\u0004\bZ\u0010[J-\u0010F\u001a\u00020\u001c*\u00020O2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\bF\u0010QJ-\u0010\\\u001a\u00020\u001c*\u00020O2\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\\\u0010QJb\u0010a\u001a\u00020\u001c\"\u0012\b\u0000\u0010I*\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020H*\u00028\u00002\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010_\u001a\u0004\u0018\u00010]2\u0006\u0010,\u001a\u00020\u00162\u001c\b\u0004\u0010`\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c0VH\u0082\b¢\u0006\u0004\ba\u0010bJb\u0010e\u001a\u00020\u001c\"\u0012\b\u0000\u0010I*\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020H*\u00028\u00002\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010_\u001a\u0004\u0018\u00010]2\u0006\u0010,\u001a\u00020\u00162\u001c\b\u0004\u0010d\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c0VH\u0082\b¢\u0006\u0004\be\u0010bJb\u0010h\u001a\u00020\u001c\"\u0012\b\u0000\u0010I*\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00020H*\u00028\u00002\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010_\u001a\u0004\u0018\u00010]2\u0006\u0010,\u001a\u00020\u00162\u001c\b\u0004\u0010g\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c0VH\u0082\b¢\u0006\u0004\bh\u0010bJW\u0010o\u001a\u00020\u001c*\u0002082\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010j\u001a\u00020i2\b\u0010k\u001a\u0004\u0018\u00010i2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010l\u001a\u00020\u00162\u0006\u0010n\u001a\u00020m2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bo\u0010pJ3\u0010q\u001a\u00020\u001c*\u0002082\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00103\u001a\u00020i2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010l\u001a\u00020\u0016H\u0002¢\u0006\u0004\bq\u0010rJ+\u0010s\u001a\u00020\u001c*\u00020\u00032\u0006\u00103\u001a\u00020i2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bs\u0010tJ#\u0010s\u001a\u00020\u001c*\u00020u2\u0006\u00103\u001a\u00020i2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bs\u0010vJ+\u0010w\u001a\u00020\u001c*\u00020\u00032\u0006\u00103\u001a\u00020i2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bw\u0010tJ#\u0010w\u001a\u00020\u001c*\u00020u2\u0006\u00103\u001a\u00020i2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bw\u0010vJ3\u0010{\u001a\u00020\u001c*\u00020u2\u0006\u00103\u001a\u00020i2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u00020xH\u0002¢\u0006\u0004\b{\u0010|J(\u0010\u0080\u0001\u001a\u00020\u007f*\u0004\u0018\u00010f2\u0006\u0010~\u001a\u00020}2\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\u000204*\u00020SH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0016\u0010\u0084\u0001\u001a\u000204*\u00020SH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J \u0010\u0085\u0001\u001a\u000204*\u0004\u0018\u00010]2\u0006\u0010,\u001a\u00020\u0016H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u001a2\b\b\u0001\u0010y\u001a\u000204H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J*\u0010\u0089\u0001\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J*\u0010\u008b\u0001\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J3\u0010\u008d\u0001\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0007\u0010\u008c\u0001\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J0\u0010\u008f\u0001\u001a\u00020\u001c*\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J)\u0010\u0091\u0001\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u00122\u0007\u0010\u008c\u0001\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0093\u0001R\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0094\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0095\u0001R\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0094\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Container;", "Lcom/yandex/div2/DivContainer;", "Landroid/view/ViewGroup;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/DivViewCreator;", "divViewCreator", "Lcom/yandex/div/core/downloader/DivPatchManager;", "divPatchManager", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Ljavax/inject/Provider;Lcom/yandex/div/core/downloader/DivPatchManager;Ljavax/inject/Provider;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lcom/yandex/div/core/view2/BindingContext;", "context", "div", "oldDiv", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "oldResolver", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "shouldBindItemBuilder", "", "bindItems", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/state/DivStatePath;Z)V", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "bindItemBuilder", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "items", "oldItems", "applyItems", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "bindingContext", "dispatchItems", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;)V", "resolver", "validateChildren", "(Landroid/view/ViewGroup;Lcom/yandex/div2/DivContainer;Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "newDiv", "dispatchBinding", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Ljava/util/List;Lcom/yandex/div/core/state/DivStatePath;)Ljava/util/List;", "Lcom/yandex/div2/Div;", "childDiv", "", "childIndex", "applyPatchToChild", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/Div;I)Ljava/util/List;", "Landroid/view/View;", "parentContext", "parentDiv", "oldParentDiv", "bindChild", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/Div;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "newItems", "replaceWithReuse", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/Div2View;Ljava/util/List;Ljava/util/List;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivLinearLayout;", "bindProperties", "(Lcom/yandex/div/core/view2/divs/widgets/DivLinearLayout;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "bindSeparator", "(Lcom/yandex/div/core/view2/divs/widgets/DivLinearLayout;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "T", "Lkotlin/Function1;", "", "applyItemSpacing", "bindItemSpacing", "(Landroid/view/ViewGroup;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;", "bindLineSpacing", "(Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "(Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "Lcom/yandex/div2/DivContainer$Orientation;", "applyOrientation", "bindOrientation", "Lkotlin/Function2;", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "Lcom/yandex/div2/DivContentAlignmentVertical;", "applyContentAlignment", "bindContentAlignment", "(Landroid/view/ViewGroup;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function2;)V", "bindLineSeparator", "Lcom/yandex/div2/DivContainer$Separator;", "newSeparator", "oldSeparator", "applySeparatorShowMode", "bindSeparatorShowMode", "(Landroid/view/ViewGroup;Lcom/yandex/div2/DivContainer$Separator;Lcom/yandex/div2/DivContainer$Separator;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function2;)V", "Lcom/yandex/div2/DivDrawable;", "applySeparatorStyle", "bindSeparatorStyle", "Lcom/yandex/div2/DivEdgeInsets;", "applySeparatorMargins", "bindSeparatorMargins", "Lcom/yandex/div2/DivBase;", "newChildDiv", "oldChildDiv", "childResolver", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "subscriber", "bindChildAlignment", "(Landroid/view/View;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivBase;Lcom/yandex/div2/DivBase;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/internal/core/ExpressionSubscriber;Lcom/yandex/div/core/view2/Div2View;)V", "applyChildAlignment", "(Landroid/view/View;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivBase;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "checkCrossAxisSize", "(Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivBase;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "Lcom/yandex/div2/DivSize;", "(Lcom/yandex/div2/DivSize;Lcom/yandex/div2/DivBase;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "checkMainAxisSize", "", X3.a.t, "axis", "checkSize", "(Lcom/yandex/div2/DivSize;Lcom/yandex/div2/DivBase;Lcom/yandex/div/core/view2/errors/ErrorCollector;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "toRect", "(Lcom/yandex/div2/DivEdgeInsets;Landroid/content/res/Resources;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/Rect;", "toOrientationMode", "(Lcom/yandex/div2/DivContainer$Orientation;)I", "toWrapDirection", "toSeparatorMode", "(Lcom/yandex/div2/DivContainer$Separator;Lcom/yandex/div/json/expressions/ExpressionResolver;)I", "showSeparatorBetween", "(I)Z", "checkItemSpacingIgnored", "(Lcom/yandex/div2/DivContainer;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "checkLineSpacingIgnored", "view", "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/ViewGroup;Lcom/yandex/div2/Div$Container;Lcom/yandex/div/core/state/DivStatePath;)V", "bind", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivContainer;Lcom/yandex/div2/DivContainer;)V", "setDataWithoutBinding", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/ViewGroup;Lcom/yandex/div2/Div$Container;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/downloader/DivPatchManager;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "tempRect", "Landroid/graphics/Rect;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes.dex */
public final class DivContainerBinder extends DivViewBinder<Div.Container, DivContainer, ViewGroup> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Provider divBinder;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final Provider divViewCreator;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final Rect tempRect;

    /* compiled from: DivContainerBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivContainer.Orientation.values().length];
            try {
                iArr[DivContainer.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean showSeparatorBetween(@ShowSeparatorsMode int mode) {
        return (mode & 2) != 0;
    }

    public DivContainerBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull Provider provider, @NotNull DivPatchManager divPatchManager, @NotNull Provider provider2, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.divViewCreator = provider;
        this.divPatchManager = divPatchManager;
        this.divBinder = provider2;
        this.errorCollectors = errorCollectors;
        this.tempRect = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bindView(@NotNull BindingContext context, @NotNull ViewGroup view, @NotNull Div.Container div, @NotNull DivStatePath path) {
        ExpressionResolver oldExpressionResolver$div_release;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div.Container>");
        DivHolderView divHolderView = (DivHolderView) view;
        Div.Container container = (Div.Container) divHolderView.getDiv();
        BindingContext bindingContext = divHolderView.getBindingContext();
        if (bindingContext == null || (oldExpressionResolver$div_release = bindingContext.getExpressionResolver()) == null) {
            oldExpressionResolver$div_release = context.getDivView().getOldExpressionResolver$div_release();
        }
        ExpressionResolver expressionResolver = oldExpressionResolver$div_release;
        if (div == container) {
            bindItems(view, context, div.getValue(), container.getValue(), expressionResolver, path, false);
            return;
        }
        this.baseBinder.bindView(context, view, div, container);
        bind(view, context, div.getValue(), container != null ? container.getValue() : null);
        Iterator it = ViewGroupKt.getChildren(view).iterator();
        while (it.hasNext()) {
            context.getDivView().unbindViewFromDiv$div_release((View) it.next());
        }
        bindItems$default(this, view, context, div.getValue(), container != null ? container.getValue() : null, expressionResolver, path, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull ViewGroup viewGroup, @NotNull BindingContext bindingContext, @NotNull DivContainer divContainer, @Nullable DivContainer divContainer2) {
        BaseDivViewExtensionsKt.applyDivActions(viewGroup, bindingContext, divContainer.action, divContainer.actions, divContainer.longtapActions, divContainer.doubletapActions, divContainer.hoverStartActions, divContainer.hoverEndActions, divContainer.pressStartActions, divContainer.pressEndActions, divContainer.actionAnimation, divContainer.captureFocusOnAction);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(viewGroup, divContainer.aspect, divContainer2 != null ? divContainer2.aspect : null, expressionResolver);
        BaseDivViewExtensionsKt.bindClipChildren(viewGroup, divContainer.clipToBounds, divContainer2 != null ? divContainer2.clipToBounds : null, expressionResolver);
        if (viewGroup instanceof DivLinearLayout) {
            bindProperties((DivLinearLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        } else if (viewGroup instanceof DivWrapLayout) {
            bindProperties((DivWrapLayout) viewGroup, divContainer, divContainer2, expressionResolver, orCreate);
        }
    }

    static /* synthetic */ void bindItems$default(DivContainerBinder divContainerBinder, ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z, int i, Object obj) {
        divContainerBinder.bindItems(viewGroup, bindingContext, divContainer, divContainer2, expressionResolver, divStatePath, (i & 32) != 0 ? true : z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (com.yandex.div.core.view2.animations.DivComparator.areChildrenReplaceable$default(r2, r1, r5, null, 4, null) != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, DivStatePath divStatePath, boolean z) {
        List<DivItemBuilderResult> list;
        List<DivItemBuilderResult> list2;
        Div2View divView = bindingContext.getDivView();
        List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(divContainer, bindingContext.getExpressionResolver());
        Intrinsics.checkNotNull(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        List<DivItemBuilderResult> items = ((DivCollectionHolder) viewGroup).getItems();
        if (items == null) {
            for (DivItemBuilderResult divItemBuilderResult : buildItems) {
                viewGroup.addView(((DivViewCreator) this.divViewCreator.get()).create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver()));
            }
        } else if (divContainer != divContainer2) {
            if (!divView.getComplexRebindInProgress$div_release()) {
                if (divContainer2 != null) {
                    DivComparator divComparator = DivComparator.INSTANCE;
                    if (DivComparator.areValuesReplaceable$default(divComparator, divContainer2, divContainer, expressionResolver, bindingContext.getExpressionResolver(), null, 16, null)) {
                    }
                }
                replaceWithReuse(viewGroup, divView, items, buildItems);
            }
            list = null;
            ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
            if (z) {
                list2 = buildItems;
            } else {
                list2 = buildItems;
                bindItemBuilder(viewGroup, bindingContext, divContainer, divStatePath, orCreate);
            }
            applyItems(viewGroup, bindingContext, divContainer, divContainer2, list2, list, divStatePath, orCreate);
        }
        list = items;
        ErrorCollector orCreate2 = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        if (z) {
        }
        applyItems(viewGroup, bindingContext, divContainer, divContainer2, list2, list, divStatePath, orCreate2);
    }

    private final void bindItemBuilder(final ViewGroup viewGroup, final BindingContext bindingContext, final DivContainer divContainer, final DivStatePath divStatePath, final ErrorCollector errorCollector) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divContainer.itemBuilder;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindItemBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7188invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7188invoke(@NotNull Object obj) {
                List<DivItemBuilderResult> build = DivCollectionExtensionsKt.build(DivCollectionItemBuilder.this, bindingContext.getExpressionResolver());
                ViewParent viewParent = viewGroup;
                Intrinsics.checkNotNull(viewParent, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
                List<DivItemBuilderResult> items = ((DivCollectionHolder) viewParent).getItems();
                if (items == null) {
                    items = CollectionsKt.emptyList();
                }
                List<DivItemBuilderResult> list = items;
                this.replaceWithReuse(viewGroup, bindingContext.getDivView(), list, build);
                DivContainerBinder divContainerBinder = this;
                ViewGroup viewGroup2 = viewGroup;
                BindingContext bindingContext2 = bindingContext;
                DivContainer divContainer2 = divContainer;
                divContainerBinder.applyItems(viewGroup2, bindingContext2, divContainer2, divContainer2, build, list, divStatePath, errorCollector);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath, ErrorCollector errorCollector) {
        RebindUtilsKt.tryRebindPlainContainerChildren(viewGroup, bindingContext.getDivView(), list, this.divViewCreator);
        validateChildren(viewGroup, divContainer, list, bindingContext.getExpressionResolver(), errorCollector);
        dispatchItems(viewGroup, bindingContext, divContainer, divContainer2, list, list2, divStatePath);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dispatchItems(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2, DivStatePath divStatePath) {
        List<DivItemBuilderResult> dispatchBinding = dispatchBinding(viewGroup, bindingContext, divContainer, divContainer2, list, divStatePath);
        Intrinsics.checkNotNull(viewGroup, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        ((DivCollectionHolder) viewGroup).setItems(dispatchBinding);
        BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, bindingContext.getDivView(), dispatchBinding, list2);
    }

    private final void validateChildren(ViewGroup viewGroup, DivContainer divContainer, List<DivItemBuilderResult> list, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (viewGroup instanceof DivFrameLayout) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DivBase value = ((DivItemBuilderResult) it.next()).getDiv().value();
            if (viewGroup instanceof DivWrapLayout) {
                checkCrossAxisSize(divContainer, value, expressionResolver, errorCollector);
            } else if (viewGroup instanceof DivLinearLayout) {
                checkMainAxisSize(divContainer, value, expressionResolver, errorCollector);
            }
        }
    }

    private final List<DivItemBuilderResult> dispatchBinding(ViewGroup viewGroup, BindingContext bindingContext, DivContainer divContainer, DivContainer divContainer2, List<DivItemBuilderResult> list, DivStatePath divStatePath) {
        List<DivItemBuilderResult> list2;
        int i = 0;
        if (divContainer.itemBuilder == null || list == null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                List<Div> applyPatchToChild = applyPatchToChild(viewGroup, bindingContext, divItemBuilderResult.getDiv(), i2 + i3);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(applyPatchToChild, 10));
                Iterator<T> it = applyPatchToChild.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new DivItemBuilderResult((Div) it.next(), divItemBuilderResult.getExpressionResolver()));
                }
                i3 += arrayList2.size() - 1;
                CollectionsKt.addAll(arrayList, arrayList2);
                i2 = i4;
            }
            list2 = arrayList;
        } else {
            list2 = list;
        }
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(list2);
        for (Object obj2 : list2) {
            int i5 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) obj2;
            bindChild(viewGroup.getChildAt(i), bindingContext, divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver(), divContainer, divContainer2, divStatePath.appendDiv(itemIds.get(i)));
            i = i5;
        }
        return list2;
    }

    private final List<Div> applyPatchToChild(ViewGroup viewGroup, BindingContext bindingContext, Div div, int i) {
        Map<Div, View> createViewsForId;
        String id = div.value().getId();
        if (id != null && (createViewsForId = this.divPatchManager.createViewsForId(bindingContext, id)) != null) {
            viewGroup.removeViewAt(i);
            Iterator<Map.Entry<Div, View>> it = createViewsForId.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                viewGroup.addView(it.next().getValue(), i2 + i);
                i2++;
            }
            return CollectionsKt.toList(createViewsForId.keySet());
        }
        return CollectionsKt.listOf(div);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindChild(View view, BindingContext bindingContext, Div div, ExpressionResolver expressionResolver, DivContainer divContainer, DivContainer divContainer2, DivStatePath divStatePath) {
        ExpressionResolverImpl expressionResolver2;
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        Div div2 = divHolderView != null ? divHolderView.getDiv() : null;
        Div2View divView = bindingContext.getDivView();
        ExpressionsRuntime resolveRuntimeWith = divView.getRuntimeStore().resolveRuntimeWith(divView, divStatePath, div, expressionResolver, bindingContext.getExpressionResolver());
        ((DivBinder) this.divBinder.get()).bind(bindingContext.getFor(expressionResolver), view, div, divStatePath);
        bindChildAlignment(view, divContainer, divContainer2, div.value(), div2 != null ? div2.value() : null, bindingContext.getExpressionResolver(), (resolveRuntimeWith == null || (expressionResolver2 = resolveRuntimeWith.getExpressionResolver()) == null) ? expressionResolver : expressionResolver2, ReleasablesKt.getExpressionSubscriber(view), divView);
        if (DivUtilKt.getHasSightActions(div.value())) {
            divView.bindViewToDiv$div_release(view, div);
        } else {
            divView.unbindViewFromDiv$div_release(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceWithReuse(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        Object obj;
        boolean canBeReused;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<DivItemBuilderResult> list3 = list;
        List list4 = SequencesKt.toList(ViewGroupKt.getChildren(viewGroup));
        Iterator<T> it = list3.iterator();
        Iterator it2 = list4.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(list3, 10), CollectionsKt.collectionSizeOrDefault(list4, 10)));
        while (it.hasNext() && it2.hasNext()) {
            linkedHashMap.put(((DivItemBuilderResult) it.next()).getDiv(), (View) it2.next());
            arrayList.add(Unit.INSTANCE);
        }
        viewGroup.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = list2.iterator();
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) next;
            Iterator it4 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                Div div = (Div) next2;
                if (DivUtilKt.isBranch(div)) {
                    canBeReused = Intrinsics.areEqual(DivUtilKt.getType(divItemBuilderResult.getDiv()), DivUtilKt.getType(div));
                } else {
                    canBeReused = DivUtilKt.canBeReused(div, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
                if (canBeReused) {
                    obj2 = next2;
                    break;
                }
            }
            View view = (View) TypeIntrinsics.asMutableMap(linkedHashMap).remove((Div) obj2);
            if (view != null) {
                viewGroup.addView(view);
            } else {
                arrayList2.add(Integer.valueOf(i));
            }
            i = i2;
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            int intValue = ((Number) it5.next()).intValue();
            DivItemBuilderResult divItemBuilderResult2 = list2.get(intValue);
            Iterator it6 = linkedHashMap.keySet().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (Intrinsics.areEqual(DivUtilKt.getType((Div) obj), DivUtilKt.getType(divItemBuilderResult2.getDiv()))) {
                        break;
                    }
                }
            }
            View view2 = (View) TypeIntrinsics.asMutableMap(linkedHashMap).remove((Div) obj);
            if (view2 == null) {
                view2 = ((DivViewCreator) this.divViewCreator.get()).create(divItemBuilderResult2.getDiv(), divItemBuilderResult2.getExpressionResolver());
            }
            viewGroup.addView(view2, intValue);
        }
        Iterator it7 = linkedHashMap.values().iterator();
        while (it7.hasNext()) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), (View) it7.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x006a, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r6 != null ? r6.showAtEnd : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r6 != null ? r6.showAtEnd : null, r0 != null ? r0.showAtEnd : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindSeparator(final DivLinearLayout divLinearLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        final DivContainer.Separator separator = divContainer.separator;
        DivContainer.Separator separator2 = divContainer2 != null ? divContainer2.separator : null;
        if (ExpressionsKt.equalsToConstant(separator != null ? separator.showAtStart : null, separator2 != null ? separator2.showAtStart : null)) {
            if (ExpressionsKt.equalsToConstant(separator != null ? separator.showBetween : null, separator2 != null ? separator2.showBetween : null)) {
            }
        }
        divLinearLayout.setShowDividers(toSeparatorMode(separator, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showAtStart : null)) {
            if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showBetween : null)) {
            }
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7182invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7182invoke(@NotNull Object obj) {
                divLinearLayout.setShowDividers(this.toSeparatorMode(DivContainer.Separator.this, expressionResolver));
            }
        };
        divLinearLayout.addSubscription((separator == null || (expression3 = separator.showAtStart) == null) ? null : expression3.observe(expressionResolver, function1));
        divLinearLayout.addSubscription((separator == null || (expression2 = separator.showBetween) == null) ? null : expression2.observe(expressionResolver, function1));
        divLinearLayout.addSubscription((separator == null || (expression = separator.showAtEnd) == null) ? null : expression.observe(expressionResolver, function1));
        final DivContainer.Separator separator3 = divContainer.separator;
        DivContainer.Separator separator4 = divContainer2 != null ? divContainer2.separator : null;
        if (!DivDataExtensionsKt.equalsToConstant(separator3 != null ? separator3.style : null, separator4 != null ? separator4.style : null)) {
            DivDrawable divDrawable = separator3 != null ? separator3.style : null;
            divLinearLayout.setDividerDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divLinearLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(separator3 != null ? separator3.style : null)) {
                ExpressionSubscribersKt.observeDrawable(divLinearLayout, separator3 != null ? separator3.style : null, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m7184invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7184invoke(@NotNull Object obj) {
                        DivContainer.Separator separator5 = DivContainer.Separator.this;
                        DivDrawable divDrawable2 = separator5 != null ? separator5.style : null;
                        DivLinearLayout divLinearLayout2 = divLinearLayout;
                        divLinearLayout2.setDividerDrawable(divDrawable2 != null ? DivUtilKt.toDrawable(divDrawable2, divLinearLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.Separator separator5 = divContainer.separator;
        DivContainer.Separator separator6 = divContainer2 != null ? divContainer2.separator : null;
        if (DivDataExtensionsKt.equalsToConstant(separator5 != null ? separator5.margins : null, separator6 != null ? separator6.margins : null)) {
            return;
        }
        Rect rect = toRect(separator5 != null ? separator5.margins : null, divLinearLayout.getResources(), expressionResolver);
        divLinearLayout.setDividerMargins(rect.left, rect.top, rect.right, rect.bottom);
        DivEdgeInsets divEdgeInsets = separator5 != null ? separator5.margins : null;
        if (divEdgeInsets == null || DivDataExtensionsKt.isConstant(divEdgeInsets)) {
            return;
        }
        final DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Function1 function12 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7180invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7180invoke(@NotNull Object obj) {
                Rect rect2 = this.toRect(DivEdgeInsets.this, divLinearLayout.getResources(), expressionResolver);
                divLinearLayout.setDividerMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        };
        divLinearLayout.addSubscription(divEdgeInsets.top.observe(expressionResolver, function12));
        divLinearLayout.addSubscription(divEdgeInsets.bottom.observe(expressionResolver, function12));
        Expression expression4 = divEdgeInsets.start;
        if (expression4 != null || divEdgeInsets.end != null) {
            divLinearLayout.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function12) : null);
            Expression expression5 = divEdgeInsets.end;
            divLinearLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, function12) : null);
        } else {
            divLinearLayout.addSubscription(divEdgeInsets.left.observe(expressionResolver, function12));
            divLinearLayout.addSubscription(divEdgeInsets.right.observe(expressionResolver, function12));
        }
    }

    private final <T extends ViewGroup & DivHolderView<Div.Container>> void bindItemSpacing(T t, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, final Function1 function1) {
        if (ExpressionsKt.equalsToConstant(divContainer.itemSpacing, divContainer2 != null ? divContainer2.itemSpacing : null)) {
            return;
        }
        function1.invoke(divContainer.itemSpacing.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divContainer.itemSpacing)) {
            return;
        }
        ((DivHolderView) t).addSubscription(divContainer.itemSpacing.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindItemSpacing$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Function1.this.invoke(Long.valueOf(j));
            }
        }));
    }

    private final void bindLineSpacing(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divContainer.lineSpacing, divContainer2 != null ? divContainer2.lineSpacing : null)) {
            return;
        }
        final DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
        divWrapLayout.setLineSpacing(BaseDivViewExtensionsKt.dpToPx((Long) divContainer.lineSpacing.evaluate(expressionResolver), displayMetrics));
        if (ExpressionsKt.isConstant(divContainer.lineSpacing)) {
            return;
        }
        divWrapLayout.addSubscription(divContainer.lineSpacing.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSpacing$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                DivWrapLayout.this.setLineSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics));
            }
        }));
    }

    private final <T extends ViewGroup & DivHolderView<Div.Container>> void bindOrientation(T t, DivContainer divContainer, DivContainer divContainer2, ExpressionResolver expressionResolver, final Function1 function1) {
        if (ExpressionsKt.equalsToConstant(divContainer.orientation, divContainer2 != null ? divContainer2.orientation : null)) {
            return;
        }
        function1.invoke(divContainer.orientation.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divContainer.orientation)) {
            return;
        }
        ((DivHolderView) t).addSubscription(divContainer.orientation.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindOrientation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivContainer.Orientation) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivContainer.Orientation orientation) {
                Function1.this.invoke(orientation);
            }
        }));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r5.contentAlignmentVertical, r6 != null ? r6.contentAlignmentVertical : null) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindProperties(final DivLinearLayout divLinearLayout, final DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!ExpressionsKt.equalsToConstant(divContainer.orientation, divContainer2 != null ? divContainer2.orientation : null)) {
            divLinearLayout.setOrientation(toOrientationMode((DivContainer.Orientation) divContainer.orientation.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(divContainer.orientation)) {
                divLinearLayout.addSubscription(divContainer.orientation.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull DivContainer.Orientation orientation) {
                        DivLinearLayout.this.setOrientation(this.toOrientationMode(orientation));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DivContainer.Orientation) obj);
                        return Unit.INSTANCE;
                    }
                }));
            }
        }
        if (ExpressionsKt.equalsToConstant(divContainer.contentAlignmentHorizontal, divContainer2 != null ? divContainer2.contentAlignmentHorizontal : null)) {
        }
        divLinearLayout.setGravity(DivUtilKt.evaluateGravity((DivContentAlignmentHorizontal) divContainer.contentAlignmentHorizontal.evaluate(expressionResolver), (DivContentAlignmentVertical) divContainer.contentAlignmentVertical.evaluate(expressionResolver)));
        if (!ExpressionsKt.isConstant(divContainer.contentAlignmentHorizontal) || !ExpressionsKt.isConstant(divContainer.contentAlignmentVertical)) {
            Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7178invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7178invoke(@NotNull Object obj) {
                    Object evaluate = DivContainer.this.contentAlignmentHorizontal.evaluate(expressionResolver);
                    divLinearLayout.setGravity(DivUtilKt.evaluateGravity((DivContentAlignmentHorizontal) evaluate, (DivContentAlignmentVertical) DivContainer.this.contentAlignmentVertical.evaluate(expressionResolver)));
                }
            };
            divLinearLayout.addSubscription(divContainer.contentAlignmentHorizontal.observe(expressionResolver, function1));
            divLinearLayout.addSubscription(divContainer.contentAlignmentVertical.observe(expressionResolver, function1));
        }
        bindSeparator(divLinearLayout, divContainer, divContainer2, expressionResolver);
        if (!ExpressionsKt.equalsToConstant(divContainer.itemSpacing, divContainer2 != null ? divContainer2.itemSpacing : null)) {
            divLinearLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(((Number) divContainer.itemSpacing.evaluate(expressionResolver)).longValue()), divLinearLayout.getResources().getDisplayMetrics()));
            if (!ExpressionsKt.isConstant(divContainer.itemSpacing)) {
                divLinearLayout.addSubscription(divContainer.itemSpacing.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$1
                    {
                        super(1);
                    }

                    public final void invoke(long j) {
                        DivLinearLayout.this.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), DivLinearLayout.this.getResources().getDisplayMetrics()));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).longValue());
                        return Unit.INSTANCE;
                    }
                }));
            }
        }
        checkItemSpacingIgnored(divContainer, expressionResolver, errorCollector);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r5.contentAlignmentVertical, r6 != null ? r6.contentAlignmentVertical : null) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindProperties(final DivWrapLayout divWrapLayout, final DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!ExpressionsKt.equalsToConstant(divContainer.orientation, divContainer2 != null ? divContainer2.orientation : null)) {
            divWrapLayout.setWrapDirection(toWrapDirection((DivContainer.Orientation) divContainer.orientation.evaluate(expressionResolver)));
            if (!ExpressionsKt.isConstant(divContainer.orientation)) {
                divWrapLayout.addSubscription(divContainer.orientation.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindOrientation$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull DivContainer.Orientation orientation) {
                        DivWrapLayout.this.setWrapDirection(this.toWrapDirection(orientation));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DivContainer.Orientation) obj);
                        return Unit.INSTANCE;
                    }
                }));
            }
        }
        if (ExpressionsKt.equalsToConstant(divContainer.contentAlignmentHorizontal, divContainer2 != null ? divContainer2.contentAlignmentHorizontal : null)) {
        }
        divWrapLayout.setGravity(DivUtilKt.evaluateGravity((DivContentAlignmentHorizontal) divContainer.contentAlignmentHorizontal.evaluate(expressionResolver), (DivContentAlignmentVertical) divContainer.contentAlignmentVertical.evaluate(expressionResolver)));
        if (!ExpressionsKt.isConstant(divContainer.contentAlignmentHorizontal) || !ExpressionsKt.isConstant(divContainer.contentAlignmentVertical)) {
            Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindContentAlignment$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m7179invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7179invoke(@NotNull Object obj) {
                    Object evaluate = DivContainer.this.contentAlignmentHorizontal.evaluate(expressionResolver);
                    divWrapLayout.setGravity(DivUtilKt.evaluateGravity((DivContentAlignmentHorizontal) evaluate, (DivContentAlignmentVertical) DivContainer.this.contentAlignmentVertical.evaluate(expressionResolver)));
                }
            };
            divWrapLayout.addSubscription(divContainer.contentAlignmentHorizontal.observe(expressionResolver, function1));
            divWrapLayout.addSubscription(divContainer.contentAlignmentVertical.observe(expressionResolver, function1));
        }
        bindSeparator(divWrapLayout, divContainer, divContainer2, expressionResolver);
        bindLineSeparator(divWrapLayout, divContainer, divContainer2, expressionResolver);
        if (!ExpressionsKt.equalsToConstant(divContainer.itemSpacing, divContainer2 != null ? divContainer2.itemSpacing : null)) {
            divWrapLayout.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(((Number) divContainer.itemSpacing.evaluate(expressionResolver)).longValue()), divWrapLayout.getResources().getDisplayMetrics()));
            if (!ExpressionsKt.isConstant(divContainer.itemSpacing)) {
                divWrapLayout.addSubscription(divContainer.itemSpacing.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindProperties$$inlined$bindItemSpacing$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).longValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(long j) {
                        DivWrapLayout.this.setItemSpacing(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), DivWrapLayout.this.getResources().getDisplayMetrics()));
                    }
                }));
            }
        }
        bindLineSpacing(divWrapLayout, divContainer, divContainer2, expressionResolver);
        checkItemSpacingIgnored(divContainer, expressionResolver, errorCollector);
        checkLineSpacingIgnored(divContainer, expressionResolver, errorCollector);
    }

    private final <T extends ViewGroup & DivHolderView<Div.Container>> void bindContentAlignment(T t, final DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver, final Function2 function2) {
        if (ExpressionsKt.equalsToConstant(divContainer.contentAlignmentHorizontal, divContainer2 != null ? divContainer2.contentAlignmentHorizontal : null)) {
            if (ExpressionsKt.equalsToConstant(divContainer.contentAlignmentVertical, divContainer2 != null ? divContainer2.contentAlignmentVertical : null)) {
                return;
            }
        }
        function2.invoke(divContainer.contentAlignmentHorizontal.evaluate(expressionResolver), divContainer.contentAlignmentVertical.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divContainer.contentAlignmentHorizontal) && ExpressionsKt.isConstant(divContainer.contentAlignmentVertical)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7187invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7187invoke(@NotNull Object obj) {
                Function2.this.invoke(divContainer.contentAlignmentHorizontal.evaluate(expressionResolver), divContainer.contentAlignmentVertical.evaluate(expressionResolver));
            }
        };
        DivHolderView divHolderView = (DivHolderView) t;
        divHolderView.addSubscription(divContainer.contentAlignmentHorizontal.observe(expressionResolver, function1));
        divHolderView.addSubscription(divContainer.contentAlignmentVertical.observe(expressionResolver, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x006a, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r6 != null ? r6.showAtEnd : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r6 != null ? r6.showAtEnd : null, r0 != null ? r0.showAtEnd : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindSeparator(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        final DivContainer.Separator separator = divContainer.separator;
        DivContainer.Separator separator2 = divContainer2 != null ? divContainer2.separator : null;
        if (ExpressionsKt.equalsToConstant(separator != null ? separator.showAtStart : null, separator2 != null ? separator2.showAtStart : null)) {
            if (ExpressionsKt.equalsToConstant(separator != null ? separator.showBetween : null, separator2 != null ? separator2.showBetween : null)) {
            }
        }
        divWrapLayout.setShowSeparators(toSeparatorMode(separator, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showAtStart : null)) {
            if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showBetween : null)) {
            }
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorShowMode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7183invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7183invoke(@NotNull Object obj) {
                divWrapLayout.setShowSeparators(this.toSeparatorMode(DivContainer.Separator.this, expressionResolver));
            }
        };
        divWrapLayout.addSubscription((separator == null || (expression3 = separator.showAtStart) == null) ? null : expression3.observe(expressionResolver, function1));
        divWrapLayout.addSubscription((separator == null || (expression2 = separator.showBetween) == null) ? null : expression2.observe(expressionResolver, function1));
        divWrapLayout.addSubscription((separator == null || (expression = separator.showAtEnd) == null) ? null : expression.observe(expressionResolver, function1));
        final DivContainer.Separator separator3 = divContainer.separator;
        DivContainer.Separator separator4 = divContainer2 != null ? divContainer2.separator : null;
        if (!DivDataExtensionsKt.equalsToConstant(separator3 != null ? separator3.style : null, separator4 != null ? separator4.style : null)) {
            DivDrawable divDrawable = separator3 != null ? separator3.style : null;
            divWrapLayout.setSeparatorDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divWrapLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(separator3 != null ? separator3.style : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, separator3 != null ? separator3.style : null, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorStyle$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m7185invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7185invoke(@NotNull Object obj) {
                        DivContainer.Separator separator5 = DivContainer.Separator.this;
                        DivDrawable divDrawable2 = separator5 != null ? separator5.style : null;
                        DivWrapLayout divWrapLayout2 = divWrapLayout;
                        divWrapLayout2.setSeparatorDrawable(divDrawable2 != null ? DivUtilKt.toDrawable(divDrawable2, divWrapLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.Separator separator5 = divContainer.separator;
        DivContainer.Separator separator6 = divContainer2 != null ? divContainer2.separator : null;
        if (DivDataExtensionsKt.equalsToConstant(separator5 != null ? separator5.margins : null, separator6 != null ? separator6.margins : null)) {
            return;
        }
        Rect rect = toRect(separator5 != null ? separator5.margins : null, divWrapLayout.getResources(), expressionResolver);
        divWrapLayout.setSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        DivEdgeInsets divEdgeInsets = separator5 != null ? separator5.margins : null;
        if (divEdgeInsets == null || DivDataExtensionsKt.isConstant(divEdgeInsets)) {
            return;
        }
        final DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Function1 function12 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparator$$inlined$bindSeparatorMargins$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7181invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7181invoke(@NotNull Object obj) {
                Rect rect2 = this.toRect(DivEdgeInsets.this, divWrapLayout.getResources(), expressionResolver);
                divWrapLayout.setSeparatorMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        };
        divWrapLayout.addSubscription(divEdgeInsets.top.observe(expressionResolver, function12));
        divWrapLayout.addSubscription(divEdgeInsets.bottom.observe(expressionResolver, function12));
        Expression expression4 = divEdgeInsets.start;
        if (expression4 != null || divEdgeInsets.end != null) {
            divWrapLayout.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function12) : null);
            Expression expression5 = divEdgeInsets.end;
            divWrapLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, function12) : null);
        } else {
            divWrapLayout.addSubscription(divEdgeInsets.left.observe(expressionResolver, function12));
            divWrapLayout.addSubscription(divEdgeInsets.right.observe(expressionResolver, function12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x006a, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.isConstantOrNull(r6 != null ? r6.showAtEnd : null) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (com.yandex.div.json.expressions.ExpressionsKt.equalsToConstant(r6 != null ? r6.showAtEnd : null, r0 != null ? r0.showAtEnd : null) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindLineSeparator(final DivWrapLayout divWrapLayout, DivContainer divContainer, DivContainer divContainer2, final ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        final DivContainer.Separator separator = divContainer.lineSeparator;
        DivContainer.Separator separator2 = divContainer2 != null ? divContainer2.lineSeparator : null;
        if (ExpressionsKt.equalsToConstant(separator != null ? separator.showAtStart : null, separator2 != null ? separator2.showAtStart : null)) {
            if (ExpressionsKt.equalsToConstant(separator != null ? separator.showBetween : null, separator2 != null ? separator2.showBetween : null)) {
            }
        }
        divWrapLayout.setShowLineSeparators(toSeparatorMode(separator, expressionResolver));
        if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showAtStart : null)) {
            if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showBetween : null)) {
            }
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorShowMode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7176invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7176invoke(@NotNull Object obj) {
                divWrapLayout.setShowLineSeparators(this.toSeparatorMode(DivContainer.Separator.this, expressionResolver));
            }
        };
        divWrapLayout.addSubscription((separator == null || (expression3 = separator.showAtStart) == null) ? null : expression3.observe(expressionResolver, function1));
        divWrapLayout.addSubscription((separator == null || (expression2 = separator.showBetween) == null) ? null : expression2.observe(expressionResolver, function1));
        divWrapLayout.addSubscription((separator == null || (expression = separator.showAtEnd) == null) ? null : expression.observe(expressionResolver, function1));
        final DivContainer.Separator separator3 = divContainer.lineSeparator;
        DivContainer.Separator separator4 = divContainer2 != null ? divContainer2.lineSeparator : null;
        if (!DivDataExtensionsKt.equalsToConstant(separator3 != null ? separator3.style : null, separator4 != null ? separator4.style : null)) {
            DivDrawable divDrawable = separator3 != null ? separator3.style : null;
            divWrapLayout.setLineSeparatorDrawable(divDrawable != null ? DivUtilKt.toDrawable(divDrawable, divWrapLayout.getResources().getDisplayMetrics(), expressionResolver) : null);
            if (!DivDataExtensionsKt.isConstant(separator3 != null ? separator3.style : null)) {
                ExpressionSubscribersKt.observeDrawable(divWrapLayout, separator3 != null ? separator3.style : null, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m7177invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7177invoke(@NotNull Object obj) {
                        DivContainer.Separator separator5 = DivContainer.Separator.this;
                        DivDrawable divDrawable2 = separator5 != null ? separator5.style : null;
                        DivWrapLayout divWrapLayout2 = divWrapLayout;
                        divWrapLayout2.setLineSeparatorDrawable(divDrawable2 != null ? DivUtilKt.toDrawable(divDrawable2, divWrapLayout2.getResources().getDisplayMetrics(), expressionResolver) : null);
                    }
                });
            }
        }
        DivContainer.Separator separator5 = divContainer.lineSeparator;
        DivContainer.Separator separator6 = divContainer2 != null ? divContainer2.lineSeparator : null;
        if (DivDataExtensionsKt.equalsToConstant(separator5 != null ? separator5.margins : null, separator6 != null ? separator6.margins : null)) {
            return;
        }
        Rect rect = toRect(separator5 != null ? separator5.margins : null, divWrapLayout.getResources(), expressionResolver);
        divWrapLayout.setLineSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
        DivEdgeInsets divEdgeInsets = separator5 != null ? separator5.margins : null;
        if (divEdgeInsets == null || DivDataExtensionsKt.isConstant(divEdgeInsets)) {
            return;
        }
        final DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
        Function1 function12 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7175invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7175invoke(@NotNull Object obj) {
                Rect rect2 = this.toRect(DivEdgeInsets.this, divWrapLayout.getResources(), expressionResolver);
                divWrapLayout.setLineSeparatorMargins(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        };
        divWrapLayout.addSubscription(divEdgeInsets.top.observe(expressionResolver, function12));
        divWrapLayout.addSubscription(divEdgeInsets.bottom.observe(expressionResolver, function12));
        Expression expression4 = divEdgeInsets.start;
        if (expression4 != null || divEdgeInsets.end != null) {
            divWrapLayout.addSubscription(expression4 != null ? expression4.observe(expressionResolver, function12) : null);
            Expression expression5 = divEdgeInsets.end;
            divWrapLayout.addSubscription(expression5 != null ? expression5.observe(expressionResolver, function12) : null);
        } else {
            divWrapLayout.addSubscription(divEdgeInsets.left.observe(expressionResolver, function12));
            divWrapLayout.addSubscription(divEdgeInsets.right.observe(expressionResolver, function12));
        }
    }

    private final <T extends ViewGroup & DivHolderView<Div.Container>> void bindSeparatorShowMode(T t, final DivContainer.Separator separator, DivContainer.Separator separator2, final ExpressionResolver expressionResolver, final Function2 function2) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(separator != null ? separator.showAtStart : null, separator2 != null ? separator2.showAtStart : null)) {
            if (ExpressionsKt.equalsToConstant(separator != null ? separator.showBetween : null, separator2 != null ? separator2.showBetween : null)) {
                if (ExpressionsKt.equalsToConstant(separator != null ? separator.showAtEnd : null, separator2 != null ? separator2.showAtEnd : null)) {
                    return;
                }
            }
        }
        function2.invoke(separator, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showAtStart : null)) {
            if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showBetween : null)) {
                if (ExpressionsKt.isConstantOrNull(separator != null ? separator.showAtEnd : null)) {
                    return;
                }
            }
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparatorShowMode$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7190invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7190invoke(@NotNull Object obj) {
                Function2.this.invoke(separator, expressionResolver);
            }
        };
        DivHolderView divHolderView = (DivHolderView) t;
        divHolderView.addSubscription((separator == null || (expression3 = separator.showAtStart) == null) ? null : expression3.observe(expressionResolver, function1));
        divHolderView.addSubscription((separator == null || (expression2 = separator.showBetween) == null) ? null : expression2.observe(expressionResolver, function1));
        if (separator != null && (expression = separator.showAtEnd) != null) {
            disposable = expression.observe(expressionResolver, function1);
        }
        divHolderView.addSubscription(disposable);
    }

    private final <T extends ViewGroup & DivHolderView<Div.Container>> void bindSeparatorStyle(T t, final DivContainer.Separator separator, DivContainer.Separator separator2, final ExpressionResolver expressionResolver, final Function2 function2) {
        if (DivDataExtensionsKt.equalsToConstant(separator != null ? separator.style : null, separator2 != null ? separator2.style : null)) {
            return;
        }
        function2.invoke(separator != null ? separator.style : null, expressionResolver);
        if (DivDataExtensionsKt.isConstant(separator != null ? separator.style : null)) {
            return;
        }
        ExpressionSubscribersKt.observeDrawable((ExpressionSubscriber) t, separator != null ? separator.style : null, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparatorStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7191invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7191invoke(@NotNull Object obj) {
                Function2 function22 = Function2.this;
                DivContainer.Separator separator3 = separator;
                function22.invoke(separator3 != null ? separator3.style : null, expressionResolver);
            }
        });
    }

    private final <T extends ViewGroup & DivHolderView<Div.Container>> void bindSeparatorMargins(T t, DivContainer.Separator separator, DivContainer.Separator separator2, final ExpressionResolver expressionResolver, final Function2 function2) {
        if (DivDataExtensionsKt.equalsToConstant(separator != null ? separator.margins : null, separator2 != null ? separator2.margins : null)) {
            return;
        }
        function2.invoke(separator != null ? separator.margins : null, expressionResolver);
        final DivEdgeInsets divEdgeInsets = separator != null ? separator.margins : null;
        if (divEdgeInsets == null || DivDataExtensionsKt.isConstant(divEdgeInsets)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindSeparatorMargins$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7189invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7189invoke(@NotNull Object obj) {
                Function2.this.invoke(divEdgeInsets, expressionResolver);
            }
        };
        DivHolderView divHolderView = (DivHolderView) t;
        divHolderView.addSubscription(divEdgeInsets.top.observe(expressionResolver, function1));
        divHolderView.addSubscription(divEdgeInsets.bottom.observe(expressionResolver, function1));
        Expression expression = divEdgeInsets.start;
        if (expression != null || divEdgeInsets.end != null) {
            divHolderView.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
            Expression expression2 = divEdgeInsets.end;
            divHolderView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, function1) : null);
        } else {
            divHolderView.addSubscription(divEdgeInsets.left.observe(expressionResolver, function1));
            divHolderView.addSubscription(divEdgeInsets.right.observe(expressionResolver, function1));
        }
    }

    private final void bindChildAlignment(final View view, final DivContainer divContainer, DivContainer divContainer2, final DivBase divBase, DivBase divBase2, final ExpressionResolver expressionResolver, final ExpressionResolver expressionResolver2, ExpressionSubscriber expressionSubscriber, Div2View div2View) {
        if (!div2View.getComplexRebindInProgress$div_release() && divBase2 != null) {
            if (ExpressionsKt.equalsToConstant(divContainer.contentAlignmentHorizontal, divContainer2 != null ? divContainer2.contentAlignmentHorizontal : null)) {
                if (ExpressionsKt.equalsToConstant(divContainer.contentAlignmentVertical, divContainer2 != null ? divContainer2.contentAlignmentVertical : null) && ExpressionsKt.equalsToConstant(divBase.getAlignmentHorizontal(), divBase2.getAlignmentHorizontal()) && ExpressionsKt.equalsToConstant(divBase.getAlignmentVertical(), divBase2.getAlignmentVertical())) {
                    return;
                }
            }
        }
        applyChildAlignment(view, divContainer, divBase, expressionResolver, expressionResolver2);
        if (ExpressionsKt.isConstant(divContainer.contentAlignmentHorizontal) && ExpressionsKt.isConstant(divContainer.contentAlignmentVertical) && ExpressionsKt.isConstantOrNull(divBase.getAlignmentHorizontal()) && ExpressionsKt.isConstantOrNull(divBase.getAlignmentVertical())) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$bindChildAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7186invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7186invoke(@NotNull Object obj) {
                DivContainerBinder.this.applyChildAlignment(view, divContainer, divBase, expressionResolver, expressionResolver2);
            }
        };
        expressionSubscriber.addSubscription(divContainer.contentAlignmentHorizontal.observe(expressionResolver, function1));
        expressionSubscriber.addSubscription(divContainer.contentAlignmentVertical.observe(expressionResolver, function1));
        Expression alignmentHorizontal = divBase.getAlignmentHorizontal();
        expressionSubscriber.addSubscription(alignmentHorizontal != null ? alignmentHorizontal.observe(expressionResolver2, function1) : null);
        Expression alignmentVertical = divBase.getAlignmentVertical();
        expressionSubscriber.addSubscription(alignmentVertical != null ? alignmentVertical.observe(expressionResolver2, function1) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyChildAlignment(View view, DivContainer divContainer, DivBase divBase, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        DivAlignmentHorizontal alignmentHorizontal;
        Expression alignmentHorizontal2 = divBase.getAlignmentHorizontal();
        DivAlignmentVertical divAlignmentVertical = null;
        if (alignmentHorizontal2 != null) {
            alignmentHorizontal = (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver2);
        } else {
            alignmentHorizontal = DivUtilKt.isWrapContainer(divContainer, expressionResolver) ? null : DivUtilKt.toAlignmentHorizontal((DivContentAlignmentHorizontal) divContainer.contentAlignmentHorizontal.evaluate(expressionResolver));
        }
        Expression alignmentVertical = divBase.getAlignmentVertical();
        if (alignmentVertical != null) {
            divAlignmentVertical = (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver2);
        } else if (!DivUtilKt.isWrapContainer(divContainer, expressionResolver)) {
            divAlignmentVertical = DivUtilKt.toAlignmentVertical((DivContentAlignmentVertical) divContainer.contentAlignmentVertical.evaluate(expressionResolver));
        }
        BaseDivViewExtensionsKt.applyAlignment(view, alignmentHorizontal, divAlignmentVertical);
    }

    private final void checkCrossAxisSize(DivContainer divContainer, DivBase divBase, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            checkCrossAxisSize(divBase.getHeight(), divBase, errorCollector);
        } else {
            checkCrossAxisSize(divBase.getWidth(), divBase, errorCollector);
        }
    }

    private final void checkCrossAxisSize(DivSize divSize, DivBase divBase, ErrorCollector errorCollector) {
        checkSize(divSize, divBase, errorCollector, "wrap layout mode", "cross");
    }

    private final void checkMainAxisSize(DivContainer divContainer, DivBase divBase, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (DivUtilKt.isHorizontal(divContainer, expressionResolver)) {
            if (divContainer.getWidth() instanceof DivSize.WrapContent) {
                checkMainAxisSize(divBase.getWidth(), divBase, errorCollector);
            }
        } else if (divContainer.getHeight() instanceof DivSize.WrapContent) {
            DivAspect divAspect = divContainer.aspect;
            if (divAspect == null || ((float) ((Number) divAspect.ratio.evaluate(expressionResolver)).doubleValue()) == 0.0f) {
                checkMainAxisSize(divBase.getHeight(), divBase, errorCollector);
            }
        }
    }

    private final void checkMainAxisSize(DivSize divSize, DivBase divBase, ErrorCollector errorCollector) {
        checkSize(divSize, divBase, errorCollector, "wrap_content size", X3.i.Z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void checkSize(DivSize divSize, DivBase divBase, ErrorCollector errorCollector, String str, String str2) {
        String str3;
        if (divSize instanceof DivSize.MatchParent) {
            String id = divBase.getId();
            if (id != null) {
                str3 = " with id='" + id + '\'';
            }
            str3 = "";
            String format = String.format("Incorrect child size. Container with %s contains child%s with match_parent size along the %s axis.", Arrays.copyOf(new Object[]{str, str3, str2}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            errorCollector.logWarning(new Throwable(format));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setDataWithoutBinding(@NotNull BindingContext bindingContext, @NotNull ViewGroup view, @NotNull Div.Container div) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div.Container>");
        ((DivHolderView) view).setDiv(div);
        DivBinder divBinder = (DivBinder) this.divBinder.get();
        int i = 0;
        for (Object obj : DivCollectionExtensionsKt.buildItems(div.getValue(), bindingContext.getExpressionResolver())) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            View childAt = view.getChildAt(i);
            BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(childAt);
            if (bindingContext2 == null) {
                bindingContext2 = bindingContext;
            }
            divBinder.setDataWithoutBinding(bindingContext2, childAt, divItemBuilderResult.getDiv());
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect toRect(DivEdgeInsets divEdgeInsets, Resources resources, ExpressionResolver expressionResolver) {
        if (divEdgeInsets == null) {
            this.tempRect.set(0, 0, 0, 0);
            return this.tempRect;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        DivSizeUnit divSizeUnit = (DivSizeUnit) divEdgeInsets.unit.evaluate(expressionResolver);
        if (divEdgeInsets.start != null || divEdgeInsets.end != null) {
            if (resources.getConfiguration().getLayoutDirection() == 0) {
                Rect rect = this.tempRect;
                Expression expression = divEdgeInsets.start;
                rect.left = BaseDivViewExtensionsKt.unitToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics, divSizeUnit);
                Rect rect2 = this.tempRect;
                Expression expression2 = divEdgeInsets.end;
                rect2.right = BaseDivViewExtensionsKt.unitToPx(expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null, displayMetrics, divSizeUnit);
            } else {
                Rect rect3 = this.tempRect;
                Expression expression3 = divEdgeInsets.end;
                rect3.left = BaseDivViewExtensionsKt.unitToPx(expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null, displayMetrics, divSizeUnit);
                Rect rect4 = this.tempRect;
                Expression expression4 = divEdgeInsets.start;
                rect4.right = BaseDivViewExtensionsKt.unitToPx(expression4 != null ? (Long) expression4.evaluate(expressionResolver) : null, displayMetrics, divSizeUnit);
            }
        } else {
            this.tempRect.left = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.left.evaluate(expressionResolver), displayMetrics, divSizeUnit);
            this.tempRect.right = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.right.evaluate(expressionResolver), displayMetrics, divSizeUnit);
        }
        this.tempRect.top = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.top.evaluate(expressionResolver), displayMetrics, divSizeUnit);
        this.tempRect.bottom = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.bottom.evaluate(expressionResolver), displayMetrics, divSizeUnit);
        return this.tempRect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toOrientationMode(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toWrapDirection(DivContainer.Orientation orientation) {
        return WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()] == 1 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int toSeparatorMode(DivContainer.Separator separator, ExpressionResolver expressionResolver) {
        if (separator == null) {
            return 0;
        }
        boolean booleanValue = ((Boolean) separator.showAtStart.evaluate(expressionResolver)).booleanValue();
        ?? r0 = booleanValue;
        if (((Boolean) separator.showBetween.evaluate(expressionResolver)).booleanValue()) {
            r0 = (booleanValue ? 1 : 0) | 2;
        }
        return ((Boolean) separator.showAtEnd.evaluate(expressionResolver)).booleanValue() ? r0 | 4 : r0;
    }

    private final void checkItemSpacingIgnored(DivContainer div, ExpressionResolver resolver, ErrorCollector errorCollector) {
        long longValue = ((Number) div.itemSpacing.evaluate(resolver)).longValue();
        if (!showSeparatorBetween(toSeparatorMode(div.separator, resolver)) || longValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("item_spacing will be ignored due to the 'separator' property."));
    }

    private final void checkLineSpacingIgnored(DivContainer div, ExpressionResolver resolver, ErrorCollector errorCollector) {
        long longValue = ((Number) div.lineSpacing.evaluate(resolver)).longValue();
        if (!showSeparatorBetween(toSeparatorMode(div.lineSeparator, resolver)) || longValue == 0) {
            return;
        }
        errorCollector.logWarning(new Throwable("line_spacing will be ignored due to the 'line_separator' property."));
    }
}
