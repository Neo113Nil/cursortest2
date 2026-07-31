package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.m4;
import com.my.target.va;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class n4 extends FrameLayout implements m4 {
    private final va.a a;
    private va b;
    private final r9 c;
    private final m4.a d;
    private final we e;

    public n4(Context context, va.a aVar, r9 r9Var, m4.a aVar2) {
        super(context);
        this.a = aVar;
        this.c = r9Var;
        this.d = aVar2;
        this.e = e(context);
        a();
    }

    private h0 b(Context context) {
        return new h0(context);
    }

    private l1 c(Context context) {
        return new l1(context);
    }

    private z5 d(Context context) {
        return new z5(context);
    }

    private we e(Context context) {
        hg a = hg.a(context);
        we weVar = new we(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, a.a(hg.e));
        int i = hg.k;
        int a2 = a.a(i);
        layoutParams.setMargins(a2, a.a(i), a2, a.a(hg.g));
        weVar.setLayoutParams(layoutParams);
        return weVar;
    }

    @Override // com.my.target.m4
    public void a(d9 d9Var, boolean z, int i, boolean z2) {
        va vaVar = this.b;
        if (vaVar != null) {
            LinearLayout topBar = vaVar.getTopBar();
            if (topBar != null) {
                topBar.removeView(this.e);
            }
            removeView(this.b.a());
        }
        h0 b = b(getContext());
        l1 c = c(getContext());
        c.getSkipButton().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.n4$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n4.this.a(view);
            }
        });
        if (d9Var.j0() != null) {
            ua uaVar = new ua(b, c, a(this.c, z), z2 ? null : this.e, this.a, this.c, getContext());
            this.b = uaVar;
            uaVar.setBanner(d9Var);
        } else {
            ma maVar = new ma(b, c, d(getContext()), z2 ? null : this.e, this.a, getContext());
            this.b = maVar;
            maVar.setBanner(d9Var);
        }
        addView(this.b.a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.m4
    @Nullable
    public va getInterstitialView() {
        return this.b;
    }

    @Override // com.my.target.m4
    @NonNull
    public we getProgressBar() {
        return this.e;
    }

    @Override // com.my.target.m4
    @NonNull
    public FrameLayout getRootLayout() {
        return this;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.d.m();
    }

    @Override // com.my.target.m4
    public void a(List list, j9 j9Var) {
        if (getChildCount() != 0) {
            removeAllViews();
        }
        b4 b4Var = new b4(this.a, j9Var, getContext());
        this.b = b4Var;
        b4Var.setDoubleBanners(list);
        addView(this.b.a());
    }

    public bj a(r9 r9Var, boolean z) {
        e0 a = a(getContext());
        return new bj(ib.a(z, a.getContext()), a, getContext(), r9Var);
    }

    private void a() {
        setBackgroundColor(w2.a(getContext()).a(w2.r));
    }

    public e0 a(Context context) {
        return new e0(context);
    }
}
