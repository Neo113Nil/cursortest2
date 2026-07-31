package io.bidmachine.util.viewabilitytracker.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActionEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\f"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "", "actionCode", "", "isBillable", "", "(IZ)V", "getActionCode", "()I", "()Z", "toString", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionEvent {
    private final int actionCode;
    private final boolean isBillable;

    public ActionEvent(int i, boolean z) {
        this.actionCode = i;
        this.isBillable = z;
    }

    public final int getActionCode() {
        return this.actionCode;
    }

    /* renamed from: isBillable, reason: from getter */
    public final boolean getIsBillable() {
        return this.isBillable;
    }

    @NotNull
    public String toString() {
        return "action code - " + this.actionCode + ", is billable - " + this.isBillable;
    }
}
