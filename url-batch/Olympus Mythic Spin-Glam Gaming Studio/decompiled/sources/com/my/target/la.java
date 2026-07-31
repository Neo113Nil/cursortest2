package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.g2;
import com.my.target.ka;
import com.my.target.va;
import com.my.target.x1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class la extends LinearLayout implements ka, View.OnClickListener {
    private final li a;
    private final ch b;
    private final x1 c;
    private final va.a d;
    private h2 e;
    private final View.OnTouchListener f;
    private boolean g;

    public la(Context context, va.a aVar, ka.a aVar2, x1.b bVar) {
        super(context);
        this.e = h2.a();
        this.f = new g2(new g2.a() { // from class: com.my.target.la$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                la.this.a(h2Var);
            }
        });
        this.g = false;
        this.d = aVar;
        w2 a = w2.a(context);
        setOrientation(1);
        setBackgroundColor(a.a(w2.r));
        li a2 = a(context);
        this.a = a2;
        addView(a2);
        ch a3 = a(context, aVar2, bVar);
        this.b = a3;
        x1 a4 = a(context, bVar);
        this.c = a4;
        if (context.getResources().getConfiguration().orientation == 2) {
            addView(a4);
        } else {
            addView(a3);
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.e = h2Var;
    }

    private void e() {
        w2 a = w2.a(getContext());
        setBackgroundColor(a.a(w2.r));
        TextView ageRestrictionTextView = this.a.getAgeRestrictionTextView();
        int i = w2.q;
        ageRestrictionTextView.setTextColor(a.a(i));
        this.a.getDomainTextView().setTextColor(a.a(i));
        this.a.getTitleTextView().setTextColor(a.a(w2.s));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull e2 e2Var) {
        setOnTouchListener(this.f);
        this.a.setOnTouchListener(this.f);
        this.a.getLogoIcon().setOnTouchListener(this.f);
        this.a.getTitleTextView().setOnTouchListener(this.f);
        this.a.getDomainTextView().setOnTouchListener(this.f);
        this.a.getAdsIcon().setOnTouchListener(this.f);
        this.a.getButtonsView().getCloseButton().setOnTouchListener(this.f);
        this.a.getButtonsView().getAdChoicesButton().setOnTouchListener(this.f);
        this.a.getAgeRestrictionTextView().setOnTouchListener(this.f);
        this.c.setOnTouchListener(this.f);
        this.c.getMoreButton().setOnTouchListener(this.f);
        this.b.setOnTouchListener(this.f);
        this.b.getAdCardView().getDescriptionTextView().setOnTouchListener(this.f);
        this.b.getAdCardView().getAdImage().setOnTouchListener(this.f);
        if (e2Var.m) {
            setOnClickListener(this);
            this.a.getAgeRestrictionTextView().setOnClickListener(this);
            this.a.getTitleTextView().setOnClickListener(this);
            this.a.getLogoIcon().setOnClickListener(this);
            this.b.setOnClickListener(this);
            this.b.getAdCardView().getAdImage().setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.b.setOnClickListener(e2Var.l ? this : null);
        this.b.getAdCardView().getAdImage().setOnClickListener(e2Var.d ? this : null);
        this.a.getTitleTextView().setOnClickListener(e2Var.a ? this : null);
        this.a.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
        this.a.getLogoIcon().setOnClickListener(e2Var.c ? this : null);
        this.a.getAgeRestrictionTextView().setOnClickListener(e2Var.h ? this : null);
    }

    private void setClickAreaLegacy(@NonNull e2 e2Var) {
        if (e2Var.m) {
            setOnClickListener(this);
            this.b.setOnClickListener(this);
            this.b.getAdCardView().getAdImage().setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.b.setOnClickListener(e2Var.l ? this : null);
        this.b.getAdCardView().getAdImage().setOnClickListener(e2Var.d ? this : null);
        this.a.getTitleTextView().setOnClickListener(e2Var.a ? this : null);
        this.a.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
        this.a.getLogoIcon().setOnClickListener(e2Var.c ? this : null);
        this.a.getAgeRestrictionTextView().setOnClickListener(e2Var.h ? this : null);
    }

    @Override // com.my.target.va
    public View a() {
        return this;
    }

    @Override // com.my.target.va
    public void b() {
        this.a.getButtonsView().getCloseButton().setVisibility(0);
        this.a.getButtonsView().getProgressFrame().setVisibility(8);
    }

    @Override // com.my.target.va
    public void c() {
        this.a.getButtonsView().getProgressFrame().setVisibility(8);
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
        return this.a.getButtonsView().getCloseButton();
    }

    @Override // com.my.target.va
    @Nullable
    public LinearLayout getTopBar() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.g) {
            b(view);
        } else {
            c(view);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        removeView(this.b);
        removeView(this.c);
        if (configuration.orientation == 2) {
            addView(this.c);
        } else {
            addView(this.b);
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
        ImageData w = d9Var.w();
        if (w != null) {
            this.a.getLogoIcon().setImageBitmap(h1.a(w.getData()));
        }
        this.a.getTitleTextView().setText(d9Var.K());
        this.a.getDomainTextView().setText(d9Var.B().equals("store") ? d9Var.h() : d9Var.s());
        this.a.getAgeRestrictionTextView().setText(a(d9Var.d(), d9Var.c()));
        if (d9Var.d0() != null) {
            this.a.getAdsIcon().setImageBitmap(d9Var.d0().getData());
        }
        this.c.setData(d9Var.g0());
        a(d9Var.f().b(), d9Var.i());
    }

    @Override // com.my.target.va
    public void setDoubleBanners(@NonNull List<e4> list) {
    }

    @Override // com.my.target.va
    public void setRemainingAllowCloseDelay(int i) {
        this.a.getButtonsView().getProgress().setText(String.valueOf(i));
    }

    private void c(View view) {
        if (view == this.a.getButtonsView().getCloseButton()) {
            this.d.e();
            return;
        }
        if (view == this.a.getLogoIcon()) {
            this.d.d();
            return;
        }
        if (view == this.a.getButtonsView().getAdChoicesButton()) {
            this.d.a();
        } else if (view == this.b.getAdCardView()) {
            this.d.a(2, q2.a());
        } else {
            this.d.a(1, q2.a());
        }
    }

    private void b(View view) {
        if (view == this.a.getButtonsView().getCloseButton()) {
            this.d.e();
            return;
        }
        if (view == this.a.getLogoIcon()) {
            this.d.d();
            return;
        }
        if (view == this.a.getButtonsView().getAdChoicesButton()) {
            this.d.a();
        } else if (view == this.b.getAdCardView()) {
            this.d.a(2, t2.a(64, this.e));
        } else {
            this.d.a(1, t2.a(a(view), this.e));
        }
    }

    @Override // com.my.target.ka
    public void a(List list, ng ngVar) {
        this.b.a(list, ngVar);
    }

    private x1 a(Context context, x1.b bVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        x1 x1Var = new x1(context, bVar);
        x1Var.setLayoutParams(layoutParams);
        return x1Var;
    }

    private ch a(Context context, ka.a aVar, x1.b bVar) {
        ch chVar = new ch(context, aVar, bVar);
        chVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return chVar;
    }

    private li a(Context context) {
        li liVar = new li(context);
        liVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        liVar.getButtonsView().getCloseButton().setOnClickListener(this);
        liVar.getButtonsView().getAdChoicesButton().setOnClickListener(this);
        return liVar;
    }

    private String a(String str, String str2) {
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            str3 = "" + str2;
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        if (!TextUtils.isEmpty(str)) {
            str3 = str3 + " ";
        }
        return str3 + str;
    }

    private void a(boolean z, e2 e2Var) {
        this.g = z;
        if (z) {
            setClickArea(e2Var);
        } else {
            setClickAreaLegacy(e2Var);
        }
    }

    private int a(View view) {
        if (view == this.a.getTitleTextView()) {
            return 1;
        }
        if (view == this.a.getAgeRestrictionTextView()) {
            return 128;
        }
        if (view == this.a.getLogoIcon()) {
            return 4;
        }
        return view == this.a.getDomainTextView() ? 512 : 2048;
    }
}
