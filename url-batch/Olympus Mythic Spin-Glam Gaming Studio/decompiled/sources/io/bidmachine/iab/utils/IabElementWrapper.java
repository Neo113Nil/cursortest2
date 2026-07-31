package io.bidmachine.iab.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public abstract class IabElementWrapper<T extends View> {
    private final View.OnClickListener a;
    protected View b;
    protected IabElementStyle c;
    private boolean d = false;
    private final Runnable e = new a();
    private final Animator.AnimatorListener f = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IabElementWrapper.this.d = false;
            IabElementWrapper iabElementWrapper = IabElementWrapper.this;
            View view = iabElementWrapper.b;
            if (view == null || iabElementWrapper.c == null) {
                return;
            }
            view.animate().alpha(0.0f).setDuration(400L).setListener(IabElementWrapper.this.f).withLayer();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = IabElementWrapper.this.b;
            if (view != null) {
                view.setClickable(view.getAlpha() != 0.0f);
            }
        }
    }

    public IabElementWrapper(@Nullable View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    protected void a(Context context, View view, IabElementStyle iabElementStyle) {
    }

    public void attach(@NonNull Context context, @NonNull ViewGroup viewGroup, @Nullable IabElementStyle iabElementStyle) {
        RelativeLayout.LayoutParams layoutParams;
        IabElementStyle iabElementStyle2;
        IabElementStyle copyWith = c(context, iabElementStyle).copyWith(iabElementStyle);
        if (!copyWith.isVisible().booleanValue()) {
            detach();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a(context, copyWith));
            copyWith.applyAlignment(layoutParams2);
            layoutParams = layoutParams2;
        } else {
            if (!(viewGroup instanceof RelativeLayout)) {
                throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a(context, copyWith));
            copyWith.applyRelativeAlignment(layoutParams3);
            layoutParams = layoutParams3;
        }
        copyWith.applyMargin(context, layoutParams);
        View view = this.b;
        if (view == null || (iabElementStyle2 = this.c) == null || a(view, iabElementStyle2, copyWith)) {
            Utils.removeFromParent(this.b);
            View b2 = b(context, copyWith);
            this.b = b2;
            viewGroup.addView(b2, layoutParams);
        } else {
            this.b.setLayoutParams(layoutParams);
            this.b.setVisibility(0);
        }
        this.b.setAlpha(copyWith.getOpacity().floatValue());
        copyWith.applyPadding(context, this.b);
        this.b.setOnClickListener(this.a);
        this.c = copyWith;
        a(this.b, copyWith);
        a(context, this.b, copyWith);
    }

    abstract View b(Context context, IabElementStyle iabElementStyle);

    public void bringToFront() {
        View view = this.b;
        if (view != null) {
            view.bringToFront();
        }
    }

    protected abstract IabElementStyle c(Context context, IabElementStyle iabElementStyle);

    public void cancelHide() {
        this.d = false;
        View view = this.b;
        if (view == null || this.c == null) {
            return;
        }
        view.animate().cancel();
        this.b.removeCallbacks(this.e);
        this.b.setClickable(true);
        this.b.setAlpha(this.c.getOpacity().floatValue());
    }

    public void detach() {
        if (this.b != null) {
            cancelHide();
            Utils.removeFromParent(this.b);
            this.b = null;
            this.c = null;
        }
    }

    @Nullable
    @VisibleForTesting
    public T getCachedView() {
        return (T) this.b;
    }

    public void invalidate() {
        View view;
        if (!isAttached() || (view = this.b) == null || this.c == null) {
            return;
        }
        a(view.getContext(), this.b, this.c);
    }

    public boolean isAttached() {
        return this.b != null;
    }

    public void setVisibility(int i) {
        View view = this.b;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void toggleHide() {
        IabElementStyle iabElementStyle;
        Float hideAfter;
        if (this.d || this.b == null || (iabElementStyle = this.c) == null || (hideAfter = iabElementStyle.getHideAfter()) == null || hideAfter.floatValue() == 0.0f) {
            return;
        }
        this.d = true;
        this.b.postDelayed(this.e, (long) (hideAfter.floatValue() * 1000.0f));
    }

    public void toggleShow() {
        if (this.b == null || this.c == null) {
            return;
        }
        cancelHide();
        toggleHide();
    }

    protected ViewGroup.MarginLayoutParams a(Context context, IabElementStyle iabElementStyle) {
        return new ViewGroup.MarginLayoutParams(iabElementStyle.getWidth(context).intValue(), iabElementStyle.getHeight(context).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void a(View view, IabElementStyle iabElementStyle) {
        if (view instanceof IabElement) {
            ((IabElement) view).setStyle(iabElementStyle);
        }
    }

    protected boolean a(View view, IabElementStyle iabElementStyle, IabElementStyle iabElementStyle2) {
        return !TextUtils.equals(iabElementStyle.getStyle(), iabElementStyle2.getStyle());
    }
}
