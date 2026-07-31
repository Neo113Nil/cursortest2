package io.intercom.android.sdk.ui.extension;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavBackStackEntryExtension.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\u0006\u0010\b\u001a\u0002H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"getParcelableObject", "T", "Landroid/os/Parcelable;", "Landroidx/navigation/NavBackStackEntry;", "key", "", "clazz", "Ljava/lang/Class;", "defaultValue", "(Landroidx/navigation/NavBackStackEntry;Ljava/lang/String;Ljava/lang/Class;Landroid/os/Parcelable;)Landroid/os/Parcelable;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavBackStackEntryExtensionKt {
    public static final <T extends Parcelable> T getParcelableObject(NavBackStackEntry navBackStackEntry, String key, Class<T> clazz, T defaultValue) {
        T t;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Bundle arguments = navBackStackEntry.getArguments();
        return (arguments == null || (t = (T) BundleCompat.getParcelable(arguments, key, clazz)) == null) ? defaultValue : t;
    }
}
