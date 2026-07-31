package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5864a extends Lambda implements Function0 {
    public final /* synthetic */ C5867d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5864a(C5867d c5867d) {
        super(0);
        this.a = c5867d;
    }

    public static final void a(C5867d c5867d) {
        ((C5886x) c5867d.b).a("AndroidApiScreenshotCaptor");
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback mo4828invoke() {
        final C5867d c5867d = this.a;
        return new Activity.ScreenCaptureCallback() { // from class: io.appmetrica.analytics.screenshot.impl.a$$ExternalSyntheticLambda0
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C5864a.a(C5867d.this);
            }
        };
    }
}
