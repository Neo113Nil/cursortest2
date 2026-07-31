package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.va;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class b4 extends LinearLayout implements va {
    private final l1 a;
    private final hg b;
    private final d4 c;
    private final RecyclerView d;

    public b4(final va.a aVar, j9 j9Var, Context context) {
        super(context);
        hg a = hg.a(context);
        this.b = a;
        setOrientation(1);
        l1 l1Var = new l1(context);
        this.a = l1Var;
        l1Var.setGravity(8388661);
        l1Var.getAdChoicesButton().setVisibility(8);
        addView(l1Var);
        RecyclerView recyclerView = new RecyclerView(context);
        this.d = recyclerView;
        d4 d4Var = new d4(j9Var);
        this.c = d4Var;
        recyclerView.setAdapter(d4Var);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        int a2 = a.a(hg.r);
        if (context.getResources().getConfiguration().orientation == 2) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            recyclerView.addItemDecoration(new j4(a2));
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            recyclerView.addItemDecoration(new l4(a2));
        }
        l1Var.getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.b4$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                va.a.this.e();
            }
        });
        e();
        addView(recyclerView);
    }

    private void e() {
        w2 a = w2.a(getContext());
        setBackgroundColor(a.a(w2.r));
        this.a.getProgress().setTextColor(a.a(w2.v));
        this.a.getProgressFrame().setBackground(a(a));
    }

    @Override // com.my.target.va
    public View a() {
        return this;
    }

    @Override // com.my.target.va
    public void b() {
        this.a.getCloseButton().setVisibility(0);
        this.a.getProgressFrame().setVisibility(8);
    }

    @Override // com.my.target.va
    public void c() {
        this.a.getProgressFrame().setVisibility(8);
    }

    @Override // com.my.target.va
    public void d() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.va
    @NonNull
    public View getCloseButton() {
        return this.a.getCloseButton();
    }

    @Override // com.my.target.va
    @Nullable
    public LinearLayout getTopBar() {
        return null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i = 0; i < this.d.getItemDecorationCount(); i++) {
            this.d.removeItemDecorationAt(i);
        }
        int a = this.b.a(hg.r);
        if (configuration.orientation == 2) {
            this.d.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.d.addItemDecoration(new j4(a));
        } else {
            this.d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            this.d.addItemDecoration(new l4(a));
        }
        e();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.va
    public void setBanner(@NonNull d9 d9Var) {
    }

    @Override // com.my.target.va
    public void setDoubleBanners(@NonNull List<e4> list) {
        d4 d4Var = this.c;
        if (d4Var == null) {
            return;
        }
        d4Var.a(list);
    }

    @Override // com.my.target.va
    public void setRemainingAllowCloseDelay(int i) {
        this.a.getProgress().setText(String.valueOf(i));
    }

    private Drawable a(w2 w2Var) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(w2Var.a(w2.I));
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }
}
