package com.yandex.div.internal.widget.menu;

import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public interface OverflowMenuSubscriber {

    public interface Listener {
        void dismiss();
    }

    void subscribe(@NonNull Listener listener);
}
