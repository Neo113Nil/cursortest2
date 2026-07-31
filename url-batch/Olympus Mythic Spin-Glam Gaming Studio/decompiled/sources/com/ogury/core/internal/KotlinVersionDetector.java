package com.ogury.core.internal;

import android.content.Context;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ogury/core/internal/KotlinVersionDetector;", "", "Landroid/content/Context;", "context", "Lcom/ogury/core/internal/KotlinVersionDetector$VersionInfo;", "getVersionInfo", "(Landroid/content/Context;)Lcom/ogury/core/internal/KotlinVersionDetector$VersionInfo;", "", "getRuntimeVersion", "()Ljava/lang/String;", "getAppCompileVersion", "(Landroid/content/Context;)Ljava/lang/String;", "Lkotlin/KotlinVersion;", "a", "Lkotlin/KotlinVersion;", "getCurrentVersion$sdk_core_prodRelease", "()Lkotlin/KotlinVersion;", "setCurrentVersion$sdk_core_prodRelease", "(Lkotlin/KotlinVersion;)V", "currentVersion", "VersionInfo", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KotlinVersionDetector {

    @NotNull
    public static final KotlinVersionDetector INSTANCE = new KotlinVersionDetector();

    /* renamed from: a, reason: from kotlin metadata */
    public static KotlinVersion currentVersion = KotlinVersion.CURRENT;

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ogury/core/internal/KotlinVersionDetector$VersionInfo;", "", "compileVersion", "", "runtimeVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "getCompileVersion", "()Ljava/lang/String;", "getRuntimeVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VersionInfo {

        @Nullable
        private final String compileVersion;

        @NotNull
        private final String runtimeVersion;

        public VersionInfo(@Nullable String str, @NotNull String runtimeVersion) {
            Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
            this.compileVersion = str;
            this.runtimeVersion = runtimeVersion;
        }

        public static /* synthetic */ VersionInfo copy$default(VersionInfo versionInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = versionInfo.compileVersion;
            }
            if ((i & 2) != 0) {
                str2 = versionInfo.runtimeVersion;
            }
            return versionInfo.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getCompileVersion() {
            return this.compileVersion;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        @NotNull
        public final VersionInfo copy(@Nullable String compileVersion, @NotNull String runtimeVersion) {
            Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
            return new VersionInfo(compileVersion, runtimeVersion);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VersionInfo)) {
                return false;
            }
            VersionInfo versionInfo = (VersionInfo) other;
            return Intrinsics.areEqual(this.compileVersion, versionInfo.compileVersion) && Intrinsics.areEqual(this.runtimeVersion, versionInfo.runtimeVersion);
        }

        @Nullable
        public final String getCompileVersion() {
            return this.compileVersion;
        }

        @NotNull
        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public int hashCode() {
            String str = this.compileVersion;
            return this.runtimeVersion.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "VersionInfo(compileVersion=" + this.compileVersion + ", runtimeVersion=" + this.runtimeVersion + ")";
        }
    }

    public static String a(String str) {
        String a;
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{str + ".MainActivity", str + ".MainApplication", str + ".App", str + ".Application", str + ".ui.MainActivity", str + ".presentation.MainActivity"}).iterator();
        while (it.hasNext()) {
            try {
                Class<?> cls = Class.forName((String) it.next());
                Intrinsics.checkNotNull(cls);
                a = a(cls);
            } catch (Exception unused) {
            }
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Nullable
    public final String getAppCompileVersion(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        try {
            str = a(context.getApplicationContext().getClass());
        } catch (Exception unused) {
            str = null;
        }
        if (str == null && (str = a(packageName)) == null) {
            return null;
        }
        return str;
    }

    @NotNull
    public final KotlinVersion getCurrentVersion$sdk_core_prodRelease() {
        return currentVersion;
    }

    @NotNull
    public final String getRuntimeVersion() {
        return currentVersion.toString();
    }

    @NotNull
    public final VersionInfo getVersionInfo(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNull(packageName);
        try {
            str = a(context.getApplicationContext().getClass());
        } catch (Exception unused) {
            str = null;
        }
        return new VersionInfo((str == null && (str = a(packageName)) == null) ? null : str, getRuntimeVersion());
    }

    public final void setCurrentVersion$sdk_core_prodRelease(@NotNull KotlinVersion kotlinVersion) {
        Intrinsics.checkNotNullParameter(kotlinVersion, "<set-?>");
        currentVersion = kotlinVersion;
    }

    public static String a(Class cls) {
        Annotation annotation;
        try {
            Annotation[] annotations = cls.getAnnotations();
            Intrinsics.checkNotNull(annotations);
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (Intrinsics.areEqual(JvmClassMappingKt.getAnnotationClass(annotation).getQualifiedName(), "kotlin.Metadata")) {
                    break;
                }
                i++;
            }
        } catch (Exception unused) {
        }
        if (annotation == null) {
            return null;
        }
        Object invoke = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation)).getMethod("mv", null).invoke(annotation, null);
        int[] iArr = invoke instanceof int[] ? (int[]) invoke : null;
        if (iArr != null && iArr.length >= 3) {
            return iArr[0] + "." + iArr[1] + "." + iArr[2];
        }
        return null;
    }
}
