package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.ka;
import com.my.target.s1;
import com.my.target.x1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class ch extends LinearLayout {
    private final s1 a;
    private final bh b;
    private final hg c;
    private final s1.a d;

    public ch(Context context, ka.a aVar, final x1.b bVar) {
        super(context);
        hg a = hg.a(context);
        this.c = a;
        this.d = new s1.a() { // from class: com.my.target.ch$$ExternalSyntheticLambda0
            @Override // com.my.target.s1.a
            public final void a(k8 k8Var, int i, n2 n2Var, View view) {
                ch.a(x1.b.this, k8Var, i, n2Var, view);
            }
        };
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a2 = a.a(hg.v);
        layoutParams.setMargins(a2, a2, a2, a2);
        layoutParams.weight = 1.0f;
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        s1 b = b(context);
        this.a = b;
        w2 a3 = w2.a(context);
        b.getActionButton().setBackground(a3.a(a3.a(w2.B), a3.a(w2.A), a3.a(w2.C), a.a(hg.m)));
        b.getActionButton().setTextColor(a3.a(w2.y));
        linearLayout.addView(b);
        this.b = new bh(aVar);
        RecyclerView a4 = a(context);
        addView(linearLayout);
        addView(a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(x1.b bVar, k8 k8Var, int i, n2 n2Var, View view) {
        if (bVar != null) {
            bVar.a(k8Var, i, n2Var, view);
        }
    }

    private s1 b(Context context) {
        s1 s1Var = new s1(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        int a = this.c.a(hg.m);
        int a2 = this.c.a(hg.g);
        s1Var.getActionButton().setPadding(a, a2, a, a2);
        s1Var.setLayoutParams(layoutParams);
        return s1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public s1 getAdCardView() {
        return this.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(List list, ng ngVar) {
        if (ngVar.a().y() == null) {
            return;
        }
        this.a.setCard(ngVar.a());
        this.a.setOnClickListeners(this.d);
        this.b.a(list);
    }

    private RecyclerView a(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setAdapter(this.b);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.addItemDecoration(a());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, this.c.a(hg.n));
        recyclerView.setLayoutParams(layoutParams);
        return recyclerView;
    }

    private f5 a() {
        return new f5(this.c.a(hg.i), this.c.a(hg.n));
    }
}
