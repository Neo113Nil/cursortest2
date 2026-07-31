package io.bidmachine.utils.version;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes15.dex */
public class Version implements Comparable<Version> {
    private final int major;
    private final int minor;
    private final int patch;

    public Version(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    @Nullable
    public static Version parseVersion(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i < split.length) {
                if (i == 0) {
                    i2 = Integer.parseInt(split[0]);
                } else if (i != 1) {
                    i4 = i != 2 ? (i4 * 100) + Integer.parseInt(split[i]) : Integer.parseInt(split[2]);
                } else {
                    i3 = Integer.parseInt(split[1]);
                }
                i++;
            }
            return new Version(i2, i3, i4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.major), Integer.valueOf(this.minor), Integer.valueOf(this.patch));
    }

    public boolean isAfter(@NonNull Version version) {
        return compareTo(version) > 0;
    }

    public boolean isAfterOrEquals(@NonNull Version version) {
        return compareTo(version) >= 0;
    }

    public boolean isBefore(@NonNull Version version) {
        return compareTo(version) < 0;
    }

    public boolean isBeforeOrEquals(@NonNull Version version) {
        return compareTo(version) <= 0;
    }

    @NonNull
    public String toString() {
        return this.major + "." + this.minor + "." + this.patch;
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        int compare = Integer.compare(this.major, version.major);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.minor, version.minor);
        return compare2 != 0 ? compare2 : Integer.compare(this.patch, version.patch);
    }
}
