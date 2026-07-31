package io.bidmachine.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class MraidOrientationProperties {
    public static final int FORCE_ORIENTATION_LANDSCAPE = 1;
    public static final int FORCE_ORIENTATION_NONE = 2;
    public static final int FORCE_ORIENTATION_PORTRAIT = 0;
    public boolean allowOrientationChange;
    public int forceOrientation;

    public MraidOrientationProperties(boolean z, int i) {
        this.allowOrientationChange = z;
        this.forceOrientation = i;
    }

    public static int forceOrientationFromString(String str) {
        int indexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public String forceOrientationString() {
        int i = this.forceOrientation;
        return i != 0 ? i != 1 ? i != 2 ? "error" : "none" : "landscape" : "portrait";
    }

    public int obtainTargetActivityOrientation(@NonNull Context context) {
        int i = context.getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i2 = this.forceOrientation;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        if (this.allowOrientationChange) {
            return -1;
        }
        return i;
    }

    @NonNull
    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.allowOrientationChange + ", forceOrientation=" + forceOrientationString() + '}';
    }
}
