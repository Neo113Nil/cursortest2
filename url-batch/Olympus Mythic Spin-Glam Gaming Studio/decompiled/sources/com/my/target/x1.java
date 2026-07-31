package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.s1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class x1 extends FrameLayout implements View.OnClickListener {
    private final RecyclerView a;
    private final v5 b;
    private final v5 c;
    private final u1 d;
    private final yi e;
    private final e5 f;
    private final hg g;
    private final w2 h;
    private final b i;
    private List j;
    private int k;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends RecyclerView.OnScrollListener {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            b bVar = this.a;
            if (bVar == null || i != 0) {
                return;
            }
            bVar.a(x1.this.getVisibleCards(), x1.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            x1.this.g();
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a(k8 k8Var, int i, n2 n2Var, View view);

        void a(List list, x1 x1Var);
    }

    public x1(Context context, final b bVar) {
        super(context);
        this.i = bVar;
        this.k = context.getResources().getConfiguration().orientation;
        hg a2 = hg.a(context);
        this.g = a2;
        this.h = w2.a(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d = new u1(new s1.a() { // from class: com.my.target.x1$$ExternalSyntheticLambda0
            @Override // com.my.target.s1.a
            public final void a(k8 k8Var, int i, n2 n2Var, View view) {
                x1.this.a(bVar, k8Var, i, n2Var, view);
            }
        });
        int i = hg.g;
        this.f = new e5(a2.a(i));
        this.e = new yi(a2.a(hg.n), a2.a(i));
        RecyclerView a3 = a(context);
        this.a = a3;
        addView(a3);
        v5 a4 = a(context, f(), 8388629);
        this.b = a4;
        a4.setOnClickListener(this);
        a4.setVisibility(0);
        v5 a5 = a(context, c(), 8388627);
        this.c = a5;
        a5.setOnClickListener(this);
        a5.setVisibility(0);
        h();
        addView(a4);
        addView(a5);
        e();
        a3.addOnScrollListener(new a(bVar));
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, k8 k8Var, int i, n2 n2Var, View view) {
        if (bVar != null) {
            bVar.a(k8Var, i, n2Var, this);
        }
    }

    private void b(View view) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.a.getLayoutManager();
        if (gridLayoutManager == null) {
            return;
        }
        int findLastCompletelyVisibleItemPosition = gridLayoutManager.findLastCompletelyVisibleItemPosition();
        int findFirstCompletelyVisibleItemPosition = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
        int itemCount = this.d.getItemCount();
        if (view == this.b && findLastCompletelyVisibleItemPosition < itemCount - 1) {
            this.a.smoothScrollToPosition(findLastCompletelyVisibleItemPosition + 1);
        } else {
            if (view != this.c || findFirstCompletelyVisibleItemPosition <= 0) {
                return;
            }
            this.a.smoothScrollToPosition(findFirstCompletelyVisibleItemPosition - 1);
        }
    }

    private Bitmap c() {
        int a2 = this.g.a(hg.u);
        return this.k == 2 ? a1.d(a2, getContext()) : a1.j(a2, getContext());
    }

    private Drawable d() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(this.h.a(w2.l));
        gradientDrawable.setStroke(this.g.a(hg.e), -1);
        return gradientDrawable;
    }

    private void e() {
        if (this.k == 2) {
            this.a.removeItemDecoration(this.e);
            this.a.addItemDecoration(this.f);
        } else {
            this.a.removeItemDecoration(this.f);
            this.a.addItemDecoration(this.e);
        }
    }

    private Bitmap f() {
        int a2 = this.g.a(hg.u);
        return this.k == 2 ? a1.g(a2, getContext()) : a1.b(a2, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i;
        int i2;
        List list = this.j;
        if (list == null || list.isEmpty()) {
            this.c.setVisibility(8);
            this.b.setVisibility(8);
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.a.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            i = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        } else {
            i = 0;
            i2 = 0;
        }
        this.c.setVisibility(i2 <= 0 ? 8 : 0);
        this.b.setVisibility(i != this.d.getItemCount() + (-1) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public List<k8> getVisibleCards() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (this.j != null) {
            RecyclerView.LayoutManager layoutManager = this.a.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                i2 = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            } else {
                i = 0;
                i2 = 0;
            }
            if (i <= i2 && i >= 0 && i2 < this.j.size()) {
                while (i <= i2) {
                    arrayList.add((k8) this.j.get(i));
                    i++;
                }
            }
        }
        return arrayList;
    }

    private void h() {
        if (this.k == 2) {
            this.a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        } else {
            this.a.setLayoutManager(new GridLayoutManager(getContext(), 2, 1, false));
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(getVisibleCards(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public v5 getMoreButton() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.k == 2) {
            a(view);
        } else {
            b(view);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k = configuration.orientation;
        h();
        e();
        b();
        a();
        g();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setData(@NonNull List<k8> list) {
        this.d.a(list);
        this.j = list;
    }

    private void a(View view) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.a.getLayoutManager();
        if (linearLayoutManager == null) {
            return;
        }
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (view == this.b && findLastCompletelyVisibleItemPosition < this.d.getItemCount() - 1) {
            this.a.smoothScrollToPosition(findLastCompletelyVisibleItemPosition + 1);
        } else {
            if (view != this.c || findFirstCompletelyVisibleItemPosition <= 0) {
                return;
            }
            this.a.smoothScrollToPosition(findFirstCompletelyVisibleItemPosition - 1);
        }
    }

    private v5 a(Context context, Bitmap bitmap, int i) {
        v5 v5Var = new v5(context);
        int a2 = this.g.a(hg.D);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        int a3 = this.g.a(hg.g);
        layoutParams.setMargins(a3, a3, a3, a3);
        layoutParams.gravity = i;
        v5Var.setLayoutParams(layoutParams);
        v5Var.a(bitmap, false);
        v5Var.setBackground(d());
        return v5Var;
    }

    private void b() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        if (this.k == 2) {
            layoutParams.gravity = 8388629;
            layoutParams2.gravity = 8388627;
        } else {
            layoutParams.gravity = 81;
            layoutParams2.gravity = 49;
        }
        this.b.a(f(), false);
        this.b.setLayoutParams(layoutParams);
        this.c.a(c(), false);
        this.c.setLayoutParams(layoutParams2);
    }

    private RecyclerView a(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setAdapter(this.d);
        recyclerView.setClipToPadding(false);
        return recyclerView;
    }

    private void a() {
        FrameLayout.LayoutParams layoutParams;
        if (this.k == 2) {
            hg hgVar = this.g;
            int i = hg.r;
            int a2 = hgVar.a(i);
            this.a.setPadding(a2, 0, a2, this.g.a(i));
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 1;
        } else {
            int a3 = this.g.a(hg.k);
            this.a.setPadding(a3, 0, a3, 0);
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        this.a.setLayoutParams(layoutParams);
        this.a.requestLayout();
    }
}
