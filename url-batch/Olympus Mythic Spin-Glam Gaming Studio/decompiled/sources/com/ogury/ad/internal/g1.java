package com.ogury.ad.internal;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class g1 extends Lambda implements Function0 {
    public static final g1 a = new g1();

    public g1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        try {
            AndroidComposeView.Companion companion = AndroidComposeView.INSTANCE;
            return AndroidComposeView.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
