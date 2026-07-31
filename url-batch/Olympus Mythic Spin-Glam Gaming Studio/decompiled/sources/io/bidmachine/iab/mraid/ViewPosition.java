package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"RtlHardcoded"})
/* loaded from: classes5.dex */
public enum ViewPosition {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);

    private final int a;

    ViewPosition(int i) {
        this.a = i;
    }

    @NonNull
    public static ViewPosition fromJsString(@Nullable String str) {
        return fromJsString(str, TopRight);
    }

    public int getGravity() {
        return this.a;
    }

    @NonNull
    public static ViewPosition fromJsString(@Nullable String str, @NonNull ViewPosition viewPosition) {
        if (TextUtils.isEmpty(str)) {
            return viewPosition;
        }
        str.hashCode();
        switch (str) {
        }
        return viewPosition;
    }
}
