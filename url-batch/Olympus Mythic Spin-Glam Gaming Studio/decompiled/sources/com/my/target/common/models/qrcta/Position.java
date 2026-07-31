package com.my.target.common.models.qrcta;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public class Position {
    public final int horizontalPosition;
    public final int verticalPosition;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizontalPosition {
        public static final int CENTER = 1;
        public static final int LEFT = 0;
        public static final int RIGHT = 2;
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalPosition {
        public static final int BOTTOM = 2;
        public static final int CENTER = 1;
        public static final int TOP = 0;
    }

    private Position(int i, int i2) {
        this.verticalPosition = i2;
        this.horizontalPosition = i;
    }

    @NonNull
    public static Position newPosition(int i, int i2) {
        return new Position(i, i2);
    }
}
