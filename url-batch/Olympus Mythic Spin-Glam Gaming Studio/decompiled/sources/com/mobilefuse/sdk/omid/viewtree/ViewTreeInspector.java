package com.mobilefuse.sdk.omid.viewtree;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.mobilefuse.sdk.StabilityHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class ViewTreeInspector {
    private static final String LOG_TAG = "mfsdk.ViewTreeInspector";
    private static final int MAX_DETECTION_LEVELS = 100;
    private static int NEXT_INSTANCE_ID = 1;
    private static final long OBSTRUCTIONS_CHECKING_DELAY = 200;

    @NonNull
    private final View adView;

    @NonNull
    private final Rect adViewVisibleRect;

    @NonNull
    private final ObstructionsChangeListener changeListener;
    private boolean checkingEnabled;
    private final int instanceId;

    @NonNull
    private final List<View> lastFriendlyObstructions;
    private final boolean logsEnabled;

    @NonNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NonNull
    private final Runnable checkObstructionsRunnable = new Runnable() { // from class: com.mobilefuse.sdk.omid.viewtree.ViewTreeInspector$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            ViewTreeInspector.this.lambda$new$0();
        }
    };
    private int currentDetectionLevel = 0;

    public interface ObstructionsChangeListener {
        void onChanged(List<View> list) throws Throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        try {
            revealObstructions();
            scheduleNextObstructionChecking();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public ViewTreeInspector(@NonNull View view, @NonNull ObstructionsChangeListener obstructionsChangeListener) throws Throwable {
        this.adView = view;
        this.changeListener = obstructionsChangeListener;
        int i = NEXT_INSTANCE_ID;
        NEXT_INSTANCE_ID = i + 1;
        this.instanceId = i;
        this.adViewVisibleRect = new Rect();
        this.lastFriendlyObstructions = new ArrayList();
        this.logsEnabled = Log.isLoggable(LOG_TAG, 2);
    }

    public void startObstructionsChecking() throws Throwable {
        if (this.checkingEnabled) {
            return;
        }
        logDebug("Start friendly obstructions checking");
        this.handler.removeCallbacks(this.checkObstructionsRunnable);
        this.checkingEnabled = true;
        this.checkObstructionsRunnable.run();
    }

    private void scheduleNextObstructionChecking() throws Throwable {
        if (this.checkingEnabled) {
            this.handler.postDelayed(this.checkObstructionsRunnable, 200L);
        }
    }

    public void stopObstructionsChecking() throws Throwable {
        if (this.checkingEnabled) {
            logDebug("Stop friendly obstructions checking");
            this.checkingEnabled = false;
            this.handler.removeCallbacks(this.checkObstructionsRunnable);
        }
    }

    private void revealObstructions() throws Throwable {
        logDebug("Check friendly obstructions");
        long currentTimeMillis = System.currentTimeMillis();
        List<View> detectAdViewTree = detectAdViewTree();
        boolean obstructionsChanged = obstructionsChanged(detectAdViewTree);
        if (obstructionsChanged) {
            this.lastFriendlyObstructions.clear();
            this.lastFriendlyObstructions.addAll(detectAdViewTree);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        logDebug("Completed friendly obstruction detection:");
        logDebug("    * processing time: " + (currentTimeMillis2 - currentTimeMillis) + " ms");
        StringBuilder sb = new StringBuilder();
        sb.append("    * found friendly obstructions count: ");
        sb.append(detectAdViewTree.size());
        logDebug(sb.toString());
        logDebug("    * found friendly obstructions:");
        Iterator<View> it = detectAdViewTree.iterator();
        int i = 1;
        while (it.hasNext()) {
            logDebug("        #" + i + " - " + it.next().toString());
            i++;
        }
        if (obstructionsChanged) {
            this.changeListener.onChanged(detectAdViewTree);
        } else {
            logDebug("    *** Friendly obstructions are the same as last time. Don't dispatch change event.");
        }
    }

    private boolean obstructionsChanged(List<View> list) throws Throwable {
        if (list.size() != this.lastFriendlyObstructions.size()) {
            return true;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            if (!this.lastFriendlyObstructions.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    private List<View> detectAdViewTree() throws Throwable {
        this.currentDetectionLevel = 0;
        ArrayList arrayList = new ArrayList();
        this.adView.getGlobalVisibleRect(this.adViewVisibleRect);
        ViewParent parent = this.adView.getParent();
        if (parent instanceof ViewGroup) {
            detectViewGroup(arrayList, this.adView, (ViewGroup) parent);
        }
        return arrayList;
    }

    private void detectViewGroup(List<View> list, View view, ViewGroup viewGroup) throws Throwable {
        int i = this.currentDetectionLevel;
        if (i > 100) {
            return;
        }
        this.currentDetectionLevel = i + 1;
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(view);
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != view) {
                Rect rect = new Rect();
                childAt.getGlobalVisibleRect(rect);
                if (new Rect(this.adViewVisibleRect).intersect(rect) && viewIsOver(childAt, i2, view, indexOfChild) && verifyView(childAt)) {
                    list.add(childAt);
                }
            }
        }
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            detectViewGroup(list, viewGroup, (ViewGroup) parent);
        }
    }

    private boolean verifyView(View view) throws Throwable {
        boolean hasOnLongClickListeners;
        if (!view.isShown() || view.getAlpha() == 0.0f || !viewHasTransparentBackground(view)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (!view.isAttachedToWindow() || view.hasOnClickListeners()) {
            return false;
        }
        if (i >= 30) {
            hasOnLongClickListeners = view.hasOnLongClickListeners();
            if (hasOnLongClickListeners) {
                return false;
            }
        }
        return ((view instanceof ViewGroup) && viewGroupObstructionOverlapping((ViewGroup) view)) ? false : true;
    }

    private boolean viewGroupObstructionOverlapping(ViewGroup viewGroup) throws Throwable {
        boolean hasOnLongClickListeners;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Rect rect = new Rect();
            childAt.getGlobalVisibleRect(rect);
            if (new Rect(this.adViewVisibleRect).intersect(rect)) {
                if (childAt.hasOnClickListeners()) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    hasOnLongClickListeners = childAt.hasOnLongClickListeners();
                    if (hasOnLongClickListeners) {
                        return true;
                    }
                }
                if (!viewHasTransparentBackground(childAt)) {
                    return true;
                }
                if ((childAt instanceof ViewGroup) && viewGroupObstructionOverlapping((ViewGroup) childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean viewIsOver(View view, int i, View view2, int i2) throws Throwable {
        return view.getZ() > view2.getZ() || i > i2;
    }

    private boolean viewHasTransparentBackground(View view) throws Throwable {
        Drawable background = view.getBackground();
        if (background == null || background.getAlpha() == 0 || background.getOpacity() == -2) {
            return true;
        }
        return (background instanceof ColorDrawable) && ((ColorDrawable) background).getAlpha() == 0;
    }

    public void logDebug(String str) {
        if (this.logsEnabled) {
            Log.d("ViewTreeInspector", X3.j.d + this.instanceId + "]: " + str);
        }
    }
}
