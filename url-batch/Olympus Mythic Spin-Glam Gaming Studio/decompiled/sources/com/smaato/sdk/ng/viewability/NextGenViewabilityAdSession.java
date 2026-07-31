package com.smaato.sdk.ng.viewability;

import android.view.View;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;
import com.smaato.sdk.ng.viewability.baseom.BaseVerificationScriptResource;
import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class NextGenViewabilityAdSession {
    private static final String e = "NextGenViewabilityAdSession";
    protected Object a;
    protected Object b;
    protected final List<BaseVerificationScriptResource> c = new ArrayList();
    final BaseViewabilityManager d;

    public NextGenViewabilityAdSession(BaseViewabilityManager baseViewabilityManager) {
        this.d = baseViewabilityManager;
    }

    private boolean a() {
        BaseViewabilityManager baseViewabilityManager = this.d;
        return baseViewabilityManager == null || !baseViewabilityManager.isViewabilityMeasurementEnabled();
    }

    public void addFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str) {
        Object obj;
        if (a() || view == null || (obj = this.a) == null) {
            return;
        }
        this.d.addFriendlyObstruction(obj, view, baseFriendlyObstructionPurpose, str);
    }

    public void fireImpression() {
        Object obj;
        if (a() || (obj = this.b) == null) {
            return;
        }
        try {
            this.d.fireImpression(obj);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            Logger.e(e, e2.getMessage());
        }
    }

    public void fireLoaded() {
        Object obj;
        if (a() || (obj = this.b) == null) {
            return;
        }
        try {
            this.d.fireLoaded(obj);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            Logger.e(e, e2.getMessage());
        }
    }

    public void stopAdSession() {
        Object obj;
        if (a() || (obj = this.a) == null) {
            return;
        }
        try {
            this.d.stopAdSession(obj);
        } catch (RuntimeException e2) {
            Logger.e(e, e2.getMessage());
        }
        this.a = null;
    }
}
