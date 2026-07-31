package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.data.Variable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: VariableMonitorView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0001H\u0002J\"\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableMonitorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "variableMonitor", "Lcom/yandex/div/core/view2/errors/VariableMonitor;", "(Landroid/content/Context;Lcom/yandex/div/core/view2/errors/VariableMonitor;)V", "title", "variablesAdapter", "Lcom/yandex/div/core/view2/errors/VariableAdapter;", "createCellTitle", "Landroid/widget/TextView;", "", "createTable", "Landroidx/recyclerview/widget/RecyclerView;", "createTableTitle", "updateTable", "", "newList", "", "Lkotlin/Pair;", "Lcom/yandex/div/data/Variable;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes11.dex */
public final class VariableMonitorView extends LinearLayout {

    @NotNull
    private final Context context;

    @NotNull
    private final LinearLayout title;

    @NotNull
    private final VariableAdapter variablesAdapter;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public VariableMonitorView(@NotNull Context context, @NotNull VariableMonitor variableMonitor) {
        super(context);
        this.context = context;
        this.variablesAdapter = new VariableAdapter(new VariableMonitorView$variablesAdapter$1(variableMonitor));
        LinearLayout createTableTitle = createTableTitle();
        this.title = createTableTitle;
        setOrientation(1);
        variableMonitor.setVariablesUpdatedCallback(new AnonymousClass1(this));
        addView(createTableTitle, new LinearLayout.LayoutParams(-1, -2));
        addView(createTable(), new LinearLayout.LayoutParams(-1, -2));
    }

    /* compiled from: VariableMonitorView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.errors.VariableMonitorView$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1 {
        AnonymousClass1(Object obj) {
            super(1, obj, VariableMonitorView.class, "updateTable", "updateTable(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends Pair<String, ? extends Variable>>) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<? extends Pair<String, ? extends Variable>> list) {
            ((VariableMonitorView) this.receiver).updateTable(list);
        }
    }

    private final LinearLayout createTableTitle() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        List listOf = CollectionsKt.listOf((Object[]) new Integer[]{200, 60, 100});
        List listOf2 = CollectionsKt.listOf((Object[]) new String[]{"name", "type", "value"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf2, 10));
        Iterator it = listOf2.iterator();
        while (it.hasNext()) {
            arrayList.add(createCellTitle((String) it.next()));
        }
        for (Pair pair : CollectionsKt.zip(arrayList, listOf)) {
            linearLayout.addView((TextView) pair.component1(), new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(((Number) pair.component2()).intValue()), linearLayout.getResources().getDisplayMetrics()), -2));
        }
        return linearLayout;
    }

    private final RecyclerView createTable() {
        RecyclerView recyclerView = new RecyclerView(this.context);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.variablesAdapter);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        return recyclerView;
    }

    private final TextView createCellTitle(String title) {
        TextView textView = new TextView(this.context);
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        textView.setTextColor(-1);
        textView.setText(title);
        textView.setTypeface(textView.getTypeface(), 1);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTable(List<? extends Pair<String, ? extends Variable>> newList) {
        VariableModel model;
        VariableAdapter variableAdapter = this.variablesAdapter;
        List<? extends Pair<String, ? extends Variable>> list = newList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            model = VariableMonitorViewKt.toModel((Variable) pair.component2(), (String) pair.component1());
            arrayList.add(model);
        }
        variableAdapter.submitList(arrayList, new Runnable() { // from class: com.yandex.div.core.view2.errors.VariableMonitorView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VariableMonitorView.updateTable$lambda$5(VariableMonitorView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTable$lambda$5(VariableMonitorView variableMonitorView) {
        variableMonitorView.title.setVisibility(variableMonitorView.variablesAdapter.getItemCount() != 0 ? 0 : 8);
    }
}
