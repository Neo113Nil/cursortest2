package com.smaato.sdk.ng.visibility;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import com.smaato.sdk.ng.visibility.VisibilityTracker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class ImpressionTracker {
    protected WeakReference<Listener> a;
    protected final List<View> b;
    protected final HashMap<View, Long> c;
    protected Handler d;
    protected final Runnable e;
    protected VisibilityTracker f;
    protected double g;
    protected int h;
    protected VisibilityTracker.Listener i;

    protected class ImpressionRunnable implements Runnable {
        private final List<View> a = new ArrayList();

        ImpressionRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry<View, Long> entry : ImpressionTracker.this.c.entrySet()) {
                View key = entry.getKey();
                long uptimeMillis = SystemClock.uptimeMillis() - entry.getValue().longValue();
                ImpressionTracker impressionTracker = ImpressionTracker.this;
                if (uptimeMillis >= impressionTracker.h) {
                    WeakReference<Listener> weakReference = impressionTracker.a;
                    if (weakReference != null && weakReference.get() != null) {
                        ImpressionTracker.this.a.get().onImpression(key);
                    }
                    this.a.add(key);
                }
            }
            Iterator<View> it = this.a.iterator();
            while (it.hasNext()) {
                ImpressionManager.stopTrackingView(it.next());
            }
            this.a.clear();
            if (ImpressionTracker.this.c.isEmpty()) {
                return;
            }
            ImpressionTracker.this.b();
        }
    }

    public interface Listener {
        void onImpression(View view);
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdSize.values().length];
            a = iArr;
            try {
                iArr[AdSize.SIZE_160x600.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdSize.SIZE_300x600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdSize.SIZE_320x480.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AdSize.SIZE_480x320.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AdSize.SIZE_768x1024.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AdSize.SIZE_1024x768.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ImpressionTracker() {
        this.a = null;
        this.b = new ArrayList();
        this.c = new HashMap<>();
        this.d = new Handler(Looper.getMainLooper());
        this.e = new ImpressionRunnable();
        this.f = null;
        this.g = 0.0d;
        this.h = 0;
        this.i = new VisibilityTracker.Listener() { // from class: com.smaato.sdk.ng.visibility.ImpressionTracker$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.visibility.VisibilityTracker.Listener
            public final void onVisibilityCheck(List list, List list2) {
                ImpressionTracker.this.a(list, list2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, List list2) {
        WeakReference<Listener> weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            clear();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (!this.c.containsKey(view)) {
                this.c.put(view, Long.valueOf(SystemClock.uptimeMillis()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.c.remove((View) it2.next());
        }
        if (this.c.isEmpty()) {
            return;
        }
        b();
    }

    public void addView(View view, NextGenConsumer<Double> nextGenConsumer) {
        if (this.b.contains(view)) {
            return;
        }
        this.b.add(view);
        a().addView(view, this.g, nextGenConsumer);
    }

    protected void b() {
        if (this.d.hasMessages(0)) {
            return;
        }
        this.d.postDelayed(this.e, 250L);
    }

    public void clear() {
        Iterator<View> it = this.b.iterator();
        while (it.hasNext()) {
            ImpressionManager.stopTrackingView(it.next());
        }
        this.d.removeMessages(0);
        this.b.clear();
        this.c.clear();
        VisibilityTracker visibilityTracker = this.f;
        if (visibilityTracker != null) {
            visibilityTracker.clear();
            this.f = null;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof View ? this.b.contains(obj) : obj instanceof Listener ? this.a.equals(obj) : super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    public void removeView(View view) {
        this.b.remove(view);
        this.c.remove(view);
        a().removeView(view);
    }

    public void setAdSize(AdSize adSize, Double d) {
        if (d != null) {
            this.g = d.doubleValue();
        }
        if (adSize != null) {
            switch (a.a[adSize.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.g = 0.0d;
                    break;
                default:
                    this.g = 0.0d;
                    break;
            }
        }
    }

    public void setListener(Listener listener) {
        this.a = new WeakReference<>(listener);
    }

    public ImpressionTracker(Integer num, Double d) {
        this.a = null;
        this.b = new ArrayList();
        this.c = new HashMap<>();
        this.d = new Handler(Looper.getMainLooper());
        this.e = new ImpressionRunnable();
        this.f = null;
        this.g = 0.0d;
        this.h = 0;
        this.i = new VisibilityTracker.Listener() { // from class: com.smaato.sdk.ng.visibility.ImpressionTracker$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.visibility.VisibilityTracker.Listener
            public final void onVisibilityCheck(List list, List list2) {
                ImpressionTracker.this.a(list, list2);
            }
        };
        if (num != null) {
            this.h = num.intValue();
        }
        if (d != null) {
            this.g = d.doubleValue();
        }
    }

    protected VisibilityTracker a() {
        if (this.f == null) {
            VisibilityTracker visibilityTracker = new VisibilityTracker();
            this.f = visibilityTracker;
            visibilityTracker.setListener(this.i);
        }
        return this.f;
    }
}
