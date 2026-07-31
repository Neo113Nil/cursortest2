package com.my.target;

import android.content.Context;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.h4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class aj extends f4 implements ta {
    private bj o;
    private c0 p;
    private e0 q;

    public aj(Context context, g4 g4Var) {
        super(context, g4Var);
    }

    @Override // com.my.target.f4
    protected void a(e4 e4Var) {
        final ImageData i0;
        final h4.a aVar = new h4.a(this.n);
        if (this.o == null) {
            this.o = a(e4Var.g(), aVar);
            this.g.setBackground(a(w2.a(getContext())));
            this.g.setClipToOutline(true);
            this.g.addView(this.o, 0);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.aj$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aj.this.a(aVar, view);
                }
            };
            this.o.getVideoControlView().getVideoControlButton().setOnClickListener(onClickListener);
            this.o.getVideoControlView().getSoundControlButton().setOnClickListener(onClickListener);
        }
        if (this.p == null) {
            this.p = this.o.getVideoPlayer();
        }
        if (this.q == null) {
            this.q = this.o.getVideoView();
        }
        this.n.a(this.o);
        this.n.a(e4Var, this);
        this.i.setOnClickListener(this);
        eb j0 = e4Var.a().j0();
        if (j0 == null || (i0 = j0.i0()) == null) {
            return;
        }
        this.o.getPreviewView().setImageBitmap(i0.getBitmap());
        this.g.post(new Runnable() { // from class: com.my.target.aj$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                aj.this.a(i0);
            }
        });
    }

    public e0 b() {
        return new e0(getContext());
    }

    @Override // com.my.target.f4, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.ta
    @NonNull
    public bj getVideoContent() {
        bj bjVar = this.o;
        Objects.requireNonNull(bjVar);
        return bjVar;
    }

    @Override // com.my.target.ta
    @NonNull
    public c0 getVideoPlayer() {
        c0 c0Var = this.p;
        Objects.requireNonNull(c0Var);
        return c0Var;
    }

    @Override // com.my.target.ta
    @NonNull
    public e0 getVideoView() {
        e0 e0Var = this.q;
        Objects.requireNonNull(e0Var);
        return e0Var;
    }

    @Override // com.my.target.f4, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void b(int i, int i2) {
        if (this.o == null) {
            return;
        }
        Size a = a(i, i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.getWidth(), a.getHeight());
        layoutParams.gravity = 17;
        this.o.getVideoView().a(a.getWidth(), a.getHeight());
        this.o.getPreviewView().setLayoutParams(layoutParams);
        this.o.getPreviewView().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(r9 r9Var, View view) {
        if (view == this.o.getVideoControlView().getVideoControlButton()) {
            r9Var.c();
        } else if (view == this.o.getVideoControlView().getSoundControlButton()) {
            r9Var.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImageData imageData) {
        b(imageData.getWidth(), imageData.getHeight());
    }

    private bj a(boolean z, r9 r9Var) {
        e0 b = b();
        return new bj(ib.a(z, b.getContext()), b, getContext(), r9Var);
    }
}
