package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.reporters.b;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.R;
import com.yandex.div.core.widget.GridContainer;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GridContainer.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0011\u0018\u0000 K2\u00020\u0001:\u0007IJKLMNOB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J(\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010#\u001a\u00020\u0007H\u0002J\b\u0010$\u001a\u00020\u0007H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020&H\u0002J0\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u0018\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0002J@\u00102\u001a\u00020&2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002J0\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0014J\u0018\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0014J\u0010\u0010<\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010=\u001a\u00020&2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010>\u001a\u00020&2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0002J\u0018\u0010?\u001a\u00020&2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0002J\b\u0010@\u001a\u00020&H\u0016J\b\u0010A\u001a\u00020&H\u0002J\u001b\u00108\u001a\u00020\u0007*\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0082\bJ\u001b\u0010F\u001a\u00020\u0007*\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0082\bJ\u001b\u00105\u001a\u00020\u0007*\u00020B2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020E0DH\u0082\bJ\u001b\u00107\u001a\u00020\u0007*\u00020B2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020E0DH\u0082\bJ\u001b\u00106\u001a\u00020\u0007*\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0082\bJ\u001b\u0010H\u001a\u00020\u0007*\u00020B2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020E0DH\u0082\bR$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\f¨\u0006P"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "columnCount", "getColumnCount", "()I", "setColumnCount", "(I)V", "grid", "Lcom/yandex/div/core/widget/GridContainer$Grid;", "initialized", "", "lastLayoutHashCode", "paddingHorizontal", "getPaddingHorizontal", "paddingVertical", "getPaddingVertical", "rowCount", "getRowCount", "calculateChildHorizontalPosition", "cellLeft", "cellWidth", "childWidth", "gravity", "calculateChildVerticalPosition", "cellTop", "cellHeight", "childHeight", "calculateGridHorizontalPosition", "calculateGridVerticalPosition", "checkConsistency", "", "computeLayoutHashCode", "invalidateMeasurement", "invalidateStructure", "measureChild", "child", "Landroid/view/View;", "parentWidthSpec", "parentHeightSpec", "measureChildrenInitial", "widthSpec", "heightSpec", "measureMatchParentChild", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onViewAdded", "onViewRemoved", "remeasureChildrenHeight", "remeasureChildrenWidth", "requestLayout", "validateLayoutParams", "Lcom/yandex/div/core/widget/GridContainer$Cell;", "rows", "", "Lcom/yandex/div/core/widget/GridContainer$Line;", "height", "columns", "width", "Cell", "CellProjection", "Companion", "Grid", "Line", "SizeConstraint", "SpannedCellComparator", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes9.dex */
public class GridContainer extends DivViewGroup {
    private static final int DEFAULT_COLUMN_COUNT = 1;
    private static final int MAX_SIZE = 32768;

    @NotNull
    private static final String TAG = "GridContainer";
    private static final int UNINITIALIZED_HASH = 0;

    @NotNull
    private final Grid grid;
    private boolean initialized;
    private int lastLayoutHashCode;

    public GridContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public GridContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010(\u001a\u00020\u0019H\u0002J\u0016\u0010)\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J?\u0010*\u001a\u00020&2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,H\u0082\bJ?\u0010/\u001a\u00020&2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,H\u0082\bJ\u0016\u00100\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0006\u00102\u001a\u00020&J\u0006\u00103\u001a\u00020&J9\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u00105\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00192\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,H\u0082\bJ\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J\u000e\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000eJ\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J\u000e\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eJ\u0012\u0010\u001e\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u001c\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\fR\u0014\u0010\"\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u000e\u0010$\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$Grid;", "", "(Lcom/yandex/div/core/widget/GridContainer;)V", "_cells", "Lcom/yandex/div/core/widget/Resettable;", "", "Lcom/yandex/div/core/widget/GridContainer$Cell;", "_columns", "Lcom/yandex/div/core/widget/GridContainer$Line;", "_rows", "cells", "getCells", "()Ljava/util/List;", "value", "", "columnCount", "getColumnCount", "()I", "setColumnCount", "(I)V", "columns", "getColumns", "height", "getHeight", "heightConstraint", "Lcom/yandex/div/core/widget/GridContainer$SizeConstraint;", "measuredHeight", "getMeasuredHeight", "measuredWidth", "getMeasuredWidth", "rowCount", "getRowCount", "rows", "getRows", "width", "getWidth", "widthConstraint", "adjustWeightedLines", "", b.d, "constraint", "align", "applyFixedParamsToLines", "projection", "Lkotlin/Function2;", "Landroid/view/View;", "Lcom/yandex/div/core/widget/GridContainer$CellProjection;", "applySpansToLines", "calculateSize", "distributeCells", "invalidateMeasurement", "invalidateStructure", "measureAxis", "count", "measureColumns", "measureHeight", "heightSpec", "measureRows", "measureWidth", "widthSpec", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class Grid {

        @NotNull
        private final SizeConstraint heightConstraint;

        @NotNull
        private final SizeConstraint widthConstraint;
        private int columnCount = 1;

        @NotNull
        private final Resettable<List<Cell>> _cells = new Resettable<>(new Function0() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_cells$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final List<GridContainer.Cell> mo4828invoke() {
                List<GridContainer.Cell> distributeCells;
                distributeCells = GridContainer.Grid.this.distributeCells();
                return distributeCells;
            }
        });

        @NotNull
        private final Resettable<List<Line>> _columns = new Resettable<>(new Function0() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_columns$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final List<GridContainer.Line> mo4828invoke() {
                List<GridContainer.Line> measureColumns;
                measureColumns = GridContainer.Grid.this.measureColumns();
                return measureColumns;
            }
        });

        @NotNull
        private final Resettable<List<Line>> _rows = new Resettable<>(new Function0() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_rows$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final List<GridContainer.Line> mo4828invoke() {
                List<GridContainer.Line> measureRows;
                measureRows = GridContainer.Grid.this.measureRows();
                return measureRows;
            }
        });

        private final void adjustWeightedLines(List<Line> lines, SizeConstraint constraint) {
            int size;
            int size2 = lines.size();
            float f = 0.0f;
            int i = 0;
            float f2 = 0.0f;
            for (int i2 = 0; i2 < size2; i2++) {
                Line line = lines.get(i2);
                if (line.isFlexible()) {
                    f += line.getWeight();
                    f2 = Math.max(f2, line.getSize() / line.getWeight());
                } else {
                    i += line.getSize();
                }
                line.getSize();
            }
            int size3 = lines.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size3; i4++) {
                Line line2 = lines.get(i4);
                if (line2.isFlexible()) {
                    size = (int) Math.ceil(line2.getWeight() * f2);
                } else {
                    size = line2.getSize();
                }
                i3 += size;
            }
            float max = Math.max(0, Math.max(constraint.min, i3) - i) / f;
            int size4 = lines.size();
            for (int i5 = 0; i5 < size4; i5++) {
                Line line3 = lines.get(i5);
                if (line3.isFlexible()) {
                    int ceil = (int) Math.ceil(line3.getWeight() * max);
                    Line.include$default(line3, ceil - line3.getMarginSize(), ceil, 0.0f, 4, null);
                }
            }
        }

        public Grid() {
            int i = 0;
            int i2 = 3;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.widthConstraint = new SizeConstraint(i, i, i2, defaultConstructorMarker);
            this.heightConstraint = new SizeConstraint(i, i, i2, defaultConstructorMarker);
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        public final void setColumnCount(int i) {
            if (i <= 0 || this.columnCount == i) {
                return;
            }
            this.columnCount = i;
            invalidateStructure();
        }

        public final int getRowCount() {
            return rowCount(getCells());
        }

        @NotNull
        public final List<Cell> getCells() {
            return this._cells.get();
        }

        @NotNull
        public final List<Line> getColumns() {
            return this._columns.get();
        }

        @NotNull
        public final List<Line> getRows() {
            return this._rows.get();
        }

        public final int getMeasuredWidth() {
            if (this._columns.getInitialized()) {
                return calculateSize(this._columns.get());
            }
            return 0;
        }

        public final int getMeasuredHeight() {
            if (this._rows.getInitialized()) {
                return calculateSize(this._rows.get());
            }
            return 0;
        }

        private final int getWidth() {
            return calculateSize(getColumns());
        }

        private final int getHeight() {
            return calculateSize(getRows());
        }

        private final int rowCount(List<Cell> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Cell cell = (Cell) kotlin.collections.CollectionsKt.last((List) list);
            return cell.rowSpan + cell.rowIndex;
        }

        public final void invalidateStructure() {
            this._cells.reset();
            invalidateMeasurement();
        }

        public final void invalidateMeasurement() {
            this._columns.reset();
            this._rows.reset();
        }

        public final int measureWidth(int widthSpec) {
            this.widthConstraint.set(widthSpec);
            return Math.max(this.widthConstraint.min, Math.min(getWidth(), this.widthConstraint.max));
        }

        public final int measureHeight(int heightSpec) {
            this.heightConstraint.set(heightSpec);
            return Math.max(this.heightConstraint.min, Math.min(getHeight(), this.heightConstraint.max));
        }

        private final int calculateSize(List<Line> lines) {
            if (lines.isEmpty()) {
                return 0;
            }
            Line line = (Line) kotlin.collections.CollectionsKt.last((List) lines);
            return line.getOffset() + line.getSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Cell> distributeCells() {
            Integer valueOf;
            int i;
            int i2;
            int i3 = 1;
            if (GridContainer.this.getChildCount() == 0) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            int i4 = this.columnCount;
            ArrayList arrayList = new ArrayList(GridContainer.this.getChildCount());
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            GridContainer gridContainer = GridContainer.this;
            int childCount = gridContainer.getChildCount();
            int i5 = 0;
            int i6 = 0;
            while (i6 < childCount) {
                View childAt = gridContainer.getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    Integer minOrNull = ArraysKt.minOrNull(iArr2);
                    int intValue = minOrNull != null ? minOrNull.intValue() : 0;
                    int indexOf = ArraysKt.indexOf(iArr2, intValue);
                    int i7 = i5 + intValue;
                    IntRange until = RangesKt.until(0, i4);
                    int first = until.getFirst();
                    int last = until.getLast();
                    if (first <= last) {
                        while (true) {
                            iArr2[first] = Math.max(0, iArr2[first] - intValue);
                            if (first == last) {
                                break;
                            }
                            first += i3;
                        }
                    }
                    DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int min = Math.min(divLayoutParams.getColumnSpan(), i4 - indexOf);
                    int rowSpan = divLayoutParams.getRowSpan();
                    arrayList.add(new Cell(i6, indexOf, i7, min, rowSpan));
                    int i8 = indexOf + min;
                    int i9 = indexOf;
                    while (i9 < i8) {
                        if (iArr2[i9] > 0) {
                            Cell cell = (Cell) arrayList.get(iArr[i9]);
                            int i10 = cell.columnIndex;
                            int i11 = cell.columnSpan + i10;
                            while (i10 < i11) {
                                int i12 = iArr2[i10];
                                iArr2[i10] = 0;
                                i10++;
                            }
                            i2 = 1;
                            cell.rowSpan = i7 - cell.rowIndex;
                        } else {
                            i2 = 1;
                        }
                        iArr[i9] = i6;
                        iArr2[i9] = rowSpan;
                        i9 += i2;
                    }
                    i = 1;
                    i5 = i7;
                } else {
                    i = i3;
                }
                i6 += i;
                i3 = i;
            }
            int i13 = i3;
            if (i4 == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(RangesKt.coerceAtLeast(iArr2[0], i13));
                IntIterator it = new IntRange(i13, ArraysKt.getLastIndex(iArr2)).iterator();
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(RangesKt.coerceAtLeast(iArr2[it.nextInt()], i13));
                    if (valueOf.compareTo(valueOf2) > 0) {
                        valueOf = valueOf2;
                    }
                    i13 = 1;
                }
            }
            int intValue2 = ((Cell) kotlin.collections.CollectionsKt.last((List) arrayList)).rowIndex + (valueOf != null ? valueOf.intValue() : 1);
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                Cell cell2 = (Cell) arrayList.get(i14);
                int i15 = cell2.rowIndex;
                if (cell2.rowSpan + i15 > intValue2) {
                    cell2.rowSpan = intValue2 - i15;
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureColumns() {
            int i;
            float f;
            int i2;
            float columnWeight;
            float columnWeight2;
            int i3;
            int i4 = this.columnCount;
            SizeConstraint sizeConstraint = this.widthConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Cell cell = list.get(i6);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i7 = cell.columnIndex;
                int measuredWidth = childAt.getMeasuredWidth();
                int i8 = ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                int i9 = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                int i10 = cell.columnSpan;
                columnWeight2 = GridContainerKt.getColumnWeight(divLayoutParams);
                CellProjection cellProjection = new CellProjection(i7, measuredWidth, i8, i9, i10, columnWeight2);
                int i11 = cellProjection.span;
                if (i11 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i12 = i11 - 1;
                    float f2 = cellProjection.weight / i11;
                    if (i12 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i3), 0, 0, f2, 3, null);
                            i3 = i3 != i12 ? i3 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Cell cell2 = list.get(i13);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                int i14 = cell2.columnIndex;
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int i15 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).leftMargin;
                int i16 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).rightMargin;
                int i17 = cell2.columnSpan;
                columnWeight = GridContainerKt.getColumnWeight(divLayoutParams2);
                CellProjection cellProjection2 = new CellProjection(i14, measuredWidth2, i15, i16, i17, columnWeight);
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            kotlin.collections.CollectionsKt.sortWith(arrayList2, SpannedCellComparator.INSTANCE);
            int size3 = arrayList2.size();
            for (int i18 = 0; i18 < size3; i18++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i18);
                int i19 = cellProjection3.index;
                int i20 = (cellProjection3.span + i19) - 1;
                int size4 = cellProjection3.getSize();
                if (i19 <= i20) {
                    int i21 = i19;
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i21);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            f += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i2++;
                            }
                            i -= line.getSize();
                        }
                        if (i21 == i20) {
                            break;
                        }
                        i21++;
                    }
                } else {
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                }
                if (f > 0.0f) {
                    if (i19 <= i20) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i19);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f) * i);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, 0.0f, 4, null);
                            }
                            if (i19 == i20) {
                                break;
                            }
                            i19++;
                        }
                    }
                } else if (size4 > 0 && i19 <= i20) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i19);
                        if (i2 <= 0) {
                            int i22 = size4 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i23 = size4 / i2;
                            Line.include$default(line3, line3.getContentSize() + i23, line3.getSize() + i23, 0.0f, 4, null);
                        }
                        if (i19 == i20) {
                            break;
                        }
                        i19++;
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureRows() {
            int i;
            float f;
            int i2;
            float rowWeight;
            float rowWeight2;
            int i3;
            int rowCount = getRowCount();
            SizeConstraint sizeConstraint = this.heightConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(rowCount);
            for (int i4 = 0; i4 < rowCount; i4++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Cell cell = list.get(i5);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i6 = cell.rowIndex;
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                int i8 = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                int i9 = cell.rowSpan;
                rowWeight2 = GridContainerKt.getRowWeight(divLayoutParams);
                CellProjection cellProjection = new CellProjection(i6, measuredHeight, i7, i8, i9, rowWeight2);
                int i10 = cellProjection.span;
                if (i10 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i11 = i10 - 1;
                    float f2 = cellProjection.weight / i10;
                    if (i11 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i3), 0, 0, f2, 3, null);
                            i3 = i3 != i11 ? i3 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Cell cell2 = list.get(i12);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.INSTANCE;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                int i13 = cell2.rowIndex;
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin;
                int i15 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin;
                int i16 = cell2.rowSpan;
                rowWeight = GridContainerKt.getRowWeight(divLayoutParams2);
                CellProjection cellProjection2 = new CellProjection(i13, measuredHeight2, i14, i15, i16, rowWeight);
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            kotlin.collections.CollectionsKt.sortWith(arrayList2, SpannedCellComparator.INSTANCE);
            int size3 = arrayList2.size();
            for (int i17 = 0; i17 < size3; i17++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i17);
                int i18 = cellProjection3.index;
                int i19 = (cellProjection3.span + i18) - 1;
                int size4 = cellProjection3.getSize();
                if (i18 <= i19) {
                    int i20 = i18;
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i20);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            f += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i2++;
                            }
                            i -= line.getSize();
                        }
                        if (i20 == i19) {
                            break;
                        }
                        i20++;
                    }
                } else {
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                }
                if (f > 0.0f) {
                    if (i18 <= i19) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i18);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f) * i);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, 0.0f, 4, null);
                            }
                            if (i18 == i19) {
                                break;
                            }
                            i18++;
                        }
                    }
                } else if (size4 > 0 && i18 <= i19) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i18);
                        if (i2 <= 0) {
                            int i21 = size4 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i21, line3.getSize() + i21, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i22 = size4 / i2;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        }
                        if (i18 == i19) {
                            break;
                        }
                        i18++;
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        private final List<Line> measureAxis(int count, SizeConstraint constraint, Function2 projection) {
            int i;
            float f;
            int i2;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(count);
            for (int i3 = 0; i3 < count; i3++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Cell cell = list.get(i4);
                CellProjection cellProjection = (CellProjection) projection.invoke(cell, gridContainer.getChildAt(cell.viewIndex));
                int i5 = cellProjection.span;
                if (i5 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i6 = i5 - 1;
                    float f2 = cellProjection.weight / i5;
                    if (i6 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i2), 0, 0, f2, 3, null);
                            i2 = i2 != i6 ? i2 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Cell cell2 = list.get(i7);
                CellProjection cellProjection2 = (CellProjection) projection.invoke(cell2, gridContainer2.getChildAt(cell2.viewIndex));
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            kotlin.collections.CollectionsKt.sortWith(arrayList2, SpannedCellComparator.INSTANCE);
            int size3 = arrayList2.size();
            for (int i8 = 0; i8 < size3; i8++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i8);
                int i9 = cellProjection3.index;
                int i10 = (cellProjection3.span + i9) - 1;
                int size4 = cellProjection3.getSize();
                int i11 = 0;
                if (i9 <= i10) {
                    int i12 = i9;
                    i = size4;
                    f = 0.0f;
                    while (true) {
                        Line line = (Line) arrayList.get(i12);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            f += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i11++;
                            }
                            i -= line.getSize();
                        }
                        if (i12 == i10) {
                            break;
                        }
                        i12++;
                    }
                } else {
                    i = size4;
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    if (i9 <= i10) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i9);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f) * i);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, 0.0f, 4, null);
                            }
                            if (i9 != i10) {
                                i9++;
                            }
                        }
                    }
                } else if (size4 > 0 && i9 <= i10) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i9);
                        if (i11 > 0) {
                            if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                                int i13 = size4 / i11;
                                Line.include$default(line3, line3.getContentSize() + i13, line3.getSize() + i13, 0.0f, 4, null);
                            }
                        } else {
                            int i14 = size4 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i14, line3.getSize() + i14, 0.0f, 4, null);
                        }
                        if (i9 != i10) {
                            i9++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, constraint);
            align(arrayList);
            return arrayList;
        }

        private final void applyFixedParamsToLines(List<Cell> cells, List<Line> lines, Function2 projection) {
            int i;
            GridContainer gridContainer = GridContainer.this;
            int size = cells.size();
            for (int i2 = 0; i2 < size; i2++) {
                Cell cell = cells.get(i2);
                CellProjection cellProjection = (CellProjection) projection.invoke(cell, gridContainer.getChildAt(cell.viewIndex));
                int i3 = cellProjection.span;
                if (i3 == 1) {
                    lines.get(cellProjection.index).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i4 = i3 - 1;
                    float f = cellProjection.weight / i3;
                    if (i4 >= 0) {
                        while (true) {
                            Line.include$default(lines.get(cellProjection.index + i), 0, 0, f, 3, null);
                            i = i != i4 ? i + 1 : 0;
                        }
                    }
                }
            }
        }

        private final void applySpansToLines(List<Cell> cells, List<Line> lines, Function2 projection) {
            int i;
            float f;
            ArrayList arrayList = new ArrayList();
            GridContainer gridContainer = GridContainer.this;
            int size = cells.size();
            for (int i2 = 0; i2 < size; i2++) {
                Cell cell = cells.get(i2);
                CellProjection cellProjection = (CellProjection) projection.invoke(cell, gridContainer.getChildAt(cell.viewIndex));
                if (cellProjection.span > 1) {
                    arrayList.add(cellProjection);
                }
            }
            kotlin.collections.CollectionsKt.sortWith(arrayList, SpannedCellComparator.INSTANCE);
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                CellProjection cellProjection2 = (CellProjection) arrayList.get(i3);
                int i4 = cellProjection2.index;
                int i5 = (cellProjection2.span + i4) - 1;
                int size3 = cellProjection2.getSize();
                int i6 = 0;
                if (i4 <= i5) {
                    int i7 = i4;
                    i = size3;
                    f = 0.0f;
                    while (true) {
                        Line line = lines.get(i7);
                        size3 -= line.getSize();
                        if (line.isFlexible()) {
                            f += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i6++;
                            }
                            i -= line.getSize();
                        }
                        if (i7 == i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else {
                    i = size3;
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    if (i4 <= i5) {
                        while (true) {
                            Line line2 = lines.get(i4);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f) * i);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, 0.0f, 4, null);
                            }
                            if (i4 != i5) {
                                i4++;
                            }
                        }
                    }
                } else if (size3 > 0 && i4 <= i5) {
                    while (true) {
                        Line line3 = lines.get(i4);
                        if (i6 > 0) {
                            if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                                int i8 = size3 / i6;
                                Line.include$default(line3, line3.getContentSize() + i8, line3.getSize() + i8, 0.0f, 4, null);
                            }
                        } else {
                            int i9 = size3 / cellProjection2.span;
                            Line.include$default(line3, line3.getContentSize() + i9, line3.getSize() + i9, 0.0f, 4, null);
                        }
                        if (i4 != i5) {
                            i4++;
                        }
                    }
                }
            }
        }

        private final void align(List<Line> lines) {
            int size = lines.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Line line = lines.get(i2);
                line.setOffset(i);
                i += line.getSize();
            }
        }
    }

    public /* synthetic */ GridContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public GridContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.grid = new Grid();
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GridContainer, i, 0);
            try {
                setColumnCount(obtainStyledAttributes.getInt(R.styleable.GridContainer_android_columnCount, 1));
                setGravity(obtainStyledAttributes.getInt(R.styleable.GridContainer_android_gravity, DivLayoutParams.DEFAULT_GRAVITY));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.initialized = true;
    }

    public final int getColumnCount() {
        return this.grid.getColumnCount();
    }

    public final void setColumnCount(int i) {
        this.grid.setColumnCount(i);
        invalidateStructure();
        requestLayout();
    }

    public final int getRowCount() {
        return this.grid.getRowCount();
    }

    private final int getPaddingHorizontal() {
        return getPaddingLeft() + getPaddingRight();
    }

    private final int getPaddingVertical() {
        return getPaddingTop() + getPaddingBottom();
    }

    private final int computeLayoutHashCode() {
        int childCount = getChildCount();
        int i = Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                i = (i * 31) + ((DivLayoutParams) layoutParams).hashCode();
            }
        }
        return i;
    }

    private final void measureChildrenInitial(int widthSpec, int heightSpec) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i2 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i3 = i2 == -1 ? 0 : i2;
                int i4 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                measureChild(childAt, widthSpec, heightSpec, i3, i4 == -1 ? 0 : i4);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@NotNull View child) {
        super.onViewAdded(child);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@NotNull View child) {
        super.onViewRemoved(child);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.initialized) {
            invalidateMeasurement();
        }
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        invalidateMeasurement();
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec - paddingHorizontal), View.MeasureSpec.getMode(widthMeasureSpec));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec - paddingVertical), View.MeasureSpec.getMode(heightMeasureSpec));
        measureChildrenInitial(makeMeasureSpec, makeMeasureSpec2);
        int measureWidth = this.grid.measureWidth(makeMeasureSpec);
        remeasureChildrenWidth(makeMeasureSpec, makeMeasureSpec2);
        int measureHeight = this.grid.measureHeight(makeMeasureSpec2);
        remeasureChildrenHeight(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(measureWidth + paddingHorizontal, getSuggestedMinimumWidth()), widthMeasureSpec, 0), View.resolveSizeAndState(Math.max(measureHeight + paddingVertical, getSuggestedMinimumHeight()), heightMeasureSpec, 0));
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, TAG, "onMeasure() performed in " + elapsedRealtime2 + " ms");
        }
    }

    private final void measureChild(View child, int parentWidthSpec, int parentHeightSpec, int childWidth, int childHeight) {
        DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
        int minimumWidth = child.getMinimumWidth();
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int childMeasureSpec = companion.getChildMeasureSpec(parentWidthSpec, 0, childWidth, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        int minimumHeight = child.getMinimumHeight();
        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        child.measure(childMeasureSpec, companion.getChildMeasureSpec(parentHeightSpec, 0, childHeight, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight()));
    }

    private final void remeasureChildrenWidth(int widthSpec, int heightSpec) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
                    Cell cell = cells.get(i);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    measureMatchParentChild(childAt, widthSpec, heightSpec, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release(), 0);
                }
                i++;
            }
        }
    }

    private final void remeasureChildrenHeight(int widthSpec, int heightSpec) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    Cell cell = cells.get(i);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                    measureMatchParentChild(childAt, widthSpec, heightSpec, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, ((line2.getOffset() + line2.getSize()) - rows.get(cell.rowIndex).getOffset()) - divLayoutParams.getVerticalMargins$div_release());
                }
                i++;
            }
        }
    }

    private final void measureMatchParentChild(View child, int parentWidthSpec, int parentHeightSpec, int childWidth, int childHeight, int cellWidth, int cellHeight) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (childWidth == -1) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(cellWidth, 1073741824);
        } else {
            DivViewGroup.Companion companion = DivViewGroup.INSTANCE;
            int minimumWidth = child.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec = companion.getChildMeasureSpec(parentWidthSpec, 0, childWidth, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        }
        if (childHeight == -1) {
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(cellHeight, 1073741824);
        } else {
            DivViewGroup.Companion companion2 = DivViewGroup.INSTANCE;
            int minimumHeight = child.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec2 = companion2.getChildMeasureSpec(parentHeightSpec, 0, childHeight, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight());
        }
        child.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        List<Line> list;
        List<Cell> list2;
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        List<Cell> cells = this.grid.getCells();
        int calculateGridHorizontalPosition = calculateGridHorizontalPosition();
        int calculateGridVerticalPosition = calculateGridVerticalPosition();
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                Cell cell = cells.get(i3);
                int offset = columns.get(cell.columnIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                list2 = cells;
                int offset2 = rows.get(cell.rowIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                i = childCount;
                Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                int offset3 = ((line.getOffset() + line.getSize()) - offset) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                int offset4 = ((line2.getOffset() + line2.getSize()) - offset2) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                list = columns;
                int calculateChildHorizontalPosition = calculateChildHorizontalPosition(offset, offset3, childAt.getMeasuredWidth(), divLayoutParams.getGravity()) + calculateGridHorizontalPosition;
                int calculateChildVerticalPosition = calculateChildVerticalPosition(offset2, offset4, childAt.getMeasuredHeight(), divLayoutParams.getGravity()) + calculateGridVerticalPosition;
                childAt.layout(calculateChildHorizontalPosition, calculateChildVerticalPosition, childAt.getMeasuredWidth() + calculateChildHorizontalPosition, childAt.getMeasuredHeight() + calculateChildVerticalPosition);
                i3++;
            } else {
                list = columns;
                list2 = cells;
                i = childCount;
            }
            i2++;
            cells = list2;
            childCount = i;
            columns = list;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, TAG, "onLayout() performed in " + elapsedRealtime2 + " ms");
        }
    }

    private final int calculateGridHorizontalPosition() {
        int gravity = getGravity() & 7;
        int measuredWidth = this.grid.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (gravity == 1) {
            return getPaddingLeft() + ((measuredWidth2 - measuredWidth) / 2);
        }
        if (gravity == 5) {
            return (getPaddingLeft() + measuredWidth2) - measuredWidth;
        }
        return getPaddingLeft();
    }

    private final int calculateGridVerticalPosition() {
        int gravity = getGravity() & 112;
        int measuredHeight = this.grid.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (gravity == 16) {
            return getPaddingTop() + ((measuredHeight2 - measuredHeight) / 2);
        }
        if (gravity == 80) {
            return (getPaddingTop() + measuredHeight2) - measuredHeight;
        }
        return getPaddingTop();
    }

    private final int calculateChildHorizontalPosition(int cellLeft, int cellWidth, int childWidth, int gravity) {
        int i = gravity & 7;
        if (i != 1) {
            return i != 5 ? cellLeft : (cellLeft + cellWidth) - childWidth;
        }
        return cellLeft + ((cellWidth - childWidth) / 2);
    }

    private final int calculateChildVerticalPosition(int cellTop, int cellHeight, int childHeight, int gravity) {
        int i = gravity & 112;
        if (i != 16) {
            return i != 80 ? cellTop : (cellTop + cellHeight) - childHeight;
        }
        return cellTop + ((cellHeight - childHeight) / 2);
    }

    private final void invalidateStructure() {
        this.lastLayoutHashCode = 0;
        this.grid.invalidateStructure();
    }

    private final void invalidateMeasurement() {
        this.grid.invalidateMeasurement();
    }

    private final void checkConsistency() {
        int i = this.lastLayoutHashCode;
        if (i == 0) {
            validateLayoutParams();
            this.lastLayoutHashCode = computeLayoutHashCode();
        } else if (i != computeLayoutHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private final void validateLayoutParams() {
        float columnWeight;
        float rowWeight;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getColumnSpan() >= 0 && divLayoutParams.getRowSpan() >= 0) {
                columnWeight = GridContainerKt.getColumnWeight(divLayoutParams);
                if (columnWeight >= 0.0f) {
                    rowWeight = GridContainerKt.getRowWeight(divLayoutParams);
                    if (rowWeight >= 0.0f) {
                    }
                }
                throw new IllegalStateException("Negative weights are not supported.");
            }
            throw new IllegalStateException("Negative spans are not supported.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$Cell;", "", "viewIndex", "", "columnIndex", "rowIndex", "columnSpan", "rowSpan", "(IIIII)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Cell {
        public final int columnIndex;
        public int columnSpan;
        public final int rowIndex;
        public int rowSpan;
        public final int viewIndex;

        public Cell(int i, int i2, int i3, int i4, int i5) {
            this.viewIndex = i;
            this.columnIndex = i2;
            this.rowIndex = i3;
            this.columnSpan = i4;
            this.rowSpan = i5;
        }
    }

    private final int left(Cell cell, List<Line> list) {
        return list.get(cell.columnIndex).getOffset();
    }

    private final int right(Cell cell, List<Line> list) {
        Line line = list.get((cell.columnIndex + cell.columnSpan) - 1);
        return line.getOffset() + line.getSize();
    }

    private final int width(Cell cell, List<Line> list) {
        Line line = list.get((cell.columnIndex + cell.columnSpan) - 1);
        return (line.getOffset() + line.getSize()) - list.get(cell.columnIndex).getOffset();
    }

    private final int top(Cell cell, List<Line> list) {
        return list.get(cell.rowIndex).getOffset();
    }

    private final int bottom(Cell cell, List<Line> list) {
        Line line = list.get((cell.rowIndex + cell.rowSpan) - 1);
        return line.getOffset() + line.getSize();
    }

    private final int height(Cell cell, List<Line> list) {
        Line line = list.get((cell.rowIndex + cell.rowSpan) - 1);
        return (line.getOffset() + line.getSize()) - list.get(cell.rowIndex).getOffset();
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$CellProjection;", "", "index", "", "contentSize", "marginStart", "marginEnd", "span", "weight", "", "(IIIIIF)V", "size", "getSize", "()I", "specificSize", "getSpecificSize", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CellProjection {
        public final int contentSize;
        public final int index;
        public final int marginEnd;
        public final int marginStart;
        public final int span;
        public final float weight;

        public CellProjection(int i, int i2, int i3, int i4, int i5, float f) {
            this.index = i;
            this.contentSize = i2;
            this.marginStart = i3;
            this.marginEnd = i4;
            this.span = i5;
            this.weight = f;
        }

        public final int getSize() {
            return this.contentSize + this.marginStart + this.marginEnd;
        }

        public final int getSpecificSize() {
            return getSize() / this.span;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$Line;", "", "()V", "<set-?>", "", "contentSize", "getContentSize", "()I", "isFlexible", "", "()Z", "marginSize", "getMarginSize", "offset", "getOffset", "setOffset", "(I)V", "size", "getSize", "", "weight", "getWeight", "()F", POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE, "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Line {
        private int contentSize;
        private int offset;
        private int size;
        private float weight;

        public final int getOffset() {
            return this.offset;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final int getContentSize() {
            return this.contentSize;
        }

        public final int getSize() {
            return this.size;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final int getMarginSize() {
            return this.size - this.contentSize;
        }

        public final boolean isFlexible() {
            return this.weight > 0.0f;
        }

        public static /* synthetic */ void include$default(Line line, int i, int i2, float f, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            line.include(i, i2, f);
        }

        public final void include(int contentSize, int size, float weight) {
            this.contentSize = Math.max(this.contentSize, contentSize);
            this.size = Math.max(this.size, size);
            this.weight = Math.max(this.weight, weight);
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$SizeConstraint;", "", "min", "", "max", "(II)V", "set", "", "measureSpec", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SizeConstraint {
        public int max;
        public int min;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SizeConstraint() {
            this(r2, r2, 3, null);
            int i = 0;
        }

        public SizeConstraint(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public /* synthetic */ SizeConstraint(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 32768 : i2);
        }

        public final void set(int measureSpec) {
            int mode = View.MeasureSpec.getMode(measureSpec);
            int size = View.MeasureSpec.getSize(measureSpec);
            if (mode == Integer.MIN_VALUE) {
                this.min = 0;
                this.max = size;
            } else if (mode == 0) {
                this.min = 0;
                this.max = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.min = size;
                this.max = size;
            }
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/widget/GridContainer$SpannedCellComparator;", "Ljava/util/Comparator;", "Lcom/yandex/div/core/widget/GridContainer$CellProjection;", "Lkotlin/Comparator;", "()V", "compare", "", "lhs", "rhs", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class SpannedCellComparator implements Comparator<CellProjection> {

        @NotNull
        public static final SpannedCellComparator INSTANCE = new SpannedCellComparator();

        private SpannedCellComparator() {
        }

        @Override // java.util.Comparator
        public int compare(@NotNull CellProjection lhs, @NotNull CellProjection rhs) {
            if (lhs.getSpecificSize() < rhs.getSpecificSize()) {
                return 1;
            }
            return lhs.getSpecificSize() > rhs.getSpecificSize() ? -1 : 0;
        }
    }
}
