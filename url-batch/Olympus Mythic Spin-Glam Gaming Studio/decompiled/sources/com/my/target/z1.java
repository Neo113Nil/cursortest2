package com.my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.a2;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.y1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class z1 extends RecyclerView {
    private final y1 a;
    private final LinearSnapHelper b;
    private List c;
    private a2.b d;
    private final c e;
    private boolean f;
    private boolean g;
    private final c h;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements c {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.my.target.z1.c
        public void a(View view, n2 n2Var) {
            List list;
            ViewParent viewParent = view.getParent();
            while (viewParent != 0 && !(viewParent instanceof p1)) {
                viewParent = viewParent.getParent();
            }
            z1 z1Var = z1.this;
            a2.b bVar = z1Var.d;
            if (bVar == null || (list = z1Var.c) == null || viewParent == 0) {
                return;
            }
            bVar.a((k8) list.get(z1Var.getCardLayoutManager().getPosition((View) viewParent)), 2, n2Var);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements c {
        b() {
        }

        @Override // com.my.target.z1.c
        public void a(View view, n2 n2Var) {
            View findContainingItemView;
            List list;
            z1 z1Var = z1.this;
            if (z1Var.f || (findContainingItemView = z1Var.getCardLayoutManager().findContainingItemView(view)) == null) {
                return;
            }
            if (!z1.this.getCardLayoutManager().a(findContainingItemView)) {
                z1 z1Var2 = z1.this;
                if (!z1Var2.g) {
                    z1Var2.a(findContainingItemView);
                    return;
                }
            }
            if (view.isClickable()) {
                z1 z1Var3 = z1.this;
                a2.b bVar = z1Var3.d;
                if (bVar == null || (list = z1Var3.c) == null) {
                    return;
                }
                bVar.a((k8) list.get(z1Var3.getCardLayoutManager().getPosition(findContainingItemView)), 1, n2Var);
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface c {
        void a(View view, n2 n2Var);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class d extends RecyclerView.Adapter {
        final Context a;
        final List b;
        final List c = new ArrayList();
        private final boolean d;
        c e;
        c f;

        d(List list, Context context) {
            this.b = list;
            this.a = context;
            this.d = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        }

        List a() {
            return this.b;
        }

        void b(c cVar) {
            this.f = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return a().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == getItemCount() - 1 ? 2 : 0;
        }

        void a(c cVar) {
            this.e = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(e eVar, int i) {
            p1 a = eVar.a();
            k8 k8Var = (k8) a().get(i);
            if (!this.c.contains(k8Var)) {
                this.c.add(k8Var);
                wh.b(k8Var.H(), "render", 1);
            }
            a(k8Var, a);
            a.a(this.e, k8Var.i(), this.f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public e onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new e(new p1(this.d, this.a));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(e eVar) {
            eVar.a().a(null, null, null);
        }

        private void a(k8 k8Var, p1 p1Var) {
            TextView domainTextView;
            String s;
            StarsRatingView ratingView;
            ImageData y = k8Var.y();
            if (y != null) {
                fh smartImageView = p1Var.getSmartImageView();
                smartImageView.setPlaceholderDimensions(y.getWidth(), y.getHeight());
                b6.b(y, smartImageView);
            }
            p1Var.getTitleTextView().setText(k8Var.K());
            p1Var.getDescriptionTextView().setText(k8Var.n());
            p1Var.getCtaButtonView().setText(k8Var.l());
            p1Var.setIsHitMapEnabled(k8Var.f().b());
            domainTextView = p1Var.getDomainTextView();
            s = k8Var.s();
            ratingView = p1Var.getRatingView();
            String B = k8Var.B();
            B.getClass();
            switch (B) {
                case "web":
                case "webform":
                    ratingView.setVisibility(8);
                    domainTextView.setVisibility(0);
                    domainTextView.setText(s);
                    break;
                case "store":
                    domainTextView.setVisibility(8);
                    float G = k8Var.G();
                    if (G > 0.0f) {
                        ratingView.setVisibility(0);
                        ratingView.setRating(G);
                        break;
                    } else {
                        ratingView.setVisibility(8);
                        break;
                    }
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class e extends RecyclerView.ViewHolder {
        private final p1 a;

        e(p1 p1Var) {
            super(p1Var);
            this.a = p1Var;
        }

        p1 a() {
            return this.a;
        }
    }

    public z1(Context context) {
        this(context, null);
    }

    @NonNull
    private List<k8> getVisibleCards() {
        int findFirstCompletelyVisibleItemPosition;
        int findLastCompletelyVisibleItemPosition;
        ArrayList arrayList = new ArrayList();
        if (this.c != null && (findFirstCompletelyVisibleItemPosition = getCardLayoutManager().findFirstCompletelyVisibleItemPosition()) <= (findLastCompletelyVisibleItemPosition = getCardLayoutManager().findLastCompletelyVisibleItemPosition()) && findFirstCompletelyVisibleItemPosition >= 0 && findLastCompletelyVisibleItemPosition < this.c.size()) {
            while (findFirstCompletelyVisibleItemPosition <= findLastCompletelyVisibleItemPosition) {
                arrayList.add((k8) this.c.get(findFirstCompletelyVisibleItemPosition));
                findFirstCompletelyVisibleItemPosition++;
            }
        }
        return arrayList;
    }

    private void setCardLayoutManager(@NonNull y1 y1Var) {
        y1Var.a(new y1.a() { // from class: com.my.target.z1$$ExternalSyntheticLambda0
            @Override // com.my.target.y1.a
            public final void a() {
                z1.this.a();
            }
        });
        super.setLayoutManager(y1Var);
    }

    public void a(List list) {
        d dVar = new d(list, getContext());
        this.c = list;
        dVar.a(this.h);
        dVar.b(this.e);
        setCardLayoutManager(this.a);
        setAdapter(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    @VisibleForTesting
    public y1 getCardLayoutManager() {
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public LinearSnapHelper getSnapHelper() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 > i4) {
            this.g = true;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.f = z;
        if (z) {
            return;
        }
        a();
    }

    public void setCarouselListener(@Nullable a2.b bVar) {
        this.d = bVar;
    }

    public void setSideSlidesMargins(int i) {
        getCardLayoutManager().a(i);
    }

    public z1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public z1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new a();
        this.h = new b();
        setOverScrollMode(2);
        this.a = new y1(context);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        this.b = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(this);
    }

    public void a(boolean z) {
        if (z) {
            this.b.attachToRecyclerView(this);
        } else {
            this.b.attachToRecyclerView(null);
        }
    }

    protected void a(View view) {
        int[] calculateDistanceToFinalSnap = this.b.calculateDistanceToFinalSnap(getCardLayoutManager(), view);
        if (calculateDistanceToFinalSnap != null) {
            smoothScrollBy(calculateDistanceToFinalSnap[0], 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        a2.b bVar = this.d;
        if (bVar != null) {
            bVar.a(getVisibleCards());
        }
    }
}
