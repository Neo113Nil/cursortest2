package sg.bigo.ads.cu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.f;

/* loaded from: classes15.dex */
public final class a extends FrameLayout {

    @NonNull
    public final Drawable a;
    private final int b;

    @Nullable
    private b c;

    @NonNull
    private EnumC1883a d;
    private final int e;
    private final int f;
    private final int g;
    private boolean h;
    private final Rect i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private boolean m;

    @Nullable
    private c n;

    /* renamed from: sg.bigo.ads.cu.a$a, reason: collision with other inner class name */
    public enum EnumC1883a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);

        final int h;

        EnumC1883a(int i2) {
            this.h = i2;
        }
    }

    public interface b {
        void a();
    }

    final class c implements Runnable {
        private c() {
        }

        /* synthetic */ c(a aVar, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.setClosePressed(false);
        }
    }

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private a(@NonNull Context context, byte b2) {
        super(context, null, 0);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        Drawable a = sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close);
        this.a = a;
        this.d = EnumC1883a.TOP_RIGHT;
        a.setState(FrameLayout.EMPTY_STATE_SET);
        a.setCallback(this);
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = f.a(context, 50);
        this.f = f.a(context, 30);
        this.g = f.a(context, 8);
        setWillNotDraw(false);
        this.m = true;
    }

    private static void a(EnumC1883a enumC1883a, int i, Rect rect, Rect rect2) {
        Gravity.apply(enumC1883a.h, i, i, rect, rect2);
    }

    @VisibleForTesting
    private boolean a() {
        return this.a.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    @VisibleForTesting
    private boolean a(int i, int i2, int i3) {
        Rect rect = this.j;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z) {
        if (z == a()) {
            return;
        }
        this.a.setState(z ? FrameLayout.SELECTED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        invalidate(this.j);
    }

    public final void a(EnumC1883a enumC1883a, Rect rect, Rect rect2) {
        a(enumC1883a, this.e, rect, rect2);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.h) {
            this.h = false;
            this.i.set(0, 0, getWidth(), getHeight());
            a(this.d, this.i, this.j);
            this.l.set(this.j);
            Rect rect = this.l;
            int i = this.g;
            rect.inset(i, i);
            a(this.d, this.f, this.l, this.k);
            this.a.setBounds(this.k);
        }
        if (this.a.isVisible()) {
            this.a.draw(canvas);
        }
    }

    @VisibleForTesting
    final Rect getCloseBounds() {
        return this.j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        byte b2 = 0;
        if (!a((int) motionEvent.getX(), (int) motionEvent.getY(), this.b) || (!this.m && !this.a.isVisible())) {
            setClosePressed(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setClosePressed(true);
        } else if (action != 1) {
            if (action == 3) {
                setClosePressed(false);
            }
        } else if (a()) {
            if (this.n == null) {
                this.n = new c(this, b2);
            }
            postDelayed(this.n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            b bVar = this.c;
            if (bVar != null) {
                bVar.a();
            }
        }
        return true;
    }

    public final void setCloseAlwaysInteractable(boolean z) {
        this.m = z;
    }

    @VisibleForTesting
    final void setCloseBoundChanged(boolean z) {
        this.h = z;
    }

    @VisibleForTesting
    final void setCloseBounds(Rect rect) {
        this.j.set(rect);
    }

    public final void setClosePosition(@NonNull EnumC1883a enumC1883a) {
        this.d = enumC1883a;
        this.h = true;
        invalidate();
    }

    public final void setCloseVisible(boolean z) {
        if (this.a.setVisible(z, false)) {
            invalidate(this.j);
        }
    }

    public final void setOnCloseListener(@Nullable b bVar) {
        this.c = bVar;
    }
}
