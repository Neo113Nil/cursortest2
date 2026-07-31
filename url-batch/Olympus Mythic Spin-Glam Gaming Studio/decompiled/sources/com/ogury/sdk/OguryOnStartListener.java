package com.ogury.sdk;

import com.ogury.core.OguryError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-d03ac3f9e324b82242ed8abc94e35cfcf54ca1b7c6df624f1ee1a6ff838e9b84 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ogury/sdk/OguryOnStartListener;", "", "onFailed", "", "error", "Lcom/ogury/core/OguryError;", "onStarted", "sdk-wrapper_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OguryOnStartListener {
    void onFailed(@NotNull OguryError error);

    void onStarted();
}
