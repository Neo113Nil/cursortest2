package com.yandex.div.core.view2.errors;

import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u001c\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/view2/errors/ErrorView;", "Lcom/yandex/div/core/Disposable;", "root", "Landroid/view/ViewGroup;", "errorModel", "Lcom/yandex/div/core/view2/errors/ErrorModel;", "typefaceProvider", "Lcom/yandex/div/core/font/DivTypefaceProvider;", "showPermanently", "", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/errors/ErrorModel;Lcom/yandex/div/core/font/DivTypefaceProvider;Z)V", "counterView", "detailsView", "Lcom/yandex/div/core/view2/errors/DetailsViewGroup;", "modelObservation", "value", "Lcom/yandex/div/core/view2/errors/ErrorViewModel;", "viewModel", "setViewModel", "(Lcom/yandex/div/core/view2/errors/ErrorViewModel;)V", "close", "", "tryAddCounterView", "tryAddDetailsView", "updateView", "old", "new", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorView implements Disposable {

    @Nullable
    private ViewGroup counterView;

    @Nullable
    private DetailsViewGroup detailsView;

    @NotNull
    private final ErrorModel errorModel;

    @NotNull
    private final Disposable modelObservation;

    @NotNull
    private final ViewGroup root;
    private final boolean showPermanently;

    @NotNull
    private final DivTypefaceProvider typefaceProvider;

    @Nullable
    private ErrorViewModel viewModel;

    public ErrorView(@NotNull ViewGroup viewGroup, @NotNull ErrorModel errorModel, @NotNull DivTypefaceProvider divTypefaceProvider, boolean z) {
        this.root = viewGroup;
        this.errorModel = errorModel;
        this.typefaceProvider = divTypefaceProvider;
        this.showPermanently = z;
        this.modelObservation = errorModel.observeAndGet(new Function1() { // from class: com.yandex.div.core.view2.errors.ErrorView$modelObservation$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ErrorViewModel) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ErrorViewModel errorViewModel) {
                ErrorView.this.setViewModel(errorViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewModel(ErrorViewModel errorViewModel) {
        updateView(this.viewModel, errorViewModel);
        this.viewModel = errorViewModel;
    }

    private final void updateView(ErrorViewModel old, ErrorViewModel r4) {
        if (old == null || r4 == null || old.getShowDetails() != r4.getShowDetails()) {
            ViewGroup viewGroup = this.counterView;
            if (viewGroup != null) {
                this.root.removeView(viewGroup);
            }
            this.counterView = null;
            DetailsViewGroup detailsViewGroup = this.detailsView;
            if (detailsViewGroup != null) {
                this.root.removeView(detailsViewGroup);
            }
            this.detailsView = null;
        }
        if (r4 == null) {
            return;
        }
        if (r4.getShowDetails()) {
            tryAddDetailsView();
            DetailsViewGroup detailsViewGroup2 = this.detailsView;
            if (detailsViewGroup2 != null) {
                detailsViewGroup2.setText(r4.getDetails());
            }
            DetailsViewGroup detailsViewGroup3 = this.detailsView;
            if (detailsViewGroup3 != null) {
                detailsViewGroup3.updateVariables(this.errorModel.getAllControllers());
                return;
            }
            return;
        }
        if (r4.getCounterText().length() > 0 || this.showPermanently) {
            tryAddCounterView();
        } else {
            ViewGroup viewGroup2 = this.counterView;
            if (viewGroup2 != null) {
                this.root.removeView(viewGroup2);
            }
            this.counterView = null;
        }
        ViewGroup viewGroup3 = this.counterView;
        KeyEvent.Callback childAt = viewGroup3 != null ? viewGroup3.getChildAt(0) : null;
        AppCompatTextView appCompatTextView = childAt instanceof AppCompatTextView ? (AppCompatTextView) childAt : null;
        if (appCompatTextView != null) {
            appCompatTextView.setText(r4.getCounterText());
            appCompatTextView.setBackgroundResource(r4.getCounterBackground());
        }
    }

    private final void tryAddDetailsView() {
        if (this.detailsView != null) {
            return;
        }
        DetailsViewGroup detailsViewGroup = new DetailsViewGroup(this.root.getContext(), this.errorModel.getErrorHandler(), new Function0() { // from class: com.yandex.div.core.view2.errors.ErrorView$tryAddDetailsView$view$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ErrorModel errorModel;
                errorModel = ErrorView.this.errorModel;
                errorModel.hideDetails();
            }
        }, new Function0() { // from class: com.yandex.div.core.view2.errors.ErrorView$tryAddDetailsView$view$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ErrorViewModel errorViewModel;
                ErrorModel errorModel;
                errorViewModel = ErrorView.this.viewModel;
                if (errorViewModel != null) {
                    errorModel = ErrorView.this.errorModel;
                    errorModel.copyReportToClipboard();
                }
            }
        });
        this.root.addView(detailsViewGroup, new ViewGroup.LayoutParams(-1, -1));
        this.detailsView = detailsViewGroup;
    }

    private final void tryAddCounterView() {
        if (this.counterView != null) {
            return;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.root.getContext());
        appCompatTextView.setBackgroundResource(R.drawable.error_counter_background);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTextColor(-16777216);
        appCompatTextView.setGravity(17);
        appCompatTextView.setElevation(appCompatTextView.getResources().getDimension(R.dimen.div_shadow_elevation));
        appCompatTextView.setTypeface(this.typefaceProvider.getRegular());
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.ErrorView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorView.tryAddCounterView$lambda$5$lambda$4(ErrorView.this, view);
            }
        });
        DisplayMetrics displayMetrics = this.root.getContext().getResources().getDisplayMetrics();
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(24, displayMetrics);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dpToPx, dpToPx);
        int dpToPx2 = BaseDivViewExtensionsKt.dpToPx(8, displayMetrics);
        marginLayoutParams.topMargin = dpToPx2;
        marginLayoutParams.leftMargin = dpToPx2;
        marginLayoutParams.rightMargin = dpToPx2;
        marginLayoutParams.bottomMargin = dpToPx2;
        FrameContainerLayout frameContainerLayout = new FrameContainerLayout(this.root.getContext(), null, 0, 6, null);
        frameContainerLayout.addView(appCompatTextView, marginLayoutParams);
        this.root.addView(frameContainerLayout, -1, -1);
        this.counterView = frameContainerLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryAddCounterView$lambda$5$lambda$4(ErrorView errorView, View view) {
        errorView.errorModel.onCounterClick(errorView.root.getWidth(), errorView.root.getHeight());
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.modelObservation.close();
        this.root.removeView(this.counterView);
        this.root.removeView(this.detailsView);
    }
}
