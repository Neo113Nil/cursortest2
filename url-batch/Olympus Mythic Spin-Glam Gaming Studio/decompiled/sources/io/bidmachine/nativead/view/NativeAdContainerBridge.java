package io.bidmachine.nativead.view;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class NativeAdContainerBridge {
    public static void configureContainer(@NonNull a aVar, @NonNull ViewGroup viewGroup) {
        aVar.configureContainer(viewGroup);
    }

    public static void deConfigureContainer(@NonNull a aVar) {
        aVar.deConfigureContainer();
    }
}
