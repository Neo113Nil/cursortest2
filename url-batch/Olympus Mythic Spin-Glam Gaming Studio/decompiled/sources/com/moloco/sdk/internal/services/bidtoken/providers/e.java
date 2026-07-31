package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class e implements j<d> {

    @NotNull
    public static final a d = new a(null);
    public static final int e = 8;

    @NotNull
    public static final String f = "ADISignalProvider";

    @NotNull
    public final Context b;

    @NotNull
    public d c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = context;
        this.c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        d dVar = new d(e());
        boolean z = !Intrinsics.areEqual(dVar, this.c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT] ADI needsRefresh: " + z + ", with adi: " + dVar.b(), false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return f;
    }

    public final Long e() {
        try {
            return Long.valueOf(this.b.getFilesDir().getTotalSpace());
        } catch (Exception e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f, "ADI Error", e2, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d d() {
        d dVar = this.c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT] ADI providing " + dVar.b(), false, 4, null);
        return dVar;
    }
}
