package Q;

import K.T;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import l.C0233r0;

/* loaded from: classes.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f621r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f622a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f623b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f624c;
    public b d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f625e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f626f;

    /* renamed from: g, reason: collision with root package name */
    public final int f627g;
    public final int h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f628j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f629k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f630l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f631m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f632n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f633o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f634p;

    /* renamed from: q, reason: collision with root package name */
    public final C0233r0 f635q;

    public h(C0233r0 c0233r0) {
        a aVar = new a();
        aVar.f616e = Long.MIN_VALUE;
        aVar.f618g = -1L;
        aVar.f617f = 0L;
        this.f622a = aVar;
        this.f623b = new AccelerateInterpolator();
        float[] fArr = {RecyclerView.f1570A0, RecyclerView.f1570A0};
        this.f625e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f626f = fArr2;
        float[] fArr3 = {RecyclerView.f1570A0, RecyclerView.f1570A0};
        this.i = fArr3;
        float[] fArr4 = {RecyclerView.f1570A0, RecyclerView.f1570A0};
        this.f628j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f629k = fArr5;
        this.f624c = c0233r0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f627g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f621r;
        aVar.f613a = 500;
        aVar.f614b = 500;
        this.f635q = c0233r0;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float b2 = b(this.f625e[i] * f3, RecyclerView.f1570A0, this.f626f[i]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f623b;
        if (c2 < RecyclerView.f1570A0) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= RecyclerView.f1570A0) {
                f5 = 0.0f;
                if (f5 != RecyclerView.f1570A0) {
                    return RecyclerView.f1570A0;
                }
                float f6 = this.i[i];
                float f7 = this.f628j[i];
                float f8 = this.f629k[i];
                float f9 = f6 * f4;
                return f5 > RecyclerView.f1570A0 ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != RecyclerView.f1570A0) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 == RecyclerView.f1570A0) {
            return RecyclerView.f1570A0;
        }
        int i = this.f627g;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= RecyclerView.f1570A0) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f633o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < RecyclerView.f1570A0) {
            return f2 / (-f3);
        }
        return RecyclerView.f1570A0;
    }

    public final void d() {
        int i = 0;
        if (this.f631m) {
            this.f633o = false;
            return;
        }
        a aVar = this.f622a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f616e);
        int i3 = aVar.f614b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f618g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0233r0 c0233r0;
        int count;
        a aVar = this.f622a;
        float f2 = aVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f615c);
        if (abs == 0 || (count = (c0233r0 = this.f635q).getCount()) == 0) {
            return false;
        }
        int childCount = c0233r0.getChildCount();
        int firstVisiblePosition = c0233r0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c0233r0.getChildAt(childCount - 1).getBottom() <= c0233r0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0233r0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        if (!this.f634p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f632n = true;
        this.f630l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f624c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f622a;
        aVar.f615c = a2;
        aVar.d = a3;
        if (!this.f633o && e()) {
            if (this.d == null) {
                this.d = new b(i2, this);
            }
            this.f633o = true;
            this.f631m = true;
            if (this.f630l || (i = this.h) <= 0) {
                this.d.run();
            } else {
                b bVar = this.d;
                long j2 = i;
                WeakHashMap weakHashMap = T.f372a;
                listView.postOnAnimationDelayed(bVar, j2);
            }
            this.f630l = true;
        }
        return false;
    }
}
