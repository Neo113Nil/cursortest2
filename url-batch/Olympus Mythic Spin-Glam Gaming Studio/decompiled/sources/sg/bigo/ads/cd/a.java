package sg.bigo.ads.cd;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import sg.bigo.ads.an.i;

/* loaded from: classes4.dex */
public final class a extends GestureDetector {

    @NonNull
    public C1862a a;
    public i b;
    private long c;

    /* renamed from: sg.bigo.ads.cd.a$a, reason: collision with other inner class name */
    public static class C1862a extends GestureDetector.SimpleOnGestureListener {
        public boolean a = false;

        C1862a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a(@NonNull Context context) {
        this(context, new C1862a());
    }

    private a(Context context, @NonNull C1862a c1862a) {
        super(context, c1862a);
        this.c = -1L;
        this.b = new i();
        this.a = c1862a;
        setIsLongpressEnabled(false);
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.c <= 3000;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.a.a = false;
            this.c = System.currentTimeMillis();
            this.b.a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.b.b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }
}
