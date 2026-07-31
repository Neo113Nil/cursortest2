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
import com.my.target.g2;
import com.my.target.va;
import com.my.target.x1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class l9 extends LinearLayout implements va, View.OnClickListener {
    private final li a;
    private final x1 b;
    private final va.a c;
    private boolean d;
    private h2 e;
    private final View.OnTouchListener f;
    private w2 g;

    public l9(va.a aVar, x1.b bVar, Context context) {
        super(context);
        this.d = false;
        this.e = h2.a();
        this.f = new g2(new g2.a() { // from class: com.my.target.l9$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                l9.this.a(h2Var);
            }
        });
        this.c = aVar;
        this.g = w2.a(context);
        setOrientation(1);
        li a = a(context);
        this.a = a;
        a.getButtonsView().getAdChoicesButton().setOnClickListener(this);
        a.getButtonsView().getCloseButton().setOnClickListener(this);
        addView(a);
        x1 a2 = a(context, bVar);
        this.b = a2;
        setBackgroundColor(this.g.a(w2.r));
        e();
        addView(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.e = h2Var;
    }

    private void e() {
        w2 a = w2.a(getContext());
        this.g = a;
        setBackgroundColor(a.a(w2.r));
        TextView ageRestrictionTextView = this.a.getAgeRestrictionTextView();
        w2 w2Var = this.g;
        int i = w2.q;
        ageRestrictionTextView.setTextColor(w2Var.a(i));
        this.a.getDomainTextView().setTextColor(this.g.a(i));
        this.a.getTitleTextView().setTextColor(this.g.a(w2.s));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaActual(@NonNull e2 e2Var) {
        setOnTouchListener(this.f);
        this.a.setOnTouchListener(this.f);
        this.a.getLogoIcon().setOnTouchListener(this.f);
        this.a.getTitleTextView().setOnTouchListener(this.f);
        this.a.getDomainTextView().setOnTouchListener(this.f);
        this.a.getAdsIcon().setOnTouchListener(this.f);
        this.a.getButtonsView().getCloseButton().setOnTouchListener(this.f);
        this.a.getButtonsView().getAdChoicesButton().setOnTouchListener(this.f);
        this.a.getAgeRestrictionTextView().setOnTouchListener(this.f);
        this.b.setOnTouchListener(this.f);
        this.b.getMoreButton().setOnTouchListener(this.f);
        if (e2Var.m) {
            setOnClickListener(this);
            this.a.getAgeRestrictionTextView().setOnClickListener(this);
            this.a.getTitleTextView().setOnClickListener(this);
            this.a.getLogoIcon().setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.a.getTitleTextView().setOnClickListener(e2Var.a ? this : null);
        this.a.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
        this.a.getLogoIcon().setOnClickListener(e2Var.c ? this : null);
        this.a.getAgeRestrictionTextView().setOnClickListener(e2Var.h ? this : null);
    }

    private void setClickAreaLegacy(@NonNull e2 e2Var) {
        if (e2Var.m) {
            setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
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
        if (this.d) {
            b(view);
        } else {
            c(view);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
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
        if (d9Var.w() == null) {
            return;
        }
        this.a.getLogoIcon().setImageBitmap(h1.a(d9Var.w().getData()));
        this.a.getTitleTextView().setText(d9Var.K());
        this.a.getDomainTextView().setText(d9Var.B().equals("store") ? d9Var.h() : d9Var.s());
        this.a.getAgeRestrictionTextView().setText(a(d9Var.d(), d9Var.c()));
        if (d9Var.d0() != null) {
            this.a.getAdsIcon().setImageBitmap(d9Var.d0().getData());
        }
        this.b.setData(d9Var.g0());
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
            this.c.e();
            return;
        }
        if (view == this.a.getLogoIcon()) {
            this.c.d();
        } else if (view == this.a.getButtonsView().getAdChoicesButton()) {
            this.c.a();
        } else {
            this.c.a(1, q2.a());
        }
    }

    private x1 a(Context context, x1.b bVar) {
        return new x1(context, bVar);
    }

    private void b(View view) {
        if (view == this.a.getButtonsView().getCloseButton()) {
            this.c.e();
            return;
        }
        if (view == this.a.getLogoIcon()) {
            this.c.d();
        } else if (view == this.a.getButtonsView().getAdChoicesButton()) {
            this.c.a();
        } else {
            this.c.a(1, t2.a(a(view), this.e));
        }
    }

    private li a(Context context) {
        return new li(context);
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
        this.d = z;
        if (z) {
            setClickAreaActual(e2Var);
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
