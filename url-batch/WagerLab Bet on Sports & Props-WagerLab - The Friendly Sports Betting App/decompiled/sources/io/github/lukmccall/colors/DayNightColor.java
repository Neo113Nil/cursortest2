package io.github.lukmccall.colors;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.devlauncher.launcher.manifest.DevLauncherUserInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayNightColor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lio/github/lukmccall/colors/DayNightColor;", "", DevLauncherUserInterface.LIGHT, "", "Lio/github/lukmccall/colors/RawColor;", DevLauncherUserInterface.DARK, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLight", "()Ljava/util/List;", "getDark", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DayNightColor {
    private final List<RawColor> dark;
    private final List<RawColor> light;

    /* JADX WARN: Multi-variable type inference failed */
    public DayNightColor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DayNightColor copy$default(DayNightColor dayNightColor, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dayNightColor.light;
        }
        if ((i & 2) != 0) {
            list2 = dayNightColor.dark;
        }
        return dayNightColor.copy(list, list2);
    }

    public final List<RawColor> component1() {
        return this.light;
    }

    public final List<RawColor> component2() {
        return this.dark;
    }

    public final DayNightColor copy(List<? extends RawColor> light, List<? extends RawColor> dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        return new DayNightColor(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayNightColor)) {
            return false;
        }
        DayNightColor dayNightColor = (DayNightColor) other;
        return Intrinsics.areEqual(this.light, dayNightColor.light) && Intrinsics.areEqual(this.dark, dayNightColor.dark);
    }

    public int hashCode() {
        return (this.light.hashCode() * 31) + this.dark.hashCode();
    }

    public String toString() {
        return "DayNightColor(light=" + this.light + ", dark=" + this.dark + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DayNightColor(List<? extends RawColor> light, List<? extends RawColor> dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        this.light = light;
        this.dark = dark;
    }

    public /* synthetic */ DayNightColor(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<RawColor> getLight() {
        return this.light;
    }

    public final List<RawColor> getDark() {
        return this.dark;
    }
}
