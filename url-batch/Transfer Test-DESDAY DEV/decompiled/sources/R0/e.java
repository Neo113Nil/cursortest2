package R0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import com.google.android.material.internal.CheckableImageButton;
import v0.AbstractC0341a;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f662e;

    /* renamed from: f, reason: collision with root package name */
    public final int f663f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f664g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0027a f665j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0028b f666k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f667l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f668m;

    public e(p pVar) {
        super(pVar);
        this.f665j = new ViewOnClickListenerC0027a(0, this);
        this.f666k = new ViewOnFocusChangeListenerC0028b(this, 0);
        this.f662e = A.c.p0(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f663f = A.c.p0(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f664g = A.c.q0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0341a.f4037a);
        this.h = A.c.q0(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0341a.d);
    }

    @Override // R0.q
    public final void a() {
        if (this.f714b.f706p != null) {
            return;
        }
        t(u());
    }

    @Override // R0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // R0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // R0.q
    public final View.OnFocusChangeListener e() {
        return this.f666k;
    }

    @Override // R0.q
    public final View.OnClickListener f() {
        return this.f665j;
    }

    @Override // R0.q
    public final View.OnFocusChangeListener g() {
        return this.f666k;
    }

    @Override // R0.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f713a.setEndIconVisible(u());
    }

    @Override // R0.q
    public final void p(boolean z2) {
        if (this.f714b.f706p == null) {
            return;
        }
        t(z2);
    }

    @Override // R0.q
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f663f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f659b;

            {
                this.f659b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        e eVar = this.f659b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f659b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.f1570A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f664g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f662e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f659b;

            {
                this.f659b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f659b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f659b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f667l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f667l.addListener(new C0030d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1570A0);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f659b;

            {
                this.f659b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f659b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f659b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f668m = ofFloat3;
        ofFloat3.addListener(new C0030d(this, i));
    }

    @Override // R0.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new B0.b(3, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f714b.d() == z2;
        if (z2 && !this.f667l.isRunning()) {
            this.f668m.cancel();
            this.f667l.start();
            if (z3) {
                this.f667l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f667l.cancel();
        this.f668m.start();
        if (z3) {
            this.f668m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
