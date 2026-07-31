package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.common.menu.MenuAction;
import com.my.target.common.models.ImageData;
import com.my.target.i;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class e3 extends c2 {
    private TextView l;

    public e3(Context context, i.a aVar) {
        super(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        MenuAction menuAction = this.h;
        if (menuAction != null) {
            this.j.a(menuAction);
        }
    }

    @Override // com.my.target.i
    public View a() {
        return this;
    }

    @Override // com.my.target.i
    public void a(String str, String str2, String str3, ImageData imageData, String str4, List list) {
        TextView textView = this.l;
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                str = fi.a;
            }
            textView.setText(str);
        }
        TextView textView2 = this.e;
        if (TextUtils.isEmpty(str3)) {
            str3 = fi.c;
        }
        textView2.setText(str3);
        Button button = this.c;
        if (TextUtils.isEmpty(str4)) {
            str4 = fi.d;
        }
        button.setText(str4);
        a(list);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.e3$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e3.this.b(view);
            }
        });
        try {
            o a = o.a(this, getContext());
            this.a = new WeakReference(a);
            a.show();
        } catch (Throwable th) {
            th.printStackTrace();
            mi.b("AdChoicesOptionsController: Unable to start adchoices dialog");
            m();
        }
    }

    @Override // com.my.target.c2
    protected LinearLayout.LayoutParams c() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.b.a(hg.d));
        int a = this.b.a(hg.g);
        int a2 = this.b.a(hg.r);
        layoutParams.setMargins(a2, a, a2, 0);
        return layoutParams;
    }

    @Override // com.my.target.i
    public void dismiss() {
        o oVar;
        WeakReference weakReference = this.a;
        if (weakReference == null || (oVar = (o) weakReference.get()) == null) {
            return;
        }
        oVar.dismiss();
    }

    @Override // com.my.target.c2, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.c2
    protected LinearLayout f(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f);
        this.l = e(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.l.setLayoutParams(layoutParams);
        linearLayout.addView(this.l);
        return linearLayout;
    }

    @Override // com.my.target.c2
    @NonNull
    protected String getActionText() {
        return fi.b;
    }

    @Override // com.my.target.c2, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f) {
            this.k.a();
        }
    }

    @Override // com.my.target.c2, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
