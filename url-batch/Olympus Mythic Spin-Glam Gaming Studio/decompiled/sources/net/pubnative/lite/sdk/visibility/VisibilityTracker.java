package net.pubnative.lite.sdk.visibility;

import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.utils.HybidConsumer;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class VisibilityTracker {
    private static final String TAG = "VisibilityTracker";
    private static final int VISIBILITY_CHECK_DELAY = 100;
    private volatile WeakReference<HybidConsumer<Double>> mPercentageConsumer;
    protected WeakReference<View> mDeviceView = null;
    protected WeakReference<Listener> mListener = null;
    protected final List<SdkVisibilityTrackerItem> mTrackedViews = new ArrayList();
    protected Handler mHandler = new Handler();
    protected boolean mIsVisibilityCheckScheduled = false;
    protected final VisibilityRunnable mVisibilityRunnable = new VisibilityRunnable();
    protected ViewTreeObserver.OnPreDrawListener mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: net.pubnative.lite.sdk.visibility.VisibilityTracker$$ExternalSyntheticLambda0
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            boolean lambda$new$0;
            lambda$new$0 = VisibilityTracker.this.lambda$new$0();
            return lambda$new$0;
        }
    };

    public interface Listener {
        void onVisibilityCheck(List<View> list, List<View> list2);
    }

    protected static class SdkVisibilityTrackerItem {
        private final String TAG = SdkVisibilityTrackerItem.class.getSimpleName();
        public double mMinVisibilityPercent;
        public View mTrackingView;

        protected SdkVisibilityTrackerItem() {
        }

        public boolean equals(Object obj) {
            return obj instanceof View ? obj.equals(this.mTrackingView) : super.equals(obj);
        }
    }

    protected class VisibilityRunnable implements Runnable {
        private volatile boolean mHasReportedVisibility = false;
        private final Rect mVisibleRect = new Rect();
        private final ArrayList<View> mInvisibleViews = new ArrayList<>();
        private final ArrayList<View> mVisibleViews = new ArrayList<>();

        VisibilityRunnable() {
        }

        protected boolean isVisible(SdkVisibilityTrackerItem sdkVisibilityTrackerItem) {
            View view;
            HybidConsumer hybidConsumer;
            if (sdkVisibilityTrackerItem != null && (view = sdkVisibilityTrackerItem.mTrackingView) != null) {
                try {
                    if (view.isShown() && view.getParent() != null && view.getLocalVisibleRect(this.mVisibleRect)) {
                        float height = this.mVisibleRect.height() * this.mVisibleRect.width();
                        float height2 = view.getHeight() * view.getWidth();
                        if (height2 <= 0.0f) {
                            return false;
                        }
                        double d = height / height2;
                        r0 = d >= sdkVisibilityTrackerItem.mMinVisibilityPercent;
                        if (!r0 || this.mHasReportedVisibility || VisibilityTracker.this.mPercentageConsumer == null || (hybidConsumer = (HybidConsumer) VisibilityTracker.this.mPercentageConsumer.get()) == null) {
                            return r0;
                        }
                        hybidConsumer.accept(Double.valueOf(d));
                        this.mHasReportedVisibility = true;
                        return r0;
                    }
                } catch (Exception e) {
                    Logger.e(VisibilityTracker.TAG, "Error calculating visibility: " + e.getMessage());
                }
            }
            return r0;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            VisibilityTracker visibilityTracker = VisibilityTracker.this;
            int i = 0;
            visibilityTracker.mIsVisibilityCheckScheduled = false;
            synchronized (visibilityTracker.mTrackedViews) {
                arrayList = new ArrayList(VisibilityTracker.this.mTrackedViews);
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                SdkVisibilityTrackerItem sdkVisibilityTrackerItem = (SdkVisibilityTrackerItem) obj;
                if (isVisible(sdkVisibilityTrackerItem)) {
                    this.mVisibleViews.add(sdkVisibilityTrackerItem.mTrackingView);
                } else {
                    this.mInvisibleViews.add(sdkVisibilityTrackerItem.mTrackingView);
                }
            }
            WeakReference<Listener> weakReference = VisibilityTracker.this.mListener;
            if (weakReference != null && weakReference.get() != null) {
                VisibilityTracker.this.mListener.get().onVisibilityCheck(this.mVisibleViews, this.mInvisibleViews);
            }
            this.mInvisibleViews.clear();
            this.mVisibleViews.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0() {
        WeakReference<Listener> weakReference = this.mListener;
        if (weakReference == null || weakReference.get() == null) {
            clear();
            return true;
        }
        scheduleVisibilityCheck();
        return true;
    }

    public void addView(View view, double d, HybidConsumer<Double> hybidConsumer) {
        synchronized (this.mTrackedViews) {
            try {
                if (this.mDeviceView == null) {
                    this.mDeviceView = new WeakReference<>(view);
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(this.mOnPreDrawListener);
                    } else {
                        Log.d(TAG, "Unable to start tracking, Window ViewTreeObserver is not alive");
                    }
                }
                this.mPercentageConsumer = new WeakReference<>(hybidConsumer);
                if (containsTrackedView(view)) {
                    return;
                }
                SdkVisibilityTrackerItem sdkVisibilityTrackerItem = new SdkVisibilityTrackerItem();
                sdkVisibilityTrackerItem.mTrackingView = view;
                sdkVisibilityTrackerItem.mMinVisibilityPercent = d;
                this.mTrackedViews.add(sdkVisibilityTrackerItem);
                scheduleVisibilityCheck();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clear() {
        View view;
        synchronized (this.mTrackedViews) {
            try {
                this.mHandler.removeMessages(0);
                if (this.mPercentageConsumer != null) {
                    this.mPercentageConsumer.clear();
                }
                this.mTrackedViews.clear();
                this.mIsVisibilityCheckScheduled = false;
                WeakReference<View> weakReference = this.mDeviceView;
                if (weakReference != null && (view = weakReference.get()) != null && this.mOnPreDrawListener != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.mOnPreDrawListener);
                    }
                    this.mOnPreDrawListener = null;
                }
                this.mListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected boolean containsTrackedView(View view) {
        return indexOfTrackedView(view) >= 0;
    }

    protected int indexOfTrackedView(View view) {
        for (int i = 0; i < this.mTrackedViews.size(); i++) {
            if (this.mTrackedViews.get(i).equals(view)) {
                return i;
            }
        }
        return -1;
    }

    public void removeView(View view) {
        synchronized (this.mTrackedViews) {
            try {
                if (view == null) {
                    return;
                }
                int indexOfTrackedView = indexOfTrackedView(view);
                if (indexOfTrackedView >= 0) {
                    this.mTrackedViews.remove(indexOfTrackedView);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void scheduleVisibilityCheck() {
        if (this.mIsVisibilityCheckScheduled) {
            return;
        }
        this.mIsVisibilityCheckScheduled = true;
        this.mHandler.postDelayed(this.mVisibilityRunnable, 100L);
    }

    public void setListener(Listener listener) {
        this.mListener = new WeakReference<>(listener);
    }
}
