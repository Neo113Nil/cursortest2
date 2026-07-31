package io.bidmachine.utils.version;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes15.dex */
public class VersionRange {

    @Nullable
    private final Version from;
    private final boolean isInclusiveFrom;
    private final boolean isInclusiveTo;

    @Nullable
    private final Version to;

    public VersionRange(@Nullable Version version, @Nullable Version version2, boolean z, boolean z2) {
        this.from = version;
        this.to = version2;
        this.isInclusiveFrom = z;
        this.isInclusiveTo = z2;
    }

    @VisibleForTesting
    static boolean isAfter(@NonNull Version version, @NonNull Version version2, boolean z) {
        return (z && version2.isAfterOrEquals(version)) || (!z && version2.isAfter(version));
    }

    @VisibleForTesting
    static boolean isBefore(@NonNull Version version, @NonNull Version version2, boolean z) {
        return (z && version2.isBeforeOrEquals(version)) || (!z && version2.isBefore(version));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:6:0x0008, B:11:0x0020, B:16:0x003d, B:18:0x0047, B:20:0x004d, B:23:0x0054, B:25:0x0034, B:26:0x001c), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:6:0x0008, B:11:0x0020, B:16:0x003d, B:18:0x0047, B:20:0x004d, B:23:0x0054, B:25:0x0034, B:26:0x001c), top: B:5:0x0008 }] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VersionRange parseVersionRange(@NonNull String str) {
        boolean endsWith;
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean startsWith = str.startsWith(X3.j.d);
            boolean startsWith2 = str.startsWith("(");
            if (!startsWith && !startsWith2) {
                startsWith = true;
                endsWith = str.endsWith(X3.j.e);
                boolean endsWith2 = str.endsWith(")");
                if (!endsWith && !endsWith2) {
                    endsWith = true;
                    split = str.split("-");
                    if (split.length < 2) {
                        return new VersionRange(Version.parseVersion(split[0]), Version.parseVersion(split[1]), startsWith, endsWith);
                    }
                    Version parseVersion = Version.parseVersion(str);
                    if (parseVersion != null) {
                        return new VersionRange(parseVersion, parseVersion, startsWith, endsWith);
                    }
                    return null;
                }
                str = str.substring(0, str.length() - 1);
                split = str.split("-");
                if (split.length < 2) {
                }
            }
            str = str.substring(1);
            endsWith = str.endsWith(X3.j.e);
            boolean endsWith22 = str.endsWith(")");
            if (!endsWith) {
                endsWith = true;
                split = str.split("-");
                if (split.length < 2) {
                }
            }
            str = str.substring(0, str.length() - 1);
            split = str.split("-");
            if (split.length < 2) {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean contains(@NonNull Version version) {
        Version version2;
        Version version3 = this.from;
        if (version3 != null && this.to != null && isAfter(version3, version, this.isInclusiveFrom) && isBefore(this.to, version, this.isInclusiveTo)) {
            return true;
        }
        Version version4 = this.from;
        if (version4 != null && this.to == null && isAfter(version4, version, this.isInclusiveFrom)) {
            return true;
        }
        if (this.from == null && (version2 = this.to) != null && isBefore(version2, version, this.isInclusiveTo)) {
            return true;
        }
        return this.from == null && this.to == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionRange versionRange = (VersionRange) obj;
        return this.isInclusiveFrom == versionRange.isInclusiveFrom && this.isInclusiveTo == versionRange.isInclusiveTo && Objects.equals(this.from, versionRange.from) && Objects.equals(this.to, versionRange.to);
    }
}
