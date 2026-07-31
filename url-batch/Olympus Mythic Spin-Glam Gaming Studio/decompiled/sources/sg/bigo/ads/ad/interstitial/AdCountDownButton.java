package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* loaded from: classes12.dex */
public class AdCountDownButton extends FrameLayout {
    protected final Context a;
    sg.bigo.ads.common.utils.o b;
    public boolean c;
    boolean d;
    boolean e;
    View f;
    private boolean g;
    private boolean h;
    private boolean i;
    private long j;
    private View k;
    private TextView l;

    @LayoutRes
    private int m;
    private a n;

    public interface a {
        void a();

        void a(Rect rect);
    }

    public interface b {
        void a();
    }

    public AdCountDownButton(@NonNull Context context) {
        this(context, null);
    }

    public AdCountDownButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdCountDownButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.g = false;
        this.h = false;
        this.i = false;
        this.e = false;
        this.a = context;
        setClickable(true);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.BigoAd_CountDownButton);
            int resourceId = typedArray.getResourceId(R.styleable.BigoAd_CountDownButton_bigo_ad_customLayout, 0);
            typedArray.recycle();
            sg.bigo.ads.common.utils.a.a(context, resourceId, this, true);
            this.m = resourceId;
            this.f = findViewById(R.id.bigo_ad_btn_close);
            this.k = findViewById(R.id.inter_view_stroke);
            this.l = (TextView) findViewById(R.id.inter_text_countdown);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        if (j > 0 && j <= 1000) {
            j = 1000;
        }
        TextView textView = this.l;
        if (textView == null) {
            return;
        }
        if (!this.i) {
            StringBuilder sb = new StringBuilder("%d");
            sb.append(this.h ? "s" : "");
            textView.setText(sg.bigo.ads.common.utils.r.a(sb.toString(), Integer.valueOf(Math.round(j / 1000.0f))));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sg.bigo.ads.common.utils.a.a(this.a, R.string.bigo_ad_splash_skip_after, new Object[0]));
            sb2.append(" %d");
            sb2.append(this.h ? "s" : "");
            this.l.setText(sg.bigo.ads.common.utils.r.a(sb2.toString(), Integer.valueOf(Math.round(j / 1000.0f))));
        }
    }

    static /* synthetic */ boolean b(AdCountDownButton adCountDownButton) {
        adCountDownButton.c = true;
        return true;
    }

    private void g() {
        this.f.setVisibility(0);
        this.f.setClickable(true);
        this.f.setAlpha(1.0f);
    }

    private void h() {
        this.f.setVisibility(0);
        this.f.setAlpha(0.2f);
        this.f.setClickable(false);
    }

    public final void a(@LayoutRes int i) {
        if (this.m != i) {
            this.m = i;
            View view = this.f;
            int visibility = view != null ? view.getVisibility() : 8;
            View view2 = this.k;
            int visibility2 = view2 != null ? view2.getVisibility() : 8;
            TextView textView = this.l;
            int visibility3 = textView != null ? textView.getVisibility() : 8;
            removeAllViews();
            sg.bigo.ads.common.utils.a.a(this.a, i, this, true);
            this.f = findViewById(R.id.bigo_ad_btn_close);
            this.k = findViewById(R.id.inter_view_stroke);
            this.l = (TextView) findViewById(R.id.inter_text_countdown);
            View view3 = this.f;
            if (view3 != null) {
                view3.setVisibility(visibility);
            }
            View view4 = this.k;
            if (view4 != null) {
                view4.setVisibility(visibility2);
            }
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setVisibility(visibility3);
            }
            setOnCloseListener(this.n);
        }
    }

    public final void a(int i, @Nullable final b bVar) {
        this.l.setVisibility(0);
        this.k.setVisibility(8);
        this.f.setVisibility(8);
        if (this.g) {
            this.k.setVisibility(0);
            h();
        }
        if (i == 0) {
            a(this.d);
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        this.c = false;
        if (i < 0) {
            return;
        }
        sg.bigo.ads.common.utils.o oVar = new sg.bigo.ads.common.utils.o(i * 1000) { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.2
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                AdCountDownButton adCountDownButton = AdCountDownButton.this;
                adCountDownButton.a(adCountDownButton.d);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
                AdCountDownButton.b(AdCountDownButton.this);
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
                AdCountDownButton.this.j = j;
                if (AdCountDownButton.this.d) {
                    return;
                }
                AdCountDownButton.this.b(j);
            }
        };
        this.b = oVar;
        oVar.c();
    }

    public final void a(long j) {
        if (this.d) {
            b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        View view;
        View view2;
        g();
        int i = 8;
        if (this.i) {
            this.l.setVisibility(8);
            view2 = this.k;
        } else {
            this.l.setVisibility(z ? 0 : 8);
            view = this.k;
            if (z) {
                i = 0;
                view.setVisibility(i);
            }
            view2 = view;
        }
        view = view2;
        view.setVisibility(i);
    }

    public final boolean a() {
        View view = this.f;
        return view != null && view.performClick();
    }

    public final void b() {
        sg.bigo.ads.common.utils.o oVar = this.b;
        if (oVar != null) {
            oVar.d();
        }
    }

    public final void b(int i, @Nullable b bVar) {
        sg.bigo.ads.common.utils.o oVar = this.b;
        if (oVar != null) {
            oVar.b();
            this.b = null;
            a(i, bVar);
        }
    }

    public final void b(boolean z) {
        this.i = z;
        this.k.setVisibility(z ? 8 : 0);
        this.f.setVisibility(z ? 8 : 0);
        setShowCloseButtonInCountdown(!z);
    }

    public final void c() {
        sg.bigo.ads.common.utils.o oVar = this.b;
        if (oVar == null || !oVar.e()) {
            return;
        }
        this.b.c();
    }

    public final void c(boolean z) {
        this.e = z;
        if (!z) {
            f();
            return;
        }
        this.l.setVisibility(0);
        this.k.setVisibility(0);
        g();
    }

    public final void d() {
        sg.bigo.ads.common.utils.o oVar = this.b;
        if (oVar != null) {
            oVar.b();
        }
    }

    public final void e() {
        sg.bigo.ads.common.utils.o oVar = this.b;
        if (oVar != null) {
            oVar.b();
        }
        this.c = true;
        a(false);
    }

    public final void f() {
        this.l.setVisibility(0);
        this.k.setVisibility(0);
        h();
    }

    public View getCloseView() {
        return this.f;
    }

    public long getMillisUntilFinished() {
        return this.j;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.c) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBtnClickArea(int i) {
        CustomTouchImageView customTouchImageView;
        float f;
        View view = this.f;
        if (view instanceof CustomTouchImageView) {
            if (i == 1) {
                customTouchImageView = (CustomTouchImageView) view;
                f = 0.5f;
            } else {
                if (i != 2) {
                    return;
                }
                customTouchImageView = (CustomTouchImageView) view;
                f = 0.25f;
            }
            customTouchImageView.setRegionScale(f);
        }
    }

    public void setCloseImageResource(@DrawableRes int i) {
        View view = this.f;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(i);
        }
    }

    public void setOnCloseListener(@Nullable final a aVar) {
        View view = this.f;
        if (view == null) {
            return;
        }
        this.n = aVar;
        if (aVar == null) {
            view.setOnTouchListener(null);
        } else if (view instanceof CustomTouchImageView) {
            ((CustomTouchImageView) view).setCloseListener(aVar);
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    aVar.a();
                }
            });
        }
    }

    public void setShowCloseButtonInCountdown(boolean z) {
        this.g = z;
        TextView textView = this.l;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setPadding(sg.bigo.ads.common.utils.f.a(getContext(), 2), 0, 0, 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
    }

    public void setTakeoverTickEvent(boolean z) {
        this.d = z;
    }

    public void setWithUnit(boolean z) {
        this.h = z;
    }
}
