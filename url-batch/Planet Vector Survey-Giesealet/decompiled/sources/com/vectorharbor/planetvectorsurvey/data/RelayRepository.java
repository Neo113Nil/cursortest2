package com.vectorharbor.planetvectorsurvey.data;

import com.vectorharbor.planetvectorsurvey.model.ArrayModule;
import com.vectorharbor.planetvectorsurvey.model.RelayModelsKt;
import com.vectorharbor.planetvectorsurvey.model.SectorMission;
import defpackage.zd;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RelayRepository {
    public static final int $stable = 0;

    public final SectorMission mission(int i) {
        Object obj;
        Iterator<T> it = RelayModelsKt.getDemoMissions().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SectorMission) obj).getId() == i) {
                break;
            }
        }
        SectorMission sectorMission = (SectorMission) obj;
        return sectorMission == null ? (SectorMission) zd.c0(RelayModelsKt.getDemoMissions()) : sectorMission;
    }

    public final List<SectorMission> missions() {
        return RelayModelsKt.getDemoMissions();
    }

    public final ArrayModule module(int i) {
        Object obj;
        Iterator<T> it = RelayModelsKt.getSupportModules().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ArrayModule) obj).getId() == i) {
                break;
            }
        }
        ArrayModule arrayModule = (ArrayModule) obj;
        return arrayModule == null ? (ArrayModule) zd.c0(RelayModelsKt.getSupportModules()) : arrayModule;
    }

    public final List<ArrayModule> modules() {
        return RelayModelsKt.getSupportModules();
    }
}
