package com.vectorharbor.planetvectorsurvey.model;

import defpackage.nz;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class TargetProfile {
    public static final int $stable = 8;
    private final int artRes;
    private final List<Float> centers;
    private final int id;
    private final String subtitle;
    private final String title;
    private final float windowRadius;

    public TargetProfile(int i, String str, String str2, int i2, List<Float> list, float f) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.id = i;
        this.title = str;
        this.subtitle = str2;
        this.artRes = i2;
        this.centers = list;
        this.windowRadius = f;
    }

    public static /* synthetic */ TargetProfile copy$default(TargetProfile targetProfile, int i, String str, String str2, int i2, List list, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = targetProfile.id;
        }
        if ((i3 & 2) != 0) {
            str = targetProfile.title;
        }
        if ((i3 & 4) != 0) {
            str2 = targetProfile.subtitle;
        }
        if ((i3 & 8) != 0) {
            i2 = targetProfile.artRes;
        }
        if ((i3 & 16) != 0) {
            list = targetProfile.centers;
        }
        if ((i3 & 32) != 0) {
            f = targetProfile.windowRadius;
        }
        List list2 = list;
        float f2 = f;
        return targetProfile.copy(i, str, str2, i2, list2, f2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final int component4() {
        return this.artRes;
    }

    public final List<Float> component5() {
        return this.centers;
    }

    public final float component6() {
        return this.windowRadius;
    }

    public final TargetProfile copy(int i, String str, String str2, int i2, List<Float> list, float f) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new TargetProfile(i, str, str2, i2, list, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TargetProfile)) {
            return false;
        }
        TargetProfile targetProfile = (TargetProfile) obj;
        return this.id == targetProfile.id && nz.l(this.title, targetProfile.title) && nz.l(this.subtitle, targetProfile.subtitle) && this.artRes == targetProfile.artRes && nz.l(this.centers, targetProfile.centers) && Float.compare(this.windowRadius, targetProfile.windowRadius) == 0;
    }

    public final int getArtRes() {
        return this.artRes;
    }

    public final List<Float> getCenters() {
        return this.centers;
    }

    public final int getId() {
        return this.id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final float getWindowRadius() {
        return this.windowRadius;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.windowRadius) + ((this.centers.hashCode() + ((((this.subtitle.hashCode() + ((this.title.hashCode() + (this.id * 31)) * 31)) * 31) + this.artRes) * 31)) * 31);
    }

    public String toString() {
        return "TargetProfile(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", artRes=" + this.artRes + ", centers=" + this.centers + ", windowRadius=" + this.windowRadius + ")";
    }
}
