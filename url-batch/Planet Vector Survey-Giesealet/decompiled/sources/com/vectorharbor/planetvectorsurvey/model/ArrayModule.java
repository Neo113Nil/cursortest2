package com.vectorharbor.planetvectorsurvey.model;

import defpackage.nz;
import defpackage.pk;
import defpackage.y6;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ArrayModule {
    public static final int $stable = 0;
    private final String detail;
    private final float energyDiscount;
    private final int extraAutoTune;
    private final int extraStasis;
    private final int id;
    private final float nudgeBonus;
    private final int scoreBonus;
    private final String summary;
    private final String title;

    public ArrayModule(int i, String str, String str2, String str3, float f, float f2, int i2, int i3, int i4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.id = i;
        this.title = str;
        this.summary = str2;
        this.detail = str3;
        this.nudgeBonus = f;
        this.energyDiscount = f2;
        this.scoreBonus = i2;
        this.extraStasis = i3;
        this.extraAutoTune = i4;
    }

    public static /* synthetic */ ArrayModule copy$default(ArrayModule arrayModule, int i, String str, String str2, String str3, float f, float f2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = arrayModule.id;
        }
        if ((i5 & 2) != 0) {
            str = arrayModule.title;
        }
        if ((i5 & 4) != 0) {
            str2 = arrayModule.summary;
        }
        if ((i5 & 8) != 0) {
            str3 = arrayModule.detail;
        }
        if ((i5 & 16) != 0) {
            f = arrayModule.nudgeBonus;
        }
        if ((i5 & 32) != 0) {
            f2 = arrayModule.energyDiscount;
        }
        if ((i5 & 64) != 0) {
            i2 = arrayModule.scoreBonus;
        }
        if ((i5 & 128) != 0) {
            i3 = arrayModule.extraStasis;
        }
        if ((i5 & 256) != 0) {
            i4 = arrayModule.extraAutoTune;
        }
        int i6 = i3;
        int i7 = i4;
        float f3 = f2;
        int i8 = i2;
        float f4 = f;
        String str4 = str2;
        return arrayModule.copy(i, str, str4, str3, f4, f3, i8, i6, i7);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.detail;
    }

    public final float component5() {
        return this.nudgeBonus;
    }

    public final float component6() {
        return this.energyDiscount;
    }

    public final int component7() {
        return this.scoreBonus;
    }

    public final int component8() {
        return this.extraStasis;
    }

    public final int component9() {
        return this.extraAutoTune;
    }

    public final ArrayModule copy(int i, String str, String str2, String str3, float f, float f2, int i2, int i3, int i4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new ArrayModule(i, str, str2, str3, f, f2, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArrayModule)) {
            return false;
        }
        ArrayModule arrayModule = (ArrayModule) obj;
        return this.id == arrayModule.id && nz.l(this.title, arrayModule.title) && nz.l(this.summary, arrayModule.summary) && nz.l(this.detail, arrayModule.detail) && Float.compare(this.nudgeBonus, arrayModule.nudgeBonus) == 0 && Float.compare(this.energyDiscount, arrayModule.energyDiscount) == 0 && this.scoreBonus == arrayModule.scoreBonus && this.extraStasis == arrayModule.extraStasis && this.extraAutoTune == arrayModule.extraAutoTune;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final float getEnergyDiscount() {
        return this.energyDiscount;
    }

    public final int getExtraAutoTune() {
        return this.extraAutoTune;
    }

    public final int getExtraStasis() {
        return this.extraStasis;
    }

    public final int getId() {
        return this.id;
    }

    public final float getNudgeBonus() {
        return this.nudgeBonus;
    }

    public final int getScoreBonus() {
        return this.scoreBonus;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((y6.t(this.energyDiscount, y6.t(this.nudgeBonus, (this.detail.hashCode() + ((this.summary.hashCode() + ((this.title.hashCode() + (this.id * 31)) * 31)) * 31)) * 31, 31), 31) + this.scoreBonus) * 31) + this.extraStasis) * 31) + this.extraAutoTune;
    }

    public String toString() {
        return "ArrayModule(id=" + this.id + ", title=" + this.title + ", summary=" + this.summary + ", detail=" + this.detail + ", nudgeBonus=" + this.nudgeBonus + ", energyDiscount=" + this.energyDiscount + ", scoreBonus=" + this.scoreBonus + ", extraStasis=" + this.extraStasis + ", extraAutoTune=" + this.extraAutoTune + ")";
    }

    public /* synthetic */ ArrayModule(int i, String str, String str2, String str3, float f, float f2, int i2, int i3, int i4, int i5, pk pkVar) {
        this(i, str, str2, str3, (i5 & 16) != 0 ? 0.0f : f, (i5 & 32) != 0 ? 0.0f : f2, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0 : i4);
    }
}
