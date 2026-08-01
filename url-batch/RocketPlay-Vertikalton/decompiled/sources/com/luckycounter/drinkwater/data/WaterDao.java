package com.luckycounter.drinkwater.data;

import Z0.d;

/* loaded from: classes.dex */
public interface WaterDao {
    Object delete(WaterEntry waterEntry, d dVar);

    Object getEntriesForDay(long j2, long j3, d dVar);

    Object insert(WaterEntry waterEntry, d dVar);

    Object sumForDay(long j2, long j3, d dVar);
}
