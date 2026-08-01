package M0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.internal.CheckableImageButton;
import q0.AbstractC0288a;

/* renamed from: M0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f509e;

    /* renamed from: f, reason: collision with root package name */
    public final int f510f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f511g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f512j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f513k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f514l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f515m;

    public C0029e(q qVar) {
        super(qVar);
        this.f512j = new ViewOnClickListenerC0025a(0, this);
        this.f513k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f509e = q1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f510f = q1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f511g = q1.l.n0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0288a.f3550a);
        this.h = q1.l.n0(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0288a.d);
    }

    @Override // M0.r
    public final void a() {
        if (this.f562b.f554p != null) {
            return;
        }
        t(u());
    }

    @Override // M0.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // M0.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // M0.r
    public final View.OnFocusChangeListener e() {
        return this.f513k;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.f512j;
    }

    @Override // M0.r
    public final View.OnFocusChangeListener g() {
        return this.f513k;
    }

    @Override // M0.r
    public final void m(EditText editText) {
        this.i = editText;
        this.f561a.setEndIconVisible(u());
    }

    @Override // M0.r
    public final void p(boolean z2) {
        if (this.f562b.f554p == null) {
            return;
        }
        t(z2);
    }

    @Override // M0.r
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f510f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f506b;

            {
                this.f506b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0029e c0029e = this.f506b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f506b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f511g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f509e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f506b;

            {
                this.f506b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f506b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f506b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f514l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f514l.addListener(new C0028d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: M0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0029e f506b;

            {
                this.f506b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0029e c0029e = this.f506b;
                        c0029e.getClass();
                        c0029e.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0029e c0029e2 = this.f506b;
                        c0029e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0029e2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f515m = ofFloat3;
        ofFloat3.addListener(new C0028d(this, i));
    }

    @Override // M0.r
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new D0.p(2, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f562b.d() == z2;
        if (z2 && !this.f514l.isRunning()) {
            this.f515m.cancel();
            this.f514l.start();
            if (z3) {
                this.f514l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f514l.cancel();
        this.f515m.start();
        if (z3) {
            this.f515m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
