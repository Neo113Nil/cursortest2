package yads;

import android.R;
import android.app.Activity;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.X3;
import com.safedk.android.internal.partials.YandexNetworkBridge;
import kotlin.math.MathKt;

/* loaded from: classes3.dex */
public final class r1 implements e2, o3 {
    public final Activity a;
    public final RelativeLayout b;
    public final o2 c;
    public final Window d;
    public final String e;
    public final p3 f;
    public final LinearLayout g;
    public final o8 h;
    public final ob3 i;
    public final TextView j;
    public final ProgressBar k;

    public r1(Activity activity, RelativeLayout relativeLayout, o2 o2Var, Window window, String str) {
        p3 p3Var = new p3(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setId(1);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(m8.c);
        o8 o8Var = new o8();
        ob3 ob3Var = new ob3();
        this.a = activity;
        this.b = relativeLayout;
        this.c = o2Var;
        this.d = window;
        this.e = str;
        this.f = p3Var;
        this.g = linearLayout;
        this.h = o8Var;
        this.i = ob3Var;
        TextView textView = new TextView(activity, null, R.style.Widget.TextView);
        yg0 yg0Var = q8.g.b;
        textView.setTextSize(0, MathKt.roundToInt(TypedValue.applyDimension(1, r9.a(activity), activity.getResources().getDisplayMetrics())));
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.SANS_SERIF);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setHorizontallyScrolling(false);
        textView.setHorizontalFadingEdgeEnabled(false);
        textView.setVerticalScrollBarEnabled(false);
        textView.setVerticalFadingEdgeEnabled(false);
        textView.setTextColor(activity.getResources().getColor(R.color.primary_text_light));
        int roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 8.0f, activity.getResources().getDisplayMetrics()));
        textView.setPadding(roundToInt, 0, roundToInt, 0);
        this.j = textView;
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        progressBar.setProgressDrawable(n8.b);
        progressBar.setProgress(0);
        progressBar.setMax(10000);
        this.k = progressBar;
    }

    @Override // yads.e2
    public final void a() {
        p3 p3Var = this.f;
        p3Var.getClass();
        int i = oa.$r8$clinit;
        try {
            WebView.class.getDeclaredMethod(X3.i.u0, null).invoke(p3Var, null);
        } catch (Exception unused) {
        }
        p3.class.toString();
        boolean z = ob1.a;
    }

    @Override // yads.e2
    public final void b() {
        p3 p3Var = this.f;
        p3Var.getClass();
        int i = oa.$r8$clinit;
        try {
            WebView.class.getDeclaredMethod(X3.i.t0, null).invoke(p3Var, null);
        } catch (Exception unused) {
        }
        p3.class.toString();
        boolean z = ob1.a;
    }

    @Override // yads.e2
    public final void c() {
        this.b.setBackgroundDrawable(n8.a);
        LinearLayout linearLayout = this.g;
        o8 o8Var = this.h;
        Activity activity = this.a;
        o8Var.getClass();
        q8 q8Var = q8.f;
        ImageView a = o8.a(activity, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3NpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDIxIDc5LjE1NDkxMSwgMjAxMy8xMC8yOS0xMTo0NzoxNiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDplYTU1MjZhNi03OTE2LTRmMTgtODYzMS0yNzhhZDExMmYzZTEiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6NjU5RTY2QUVFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6NjU5RTY2QURFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6OTI2NGYzMTUtN2UxOS00ZmMzLWEwMTMtMTk4Y2FmMzE3ODYyIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOmVhNTUyNmE2LTc5MTYtNGYxOC04NjMxLTI3OGFkMTEyZjNlMSIvPiA8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", yg0.a(activity, q8Var.a(activity) - 2));
        o8 o8Var2 = this.h;
        Activity activity2 = this.a;
        o8Var2.getClass();
        ImageView a2 = o8.a(activity2, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2tpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNS1jMDIxIDc5LjE1NDkxMSwgMjAxMy8xMC8yOS0xMTo0NzoxNiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDo1OGQxOWE2NS0yODhhLTQ2MjctODllMi01ZGQyMzkxZjc5OTYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6NjU5RTY2QjJFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6NjU5RTY2QjFFRkQ5MTFFMzhDMDlBNTRBQThBMUNENDAiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QkM1NDk2MENFRkQ3MTFFMzhDMDlBNTRBQThBMUNENDAiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6QkM1NDk2MERFRkQ3MTFFMzhDMDlBNTRBQThBMUNENDAiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4i7sDRAAACLElEQVR42uTbPU4CQRTA8fHRkRgLQkMCsbCw4QqeSTkDhQVR46X0HJhQkFDoBfRNnImbDbCzs+9j5jnJI1F3i/8vrMAA4P7WFOcVZ+7srnlonMZfQCP+BWeJ82wUYR7alqF1GgFi/CwcODGIEOMn4edZRBjhzSPOTeuEMc4dzhvOl7H4uC5xbv09YINzOHKihXvCqXgXmjceYIuzMojQFe+bt/GfoDWEpPjmo4AlhOT4NoAFhF7xxwBqRugdfwqgRoSs+HMANSFkx3cB1IAwKD4FoGSEwfGpACUikMT3ASgJgSy+L0AJCKTxOQCaCOTxuQAaCCzxQwAkEdjihwJIILDGUwBwIrDHUwFwIIjEUwJQIojFUwNQIIjGcwAMQRCP5wLIQVCJ92vE+LT1E+fd/b6/MG79rfm+w5VWvF8XAi9eFjhPZwKdVjznJdDnclCLlwLoQlCLlwRIRRCNlwbw65vomCoBzj3UaewsiQKkxKsggHL8wSnvMYJy/Mopb7SCcvzWKW+0gnI896aKCkDuCxsVBCgkXg0BCopXQYDC4sURoMB4UQQoNF4MAQqOF0GAwuPZEaCCeFYEqCSeDQEqimdBAKL4Bye4jUWJAETxH05+kSBApfFkCFBxPAkCVB4/GAEMxA9CACPx2QhgKD4LAYzF90YYGYyPK+nzCR5gjXNtLD4V4QYCwM5gfNfl4JvXHmCPc99AsBR/CmEXmvfNg/7D1+cXrvX1+R8BBgCgYlliXOirewAAAABJRU5ErkJggg==", yg0.a(activity2, q8Var.a(activity2)));
        a2.setTag(el3.a("browser_close_button"));
        a(a, a2);
        linearLayout.addView(this.j, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(a, new LinearLayout.LayoutParams(-2, -1));
        linearLayout.addView(a2, new LinearLayout.LayoutParams(-2, -1));
        RelativeLayout relativeLayout = this.b;
        LinearLayout linearLayout2 = this.g;
        Activity activity3 = this.a;
        yg0 yg0Var = q8.e.b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, yg0.a(activity3, r3.a(activity3)));
        layoutParams.addRule(10);
        relativeLayout.addView(linearLayout2, layoutParams);
        Activity activity4 = this.a;
        LinearLayout linearLayout3 = this.g;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, MathKt.roundToInt(TypedValue.applyDimension(1, 2.0f, activity4.getResources().getDisplayMetrics())));
        layoutParams2.addRule(3, linearLayout3.getId());
        this.b.addView(this.k, layoutParams2);
        a(8);
        RelativeLayout relativeLayout2 = this.b;
        p3 p3Var = this.f;
        LinearLayout linearLayout4 = this.g;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(3, linearLayout4.getId());
        relativeLayout2.addView(p3Var, layoutParams3);
        YandexNetworkBridge.webviewLoadUrl(this.f, this.e);
        this.c.a(6, null);
        boolean z = ob1.a;
    }

    @Override // yads.e2
    public final boolean d() {
        boolean z;
        if (this.f.canGoBack()) {
            p3 p3Var = this.f;
            if (p3Var.canGoBack()) {
                p3Var.goBack();
            }
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // yads.e2
    public final void f() {
        this.d.requestFeature(1);
        if (pa.a(16)) {
            this.d.getDecorView().setSystemUiVisibility(256);
        }
    }

    @Override // yads.e2
    public final void g() {
        this.f.c();
    }

    @Override // yads.e2
    public final void onAdClosed() {
        this.c.a(8, null);
    }

    public static final void b(r1 r1Var, View view) {
        r1Var.c.a.finish();
    }

    public final void a(ImageView imageView, ImageView imageView2) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: yads.r1$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.a(r1.this, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: yads.r1$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.b(r1.this, view);
            }
        });
    }

    public static final void a(r1 r1Var, View view) {
        String url = r1Var.f.getUrl();
        if (url != null) {
            r1Var.i.a(r1Var.a, url);
        }
    }

    public final void a(int i) {
        if (i == 0 && this.k.getVisibility() != 0) {
            this.k.bringToFront();
            this.b.requestLayout();
            this.b.invalidate();
        }
        this.k.setVisibility(i);
    }
}
