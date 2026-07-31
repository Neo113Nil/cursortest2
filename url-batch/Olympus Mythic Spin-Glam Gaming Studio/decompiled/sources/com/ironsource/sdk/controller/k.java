package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC4652g;
import com.ironsource.InterfaceC4670h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface k {

    public static final class a implements InterfaceC4652g {
        @Override // com.ironsource.InterfaceC4652g
        @NotNull
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public static final class b implements InterfaceC4670h {
        @Override // com.ironsource.InterfaceC4670h
        @NotNull
        public Intent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    public static final class c implements InterfaceC4670h {
        @Override // com.ironsource.InterfaceC4670h
        @NotNull
        public Intent a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
