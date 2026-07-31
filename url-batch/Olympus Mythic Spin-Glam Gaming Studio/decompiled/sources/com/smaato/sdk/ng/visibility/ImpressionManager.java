package com.smaato.sdk.ng.visibility;

import android.util.Log;
import android.view.View;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import com.smaato.sdk.ng.visibility.ImpressionTracker;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class ImpressionManager {
    private static final String b = "ImpressionManager";
    private static ImpressionManager c;
    protected List<ImpressionTracker> a;

    private ImpressionManager() {
    }

    public static ImpressionManager getInstance() {
        if (c == null) {
            ImpressionManager impressionManager = new ImpressionManager();
            c = impressionManager;
            impressionManager.a = new ArrayList();
        }
        return c;
    }

    public static void startTrackingView(View view, Integer num, Double d, ImpressionTracker.Listener listener) {
        startTrackingView(view, null, num, d, listener, null);
    }

    public static void stopTrackingAll(ImpressionTracker.Listener listener) {
        getInstance().c(listener);
    }

    public static void stopTrackingView(View view) {
        getInstance().c(view);
    }

    protected void a(View view, AdSize adSize, Integer num, Double d, ImpressionTracker.Listener listener, NextGenConsumer<Double> nextGenConsumer) {
        ImpressionTracker impressionTracker;
        if (view == null) {
            Log.w(b, "trying to start tracking null view, dropping this calll");
            return;
        }
        if (listener == null) {
            Log.w(b, "trying to start tracking with null listener");
            return;
        }
        if (a(view)) {
            if (!this.a.get(b(view)).equals(listener)) {
                c(view);
            }
        }
        if (a(listener)) {
            impressionTracker = this.a.get(b(view));
        } else {
            ImpressionTracker impressionTracker2 = new ImpressionTracker(num, d);
            if (adSize != null) {
                impressionTracker2.setAdSize(adSize, d);
            }
            impressionTracker2.setListener(listener);
            this.a.add(impressionTracker2);
            impressionTracker = impressionTracker2;
        }
        impressionTracker.addView(view, nextGenConsumer);
    }

    protected int b(View view) {
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).equals(view)) {
                return i;
            }
        }
        return -1;
    }

    protected void c(ImpressionTracker.Listener listener) {
        if (listener == null) {
            Log.w(b, "trying to remove all views from null listener, dropping this call");
        } else if (a(listener)) {
            this.a.get(b(listener)).clear();
            this.a.remove(listener);
        }
    }

    public static void startTrackingView(View view, AdSize adSize, Integer num, Double d, ImpressionTracker.Listener listener, NextGenConsumer<Double> nextGenConsumer) {
        getInstance().a(view, adSize, num, d, listener, nextGenConsumer);
    }

    protected int b(ImpressionTracker.Listener listener) {
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).equals(listener)) {
                return i;
            }
        }
        return -1;
    }

    protected void c(View view) {
        if (view == null) {
            Log.w(b, "trying to remove null view, dropping this call");
            return;
        }
        if (a(view)) {
            ImpressionTracker impressionTracker = this.a.get(b(view));
            impressionTracker.removeView(view);
            if (impressionTracker.isEmpty()) {
                impressionTracker.clear();
                this.a.remove(impressionTracker);
            }
        }
    }

    protected boolean a(View view) {
        return b(view) >= 0;
    }

    protected boolean a(ImpressionTracker.Listener listener) {
        return b(listener) >= 0;
    }
}
