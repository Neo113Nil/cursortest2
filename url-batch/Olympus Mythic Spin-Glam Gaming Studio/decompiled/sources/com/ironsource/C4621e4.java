package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4621e4 {

    @NotNull
    private static final String b = "iads/";

    @NotNull
    private static final String c = "CONTROLLER_FROM_BUNDLE";

    @NotNull
    private static final String d = "controllerVersion";

    @NotNull
    private static final String e = "controller_html_loaded_from_bundle";
    private static volatile boolean g;

    @NotNull
    public static final C4621e4 a = new C4621e4();

    @NotNull
    private static final List<String> f = CollectionsKt.listOf((Object[]) new String[]{X3.f, X3.g, "mobileController.min.css", "index.html", "index.css", "index.js"});

    private C4621e4() {
    }

    @NotNull
    public static final List<String> a() {
        return f;
    }

    public static /* synthetic */ void b() {
    }

    public static final void a(@Nullable Context context, boolean z) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        g = z;
        if (context != null) {
            IronSourceUtils.b(context, e, z);
        }
    }

    public static final boolean b(@Nullable Context context) {
        if (context != null) {
            g = IronSourceUtils.a(context, e, false);
        }
        return g;
    }

    @Nullable
    public static final byte[] a(@Nullable Context context, @NotNull String fileName) {
        byte[] bArr;
        Throwable th;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        byte[] bArr2 = null;
        if (context == null) {
            return null;
        }
        try {
            try {
                InputStream inputStream = context.getAssets().open(b + fileName);
                try {
                    Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                    bArr = ByteStreamsKt.readBytes(inputStream);
                    try {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStream, null);
                        return bArr;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(inputStream, th);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    bArr = null;
                    th = th4;
                }
            } catch (Exception e2) {
                e = e2;
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                e.printStackTrace();
                return bArr2;
            }
        } catch (Exception e3) {
            e = e3;
            bArr2 = bArr;
            IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
            e.printStackTrace();
            return bArr2;
        }
    }

    @Nullable
    public static final String a(@Nullable Context context) {
        if (context != null) {
            try {
                byte[] a2 = a(context, d);
                String obj = a2 != null ? StringsKt.trim(new String(a2, Charsets.UTF_8)).toString() : null;
                if (obj != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: " + obj);
                    return obj;
                }
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (Exception e2) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return null;
    }
}
