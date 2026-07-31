package com.smaato.sdk.ng.visibility;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class VisibilityTracker {
    private static final String i = "VisibilityTracker";
    private volatile WeakReference<NextGenConsumer<Double>> b;
    protected WeakReference<View> a = null;
    protected WeakReference<Listener> c = null;
    protected final List<SdkVisibilityTrackerItem> d = new ArrayList();
    protected Handler e = new Handler();
    protected boolean f = false;
    protected final VisibilityRunnable g = new VisibilityRunnable();
    protected ViewTreeObserver.OnPreDrawListener h = new ViewTreeObserver.OnPreDrawListener() { // from class: com.smaato.sdk.ng.visibility.VisibilityTracker$$ExternalSyntheticLambda0
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            boolean a;
            a = VisibilityTracker.this.a();
            return a;
        }
    };

    public interface Listener {
        void onVisibilityCheck(List<View> list, List<View> list2);
    }

    protected static class SdkVisibilityTrackerItem {
        private final String a = SdkVisibilityTrackerItem.class.getSimpleName();
        public double mMinVisibilityPercent;
        public View mTrackingView;

        protected SdkVisibilityTrackerItem() {
        }

        public boolean equals(Object obj) {
            return obj instanceof View ? obj.equals(this.mTrackingView) : super.equals(obj);
        }
    }

    protected class VisibilityRunnable implements Runnable {
        private volatile boolean d = false;
        private final Rect c = new Rect();
        private final ArrayList<View> b = new ArrayList<>();
        private final ArrayList<View> a = new ArrayList<>();

        VisibilityRunnable() {
        }

        protected boolean a(SdkVisibilityTrackerItem sdkVisibilityTrackerItem) {
            View view;
            NextGenConsumer nextGenConsumer;
            if (sdkVisibilityTrackerItem != null && (view = sdkVisibilityTrackerItem.mTrackingView) != null) {
                try {
                    if (view.isShown() && view.getParent() != null && view.getLocalVisibleRect(this.c)) {
                        float height = this.c.height() * this.c.width();
                        float height2 = view.getHeight() * view.getWidth();
                        if (height2 <= 0.0f) {
                            return false;
                        }
                        double d = height / height2;
                        r0 = d >= sdkVisibilityTrackerItem.mMinVisibilityPercent;
                        if (!r0 || this.d || VisibilityTracker.this.b == null || (nextGenConsumer = (NextGenConsumer) VisibilityTracker.this.b.get()) == null) {
                            return r0;
                        }
                        nextGenConsumer.accept(Double.valueOf(d));
                        this.d = true;
                        return r0;
                    }
                } catch (Exception e) {
                    Logger.e(VisibilityTracker.i, "Error calculating visibility: " + e.getMessage());
                }
            }
            return r0;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            VisibilityTracker visibilityTracker = VisibilityTracker.this;
            int i = 0;
            visibilityTracker.f = false;
            synchronized (visibilityTracker.d) {
                arrayList = new ArrayList(VisibilityTracker.this.d);
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                SdkVisibilityTrackerItem sdkVisibilityTrackerItem = (SdkVisibilityTrackerItem) obj;
                if (a(sdkVisibilityTrackerItem)) {
                    this.a.add(sdkVisibilityTrackerItem.mTrackingView);
                } else {
                    this.b.add(sdkVisibilityTrackerItem.mTrackingView);
                }
            }
            WeakReference<Listener> weakReference = VisibilityTracker.this.c;
            if (weakReference != null && weakReference.get() != null) {
                VisibilityTracker.this.c.get().onVisibilityCheck(this.a, this.b);
            }
            this.b.clear();
            this.a.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a() {
        WeakReference<Listener> weakReference = this.c;
        if (weakReference == null || weakReference.get() == null) {
            clear();
            return true;
        }
        b();
        return true;
    }

    public void addView(View view, double d, NextGenConsumer<Double> nextGenConsumer) {
        synchronized (this.d) {
            try {
                if (this.a == null) {
                    this.a = new WeakReference<>(view);
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(this.h);
                    }
                }
                this.b = new WeakReference<>(nextGenConsumer);
                if (a(view)) {
                    return;
                }
                SdkVisibilityTrackerItem sdkVisibilityTrackerItem = new SdkVisibilityTrackerItem();
                sdkVisibilityTrackerItem.mTrackingView = view;
                sdkVisibilityTrackerItem.mMinVisibilityPercent = d;
                this.d.add(sdkVisibilityTrackerItem);
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.e.postDelayed(this.g, 100L);
    }

    public void clear() {
        View view;
        synchronized (this.d) {
            try {
                this.e.removeMessages(0);
                if (this.b != null) {
                    this.b.clear();
                }
                this.d.clear();
                this.f = false;
                WeakReference<View> weakReference = this.a;
                if (weakReference != null && (view = weakReference.get()) != null && this.h != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.h);
                    }
                    this.h = null;
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeView(View view) {
        synchronized (this.d) {
            try {
                if (view == null) {
                    return;
                }
                int b = b(view);
                if (b >= 0) {
                    this.d.remove(b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setListener(Listener listener) {
        this.c = new WeakReference<>(listener);
    }

    protected int b(View view) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (this.d.get(i2).equals(view)) {
                return i2;
            }
        }
        return -1;
    }

    protected boolean a(View view) {
        return b(view) >= 0;
    }
}
