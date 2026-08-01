package P0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.luckycounter.drinkwater.R;
import t0.AbstractC0369a;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f928e;

    /* renamed from: f, reason: collision with root package name */
    public final int f929f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f930g;
    public final TimeInterpolator h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0033a f931j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0034b f932k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f933l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f934m;

    public e(p pVar) {
        super(pVar);
        this.f931j = new ViewOnClickListenerC0033a(0, this);
        this.f932k = new ViewOnFocusChangeListenerC0034b(this, 0);
        this.f928e = F1.d.d0(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f929f = F1.d.d0(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f930g = F1.d.e0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0369a.f4162a);
        this.h = F1.d.e0(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0369a.d);
    }

    @Override // P0.q
    public final void a() {
        if (this.f980b.f972p != null) {
            return;
        }
        t(u());
    }

    @Override // P0.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // P0.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // P0.q
    public final View.OnFocusChangeListener e() {
        return this.f932k;
    }

    @Override // P0.q
    public final View.OnClickListener f() {
        return this.f931j;
    }

    @Override // P0.q
    public final View.OnFocusChangeListener g() {
        return this.f932k;
    }

    @Override // P0.q
    public final void m(EditText editText) {
        this.i = editText;
        this.f979a.setEndIconVisible(u());
    }

    @Override // P0.q
    public final void p(boolean z2) {
        if (this.f980b.f972p == null) {
            return;
        }
        t(z2);
    }

    @Override // P0.q
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f929f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f925b;

            {
                this.f925b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        e eVar = this.f925b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f925b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(RecyclerView.f1949A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f930g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f928e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f925b;

            {
                this.f925b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f925b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f925b;
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
        this.f933l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f933l.addListener(new C0036d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1949A0);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f925b;

            {
                this.f925b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        e eVar = this.f925b;
                        eVar.getClass();
                        eVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        e eVar2 = this.f925b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f934m = ofFloat3;
        ofFloat3.addListener(new C0036d(this, i));
    }

    @Override // P0.q
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new G0.o(2, this));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f980b.d() == z2;
        if (z2 && !this.f933l.isRunning()) {
            this.f934m.cancel();
            this.f933l.start();
            if (z3) {
                this.f933l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f933l.cancel();
        this.f934m.start();
        if (z3) {
            this.f934m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
