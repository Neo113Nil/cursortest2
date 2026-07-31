package com.vungle.ads.internal.downloader;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {
    public static boolean a(b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.b() == 1) {
            int c = error.c();
            if (c == -1 || c == 408 || c == 500) {
                return true;
            }
            switch (c) {
            }
            return true;
        }
        return false;
    }
}
