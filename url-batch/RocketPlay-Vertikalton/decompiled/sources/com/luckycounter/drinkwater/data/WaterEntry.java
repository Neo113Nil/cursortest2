package com.luckycounter.drinkwater.data;

import i1.d;

/* loaded from: classes.dex */
public final class WaterEntry {
    private final int amountMl;
    private final long id;
    private final long timestamp;

    public WaterEntry(long j2, int i, long j3) {
        this.id = j2;
        this.amountMl = i;
        this.timestamp = j3;
    }

    public static /* synthetic */ WaterEntry copy$default(WaterEntry waterEntry, long j2, int i, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = waterEntry.id;
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            i = waterEntry.amountMl;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j3 = waterEntry.timestamp;
        }
        return waterEntry.copy(j4, i3, j3);
    }

    public final long component1() {
        return this.id;
    }

    public final int component2() {
        return this.amountMl;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final WaterEntry copy(long j2, int i, long j3) {
        return new WaterEntry(j2, i, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaterEntry)) {
            return false;
        }
        WaterEntry waterEntry = (WaterEntry) obj;
        return this.id == waterEntry.id && this.amountMl == waterEntry.amountMl && this.timestamp == waterEntry.timestamp;
    }

    public final int getAmountMl() {
        return this.amountMl;
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + ((Integer.hashCode(this.amountMl) + (Long.hashCode(this.id) * 31)) * 31);
    }

    public String toString() {
        return "WaterEntry(id=" + this.id + ", amountMl=" + this.amountMl + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ WaterEntry(long j2, int i, long j3, int i2, d dVar) {
        this((i2 & 1) != 0 ? 0L : j2, i, j3);
    }
}
