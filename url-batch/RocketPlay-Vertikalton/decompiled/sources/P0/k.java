package P0;

import K.C0006a0;
import K.C0008b0;
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
import com.google.android.material.textfield.TextInputLayout;
import com.luckycounter.drinkwater.R;
import java.util.WeakHashMap;
import t0.AbstractC0369a;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f941e;

    /* renamed from: f, reason: collision with root package name */
    public final int f942f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f943g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0033a i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0034b f944j;

    /* renamed from: k, reason: collision with root package name */
    public final P.b f945k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f946l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f947m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f948n;

    /* renamed from: o, reason: collision with root package name */
    public long f949o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f950p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f951q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f952r;

    public k(p pVar) {
        super(pVar);
        int i = 1;
        this.i = new ViewOnClickListenerC0033a(i, this);
        this.f944j = new ViewOnFocusChangeListenerC0034b(this, i);
        this.f945k = new P.b(this);
        this.f949o = Long.MAX_VALUE;
        this.f942f = F1.d.d0(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f941e = F1.d.d0(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f943g = F1.d.e0(pVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0369a.f4162a);
    }

    @Override // P0.q
    public final void a() {
        if (this.f950p.isTouchExplorationEnabled() && F1.l.O(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new G0.o(3, this));
    }

    @Override // P0.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // P0.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // P0.q
    public final View.OnFocusChangeListener e() {
        return this.f944j;
    }

    @Override // P0.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // P0.q
    public final P.b h() {
        return this.f945k;
    }

    @Override // P0.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // P0.q
    public final boolean j() {
        return this.f946l;
    }

    @Override // P0.q
    public final boolean l() {
        return this.f948n;
    }

    @Override // P0.q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: P0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                k kVar = k.this;
                kVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - kVar.f949o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        kVar.f947m = false;
                    }
                    kVar.u();
                    kVar.f947m = true;
                    kVar.f949o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: P0.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = k.this;
                kVar.f947m = true;
                kVar.f949o = System.currentTimeMillis();
                kVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f979a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!F1.l.O(editText) && this.f950p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = T.f633a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // P0.q
    public final void n(L.j jVar) {
        if (!F1.l.O(this.h)) {
            jVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f795a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // P0.q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f950p.isEnabled() || F1.l.O(this.h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f948n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            u();
            this.f947m = true;
            this.f949o = System.currentTimeMillis();
        }
    }

    @Override // P0.q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1949A0, 1.0f);
        TimeInterpolator timeInterpolator = this.f943g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f942f);
        ofFloat.addUpdateListener(new C0006a0(this));
        this.f952r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.f1949A0);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f941e);
        ofFloat2.addUpdateListener(new C0006a0(this));
        this.f951q = ofFloat2;
        ofFloat2.addListener(new C0008b0(1, this));
        this.f950p = (AccessibilityManager) this.f981c.getSystemService("accessibility");
    }

    @Override // P0.q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z2) {
        if (this.f948n != z2) {
            this.f948n = z2;
            this.f952r.cancel();
            this.f951q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f949o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f947m = false;
        }
        if (this.f947m) {
            this.f947m = false;
            return;
        }
        t(!this.f948n);
        if (!this.f948n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
