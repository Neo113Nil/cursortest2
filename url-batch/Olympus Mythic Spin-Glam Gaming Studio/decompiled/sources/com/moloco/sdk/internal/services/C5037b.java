package com.moloco.sdk.internal.services;

import android.content.Context;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.services.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5037b implements InterfaceC5036a {

    @NotNull
    public static final a b = new a(null);
    public static final int c = 8;

    @NotNull
    public static final String d = "AccessibilityInfoService";

    @NotNull
    public final Context a;

    /* renamed from: com.moloco.sdk.internal.services.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C5037b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC5036a
    public boolean a() {
        return Settings.Secure.getInt(this.a.getContentResolver(), "reduce_bright_colors_activated") == 1;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC5036a
    public boolean b() {
        Object systemService = this.a.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled() && Settings.Secure.getInt(this.a.getContentResolver(), "accessibility_large_pointer_icon", 0) == 1;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC5036a
    public boolean c() {
        try {
            Object systemService = this.a.getSystemService("captioning");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
            return ((CaptioningManager) systemService).isEnabled();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC5036a
    public float getFontScale() {
        Object systemService = this.a.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if (((AccessibilityManager) systemService).isEnabled()) {
            return this.a.getResources().getConfiguration().fontScale;
        }
        return 1.0f;
    }
}
