package M0;

import K.S;
import K.X;
import K.Y;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import q0.AbstractC0288a;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f523e;

    /* renamed from: f, reason: collision with root package name */
    public final int f524f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f525g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0025a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0026b f526j;

    /* renamed from: k, reason: collision with root package name */
    public final k f527k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f528l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f529m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f530n;

    /* renamed from: o, reason: collision with root package name */
    public long f531o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f532p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f533q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f534r;

    public l(q qVar) {
        super(qVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0025a(i, this);
        this.f526j = new ViewOnFocusChangeListenerC0026b(this, i);
        this.f527k = new k(this);
        this.f531o = Long.MAX_VALUE;
        this.f524f = q1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f523e = q1.l.m0(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f525g = q1.l.n0(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0288a.f3550a);
    }

    @Override // M0.r
    public final void a() {
        if (this.f532p.isTouchExplorationEnabled() && q1.l.S(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new D0.p(3, this));
    }

    @Override // M0.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // M0.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // M0.r
    public final View.OnFocusChangeListener e() {
        return this.f526j;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // M0.r
    public final k h() {
        return this.f527k;
    }

    @Override // M0.r
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // M0.r
    public final boolean j() {
        return this.f528l;
    }

    @Override // M0.r
    public final boolean l() {
        return this.f530n;
    }

    @Override // M0.r
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: M0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = l.this;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f531o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f529m = false;
                    }
                    lVar.u();
                    lVar.f529m = true;
                    lVar.f531o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: M0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = l.this;
                lVar.f529m = true;
                lVar.f531o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f561a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!q1.l.S(editText) && this.f532p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = S.f360a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // M0.r
    public final void n(L.j jVar) {
        boolean S2 = q1.l.S(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f482a;
        if (!S2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // M0.r
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f532p.isEnabled() || q1.l.S(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f530n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f529m = true;
            this.f531o = System.currentTimeMillis();
        }
    }

    @Override // M0.r
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f525g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f524f);
        ofFloat.addUpdateListener(new X(this));
        this.f534r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f523e);
        ofFloat2.addUpdateListener(new X(this));
        this.f533q = ofFloat2;
        ofFloat2.addListener(new Y(1, this));
        this.f532p = (AccessibilityManager) this.f563c.getSystemService("accessibility");
    }

    @Override // M0.r
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f530n != z2) {
            this.f530n = z2;
            this.f534r.cancel();
            this.f533q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f531o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f529m = false;
        }
        if (this.f529m) {
            this.f529m = false;
            return;
        }
        t(!this.f530n);
        if (!this.f530n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
