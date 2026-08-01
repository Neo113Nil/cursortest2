package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hg extends ci {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final ja i;
    public final ka j;
    public final gg k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [gg] */
    public hg(bi biVar) {
        super(biVar);
        int i = 1;
        this.i = new ja(i, this);
        this.j = new ka(this, i);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: gg
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                hg hgVar = hg.this;
                AutoCompleteTextView autoCompleteTextView = hgVar.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                hgVar.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = m60.T(biVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = m60.T(biVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = m60.U(biVar.getContext(), R.attr.motionEasingLinearInterpolator, y2.a);
    }

    @Override // defpackage.ci
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && g8.Q(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new p1(6, this));
    }

    @Override // defpackage.ci
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.ci
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.ci
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.ci
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.ci
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.ci
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.ci
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.ci
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: eg
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    hg hgVar = hg.this;
                    long j = uptimeMillis - hgVar.o;
                    if (j < 0 || j > 300) {
                        hgVar.m = false;
                    }
                    hgVar.t();
                    hgVar.m = true;
                    hgVar.o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: fg
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                hg hgVar = hg.this;
                hgVar.m = true;
                hgVar.o = SystemClock.uptimeMillis();
                hgVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.ci
    public final void m(k0 k0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        if (!g8.Q(this.h)) {
            k0Var.h(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // defpackage.ci
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || g8.Q(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.ci
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 0;
        ofFloat.addUpdateListener(new dg(i, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new dg(i, this));
        this.q = ofFloat2;
        ofFloat2.addListener(new w0(2, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.ci
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
