package com.my.target;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.common.menu.MenuAction;
import com.my.target.d;
import com.my.target.i;
import com.my.target.o;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class c2 extends LinearLayout implements o.a, i, View.OnClickListener {
    protected WeakReference a;
    protected final hg b;
    protected final Button c;
    protected final RadioGroup d;
    protected final TextView e;
    protected v5 f;
    private FrameLayout g;
    protected MenuAction h;
    protected final w2 i;
    protected final d.a j;
    protected final i.a k;

    public c2(Context context, i.a aVar) {
        super(context);
        this.k = aVar;
        setOrientation(1);
        Objects.requireNonNull(aVar);
        this.j = new c2$$ExternalSyntheticLambda2(aVar);
        hg a = hg.a(context);
        this.b = a;
        w2 a2 = w2.a(context);
        this.i = a2;
        setBackground(b());
        this.f = c(context);
        addView(f(context));
        View view = new View(context);
        view.setLayoutParams(c());
        view.setBackgroundColor(a2.a(w2.F));
        addView(view);
        TextView textView = new TextView(context);
        this.e = textView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a3 = a.a(hg.r);
        layoutParams.setMargins(a3, a.a(hg.n), a3, 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(a2.a(w2.s));
        textView.setTextSize(a.a(hg.S));
        textView.setTypeface(null, 1);
        addView(textView);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        scrollView.setLayoutParams(layoutParams2);
        RadioGroup b = b(context);
        this.d = b;
        scrollView.addView(b);
        addView(scrollView);
        Button a4 = a(context);
        this.c = a4;
        a4.setText(getActionText());
        addView(a4);
        this.f.setOnClickListener(this);
    }

    @Override // com.my.target.o.a
    public void a(o oVar, FrameLayout frameLayout) {
        this.g = frameLayout;
        frameLayout.addView(this, -1, -1);
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
    }

    protected abstract LinearLayout.LayoutParams c();

    protected v5 c(Context context) {
        v5 v5Var = new v5(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.b.a(hg.D), this.b.a(hg.E));
        hg hgVar = this.b;
        int i = hg.k;
        int a = hgVar.a(i);
        int a2 = this.b.a(hg.g);
        layoutParams.setMargins(a, a2, 0, a2);
        v5Var.setLayoutParams(layoutParams);
        v5Var.a(this.b.a(hg.m), this.b.a(i));
        v5Var.a(m1.a(this.b.a(hg.w), this.i.a(w2.G), context), false);
        v5Var.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.c2$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c2.this.a(view);
            }
        });
        return v5Var;
    }

    protected StateListDrawable d() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int a = this.b.a(hg.v);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, a(a));
        stateListDrawable.addState(new int[0], b(a));
        return stateListDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    protected TextView e(Context context) {
        TextView textView = new TextView(context);
        textView.setTextAlignment(4);
        textView.setTextColor(this.i.a(w2.s));
        textView.setTextSize(this.b.a(hg.X));
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setPadding(this.b.a(hg.k), 0, 0, 0);
        return textView;
    }

    protected abstract LinearLayout f(Context context);

    protected ImageView g(Context context) {
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int a = this.b.a(hg.y);
        layoutParams.setMargins(a, 0, a, 0);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(b2.a(this.b.a(hg.F), context));
        imageView.setColorFilter(this.i.a(w2.G));
        return imageView;
    }

    @NonNull
    protected abstract String getActionText();

    @Override // com.my.target.o.a
    public void m() {
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            weakReference.clear();
            this.a = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f) {
            dismiss();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    protected RadioGroup b(Context context) {
        RadioGroup radioGroup = new RadioGroup(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a = this.b.a(hg.m);
        int a2 = this.b.a(hg.r);
        layoutParams.setMargins(0, a, 0, 0);
        radioGroup.setLayoutParams(layoutParams);
        radioGroup.setPadding(a2, 0, a2, 0);
        return radioGroup;
    }

    private LayerDrawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(0);
        int a = this.b.a(hg.f);
        w2 w2Var = this.i;
        int i2 = w2.G;
        gradientDrawable.setStroke(a, w2Var.a(i2));
        gradientDrawable.setSize(i, i);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(this.i.a(i2));
        int a2 = this.b.a(hg.i);
        int i3 = i / 2;
        gradientDrawable2.setSize(i3, i3);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
        layerDrawable.setLayerInset(1, a2, a2, a2, a2);
        return layerDrawable;
    }

    protected TextView d(Context context) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        int a = this.b.a(hg.y);
        layoutParams.setMargins(a, this.b.a(hg.i), a, 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        textView.setTextColor(this.i.a(w2.v));
        textView.setTextSize(this.b.a(hg.S));
        return textView;
    }

    private GradientDrawable b(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(this.b.a(hg.f), this.i.a(w2.H));
        gradientDrawable.setSize(i, i);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.i.a(w2.r));
        float a = this.b.a(hg.n);
        gradientDrawable.setCornerRadii(new float[]{a, a, a, a, 0.0f, 0.0f, 0.0f, 0.0f});
        return gradientDrawable;
    }

    protected void a(List list) {
        if (list == null) {
            return;
        }
        int a = this.b.a(hg.m);
        int a2 = this.b.a(hg.r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final MenuAction menuAction = (MenuAction) it.next();
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setPaddingRelative(a2, a, a2, a);
            radioButton.setText(menuAction.title);
            radioButton.setTextColor(this.i.a(w2.s));
            radioButton.setTextSize(this.b.a(hg.S));
            radioButton.setButtonDrawable(d());
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.my.target.c2$$ExternalSyntheticLambda0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    c2.this.a(menuAction, compoundButton, z);
                }
            });
            this.d.addView(radioButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MenuAction menuAction, CompoundButton compoundButton, boolean z) {
        if (z) {
            this.h = menuAction;
            this.c.setEnabled(true);
        }
    }

    private Button a(Context context) {
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.b.a(hg.D));
        int a = this.b.a(hg.n);
        int a2 = this.b.a(hg.r);
        layoutParams.setMargins(a2, a, a2, a);
        button.setLayoutParams(layoutParams);
        button.setTextColor(this.i.a(w2.y));
        button.setTextSize(this.b.a(hg.S));
        w2 w2Var = this.i;
        button.setBackground(w2Var.a(w2Var.a(w2.B), this.i.a(w2.A), this.i.a(w2.C), this.b.a(r2)));
        button.setTextAlignment(4);
        button.setEnabled(false);
        return button;
    }
}
