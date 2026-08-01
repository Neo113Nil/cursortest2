package com.vectorharbor.planetvectorsurvey.model;

import com.vectorharbor.planetvectorsurvey.R;
import defpackage.px0;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class RelayModelsKt {
    private static final List<SectorMission> demoMissions = px0.I(new SectorMission(1, "Blue Meridian", "Observatory Rise", "Stabilize bright planet relays before the array drifts out of phase.", 1250, 70, 5, 0.72f, 0.12f, R.drawable.ice_planet), new SectorMission(2, "Solar Choir", "Crown Arc", "Balance hotter flux bands and preserve combo timing through the solar swell.", 1760, 68, 6, 0.9f, 0.105f, R.drawable.solar_core), new SectorMission(3, "Asteroid Veil", "Relay Fringe", "Read unstable echoes, counter interference, and finish the longest scan chain.", 2320, 64, 7, 1.08f, 0.092f, R.drawable.flare_asteroid));
    private static final List<ArrayModule> supportModules = px0.I(new ArrayModule(1, "Cryo Lens", "Extra stasis window", "Adds one extra stasis burst for calmer lock windows late in the run.", 0.0f, 0.0f, 0, 1, 0, 368, null), new ArrayModule(2, "Pulse Relay", "Cheaper manual tuning", "Reduces energy cost and nudges gauges further with each directional tap.", 0.022f, 0.028f, 0, 0, 0, 448, null), new ArrayModule(3, "Solar Cache", "Higher lock payout", "Boosts lock score and adds one extra auto tune to save unstable attempts.", 0.0f, 0.0f, 30, 0, 1, 176, null));

    public static final TargetProfile demoTarget(SectorMission sectorMission, int i) {
        sectorMission.getClass();
        List I = px0.I(Integer.valueOf(R.drawable.signal_planet_magenta), Integer.valueOf(R.drawable.ice_planet), Integer.valueOf(R.drawable.solar_core), Integer.valueOf(R.drawable.flare_asteroid), Integer.valueOf(R.drawable.relay_satellite), Integer.valueOf(R.drawable.dome_observatory), Integer.valueOf(R.drawable.prime_scope), Integer.valueOf(R.drawable.scout_scope));
        List I2 = px0.I("Planet Echo", "Polar Drift", "Solar Chorus", "Shard Veil", "Relay Sweep", "Dome Beacon", "Prime Scope", "Scout Sweep");
        int id = ((sectorMission.getId() * 3) + i) % I.size();
        List I3 = px0.I(Float.valueOf(((((i * 17) + (sectorMission.getId() * 19)) % 58) / 100.0f) + 0.18f), Float.valueOf((((((i * 23) + (sectorMission.getId() * 11)) + 9) % 60) / 100.0f) + 0.16f), Float.valueOf((((((i * 29) + (sectorMission.getId() * 13)) + 17) % 54) / 100.0f) + 0.2f));
        float baseWindow = sectorMission.getBaseWindow() - (i * 0.008f);
        if (baseWindow < 0.055f) {
            baseWindow = 0.055f;
        }
        return new TargetProfile(i, (String) I2.get(id), "Tune all three channels inside the live band and lock before the drift spikes.", ((Number) I.get(id)).intValue(), I3, baseWindow);
    }

    public static final List<SectorMission> getDemoMissions() {
        return demoMissions;
    }

    public static final List<ArrayModule> getSupportModules() {
        return supportModules;
    }
}
