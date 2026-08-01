package R0;

import K.C0001a0;
import K.C0003b0;
import K.T;
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
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import v0.AbstractC0341a;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f675e;

    /* renamed from: f, reason: collision with root package name */
    public final int f676f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f677g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0027a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0028b f678j;

    /* renamed from: k, reason: collision with root package name */
    public final P.b f679k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f680l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f681m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f682n;

    /* renamed from: o, reason: collision with root package name */
    public long f683o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f684p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f685q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f686r;

    public k(p pVar) {
        super(pVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0027a(i, this);
        this.f678j = new ViewOnFocusChangeListenerC0028b(this, i);
        this.f679k = new P.b(this);
        this.f683o = Long.MAX_VALUE;
        this.f676f = A.c.p0(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f675e = A.c.p0(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f677g = A.c.q0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0341a.f4037a);
    }

    @Override // R0.q
    public final void a() {
        if (this.f684p.isTouchExplorationEnabled() && A.c.Y(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new B0.b(4, this));
    }

    @Override // R0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // R0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // R0.q
    public final View.OnFocusChangeListener e() {
        return this.f678j;
    }

    @Override // R0.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // R0.q
    public final P.b h() {
        return this.f679k;
    }

    @Override // R0.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // R0.q
    public final boolean j() {
        return this.f680l;
    }

    @Override // R0.q
    public final boolean l() {
        return this.f682n;
    }

    @Override // R0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: R0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f683o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f681m = false;
                    }
                    kVar.u();
                    kVar.f681m = true;
                    kVar.f683o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: R0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f681m = true;
                kVar.f683o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f713a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!A.c.Y(editText) && this.f684p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = T.f372a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // R0.q
    public final void n(L.k kVar) {
        if (!A.c.Y(this.h)) {
            kVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f482a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // R0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f684p.isEnabled() || A.c.Y(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f682n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f681m = true;
            this.f683o = System.currentTimeMillis();
        }
    }

    @Override // R0.q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1570A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f677g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f676f);
        ofFloat.addUpdateListener(new C0001a0(this));
        this.f686r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1570A0);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f675e);
        ofFloat2.addUpdateListener(new C0001a0(this));
        this.f685q = ofFloat2;
        ofFloat2.addListener(new C0003b0(1, this));
        this.f684p = (AccessibilityManager) this.f715c.getSystemService("accessibility");
    }

    @Override // R0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f682n != z2) {
            this.f682n = z2;
            this.f686r.cancel();
            this.f685q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f683o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f681m = false;
        }
        if (this.f681m) {
            this.f681m = false;
            return;
        }
        t(!this.f682n);
        if (!this.f682n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
