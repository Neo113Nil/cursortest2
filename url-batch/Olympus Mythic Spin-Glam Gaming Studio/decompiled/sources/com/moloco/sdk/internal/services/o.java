package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class o implements n {
    public static final int b = 8;

    @Nullable
    public final AudioManager a;

    public o(@NotNull Context context) {
        AudioManager audioManager;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            audioManager = (AudioManager) ContextCompat.getSystemService(context.getApplicationContext(), AudioManager.class);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, p.a, "couldn't get android.media.AudioManager service", e, false, 8, null);
            audioManager = null;
        }
        this.a = audioManager;
    }

    @Override // com.moloco.sdk.internal.services.n
    @NotNull
    public z a() {
        AudioManager audioManager = this.a;
        Integer valueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        return (valueOf != null && valueOf.intValue() == 0) ? z.a : (valueOf != null && valueOf.intValue() == 1) ? z.b : (valueOf != null && valueOf.intValue() == 2) ? z.c : z.c;
    }

    @Override // com.moloco.sdk.internal.services.n
    public int b() {
        AudioManager audioManager = this.a;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }

    @Override // com.moloco.sdk.internal.services.n
    public boolean c() {
        AudioManager audioManager = this.a;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isStreamMute(3);
    }
}
