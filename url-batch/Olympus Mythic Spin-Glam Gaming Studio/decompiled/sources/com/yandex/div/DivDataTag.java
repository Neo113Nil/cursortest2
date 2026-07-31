package com.yandex.div;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class DivDataTag {
    public static final DivDataTag INVALID = new DivDataTag("");

    @NonNull
    private final String mId;

    public DivDataTag(@NonNull String str) {
        this.mId = str;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mId.equals(((DivDataTag) obj).mId);
    }

    public int hashCode() {
        return this.mId.hashCode();
    }
}
