package com.smaato.sdk.ng.viewability;

import android.view.View;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;

/* loaded from: classes15.dex */
public class NextGenViewabilityFriendlyObstruction {
    private final View a;
    private final BaseFriendlyObstructionPurpose b;
    private final String c;

    public NextGenViewabilityFriendlyObstruction(View view, BaseFriendlyObstructionPurpose baseFriendlyObstructionPurpose, String str) {
        this.a = view;
        this.b = baseFriendlyObstructionPurpose;
        this.c = str;
    }

    public BaseFriendlyObstructionPurpose getPurpose() {
        return this.b;
    }

    public String getReason() {
        return this.c;
    }

    public View getView() {
        return this.a;
    }
}
