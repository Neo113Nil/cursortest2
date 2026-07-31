package sg.bigo.ads.cb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.s;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes15.dex */
public final class d<T extends View> implements c<T> {
    public static final long a = s.a.a(1) / 60;
    public final T b;
    public final Context c;
    public final sg.bigo.ads.cb.a d;
    boolean e;
    public View f;
    public boolean g;
    private final sg.bigo.ads.aq.a i;
    private Canvas j;
    private Bitmap k;
    private a l;
    private long m;
    public final ViewTreeObserver.OnPreDrawListener h = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.cb.d.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - d.this.m) < d.a) {
                return true;
            }
            d.b(d.this);
            d.this.m = elapsedRealtime;
            return true;
        }
    };
    private int n = -1;
    private final WeakHashMap<TextureView, Object> o = new WeakHashMap<>();

    public static class a extends BitmapDrawable {
        final d a;
        private final Paint b;

        private a(d dVar, Bitmap bitmap) {
            super(dVar.b.getResources(), bitmap);
            this.a = dVar;
            this.b = new Paint();
        }

        /* synthetic */ a(d dVar, Bitmap bitmap, byte b) {
            this(dVar, bitmap);
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            b bVar = this.a.d.b;
            if (bVar != null) {
                this.b.setColor(bVar.b());
                canvas.drawRect(getBounds(), this.b);
            }
        }
    }

    public d(T t) {
        this.b = t;
        Context context = t.getContext();
        this.c = context;
        this.i = new sg.bigo.ads.aq.b(context);
        this.d = new sg.bigo.ads.cb.a();
    }

    static /* synthetic */ void b(d dVar) {
        b bVar;
        Bitmap bitmap;
        if (dVar.e) {
            return;
        }
        sg.bigo.ads.cb.a aVar = dVar.d;
        Drawable drawable = aVar.a;
        if ((drawable == null || (drawable instanceof a)) && (bVar = aVar.b) != null && bVar.c() > 0.0f && v.c(dVar.b) && sg.bigo.ads.ca.a.a(dVar.b, new Rect())) {
            b bVar2 = dVar.d.b;
            if (bVar2 == null) {
                dVar.b();
                return;
            }
            View view = dVar.f;
            if (view == null || !dVar.b.isShown()) {
                dVar.b();
                return;
            }
            Rect rect = new Rect();
            bVar2.a(rect);
            byte b = 0;
            if (dVar.j == null || dVar.l == null || dVar.k == null) {
                dVar.b();
                int measuredWidth = (dVar.b.getMeasuredWidth() - rect.left) - rect.right;
                int measuredHeight = (dVar.b.getMeasuredHeight() - rect.top) - rect.bottom;
                int max = Math.max(1, (int) (measuredWidth / bVar2.d()));
                int max2 = Math.max(1, (int) (measuredHeight / bVar2.d()));
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                dVar.k = e.a(max, max2, config);
                dVar.l = new a(dVar, e.a(max, max2, config), b);
                if (dVar.k == null) {
                    return;
                }
                dVar.j = new Canvas(dVar.k);
                dVar.d.a(dVar.l);
                if (!dVar.i.a(dVar.k, bVar2.c())) {
                    return;
                }
            }
            Point a2 = v.a(view, dVar.b);
            dVar.k.eraseColor(bVar2.b());
            float alpha = dVar.b.getAlpha();
            dVar.b.setAlpha(0.0f);
            dVar.e = true;
            float d = 1.0f / bVar2.d();
            int save = dVar.j.save();
            try {
                dVar.j.scale(d, d);
                dVar.j.translate((-a2.x) - rect.left, (-a2.y) - rect.top);
                if (view.getBackground() != null) {
                    view.getBackground().draw(dVar.j);
                }
                view.draw(dVar.j);
            } catch (Exception unused) {
            } catch (Throwable th) {
                dVar.j.restoreToCount(save);
                throw th;
            }
            dVar.j.restoreToCount(save);
            dVar.a();
            Set<TextureView> keySet = dVar.o.keySet();
            if (!l.a(keySet)) {
                int i = a2.x;
                Rect rect2 = new Rect(rect.left + i, a2.y + rect.top, (i + dVar.b.getMeasuredWidth()) - rect.right, (a2.y + dVar.b.getMeasuredHeight()) - rect.bottom);
                Iterator<TextureView> it = keySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TextureView next = it.next();
                    if (next != null && next.isOpaque() && v.d(next)) {
                        Point a3 = v.a(view, next);
                        int i2 = a3.x;
                        Rect rect3 = new Rect(i2, a3.y, next.getMeasuredWidth() + i2, a3.y + next.getMeasuredHeight());
                        Rect rect4 = new Rect(rect3);
                        if (rect4.intersect(rect2) && (bitmap = next.getBitmap()) != null) {
                            int i3 = rect4.left - rect3.left;
                            int i4 = rect4.top - rect3.top;
                            Rect rect5 = new Rect(i3, i4, rect4.width() + i3, rect4.height() + i4);
                            int i5 = rect4.left - rect2.left;
                            int i6 = rect4.top - rect2.top;
                            Rect rect6 = new Rect(i5, i6, rect4.width() + i5, rect4.height() + i6);
                            int save2 = dVar.j.save();
                            try {
                                dVar.j.scale(d, d);
                                dVar.j.drawBitmap(bitmap, rect5, rect6, new Paint());
                            } catch (Exception unused2) {
                            } catch (Throwable th2) {
                                dVar.j.restoreToCount(save2);
                                throw th2;
                            }
                            dVar.j.restoreToCount(save2);
                            break;
                        }
                    }
                }
            }
            dVar.e = false;
            dVar.b.setAlpha(alpha);
            dVar.i.a(dVar.k, dVar.l.getBitmap());
            dVar.d.invalidateSelf();
        }
    }

    static /* synthetic */ int d(d dVar) {
        int i = dVar.n;
        dVar.n = i + 1;
        return i;
    }

    public final void a() {
        if (!(this.f instanceof ViewGroup) || this.n == this.o.size()) {
            return;
        }
        this.n = 0;
        this.o.clear();
        v.a((ViewGroup) this.f, new sg.bigo.ads.an.d<View>() { // from class: sg.bigo.ads.cb.d.2
            @Override // sg.bigo.ads.an.d
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                if (view2 instanceof TextureView) {
                    d.this.o.put((TextureView) view2, d.this);
                    d.d(d.this);
                }
            }
        });
    }

    public final void b() {
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            bitmap.recycle();
            this.k = null;
        }
        if (this.l != null) {
            this.l = null;
        }
        this.i.a();
    }

    @Override // sg.bigo.ads.cb.c
    public final void setBlurStyle(b bVar) {
        sg.bigo.ads.cb.a aVar = this.d;
        if ((bVar == null && aVar.b == null) || bVar == aVar.b) {
            return;
        }
        aVar.b = bVar;
        aVar.invalidateSelf();
        this.m = 0L;
        b();
    }
}
