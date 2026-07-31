package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.va;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class ua extends wa implements ta {
    private final bj o;
    private final r9 p;

    public ua(h0 h0Var, l1 l1Var, bj bjVar, we weVar, va.a aVar, r9 r9Var, Context context) {
        super(h0Var, l1Var, weVar, aVar, context);
        this.p = r9Var;
        this.o = bjVar;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setBackgroundColor(this.i.a(w2.r));
        this.b.addView(bjVar, 0);
    }

    private void d(View view) {
        if (view == this.o.getVideoControlView().getVideoControlButton()) {
            this.p.c();
            return;
        }
        if (view == this.o.getVideoControlView().getSoundControlButton()) {
            this.p.d();
            return;
        }
        if (view == this.o.getVideoView()) {
            this.d.a(1, a(8192));
            return;
        }
        if (view != this.o.getPreviewView() || this.o.getPreviewView().getVisibility() != 0) {
            if (this.f) {
                super.b(view);
                return;
            } else {
                super.c(view);
                return;
            }
        }
        e2 e2Var = this.l;
        if (e2Var == null || !e2Var.d) {
            return;
        }
        this.d.a(1, a(8));
    }

    @Override // com.my.target.va
    public View a() {
        return this;
    }

    @Override // com.my.target.wa, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.ta
    @NonNull
    public bj getVideoContent() {
        return this.o;
    }

    @Override // com.my.target.ta
    @NonNull
    public c0 getVideoPlayer() {
        return this.o.getVideoPlayer();
    }

    @Override // com.my.target.ta
    @NonNull
    public e0 getVideoView() {
        return this.o.getVideoView();
    }

    @Override // com.my.target.wa, android.view.View.OnClickListener
    public void onClick(View view) {
        d(view);
    }

    @Override // com.my.target.wa, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o.setBackgroundColor(this.i.a(w2.x));
    }

    @Override // com.my.target.wa, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.wa, com.my.target.va
    public void setBanner(@NonNull d9 d9Var) {
        LinearLayout.LayoutParams a;
        eb j0 = d9Var.j0();
        if (j0 == null) {
            return;
        }
        ImageData i0 = j0.i0();
        if (i0 == null || i0.getBitmap() == null) {
            a = a(j0.R(), j0.v());
        } else {
            Bitmap bitmap = i0.getBitmap();
            this.o.getPreviewView().setImageBitmap(bitmap);
            a = a(bitmap.getWidth(), bitmap.getHeight());
        }
        this.o.setLayoutParams(a);
        this.o.getVideoView().a(j0.R(), j0.v());
        this.o.i();
        super.setBanner(d9Var);
    }

    @Override // com.my.target.wa
    @SuppressLint({"ClickableViewAccessibility"})
    protected void setClickAreaActual(@NonNull e2 e2Var) {
        super.setClickAreaActual(e2Var);
        this.o.getVideoControlView().getVideoControlButton().setOnTouchListener(this.n);
        this.o.getVideoControlView().getSoundControlButton().setOnTouchListener(this.n);
        this.o.getVideoView().setOnTouchListener(this.n);
        this.o.getPreviewView().setOnTouchListener(this.n);
        this.o.getDomainTextView().setOnTouchListener(this.n);
        if (!e2Var.m) {
            this.o.getVideoControlView().getVideoControlButton().setOnClickListener(this);
            this.o.getVideoControlView().getSoundControlButton().setOnClickListener(this);
            this.o.getVideoView().setOnClickListener(e2Var.n ? this : null);
            this.o.getPreviewView().setOnClickListener(e2Var.d ? this : null);
            this.o.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
            return;
        }
        this.o.getVideoControlView().getVideoControlButton().setOnClickListener(this);
        this.o.getVideoControlView().getSoundControlButton().setOnClickListener(this);
        this.o.getDomainTextView().setOnClickListener(this);
        this.o.getPreviewView().setOnClickListener(this);
        if (e2Var.n) {
            this.o.getVideoView().setOnClickListener(this);
        }
    }

    @Override // com.my.target.wa
    protected void setClickAreaLegacy(@NonNull e2 e2Var) {
        super.setClickAreaLegacy(e2Var);
        this.o.getVideoControlView().getVideoControlButton().setOnClickListener(this);
        this.o.getVideoControlView().getSoundControlButton().setOnClickListener(this);
        this.o.getVideoView().setOnClickListener((e2Var.n || e2Var.m) ? this : null);
        this.o.getPreviewView().setOnClickListener(e2Var.d ? this : null);
        this.o.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
    }

    @Override // com.my.target.wa
    protected void setDomain(@NonNull String str) {
        super.setDomain(str);
        j3 j3Var = this.g;
        if (j3Var instanceof ah) {
            if (TextUtils.isEmpty(str)) {
                this.o.getDomainTextView().setVisibility(8);
            } else {
                this.o.getDomainTextView().setText(str);
                this.o.getDomainTextView().setVisibility(0);
            }
            this.o.getDomainContainer().setVisibility(0);
            return;
        }
        if (j3Var == null || j3Var.getDomainTextView() == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.o.getDomainContainer().setVisibility(8);
    }

    @Override // com.my.target.wa, com.my.target.va
    public void setDoubleBanners(@NonNull List<e4> list) {
    }

    @Override // com.my.target.wa
    protected void setIcon(@Nullable ImageData imageData) {
        super.setIcon(imageData);
        if (imageData == null || imageData.getData() == null || !(this.g instanceof ah)) {
            return;
        }
        this.o.getLogoImageView().setImageBitmap(h1.a(imageData.getData()));
    }

    private n2 a(int i) {
        return this.f ? t2.a(i, this.e) : q2.a();
    }
}
